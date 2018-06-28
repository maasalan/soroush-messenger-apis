package com.p111d.p112a.p121c.p124c.p126b;

import com.p111d.p112a.p113a.C1320j.C1316a;
import com.p111d.p112a.p114b.C1344b;
import com.p111d.p112a.p114b.C1380m;
import com.p111d.p112a.p114b.C5303j;
import com.p111d.p112a.p121c.C1446d;
import com.p111d.p112a.p121c.C1507k;
import com.p111d.p112a.p121c.C5347g;
import com.p111d.p112a.p121c.C5348h;
import com.p111d.p112a.p121c.C5364l;
import com.p111d.p112a.p121c.p122a.C1387a;
import com.p111d.p112a.p121c.p124c.C1434i;
import com.p111d.p112a.p121c.p131i.C1475c;
import com.p111d.p112a.p121c.p138m.C1519b;
import com.p111d.p112a.p121c.p138m.C1519b.C5365a;
import com.p111d.p112a.p121c.p138m.C1519b.C5366b;
import com.p111d.p112a.p121c.p138m.C1519b.C5367c;
import com.p111d.p112a.p121c.p138m.C1519b.C5368d;
import com.p111d.p112a.p121c.p138m.C1519b.C5369e;
import com.p111d.p112a.p121c.p138m.C1519b.C5370f;
import com.p111d.p112a.p121c.p138m.C1519b.C5371g;

public abstract class C6479u<T> extends C5320x<T> implements C1434i {
    protected final Boolean f17664a;

    @C1387a
    static final class C7071a extends C6479u<boolean[]> {
        public C7071a() {
            super(boolean[].class);
        }

        private C7071a(C7071a c7071a, Boolean bool) {
            super(c7071a, bool);
        }

        private boolean[] m18391e(C5303j c5303j, C5347g c5347g) {
            C5365a c5365a;
            Object obj;
            int i;
            Throwable e;
            Object b;
            if (c5303j.isExpectedStartArrayToken()) {
                C1519b p = c5347g.m11477p();
                if (p.f4734a == null) {
                    p.f4734a = new C5365a();
                }
                c5365a = p.f4734a;
                obj = (boolean[]) c5365a.m4016b();
                i = 0;
                while (c5303j.nextToken() != C1380m.END_ARRAY) {
                    try {
                        boolean k = m11174k(c5303j, c5347g);
                        if (i >= obj.length) {
                            Object obj2 = (boolean[]) c5365a.m4015a(obj, i);
                            i = 0;
                            obj = obj2;
                        }
                        int i2 = i + 1;
                        try {
                            obj[i] = k;
                            i = i2;
                        } catch (Exception e2) {
                            e = e2;
                            i = i2;
                        }
                    } catch (Exception e3) {
                        e = e3;
                    }
                }
                b = c5365a.m4017b(obj, i);
            } else {
                b = m15471c(c5303j, c5347g);
            }
            return (boolean[]) b;
            throw C5364l.m11579a(e, obj, c5365a.m4013a() + i);
        }

        protected final C6479u<?> mo3347a(Boolean bool) {
            return new C7071a(this, bool);
        }

        public final /* synthetic */ Object mo1304a(C5303j c5303j, C5347g c5347g) {
            return m18391e(c5303j, c5347g);
        }

        protected final /* synthetic */ Object mo3348d(C5303j c5303j, C5347g c5347g) {
            return new boolean[]{m11174k(c5303j, c5347g)};
        }
    }

    @C1387a
    static final class C7072b extends C6479u<byte[]> {
        public C7072b() {
            super(byte[].class);
        }

        private C7072b(C7072b c7072b, Boolean bool) {
            super(c7072b, bool);
        }

