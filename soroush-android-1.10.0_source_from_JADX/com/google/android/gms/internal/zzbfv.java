package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.SparseArray;
import com.google.android.gms.common.internal.ac;
import com.google.android.gms.common.util.C1782a;
import com.google.android.gms.common.util.C1783b;
import com.google.android.gms.common.util.C1791k;
import com.google.android.gms.common.util.C1792l;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager;

public class zzbfv extends zzbfn {
    public static final Creator<zzbfv> CREATOR = new dw();
    private final int f18504a;
    private final Parcel f18505b;
    private final int f18506c = 2;
    private final zzbfq f18507d;
    private final String f18508e;
    private int f18509f;
    private int f18510g;

    zzbfv(int i, Parcel parcel, zzbfq com_google_android_gms_internal_zzbfq) {
        this.f18504a = i;
        this.f18505b = (Parcel) ac.m4376a((Object) parcel);
        this.f18507d = com_google_android_gms_internal_zzbfq;
        this.f18508e = this.f18507d == null ? null : this.f18507d.f18494a;
        this.f18509f = 2;
    }

    private static HashMap<String, String> m16828a(Bundle bundle) {
        HashMap<String, String> hashMap = new HashMap();
        for (String str : bundle.keySet()) {
            hashMap.put(str, bundle.getString(str));
        }
        return hashMap;
    }

