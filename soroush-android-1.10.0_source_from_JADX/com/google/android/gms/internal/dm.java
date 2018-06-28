package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager;

public final class dm {
    public static int m4723a(Parcel parcel, int i) {
        parcel.writeInt(i | -65536);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void m4724a(Parcel parcel, int i, byte b) {
        m4727a(parcel, i, 4);
        parcel.writeInt(b);
    }

    public static void m4725a(Parcel parcel, int i, double d) {
        m4727a(parcel, i, 8);
        parcel.writeDouble(d);
    }

    public static void m4726a(Parcel parcel, int i, float f) {
        m4727a(parcel, i, 4);
        parcel.writeFloat(f);
    }

    public static void m4727a(Parcel parcel, int i, int i2) {
        if (i2 >= InBandBytestreamManager.MAXIMUM_BLOCK_SIZE) {
            parcel.writeInt(i | -65536);
            parcel.writeInt(i2);
            return;
        }
        parcel.writeInt(i | (i2 << 16));
    }

    public static void m4728a(Parcel parcel, int i, long j) {
        m4727a(parcel, i, 8);
        parcel.writeLong(j);
    }

    public static void m4729a(Parcel parcel, int i, Bundle bundle) {
        if (bundle != null) {
            i = m4723a(parcel, i);
            parcel.writeBundle(bundle);
            m4742b(parcel, i);
        }
    }

    public static void m4730a(Parcel parcel, int i, IBinder iBinder) {
        if (iBinder != null) {
            i = m4723a(parcel, i);
            parcel.writeStrongBinder(iBinder);
            m4742b(parcel, i);
        }
    }

    public static void m4731a(Parcel parcel, int i, Parcelable parcelable, int i2) {
        if (parcelable != null) {
            i = m4723a(parcel, i);
            parcelable.writeToParcel(parcel, i2);
            m4742b(parcel, i);
        }
    }

    public static void m4732a(Parcel parcel, int i, Float f) {
        if (f != null) {
            m4727a(parcel, i, 4);
            parcel.writeFloat(f.floatValue());
        }
    }

    public static void m4733a(Parcel parcel, int i, String str) {
        if (str != null) {
            i = m4723a(parcel, i);
            parcel.writeString(str);
            m4742b(parcel, i);
        }
    }

    public static void m4734a(Parcel parcel, int i, List<Integer> list) {
        if (list != null) {
            i = m4723a(parcel, i);
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                parcel.writeInt(((Integer) list.get(i2)).intValue());
            }
            m4742b(parcel, i);
        }
    }

    public static void m4735a(Parcel parcel, int i, boolean z) {
        m4727a(parcel, i, 4);
        parcel.writeInt(z);
    }

    public static void m4736a(Parcel parcel, int i, byte[] bArr) {
        if (bArr != null) {
            i = m4723a(parcel, i);
            parcel.writeByteArray(bArr);
            m4742b(parcel, i);
        }
    }

    public static void m4737a(Parcel parcel, int i, int[] iArr) {
        if (iArr != null) {
            i = m4723a(parcel, i);
            parcel.writeIntArray(iArr);
            m4742b(parcel, i);
        }
    }

    public static <T extends Parcelable> void m4738a(Parcel parcel, int i, T[] tArr, int i2) {
        if (tArr != null) {
            i = m4723a(parcel, i);
            parcel.writeInt(r1);
            for (Parcelable parcelable : tArr) {
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    m4741a(parcel, parcelable, i2);
                }
            }
            m4742b(parcel, i);
        }
    }

    public static void m4739a(Parcel parcel, int i, String[] strArr) {
        if (strArr != null) {
            i = m4723a(parcel, i);
            parcel.writeStringArray(strArr);
            m4742b(parcel, i);
        }
    }

    public static void m4740a(Parcel parcel, int i, byte[][] bArr) {
        if (bArr != null) {
            i = m4723a(parcel, i);
            parcel.writeInt(r0);
            for (byte[] writeByteArray : bArr) {
                parcel.writeByteArray(writeByteArray);
            }
            m4742b(parcel, i);
        }
    }

    private static <T extends Parcelable> void m4741a(Parcel parcel, T t, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        t.writeToParcel(parcel, i);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }

    public static void m4742b(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        int i2 = dataPosition - i;
        parcel.setDataPosition(i - 4);
        parcel.writeInt(i2);
        parcel.setDataPosition(dataPosition);
    }

    public static void m4743b(Parcel parcel, int i, int i2) {
        m4727a(parcel, i, 4);
        parcel.writeInt(i2);
    }

    public static void m4744b(Parcel parcel, int i, List<String> list) {
        if (list != null) {
            i = m4723a(parcel, i);
            parcel.writeStringList(list);
            m4742b(parcel, i);
        }
    }

    public static <T extends Parcelable> void m4745c(Parcel parcel, int i, List<T> list) {
        if (list != null) {
            i = m4723a(parcel, i);
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                Parcelable parcelable = (Parcelable) list.get(i2);
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    m4741a(parcel, parcelable, 0);
                }
            }
            m4742b(parcel, i);
        }
    }
}
