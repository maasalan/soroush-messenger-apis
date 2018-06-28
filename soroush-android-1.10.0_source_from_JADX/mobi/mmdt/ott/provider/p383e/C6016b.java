package mobi.mmdt.ott.provider.p383e;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import mobi.mmdt.ott.logic.p261a.p329x.C2763c;
import mobi.mmdt.ott.provider.p381c.C2953a;

public final class C6016b extends C2953a {
    public final int m13314a(Context context, C6018d c6018d) {
        ContentResolver contentResolver = context.getContentResolver();
        Uri uri = C2961a.f9199a;
        ContentValues b = m7350b();
        String[] strArr = null;
        String stringBuilder = c6018d == null ? null : c6018d.f9181a.toString();
        if (c6018d != null) {
            strArr = c6018d.m7370e();
        }
        return contentResolver.update(uri, b, stringBuilder, strArr);
    }

    public final Uri mo2224a() {
        return C2961a.f9199a;
    }

    public final C6016b m13316a(Integer num) {
        this.a.put("TransactionStatus", num);
        return this;
    }

    public final C6016b m13317a(String str) {
        this.a.put("ChargeId", str);
        return this;
    }

    public final C6016b m13318a(C2763c c2763c) {
        this.a.put("PaymentType", Integer.valueOf(c2763c != null ? c2763c.ordinal() : 0));
        return this;
    }

    public final C6016b m13319a(boolean z) {
        this.a.put("IsFavorite", Integer.valueOf(z));
        return this;
    }

    public final C6016b m13320b(Integer num) {
        this.a.put("Operator", num);
        return this;
    }

    public final C6016b m13321b(String str) {
        this.a.put("CartNumber", str);
        return this;
    }

    public final C6016b m13322c(Integer num) {
        this.a.put("ChargeType", num);
        return this;
    }

    public final C6016b m13323c(String str) {
        this.a.put("PhoneNumber", str);
        return this;
    }

    public final C6016b m13324d(Integer num) {
        this.a.put("IsTarabord", num);
        return this;
    }

    public final C6016b m13325d(String str) {
        this.a.put("Amount", str);
        return this;
    }

    public final C6016b m13326e(String str) {
        this.a.put("RefId", str);
        return this;
    }

    public final C6016b m13327f(String str) {
        this.a.put("TransactionId", str);
        return this;
    }

    public final C6016b m13328g(String str) {
        this.a.put("TransactionTime", str);
        return this;
    }
}
