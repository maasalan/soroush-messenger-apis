package mobi.mmdt.ott.provider.p389k;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.CursorLoader;
import android.database.Cursor;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.logic.p261a.p276b.C2622a.C2621a;
import mobi.mmdt.ott.logic.sync.C2903c;
import mobi.mmdt.ott.p246d.p247a.C2533f;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.OttProvider;

public final class C2999a {
    public static int m7496a(String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2, boolean z3, String str7, Uri uri, boolean z4, String str8, String str9) {
        if (str5 != null) {
            if (str != null) {
                if (z && (str6 == null || str6.isEmpty())) {
                    throw new NullPointerException();
                }
                C6033c c6033c = new C6033c();
                c6033c.m13492a(str).m13494b(str3).m13501e(str6).m13493a(z).m13498c(z2).m13495b(z3).m13503f(str7).m13497c(str4).m13504g(str2).m13502e(z4).m13505h(str8).m13508k(str9);
                if (uri != null) {
                    c6033c.m13506i(uri.toString());
                } else {
                    c6033c.m13496c();
                }
                return c6033c.m13490a(MyApplication.m12952b(), new C6035f().m13520a(str5));
            }
        }
        throw new NullPointerException();
    }

    public static int m7497a(String str, boolean z) {
        C6033c c6033c = new C6033c();
        c6033c.m13500d(z).m13502e(z ^ true);
        C6035f c6035f = new C6035f();
        c6035f.m13520a(str);
        return c6033c.m13490a(MyApplication.m12952b(), c6035f);
    }

    public static HashMap<String, C3001e> m7498a(List<String> list) {
        Throwable th;
        List<String> list2 = list;
        C6035f c6035f = new C6035f();
        ((C6035f) ((C6035f) c6035f.m13527j().m7368c()).m13526i().m7368c()).m13529l();
        c6035f.m7368c();
        if (!list.isEmpty()) {
            c6035f.m13523b((String) list2.get(0));
            if (list.size() > 1) {
                for (int i = 1; i < list.size(); i++) {
                    c6035f.m7368c();
                    c6035f.m13523b((String) list2.get(i));
                }
            }
        }
        c6035f.m7363a("members_weight", true);
        c6035f.m7362a(30);
        HashMap<String, C3001e> hashMap = new HashMap();
        C6034d b;
        try {
            b = c6035f.m13522b(MyApplication.m12952b());
            try {
                if (b.moveToFirst()) {
                    do {
                        Uri parse = b.m7352a("members_local_image_uri") != null ? Uri.parse(b.m7352a("members_local_image_uri")) : null;
                        String b2 = b.m13510b();
                        C3001e c3001e = r5;
                        C3001e c3001e2 = new C3001e(b.m13509a(), b.m7352a("members_nick_name"), b.m7352a("members_avatar_url"), b.m7352a("members_avatar_thumbnail_url"), b.m13510b(), b.m7352a("members_local_phone_number"), b.m7354c("members_last_online"), b.m13511c(), b.m13513e(), b.m13512d(), b.m7352a("members_local_name"), b.m7352a("members_moto"), parse, b.m13514f(), b.m13515g(), b.m13516h(), b.m13517i(), b.m13518j(), b.m7352a("members_standard_phone_number"), b.m7352a("members_last_position"), b.m13519k(), b.m7352a("members_soroush_id"), b.m7353b("members_weight").intValue());
                        hashMap.put(b2, c3001e);
                    } while (b.moveToNext());
                }
                if (b != null) {
                    b.close();
                }
                return hashMap;
            } catch (Throwable th2) {
                th = th2;
                if (b != null) {
                    b.close();
                }
                throw th;
            }
        } catch (Throwable th22) {
            th = th22;
            b = null;
            if (b != null) {
                b.close();
            }
            throw th;
        }
    }

