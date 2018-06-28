package com.liulishuo.filedownloader.message;

import android.os.Parcel;
import com.liulishuo.filedownloader.message.MessageSnapshot.C2196a;

public abstract class LargeMessageSnapshot extends MessageSnapshot {

    public static class CompletedSnapshot extends LargeMessageSnapshot {
        private final boolean f20449c;
        private final long f20450d;

        CompletedSnapshot(int i, boolean z, long j) {
            super(i);
            this.f20449c = z;
            this.f20450d = j;
        }

        CompletedSnapshot(Parcel parcel) {
            super(parcel);
            this.f20449c = parcel.readByte() != (byte) 0;
            this.f20450d = parcel.readLong();
        }

        public final byte mo3094b() {
            return (byte) -3;
        }

        public final long mo3098d() {
            return this.f20450d;
        }

        public int describeContents() {
            return 0;
        }

        public final boolean mo3432e() {
            return this.f20449c;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.f20449c);
            parcel.writeLong(this.f20450d);
        }
    }

    public static class ConnectedMessageSnapshot extends LargeMessageSnapshot {
        private final boolean f20451c;
        private final long f20452d;
        private final String f20453e;
        private final String f20454f;

        ConnectedMessageSnapshot(int i, boolean z, long j, String str, String str2) {
            super(i);
            this.f20451c = z;
            this.f20452d = j;
            this.f20453e = str;
            this.f20454f = str2;
        }

        ConnectedMessageSnapshot(Parcel parcel) {
            super(parcel);
            this.f20451c = parcel.readByte() != (byte) 0;
            this.f20452d = parcel.readLong();
            this.f20453e = parcel.readString();
            this.f20454f = parcel.readString();
        }

        public final byte mo3094b() {
            return (byte) 2;
        }

        public final long mo3098d() {
            return this.f20452d;
        }

        public int describeContents() {
            return 0;
        }

        public final String mo3434f() {
            return this.f20454f;
        }

        public final boolean mo3435g() {
            return this.f20451c;
        }

        public final String mo3436h() {
            return this.f20453e;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.f20451c);
            parcel.writeLong(this.f20452d);
            parcel.writeString(this.f20453e);
            parcel.writeString(this.f20454f);
        }
    }

    public static class ErrorMessageSnapshot extends LargeMessageSnapshot {
        private final long f20455c;
        private final Throwable f20456d;

        ErrorMessageSnapshot(int i, long j, Throwable th) {
            super(i);
            this.f20455c = j;
            this.f20456d = th;
        }

        ErrorMessageSnapshot(Parcel parcel) {
            super(parcel);
            this.f20455c = parcel.readLong();
            this.f20456d = (Throwable) parcel.readSerializable();
        }

        public byte mo3094b() {
            return (byte) -1;
        }

        public int describeContents() {
            return 0;
        }

        public final long mo3099i() {
            return this.f20455c;
        }

        public final Throwable mo3437j() {
            return this.f20456d;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeLong(this.f20455c);
            parcel.writeSerializable(this.f20456d);
        }
    }

    public static class PendingMessageSnapshot extends LargeMessageSnapshot {
        private final long f20457c;
        private final long f20458d;

        PendingMessageSnapshot(int i, long j, long j2) {
            super(i);
            this.f20457c = j;
            this.f20458d = j2;
        }

        PendingMessageSnapshot(Parcel parcel) {
            super(parcel);
            this.f20457c = parcel.readLong();
            this.f20458d = parcel.readLong();
        }

        PendingMessageSnapshot(PendingMessageSnapshot pendingMessageSnapshot) {
            this(pendingMessageSnapshot.f15595a, pendingMessageSnapshot.f20457c, pendingMessageSnapshot.f20458d);
        }

        public byte mo3094b() {
            return (byte) 1;
        }

        public final long mo3098d() {
            return this.f20458d;
        }

        public int describeContents() {
            return 0;
        }

        public final long mo3099i() {
            return this.f20457c;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeLong(this.f20457c);
            parcel.writeLong(this.f20458d);
        }
    }

    public static class ProgressMessageSnapshot extends LargeMessageSnapshot {
        private final long f20459c;

        ProgressMessageSnapshot(int i, long j) {
            super(i);
            this.f20459c = j;
        }

        ProgressMessageSnapshot(Parcel parcel) {
            super(parcel);
            this.f20459c = parcel.readLong();
        }

        public final byte mo3094b() {
            return (byte) 3;
        }

        public int describeContents() {
            return 0;
        }

        public final long mo3099i() {
            return this.f20459c;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeLong(this.f20459c);
        }
    }

    public static class CompletedFlowDirectlySnapshot extends CompletedSnapshot implements C2198a {
        CompletedFlowDirectlySnapshot(int i, long j) {
            super(i, true, j);
        }
    }

    public static class PausedSnapshot extends PendingMessageSnapshot {
        PausedSnapshot(int i, long j, long j2) {
            super(i, j, j2);
        }

        public final byte mo3094b() {
            return (byte) -2;
        }
    }

    public static class RetryMessageSnapshot extends ErrorMessageSnapshot {
        private final int f21052c;

        RetryMessageSnapshot(int i, long j, Throwable th, int i2) {
            super(i, j, th);
            this.f21052c = i2;
        }

        RetryMessageSnapshot(Parcel parcel) {
            super(parcel);
            this.f21052c = parcel.readInt();
        }

        public final byte mo3094b() {
            return (byte) 5;
        }

        public int describeContents() {
            return 0;
        }

        public final int mo3568k() {
            return this.f21052c;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f21052c);
        }
    }

    public static class WarnMessageSnapshot extends PendingMessageSnapshot implements C2196a {
        WarnMessageSnapshot(int i, long j, long j2) {
            super(i, j, j2);
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
        WarnFlowDirectlySnapshot(int i, long j, long j2) {
            super(i, j, j2);
        }
    }

    LargeMessageSnapshot(int i) {
        super(i);
        this.b = true;
    }

    LargeMessageSnapshot(Parcel parcel) {
        super(parcel);
    }

    public final int mo3096a() {
        return mo3099i() > 2147483647L ? ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED : (int) mo3099i();
    }

    public final int mo3097c() {
        return mo3098d() > 2147483647L ? ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED : (int) mo3098d();
    }
}
