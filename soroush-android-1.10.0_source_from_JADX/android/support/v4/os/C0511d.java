package android.support.v4.os;

import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;

@Deprecated
public final class C0511d {

    static class C0510a<T> implements ClassLoaderCreator<T> {
        private final C0512e<T> f1734a;

        public C0510a(C0512e<T> c0512e) {
            this.f1734a = c0512e;
        }

        public final T createFromParcel(Parcel parcel) {
            return this.f1734a.mo2268a(parcel, null);
        }

        public final T createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return this.f1734a.mo2268a(parcel, classLoader);
        }

        public final T[] newArray(int i) {
            return this.f1734a.mo2269a(i);
        }
    }
}
