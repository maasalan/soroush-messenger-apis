package lecho.lib.hellocharts.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class Viewport implements Parcelable {
    public static final Creator<Viewport> CREATOR = new C24311();
    public float f8050a;
    public float f8051b;
    public float f8052c;
    public float f8053d;

    static class C24311 implements Creator<Viewport> {
        C24311() {
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            Viewport viewport = new Viewport();
            viewport.f8050a = parcel.readFloat();
            viewport.f8051b = parcel.readFloat();
            viewport.f8052c = parcel.readFloat();
            viewport.f8053d = parcel.readFloat();
            return viewport;
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new Viewport[i];
        }
    }

    public final float m6645a() {
        return this.f8052c - this.f8050a;
    }

    public final void m6646a(float f, float f2, float f3, float f4) {
        this.f8050a = f;
        this.f8051b = f2;
        this.f8052c = f3;
        this.f8053d = f4;
    }

    public final void m6647a(Viewport viewport) {
        this.f8050a = viewport.f8050a;
        this.f8051b = viewport.f8051b;
        this.f8052c = viewport.f8052c;
        this.f8053d = viewport.f8053d;
    }

    public final float m6648b() {
        return this.f8051b - this.f8053d;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Viewport viewport = (Viewport) obj;
        return Float.floatToIntBits(this.f8053d) == Float.floatToIntBits(viewport.f8053d) && Float.floatToIntBits(this.f8050a) == Float.floatToIntBits(viewport.f8050a) && Float.floatToIntBits(this.f8052c) == Float.floatToIntBits(viewport.f8052c) && Float.floatToIntBits(this.f8051b) == Float.floatToIntBits(viewport.f8051b);
    }

    public int hashCode() {
        return (31 * (((((Float.floatToIntBits(this.f8053d) + 31) * 31) + Float.floatToIntBits(this.f8050a)) * 31) + Float.floatToIntBits(this.f8052c))) + Float.floatToIntBits(this.f8051b);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Viewport [left=");
        stringBuilder.append(this.f8050a);
        stringBuilder.append(", top=");
        stringBuilder.append(this.f8051b);
        stringBuilder.append(", right=");
        stringBuilder.append(this.f8052c);
        stringBuilder.append(", bottom=");
        stringBuilder.append(this.f8053d);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.f8050a);
        parcel.writeFloat(this.f8051b);
        parcel.writeFloat(this.f8052c);
        parcel.writeFloat(this.f8053d);
    }
}
