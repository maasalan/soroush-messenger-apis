package org.jivesoftware.smack.compression;

import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;
import org.jivesoftware.smack.compression.XMPPInputOutputStream.FlushMethod;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

public class Java7ZlibInputOutputStream extends XMPPInputOutputStream {
    private static final int FULL_FLUSH_INT = 3;
    private static final int SYNC_FLUSH_INT = 2;
    private static final int compressionLevel = -1;
    private static final Method method;
    private static final boolean supported;

    static {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = 1;
        r1 = 0;
        r2 = java.util.zip.Deflater.class;	 Catch:{ SecurityException -> 0x0020, SecurityException -> 0x0020 }
        r3 = "deflate";	 Catch:{ SecurityException -> 0x0020, SecurityException -> 0x0020 }
        r4 = 4;	 Catch:{ SecurityException -> 0x0020, SecurityException -> 0x0020 }
        r4 = new java.lang.Class[r4];	 Catch:{ SecurityException -> 0x0020, SecurityException -> 0x0020 }
        r5 = byte[].class;	 Catch:{ SecurityException -> 0x0020, SecurityException -> 0x0020 }
        r4[r1] = r5;	 Catch:{ SecurityException -> 0x0020, SecurityException -> 0x0020 }
        r5 = java.lang.Integer.TYPE;	 Catch:{ SecurityException -> 0x0020, SecurityException -> 0x0020 }
        r4[r0] = r5;	 Catch:{ SecurityException -> 0x0020, SecurityException -> 0x0020 }
        r5 = 2;	 Catch:{ SecurityException -> 0x0020, SecurityException -> 0x0020 }
        r6 = java.lang.Integer.TYPE;	 Catch:{ SecurityException -> 0x0020, SecurityException -> 0x0020 }
        r4[r5] = r6;	 Catch:{ SecurityException -> 0x0020, SecurityException -> 0x0020 }
        r5 = 3;	 Catch:{ SecurityException -> 0x0020, SecurityException -> 0x0020 }
        r6 = java.lang.Integer.TYPE;	 Catch:{ SecurityException -> 0x0020, SecurityException -> 0x0020 }
        r4[r5] = r6;	 Catch:{ SecurityException -> 0x0020, SecurityException -> 0x0020 }
        r2 = r2.getMethod(r3, r4);	 Catch:{ SecurityException -> 0x0020, SecurityException -> 0x0020 }
        goto L_0x0021;
    L_0x0020:
        r2 = 0;
    L_0x0021:
        method = r2;
        if (r2 == 0) goto L_0x0026;
    L_0x0025:
        goto L_0x0027;
    L_0x0026:
        r0 = r1;
    L_0x0027:
        supported = r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smack.compression.Java7ZlibInputOutputStream.<clinit>():void");
    }

    public Java7ZlibInputOutputStream() {
        super("zlib");
    }

    public InputStream getInputStream(InputStream inputStream) {
        return new InflaterInputStream(inputStream, new Inflater(), IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED) {
            public int available() {
                return this.inf.needsInput() ? 0 : super.available();
            }
        };
    }