    public static HashMap<String, C3001e> m7499a(String[] strArr) {
        C6034d c6034d;
        Throwable th;
        C6035f c6035f = new C6035f();
        ((C6035f) ((C6035f) ((C6035f) c6035f.m13527j().m7368c()).m13529l().m7368c()).m13526i().m7368c()).m13520a(strArr);
        HashMap<String, C3001e> hashMap = new HashMap();
        try {
            C6034d b = c6035f.m13522b(MyApplication.m12952b());
            try {
                if (b.moveToFirst()) {
                    do {
                        Uri parse = b.m7352a("members_local_image_uri") != null ? Uri.parse(b.m7352a("members_local_image_uri")) : null;
                        String b2 = b.m13510b();
                        C3001e c3001e = r5;
                        C3001e c3001e2 = new C3001e(b.m13509a(), b.m7352a("members_nick_name"), b.m7352a("members_avatar_url"), b.m7352a("members_avatar_thumbnail_url"), b.m13510b(), b.m7352a("members_local_phone_number"), b.m7354c("members_last_online"), b.m13511c(), b.m13513e(), b.m13512d(), b.m7352a("members_local_name"), b.m7352a("members_moto"), parse, b.m13514f(), b.m13515g(), b.m13516h(), b.m13517i(), b.m13518j(), b.m7352a("members_standard_phone_number"), b.m7352a("members_last_position"), b.m13519k(), b.m7352a("members_soroush_id"));
                        hashMap.put(b2, c3001e);
                    } while (b.moveToNext());
                }
                if (b != null) {
                    b.close();
                }
                return hashMap;
            } catch (Throwable th2) {
                c6034d = b;
                th = th2;
                if (c6034d != null) {
                    c6034d.close();
                }
                throw th;
            }
        } catch (Throwable th22) {
            th = th22;
            c6034d = null;
            if (c6034d != null) {
                c6034d.close();
            }
            throw th;
        }
    }

    public static C3001e m7500a(String str) {
        Throwable th;
        Throwable th2;
        C6035f c6035f = new C6035f();
        c6035f.m13520a(str);
        C6034d c6034d = null;
        try {
            C6034d b = c6035f.m13522b(MyApplication.m12952b());
            try {
                if (b.moveToFirst()) {
                    if (b.m7352a("members_local_image_uri") != null) {
                        c6034d = Uri.parse(b.m7352a("members_local_image_uri"));
                    }
                    C3001e c3001e = new C3001e(b.m13509a(), b.m7352a("members_nick_name"), b.m7352a("members_avatar_url"), b.m7352a("members_avatar_thumbnail_url"), b.m13510b(), b.m7352a("members_local_phone_number"), b.m7354c("members_last_online"), b.m13511c(), b.m13513e(), b.m13512d(), b.m7352a("members_local_name"), b.m7352a("members_moto"), c6034d, b.m13514f(), b.m13515g(), b.m13516h(), b.m13517i(), b.m13518j(), b.m7352a("members_standard_phone_number"), b.m7352a("members_last_position"), b.m13519k(), b.m7352a("members_soroush_id"));
                }
                if (b != null) {
                    b.close();
                }
                return r2;
            } catch (Throwable th3) {
                th = th3;
                c6034d = b;
                th2 = th;
                if (c6034d != null) {
                    c6034d.close();
                }
                throw th2;
            }
        } catch (Throwable th4) {
            th = th4;
            th2 = th;
            if (c6034d != null) {
                c6034d.close();
            }
            throw th2;
        }
    }