    private static void m16829a(StringBuilder stringBuilder, int i, Object obj) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                stringBuilder.append(obj);
                return;
            case 7:
                stringBuilder.append("\"");
                stringBuilder.append(C1791k.m4530a(obj.toString()));
                stringBuilder.append("\"");
                return;
            case 8:
                stringBuilder.append("\"");
                stringBuilder.append(C1783b.m4516a((byte[]) obj));
                stringBuilder.append("\"");
                return;
            case 9:
                stringBuilder.append("\"");
                stringBuilder.append(C1783b.m4517b((byte[]) obj));
                stringBuilder.append("\"");
                return;
            case 10:
                C1792l.m4531a(stringBuilder, (HashMap) obj);
                return;
            case 11:
                throw new IllegalArgumentException("Method does not accept concrete type.");
            default:
                StringBuilder stringBuilder2 = new StringBuilder(26);
                stringBuilder2.append("Unknown type = ");
                stringBuilder2.append(i);
                throw new IllegalArgumentException(stringBuilder2.toString());
        }
    }

    private final void m16830a(StringBuilder stringBuilder, zzbfl<?, ?> com_google_android_gms_internal_zzbfl___, Parcel parcel, int i) {
        int i2 = 0;
        if (com_google_android_gms_internal_zzbfl___.f18486d) {
            stringBuilder.append("[");
            Object[] objArr = null;
            int a;
            int readInt;
            switch (com_google_android_gms_internal_zzbfl___.f18485c) {
                case 0:
                    int[] q = dk.m4715q(parcel, i);
                    int length = q.length;
                    while (i2 < length) {
                        if (i2 != 0) {
                            stringBuilder.append(",");
                        }
                        stringBuilder.append(Integer.toString(q[i2]));
                        i2++;
                    }
                    break;
                case 1:
                    a = dk.m4694a(parcel, i);
                    i = parcel.dataPosition();
                    if (a != 0) {
                        readInt = parcel.readInt();
                        objArr = new BigInteger[readInt];
                        while (i2 < readInt) {
                            objArr[i2] = new BigInteger(parcel.createByteArray());
                            i2++;
                        }
                        parcel.setDataPosition(i + a);
                    }
                    C1782a.m4512a(stringBuilder, objArr);
                    break;
                case 2:
                    long[] createLongArray;
                    a = dk.m4694a(parcel, i);
                    i = parcel.dataPosition();
                    if (a != 0) {
                        createLongArray = parcel.createLongArray();
                        parcel.setDataPosition(i + a);
                    }
                    C1782a.m4511a(stringBuilder, createLongArray);
                    break;
                case 3:
                    float[] createFloatArray;
                    a = dk.m4694a(parcel, i);
                    i = parcel.dataPosition();
                    if (a != 0) {
                        createFloatArray = parcel.createFloatArray();
                        parcel.setDataPosition(i + a);
                    }
                    C1782a.m4510a(stringBuilder, createFloatArray);
                    break;
                case 4:
                    double[] createDoubleArray;
                    a = dk.m4694a(parcel, i);
                    i = parcel.dataPosition();
                    if (a != 0) {
                        createDoubleArray = parcel.createDoubleArray();
                        parcel.setDataPosition(i + a);
                    }
                    C1782a.m4509a(stringBuilder, createDoubleArray);
                    break;
                case 5:
                    C1782a.m4512a(stringBuilder, dk.m4716r(parcel, i));
                    break;
                case 6:
                    boolean[] createBooleanArray;
                    a = dk.m4694a(parcel, i);
                    i = parcel.dataPosition();
                    if (a != 0) {
                        createBooleanArray = parcel.createBooleanArray();
                        parcel.setDataPosition(i + a);
                    }
                    C1782a.m4514a(stringBuilder, createBooleanArray);
                    break;
                case 7:
                    C1782a.m4513a(stringBuilder, dk.m4717s(parcel, i));
                    break;
                case 8:
                case 9:
                case 10:
                    throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
                case 11:
                    Parcel[] w = dk.m4721w(parcel, i);
                    i = w.length;
                    for (readInt = 0; readInt < i; readInt++) {
                        if (readInt > 0) {
                            stringBuilder.append(",");
                        }
                        w[readInt].setDataPosition(0);
                        m16832a(stringBuilder, com_google_android_gms_internal_zzbfl___.m16824a(), w[readInt]);
                    }
                    break;
                default:
                    throw new IllegalStateException("Unknown field type out.");
            }
            stringBuilder.append("]");
            return;
        }
        byte[] o;
        switch (com_google_android_gms_internal_zzbfl___.f18485c) {
            case 0:
                stringBuilder.append(dk.m4703e(parcel, i));
                return;
            case 1:
                stringBuilder.append(dk.m4705g(parcel, i));
                return;
            case 2:
                stringBuilder.append(dk.m4704f(parcel, i));
                return;
            case 3:
                stringBuilder.append(dk.m4706h(parcel, i));
                return;
            case 4:
                stringBuilder.append(dk.m4708j(parcel, i));
                return;
            case 5:
                stringBuilder.append(dk.m4709k(parcel, i));
                return;
            case 6:
                stringBuilder.append(dk.m4701c(parcel, i));
                return;
            case 7:
                String l = dk.m4710l(parcel, i);
                stringBuilder.append("\"");
                stringBuilder.append(C1791k.m4530a(l));
                stringBuilder.append("\"");
                return;
            case 8:
                o = dk.m4713o(parcel, i);
                stringBuilder.append("\"");
                stringBuilder.append(C1783b.m4516a(o));
                stringBuilder.append("\"");
                return;
            case 9:
                o = dk.m4713o(parcel, i);
                stringBuilder.append("\"");
                stringBuilder.append(C1783b.m4517b(o));
                stringBuilder.append("\"");
                return;
            case 10:
                Bundle n = dk.m4712n(parcel, i);
                Set<String> keySet = n.keySet();
                keySet.size();
                stringBuilder.append("{");
                i = 1;
                for (String str : keySet) {
                    if (i == 0) {
                        stringBuilder.append(",");
                    }
                    stringBuilder.append("\"");
                    stringBuilder.append(str);
                    stringBuilder.append("\"");
                    stringBuilder.append(":");
                    stringBuilder.append("\"");
                    stringBuilder.append(C1791k.m4530a(n.getString(str)));
                    stringBuilder.append("\"");
                    i = 0;
                }
                stringBuilder.append("}");
                return;
            case 11:
                parcel = dk.m4720v(parcel, i);
                parcel.setDataPosition(0);
                m16832a(stringBuilder, com_google_android_gms_internal_zzbfl___.m16824a(), parcel);
                return;
            default:
                throw new IllegalStateException("Unknown field type out");
        }
    }

    private static void m16831a(StringBuilder stringBuilder, zzbfl<?, ?> com_google_android_gms_internal_zzbfl___, Object obj) {
        if (com_google_android_gms_internal_zzbfl___.f18484b) {
            ArrayList arrayList = (ArrayList) obj;
            stringBuilder.append("[");
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (i != 0) {
                    stringBuilder.append(",");
                }
                m16829a(stringBuilder, com_google_android_gms_internal_zzbfl___.f18483a, arrayList.get(i));
            }
            stringBuilder.append("]");
            return;
        }
        m16829a(stringBuilder, com_google_android_gms_internal_zzbfl___.f18483a, obj);
    }

    private final void m16832a(StringBuilder stringBuilder, Map<String, zzbfl<?, ?>> map, Parcel parcel) {
        SparseArray sparseArray = new SparseArray();
        for (Entry entry : map.entrySet()) {
            sparseArray.put(((zzbfl) entry.getValue()).f18488f, entry);
        }
        stringBuilder.append('{');
        int a = dk.m4693a(parcel);
        Object obj = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            Entry entry2 = (Entry) sparseArray.get(InBandBytestreamManager.MAXIMUM_BLOCK_SIZE & readInt);
            if (entry2 != null) {
                if (obj != null) {
                    stringBuilder.append(",");
                }
                String str = (String) entry2.getKey();
                zzbfl com_google_android_gms_internal_zzbfl = (zzbfl) entry2.getValue();
                stringBuilder.append("\"");
                stringBuilder.append(str);
                stringBuilder.append("\":");
                if ((com_google_android_gms_internal_zzbfl.f18491i != null ? 1 : null) != null) {
                    switch (com_google_android_gms_internal_zzbfl.f18485c) {
                        case 0:
                            obj = Integer.valueOf(dk.m4703e(parcel, readInt));
                            break;
                        case 1:
                            obj = dk.m4705g(parcel, readInt);
                            break;
                        case 2:
                            obj = Long.valueOf(dk.m4704f(parcel, readInt));
                            break;
                        case 3:
                            obj = Float.valueOf(dk.m4706h(parcel, readInt));
                            break;
                        case 4:
                            obj = Double.valueOf(dk.m4708j(parcel, readInt));
                            break;
                        case 5:
                            obj = dk.m4709k(parcel, readInt);
                            break;
                        case 6:
                            obj = Boolean.valueOf(dk.m4701c(parcel, readInt));
                            break;
                        case 7:
                            obj = dk.m4710l(parcel, readInt);
                            break;
                        case 8:
                        case 9:
                            obj = dk.m4713o(parcel, readInt);
                            break;
                        case 10:
                            obj = m16828a(dk.m4712n(parcel, readInt));
                            break;
                        case 11:
                            throw new IllegalArgumentException("Method does not accept concrete type.");
                        default:
                            a = com_google_android_gms_internal_zzbfl.f18485c;
                            StringBuilder stringBuilder2 = new StringBuilder(36);
                            stringBuilder2.append("Unknown field out type = ");
                            stringBuilder2.append(a);
                            throw new IllegalArgumentException(stringBuilder2.toString());
                    }
                    m16831a(stringBuilder, com_google_android_gms_internal_zzbfl, dq.m4746a(com_google_android_gms_internal_zzbfl, obj));
                } else {
                    m16830a(stringBuilder, com_google_android_gms_internal_zzbfl, parcel, readInt);
                }
                obj = 1;
            }
        }
        if (parcel.dataPosition() != a) {
            StringBuilder stringBuilder3 = new StringBuilder(37);
            stringBuilder3.append("Overread allowed size end=");
            stringBuilder3.append(a);
            throw new dl(stringBuilder3.toString(), parcel);
        }
        stringBuilder.append('}');
    }

    private Parcel m16833d() {
        switch (this.f18509f) {
            case 0:
                this.f18510g = dm.m4723a(this.f18505b, 20293);
                break;
            case 1:
                break;
            default:
                break;
        }
        dm.m4742b(this.f18505b, this.f18510g);
        this.f18509f = 2;
        return this.f18505b;
    }

    public final Map<String, zzbfl<?, ?>> mo3042a() {
        return this.f18507d == null ? null : this.f18507d.m16826a(this.f18508e);
    }

    public final Object mo1671b() {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    public final boolean mo1672c() {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    public String toString() {
        ac.m4377a(this.f18507d, (Object) "Cannot convert to JSON on client side.");
        Parcel d = m16833d();
        d.setDataPosition(0);
        StringBuilder stringBuilder = new StringBuilder(100);
        m16832a(stringBuilder, this.f18507d.m16826a(this.f18508e), d);
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        Parcelable parcelable;
        int a = dm.m4723a(parcel, 20293);
        dm.m4743b(parcel, 1, this.f18504a);
        Parcel d = m16833d();
        if (d != null) {
            int a2 = dm.m4723a(parcel, 2);
            parcel.appendFrom(d, 0, d.dataSize());
            dm.m4742b(parcel, a2);
        }
        switch (this.f18506c) {
            case 0:
                parcelable = null;
                break;
            case 1:
            case 2:
                parcelable = this.f18507d;
                break;
            default:
                i = this.f18506c;
                StringBuilder stringBuilder = new StringBuilder(34);
                stringBuilder.append("Invalid creation type: ");
                stringBuilder.append(i);
                throw new IllegalStateException(stringBuilder.toString());
        }
        dm.m4731a(parcel, 3, parcelable, i);
        dm.m4742b(parcel, a);
    }
}
