package com.theartofdev.edmodo.cropper;

import android.graphics.Rect;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class CropImage {

    public static final class ActivityResult implements Parcelable {
        public static final Creator<ActivityResult> CREATOR = new C22431();
        private final Uri f7369a;
        private final Exception f7370b;
        private final float[] f7371c;
        private final Rect f7372d;
        private final int f7373e;

        static class C22431 implements Creator<ActivityResult> {
            C22431() {
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new ActivityResult(parcel);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new ActivityResult[i];
            }
        }

        protected ActivityResult(Parcel parcel) {
            this.f7369a = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
            this.f7370b = (Exception) parcel.readSerializable();
            this.f7371c = parcel.createFloatArray();
            this.f7372d = (Rect) parcel.readParcelable(Rect.class.getClassLoader());
            this.f7373e = parcel.readInt();
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f7369a, i);
            parcel.writeSerializable(this.f7370b);
            parcel.writeFloatArray(this.f7371c);
            parcel.writeParcelable(this.f7372d, i);
            parcel.writeInt(this.f7373e);
        }
    }
}
