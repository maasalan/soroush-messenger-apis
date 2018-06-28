package com.p072b.p073a.p074a.p081h.p082a;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.p072b.p073a.p074a.p081h.p082a.C1054c.C1050a;
import com.p072b.p073a.p074a.p081h.p082a.C1054c.C1053c;

public final class C1048a extends SQLiteOpenHelper {
    static final C1053c f3382a = new C1053c("insertionOrder", "integer", 0);
    static final C1053c f3383b = new C1053c("_id", "text", 1, null, true);
    static final C1053c f3384c = new C1053c("priority", "integer", 2);
    static final C1053c f3385d = new C1053c("group_id", "text", 3);
    static final C1053c f3386e = new C1053c("run_count", "integer", 4);
    static final C1053c f3387f = new C1053c("created_ns", "long", 5);
    static final C1053c f3388g = new C1053c("delay_until_ns", "long", 6);
    static final C1053c f3389h = new C1053c("running_session_id", "long", 7);
    static final C1053c f3390i = new C1053c("network_type", "integer", 8);
    static final C1053c f3391j = new C1053c("deadline", "integer", 9);
    static final C1053c f3392k = new C1053c("cancel_on_deadline", "integer", 10);
    static final C1053c f3393l = new C1053c("cancelled", "integer", 11);
    static final C1053c f3394m = new C1053c("_id", "integer", 0);
    static final C1053c f3395n = new C1053c("job_id", "text", new C1050a("job_holder", f3383b.f3405a));
    static final C1053c f3396o = new C1053c("tag_name", "text", 2);

    public C1048a(Context context, String str) {
        super(context, str, null, 12);
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(C1054c.m2541a("job_holder", f3382a, f3383b, f3384c, f3385d, f3386e, f3387f, f3388g, f3389h, f3390i, f3391j, f3392k, f3393l));
        sQLiteDatabase.execSQL(C1054c.m2541a("job_holder_tags", f3394m, f3395n, f3396o));
        StringBuilder stringBuilder = new StringBuilder("CREATE INDEX IF NOT EXISTS TAG_NAME_INDEX ON job_holder_tags(");
        stringBuilder.append(f3396o.f3405a);
        stringBuilder.append(")");
        sQLiteDatabase.execSQL(stringBuilder.toString());
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        onUpgrade(sQLiteDatabase, i, i2);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i == 11) {
            StringBuilder stringBuilder = new StringBuilder("ALTER TABLE job_holder ADD COLUMN ");
            stringBuilder.append(f3393l.f3405a);
            stringBuilder.append(" ");
            stringBuilder.append(f3393l.f3406b);
            sQLiteDatabase.execSQL(stringBuilder.toString());
            return;
        }
        sQLiteDatabase.execSQL(C1054c.m2540a("job_holder"));
        sQLiteDatabase.execSQL(C1054c.m2540a("job_holder_tags"));
        sQLiteDatabase.execSQL("DROP INDEX IF EXISTS TAG_NAME_INDEX");
        onCreate(sQLiteDatabase);
    }
}
