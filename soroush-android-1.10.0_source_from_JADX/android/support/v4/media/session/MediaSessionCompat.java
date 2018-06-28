package android.support.v4.media.session;

import android.os.Build.VERSION;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import java.util.ArrayList;
import java.util.List;

public final class MediaSessionCompat {

    public static final class QueueItem implements Parcelable {
        public static final Creator<QueueItem> CREATOR = new C04941();
        private final MediaDescriptionCompat f1696a;
        private final long f1697b;
        private Object f1698c;

        static class C04941 implements Creator<QueueItem> {
            C04941() {
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new QueueItem(parcel);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new QueueItem[i];
            }
        }

        QueueItem(Parcel parcel) {
            this.f1696a = (MediaDescriptionCompat) MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.f1697b = parcel.readLong();
        }

        private QueueItem(Object obj, MediaDescriptionCompat mediaDescriptionCompat, long j) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("Description cannot be null.");
            } else if (j == -1) {
                throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
            } else {
                this.f1696a = mediaDescriptionCompat;
                this.f1697b = j;
                this.f1698c = obj;
            }
        }

        public static List<QueueItem> m1041a(List<?> list) {
            if (list == null || VERSION.SDK_INT < 21) {
                return null;
            }
            List<QueueItem> arrayList = new ArrayList();
            for (Object next : list) {
                Object queueItem;
                if (next != null) {
                    if (VERSION.SDK_INT >= 21) {
                        android.media.session.MediaSession.QueueItem queueItem2 = (android.media.session.MediaSession.QueueItem) next;
                        queueItem = new QueueItem(next, MediaDescriptionCompat.m1038a(queueItem2.getDescription()), queueItem2.getQueueId());
                        arrayList.add(queueItem);
                    }
                }
                queueItem = null;
                arrayList.add(queueItem);
            }
            return arrayList;
        }

        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("MediaSession.QueueItem {Description=");
            stringBuilder.append(this.f1696a);
            stringBuilder.append(", Id=");
            stringBuilder.append(this.f1697b);
            stringBuilder.append(" }");
            return stringBuilder.toString();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            this.f1696a.writeToParcel(parcel, i);
            parcel.writeLong(this.f1697b);
        }
    }

    static final class ResultReceiverWrapper implements Parcelable {
        public static final Creator<ResultReceiverWrapper> CREATOR = new C04951();
        private ResultReceiver f1699a;

        static class C04951 implements Creator<ResultReceiverWrapper> {
            C04951() {
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new ResultReceiverWrapper(parcel);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new ResultReceiverWrapper[i];
            }
        }

        ResultReceiverWrapper(Parcel parcel) {
            this.f1699a = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            this.f1699a.writeToParcel(parcel, i);
        }
    }

    public static final class Token implements Parcelable {
        public static final Creator<Token> CREATOR = new C04961();
        private final Object f1700a;
        private final C0501b f1701b;

        static class C04961 implements Creator<Token> {
            C04961() {
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new Token(VERSION.SDK_INT >= 21 ? parcel.readParcelable(null) : parcel.readStrongBinder());
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new Token[i];
            }
        }

        Token(Object obj) {
            this(obj, (byte) 0);
        }

        private Token(Object obj, byte b) {
            this.f1700a = obj;
            this.f1701b = null;
        }

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Token)) {
                return false;
            }
            Token token = (Token) obj;
            return this.f1700a == null ? token.f1700a == null : token.f1700a == null ? false : this.f1700a.equals(token.f1700a);
        }

        public final int hashCode() {
            return this.f1700a == null ? 0 : this.f1700a.hashCode();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            if (VERSION.SDK_INT >= 21) {
                parcel.writeParcelable((Parcelable) this.f1700a, i);
            } else {
                parcel.writeStrongBinder((IBinder) this.f1700a);
            }
        }
    }
}
