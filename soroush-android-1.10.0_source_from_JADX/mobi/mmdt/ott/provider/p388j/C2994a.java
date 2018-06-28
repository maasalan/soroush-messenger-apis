package mobi.mmdt.ott.provider.p388j;

import java.util.ArrayList;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.provider.p388j.C2996b.C2995a;

public final class C2994a {
    public static ArrayList<C2996b> m7482a(int i) {
        C6032g b = new C6032g().m13487b(i);
        b.m7363a("row_display_order", false);
        C6031e b2 = b.m13486b(MyApplication.m12952b());
        ArrayList<C2996b> arrayList = new ArrayList();
        if (b2.moveToFirst()) {
            do {
                C2995a a = new C2995a().m7487a(b2.m7352a("row_title"));
                Long c = b2.m7354c("_id");
                if (c == null) {
                    throw new NullPointerException("The value of '_id' in the database was null, which is not allowed according to the model definition");
                }
                a = a.m7484a(c.longValue());
                Integer b3 = b2.m7353b("row_parent_landing_page_id");
                if (b3 == null) {
                    throw new NullPointerException("The value of 'parent_landing_page_id' in the database was null, which is not allowed according to the model definition");
                }
                a = a.m7489b(b3.intValue()).m7491b(b2.m7352a("row_category_image")).m7485a(b2.m7355d("row_category_has_more_items")).m7490b(b2.m7353b("row_interval")).m7492c(b2.m7353b("row_category_visible_items_counts")).m7486a(b2.m7353b("row_display_order"));
                b3 = b2.m7353b("row_type");
                if (b3 == null) {
                    throw new NullPointerException("The value of 'type' in the database was null, which is not allowed according to the model definition");
                }
                arrayList.add(a.m7483a(C2998f.m7495a()[b3.intValue()]).m7488a());
            } while (b2.moveToNext());
        }
        return arrayList;
    }
}
