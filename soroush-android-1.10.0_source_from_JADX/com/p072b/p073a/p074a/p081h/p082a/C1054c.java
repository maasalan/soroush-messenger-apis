package com.p072b.p073a.p074a.p081h.p082a;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import com.p072b.p073a.p074a.p078e.C1028b;

public final class C1054c {
    String f3410a;
    String f3411b;
    String f3412c;
    String f3413d;
    String f3414e;
    SQLiteStatement f3415f;
    SQLiteStatement f3416g;
    SQLiteStatement f3417h;
    SQLiteStatement f3418i;
    SQLiteStatement f3419j;
    SQLiteStatement f3420k;
    SQLiteStatement f3421l;
    final StringBuilder f3422m = new StringBuilder();
    final SQLiteDatabase f3423n;
    final String f3424o;
    final String f3425p;
    final int f3426q;
    final String f3427r;
    final int f3428s;
    final long f3429t;
    private SQLiteStatement f3430u;

    public static class C1050a {
        final String f3398a;
        final String f3399b;

        public C1050a(String str, String str2) {
            this.f3398a = str;
            this.f3399b = str2;
        }
    }

    public static class C1052b {
        final C1053c f3403a;
        final C1051a f3404b;

        public enum C1051a {
            ASC,
            DESC
        }

        public C1052b(C1053c c1053c, C1051a c1051a) {
            this.f3403a = c1053c;
            this.f3404b = c1051a;
        }
    }

    public static class C1053c {
        final String f3405a;
        final String f3406b;
        public final int f3407c;
        public final C1050a f3408d;
        public final boolean f3409e;

        public C1053c(String str, String str2, int i) {
            this(str, str2, i, null, false);
        }

        public C1053c(String str, String str2, int i, C1050a c1050a, boolean z) {
            this.f3405a = str;
            this.f3406b = str2;
            this.f3407c = i;
            this.f3408d = c1050a;
            this.f3409e = z;
        }

        public C1053c(String str, String str2, C1050a c1050a) {
            this(str, str2, 1, c1050a, false);
        }
    }

    public C1054c(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, long j) {
        this.f3423n = sQLiteDatabase;
        this.f3424o = str;
        this.f3426q = 12;
        this.f3425p = str2;
        this.f3429t = j;
        this.f3428s = 3;
        this.f3427r = str3;
        StringBuilder stringBuilder = new StringBuilder("SELECT * FROM ");
        stringBuilder.append(str);
        stringBuilder.append(" WHERE ");
        stringBuilder.append(C1048a.f3383b.f3405a);
        stringBuilder.append(" = ?");
        this.f3410a = stringBuilder.toString();
        stringBuilder = new StringBuilder("SELECT * FROM ");
        stringBuilder.append(str);
        stringBuilder.append(" WHERE ");
        stringBuilder.append(C1048a.f3383b.f3405a);
        stringBuilder.append(" IN ( SELECT ");
        stringBuilder.append(C1048a.f3395n.f3405a);
        stringBuilder.append(" FROM ");
        stringBuilder.append(str3);
        stringBuilder.append(" WHERE ");
        stringBuilder.append(C1048a.f3396o.f3405a);
        stringBuilder.append(" = ?)");
        this.f3411b = stringBuilder.toString();
        stringBuilder = new StringBuilder("SELECT ");
        stringBuilder.append(C1048a.f3383b.f3405a);
        stringBuilder.append(" FROM ");
        stringBuilder.append(str);
        this.f3412c = stringBuilder.toString();
        stringBuilder = new StringBuilder("SELECT ");
        stringBuilder.append(C1048a.f3396o.f3405a);
        stringBuilder.append(" FROM job_holder_tags WHERE ");
        stringBuilder.append(C1048a.f3395n.f3405a);
        stringBuilder.append(" = ?");
        this.f3413d = stringBuilder.toString();
        stringBuilder = new StringBuilder("UPDATE ");
        stringBuilder.append(str);
        stringBuilder.append(" SET ");
        stringBuilder.append(C1048a.f3393l.f3405a);
        stringBuilder.append(" = 0");
        this.f3414e = stringBuilder.toString();
    }

    public static String m2540a(String str) {
        StringBuilder stringBuilder = new StringBuilder("DROP TABLE IF EXISTS ");
        stringBuilder.append(str);
        return stringBuilder.toString();
    }

