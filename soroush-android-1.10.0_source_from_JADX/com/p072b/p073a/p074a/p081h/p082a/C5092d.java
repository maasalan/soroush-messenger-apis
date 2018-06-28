package com.p072b.p073a.p074a.p081h.p082a;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import com.p072b.p073a.p074a.C1029e;
import com.p072b.p073a.p074a.C1063i;
import com.p072b.p073a.p074a.C1066j;
import com.p072b.p073a.p074a.C1066j.C5094a;
import com.p072b.p073a.p074a.C1069m;
import com.p072b.p073a.p074a.C1075s;
import com.p072b.p073a.p074a.p075b.C1020a;
import com.p072b.p073a.p074a.p078e.C1028b;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p206d.C2273l;

public final class C5092d implements C1069m {
    private C1048a f14214a;
    private final long f14215b;
    private SQLiteDatabase f14216c;
    private C1054c f14217d;
    private C1056c f14218e;
    private C1049b f14219f;
    private final StringBuilder f14220g = new StringBuilder();
    private final C1058f f14221h;

    static class C1055a extends Exception {
        C1055a(String str) {
            super(str);
        }

        C1055a(String str, Throwable th) {
            super(str, th);
        }
    }

    public interface C1056c {
        <T extends C1063i> T mo1088a(byte[] bArr);

        byte[] mo1089a(Object obj);
    }

