package com.google.android.gms.analytics;

import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import android.util.LogPrinter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class C5438m implements C1680u {
    private static final Uri f15095a;
    private final LogPrinter f15096b = new LogPrinter(4, "GA/LogCatTransport");

    static {
        Builder builder = new Builder();
        builder.scheme("uri");
        builder.authority("local");
        f15095a = builder.build();
    }

    public final Uri mo1537a() {
        return f15095a;
    }

    public final void mo1538a(C1671o c1671o) {
        List arrayList = new ArrayList(c1671o.f5154h.values());
        Collections.sort(arrayList, new C1670n());
        StringBuilder stringBuilder = new StringBuilder();
        ArrayList arrayList2 = (ArrayList) arrayList;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            obj = ((C1672p) obj).toString();
            if (!TextUtils.isEmpty(obj)) {
                if (stringBuilder.length() != 0) {
                    stringBuilder.append(", ");
                }
                stringBuilder.append(obj);
            }
        }
        this.f15096b.println(stringBuilder.toString());
    }
}