        private byte[] m18395e(C5303j c5303j, C5347g c5347g) {
            Throwable e;
            C1380m currentToken = c5303j.getCurrentToken();
            if (currentToken == C1380m.VALUE_STRING) {
                return c5303j.getBinaryValue(c5347g.m11473l());
            }
            if (currentToken == C1380m.VALUE_EMBEDDED_OBJECT) {
                Object embeddedObject = c5303j.getEmbeddedObject();
                if (embeddedObject == null) {
                    return null;
                }
                if (embeddedObject instanceof byte[]) {
                    return (byte[]) embeddedObject;
                }
            }
            if (!c5303j.isExpectedStartArrayToken()) {
                return (byte[]) m15471c(c5303j, c5347g);
            }
            C1519b p = c5347g.m11477p();
            if (p.f4735b == null) {
                p.f4735b = new C5366b();
            }
            C5366b c5366b = p.f4735b;
            Object obj = (byte[]) c5366b.m4016b();
            int i = 0;
            while (true) {
                try {
                    C1380m nextToken = c5303j.nextToken();
                    if (nextToken == C1380m.END_ARRAY) {
                        return (byte[]) c5366b.m4017b(obj, i);
                    }
                    byte b;
                    Object obj2;
                    int i2;
                    if (nextToken != C1380m.VALUE_NUMBER_INT) {
                        if (nextToken != C1380m.VALUE_NUMBER_FLOAT) {
                            if (nextToken != C1380m.VALUE_NULL) {
                                throw c5347g.m11457b(this.y.getComponentType());
                            }
                            b = (byte) 0;
                            if (i >= obj.length) {
                                obj2 = (byte[]) c5366b.m4015a(obj, i);
                                i = 0;
                                obj = obj2;
                            }
                            i2 = i + 1;
                            obj[i] = b;
                            i = i2;
                        }
                    }
                    b = c5303j.getByteValue();
                    if (i >= obj.length) {
                        obj2 = (byte[]) c5366b.m4015a(obj, i);
                        i = 0;
                        obj = obj2;
                    }
                    i2 = i + 1;
                    try {
                        obj[i] = b;
                        i = i2;
                    } catch (Exception e2) {
                        e = e2;
                        i = i2;
                    }
                } catch (Exception e3) {
                    e = e3;
                }
            }
            throw C5364l.m11579a(e, obj, c5366b.m4013a() + i);
        }

        protected final C6479u<?> mo3347a(Boolean bool) {
            return new C7072b(this, bool);
        }

        public final /* synthetic */ Object mo1304a(C5303j c5303j, C5347g c5347g) {
            return m18395e(c5303j, c5347g);
        }

        protected final /* synthetic */ Object mo3348d(C5303j c5303j, C5347g c5347g) {
            byte b;
            C1380m currentToken = c5303j.getCurrentToken();
            if (currentToken != C1380m.VALUE_NUMBER_INT) {
                if (currentToken != C1380m.VALUE_NUMBER_FLOAT) {
                    if (currentToken != C1380m.VALUE_NULL) {
                        throw c5347g.m11457b(this.y.getComponentType());
                    }
                    b = (byte) 0;
                    return new byte[]{b};
                }
            }
            b = c5303j.getByteValue();
            return new byte[]{b};
        }
    }

    @C1387a
    static final class C7073c extends C6479u<char[]> {
        public C7073c() {
            super(char[].class);
        }

        protected final C6479u<?> mo3347a(Boolean bool) {
            return this;
        }

        public final /* synthetic */ Object mo1304a(C5303j c5303j, C5347g c5347g) {
            C1380m currentToken = c5303j.getCurrentToken();
            if (currentToken == C1380m.VALUE_STRING) {
                Object textCharacters = c5303j.getTextCharacters();
                int textOffset = c5303j.getTextOffset();
                int textLength = c5303j.getTextLength();
                Object obj = new char[textLength];
                System.arraycopy(textCharacters, textOffset, obj, 0, textLength);
                return obj;
            }
            String stringBuilder;
            if (c5303j.isExpectedStartArrayToken()) {
                StringBuilder stringBuilder2 = new StringBuilder(64);
                while (true) {
                    C1380m nextToken = c5303j.nextToken();
                    if (nextToken == C1380m.END_ARRAY) {
                        break;
                    } else if (nextToken != C1380m.VALUE_STRING) {
                        throw c5347g.m11457b(Character.TYPE);
                    } else {
                        String text = c5303j.getText();
                        if (text.length() != 1) {
                            StringBuilder stringBuilder3 = new StringBuilder("Can not convert a JSON String of length ");
                            stringBuilder3.append(text.length());
                            stringBuilder3.append(" into a char element of char array");
                            throw C5364l.m11572a(c5303j, stringBuilder3.toString());
                        }
                        stringBuilder2.append(text.charAt(0));
                    }
                }
                stringBuilder = stringBuilder2.toString();
            } else {
                if (currentToken == C1380m.VALUE_EMBEDDED_OBJECT) {
                    Object embeddedObject = c5303j.getEmbeddedObject();
                    if (embeddedObject == null) {
                        return null;
                    }
                    if (embeddedObject instanceof char[]) {
                        return (char[]) embeddedObject;
                    }
                    if (embeddedObject instanceof String) {
                        stringBuilder = (String) embeddedObject;
                    } else if (embeddedObject instanceof byte[]) {
                        stringBuilder = C1344b.m3177a().m3165a((byte[]) embeddedObject, false);
                    }
                }
                throw c5347g.m11457b(this.y);
            }
            return stringBuilder.toCharArray();
        }

