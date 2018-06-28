package com.p111d.p112a.p121c.p124c.p126b;

import com.p111d.p112a.p114b.C1380m;
import com.p111d.p112a.p114b.C5303j;
import com.p111d.p112a.p121c.C1446d;
import com.p111d.p112a.p121c.C1507k;
import com.p111d.p112a.p121c.C5347g;
import com.p111d.p112a.p121c.C5348h;
import com.p111d.p112a.p121c.C5354j;
import com.p111d.p112a.p121c.p122a.C1387a;
import com.p111d.p112a.p121c.p124c.C1434i;
import com.p111d.p112a.p121c.p124c.C1440q;
import com.p111d.p112a.p121c.p131i.C1475c;
import com.p111d.p112a.p121c.p137l.C1513m;
import com.p111d.p112a.p121c.p138m.C1527g;
import com.p111d.p112a.p121c.p138m.C1535o;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@C1387a
public class ai extends C5320x<Object> implements C1434i, C1440q {
    protected static final Object[] f17645a = new Object[0];
    @Deprecated
    public static final ai f17646b = new ai(null, null);
    protected C1507k<Object> f17647c;
    protected C1507k<Object> f17648d;
    protected C1507k<Object> f17649e;
    protected C1507k<Object> f17650f;
    protected C5354j f17651g;
    protected C5354j f17652h;

    @C1387a
    public static class C6472a extends C5320x<Object> {
        public static final C6472a f17644a = new C6472a();

        public C6472a() {
            super(Object.class);
        }

        private Object m15427c(C5303j c5303j, C5347g c5347g) {
            Object a = mo1304a(c5303j, c5347g);
            int i = 2;
            if (c5303j.nextToken() == C1380m.END_ARRAY) {
                ArrayList arrayList = new ArrayList(2);
                arrayList.add(a);
                return arrayList;
            }
            Object a2 = mo1304a(c5303j, c5347g);
            if (c5303j.nextToken() == C1380m.END_ARRAY) {
                arrayList = new ArrayList(2);
                arrayList.add(a);
                arrayList.add(a2);
                return arrayList;
            }
            C1535o o = c5347g.m11476o();
            Object[] a3 = o.m4008a();
            a3[0] = a;
            a3[1] = a2;
            int i2 = 2;
            while (true) {
                Object a4 = mo1304a(c5303j, c5347g);
                i++;
                if (i2 >= a3.length) {
                    a3 = o.m4009a(a3);
                    i2 = 0;
                }
                int i3 = i2 + 1;
                a3[i2] = a4;
                if (c5303j.nextToken() == C1380m.END_ARRAY) {
                    List arrayList2 = new ArrayList(i);
                    o.m4007a(a3, i3, arrayList2);
                    return arrayList2;
                }
                i2 = i3;
            }
        }

        private Object m15428d(C5303j c5303j, C5347g c5347g) {
            String text = c5303j.getText();
            c5303j.nextToken();
            Object a = mo1304a(c5303j, c5347g);
            String nextFieldName = c5303j.nextFieldName();
            if (nextFieldName == null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap(2);
                linkedHashMap.put(text, a);
                return linkedHashMap;
            }
            c5303j.nextToken();
            Object a2 = mo1304a(c5303j, c5347g);
            Object nextFieldName2 = c5303j.nextFieldName();
            if (nextFieldName2 == null) {
                linkedHashMap = new LinkedHashMap(4);
                linkedHashMap.put(text, a);
                linkedHashMap.put(nextFieldName, a2);
                return linkedHashMap;
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.put(text, a);
            linkedHashMap2.put(nextFieldName, a2);
            do {
                c5303j.nextToken();
                linkedHashMap2.put(nextFieldName2, mo1304a(c5303j, c5347g));
                nextFieldName2 = c5303j.nextFieldName();
            } while (nextFieldName2 != null);
            return linkedHashMap2;
        }

        private Object[] m15429e(C5303j c5303j, C5347g c5347g) {
            C1535o o = c5347g.m11476o();
            Object[] a = o.m4008a();
            int i = 0;
            while (true) {
                Object a2 = mo1304a(c5303j, c5347g);
                if (i >= a.length) {
                    a = o.m4009a(a);
                    i = 0;
                }
                int i2 = i + 1;
                a[i] = a2;
                if (c5303j.nextToken() == C1380m.END_ARRAY) {
                    return o.m4010a(a, i2);
                }
                i = i2;
            }
        }

        public final Object mo1304a(C5303j c5303j, C5347g c5347g) {
            switch (c5303j.getCurrentTokenId()) {
                case 1:
                    if (c5303j.nextToken() == C1380m.END_OBJECT) {
                        return new LinkedHashMap(2);
                    }
                    break;
                case 2:
                    return new LinkedHashMap(2);
                case 3:
                    return c5303j.nextToken() == C1380m.END_ARRAY ? c5347g.m11452a(C5348h.USE_JAVA_ARRAY_FOR_JSON_ARRAY) ? ai.f17645a : new ArrayList(2) : c5347g.m11452a(C5348h.USE_JAVA_ARRAY_FOR_JSON_ARRAY) ? m15429e(c5303j, c5347g) : m15427c(c5303j, c5347g);
                case 5:
                    break;
                case 6:
                    return c5303j.getText();
                case 7:
                    return c5347g.m11451a(x) ? C5320x.m11169z(c5303j, c5347g) : c5303j.getNumberValue();
                case 8:
                    return c5347g.m11452a(C5348h.USE_BIG_DECIMAL_FOR_FLOATS) ? c5303j.getDecimalValue() : Double.valueOf(c5303j.getDoubleValue());
                case 9:
                    return Boolean.TRUE;
                case 10:
                    return Boolean.FALSE;
                case 11:
                    return null;
                case 12:
                    return c5303j.getEmbeddedObject();
                default:
                    throw c5347g.m11457b(Object.class);
            }
            return m15428d(c5303j, c5347g);
        }

        public final Object mo1308a(C5303j c5303j, C5347g c5347g, C1475c c1475c) {
            int currentTokenId = c5303j.getCurrentTokenId();
            if (!(currentTokenId == 1 || currentTokenId == 3)) {
                switch (currentTokenId) {
                    case 5:
                        break;
                    case 6:
                        return c5303j.getText();
                    case 7:
                        return c5347g.m11452a(C5348h.USE_BIG_INTEGER_FOR_INTS) ? c5303j.getBigIntegerValue() : c5303j.getNumberValue();
                    case 8:
                        return c5347g.m11452a(C5348h.USE_BIG_DECIMAL_FOR_FLOATS) ? c5303j.getDecimalValue() : Double.valueOf(c5303j.getDoubleValue());
                    case 9:
                        return Boolean.TRUE;
                    case 10:
                        return Boolean.FALSE;
                    case 11:
                        return null;
                    case 12:
                        return c5303j.getEmbeddedObject();
                    default:
                        throw c5347g.m11457b(Object.class);
                }
            }
            return c1475c.mo2899d(c5303j, c5347g);
        }
    }

