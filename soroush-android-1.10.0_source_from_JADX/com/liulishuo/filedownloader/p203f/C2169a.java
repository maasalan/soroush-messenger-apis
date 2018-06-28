package com.liulishuo.filedownloader.p203f;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.liulishuo.filedownloader.message.MessageSnapshot;

public interface C2169a extends IInterface {

    public static abstract class C5663a extends Binder implements C2169a {

        private static class C5662a implements C2169a {
            private IBinder f15585a;

            C5662a(IBinder iBinder) {
                this.f15585a = iBinder;
            }

            public final void mo1920a(MessageSnapshot messageSnapshot) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.liulishuo.filedownloader.i.IFileDownloadIPCCallback");
                    if (messageSnapshot != null) {
                        obtain.writeInt(1);
                        messageSnapshot.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f15585a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public final IBinder asBinder() {
                return this.f15585a;
            }
        }

        public C5663a() {
            attachInterface(this, "com.liulishuo.filedownloader.i.IFileDownloadIPCCallback");
        }

        public static C2169a m12556a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.liulishuo.filedownloader.i.IFileDownloadIPCCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C2169a)) ? new C5662a(iBinder) : (C2169a) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("com.liulishuo.filedownloader.i.IFileDownloadIPCCallback");
                mo1920a(parcel.readInt() != 0 ? (MessageSnapshot) MessageSnapshot.CREATOR.createFromParcel(parcel) : null);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.liulishuo.filedownloader.i.IFileDownloadIPCCallback");
                return true;
            }
        }
    }

    void mo1920a(MessageSnapshot messageSnapshot);
}