    public static void m7501a(ArrayList<C2533f> arrayList) {
        if (arrayList.size() != 0) {
            ContentValues[] contentValuesArr = new ContentValues[arrayList.size()];
            Iterator it = arrayList.iterator();
            int i = 0;
            while (it.hasNext()) {
                C2533f c2533f = (C2533f) it.next();
                contentValuesArr[i] = new ContentValues();
                contentValuesArr[i].put("members_nick_name", c2533f.f8247a);
                contentValuesArr[i].put("members_avatar_url", c2533f.f8249c);
                contentValuesArr[i].put("members_avatar_thumbnail_url", c2533f.f8250d);
                contentValuesArr[i].put("members_user_id", c2533f.f8251e);
                contentValuesArr[i].put("members_standard_phone_number", c2533f.f8252f);
                contentValuesArr[i].put("members_local_phone_number", c2533f.f8253g);
                contentValuesArr[i].put("members_is_local_user", Boolean.valueOf(c2533f.f8254h));
                contentValuesArr[i].put("members_is_anouncer", Boolean.valueOf(c2533f.f8255i));
                contentValuesArr[i].put("members_can_reply", Boolean.valueOf(c2533f.f8256j));
                contentValuesArr[i].put("members_local_name", c2533f.f8257k);
                contentValuesArr[i].put("members_is_new_user", Boolean.valueOf(false));
                contentValuesArr[i].put("members_moto", c2533f.f8248b);
                contentValuesArr[i].put("members_soroush_id", c2533f.f8266t);
                contentValuesArr[i].put("members_is_synced_contact", Boolean.valueOf(c2533f.f8259m));
                contentValuesArr[i].put("members_is_deactivated_user", Boolean.valueOf(c2533f.f8260n));
                contentValuesArr[i].put("members_weight", Integer.valueOf(c2533f.f8268v));
                contentValuesArr[i].put("members_extra", Integer.valueOf((c2533f.f8261o ? C2621a.f8519a : C2621a.f8520b) - 1));
                if (c2533f.f8258l != null) {
                    contentValuesArr[i].put("members_local_image_uri", c2533f.f8258l.toString());
                } else {
                    contentValuesArr[i].putNull("members_local_image_uri");
                }
                if (c2533f.f8262p != null) {
                    contentValuesArr[i].put("members_last_online", c2533f.f8262p);
                }
                contentValuesArr[i].put("members_is_pined", Boolean.valueOf(c2533f.f8264r));
                contentValuesArr[i].put("members_is_mute", Boolean.valueOf(c2533f.f8267u));
                contentValuesArr[i].put("members_is_soroush_member", Boolean.valueOf(c2533f.f8263q));
                contentValuesArr[i].put("members_last_position", c2533f.f8265s);
                i++;
            }
            C6035f c6035f = new C6035f();
            ContentProviderClient acquireContentProviderClient = MyApplication.m12952b().getContentResolver().acquireContentProviderClient("mobi.mmdt.ott.provider");
            if (acquireContentProviderClient != null) {
                OttProvider ottProvider = (OttProvider) acquireContentProviderClient.getLocalContentProvider();
                if (ottProvider != null) {
                    ottProvider.m7378a(c6035f.m7372g(), contentValuesArr);
                }
                acquireContentProviderClient.release();
            }
        }
    }

    public static void m7502a(ArrayList<String> arrayList, boolean z) {
        String str = "";
        String str2 = "";
        Object obj = 1;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            StringBuilder stringBuilder;
            String str3 = (String) it.next();
            if (obj != null) {
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append(str);
                stringBuilder2.append("'");
                stringBuilder2.append(str3);
                str = stringBuilder2.toString();
                obj = null;
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append("','");
                stringBuilder.append(str3);
                str = stringBuilder.toString();
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append(str2);
            stringBuilder.append(" WHEN '");
            stringBuilder.append(str3);
            stringBuilder.append("' THEN ");
            stringBuilder.append(z);
            stringBuilder.append(" ");
            str2 = stringBuilder.toString();
        }
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append(str);
        stringBuilder3.append("'");
        String stringBuilder4 = stringBuilder3.toString();
        StringBuilder stringBuilder5 = new StringBuilder("UPDATE members SET members_is_synced_contact = CASE members_user_id");
        stringBuilder5.append(str2);
        stringBuilder5.append(" END WHERE members_user_id IN (");
        stringBuilder5.append(stringBuilder4);
        stringBuilder5.append(")");
        new C6035f().m13521a(MyApplication.m12952b(), stringBuilder5.toString());
    }

