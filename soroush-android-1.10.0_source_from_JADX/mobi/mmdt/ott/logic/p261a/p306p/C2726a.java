package mobi.mmdt.ott.logic.p261a.p306p;

import android.content.ContentProviderClient;
import android.content.ContentValues;
import java.util.ArrayList;
import java.util.Iterator;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.provider.OttProvider;
import mobi.mmdt.ott.provider.p381c.C2955c;
import mobi.mmdt.ott.provider.p387i.C2992c;
import mobi.mmdt.ott.provider.p387i.C6029f;
import mobi.mmdt.ott.provider.p388j.C2996b;
import mobi.mmdt.ott.provider.p388j.C2997c;
import mobi.mmdt.ott.provider.p388j.C6030d;
import mobi.mmdt.ott.provider.p388j.C6031e;
import mobi.mmdt.ott.provider.p388j.C6032g;

final class C2726a {
    static void m7070a(ArrayList<C2996b> arrayList, ArrayList<C2992c> arrayList2) {
        Iterator it = arrayList.iterator();
        while (true) {
            int i = 0;
            if (!it.hasNext()) {
                break;
            }
            int i2;
            C2996b c2996b = (C2996b) it.next();
            long j = c2996b.f9395a;
            C6032g c6032g = new C6032g();
            c6032g.m13488b(j);
            C6031e b = c6032g.m13486b(MyApplication.m12952b());
            if (b.getCount() > 0) {
                b.close();
                i2 = 1;
            } else {
                b.close();
                i2 = 0;
            }
            if (i2 != 0) {
                C6030d c6030d = new C6030d();
                c6030d.m13480a(c2996b.f9396b).m13476a(c2996b.f9397c).m13481b(c2996b.f9398d).m13479a(c2996b.f9399e).m13478a(c2996b.f9400f).m13483b(c2996b.f9401g).m13484b(c2996b.f9402h).m13482b(c2996b.f9404j.longValue()).m13485c(c2996b.f9403i);
                C2955c c6032g2 = new C6032g();
                c6032g2.m13488b(c2996b.f9395a);
                MyApplication.m12952b().getContentResolver().update(C2997c.f9405a, c6030d.m7350b(), c6032g2.f9181a.toString(), c6032g2.m7370e());
            } else {
                C6030d c6030d2 = new C6030d();
                c6030d2.m13477a(c2996b.f9395a).m13480a(c2996b.f9396b).m13476a(c2996b.f9397c).m13481b(c2996b.f9398d).m13479a(c2996b.f9399e).m13478a(c2996b.f9400f).m13483b(c2996b.f9401g).m13484b(c2996b.f9402h).m13482b(c2996b.f9404j.longValue()).m13485c(c2996b.f9403i);
                MyApplication.m12952b().getContentResolver().insert(C2997c.f9405a, c6030d2.m7350b());
            }
        }
        ContentValues[] contentValuesArr = new ContentValues[arrayList2.size()];
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            C2992c c2992c = (C2992c) it2.next();
            contentValuesArr[i] = new ContentValues();
            contentValuesArr[i].put("_id", Long.valueOf(c2992c.f9379a));
            contentValuesArr[i].put("row_item_title", c2992c.f9380b);
            contentValuesArr[i].put("row_item_image", c2992c.f9381c);
            contentValuesArr[i].put("row_item_subtitle", c2992c.f9382d);
            contentValuesArr[i].put("row_item_button_text", c2992c.f9383e);
            contentValuesArr[i].put("row_item_display_order", c2992c.f9384f);
            contentValuesArr[i].put("row_item_action_type", Integer.valueOf(c2992c.f9385g - 1));
            contentValuesArr[i].put("row_item_action_data", c2992c.f9386h);
            contentValuesArr[i].put("row_item_landing_page_row_id", Integer.valueOf(c2992c.f9387i));
            contentValuesArr[i].put("row_item_button_action_data", c2992c.f9389k);
            if (c2992c.f9388j != 0) {
                contentValuesArr[i].put("row_item_button_action_type", Integer.valueOf(c2992c.f9388j - 1));
            }
            i++;
        }
        C6029f c6029f = new C6029f();
        ContentProviderClient acquireContentProviderClient = MyApplication.m12952b().getContentResolver().acquireContentProviderClient("mobi.mmdt.ott.provider");
        if (acquireContentProviderClient != null) {
            OttProvider ottProvider = (OttProvider) acquireContentProviderClient.getLocalContentProvider();
            if (ottProvider != null) {
                ottProvider.m7378a(c6029f.m7372g(), contentValuesArr);
            }
            acquireContentProviderClient.release();
        }
        C2480b.m6740d("landing page add to db ok !");
    }
}
