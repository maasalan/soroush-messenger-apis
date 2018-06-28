package android.support.v4.media.session;

import android.media.session.PlaybackState;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

public final class PlaybackStateCompat implements Parcelable {
    public static final Creator<PlaybackStateCompat> CREATOR = new C04981();
    final int f1712a;
    final long f1713b;
    final long f1714c;
    final float f1715d;
    final long f1716e;
    final int f1717f;
    final CharSequence f1718g;
    final long f1719h;
    List<CustomAction> f1720i;
    final long f1721j;
    final Bundle f1722k;
    private Object f1723l;

    static class C04981 implements Creator<PlaybackStateCompat> {
        C04981() {
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new PlaybackStateCompat[i];
        }
    }

    public static final class CustomAction implements Parcelable {
        public static final Creator<CustomAction> CREATOR = new C04991();
        private final String f1707a;
        private final CharSequence f1708b;
        private final int f1709c;
        private final Bundle f1710d;
        private Object f1711e;

        static class C04991 implements Creator<CustomAction> {
            C04991() {
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new CustomAction[i];
            }
        }

        CustomAction(Parcel parcel) {
            this.f1707a = parcel.readString();
            this.f1708b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f1709c = parcel.readInt();
            this.f1710d = parcel.readBundle();
        }

        private CustomAction(String str, CharSequence charSequence, int i, Bundle bundle) {
            this.f1707a = str;
            this.f1708b = charSequence;
            this.f1709c = i;
            this.f1710d = bundle;
        }

        public static CustomAction m1042a(Object obj) {
            if (obj != null) {
                if (VERSION.SDK_INT >= 21) {
                    android.media.session.PlaybackState.CustomAction customAction = (android.media.session.PlaybackState.CustomAction) obj;
                    CustomAction customAction2 = new CustomAction(customAction.getAction(), customAction.getName(), customAction.getIcon(), customAction.getExtras());
                    customAction2.f1711e = obj;
                    return customAction2;
                }
            }
            return null;
        }

        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("Action:mName='");
            stringBuilder.append(this.f1708b);
            stringBuilder.append(", mIcon=");
            stringBuilder.append(this.f1709c);
            stringBuilder.append(", mExtras=");
            stringBuilder.append(this.f1710d);
            return stringBuilder.toString();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f1707a);
            TextUtils.writeToParcel(this.f1708b, parcel, i);
            parcel.writeInt(this.f1709c);
            parcel.writeBundle(this.f1710d);
        }
    }

    private PlaybackStateCompat(int i, long j, long j2, float f, long j3, CharSequence charSequence, long j4, List<CustomAction> list, long j5, Bundle bundle) {
        this.f1712a = i;
        this.f1713b = j;
        this.f1714c = j2;
        this.f1715d = f;
        this.f1716e = j3;
        this.f1717f = 0;
        this.f1718g = charSequence;
        this.f1719h = j4;
        this.f1720i = new ArrayList(list);
        this.f1721j = j5;
        this.f1722k = bundle;
    }

    PlaybackStateCompat(Parcel parcel) {
        this.f1712a = parcel.readInt();
        this.f1713b = parcel.readLong();
        this.f1715d = parcel.readFloat();
        this.f1719h = parcel.readLong();
        this.f1714c = parcel.readLong();
        this.f1716e = parcel.readLong();
        this.f1718g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f1720i = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f1721j = parcel.readLong();
        this.f1722k = parcel.readBundle();
        this.f1717f = parcel.readInt();
    }

    public static PlaybackStateCompat m1043a(Object obj) {
        Object obj2 = obj;
        PlaybackStateCompat playbackStateCompat = null;
        if (obj2 == null || VERSION.SDK_INT < 21) {
            return null;
        }
        List list;
        PlaybackState playbackState = (PlaybackState) obj2;
        List<Object> customActions = playbackState.getCustomActions();
        if (customActions != null) {
            List arrayList = new ArrayList(customActions.size());
            for (Object a : customActions) {
                arrayList.add(CustomAction.m1042a(a));
            }
            list = arrayList;
        } else {
            list = null;
        }
        if (VERSION.SDK_INT >= 22) {
            playbackStateCompat = playbackState.getExtras();
        }
        PlaybackStateCompat playbackStateCompat2 = new PlaybackStateCompat(playbackState.getState(), playbackState.getPosition(), playbackState.getBufferedPosition(), playbackState.getPlaybackSpeed(), playbackState.getActions(), playbackState.getErrorMessage(), playbackState.getLastPositionUpdateTime(), list, playbackState.getActiveQueueItemId(), playbackStateCompat);
        playbackStateCompat2.f1723l = obj2;
        return playbackStateCompat2;
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("PlaybackState {");
        stringBuilder.append("state=");
        stringBuilder.append(this.f1712a);
        stringBuilder.append(", position=");
        stringBuilder.append(this.f1713b);
        stringBuilder.append(", buffered position=");
        stringBuilder.append(this.f1714c);
        stringBuilder.append(", speed=");
        stringBuilder.append(this.f1715d);
        stringBuilder.append(", updated=");
        stringBuilder.append(this.f1719h);
        stringBuilder.append(", actions=");
        stringBuilder.append(this.f1716e);
        stringBuilder.append(", error code=");
        stringBuilder.append(this.f1717f);
        stringBuilder.append(", error message=");
        stringBuilder.append(this.f1718g);
        stringBuilder.append(", custom actions=");
        stringBuilder.append(this.f1720i);
        stringBuilder.append(", active item id=");
        stringBuilder.append(this.f1721j);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f1712a);
        parcel.writeLong(this.f1713b);
        parcel.writeFloat(this.f1715d);
        parcel.writeLong(this.f1719h);
        parcel.writeLong(this.f1714c);
        parcel.writeLong(this.f1716e);
        TextUtils.writeToParcel(this.f1718g, parcel, i);
        parcel.writeTypedList(this.f1720i);
        parcel.writeLong(this.f1721j);
        parcel.writeBundle(this.f1722k);
        parcel.writeInt(this.f1717f);
    }
}
