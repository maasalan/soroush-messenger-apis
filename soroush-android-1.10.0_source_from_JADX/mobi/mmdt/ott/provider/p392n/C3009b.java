package mobi.mmdt.ott.provider.p392n;

import android.database.Cursor;
import java.util.ArrayList;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.provider.p381c.C2955c;

public final class C3009b {
    public static ArrayList<C3008a> m7518a() {
        C2955c c6043f = new C6043f();
        Cursor query = MyApplication.m12952b().getContentResolver().query(c6043f.m7372g(), null, c6043f.f9181a.toString(), c6043f.m7370e(), c6043f.m7371f());
        C6042e c6042e = query == null ? null : new C6042e(query);
        ArrayList<C3008a> arrayList = new ArrayList();
        if (c6042e.moveToFirst()) {
            do {
                String a = c6042e.m7352a("report_events_columns_category");
                if (a == null) {
                    throw new NullPointerException("The value of 'category' in the database was null, which is not allowed according to the model definition");
                }
                String a2 = c6042e.m7352a("report_events_columns_action");
                if (a2 == null) {
                    throw new NullPointerException("The value of 'action' in the database was null, which is not allowed according to the model definition");
                }
                String a3 = c6042e.m7352a("report_events_columns_description");
                if (a3 == null) {
                    throw new NullPointerException("The value of 'description' in the database was null, which is not allowed according to the model definition");
                }
                arrayList.add(new C3008a(a, a2, a3));
            } while (c6042e.moveToNext());
        }
        c6042e.close();
        return arrayList;
    }
}
