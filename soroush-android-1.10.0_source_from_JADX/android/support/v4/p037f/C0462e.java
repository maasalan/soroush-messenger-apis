package android.support.v4.p037f;

import java.util.Locale;

public final class C0462e {
    public static final C0460d f1595a = new C6365e(null, false);
    public static final C0460d f1596b = new C6365e(null, true);
    public static final C0460d f1597c = new C6365e(C4810b.f13391a, false);
    public static final C0460d f1598d = new C6365e(C4810b.f13391a, true);
    public static final C0460d f1599e = new C6365e(C4809a.f13388a, false);
    public static final C0460d f1600f = C6366f.f17415a;

    private interface C0461c {
        int mo296a(CharSequence charSequence, int i);
    }

    private static class C4809a implements C0461c {
        public static final C4809a f13388a = new C4809a(true);
        public static final C4809a f13389b = new C4809a(false);
        private final boolean f13390c;

        private C4809a(boolean z) {
            this.f13390c = z;
        }

        public final int mo296a(CharSequence charSequence, int i) {
            i += 0;
            int i2 = 0;
            int i3 = i2;
            while (i2 < i) {
                switch (C0462e.m965a(Character.getDirectionality(charSequence.charAt(i2)))) {
                    case 0:
                        if (this.f13390c) {
                            return 0;
                        }
                        break;
                    case 1:
                        if (!this.f13390c) {
                            return 1;
                        }
                        break;
                    default:
                        continue;
                }
                i3 = 1;
                i2++;
            }
            return i3 != 0 ? this.f13390c ? 1 : 0 : 2;
        }
    }

    private static class C4810b implements C0461c {
        public static final C4810b f13391a = new C4810b();

        private C4810b() {
        }

        public final int mo296a(CharSequence charSequence, int i) {
            int i2 = 0;
            i += 0;
            int i3 = 2;
            while (i2 < i && i3 == 2) {
                i3 = C0462e.m966b(Character.getDirectionality(charSequence.charAt(i2)));
                i2++;
            }
            return i3;
        }
    }

    private static abstract class C4811d implements C0460d {
        private final C0461c f13392a;

        public C4811d(C0461c c0461c) {
            this.f13392a = c0461c;
        }

        protected abstract boolean mo2549a();

        public final boolean mo297a(CharSequence charSequence, int i) {
            if (charSequence != null && i >= 0) {
                if (charSequence.length() - i >= 0) {
                    if (this.f13392a == null) {
                        return mo2549a();
                    }
                    switch (this.f13392a.mo296a(charSequence, i)) {
                        case 0:
                            return true;
                        case 1:
                            return false;
                        default:
                            return mo2549a();
                    }
                }
            }
            throw new IllegalArgumentException();
        }
    }

    private static class C6365e extends C4811d {
        private final boolean f17414a;

        C6365e(C0461c c0461c, boolean z) {
            super(c0461c);
            this.f17414a = z;
        }

        protected final boolean mo2549a() {
            return this.f17414a;
        }
    }

    private static class C6366f extends C4811d {
        public static final C6366f f17415a = new C6366f();

        public C6366f() {
            super(null);
        }

        protected final boolean mo2549a() {
            return C0463f.m967a(Locale.getDefault()) == 1;
        }
    }

    static int m965a(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
            case 2:
                return 0;
            default:
                return 2;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int m966b(int r0) {
        /*
        switch(r0) {
            case 0: goto L_0x000a;
            case 1: goto L_0x0008;
            case 2: goto L_0x0008;
            default: goto L_0x0003;
        };
    L_0x0003:
        switch(r0) {
            case 14: goto L_0x000a;
            case 15: goto L_0x000a;
            case 16: goto L_0x0008;
            case 17: goto L_0x0008;
            default: goto L_0x0006;
        };
    L_0x0006:
        r0 = 2;
        return r0;
    L_0x0008:
        r0 = 0;
        return r0;
    L_0x000a:
        r0 = 1;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.f.e.b(int):int");
    }
}
