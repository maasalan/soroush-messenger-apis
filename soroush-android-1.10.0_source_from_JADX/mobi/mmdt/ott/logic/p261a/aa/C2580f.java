package mobi.mmdt.ott.logic.p261a.aa;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract.Data;
import android.provider.ContactsContract.RawContacts;
import java.util.HashMap;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.contacts.base.LocalContactData;
import mobi.mmdt.ott.p246d.p248b.C2535a;

public final class C2580f {
    public HashMap<String, LocalContactData> f8423a = new HashMap();
    boolean f8424b = m7025a();
    String f8425c;

    public C2580f(String str, String str2, boolean z) {
        if (!C2580f.m7027b()) {
            return;
        }
        if (this.f8424b || z) {
            m7026b(str, str2);
        }
    }

    public static String m7024a(String str, String str2) {
        if (str2 == null) {
            return null;
        }
        if (str2.startsWith("+")) {
            str2 = str2.replaceFirst("\\+", "00");
        }
        str2 = str2.replaceAll("[^0-9]", "");
        if (str2.startsWith("00")) {
            return str2.replaceFirst("00", "");
        }
        if (str2.startsWith("0")) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(str2.replaceFirst("0", ""));
            str2 = stringBuilder.toString();
        }
        return str2;
    }

    private boolean m7025a() {
        Exception e;
        Throwable th;
        String string = C2535a.m6888a().f8278a.getString("mobi.mmdt.ott.model.pref.PrefKeys.CONTACTS_LAST_SYNC_VERSION", "");
        boolean z = false;
        try {
            ContentResolver contentResolver = MyApplication.m12952b().getContentResolver();
            Cursor cursor = null;
            try {
                Cursor query = contentResolver.query(RawContacts.CONTENT_URI, new String[]{"version"}, null, null, null);
                if (query != null) {
                    try {
                        StringBuilder stringBuilder = new StringBuilder();
                        while (query.moveToNext()) {
                            stringBuilder.append(query.getString(query.getColumnIndex("version")));
                        }
                        this.f8425c = stringBuilder.toString();
                        StringBuilder stringBuilder2 = new StringBuilder("syncContacts: last sync version ");
                        stringBuilder2.append(string);
                        C2480b.m6742f(stringBuilder2.toString());
                        stringBuilder2 = new StringBuilder("syncContacts: new sync version  ");
                        stringBuilder2.append(stringBuilder.toString());
                        C2480b.m6742f(stringBuilder2.toString());
                        if (!(string.length() == 0 || string.equals(this.f8425c))) {
                            z = true;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        cursor = query;
                        try {
                            C2480b.m6732a(e.getMessage());
                            if (cursor != null) {
                                cursor.close();
                                return false;
                            }
                            return z;
                        } catch (Throwable th2) {
                            th = th2;
                            query = cursor;
                            if (query != null) {
                                query.close();
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        if (query != null) {
                            query.close();
                        }
                        throw th;
                    }
                }
                if (query != null) {
                    query.close();
                    return z;
                }
            } catch (Exception e3) {
                e = e3;
                C2480b.m6732a(e.getMessage());
                if (cursor != null) {
                    cursor.close();
                    return false;
                }
                return z;
            }
        } catch (Exception e4) {
            C2480b.m6732a(e4.getMessage());
        }
        return z;
    }

    private void m7026b(String str, String str2) {
        C2480b.m6742f("syncTest  Start update SyncModel");
        Cursor query = MyApplication.m12952b().getContentResolver().query(Data.CONTENT_URI, null, "has_phone_number!=0 AND (mimetype=?)", new String[]{"vnd.android.cursor.item/phone_v2"}, "status_ts ASC");
        if (query != null) {
            String string;
            Uri uri = null;
            if (query.moveToFirst()) {
                do {
                    string = query.getString(query.getColumnIndex("display_name"));
                    String string2 = query.getString(query.getColumnIndex("data1"));
                    String string3 = query.getString(query.getColumnIndex("photo_uri"));
                    Uri parse = string3 != null ? Uri.parse(string3) : null;
                    String a = C2580f.m7024a(str, string2);
                    this.f8423a.put(a, new LocalContactData(string2, string, parse, a));
                } while (query.moveToNext());
                C2480b.m6742f("All phone Contacts has been read. SyncContactModel");
            }
            str = C2580f.m7024a(str, str2);
            string = "\u0000You";
            if (this.f8423a.containsKey(str)) {
                LocalContactData localContactData = (LocalContactData) this.f8423a.get(str);
                if (str2 == null) {
                    str2 = localContactData.getAndroidPhoneNumber();
                }
                uri = localContactData.getAndroidAvatarUri();
            }
            this.f8423a.put(str, new LocalContactData(str2, string, uri, str));
            query.close();
        }
    }

    private static boolean m7027b() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r0 = android.os.Build.VERSION.SDK_INT;
        r1 = 0;
        r2 = 1;
        r3 = 23;
        if (r0 < r3) goto L_0x0016;
    L_0x0008:
        r0 = mobi.mmdt.ott.MyApplication.m12952b();
        r3 = "android.permission.READ_CONTACTS";
        r0 = r0.checkSelfPermission(r3);
        if (r0 != 0) goto L_0x0015;
    L_0x0014:
        return r2;
    L_0x0015:
        return r1;
    L_0x0016:
        r0 = 0;
        r3 = mobi.mmdt.ott.MyApplication.m12952b();	 Catch:{ Throwable -> 0x004b, all -> 0x0044 }
        r4 = r3.getContentResolver();	 Catch:{ Throwable -> 0x004b, all -> 0x0044 }
        r5 = android.provider.ContactsContract.CommonDataKinds.Phone.CONTENT_URI;	 Catch:{ Throwable -> 0x004b, all -> 0x0044 }
        r6 = 0;	 Catch:{ Throwable -> 0x004b, all -> 0x0044 }
        r7 = 0;	 Catch:{ Throwable -> 0x004b, all -> 0x0044 }
        r8 = 0;	 Catch:{ Throwable -> 0x004b, all -> 0x0044 }
        r9 = 0;	 Catch:{ Throwable -> 0x004b, all -> 0x0044 }
        r3 = r4.query(r5, r6, r7, r8, r9);	 Catch:{ Throwable -> 0x004b, all -> 0x0044 }
        if (r3 == 0) goto L_0x003e;
    L_0x002b:
        r0 = r3.getCount();	 Catch:{ Throwable -> 0x003c, all -> 0x0038 }
        if (r0 != 0) goto L_0x0032;
    L_0x0031:
        goto L_0x003e;
    L_0x0032:
        if (r3 == 0) goto L_0x0050;
    L_0x0034:
        r3.close();	 Catch:{ Exception -> 0x0050 }
        return r2;
    L_0x0038:
        r0 = move-exception;
        r1 = r0;
        r0 = r3;
        goto L_0x0045;
    L_0x003c:
        r0 = r3;
        goto L_0x004b;
    L_0x003e:
        if (r3 == 0) goto L_0x0043;
    L_0x0040:
        r3.close();	 Catch:{ Exception -> 0x0043 }
    L_0x0043:
        return r1;
    L_0x0044:
        r1 = move-exception;
    L_0x0045:
        if (r0 == 0) goto L_0x004a;
    L_0x0047:
        r0.close();	 Catch:{ Exception -> 0x004a }
    L_0x004a:
        throw r1;
    L_0x004b:
        if (r0 == 0) goto L_0x0050;
    L_0x004d:
        r0.close();	 Catch:{ Exception -> 0x0050 }
    L_0x0050:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.logic.a.aa.f.b():boolean");
    }
}
