package com.liulishuo.filedownloader.p203f;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.liulishuo.filedownloader.model.FileDownloadHeader;
import com.liulishuo.filedownloader.p203f.C2169a.C5663a;

public interface C2170b extends IInterface {

    public static abstract class C5665a extends Binder implements C2170b {

        private static class C5664a implements C2170b {
            private IBinder f15586a;

            C5664a(IBinder iBinder) {
                this.f15586a = iBinder;
            }

            public final void mo1921a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                    this.f15586a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void mo1922a(int i, Notification notification) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                    obtain.writeInt(i);
                    if (notification != null) {
                        obtain.writeInt(1);
                        notification.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f15586a.transact(12, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public final void mo1923a(C2169a c2169a) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                    obtain.writeStrongBinder(c2169a != null ? c2169a.asBinder() : null);
                    this.f15586a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public final void mo1924a(String str, String str2, boolean z, int i, int i2, int i3, boolean z2, FileDownloadHeader fileDownloadHeader, boolean z3) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeInt(z);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    obtain.writeInt(z2);
                    if (fileDownloadHeader != null) {
                        obtain.writeInt(1);
                        fileDownloadHeader.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(z3);
                    this.f15586a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void mo1925a(boolean z) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                    obtain.writeInt(z);
                    this.f15586a.transact(13, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public final boolean mo1926a(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                    obtain.writeInt(i);
                    boolean z = false;
                    this.f15586a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return z;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final boolean mo1927a(String str, String str2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    boolean z = false;
                    this.f15586a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return z;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final IBinder asBinder() {
                return this.f15586a;
            }

            public final void mo1928b(C2169a c2169a) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                    obtain.writeStrongBinder(c2169a != null ? c2169a.asBinder() : null);
                    this.f15586a.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public final boolean mo1929b() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                    boolean z = false;
                    this.f15586a.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return z;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final boolean mo1930b(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                    obtain.writeInt(i);
                    boolean z = false;
                    this.f15586a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return z;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final long mo1931c(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                    obtain.writeInt(i);
                    this.f15586a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    long readLong = obtain2.readLong();
                    return readLong;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void mo1932c() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                    this.f15586a.transact(15, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final long mo1933d(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                    obtain.writeInt(i);
                    this.f15586a.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                    long readLong = obtain2.readLong();
                    return readLong;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final byte mo1934e(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                    obtain.writeInt(i);
                    this.f15586a.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                    byte readByte = obtain2.readByte();
                    return readByte;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final boolean mo1935f(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                    obtain.writeInt(i);
                    boolean z = false;
                    this.f15586a.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return z;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C5665a() {
            attachInterface(this, "com.liulishuo.filedownloader.i.IFileDownloadIPCService");
        }

        public static C2170b m12572a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C2170b)) ? new C5664a(iBinder) : (C2170b) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            C5665a c5665a = this;
            int i3 = i;
            Parcel parcel3 = parcel;
            Parcel parcel4 = parcel2;
            if (i3 != 1598968902) {
                Notification notification = null;
                boolean z = false;
                boolean a;
                long c;
                switch (i3) {
                    case 1:
                        parcel3.enforceInterface("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                        mo1923a(C5663a.m12556a(parcel.readStrongBinder()));
                        return true;
                    case 2:
                        parcel3.enforceInterface("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                        mo1928b(C5663a.m12556a(parcel.readStrongBinder()));
                        return true;
                    case 3:
                        parcel3.enforceInterface("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                        a = mo1927a(parcel.readString(), parcel.readString());
                        parcel2.writeNoException();
                        parcel4.writeInt(a);
                        return true;
                    case 4:
                        parcel3.enforceInterface("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                        mo1924a(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0 ? (FileDownloadHeader) FileDownloadHeader.CREATOR.createFromParcel(parcel3) : null, parcel.readInt() != 0);
                        parcel2.writeNoException();
                        return true;
                    case 5:
                        parcel3.enforceInterface("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                        a = mo1926a(parcel.readInt());
                        parcel2.writeNoException();
                        parcel4.writeInt(a);
                        return true;
                    case 6:
                        parcel3.enforceInterface("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                        mo1921a();
                        parcel2.writeNoException();
                        return true;
                    case 7:
                        parcel3.enforceInterface("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                        a = mo1930b(parcel.readInt());
                        parcel2.writeNoException();
                        parcel4.writeInt(a);
                        return true;
                    case 8:
                        parcel3.enforceInterface("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                        c = mo1931c(parcel.readInt());
                        parcel2.writeNoException();
                        parcel4.writeLong(c);
                        return true;
                    case 9:
                        parcel3.enforceInterface("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                        c = mo1933d(parcel.readInt());
                        parcel2.writeNoException();
                        parcel4.writeLong(c);
                        return true;
                    case 10:
                        parcel3.enforceInterface("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                        byte e = mo1934e(parcel.readInt());
                        parcel2.writeNoException();
                        parcel4.writeByte(e);
                        return true;
                    case 11:
                        parcel3.enforceInterface("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                        a = mo1929b();
                        parcel2.writeNoException();
                        parcel4.writeInt(a);
                        return true;
                    case 12:
                        parcel3.enforceInterface("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                        i3 = parcel.readInt();
                        if (parcel.readInt() != 0) {
                            notification = (Notification) Notification.CREATOR.createFromParcel(parcel3);
                        }
                        mo1922a(i3, notification);
                        return true;
                    case 13:
                        parcel3.enforceInterface("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                        if (parcel.readInt() != 0) {
                            z = true;
                        }
                        mo1925a(z);
                        return true;
                    case 14:
                        parcel3.enforceInterface("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                        a = mo1935f(parcel.readInt());
                        parcel2.writeNoException();
                        parcel4.writeInt(a);
                        return true;
                    case 15:
                        parcel3.enforceInterface("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                        mo1932c();
                        parcel2.writeNoException();
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            }
            parcel4.writeString("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
            return true;
        }
    }

    void mo1921a();

    void mo1922a(int i, Notification notification);

    void mo1923a(C2169a c2169a);

    void mo1924a(String str, String str2, boolean z, int i, int i2, int i3, boolean z2, FileDownloadHeader fileDownloadHeader, boolean z3);

    void mo1925a(boolean z);

    boolean mo1926a(int i);

    boolean mo1927a(String str, String str2);

    void mo1928b(C2169a c2169a);

    boolean mo1929b();

    boolean mo1930b(int i);

    long mo1931c(int i);

    void mo1932c();

    long mo1933d(int i);

    byte mo1934e(int i);

    boolean mo1935f(int i);
}
