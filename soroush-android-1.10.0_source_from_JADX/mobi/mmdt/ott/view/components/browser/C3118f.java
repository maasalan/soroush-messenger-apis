package mobi.mmdt.ott.view.components.browser;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface C3118f extends IInterface {

    public static abstract class C6070a extends Binder implements C3118f {
        public C6070a() {
            attachInterface(this, "android.support.customtabs.ICustomTabsCallback");
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1598968902) {
                switch (i) {
                    case 2:
                        parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                        parcel.readInt();
                        if (parcel.readInt() != 0) {
                            Bundle.CREATOR.createFromParcel(parcel);
                        }
                        return true;
                    case 3:
                        parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                        parcel.readString();
                        if (parcel.readInt() != 0) {
                            Bundle.CREATOR.createFromParcel(parcel);
                        }
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            }
            parcel2.writeString("android.support.customtabs.ICustomTabsCallback");
            return true;
        }
    }
}
