package org.jivesoftware.smack;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import org.jivesoftware.smack.SmackException.NoResponseException;
import org.jivesoftware.smack.packet.Nonza;
import org.jivesoftware.smack.packet.Stanza;
import org.jivesoftware.smack.packet.TopLevelStreamElement;

public class SynchronizationPoint<E extends Exception> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final Condition condition;
    private final AbstractXMPPConnection connection;
    private final Lock connectionLock;
    private E failureException;
    private State state;
    private final String waitFor;

    private enum State {
        Initial,
        RequestSent,
        NoResponse,
        Success,
        Failure
    }

    public SynchronizationPoint(AbstractXMPPConnection abstractXMPPConnection, String str) {
        this.connection = abstractXMPPConnection;
        this.connectionLock = abstractXMPPConnection.getConnectionLock();
        this.condition = abstractXMPPConnection.getConnectionLock().newCondition();
        this.waitFor = str;
        init();
    }

    private E checkForResponse() {
        switch (this.state) {
            case Failure:
                return this.failureException;
            case Success:
                return null;
            case Initial:
            case NoResponse:
            case RequestSent:
                throw NoResponseException.newWith(this.connection, this.waitFor);
            default:
                StringBuilder stringBuilder = new StringBuilder("Unknown state ");
                stringBuilder.append(this.state);
                throw new AssertionError(stringBuilder.toString());
        }
    }

    private void waitForConditionOrTimeout() {
        long toNanos = TimeUnit.MILLISECONDS.toNanos(this.connection.getReplyTimeout());
        while (true) {
            if (this.state != State.RequestSent) {
                if (this.state != State.Initial) {
                    return;
                }
            }
            if (toNanos <= 0) {
                this.state = State.NoResponse;
                return;
            }
            toNanos = this.condition.awaitNanos(toNanos);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public E checkIfSuccessOrWait() {
        /*
        r2 = this;
        r0 = r2.connectionLock;
        r0.lock();
        r0 = org.jivesoftware.smack.SynchronizationPoint.C77371.$SwitchMap$org$jivesoftware$smack$SynchronizationPoint$State;	 Catch:{ all -> 0x002f }
        r1 = r2.state;	 Catch:{ all -> 0x002f }
        r1 = r1.ordinal();	 Catch:{ all -> 0x002f }
        r0 = r0[r1];	 Catch:{ all -> 0x002f }
        switch(r0) {
            case 1: goto L_0x001d;
            case 2: goto L_0x0016;
            default: goto L_0x0012;
        };	 Catch:{ all -> 0x002f }
    L_0x0012:
        r2.waitForConditionOrTimeout();	 Catch:{ all -> 0x002f }
        goto L_0x0025;
    L_0x0016:
        r0 = r2.connectionLock;
        r0.unlock();
        r0 = 0;
        return r0;
    L_0x001d:
        r0 = r2.failureException;	 Catch:{ all -> 0x002f }
        r1 = r2.connectionLock;
        r1.unlock();
        return r0;
    L_0x0025:
        r0 = r2.connectionLock;
        r0.unlock();
        r0 = r2.checkForResponse();
        return r0;
    L_0x002f:
        r0 = move-exception;
        r1 = r2.connectionLock;
        r1.unlock();
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smack.SynchronizationPoint.checkIfSuccessOrWait():E");
    }

    public void checkIfSuccessOrWaitOrThrow() {
        checkIfSuccessOrWait();
        if (this.state == State.Failure) {
            throw this.failureException;
        }
    }

    public void init() {
        this.connectionLock.lock();
        this.state = State.Initial;
        this.failureException = null;
        this.connectionLock.unlock();
    }

    @Deprecated
    public void reportFailure() {
        reportFailure(null);
    }

    public void reportFailure(E e) {
        this.connectionLock.lock();
        try {
            this.state = State.Failure;
            this.failureException = e;
            this.condition.signalAll();
        } finally {
            this.connectionLock.unlock();
        }
    }

    public void reportSuccess() {
        this.connectionLock.lock();
        try {
            this.state = State.Success;
            this.condition.signalAll();
        } finally {
            this.connectionLock.unlock();
        }
    }

    public boolean requestSent() {
        this.connectionLock.lock();
        try {
            boolean z = this.state == State.RequestSent;
            this.connectionLock.unlock();
            return z;
        } catch (Throwable th) {
            this.connectionLock.unlock();
        }
    }

    public E sendAndWaitForResponse(TopLevelStreamElement topLevelStreamElement) {
        this.connectionLock.lock();
        if (topLevelStreamElement != null) {
            try {
                if (topLevelStreamElement instanceof Stanza) {
                    this.connection.sendStanza((Stanza) topLevelStreamElement);
                } else if (topLevelStreamElement instanceof Nonza) {
                    this.connection.sendNonza((Nonza) topLevelStreamElement);
                } else {
                    throw new IllegalStateException("Unsupported element type");
                }
                this.state = State.RequestSent;
            } catch (Throwable th) {
                this.connectionLock.unlock();
            }
        }
        waitForConditionOrTimeout();
        this.connectionLock.unlock();
        return checkForResponse();
    }

    public void sendAndWaitForResponseOrThrow(Nonza nonza) {
        sendAndWaitForResponse(nonza);
        if (C77371.$SwitchMap$org$jivesoftware$smack$SynchronizationPoint$State[this.state.ordinal()] == 1 && this.failureException != null) {
            throw this.failureException;
        }
    }

    public boolean wasSuccessful() {
        this.connectionLock.lock();
        try {
            boolean z = this.state == State.Success;
            this.connectionLock.unlock();
            return z;
        } catch (Throwable th) {
            this.connectionLock.unlock();
        }
    }
}