    public static class C5091b implements C1056c {
        public final <T extends C1063i> T mo1088a(byte[] bArr) {
            Throwable th;
            ObjectInputStream objectInputStream = null;
            if (bArr == null || bArr.length == 0) {
                return null;
            }
            try {
                ObjectInputStream objectInputStream2 = new ObjectInputStream(new ByteArrayInputStream(bArr));
                try {
                    C1063i c1063i = (C1063i) objectInputStream2.readObject();
                    objectInputStream2.close();
                    return c1063i;
                } catch (Throwable th2) {
                    th = th2;
                    objectInputStream = objectInputStream2;
                    if (objectInputStream != null) {
                        objectInputStream.close();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                if (objectInputStream != null) {
                    objectInputStream.close();
                }
                throw th;
            }
        }

        public final byte[] mo1089a(Object obj) {
            ByteArrayOutputStream byteArrayOutputStream;
            Throwable th;
            if (obj == null) {
                return null;
            }
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    new ObjectOutputStream(byteArrayOutputStream).writeObject(obj);
                    byte[] toByteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    return toByteArray;
                } catch (Throwable th2) {
                    th = th2;
                    if (byteArrayOutputStream != null) {
                        byteArrayOutputStream.close();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                byteArrayOutputStream = null;
                if (byteArrayOutputStream != null) {
                    byteArrayOutputStream.close();
                }
                throw th;
            }
        }
    }

    public C5092d(C1020a c1020a, long j, C1056c c1056c) {
        String str;
        this.f14215b = j;
        Context context = c1020a.f3290f;
        StringBuilder stringBuilder = new StringBuilder("jobs_");
        stringBuilder.append(c1020a.f3285a);
        this.f14219f = new C1049b(context, stringBuilder.toString());
        this.f14221h = new C1058f(j);
        context = c1020a.f3290f;
        if (c1020a.f3297m) {
            str = null;
        } else {
            stringBuilder = new StringBuilder("db_");
            stringBuilder.append(c1020a.f3285a);
            str = stringBuilder.toString();
        }
        this.f14214a = new C1048a(context, str);
        this.f14216c = this.f14214a.getWritableDatabase();
        this.f14217d = new C1054c(this.f14216c, "job_holder", C1048a.f3383b.f3405a, "job_holder_tags", j);
        this.f14218e = c1056c;
        if (c1020a.f3298n) {
            SQLiteDatabase sQLiteDatabase = this.f14217d.f3423n;
            StringBuilder stringBuilder2 = new StringBuilder("UPDATE job_holder SET ");
            stringBuilder2.append(C1048a.f3388g.f3405a);
            stringBuilder2.append("=?");
            sQLiteDatabase.execSQL(stringBuilder2.toString(), new Object[]{Long.valueOf(Long.MIN_VALUE)});
        }
        this.f14216c.execSQL(this.f14217d.f3414e);
        m10389c();
    }

    private C1063i m10384a(byte[] bArr) {
        try {
            return this.f14218e.mo1088a(bArr);
        } catch (Throwable th) {
            C1028b.m2505a(th, "error while deserializing job", new Object[0]);
            return null;
        }
    }

    private C1066j m10385a(Cursor cursor) {
        String string = cursor.getString(C1048a.f3383b.f3407c);
        try {
            C1063i a = m10384a(this.f14219f.m2538a(string));
            if (a == null) {
                throw new C1055a("null job");
            }
            Set c = m10388c(string);
            C5094a c5094a = new C5094a();
            c5094a.f3450b = Long.valueOf(cursor.getLong(C1048a.f3382a.f3407c));
            c5094a = c5094a.m2554a(cursor.getInt(C1048a.f3384c.f3407c)).m2558a(cursor.getString(C1048a.f3385d.f3407c));
            c5094a.f3449a = cursor.getInt(C1048a.f3386e.f3407c);
            boolean z = true;
            C5094a a2 = c5094a.m2557a(a).m2564b(string).m2559a(c).m2560a(true);
            long j = cursor.getLong(C1048a.f3391j.f3407c);
            if (cursor.getInt(C1048a.f3392k.f3407c) != 1) {
                z = false;
            }
            return a2.m2556a(j, z).m2555a(cursor.getLong(C1048a.f3387f.f3407c)).m2563b(cursor.getLong(C1048a.f3388g.f3407c)).m2565c(cursor.getLong(C1048a.f3389h.f3407c)).m2562b(cursor.getInt(C1048a.f3390i.f3407c)).m2561a();
        } catch (Throwable e) {
            throw new C1055a("cannot load job from disk", e);
        }
    }

    private static void m10386a(SQLiteStatement sQLiteStatement, C1066j c1066j) {
        if (c1066j.f3464a != null) {
            sQLiteStatement.bindLong(C1048a.f3382a.f3407c + 1, c1066j.f3464a.longValue());
        }
        sQLiteStatement.bindString(C1048a.f3383b.f3407c + 1, c1066j.f3465b);
        sQLiteStatement.bindLong(C1048a.f3384c.f3407c + 1, (long) c1066j.f3467d);
        if (c1066j.f3468e != null) {
            sQLiteStatement.bindString(C1048a.f3385d.f3407c + 1, c1066j.f3468e);
        }
        sQLiteStatement.bindLong(C1048a.f3386e.f3407c + 1, (long) c1066j.f3469f);
        sQLiteStatement.bindLong(C1048a.f3387f.f3407c + 1, c1066j.f3471h);
        sQLiteStatement.bindLong(C1048a.f3388g.f3407c + 1, c1066j.f3470g);
        sQLiteStatement.bindLong(C1048a.f3389h.f3407c + 1, c1066j.f3472i);
        sQLiteStatement.bindLong(C1048a.f3390i.f3407c + 1, (long) c1066j.f3473j);
        sQLiteStatement.bindLong(C1048a.f3391j.f3407c + 1, c1066j.f3474k);
        long j = 0;
        sQLiteStatement.bindLong(C1048a.f3392k.f3407c + 1, c1066j.f3475l ? 1 : 0);
        int i = C1048a.f3393l.f3407c + 1;
        if (c1066j.f3478o) {
            j = 1;
        }
        sQLiteStatement.bindLong(i, j);
    }

    private void m10387b(String str) {
        this.f14216c.beginTransaction();
        try {
            C1054c c1054c = this.f14217d;
            if (c1054c.f3417h == null) {
                SQLiteDatabase sQLiteDatabase = c1054c.f3423n;
                StringBuilder stringBuilder = new StringBuilder("DELETE FROM ");
                stringBuilder.append(c1054c.f3424o);
                stringBuilder.append(" WHERE ");
                stringBuilder.append(c1054c.f3425p);
                stringBuilder.append(" = ?");
                c1054c.f3417h = sQLiteDatabase.compileStatement(stringBuilder.toString());
            }
            SQLiteStatement sQLiteStatement = c1054c.f3417h;
            sQLiteStatement.clearBindings();
            sQLiteStatement.bindString(1, str);
            sQLiteStatement.execute();
            c1054c = this.f14217d;
            if (c1054c.f3418i == null) {
                SQLiteDatabase sQLiteDatabase2 = c1054c.f3423n;
                StringBuilder stringBuilder2 = new StringBuilder("DELETE FROM ");
                stringBuilder2.append(c1054c.f3427r);
                stringBuilder2.append(" WHERE ");
                stringBuilder2.append(C1048a.f3395n.f3405a);
                stringBuilder2.append("= ?");
                c1054c.f3418i = sQLiteDatabase2.compileStatement(stringBuilder2.toString());
            }
            sQLiteStatement = c1054c.f3418i;
            sQLiteStatement.bindString(1, str);
            sQLiteStatement.execute();
            this.f14216c.setTransactionSuccessful();
            File b = this.f14219f.m2539b(str);
            if (b.exists()) {
                b.delete();
            }
            this.f14216c.endTransaction();
        } catch (Throwable th) {
            this.f14216c.endTransaction();
        }
    }

    private Set<String> m10388c(String str) {
        Cursor rawQuery = this.f14216c.rawQuery(this.f14217d.f3413d, new String[]{str});
        try {
            Set<String> set;
            if (rawQuery.getCount() == 0) {
                set = Collections.EMPTY_SET;
                return set;
            }
            set = new HashSet();
            while (rawQuery.moveToNext()) {
                set.add(rawQuery.getString(0));
            }
            rawQuery.close();
            return set;
        } finally {
            rawQuery.close();
        }
    }

    private void m10389c() {
        Cursor rawQuery = this.f14216c.rawQuery(this.f14217d.f3412c, null);
        Set hashSet = new HashSet();
        while (rawQuery.moveToNext()) {
            try {
                hashSet.add(rawQuery.getString(0));
            } finally {
                rawQuery.close();
            }
        }
        this.f14219f.m2537a(hashSet);
    }

    private C1057e m10390e(C1029e c1029e) {
        C1058f c1058f = this.f14221h;
        StringBuilder stringBuilder = this.f14220g;
        int i = 1;
        int i2 = (c1029e.f3320c.size() >= 64 || c1029e.f3321d.size() >= 64 || c1029e.f3322e.size() >= 64) ? 0 : 1;
        int i3 = 2;
        int ordinal = (((((c1029e.f3319b == null ? 2 : c1029e.f3319b.ordinal()) << 0) | (c1029e.f3320c.size() << 2)) | (c1029e.f3321d.size() << 8)) | (c1029e.f3322e.size() << 14)) | (c1029e.f3323f << 20);
        if (c1029e.f3324g != null) {
            i = 0;
        }
        long j = (long) ((i << 21) | ordinal);
        C1057e c1057e = i2 != 0 ? (C1057e) c1058f.f3440a.get(Long.valueOf(j)) : null;
        if (c1057e == null) {
            stringBuilder.setLength(0);
            stringBuilder.append("( (");
            stringBuilder.append(C1048a.f3391j.f3405a);
            stringBuilder.append(" != ");
            stringBuilder.append(C1057e.f3432i);
            stringBuilder.append(" AND ");
            stringBuilder.append(C1048a.f3391j.f3405a);
            stringBuilder.append(" <= ?) OR ");
            stringBuilder.append(C1048a.f3390i.f3405a);
            stringBuilder.append(" <= ?)");
            stringBuilder.append(" AND (");
            stringBuilder.append(C1048a.f3393l.f3405a);
            stringBuilder.append(" IS NULL OR ");
            stringBuilder.append(C1048a.f3393l.f3405a);
            stringBuilder.append(" != 1)");
            if (c1029e.f3324g != null) {
                stringBuilder.append(" AND ");
                stringBuilder.append(C1048a.f3388g.f3405a);
                stringBuilder.append(" <= ?");
                i3 = 3;
            }
            if (c1029e.f3319b != null) {
                if (c1029e.f3320c.isEmpty()) {
                    stringBuilder.append(" AND 0 ");
                } else {
                    stringBuilder.append(" AND ");
                    stringBuilder.append(C1048a.f3383b.f3405a);
                    stringBuilder.append(" IN ( SELECT ");
                    stringBuilder.append(C1048a.f3395n.f3405a);
                    stringBuilder.append(" FROM job_holder_tags WHERE ");
                    stringBuilder.append(C1048a.f3396o.f3405a);
                    stringBuilder.append(" IN (");
                    C1054c.m2542a(stringBuilder, c1029e.f3320c.size());
                    stringBuilder.append(")");
                    if (c1029e.f3319b != C1075s.ANY) {
                        if (c1029e.f3319b == C1075s.ALL) {
                            stringBuilder.append(" GROUP BY (`");
                            stringBuilder.append(C1048a.f3395n.f3405a);
                            stringBuilder.append("`) HAVING count(*) = ");
                            stringBuilder.append(c1029e.f3320c.size());
                        } else {
                            stringBuilder = new StringBuilder("unknown constraint ");
                            stringBuilder.append(c1029e);
                            throw new IllegalArgumentException(stringBuilder.toString());
                        }
                    }
                    stringBuilder.append(")");
                    i3 += c1029e.f3320c.size();
                }
            }
            if (!c1029e.f3321d.isEmpty()) {
                stringBuilder.append(" AND (");
                stringBuilder.append(C1048a.f3385d.f3405a);
                stringBuilder.append(" IS NULL OR ");
                stringBuilder.append(C1048a.f3385d.f3405a);
                stringBuilder.append(" NOT IN(");
                C1054c.m2542a(stringBuilder, c1029e.f3321d.size());
                stringBuilder.append("))");
                i3 += c1029e.f3321d.size();
            }
            if (!c1029e.f3322e.isEmpty()) {
                stringBuilder.append(" AND ");
                stringBuilder.append(C1048a.f3383b.f3405a);
                stringBuilder.append(" NOT IN(");
                C1054c.m2542a(stringBuilder, c1029e.f3322e.size());
                stringBuilder.append(")");
                i3 += c1029e.f3322e.size();
            }
            if (c1029e.f3323f) {
                stringBuilder.append(" AND ");
                stringBuilder.append(C1048a.f3389h.f3405a);
                stringBuilder.append(" != ?");
                i3++;
            }
            c1057e = new C1057e(j, stringBuilder.toString(), new String[i3]);
            if (i2 != 0) {
                c1058f.f3440a.put(Long.valueOf(j), c1057e);
            }
        }
        c1058f.m2548a(c1029e, c1057e);
        return c1057e;
    }

    private void m10391e(C1066j c1066j) {
        Closeable a;
        try {
            C1049b c1049b = this.f14219f;
            String str = c1066j.f3465b;
            byte[] a2 = this.f14218e.mo1089a(c1066j.f3476m);
            a = C2273l.m6208a(C2273l.m6216b(c1049b.m2539b(str)));
            a.mo3129c(a2).flush();
            C1049b.m2536a(a);
        } catch (Throwable e) {
            throw new RuntimeException("cannot save job to disk", e);
        } catch (Throwable th) {
            C1049b.m2536a(a);
        }
    }

    private boolean m10392f(C1066j c1066j) {
        SQLiteStatement a = this.f14217d.m2543a();
        C1054c c1054c = this.f14217d;
        if (c1054c.f3415f == null) {
            c1054c.f3422m.setLength(0);
            c1054c.f3422m.append("INSERT INTO job_holder_tags");
            c1054c.f3422m.append(" VALUES (");
            for (int i = 0; i < c1054c.f3428s; i++) {
                if (i != 0) {
                    c1054c.f3422m.append(",");
                }
                c1054c.f3422m.append("?");
            }
            c1054c.f3422m.append(")");
            c1054c.f3415f = c1054c.f3423n.compileStatement(c1054c.f3422m.toString());
        }
        SQLiteStatement sQLiteStatement = c1054c.f3415f;
        this.f14216c.beginTransaction();
        try {
            a.clearBindings();
            C5092d.m10386a(a, c1066j);
            if (a.executeInsert() != -1) {
                for (String str : c1066j.m2570a()) {
                    sQLiteStatement.clearBindings();
                    sQLiteStatement.bindString(C1048a.f3395n.f3407c + 1, c1066j.f3465b);
                    sQLiteStatement.bindString(C1048a.f3396o.f3407c + 1, str);
                    sQLiteStatement.executeInsert();
                }
                this.f14216c.setTransactionSuccessful();
                this.f14216c.endTransaction();
                return true;
            }
        } catch (Throwable th) {
            this.f14216c.endTransaction();
        }
        this.f14216c.endTransaction();
        return false;
    }

    public final int mo1058a() {
        C1054c c1054c = this.f14217d;
        if (c1054c.f3420k == null) {
            SQLiteDatabase sQLiteDatabase = c1054c.f3423n;
            StringBuilder stringBuilder = new StringBuilder("SELECT COUNT(*) FROM ");
            stringBuilder.append(c1054c.f3424o);
            stringBuilder.append(" WHERE ");
            stringBuilder.append(C1048a.f3389h.f3405a);
            stringBuilder.append(" != ?");
            c1054c.f3420k = sQLiteDatabase.compileStatement(stringBuilder.toString());
        }
        SQLiteStatement sQLiteStatement = c1054c.f3420k;
        sQLiteStatement.clearBindings();
        sQLiteStatement.bindLong(1, this.f14215b);
        return (int) sQLiteStatement.simpleQueryForLong();
    }

    public final int mo1059a(C1029e c1029e) {
        C1057e e = m10390e(c1029e);
        SQLiteDatabase sQLiteDatabase = this.f14216c;
        StringBuilder stringBuilder = this.f14220g;
        if (e.f3436d == null) {
            stringBuilder.setLength(0);
            stringBuilder.append("SELECT SUM(case WHEN ");
            stringBuilder.append(C1048a.f3385d.f3405a);
            stringBuilder.append(" is null then group_cnt else 1 end) from (SELECT count(*) group_cnt, ");
            stringBuilder.append(C1048a.f3385d.f3405a);
            stringBuilder.append(" FROM job_holder WHERE ");
            stringBuilder.append(e.f3434b);
            stringBuilder.append(" GROUP BY ");
            stringBuilder.append(C1048a.f3385d.f3405a);
            stringBuilder.append(")");
            e.f3436d = sQLiteDatabase.compileStatement(stringBuilder.toString());
        } else {
            e.f3436d.clearBindings();
        }
        for (int i = 1; i <= e.f3435c.length; i++) {
            e.f3436d.bindString(i, e.f3435c[i - 1]);
        }
        return (int) e.f3436d.simpleQueryForLong();
    }

    public final C1066j mo1060a(String str) {
        Cursor rawQuery = this.f14216c.rawQuery(this.f14217d.f3410a, new String[]{str});
        try {
            if (!rawQuery.moveToFirst()) {
                return null;
            }
            C1066j a = m10385a(rawQuery);
            rawQuery.close();
            return a;
        } catch (Throwable e) {
            C1028b.m2505a(e, "invalid job on findJobById", new Object[0]);
            return null;
        } finally {
            rawQuery.close();
        }
    }

    public final void mo1061a(C1066j c1066j, C1066j c1066j2) {
        this.f14216c.beginTransaction();
        try {
            mo1067c(c1066j2);
            mo1062a(c1066j);
            this.f14216c.setTransactionSuccessful();
        } finally {
            this.f14216c.endTransaction();
        }
    }

    public final boolean mo1062a(C1066j c1066j) {
        m10391e(c1066j);
        if (c1066j.m2575c()) {
            return m10392f(c1066j);
        }
        SQLiteStatement a = this.f14217d.m2543a();
        a.clearBindings();
        C5092d.m10386a(a, c1066j);
        long executeInsert = a.executeInsert();
        c1066j.m2572a(executeInsert);
        return executeInsert != -1;
    }

    public final com.p072b.p073a.p074a.C1066j mo1063b(com.p072b.p073a.p074a.C1029e r12) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r11 = this;
        r12 = r11.m10390e(r12);
        r0 = r11.f14217d;
        r1 = r12.f3439g;
        r2 = 2;
        r3 = 0;
        r4 = 3;
        r5 = 1;
        if (r1 != 0) goto L_0x003d;
    L_0x000e:
        r1 = r12.f3434b;
        r6 = java.lang.Integer.valueOf(r5);
        r7 = new com.p072b.p073a.p074a.p081h.p082a.C1054c.C1052b[r4];
        r8 = new com.b.a.a.h.a.c$b;
        r9 = com.p072b.p073a.p074a.p081h.p082a.C1048a.f3384c;
        r10 = com.p072b.p073a.p074a.p081h.p082a.C1054c.C1052b.C1051a.DESC;
        r8.<init>(r9, r10);
        r7[r3] = r8;
        r8 = new com.b.a.a.h.a.c$b;
        r9 = com.p072b.p073a.p074a.p081h.p082a.C1048a.f3387f;
        r10 = com.p072b.p073a.p074a.p081h.p082a.C1054c.C1052b.C1051a.ASC;
        r8.<init>(r9, r10);
        r7[r5] = r8;
        r8 = new com.b.a.a.h.a.c$b;
        r9 = com.p072b.p073a.p074a.p081h.p082a.C1048a.f3382a;
        r10 = com.p072b.p073a.p074a.p081h.p082a.C1054c.C1052b.C1051a.ASC;
        r8.<init>(r9, r10);
        r7[r2] = r8;
        r0 = r0.m2544a(r1, r6, r7);
        r12.f3439g = r0;
    L_0x003d:
        r0 = r12.f3439g;
    L_0x003f:
        r1 = r11.f14216c;
        r6 = r12.f3435c;
        r1 = r1.rawQuery(r0, r6);
        r6 = r1.moveToNext();	 Catch:{ a -> 0x00c2 }
        if (r6 != 0) goto L_0x0052;
    L_0x004d:
        r1.close();
        r12 = 0;
        return r12;
    L_0x0052:
        r6 = r11.m10385a(r1);	 Catch:{ a -> 0x00c2 }
        r7 = r11.f14217d;	 Catch:{ a -> 0x00c2 }
        r8 = r7.f3419j;	 Catch:{ a -> 0x00c2 }
        if (r8 != 0) goto L_0x009b;	 Catch:{ a -> 0x00c2 }
    L_0x005c:
        r8 = new java.lang.StringBuilder;	 Catch:{ a -> 0x00c2 }
        r9 = "UPDATE ";	 Catch:{ a -> 0x00c2 }
        r8.<init>(r9);	 Catch:{ a -> 0x00c2 }
        r9 = r7.f3424o;	 Catch:{ a -> 0x00c2 }
        r8.append(r9);	 Catch:{ a -> 0x00c2 }
        r9 = " SET ";	 Catch:{ a -> 0x00c2 }
        r8.append(r9);	 Catch:{ a -> 0x00c2 }
        r9 = com.p072b.p073a.p074a.p081h.p082a.C1048a.f3386e;	 Catch:{ a -> 0x00c2 }
        r9 = r9.f3405a;	 Catch:{ a -> 0x00c2 }
        r8.append(r9);	 Catch:{ a -> 0x00c2 }
        r9 = " = ? , ";	 Catch:{ a -> 0x00c2 }
        r8.append(r9);	 Catch:{ a -> 0x00c2 }
        r9 = com.p072b.p073a.p074a.p081h.p082a.C1048a.f3389h;	 Catch:{ a -> 0x00c2 }
        r9 = r9.f3405a;	 Catch:{ a -> 0x00c2 }
        r8.append(r9);	 Catch:{ a -> 0x00c2 }
        r9 = " = ?  WHERE ";	 Catch:{ a -> 0x00c2 }
        r8.append(r9);	 Catch:{ a -> 0x00c2 }
        r9 = r7.f3425p;	 Catch:{ a -> 0x00c2 }
        r8.append(r9);	 Catch:{ a -> 0x00c2 }
        r9 = " = ? ";	 Catch:{ a -> 0x00c2 }
        r8.append(r9);	 Catch:{ a -> 0x00c2 }
        r8 = r8.toString();	 Catch:{ a -> 0x00c2 }
        r9 = r7.f3423n;	 Catch:{ a -> 0x00c2 }
        r8 = r9.compileStatement(r8);	 Catch:{ a -> 0x00c2 }
        r7.f3419j = r8;	 Catch:{ a -> 0x00c2 }
    L_0x009b:
        r7 = r7.f3419j;	 Catch:{ a -> 0x00c2 }
        r8 = r6.f3469f;	 Catch:{ a -> 0x00c2 }
        r8 = r8 + r5;	 Catch:{ a -> 0x00c2 }
        r6.f3469f = r8;	 Catch:{ a -> 0x00c2 }
        r8 = r11.f14215b;	 Catch:{ a -> 0x00c2 }
        r6.f3472i = r8;	 Catch:{ a -> 0x00c2 }
        r7.clearBindings();	 Catch:{ a -> 0x00c2 }
        r8 = r6.f3469f;	 Catch:{ a -> 0x00c2 }
        r8 = (long) r8;	 Catch:{ a -> 0x00c2 }
        r7.bindLong(r5, r8);	 Catch:{ a -> 0x00c2 }
        r8 = r11.f14215b;	 Catch:{ a -> 0x00c2 }
        r7.bindLong(r2, r8);	 Catch:{ a -> 0x00c2 }
        r8 = r6.f3465b;	 Catch:{ a -> 0x00c2 }
        r7.bindString(r4, r8);	 Catch:{ a -> 0x00c2 }
        r7.execute();	 Catch:{ a -> 0x00c2 }
        r1.close();
        return r6;
    L_0x00c0:
        r12 = move-exception;
        goto L_0x00dc;
    L_0x00c2:
        r6 = com.p072b.p073a.p074a.p081h.p082a.C1048a.f3383b;	 Catch:{ all -> 0x00c0 }
        r6 = r6.f3407c;	 Catch:{ all -> 0x00c0 }
        r6 = r1.getString(r6);	 Catch:{ all -> 0x00c0 }
        if (r6 != 0) goto L_0x00d4;	 Catch:{ all -> 0x00c0 }
    L_0x00cc:
        r6 = "cannot find job id on a retrieved job";	 Catch:{ all -> 0x00c0 }
        r7 = new java.lang.Object[r3];	 Catch:{ all -> 0x00c0 }
        com.p072b.p073a.p074a.p078e.C1028b.m2504a(r6, r7);	 Catch:{ all -> 0x00c0 }
        goto L_0x00d7;	 Catch:{ all -> 0x00c0 }
    L_0x00d4:
        r11.m10387b(r6);	 Catch:{ all -> 0x00c0 }
    L_0x00d7:
        r1.close();
        goto L_0x003f;
    L_0x00dc:
        r1.close();
        throw r12;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.b.a.a.h.a.d.b(com.b.a.a.e):com.b.a.a.j");
    }

