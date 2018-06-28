package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.media.MediaDescription.Builder;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;

public final class MediaDescriptionCompat implements Parcelable {
    public static final Creator<MediaDescriptionCompat> CREATOR = new C04871();
    private final String f1666a;
    private final CharSequence f1667b;
    private final CharSequence f1668c;
    private final CharSequence f1669d;
    private final Bitmap f1670e;
    private final Uri f1671f;
    private final Bundle f1672g;
    private final Uri f1673h;
    private Object f1674i;

    static class C04871 implements Creator<MediaDescriptionCompat> {
        C04871() {
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return VERSION.SDK_INT < 21 ? new MediaDescriptionCompat(parcel) : MediaDescriptionCompat.m1038a(MediaDescription.CREATOR.createFromParcel(parcel));
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new MediaDescriptionCompat[i];
        }
    }

    public static final class C0488a {
        String f1658a;
        CharSequence f1659b;
        CharSequence f1660c;
        CharSequence f1661d;
        Bitmap f1662e;
        Uri f1663f;
        Bundle f1664g;
        Uri f1665h;
    }

    MediaDescriptionCompat(Parcel parcel) {
        this.f1666a = parcel.readString();
        this.f1667b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f1668c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f1669d = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f1670e = (Bitmap) parcel.readParcelable(null);
        this.f1671f = (Uri) parcel.readParcelable(null);
        this.f1672g = parcel.readBundle();
        this.f1673h = (Uri) parcel.readParcelable(null);
    }

    private MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f1666a = str;
        this.f1667b = charSequence;
        this.f1668c = charSequence2;
        this.f1669d = charSequence3;
        this.f1670e = bitmap;
        this.f1671f = uri;
        this.f1672g = bundle;
        this.f1673h = uri2;
    }

    public static MediaDescriptionCompat m1038a(Object obj) {
        Bundle bundle = null;
        if (obj == null || VERSION.SDK_INT < 21) {
            return null;
        }
        MediaDescriptionCompat mediaDescriptionCompat;
        C0488a c0488a = new C0488a();
        MediaDescription mediaDescription = (MediaDescription) obj;
        c0488a.f1658a = mediaDescription.getMediaId();
        c0488a.f1659b = mediaDescription.getTitle();
        c0488a.f1660c = mediaDescription.getSubtitle();
        c0488a.f1661d = mediaDescription.getDescription();
        c0488a.f1662e = mediaDescription.getIconBitmap();
        c0488a.f1663f = mediaDescription.getIconUri();
        Bundle extras = mediaDescription.getExtras();
        Uri uri = extras == null ? null : (Uri) extras.getParcelable("android.support.v4.media.description.MEDIA_URI");
        if (uri != null) {
            if (extras.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") && extras.size() == 2) {
                c0488a.f1664g = bundle;
                if (uri != null) {
                    c0488a.f1665h = uri;
                } else if (VERSION.SDK_INT >= 23) {
                    c0488a.f1665h = mediaDescription.getMediaUri();
                }
                mediaDescriptionCompat = new MediaDescriptionCompat(c0488a.f1658a, c0488a.f1659b, c0488a.f1660c, c0488a.f1661d, c0488a.f1662e, c0488a.f1663f, c0488a.f1664g, c0488a.f1665h);
                mediaDescriptionCompat.f1674i = obj;
                return mediaDescriptionCompat;
            }
            extras.remove("android.support.v4.media.description.MEDIA_URI");
            extras.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
        }
        bundle = extras;
        c0488a.f1664g = bundle;
        if (uri != null) {
            c0488a.f1665h = uri;
        } else if (VERSION.SDK_INT >= 23) {
            c0488a.f1665h = mediaDescription.getMediaUri();
        }
        mediaDescriptionCompat = new MediaDescriptionCompat(c0488a.f1658a, c0488a.f1659b, c0488a.f1660c, c0488a.f1661d, c0488a.f1662e, c0488a.f1663f, c0488a.f1664g, c0488a.f1665h);
        mediaDescriptionCompat.f1674i = obj;
        return mediaDescriptionCompat;
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f1667b);
        stringBuilder.append(", ");
        stringBuilder.append(this.f1668c);
        stringBuilder.append(", ");
        stringBuilder.append(this.f1669d);
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        if (VERSION.SDK_INT < 21) {
            parcel.writeString(this.f1666a);
            TextUtils.writeToParcel(this.f1667b, parcel, i);
            TextUtils.writeToParcel(this.f1668c, parcel, i);
            TextUtils.writeToParcel(this.f1669d, parcel, i);
            parcel.writeParcelable(this.f1670e, i);
            parcel.writeParcelable(this.f1671f, i);
            parcel.writeBundle(this.f1672g);
            parcel.writeParcelable(this.f1673h, i);
            return;
        }
        if (this.f1674i == null) {
            if (VERSION.SDK_INT >= 21) {
                Builder builder = new Builder();
                builder.setMediaId(this.f1666a);
                builder.setTitle(this.f1667b);
                builder.setSubtitle(this.f1668c);
                builder.setDescription(this.f1669d);
                builder.setIconBitmap(this.f1670e);
                builder.setIconUri(this.f1671f);
                Bundle bundle = this.f1672g;
                if (VERSION.SDK_INT < 23 && this.f1673h != null) {
                    if (bundle == null) {
                        bundle = new Bundle();
                        bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
                    }
                    bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", this.f1673h);
                }
                builder.setExtras(bundle);
                if (VERSION.SDK_INT >= 23) {
                    builder.setMediaUri(this.f1673h);
                }
                this.f1674i = builder.build();
            }
        }
        ((MediaDescription) this.f1674i).writeToParcel(parcel, i);
    }
}
