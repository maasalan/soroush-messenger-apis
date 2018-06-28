package org.jivesoftware.smack.roster;

import java.util.Collection;
import java.util.Date;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.b.a.a;
import org.b.a.i;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.packet.Presence;
import org.jivesoftware.smack.roster.SubscribeListener.SubscribeAnswer;

public class RosterUtil {
    public static void askForSubscriptionIfRequired(Roster roster, a aVar) {
        RosterEntry entry = roster.getEntry(aVar);
        if (entry == null || !(entry.canSeeHisPresence() || entry.isSubscriptionPending())) {
            roster.sendSubscriptionRequest(aVar);
        }
    }

    public static void ensureNotSubscribed(Roster roster, a aVar) {
        RosterEntry entry = roster.getEntry(aVar);
        if (entry != null && entry.canSeeMyPresence()) {
            entry.cancelSubscription();
        }
    }

    public static void ensureNotSubscribedToEachOther(XMPPConnection xMPPConnection, XMPPConnection xMPPConnection2) {
        Roster instanceFor = Roster.getInstanceFor(xMPPConnection);
        a m = xMPPConnection.getUser().m();
        Roster instanceFor2 = Roster.getInstanceFor(xMPPConnection2);
        ensureNotSubscribed(instanceFor, xMPPConnection2.getUser().m());
        ensureNotSubscribed(instanceFor2, m);
    }

    public static void ensureSubscribed(XMPPConnection xMPPConnection, XMPPConnection xMPPConnection2, long j) {
        ensureSubscribedTo(xMPPConnection, xMPPConnection2, j);
        ensureSubscribedTo(xMPPConnection2, xMPPConnection, j);
    }

    public static void ensureSubscribedTo(XMPPConnection xMPPConnection, XMPPConnection xMPPConnection2, long j) {
        ensureSubscribedTo(xMPPConnection, xMPPConnection2, new Date(System.currentTimeMillis() + j));
    }

    public static void ensureSubscribedTo(XMPPConnection xMPPConnection, XMPPConnection xMPPConnection2, Date date) {
        Roster instanceFor = Roster.getInstanceFor(xMPPConnection);
        Object m = xMPPConnection2.getUser().m();
        if (!instanceFor.iAmSubscribedTo(m)) {
            final a m2 = xMPPConnection.getUser().m();
            SubscribeListener c78992 = new SubscribeListener() {
                public final SubscribeAnswer processSubscribe(i iVar, Presence presence) {
                    return iVar.a(m2) ? SubscribeAnswer.Approve : null;
                }
            };
            Roster instanceFor2 = Roster.getInstanceFor(xMPPConnection2);
            instanceFor2.addSubscribeListener(c78992);
            try {
                instanceFor.sendSubscriptionRequest(m);
                waitUntilOtherEntityIsSubscribed(instanceFor2, m2, date);
            } finally {
                instanceFor2.removeSubscribeListener(c78992);
            }
        }
    }

    public static void waitUntilOtherEntityIsSubscribed(Roster roster, a aVar, long j) {
        waitUntilOtherEntityIsSubscribed(roster, aVar, new Date(System.currentTimeMillis() + j));
    }

    public static void waitUntilOtherEntityIsSubscribed(Roster roster, a aVar, Date date) {
        final Lock reentrantLock = new ReentrantLock();
        final Condition newCondition = reentrantLock.newCondition();
        RosterListener c80041 = new AbstractRosterListener() {
            private void signal() {
                reentrantLock.lock();
                try {
                    newCondition.signal();
                } finally {
                    reentrantLock.unlock();
                }
            }

            public final void entriesAdded(Collection<i> collection) {
                signal();
            }

            public final void entriesUpdated(Collection<i> collection) {
                signal();
            }
        };
        roster.addRosterListener(c80041);
        reentrantLock.lock();
        boolean z = true;
        while (!roster.isSubscribedToMyPresence(aVar)) {
            try {
                if (z) {
                    z = newCondition.awaitUntil(date);
                } else {
                    throw new TimeoutException();
                }
            } finally {
                reentrantLock.unlock();
                roster.removeRosterListener(c80041);
            }
        }
    }
}