    @Deprecated
    public ai() {
        this(null, null);
    }

    public ai(C5354j c5354j, C5354j c5354j2) {
        super(Object.class);
        this.f17651g = c5354j;
        this.f17652h = c5354j2;
    }

    private static C1507k<Object> m15432a(C1507k<Object> c1507k) {
        return C1527g.m3962a((Object) c1507k) ? null : c1507k;
    }

    private Object m15433c(C5303j c5303j, C5347g c5347g) {
        int i = 2;
        if (c5303j.nextToken() == C1380m.END_ARRAY) {
            return new ArrayList(2);
        }
        Object a = mo1304a(c5303j, c5347g);
        if (c5303j.nextToken() == C1380m.END_ARRAY) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(a);
            return arrayList;
        }
        Object a2 = mo1304a(c5303j, c5347g);
        if (c5303j.nextToken() == C1380m.END_ARRAY) {
            arrayList = new ArrayList(2);
            arrayList.add(a);
            arrayList.add(a2);
            return arrayList;
        }
        C1535o o = c5347g.m11476o();
        Object[] a3 = o.m4008a();
        a3[0] = a;
        a3[1] = a2;
        int i2 = 2;
        while (true) {
            Object a4 = mo1304a(c5303j, c5347g);
            i++;
            if (i2 >= a3.length) {
                a3 = o.m4009a(a3);
                i2 = 0;
            }
            int i3 = i2 + 1;
            a3[i2] = a4;
            if (c5303j.nextToken() == C1380m.END_ARRAY) {
                List arrayList2 = new ArrayList(i);
                o.m4007a(a3, i3, arrayList2);
                return arrayList2;
            }
            i2 = i3;
        }
    }

    private Object[] m15434d(C5303j c5303j, C5347g c5347g) {
        if (c5303j.nextToken() == C1380m.END_ARRAY) {
            return f17645a;
        }
        C1535o o = c5347g.m11476o();
        Object[] a = o.m4008a();
        int i = 0;
        while (true) {
            Object a2 = mo1304a(c5303j, c5347g);
            if (i >= a.length) {
                a = o.m4009a(a);
                i = 0;
            }
            int i2 = i + 1;
            a[i] = a2;
            if (c5303j.nextToken() == C1380m.END_ARRAY) {
                return o.m4010a(a, i2);
            }
            i = i2;
        }
    }

    public final C1507k<?> mo2801a(C5347g c5347g, C1446d c1446d) {
        return (this.f17649e == null && this.f17650f == null && this.f17647c == null && this.f17648d == null && getClass() == ai.class) ? C6472a.f17644a : this;
    }

