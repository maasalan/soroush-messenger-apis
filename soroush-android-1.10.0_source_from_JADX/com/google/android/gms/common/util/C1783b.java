package com.google.android.gms.common.util;

import android.util.Base64;

public final class C1783b {
    public static String m4516a(byte[] bArr) {
        return bArr == null ? null : Base64.encodeToString(bArr, 0);
    }

    public static String m4517b(byte[] bArr) {
        return bArr == null ? null : Base64.encodeToString(bArr, 10);
    }
}
