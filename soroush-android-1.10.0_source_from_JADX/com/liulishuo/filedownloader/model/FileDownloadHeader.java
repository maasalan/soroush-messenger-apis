package com.liulishuo.filedownloader.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.HashMap;
import java.util.List;

public class FileDownloadHeader implements Parcelable {
    public static final Creator<FileDownloadHeader> CREATOR = new C22071();
    public HashMap<String, List<String>> f7289a;

    static class C22071 implements Creator<FileDownloadHeader> {
        C22071() {
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new FileDownloadHeader(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new FileDownloadHeader[i];
        }
    }

    protected FileDownloadHeader(Parcel parcel) {
        this.f7289a = parcel.readHashMap(String.class.getClassLoader());
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.f7289a.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeMap(this.f7289a);
    }
}