    public final void mo1064b() {
        C1054c c1054c = this.f14217d;
        c1054c.f3423n.execSQL("DELETE FROM job_holder");
        c1054c.f3423n.execSQL("DELETE FROM job_holder_tags");
        c1054c.f3423n.execSQL("VACUUM");
        m10389c();
    }

    public final boolean mo1065b(C1066j c1066j) {
        if (c1066j.f3464a == null) {
            return mo1062a(c1066j);
        }
        m10391e(c1066j);
        c1066j.f3472i = Long.MIN_VALUE;
        C1054c c1054c = this.f14217d;
        if (c1054c.f3416g == null) {
            c1054c.f3422m.setLength(0);
            StringBuilder stringBuilder = c1054c.f3422m;
            stringBuilder.append("INSERT OR REPLACE INTO ");
            stringBuilder.append(c1054c.f3424o);
            c1054c.f3422m.append(" VALUES (");
            for (int i = 0; i < c1054c.f3426q; i++) {
                if (i != 0) {
                    c1054c.f3422m.append(",");
                }
                c1054c.f3422m.append("?");
            }
            c1054c.f3422m.append(")");
            c1054c.f3416g = c1054c.f3423n.compileStatement(c1054c.f3422m.toString());
        }
        SQLiteStatement sQLiteStatement = c1054c.f3416g;
        sQLiteStatement.clearBindings();
        C5092d.m10386a(sQLiteStatement, c1066j);
        boolean z = sQLiteStatement.executeInsert() != -1;
        new Object[1][0] = Boolean.valueOf(z);
        C1028b.m2507b();
        return z;
    }

