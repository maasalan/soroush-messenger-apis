package mobi.mmdt.ott.view.contact.p415a.p569c;

import mobi.mmdt.ott.view.components.p401c.C6829g;

public abstract class C7189a extends C6829g implements Comparable<C7189a> {
    public C7189a(int i) {
        super(i, -1);
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        String str;
        String str2;
        C7189a c7189a = (C7189a) obj;
        if (this.f19503j == 1 && c7189a.f19503j == 1) {
            str = ((C7337b) this).f21166c;
            str2 = ((C7337b) c7189a).f21166c;
        } else if (this.f19503j != 3 || c7189a.f19503j != 3) {
            return 0;
        } else {
            str = ((C7339d) this).f21177b;
            str2 = ((C7339d) c7189a).f21177b;
        }
        return str.compareTo(str2);
    }
}
