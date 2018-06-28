package mobi.mmdt.ott.provider.p395q;

import android.content.ContentProvider;
import android.content.ContentProviderClient;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.provider.OttProvider;
import mobi.mmdt.ott.provider.p385g.C2979f;
import mobi.mmdt.ott.provider.p395q.C3019b.C3018a;

public final class C3017a {
    public static int m7528a(C3019b c3019b) {
        C6050d c6050d = new C6050d();
        c6050d.m13593a(c3019b.f9474a).m13598b(c3019b.f9475b).m13591a(c3019b.f9476c).m13601c(c3019b.f9477d).m13602d(c3019b.f9478e).m13603e(c3019b.f9479f).m13604f(c3019b.f9480g).m13592a(c3019b.f9481h).m13597b(c3019b.f9482i).m13594a(c3019b.f9483j).m13600c(c3019b.m7544a()).m13596b(c3019b.f9484k).m13595a(c3019b.f9485l).m13599c(c3019b.f9486m).m13605g(c3019b.f9487n);
        StringBuilder stringBuilder = new StringBuilder("party='");
        stringBuilder.append(c3019b.f9474a);
        stringBuilder.append("'");
        return MyApplication.m12952b().getContentResolver().update(C3020c.f9490a, c6050d.m7350b(), stringBuilder.toString(), null);
    }

    public static Cursor m7529a(String str, int i) {
        str = C2979f.m7422a(str.toLowerCase());
        StringBuilder stringBuilder = new StringBuilder(" WHERE (title GLOB '");
        stringBuilder.append(str);
        stringBuilder.append("' OR description GLOB '");
        stringBuilder.append(str);
        stringBuilder.append("' OR LOWER(party) GLOB '");
        stringBuilder.append(str);
        stringBuilder.append("' OR LOWER(channel_link) GLOB '");
        stringBuilder.append(str);
        stringBuilder.append("' AND item_type ='");
        stringBuilder.append(C3021f.CHANNEL.ordinal());
        stringBuilder.append("') AND channel_members_count!= 'null'");
        str = stringBuilder.toString();
        stringBuilder = new StringBuilder("SELECT suggestedchannels._id as _id,party,title,parent_category_id,description,channel_link,avatar_url,avatar_thumbnail_url,channel_creation_date,channel_members_count,item_type,category_updated_at,item_index,is_disabled,avatar_res_id,extra,dialog_party,dialog_my_role,dialog_state,dialog_type FROM suggestedchannels LEFT JOIN dialogs ON party = dialog_party");
        stringBuilder.append(str);
        stringBuilder.append(" ORDER BY item_type DESC, item_index ASC  LIMIT ");
        stringBuilder.append(i);
        stringBuilder.append(" COLLATE NOCASE");
        str = stringBuilder.toString();
        C6052g c6052g = new C6052g();
        ContentProviderClient acquireContentProviderClient = MyApplication.m12952b().getContentResolver().acquireContentProviderClient("mobi.mmdt.ott.provider");
        if (((OttProvider) acquireContentProviderClient.getLocalContentProvider()) == null) {
            return null;
        }
        Cursor b = ((OttProvider) acquireContentProviderClient.getLocalContentProvider()).mo2212b(c6052g.m7372g(), str);
        acquireContentProviderClient.release();
        return b == null ? null : new C6051e(b);
    }

