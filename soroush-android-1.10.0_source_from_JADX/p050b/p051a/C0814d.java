package p050b.p051a;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Map;

public class C0814d {
    protected C0827p f2441a;
    int f2442b;
    public byte[] f2443c;

    protected C0814d(C0827p c0827p, int i, DataInputStream dataInputStream) {
        this.f2441a = c0827p;
        this.f2442b = i;
        int readInt = dataInputStream.readInt();
        this.f2443c = new byte[readInt];
        if (readInt > 0) {
            dataInputStream.readFully(this.f2443c);
        }
    }

    protected C0814d(C0827p c0827p, int i, byte[] bArr) {
        this.f2441a = c0827p;
        this.f2442b = i;
        this.f2443c = bArr;
    }

    protected C0814d(C0827p c0827p, String str) {
        this(c0827p, str, null);
    }

    public C0814d(C0827p c0827p, String str, byte[] bArr) {
        this(c0827p, c0827p.m1883c(str), bArr);
    }

    static C0814d m1820a(C0827p c0827p, DataInputStream dataInputStream) {
        int readUnsignedShort = dataInputStream.readUnsignedShort();
        String j = c0827p.m1892j(readUnsignedShort);
        if (j.charAt(0) < 'L') {
            if (j.equals("AnnotationDefault")) {
                return new C4949b(c0827p, readUnsignedShort, dataInputStream);
            }
            if (j.equals("BootstrapMethods")) {
                return new C4953f(c0827p, readUnsignedShort, dataInputStream);
            }
            if (j.equals("Code")) {
                return new C4956l(c0827p, readUnsignedShort, dataInputStream);
            }
            if (j.equals("ConstantValue")) {
                return new C4963q(c0827p, readUnsignedShort, dataInputStream);
            }
            if (j.equals("Deprecated")) {
                return new C4964r(c0827p, readUnsignedShort, dataInputStream);
            }
            if (j.equals("EnclosingMethod")) {
                return new C4967v(c0827p, readUnsignedShort, dataInputStream);
            }
            if (j.equals("Exceptions")) {
                return new C4968y(c0827p, readUnsignedShort, dataInputStream);
            }
            if (j.equals("InnerClasses")) {
                return new ac(c0827p, readUnsignedShort, dataInputStream);
            }
        } else if (j.equals("LineNumberTable")) {
            return new ag(c0827p, readUnsignedShort, dataInputStream);
        } else {
            if (j.equals("LocalVariableTable")) {
                return new ah(c0827p, readUnsignedShort, dataInputStream);
            }
            if (j.equals("LocalVariableTypeTable")) {
                return new ai(c0827p, readUnsignedShort, dataInputStream);
            }
            if (!j.equals("RuntimeVisibleAnnotations")) {
                if (!j.equals("RuntimeInvisibleAnnotations")) {
                    if (!j.equals("RuntimeVisibleParameterAnnotations")) {
                        if (!j.equals("RuntimeInvisibleParameterAnnotations")) {
                            if (j.equals("Signature")) {
                                return new at(c0827p, readUnsignedShort, dataInputStream);
                            }
                            if (j.equals("SourceFile")) {
                                return new au(c0827p, readUnsignedShort, dataInputStream);
                            }
                            if (j.equals("Synthetic")) {
                                return new ay(c0827p, readUnsignedShort, dataInputStream);
                            }
                            if (j.equals("StackMap")) {
                                return new av(c0827p, readUnsignedShort, dataInputStream);
                            }
                            if (j.equals("StackMapTable")) {
                                return new aw(c0827p, readUnsignedShort, dataInputStream);
                            }
                        }
                    }
                    return new as(c0827p, readUnsignedShort, dataInputStream);
                }
            }
            return new C4952c(c0827p, readUnsignedShort, dataInputStream);
        }
        return new C0814d(c0827p, readUnsignedShort, dataInputStream);
    }

    static C0814d m1821a(ArrayList arrayList, String str) {
        if (arrayList == null) {
            return null;
        }
        ListIterator listIterator = arrayList.listIterator();
        while (listIterator.hasNext()) {
            C0814d c0814d = (C0814d) listIterator.next();
            if (c0814d.m1826a().equals(str)) {
                return c0814d;
            }
        }
        return null;
    }

    static ArrayList m1822a(ArrayList arrayList, C0827p c0827p) {
        if (arrayList == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList2.add(((C0814d) arrayList.get(i)).mo834a(c0827p, null));
        }
        return arrayList2;
    }

    static void m1823a(ArrayList arrayList, DataOutputStream dataOutputStream) {
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((C0814d) arrayList.get(i)).mo848a(dataOutputStream);
            }
        }
    }

    static synchronized void m1824b(ArrayList arrayList, String str) {
        synchronized (C0814d.class) {
            if (arrayList == null) {
                return;
            }
            ListIterator listIterator = arrayList.listIterator();
            while (listIterator.hasNext()) {
                if (((C0814d) listIterator.next()).m1826a().equals(str)) {
                    listIterator.remove();
                }
            }
        }
    }

    public C0814d mo834a(C0827p c0827p, Map map) {
        int length = this.f2443c.length;
        byte[] bArr = this.f2443c;
        byte[] bArr2 = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr2[i] = bArr[i];
        }
        return new C0814d(c0827p, m1826a(), bArr2);
    }

    public final String m1826a() {
        return this.f2441a.m1892j(this.f2442b);
    }

    void mo848a(DataOutputStream dataOutputStream) {
        dataOutputStream.writeShort(this.f2442b);
        dataOutputStream.writeInt(this.f2443c.length);
        if (this.f2443c.length > 0) {
            dataOutputStream.write(this.f2443c);
        }
    }

    public void mo875a(byte[] bArr) {
        this.f2443c = bArr;
    }

    public final C0827p m1829b() {
        return this.f2441a;
    }

    public int mo876c() {
        return this.f2443c.length + 6;
    }

    public byte[] mo877d() {
        return this.f2443c;
    }
}
