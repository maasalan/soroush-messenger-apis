package com.p085c.p086a.p089c.p098d.p100e;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import com.p085c.p086a.p088b.C1087a;
import com.p085c.p086a.p088b.C1089c;
import com.p085c.p086a.p088b.C1090d;
import com.p085c.p086a.p088b.C5100e;
import com.p085c.p086a.p089c.C1206f;
import com.p085c.p086a.p089c.C1206f.C1205a;
import com.p085c.p086a.p089c.C1210i;
import com.p085c.p086a.p089c.C1211k;
import com.p085c.p086a.p089c.C5253j;
import com.p085c.p086a.p089c.p092b.C1159s;
import com.p085c.p086a.p089c.p092b.p093a.C1104b;
import com.p085c.p086a.p089c.p092b.p093a.C1106e;
import com.p085c.p086a.p089c.p098d.C6453b;
import com.p085c.p086a.p109i.C1267d;
import com.p085c.p086a.p109i.C1273i;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;

public final class C5242a implements C1211k<ByteBuffer, C5244c> {
    public static final C1210i<Boolean> f14569a = C1210i.m2867a("com.bumptech.glide.load.resource.gif.ByteBufferGifDecoder.DisableAnimation", Boolean.valueOf(false));
    private static final C1194a f14570b = new C1194a();
    private static final C1195b f14571c = new C1195b();
    private final Context f14572d;
    private final List<C1206f> f14573e;
    private final C1195b f14574f;
    private final C1106e f14575g;
    private final C1194a f14576h;
    private final C5243b f14577i;

    static class C1194a {
        C1194a() {
        }
    }

    static class C1195b {
        private final Queue<C1090d> f3789a = C1273i.m3020a(0);

        C1195b() {
        }

        public final synchronized C1090d m2845a(ByteBuffer byteBuffer) {
            C1090d c1090d;
            c1090d = (C1090d) this.f3789a.poll();
            if (c1090d == null) {
                c1090d = new C1090d();
            }
            c1090d.f3582b = null;
            Arrays.fill(c1090d.f3581a, (byte) 0);
            c1090d.f3583c = new C1089c();
            c1090d.f3584d = 0;
            c1090d.f3582b = byteBuffer.asReadOnlyBuffer();
            c1090d.f3582b.position(0);
            c1090d.f3582b.order(ByteOrder.LITTLE_ENDIAN);
            return c1090d;
        }

        public final synchronized void m2846a(C1090d c1090d) {
            c1090d.f3582b = null;
            c1090d.f3583c = null;
            this.f3789a.offer(c1090d);
        }
    }

    public C5242a(Context context, List<C1206f> list, C1106e c1106e, C1104b c1104b) {
        this(context, list, c1106e, c1104b, f14571c, f14570b);
    }

    private C5242a(Context context, List<C1206f> list, C1106e c1106e, C1104b c1104b, C1195b c1195b, C1194a c1194a) {
        this.f14572d = context.getApplicationContext();
        this.f14573e = list;
        this.f14575g = c1106e;
        this.f14576h = c1194a;
        this.f14577i = new C5243b(c1106e, c1104b);
        this.f14574f = c1195b;
    }

    private C6456e m10845a(ByteBuffer byteBuffer, int i, int i2) {
        ByteBuffer byteBuffer2 = byteBuffer;
        int i3 = i;
        int i4 = i2;
        C1090d a = this.f14574f.m2845a(byteBuffer2);
        try {
            long a2 = C1267d.m2998a();
            if (a.f3582b == null) {
                throw new IllegalStateException("You must call setData() before parseHeader()");
            }
            if (!a.m2654c()) {
                a.m2653b();
                if (!a.m2654c()) {
                    a.m2652a();
                    if (a.f3583c.f3570c < 0) {
                        a.f3583c.f3569b = 1;
                    }
                }
            }
            C1089c c1089c = a.f3583c;
            C6456e c6456e = null;
            if (c1089c.f3570c > 0) {
                if (c1089c.f3569b == 0) {
                    int min = Math.min(c1089c.f3574g / i4, c1089c.f3573f / i3);
                    int max = Math.max(1, min == 0 ? 0 : Integer.highestOneBit(min));
                    if (Log.isLoggable("BufferGifDecoder", 2)) {
                        StringBuilder stringBuilder = new StringBuilder("Downsampling GIF, sampleSize: ");
                        stringBuilder.append(max);
                        stringBuilder.append(", target dimens: [");
                        stringBuilder.append(i3);
                        stringBuilder.append("x");
                        stringBuilder.append(i4);
                        stringBuilder.append("], actual dimens: [");
                        stringBuilder.append(c1089c.f3573f);
                        stringBuilder.append("x");
                        stringBuilder.append(c1089c.f3574g);
                        stringBuilder.append("]");
                        Log.v("BufferGifDecoder", stringBuilder.toString());
                    }
                    C1087a c5100e = new C5100e(r1.f14577i, c1089c, byteBuffer2, max);
                    c5100e.mo1099b();
                    Bitmap h = c5100e.mo1105h();
                    if (h != null) {
                        C5244c c5244c = new C5244c(r1.f14572d, c5100e, r1.f14575g, C6453b.m15374a(), i3, i4, h);
                        if (Log.isLoggable("BufferGifDecoder", 2)) {
                            StringBuilder stringBuilder2 = new StringBuilder("Decoded GIF from stream in ");
                            stringBuilder2.append(C1267d.m2997a(a2));
                            Log.v("BufferGifDecoder", stringBuilder2.toString());
                        }
                        c6456e = new C6456e(c5244c);
                    }
                }
            }
            r1.f14574f.m2846a(a);
            return c6456e;
        } catch (Throwable th) {
            Throwable th2 = th;
            r1.f14574f.m2846a(a);
        }
    }

    public final /* bridge */ /* synthetic */ C1159s mo1199a(Object obj, int i, int i2, C5253j c5253j) {
        return m10845a((ByteBuffer) obj, i, i2);
    }

    public final /* synthetic */ boolean mo1200a(Object obj, C5253j c5253j) {
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        if (!((Boolean) c5253j.m10873a(f14569a)).booleanValue()) {
            C1205a a;
            List<C1206f> list = this.f14573e;
            if (byteBuffer != null) {
                for (C1206f a2 : list) {
                    a = a2.mo1209a(byteBuffer);
                    if (a != C1205a.UNKNOWN) {
                        break;
                    }
                }
            }
            a = C1205a.UNKNOWN;
            if (a == C1205a.GIF) {
                return true;
            }
        }
        return false;
    }
}