        protected final /* synthetic */ Object mo3348d(C5303j c5303j, C5347g c5347g) {
            throw c5347g.m11457b(this.y);
        }
    }

    @C1387a
    static final class C7074d extends C6479u<double[]> {
        public C7074d() {
            super(double[].class);
        }

        private C7074d(C7074d c7074d, Boolean bool) {
            super(c7074d, bool);
        }

        private double[] m18402e(C5303j c5303j, C5347g c5347g) {
            C5367c c5367c;
            Object obj;
            int i;
            Throwable e;
            Object b;
            if (c5303j.isExpectedStartArrayToken()) {
                C1519b p = c5347g.m11477p();
                if (p.f4740g == null) {
                    p.f4740g = new C5367c();
                }
                c5367c = p.f4740g;
                obj = (double[]) c5367c.m4016b();
                i = 0;
                while (c5303j.nextToken() != C1380m.END_ARRAY) {
                    try {
                        double w = m11186w(c5303j, c5347g);
                        if (i >= obj.length) {
                            Object obj2 = (double[]) c5367c.m4015a(obj, i);
                            i = 0;
                            obj = obj2;
                        }
                        int i2 = i + 1;
                        try {
                            obj[i] = w;
                            i = i2;
                        } catch (Exception e2) {
                            e = e2;
                            i = i2;
                        }
                    } catch (Exception e3) {
                        e = e3;
                    }
                }
                b = c5367c.m4017b(obj, i);
            } else {
                b = m15471c(c5303j, c5347g);
            }
            return (double[]) b;
            throw C5364l.m11579a(e, obj, c5367c.m4013a() + i);
        }

        protected final C6479u<?> mo3347a(Boolean bool) {
            return new C7074d(this, bool);
        }

        public final /* synthetic */ Object mo1304a(C5303j c5303j, C5347g c5347g) {
            return m18402e(c5303j, c5347g);
        }

        protected final /* synthetic */ Object mo3348d(C5303j c5303j, C5347g c5347g) {
            return new double[]{m11186w(c5303j, c5347g)};
        }
    }

    @C1387a
    static final class C7075e extends C6479u<float[]> {
        public C7075e() {
            super(float[].class);
        }

        private C7075e(C7075e c7075e, Boolean bool) {
            super(c7075e, bool);
        }

        private float[] m18406e(C5303j c5303j, C5347g c5347g) {
            C5368d c5368d;
            Object obj;
            int i;
            Throwable e;
            Object b;
            if (c5303j.isExpectedStartArrayToken()) {
                C1519b p = c5347g.m11477p();
                if (p.f4739f == null) {
                    p.f4739f = new C5368d();
                }
                c5368d = p.f4739f;
                obj = (float[]) c5368d.m4016b();
                i = 0;
                while (c5303j.nextToken() != C1380m.END_ARRAY) {
                    try {
                        float u = m11184u(c5303j, c5347g);
                        if (i >= obj.length) {
                            Object obj2 = (float[]) c5368d.m4015a(obj, i);
                            i = 0;
                            obj = obj2;
                        }
                        int i2 = i + 1;
                        try {
                            obj[i] = u;
                            i = i2;
                        } catch (Exception e2) {
                            e = e2;
                            i = i2;
                        }
                    } catch (Exception e3) {
                        e = e3;
                    }
                }
                b = c5368d.m4017b(obj, i);
            } else {
                b = m15471c(c5303j, c5347g);
            }
            return (float[]) b;
            throw C5364l.m11579a(e, obj, c5368d.m4013a() + i);
        }

