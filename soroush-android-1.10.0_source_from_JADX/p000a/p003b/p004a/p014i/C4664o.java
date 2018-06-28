package p000a.p003b.p004a.p014i;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p000a.p003b.p004a.p010e.C0043a;

public class C4664o extends C0061g {
    static final /* synthetic */ boolean f12825b = true;
    public final List<C0043a> f12826a;

    public C4664o() {
        this(Collections.emptyList());
    }

    public C4664o(List<C0043a> list) {
        this.f12826a = Collections.unmodifiableList(list);
    }

    public static C4664o m8501a(DataInputStream dataInputStream, int i) {
        List emptyList;
        if (i == 0) {
            emptyList = Collections.emptyList();
        } else {
            List arrayList = new ArrayList(4);
            while (i > 0) {
                int readUnsignedShort = dataInputStream.readUnsignedShort();
                int readUnsignedShort2 = dataInputStream.readUnsignedShort();
                byte[] bArr = new byte[readUnsignedShort2];
                dataInputStream.read(bArr);
                arrayList.add(C0043a.m64a(readUnsignedShort, bArr));
                i -= readUnsignedShort2 + 4;
                if (!f12825b && i < 0) {
                    throw new AssertionError();
                }
            }
            emptyList = arrayList;
        }
        return new C4664o(emptyList);
    }

    protected final void mo18a(DataOutputStream dataOutputStream) {
        for (C0043a a : this.f12826a) {
            a.m66a(dataOutputStream);
        }
    }
}
