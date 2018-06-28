package com.google.android.gms.internal;

import android.os.IInterface;
import com.google.android.gms.p158a.C1644a;

public interface eh extends IInterface {
    boolean getBooleanFlagValue(String str, boolean z, int i);

    int getIntFlagValue(String str, int i, int i2);

    long getLongFlagValue(String str, long j, int i);

    String getStringFlagValue(String str, String str2, int i);

    void init(C1644a c1644a);
}