    public static void m7530a(SQLiteDatabase sQLiteDatabase) {
        ArrayList arrayList = new ArrayList();
        String str = "خرید شارژ";
        String str2 = "اوقات شرعی";
        String str3 = "پرداخت قبض";
        String str4 = "آب و هوا";
        String str5 = "سرویسها";
        String str6 = "موقعیت مکانی کانال ها";
        arrayList.add(new C3018a().m7535a("-102").m7538b(str).m7540c(Integer.valueOf(R.drawable.charge)).m7541c(str).m7537b(Integer.valueOf(1)).m7533a().m7536a(C3021f.SERVICE).m7534a(Integer.valueOf(-1)).m7539b());
        arrayList.add(new C3018a().m7535a("-101").m7538b(str2).m7540c(Integer.valueOf(R.drawable.pray_times_icon)).m7541c(str2).m7537b(Integer.valueOf(2)).m7533a().m7536a(C3021f.SERVICE).m7534a(Integer.valueOf(-1)).m7539b());
        arrayList.add(new C3018a().m7535a("-103").m7538b(str3).m7540c(Integer.valueOf(R.drawable.bill_enable)).m7541c(str3).m7537b(Integer.valueOf(3)).m7533a().m7536a(C3021f.SERVICE).m7534a(Integer.valueOf(-1)).m7539b());
        arrayList.add(new C3018a().m7535a("-104").m7538b(str4).m7540c(Integer.valueOf(R.drawable.enable_weather)).m7541c(str4).m7537b(Integer.valueOf(4)).m7533a().m7536a(C3021f.SERVICE).m7534a(Integer.valueOf(-1)).m7539b());
        arrayList.add(new C3018a().m7535a("-1").m7538b(str5).m7540c(Integer.valueOf(R.drawable.services_icon)).m7541c(str5).m7537b(Integer.valueOf(2)).m7536a(C3021f.CATEGORY).m7534a(Integer.valueOf(0)).m7539b());
        arrayList.add(new C3018a().m7535a("-105").m7538b(str6).m7540c(Integer.valueOf(R.drawable.ic_location_map)).m7541c(str6).m7537b(Integer.valueOf(1)).m7536a(C3021f.SERVICE).m7534a(Integer.valueOf(132)).m7539b());
        arrayList.add(new C3018a().m7535a("0").m7538b("ROOT").m7541c("ROOT").m7536a(C3021f.CATEGORY).m7539b());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C3019b c3019b = (C3019b) it.next();
            ContentValues contentValues = new ContentValues();
            contentValues.put("party", c3019b.f9474a);
            contentValues.put("title", c3019b.f9475b);
            contentValues.put("parent_category_id", c3019b.f9476c);
            contentValues.put("description", c3019b.f9477d);
            contentValues.put("channel_link", c3019b.f9478e);
            contentValues.put("avatar_url", c3019b.f9479f);
            contentValues.put("avatar_thumbnail_url", c3019b.f9480g);
            contentValues.put("channel_creation_date", c3019b.f9481h);
            contentValues.put("channel_members_count", c3019b.f9482i);
            contentValues.put("item_type", c3019b.f9483j != null ? Integer.valueOf(c3019b.f9483j.ordinal()) : null);
            contentValues.put("category_updated_at", c3019b.m7544a());
            contentValues.put("item_index", c3019b.f9484k);
            contentValues.put("is_disabled", Boolean.valueOf(c3019b.f9485l));
            contentValues.put("avatar_res_id", c3019b.f9486m);
            contentValues.put("extra", c3019b.f9487n);
            sQLiteDatabase.insert("suggestedchannels", null, contentValues);
        }
    }

    public static void m7531a(ArrayList<C3019b> arrayList) {
        ContentValues[] contentValuesArr = new ContentValues[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            C3019b c3019b = (C3019b) it.next();
            contentValuesArr[i] = new ContentValues();
            contentValuesArr[i].put("party", c3019b.f9474a);
            contentValuesArr[i].put("title", c3019b.f9475b);
            contentValuesArr[i].put("parent_category_id", c3019b.f9476c);
            contentValuesArr[i].put("description", c3019b.f9477d);
            contentValuesArr[i].put("channel_link", c3019b.f9478e);
            contentValuesArr[i].put("avatar_url", c3019b.f9479f);
            contentValuesArr[i].put("avatar_thumbnail_url", c3019b.f9480g);
            contentValuesArr[i].put("channel_creation_date", c3019b.f9481h);
            contentValuesArr[i].put("channel_members_count", c3019b.f9482i);
            contentValuesArr[i].put("item_type", c3019b.f9483j != null ? Integer.valueOf(c3019b.f9483j.ordinal()) : null);
            contentValuesArr[i].put("category_updated_at", c3019b.m7544a());
            contentValuesArr[i].put("item_index", c3019b.f9484k);
            contentValuesArr[i].put("is_disabled", Boolean.valueOf(c3019b.f9485l));
            contentValuesArr[i].put("avatar_res_id", c3019b.f9486m);
            contentValuesArr[i].put("extra", c3019b.f9487n);
            i++;
        }
        C6052g c6052g = new C6052g();
        ContentProviderClient acquireContentProviderClient = MyApplication.m12952b().getContentResolver().acquireContentProviderClient("mobi.mmdt.ott.provider");
        if (acquireContentProviderClient != null) {
            ContentProvider localContentProvider = acquireContentProviderClient.getLocalContentProvider();
            if (localContentProvider != null) {
                localContentProvider.bulkInsert(c6052g.m7372g(), contentValuesArr);
            }
            acquireContentProviderClient.release();
        }
    }

    public static C3019b[] m7532a(int i) {
        C6052g c6052g = new C6052g();
        Integer[] numArr = new Integer[1];
        int i2 = 0;
        numArr[0] = Integer.valueOf(i);
        c6052g.m13606a(numArr);
        Cursor b = c6052g.m13608b(MyApplication.m12952b());
        C3019b[] c3019bArr = new C3019b[b.getCount()];
        if (b.moveToFirst()) {
            while (true) {
                int i3 = i2 + 1;
                c3019bArr[i2] = C3019b.m7542a(b);
                if (!b.moveToNext()) {
                    break;
                }
                i2 = i3;
            }
        }
        b.close();
        return c3019bArr;
    }
}
