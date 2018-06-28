package org.jivesoftware.smackx.bookmarks;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import org.b.a.b.d;
import org.b.a.e;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smackx.bookmarks.Bookmarks.Provider;
import org.jivesoftware.smackx.iqprivate.PrivateDataManager;

public final class BookmarkManager {
    private static final Map<XMPPConnection, BookmarkManager> bookmarkManagerMap = new WeakHashMap();
    private final Object bookmarkLock = new Object();
    private Bookmarks bookmarks;
    private final PrivateDataManager privateDataManager;

    static {
        PrivateDataManager.addPrivateDataProvider(Bookmarks.ELEMENT, Bookmarks.NAMESPACE, new Provider());
    }

    private BookmarkManager(XMPPConnection xMPPConnection) {
        this.privateDataManager = PrivateDataManager.getInstanceFor(xMPPConnection);
    }

    public static synchronized BookmarkManager getBookmarkManager(XMPPConnection xMPPConnection) {
        BookmarkManager bookmarkManager;
        synchronized (BookmarkManager.class) {
            bookmarkManager = (BookmarkManager) bookmarkManagerMap.get(xMPPConnection);
            if (bookmarkManager == null) {
                bookmarkManager = new BookmarkManager(xMPPConnection);
                bookmarkManagerMap.put(xMPPConnection, bookmarkManager);
            }
        }
        return bookmarkManager;
    }

    private Bookmarks retrieveBookmarks() {
        Bookmarks bookmarks;
        synchronized (this.bookmarkLock) {
            if (this.bookmarks == null) {
                this.bookmarks = (Bookmarks) this.privateDataManager.getPrivateData(Bookmarks.ELEMENT, Bookmarks.NAMESPACE);
            }
            bookmarks = this.bookmarks;
        }
        return bookmarks;
    }

    public final void addBookmarkedConference(String str, e eVar, boolean z, d dVar, String str2) {
        retrieveBookmarks();
        BookmarkedConference bookmarkedConference = new BookmarkedConference(str, eVar, z, dVar, str2);
        List bookmarkedConferences = this.bookmarks.getBookmarkedConferences();
        if (bookmarkedConferences.contains(bookmarkedConference)) {
            BookmarkedConference bookmarkedConference2 = (BookmarkedConference) bookmarkedConferences.get(bookmarkedConferences.indexOf(bookmarkedConference));
            if (bookmarkedConference2.isShared()) {
                throw new IllegalArgumentException("Cannot modify shared bookmark");
            }
            bookmarkedConference2.setAutoJoin(z);
            bookmarkedConference2.setName(str);
            bookmarkedConference2.setNickname(dVar);
            bookmarkedConference2.setPassword(str2);
        } else {
            this.bookmarks.addBookmarkedConference(bookmarkedConference);
        }
        this.privateDataManager.setPrivateData(this.bookmarks);
    }

    public final void addBookmarkedURL(String str, String str2, boolean z) {
        retrieveBookmarks();
        BookmarkedURL bookmarkedURL = new BookmarkedURL(str, str2, z);
        List bookmarkedURLS = this.bookmarks.getBookmarkedURLS();
        if (bookmarkedURLS.contains(bookmarkedURL)) {
            BookmarkedURL bookmarkedURL2 = (BookmarkedURL) bookmarkedURLS.get(bookmarkedURLS.indexOf(bookmarkedURL));
            if (bookmarkedURL2.isShared()) {
                throw new IllegalArgumentException("Cannot modify shared bookmarks");
            }
            bookmarkedURL2.setName(str2);
            bookmarkedURL2.setRss(z);
        } else {
            this.bookmarks.addBookmarkedURL(bookmarkedURL);
        }
        this.privateDataManager.setPrivateData(this.bookmarks);
    }

    public final List<BookmarkedConference> getBookmarkedConferences() {
        retrieveBookmarks();
        return Collections.unmodifiableList(this.bookmarks.getBookmarkedConferences());
    }

    public final List<BookmarkedURL> getBookmarkedURLs() {
        retrieveBookmarks();
        return Collections.unmodifiableList(this.bookmarks.getBookmarkedURLS());
    }

    public final boolean isSupported() {
        return this.privateDataManager.isSupported();
    }

    public final void removeBookmarkedConference(e eVar) {
        retrieveBookmarks();
        Iterator it = this.bookmarks.getBookmarkedConferences().iterator();
        while (it.hasNext()) {
            BookmarkedConference bookmarkedConference = (BookmarkedConference) it.next();
            if (bookmarkedConference.getJid().a(eVar)) {
                if (bookmarkedConference.isShared()) {
                    throw new IllegalArgumentException("Conference is shared and can't be removed");
                }
                it.remove();
                this.privateDataManager.setPrivateData(this.bookmarks);
                return;
            }
        }
    }

    public final void removeBookmarkedURL(String str) {
        retrieveBookmarks();
        Iterator it = this.bookmarks.getBookmarkedURLS().iterator();
        while (it.hasNext()) {
            BookmarkedURL bookmarkedURL = (BookmarkedURL) it.next();
            if (bookmarkedURL.getURL().equalsIgnoreCase(str)) {
                if (bookmarkedURL.isShared()) {
                    throw new IllegalArgumentException("Cannot delete a shared bookmark.");
                }
                it.remove();
                this.privateDataManager.setPrivateData(this.bookmarks);
                return;
            }
        }
    }
}
