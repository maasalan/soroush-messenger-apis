package p050b;

import p050b.p054b.C0837c;

public class C0832a extends Exception {
    public String f2496a;
    private Throwable f2497b;

    public C0832a(C0837c c0837c) {
        StringBuilder stringBuilder = new StringBuilder("[source error] ");
        stringBuilder.append(c0837c.getMessage());
        this(stringBuilder.toString(), c0837c);
    }

    public C0832a(C0858w c0858w) {
        StringBuilder stringBuilder = new StringBuilder("cannot find ");
        stringBuilder.append(c0858w.getMessage());
        this(stringBuilder.toString(), c0858w);
    }

    public C0832a(String str) {
        super(str);
        this.f2496a = str;
        initCause(null);
    }

    private C0832a(String str, Throwable th) {
        this(str);
        initCause(th);
    }

    public C0832a(Throwable th) {
        StringBuilder stringBuilder = new StringBuilder("by ");
        stringBuilder.append(th.toString());
        super(stringBuilder.toString());
        this.f2496a = null;
        initCause(th);
    }

    public Throwable getCause() {
        return this.f2497b == this ? null : this.f2497b;
    }

    public synchronized Throwable initCause(Throwable th) {
        this.f2497b = th;
        return this;
    }
}
