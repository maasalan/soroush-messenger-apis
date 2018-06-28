package com.p111d.p112a.p121c.p134k.p136b;

import com.p111d.p112a.p113a.C1320j.C1316a;
import com.p111d.p112a.p113a.C1320j.C1319d;
import com.p111d.p112a.p114b.C5301g;
import com.p111d.p112a.p121c.C1446d;
import com.p111d.p112a.p121c.C1545o;
import com.p111d.p112a.p121c.C5308b;
import com.p111d.p112a.p121c.C5354j;
import com.p111d.p112a.p121c.C5387z;
import com.p111d.p112a.p121c.C6524m;
import com.p111d.p112a.p121c.aa;
import com.p111d.p112a.p121c.p122a.C1387a;
import com.p111d.p112a.p121c.p128f.C1449a;
import com.p111d.p112a.p121c.p129g.C5345c;
import com.p111d.p112a.p121c.p130h.C1468a;
import com.p111d.p112a.p121c.p130h.C1470c;
import com.p111d.p112a.p121c.p131i.C1478f;
import com.p111d.p112a.p121c.p134k.C1498j;
import com.p111d.p112a.p121c.p134k.C6519i;
import com.p111d.p112a.p121c.p134k.p135a.C1486k;
import com.p111d.p112a.p121c.p134k.p135a.C1486k.C1484d;
import com.p111d.p112a.p121c.p134k.p135a.C1486k.C5357b;
import com.p111d.p112a.p121c.p137l.C7122a;
import java.lang.reflect.Type;

@C1387a
public final class C7303z extends C7102a<Object[]> implements C1498j {
    protected final boolean f21043a;
    protected final C5354j f21044b;
    protected final C1478f f21045e;
    protected C1545o<Object> f21046f;
    protected C1486k f21047g;

    public C7303z(C5354j c5354j, boolean z, C1478f c1478f, C1545o<Object> c1545o) {
        super(Object[].class);
        this.f21044b = c5354j;
        this.f21043a = z;
        this.f21045e = c1478f;
        this.f21047g = C5357b.f14921b;
        this.f21046f = c1545o;
    }

    private C7303z(C7303z c7303z, C1446d c1446d, C1478f c1478f, C1545o<?> c1545o, Boolean bool) {
        super(c7303z, c1446d, bool);
        this.f21044b = c7303z.f21044b;
        this.f21045e = c1478f;
        this.f21043a = c7303z.f21043a;
        this.f21047g = c7303z.f21047g;
        this.f21046f = c1545o;
    }