    public final java.lang.Long mo1066c(com.p072b.p073a.p074a.C1029e r8) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r7 = this;
        r8 = r7.m10390e(r8);
        r0 = 0;
        r1 = r7.f14216c;	 Catch:{ SQLiteDoneException -> 0x0095 }
        r2 = r7.f14217d;	 Catch:{ SQLiteDoneException -> 0x0095 }
        r3 = r8.f3438f;	 Catch:{ SQLiteDoneException -> 0x0095 }
        if (r3 != 0) goto L_0x0047;	 Catch:{ SQLiteDoneException -> 0x0095 }
    L_0x000d:
        r3 = com.p072b.p073a.p074a.p081h.p082a.C1048a.f3391j;	 Catch:{ SQLiteDoneException -> 0x0095 }
        r3 = r3.f3405a;	 Catch:{ SQLiteDoneException -> 0x0095 }
        r4 = r8.f3434b;	 Catch:{ SQLiteDoneException -> 0x0095 }
        r3 = r2.m2545a(r3, r4);	 Catch:{ SQLiteDoneException -> 0x0095 }
        r4 = com.p072b.p073a.p074a.p081h.p082a.C1048a.f3388g;	 Catch:{ SQLiteDoneException -> 0x0095 }
        r4 = r4.f3405a;	 Catch:{ SQLiteDoneException -> 0x0095 }
        r5 = r8.f3434b;	 Catch:{ SQLiteDoneException -> 0x0095 }
        r4 = r2.m2545a(r4, r5);	 Catch:{ SQLiteDoneException -> 0x0095 }
        r2 = r2.f3422m;	 Catch:{ SQLiteDoneException -> 0x0095 }
        r5 = 0;	 Catch:{ SQLiteDoneException -> 0x0095 }
        r2.setLength(r5);	 Catch:{ SQLiteDoneException -> 0x0095 }
        r5 = "SELECT * FROM (";	 Catch:{ SQLiteDoneException -> 0x0095 }
        r2.append(r5);	 Catch:{ SQLiteDoneException -> 0x0095 }
        r2.append(r3);	 Catch:{ SQLiteDoneException -> 0x0095 }
        r3 = " ORDER BY 1 ASC LIMIT 1) UNION SELECT * FROM (";	 Catch:{ SQLiteDoneException -> 0x0095 }
        r2.append(r3);	 Catch:{ SQLiteDoneException -> 0x0095 }
        r2.append(r4);	 Catch:{ SQLiteDoneException -> 0x0095 }
        r3 = " ORDER BY 1 ASC LIMIT 1) ORDER BY 1 ASC LIMIT 1";	 Catch:{ SQLiteDoneException -> 0x0095 }
        r2.append(r3);	 Catch:{ SQLiteDoneException -> 0x0095 }
        r2 = r2.toString();	 Catch:{ SQLiteDoneException -> 0x0095 }
        r1 = r1.compileStatement(r2);	 Catch:{ SQLiteDoneException -> 0x0095 }
        r8.f3438f = r1;	 Catch:{ SQLiteDoneException -> 0x0095 }
        goto L_0x004c;	 Catch:{ SQLiteDoneException -> 0x0095 }
    L_0x0047:
        r1 = r8.f3438f;	 Catch:{ SQLiteDoneException -> 0x0095 }
        r1.clearBindings();	 Catch:{ SQLiteDoneException -> 0x0095 }
    L_0x004c:
        r1 = 1;	 Catch:{ SQLiteDoneException -> 0x0095 }
        r2 = r1;	 Catch:{ SQLiteDoneException -> 0x0095 }
    L_0x004e:
        r3 = r8.f3435c;	 Catch:{ SQLiteDoneException -> 0x0095 }
        r3 = r3.length;	 Catch:{ SQLiteDoneException -> 0x0095 }
        if (r2 > r3) goto L_0x006e;	 Catch:{ SQLiteDoneException -> 0x0095 }
    L_0x0053:
        r3 = r8.f3438f;	 Catch:{ SQLiteDoneException -> 0x0095 }
        r4 = r8.f3435c;	 Catch:{ SQLiteDoneException -> 0x0095 }
        r5 = r2 + -1;	 Catch:{ SQLiteDoneException -> 0x0095 }
        r4 = r4[r5];	 Catch:{ SQLiteDoneException -> 0x0095 }
        r3.bindString(r2, r4);	 Catch:{ SQLiteDoneException -> 0x0095 }
        r3 = r8.f3438f;	 Catch:{ SQLiteDoneException -> 0x0095 }
        r4 = r8.f3435c;	 Catch:{ SQLiteDoneException -> 0x0095 }
        r4 = r4.length;	 Catch:{ SQLiteDoneException -> 0x0095 }
        r4 = r4 + r2;	 Catch:{ SQLiteDoneException -> 0x0095 }
        r6 = r8.f3435c;	 Catch:{ SQLiteDoneException -> 0x0095 }
        r5 = r6[r5];	 Catch:{ SQLiteDoneException -> 0x0095 }
        r3.bindString(r4, r5);	 Catch:{ SQLiteDoneException -> 0x0095 }
        r2 = r2 + 1;	 Catch:{ SQLiteDoneException -> 0x0095 }
        goto L_0x004e;	 Catch:{ SQLiteDoneException -> 0x0095 }
    L_0x006e:
        r2 = r8.f3438f;	 Catch:{ SQLiteDoneException -> 0x0095 }
        r3 = com.p072b.p073a.p074a.p081h.p082a.C1057e.f3432i;	 Catch:{ SQLiteDoneException -> 0x0095 }
        r2.bindString(r1, r3);	 Catch:{ SQLiteDoneException -> 0x0095 }
        r2 = r8.f3438f;	 Catch:{ SQLiteDoneException -> 0x0095 }
        r3 = r8.f3435c;	 Catch:{ SQLiteDoneException -> 0x0095 }
        r3 = r3.length;	 Catch:{ SQLiteDoneException -> 0x0095 }
        r1 = r1 + r3;	 Catch:{ SQLiteDoneException -> 0x0095 }
        r3 = com.p072b.p073a.p074a.p081h.p082a.C1057e.f3431h;	 Catch:{ SQLiteDoneException -> 0x0095 }
        r2.bindString(r1, r3);	 Catch:{ SQLiteDoneException -> 0x0095 }
        r8 = r8.f3438f;	 Catch:{ SQLiteDoneException -> 0x0095 }
        r1 = r8.simpleQueryForLong();	 Catch:{ SQLiteDoneException -> 0x0095 }
        r3 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;	 Catch:{ SQLiteDoneException -> 0x0095 }
        r8 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1));	 Catch:{ SQLiteDoneException -> 0x0095 }
        if (r8 != 0) goto L_0x0090;	 Catch:{ SQLiteDoneException -> 0x0095 }
    L_0x008f:
        return r0;	 Catch:{ SQLiteDoneException -> 0x0095 }
    L_0x0090:
        r8 = java.lang.Long.valueOf(r1);	 Catch:{ SQLiteDoneException -> 0x0095 }
        return r8;
    L_0x0095:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.b.a.a.h.a.d.c(com.b.a.a.e):java.lang.Long");
    }

    public final void mo1067c(C1066j c1066j) {
        m10387b(c1066j.f3465b);
    }

    public final java.util.Set<com.p072b.p073a.p074a.C1066j> mo1068d(com.p072b.p073a.p074a.C1029e r6) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:17:0x0042 in {2, 8, 10, 16, 19} preds:[]
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:129)
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:48)
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:38)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r5 = this;
        r6 = r5.m10390e(r6);
        r0 = r5.f14217d;
        r1 = r6.f3437e;
        r2 = 0;
        if (r1 != 0) goto L_0x0016;
    L_0x000b:
        r1 = r6.f3434b;
        r3 = 0;
        r4 = new com.p072b.p073a.p074a.p081h.p082a.C1054c.C1052b[r2];
        r0 = r0.m2544a(r1, r3, r4);
        r6.f3437e = r0;
    L_0x0016:
        r0 = r6.f3437e;
        r1 = r5.f14216c;
        r6 = r6.f3435c;
        r6 = r1.rawQuery(r0, r6);
        r0 = new java.util.HashSet;
        r0.<init>();
    L_0x0025:
        r1 = r6.moveToNext();	 Catch:{ a -> 0x0039 }
        if (r1 == 0) goto L_0x0033;	 Catch:{ a -> 0x0039 }
    L_0x002b:
        r1 = r5.m10385a(r6);	 Catch:{ a -> 0x0039 }
        r0.add(r1);	 Catch:{ a -> 0x0039 }
        goto L_0x0025;
    L_0x0033:
        r6.close();
        return r0;
    L_0x0037:
        r0 = move-exception;
        goto L_0x0043;
    L_0x0039:
        r1 = move-exception;
        r3 = "invalid job found by tags.";	 Catch:{ all -> 0x0037 }
        r2 = new java.lang.Object[r2];	 Catch:{ all -> 0x0037 }
        com.p072b.p073a.p074a.p078e.C1028b.m2505a(r1, r3, r2);	 Catch:{ all -> 0x0037 }
        goto L_0x0033;
        return r0;
    L_0x0043:
        r6.close();
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.b.a.a.h.a.d.d(com.b.a.a.e):java.util.Set<com.b.a.a.j>");
    }

    public final void mo1069d(C1066j c1066j) {
        C1054c c1054c = this.f14217d;
        if (c1054c.f3421l == null) {
            StringBuilder stringBuilder = new StringBuilder("UPDATE ");
            stringBuilder.append(c1054c.f3424o);
            stringBuilder.append(" SET ");
            stringBuilder.append(C1048a.f3393l.f3405a);
            stringBuilder.append(" = 1  WHERE ");
            stringBuilder.append(c1054c.f3425p);
            stringBuilder.append(" = ? ");
            c1054c.f3421l = c1054c.f3423n.compileStatement(stringBuilder.toString());
        }
        SQLiteStatement sQLiteStatement = c1054c.f3421l;
        sQLiteStatement.clearBindings();
        sQLiteStatement.bindString(1, c1066j.f3465b);
        sQLiteStatement.execute();
    }
}
