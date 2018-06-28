package p000a.p003b.p004a.p009d;

import java.util.logging.Logger;

public abstract class C4642a implements C0040d {
    protected static final Logger f12762a = Logger.getLogger(C4642a.class.getName());
    private final String f12763b;
    private final int f12764c;

    protected C4642a(String str, int i) {
        this.f12763b = str;
        this.f12764c = i;
    }

    public final String mo8a() {
        return this.f12763b;
    }

    public final int mo9b() {
        return this.f12764c;
    }

    public /* synthetic */ int compareTo(Object obj) {
        return this.f12764c - ((C0040d) obj).mo9b();
    }
}
