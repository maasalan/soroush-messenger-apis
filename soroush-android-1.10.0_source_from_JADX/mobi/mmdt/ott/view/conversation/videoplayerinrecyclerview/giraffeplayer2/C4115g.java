package mobi.mmdt.ott.view.conversation.videoplayerinrecyclerview.giraffeplayer2;

import java.io.Serializable;

public final class C4115g implements Serializable, Cloneable {
    int f11787a;
    String f11788b;
    Object f11789c;

    public final C4115g m7969a() {
        return (C4115g) super.clone();
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        return (C4115g) super.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C4115g c4115g = (C4115g) obj;
        if (this.f11787a != c4115g.f11787a) {
            return false;
        }
        if (this.f11788b != null) {
            if (!this.f11788b.equals(c4115g.f11788b)) {
                return false;
            }
        } else if (c4115g.f11788b != null) {
            return false;
        }
        return this.f11789c != null ? this.f11789c.equals(c4115g.f11789c) : c4115g.f11789c == null;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = 31 * ((this.f11787a * 31) + (this.f11788b != null ? this.f11788b.hashCode() : 0));
        if (this.f11789c != null) {
            i = this.f11789c.hashCode();
        }
        return hashCode + i;
    }
}
