package mobi.mmdt.ott.logic.sync;

import android.accounts.Account;
import android.content.AbstractThreadedSyncAdapter;
import android.content.ContentProviderClient;
import android.content.ContentProviderOperation;
import android.content.ContentResolver;
import android.content.SyncResult;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract.Data;
import android.provider.ContactsContract.RawContacts;
import java.util.ArrayList;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.provider.p389k.C2999a;

public final class C2902b extends AbstractThreadedSyncAdapter {
    public C2902b() {
        super(MyApplication.m12952b(), true);
    }

    private static long m7280a(String str, String str2) {
        long j;
        ContentResolver contentResolver = MyApplication.m12952b().getContentResolver();
        Uri uri = RawContacts.CONTENT_URI;
        String[] strArr = new String[]{"_id"};
        StringBuilder stringBuilder = new StringBuilder("account_type='");
        stringBuilder.append(str2);
        stringBuilder.append("' AND sync1=?");
        Cursor query = contentResolver.query(uri, strArr, stringBuilder.toString(), new String[]{str}, null);
        if (query != null) {
            try {
                if (query.moveToFirst()) {
                    j = query.getLong(0);
                    if (query != null) {
                        query.close();
                    }
                    return j;
                }
            } catch (Throwable th) {
                if (query != null) {
                    query.close();
                }
            }
        }
        j = 0;
        if (query != null) {
            query.close();
        }
        return j;
    }

    private static ArrayList<ContentProviderOperation> m7281a(Account account, C2903c c2903c) {
        ArrayList<ContentProviderOperation> arrayList = null;
        if (!(c2903c == null || c2903c.f9062a == null)) {
            if (C2902b.m7280a(c2903c.f9062a, account.type) != 0) {
                return null;
            }
            arrayList = new ArrayList();
            arrayList.add(ContentProviderOperation.newInsert(RawContacts.CONTENT_URI).withValue("sourceid", Integer.valueOf(0)).withValue("sync1", c2903c.f9062a).withValue("account_type", account.type).withValue("account_name", c2903c.f9063b).build());
            if (c2903c.f9063b != null && c2903c.f9063b.trim().length() > 0) {
                arrayList.add(ContentProviderOperation.newInsert(Data.CONTENT_URI).withValueBackReference("raw_contact_id", 0).withValue("mimetype", "vnd.android.cursor.item/name").withValue("data1", c2903c.f9063b).build());
            }
            if (c2903c.f9064c != null && c2903c.f9064c.trim().length() > 0) {
                arrayList.add(ContentProviderOperation.newInsert(Data.CONTENT_URI).withValueBackReference("raw_contact_id", 0).withValue("mimetype", "vnd.android.cursor.item/phone_v2").withValue("data1", c2903c.f9064c).withValue("data2", Integer.valueOf(2)).build());
            }
            arrayList.add(ContentProviderOperation.newInsert(Data.CONTENT_URI).withValueBackReference("raw_contact_id", 0).withValue("mimetype", "vnd.android.cursor.item/vnd.mobi.mmdt.sync.profile").withValue("data2", c2903c.f9063b).withValue("data3", c2903c.f9062a).build());
            if (!arrayList.isEmpty()) {
                try {
                    MyApplication.m12952b().getContentResolver().applyBatch("com.android.contacts", arrayList);
                    return arrayList;
                } catch (Throwable e) {
                    C2480b.m6742f("syncTest  Exeption in ContactsSyncAdapter");
                    C2480b.m6737b("Exception in sync contacts", e);
                }
            }
        }
        return arrayList;
    }

    public final void onPerformSync(Account account, Bundle bundle, String str, ContentProviderClient contentProviderClient, SyncResult syncResult) {
        try {
            r8 = new String[2];
            int i = 0;
            r8[0] = "0";
            r8[1] = account.type;
            MyApplication.m12952b().getContentResolver().delete(RawContacts.CONTENT_URI.buildUpon().appendQueryParameter("caller_is_syncadapter", "true").build(), "_id >= ? AND account_type = ? ", r8);
            C2903c[] a = C2999a.m7504a();
            C2480b.m6742f("syncTest  ContactsSyncAdapter sync");
            int length = a.length;
            while (i < length) {
                C2902b.m7281a(account, a[i]);
                i++;
            }
        } catch (Throwable e) {
            C2480b.m6737b("Exception in account sync contact", e);
        }
    }
}
