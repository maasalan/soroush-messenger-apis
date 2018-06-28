package android.support.v4.media.session;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat.QueueItem;
import android.text.TextUtils;
import java.util.List;

public interface C0500a extends IInterface {

    public static abstract class C4819a extends Binder implements C0500a {

        private static class C4818a implements C0500a {
            private IBinder f13401a;

            C4818a(IBinder iBinder) {
                this.f13401a = iBinder;
            }

            public final void mo319a() {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    this.f13401a.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public final void mo320a(int i) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    obtain.writeInt(i);
                    this.f13401a.transact(9, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public final void mo321a(Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f13401a.transact(7, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public final void mo322a(MediaMetadataCompat mediaMetadataCompat) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (mediaMetadataCompat != null) {
                        obtain.writeInt(1);
                        mediaMetadataCompat.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f13401a.transact(4, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public final void mo323a(ParcelableVolumeInfo parcelableVolumeInfo) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (parcelableVolumeInfo != null) {
                        obtain.writeInt(1);
                        parcelableVolumeInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f13401a.transact(8, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public final void mo324a(PlaybackStateCompat playbackStateCompat) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (playbackStateCompat != null) {
                        obtain.writeInt(1);
                        playbackStateCompat.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f13401a.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public final void mo325a(CharSequence charSequence) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (charSequence != null) {
                        obtain.writeInt(1);
                        TextUtils.writeToParcel(charSequence, obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f13401a.transact(6, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public final void mo326a(String str, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f13401a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public final void mo327a(List<QueueItem> list) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    obtain.writeTypedList(list);
                    this.f13401a.transact(5, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public final void mo328a(boolean z) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    obtain.writeInt(z);
                    this.f13401a.transact(10, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public final IBinder asBinder() {
                return this.f13401a;
            }

            public final void mo329b(int i) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    obtain.writeInt(i);
                    this.f13401a.transact(12, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public final void mo330b(boolean z) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    obtain.writeInt(z);
                    this.f13401a.transact(11, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public C4819a() {
            attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        }

        public static C0500a m9225a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C0500a)) ? new C4818a(iBinder) : (C0500a) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1598968902) {
                boolean z = false;
                Bundle bundle = null;
                switch (i) {
                    case 1:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        String readString = parcel.readString();
                        if (parcel.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        mo326a(readString, bundle);
                        return true;
                    case 2:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        mo319a();
                        return true;
                    case 3:
                        PlaybackStateCompat playbackStateCompat;
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        if (parcel.readInt() != 0) {
                            playbackStateCompat = (PlaybackStateCompat) PlaybackStateCompat.CREATOR.createFromParcel(parcel);
                        }
                        mo324a(playbackStateCompat);
                        return true;
                    case 4:
                        MediaMetadataCompat mediaMetadataCompat;
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        if (parcel.readInt() != 0) {
                            mediaMetadataCompat = (MediaMetadataCompat) MediaMetadataCompat.CREATOR.createFromParcel(parcel);
                        }
                        mo322a(mediaMetadataCompat);
                        return true;
                    case 5:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        mo327a(parcel.createTypedArrayList(QueueItem.CREATOR));
                        return true;
                    case 6:
                        CharSequence charSequence;
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        if (parcel.readInt() != 0) {
                            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
                        }
                        mo325a(charSequence);
                        return true;
                    case 7:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        if (parcel.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        mo321a(bundle);
                        return true;
                    case 8:
                        ParcelableVolumeInfo parcelableVolumeInfo;
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        if (parcel.readInt() != 0) {
                            parcelableVolumeInfo = (ParcelableVolumeInfo) ParcelableVolumeInfo.CREATOR.createFromParcel(parcel);
                        }
                        mo323a(parcelableVolumeInfo);
                        return true;
                    case 9:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        mo320a(parcel.readInt());
                        return true;
                    case 10:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        if (parcel.readInt() != 0) {
                            z = true;
                        }
                        mo328a(z);
                        return true;
                    case 11:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        if (parcel.readInt() != 0) {
                            z = true;
                        }
                        mo330b(z);
                        return true;
                    case 12:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        mo329b(parcel.readInt());
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            }
            parcel2.writeString("android.support.v4.media.session.IMediaControllerCallback");
            return true;
        }
    }

    void mo319a();

    void mo320a(int i);

    void mo321a(Bundle bundle);

    void mo322a(MediaMetadataCompat mediaMetadataCompat);

    void mo323a(ParcelableVolumeInfo parcelableVolumeInfo);

    void mo324a(PlaybackStateCompat playbackStateCompat);

    void mo325a(CharSequence charSequence);

    void mo326a(String str, Bundle bundle);

    void mo327a(List<QueueItem> list);

    void mo328a(boolean z);

    void mo329b(int i);

    void mo330b(boolean z);
}
