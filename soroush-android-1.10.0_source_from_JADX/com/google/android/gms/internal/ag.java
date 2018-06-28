package com.google.android.gms.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri.Builder;
import android.text.TextUtils;
import com.google.android.gms.analytics.C1677r;
import com.google.android.gms.common.internal.ac;
import com.google.android.gms.common.util.C1789i;
import java.io.Closeable;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.jivesoftware.smack.util.StringUtils;
import org.jivesoftware.smackx.jiveproperties.packet.JivePropertiesExtension;

final class ag extends C5506v implements Closeable {
    private static final String f18071a = String.format("CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' INTEGER NOT NULL, '%s' TEXT NOT NULL, '%s' TEXT NOT NULL, '%s' INTEGER);", new Object[]{"hits2", "hit_id", "hit_time", "hit_url", "hit_string", "hit_app_id"});
    private static final String f18072b = String.format("SELECT MAX(%s) FROM %s WHERE 1;", new Object[]{"hit_time", "hits2"});
    private final ah f18073c;
    private final ca f18074d = new ca(this.f6279f.f6285c);
    private final ca f18075e = new ca(this.f6279f.f6285c);

    ag(C1827x c1827x) {
        super(c1827x);
        this.f18073c = new ah(this, c1827x.f6283a, "google_analytics_v4.db");
    }

    private final long m15934a(String str) {
        Object e;
        Throwable th;
        Cursor rawQuery;
        try {
            rawQuery = m15955o().rawQuery(str, null);
            try {
                if (rawQuery.moveToFirst()) {
                    long j = rawQuery.getLong(0);
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                    return j;
                }
                throw new SQLiteException("Database returned empty set");
            } catch (SQLiteException e2) {
                e = e2;
                try {
                    m5152d("Database error", str, e);
                    throw e;
                } catch (Throwable th2) {
                    th = th2;
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                    throw th;
                }
            }
        } catch (SQLiteException e3) {
            e = e3;
            rawQuery = null;
            m5152d("Database error", str, e);
            throw e;
        } catch (Throwable th3) {
            th = th3;
            rawQuery = null;
            if (rawQuery != null) {
                rawQuery.close();
            }
            throw th;
        }
    }

