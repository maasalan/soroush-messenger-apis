package mobi.mmdt.ott.view.newdesign.mainpage.p467c;

public final class C4272c {
    public String f12068a;
    public String f12069b;
    public String f12070c;

    public C4272c(String str, String str2, String str3) {
        this.f12070c = str3;
        this.f12069b = str2;
        this.f12068a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C4272c)) {
            return false;
        }
        C4272c c4272c = (C4272c) obj;
        if (c4272c.f12068a == null) {
            if (this.f12068a != null) {
                return false;
            }
        } else if (!c4272c.f12068a.equals(this.f12068a)) {
            return false;
        }
        if (c4272c.f12069b == null) {
            if (this.f12069b != null) {
                return false;
            }
        } else if (!c4272c.f12069b.equals(this.f12069b)) {
            return false;
        }
        if (c4272c.f12070c == null) {
            if (this.f12070c != null) {
                return false;
            }
        } else if (!c4272c.f12070c.equals(this.f12070c)) {
            return false;
        }
        return true;
    }
}
