package com.theartofdev.edmodo.cropper;

import android.content.res.Resources;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Color;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.theartofdev.edmodo.cropper.CropImageView.C2245a;
import com.theartofdev.edmodo.cropper.CropImageView.C2246b;
import com.theartofdev.edmodo.cropper.CropImageView.C2250f;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

final class CropImageOptions implements Parcelable {
    public static final Creator<CropImageOptions> CREATOR = new C22441();
    public int f7374A;
    public int f7375B;
    public String f7376C;
    public int f7377D;
    public Uri f7378E;
    public CompressFormat f7379F;
    public int f7380G;
    public int f7381H;
    public int f7382I;
    public Rect f7383J;
    public int f7384K;
    public boolean f7385L;
    public C2245a f7386a;
    public float f7387b;
    public float f7388c;
    public C2246b f7389d;
    public C2250f f7390e;
    public boolean f7391f;
    public boolean f7392g;
    public boolean f7393h;
    public int f7394i;
    public float f7395j;
    public boolean f7396k;
    public int f7397l;
    public int f7398m;
    public float f7399n;
    public int f7400o;
    public float f7401p;
    public float f7402q;
    public float f7403r;
    public int f7404s;
    public float f7405t;
    public int f7406u;
    public int f7407v;
    public int f7408w;
    public int f7409x;
    public int f7410y;
    public int f7411z;

    static class C22441 implements Creator<CropImageOptions> {
        C22441() {
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new CropImageOptions(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new CropImageOptions[i];
        }
    }

    public CropImageOptions() {
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        this.f7386a = C2245a.RECTANGLE;
        this.f7387b = TypedValue.applyDimension(1, 3.0f, displayMetrics);
        this.f7388c = TypedValue.applyDimension(1, 24.0f, displayMetrics);
        this.f7389d = C2246b.ON_TOUCH;
        this.f7390e = C2250f.FIT_CENTER;
        this.f7391f = true;
        this.f7392g = true;
        this.f7393h = true;
        this.f7394i = 4;
        this.f7395j = 0.1f;
        this.f7396k = false;
        this.f7397l = 1;
        this.f7398m = 1;
        this.f7399n = TypedValue.applyDimension(1, 3.0f, displayMetrics);
        this.f7400o = Color.argb(170, 255, 255, 255);
        this.f7401p = TypedValue.applyDimension(1, 2.0f, displayMetrics);
        this.f7402q = TypedValue.applyDimension(1, 5.0f, displayMetrics);
        this.f7403r = TypedValue.applyDimension(1, 14.0f, displayMetrics);
        this.f7404s = -1;
        this.f7405t = TypedValue.applyDimension(1, BallPulseIndicator.SCALE, displayMetrics);
        this.f7406u = Color.argb(170, 255, 255, 255);
        this.f7407v = Color.argb(119, 0, 0, 0);
        this.f7408w = (int) TypedValue.applyDimension(1, 42.0f, displayMetrics);
        this.f7409x = (int) TypedValue.applyDimension(1, 42.0f, displayMetrics);
        this.f7410y = 40;
        this.f7411z = 40;
        this.f7374A = 99999;
        this.f7375B = 99999;
        this.f7376C = "";
        this.f7377D = 0;
        this.f7378E = Uri.EMPTY;
        this.f7379F = CompressFormat.JPEG;
        this.f7380G = 90;
        this.f7381H = 0;
        this.f7382I = 0;
        this.f7383J = null;
        this.f7384K = -1;
        this.f7385L = true;
    }

    protected CropImageOptions(Parcel parcel) {
        this.f7386a = C2245a.values()[parcel.readInt()];
        this.f7387b = parcel.readFloat();
        this.f7388c = parcel.readFloat();
        this.f7389d = C2246b.values()[parcel.readInt()];
        this.f7390e = C2250f.values()[parcel.readInt()];
        boolean z = false;
        this.f7391f = parcel.readByte() != (byte) 0;
        this.f7392g = parcel.readByte() != (byte) 0;
        this.f7393h = parcel.readByte() != (byte) 0;
        this.f7394i = parcel.readInt();
        this.f7395j = parcel.readFloat();
        this.f7396k = parcel.readByte() != (byte) 0;
        this.f7397l = parcel.readInt();
        this.f7398m = parcel.readInt();
        this.f7399n = parcel.readFloat();
        this.f7400o = parcel.readInt();
        this.f7401p = parcel.readFloat();
        this.f7402q = parcel.readFloat();
        this.f7403r = parcel.readFloat();
        this.f7404s = parcel.readInt();
        this.f7405t = parcel.readFloat();
        this.f7406u = parcel.readInt();
        this.f7407v = parcel.readInt();
        this.f7408w = parcel.readInt();
        this.f7409x = parcel.readInt();
        this.f7410y = parcel.readInt();
        this.f7411z = parcel.readInt();
        this.f7374A = parcel.readInt();
        this.f7375B = parcel.readInt();
        this.f7376C = parcel.readString();
        this.f7377D = parcel.readInt();
        this.f7378E = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f7379F = CompressFormat.valueOf(parcel.readString());
        this.f7380G = parcel.readInt();
        this.f7381H = parcel.readInt();
        this.f7382I = parcel.readInt();
        this.f7383J = (Rect) parcel.readParcelable(Rect.class.getClassLoader());
        this.f7384K = parcel.readInt();
        if (parcel.readByte() != (byte) 0) {
            z = true;
        }
        this.f7385L = z;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f7386a.ordinal());
        parcel.writeFloat(this.f7387b);
        parcel.writeFloat(this.f7388c);
        parcel.writeInt(this.f7389d.ordinal());
        parcel.writeInt(this.f7390e.ordinal());
        parcel.writeByte((byte) this.f7391f);
        parcel.writeByte((byte) this.f7392g);
        parcel.writeByte((byte) this.f7393h);
        parcel.writeInt(this.f7394i);
        parcel.writeFloat(this.f7395j);
        parcel.writeByte((byte) this.f7396k);
        parcel.writeInt(this.f7397l);
        parcel.writeInt(this.f7398m);
        parcel.writeFloat(this.f7399n);
        parcel.writeInt(this.f7400o);
        parcel.writeFloat(this.f7401p);
        parcel.writeFloat(this.f7402q);
        parcel.writeFloat(this.f7403r);
        parcel.writeInt(this.f7404s);
        parcel.writeFloat(this.f7405t);
        parcel.writeInt(this.f7406u);
        parcel.writeInt(this.f7407v);
        parcel.writeInt(this.f7408w);
        parcel.writeInt(this.f7409x);
        parcel.writeInt(this.f7410y);
        parcel.writeInt(this.f7411z);
        parcel.writeInt(this.f7374A);
        parcel.writeInt(this.f7375B);
        parcel.writeString(this.f7376C);
        parcel.writeInt(this.f7377D);
        parcel.writeParcelable(this.f7378E, i);
        parcel.writeString(this.f7379F.name());
        parcel.writeInt(this.f7380G);
        parcel.writeInt(this.f7381H);
        parcel.writeInt(this.f7382I);
        parcel.writeParcelable(this.f7383J, i);
        parcel.writeInt(this.f7384K);
        parcel.writeByte((byte) this.f7385L);
    }
}
