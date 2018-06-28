package com.liulishuo.filedownloader.message;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.liulishuo.filedownloader.message.SmallMessageSnapshot.CompletedSnapshot;
import com.liulishuo.filedownloader.message.SmallMessageSnapshot.ConnectedMessageSnapshot;
import com.liulishuo.filedownloader.message.SmallMessageSnapshot.ErrorMessageSnapshot;
import com.liulishuo.filedownloader.message.SmallMessageSnapshot.PendingMessageSnapshot;
import com.liulishuo.filedownloader.message.SmallMessageSnapshot.ProgressMessageSnapshot;
import com.liulishuo.filedownloader.message.SmallMessageSnapshot.RetryMessageSnapshot;
import com.liulishuo.filedownloader.message.SmallMessageSnapshot.WarnMessageSnapshot;
import com.liulishuo.filedownloader.p205h.C2185f;

public abstract class MessageSnapshot implements Parcelable, C2199b {
    public static final Creator<MessageSnapshot> CREATOR = new C21951();
    public final int f15595a;
    protected boolean f15596b;

    static class C21951 implements Creator<MessageSnapshot> {
        C21951() {
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            MessageSnapshot warnMessageSnapshot;
            boolean z = true;
            if (parcel.readByte() != (byte) 1) {
                z = false;
            }
            byte readByte = parcel.readByte();
            switch (readByte) {
                case (byte) -4:
                    if (!z) {
                        warnMessageSnapshot = new WarnMessageSnapshot(parcel);
                        break;
                    }
                    warnMessageSnapshot = new LargeMessageSnapshot.WarnMessageSnapshot(parcel);
                    break;
                case (byte) -3:
                    if (!z) {
                        warnMessageSnapshot = new CompletedSnapshot(parcel);
                        break;
                    }
                    warnMessageSnapshot = new LargeMessageSnapshot.CompletedSnapshot(parcel);
                    break;
                case (byte) -1:
                    if (!z) {
                        warnMessageSnapshot = new ErrorMessageSnapshot(parcel);
                        break;
                    }
                    warnMessageSnapshot = new LargeMessageSnapshot.ErrorMessageSnapshot(parcel);
                    break;
                case (byte) 1:
                    if (!z) {
                        warnMessageSnapshot = new PendingMessageSnapshot(parcel);
                        break;
                    }
                    warnMessageSnapshot = new LargeMessageSnapshot.PendingMessageSnapshot(parcel);
                    break;
                case (byte) 2:
                    if (!z) {
                        warnMessageSnapshot = new ConnectedMessageSnapshot(parcel);
                        break;
                    }
                    warnMessageSnapshot = new LargeMessageSnapshot.ConnectedMessageSnapshot(parcel);
                    break;
                case (byte) 3:
                    if (!z) {
                        warnMessageSnapshot = new ProgressMessageSnapshot(parcel);
                        break;
                    }
                    warnMessageSnapshot = new LargeMessageSnapshot.ProgressMessageSnapshot(parcel);
                    break;
                case (byte) 5:
                    if (!z) {
                        warnMessageSnapshot = new RetryMessageSnapshot(parcel);
                        break;
                    }
                    warnMessageSnapshot = new LargeMessageSnapshot.RetryMessageSnapshot(parcel);
                    break;
                case (byte) 6:
                    warnMessageSnapshot = new StartedMessageSnapshot(parcel);
                    break;
                default:
                    warnMessageSnapshot = null;
                    break;
            }
            if (warnMessageSnapshot != null) {
                warnMessageSnapshot.f15596b = z;
                return warnMessageSnapshot;
            }
            StringBuilder stringBuilder = new StringBuilder("Can't restore the snapshot because unknown status: ");
            stringBuilder.append(readByte);
            throw new IllegalStateException(stringBuilder.toString());
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new MessageSnapshot[i];
        }
    }

    public interface C2196a {
        MessageSnapshot mo3569l();
    }

    public static class C2197b extends IllegalStateException {
        C2197b(String str, MessageSnapshot messageSnapshot) {
            super(C2185f.m5996a("There isn't a field for '%s' in this message %d %d %s", str, Integer.valueOf(messageSnapshot.f15595a), Byte.valueOf(messageSnapshot.mo3094b()), messageSnapshot.getClass().getName()));
        }
    }

    public static class StartedMessageSnapshot extends MessageSnapshot {
        StartedMessageSnapshot(int i) {
            super(i);
        }

        StartedMessageSnapshot(Parcel parcel) {
            super(parcel);
        }

        public final byte mo3094b() {
            return (byte) 6;
        }
    }

    MessageSnapshot(int i) {
        this.f15595a = i;
    }

    MessageSnapshot(Parcel parcel) {
        this.f15595a = parcel.readInt();
    }

    public int mo3096a() {
        throw new C2197b("getSmallSofarBytes", this);
    }

    public int mo3097c() {
        throw new C2197b("getSmallTotalBytes", this);
    }

    public long mo3098d() {
        throw new C2197b("getLargeTotalBytes", this);
    }

    public int describeContents() {
        return 0;
    }

    public boolean mo3432e() {
        throw new C2197b("isReusedDownloadedFile", this);
    }

    public String mo3434f() {
        throw new C2197b("getFileName", this);
    }

    public boolean mo3435g() {
        throw new C2197b("isResuming", this);
    }

    public String mo3436h() {
        throw new C2197b("getEtag", this);
    }

    public long mo3099i() {
        throw new C2197b("getLargeSofarBytes", this);
    }

    public Throwable mo3437j() {
        throw new C2197b("getThrowable", this);
    }

    public int mo3568k() {
        throw new C2197b("getRetryingTimes", this);
    }

    public final boolean m12610m() {
        return this.f15596b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte((byte) this.f15596b);
        parcel.writeByte(mo3094b());
        parcel.writeInt(this.f15595a);
    }
}
