package com.liulishuo.filedownloader.model;

import android.content.ContentValues;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.liulishuo.filedownloader.p205h.C2185f;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.jivesoftware.smackx.muc.packet.MUCUser.Status;
import tv.danmaku.ijk.media.player.IjkMediaPlayer.OnNativeInvokeListener;

public class FileDownloadModel implements Parcelable {
    public static final Creator<FileDownloadModel> CREATOR = new C22081();
    public int f7290a;
    public String f7291b;
    public String f7292c;
    public boolean f7293d;
    public String f7294e;
    public final AtomicLong f7295f;
    public long f7296g;
    public String f7297h;
    public String f7298i;
    public int f7299j;
    public boolean f7300k;
    private final AtomicInteger f7301l;

    static class C22081 implements Creator<FileDownloadModel> {
        C22081() {
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new FileDownloadModel(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new FileDownloadModel[i];
        }
    }

    public FileDownloadModel() {
        this.f7295f = new AtomicLong();
        this.f7301l = new AtomicInteger();
    }

    protected FileDownloadModel(Parcel parcel) {
        this.f7290a = parcel.readInt();
        this.f7291b = parcel.readString();
        this.f7292c = parcel.readString();
        boolean z = false;
        this.f7293d = parcel.readByte() != (byte) 0;
        this.f7294e = parcel.readString();
        this.f7301l = new AtomicInteger(parcel.readByte());
        this.f7295f = new AtomicLong(parcel.readLong());
        this.f7296g = parcel.readLong();
        this.f7297h = parcel.readString();
        this.f7298i = parcel.readString();
        this.f7299j = parcel.readInt();
        if (parcel.readByte() != (byte) 0) {
            z = true;
        }
        this.f7300k = z;
    }

    public final String m6057a() {
        return C2185f.m5995a(this.f7292c, this.f7293d, this.f7294e);
    }

    public final void m6058a(byte b) {
        this.f7301l.set(b);
    }

    public final void m6059a(long j) {
        this.f7295f.set(j);
    }

    public final void m6060a(String str, boolean z) {
        this.f7292c = str;
        this.f7293d = z;
    }

    public final String m6061b() {
        return m6057a() == null ? null : C2185f.m6006b(m6057a());
    }

    public final void m6062b(long j) {
        this.f7300k = j > 2147483647L;
        this.f7296g = j;
    }

    public final byte m6063c() {
        return (byte) this.f7301l.get();
    }

    public final boolean m6064d() {
        return this.f7296g == -1;
    }

    public int describeContents() {
        return 0;
    }

    public final ContentValues m6065e() {
        ContentValues contentValues = new ContentValues();
        contentValues.put("_id", Integer.valueOf(this.f7290a));
        contentValues.put(OnNativeInvokeListener.ARG_URL, this.f7291b);
        contentValues.put("path", this.f7292c);
        contentValues.put(Status.ELEMENT, Byte.valueOf(m6063c()));
        contentValues.put("sofar", Long.valueOf(this.f7295f.get()));
        contentValues.put("total", Long.valueOf(this.f7296g));
        contentValues.put("errMsg", this.f7297h);
        contentValues.put("etag", this.f7298i);
        contentValues.put("connectionCount", Integer.valueOf(this.f7299j));
        contentValues.put("pathAsDirectory", Boolean.valueOf(this.f7293d));
        if (this.f7293d && this.f7294e != null) {
            contentValues.put("filename", this.f7294e);
        }
        return contentValues;
    }

    public String toString() {
        return C2185f.m5996a("id[%d], url[%s], path[%s], status[%d], sofar[%s], total[%d], etag[%s], %s", Integer.valueOf(this.f7290a), this.f7291b, this.f7292c, Integer.valueOf(this.f7301l.get()), this.f7295f, Long.valueOf(this.f7296g), this.f7298i, super.toString());
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f7290a);
        parcel.writeString(this.f7291b);
        parcel.writeString(this.f7292c);
        parcel.writeByte(this.f7293d);
        parcel.writeString(this.f7294e);
        parcel.writeByte((byte) this.f7301l.get());
        parcel.writeLong(this.f7295f.get());
        parcel.writeLong(this.f7296g);
        parcel.writeString(this.f7297h);
        parcel.writeString(this.f7298i);
        parcel.writeInt(this.f7299j);
        parcel.writeByte(this.f7300k);
    }
}
