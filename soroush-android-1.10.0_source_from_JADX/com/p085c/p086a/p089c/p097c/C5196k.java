package com.p085c.p086a.p089c.p097c;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.p085c.p086a.C1251g;
import com.p085c.p086a.p089c.C1102a;
import com.p085c.p086a.p089c.C5253j;
import com.p085c.p086a.p089c.p090a.C1096b;
import com.p085c.p086a.p089c.p090a.C1096b.C1095a;
import com.p085c.p086a.p089c.p090a.p091a.C1092b;
import com.p085c.p086a.p089c.p097c.C1173m.C1172a;
import com.p085c.p086a.p108h.C5277c;
import java.io.File;
import java.io.FileNotFoundException;

public final class C5196k implements C1173m<Uri, File> {
    private final Context f14518a;

    public static final class C5194a implements C1174n<Uri, File> {
        private final Context f14514a;

        public C5194a(Context context) {
            this.f14514a = context;
        }

        public final C1173m<Uri, File> mo1184a(C1180q c1180q) {
            return new C5196k(this.f14514a);
        }
    }

    private static class C5195b implements C1096b<File> {
        private static final String[] f14515a = new String[]{"_data"};
        private final Context f14516b;
        private final Uri f14517c;

        C5195b(Context context, Uri uri) {
            this.f14516b = context;
            this.f14517c = uri;
        }

        public final void mo1108a() {
        }

        public final void mo1109a(C1251g c1251g, C1095a<? super File> c1095a) {
            Cursor query = this.f14516b.getContentResolver().query(this.f14517c, f14515a, null, null, null);
            Object obj = null;
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        obj = query.getString(query.getColumnIndexOrThrow("_data"));
                    }
                    query.close();
                } catch (Throwable th) {
                    query.close();
                }
            }
            if (TextUtils.isEmpty(obj)) {
                StringBuilder stringBuilder = new StringBuilder("Failed to find file path for: ");
                stringBuilder.append(this.f14517c);
                c1095a.mo1140a(new FileNotFoundException(stringBuilder.toString()));
                return;
            }
            c1095a.mo1141a(new File(obj));
        }

        public final void mo1110b() {
        }

        public final C1102a mo1111c() {
            return C1102a.LOCAL;
        }

        public final Class<File> mo1112d() {
            return File.class;
        }
    }

    C5196k(Context context) {
        this.f14518a = context;
    }

    public final /* synthetic */ C1172a mo1185a(Object obj, int i, int i2, C5253j c5253j) {
        Uri uri = (Uri) obj;
        return new C1172a(new C5277c(uri), new C5195b(this.f14518a, uri));
    }

    public final /* bridge */ /* synthetic */ boolean mo1186a(Object obj) {
        return C1092b.m2656a((Uri) obj);
    }
}
