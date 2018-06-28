package com.google.android.gms.internal;

public abstract class fm extends mo implements fl {
    public fm() {
        attachInterface(this, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTransact(int r8, android.os.Parcel r9, android.os.Parcel r10, int r11) {
        /*
        r7 = this;
        r11 = r7.m5003a(r8, r9, r10, r11);
        r0 = 1;
        if (r11 == 0) goto L_0x0008;
    L_0x0007:
        return r0;
    L_0x0008:
        switch(r8) {
            case 1: goto L_0x012a;
            case 2: goto L_0x0116;
            case 3: goto L_0x000b;
            case 4: goto L_0x010a;
            case 5: goto L_0x00f6;
            case 6: goto L_0x00ea;
            case 7: goto L_0x00d3;
            case 8: goto L_0x000b;
            case 9: goto L_0x00bc;
            case 10: goto L_0x00a6;
            case 11: goto L_0x0093;
            case 12: goto L_0x007e;
            case 13: goto L_0x0071;
            case 14: goto L_0x0058;
            case 15: goto L_0x0042;
            case 16: goto L_0x002c;
            case 17: goto L_0x001a;
            case 18: goto L_0x000d;
            default: goto L_0x000b;
        };
    L_0x000b:
        r8 = 0;
        return r8;
    L_0x000d:
        r8 = com.google.android.gms.internal.zzcff.CREATOR;
        r8 = com.google.android.gms.internal.mp.m5004a(r9, r8);
        r8 = (com.google.android.gms.internal.zzcff) r8;
        r7.mo1641d(r8);
        goto L_0x013d;
    L_0x001a:
        r8 = r9.readString();
        r11 = r9.readString();
        r9 = r9.readString();
        r8 = r7.mo1628a(r8, r11, r9);
        goto L_0x00e3;
    L_0x002c:
        r8 = r9.readString();
        r11 = r9.readString();
        r1 = com.google.android.gms.internal.zzcff.CREATOR;
        r9 = com.google.android.gms.internal.mp.m5004a(r9, r1);
        r9 = (com.google.android.gms.internal.zzcff) r9;
        r8 = r7.mo1627a(r8, r11, r9);
        goto L_0x00e3;
    L_0x0042:
        r8 = r9.readString();
        r11 = r9.readString();
        r1 = r9.readString();
        r9 = com.google.android.gms.internal.mp.m5008a(r9);
        r8 = r7.mo1629a(r8, r11, r1, r9);
        goto L_0x00e3;
    L_0x0058:
        r8 = r9.readString();
        r11 = r9.readString();
        r1 = com.google.android.gms.internal.mp.m5008a(r9);
        r2 = com.google.android.gms.internal.zzcff.CREATOR;
        r9 = com.google.android.gms.internal.mp.m5004a(r9, r2);
        r9 = (com.google.android.gms.internal.zzcff) r9;
        r8 = r7.mo1630a(r8, r11, r1, r9);
        goto L_0x00e3;
    L_0x0071:
        r8 = com.google.android.gms.internal.zzcfi.CREATOR;
        r8 = com.google.android.gms.internal.mp.m5004a(r9, r8);
        r8 = (com.google.android.gms.internal.zzcfi) r8;
        r7.mo1633a(r8);
        goto L_0x013d;
    L_0x007e:
        r8 = com.google.android.gms.internal.zzcfi.CREATOR;
        r8 = com.google.android.gms.internal.mp.m5004a(r9, r8);
        r8 = (com.google.android.gms.internal.zzcfi) r8;
        r11 = com.google.android.gms.internal.zzcff.CREATOR;
        r9 = com.google.android.gms.internal.mp.m5004a(r9, r11);
        r9 = (com.google.android.gms.internal.zzcff) r9;
        r7.mo1634a(r8, r9);
        goto L_0x013d;
    L_0x0093:
        r8 = com.google.android.gms.internal.zzcff.CREATOR;
        r8 = com.google.android.gms.internal.mp.m5004a(r9, r8);
        r8 = (com.google.android.gms.internal.zzcff) r8;
        r8 = r7.mo1640c(r8);
        r10.writeNoException();
        r10.writeString(r8);
        return r0;
    L_0x00a6:
        r2 = r9.readLong();
        r4 = r9.readString();
        r5 = r9.readString();
        r6 = r9.readString();
        r1 = r7;
        r1.mo1631a(r2, r4, r5, r6);
        goto L_0x013d;
    L_0x00bc:
        r8 = com.google.android.gms.internal.zzcfx.CREATOR;
        r8 = com.google.android.gms.internal.mp.m5004a(r9, r8);
        r8 = (com.google.android.gms.internal.zzcfx) r8;
        r9 = r9.readString();
        r8 = r7.mo1638a(r8, r9);
        r10.writeNoException();
        r10.writeByteArray(r8);
        return r0;
    L_0x00d3:
        r8 = com.google.android.gms.internal.zzcff.CREATOR;
        r8 = com.google.android.gms.internal.mp.m5004a(r9, r8);
        r8 = (com.google.android.gms.internal.zzcff) r8;
        r9 = com.google.android.gms.internal.mp.m5008a(r9);
        r8 = r7.mo1626a(r8, r9);
    L_0x00e3:
        r10.writeNoException();
        r10.writeTypedList(r8);
        return r0;
    L_0x00ea:
        r8 = com.google.android.gms.internal.zzcff.CREATOR;
        r8 = com.google.android.gms.internal.mp.m5004a(r9, r8);
        r8 = (com.google.android.gms.internal.zzcff) r8;
        r7.mo1639b(r8);
        goto L_0x013d;
    L_0x00f6:
        r8 = com.google.android.gms.internal.zzcfx.CREATOR;
        r8 = com.google.android.gms.internal.mp.m5004a(r9, r8);
        r8 = (com.google.android.gms.internal.zzcfx) r8;
        r11 = r9.readString();
        r9 = r9.readString();
        r7.mo1636a(r8, r11, r9);
        goto L_0x013d;
    L_0x010a:
        r8 = com.google.android.gms.internal.zzcff.CREATOR;
        r8 = com.google.android.gms.internal.mp.m5004a(r9, r8);
        r8 = (com.google.android.gms.internal.zzcff) r8;
        r7.mo1632a(r8);
        goto L_0x013d;
    L_0x0116:
        r8 = com.google.android.gms.internal.zzckk.CREATOR;
        r8 = com.google.android.gms.internal.mp.m5004a(r9, r8);
        r8 = (com.google.android.gms.internal.zzckk) r8;
        r11 = com.google.android.gms.internal.zzcff.CREATOR;
        r9 = com.google.android.gms.internal.mp.m5004a(r9, r11);
        r9 = (com.google.android.gms.internal.zzcff) r9;
        r7.mo1637a(r8, r9);
        goto L_0x013d;
    L_0x012a:
        r8 = com.google.android.gms.internal.zzcfx.CREATOR;
        r8 = com.google.android.gms.internal.mp.m5004a(r9, r8);
        r8 = (com.google.android.gms.internal.zzcfx) r8;
        r11 = com.google.android.gms.internal.zzcff.CREATOR;
        r9 = com.google.android.gms.internal.mp.m5004a(r9, r11);
        r9 = (com.google.android.gms.internal.zzcff) r9;
        r7.mo1635a(r8, r9);
    L_0x013d:
        r10.writeNoException();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.fm.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
