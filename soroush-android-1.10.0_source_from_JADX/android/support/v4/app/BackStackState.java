package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.app.C4777b.C0381a;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;

final class BackStackState implements Parcelable {
    public static final Creator<BackStackState> CREATOR = new C03611();
    final int[] f1332a;
    final int f1333b;
    final int f1334c;
    final String f1335d;
    final int f1336e;
    final int f1337f;
    final CharSequence f1338g;
    final int f1339h;
    final CharSequence f1340i;
    final ArrayList<String> f1341j;
    final ArrayList<String> f1342k;
    final boolean f1343l;

    static class C03611 implements Creator<BackStackState> {
        C03611() {
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new BackStackState(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new BackStackState[i];
        }
    }

    public BackStackState(Parcel parcel) {
        this.f1332a = parcel.createIntArray();
        this.f1333b = parcel.readInt();
        this.f1334c = parcel.readInt();
        this.f1335d = parcel.readString();
        this.f1336e = parcel.readInt();
        this.f1337f = parcel.readInt();
        this.f1338g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f1339h = parcel.readInt();
        this.f1340i = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f1341j = parcel.createStringArrayList();
        this.f1342k = parcel.createStringArrayList();
        this.f1343l = parcel.readInt() != 0;
    }

    public BackStackState(C4777b c4777b) {
        int size = c4777b.f13240c.size();
        this.f1332a = new int[(size * 6)];
        if (c4777b.f13247j) {
            int i = 0;
            int i2 = 0;
            while (i < size) {
                C0381a c0381a = (C0381a) c4777b.f13240c.get(i);
                int i3 = i2 + 1;
                this.f1332a[i2] = c0381a.f1408a;
                int i4 = i3 + 1;
                this.f1332a[i3] = c0381a.f1409b != null ? c0381a.f1409b.f13202n : -1;
                i3 = i4 + 1;
                this.f1332a[i4] = c0381a.f1410c;
                i4 = i3 + 1;
                this.f1332a[i3] = c0381a.f1411d;
                i3 = i4 + 1;
                this.f1332a[i4] = c0381a.f1412e;
                i4 = i3 + 1;
                this.f1332a[i3] = c0381a.f1413f;
                i++;
                i2 = i4;
            }
            this.f1333b = c4777b.f13245h;
            this.f1334c = c4777b.f13246i;
            this.f1335d = c4777b.f13249l;
            this.f1336e = c4777b.f13251n;
            this.f1337f = c4777b.f13252o;
            this.f1338g = c4777b.f13253p;
            this.f1339h = c4777b.f13254q;
            this.f1340i = c4777b.f13255r;
            this.f1341j = c4777b.f13256s;
            this.f1342k = c4777b.f13257t;
            this.f1343l = c4777b.f13258u;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    public final C4777b m719a(C4783l c4783l) {
        C4777b c4777b = new C4777b(c4783l);
        int i = 0;
        int i2 = 0;
        while (i < this.f1332a.length) {
            C0381a c0381a = new C0381a();
            int i3 = i + 1;
            c0381a.f1408a = this.f1332a[i];
            if (C4783l.f13284a) {
                StringBuilder stringBuilder = new StringBuilder("Instantiate ");
                stringBuilder.append(c4777b);
                stringBuilder.append(" op #");
                stringBuilder.append(i2);
                stringBuilder.append(" base fragment #");
                stringBuilder.append(this.f1332a[i3]);
                Log.v("FragmentManager", stringBuilder.toString());
            }
            int i4 = i3 + 1;
            i = this.f1332a[i3];
            c0381a.f1409b = i >= 0 ? (Fragment) c4783l.f13295f.get(i) : null;
            i3 = i4 + 1;
            c0381a.f1410c = this.f1332a[i4];
            i4 = i3 + 1;
            c0381a.f1411d = this.f1332a[i3];
            i3 = i4 + 1;
            c0381a.f1412e = this.f1332a[i4];
            i4 = i3 + 1;
            c0381a.f1413f = this.f1332a[i3];
            c4777b.f13241d = c0381a.f1410c;
            c4777b.f13242e = c0381a.f1411d;
            c4777b.f13243f = c0381a.f1412e;
            c4777b.f13244g = c0381a.f1413f;
            c4777b.m8955a(c0381a);
            i2++;
            i = i4;
        }
        c4777b.f13245h = this.f1333b;
        c4777b.f13246i = this.f1334c;
        c4777b.f13249l = this.f1335d;
        c4777b.f13251n = this.f1336e;
        c4777b.f13247j = true;
        c4777b.f13252o = this.f1337f;
        c4777b.f13253p = this.f1338g;
        c4777b.f13254q = this.f1339h;
        c4777b.f13255r = this.f1340i;
        c4777b.f13256s = this.f1341j;
        c4777b.f13257t = this.f1342k;
        c4777b.f13258u = this.f1343l;
        c4777b.m8953a(1);
        return c4777b;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f1332a);
        parcel.writeInt(this.f1333b);
        parcel.writeInt(this.f1334c);
        parcel.writeString(this.f1335d);
        parcel.writeInt(this.f1336e);
        parcel.writeInt(this.f1337f);
        TextUtils.writeToParcel(this.f1338g, parcel, 0);
        parcel.writeInt(this.f1339h);
        TextUtils.writeToParcel(this.f1340i, parcel, 0);
        parcel.writeStringList(this.f1341j);
        parcel.writeStringList(this.f1342k);
        parcel.writeInt(this.f1343l);
    }
}