    public final Object mo1304a(C5303j c5303j, C5347g c5347g) {
        Object obj = null;
        switch (c5303j.getCurrentTokenId()) {
            case 1:
            case 2:
            case 5:
                if (this.f17647c != null) {
                    return this.f17647c.mo1304a(c5303j, c5347g);
                }
                C1380m currentToken = c5303j.getCurrentToken();
                if (currentToken == C1380m.START_OBJECT) {
                    obj = c5303j.nextFieldName();
                } else if (currentToken == C1380m.FIELD_NAME) {
                    obj = c5303j.getCurrentName();
                } else if (currentToken != C1380m.END_OBJECT) {
                    throw c5347g.m11440a(mo1307a(), c5303j.getCurrentToken());
                }
                if (obj == null) {
                    return new LinkedHashMap(2);
                }
                c5303j.nextToken();
                Object a = mo1304a(c5303j, c5347g);
                String nextFieldName = c5303j.nextFieldName();
                LinkedHashMap linkedHashMap;
                if (nextFieldName == null) {
                    linkedHashMap = new LinkedHashMap(2);
                    linkedHashMap.put(obj, a);
                    return linkedHashMap;
                }
                c5303j.nextToken();
                Object a2 = mo1304a(c5303j, c5347g);
                Object nextFieldName2 = c5303j.nextFieldName();
                if (nextFieldName2 == null) {
                    linkedHashMap = new LinkedHashMap(4);
                    linkedHashMap.put(obj, a);
                    linkedHashMap.put(nextFieldName, a2);
                    return linkedHashMap;
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.put(obj, a);
                linkedHashMap2.put(nextFieldName, a2);
                do {
                    c5303j.nextToken();
                    linkedHashMap2.put(nextFieldName2, mo1304a(c5303j, c5347g));
                    nextFieldName2 = c5303j.nextFieldName();
                } while (nextFieldName2 != null);
                return linkedHashMap2;
            case 3:
                return c5347g.m11452a(C5348h.USE_JAVA_ARRAY_FOR_JSON_ARRAY) ? m15434d(c5303j, c5347g) : this.f17648d != null ? this.f17648d.mo1304a(c5303j, c5347g) : m15433c(c5303j, c5347g);
            case 6:
                return this.f17649e != null ? this.f17649e.mo1304a(c5303j, c5347g) : c5303j.getText();
            case 7:
                return this.f17650f != null ? this.f17650f.mo1304a(c5303j, c5347g) : c5347g.m11451a(x) ? C5320x.m11169z(c5303j, c5347g) : c5303j.getNumberValue();
            case 8:
                return this.f17650f != null ? this.f17650f.mo1304a(c5303j, c5347g) : c5347g.m11452a(C5348h.USE_BIG_DECIMAL_FOR_FLOATS) ? c5303j.getDecimalValue() : Double.valueOf(c5303j.getDoubleValue());
            case 9:
                return Boolean.TRUE;
            case 10:
                return Boolean.FALSE;
            case 11:
                return null;
            case 12:
                return c5303j.getEmbeddedObject();
            default:
                throw c5347g.m11457b(Object.class);
        }
    }

    public final Object mo1308a(C5303j c5303j, C5347g c5347g, C1475c c1475c) {
        int currentTokenId = c5303j.getCurrentTokenId();
        if (!(currentTokenId == 1 || currentTokenId == 3)) {
            switch (currentTokenId) {
                case 5:
                    break;
                case 6:
                    return this.f17649e != null ? this.f17649e.mo1304a(c5303j, c5347g) : c5303j.getText();
                case 7:
                    return this.f17650f != null ? this.f17650f.mo1304a(c5303j, c5347g) : c5347g.m11451a(x) ? C5320x.m11169z(c5303j, c5347g) : c5303j.getNumberValue();
                case 8:
                    return this.f17650f != null ? this.f17650f.mo1304a(c5303j, c5347g) : c5347g.m11452a(C5348h.USE_BIG_DECIMAL_FOR_FLOATS) ? c5303j.getDecimalValue() : Double.valueOf(c5303j.getDoubleValue());
                case 9:
                    return Boolean.TRUE;
                case 10:
                    return Boolean.FALSE;
                case 11:
                    return null;
                case 12:
                    return c5303j.getEmbeddedObject();
                default:
                    throw c5347g.m11457b(Object.class);
            }
        }
        return c1475c.mo2899d(c5303j, c5347g);
    }

    public final boolean mo1311b() {
        return true;
    }

    public final void mo2802c(C5347g c5347g) {
        C5354j a = c5347g.m11435a(Object.class);
        C5354j a2 = c5347g.m11435a(String.class);
        C1513m b = c5347g.mo1297b();
        this.f17648d = this.f17651g == null ? ai.m15432a(c5347g.m11436a(b.m3921a(List.class, a))) : c5347g.m11436a(this.f17651g);
        this.f17647c = this.f17652h == null ? ai.m15432a(c5347g.m11436a(b.m3923a(Map.class, a2, a))) : c5347g.m11436a(this.f17652h);
        this.f17649e = ai.m15432a(c5347g.m11436a(a2));
        this.f17650f = ai.m15432a(c5347g.m11436a(b.m3927b((Type) Number.class)));
        a = C1513m.m3911b();
        this.f17647c = c5347g.m11455b(this.f17647c, null, a);
        this.f17648d = c5347g.m11455b(this.f17648d, null, a);
        this.f17649e = c5347g.m11455b(this.f17649e, null, a);
        this.f17650f = c5347g.m11455b(this.f17650f, null, a);
    }
}
