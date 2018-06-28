package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.annotation.KeepName;

@KeepName
public final class BinderWrapper implements Parcelable {
    public static final Creator<BinderWrapper> CREATOR = new av();
    private IBinder f5338a;

    public BinderWrapper() {
        this.f5338a = null;
    }

    private BinderWrapper(Parcel parcel) {
        this.f5338a = null;
        this.f5338a = parcel.readStrongBinder();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStrongBinder(this.f5338a);
    }
}
