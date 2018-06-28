package mobi.mmdt.ott.provider.p382d;

import android.content.Context;
import android.net.Uri;
import mobi.mmdt.ott.provider.p381c.C2953a;

public final class C6014c extends C2953a {
    public final int m13304a(Context context, C6013a c6013a) {
        return context.getContentResolver().update(C2958b.f9195a, m7350b(), c6013a.f9181a.toString(), c6013a.m7370e());
    }

    public final Uri mo2224a() {
        return C2958b.f9195a;
    }

    public final C6014c m13306a(Integer num) {
        this.a.put("TransactionStatus", num);
        return this;
    }

    public final C6014c m13307a(String str) {
        this.a.put("UniqueId", str);
        return this;
    }

    public final C6014c m13308b(String str) {
        this.a.put("BillId", str);
        return this;
    }

    public final C6014c m13309c() {
        this.a.put("RefId", null);
        return this;
    }

    public final C6014c m13310c(String str) {
        this.a.put("PaymentId", str);
        return this;
    }

    public final C6014c m13311d(String str) {
        this.a.put("Amount", str);
        return this;
    }

    public final C6014c m13312e(String str) {
        this.a.put("TransactionId", str);
        return this;
    }

    public final C6014c m13313f(String str) {
        this.a.put("TransactionTime", str);
        return this;
    }
}