        protected final C6479u<?> mo3347a(Boolean bool) {
            return new C7075e(this, bool);
        }

        public final /* synthetic */ Object mo1304a(C5303j c5303j, C5347g c5347g) {
            return m18406e(c5303j, c5347g);
        }

        protected final /* synthetic */ Object mo3348d(C5303j c5303j, C5347g c5347g) {
            return new float[]{m11184u(c5303j, c5347g)};
        }
    }

    @C1387a
    static final class C7076f extends C6479u<int[]> {
        public static final C7076f f20191b = new C7076f();

        public C7076f() {
            super(int[].class);
        }

        private C7076f(C7076f c7076f, Boolean bool) {
            super(c7076f, bool);
        }

        private int[] m18410e(C5303j c5303j, C5347g c5347g) {
            C5369e c5369e;
            Object obj;
            int i;
            Throwable e;
            Object b;
            if (c5303j.isExpectedStartArrayToken()) {
                C1519b p = c5347g.m11477p();
                if (p.f4737d == null) {
                    p.f4737d = new C5369e();
                }
                c5369e = p.f4737d;
                obj = (int[]) c5369e.m4016b();
                i = 0;
                while (c5303j.nextToken() != C1380m.END_ARRAY) {
                    try {
                        int p2 = m11179p(c5303j, c5347g);
                        if (i >= obj.length) {
                            Object obj2 = (int[]) c5369e.m4015a(obj, i);
                            i = 0;
                            obj = obj2;
                        }
                        int i2 = i + 1;
                        try {
                            obj[i] = p2;
                            i = i2;
                        } catch (Exception e2) {
                            e = e2;
                            i = i2;
                        }
                    } catch (Exception e3) {
                        e = e3;
                    }
                }
                b = c5369e.m4017b(obj, i);
            } else {
                b = m15471c(c5303j, c5347g);
            }
            return (int[]) b;
            throw C5364l.m11579a(e, obj, c5369e.m4013a() + i);
        }

        protected final C6479u<?> mo3347a(Boolean bool) {
            return new C7076f(this, bool);
        }

        public final /* synthetic */ Object mo1304a(C5303j c5303j, C5347g c5347g) {
            return m18410e(c5303j, c5347g);
        }

        protected final /* synthetic */ Object mo3348d(C5303j c5303j, C5347g c5347g) {
            return new int[]{m11179p(c5303j, c5347g)};
        }
    }

    @C1387a
    static final class C7077g extends C6479u<long[]> {
        public static final C7077g f20192b = new C7077g();

        public C7077g() {
            super(long[].class);
        }

        private C7077g(C7077g c7077g, Boolean bool) {
            super(c7077g, bool);
        }

        private long[] m18414e(C5303j c5303j, C5347g c5347g) {
            C5370f c5370f;
            Object obj;
            int i;
            Throwable e;
            Object b;
            if (c5303j.isExpectedStartArrayToken()) {
                C1519b p = c5347g.m11477p();
                if (p.f4738e == null) {
                    p.f4738e = new C5370f();
                }
                c5370f = p.f4738e;
                obj = (long[]) c5370f.m4016b();
                i = 0;
                while (c5303j.nextToken() != C1380m.END_ARRAY) {
                    try {
                        long s = m11182s(c5303j, c5347g);
                        if (i >= obj.length) {
                            Object obj2 = (long[]) c5370f.m4015a(obj, i);
                            i = 0;
                            obj = obj2;
                        }
                        int i2 = i + 1;
                        try {
                            obj[i] = s;
                            i = i2;
                        } catch (Exception e2) {
                            e = e2;
                            i = i2;
                        }
                    } catch (Exception e3) {
                        e = e3;
                    }
                }
                b = c5370f.m4017b(obj, i);
            } else {
                b = m15471c(c5303j, c5347g);
            }
            return (long[]) b;
            throw C5364l.m11579a(e, obj, c5370f.m4013a() + i);
        }

        protected final C6479u<?> mo3347a(Boolean bool) {
            return new C7077g(this, bool);
        }

        public final /* synthetic */ Object mo1304a(C5303j c5303j, C5347g c5347g) {
            return m18414e(c5303j, c5347g);
        }

        protected final /* synthetic */ Object mo3348d(C5303j c5303j, C5347g c5347g) {
            return new long[]{m11182s(c5303j, c5347g)};
        }
    }

