package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager;

public final class dk {
    public static int m4693a(Parcel parcel) {
        int readInt = parcel.readInt();
        int a = m4694a(parcel, readInt);
        int dataPosition = parcel.dataPosition();
        if ((InBandBytestreamManager.MAXIMUM_BLOCK_SIZE & readInt) != 20293) {
            String str = "Expected object header. Got 0x";
            String valueOf = String.valueOf(Integer.toHexString(readInt));
            throw new dl(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), parcel);
        }
        a += dataPosition;
        if (a >= dataPosition) {
            if (a <= parcel.dataSize()) {
                return a;
            }
        }
        StringBuilder stringBuilder = new StringBuilder(54);
        stringBuilder.append("Size read is invalid start=");
        stringBuilder.append(dataPosition);
        stringBuilder.append(" end=");
        stringBuilder.append(a);
        throw new dl(stringBuilder.toString(), parcel);
    }

    public static int m4694a(Parcel parcel, int i) {
        return (i & -65536) != -65536 ? (i >> 16) & InBandBytestreamManager.MAXIMUM_BLOCK_SIZE : parcel.readInt();
    }

    public static <T extends Parcelable> T m4695a(Parcel parcel, int i, Creator<T> creator) {
        i = m4694a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (i == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + i);
        return parcelable;
    }

    public static void m4696a(Parcel parcel, int i, int i2) {
        if (i != i2) {
            String toHexString = Integer.toHexString(i);
            StringBuilder stringBuilder = new StringBuilder(46 + String.valueOf(toHexString).length());
            stringBuilder.append("Expected size ");
            stringBuilder.append(i2);
            stringBuilder.append(" got ");
            stringBuilder.append(i);
            stringBuilder.append(" (0x");
            stringBuilder.append(toHexString);
            stringBuilder.append(")");
            throw new dl(stringBuilder.toString(), parcel);
        }
    }

    public static void m4697b(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + m4694a(parcel, i));
    }

    private static void m4698b(Parcel parcel, int i, int i2) {
        i = m4694a(parcel, i);
        if (i != i2) {
            String toHexString = Integer.toHexString(i);
            StringBuilder stringBuilder = new StringBuilder(46 + String.valueOf(toHexString).length());
            stringBuilder.append("Expected size ");
            stringBuilder.append(i2);
            stringBuilder.append(" got ");
            stringBuilder.append(i);
            stringBuilder.append(" (0x");
            stringBuilder.append(toHexString);
            stringBuilder.append(")");
            throw new dl(stringBuilder.toString(), parcel);
        }
    }

    public static <T> T[] m4699b(Parcel parcel, int i, Creator<T> creator) {
        i = m4694a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (i == 0) {
            return null;
        }
        T[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + i);
        return createTypedArray;
    }

    public static <T> ArrayList<T> m4700c(Parcel parcel, int i, Creator<T> creator) {
        i = m4694a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (i == 0) {
            return null;
        }
        ArrayList<T> createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + i);
        return createTypedArrayList;
    }

    public static boolean m4701c(Parcel parcel, int i) {
        m4698b(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    public static byte m4702d(Parcel parcel, int i) {
        m4698b(parcel, i, 4);
        return (byte) parcel.readInt();
    }

    public static int m4703e(Parcel parcel, int i) {
        m4698b(parcel, i, 4);
        return parcel.readInt();
    }

    public static long m4704f(Parcel parcel, int i) {
        m4698b(parcel, i, 8);
        return parcel.readLong();
    }

    public static BigInteger m4705g(Parcel parcel, int i) {
        i = m4694a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (i == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + i);
        return new BigInteger(createByteArray);
    }

    public static float m4706h(Parcel parcel, int i) {
        m4698b(parcel, i, 4);
        return parcel.readFloat();
    }

    public static Float m4707i(Parcel parcel, int i) {
        i = m4694a(parcel, i);
        if (i == 0) {
            return null;
        }
        m4696a(parcel, i, 4);
        return Float.valueOf(parcel.readFloat());
    }

    public static double m4708j(Parcel parcel, int i) {
        m4698b(parcel, i, 8);
        return parcel.readDouble();
    }

    public static BigDecimal m4709k(Parcel parcel, int i) {
        i = m4694a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (i == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        int readInt = parcel.readInt();
        parcel.setDataPosition(dataPosition + i);
        return new BigDecimal(new BigInteger(createByteArray), readInt);
    }

    public static String m4710l(Parcel parcel, int i) {
        i = m4694a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (i == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + i);
        return readString;
    }

    public static IBinder m4711m(Parcel parcel, int i) {
        i = m4694a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (i == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + i);
        return readStrongBinder;
    }

    public static Bundle m4712n(Parcel parcel, int i) {
        i = m4694a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (i == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + i);
        return readBundle;
    }

    public static byte[] m4713o(Parcel parcel, int i) {
        i = m4694a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (i == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + i);
        return createByteArray;
    }

    public static byte[][] m4714p(Parcel parcel, int i) {
        i = m4694a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (i == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        byte[][] bArr = new byte[readInt][];
        for (int i2 = 0; i2 < readInt; i2++) {
            bArr[i2] = parcel.createByteArray();
        }
        parcel.setDataPosition(dataPosition + i);
        return bArr;
    }

    public static int[] m4715q(Parcel parcel, int i) {
        i = m4694a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (i == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + i);
        return createIntArray;
    }

    public static BigDecimal[] m4716r(Parcel parcel, int i) {
        i = m4694a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (i == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        BigDecimal[] bigDecimalArr = new BigDecimal[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            byte[] createByteArray = parcel.createByteArray();
            bigDecimalArr[i2] = new BigDecimal(new BigInteger(createByteArray), parcel.readInt());
        }
        parcel.setDataPosition(dataPosition + i);
        return bigDecimalArr;
    }

    public static String[] m4717s(Parcel parcel, int i) {
        i = m4694a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (i == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + i);
        return createStringArray;
    }

    public static ArrayList<Integer> m4718t(Parcel parcel, int i) {
        i = m4694a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (i == 0) {
            return null;
        }
        ArrayList<Integer> arrayList = new ArrayList();
        int readInt = parcel.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(dataPosition + i);
        return arrayList;
    }

    public static ArrayList<String> m4719u(Parcel parcel, int i) {
        i = m4694a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (i == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + i);
        return createStringArrayList;
    }

    public static Parcel m4720v(Parcel parcel, int i) {
        i = m4694a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (i == 0) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        obtain.appendFrom(parcel, dataPosition, i);
        parcel.setDataPosition(dataPosition + i);
        return obtain;
    }

    public static Parcel[] m4721w(Parcel parcel, int i) {
        i = m4694a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (i == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        Parcel[] parcelArr = new Parcel[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            int readInt2 = parcel.readInt();
            if (readInt2 != 0) {
                int dataPosition2 = parcel.dataPosition();
                Parcel obtain = Parcel.obtain();
                obtain.appendFrom(parcel, dataPosition2, readInt2);
                parcelArr[i2] = obtain;
                parcel.setDataPosition(dataPosition2 + readInt2);
            } else {
                parcelArr[i2] = null;
            }
        }
        parcel.setDataPosition(dataPosition + i);
        return parcelArr;
    }

    public static void m4722x(Parcel parcel, int i) {
        if (parcel.dataPosition() != i) {
            StringBuilder stringBuilder = new StringBuilder(37);
            stringBuilder.append("Overread allowed size end=");
            stringBuilder.append(i);
            throw new dl(stringBuilder.toString(), parcel);
        }
    }
}
