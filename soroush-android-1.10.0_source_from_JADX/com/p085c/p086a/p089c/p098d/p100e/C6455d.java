package com.p085c.p086a.p089c.p098d.p100e;

import android.util.Log;
import com.p085c.p086a.p089c.C1182c;
import com.p085c.p086a.p089c.C5253j;
import com.p085c.p086a.p089c.C5254l;
import com.p085c.p086a.p089c.p092b.C1159s;
import com.p085c.p086a.p109i.C1264a;
import java.io.File;

public final class C6455d implements C5254l<C5244c> {
    private static boolean m15377a(C1159s<C5244c> c1159s, File file) {
        try {
            C1264a.m2990a(((C5244c) c1159s.mo1180b()).m10859b(), file);
            return true;
        } catch (Throwable e) {
            if (Log.isLoggable("GifEncoder", 5)) {
                Log.w("GifEncoder", "Failed to encode GIF drawable data", e);
            }
            return false;
        }
    }

    public final C1182c mo2694a(C5253j c5253j) {
        return C1182c.SOURCE;
    }

    public final /* bridge */ /* synthetic */ boolean mo1189a(Object obj, File file, C5253j c5253j) {
        return C6455d.m15377a((C1159s) obj, file);
    }
}
