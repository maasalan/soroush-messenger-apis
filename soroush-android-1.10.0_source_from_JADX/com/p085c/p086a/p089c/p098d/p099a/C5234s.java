package com.p085c.p086a.p089c.p098d.p099a;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.ParcelFileDescriptor;
import com.p085c.p086a.p089c.C1210i;
import com.p085c.p086a.p089c.C1210i.C1209a;
import com.p085c.p086a.p089c.C1211k;
import com.p085c.p086a.p089c.C5253j;
import com.p085c.p086a.p089c.p092b.C1159s;
import com.p085c.p086a.p089c.p092b.p093a.C1106e;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

public final class C5234s implements C1211k<ParcelFileDescriptor, Bitmap> {
    public static final C1210i<Long> f14560a = C1210i.m2868a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", Long.valueOf(-1), new C52321());
    public static final C1210i<Integer> f14561b = C1210i.m2868a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", null, new C52332());
    private static final C1193a f14562c = new C1193a();
    private final C1106e f14563d;
    private final C1193a f14564e;

    static class C1193a {
        C1193a() {
        }
    }

    static class C52321 implements C1209a<Long> {
        private final ByteBuffer f14558a = ByteBuffer.allocate(8);

        C52321() {
        }

        public final /* synthetic */ void mo1214a(byte[] bArr, Object obj, MessageDigest messageDigest) {
            Long l = (Long) obj;
            messageDigest.update(bArr);
            synchronized (this.f14558a) {
                this.f14558a.position(0);
                messageDigest.update(this.f14558a.putLong(l.longValue()).array());
            }
        }
    }

    static class C52332 implements C1209a<Integer> {
        private final ByteBuffer f14559a = ByteBuffer.allocate(4);

        C52332() {
        }

        public final /* synthetic */ void mo1214a(byte[] bArr, Object obj, MessageDigest messageDigest) {
            Integer num = (Integer) obj;
            if (num != null) {
                messageDigest.update(bArr);
                synchronized (this.f14559a) {
                    this.f14559a.position(0);
                    messageDigest.update(this.f14559a.putInt(num.intValue()).array());
                }
            }
        }
    }

    public C5234s(C1106e c1106e) {
        this(c1106e, f14562c);
    }

    private C5234s(C1106e c1106e, C1193a c1193a) {
        this.f14563d = c1106e;
        this.f14564e = c1193a;
    }

    private C1159s<Bitmap> m10825a(ParcelFileDescriptor parcelFileDescriptor, C5253j c5253j) {
        long longValue = ((Long) c5253j.m10873a(f14560a)).longValue();
        if (longValue >= 0 || longValue == -1) {
            Integer num = (Integer) c5253j.m10873a(f14561b);
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
                Bitmap frameAtTime = longValue == -1 ? mediaMetadataRetriever.getFrameAtTime() : num == null ? mediaMetadataRetriever.getFrameAtTime(longValue) : mediaMetadataRetriever.getFrameAtTime(longValue, num.intValue());
                mediaMetadataRetriever.release();
                parcelFileDescriptor.close();
                return C5217e.m10772a(frameAtTime, this.f14563d);
            } catch (Throwable th) {
                mediaMetadataRetriever.release();
            }
        } else {
            StringBuilder stringBuilder = new StringBuilder("Requested frame must be non-negative, or DEFAULT_FRAME, given: ");
            stringBuilder.append(longValue);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    private static boolean m10826a(android.os.ParcelFileDescriptor r1) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = new android.media.MediaMetadataRetriever;
        r0.<init>();
        r1 = r1.getFileDescriptor();	 Catch:{ RuntimeException -> 0x0016, all -> 0x0011 }
        r0.setDataSource(r1);	 Catch:{ RuntimeException -> 0x0016, all -> 0x0011 }
        r0.release();
        r1 = 1;
        return r1;
    L_0x0011:
        r1 = move-exception;
        r0.release();
        throw r1;
    L_0x0016:
        r0.release();
        r1 = 0;
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.c.a.c.d.a.s.a(android.os.ParcelFileDescriptor):boolean");
    }

    public final /* bridge */ /* synthetic */ C1159s mo1199a(Object obj, int i, int i2, C5253j c5253j) {
        return m10825a((ParcelFileDescriptor) obj, c5253j);
    }
}
