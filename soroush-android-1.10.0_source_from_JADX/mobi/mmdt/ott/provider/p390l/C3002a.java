package mobi.mmdt.ott.provider.p390l;

import android.content.ContentProviderClient;
import android.content.ContentValues;
import java.util.ArrayList;
import mobi.mmdt.ott.MyApplication;

public final class C3002a {
    public static void m7517a(String str, ArrayList<String> arrayList, ArrayList<Boolean> arrayList2, ArrayList<C3004f> arrayList3) {
        ContentValues[] contentValuesArr = new ContentValues[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            contentValuesArr[i] = new ContentValues();
            contentValuesArr[i].put("members_group_group_id", str);
            contentValuesArr[i].put("members_group_user_id", (String) arrayList.get(i));
            contentValuesArr[i].put("members_group_added_by_me", (Boolean) arrayList2.get(i));
            contentValuesArr[i].put("members_group_user_role", Integer.valueOf(((C3004f) arrayList3.get(i)).ordinal()));
        }
        C6037d c6037d = new C6037d();
        ContentProviderClient acquireContentProviderClient = MyApplication.m12952b().getContentResolver().acquireContentProviderClient("mobi.mmdt.ott.provider");
        acquireContentProviderClient.getLocalContentProvider().bulkInsert(c6037d.m7372g(), contentValuesArr);
        acquireContentProviderClient.release();
    }
}
