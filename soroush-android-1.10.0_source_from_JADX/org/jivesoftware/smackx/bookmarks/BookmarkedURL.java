package org.jivesoftware.smackx.bookmarks;

public class BookmarkedURL implements SharedBookmark {
    private final String URL;
    private boolean isRss;
    private boolean isShared;
    private String name;

    protected BookmarkedURL(String str) {
        this.URL = str;
    }

    protected BookmarkedURL(String str, String str2, boolean z) {
        this.URL = str;
        this.name = str2;
        this.isRss = z;
    }

    public boolean equals(Object obj) {
        return !(obj instanceof BookmarkedURL) ? false : ((BookmarkedURL) obj).getURL().equalsIgnoreCase(this.URL);
    }

    public String getName() {
        return this.name;
    }

    public String getURL() {
        return this.URL;
    }

    public int hashCode() {
        return getURL().hashCode();
    }

    public boolean isRss() {
        return this.isRss;
    }

    public boolean isShared() {
        return this.isShared;
    }

    protected void setName(String str) {
        this.name = str;
    }

    protected void setRss(boolean z) {
        this.isRss = z;
    }

    protected void setShared(boolean z) {
        this.isShared = z;
    }
}
