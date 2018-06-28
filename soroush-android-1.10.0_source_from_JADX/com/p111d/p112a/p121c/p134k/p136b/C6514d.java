package com.p111d.p112a.p121c.p134k.p136b;

import com.p111d.p112a.p113a.C1320j.C1318c;
import com.p111d.p112a.p113a.C1320j.C1319d;
import com.p111d.p112a.p113a.af;
import com.p111d.p112a.p113a.ag.C6463c;
import com.p111d.p112a.p114b.C5301g;
import com.p111d.p112a.p121c.C1446d;
import com.p111d.p112a.p121c.C1545o;
import com.p111d.p112a.p121c.C1549v;
import com.p111d.p112a.p121c.C5308b;
import com.p111d.p112a.p121c.C5354j;
import com.p111d.p112a.p121c.C5364l;
import com.p111d.p112a.p121c.C5364l.C7122a;
import com.p111d.p112a.p121c.C6524m;
import com.p111d.p112a.p121c.C7128y;
import com.p111d.p112a.p121c.aa;
import com.p111d.p112a.p121c.p128f.C1449a;
import com.p111d.p112a.p121c.p128f.C1457t;
import com.p111d.p112a.p121c.p128f.C5328e;
import com.p111d.p112a.p121c.p129g.C5345c;
import com.p111d.p112a.p121c.p129g.C5346d;
import com.p111d.p112a.p121c.p130h.C1469b;
import com.p111d.p112a.p121c.p130h.C1470c;
import com.p111d.p112a.p121c.p131i.C1478f;
import com.p111d.p112a.p121c.p133j.C7415o;
import com.p111d.p112a.p121c.p134k.C1496f;
import com.p111d.p112a.p121c.p134k.C1498j;
import com.p111d.p112a.p121c.p134k.C1502n;
import com.p111d.p112a.p121c.p134k.C1503p;
import com.p111d.p112a.p121c.p134k.C5355a;
import com.p111d.p112a.p121c.p134k.C6519i;
import com.p111d.p112a.p121c.p134k.C6521o;
import com.p111d.p112a.p121c.p134k.C7119d;
import com.p111d.p112a.p121c.p134k.p135a.C1483i;
import com.p111d.p112a.p121c.p134k.p135a.C1489t;
import com.p111d.p112a.p121c.p134k.p135a.C7098j;
import com.p111d.p112a.p121c.p137l.C1513m;
import com.p111d.p112a.p121c.p138m.C1519b;
import com.p111d.p112a.p121c.p138m.C1529i;
import com.p111d.p112a.p121c.p138m.C1534n;
import java.io.Closeable;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import org.jivesoftware.smackx.jiveproperties.packet.JivePropertiesExtension;
import org.jivesoftware.smackx.message_correct.element.MessageCorrectExtension;

public abstract class C6514d extends al<Object> implements C1470c, C1498j, C1503p {
    protected static final C1549v f17753b = new C1549v("#object-ref");
    protected static final C7119d[] f17754c = new C7119d[0];
    protected final C7119d[] f17755d;
    protected final C7119d[] f17756e;
    protected final C5355a f17757f;
    protected final Object f17758g;
    protected final C5328e f17759h;
    protected final C1483i f17760i;
    protected final C1318c f17761j;

    protected C6514d(C5354j c5354j, C1496f c1496f, C7119d[] c7119dArr, C7119d[] c7119dArr2) {
        super(c5354j);
        this.f17755d = c7119dArr;
        this.f17756e = c7119dArr2;
        C1318c c1318c = null;
        if (c1496f == null) {
            this.f17759h = null;
            this.f17757f = null;
            this.f17758g = null;
            this.f17760i = null;
        } else {
            this.f17759h = c1496f.m3857e();
            this.f17757f = c1496f.m3855c();
            this.f17758g = c1496f.m3856d();
            this.f17760i = c1496f.m3858f();
            C1319d p = c1496f.m3846a().mo1386p();
            if (p != null) {
                c1318c = p.f4140b;
            }
        }
        this.f17761j = c1318c;
    }

    protected C6514d(C6514d c6514d, C1483i c1483i) {
        this(c6514d, c1483i, c6514d.f17758g);
    }

    protected C6514d(C6514d c6514d, C1483i c1483i, Object obj) {
        super(c6514d._handledType);
        this.f17755d = c6514d.f17755d;
        this.f17756e = c6514d.f17756e;
        this.f17759h = c6514d.f17759h;
        this.f17757f = c6514d.f17757f;
        this.f17760i = c1483i;
        this.f17758g = obj;
        this.f17761j = c6514d.f17761j;
    }

