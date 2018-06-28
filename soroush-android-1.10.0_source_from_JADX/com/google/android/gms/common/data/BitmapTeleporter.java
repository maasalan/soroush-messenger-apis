package com.google.android.gms.common.data;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.ParcelFileDescriptor.AutoCloseInputStream;
import android.os.Parcelable.Creator;
import android.util.Log;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.internal.dm;
import com.google.android.gms.internal.zzbej;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.nio.Buffer;
import java.nio.ByteBuffer;

public class BitmapTeleporter extends zzbej implements ReflectedParcelable {
    public static final Creator<BitmapTeleporter> CREATOR = new C1744c();
    private int f18003a;
    private ParcelFileDescriptor f18004b;
    private int f18005c;
    private Bitmap f18006d = null;
    private boolean f18007e = false;
    private File f18008f;

    BitmapTeleporter(int i, ParcelFileDescriptor parcelFileDescriptor, int i2) {
        this.f18003a = i;
        this.f18004b = parcelFileDescriptor;
        this.f18005c = i2;
    }

    private static void m15901a(Closeable closeable) {
        try {
            closeable.close();
        } catch (Throwable e) {
            Log.w("BitmapTeleporter", "Could not close stream", e);
        }
    }

    private final java.io.FileOutputStream m15902b() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r3 = this;
        r0 = r3.f18008f;
        if (r0 != 0) goto L_0x000c;
    L_0x0004:
        r0 = new java.lang.IllegalStateException;
        r1 = "setTempDir() must be called before writing this object to a parcel";
        r0.<init>(r1);
        throw r0;
    L_0x000c:
        r0 = "teleporter";	 Catch:{ IOException -> 0x002f }
        r1 = ".tmp";	 Catch:{ IOException -> 0x002f }
        r2 = r3.f18008f;	 Catch:{ IOException -> 0x002f }
        r0 = java.io.File.createTempFile(r0, r1, r2);	 Catch:{ IOException -> 0x002f }
        r1 = new java.io.FileOutputStream;	 Catch:{ FileNotFoundException -> 0x0027 }
        r1.<init>(r0);	 Catch:{ FileNotFoundException -> 0x0027 }
        r2 = 268435456; // 0x10000000 float:2.5243549E-29 double:1.32624737E-315;	 Catch:{ FileNotFoundException -> 0x0027 }
        r2 = android.os.ParcelFileDescriptor.open(r0, r2);	 Catch:{ FileNotFoundException -> 0x0027 }
        r3.f18004b = r2;	 Catch:{ FileNotFoundException -> 0x0027 }
        r0.delete();
        return r1;
    L_0x0027:
        r0 = new java.lang.IllegalStateException;
        r1 = "Temporary file is somehow already deleted";
        r0.<init>(r1);
        throw r0;
    L_0x002f:
        r0 = move-exception;
        r1 = new java.lang.IllegalStateException;
        r2 = "Could not create temporary file";
        r1.<init>(r2, r0);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.data.BitmapTeleporter.b():java.io.FileOutputStream");
    }

    public final Bitmap m15903a() {
        if (!this.f18007e) {
            Closeable dataInputStream = new DataInputStream(new AutoCloseInputStream(this.f18004b));
            try {
                byte[] bArr = new byte[dataInputStream.readInt()];
                int readInt = dataInputStream.readInt();
                int readInt2 = dataInputStream.readInt();
                Config valueOf = Config.valueOf(dataInputStream.readUTF());
                dataInputStream.read(bArr);
                m15901a(dataInputStream);
                Buffer wrap = ByteBuffer.wrap(bArr);
                Bitmap createBitmap = Bitmap.createBitmap(readInt, readInt2, valueOf);
                createBitmap.copyPixelsFromBuffer(wrap);
                this.f18006d = createBitmap;
                this.f18007e = true;
            } catch (Throwable e) {
                throw new IllegalStateException("Could not read from parcel file descriptor", e);
            } catch (Throwable th) {
                m15901a(dataInputStream);
            }
        }
        return this.f18006d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (this.f18004b == null) {
            Bitmap bitmap = this.f18006d;
            Buffer allocate = ByteBuffer.allocate(bitmap.getRowBytes() * bitmap.getHeight());
            bitmap.copyPixelsToBuffer(allocate);
            byte[] array = allocate.array();
            Closeable dataOutputStream = new DataOutputStream(new BufferedOutputStream(m15902b()));
            try {
                dataOutputStream.writeInt(array.length);
                dataOutputStream.writeInt(bitmap.getWidth());
                dataOutputStream.writeInt(bitmap.getHeight());
                dataOutputStream.writeUTF(bitmap.getConfig().toString());
                dataOutputStream.write(array);
                m15901a(dataOutputStream);
            } catch (Throwable e) {
                throw new IllegalStateException("Could not write into unlinked file", e);
            } catch (Throwable th) {
                m15901a(dataOutputStream);
            }
        }
        i |= 1;
        int a = dm.m4723a(parcel, 20293);
        dm.m4743b(parcel, 1, this.f18003a);
        dm.m4731a(parcel, 2, this.f18004b, i);
        dm.m4743b(parcel, 3, this.f18005c);
        dm.m4742b(parcel, a);
        this.f18004b = null;
    }
}
