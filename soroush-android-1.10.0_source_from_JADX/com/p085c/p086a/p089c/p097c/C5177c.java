package com.p085c.p086a.p089c.p097c;

import android.util.Log;
import com.p085c.p086a.p089c.C1203d;
import com.p085c.p086a.p089c.C5253j;
import com.p085c.p086a.p109i.C1264a;
import java.io.File;
import java.nio.ByteBuffer;

public final class C5177c implements C1203d<ByteBuffer> {
    private static boolean m10679a(ByteBuffer byteBuffer, File file) {
        try {
            C1264a.m2990a(byteBuffer, file);
            return true;
        } catch (Throwable e) {
            if (Log.isLoggable("ByteBufferEncoder", 3)) {
                Log.d("ByteBufferEncoder", "Failed to write data", e);
            }
            return false;
        }
    }

    public final /* bridge */ /* synthetic */ boolean mo1189a(Object obj, File file, C5253j c5253j) {
        return C5177c.m10679a((ByteBuffer) obj, file);
    }
}
