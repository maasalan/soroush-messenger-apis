package com.google.android.gms.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.support.v4.p038g.C4813a;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.ac;
import java.io.File;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.jivesoftware.smack.util.StringUtils;
import org.jivesoftware.smackx.csi.packet.ClientStateIndication.Active;
import org.jivesoftware.smackx.iot.data.element.TimestampElement;
import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;

final class ex extends hq {
    private static final String[] f18109a = new String[]{"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;"};
    private static final String[] f18110b = new String[]{"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    private static final String[] f18111c = new String[]{"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;"};
    private static final String[] f18112d = new String[]{"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
    private static final String[] f18113e = new String[]{"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;"};
    private static final String[] f18114f = new String[]{"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};
    private final fa f18115g = new fa(this, mo1615l(), "google_app_measurement.db");
    private final jp f18116h = new jp(mo1614k());

    ex(gr grVar) {
        super(grVar);
    }

    private final boolean m16045O() {
        return mo1615l().getDatabasePath("google_app_measurement.db").exists();
    }

    private final Object m16047a(Cursor cursor, int i) {
        int type = cursor.getType(i);
        switch (type) {
            case 0:
                mo1623t().f18134a.m4846a("Loaded invalid null value from database");
                return null;
            case 1:
                return Long.valueOf(cursor.getLong(i));
            case 2:
                return Double.valueOf(cursor.getDouble(i));
            case 3:
                return cursor.getString(i);
            case 4:
                mo1623t().f18134a.m4846a("Loaded invalid blob type value, ignoring it");
                return null;
            default:
                mo1623t().f18134a.m4847a("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
                return null;
        }
    }

    private static Set<String> m16048a(SQLiteDatabase sQLiteDatabase, String str) {
        Object hashSet = new HashSet();
        StringBuilder stringBuilder = new StringBuilder(22 + String.valueOf(str).length());
        stringBuilder.append("SELECT * FROM ");
        stringBuilder.append(str);
        stringBuilder.append(" LIMIT 0");
        Cursor rawQuery = sQLiteDatabase.rawQuery(stringBuilder.toString(), null);
        try {
            Collections.addAll(hashSet, rawQuery.getColumnNames());
            return hashSet;
        } finally {
            rawQuery.close();
        }
    }

    private static void m16049a(ContentValues contentValues, String str, Object obj) {
        ac.m4378a(str);
        ac.m4376a(obj);
        if (obj instanceof String) {
            contentValues.put(str, (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put(str, (Long) obj);
        } else if (obj instanceof Double) {
            contentValues.put(str, (Double) obj);
        } else {
            throw new IllegalArgumentException("Invalid value type");
        }
    }

    static void m16050a(ft ftVar, SQLiteDatabase sQLiteDatabase) {
        if (ftVar == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        }
        File file = new File(sQLiteDatabase.getPath());
        if (!file.setReadable(false, false)) {
            ftVar.f18136c.m4846a("Failed to turn off database read permission");
        }
        if (!file.setWritable(false, false)) {
            ftVar.f18136c.m4846a("Failed to turn off database write permission");
        }
        if (!file.setReadable(true, true)) {
            ftVar.f18136c.m4846a("Failed to turn on database read permission for owner");
        }
        if (!file.setWritable(true, true)) {
            ftVar.f18136c.m4846a("Failed to turn on database write permission for owner");
        }
    }

    static void m16051a(ft ftVar, SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, String[] strArr) {
        if (ftVar == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        }
        if (!m16053a(ftVar, sQLiteDatabase, str)) {
            sQLiteDatabase.execSQL(str2);
        }
        try {
            m16052a(ftVar, sQLiteDatabase, str, str3, strArr);
        } catch (SQLiteException e) {
            ftVar.f18134a.m4847a("Failed to verify columns on table that was just created", str);
            throw e;
        }
    }

    private static void m16052a(ft ftVar, SQLiteDatabase sQLiteDatabase, String str, String str2, String[] strArr) {
        if (ftVar == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        }
        Iterable a = m16048a(sQLiteDatabase, str);
        String[] split = str2.split(",");
        int i = 0;
        int length = split.length;
        int i2 = 0;
        while (i2 < length) {
            String str3 = split[i2];
            if (a.remove(str3)) {
                i2++;
            } else {
                StringBuilder stringBuilder = new StringBuilder((35 + String.valueOf(str).length()) + String.valueOf(str3).length());
                stringBuilder.append("Table ");
                stringBuilder.append(str);
                stringBuilder.append(" is missing required column: ");
                stringBuilder.append(str3);
                throw new SQLiteException(stringBuilder.toString());
            }
        }
        if (strArr != null) {
            while (i < strArr.length) {
                if (!a.remove(strArr[i])) {
                    sQLiteDatabase.execSQL(strArr[i + 1]);
                }
                i += 2;
            }
        }
        if (!a.isEmpty()) {
            ftVar.f18136c.m4848a("Table has extra columns. table, columns", str, TextUtils.join(", ", a));
        }
    }

    private static boolean m16053a(ft ftVar, SQLiteDatabase sQLiteDatabase, String str) {
        Object obj;
        Throwable th;
        if (ftVar == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        }
        Cursor cursor = null;
        try {
            SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
            Cursor query = sQLiteDatabase2.query("SQLITE_MASTER", new String[]{"name"}, "name=?", new String[]{str}, null, null, null);
            try {
                boolean moveToFirst = query.moveToFirst();
                if (query != null) {
                    query.close();
                }
                return moveToFirst;
            } catch (SQLiteException e) {
                SQLiteException sQLiteException = e;
                cursor = query;
                obj = sQLiteException;
                try {
                    ftVar.f18136c.m4848a("Error querying for table", str, obj);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return false;
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
        } catch (SQLiteException e2) {
            obj = e2;
            ftVar.f18136c.m4848a("Error querying for table", str, obj);
            if (cursor != null) {
                cursor.close();
            }
            return false;
        }
    }

    private final boolean m16054a(String str, int i, jw jwVar) {
        m11975L();
        mo1606c();
        ac.m4378a(str);
        ac.m4376a((Object) jwVar);
        if (TextUtils.isEmpty(jwVar.f18228b)) {
            mo1623t().f18136c.m4849a("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", ft.m16220a(str), Integer.valueOf(i), String.valueOf(jwVar.f18227a));
            return false;
        }
        try {
            byte[] bArr = new byte[jwVar.m5129f()];
            oa a = oa.m5073a(bArr, bArr.length);
            jwVar.mo1667a(a);
            a.m5085a();
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", str);
            contentValues.put("audience_id", Integer.valueOf(i));
            contentValues.put("filter_id", jwVar.f18227a);
            contentValues.put("event_name", jwVar.f18228b);
            contentValues.put("data", bArr);
            try {
                if (m16057A().insertWithOnConflict("event_filters", null, contentValues, 5) == -1) {
                    mo1623t().f18134a.m4847a("Failed to insert event filter (got -1). appId", ft.m16220a(str));
                }
                return true;
            } catch (SQLiteException e) {
                mo1623t().f18134a.m4848a("Error storing event filter. appId", ft.m16220a(str), e);
                return false;
            }
        } catch (IOException e2) {
            mo1623t().f18134a.m4848a("Configuration loss. Failed to serialize event filter. appId", ft.m16220a(str), e2);
            return false;
        }
    }

    private final boolean m16055a(String str, int i, jz jzVar) {
        m11975L();
        mo1606c();
        ac.m4378a(str);
        ac.m4376a((Object) jzVar);
        if (TextUtils.isEmpty(jzVar.f18244b)) {
            mo1623t().f18136c.m4849a("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", ft.m16220a(str), Integer.valueOf(i), String.valueOf(jzVar.f18243a));
            return false;
        }
        try {
            byte[] bArr = new byte[jzVar.m5129f()];
            oa a = oa.m5073a(bArr, bArr.length);
            jzVar.mo1667a(a);
            a.m5085a();
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", str);
            contentValues.put("audience_id", Integer.valueOf(i));
            contentValues.put("filter_id", jzVar.f18243a);
            contentValues.put("property_name", jzVar.f18244b);
            contentValues.put("data", bArr);
            try {
                if (m16057A().insertWithOnConflict("property_filters", null, contentValues, 5) != -1) {
                    return true;
                }
                mo1623t().f18134a.m4847a("Failed to insert property filter (got -1). appId", ft.m16220a(str));
                return false;
            } catch (SQLiteException e) {
                mo1623t().f18134a.m4848a("Error storing property filter. appId", ft.m16220a(str), e);
                return false;
            }
        } catch (IOException e2) {
            mo1623t().f18134a.m4848a("Configuration loss. Failed to serialize property filter. appId", ft.m16220a(str), e2);
            return false;
        }
    }

    private final boolean m16056a(String str, List<Integer> list) {
        ac.m4378a(str);
        m11975L();
        mo1606c();
        SQLiteDatabase A = m16057A();
        try {
            if (m16062a("select count(1) from audience_filter_values where app_id=?", new String[]{str}) <= ((long) Math.max(0, Math.min(2000, mo1625v().m11921b(str, fj.f5752H))))) {
                return false;
            }
            Iterable arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                Integer num = (Integer) list.get(i);
                if (num == null || !(num instanceof Integer)) {
                    return false;
                }
                arrayList.add(Integer.toString(num.intValue()));
            }
            String join = TextUtils.join(",", arrayList);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(join).length() + 2);
            stringBuilder.append("(");
            stringBuilder.append(join);
            stringBuilder.append(")");
            join = stringBuilder.toString();
            StringBuilder stringBuilder2 = new StringBuilder(140 + String.valueOf(join).length());
            stringBuilder2.append("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ");
            stringBuilder2.append(join);
            stringBuilder2.append(" order by rowid desc limit -1 offset ?)");
            return A.delete("audience_filter_values", stringBuilder2.toString(), new String[]{str, Integer.toString(r2)}) > 0;
        } catch (SQLiteException e) {
            mo1623t().f18134a.m4848a("Database error querying filters. appId", ft.m16220a(str), e);
            return false;
        }
    }

    final SQLiteDatabase m16057A() {
        mo1606c();
        try {
            return this.f18115g.getWritableDatabase();
        } catch (SQLiteException e) {
            mo1623t().f18136c.m4847a("Error opening database", e);
            throw e;
        }
    }

    public final String m16058B() {
        Cursor rawQuery;
        Object e;
        Throwable th;
        try {
            rawQuery = m16057A().rawQuery("select app_id from queue order by has_realtime desc, rowid asc limit 1;", null);
            try {
                if (rawQuery.moveToFirst()) {
                    String string = rawQuery.getString(0);
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                    return string;
                }
                if (rawQuery != null) {
                    rawQuery.close();
                }
                return null;
            } catch (SQLiteException e2) {
                e = e2;
                try {
                    mo1623t().f18134a.m4847a("Database error getting next bundle app id", e);
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                    return null;
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
            mo1623t().f18134a.m4847a("Database error getting next bundle app id", e);
            if (rawQuery != null) {
                rawQuery.close();
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
            rawQuery = null;
            if (rawQuery != null) {
                rawQuery.close();
            }
            throw th;
        }
    }

    final void m16059C() {
        mo1606c();
        m11975L();
        if (m16045O()) {
            long a = mo1624u().f18151f.m4854a();
            long b = mo1614k().mo1576b();
            if (Math.abs(b - a) > ((Long) fj.f5745A.f5786a).longValue()) {
                mo1624u().f18151f.m4855a(b);
                mo1606c();
                m11975L();
                if (m16045O()) {
                    int delete = m16057A().delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(mo1614k().mo1575a()), String.valueOf(ew.m11915y())});
                    if (delete > 0) {
                        mo1623t().f18140g.m4847a("Deleted stale rows. rowsDeleted", Integer.valueOf(delete));
                    }
                }
            }
        }
    }

    public final long m16060D() {
        Object obj;
        Throwable th;
        Cursor cursor = null;
        try {
            Cursor rawQuery = m16057A().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
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
                return -1;
            } catch (SQLiteException e) {
                Cursor cursor2 = rawQuery;
                obj = e;
                cursor = cursor2;
                try {
                    mo1623t().f18134a.m4847a("Error querying raw events", obj);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return -1;
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
        } catch (SQLiteException e2) {
            obj = e2;
            mo1623t().f18134a.m4847a("Error querying raw events", obj);
            if (cursor != null) {
                cursor.close();
            }
            return -1;
        }
    }

    public final long m16061a(ki kiVar) {
        mo1606c();
        m11975L();
        ac.m4376a((Object) kiVar);
        ac.m4378a(kiVar.f18306o);
        try {
            long j;
            Object obj = new byte[kiVar.m5129f()];
            oa a = oa.m5073a((byte[]) obj, obj.length);
            kiVar.mo1667a(a);
            a.m5085a();
            hp p = mo1619p();
            ac.m4376a(obj);
            p.mo1606c();
            MessageDigest f = ju.m16583f(StringUtils.MD5);
            if (f == null) {
                p.mo1623t().f18134a.m4846a("Failed to get MD5");
                j = 0;
            } else {
                j = ju.m16579c(f.digest(obj));
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", kiVar.f18306o);
            contentValues.put("metadata_fingerprint", Long.valueOf(j));
            contentValues.put("metadata", obj);
            try {
                m16057A().insertWithOnConflict("raw_events_metadata", null, contentValues, 4);
                return j;
            } catch (SQLiteException e) {
                mo1623t().f18134a.m4848a("Error storing raw event metadata. appId", ft.m16220a(kiVar.f18306o), e);
                throw e;
            }
        } catch (IOException e2) {
            mo1623t().f18134a.m4848a("Data loss. Failed to serialize event metadata. appId", ft.m16220a(kiVar.f18306o), e2);
            throw e2;
        }
    }

    final long m16062a(String str, String[] strArr) {
        Object e;
        Throwable th;
        Cursor cursor = null;
        try {
            Cursor rawQuery = m16057A().rawQuery(str, strArr);
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
                cursor = rawQuery;
                try {
                    mo1623t().f18134a.m4848a("Database error", str, e);
                    throw e;
                } catch (Throwable th2) {
                    th = th2;
                    rawQuery = cursor;
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                if (rawQuery != null) {
                    rawQuery.close();
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            mo1623t().f18134a.m4848a("Database error", str, e);
            throw e;
        }
    }

    final long m16063a(String str, String[] strArr, long j) {
        Object e;
        Throwable th;
        Cursor cursor = null;
        try {
            Cursor rawQuery = m16057A().rawQuery(str, strArr);
            try {
                if (rawQuery.moveToFirst()) {
                    j = rawQuery.getLong(0);
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                    return j;
                }
                if (rawQuery != null) {
                    rawQuery.close();
                }
                return j;
            } catch (SQLiteException e2) {
                e = e2;
                cursor = rawQuery;
                try {
                    mo1623t().f18134a.m4848a("Database error", str, e);
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
            mo1623t().f18134a.m4848a("Database error", str, e);
            throw e;
        }
    }

    public final ey m16064a(long j, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        Cursor query;
        Object obj;
        Cursor cursor;
        Throwable th;
        ac.m4378a(str);
        mo1606c();
        m11975L();
        String[] strArr = new String[]{str};
        ey eyVar = new ey();
        try {
            SQLiteDatabase A = m16057A();
            String[] strArr2 = new String[]{str};
            SQLiteDatabase sQLiteDatabase = A;
            int i = 5;
            i = 4;
            i = 3;
            i = 2;
            query = sQLiteDatabase.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count"}, "app_id=?", strArr2, null, null, null);
            try {
                if (query.moveToFirst()) {
                    if (query.getLong(0) == j) {
                        eyVar.f5717b = query.getLong(1);
                        eyVar.f5716a = query.getLong(i);
                        eyVar.f5718c = query.getLong(3);
                        eyVar.f5719d = query.getLong(4);
                        eyVar.f5720e = query.getLong(5);
                    }
                    if (z) {
                        eyVar.f5717b++;
                    }
                    if (z2) {
                        eyVar.f5716a++;
                    }
                    if (z3) {
                        eyVar.f5718c++;
                    }
                    if (z4) {
                        eyVar.f5719d++;
                    }
                    if (z5) {
                        eyVar.f5720e++;
                    }
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("day", Long.valueOf(j));
                    contentValues.put("daily_public_events_count", Long.valueOf(eyVar.f5716a));
                    contentValues.put("daily_events_count", Long.valueOf(eyVar.f5717b));
                    contentValues.put("daily_conversions_count", Long.valueOf(eyVar.f5718c));
                    contentValues.put("daily_error_events_count", Long.valueOf(eyVar.f5719d));
                    contentValues.put("daily_realtime_events_count", Long.valueOf(eyVar.f5720e));
                    A.update("apps", contentValues, "app_id=?", strArr);
                    if (query != null) {
                        query.close();
                    }
                    return eyVar;
                }
                mo1623t().f18136c.m4847a("Not updating daily counts, app is not known. appId", ft.m16220a(str));
                if (query != null) {
                    query.close();
                }
                return eyVar;
            } catch (SQLiteException e) {
                obj = e;
                cursor = query;
                try {
                    mo1623t().f18134a.m4848a("Error updating daily counts. appId", ft.m16220a(str), obj);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return eyVar;
                } catch (Throwable th2) {
                    th = th2;
                    query = cursor;
                    if (query != null) {
                        query.close();
                    }
                    throw th;
                }
            } catch (Throwable th22) {
                th = th22;
                if (query != null) {
                    query.close();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            obj = e2;
            cursor = null;
            mo1623t().f18134a.m4848a("Error updating daily counts. appId", ft.m16220a(str), obj);
            if (cursor != null) {
                cursor.close();
            }
            return eyVar;
        } catch (Throwable th222) {
            th = th222;
            query = null;
            if (query != null) {
                query.close();
            }
            throw th;
        }
    }

    public final ff m16065a(String str, String str2) {
        Object obj;
        SQLiteException e;
        Cursor cursor;
        Throwable th;
        Throwable th2;
        String str3 = str2;
        ac.m4378a(str);
        ac.m4378a(str2);
        mo1606c();
        m11975L();
        try {
            r3 = new String[7];
            boolean z = false;
            r3[0] = "lifetime_count";
            r3[1] = "current_bundle_count";
            r3[2] = "last_fire_timestamp";
            r3[3] = "last_bundled_timestamp";
            r3[4] = "last_sampled_complex_event_id";
            r3[5] = "last_sampling_rate";
            r3[6] = "last_exempt_from_sampling";
            Cursor query = m16057A().query("events", r3, "app_id=? and name=?", new String[]{str, str3}, null, null, null);
            try {
                if (query.moveToFirst()) {
                    ff ffVar;
                    Boolean bool;
                    long j = query.getLong(0);
                    long j2 = query.getLong(1);
                    long j3 = query.getLong(2);
                    long j4 = query.isNull(3) ? 0 : query.getLong(3);
                    ff valueOf = query.isNull(4) ? null : Long.valueOf(query.getLong(4));
                    if (query.isNull(5)) {
                        ffVar = null;
                    } else {
                        Object valueOf2 = Long.valueOf(query.getLong(5));
                    }
                    if (query.isNull(6)) {
                        bool = null;
                    } else {
                        try {
                            if (query.getLong(6) == 1) {
                                z = true;
                            }
                            bool = Boolean.valueOf(z);
                        } catch (SQLiteException e2) {
                            obj = e2;
                            cursor = query;
                            try {
                                mo1623t().f18134a.m4849a("Error querying events. appId", ft.m16220a(str), mo1618o().m16194a(str2), obj);
                                if (cursor != null) {
                                    cursor.close();
                                }
                                return null;
                            } catch (Throwable th3) {
                                th = th3;
                                th2 = th;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                throw th2;
                            }
                        } catch (Throwable th4) {
                            th2 = th4;
                            cursor = query;
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th2;
                        }
                    }
                    ff ffVar2 = ffVar2;
                    String str4 = str3;
                    cursor = query;
                    try {
                        ffVar2 = new ff(str, str4, j, j2, j3, j4, valueOf, ffVar, bool);
                        if (cursor.moveToNext()) {
                            mo1623t().f18134a.m4847a("Got multiple records for event aggregates, expected one. appId", ft.m16220a(str));
                        }
                        if (cursor != null) {
                            cursor.close();
                        }
                        return ffVar2;
                    } catch (SQLiteException e3) {
                        e2 = e3;
                        obj = e2;
                        mo1623t().f18134a.m4849a("Error querying events. appId", ft.m16220a(str), mo1618o().m16194a(str2), obj);
                        if (cursor != null) {
                            cursor.close();
                        }
                        return null;
                    }
                }
                if (query != null) {
                    query.close();
                }
                return null;
            } catch (SQLiteException e4) {
                e2 = e4;
                cursor = query;
                obj = e2;
                mo1623t().f18134a.m4849a("Error querying events. appId", ft.m16220a(str), mo1618o().m16194a(str2), obj);
                if (cursor != null) {
                    cursor.close();
                }
                return null;
            } catch (Throwable th5) {
                th4 = th5;
                cursor = query;
                th2 = th4;
                if (cursor != null) {
                    cursor.close();
                }
                throw th2;
            }
        } catch (SQLiteException e22) {
            obj = e22;
            cursor = null;
            mo1623t().f18134a.m4849a("Error querying events. appId", ft.m16220a(str), mo1618o().m16194a(str2), obj);
            if (cursor != null) {
                cursor.close();
            }
            return null;
        } catch (Throwable th42) {
            th2 = th42;
            cursor = null;
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }

    public final String m16066a(long j) {
        Cursor rawQuery;
        Object e;
        Throwable th;
        mo1606c();
        m11975L();
        try {
            rawQuery = m16057A().rawQuery("select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;", new String[]{String.valueOf(j)});
            try {
                if (rawQuery.moveToFirst()) {
                    String string = rawQuery.getString(0);
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                    return string;
                }
                mo1623t().f18140g.m4846a("No expired configs for apps with pending events");
                if (rawQuery != null) {
                    rawQuery.close();
                }
                return null;
            } catch (SQLiteException e2) {
                e = e2;
                try {
                    mo1623t().f18134a.m4847a("Error selecting expired configs", e);
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                    return null;
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
            mo1623t().f18134a.m4847a("Error selecting expired configs", e);
            if (rawQuery != null) {
                rawQuery.close();
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
            rawQuery = null;
            if (rawQuery != null) {
                rawQuery.close();
            }
            throw th;
        }
    }

    public final List<jt> m16067a(String str) {
        SQLiteException e;
        ex exVar;
        Throwable th;
        Throwable th2;
        ac.m4378a(str);
        mo1606c();
        m11975L();
        List<jt> arrayList = new ArrayList();
        Cursor query;
        Object obj;
        try {
            query = m16057A().query("user_attributes", new String[]{"name", "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
            try {
                if (query.moveToFirst()) {
                    do {
                        String string = query.getString(0);
                        String string2 = query.getString(1);
                        if (string2 == null) {
                            string2 = "";
                        }
                        String str2 = string2;
                        long j = query.getLong(2);
                        try {
                            Object a = m16047a(query, 3);
                            if (a == null) {
                                mo1623t().f18134a.m4847a("Read invalid user property value, ignoring it. appId", ft.m16220a(str));
                            } else {
                                arrayList.add(new jt(str, str2, string, j, a));
                            }
                        } catch (SQLiteException e2) {
                            e = e2;
                        }
                    } while (query.moveToNext());
                    if (query != null) {
                        query.close();
                    }
                    return arrayList;
                }
                if (query != null) {
                    query.close();
                }
                return arrayList;
            } catch (SQLiteException e3) {
                e = e3;
                exVar = this;
            } catch (Throwable th3) {
                th = th3;
                exVar = this;
            }
            obj = e;
            try {
                mo1623t().f18134a.m4848a("Error querying user properties. appId", ft.m16220a(str), obj);
                if (query != null) {
                    query.close();
                }
                return null;
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                if (query != null) {
                    query.close();
                }
                throw th2;
            }
        } catch (SQLiteException e4) {
            exVar = this;
            obj = e4;
            query = null;
            mo1623t().f18134a.m4848a("Error querying user properties. appId", ft.m16220a(str), obj);
            if (query != null) {
                query.close();
            }
            return null;
        } catch (Throwable th5) {
            exVar = this;
            th2 = th5;
            query = null;
            if (query != null) {
                query.close();
            }
            throw th2;
        }
    }

    public final List<Pair<ki, Long>> m16068a(String str, int i, int i2) {
        Object e;
        fv fvVar;
        String str2;
        Object a;
        Object e2;
        Throwable th;
        mo1606c();
        m11975L();
        ac.m4385b(i > 0);
        ac.m4385b(i2 > 0);
        ac.m4378a(str);
        Cursor cursor = null;
        Cursor query;
        try {
            query = m16057A().query("queue", new String[]{"rowid", "data"}, "app_id=?", new String[]{str}, null, null, "rowid", String.valueOf(i));
            try {
                if (query.moveToFirst()) {
                    List<Pair<ki, Long>> arrayList = new ArrayList();
                    int i3 = 0;
                    do {
                        long j = query.getLong(0);
                        try {
                            byte[] b = mo1619p().m16611b(query.getBlob(1));
                            if (!arrayList.isEmpty() && b.length + i3 > i2) {
                                break;
                            }
                            nz a2 = nz.m5045a(b, b.length);
                            oi kiVar = new ki();
                            try {
                                kiVar.mo3038a(a2);
                                i3 += b.length;
                                arrayList.add(Pair.create(kiVar, Long.valueOf(j)));
                            } catch (IOException e3) {
                                e = e3;
                                fvVar = mo1623t().f18134a;
                                str2 = "Failed to merge queued bundle. appId";
                                a = ft.m16220a(str);
                                fvVar.m4848a(str2, a, e);
                                if (query.moveToNext()) {
                                    break;
                                } else if (i3 > i2) {
                                }
                                if (query != null) {
                                    query.close();
                                }
                                return arrayList;
                            }
                            if (query.moveToNext()) {
                                break;
                            }
                        } catch (IOException e4) {
                            e = e4;
                            fvVar = mo1623t().f18134a;
                            str2 = "Failed to unzip queued bundle. appId";
                            a = ft.m16220a(str);
                            fvVar.m4848a(str2, a, e);
                            if (query.moveToNext()) {
                                break;
                            } else if (i3 > i2) {
                            }
                            if (query != null) {
                                query.close();
                            }
                            return arrayList;
                        }
                    } while (i3 > i2);
                    if (query != null) {
                        query.close();
                    }
                    return arrayList;
                }
                List<Pair<ki, Long>> emptyList = Collections.emptyList();
                if (query != null) {
                    query.close();
                }
                return emptyList;
            } catch (SQLiteException e5) {
                e2 = e5;
                cursor = query;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (SQLiteException e6) {
            e2 = e6;
            try {
                mo1623t().f18134a.m4848a("Error querying bundles. appId", ft.m16220a(str), e2);
                List<Pair<ki, Long>> emptyList2 = Collections.emptyList();
                if (cursor != null) {
                    cursor.close();
                }
                return emptyList2;
            } catch (Throwable th3) {
                th = th3;
                query = cursor;
                if (query != null) {
                    query.close();
                }
                throw th;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.google.android.gms.internal.jt> m16069a(java.lang.String r24, java.lang.String r25, java.lang.String r26) {
        /*
        r23 = this;
        com.google.android.gms.common.internal.ac.m4378a(r24);
        r23.mo1606c();
        r23.m11975L();
        r1 = new java.util.ArrayList;
        r1.<init>();
        r2 = 0;
        r3 = new java.util.ArrayList;	 Catch:{ SQLiteException -> 0x012a, all -> 0x0125 }
        r4 = 3;
        r3.<init>(r4);	 Catch:{ SQLiteException -> 0x012a, all -> 0x0125 }
        r12 = r24;
        r3.add(r12);	 Catch:{ SQLiteException -> 0x0121, all -> 0x0125 }
        r5 = new java.lang.StringBuilder;	 Catch:{ SQLiteException -> 0x0121, all -> 0x0125 }
        r6 = "app_id=?";
        r5.<init>(r6);	 Catch:{ SQLiteException -> 0x0121, all -> 0x0125 }
        r6 = android.text.TextUtils.isEmpty(r25);	 Catch:{ SQLiteException -> 0x0121, all -> 0x0125 }
        if (r6 != 0) goto L_0x0037;
    L_0x0027:
        r6 = r25;
        r3.add(r6);	 Catch:{ SQLiteException -> 0x0032, all -> 0x0125 }
        r7 = " and origin=?";
        r5.append(r7);	 Catch:{ SQLiteException -> 0x0032, all -> 0x0125 }
        goto L_0x0039;
    L_0x0032:
        r0 = move-exception;
        r15 = r23;
        goto L_0x0131;
    L_0x0037:
        r6 = r25;
    L_0x0039:
        r7 = android.text.TextUtils.isEmpty(r26);	 Catch:{ SQLiteException -> 0x0032, all -> 0x0125 }
        if (r7 != 0) goto L_0x0051;
    L_0x003f:
        r7 = java.lang.String.valueOf(r26);	 Catch:{ SQLiteException -> 0x0032, all -> 0x0125 }
        r8 = "*";
        r7 = r7.concat(r8);	 Catch:{ SQLiteException -> 0x0032, all -> 0x0125 }
        r3.add(r7);	 Catch:{ SQLiteException -> 0x0032, all -> 0x0125 }
        r7 = " and name glob ?";
        r5.append(r7);	 Catch:{ SQLiteException -> 0x0032, all -> 0x0125 }
    L_0x0051:
        r7 = r3.size();	 Catch:{ SQLiteException -> 0x0032, all -> 0x0125 }
        r7 = new java.lang.String[r7];	 Catch:{ SQLiteException -> 0x0032, all -> 0x0125 }
        r3 = r3.toArray(r7);	 Catch:{ SQLiteException -> 0x0032, all -> 0x0125 }
        r17 = r3;
        r17 = (java.lang.String[]) r17;	 Catch:{ SQLiteException -> 0x0032, all -> 0x0125 }
        r13 = r23.m16057A();	 Catch:{ SQLiteException -> 0x0032, all -> 0x0125 }
        r14 = "user_attributes";
        r3 = 4;
        r15 = new java.lang.String[r3];	 Catch:{ SQLiteException -> 0x0032, all -> 0x0125 }
        r3 = "name";
        r11 = 0;
        r15[r11] = r3;	 Catch:{ SQLiteException -> 0x0032, all -> 0x0125 }
        r3 = "set_timestamp";
        r9 = 1;
        r15[r9] = r3;	 Catch:{ SQLiteException -> 0x0032, all -> 0x0125 }
        r3 = "value";
        r10 = 2;
        r15[r10] = r3;	 Catch:{ SQLiteException -> 0x0032, all -> 0x0125 }
        r3 = "origin";
        r15[r4] = r3;	 Catch:{ SQLiteException -> 0x0032, all -> 0x0125 }
        r16 = r5.toString();	 Catch:{ SQLiteException -> 0x0032, all -> 0x0125 }
        r18 = 0;
        r19 = 0;
        r20 = "rowid";
        r21 = "1001";
        r3 = r13.query(r14, r15, r16, r17, r18, r19, r20, r21);	 Catch:{ SQLiteException -> 0x0032, all -> 0x0125 }
        r5 = r3.moveToFirst();	 Catch:{ SQLiteException -> 0x011c, all -> 0x0118 }
        if (r5 != 0) goto L_0x0097;
    L_0x0091:
        if (r3 == 0) goto L_0x0096;
    L_0x0093:
        r3.close();
    L_0x0096:
        return r1;
    L_0x0097:
        r5 = r1.size();	 Catch:{ SQLiteException -> 0x011c, all -> 0x0118 }
        r7 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        if (r5 < r7) goto L_0x00b1;
    L_0x009f:
        r4 = r23.mo1623t();	 Catch:{ SQLiteException -> 0x011c, all -> 0x0118 }
        r4 = r4.f18134a;	 Catch:{ SQLiteException -> 0x011c, all -> 0x0118 }
        r5 = "Read more than the max allowed user properties, ignoring excess";
        r7 = java.lang.Integer.valueOf(r7);	 Catch:{ SQLiteException -> 0x011c, all -> 0x0118 }
        r4.m4847a(r5, r7);	 Catch:{ SQLiteException -> 0x011c, all -> 0x0118 }
        r15 = r23;
        goto L_0x00fe;
    L_0x00b1:
        r8 = r3.getString(r11);	 Catch:{ SQLiteException -> 0x011c, all -> 0x0118 }
        r13 = r3.getLong(r9);	 Catch:{ SQLiteException -> 0x011c, all -> 0x0118 }
        r15 = r23;
        r16 = r15.m16047a(r3, r10);	 Catch:{ SQLiteException -> 0x0116 }
        r7 = r3.getString(r4);	 Catch:{ SQLiteException -> 0x0116 }
        if (r16 != 0) goto L_0x00e3;
    L_0x00c5:
        r5 = r23.mo1623t();	 Catch:{ SQLiteException -> 0x00de }
        r5 = r5.f18134a;	 Catch:{ SQLiteException -> 0x00de }
        r6 = "(2)Read invalid user property value, ignoring it";
        r8 = com.google.android.gms.internal.ft.m16220a(r24);	 Catch:{ SQLiteException -> 0x00de }
        r13 = r26;
        r5.m4849a(r6, r8, r7, r13);	 Catch:{ SQLiteException -> 0x00de }
        r17 = r7;
        r18 = r9;
        r19 = r10;
        r13 = r11;
        goto L_0x00f8;
    L_0x00de:
        r0 = move-exception;
        r1 = r0;
        r6 = r7;
        goto L_0x0133;
    L_0x00e3:
        r6 = new com.google.android.gms.internal.jt;	 Catch:{ SQLiteException -> 0x010f }
        r5 = r6;
        r4 = r6;
        r6 = r12;
        r17 = r7;
        r18 = r9;
        r19 = r10;
        r9 = r13;
        r13 = r11;
        r11 = r16;
        r5.<init>(r6, r7, r8, r9, r11);	 Catch:{ SQLiteException -> 0x010d }
        r1.add(r4);	 Catch:{ SQLiteException -> 0x010d }
    L_0x00f8:
        r4 = r3.moveToNext();	 Catch:{ SQLiteException -> 0x010d }
        if (r4 != 0) goto L_0x0104;
    L_0x00fe:
        if (r3 == 0) goto L_0x0103;
    L_0x0100:
        r3.close();
    L_0x0103:
        return r1;
    L_0x0104:
        r11 = r13;
        r6 = r17;
        r9 = r18;
        r10 = r19;
        r4 = 3;
        goto L_0x0097;
    L_0x010d:
        r0 = move-exception;
        goto L_0x0112;
    L_0x010f:
        r0 = move-exception;
        r17 = r7;
    L_0x0112:
        r1 = r0;
        r6 = r17;
        goto L_0x0133;
    L_0x0116:
        r0 = move-exception;
        goto L_0x011f;
    L_0x0118:
        r0 = move-exception;
        r15 = r23;
        goto L_0x0149;
    L_0x011c:
        r0 = move-exception;
        r15 = r23;
    L_0x011f:
        r1 = r0;
        goto L_0x0133;
    L_0x0121:
        r0 = move-exception;
        r15 = r23;
        goto L_0x012f;
    L_0x0125:
        r0 = move-exception;
        r15 = r23;
        r1 = r0;
        goto L_0x014b;
    L_0x012a:
        r0 = move-exception;
        r15 = r23;
        r12 = r24;
    L_0x012f:
        r6 = r25;
    L_0x0131:
        r1 = r0;
        r3 = r2;
    L_0x0133:
        r4 = r23.mo1623t();	 Catch:{ all -> 0x0148 }
        r4 = r4.f18134a;	 Catch:{ all -> 0x0148 }
        r5 = "(2)Error querying user properties";
        r7 = com.google.android.gms.internal.ft.m16220a(r24);	 Catch:{ all -> 0x0148 }
        r4.m4849a(r5, r7, r6, r1);	 Catch:{ all -> 0x0148 }
        if (r3 == 0) goto L_0x0147;
    L_0x0144:
        r3.close();
    L_0x0147:
        return r2;
    L_0x0148:
        r0 = move-exception;
    L_0x0149:
        r1 = r0;
        r2 = r3;
    L_0x014b:
        if (r2 == 0) goto L_0x0150;
    L_0x014d:
        r2.close();
    L_0x0150:
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ex.a(java.lang.String, java.lang.String, java.lang.String):java.util.List<com.google.android.gms.internal.jt>");
    }

    public final void m16070a(es esVar) {
        ac.m4376a((Object) esVar);
        mo1606c();
        m11975L();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", esVar.m4772a());
        contentValues.put("app_instance_id", esVar.m4776b());
        contentValues.put("gmp_app_id", esVar.m4780c());
        contentValues.put("resettable_device_id_hash", esVar.m4783d());
        contentValues.put("last_bundle_index", Long.valueOf(esVar.m4803n()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(esVar.m4789f()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(esVar.m4792g()));
        contentValues.put("app_version", esVar.m4795h());
        contentValues.put("app_store", esVar.m4799j());
        contentValues.put("gmp_version", Long.valueOf(esVar.m4800k()));
        contentValues.put("dev_cert_hash", Long.valueOf(esVar.m4801l()));
        contentValues.put("measurement_enabled", Boolean.valueOf(esVar.m4802m()));
        esVar.f5690a.m4907f().mo1606c();
        contentValues.put("day", Long.valueOf(esVar.f5691b));
        esVar.f5690a.m4907f().mo1606c();
        contentValues.put("daily_public_events_count", Long.valueOf(esVar.f5692c));
        esVar.f5690a.m4907f().mo1606c();
        contentValues.put("daily_events_count", Long.valueOf(esVar.f5693d));
        esVar.f5690a.m4907f().mo1606c();
        contentValues.put("daily_conversions_count", Long.valueOf(esVar.f5694e));
        contentValues.put("config_fetched_time", Long.valueOf(esVar.m4804o()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(esVar.m4805p()));
        contentValues.put("app_version_int", Long.valueOf(esVar.m4797i()));
        contentValues.put("firebase_instance_id", esVar.m4786e());
        esVar.f5690a.m4907f().mo1606c();
        contentValues.put("daily_error_events_count", Long.valueOf(esVar.f5695f));
        esVar.f5690a.m4907f().mo1606c();
        contentValues.put("daily_realtime_events_count", Long.valueOf(esVar.f5696g));
        contentValues.put("health_monitor_sample", esVar.m4807r());
        contentValues.put("android_id", Long.valueOf(esVar.m4808s()));
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(esVar.m4809t()));
        try {
            SQLiteDatabase A = m16057A();
            if (((long) A.update("apps", contentValues, "app_id = ?", new String[]{esVar.m4772a()})) == 0 && A.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                mo1623t().f18134a.m4847a("Failed to insert/update app (got -1). appId", ft.m16220a(esVar.m4772a()));
            }
        } catch (SQLiteException e) {
            mo1623t().f18134a.m4848a("Error storing app. appId", ft.m16220a(esVar.m4772a()), e);
        }
    }

    public final void m16071a(ff ffVar) {
        ac.m4376a((Object) ffVar);
        mo1606c();
        m11975L();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", ffVar.f5734a);
        contentValues.put("name", ffVar.f5735b);
        contentValues.put("lifetime_count", Long.valueOf(ffVar.f5736c));
        contentValues.put("current_bundle_count", Long.valueOf(ffVar.f5737d));
        contentValues.put("last_fire_timestamp", Long.valueOf(ffVar.f5738e));
        contentValues.put("last_bundled_timestamp", Long.valueOf(ffVar.f5739f));
        contentValues.put("last_sampled_complex_event_id", ffVar.f5740g);
        contentValues.put("last_sampling_rate", ffVar.f5741h);
        Long valueOf = (ffVar.f5742i == null || !ffVar.f5742i.booleanValue()) ? null : Long.valueOf(1);
        contentValues.put("last_exempt_from_sampling", valueOf);
        try {
            if (m16057A().insertWithOnConflict("events", null, contentValues, 5) == -1) {
                mo1623t().f18134a.m4847a("Failed to insert/update event aggregates (got -1). appId", ft.m16220a(ffVar.f5734a));
            }
        } catch (SQLiteException e) {
            mo1623t().f18134a.m4848a("Error storing event aggregates. appId", ft.m16220a(ffVar.f5734a), e);
        }
    }

    final void m16072a(String str, jv[] jvVarArr) {
        m11975L();
        mo1606c();
        ac.m4378a(str);
        ac.m4376a((Object) jvVarArr);
        SQLiteDatabase A = m16057A();
        A.beginTransaction();
        try {
            m11975L();
            mo1606c();
            ac.m4378a(str);
            SQLiteDatabase A2 = m16057A();
            String[] strArr = new String[1];
            int i = 0;
            strArr[0] = str;
            A2.delete("property_filters", "app_id=?", strArr);
            A2.delete("event_filters", "app_id=?", new String[]{str});
            for (Object obj : jvVarArr) {
                Object obj2;
                m11975L();
                mo1606c();
                ac.m4378a(str);
                ac.m4376a(obj2);
                ac.m4376a(obj2.f18225c);
                ac.m4376a(obj2.f18224b);
                if (obj2.f18223a == null) {
                    mo1623t().f18136c.m4847a("Audience with no ID. appId", ft.m16220a(str));
                } else {
                    fv fvVar;
                    String str2;
                    Object a;
                    int i2;
                    int intValue = obj2.f18223a.intValue();
                    for (jw jwVar : obj2.f18225c) {
                        if (jwVar.f18227a == null) {
                            fvVar = mo1623t().f18136c;
                            str2 = "Event filter with no ID. Audience definition ignored. appId, audienceId";
                            a = ft.m16220a(str);
                            obj2 = obj2.f18223a;
                            break;
                        }
                    }
                    for (jz jzVar : obj2.f18224b) {
                        if (jzVar.f18243a == null) {
                            fvVar = mo1623t().f18136c;
                            str2 = "Property filter with no ID. Audience definition ignored. appId, audienceId";
                            a = ft.m16220a(str);
                            obj2 = obj2.f18223a;
                            fvVar.m4848a(str2, a, obj2);
                            break;
                        }
                    }
                    for (jw jwVar2 : obj2.f18225c) {
                        if (!m16054a(str, intValue, jwVar2)) {
                            i2 = 0;
                            break;
                        }
                    }
                    i2 = 1;
                    if (i2 != 0) {
                        for (jz jzVar2 : obj2.f18224b) {
                            if (!m16055a(str, intValue, jzVar2)) {
                                i2 = 0;
                                break;
                            }
                        }
                    }
                    if (i2 == 0) {
                        m11975L();
                        mo1606c();
                        ac.m4378a(str);
                        SQLiteDatabase A3 = m16057A();
                        A3.delete("property_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(intValue)});
                        A3.delete("event_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(intValue)});
                    }
                }
            }
            List arrayList = new ArrayList();
            int length = jvVarArr.length;
            while (i < length) {
                arrayList.add(jvVarArr[i].f18223a);
                i++;
            }
            m16056a(str, arrayList);
            A.setTransactionSuccessful();
        } finally {
            A.endTransaction();
        }
    }

    public final void m16073a(List<Long> list) {
        ac.m4376a((Object) list);
        mo1606c();
        m11975L();
        StringBuilder stringBuilder = new StringBuilder("rowid in (");
        for (int i = 0; i < list.size(); i++) {
            if (i != 0) {
                stringBuilder.append(",");
            }
            stringBuilder.append(((Long) list.get(i)).longValue());
        }
        stringBuilder.append(")");
        int delete = m16057A().delete("raw_events", stringBuilder.toString(), null);
        if (delete != list.size()) {
            mo1623t().f18134a.m4848a("Deleted fewer rows from raw events table than expected", Integer.valueOf(delete), Integer.valueOf(list.size()));
        }
    }

    public final boolean m16074a(fe feVar, long j, boolean z) {
        Object e;
        fv fvVar;
        String str;
        mo1606c();
        m11975L();
        ac.m4376a((Object) feVar);
        ac.m4378a(feVar.f5728a);
        oi kfVar = new kf();
        kfVar.f18273d = Long.valueOf(feVar.f5732e);
        kfVar.f18270a = new kg[feVar.f5733f.f18544a.size()];
        Iterator it = feVar.f5733f.iterator();
        int i = 0;
        while (it.hasNext()) {
            String str2 = (String) it.next();
            kg kgVar = new kg();
            int i2 = i + 1;
            kfVar.f18270a[i] = kgVar;
            kgVar.f18276a = str2;
            mo1619p().m16598a(kgVar, feVar.f5733f.m16839a(str2));
            i = i2;
        }
        try {
            byte[] bArr = new byte[kfVar.m5129f()];
            oa a = oa.m5073a(bArr, bArr.length);
            kfVar.mo1667a(a);
            a.m5085a();
            mo1623t().f18140g.m4848a("Saving event, name, data size", mo1618o().m16194a(feVar.f5729b), Integer.valueOf(bArr.length));
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", feVar.f5728a);
            contentValues.put("name", feVar.f5729b);
            contentValues.put(TimestampElement.ELEMENT, Long.valueOf(feVar.f5731d));
            contentValues.put("metadata_fingerprint", Long.valueOf(j));
            contentValues.put("data", bArr);
            contentValues.put("realtime", Integer.valueOf(z));
            try {
                if (m16057A().insert("raw_events", null, contentValues) != -1) {
                    return true;
                }
                mo1623t().f18134a.m4847a("Failed to insert raw event (got -1). appId", ft.m16220a(feVar.f5728a));
                return false;
            } catch (SQLiteException e2) {
                e = e2;
                fvVar = mo1623t().f18134a;
                str = "Error storing raw event. appId";
                fvVar.m4848a(str, ft.m16220a(feVar.f5728a), e);
                return false;
            }
        } catch (IOException e3) {
            e = e3;
            fvVar = mo1623t().f18134a;
            str = "Data loss. Failed to serialize event params/data. appId";
            fvVar.m4848a(str, ft.m16220a(feVar.f5728a), e);
            return false;
        }
    }

    public final boolean m16075a(jt jtVar) {
        ac.m4376a((Object) jtVar);
        mo1606c();
        m11975L();
        if (m16083c(jtVar.f6068a, jtVar.f6070c) == null) {
            if (ju.m16570a(jtVar.f6070c)) {
                if (m16062a("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{jtVar.f6068a}) >= 25) {
                    return false;
                }
            }
            if (m16062a("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{jtVar.f6068a, jtVar.f6069b}) >= 25) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", jtVar.f6068a);
        contentValues.put("origin", jtVar.f6069b);
        contentValues.put("name", jtVar.f6070c);
        contentValues.put("set_timestamp", Long.valueOf(jtVar.f6071d));
        m16049a(contentValues, "value", jtVar.f6072e);
        try {
            if (m16057A().insertWithOnConflict("user_attributes", null, contentValues, 5) == -1) {
                mo1623t().f18134a.m4847a("Failed to insert/update user property (got -1). appId", ft.m16220a(jtVar.f6068a));
                return true;
            }
        } catch (SQLiteException e) {
            mo1623t().f18134a.m4848a("Error storing user property. appId", ft.m16220a(jtVar.f6068a), e);
        }
        return true;
    }

    public final boolean m16076a(ki kiVar, boolean z) {
        Object e;
        fv fvVar;
        String str;
        mo1606c();
        m11975L();
        ac.m4376a((Object) kiVar);
        ac.m4378a(kiVar.f18306o);
        ac.m4376a(kiVar.f18297f);
        m16059C();
        long a = mo1614k().mo1575a();
        if (kiVar.f18297f.longValue() < a - ew.m11915y() || kiVar.f18297f.longValue() > a + ew.m11915y()) {
            mo1623t().f18136c.m4849a("Storing bundle outside of the max uploading time span. appId, now, timestamp", ft.m16220a(kiVar.f18306o), Long.valueOf(a), kiVar.f18297f);
        }
        try {
            byte[] bArr = new byte[kiVar.m5129f()];
            oa a2 = oa.m5073a(bArr, bArr.length);
            kiVar.mo1667a(a2);
            a2.m5085a();
            bArr = mo1619p().m16605a(bArr);
            mo1623t().f18140g.m4847a("Saving bundle, size", Integer.valueOf(bArr.length));
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", kiVar.f18306o);
            contentValues.put("bundle_end_timestamp", kiVar.f18297f);
            contentValues.put("data", bArr);
            contentValues.put("has_realtime", Integer.valueOf(z));
            try {
                if (m16057A().insert("queue", null, contentValues) != -1) {
                    return true;
                }
                mo1623t().f18134a.m4847a("Failed to insert bundle (got -1). appId", ft.m16220a(kiVar.f18306o));
                return false;
            } catch (SQLiteException e2) {
                e = e2;
                fvVar = mo1623t().f18134a;
                str = "Error storing bundle. appId";
                fvVar.m4848a(str, ft.m16220a(kiVar.f18306o), e);
                return false;
            }
        } catch (IOException e3) {
            e = e3;
            fvVar = mo1623t().f18134a;
            str = "Data loss. Failed to serialize bundle. appId";
            fvVar.m4848a(str, ft.m16220a(kiVar.f18306o), e);
            return false;
        }
    }

    public final boolean m16077a(zzcfi com_google_android_gms_internal_zzcfi) {
        ac.m4376a((Object) com_google_android_gms_internal_zzcfi);
        mo1606c();
        m11975L();
        if (m16083c(com_google_android_gms_internal_zzcfi.f18532a, com_google_android_gms_internal_zzcfi.f18534c.f18549a) == null) {
            if (m16062a("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{com_google_android_gms_internal_zzcfi.f18532a}) >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", com_google_android_gms_internal_zzcfi.f18532a);
        contentValues.put("origin", com_google_android_gms_internal_zzcfi.f18533b);
        contentValues.put("name", com_google_android_gms_internal_zzcfi.f18534c.f18549a);
        m16049a(contentValues, "value", com_google_android_gms_internal_zzcfi.f18534c.m16841a());
        contentValues.put(Active.ELEMENT, Boolean.valueOf(com_google_android_gms_internal_zzcfi.f18536e));
        contentValues.put("trigger_event_name", com_google_android_gms_internal_zzcfi.f18537f);
        contentValues.put("trigger_timeout", Long.valueOf(com_google_android_gms_internal_zzcfi.f18539h));
        mo1619p();
        contentValues.put("timed_out_event", ju.m16573a(com_google_android_gms_internal_zzcfi.f18538g));
        contentValues.put("creation_timestamp", Long.valueOf(com_google_android_gms_internal_zzcfi.f18535d));
        mo1619p();
        contentValues.put("triggered_event", ju.m16573a(com_google_android_gms_internal_zzcfi.f18540i));
        contentValues.put("triggered_timestamp", Long.valueOf(com_google_android_gms_internal_zzcfi.f18534c.f18550b));
        contentValues.put("time_to_live", Long.valueOf(com_google_android_gms_internal_zzcfi.f18541j));
        mo1619p();
        contentValues.put("expired_event", ju.m16573a(com_google_android_gms_internal_zzcfi.f18542k));
        try {
            if (m16057A().insertWithOnConflict("conditional_properties", null, contentValues, 5) == -1) {
                mo1623t().f18134a.m4847a("Failed to insert/update conditional user property (got -1)", ft.m16220a(com_google_android_gms_internal_zzcfi.f18532a));
                return true;
            }
        } catch (SQLiteException e) {
            mo1623t().f18134a.m4848a("Error storing conditional user property", ft.m16220a(com_google_android_gms_internal_zzcfi.f18532a), e);
        }
        return true;
    }

    public final es m16078b(String str) {
        Cursor query;
        SQLiteException e;
        Cursor cursor;
        Object obj;
        Throwable th;
        Throwable th2;
        ex exVar;
        String str2 = str;
        ac.m4378a(str);
        mo1606c();
        m11975L();
        try {
            r5 = new String[24];
            boolean z = true;
            r5[1] = "gmp_app_id";
            r5[2] = "resettable_device_id_hash";
            r5[3] = "last_bundle_index";
            r5[4] = "last_bundle_start_timestamp";
            r5[5] = "last_bundle_end_timestamp";
            r5[6] = "app_version";
            r5[7] = "app_store";
            r5[8] = "gmp_version";
            r5[9] = "dev_cert_hash";
            r5[10] = "measurement_enabled";
            r5[11] = "day";
            r5[12] = "daily_public_events_count";
            r5[13] = "daily_events_count";
            r5[14] = "daily_conversions_count";
            r5[15] = "config_fetched_time";
            r5[16] = "failed_config_fetch_time";
            r5[17] = "app_version_int";
            r5[18] = "firebase_instance_id";
            r5[19] = "daily_error_events_count";
            r5[20] = "daily_realtime_events_count";
            r5[21] = "health_monitor_sample";
            r5[22] = "android_id";
            r5[23] = "adid_reporting_enabled";
            int i = 7;
            i = 6;
            i = 5;
            query = m16057A().query("apps", r5, "app_id=?", new String[]{str2}, null, null, null);
            try {
                if (query.moveToFirst()) {
                    try {
                        boolean z2;
                        long j;
                        es esVar = new es(this.s, str2);
                        esVar.m4774a(query.getString(0));
                        esVar.m4778b(query.getString(1));
                        esVar.m4782c(query.getString(2));
                        esVar.m4790f(query.getLong(3));
                        esVar.m4773a(query.getLong(4));
                        esVar.m4777b(query.getLong(i));
                        esVar.m4788e(query.getString(6));
                        esVar.m4791f(query.getString(7));
                        esVar.m4784d(query.getLong(8));
                        esVar.m4787e(query.getLong(9));
                        if (!query.isNull(10)) {
                            if (query.getInt(10) == 0) {
                                z2 = false;
                                esVar.m4775a(z2);
                                j = query.getLong(11);
                                esVar.f5690a.m4907f().mo1606c();
                                esVar.f5698i |= esVar.f5691b == j ? 1 : 0;
                                esVar.f5691b = j;
                                j = query.getLong(12);
                                esVar.f5690a.m4907f().mo1606c();
                                esVar.f5698i |= esVar.f5692c == j ? 1 : 0;
                                esVar.f5692c = j;
                                j = query.getLong(13);
                                esVar.f5690a.m4907f().mo1606c();
                                esVar.f5698i |= esVar.f5693d == j ? 1 : 0;
                                esVar.f5693d = j;
                                j = query.getLong(14);
                                esVar.f5690a.m4907f().mo1606c();
                                esVar.f5698i |= esVar.f5694e == j ? 1 : 0;
                                esVar.f5694e = j;
                                esVar.m4793g(query.getLong(15));
                                esVar.m4796h(query.getLong(16));
                                esVar.m4781c(query.isNull(17) ? -2147483648L : (long) query.getInt(17));
                                esVar.m4785d(query.getString(18));
                                j = query.getLong(19);
                                esVar.f5690a.m4907f().mo1606c();
                                esVar.f5698i |= esVar.f5695f == j ? 1 : 0;
                                esVar.f5695f = j;
                                j = query.getLong(20);
                                esVar.f5690a.m4907f().mo1606c();
                                esVar.f5698i |= esVar.f5696g == j ? 1 : 0;
                                esVar.f5696g = j;
                                esVar.m4794g(query.getString(21));
                                esVar.m4798i(query.isNull(22) ? 0 : query.getLong(22));
                                if (!query.isNull(23)) {
                                    if (query.getInt(23) != 0) {
                                        z = false;
                                    }
                                }
                                esVar.m4779b(z);
                                esVar.f5690a.m4907f().mo1606c();
                                esVar.f5698i = false;
                                if (query.moveToNext()) {
                                    mo1623t().f18134a.m4847a("Got multiple records for app, expected one. appId", ft.m16220a(str));
                                }
                                if (query != null) {
                                    query.close();
                                }
                                return esVar;
                            }
                        }
                        z2 = true;
                        esVar.m4775a(z2);
                        j = query.getLong(11);
                        esVar.f5690a.m4907f().mo1606c();
                        if (esVar.f5691b == j) {
                        }
                        esVar.f5698i |= esVar.f5691b == j ? 1 : 0;
                        esVar.f5691b = j;
                        j = query.getLong(12);
                        esVar.f5690a.m4907f().mo1606c();
                        if (esVar.f5692c == j) {
                        }
                        esVar.f5698i |= esVar.f5692c == j ? 1 : 0;
                        esVar.f5692c = j;
                        j = query.getLong(13);
                        esVar.f5690a.m4907f().mo1606c();
                        if (esVar.f5693d == j) {
                        }
                        esVar.f5698i |= esVar.f5693d == j ? 1 : 0;
                        esVar.f5693d = j;
                        j = query.getLong(14);
                        esVar.f5690a.m4907f().mo1606c();
                        if (esVar.f5694e == j) {
                        }
                        esVar.f5698i |= esVar.f5694e == j ? 1 : 0;
                        esVar.f5694e = j;
                        esVar.m4793g(query.getLong(15));
                        esVar.m4796h(query.getLong(16));
                        if (query.isNull(17)) {
                        }
                        esVar.m4781c(query.isNull(17) ? -2147483648L : (long) query.getInt(17));
                        esVar.m4785d(query.getString(18));
                        j = query.getLong(19);
                        esVar.f5690a.m4907f().mo1606c();
                        if (esVar.f5695f == j) {
                        }
                        esVar.f5698i |= esVar.f5695f == j ? 1 : 0;
                        esVar.f5695f = j;
                        j = query.getLong(20);
                        esVar.f5690a.m4907f().mo1606c();
                        if (esVar.f5696g == j) {
                        }
                        esVar.f5698i |= esVar.f5696g == j ? 1 : 0;
                        esVar.f5696g = j;
                        esVar.m4794g(query.getString(21));
                        if (query.isNull(22)) {
                        }
                        esVar.m4798i(query.isNull(22) ? 0 : query.getLong(22));
                        if (query.isNull(23)) {
                            if (query.getInt(23) != 0) {
                                z = false;
                            }
                        }
                        esVar.m4779b(z);
                        esVar.f5690a.m4907f().mo1606c();
                        esVar.f5698i = false;
                        if (query.moveToNext()) {
                            mo1623t().f18134a.m4847a("Got multiple records for app, expected one. appId", ft.m16220a(str));
                        }
                        if (query != null) {
                            query.close();
                        }
                        return esVar;
                    } catch (SQLiteException e2) {
                        e = e2;
                        cursor = query;
                        obj = e;
                        try {
                            mo1623t().f18134a.m4848a("Error querying app. appId", ft.m16220a(str), obj);
                            if (cursor != null) {
                                cursor.close();
                            }
                            return null;
                        } catch (Throwable th22) {
                            th = th22;
                            query = cursor;
                            if (query != null) {
                                query.close();
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th22 = th3;
                        th = th22;
                        if (query != null) {
                            query.close();
                        }
                        throw th;
                    }
                }
                if (query != null) {
                    query.close();
                }
                return null;
            } catch (SQLiteException e3) {
                e = e3;
                exVar = this;
                cursor = query;
                obj = e;
                mo1623t().f18134a.m4848a("Error querying app. appId", ft.m16220a(str), obj);
                if (cursor != null) {
                    cursor.close();
                }
                return null;
            } catch (Throwable th4) {
                th22 = th4;
                exVar = this;
                th = th22;
                if (query != null) {
                    query.close();
                }
                throw th;
            }
        } catch (SQLiteException e4) {
            exVar = this;
            obj = e4;
            cursor = null;
            mo1623t().f18134a.m4848a("Error querying app. appId", ft.m16220a(str), obj);
            if (cursor != null) {
                cursor.close();
            }
            return null;
        } catch (Throwable th222) {
            exVar = this;
            th = th222;
            query = null;
            if (query != null) {
                query.close();
            }
            throw th;
        }
    }

    public final List<zzcfi> m16079b(String str, String str2, String str3) {
        ac.m4378a(str);
        mo1606c();
        m11975L();
        List arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder stringBuilder = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            stringBuilder.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            stringBuilder.append(" and name glob ?");
        }
        return m16080b(stringBuilder.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    public final List<zzcfi> m16080b(String str, String[] strArr) {
        Object obj;
        Cursor cursor;
        Throwable th;
        mo1606c();
        m11975L();
        List<zzcfi> arrayList = new ArrayList();
        Cursor query;
        try {
            r5 = new String[13];
            boolean z = false;
            r5[0] = "app_id";
            r5[1] = "origin";
            r5[2] = "name";
            r5[3] = "value";
            r5[4] = Active.ELEMENT;
            r5[5] = "trigger_event_name";
            r5[6] = "trigger_timeout";
            r5[7] = "timed_out_event";
            r5[8] = "creation_timestamp";
            r5[9] = "triggered_event";
            r5[10] = "triggered_timestamp";
            r5[11] = "time_to_live";
            r5[12] = "expired_event";
            int i = 8;
            i = 7;
            i = 6;
            i = 5;
            i = 4;
            query = m16057A().query("conditional_properties", r5, str, strArr, null, null, "rowid", "1001");
            try {
                if (query.moveToFirst()) {
                    while (arrayList.size() < IjkMediaCodecInfo.RANK_MAX) {
                        String string = query.getString(z);
                        String string2 = query.getString(1);
                        String string3 = query.getString(2);
                        Object a = m16047a(query, 3);
                        boolean z2 = query.getInt(i) != 0 ? true : z;
                        String string4 = query.getString(5);
                        long j = query.getLong(6);
                        zzcfx com_google_android_gms_internal_zzcfx = (zzcfx) mo1619p().m16593a(query.getBlob(7), zzcfx.CREATOR);
                        String str2 = string;
                        String str3 = string2;
                        arrayList.add(new zzcfi(str2, str3, new zzckk(string3, query.getLong(10), a, string2), query.getLong(8), z2, string4, com_google_android_gms_internal_zzcfx, j, (zzcfx) mo1619p().m16593a(query.getBlob(9), zzcfx.CREATOR), query.getLong(11), (zzcfx) mo1619p().m16593a(query.getBlob(12), zzcfx.CREATOR)));
                        if (!query.moveToNext()) {
                            break;
                        }
                        i = 4;
                        z = false;
                    }
                    mo1623t().f18134a.m4847a("Read more than the max allowed conditional properties, ignoring extra", Integer.valueOf(IjkMediaCodecInfo.RANK_MAX));
                    if (query != null) {
                        query.close();
                    }
                    return arrayList;
                }
                if (query != null) {
                    query.close();
                }
                return arrayList;
            } catch (SQLiteException e) {
                obj = e;
                cursor = query;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (SQLiteException e2) {
            obj = e2;
            cursor = null;
            try {
                mo1623t().f18134a.m4847a("Error querying conditional user property value", obj);
                arrayList = Collections.emptyList();
                if (cursor != null) {
                    cursor.close();
                }
                return arrayList;
            } catch (Throwable th22) {
                th = th22;
                query = cursor;
                if (query != null) {
                    query.close();
                }
                throw th;
            }
        } catch (Throwable th222) {
            th = th222;
            query = null;
            if (query != null) {
                query.close();
            }
            throw th;
        }
    }

    public final void m16081b(String str, String str2) {
        ac.m4378a(str);
        ac.m4378a(str2);
        mo1606c();
        m11975L();
        try {
            mo1623t().f18140g.m4847a("Deleted user attribute rows", Integer.valueOf(m16057A().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2})));
        } catch (SQLiteException e) {
            mo1623t().f18134a.m4849a("Error deleting user attribute. appId", ft.m16220a(str), mo1618o().m16198c(str2), e);
        }
    }

    public final long m16082c(String str) {
        ac.m4378a(str);
        mo1606c();
        m11975L();
        try {
            SQLiteDatabase A = m16057A();
            String valueOf = String.valueOf(Math.max(0, Math.min(1000000, mo1625v().m11921b(str, fj.f5777r))));
            return (long) A.delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str, valueOf});
        } catch (SQLiteException e) {
            mo1623t().f18134a.m4848a("Error deleting over the limit events. appId", ft.m16220a(str), e);
            return 0;
        }
    }

    public final jt m16083c(String str, String str2) {
        Cursor query;
        SQLiteException e;
        Object obj;
        Throwable th;
        Throwable th2;
        ex exVar;
        String str3 = str2;
        ac.m4378a(str);
        ac.m4378a(str2);
        mo1606c();
        m11975L();
        try {
            query = m16057A().query("user_attributes", new String[]{"set_timestamp", "value", "origin"}, "app_id=? and name=?", new String[]{str, str3}, null, null, null);
            try {
                if (query.moveToFirst()) {
                    long j = query.getLong(0);
                    try {
                        String str4 = str;
                        jt jtVar = new jt(str4, query.getString(2), str3, j, m16047a(query, 1));
                        if (query.moveToNext()) {
                            mo1623t().f18134a.m4847a("Got multiple records for user property, expected one. appId", ft.m16220a(str));
                        }
                        if (query != null) {
                            query.close();
                        }
                        return jtVar;
                    } catch (SQLiteException e2) {
                        e = e2;
                        obj = e;
                        try {
                            mo1623t().f18134a.m4849a("Error querying user property. appId", ft.m16220a(str), mo1618o().m16198c(str3), obj);
                            if (query != null) {
                                query.close();
                            }
                            return null;
                        } catch (Throwable th3) {
                            th = th3;
                            th2 = th;
                            if (query != null) {
                                query.close();
                            }
                            throw th2;
                        }
                    }
                }
                if (query != null) {
                    query.close();
                }
                return null;
            } catch (SQLiteException e3) {
                e = e3;
                exVar = this;
                obj = e;
                mo1623t().f18134a.m4849a("Error querying user property. appId", ft.m16220a(str), mo1618o().m16198c(str3), obj);
                if (query != null) {
                    query.close();
                }
                return null;
            } catch (Throwable th4) {
                th = th4;
                exVar = this;
                th2 = th;
                if (query != null) {
                    query.close();
                }
                throw th2;
            }
        } catch (SQLiteException e4) {
            exVar = this;
            obj = e4;
            query = null;
            mo1623t().f18134a.m4849a("Error querying user property. appId", ft.m16220a(str), mo1618o().m16198c(str3), obj);
            if (query != null) {
                query.close();
            }
            return null;
        } catch (Throwable th5) {
            exVar = this;
            th2 = th5;
            query = null;
            if (query != null) {
                query.close();
            }
            throw th2;
        }
    }

    public final zzcfi m16084d(String str, String str2) {
        Cursor query;
        SQLiteException e;
        Object obj;
        Throwable th;
        Throwable th2;
        ex exVar;
        String str3 = str2;
        ac.m4378a(str);
        ac.m4378a(str2);
        mo1606c();
        m11975L();
        try {
            int i = 8;
            i = 6;
            int i2 = 5;
            query = m16057A().query("conditional_properties", new String[]{"origin", "value", Active.ELEMENT, "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, "app_id=? and name=?", new String[]{str, str3}, null, null, null);
            try {
                if (query.moveToFirst()) {
                    String string = query.getString(0);
                    try {
                        Object a = m16047a(query, 1);
                        boolean z = query.getInt(2) != 0;
                        String string2 = query.getString(3);
                        long j = query.getLong(4);
                        zzcfx com_google_android_gms_internal_zzcfx = (zzcfx) mo1619p().m16593a(query.getBlob(i2), zzcfx.CREATOR);
                        String str4 = str;
                        zzcfi com_google_android_gms_internal_zzcfi = new zzcfi(str4, string, new zzckk(str3, query.getLong(8), a, string), query.getLong(i), z, string2, com_google_android_gms_internal_zzcfx, j, (zzcfx) mo1619p().m16593a(query.getBlob(7), zzcfx.CREATOR), query.getLong(9), (zzcfx) mo1619p().m16593a(query.getBlob(10), zzcfx.CREATOR));
                        if (query.moveToNext()) {
                            mo1623t().f18134a.m4848a("Got multiple records for conditional property, expected one", ft.m16220a(str), mo1618o().m16198c(str3));
                        }
                        if (query != null) {
                            query.close();
                        }
                        return com_google_android_gms_internal_zzcfi;
                    } catch (SQLiteException e2) {
                        e = e2;
                        obj = e;
                        try {
                            mo1623t().f18134a.m4849a("Error querying conditional property", ft.m16220a(str), mo1618o().m16198c(str3), obj);
                            if (query != null) {
                                query.close();
                            }
                            return null;
                        } catch (Throwable th3) {
                            th = th3;
                            th2 = th;
                            if (query != null) {
                                query.close();
                            }
                            throw th2;
                        }
                    }
                }
                if (query != null) {
                    query.close();
                }
                return null;
            } catch (SQLiteException e3) {
                e = e3;
                exVar = this;
                obj = e;
                mo1623t().f18134a.m4849a("Error querying conditional property", ft.m16220a(str), mo1618o().m16198c(str3), obj);
                if (query != null) {
                    query.close();
                }
                return null;
            } catch (Throwable th4) {
                th = th4;
                exVar = this;
                th2 = th;
                if (query != null) {
                    query.close();
                }
                throw th2;
            }
        } catch (SQLiteException e4) {
            exVar = this;
            obj = e4;
            query = null;
            mo1623t().f18134a.m4849a("Error querying conditional property", ft.m16220a(str), mo1618o().m16198c(str3), obj);
            if (query != null) {
                query.close();
            }
            return null;
        } catch (Throwable th5) {
            exVar = this;
            th2 = th5;
            query = null;
            if (query != null) {
                query.close();
            }
            throw th2;
        }
    }

    public final byte[] m16085d(String str) {
        Cursor query;
        Object e;
        Throwable th;
        ac.m4378a(str);
        mo1606c();
        m11975L();
        try {
            query = m16057A().query("apps", new String[]{"remote_config"}, "app_id=?", new String[]{str}, null, null, null);
            try {
                if (query.moveToFirst()) {
                    byte[] blob = query.getBlob(0);
                    if (query.moveToNext()) {
                        mo1623t().f18134a.m4847a("Got multiple records for app config, expected one. appId", ft.m16220a(str));
                    }
                    if (query != null) {
                        query.close();
                    }
                    return blob;
                }
                if (query != null) {
                    query.close();
                }
                return null;
            } catch (SQLiteException e2) {
                e = e2;
                try {
                    mo1623t().f18134a.m4848a("Error querying remote config. appId", ft.m16220a(str), e);
                    if (query != null) {
                        query.close();
                    }
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    if (query != null) {
                        query.close();
                    }
                    throw th;
                }
            }
        } catch (SQLiteException e3) {
            e = e3;
            query = null;
            mo1623t().f18134a.m4848a("Error querying remote config. appId", ft.m16220a(str), e);
            if (query != null) {
                query.close();
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
            query = null;
            if (query != null) {
                query.close();
            }
            throw th;
        }
    }

    public final int m16086e(String str, String str2) {
        ac.m4378a(str);
        ac.m4378a(str2);
        mo1606c();
        m11975L();
        try {
            return m16057A().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            mo1623t().f18134a.m4849a("Error deleting conditional property", ft.m16220a(str), mo1618o().m16198c(str2), e);
            return 0;
        }
    }

    final Map<Integer, kj> m16087e(String str) {
        Object e;
        Throwable th;
        m11975L();
        mo1606c();
        ac.m4378a(str);
        Cursor query;
        try {
            query = m16057A().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{str}, null, null, null);
            if (query.moveToFirst()) {
                Map<Integer, kj> c4813a = new C4813a();
                do {
                    int i = query.getInt(0);
                    byte[] blob = query.getBlob(1);
                    nz a = nz.m5045a(blob, blob.length);
                    oi kjVar = new kj();
                    try {
                        kjVar.mo3038a(a);
                    } catch (IOException e2) {
                        mo1623t().f18134a.m4849a("Failed to merge filter results. appId, audienceId, error", ft.m16220a(str), Integer.valueOf(i), e2);
                    }
                    try {
                        c4813a.put(Integer.valueOf(i), kjVar);
                    } catch (SQLiteException e3) {
                        e = e3;
                    }
                } while (query.moveToNext());
                if (query != null) {
                    query.close();
                }
                return c4813a;
            }
            if (query != null) {
                query.close();
            }
            return null;
        } catch (SQLiteException e4) {
            e = e4;
            query = null;
            try {
                mo1623t().f18134a.m4848a("Database error querying filter results. appId", ft.m16220a(str), e);
                if (query != null) {
                    query.close();
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                if (query != null) {
                    query.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            query = null;
            if (query != null) {
                query.close();
            }
            throw th;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    final java.util.Map<java.lang.Integer, java.util.List<com.google.android.gms.internal.jw>> m16088f(java.lang.String r13, java.lang.String r14) {
        /*
        r12 = this;
        r12.m11975L();
        r12.mo1606c();
        com.google.android.gms.common.internal.ac.m4378a(r13);
        com.google.android.gms.common.internal.ac.m4378a(r14);
        r0 = new android.support.v4.g.a;
        r0.<init>();
        r1 = r12.m16057A();
        r9 = 0;
        r2 = "event_filters";
        r3 = 2;
        r4 = new java.lang.String[r3];	 Catch:{ SQLiteException -> 0x009a, all -> 0x0097 }
        r5 = "audience_id";
        r10 = 0;
        r4[r10] = r5;	 Catch:{ SQLiteException -> 0x009a, all -> 0x0097 }
        r5 = "data";
        r11 = 1;
        r4[r11] = r5;	 Catch:{ SQLiteException -> 0x009a, all -> 0x0097 }
        r5 = "app_id=? AND event_name=?";
        r6 = new java.lang.String[r3];	 Catch:{ SQLiteException -> 0x009a, all -> 0x0097 }
        r6[r10] = r13;	 Catch:{ SQLiteException -> 0x009a, all -> 0x0097 }
        r6[r11] = r14;	 Catch:{ SQLiteException -> 0x009a, all -> 0x0097 }
        r14 = 0;
        r7 = 0;
        r8 = 0;
        r3 = r4;
        r4 = r5;
        r5 = r6;
        r6 = r14;
        r14 = r1.query(r2, r3, r4, r5, r6, r7, r8);	 Catch:{ SQLiteException -> 0x009a, all -> 0x0097 }
        r1 = r14.moveToFirst();	 Catch:{ SQLiteException -> 0x0095 }
        if (r1 != 0) goto L_0x0048;
    L_0x003e:
        r0 = java.util.Collections.emptyMap();	 Catch:{ SQLiteException -> 0x0095 }
        if (r14 == 0) goto L_0x0047;
    L_0x0044:
        r14.close();
    L_0x0047:
        return r0;
    L_0x0048:
        r1 = r14.getBlob(r11);	 Catch:{ SQLiteException -> 0x0095 }
        r2 = r1.length;	 Catch:{ SQLiteException -> 0x0095 }
        r1 = com.google.android.gms.internal.nz.m5045a(r1, r2);	 Catch:{ SQLiteException -> 0x0095 }
        r2 = new com.google.android.gms.internal.jw;	 Catch:{ SQLiteException -> 0x0095 }
        r2.<init>();	 Catch:{ SQLiteException -> 0x0095 }
        r2.mo3038a(r1);	 Catch:{ IOException -> 0x0079 }
        r1 = r14.getInt(r10);	 Catch:{ SQLiteException -> 0x0095 }
        r3 = java.lang.Integer.valueOf(r1);	 Catch:{ SQLiteException -> 0x0095 }
        r3 = r0.get(r3);	 Catch:{ SQLiteException -> 0x0095 }
        r3 = (java.util.List) r3;	 Catch:{ SQLiteException -> 0x0095 }
        if (r3 != 0) goto L_0x0075;
    L_0x0069:
        r3 = new java.util.ArrayList;	 Catch:{ SQLiteException -> 0x0095 }
        r3.<init>();	 Catch:{ SQLiteException -> 0x0095 }
        r1 = java.lang.Integer.valueOf(r1);	 Catch:{ SQLiteException -> 0x0095 }
        r0.put(r1, r3);	 Catch:{ SQLiteException -> 0x0095 }
    L_0x0075:
        r3.add(r2);	 Catch:{ SQLiteException -> 0x0095 }
        goto L_0x0089;
    L_0x0079:
        r1 = move-exception;
        r2 = r12.mo1623t();	 Catch:{ SQLiteException -> 0x0095 }
        r2 = r2.f18134a;	 Catch:{ SQLiteException -> 0x0095 }
        r3 = "Failed to merge filter. appId";
        r4 = com.google.android.gms.internal.ft.m16220a(r13);	 Catch:{ SQLiteException -> 0x0095 }
        r2.m4848a(r3, r4, r1);	 Catch:{ SQLiteException -> 0x0095 }
    L_0x0089:
        r1 = r14.moveToNext();	 Catch:{ SQLiteException -> 0x0095 }
        if (r1 != 0) goto L_0x0048;
    L_0x008f:
        if (r14 == 0) goto L_0x0094;
    L_0x0091:
        r14.close();
    L_0x0094:
        return r0;
    L_0x0095:
        r0 = move-exception;
        goto L_0x009c;
    L_0x0097:
        r13 = move-exception;
        r14 = r9;
        goto L_0x00b2;
    L_0x009a:
        r0 = move-exception;
        r14 = r9;
    L_0x009c:
        r1 = r12.mo1623t();	 Catch:{ all -> 0x00b1 }
        r1 = r1.f18134a;	 Catch:{ all -> 0x00b1 }
        r2 = "Database error querying filters. appId";
        r13 = com.google.android.gms.internal.ft.m16220a(r13);	 Catch:{ all -> 0x00b1 }
        r1.m4848a(r2, r13, r0);	 Catch:{ all -> 0x00b1 }
        if (r14 == 0) goto L_0x00b0;
    L_0x00ad:
        r14.close();
    L_0x00b0:
        return r9;
    L_0x00b1:
        r13 = move-exception;
    L_0x00b2:
        if (r14 == 0) goto L_0x00b7;
    L_0x00b4:
        r14.close();
    L_0x00b7:
        throw r13;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ex.f(java.lang.String, java.lang.String):java.util.Map<java.lang.Integer, java.util.List<com.google.android.gms.internal.jw>>");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    final java.util.Map<java.lang.Integer, java.util.List<com.google.android.gms.internal.jz>> m16089g(java.lang.String r13, java.lang.String r14) {
        /*
        r12 = this;
        r12.m11975L();
        r12.mo1606c();
        com.google.android.gms.common.internal.ac.m4378a(r13);
        com.google.android.gms.common.internal.ac.m4378a(r14);
        r0 = new android.support.v4.g.a;
        r0.<init>();
        r1 = r12.m16057A();
        r9 = 0;
        r2 = "property_filters";
        r3 = 2;
        r4 = new java.lang.String[r3];	 Catch:{ SQLiteException -> 0x009a, all -> 0x0097 }
        r5 = "audience_id";
        r10 = 0;
        r4[r10] = r5;	 Catch:{ SQLiteException -> 0x009a, all -> 0x0097 }
        r5 = "data";
        r11 = 1;
        r4[r11] = r5;	 Catch:{ SQLiteException -> 0x009a, all -> 0x0097 }
        r5 = "app_id=? AND property_name=?";
        r6 = new java.lang.String[r3];	 Catch:{ SQLiteException -> 0x009a, all -> 0x0097 }
        r6[r10] = r13;	 Catch:{ SQLiteException -> 0x009a, all -> 0x0097 }
        r6[r11] = r14;	 Catch:{ SQLiteException -> 0x009a, all -> 0x0097 }
        r14 = 0;
        r7 = 0;
        r8 = 0;
        r3 = r4;
        r4 = r5;
        r5 = r6;
        r6 = r14;
        r14 = r1.query(r2, r3, r4, r5, r6, r7, r8);	 Catch:{ SQLiteException -> 0x009a, all -> 0x0097 }
        r1 = r14.moveToFirst();	 Catch:{ SQLiteException -> 0x0095 }
        if (r1 != 0) goto L_0x0048;
    L_0x003e:
        r0 = java.util.Collections.emptyMap();	 Catch:{ SQLiteException -> 0x0095 }
        if (r14 == 0) goto L_0x0047;
    L_0x0044:
        r14.close();
    L_0x0047:
        return r0;
    L_0x0048:
        r1 = r14.getBlob(r11);	 Catch:{ SQLiteException -> 0x0095 }
        r2 = r1.length;	 Catch:{ SQLiteException -> 0x0095 }
        r1 = com.google.android.gms.internal.nz.m5045a(r1, r2);	 Catch:{ SQLiteException -> 0x0095 }
        r2 = new com.google.android.gms.internal.jz;	 Catch:{ SQLiteException -> 0x0095 }
        r2.<init>();	 Catch:{ SQLiteException -> 0x0095 }
        r2.mo3038a(r1);	 Catch:{ IOException -> 0x0079 }
        r1 = r14.getInt(r10);	 Catch:{ SQLiteException -> 0x0095 }
        r3 = java.lang.Integer.valueOf(r1);	 Catch:{ SQLiteException -> 0x0095 }
        r3 = r0.get(r3);	 Catch:{ SQLiteException -> 0x0095 }
        r3 = (java.util.List) r3;	 Catch:{ SQLiteException -> 0x0095 }
        if (r3 != 0) goto L_0x0075;
    L_0x0069:
        r3 = new java.util.ArrayList;	 Catch:{ SQLiteException -> 0x0095 }
        r3.<init>();	 Catch:{ SQLiteException -> 0x0095 }
        r1 = java.lang.Integer.valueOf(r1);	 Catch:{ SQLiteException -> 0x0095 }
        r0.put(r1, r3);	 Catch:{ SQLiteException -> 0x0095 }
    L_0x0075:
        r3.add(r2);	 Catch:{ SQLiteException -> 0x0095 }
        goto L_0x0089;
    L_0x0079:
        r1 = move-exception;
        r2 = r12.mo1623t();	 Catch:{ SQLiteException -> 0x0095 }
        r2 = r2.f18134a;	 Catch:{ SQLiteException -> 0x0095 }
        r3 = "Failed to merge filter";
        r4 = com.google.android.gms.internal.ft.m16220a(r13);	 Catch:{ SQLiteException -> 0x0095 }
        r2.m4848a(r3, r4, r1);	 Catch:{ SQLiteException -> 0x0095 }
    L_0x0089:
        r1 = r14.moveToNext();	 Catch:{ SQLiteException -> 0x0095 }
        if (r1 != 0) goto L_0x0048;
    L_0x008f:
        if (r14 == 0) goto L_0x0094;
    L_0x0091:
        r14.close();
    L_0x0094:
        return r0;
    L_0x0095:
        r0 = move-exception;
        goto L_0x009c;
    L_0x0097:
        r13 = move-exception;
        r14 = r9;
        goto L_0x00b2;
    L_0x009a:
        r0 = move-exception;
        r14 = r9;
    L_0x009c:
        r1 = r12.mo1623t();	 Catch:{ all -> 0x00b1 }
        r1 = r1.f18134a;	 Catch:{ all -> 0x00b1 }
        r2 = "Database error querying filters. appId";
        r13 = com.google.android.gms.internal.ft.m16220a(r13);	 Catch:{ all -> 0x00b1 }
        r1.m4848a(r2, r13, r0);	 Catch:{ all -> 0x00b1 }
        if (r14 == 0) goto L_0x00b0;
    L_0x00ad:
        r14.close();
    L_0x00b0:
        return r9;
    L_0x00b1:
        r13 = move-exception;
    L_0x00b2:
        if (r14 == 0) goto L_0x00b7;
    L_0x00b4:
        r14.close();
    L_0x00b7:
        throw r13;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ex.g(java.lang.String, java.lang.String):java.util.Map<java.lang.Integer, java.util.List<com.google.android.gms.internal.jz>>");
    }

    protected final long m16090h(String str, String str2) {
        SQLiteException e;
        Object obj;
        Throwable th;
        Throwable th2;
        ex exVar;
        String str3 = str;
        String str4 = str2;
        ac.m4378a(str);
        ac.m4378a(str2);
        mo1606c();
        m11975L();
        SQLiteDatabase A = m16057A();
        A.beginTransaction();
        long a;
        try {
            ContentValues contentValues;
            StringBuilder stringBuilder = new StringBuilder(32 + String.valueOf(str2).length());
            stringBuilder.append("select ");
            stringBuilder.append(str4);
            stringBuilder.append(" from app2 where app_id=?");
            try {
                a = m16063a(stringBuilder.toString(), new String[]{str3}, -1);
                if (a == -1) {
                    contentValues = new ContentValues();
                    contentValues.put("app_id", str3);
                    contentValues.put("first_open_count", Integer.valueOf(0));
                    contentValues.put("previous_install_count", Integer.valueOf(0));
                    if (A.insertWithOnConflict("app2", null, contentValues, 5) == -1) {
                        mo1623t().f18134a.m4848a("Failed to insert column (got -1). appId", ft.m16220a(str), str4);
                        A.endTransaction();
                        return -1;
                    }
                    a = 0;
                }
            } catch (SQLiteException e2) {
                e = e2;
                obj = e;
                a = 0;
                try {
                    mo1623t().f18134a.m4849a("Error inserting column. appId", ft.m16220a(str), str4, obj);
                    A.endTransaction();
                    return a;
                } catch (Throwable th3) {
                    th = th3;
                    th2 = th;
                    A.endTransaction();
                    throw th2;
                }
            }
            try {
                contentValues = new ContentValues();
                contentValues.put("app_id", str3);
                contentValues.put(str4, Long.valueOf(a + 1));
                if (((long) A.update("app2", contentValues, "app_id = ?", new String[]{str3})) == 0) {
                    mo1623t().f18134a.m4848a("Failed to update column (got 0). appId", ft.m16220a(str), str4);
                    A.endTransaction();
                    return -1;
                }
                A.setTransactionSuccessful();
                A.endTransaction();
                return a;
            } catch (SQLiteException e3) {
                obj = e3;
                mo1623t().f18134a.m4849a("Error inserting column. appId", ft.m16220a(str), str4, obj);
                A.endTransaction();
                return a;
            }
        } catch (SQLiteException e4) {
            e3 = e4;
            exVar = this;
            obj = e3;
            a = 0;
            mo1623t().f18134a.m4849a("Error inserting column. appId", ft.m16220a(str), str4, obj);
            A.endTransaction();
            return a;
        } catch (Throwable th4) {
            th = th4;
            exVar = this;
            th2 = th;
            A.endTransaction();
            throw th2;
        }
    }

    protected final boolean mo3036w() {
        return false;
    }

    public final void m16092x() {
        m11975L();
        m16057A().beginTransaction();
    }

    public final void m16093y() {
        m11975L();
        m16057A().setTransactionSuccessful();
    }

    public final void m16094z() {
        m11975L();
        m16057A().endTransaction();
    }
}
