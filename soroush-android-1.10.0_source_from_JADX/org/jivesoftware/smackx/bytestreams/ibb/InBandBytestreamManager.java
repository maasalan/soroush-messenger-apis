package org.jivesoftware.smackx.bytestreams.ibb;

import android.support.v7.widget.RecyclerView.ItemAnimator;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import org.b.a.i;
import org.jivesoftware.smack.AbstractConnectionClosedListener;
import org.jivesoftware.smack.ConnectionCreationListener;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPConnectionRegistry;
import org.jivesoftware.smack.packet.IQ;
import org.jivesoftware.smack.packet.XMPPError.Condition;
import org.jivesoftware.smackx.bytestreams.BytestreamListener;
import org.jivesoftware.smackx.bytestreams.BytestreamManager;
import org.jivesoftware.smackx.bytestreams.ibb.packet.Open;

public final class InBandBytestreamManager implements BytestreamManager {
    public static final int MAXIMUM_BLOCK_SIZE = 65535;
    private static final String SESSION_ID_PREFIX = "jibb_";
    private static final Map<XMPPConnection, InBandBytestreamManager> managers = new HashMap();
    private static final Random randomGenerator = new Random();
    private final List<BytestreamListener> allRequestListeners = Collections.synchronizedList(new LinkedList());
    private final CloseListener closeListener;
    private final XMPPConnection connection;
    private final DataListener dataListener;
    private int defaultBlockSize = ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;
    private List<String> ignoredBytestreamRequests = Collections.synchronizedList(new LinkedList());
    private final InitiationListener initiationListener;
    private int maximumBlockSize = MAXIMUM_BLOCK_SIZE;
    private final Map<String, InBandBytestreamSession> sessions = new ConcurrentHashMap();
    private StanzaType stanza = StanzaType.IQ;
    private final Map<i, BytestreamListener> userListeners = new ConcurrentHashMap();

    public enum StanzaType {
        IQ,
        MESSAGE
    }

    static class C79061 implements ConnectionCreationListener {
        C79061() {
        }

        public final void connectionCreated(final XMPPConnection xMPPConnection) {
            InBandBytestreamManager.getByteStreamManager(xMPPConnection);
            xMPPConnection.addConnectionListener(new AbstractConnectionClosedListener() {
                public void connectionTerminated() {
                    InBandBytestreamManager.getByteStreamManager(xMPPConnection).disableService();
                }

                public void reconnectionSuccessful() {
                    InBandBytestreamManager.getByteStreamManager(xMPPConnection);
                }
            });
        }
    }

    static {
        XMPPConnectionRegistry.addConnectionCreationListener(new C79061());
    }

    private InBandBytestreamManager(XMPPConnection xMPPConnection) {
        this.connection = xMPPConnection;
        this.initiationListener = new InitiationListener(this);
        xMPPConnection.registerIQRequestHandler(this.initiationListener);
        this.dataListener = new DataListener(this);
        xMPPConnection.registerIQRequestHandler(this.dataListener);
        this.closeListener = new CloseListener(this);
        xMPPConnection.registerIQRequestHandler(this.closeListener);
    }

