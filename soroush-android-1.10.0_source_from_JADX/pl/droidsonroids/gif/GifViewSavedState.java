package pl.droidsonroids.gif;

import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.View.BaseSavedState;

class GifViewSavedState extends BaseSavedState {
    public static final Creator<GifViewSavedState> CREATOR = new C78371();
    final long[][] f24884a;

    static class C78371 implements Creator<GifViewSavedState> {
        C78371() {
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new GifViewSavedState(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new GifViewSavedState[i];
        }
    }

    private GifViewSavedState(Parcel parcel) {
        super(parcel);
        this.f24884a = new long[parcel.readInt()][];
        for (int i = 0; i < this.f24884a.length; i++) {
            this.f24884a[i] = parcel.createLongArray();
        }
    }

    GifViewSavedState(Parcelable parcelable, Drawable... drawableArr) {
        super(parcelable);
        this.f24884a = new long[2][];
        for (int i = 0; i < 2; i++) {
            Drawable drawable = drawableArr[i];
            if (drawable instanceof C7839a) {
                this.f24884a[i] = ((C7839a) drawable).f24890f.m22118k();
            } else {
                this.f24884a[i] = null;
            }
        }
    }

    final void m22123a(Drawable drawable, int i) {
        if (this.f24884a[i] != null && (drawable instanceof C7839a)) {
            C7839a c7839a = (C7839a) drawable;
            c7839a.m22126a((long) c7839a.f24890f.m22105a(this.f24884a[i], c7839a.f24889e));
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f24884a.length);
        for (long[] writeLongArray : this.f24884a) {
            parcel.writeLongArray(writeLongArray);
        }
    }
}
