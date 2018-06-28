package mobi.mmdt.ott.view.conversation.videoplayerinrecyclerview.giraffeplayer2;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.HashSet;
import java.util.Iterator;

public class VideoInfo implements Parcelable {
    public static final Creator<VideoInfo> CREATOR = new C40971();
    HashSet<C4115g> f11697a;
    boolean f11698b;
    Uri f11699c;
    String f11700d;
    public boolean f11701e;
    String f11702f;
    int f11703g;
    String f11704h;
    Uri f11705i;
    int f11706j;
    int f11707k;
    String f11708l;
    boolean f11709m;

    static class C40971 implements Creator<VideoInfo> {
        C40971() {
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new VideoInfo(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new VideoInfo[i];
        }
    }

    public VideoInfo() {
        this.f11697a = new HashSet();
        this.f11698b = false;
        this.f11700d = Integer.toHexString(hashCode());
        this.f11701e = true;
        this.f11703g = 0;
        this.f11706j = 0;
        this.f11707k = -16777216;
        this.f11708l = "ijk";
        this.f11709m = true;
    }

    protected VideoInfo(Parcel parcel) {
        this.f11697a = new HashSet();
        boolean z = false;
        this.f11698b = false;
        this.f11700d = Integer.toHexString(hashCode());
        this.f11701e = true;
        this.f11703g = 0;
        this.f11706j = 0;
        this.f11707k = -16777216;
        this.f11708l = "ijk";
        this.f11709m = true;
        this.f11700d = parcel.readString();
        this.f11699c = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f11702f = parcel.readString();
        this.f11701e = parcel.readByte() != (byte) 0;
        this.f11703g = parcel.readInt();
        this.f11704h = parcel.readString();
        this.f11705i = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f11697a = (HashSet) parcel.readSerializable();
        this.f11698b = parcel.readByte() != (byte) 0;
        this.f11706j = parcel.readInt();
        this.f11707k = parcel.readInt();
        this.f11708l = parcel.readString();
        if (parcel.readByte() != (byte) 0) {
            z = true;
        }
        this.f11709m = z;
    }

    private VideoInfo(VideoInfo videoInfo) {
        this.f11697a = new HashSet();
        this.f11698b = false;
        this.f11700d = Integer.toHexString(hashCode());
        this.f11701e = true;
        this.f11703g = 0;
        this.f11706j = 0;
        this.f11707k = -16777216;
        this.f11708l = "ijk";
        this.f11709m = true;
        this.f11702f = videoInfo.f11702f;
        this.f11701e = videoInfo.f11701e;
        this.f11703g = videoInfo.f11703g;
        Iterator it = videoInfo.f11697a.iterator();
        while (it.hasNext()) {
            try {
                this.f11697a.add(((C4115g) it.next()).m7969a());
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
        }
        this.f11698b = videoInfo.f11698b;
        this.f11706j = videoInfo.f11706j;
        this.f11707k = videoInfo.f11707k;
        this.f11708l = videoInfo.f11708l;
        this.f11709m = videoInfo.f11709m;
    }

    public static VideoInfo m7920a() {
        return new VideoInfo(C4118i.m7985a().f11793b);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f11700d);
        parcel.writeParcelable(this.f11699c, i);
        parcel.writeString(this.f11702f);
        parcel.writeByte((byte) this.f11701e);
        parcel.writeInt(this.f11703g);
        parcel.writeString(this.f11704h);
        parcel.writeParcelable(this.f11705i, i);
        parcel.writeSerializable(this.f11697a);
        parcel.writeByte((byte) this.f11698b);
        parcel.writeInt(this.f11706j);
        parcel.writeInt(this.f11707k);
        parcel.writeString(this.f11708l);
        parcel.writeByte((byte) this.f11709m);
    }
}
