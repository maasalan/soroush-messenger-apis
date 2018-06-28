package com.liulishuo.filedownloader.message;

import android.os.Parcel;
import com.liulishuo.filedownloader.message.MessageSnapshot.C2196a;

public abstract class SmallMessageSnapshot extends MessageSnapshot {

    public static class CompletedSnapshot extends SmallMessageSnapshot {
        private final boolean f20460c;
        private final int f20461d;

        CompletedSnapshot(int i, boolean z, int i2) {
            super(i);
            this.f20460c = z;
            this.f20461d = i2;
        }

        CompletedSnapshot(Parcel parcel) {
            super(parcel);
            this.f20460c = parcel.readByte() != (byte) 0;
            this.f20461d = parcel.readInt();
        }

        public final byte mo3094b() {
            return (byte) -3;
        }

        public final int mo3097c() {
            return this.f20461d;
        }

        public int describeContents() {
            return 0;
        }

        public final boolean mo3432e() {
            return this.f20460c;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.f20460c);
            parcel.writeInt(this.f20461d);
        }
    }

    public static class ConnectedMessageSnapshot extends SmallMessageSnapshot {
        private final boolean f20462c;
        private final int f20463d;
        private final String f20464e;
        private final String f20465f;

        ConnectedMessageSnapshot(int i, boolean z, int i2, String str, String str2) {
            super(i);
            this.f20462c = z;
            this.f20463d = i2;
            this.f20464e = str;
            this.f20465f = str2;
        }

        ConnectedMessageSnapshot(Parcel parcel) {
            super(parcel);
            this.f20462c = parcel.readByte() != (byte) 0;
            this.f20463d = parcel.readInt();
            this.f20464e = parcel.readString();
            this.f20465f = parcel.readString();
        }

        public final byte mo3094b() {
            return (byte) 2;
        }

        public final int mo3097c() {
            return this.f20463d;
        }

        public int describeContents() {
            return 0;
        }

        public final String mo3434f() {
            return this.f20465f;
        }

        public final boolean mo3435g() {
            return this.f20462c;
        }

        public final String mo3436h() {
            return this.f20464e;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.f20462c);
            parcel.writeInt(this.f20463d);
            parcel.writeString(this.f20464e);
            parcel.writeString(this.f20465f);
        }
    }

    public static class ErrorMessageSnapshot extends SmallMessageSnapshot {
        private final int f20466c;
        private final Throwable f20467d;

        ErrorMessageSnapshot(int i, int i2, Throwable th) {
            super(i);
            this.f20466c = i2;
            this.f20467d = th;
        }

        ErrorMessageSnapshot(Parcel parcel) {
            super(parcel);
            this.f20466c = parcel.readInt();
            this.f20467d = (Throwable) parcel.readSerializable();
        }

        public final int mo3096a() {
            return this.f20466c;
        }

        public byte mo3094b() {
            return (byte) -1;
        }

        public int describeContents() {
            return 0;
        }

        public final Throwable mo3437j() {
            return this.f20467d;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f20466c);
            parcel.writeSerializable(this.f20467d);
        }
    }

    public static class PendingMessageSnapshot extends SmallMessageSnapshot {
        private final int f20468c;
        private final int f20469d;

        PendingMessageSnapshot(int i, int i2, int i3) {
            super(i);
            this.f20468c = i2;
            this.f20469d = i3;
        }

        PendingMessageSnapshot(Parcel parcel) {
            super(parcel);
            this.f20468c = parcel.readInt();
            this.f20469d = parcel.readInt();
        }

        PendingMessageSnapshot(PendingMessageSnapshot pendingMessageSnapshot) {
            this(pendingMessageSnapshot.f15595a, pendingMessageSnapshot.f20468c, pendingMessageSnapshot.f20469d);
        }

        public final int mo3096a() {
            return this.f20468c;
        }

        public byte mo3094b() {
            return (byte) 1;
        }

        public final int mo3097c() {
            return this.f20469d;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f20468c);
            parcel.writeInt(this.f20469d);
        }
    }

    public static class ProgressMessageSnapshot extends SmallMessageSnapshot {
        private final int f20470c;

        ProgressMessageSnapshot(int i, int i2) {
            super(i);
            this.f20470c = i2;
        }

        ProgressMessageSnapshot(Parcel parcel) {
            super(parcel);
            this.f20470c = parcel.readInt();
        }

        public final int mo3096a() {
            return this.f20470c;
        }

        public final byte mo3094b() {
            return (byte) 3;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f20470c);
        }
    }

    public static class CompletedFlowDirectlySnapshot extends CompletedSnapshot implements C2198a {
        CompletedFlowDirectlySnapshot(int i, int i2) {
            super(i, true, i2);
        }
    }

    public static class PausedSnapshot extends PendingMessageSnapshot {
        PausedSnapshot(int i, int i2, int i3) {
            super(i, i2, i3);
        }

        public final byte mo3094b() {
            return (byte) -2;
        }
    }

    public static class RetryMessageSnapshot extends ErrorMessageSnapshot {
        private final int f21053c;

        RetryMessageSnapshot(int i, int i2, Throwable th, int i3) {
            super(i, i2, th);
            this.f21053c = i3;
        }

        RetryMessageSnapshot(Parcel parcel) {
            super(parcel);
            this.f21053c = parcel.readInt();
        }

        public final byte mo3094b() {
            return (byte) 5;
        }

        public int describeContents() {
            return 0;
        }

        public final int mo3568k() {
            return this.f21053c;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f21053c);
        }
    }

    public static class WarnMessageSnapshot extends PendingMessageSnapshot implements C2196a {
        WarnMessageSnapshot(int i, int i2, int i3) {
            super(i, i2, i3);
        }

        WarnMessageSnapshot(Parcel parcel) {
            super(parcel);
        }

        public final byte mo3094b() {
            return (byte) -4;
        }

        public final MessageSnapshot mo3569l() {
            return new PendingMessageSnapshot((PendingMessageSnapshot) this);
        }
    }

    public static class WarnFlowDirectlySnapshot extends WarnMessageSnapshot implements C2198a {
        WarnFlowDirectlySnapshot(int i, int i2, int i3) {
            super(i, i2, i3);
        }
    }

    SmallMessageSnapshot(int i) {
        super(i);
        this.b = false;
    }

    SmallMessageSnapshot(Parcel parcel) {
        super(parcel);
    }

    public final long mo3098d() {
        return (long) mo3097c();
    }

    public final long mo3099i() {
        return (long) mo3096a();
    }
}
