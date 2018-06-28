package android.support.v4.media;

import android.media.MediaMetadata;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.p038g.C4813a;

public final class MediaMetadataCompat implements Parcelable {
    public static final Creator<MediaMetadataCompat> CREATOR = new C04891();
    static final C4813a<String, Integer> f1675a;
    private static final String[] f1676c = new String[]{"android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER"};
    private static final String[] f1677d = new String[]{"android.media.metadata.DISPLAY_ICON", "android.media.metadata.ART", "android.media.metadata.ALBUM_ART"};
    private static final String[] f1678e = new String[]{"android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART_URI"};
    final Bundle f1679b;
    private Object f1680f;

    static class C04891 implements Creator<MediaMetadataCompat> {
        C04891() {
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new MediaMetadataCompat(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new MediaMetadataCompat[i];
        }
    }

    static {
        C4813a c4813a = new C4813a();
        f1675a = c4813a;
        c4813a.put("android.media.metadata.TITLE", Integer.valueOf(1));
        f1675a.put("android.media.metadata.ARTIST", Integer.valueOf(1));
        f1675a.put("android.media.metadata.DURATION", Integer.valueOf(0));
        f1675a.put("android.media.metadata.ALBUM", Integer.valueOf(1));
        f1675a.put("android.media.metadata.AUTHOR", Integer.valueOf(1));
        f1675a.put("android.media.metadata.WRITER", Integer.valueOf(1));
        f1675a.put("android.media.metadata.COMPOSER", Integer.valueOf(1));
        f1675a.put("android.media.metadata.COMPILATION", Integer.valueOf(1));
        f1675a.put("android.media.metadata.DATE", Integer.valueOf(1));
        f1675a.put("android.media.metadata.YEAR", Integer.valueOf(0));
        f1675a.put("android.media.metadata.GENRE", Integer.valueOf(1));
        f1675a.put("android.media.metadata.TRACK_NUMBER", Integer.valueOf(0));
        f1675a.put("android.media.metadata.NUM_TRACKS", Integer.valueOf(0));
        f1675a.put("android.media.metadata.DISC_NUMBER", Integer.valueOf(0));
        f1675a.put("android.media.metadata.ALBUM_ARTIST", Integer.valueOf(1));
        f1675a.put("android.media.metadata.ART", Integer.valueOf(2));
        f1675a.put("android.media.metadata.ART_URI", Integer.valueOf(1));
        f1675a.put("android.media.metadata.ALBUM_ART", Integer.valueOf(2));
        f1675a.put("android.media.metadata.ALBUM_ART_URI", Integer.valueOf(1));
        f1675a.put("android.media.metadata.USER_RATING", Integer.valueOf(3));
        f1675a.put("android.media.metadata.RATING", Integer.valueOf(3));
        f1675a.put("android.media.metadata.DISPLAY_TITLE", Integer.valueOf(1));
        f1675a.put("android.media.metadata.DISPLAY_SUBTITLE", Integer.valueOf(1));
        f1675a.put("android.media.metadata.DISPLAY_DESCRIPTION", Integer.valueOf(1));
        f1675a.put("android.media.metadata.DISPLAY_ICON", Integer.valueOf(2));
        f1675a.put("android.media.metadata.DISPLAY_ICON_URI", Integer.valueOf(1));
        f1675a.put("android.media.metadata.MEDIA_ID", Integer.valueOf(1));
        f1675a.put("android.media.metadata.BT_FOLDER_TYPE", Integer.valueOf(0));
        f1675a.put("android.media.metadata.MEDIA_URI", Integer.valueOf(1));
        f1675a.put("android.media.metadata.ADVERTISEMENT", Integer.valueOf(0));
        f1675a.put("android.media.metadata.DOWNLOAD_STATUS", Integer.valueOf(0));
    }

    MediaMetadataCompat(Parcel parcel) {
        this.f1679b = parcel.readBundle();
    }

    public static MediaMetadataCompat m1039a(Object obj) {
        if (obj == null || VERSION.SDK_INT < 21) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        ((MediaMetadata) obj).writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        MediaMetadataCompat mediaMetadataCompat = (MediaMetadataCompat) CREATOR.createFromParcel(obtain);
        obtain.recycle();
        mediaMetadataCompat.f1680f = obj;
        return mediaMetadataCompat;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f1679b);
    }
}
