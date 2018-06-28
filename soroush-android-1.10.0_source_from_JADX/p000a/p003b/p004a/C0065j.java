package p000a.p003b.p004a;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.OutputStream;
import java.util.Arrays;
import org.linphone.core.Privacy;
import p000a.p003b.p004a.C0076k.C0069a;
import p000a.p003b.p004a.C0076k.C0070b;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

public class C0065j {
    static final /* synthetic */ boolean f270d = true;
    public final C0044e f271a;
    public final C0070b f272b;
    public final C0069a f273c;
    private final boolean f274e;
    private byte[] f275f;

    public C0065j(C0044e c0044e, C0070b c0070b) {
        this(c0044e, c0070b, C0069a.IN, (byte) 0);
    }

    private C0065j(C0044e c0044e, C0070b c0070b, C0069a c0069a) {
        if (!f270d && c0044e == null) {
            throw new AssertionError();
        } else if (!f270d && c0070b == null) {
            throw new AssertionError();
        } else if (f270d || c0069a != null) {
            this.f271a = c0044e;
            this.f272b = c0070b;
            this.f273c = c0069a;
            this.f274e = false;
        } else {
            throw new AssertionError();
        }
    }

    public C0065j(C0044e c0044e, C0070b c0070b, C0069a c0069a, byte b) {
        this(c0044e, c0070b, c0069a);
    }

    public C0065j(DataInputStream dataInputStream, byte[] bArr) {
        this.f271a = C0044e.m71a(dataInputStream, bArr);
        this.f272b = C0070b.m113a(dataInputStream.readUnsignedShort());
        this.f273c = C0069a.m112a(dataInputStream.readUnsignedShort());
        this.f274e = false;
    }

    public C0065j(CharSequence charSequence, C0070b c0070b, C0069a c0069a) {
        this(C0044e.m72a(charSequence), c0070b, c0069a, (byte) 0);
    }

    public final byte[] m111a() {
        if (this.f275f == null) {
            OutputStream byteArrayOutputStream = new ByteArrayOutputStream(IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED);
            OutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            try {
                this.f271a.m79a(dataOutputStream);
                dataOutputStream.writeShort(this.f272b.aF);
                dataOutputStream.writeShort(this.f273c.f284f | (this.f274e ? Privacy.DEFAULT : 0));
                dataOutputStream.flush();
                this.f275f = byteArrayOutputStream.toByteArray();
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }
        return this.f275f;
    }

    public boolean equals(Object obj) {
        return this == obj ? true : !(obj instanceof C0065j) ? false : Arrays.equals(m111a(), ((C0065j) obj).m111a());
    }

    public int hashCode() {
        return Arrays.hashCode(m111a());
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f271a);
        stringBuilder.append(".\t");
        stringBuilder.append(this.f273c);
        stringBuilder.append('\t');
        stringBuilder.append(this.f272b);
        return stringBuilder.toString();
    }
}