    protected C6514d(C6514d c6514d, C1534n c1534n) {
        this(c6514d, C6514d.m15701a(c6514d.f17755d, c1534n), C6514d.m15701a(c6514d.f17756e, c1534n));
    }

    private C6514d(C6514d c6514d, C7119d[] c7119dArr, C7119d[] c7119dArr2) {
        super(c6514d._handledType);
        this.f17755d = c7119dArr;
        this.f17756e = c7119dArr2;
        this.f17759h = c6514d.f17759h;
        this.f17757f = c6514d.f17757f;
        this.f17760i = c6514d.f17760i;
        this.f17758g = c6514d.f17758g;
        this.f17761j = c6514d.f17761j;
    }

    protected C6514d(C6514d c6514d, String[] strArr) {
        super(c6514d._handledType);
        HashSet a = C1519b.m3936a(strArr);
        C7119d[] c7119dArr = c6514d.f17755d;
        C7119d[] c7119dArr2 = c6514d.f17756e;
        C7119d[] c7119dArr3 = null;
        int length = c7119dArr.length;
        ArrayList arrayList = new ArrayList(length);
        ArrayList arrayList2 = c7119dArr2 == null ? null : new ArrayList(length);
        for (int i = 0; i < length; i++) {
            C7119d c7119d = c7119dArr[i];
            if (!a.contains(c7119d.m18635e())) {
                arrayList.add(c7119d);
                if (c7119dArr2 != null) {
                    arrayList2.add(c7119dArr2[i]);
                }
            }
        }
        this.f17755d = (C7119d[]) arrayList.toArray(new C7119d[arrayList.size()]);
        if (arrayList2 != null) {
            c7119dArr3 = (C7119d[]) arrayList2.toArray(new C7119d[arrayList2.size()]);
        }
        this.f17756e = c7119dArr3;
        this.f17759h = c6514d.f17759h;
        this.f17757f = c6514d.f17757f;
        this.f17760i = c6514d.f17760i;
        this.f17758g = c6514d.f17758g;
        this.f17761j = c6514d.f17761j;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final com.p111d.p112a.p121c.p134k.C7119d[] m15701a(com.p111d.p112a.p121c.p134k.C7119d[] r4, com.p111d.p112a.p121c.p138m.C1534n r5) {
        /*
        if (r4 == 0) goto L_0x0020;
    L_0x0002:
        r0 = r4.length;
        if (r0 == 0) goto L_0x0020;
    L_0x0005:
        if (r5 == 0) goto L_0x0020;
    L_0x0007:
        r0 = com.p111d.p112a.p121c.p138m.C1534n.f4779a;
        if (r5 != r0) goto L_0x000c;
    L_0x000b:
        return r4;
    L_0x000c:
        r0 = r4.length;
        r1 = new com.p111d.p112a.p121c.p134k.C7119d[r0];
        r2 = 0;
    L_0x0010:
        if (r2 >= r0) goto L_0x001f;
    L_0x0012:
        r3 = r4[r2];
        if (r3 == 0) goto L_0x001c;
    L_0x0016:
        r3 = r3.mo3535a(r5);
        r1[r2] = r3;
    L_0x001c:
        r2 = r2 + 1;
        goto L_0x0010;
    L_0x001f:
        return r1;
    L_0x0020:
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.d.a.c.k.b.d.a(com.d.a.c.k.d[], com.d.a.c.m.n):com.d.a.c.k.d[]");
    }

    public abstract C6514d mo3366a();

    public abstract C6514d mo3367a(C1483i c1483i);

    public abstract C6514d mo3368a(Object obj);

    public abstract C6514d mo3369a(String[] strArr);

    public final C1545o<?> mo2917a(aa aaVar, C1446d c1446d) {
        C1449a c;
        C7128y c2;
        C1319d findFormat;
        C1318c c1318c;
        C1483i c1483i;
        String[] findPropertiesToIgnore;
        C1457t findObjectIdInfo;
        C1457t findObjectReferenceInfo;
        Type c3;
        C5354j a;
        String b;
        int length;
        int i;
        C7119d c7119d;
        C7119d c7119d2;
        StringBuilder stringBuilder;
        C1483i c1483i2;
        boolean e;
        C1483i c1483i3;
        Object findFilterId;
        C1545o<?> a2;
        C5308b d = aaVar.m11059d();
        Object obj = null;
        if (c1446d != null) {
            if (d != null) {
                c = c1446d.mo1354c();
                c2 = aaVar.m11058c();
                if (c != null) {
                    findFormat = d.findFormat(c);
                    if (findFormat != null) {
                        c1318c = findFormat.f4140b;
                        if (c1318c != this.f17761j && this._handledType.isEnum()) {
                            switch (c1318c) {
                                case STRING:
                                case NUMBER:
                                case NUMBER_INT:
                                    c2.m11081c(this._handledType);
                                    return aaVar.m11039a(C7110m.m18588a(this._handledType, aaVar.m11058c(), findFormat), c1446d);
                                default:
                                    break;
                            }
                        }
                        c1483i = this.f17760i;
                        if (c == null) {
                            findPropertiesToIgnore = d.findPropertiesToIgnore(c, true);
                            findObjectIdInfo = d.findObjectIdInfo(c);
                            if (findObjectIdInfo != null) {
                                findObjectReferenceInfo = d.findObjectReferenceInfo(c, findObjectIdInfo);
                                c3 = findObjectReferenceInfo.m3707c();
                                a = aaVar.m3651a(c3);
                                aaVar.mo1297b();
                                a = C1513m.m3916c(a, af.class)[0];
                                if (c3 != C6463c.class) {
                                    b = findObjectReferenceInfo.m3705a().m4060b();
                                    length = this.f17755d.length;
                                    i = 0;
                                    while (i != length) {
                                        c7119d = this.f17755d[i];
                                        if (b.equals(c7119d.m18635e())) {
                                            i++;
                                        } else {
                                            if (i > 0) {
                                                System.arraycopy(this.f17755d, 0, this.f17755d, 1, i);
                                                this.f17755d[0] = c7119d;
                                                if (this.f17756e != null) {
                                                    c7119d2 = this.f17756e[i];
                                                    System.arraycopy(this.f17756e, 0, this.f17756e, 1, i);
                                                    this.f17756e[0] = c7119d2;
                                                }
                                            }
                                            c1483i = C1483i.m3821a(c7119d.mo1350a(), null, new C7098j(findObjectReferenceInfo, c7119d), findObjectReferenceInfo.m3709e());
                                        }
                                    }
                                    stringBuilder = new StringBuilder("Invalid Object Id definition for ");
                                    stringBuilder.append(this._handledType.getName());
                                    stringBuilder.append(": can not find property with name '");
                                    stringBuilder.append(b);
                                    stringBuilder.append("'");
                                    throw new IllegalArgumentException(stringBuilder.toString());
                                }
                                c1483i = C1483i.m3821a(a, findObjectReferenceInfo.m3705a(), aaVar.m3648a(findObjectReferenceInfo), findObjectReferenceInfo.m3709e());
                            } else if (c1483i != null) {
                                findObjectReferenceInfo = d.findObjectReferenceInfo(c, new C1457t(f17753b, null, null, null));
                                c1483i2 = this.f17760i;
                                e = findObjectReferenceInfo.m3709e();
                                if (e != c1483i2.f4634e) {
                                    c1483i = c1483i2;
                                } else {
                                    c1483i3 = new C1483i(c1483i2.f4630a, c1483i2.f4631b, c1483i2.f4632c, c1483i2.f4633d, e);
                                }
                            }
                            findFilterId = d.findFilterId(c);
                            if (findFilterId != null && (this.f17758g == null || !findFilterId.equals(this.f17758g))) {
                                obj = findFilterId;
                            }
                        } else {
                            findPropertiesToIgnore = null;
                        }
                        if (c1483i != null) {
                            c1483i3 = new C1483i(c1483i.f4630a, c1483i.f4631b, c1483i.f4632c, aaVar.m11037a(c1483i.f4630a, c1446d), c1483i.f4634e);
                            if (c1483i3 != this.f17760i) {
                                a2 = mo3367a(c1483i3);
                                if (!(findPropertiesToIgnore == null || findPropertiesToIgnore.length == 0)) {
                                    a2 = a2.mo3369a(findPropertiesToIgnore);
                                }
                                if (obj != null) {
                                    a2 = a2.mo3368a(obj);
                                }
                                if (c1318c == null) {
                                    c1318c = this.f17761j;
                                }
                                if (c1318c == C1318c.ARRAY) {
                                    a2 = a2.mo3366a();
                                }
                                return a2;
                            }
                        }
                        a2 = this;
                        a2 = a2.mo3369a(findPropertiesToIgnore);
                        if (obj != null) {
                            a2 = a2.mo3368a(obj);
                        }
                        if (c1318c == null) {
                            c1318c = this.f17761j;
                        }
                        if (c1318c == C1318c.ARRAY) {
                            a2 = a2.mo3366a();
                        }
                        return a2;
                    }
                }
                c1318c = null;
                c1483i = this.f17760i;
                if (c == null) {
                    findPropertiesToIgnore = null;
                } else {
                    findPropertiesToIgnore = d.findPropertiesToIgnore(c, true);
                    findObjectIdInfo = d.findObjectIdInfo(c);
                    if (findObjectIdInfo != null) {
                        findObjectReferenceInfo = d.findObjectReferenceInfo(c, findObjectIdInfo);
                        c3 = findObjectReferenceInfo.m3707c();
                        a = aaVar.m3651a(c3);
                        aaVar.mo1297b();
                        a = C1513m.m3916c(a, af.class)[0];
                        if (c3 != C6463c.class) {
                            c1483i = C1483i.m3821a(a, findObjectReferenceInfo.m3705a(), aaVar.m3648a(findObjectReferenceInfo), findObjectReferenceInfo.m3709e());
                        } else {
                            b = findObjectReferenceInfo.m3705a().m4060b();
                            length = this.f17755d.length;
                            i = 0;
                            while (i != length) {
                                c7119d = this.f17755d[i];
                                if (b.equals(c7119d.m18635e())) {
                                    i++;
                                } else {
                                    if (i > 0) {
                                        System.arraycopy(this.f17755d, 0, this.f17755d, 1, i);
                                        this.f17755d[0] = c7119d;
                                        if (this.f17756e != null) {
                                            c7119d2 = this.f17756e[i];
                                            System.arraycopy(this.f17756e, 0, this.f17756e, 1, i);
                                            this.f17756e[0] = c7119d2;
                                        }
                                    }
                                    c1483i = C1483i.m3821a(c7119d.mo1350a(), null, new C7098j(findObjectReferenceInfo, c7119d), findObjectReferenceInfo.m3709e());
                                }
                            }
                            stringBuilder = new StringBuilder("Invalid Object Id definition for ");
                            stringBuilder.append(this._handledType.getName());
                            stringBuilder.append(": can not find property with name '");
                            stringBuilder.append(b);
                            stringBuilder.append("'");
                            throw new IllegalArgumentException(stringBuilder.toString());
                        }
                    } else if (c1483i != null) {
                        findObjectReferenceInfo = d.findObjectReferenceInfo(c, new C1457t(f17753b, null, null, null));
                        c1483i2 = this.f17760i;
                        e = findObjectReferenceInfo.m3709e();
                        if (e != c1483i2.f4634e) {
                            c1483i3 = new C1483i(c1483i2.f4630a, c1483i2.f4631b, c1483i2.f4632c, c1483i2.f4633d, e);
                        } else {
                            c1483i = c1483i2;
                        }
                    }
                    findFilterId = d.findFilterId(c);
                    obj = findFilterId;
                }
                if (c1483i != null) {
                    c1483i3 = new C1483i(c1483i.f4630a, c1483i.f4631b, c1483i.f4632c, aaVar.m11037a(c1483i.f4630a, c1446d), c1483i.f4634e);
                    if (c1483i3 != this.f17760i) {
                        a2 = mo3367a(c1483i3);
                        a2 = a2.mo3369a(findPropertiesToIgnore);
                        if (obj != null) {
                            a2 = a2.mo3368a(obj);
                        }
                        if (c1318c == null) {
                            c1318c = this.f17761j;
                        }
                        if (c1318c == C1318c.ARRAY) {
                            a2 = a2.mo3366a();
                        }
                        return a2;
                    }
                }
                a2 = this;
                a2 = a2.mo3369a(findPropertiesToIgnore);
                if (obj != null) {
                    a2 = a2.mo3368a(obj);
                }
                if (c1318c == null) {
                    c1318c = this.f17761j;
                }
                if (c1318c == C1318c.ARRAY) {
                    a2 = a2.mo3366a();
                }
                return a2;
            }
        }
        c = null;
        c2 = aaVar.m11058c();
        if (c != null) {
            findFormat = d.findFormat(c);
            if (findFormat != null) {
                c1318c = findFormat.f4140b;
                switch (c1318c) {
                    case STRING:
                    case NUMBER:
                    case NUMBER_INT:
                        c2.m11081c(this._handledType);
                        return aaVar.m11039a(C7110m.m18588a(this._handledType, aaVar.m11058c(), findFormat), c1446d);
                    default:
                        break;
                }
                c1483i = this.f17760i;
                if (c == null) {
                    findPropertiesToIgnore = d.findPropertiesToIgnore(c, true);
                    findObjectIdInfo = d.findObjectIdInfo(c);
                    if (findObjectIdInfo != null) {
                        findObjectReferenceInfo = d.findObjectReferenceInfo(c, findObjectIdInfo);
                        c3 = findObjectReferenceInfo.m3707c();
                        a = aaVar.m3651a(c3);
                        aaVar.mo1297b();
                        a = C1513m.m3916c(a, af.class)[0];
                        if (c3 != C6463c.class) {
                            b = findObjectReferenceInfo.m3705a().m4060b();
                            length = this.f17755d.length;
                            i = 0;
                            while (i != length) {
                                c7119d = this.f17755d[i];
                                if (b.equals(c7119d.m18635e())) {
                                    if (i > 0) {
                                        System.arraycopy(this.f17755d, 0, this.f17755d, 1, i);
                                        this.f17755d[0] = c7119d;
                                        if (this.f17756e != null) {
                                            c7119d2 = this.f17756e[i];
                                            System.arraycopy(this.f17756e, 0, this.f17756e, 1, i);
                                            this.f17756e[0] = c7119d2;
                                        }
                                    }
                                    c1483i = C1483i.m3821a(c7119d.mo1350a(), null, new C7098j(findObjectReferenceInfo, c7119d), findObjectReferenceInfo.m3709e());
                                } else {
                                    i++;
                                }
                            }
                            stringBuilder = new StringBuilder("Invalid Object Id definition for ");
                            stringBuilder.append(this._handledType.getName());
                            stringBuilder.append(": can not find property with name '");
                            stringBuilder.append(b);
                            stringBuilder.append("'");
                            throw new IllegalArgumentException(stringBuilder.toString());
                        }
                        c1483i = C1483i.m3821a(a, findObjectReferenceInfo.m3705a(), aaVar.m3648a(findObjectReferenceInfo), findObjectReferenceInfo.m3709e());
                    } else if (c1483i != null) {
                        findObjectReferenceInfo = d.findObjectReferenceInfo(c, new C1457t(f17753b, null, null, null));
                        c1483i2 = this.f17760i;
                        e = findObjectReferenceInfo.m3709e();
                        if (e != c1483i2.f4634e) {
                            c1483i = c1483i2;
                        } else {
                            c1483i3 = new C1483i(c1483i2.f4630a, c1483i2.f4631b, c1483i2.f4632c, c1483i2.f4633d, e);
                        }
                    }
                    findFilterId = d.findFilterId(c);
                    obj = findFilterId;
                } else {
                    findPropertiesToIgnore = null;
                }
                if (c1483i != null) {
                    c1483i3 = new C1483i(c1483i.f4630a, c1483i.f4631b, c1483i.f4632c, aaVar.m11037a(c1483i.f4630a, c1446d), c1483i.f4634e);
                    if (c1483i3 != this.f17760i) {
                        a2 = mo3367a(c1483i3);
                        a2 = a2.mo3369a(findPropertiesToIgnore);
                        if (obj != null) {
                            a2 = a2.mo3368a(obj);
                        }
                        if (c1318c == null) {
                            c1318c = this.f17761j;
                        }
                        if (c1318c == C1318c.ARRAY) {
                            a2 = a2.mo3366a();
                        }
                        return a2;
                    }
                }
                a2 = this;
                a2 = a2.mo3369a(findPropertiesToIgnore);
                if (obj != null) {
                    a2 = a2.mo3368a(obj);
                }
                if (c1318c == null) {
                    c1318c = this.f17761j;
                }
                if (c1318c == C1318c.ARRAY) {
                    a2 = a2.mo3366a();
                }
                return a2;
            }
        }
        c1318c = null;
        c1483i = this.f17760i;
        if (c == null) {
            findPropertiesToIgnore = null;
        } else {
            findPropertiesToIgnore = d.findPropertiesToIgnore(c, true);
            findObjectIdInfo = d.findObjectIdInfo(c);
            if (findObjectIdInfo != null) {
                findObjectReferenceInfo = d.findObjectReferenceInfo(c, findObjectIdInfo);
                c3 = findObjectReferenceInfo.m3707c();
                a = aaVar.m3651a(c3);
                aaVar.mo1297b();
                a = C1513m.m3916c(a, af.class)[0];
                if (c3 != C6463c.class) {
                    c1483i = C1483i.m3821a(a, findObjectReferenceInfo.m3705a(), aaVar.m3648a(findObjectReferenceInfo), findObjectReferenceInfo.m3709e());
                } else {
                    b = findObjectReferenceInfo.m3705a().m4060b();
                    length = this.f17755d.length;
                    i = 0;
                    while (i != length) {
                        c7119d = this.f17755d[i];
                        if (b.equals(c7119d.m18635e())) {
                            i++;
                        } else {
                            if (i > 0) {
                                System.arraycopy(this.f17755d, 0, this.f17755d, 1, i);
                                this.f17755d[0] = c7119d;
                                if (this.f17756e != null) {
                                    c7119d2 = this.f17756e[i];
                                    System.arraycopy(this.f17756e, 0, this.f17756e, 1, i);
                                    this.f17756e[0] = c7119d2;
                                }
                            }
                            c1483i = C1483i.m3821a(c7119d.mo1350a(), null, new C7098j(findObjectReferenceInfo, c7119d), findObjectReferenceInfo.m3709e());
                        }
                    }
                    stringBuilder = new StringBuilder("Invalid Object Id definition for ");
                    stringBuilder.append(this._handledType.getName());
                    stringBuilder.append(": can not find property with name '");
                    stringBuilder.append(b);
                    stringBuilder.append("'");
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
            } else if (c1483i != null) {
                findObjectReferenceInfo = d.findObjectReferenceInfo(c, new C1457t(f17753b, null, null, null));
                c1483i2 = this.f17760i;
                e = findObjectReferenceInfo.m3709e();
                if (e != c1483i2.f4634e) {
                    c1483i3 = new C1483i(c1483i2.f4630a, c1483i2.f4631b, c1483i2.f4632c, c1483i2.f4633d, e);
                } else {
                    c1483i = c1483i2;
                }
            }
            findFilterId = d.findFilterId(c);
            obj = findFilterId;
        }
        if (c1483i != null) {
            c1483i3 = new C1483i(c1483i.f4630a, c1483i.f4631b, c1483i.f4632c, aaVar.m11037a(c1483i.f4630a, c1446d), c1483i.f4634e);
            if (c1483i3 != this.f17760i) {
                a2 = mo3367a(c1483i3);
                a2 = a2.mo3369a(findPropertiesToIgnore);
                if (obj != null) {
                    a2 = a2.mo3368a(obj);
                }
                if (c1318c == null) {
                    c1318c = this.f17761j;
                }
                if (c1318c == C1318c.ARRAY) {
                    a2 = a2.mo3366a();
                }
                return a2;
            }
        }
        a2 = this;
        a2 = a2.mo3369a(findPropertiesToIgnore);
        if (obj != null) {
            a2 = a2.mo3368a(obj);
        }
        if (c1318c == null) {
            c1318c = this.f17761j;
        }
        if (c1318c == C1318c.ARRAY) {
            a2 = a2.mo3366a();
        }
        return a2;
    }

    public final void mo2919a(aa aaVar) {
        int i = 0;
        int length = this.f17756e == null ? 0 : this.f17756e.length;
        int length2 = this.f17755d.length;
        while (i < length2) {
            C1446d c1446d = this.f17755d[i];
            if (!(c1446d.m18639i() || c1446d.m18637g())) {
                C1545o m = aaVar.m11068m();
                if (m != null) {
                    c1446d.mo3537b(m);
                    if (i < length) {
                        C7119d c7119d = this.f17756e[i];
                        if (c7119d != null) {
                            c7119d.mo3537b(m);
                        }
                    }
                }
            }
            if (!c1446d.m18636f()) {
                C5308b d = aaVar.m11059d();
                C1545o c1545o = null;
                if (d != null) {
                    C1449a c = c1446d.mo1354c();
                    if (c != null) {
                        Object findSerializationConverter = d.findSerializationConverter(c);
                        if (findSerializationConverter != null) {
                            c1446d.mo1354c();
                            C1529i a = aaVar.m3652a(findSerializationConverter);
                            aaVar.mo1297b();
                            C5354j c2 = a.m3992c();
                            if (!c2.m11543q()) {
                                c1545o = aaVar.m11037a(c2, c1446d);
                            }
                            c1545o = new ag(a, c2, c1545o);
                        }
                    }
                }
                if (c1545o == null) {
                    C5354j j = c1446d.m18640j();
                    if (j == null) {
                        j = c1446d.mo1350a();
                        if (!j.m11539m()) {
                            if (j.mo3391n() || j.mo2935w() > 0) {
                                c1446d.m18627a(j);
                            }
                        }
                    }
                    c1545o = aaVar.m11037a(j, c1446d);
                    if (j.mo3391n()) {
                        C1478f c1478f = (C1478f) j.mo3394u().mo2931B();
                        if (c1478f != null && (c1545o instanceof C6519i)) {
                            c1545o = (C6519i) c1545o;
                            if (c1478f != null) {
                                c1545o = c1545o.mo3373a(c1478f);
                            }
                        }
                    }
                }
                c1446d.mo3536a(c1545o);
                if (i < length) {
                    C7119d c7119d2 = this.f17756e[i];
                    if (c7119d2 != null) {
                        c7119d2.mo3536a(c1545o);
                    }
                }
            }
            i++;
        }
        if (this.f17757f != null) {
            this.f17757f.m3836a(aaVar);
        }
    }

    protected final void m15708a(Object obj, C5301g c5301g, aa aaVar) {
        C7119d[] c7119dArr = (this.f17756e == null || aaVar.m11060e() == null) ? this.f17755d : this.f17756e;
        int i = 0;
        try {
            int length = c7119dArr.length;
            while (i < length) {
                C7119d c7119d = c7119dArr[i];
                if (c7119d != null) {
                    c7119d.mo3376a(obj, c5301g, aaVar);
                }
                i++;
            }
            if (this.f17757f != null) {
                this.f17757f.m3837a(obj, c5301g, aaVar);
            }
        } catch (Throwable e) {
            wrapAndThrow(aaVar, e, obj, 0 == c7119dArr.length ? "[anySetter]" : c7119dArr[0].m18635e());
        } catch (Throwable e2) {
            C5364l c5364l = new C5364l((Closeable) c5301g, "Infinite recursion (StackOverflowError)", e2);
            c5364l.m11583a(new C7122a(obj, 0 == c7119dArr.length ? "[anySetter]" : c7119dArr[0].m18635e()));
            throw c5364l;
        }
    }

    protected final void m15709a(Object obj, C5301g c5301g, aa aaVar, C1478f c1478f) {
        C1483i c1483i = this.f17760i;
        C1489t a = aaVar.mo2928a(obj, c1483i.f4632c);
        if (!a.m3834a(c5301g, aaVar, c1483i)) {
            Object a2 = a.m3833a(obj);
            if (c1483i.f4634e) {
                c1483i.f4633d.serialize(a2, c5301g, aaVar);
                return;
            }
            c1483i = this.f17760i;
            String b = this.f17759h == null ? null : m15711b(obj);
            if (b == null) {
                c1478f.mo2907b(obj, c5301g);
            } else {
                c1478f.mo2902a(c5301g, b);
            }
            a.m3835b(c5301g, aaVar, c1483i);
            if (this.f17758g != null) {
                m15712b(obj, c5301g, aaVar);
            } else {
                m15708a(obj, c5301g, aaVar);
            }
            if (b == null) {
                c1478f.mo2911e(obj, c5301g);
            } else {
                c1478f.mo2905a(obj, c5301g, b);
            }
        }
    }

    protected final void m15710a(Object obj, C5301g c5301g, aa aaVar, boolean z) {
        C1483i c1483i = this.f17760i;
        C1489t a = aaVar.mo2928a(obj, c1483i.f4632c);
        if (!a.m3834a(c5301g, aaVar, c1483i)) {
            Object a2 = a.m3833a(obj);
            if (c1483i.f4634e) {
                c1483i.f4633d.serialize(a2, c5301g, aaVar);
                return;
            }
            if (z) {
                c5301g.writeStartObject();
            }
            a.m3835b(c5301g, aaVar, c1483i);
            if (this.f17758g != null) {
                m15712b(obj, c5301g, aaVar);
            } else {
                m15708a(obj, c5301g, aaVar);
            }
            if (z) {
                c5301g.writeEndObject();
            }
        }
    }

    public void acceptJsonFormatVisitor(C5345c c5345c, C5354j c5354j) {
        if (c5345c != null) {
            C5346d b = c5345c.mo2893b();
            if (b != null) {
                aa a = c5345c.mo2892a();
                int i = 0;
                Object obj = null;
                int length;
                if (this.f17758g != null) {
                    C1502n findPropertyFilter = findPropertyFilter(c5345c.mo2892a(), this.f17758g, null);
                    length = this.f17755d.length;
                    while (i < length) {
                        findPropertyFilter.mo1461a(this.f17755d[i], b, a);
                        i++;
                    }
                    return;
                }
                if (this.f17756e != null) {
                    if (a != null) {
                        obj = a.m11060e();
                    }
                }
                C7119d[] c7119dArr = obj != null ? this.f17756e : this.f17755d;
                length = c7119dArr.length;
                while (i < length) {
                    C7119d c7119d = c7119dArr[i];
                    if (c7119d != null) {
                        c7119d.mo1351a(b, a);
                    }
                    i++;
                }
            }
        }
    }

    protected final String m15711b(Object obj) {
        obj = this.f17759h.mo2817b(obj);
        return obj == null ? "" : obj instanceof String ? (String) obj : obj.toString();
    }

    protected final void m15712b(Object obj, C5301g c5301g, aa aaVar) {
        C7119d[] c7119dArr = (this.f17756e == null || aaVar.m11060e() == null) ? this.f17755d : this.f17756e;
        C1502n findPropertyFilter = findPropertyFilter(aaVar, this.f17758g, obj);
        if (findPropertyFilter == null) {
            m15708a(obj, c5301g, aaVar);
            return;
        }
        int i = 0;
        try {
            int length = c7119dArr.length;
            while (i < length) {
                C6521o c6521o = c7119dArr[i];
                if (c6521o != null) {
                    findPropertyFilter.mo1463a(obj, c5301g, aaVar, c6521o);
                }
                i++;
            }
            if (this.f17757f != null) {
                this.f17757f.m3838a(obj, c5301g, aaVar, findPropertyFilter);
            }
        } catch (Throwable e) {
            wrapAndThrow(aaVar, e, obj, 0 == c7119dArr.length ? "[anySetter]" : c7119dArr[0].m18635e());
        } catch (Throwable e2) {
            C5364l c5364l = new C5364l((Closeable) c5301g, "Infinite recursion (StackOverflowError)", e2);
            c5364l.m11583a(new C7122a(obj, 0 == c7119dArr.length ? "[anySetter]" : c7119dArr[0].m18635e()));
            throw c5364l;
        }
    }

    @Deprecated
    public C6524m getSchema(aa aaVar, Type type) {
        C6524m createSchemaNode = createSchemaNode("object", true);
        C1469b c1469b = (C1469b) this._handledType.getAnnotation(C1469b.class);
        if (c1469b != null) {
            String a = c1469b.m3758a();
            if (a != null && a.length() > 0) {
                createSchemaNode.m19719a(MessageCorrectExtension.ID_TAG, a);
            }
        }
        C6524m g = createSchemaNode.m19407g();
        C1502n c1502n = null;
        if (this.f17758g != null) {
            c1502n = findPropertyFilter(aaVar, this.f17758g, null);
        }
        for (C6521o c6521o : this.f17755d) {
            if (c1502n == null) {
                c6521o.mo3375a((C7415o) g, aaVar);
            } else {
                c1502n.mo1462a(c6521o, (C7415o) g, aaVar);
            }
        }
        createSchemaNode.m19722a(JivePropertiesExtension.ELEMENT, g);
        return createSchemaNode;
    }

    public Iterator<C6521o> properties() {
        return Arrays.asList(this.f17755d).iterator();
    }

    public void serializeWithType(Object obj, C5301g c5301g, aa aaVar, C1478f c1478f) {
        if (this.f17760i != null) {
            c5301g.setCurrentValue(obj);
            m15709a(obj, c5301g, aaVar, c1478f);
            return;
        }
        String b = this.f17759h == null ? null : m15711b(obj);
        if (b == null) {
            c1478f.mo2907b(obj, c5301g);
        } else {
            c1478f.mo2902a(c5301g, b);
        }
        c5301g.setCurrentValue(obj);
        if (this.f17758g != null) {
            m15712b(obj, c5301g, aaVar);
        } else {
            m15708a(obj, c5301g, aaVar);
        }
        if (b == null) {
            c1478f.mo2911e(obj, c5301g);
        } else {
            c1478f.mo2905a(obj, c5301g, b);
        }
    }

    public boolean usesObjectId() {
        return this.f17760i != null;
    }

    public /* synthetic */ C1545o withFilterId(Object obj) {
        return mo3368a(obj);
    }
}
