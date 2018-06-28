package com.p085c.p086a.p089c.p098d.p100e;

import android.util.Log;
import com.p085c.p086a.p089c.C1206f;
import com.p085c.p086a.p089c.C1206f.C1205a;
import com.p085c.p086a.p089c.C1207g;
import com.p085c.p086a.p089c.C1210i;
import com.p085c.p086a.p089c.C1211k;
import com.p085c.p086a.p089c.C5253j;
import com.p085c.p086a.p089c.p092b.C1159s;
import com.p085c.p086a.p089c.p092b.p093a.C1104b;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class C5247i implements C1211k<InputStream, C5244c> {
    public static final C1210i<Boolean> f14592a = C1210i.m2867a("com.bumptech.glide.load.resource.gif.ByteBufferGifDecoder.DisableAnimation", Boolean.valueOf(false));
    private final List<C1206f> f14593b;
    private final C1211k<ByteBuffer, C5244c> f14594c;
    private final C1104b f14595d;

    public C5247i(List<C1206f> list, C1211k<ByteBuffer, C5244c> c1211k, C1104b c1104b) {
        this.f14593b = list;
        this.f14594c = c1211k;
        this.f14595d = c1104b;
    }

    private static byte[] m10864a(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    byteArrayOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (Throwable e) {
            if (Log.isLoggable("StreamGifDecoder", 5)) {
                Log.w("StreamGifDecoder", "Error reading data from stream", e);
            }
            return null;
        }
    }

    public final /* synthetic */ C1159s mo1199a(Object obj, int i, int i2, C5253j c5253j) {
        byte[] a = C5247i.m10864a((InputStream) obj);
        if (a == null) {
            return null;
        }
        return this.f14594c.mo1199a(ByteBuffer.wrap(a), i, i2, c5253j);
    }

    public final /* synthetic */ boolean mo1200a(Object obj, C5253j c5253j) {
        return !((Boolean) c5253j.m10873a(f14592a)).booleanValue() && C1207g.m2862a(this.f14593b, (InputStream) obj, this.f14595d) == C1205a.GIF;
    }
}
