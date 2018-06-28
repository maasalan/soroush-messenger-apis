package com.p072b.p073a.p074a;

public class C1073q {
    public static final C1073q f3503a = new C5099a(true);
    public static final C1073q f3504b = new C5099a(false);
    boolean f3505c;
    Long f3506d;
    Integer f3507e;
    boolean f3508f = false;

    static class C5099a extends C1073q {
        public C5099a(boolean z) {
            super(z);
        }

        public final void mo1097a(Long l) {
            throw new IllegalStateException("This object is immutable. Create a new one using the constructor.");
        }
    }

    public C1073q(boolean z) {
        this.f3505c = z;
    }

    public void mo1097a(Long l) {
        this.f3506d = l;
    }
}
