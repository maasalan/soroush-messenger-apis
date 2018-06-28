package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.ac;
import com.google.android.gms.internal.dm;
import com.google.android.gms.internal.zzbej;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;

@KeepName
public final class DataHolder extends zzbej implements Closeable {
    public static final Creator<DataHolder> CREATOR = new C1747g();
    private static final C1743a f18009k = new C5461f(new String[0]);
    final String[] f18010a;
    Bundle f18011b;
    final CursorWindow[] f18012c;
    int[] f18013d;
    int f18014e;
    private int f18015f;
    private final int f18016g;
    private final Bundle f18017h;
    private boolean f18018i = false;
    private boolean f18019j = true;

    public static class C1743a {
        private final String[] f5300a;
        private final ArrayList<HashMap<String, Object>> f5301b;
        private final String f5302c;
        private final HashMap<Object, Integer> f5303d;
        private boolean f5304e;
        private String f5305f;

        private C1743a(String[] strArr) {
            this.f5300a = (String[]) ac.m4376a((Object) strArr);
            this.f5301b = new ArrayList();
            this.f5302c = null;
            this.f5303d = new HashMap();
            this.f5304e = false;
            this.f5305f = null;
        }
    }

    DataHolder(int i, String[] strArr, CursorWindow[] cursorWindowArr, int i2, Bundle bundle) {
        this.f18015f = i;
        this.f18010a = strArr;
        this.f18012c = cursorWindowArr;
        this.f18016g = i2;
        this.f18017h = bundle;
    }

    public final int m15904a(int i) {
        int i2 = 0;
        boolean z = i >= 0 && i < this.f18014e;
        ac.m4381a(z);
        while (i2 < this.f18013d.length) {
            if (i < this.f18013d[i2]) {
                i2--;
                break;
            }
            i2++;
        }
        return i2 == this.f18013d.length ? i2 - 1 : i2;
    }

    public final boolean m15905a() {
        boolean z;
        synchronized (this) {
            z = this.f18018i;
        }
        return z;
    }

    public final void close() {
        synchronized (this) {
            if (!this.f18018i) {
                this.f18018i = true;
                for (CursorWindow close : this.f18012c) {
                    close.close();
                }
            }
        }
    }

    protected final void finalize() {
        try {
            if (this.f18019j && this.f18012c.length > 0 && !m15905a()) {
                close();
                String obj = toString();
                StringBuilder stringBuilder = new StringBuilder(178 + String.valueOf(obj).length());
                stringBuilder.append("Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: ");
                stringBuilder.append(obj);
                stringBuilder.append(")");
                Log.e("DataBuffer", stringBuilder.toString());
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = dm.m4723a(parcel, 20293);
        dm.m4739a(parcel, 1, this.f18010a);
        dm.m4738a(parcel, 2, this.f18012c, i);
        dm.m4743b(parcel, 3, this.f18016g);
        dm.m4729a(parcel, 4, this.f18017h);
        dm.m4743b(parcel, (int) IjkMediaCodecInfo.RANK_MAX, this.f18015f);
        dm.m4742b(parcel, a);
        if ((i & 1) != 0) {
            close();
        }
    }
}