    private void disableService() {
        managers.remove(this.connection);
        this.connection.unregisterIQRequestHandler(this.initiationListener);
        this.connection.unregisterIQRequestHandler(this.dataListener);
        this.connection.unregisterIQRequestHandler(this.closeListener);
        this.initiationListener.shutdown();
        this.userListeners.clear();
        this.allRequestListeners.clear();
        this.sessions.clear();
        this.ignoredBytestreamRequests.clear();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager getByteStreamManager(org.jivesoftware.smack.XMPPConnection r3) {
        /*
        r0 = org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager.class;
        monitor-enter(r0);
        if (r3 != 0) goto L_0x0008;
    L_0x0005:
        r3 = 0;
        monitor-exit(r0);
        return r3;
    L_0x0008:
        r1 = managers;	 Catch:{ all -> 0x001e }
        r1 = r1.get(r3);	 Catch:{ all -> 0x001e }
        r1 = (org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager) r1;	 Catch:{ all -> 0x001e }
        if (r1 != 0) goto L_0x001c;
    L_0x0012:
        r1 = new org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager;	 Catch:{ all -> 0x001e }
        r1.<init>(r3);	 Catch:{ all -> 0x001e }
        r2 = managers;	 Catch:{ all -> 0x001e }
        r2.put(r3, r1);	 Catch:{ all -> 0x001e }
    L_0x001c:
        monitor-exit(r0);
        return r1;
    L_0x001e:
        r3 = move-exception;
        monitor-exit(r0);
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager.getByteStreamManager(org.jivesoftware.smack.XMPPConnection):org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager");
    }

    private static String getNextSessionID() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(SESSION_ID_PREFIX);
        stringBuilder.append(Math.abs(randomGenerator.nextLong()));
        return stringBuilder.toString();
    }

    public final void addIncomingBytestreamListener(BytestreamListener bytestreamListener) {
        this.allRequestListeners.add(bytestreamListener);
    }

    public final void addIncomingBytestreamListener(BytestreamListener bytestreamListener, i iVar) {
        this.userListeners.put(iVar, bytestreamListener);
    }

    public final InBandBytestreamSession establishSession(i iVar) {
        return establishSession(iVar, getNextSessionID());
    }

    public final InBandBytestreamSession establishSession(i iVar, String str) {
        IQ open = new Open(str, this.defaultBlockSize, this.stanza);
        open.setTo(iVar);
        this.connection.createStanzaCollectorAndSend(open).nextResultOrThrow();
        InBandBytestreamSession inBandBytestreamSession = new InBandBytestreamSession(this.connection, open, iVar);
        this.sessions.put(str, inBandBytestreamSession);
        return inBandBytestreamSession;
    }

    protected final List<BytestreamListener> getAllRequestListeners() {
        return this.allRequestListeners;
    }

    protected final XMPPConnection getConnection() {
        return this.connection;
    }

    public final int getDefaultBlockSize() {
        return this.defaultBlockSize;
    }

    protected final List<String> getIgnoredBytestreamRequests() {
        return this.ignoredBytestreamRequests;
    }

    public final int getMaximumBlockSize() {
        return this.maximumBlockSize;
    }

    protected final Map<String, InBandBytestreamSession> getSessions() {
        return this.sessions;
    }

    public final StanzaType getStanza() {
        return this.stanza;
    }

    protected final BytestreamListener getUserListener(i iVar) {
        return (BytestreamListener) this.userListeners.get(iVar);
    }

    public final void ignoreBytestreamRequestOnce(String str) {
        this.ignoredBytestreamRequests.add(str);
    }

    public final void removeIncomingBytestreamListener(String str) {
        this.userListeners.remove(str);
    }

    public final void removeIncomingBytestreamListener(BytestreamListener bytestreamListener) {
        this.allRequestListeners.remove(bytestreamListener);
    }

    protected final void replyItemNotFoundPacket(IQ iq) {
        this.connection.sendStanza(IQ.createErrorResponse(iq, Condition.item_not_found));
    }

    protected final void replyRejectPacket(IQ iq) {
        this.connection.sendStanza(IQ.createErrorResponse(iq, Condition.not_acceptable));
    }

    protected final void replyResourceConstraintPacket(IQ iq) {
        this.connection.sendStanza(IQ.createErrorResponse(iq, Condition.resource_constraint));
    }

    public final void setDefaultBlockSize(int i) {
        if (i > 0) {
            if (i <= MAXIMUM_BLOCK_SIZE) {
                this.defaultBlockSize = i;
                return;
            }
        }
        throw new IllegalArgumentException("Default block size must be between 1 and 65535");
    }

    public final void setMaximumBlockSize(int i) {
        if (i > 0) {
            if (i <= MAXIMUM_BLOCK_SIZE) {
                this.maximumBlockSize = i;
                return;
            }
        }
        throw new IllegalArgumentException("Maximum block size must be between 1 and 65535");
    }

    public final void setStanza(StanzaType stanzaType) {
        this.stanza = stanzaType;
    }
}
