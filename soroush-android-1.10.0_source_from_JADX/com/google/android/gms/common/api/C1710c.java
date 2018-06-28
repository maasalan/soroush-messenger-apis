package com.google.android.gms.common.api;

import android.support.v4.p038g.C4813a;
import android.text.TextUtils;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.aj;
import java.util.ArrayList;

public final class C1710c extends Exception {
    private final C4813a<aj<?>, ConnectionResult> f5217a;

    public C1710c(C4813a<aj<?>, ConnectionResult> c4813a) {
        this.f5217a = c4813a;
    }

    public final String getMessage() {
        Iterable arrayList = new ArrayList();
        Object obj = 1;
        for (aj ajVar : this.f5217a.keySet()) {
            ConnectionResult connectionResult = (ConnectionResult) this.f5217a.get(ajVar);
            if (connectionResult.m15870b()) {
                obj = null;
            }
            String str = ajVar.f5238a.f5213c;
            String valueOf = String.valueOf(connectionResult);
            StringBuilder stringBuilder = new StringBuilder((2 + String.valueOf(str).length()) + String.valueOf(valueOf).length());
            stringBuilder.append(str);
            stringBuilder.append(": ");
            stringBuilder.append(valueOf);
            arrayList.add(stringBuilder.toString());
        }
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(obj != null ? "None of the queried APIs are available. " : "Some of the queried APIs are unavailable. ");
        stringBuilder2.append(TextUtils.join("; ", arrayList));
        return stringBuilder2.toString();
    }
}
