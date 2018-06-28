package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.os.ResultReceiver;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

public final class MediaBrowserCompat {
    static final boolean f1657a = Log.isLoggable("MediaBrowserCompat", 3);

    public static class MediaItem implements Parcelable {
        public static final Creator<MediaItem> CREATOR = new C04851();
        private final int f1655a;
        private final MediaDescriptionCompat f1656b;

        static class C04851 implements Creator<MediaItem> {
            C04851() {
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new MediaItem(parcel);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new MediaItem[i];
            }
        }

        MediaItem(Parcel parcel) {
            this.f1655a = parcel.readInt();
            this.f1656b = (MediaDescriptionCompat) MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder("MediaItem{");
            stringBuilder.append("mFlags=");
            stringBuilder.append(this.f1655a);
            stringBuilder.append(", mDescription=");
            stringBuilder.append(this.f1656b);
            stringBuilder.append('}');
            return stringBuilder.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f1655a);
            this.f1656b.writeToParcel(parcel, i);
        }
    }

    public static abstract class C0486a {
    }

    private static class CustomActionResultReceiver extends ResultReceiver {
        private final Bundle f13398d;
        private final C0486a f13399e;

        protected final void mo310a(int i, Bundle bundle) {
            if (this.f13399e != null) {
                switch (i) {
                    case -1:
                    case 0:
                    case 1:
                        break;
                    default:
                        StringBuilder stringBuilder = new StringBuilder("Unknown result code: ");
                        stringBuilder.append(i);
                        stringBuilder.append(" (extras=");
                        stringBuilder.append(this.f13398d);
                        stringBuilder.append(", resultData=");
                        stringBuilder.append(bundle);
                        stringBuilder.append(")");
                        Log.w("MediaBrowserCompat", stringBuilder.toString());
                        break;
                }
            }
        }
    }

    private static class ItemReceiver extends ResultReceiver {
        protected final void mo310a(int i, Bundle bundle) {
            if (bundle != null) {
                bundle.setClassLoader(MediaBrowserCompat.class.getClassLoader());
            }
            if (i == 0 && bundle != null && bundle.containsKey("media_item")) {
                bundle.getParcelable("media_item");
            }
        }
    }

    private static class SearchResultReceiver extends ResultReceiver {
        protected final void mo310a(int i, Bundle bundle) {
            if (bundle != null) {
                bundle.setClassLoader(MediaBrowserCompat.class.getClassLoader());
            }
            if (i == 0 && bundle != null && bundle.containsKey("search_results")) {
                Parcelable[] parcelableArray = bundle.getParcelableArray("search_results");
                if (parcelableArray != null) {
                    List arrayList = new ArrayList();
                    for (Parcelable parcelable : parcelableArray) {
                        arrayList.add((MediaItem) parcelable);
                    }
                }
            }
        }
    }
}