    public static void m7503a(Map<String, Long> map) {
        if (map == null) {
            throw new NullPointerException();
        }
        String str = "";
        String str2 = "";
        Object obj = 1;
        for (String str3 : map.keySet()) {
            StringBuilder stringBuilder;
            if (obj != null) {
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append(str);
                stringBuilder2.append("'");
                stringBuilder2.append(str3);
                str = stringBuilder2.toString();
                obj = null;
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append("','");
                stringBuilder.append(str3);
                str = stringBuilder.toString();
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append(str2);
            stringBuilder.append(" WHEN members_user_id = '");
            stringBuilder.append(str3);
            stringBuilder.append("' AND members_last_online < ");
            stringBuilder.append(map.get(str3));
            stringBuilder.append(" THEN ");
            stringBuilder.append(map.get(str3));
            str2 = stringBuilder.toString();
        }
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append(str);
        stringBuilder3.append("'");
        String stringBuilder4 = stringBuilder3.toString();
        StringBuilder stringBuilder5 = new StringBuilder("UPDATE members SET members_last_online = CASE ");
        stringBuilder5.append(str2);
        stringBuilder5.append(" ELSE members_last_online END WHERE members_user_id IN (");
        stringBuilder5.append(stringBuilder4);
        stringBuilder5.append(")");
        new C6035f().m13521a(MyApplication.m12952b(), stringBuilder5.toString());
    }

    public static C2903c[] m7504a() {
        Throwable th;
        C6035f c6035f = new C6035f();
        c6035f.m13526i();
        c6035f.m7368c();
        c6035f.m13529l();
        C6034d b;
        try {
            b = c6035f.m13522b(MyApplication.m12952b());
            try {
                C2903c[] c2903cArr = new C2903c[b.getCount()];
                int i = 0;
                if (b.moveToFirst()) {
                    while (true) {
                        int i2 = i + 1;
                        c2903cArr[i] = new C2903c(b.m7352a("members_local_phone_number"), b.m7352a("members_standard_phone_number"), b.m7352a("members_local_name"), b.m7352a("members_nick_name"));
                        if (!b.moveToNext()) {
                            break;
                        }
                        i = i2;
                    }
                }
                if (b != null) {
                    b.close();
                }
                return c2903cArr;
            } catch (Throwable th2) {
                th = th2;
                if (b != null) {
                    b.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            b = null;
            if (b != null) {
                b.close();
            }
            throw th;
        }
    }

    public static CursorLoader m7505b(String str) {
        String[] strArr = new String[]{"_id", "members_avatar_url", "members_avatar_thumbnail_url", "members_local_name", "members_is_local_user", "members_moto", "members_local_image_uri", "members_user_id", "members_local_phone_number", "members_standard_phone_number", "members_is_soroush_member", "members_is_pined", "members_is_mute"};
        Context b = MyApplication.m12952b();
        Uri uri = C3000b.f9413a;
        StringBuilder stringBuilder = new StringBuilder("members_is_synced_contact =? and members_is_deactivated_user =? and (members_local_name LIKE '%");
        stringBuilder.append(str);
        stringBuilder.append("%' OR members_local_phone_number LIKE '%");
        stringBuilder.append(str);
        stringBuilder.append("%')");
        str = stringBuilder.toString();
        String[] strArr2 = new String[]{"1", "0"};
        StringBuilder stringBuilder2 = new StringBuilder("members_is_soroush_member DESC ,  CASE WHEN members_user_id = '");
        stringBuilder2.append(C2535a.m6888a().m6928d());
        stringBuilder2.append("' THEN 1 ELSE 2 END,members_local_name COLLATE UNICODE ASC ");
        return new CursorLoader(b, uri, strArr, str, strArr2, stringBuilder2.toString());
    }

    public static ArrayList<String> m7506b(String[] strArr) {
        if (strArr.length < 998) {
            return C2999a.m7515e(strArr);
        }
        int length = strArr.length / 998;
        ArrayList<String> arrayList = new ArrayList();
        for (int i = 0; i < length; i++) {
            Object obj = new String[998];
            System.arraycopy(strArr, i * 998, obj, 0, 998);
            Collection e = C2999a.m7515e(obj);
            if (e != null) {
                arrayList.addAll(e);
            }
        }
        if (strArr.length % 998 != 0) {
            Object obj2 = new String[(strArr.length % 998)];
            System.arraycopy(strArr, length * 998, obj2, 0, obj2.length);
            Collection e2 = C2999a.m7515e(obj2);
            if (e2 != null) {
                arrayList.addAll(e2);
            }
        }
        return arrayList;
    }

    public static void m7507b(ArrayList<String> arrayList, boolean z) {
        String str = "";
        String str2 = "";
        Object obj = 1;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            StringBuilder stringBuilder;
            String str3 = (String) it.next();
            if (obj != null) {
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append(str);
                stringBuilder2.append("'");
                stringBuilder2.append(str3);
                str = stringBuilder2.toString();
                obj = null;
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append("','");
                stringBuilder.append(str3);
                str = stringBuilder.toString();
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append(str2);
            stringBuilder.append(" WHEN '");
            stringBuilder.append(str3);
            stringBuilder.append("' THEN ");
            stringBuilder.append(z);
            stringBuilder.append(" ");
            str2 = stringBuilder.toString();
        }
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append(str);
        stringBuilder3.append("'");
        String stringBuilder4 = stringBuilder3.toString();
        StringBuilder stringBuilder5 = new StringBuilder("UPDATE members SET members_is_local_user = CASE members_user_id");
        stringBuilder5.append(str2);
        stringBuilder5.append(" END WHERE members_user_id IN (");
        stringBuilder5.append(stringBuilder4);
        stringBuilder5.append(")");
        new C6035f().m13521a(MyApplication.m12952b(), stringBuilder5.toString());
    }

    public static String[] m7508b() {
        C6034d b;
        Throwable th;
        C6035f c6035f = new C6035f();
        c6035f.m13526i();
        try {
            b = c6035f.m13522b(MyApplication.m12952b());
            try {
                String[] strArr = new String[b.getCount()];
                int i = 0;
                if (b.moveToFirst()) {
                    while (true) {
                        int i2 = i + 1;
                        strArr[i] = b.m13510b();
                        if (!b.moveToNext()) {
                            break;
                        }
                        i = i2;
                    }
                }
                if (b != null) {
                    b.close();
                }
                return strArr;
            } catch (Throwable th2) {
                th = th2;
                if (b != null) {
                    b.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            b = null;
            if (b != null) {
                b.close();
            }
            throw th;
        }
    }

    public static C3001e[] m7509b(List<String> list) {
        int i;
        Throwable th;
        Throwable th2;
        List<String> list2 = list;
        C6035f c6035f = new C6035f();
        ((C6035f) ((C6035f) c6035f.m13527j().m7368c()).m13526i().m7368c()).m13529l();
        c6035f.m7368c();
        int i2 = 0;
        if (!list.isEmpty()) {
            c6035f.m13523b((String) list2.get(0));
            if (list.size() > 1) {
                for (i = 1; i < list.size(); i++) {
                    c6035f.m7368c();
                    c6035f.m13523b((String) list2.get(i));
                }
            }
        }
        C6034d b;
        try {
            b = c6035f.m13522b(MyApplication.m12952b());
            try {
                C3001e[] c3001eArr = new C3001e[b.getCount()];
                if (b.moveToFirst()) {
                    while (true) {
                        i = i2 + 1;
                        c3001eArr[i2] = new C3001e(b.m13509a(), b.m7352a("members_nick_name"), b.m7352a("members_avatar_url"), b.m7352a("members_avatar_thumbnail_url"), b.m13510b(), b.m7352a("members_local_phone_number"), b.m7354c("members_last_online"), b.m13511c(), b.m13513e(), b.m13512d(), b.m7352a("members_local_name"), b.m7352a("members_moto"), b.m7352a("members_local_image_uri") != null ? Uri.parse(b.m7352a("members_local_image_uri")) : null, b.m13514f(), b.m13515g(), b.m13516h(), b.m13517i(), b.m13518j(), b.m7352a("members_standard_phone_number"), b.m7352a("members_last_position"), b.m13519k(), b.m7352a("members_soroush_id"));
                        if (!b.moveToNext()) {
                            break;
                        }
                        i2 = i;
                    }
                }
                if (b != null) {
                    b.close();
                }
                return c3001eArr;
            } catch (Throwable th3) {
                th = th3;
                th2 = th;
                if (b != null) {
                    b.close();
                }
                throw th2;
            }
        } catch (Throwable th4) {
            th = th4;
            b = null;
            th2 = th;
            if (b != null) {
                b.close();
            }
            throw th2;
        }
    }

    public static int m7510c() {
        C6035f c6035f = new C6035f();
        c6035f.m13529l();
        c6035f.m7368c();
        c6035f.m13526i();
        C6034d b = c6035f.m13522b(MyApplication.m12952b());
        if (b == null) {
            return 0;
        }
        int count = b.getCount();
        b.close();
        return count;
    }

    public static CursorLoader m7511c(String str) {
        return new CursorLoader(MyApplication.m12952b(), C3000b.f9413a, null, "members_user_id =? ", new String[]{str}, null);
    }

    public static ArrayList<String> m7512c(String[] strArr) {
        if (strArr.length < 998) {
            return C2999a.m7516f(strArr);
        }
        int length = strArr.length / 998;
        ArrayList<String> arrayList = new ArrayList();
        for (int i = 0; i < length; i++) {
            Object obj = new String[998];
            System.arraycopy(strArr, i * 998, obj, 0, 998);
            Collection f = C2999a.m7516f(obj);
            if (f != null) {
                arrayList.addAll(f);
            }
        }
        if (strArr.length % 998 != 0) {
            Object obj2 = new String[(strArr.length % 998)];
            System.arraycopy(strArr, length * 998, obj2, 0, obj2.length);
            Collection f2 = C2999a.m7516f(obj2);
            if (f2 != null) {
                arrayList.addAll(f2);
            }
        }
        return arrayList;
    }

    public static int m7513d(String str) {
        Throwable th;
        ContentResolver contentResolver = MyApplication.m12952b().getContentResolver();
        r3 = new String[12];
        int i = 0;
        r3[0] = "_id";
        r3[1] = "members_avatar_url";
        r3[2] = "members_avatar_thumbnail_url";
        r3[3] = "members_local_name";
        r3[4] = "members_is_local_user";
        r3[5] = "members_moto";
        r3[6] = "members_local_image_uri";
        r3[7] = "members_user_id";
        r3[8] = "members_local_phone_number";
        r3[9] = "members_is_soroush_member";
        r3[10] = "members_is_pined";
        r3[11] = "members_is_mute";
        Cursor cursor = null;
        try {
            Uri uri = C3000b.f9413a;
            StringBuilder stringBuilder = new StringBuilder("members_is_synced_contact =? and members_is_deactivated_user =? and members_is_soroush_member =? and (members_local_name LIKE '%");
            stringBuilder.append(str);
            stringBuilder.append("%' OR members_local_phone_number LIKE '%");
            stringBuilder.append(str);
            stringBuilder.append("%')");
            Cursor query = contentResolver.query(uri, r3, stringBuilder.toString(), new String[]{"1", "0", "1"}, null);
            if (query != null) {
                try {
                    i = query.getCount();
                } catch (Throwable th2) {
                    Throwable th3 = th2;
                    cursor = query;
                    th = th3;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (query != null) {
                query.close();
            }
            return i;
        } catch (Throwable th4) {
            th = th4;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public static int m7514d(String[] strArr) {
        C6033c c6033c = new C6033c();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(C2621a.f8519a - 1);
        c6033c.m13507j(stringBuilder.toString());
        C6035f c6035f = new C6035f();
        c6035f.m13520a(strArr);
        return c6033c.m13490a(MyApplication.m12952b(), c6035f);
    }

    private static ArrayList<String> m7515e(String[] strArr) {
        String[] strArr2 = new String[1];
        int i = 0;
        strArr2[0] = "members_standard_phone_number";
        int length = strArr.length;
        StringBuilder stringBuilder = new StringBuilder(length * 2);
        while (i < length) {
            if (i > 0) {
                stringBuilder.append(",");
            }
            stringBuilder.append("?");
            i++;
        }
        ContentResolver contentResolver = MyApplication.m12952b().getContentResolver();
        Uri uri = C3000b.f9413a;
        StringBuilder stringBuilder2 = new StringBuilder("members_standard_phone_number IN (");
        stringBuilder2.append(stringBuilder.toString());
        stringBuilder2.append(")");
        Cursor query = contentResolver.query(uri, strArr2, stringBuilder2.toString(), strArr, null);
        if (query == null) {
            return null;
        }
        ArrayList<String> arrayList = new ArrayList(query.getCount());
        if (query.moveToFirst()) {
            while (!query.isAfterLast()) {
                arrayList.add(query.getString(query.getColumnIndex("members_standard_phone_number")));
                query.moveToNext();
            }
        }
        query.close();
        return arrayList;
    }

    private static ArrayList<String> m7516f(String[] strArr) {
        String[] strArr2 = new String[1];
        int i = 0;
        strArr2[0] = "members_user_id";
        int length = strArr.length;
        StringBuilder stringBuilder = new StringBuilder(length * 2);
        while (i < length) {
            if (i > 0) {
                stringBuilder.append(",");
            }
            stringBuilder.append("?");
            i++;
        }
        ContentResolver contentResolver = MyApplication.m12952b().getContentResolver();
        Uri uri = C3000b.f9413a;
        StringBuilder stringBuilder2 = new StringBuilder("members_user_id IN (");
        stringBuilder2.append(stringBuilder.toString());
        stringBuilder2.append(")");
        Cursor query = contentResolver.query(uri, strArr2, stringBuilder2.toString(), strArr, null);
        if (query == null) {
            return null;
        }
        ArrayList<String> arrayList = new ArrayList(query.getCount());
        if (query.moveToFirst()) {
            while (!query.isAfterLast()) {
                arrayList.add(query.getString(query.getColumnIndex("members_user_id")));
                query.moveToNext();
            }
        }
        query.close();
        return arrayList;
    }
}
