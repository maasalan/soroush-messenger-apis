package android.support.v4.os;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface C0508b extends IInterface {

    public static abstract class C4823a extends Binder implements C0508b {

        private static class C4822a implements C0508b {
            private IBinder f13403a;

            C4822a(IBinder iBinder) {
                this.f13403a = iBinder;
            }

            public final void mo380a(int i, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.os.IResultReceiver");
                    obtain.writeInt(i);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f13403a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public final IBinder asBinder() {
                return this.f13403a;
            }
        }

        public C4823a() {
            attachInterface(this, "android.support.v4.os.IResultReceiver");
        }

        public static C0508b m9277a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.os.IResultReceiver");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C0508b)) ? new C4822a(iBinder) : (C0508b) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("android.support.v4.os.IResultReceiver");
                mo380a(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("android.support.v4.os.IResultReceiver");
                return true;
            }
        }
    }

    void mo380a(int i, Bundle bundle);
}
