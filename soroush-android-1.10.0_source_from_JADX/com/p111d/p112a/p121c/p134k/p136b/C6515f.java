package com.p111d.p112a.p121c.p134k.p136b;

import com.p111d.p112a.p114b.C5301g;
import com.p111d.p112a.p121c.C5354j;
import com.p111d.p112a.p121c.C6524m;
import com.p111d.p112a.p121c.aa;
import com.p111d.p112a.p121c.p122a.C1387a;
import com.p111d.p112a.p121c.p129g.C1465a;
import com.p111d.p112a.p121c.p129g.C5345c;
import com.p111d.p112a.p121c.p131i.C1478f;
import java.lang.reflect.Type;

@C1387a
public final class C6515f extends al<byte[]> {
    public C6515f() {
        super(byte[].class);
    }

    public final void acceptJsonFormatVisitor(C5345c c5345c, C5354j c5354j) {
        visitArrayFormat(c5345c, c5354j, C1465a.STRING);
    }

    public final C6524m getSchema(aa aaVar, Type type) {
        return createSchemaNode("array", true).m19722a("items", createSchemaNode("string"));
    }

    public final /* bridge */ /* synthetic */ boolean isEmpty(aa aaVar, Object obj) {
        byte[] bArr = (byte[]) obj;
        if (bArr != null) {
            if (bArr.length != 0) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ void serialize(Object obj, C5301g c5301g, aa aaVar) {
        byte[] bArr = (byte[]) obj;
        c5301g.writeBinary(aaVar.m11058c().m11096t(), bArr, 0, bArr.length);
    }

    public final /* synthetic */ void serializeWithType(Object obj, C5301g c5301g, aa aaVar, C1478f c1478f) {
        obj = (byte[]) obj;
        c1478f.mo2903a(obj, c5301g);
        c5301g.writeBinary(aaVar.m11058c().m11096t(), obj, 0, obj.length);
        c1478f.mo2910d(obj, c5301g);
    }
}
