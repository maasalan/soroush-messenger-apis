package com.google.android.gms.common.data;

import android.database.CursorIndexOutOfBoundsException;
import com.google.android.gms.common.internal.aa;
import com.google.android.gms.common.internal.ac;
import java.util.Arrays;

public class C1746e {
    protected final DataHolder f5308a;
    protected int f5309b;
    private int f5310c;

    public C1746e(DataHolder dataHolder, int i) {
        this.f5308a = (DataHolder) ac.m4376a((Object) dataHolder);
        boolean z = i >= 0 && i < this.f5308a.f18014e;
        ac.m4381a(z);
        this.f5309b = i;
        this.f5310c = this.f5308a.m15904a(this.f5309b);
    }

    protected final String m4358a(String str) {
        DataHolder dataHolder = this.f5308a;
        int i = this.f5309b;
        int i2 = this.f5310c;
        if (dataHolder.f18011b != null) {
            if (dataHolder.f18011b.containsKey(str)) {
                if (dataHolder.m15905a()) {
                    throw new IllegalArgumentException("Buffer is closed.");
                }
                if (i >= 0) {
                    if (i < dataHolder.f18014e) {
                        return dataHolder.f18012c[i2].getString(i, dataHolder.f18011b.getInt(str));
                    }
                }
                throw new CursorIndexOutOfBoundsException(i, dataHolder.f18014e);
            }
        }
        String str2 = "No such column: ";
        str = String.valueOf(str);
        throw new IllegalArgumentException(str.length() != 0 ? str2.concat(str) : new String(str2));
    }

    public boolean equals(Object obj) {
        if (obj instanceof C1746e) {
            C1746e c1746e = (C1746e) obj;
            if (aa.m4374a(Integer.valueOf(c1746e.f5309b), Integer.valueOf(this.f5309b)) && aa.m4374a(Integer.valueOf(c1746e.f5310c), Integer.valueOf(this.f5310c)) && c1746e.f5308a == this.f5308a) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f5309b), Integer.valueOf(this.f5310c), this.f5308a});
    }
}
