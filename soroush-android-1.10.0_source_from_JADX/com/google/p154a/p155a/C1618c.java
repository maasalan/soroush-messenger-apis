package com.google.p154a.p155a;

import java.util.Arrays;

public abstract class C1618c {
    @Deprecated
    public static final C1618c f5058a = C7135x.f20341p;
    @Deprecated
    public static final C1618c f5059b = C5404d.f15040o;
    @Deprecated
    public static final C1618c f5060c = C7132c.f20337o;
    @Deprecated
    public static final C1618c f5061d = C6547e.f17904o;
    @Deprecated
    public static final C1618c f5062e = C5406k.f15041o;
    @Deprecated
    public static final C1618c f5063f = C5407m.f15042o;
    @Deprecated
    public static final C1618c f5064g = C5408n.f15043o;
    @Deprecated
    public static final C1618c f5065h = C5410p.f15045o;
    @Deprecated
    public static final C1618c f5066i = C5409o.f15044o;
    @Deprecated
    public static final C1618c f5067j = C7133l.f20338o;
    @Deprecated
    public static final C1618c f5068k = C6548g.f17905o;
    @Deprecated
    public static final C1618c f5069l = C6554w.f17911o;
    @Deprecated
    public static final C1618c f5070m = C7131a.f20336o;
    @Deprecated
    public static final C1618c f5071n = C7134t.f20339o;

    private static final class C5403b extends C1618c {
        private final char[] f15039o;

        public C5403b(CharSequence charSequence) {
            this.f15039o = charSequence.toString().toCharArray();
            Arrays.sort(this.f15039o);
        }

        public final boolean mo1511b(char c) {
            return Arrays.binarySearch(this.f15039o, c) >= 0;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("CharMatcher.anyOf(\"");
            for (char c : this.f15039o) {
                stringBuilder.append(C1618c.m4163c(c));
            }
            stringBuilder.append("\")");
            return stringBuilder.toString();
        }
    }

    private static final class C5404d extends C1618c {
        static final C1618c f15040o = new C5404d();

        private C5404d() {
        }

        public final boolean mo1511b(char c) {
            if (!(c == ' ' || c == '' || c == ' ')) {
                if (c != ' ') {
                    if (!(c == ' ' || c == '　')) {
                        switch (c) {
                            case '\t':
                            case '\n':
                            case '\u000b':
                            case '\f':
                            case '\r':
                                break;
                            default:
                                switch (c) {
                                    case ' ':
                                    case ' ':
                                        break;
                                    default:
                                        return c >= ' ' && c <= ' ';
                                }
                        }
                    }
                }
            }
            return true;
        }

        public final String toString() {
            return "CharMatcher.breakingWhitespace()";
        }
    }

    static abstract class C5405f extends C1618c {
        C5405f() {
        }

        public C1618c mo1513e() {
            return new C6553s(this);
        }
    }

    private static final class C5406k extends C1618c {
        static final C5406k f15041o = new C5406k();

        private C5406k() {
        }

        public final boolean mo1511b(char c) {
            return Character.isDigit(c);
        }

        public final String toString() {
            return "CharMatcher.javaDigit()";
        }
    }

    private static final class C5407m extends C1618c {
        static final C5407m f15042o = new C5407m();

        private C5407m() {
        }

        public final boolean mo1511b(char c) {
            return Character.isLetter(c);
        }

        public final String toString() {
            return "CharMatcher.javaLetter()";
        }
    }

    private static final class C5408n extends C1618c {
        static final C5408n f15043o = new C5408n();

        private C5408n() {
        }

        public final boolean mo1511b(char c) {
            return Character.isLetterOrDigit(c);
        }

        public final String toString() {
            return "CharMatcher.javaLetterOrDigit()";
        }
    }

    private static final class C5409o extends C1618c {
        static final C5409o f15044o = new C5409o();

        private C5409o() {
        }

        public final boolean mo1511b(char c) {
            return Character.isLowerCase(c);
        }

        public final String toString() {
            return "CharMatcher.javaLowerCase()";
        }
    }

    private static final class C5410p extends C1618c {
        static final C5410p f15045o = new C5410p();

        private C5410p() {
        }

        public final boolean mo1511b(char c) {
            return Character.isUpperCase(c);
        }

        public final String toString() {
            return "CharMatcher.javaUpperCase()";
        }
    }