    public OutputStream getOutputStream(OutputStream outputStream) {
        final int i = flushMethod == FlushMethod.SYNC_FLUSH ? 2 : 3;
        return new DeflaterOutputStream(outputStream, new Deflater(-1)) {
            public void flush() {
                /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
                /*
                r6 = this;
                r0 = org.jivesoftware.smack.compression.Java7ZlibInputOutputStream.supported;
                if (r0 != 0) goto L_0x000a;
            L_0x0006:
                super.flush();
                return;
            L_0x000a:
                r0 = org.jivesoftware.smack.compression.Java7ZlibInputOutputStream.method;	 Catch:{ IllegalArgumentException -> 0x005a, IllegalAccessException -> 0x0052, InvocationTargetException -> 0x004a }
                r1 = r6.def;	 Catch:{ IllegalArgumentException -> 0x005a, IllegalAccessException -> 0x0052, InvocationTargetException -> 0x004a }
                r2 = 4;	 Catch:{ IllegalArgumentException -> 0x005a, IllegalAccessException -> 0x0052, InvocationTargetException -> 0x004a }
                r2 = new java.lang.Object[r2];	 Catch:{ IllegalArgumentException -> 0x005a, IllegalAccessException -> 0x0052, InvocationTargetException -> 0x004a }
                r3 = r6.buf;	 Catch:{ IllegalArgumentException -> 0x005a, IllegalAccessException -> 0x0052, InvocationTargetException -> 0x004a }
                r4 = 0;	 Catch:{ IllegalArgumentException -> 0x005a, IllegalAccessException -> 0x0052, InvocationTargetException -> 0x004a }
                r2[r4] = r3;	 Catch:{ IllegalArgumentException -> 0x005a, IllegalAccessException -> 0x0052, InvocationTargetException -> 0x004a }
                r3 = 1;	 Catch:{ IllegalArgumentException -> 0x005a, IllegalAccessException -> 0x0052, InvocationTargetException -> 0x004a }
                r5 = java.lang.Integer.valueOf(r4);	 Catch:{ IllegalArgumentException -> 0x005a, IllegalAccessException -> 0x0052, InvocationTargetException -> 0x004a }
                r2[r3] = r5;	 Catch:{ IllegalArgumentException -> 0x005a, IllegalAccessException -> 0x0052, InvocationTargetException -> 0x004a }
                r3 = 2;	 Catch:{ IllegalArgumentException -> 0x005a, IllegalAccessException -> 0x0052, InvocationTargetException -> 0x004a }
                r5 = r6.buf;	 Catch:{ IllegalArgumentException -> 0x005a, IllegalAccessException -> 0x0052, InvocationTargetException -> 0x004a }
                r5 = r5.length;	 Catch:{ IllegalArgumentException -> 0x005a, IllegalAccessException -> 0x0052, InvocationTargetException -> 0x004a }
                r5 = java.lang.Integer.valueOf(r5);	 Catch:{ IllegalArgumentException -> 0x005a, IllegalAccessException -> 0x0052, InvocationTargetException -> 0x004a }
                r2[r3] = r5;	 Catch:{ IllegalArgumentException -> 0x005a, IllegalAccessException -> 0x0052, InvocationTargetException -> 0x004a }
                r3 = 3;	 Catch:{ IllegalArgumentException -> 0x005a, IllegalAccessException -> 0x0052, InvocationTargetException -> 0x004a }
                r5 = r0;	 Catch:{ IllegalArgumentException -> 0x005a, IllegalAccessException -> 0x0052, InvocationTargetException -> 0x004a }
                r5 = java.lang.Integer.valueOf(r5);	 Catch:{ IllegalArgumentException -> 0x005a, IllegalAccessException -> 0x0052, InvocationTargetException -> 0x004a }
                r2[r3] = r5;	 Catch:{ IllegalArgumentException -> 0x005a, IllegalAccessException -> 0x0052, InvocationTargetException -> 0x004a }
                r0 = r0.invoke(r1, r2);	 Catch:{ IllegalArgumentException -> 0x005a, IllegalAccessException -> 0x0052, InvocationTargetException -> 0x004a }
                r0 = (java.lang.Integer) r0;	 Catch:{ IllegalArgumentException -> 0x005a, IllegalAccessException -> 0x0052, InvocationTargetException -> 0x004a }
                r0 = r0.intValue();	 Catch:{ IllegalArgumentException -> 0x005a, IllegalAccessException -> 0x0052, InvocationTargetException -> 0x004a }
                if (r0 == 0) goto L_0x0046;	 Catch:{ IllegalArgumentException -> 0x005a, IllegalAccessException -> 0x0052, InvocationTargetException -> 0x004a }
            L_0x003e:
                r1 = r6.out;	 Catch:{ IllegalArgumentException -> 0x005a, IllegalAccessException -> 0x0052, InvocationTargetException -> 0x004a }
                r2 = r6.buf;	 Catch:{ IllegalArgumentException -> 0x005a, IllegalAccessException -> 0x0052, InvocationTargetException -> 0x004a }
                r1.write(r2, r4, r0);	 Catch:{ IllegalArgumentException -> 0x005a, IllegalAccessException -> 0x0052, InvocationTargetException -> 0x004a }
                goto L_0x000a;
            L_0x0046:
                super.flush();
                return;
            L_0x004a:
                r0 = new java.io.IOException;
                r1 = "Can't flush";
                r0.<init>(r1);
                throw r0;
            L_0x0052:
                r0 = new java.io.IOException;
                r1 = "Can't flush";
                r0.<init>(r1);
                throw r0;
            L_0x005a:
                r0 = new java.io.IOException;
                r1 = "Can't flush";
                r0.<init>(r1);
                throw r0;
                */
                throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smack.compression.Java7ZlibInputOutputStream.2.flush():void");
            }
        };
    }

    public boolean isSupported() {
        return supported;
    }
}
