package com.google.p154a.p155a;

import com.google.p154a.p155a.C1616a.C1615a;
import java.util.Iterator;

public final class C1628j {
    final C1618c f5082a;
    final boolean f5083b;
    final C1627b f5084c;
    final int f5085d;

    class C16262 implements Iterable<String> {
        final /* synthetic */ CharSequence f5080a;
        final /* synthetic */ C1628j f5081b;

        public C16262(C1628j c1628j, CharSequence charSequence) {
            this.f5081b = c1628j;
            this.f5080a = charSequence;
        }

        public final Iterator<String> iterator() {
            C1628j c1628j = this.f5081b;
            return c1628j.f5084c.mo1516a(c1628j, this.f5080a);
        }

        public final String toString() {
            StringBuilder a = C1621f.m4175a(", ").m4178a(new StringBuilder("["), iterator());
            a.append(']');
            return a.toString();
        }
    }

    private interface C1627b {
        Iterator<String> mo1516a(C1628j c1628j, CharSequence charSequence);
    }

    static class C54151 implements C1627b {
        final /* synthetic */ C1618c f15052a;

        public C54151(C1618c c1618c) {
            this.f15052a = c1618c;
        }

        public final /* synthetic */ Iterator mo1516a(C1628j c1628j, CharSequence charSequence) {
            return new C5416a(this, c1628j, charSequence) {
                final /* synthetic */ C54151 f17912b;

                final int mo2990a(int i) {
                    return this.f17912b.f15052a.mo3400a(this.c, i);
                }

                final int mo2991b(int i) {
                    return i + 1;
                }
            };
        }
    }

    private static abstract class C5416a extends C1616a<String> {
        final CharSequence f15053c;
        final C1618c f15054d;
        final boolean f15055e;
        int f15056f = 0;
        int f15057g;

        protected C5416a(C1628j c1628j, CharSequence charSequence) {
            this.f15054d = c1628j.f5082a;
            this.f15055e = c1628j.f5083b;
            this.f15057g = c1628j.f5085d;
            this.f15053c = charSequence;
        }

        abstract int mo2990a(int i);

        protected final /* synthetic */ Object mo1517a() {
            int i;
            int a;
            while (true) {
                i = this.f15056f;
                while (this.f15056f != -1) {
                    a = mo2990a(this.f15056f);
                    if (a == -1) {
                        a = this.f15053c.length();
                        this.f15056f = -1;
                    } else {
                        this.f15056f = mo2991b(a);
                    }
                    if (this.f15056f == i) {
                        this.f15056f++;
                        if (this.f15056f > this.f15053c.length()) {
                            this.f15056f = -1;
                        }
                    } else {
                        while (i < a && this.f15054d.mo1511b(this.f15053c.charAt(i))) {
                            i++;
                        }
                        while (a > i && this.f15054d.mo1511b(this.f15053c.charAt(a - 1))) {
                            a--;
                        }
                        if (this.f15055e && i == a) {
                        }
                    }
                }
                this.f5056a = C1615a.f5053c;
                return null;
            }
            if (this.f15057g == 1) {
                a = this.f15053c.length();
                this.f15056f = -1;
                while (a > i && this.f15054d.mo1511b(this.f15053c.charAt(a - 1))) {
                    a--;
                }
            } else {
                this.f15057g--;
            }
            return this.f15053c.subSequence(i, a).toString();
        }

        abstract int mo2991b(int i);
    }

    public C1628j(C1627b c1627b) {
        this(c1627b, C1618c.m4158a());
    }

    private C1628j(C1627b c1627b, C1618c c1618c) {
        this.f5084c = c1627b;
        this.f5083b = false;
        this.f5082a = c1618c;
        this.f5085d = ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
    }
}
