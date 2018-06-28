package com.liulishuo.filedownloader.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class FileDownloadTaskAtom implements Parcelable {
    public static final Creator<FileDownloadTaskAtom> CREATOR = new C22091();
    private String f7302a;
    private String f7303b;
    private long f7304c;

    static class C22091 implements Creator<FileDownloadTaskAtom> {
        C22091() {
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new FileDownloadTaskAtom(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new FileDownloadTaskAtom[i];
        }
    }

    protected FileDownloadTaskAtom(Parcel parcel) {
        this.f7302a = parcel.readString();
        this.f7303b = parcel.readString();
        this.f7304c = parcel.readLong();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7302a);
        parcel.writeString(this.f7303b);
        parcel.writeLong(this.f7304c);
    }
}
