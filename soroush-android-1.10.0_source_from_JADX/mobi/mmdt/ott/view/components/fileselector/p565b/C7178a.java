package mobi.mmdt.ott.view.components.fileselector.p565b;

import mobi.mmdt.ott.view.components.p401c.C6829g;

public abstract class C7178a extends C6829g implements Comparable<C7178a> {
    public C7178a(int i, int i2) {
        super(i, i2);
    }

    public abstract int mo3572a(C7178a c7178a);

    public /* synthetic */ int compareTo(Object obj) {
        C7178a c7178a = (C7178a) obj;
        return (this.f19503j == 2 && c7178a.f19503j == 2) ? mo3572a(c7178a) : (this.f19503j == 2 && c7178a.f19503j == 1) ? -1 : (this.f19503j == 1 && c7178a.f19503j == 2) ? 1 : (this.f19503j == 1 && c7178a.f19503j == 1) ? mo3572a(c7178a) : 0;
    }
}