    public static String m2541a(String str, C1053c c1053c, C1053c... c1053cArr) {
        StringBuilder stringBuilder = new StringBuilder("CREATE TABLE IF NOT EXISTS ");
        stringBuilder.append(str);
        stringBuilder.append(" (");
        stringBuilder.append(c1053c.f3405a);
        stringBuilder.append(" ");
        stringBuilder.append(c1053c.f3406b);
        stringBuilder.append("  primary key ");
        int i = 0;
        for (C1053c c1053c2 : c1053cArr) {
            stringBuilder.append(", `");
            stringBuilder.append(c1053c2.f3405a);
            stringBuilder.append("` ");
            stringBuilder.append(c1053c2.f3406b);
            if (c1053c2.f3409e) {
                stringBuilder.append(" UNIQUE");
            }
        }
        int length = c1053cArr.length;
        while (i < length) {
            C1053c c1053c3 = c1053cArr[i];
            if (c1053c3.f3408d != null) {
                C1050a c1050a = c1053c3.f3408d;
                stringBuilder.append(", FOREIGN KEY(`");
                stringBuilder.append(c1053c3.f3405a);
                stringBuilder.append("`) REFERENCES ");
                stringBuilder.append(c1050a.f3398a);
                stringBuilder.append("(`");
                stringBuilder.append(c1050a.f3399b);
                stringBuilder.append("`) ON DELETE CASCADE");
            }
            i++;
        }
        stringBuilder.append(" );");
        C1028b.m2507b();
        return stringBuilder.toString();
    }

    static void m2542a(StringBuilder stringBuilder, int i) {
        if (i == 0) {
            throw new IllegalArgumentException("cannot create placeholders for 0 items");
        }
        stringBuilder.append("?");
        for (int i2 = 1; i2 < i; i2++) {
            stringBuilder.append(",?");
        }
    }

    public final SQLiteStatement m2543a() {
        if (this.f3430u == null) {
            int i = 0;
            this.f3422m.setLength(0);
            StringBuilder stringBuilder = this.f3422m;
            stringBuilder.append("INSERT INTO ");
            stringBuilder.append(this.f3424o);
            this.f3422m.append(" VALUES (");
            while (i < this.f3426q) {
                if (i != 0) {
                    this.f3422m.append(",");
                }
                this.f3422m.append("?");
                i++;
            }
            this.f3422m.append(")");
            this.f3430u = this.f3423n.compileStatement(this.f3422m.toString());
        }
        return this.f3430u;
    }

    public final String m2544a(String str, Integer num, C1052b... c1052bArr) {
        this.f3422m.setLength(0);
        this.f3422m.append("SELECT * FROM ");
        this.f3422m.append(this.f3424o);
        if (str != null) {
            StringBuilder stringBuilder = this.f3422m;
            stringBuilder.append(" WHERE ");
            stringBuilder.append(str);
        }
        int length = c1052bArr.length;
        int i = 1;
        int i2 = 0;
        while (i2 < length) {
            StringBuilder stringBuilder2;
            String str2;
            C1052b c1052b = c1052bArr[i2];
            if (i != 0) {
                stringBuilder2 = this.f3422m;
                str2 = " ORDER BY ";
            } else {
                stringBuilder2 = this.f3422m;
                str2 = ",";
            }
            stringBuilder2.append(str2);
            stringBuilder2 = this.f3422m;
            stringBuilder2.append(c1052b.f3403a.f3405a);
            stringBuilder2.append(" ");
            stringBuilder2.append(c1052b.f3404b);
            i2++;
            i = 0;
        }
        if (num != null) {
            StringBuilder stringBuilder3 = this.f3422m;
            stringBuilder3.append(" LIMIT ");
            stringBuilder3.append(num);
        }
        return this.f3422m.toString();
    }

    public final String m2545a(String str, String str2) {
        this.f3422m.setLength(0);
        StringBuilder stringBuilder = this.f3422m;
        stringBuilder.append("SELECT ");
        stringBuilder.append(str);
        stringBuilder.append(" FROM ");
        stringBuilder.append(this.f3424o);
        if (str2 != null) {
            StringBuilder stringBuilder2 = this.f3422m;
            stringBuilder2.append(" WHERE ");
            stringBuilder2.append(str2);
        }
        return this.f3422m.toString();
    }
}
