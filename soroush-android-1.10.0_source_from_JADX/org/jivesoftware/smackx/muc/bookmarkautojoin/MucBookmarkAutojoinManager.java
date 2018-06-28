package org.jivesoftware.smackx.muc.bookmarkautojoin;

import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.b.a.b.d;
import org.jivesoftware.smack.AbstractConnectionListener;
import org.jivesoftware.smack.ConnectionCreationListener;
import org.jivesoftware.smack.Manager;
import org.jivesoftware.smack.SmackException.NoResponseException;
import org.jivesoftware.smack.SmackException.NotConnectedException;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPConnectionRegistry;
import org.jivesoftware.smackx.bookmarks.BookmarkManager;
import org.jivesoftware.smackx.bookmarks.BookmarkedConference;
import org.jivesoftware.smackx.muc.MultiUserChat.MucCreateConfigFormHandle;
import org.jivesoftware.smackx.muc.MultiUserChatManager;

public final class MucBookmarkAutojoinManager extends Manager {
    private static final Map<XMPPConnection, MucBookmarkAutojoinManager> INSTANCES = new WeakHashMap();
    private static final Logger LOGGER = Logger.getLogger(MucBookmarkAutojoinManager.class.getName());
    private static boolean autojoinEnabledDefault = false;
    private boolean autojoinEnabled = autojoinEnabledDefault;
    private final BookmarkManager bookmarkManager;
    private final MultiUserChatManager multiUserChatManager;

    static class C79461 implements ConnectionCreationListener {
        C79461() {
        }

        public final void connectionCreated(XMPPConnection xMPPConnection) {
            MucBookmarkAutojoinManager.getInstanceFor(xMPPConnection);
        }
    }

    class C80302 extends AbstractConnectionListener {
        C80302() {
        }

        public void authenticated(XMPPConnection xMPPConnection, boolean z) {
            if (MucBookmarkAutojoinManager.this.autojoinEnabled) {
                MucBookmarkAutojoinManager.this.autojoinBookmarkedConferences();
            }
        }
    }

    static {
        XMPPConnectionRegistry.addConnectionCreationListener(new C79461());
    }

    private MucBookmarkAutojoinManager(XMPPConnection xMPPConnection) {
        super(xMPPConnection);
        this.multiUserChatManager = MultiUserChatManager.getInstanceFor(xMPPConnection);
        this.bookmarkManager = BookmarkManager.getBookmarkManager(xMPPConnection);
        xMPPConnection.addConnectionListener(new C80302());
    }

    public static synchronized MucBookmarkAutojoinManager getInstanceFor(XMPPConnection xMPPConnection) {
        MucBookmarkAutojoinManager mucBookmarkAutojoinManager;
        synchronized (MucBookmarkAutojoinManager.class) {
            mucBookmarkAutojoinManager = (MucBookmarkAutojoinManager) INSTANCES.get(xMPPConnection);
            if (mucBookmarkAutojoinManager == null) {
                mucBookmarkAutojoinManager = new MucBookmarkAutojoinManager(xMPPConnection);
                INSTANCES.put(xMPPConnection, mucBookmarkAutojoinManager);
            }
        }
        return mucBookmarkAutojoinManager;
    }

    public static void setAutojoinPerDefault(boolean z) {
        autojoinEnabledDefault = z;
    }

    public final void autojoinBookmarkedConferences() {
        Throwable e;
        Logger logger;
        Level level;
        String str;
        try {
            List<BookmarkedConference> bookmarkedConferences = this.bookmarkManager.getBookmarkedConferences();
            d c = connection().getUser().c();
            for (BookmarkedConference bookmarkedConference : bookmarkedConferences) {
                if (bookmarkedConference.isAutoJoin()) {
                    d nickname = bookmarkedConference.getNickname();
                    if (nickname == null) {
                        nickname = c;
                    }
                    try {
                        MucCreateConfigFormHandle createOrJoinIfNecessary = this.multiUserChatManager.getMultiUserChat(bookmarkedConference.getJid()).createOrJoinIfNecessary(nickname, bookmarkedConference.getPassword());
                        if (createOrJoinIfNecessary != null) {
                            createOrJoinIfNecessary.makeInstant();
                        }
                    } catch (NotConnectedException e2) {
                        e = e2;
                        logger = LOGGER;
                        level = Level.FINER;
                        str = "Could not autojoin bookmarked MUC";
                    } catch (Throwable e3) {
                        LOGGER.log(Level.WARNING, "Could not autojoin bookmarked MUC", e3);
                    }
                }
            }
        } catch (NotConnectedException e4) {
            e = e4;
            logger = LOGGER;
            level = Level.FINER;
            str = "Could not get MUC bookmarks";
            logger.log(level, str, e);
        } catch (NoResponseException e5) {
            e = e5;
            logger = LOGGER;
            level = Level.WARNING;
            str = "Could not get MUC bookmarks";
            logger.log(level, str, e);
        }
    }

    public final void setAutojoinEnabled(boolean z) {
        this.autojoinEnabled = z;
    }
}
