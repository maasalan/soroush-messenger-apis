package mobi.mmdt.ott.provider.p387i;

import android.content.ContentProviderClient;
import android.database.Cursor;
import java.util.ArrayList;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.provider.OttProvider;
import mobi.mmdt.ott.provider.p390l.C3004f;

public final class C2990b {
    public static int m7469a(int i) {
        return new C6029f().m13473b(i).m7360a(MyApplication.m12952b());
    }

    public static ArrayList<C2992c> m7470a(long j, Integer num) {
        String str = "";
        if (num != null) {
            StringBuilder stringBuilder = new StringBuilder(" LIMIT ");
            stringBuilder.append(num);
            str = stringBuilder.toString();
        }
        StringBuilder stringBuilder2 = new StringBuilder("SELECT landing_page_row_items._id,row_item_image,row_item_title,row_item_subtitle,row_item_button_text,row_item_display_order,row_item_action_type,row_item_action_data,row_item_landing_page_row_id,row_item_button_action_data,row_item_button_action_type,dialog_party,dialog_my_role,dialog_state,dialog_link,dialog_type  FROM landing_page_row_items LEFT JOIN dialogs ON row_item_action_data = dialog_link WHERE row_item_landing_page_row_id = ");
        stringBuilder2.append(j);
        stringBuilder2.append(" ORDER BY row_item_display_order ASC ");
        stringBuilder2.append(str);
        String stringBuilder3 = stringBuilder2.toString();
        C6029f c6029f = new C6029f();
        ContentProviderClient acquireContentProviderClient = MyApplication.m12952b().getContentResolver().acquireContentProviderClient("mobi.mmdt.ott.provider");
        C6028e c6028e = null;
        if (((OttProvider) acquireContentProviderClient.getLocalContentProvider()) != null) {
            Cursor b = ((OttProvider) acquireContentProviderClient.getLocalContentProvider()).mo2212b(c6029f.m7372g(), stringBuilder3);
            acquireContentProviderClient.release();
            if (b != null) {
                c6028e = new C6028e(b);
            }
        }
        ArrayList<C2992c> arrayList = new ArrayList();
        if (c6028e.moveToFirst()) {
            do {
                C2992c c2992c = new C2992c();
                c2992c.f9379a = (long) c6028e.getInt(c6028e.getColumnIndex("_id"));
                c2992c.f9380b = c6028e.getString(c6028e.getColumnIndex("row_item_title"));
                c2992c.f9381c = c6028e.getString(c6028e.getColumnIndex("row_item_image"));
                c2992c.f9382d = c6028e.getString(c6028e.getColumnIndex("row_item_subtitle"));
                c2992c.f9383e = c6028e.getString(c6028e.getColumnIndex("row_item_button_text"));
                c2992c.f9384f = Integer.valueOf(c6028e.getInt(c6028e.getColumnIndex("row_item_display_order")));
                c2992c.f9385g = C2989a.m7468a()[c6028e.getInt(c6028e.getColumnIndex("row_item_action_type"))];
                c2992c.f9386h = c6028e.getString(c6028e.getColumnIndex("row_item_action_data"));
                c2992c.f9387i = c6028e.getInt(c6028e.getColumnIndex("row_item_landing_page_row_id"));
                c2992c.f9388j = C2989a.m7468a()[c6028e.getInt(c6028e.getColumnIndex("row_item_button_action_type"))];
                c2992c.f9389k = c6028e.getString(c6028e.getColumnIndex("row_item_button_action_data"));
                if (!(c6028e.getString(c6028e.getColumnIndex("dialog_my_role")) == null || C3004f.values()[c6028e.getInt(c6028e.getColumnIndex("dialog_my_role"))] == C3004f.NONE)) {
                    c2992c.f9390l = true;
                }
                arrayList.add(c2992c);
            } while (c6028e.moveToNext());
        }
        c6028e.close();
        return arrayList;
    }
}
