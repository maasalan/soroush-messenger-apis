package android.support.v4.p029a;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.CancellationSignal;
import android.os.OperationCanceledException;
import android.support.v4.os.C0507a;
import android.support.v4.os.C0509c;

public final class C0345b {
    public static Cursor m680a(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, C0507a c0507a) {
        if (VERSION.SDK_INT >= 16) {
            Object c;
            if (c0507a != null) {
                try {
                    c = c0507a.m1116c();
                } catch (Exception e) {
                    if (e instanceof OperationCanceledException) {
                        throw new C0509c();
                    }
                    throw e;
                }
            }
            c = null;
            return contentResolver.query(uri, strArr, str, strArr2, str2, (CancellationSignal) c);
        } else if (c0507a == null || !c0507a.m1114a()) {
            return contentResolver.query(uri, strArr, str, strArr2, str2);
        } else {
            throw new C0509c();
        }
    }
}
