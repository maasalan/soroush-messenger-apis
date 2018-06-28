package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.aa;
import com.google.android.gms.internal.dm;
import com.google.android.gms.internal.zzbej;
import java.util.Arrays;
import java.util.Locale;

public final class WebImage extends zzbej {
    public static final Creator<WebImage> CREATOR = new C1756d();
    private int f18021a;
    private final Uri f18022b;
    private final int f18023c;
    private final int f18024d;

    WebImage(int i, Uri uri, int i2, int i3) {
        this.f18021a = i;
        this.f18022b = uri;
        this.f18023c = i2;
        this.f18024d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof WebImage)) {
            return false;
        }
        WebImage webImage = (WebImage) obj;
        return aa.m4374a(this.f18022b, webImage.f18022b) && this.f18023c == webImage.f18023c && this.f18024d == webImage.f18024d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f18022b, Integer.valueOf(this.f18023c), Integer.valueOf(this.f18024d)});
    }

    public final String toString() {
        return String.format(Locale.US, "Image %dx%d %s", new Object[]{Integer.valueOf(this.f18023c), Integer.valueOf(this.f18024d), this.f18022b.toString()});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = dm.m4723a(parcel, 20293);
        dm.m4743b(parcel, 1, this.f18021a);
        dm.m4731a(parcel, 2, this.f18022b, i);
        dm.m4743b(parcel, 3, this.f18023c);
        dm.m4743b(parcel, 4, this.f18024d);
        dm.m4742b(parcel, a);
    }
}
