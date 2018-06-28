package mobi.mmdt.ott.view.components.audioselector.p596b;

import mobi.mmdt.ott.R;
import mobi.mmdt.ott.view.components.fileselector.p565b.C7178a;

public final class C7323a extends C7178a {
    public int f21091a;
    public String f21092b;
    public String f21093c;
    public String f21094d;
    public boolean f21095e;
    public int f21096f = R.drawable.ic_file_selection_music;

    public C7323a(String str, String str2, String str3, int i, boolean z, int i2) {
        super(1, i2);
        this.f21094d = str3;
        this.f21091a = i;
        this.f21093c = str2;
        this.f21092b = str;
        this.f21095e = z;
    }

    protected final int mo3572a(C7178a c7178a) {
        return this.f21092b.compareToIgnoreCase(((C7323a) c7178a).f21092b);
    }
}
