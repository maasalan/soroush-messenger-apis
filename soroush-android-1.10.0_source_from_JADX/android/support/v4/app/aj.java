package android.support.v4.app;

import android.os.Bundle;
import android.support.v4.app.ai.C0378a;
import java.util.ArrayList;
import java.util.Set;

final class aj {
    static Bundle[] m747a(C0378a[] c0378aArr) {
        if (c0378aArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[c0378aArr.length];
        for (int i = 0; i < c0378aArr.length; i++) {
            C0378a c0378a = c0378aArr[i];
            Bundle bundle = new Bundle();
            bundle.putString("resultKey", c0378a.mo227a());
            bundle.putCharSequence("label", c0378a.mo228b());
            bundle.putCharSequenceArray("choices", c0378a.mo229c());
            bundle.putBoolean("allowFreeFormInput", c0378a.mo231e());
            bundle.putBundle("extras", c0378a.mo232f());
            Set<String> d = c0378a.mo230d();
            if (!(d == null || d.isEmpty())) {
                ArrayList arrayList = new ArrayList(d.size());
                for (String add : d) {
                    arrayList.add(add);
                }
                bundle.putStringArrayList("allowedDataTypes", arrayList);
            }
            bundleArr[i] = bundle;
        }
        return bundleArr;
    }
}