    private final long m15935a(String str, String[] strArr) {
        Object e;
        Throwable th;
        Cursor cursor = null;
        try {
            Cursor rawQuery = m15955o().rawQuery(str, strArr);
            try {
                if (rawQuery.moveToFirst()) {
                    long j = rawQuery.getLong(0);
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                    return j;
                }
                if (rawQuery != null) {
                    rawQuery.close();
                }
                return 0;
            } catch (SQLiteException e2) {
                e = e2;
                cursor = rawQuery;
                try {
                    m5152d("Database error", str, e);
                    throw e;
                } catch (Throwable th2) {
                    th = th2;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                cursor = rawQuery;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            m5152d("Database error", str, e);
            throw e;
        }
    }

    private final List<Long> m15937c(long j) {
        Object e;
        Throwable th;
        C1677r.m4275b();
        m12037k();
        if (j <= 0) {
            return Collections.emptyList();
        }
        SQLiteDatabase o = m15955o();
        List<Long> arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            Cursor query = o.query("hits2", new String[]{"hit_id"}, null, null, null, null, String.format("%s ASC", new Object[]{"hit_id"}), Long.toString(j));
            try {
                if (query.moveToFirst()) {
                    do {
                        arrayList.add(Long.valueOf(query.getLong(0)));
                    } while (query.moveToNext());
                }
                if (query != null) {
                    query.close();
                    return arrayList;
                }
            } catch (SQLiteException e2) {
                e = e2;
                cursor = query;
                try {
                    m5151d("Error selecting hit ids", e);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return arrayList;
                } catch (Throwable th2) {
                    th = th2;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                cursor = query;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            m5151d("Error selecting hit ids", e);
            if (cursor != null) {
                cursor.close();
            }
            return arrayList;
        }
        return arrayList;
    }

    private final Map<String, String> m15938g(String str) {
        if (TextUtils.isEmpty(str)) {
            return new HashMap(0);
        }
        try {
            if (!str.startsWith("?")) {
                String str2 = "?";
                str = String.valueOf(str);
                str = str.length() != 0 ? str2.concat(str) : new String(str2);
            }
            return C1789i.m4528a(new URI(str), StringUtils.UTF8);
        } catch (URISyntaxException e) {
            m5154e("Error parsing hit parameters", e);
            return new HashMap(0);
        }
    }

    private final Map<String, String> m15939h(String str) {
        if (TextUtils.isEmpty(str)) {
            return new HashMap(0);
        }
        try {
            String str2 = "?";
            str = String.valueOf(str);
            return C1789i.m4528a(new URI(str.length() != 0 ? str2.concat(str) : new String(str2)), StringUtils.UTF8);
        } catch (URISyntaxException e) {
            m5154e("Error parsing property parameters", e);
            return new HashMap(0);
        }
    }

    private final long m15942r() {
        C1677r.m4275b();
        m12037k();
        return m15934a("SELECT COUNT(*) FROM hits2");
    }

    public final long m15943a(long j, String str, String str2) {
        ac.m4378a(str);
        ac.m4378a(str2);
        m12037k();
        C1677r.m4275b();
        return m15935a("SELECT hits_count FROM properties WHERE app_uid=? AND cid=? AND tid=?", new String[]{String.valueOf(j), str, str2});
    }

    public final List<bk> m15944a(long j) {
        SQLiteException e;
        SQLiteException sQLiteException;
        Throwable th;
        Throwable th2;
        C1825u c1825u = this;
        int i = 0;
        ac.m4385b(j >= 0);
        C1677r.m4275b();
        m12037k();
        SQLiteDatabase o = m15955o();
        Cursor query;
        try {
            String[] strArr = new String[5];
            strArr[0] = "hit_id";
            strArr[1] = "hit_time";
            int i2 = 2;
            strArr[2] = "hit_string";
            int i3 = 3;
            strArr[3] = "hit_url";
            int i4 = 4;
            strArr[4] = "hit_app_id";
            query = o.query("hits2", strArr, null, null, null, null, String.format("%s ASC", new Object[]{"hit_id"}), Long.toString(j));
            try {
                List<bk> arrayList = new ArrayList();
                if (query.moveToFirst()) {
                    while (true) {
                        long j2 = query.getLong(i);
                        long j3 = query.getLong(1);
                        String string = query.getString(i2);
                        String string2 = query.getString(i3);
                        bk bkVar = r1;
                        int i5 = i3;
                        int i6 = i4;
                        long j4 = j2;
                        int i7 = i2;
                        bk bkVar2 = new bk(c1825u, m15938g(string), j3, ce.m4657e(string2), j4, query.getInt(i4));
                        arrayList.add(bkVar);
                        if (!query.moveToNext()) {
                            break;
                        }
                        i2 = i7;
                        i3 = i5;
                        i4 = i6;
                        i = 0;
                    }
                }
                if (query != null) {
                    query.close();
                }
                return arrayList;
            } catch (SQLiteException e2) {
                e = e2;
                sQLiteException = e;
                try {
                    m5154e("Error loading hits from the database", sQLiteException);
                    throw sQLiteException;
                } catch (Throwable th3) {
                    th = th3;
                    th2 = th;
                    if (query != null) {
                        query.close();
                    }
                    throw th2;
                }
            }
        } catch (SQLiteException e3) {
            e = e3;
            query = null;
            sQLiteException = e;
            m5154e("Error loading hits from the database", sQLiteException);
            throw sQLiteException;
        } catch (Throwable th4) {
            th = th4;
            query = null;
            th2 = th;
            if (query != null) {
                query.close();
            }
            throw th2;
        }
    }

    public final void m15945a(bk bkVar) {
        ac.m4376a((Object) bkVar);
        C1677r.m4275b();
        m12037k();
        ac.m4376a((Object) bkVar);
        Builder builder = new Builder();
        for (Entry entry : bkVar.f5587a.entrySet()) {
            String str = (String) entry.getKey();
            if (!("ht".equals(str) || "qt".equals(str) || "AppUID".equals(str))) {
                builder.appendQueryParameter(str, (String) entry.getValue());
            }
        }
        String encodedQuery = builder.build().getEncodedQuery();
        if (encodedQuery == null) {
            encodedQuery = "";
        }
        if (encodedQuery.length() > 8192) {
            this.f6279f.m5160a().m15992a(bkVar, "Hit length exceeds the maximum allowed size");
            return;
        }
        int intValue = ((Integer) bf.f5561c.f5585a).intValue();
        long r = m15942r();
        if (r > ((long) (intValue - 1))) {
            List c = m15937c((r - ((long) intValue)) + 1);
            m5151d("Store full, deleting hits to make room, count", Integer.valueOf(c.size()));
            m15946a(c);
        }
        SQLiteDatabase o = m15955o();
        ContentValues contentValues = new ContentValues();
        contentValues.put("hit_string", encodedQuery);
        contentValues.put("hit_time", Long.valueOf(bkVar.f5590d));
        contentValues.put("hit_app_id", Integer.valueOf(bkVar.f5591e));
        contentValues.put("hit_url", bkVar.f5592f ? ax.m4592h() : ax.m4593i());
        try {
            long insert = o.insert("hits2", null, contentValues);
            if (insert == -1) {
                m5155f("Failed to insert a hit (got -1)");
            } else {
                m5145b("Hit saved to database. db-id, hit", Long.valueOf(insert), bkVar);
            }
        } catch (SQLiteException e) {
            m5154e("Error storing a hit", e);
        }
    }

    public final void m15946a(List<Long> list) {
        ac.m4376a((Object) list);
        C1677r.m4275b();
        m12037k();
        if (!list.isEmpty()) {
            StringBuilder stringBuilder = new StringBuilder("hit_id");
            stringBuilder.append(" in (");
            int i = 0;
            while (i < list.size()) {
                Long l = (Long) list.get(i);
                if (l != null) {
                    if (l.longValue() != 0) {
                        if (i > 0) {
                            stringBuilder.append(",");
                        }
                        stringBuilder.append(l);
                        i++;
                    }
                }
                throw new SQLiteException("Invalid hit id");
            }
            stringBuilder.append(")");
            String stringBuilder2 = stringBuilder.toString();
            try {
                SQLiteDatabase o = m15955o();
                m5140a("Deleting dispatched hits. count", Integer.valueOf(list.size()));
                i = o.delete("hits2", stringBuilder2, null);
                if (i != list.size()) {
                    m5146b("Deleted fewer hits then expected", Integer.valueOf(list.size()), Integer.valueOf(i), stringBuilder2);
                }
            } catch (SQLiteException e) {
                m5154e("Error deleting hits", e);
                throw e;
            }
        }
    }

    public final void m15947b() {
        m12037k();
        m15955o().beginTransaction();
    }

    public final void m15948b(long j) {
        C1677r.m4275b();
        m12037k();
        List arrayList = new ArrayList(1);
        arrayList.add(Long.valueOf(j));
        m5140a("Deleting hit, id", Long.valueOf(j));
        m15946a(arrayList);
    }

    public final void m15949c() {
        m12037k();
        m15955o().setTransactionSuccessful();
    }

    protected final void c_() {
    }

    public final void close() {
        Object e;
        String str;
        try {
            this.f18073c.close();
        } catch (SQLiteException e2) {
            e = e2;
            str = "Sql error closing database";
            m5154e(str, e);
        } catch (IllegalStateException e3) {
            e = e3;
            str = "Error closing database";
            m5154e(str, e);
        }
    }

    public final void m15950d() {
        m12037k();
        m15955o().endTransaction();
    }

    final boolean m15951e() {
        return m15942r() == 0;
    }

    public final int m15952f() {
        C1677r.m4275b();
        m12037k();
        if (!this.f18074d.m4642a(86400000)) {
            return 0;
        }
        this.f18074d.m4641a();
        m5143b("Deleting stale hits (if any)");
        long a = this.f6279f.f6285c.mo1575a() - 2592000000L;
        int delete = m15955o().delete("hits2", "hit_time < ?", new String[]{Long.toString(a)});
        m5140a("Deleted stale hits, count", Integer.valueOf(delete));
        return delete;
    }

    public final long m15953m() {
        C1677r.m4275b();
        m12037k();
        return m15935a(f18072b, null);
    }

    public final List<aa> m15954n() {
        Cursor cursor;
        Object obj;
        Throwable th;
        Throwable th2;
        C1825u c1825u = this;
        m12037k();
        C1677r.m4275b();
        SQLiteDatabase o = m15955o();
        try {
            String[] strArr = new String[]{"cid", "tid", "adid", "hits_count", "params"};
            int intValue = ((Integer) bf.f5562d.f5585a).intValue();
            String[] strArr2 = new String[]{"0"};
            int i = intValue;
            Cursor query = o.query(JivePropertiesExtension.ELEMENT, strArr, "app_uid=?", strArr2, null, null, null, String.valueOf(intValue));
            try {
                List<aa> arrayList = new ArrayList();
                if (query.moveToFirst()) {
                    do {
                        CharSequence string = query.getString(0);
                        CharSequence string2 = query.getString(1);
                        boolean z = query.getInt(2) != 0;
                        long j = (long) query.getInt(3);
                        Map h = m15939h(query.getString(4));
                        if (!TextUtils.isEmpty(string)) {
                            if (!TextUtils.isEmpty(string2)) {
                                arrayList.add(new aa(string, string2, z, j, h));
                            }
                        }
                        m5149c("Read property with empty client id or tracker id", string, string2);
                    } while (query.moveToNext());
                }
                if (arrayList.size() >= i) {
                    m5153e("Sending hits to too many properties. Campaign report might be incorrect");
                }
                if (query != null) {
                    query.close();
                }
                return arrayList;
            } catch (SQLiteException e) {
                cursor = query;
                obj = e;
                try {
                    m5154e("Error loading hits from the database", obj);
                    throw obj;
                } catch (Throwable th3) {
                    th = th3;
                    th2 = th;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                th = th4;
                cursor = query;
                th2 = th;
                if (cursor != null) {
                    cursor.close();
                }
                throw th2;
            }
        } catch (SQLiteException e2) {
            obj = e2;
            cursor = null;
            m5154e("Error loading hits from the database", obj);
            throw obj;
        } catch (Throwable th5) {
            th2 = th5;
            cursor = null;
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }

    final SQLiteDatabase m15955o() {
        try {
            return this.f18073c.getWritableDatabase();
        } catch (SQLiteException e) {
            m5151d("Error opening database", e);
            throw e;
        }
    }
}
