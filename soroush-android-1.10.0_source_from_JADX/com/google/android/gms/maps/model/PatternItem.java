package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.aa;
import com.google.android.gms.common.internal.ac;
import com.google.android.gms.internal.dm;
import com.google.android.gms.internal.zzbej;
import java.util.Arrays;

public class PatternItem extends zzbej {
    public static final Creator<PatternItem> CREATOR = new C1887o();
    private static final String f18754a = "PatternItem";
    private final int f18755b;
    private final Float f18756c;

    public PatternItem(int i, Float f) {
        boolean z = true;
        if (i != 1) {
            if (f == null || f.floatValue() < 0.0f) {
                z = false;
            }
        }
        String valueOf = String.valueOf(f);
        StringBuilder stringBuilder = new StringBuilder(45 + String.valueOf(valueOf).length());
        stringBuilder.append("Invalid PatternItem: type=");
        stringBuilder.append(i);
        stringBuilder.append(" length=");
        stringBuilder.append(valueOf);
        ac.m4386b(z, stringBuilder.toString());
        this.f18755b = i;
        this.f18756c = f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PatternItem)) {
            return false;
        }
        PatternItem patternItem = (PatternItem) obj;
        return this.f18755b == patternItem.f18755b && aa.m4374a(this.f18756c, patternItem.f18756c);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f18755b), this.f18756c});
    }

    public String toString() {
        int i = this.f18755b;
        String valueOf = String.valueOf(this.f18756c);
        StringBuilder stringBuilder = new StringBuilder(39 + String.valueOf(valueOf).length());
        stringBuilder.append("[PatternItem: type=");
        stringBuilder.append(i);
        stringBuilder.append(" length=");
        stringBuilder.append(valueOf);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        i = dm.m4723a(parcel, 20293);
        dm.m4743b(parcel, 2, this.f18755b);
        dm.m4732a(parcel, 3, this.f18756c);
        dm.m4742b(parcel, i);
    }
}