    @C1387a
    static final class C7078h extends C6479u<short[]> {
        public C7078h() {
            super(short[].class);
        }

        private C7078h(C7078h c7078h, Boolean bool) {
            super(c7078h, bool);
        }

        private short[] m18418e(C5303j c5303j, C5347g c5347g) {
            C5371g c5371g;
            Object obj;
            int i;
            Throwable e;
            Object b;
            if (c5303j.isExpectedStartArrayToken()) {
                C1519b p = c5347g.m11477p();
                if (p.f4736c == null) {
                    p.f4736c = new C5371g();
                }
                c5371g = p.f4736c;
                obj = (short[]) c5371g.m4016b();
                i = 0;
                while (c5303j.nextToken() != C1380m.END_ARRAY) {
                    try {
                        short o = m11178o(c5303j, c5347g);
                        if (i >= obj.length) {
                            Object obj2 = (short[]) c5371g.m4015a(obj, i);
                            i = 0;
                            obj = obj2;
                        }
                        int i2 = i + 1;
                        try {
                            obj[i] = o;
                            i = i2;
                        } catch (Exception e2) {
                            e = e2;
                            i = i2;
                        }
                    } catch (Exception e3) {
                        e = e3;
                    }
                }
                b = c5371g.m4017b(obj, i);
            } else {
                b = m15471c(c5303j, c5347g);
            }
            return (short[]) b;
            throw C5364l.m11579a(e, obj, c5371g.m4013a() + i);
        }

        protected final C6479u<?> mo3347a(Boolean bool) {
            return new C7078h(this, bool);
        }

        public final /* synthetic */ Object mo1304a(C5303j c5303j, C5347g c5347g) {
            return m18418e(c5303j, c5347g);
        }

        protected final /* synthetic */ Object mo3348d(C5303j c5303j, C5347g c5347g) {
            return new short[]{m11178o(c5303j, c5347g)};
        }
    }

    protected C6479u(C6479u<?> c6479u, Boolean bool) {
        super(c6479u.y);
        this.f17664a = bool;
    }

    protected C6479u(Class<T> cls) {
        super((Class) cls);
        this.f17664a = null;
    }

    public static C1507k<?> m15467a(Class<?> cls) {
        if (cls == Integer.TYPE) {
            return C7076f.f20191b;
        }
        if (cls == Long.TYPE) {
            return C7077g.f20192b;
        }
        if (cls == Byte.TYPE) {
            return new C7072b();
        }
        if (cls == Short.TYPE) {
            return new C7078h();
        }
        if (cls == Float.TYPE) {
            return new C7075e();
        }
        if (cls == Double.TYPE) {
            return new C7074d();
        }
        if (cls == Boolean.TYPE) {
            return new C7071a();
        }
        if (cls == Character.TYPE) {
            return new C7073c();
        }
        throw new IllegalStateException();
    }

    protected abstract C6479u<?> mo3347a(Boolean bool);

    public final C1507k<?> mo2801a(C5347g c5347g, C1446d c1446d) {
        Boolean a = C5320x.m11163a(c5347g, c1446d, C1316a.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        return a == this.f17664a ? this : mo3347a(a);
    }

    public final Object mo1308a(C5303j c5303j, C5347g c5347g, C1475c c1475c) {
        return c1475c.mo2897b(c5303j, c5347g);
    }

    protected final T m15471c(C5303j c5303j, C5347g c5347g) {
        if (c5303j.hasToken(C1380m.VALUE_STRING) && c5347g.m11452a(C5348h.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT) && c5303j.getText().length() == 0) {
            return null;
        }
        Object obj;
        if (this.f17664a != Boolean.TRUE) {
            if (this.f17664a != null || !c5347g.m11452a(C5348h.ACCEPT_SINGLE_VALUE_AS_ARRAY)) {
                obj = null;
                if (obj != null) {
                    return mo3348d(c5303j, c5347g);
                }
                throw c5347g.m11457b(this.y);
            }
        }
        obj = 1;
        if (obj != null) {
            return mo3348d(c5303j, c5347g);
        }
        throw c5347g.m11457b(this.y);
    }

    protected abstract T mo3348d(C5303j c5303j, C5347g c5347g);
}
