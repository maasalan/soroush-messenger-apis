package mobi.mmdt.ott.provider;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import java.util.HashMap;
import java.util.Map.Entry;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.ott.logic.p261a.p329x.C2763c;
import mobi.mmdt.ott.p246d.p247a.C2532d;
import mobi.mmdt.ott.provider.p379a.C2940b;
import mobi.mmdt.ott.provider.p384f.C2971k;
import org.json.JSONException;

public final class C2942a {
    public static void m7334a(SQLiteDatabase sQLiteDatabase) {
        String string;
        Log.e("****", "Migration forOldVersion51 ******************************************************");
        C2940b.f9158a = sQLiteDatabase;
        StringBuilder stringBuilder = new StringBuilder("SELECT conversations_party,conversations_send_time,conversations_event,conversations_reply_message_id FROM conversations WHERE conversations_event_state = '");
        stringBuilder.append(C2971k.DRAFT.ordinal());
        stringBuilder.append("' GROUP BY conversations_party");
        Cursor rawQuery = C2940b.f9158a.rawQuery(stringBuilder.toString(), null);
        HashMap hashMap = new HashMap();
        if (rawQuery != null) {
            if (rawQuery.moveToFirst()) {
                do {
                    string = rawQuery.getString(rawQuery.getColumnIndex("conversations_party"));
                    if (string != null) {
                        C2532d c2532d = new C2532d();
                        c2532d.f8244a = rawQuery.getString(rawQuery.getColumnIndex("conversations_event"));
                        c2532d.f8246c = rawQuery.getString(rawQuery.getColumnIndex("conversations_reply_message_id"));
                        c2532d.f8245b = Long.valueOf(rawQuery.getLong(rawQuery.getColumnIndex("conversations_send_time")));
                        hashMap.put(string, c2532d);
                    }
                } while (rawQuery.moveToNext());
            }
            rawQuery.close();
        }
        for (Entry entry : hashMap.entrySet()) {
            string = (String) entry.getKey();
            C2532d c2532d2 = (C2532d) entry.getValue();
            try {
                String a = c2532d2.m6880a();
                Long l = c2532d2.f8245b;
                StringBuilder stringBuilder2 = new StringBuilder("dialog_party = '");
                stringBuilder2.append(string);
                stringBuilder2.append("'");
                string = stringBuilder2.toString();
                ContentValues contentValues = new ContentValues();
                contentValues.put("dialog_draft_data", a);
                if (l != null) {
                    contentValues.put("dialog_updated_at", l);
                }
                C2940b.f9158a.update("dialogs", contentValues, string, null);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        stringBuilder = new StringBuilder("conversations_event_state = ");
        stringBuilder.append(C2971k.DRAFT.ordinal());
        C2940b.f9158a.delete("conversations", stringBuilder.toString(), null);
    }

    public static void m7335b(SQLiteDatabase sQLiteDatabase) {
        Log.e("****", "Migration forOldVersion57 ******************************************************");
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT * FROM charge WHERE PaymentType = 2", null);
        if (rawQuery != null) {
            if (rawQuery.moveToFirst()) {
                do {
                    String string = rawQuery.getString(rawQuery.getColumnIndex("ChargeId"));
                    String string2 = rawQuery.getString(rawQuery.getColumnIndex("Extra1"));
                    String string3 = rawQuery.getString(rawQuery.getColumnIndex("Amount"));
                    String string4 = rawQuery.getString(rawQuery.getColumnIndex("TransactionId"));
                    int i = rawQuery.getInt(rawQuery.getColumnIndex("TransactionStatus"));
                    String string5 = rawQuery.getString(rawQuery.getColumnIndex("TransactionTime"));
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("BillId", string);
                    contentValues.put("PaymentId", string2);
                    contentValues.put("Amount", string3);
                    contentValues.put("TransactionId", string4);
                    contentValues.put("TransactionStatus", Integer.valueOf(i));
                    contentValues.put("TransactionTime", string5);
                    sQLiteDatabase.insert("bill", null, contentValues);
                    StringBuilder stringBuilder = new StringBuilder("**** Migration56 Detail : ");
                    stringBuilder.append(string);
                    stringBuilder.append(" ");
                    stringBuilder.append(string2);
                    stringBuilder.append(" ");
                    stringBuilder.append(string3);
                    stringBuilder.append(" ");
                    stringBuilder.append(string4);
                    stringBuilder.append(" ");
                    stringBuilder.append(i);
                    stringBuilder.append(" ");
                    stringBuilder.append(string5);
                    C2480b.m6742f(stringBuilder.toString());
                } while (rawQuery.moveToNext());
            }
            rawQuery.close();
        }
        StringBuilder stringBuilder2 = new StringBuilder("PaymentType = ");
        stringBuilder2.append(C2763c.BillPayment.ordinal());
        sQLiteDatabase.delete("charge", stringBuilder2.toString(), null);
    }
}
