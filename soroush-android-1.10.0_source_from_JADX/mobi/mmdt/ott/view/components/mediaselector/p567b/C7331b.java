package mobi.mmdt.ott.view.components.mediaselector.p567b;

public final class C7331b extends C7181a implements Comparable<C7331b> {
    public String f21128a;
    public String f21129b;
    public String f21130c;
    public String f21131d;
    private long f21132e;

    public C7331b(int i, String str, String str2, String str3, String str4, long j) {
        super(1, i);
        this.f21128a = str;
        this.f21129b = str2;
        this.f21131d = str4;
        this.f21130c = str3;
        this.f21132e = j;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C7331b c7331b = (C7331b) obj;
        return this.f21132e < c7331b.f21132e ? 1 : this.f21132e > c7331b.f21132e ? -1 : 0;
    }
}