    private static class C5411r extends C1618c {
        final C1618c f15046o;

        C5411r(C1618c c1618c) {
            this.f15046o = (C1618c) C1625i.m4181a((Object) c1618c);
        }

        public final boolean mo1511b(char c) {
            return !this.f15046o.mo1511b(c);
        }

        public final boolean mo1514b(CharSequence charSequence) {
            return this.f15046o.mo1515c(charSequence);
        }

        public final boolean mo1515c(CharSequence charSequence) {
            return this.f15046o.mo1514b(charSequence);
        }

        public final C1618c mo1513e() {
            return this.f15046o;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.f15046o);
            stringBuilder.append(".negate()");
            return stringBuilder.toString();
        }
    }

    private static final class C5412u extends C1618c {
        final C1618c f15047o;
        final C1618c f15048p;

        C5412u(C1618c c1618c, C1618c c1618c2) {
            this.f15047o = (C1618c) C1625i.m4181a((Object) c1618c);
            this.f15048p = (C1618c) C1625i.m4181a((Object) c1618c2);
        }

        public final boolean mo1511b(char c) {
            if (!this.f15047o.mo1511b(c)) {
                if (!this.f15048p.mo1511b(c)) {
                    return false;
                }
            }
            return true;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("CharMatcher.or(");
            stringBuilder.append(this.f15047o);
            stringBuilder.append(", ");
            stringBuilder.append(this.f15048p);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    private static class C5413v extends C1618c {
        private final String f15049o;
        private final char[] f15050p;
        private final char[] f15051q;

        C5413v(String str, char[] cArr, char[] cArr2) {
            this.f15049o = str;
            this.f15050p = cArr;
            this.f15051q = cArr2;
            C1625i.m4185a(cArr.length == cArr2.length);
            int i = 0;
            while (i < cArr.length) {
                C1625i.m4185a(cArr[i] <= cArr2[i]);
                int i2 = i + 1;
                if (i2 < cArr.length) {
                    C1625i.m4185a(cArr2[i] < cArr[i2]);
                }
                i = i2;
            }
        }

        public final boolean mo1511b(char c) {
            int binarySearch = Arrays.binarySearch(this.f15050p, c);
            if (binarySearch >= 0) {
                return true;
            }
            binarySearch = (binarySearch ^ -1) - 1;
            return binarySearch >= 0 && c <= this.f15051q[binarySearch];
        }

        public String toString() {
            return this.f15049o;
        }
    }

    private static final class C6547e extends C5413v {
        static final C6547e f17904o = new C6547e();

        private C6547e() {
            super("CharMatcher.digit()", "0٠۰߀०০੦૦୦௦౦೦൦๐໐༠၀႐០᠐᥆᧐᭐᮰᱀᱐꘠꣐꤀꩐０".toCharArray(), C6547e.m15813f());
        }

        private static char[] m15813f() {
            char[] cArr = new char[31];
            for (int i = 0; i < 31; i++) {
                cArr[i] = (char) ("0٠۰߀०০੦૦୦௦౦೦൦๐໐༠၀႐០᠐᥆᧐᭐᮰᱀᱐꘠꣐꤀꩐０".charAt(i) + 9);
            }
            return cArr;
        }
    }

    private static final class C6548g extends C5413v {
        static final C6548g f17905o = new C6548g();

        private C6548g() {
            super("CharMatcher.invisible()", "\u0000­؀؜۝܏ ᠎   ⁦⁧⁨⁩⁪　?﻿￹￺".toCharArray(), "  ­؄؜۝܏ ᠎‏ ⁤⁦⁧⁨⁩⁯　﻿￹￻".toCharArray());
        }
    }

    private static final class C6549h extends C5405f {
        private final char f17906o;

        C6549h(char c) {
            this.f17906o = c;
        }

        public final C1618c mo2988a(C1618c c1618c) {
            return c1618c.mo1511b(this.f17906o) ? c1618c : super.mo2988a(c1618c);
        }

        public final boolean mo1511b(char c) {
            return c == this.f17906o;
        }

        public final C1618c mo1513e() {
            return new C6551j(this.f17906o);
        }

        public final String mo2989f(CharSequence charSequence) {
            return charSequence.toString().replace(this.f17906o, '.');
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("CharMatcher.is('");
            stringBuilder.append(C1618c.m4163c(this.f17906o));
            stringBuilder.append("')");
            return stringBuilder.toString();
        }
    }

    private static final class C6550i extends C5405f {
        private final char f17907o;
        private final char f17908p;

        C6550i(char c, char c2) {
            this.f17907o = c;
            this.f17908p = c2;
        }

        public final boolean mo1511b(char c) {
            if (c != this.f17907o) {
                if (c != this.f17908p) {
                    return false;
                }
            }
            return true;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("CharMatcher.anyOf(\"");
            stringBuilder.append(C1618c.m4163c(this.f17907o));
            stringBuilder.append(C1618c.m4163c(this.f17908p));
            stringBuilder.append("\")");
            return stringBuilder.toString();
        }
    }

    private static final class C6551j extends C5405f {
        private final char f17909o;

        C6551j(char c) {
            this.f17909o = c;
        }

        public final C1618c mo2988a(C1618c c1618c) {
            return c1618c.mo1511b(this.f17909o) ? C7131a.f20336o : this;
        }

        public final boolean mo1511b(char c) {
            return c != this.f17909o;
        }

        public final C1618c mo1513e() {
            return C1618c.m4159a(this.f17909o);
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("CharMatcher.isNot('");
            stringBuilder.append(C1618c.m4163c(this.f17909o));
            stringBuilder.append("')");
            return stringBuilder.toString();
        }
    }

    static abstract class C6552q extends C5405f {
        private final String f17910o;

        C6552q(String str) {
            this.f17910o = (String) C1625i.m4181a((Object) str);
        }

        public final String toString() {
            return this.f17910o;
        }
    }

    static class C6553s extends C5411r {
        C6553s(C1618c c1618c) {
            super(c1618c);
        }
    }

    private static final class C6554w extends C5413v {
        static final C6554w f17911o = new C6554w();

        private C6554w() {
            super("CharMatcher.singleWidth()", "\u0000־א׳؀ݐ฀Ḁ℀ﭐﹰ｡".toCharArray(), "ӹ־ת״ۿݿ๿₯℺﷿﻿ￜ".toCharArray());
        }
    }

    private static final class C7131a extends C6552q {
        static final C7131a f20336o = new C7131a();

        private C7131a() {
            super("CharMatcher.any()");
        }

        public final int mo3400a(CharSequence charSequence, int i) {
            int length = charSequence.length();
            C1625i.m4187b(i, length);
            return i == length ? -1 : i;
        }

        public final C1618c mo2988a(C1618c c1618c) {
            C1625i.m4181a((Object) c1618c);
            return this;
        }

        public final boolean mo1511b(char c) {
            return true;
        }

        public final boolean mo1514b(CharSequence charSequence) {
            C1625i.m4181a((Object) charSequence);
            return true;
        }

        public final boolean mo1515c(CharSequence charSequence) {
            return charSequence.length() == 0;
        }

        public final int mo3401d(CharSequence charSequence) {
            return charSequence.length() == 0 ? -1 : 0;
        }

        public final C1618c mo1513e() {
            return C7134t.f20339o;
        }

        public final String mo3402e(CharSequence charSequence) {
            C1625i.m4181a((Object) charSequence);
            return "";
        }

        public final String mo2989f(CharSequence charSequence) {
            char[] cArr = new char[charSequence.length()];
            Arrays.fill(cArr, '.');
            return new String(cArr);
        }
    }

    private static final class C7132c extends C6552q {
        static final C7132c f20337o = new C7132c();

        C7132c() {
            super("CharMatcher.ascii()");
        }

        public final boolean mo1511b(char c) {
            return c <= '';
        }
    }

    private static final class C7133l extends C6552q {
        static final C7133l f20338o = new C7133l();

        private C7133l() {
            super("CharMatcher.javaIsoControl()");
        }

        public final boolean mo1511b(char c) {
            if (c > '\u001f') {
                if (c < '' || c > '') {
                    return false;
                }
            }
            return true;
        }
    }

    private static final class C7134t extends C6552q {
        static final C7134t f20339o = new C7134t();

        private C7134t() {
            super("CharMatcher.none()");
        }

        public final int mo3400a(CharSequence charSequence, int i) {
            C1625i.m4187b(i, charSequence.length());
            return -1;
        }

        public final C1618c mo2988a(C1618c c1618c) {
            return (C1618c) C1625i.m4181a((Object) c1618c);
        }

        public final boolean mo1511b(char c) {
            return false;
        }

        public final boolean mo1514b(CharSequence charSequence) {
            return charSequence.length() == 0;
        }

        public final boolean mo1515c(CharSequence charSequence) {
            C1625i.m4181a((Object) charSequence);
            return true;
        }

        public final int mo3401d(CharSequence charSequence) {
            C1625i.m4181a((Object) charSequence);
            return -1;
        }

        public final C1618c mo1513e() {
            return C7131a.f20336o;
        }

        public final String mo3402e(CharSequence charSequence) {
            return charSequence.toString();
        }

        public final String mo2989f(CharSequence charSequence) {
            return charSequence.toString();
        }
    }

    static final class C7135x extends C6552q {
        static final int f20340o = Integer.numberOfLeadingZeros(31);
        static final C7135x f20341p = new C7135x();

        C7135x() {
            super("CharMatcher.whitespace()");
        }

        public final boolean mo1511b(char c) {
            return " 　\r   　 \u000b　   　 \t     \f 　 　　 \n 　".charAt((1682554634 * c) >>> f20340o) == c;
        }
    }

    protected C1618c() {
    }

    public static C1618c m4158a() {
        return C7134t.f20339o;
    }

    public static C1618c m4159a(char c) {
        return new C6549h(c);
    }

    public static C1618c m4160a(CharSequence charSequence) {
        switch (charSequence.length()) {
            case 0:
                return C7134t.f20339o;
            case 1:
                return C1618c.m4159a(charSequence.charAt(0));
            case 2:
                return new C6550i(charSequence.charAt(0), charSequence.charAt(1));
            default:
                return new C5403b(charSequence);
        }
    }

    public static C1618c m4161b() {
        return C7132c.f20337o;
    }

    public static C1618c m4162c() {
        return C6547e.f17904o;
    }

    static /* synthetic */ String m4163c(char c) {
        String str = "0123456789ABCDEF";
        char[] cArr = new char[]{'\\', 'u', '\u0000', '\u0000', '\u0000', '\u0000'};
        for (int i = 0; i < 4; i++) {
            cArr[5 - i] = str.charAt(r6 & 15);
            int i2 = (char) (i2 >> 4);
        }
        return String.copyValueOf(cArr);
    }

    public static C1618c m4164d() {
        return C5408n.f15043o;
    }

    public int mo3400a(CharSequence charSequence, int i) {
        int length = charSequence.length();
        C1625i.m4187b(i, length);
        while (i < length) {
            if (mo1511b(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public C1618c mo2988a(C1618c c1618c) {
        return new C5412u(this, c1618c);
    }

    public abstract boolean mo1511b(char c);

    public boolean mo1514b(CharSequence charSequence) {
        for (int length = charSequence.length() - 1; length >= 0; length--) {
            if (!mo1511b(charSequence.charAt(length))) {
                return false;
            }
        }
        return true;
    }

    public boolean mo1515c(CharSequence charSequence) {
        return mo3401d(charSequence) == -1;
    }

    public int mo3401d(CharSequence charSequence) {
        return mo3400a(charSequence, 0);
    }

    public C1618c mo1513e() {
        return new C5411r(this);
    }

    public String mo3402e(CharSequence charSequence) {
        String charSequence2 = charSequence.toString();
        int d = mo3401d(charSequence2);
        if (d == -1) {
            return charSequence2;
        }
        char[] toCharArray = charSequence2.toCharArray();
        int i = 1;
        while (true) {
            d++;
            if (d == toCharArray.length) {
                return new String(toCharArray, 0, d - i);
            }
            if (mo1511b(toCharArray[d])) {
                i++;
            } else {
                toCharArray[d - i] = toCharArray[d];
            }
        }
    }

    public String mo2989f(CharSequence charSequence) {
        String charSequence2 = charSequence.toString();
        int d = mo3401d(charSequence2);
        if (d == -1) {
            return charSequence2;
        }
        char[] toCharArray = charSequence2.toCharArray();
        toCharArray[d] = '.';
        while (true) {
            d++;
            if (d >= toCharArray.length) {
                return new String(toCharArray);
            }
            if (mo1511b(toCharArray[d])) {
                toCharArray[d] = '.';
            }
        }
    }

    public String toString() {
        return super.toString();
    }
}