    private C1545o<Object> m19490a(C1486k c1486k, Class<?> cls, aa aaVar) {
        C1484d a = c1486k.m3823a((Class) cls, aaVar, this.c);
        if (c1486k != a.f4636b) {
            this.f21047g = a.f4636b;
        }
        return a.f4635a;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m19491a(java.lang.Object[] r8, com.p111d.p112a.p114b.C5301g r9, com.p111d.p112a.p121c.aa r10) {
        /*
        r7 = this;
        r0 = r8.length;
        if (r0 != 0) goto L_0x0004;
    L_0x0003:
        return;
    L_0x0004:
        r1 = r7.f21046f;
        r2 = 0;
        r3 = 0;
        if (r1 == 0) goto L_0x0048;
    L_0x000a:
        r0 = r7.f21046f;
        r1 = r8.length;
        r4 = r7.f21045e;
    L_0x000f:
        if (r3 >= r1) goto L_0x0047;
    L_0x0011:
        r5 = r8[r3];	 Catch:{ IOException -> 0x0045, Exception -> 0x0028 }
        if (r5 != 0) goto L_0x001b;
    L_0x0015:
        r10.m11043a(r9);	 Catch:{ IOException -> 0x0045, Exception -> 0x0019 }
        goto L_0x0024;
    L_0x0019:
        r8 = move-exception;
        goto L_0x002a;
    L_0x001b:
        if (r4 != 0) goto L_0x0021;
    L_0x001d:
        r0.serialize(r5, r9, r10);	 Catch:{ IOException -> 0x0045, Exception -> 0x0019 }
        goto L_0x0024;
    L_0x0021:
        r0.serializeWithType(r5, r9, r10, r4);	 Catch:{ IOException -> 0x0045, Exception -> 0x0019 }
    L_0x0024:
        r3 = r3 + 1;
        r2 = r5;
        goto L_0x000f;
    L_0x0028:
        r8 = move-exception;
        r5 = r2;
    L_0x002a:
        r9 = r8 instanceof java.lang.reflect.InvocationTargetException;
        if (r9 == 0) goto L_0x0039;
    L_0x002e:
        r9 = r8.getCause();
        if (r9 == 0) goto L_0x0039;
    L_0x0034:
        r8 = r8.getCause();
        goto L_0x002a;
    L_0x0039:
        r9 = r8 instanceof java.lang.Error;
        if (r9 == 0) goto L_0x0040;
    L_0x003d:
        r8 = (java.lang.Error) r8;
        throw r8;
    L_0x0040:
        r8 = com.p111d.p112a.p121c.C5364l.m11579a(r8, r5, r3);
        throw r8;
    L_0x0045:
        r8 = move-exception;
        throw r8;
    L_0x0047:
        return;
    L_0x0048:
        r1 = r7.f21045e;
        if (r1 == 0) goto L_0x0092;
    L_0x004c:
        r0 = r8.length;
        r1 = r7.f21045e;
        r4 = r7.f21047g;	 Catch:{ IOException -> 0x0090, Exception -> 0x0073 }
    L_0x0051:
        if (r3 >= r0) goto L_0x0072;
    L_0x0053:
        r5 = r8[r3];	 Catch:{ IOException -> 0x0090, Exception -> 0x0073 }
        if (r5 != 0) goto L_0x005d;
    L_0x0057:
        r10.m11043a(r9);	 Catch:{ IOException -> 0x0090, Exception -> 0x005b }
        goto L_0x006e;
    L_0x005b:
        r8 = move-exception;
        goto L_0x0075;
    L_0x005d:
        r2 = r5.getClass();	 Catch:{ IOException -> 0x0090, Exception -> 0x005b }
        r6 = r4.mo1460a(r2);	 Catch:{ IOException -> 0x0090, Exception -> 0x005b }
        if (r6 != 0) goto L_0x006b;
    L_0x0067:
        r6 = r7.m19490a(r4, r2, r10);	 Catch:{ IOException -> 0x0090, Exception -> 0x005b }
    L_0x006b:
        r6.serializeWithType(r5, r9, r10, r1);	 Catch:{ IOException -> 0x0090, Exception -> 0x005b }
    L_0x006e:
        r3 = r3 + 1;
        r2 = r5;
        goto L_0x0051;
    L_0x0072:
        return;
    L_0x0073:
        r8 = move-exception;
        r5 = r2;
    L_0x0075:
        r9 = r8 instanceof java.lang.reflect.InvocationTargetException;
        if (r9 == 0) goto L_0x0084;
    L_0x0079:
        r9 = r8.getCause();
        if (r9 == 0) goto L_0x0084;
    L_0x007f:
        r8 = r8.getCause();
        goto L_0x0075;
    L_0x0084:
        r9 = r8 instanceof java.lang.Error;
        if (r9 == 0) goto L_0x008b;
    L_0x0088:
        r8 = (java.lang.Error) r8;
        throw r8;
    L_0x008b:
        r8 = com.p111d.p112a.p121c.C5364l.m11579a(r8, r5, r3);
        throw r8;
    L_0x0090:
        r8 = move-exception;
        throw r8;
    L_0x0092:
        r1 = r7.f21047g;	 Catch:{ IOException -> 0x00f2, Exception -> 0x00d5 }
    L_0x0094:
        if (r3 >= r0) goto L_0x00d4;
    L_0x0096:
        r4 = r8[r3];	 Catch:{ IOException -> 0x00f2, Exception -> 0x00d5 }
        if (r4 != 0) goto L_0x00a0;
    L_0x009a:
        r10.m11043a(r9);	 Catch:{ IOException -> 0x00f2, Exception -> 0x009e }
        goto L_0x00d0;
    L_0x009e:
        r8 = move-exception;
        goto L_0x00d7;
    L_0x00a0:
        r2 = r4.getClass();	 Catch:{ IOException -> 0x00f2, Exception -> 0x009e }
        r5 = r1.mo1460a(r2);	 Catch:{ IOException -> 0x00f2, Exception -> 0x009e }
        if (r5 != 0) goto L_0x00cd;
    L_0x00aa:
        r5 = r7.f21044b;	 Catch:{ IOException -> 0x00f2, Exception -> 0x009e }
        r5 = r5.mo3392s();	 Catch:{ IOException -> 0x00f2, Exception -> 0x009e }
        if (r5 == 0) goto L_0x00c9;
    L_0x00b2:
        r5 = r7.f21044b;	 Catch:{ IOException -> 0x00f2, Exception -> 0x009e }
        r2 = r10.m3650a(r5, r2);	 Catch:{ IOException -> 0x00f2, Exception -> 0x009e }
        r5 = r7.c;	 Catch:{ IOException -> 0x00f2, Exception -> 0x009e }
        r2 = r1.m3822a(r2, r10, r5);	 Catch:{ IOException -> 0x00f2, Exception -> 0x009e }
        r5 = r2.f4636b;	 Catch:{ IOException -> 0x00f2, Exception -> 0x009e }
        if (r1 == r5) goto L_0x00c6;
    L_0x00c2:
        r5 = r2.f4636b;	 Catch:{ IOException -> 0x00f2, Exception -> 0x009e }
        r7.f21047g = r5;	 Catch:{ IOException -> 0x00f2, Exception -> 0x009e }
    L_0x00c6:
        r5 = r2.f4635a;	 Catch:{ IOException -> 0x00f2, Exception -> 0x009e }
        goto L_0x00cd;
    L_0x00c9:
        r5 = r7.m19490a(r1, r2, r10);	 Catch:{ IOException -> 0x00f2, Exception -> 0x009e }
    L_0x00cd:
        r5.serialize(r4, r9, r10);	 Catch:{ IOException -> 0x00f2, Exception -> 0x009e }
    L_0x00d0:
        r3 = r3 + 1;
        r2 = r4;
        goto L_0x0094;
    L_0x00d4:
        return;
    L_0x00d5:
        r8 = move-exception;
        r4 = r2;
    L_0x00d7:
        r9 = r8 instanceof java.lang.reflect.InvocationTargetException;
        if (r9 == 0) goto L_0x00e6;
    L_0x00db:
        r9 = r8.getCause();
        if (r9 == 0) goto L_0x00e6;
    L_0x00e1:
        r8 = r8.getCause();
        goto L_0x00d7;
    L_0x00e6:
        r9 = r8 instanceof java.lang.Error;
        if (r9 == 0) goto L_0x00ed;
    L_0x00ea:
        r8 = (java.lang.Error) r8;
        throw r8;
    L_0x00ed:
        r8 = com.p111d.p112a.p121c.C5364l.m11579a(r8, r4, r3);
        throw r8;
    L_0x00f2:
        r8 = move-exception;
        throw r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.d.a.c.k.b.z.a(java.lang.Object[], com.d.a.b.g, com.d.a.c.aa):void");
    }

    public final C6519i<?> mo3373a(C1478f c1478f) {
        return new C7303z(this.f21044b, this.f21043a, c1478f, this.f21046f);
    }

    public final C1545o<?> mo2917a(aa aaVar, C1446d c1446d) {
        C1545o c;
        Boolean bool;
        C1545o b;
        C1545o c1545o;
        C1478f c1478f = this.f21045e;
        if (c1478f != null) {
            c1478f = c1478f.mo2901a(c1446d);
        }
        C1478f c1478f2 = c1478f;
        Boolean bool2 = null;
        if (c1446d != null) {
            C1319d a;
            C1449a c2 = c1446d.mo1354c();
            C5308b d = aaVar.m11059d();
            if (c2 != null) {
                Object findContentSerializer = d.findContentSerializer(c2);
                if (findContentSerializer != null) {
                    c = aaVar.mo2929c(findContentSerializer);
                    a = c1446d.mo1349a(aaVar.m11058c());
                    if (a != null) {
                        bool2 = a.m3114a(C1316a.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED);
                    }
                    bool = bool2;
                }
            }
            c = null;
            a = c1446d.mo1349a(aaVar.m11058c());
            if (a != null) {
                bool2 = a.m3114a(C1316a.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED);
            }
            bool = bool2;
        } else {
            c = null;
            bool = c;
        }
        if (c == null) {
            c = this.f21046f;
        }
        C1545o findConvertingContentSerializer = findConvertingContentSerializer(aaVar, c1446d, c);
        if (findConvertingContentSerializer != null) {
            b = aaVar.m11049b(findConvertingContentSerializer, c1446d);
        } else if (this.f21044b == null || !this.f21043a || this.f21044b.m11543q()) {
            c1545o = findConvertingContentSerializer;
            return (this.c != c1446d && c1545o == this.f21046f && this.f21045e == c1478f2 && this.d == bool) ? this : new C7303z(this, c1446d, c1478f2, c1545o, bool);
        } else {
            b = aaVar.m11037a(this.f21044b, c1446d);
        }
        c1545o = b;
        if (this.c != c1446d) {
        }
    }

    public final C1545o<?> mo3541a(C1446d c1446d, Boolean bool) {
        return new C7303z(this, c1446d, this.f21045e, this.f21046f, bool);
    }

    public final void acceptJsonFormatVisitor(C5345c c5345c, C5354j c5354j) {
    }

    public final C6524m getSchema(aa aaVar, Type type) {
        C6524m createSchemaNode = createSchemaNode("array", true);
        if (type != null) {
            C5354j a = aaVar.m3651a(type);
            if (a.mo3390i()) {
                Class e = ((C7122a) a).mo3394u().m11531e();
                if (e == Object.class) {
                    createSchemaNode.m19722a("items", C1468a.m3757a());
                    return createSchemaNode;
                }
                C1545o a2 = aaVar.m11041a(e, this.c);
                createSchemaNode.m19722a("items", a2 instanceof C1470c ? ((C1470c) a2).getSchema(aaVar, null) : C1468a.m3757a());
            }
        }
        return createSchemaNode;
    }

    public final /* bridge */ /* synthetic */ boolean isEmpty(aa aaVar, Object obj) {
        Object[] objArr = (Object[]) obj;
        if (objArr != null) {
            if (objArr.length != 0) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ void serialize(Object obj, C5301g c5301g, aa aaVar) {
        Object[] objArr = (Object[]) obj;
        int length = objArr.length;
        if (length == 1 && ((this.d == null && aaVar.m11046a(C5387z.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) || this.d == Boolean.TRUE)) {
            m19491a(objArr, c5301g, aaVar);
            return;
        }
        c5301g.writeStartArray(length);
        m19491a(objArr, c5301g, aaVar);
        c5301g.writeEndArray();
    }
}
