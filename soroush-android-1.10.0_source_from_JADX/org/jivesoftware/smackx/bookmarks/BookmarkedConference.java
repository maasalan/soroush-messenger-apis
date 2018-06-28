package org.jivesoftware.smackx.bookmarks;

import org.b.a.b.d;
import org.b.a.e;

public class BookmarkedConference implements SharedBookmark {
    private boolean autoJoin;
    private boolean isShared;
    private final e jid;
    private String name;
    private d nickname;
    private String password;

    protected BookmarkedConference(String str, e eVar, boolean z, d dVar, String str2) {
        this.name = str;
        this.jid = eVar;
        this.autoJoin = z;
        this.nickname = dVar;
        this.password = str2;
    }

    protected BookmarkedConference(e eVar) {
        this.jid = eVar;
    }

    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof BookmarkedConference) {
                return ((BookmarkedConference) obj).getJid().a(this.jid);
            }
        }
        return false;
    }

    public e getJid() {
        return this.jid;
    }

    public String getName() {
        return this.name;
    }

    public d getNickname() {
        return this.nickname;
    }

    public String getPassword() {
        return this.password;
    }

    public int hashCode() {
        return getJid().hashCode();
    }

    public boolean isAutoJoin() {
        return this.autoJoin;
    }

    public boolean isShared() {
        return this.isShared;
    }

    protected void setAutoJoin(boolean z) {
        this.autoJoin = z;
    }

    protected void setName(String str) {
        this.name = str;
    }

    protected void setNickname(d dVar) {
        this.nickname = dVar;
    }

    protected void setPassword(String str) {
        this.password = str;
    }

    protected void setShared(boolean z) {
        this.isShared = z;
    }
}
