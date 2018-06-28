package p000a.p003b.p004a.p013h;

import p000a.p003b.p004a.C0063i;

public abstract class C4651a extends C0063i {

    public static class C6321a extends C4651a {
        public C6321a() {
            super("Resolution loop detected");
        }
    }

    public static class C6322b extends C4651a {
        public C6322b() {
            super("Maxmimum steps reached");
        }
    }

    protected C4651a(String str) {
        super(str);
    }
}
