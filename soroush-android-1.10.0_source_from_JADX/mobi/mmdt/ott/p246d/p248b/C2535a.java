package mobi.mmdt.ott.p246d.p248b;

import android.content.SharedPreferences;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Set;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.logic.core.p346a.C2794b;
import mobi.mmdt.ott.logic.p348e.C5981b;

public final class C2535a {
    private static C2535a f8277b;
    public SharedPreferences f8278a = MyApplication.m12952b().getSharedPreferences("mobi.mmdt.ott.model.pref.PrefKeys.KEY_MAIN_PREF_1", 0);

    private C2535a() {
    }

    public static int m6886H() {
        return C2537c.f8292k;
    }

    public static ArrayList<C5981b> m6887T() {
        String S = C2535a.m6888a().m6907S();
        if (S != null) {
            try {
                return new C2794b(S).f8836a;
            } catch (Throwable e) {
                C2480b.m6737b("Error in pref chatConfig", e);
            }
        }
        return null;
    }

    public static C2535a m6888a() {
        if (f8277b == null) {
            f8277b = new C2535a();
        }
        return f8277b;
    }

    public static String m6889c(String str) {
        if (str != null && str.startsWith("0")) {
            return str;
        }
        StringBuilder stringBuilder = new StringBuilder("0");
        stringBuilder.append(str);
        return stringBuilder.toString();
    }

    public final int m6890A() {
        return C2539e.m6982a()[this.f8278a.getInt("mobi.mmdt.ott.model.pref.KEY_VIBRATE_MODE", C2537c.f8289h - 1)];
    }

    public final int m6891B() {
        return this.f8278a.getInt("mobi.mmdt.ott.model.pref.KEY_FONT_SIZE3", 16);
    }

    public final void m6892C() {
        this.f8278a.edit().clear().apply();
    }

    public final boolean m6893D() {
        return this.f8278a.getBoolean("mobi.mmdt.ott.model.pref.KEY_IS_NOTIFICATION_MESSAGE_PREVIEW_ENABLE", true);
    }

    public final Uri m6894E() {
        String string = this.f8278a.getString("mobi.mmdt.ott.model.pref.KEY_NOTIFICATION_SOUND_URI", C2537c.f8291j.toString());
        return !string.isEmpty() ? Uri.parse(string) : null;
    }

    public final int m6895F() {
        return this.f8278a.getInt("mobi.mmdt.ott.model.pref.KEY_CONVERSATION_BACKGROUND_COLOR", C2537c.f8292k);
    }

    public final String m6896G() {
        return this.f8278a.getString("mobi.mmdt.ott.model.pref.KEY_CONVERSATION_BACKGROUND_PATH", C2537c.f8286e);
    }

    public final int m6897I() {
        return this.f8278a.getInt("mobi.mmdt.ott.model.pref.KEY_STATE_CONVERSATION_BACKGROUND", C2537c.f8293l);
    }

    public final String m6898J() {
        return this.f8278a.getString("mobi.mmdt.ott.model.pref.KEY_URL_IMAGE_CHANGE_BACKGROUND", C2537c.f8287f);
    }

    public final int m6899K() {
        return this.f8278a.getInt("mobi.mmdt.ott.model.pref.KEY_NOTIFICATION_LIGHT_COLOR", -256);
    }

    public final void m6900L() {
        this.f8278a.edit().putBoolean("mobi.mmdt.ott.model.pref.KEY_IS_PROFILE_SET", true).apply();
    }

    public final void m6901M() {
        this.f8278a.edit().putBoolean("mobi.mmdt.ott.model.pref.KEY_IS_NOT_AUTHORIZED", true).apply();
    }

    public final boolean m6902N() {
        return this.f8278a.getBoolean("mobi.mmdt.ott.model.pref.KEY_IS_NOT_AUTHORIZED", false);
    }

    public final boolean m6903O() {
        return this.f8278a.getBoolean("mobi.mmdt.ott.model.pref.PrefKeys.KEY_IS_NOTIFICATIONS_DISABLED", false);
    }

    public final String m6904P() {
        return this.f8278a.getString("mobi.mmdt.ott.model.pref.PrefKeys.KEY_FCM_TOKEN", null);
    }

    public final boolean m6905Q() {
        return this.f8278a.getBoolean("mobi.mmdt.ott.model.pref.PrefKeys.KEY_IS_FCM_TOKEN_SENDED", false);
    }

    public final java.lang.String m6906R() {
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
        r3 = this;
        r0 = r3.f8278a;
        r1 = "mobi.mmdt.ott.model.pref.PrefKeys.KEY_CALL_CONFIG";
        r2 = 0;
        r0 = r0.getString(r1, r2);
        if (r0 == 0) goto L_0x0020;
    L_0x000b:
        r1 = r3.m6928d();	 Catch:{ Exception -> 0x0020 }
        mobi.mmdt.ott.lib_webservicescomponent.p257d.C2555a.m6994a(r1);	 Catch:{ Exception -> 0x0020 }
        r1 = r3.m6928d();	 Catch:{ Exception -> 0x0020 }
        r1 = r1.getBytes();	 Catch:{ Exception -> 0x0020 }
        mobi.mmdt.ott.lib_webservicescomponent.p257d.C2555a.m6996b(r0, r1);	 Catch:{ Exception -> 0x0020 }
        r0 = mobi.mmdt.ott.lib_webservicescomponent.p257d.C2555a.f8312a;	 Catch:{ Exception -> 0x0020 }
        return r0;
    L_0x0020:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.d.b.a.R():java.lang.String");
    }

    public final java.lang.String m6907S() {
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
        r3 = this;
        r0 = r3.f8278a;
        r1 = "mobi.mmdt.ott.model.pref.PrefKeys.KEY_CHAT_CONFIG2";
        r2 = 0;
        r0 = r0.getString(r1, r2);
        if (r0 == 0) goto L_0x0020;
    L_0x000b:
        r1 = r3.m6928d();	 Catch:{ Exception -> 0x0020 }
        mobi.mmdt.ott.lib_webservicescomponent.p257d.C2555a.m6994a(r1);	 Catch:{ Exception -> 0x0020 }
        r1 = r3.m6928d();	 Catch:{ Exception -> 0x0020 }
        r1 = r1.getBytes();	 Catch:{ Exception -> 0x0020 }
        mobi.mmdt.ott.lib_webservicescomponent.p257d.C2555a.m6996b(r0, r1);	 Catch:{ Exception -> 0x0020 }
        r0 = mobi.mmdt.ott.lib_webservicescomponent.p257d.C2555a.f8312a;	 Catch:{ Exception -> 0x0020 }
        return r0;
    L_0x0020:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.d.b.a.S():java.lang.String");
    }

    public final boolean m6908U() {
        return this.f8278a.getBoolean("mobi.mmdt.ott.model.pref.KEY_NEED_SALAM_WEBSERVICE", true);
    }

    public final long m6909V() {
        return this.f8278a.getLong("mobi.mmdt.ott.model.pref.KEY_LAST_SALAM_CALL_TIME", 0);
    }

    public final String m6910W() {
        return this.f8278a.getString("mobi.mmdt.ott.model.pref.PrefKeys.KEY_MY_LAST_LOCATION", null);
    }

    public final long m6911X() {
        return this.f8278a.getLong("mobi.mmdt.ott.model.pref.KEY_LAST_CALL_REGISTER_TIME", 0);
    }

    public final boolean m6912Y() {
        return this.f8278a.getBoolean("mobi.mmdt.ott.model.pref.KEY_IS_RUN_BACKGROUND", true);
    }

    public final long m6913Z() {
        return this.f8278a.getLong("mobi.mmdt.ott.model.pref.KEY_LAST_FCM_CHAT_TRIGGER", 0);
    }

    public final void m6914a(int i) {
        this.f8278a.edit().putInt("mobi.mmdt.ott.model.pref.KEY_CONVERSATION_BACKGROUND_COLOR", i).apply();
    }

    public final void m6915a(long j) {
        this.f8278a.edit().putLong("mobi.mmdt.ott.model.pref.KEY_LAST_SYNC_ALL_CONTACTS_TIME", j).apply();
    }

    public final void m6916a(String str) {
        this.f8278a.edit().putString("mobi.mmdt.ott.model.pref.PrefKeys.KEY_USER_INVITE_ID", str).apply();
    }

    public final void m6917a(Set<String> set) {
        this.f8278a.edit().putStringSet("SEARCH_HISTORY", set).apply();
    }

    public final void m6918a(boolean z) {
        this.f8278a.edit().putBoolean("mobi.mmdt.ott.model.pref.PrefKeys.USER_NAME_EXPIRY_STATE", z).apply();
    }

    public final long aa() {
        return this.f8278a.getLong("mobi.mmdt.ott.model.pref.KEY_LAST_CLEAR_CACHE_TIME", 0);
    }

    public final String ab() {
        return this.f8278a.getString("mobi.mmdt.ott.model.pref.KEY_CURRENT_THEME_PATH", "default");
    }

    public final String ac() {
        return this.f8278a.getString("mobi.mmdt.ott.model.pref.KEY_IS_COPY_DEFAULT_THEME", "");
    }

    public final Boolean ad() {
        return Boolean.valueOf(this.f8278a.getBoolean("mobi.mmdt.ott.model.pref.KEY_IS_GROUP_TAB_ENABLE", false));
    }

    public final Boolean ae() {
        return Boolean.valueOf(this.f8278a.getBoolean("mobi.mmdt.ott.model.pref.KEY_IS_CHANNEL_TAB_ENABLE", false));
    }

    public final Boolean af() {
        return Boolean.valueOf(this.f8278a.getBoolean("mobi.mmdt.ott.model.pref.KEY_IS_SINGLE_TAB_ENABLE", false));
    }

    public final Boolean ag() {
        return Boolean.valueOf(this.f8278a.getBoolean("mobi.mmdt.ott.model.pref.KEY_IS_MERGE_TAB_ENABLE", true));
    }

    public final Boolean ah() {
        return Boolean.valueOf(this.f8278a.getBoolean("mobi.mmdt.ott.model.pref.KEY_IS_CONTACT_TAB_ENABLE2", false));
    }

    public final Boolean ai() {
        return Boolean.valueOf(this.f8278a.getBoolean("mobi.mmdt.ott.model.pref.KEY_IS_SEND_MESSAGE_ALARM_ENABLE", true));
    }

    public final Boolean aj() {
        return Boolean.valueOf(this.f8278a.getBoolean("mobi.mmdt.ott.model.pref.KEY_IS_PRAY_TIME_NOTIFICATION_ENABLE", false));
    }

    public final String ak() {
        return this.f8278a.getString("mobi.mmdt.ott.model.pref.KEY_ENABLED_PRAY_TIME", "101010");
    }

    public final int al() {
        return this.f8278a.getInt("mobi.mmdt.ott.model.pref.KEY_PRAY_TIME_DIFF", 0);
    }

    public final int am() {
        return this.f8278a.getInt("mobi.mmdt.ott.model.pref.KEY_WEATHER_TEMP_UNIT_NEW", 1001);
    }

    public final int an() {
        return this.f8278a.getInt("mobi.mmdt.ott.model.pref.KEY_WEATHER_WIND_SPEED_UNIT_NEW", 2001);
    }

    public final String ao() {
        return this.f8278a.getString("mobi.mmdt.ott.model.pref.KEY_WEATHER_CITY_LIST_NEW", "%{\"PERSIAN_NAME\":\"تهران\",\"ENGLISH_NAME\":\"Tehran\",\"PROVINCE_PERSIAN_NAME\":\"تهران\",\"PROVINCE_ENGLISH_NAME\":\"Tehran\"}");
    }

    public final int ap() {
        return this.f8278a.getInt("mobi.mmdt.ott.model.pref.KEY_WEATHER_DEFAULT_CITY_NEW", 0);
    }

    public final long aq() {
        return this.f8278a.getLong("mobi.mmdt.ott.model.pref.KEY_LAST_CONVERSATION_LIST_UPDATE_TIME2", 0);
    }

    public final void ar() {
        this.f8278a.edit().putInt("mobi.mmdt.ott.model.pref.KEY_THEME_VERSION", 11).apply();
    }

    public final int as() {
        return this.f8278a.getInt("mobi.mmdt.ott.model.pref.KEY_THEME_VERSION", -1);
    }

    public final String at() {
        return this.f8278a.getString("mobi.mmdt.ott.model.pref.KEY_CURRENT_DEFAULT_FONT1", "NotoNaskhArabicUI-Regular.ttf");
    }

    public final boolean au() {
        return this.f8278a.getBoolean("mobi.mmdt.ott.model.pref.KEY_DEFAULT_SHOW_WIDE_BACKGROUND_AT_VIEW_HOLDER", false);
    }

    public final Set<String> av() {
        return this.f8278a.getStringSet("SEARCH_HISTORY", null);
    }

    public final String m6919b() {
        String language;
        SharedPreferences sharedPreferences = this.f8278a;
        String str = "mobi.mmdt.ott.model.pref.PrefKeys.KEY_SETTING_LANGUAGE";
        Locale locale = Locale.getDefault();
        if (locale != null) {
            language = locale.getLanguage();
            Object obj = -1;
            int hashCode = language.hashCode();
            if (hashCode != 3121) {
                if (hashCode == 3259) {
                    if (language.equals("fa")) {
                        obj = null;
                    }
                }
            } else if (language.equals("ar")) {
                obj = 1;
            }
            switch (obj) {
                case null:
                    language = "fa";
                    break;
                case 1:
                    language = "ar";
                    break;
                default:
                    break;
            }
        }
        language = "en-us";
        return sharedPreferences.getString(str, language);
    }

    public final void m6920b(int i) {
        this.f8278a.edit().putInt("mobi.mmdt.ott.model.pref.KEY_STATE_CONVERSATION_BACKGROUND", i).apply();
    }

    public final void m6921b(long j) {
        this.f8278a.edit().putLong("mobi.mmdt.ott.model.pref.KEY_LAST_CALL_REGISTER_TIME", j).apply();
    }

    public final void m6922b(String str) {
        this.f8278a.edit().putString("mobi.mmdt.ott.model.pref.PrefKeys.KEY_PROFILE_USER_NAME", str).apply();
    }

    public final void m6923b(boolean z) {
        this.f8278a.edit().putBoolean("mobi.mmdt.ott.model.pref.PrefKeys.KEY_IS_EXITED", z).apply();
    }

    public final String m6924c() {
        return this.f8278a.getString("mobi.mmdt.ott.model.pref.PrefKeys.KEY_USER_INVITE_ID", null);
    }

    public final void m6925c(int i) {
        this.f8278a.edit().putInt("mobi.mmdt.ott.model.pref.KEY_WEATHER_TEMP_UNIT_NEW", i).apply();
    }

    public final void m6926c(long j) {
        this.f8278a.edit().putLong("mobi.mmdt.ott.model.pref.KEY_LAST_FCM_CHAT_TRIGGER", j).apply();
    }

    public final void m6927c(boolean z) {
        this.f8278a.edit().putBoolean("mobi.mmdt.ott.model.pref.PrefKeys.KEY_IS_CHANGES_SYNCED", z).apply();
    }

    public final String m6928d() {
        return this.f8278a.getString("mobi.mmdt.ott.model.pref.PrefKeys.KEY_PROFILE_USER_NAME", C2537c.f8282a);
    }

    public final void m6929d(int i) {
        this.f8278a.edit().putInt("mobi.mmdt.ott.model.pref.KEY_WEATHER_WIND_SPEED_UNIT_NEW", i).apply();
    }

    public final void m6930d(long j) {
        this.f8278a.edit().putLong("mobi.mmdt.ott.model.pref.KEY_LAST_CLEAR_CACHE_TIME", j).apply();
    }

    public final void m6931d(String str) {
        this.f8278a.edit().putString("mobi.mmdt.ott.model.pref.KEY_PASS_CODE", str).apply();
    }

    public final void m6932d(boolean z) {
        this.f8278a.edit().putBoolean("mobi.mmdt.ott.model.pref.KEY_IS_AUTO_DOWNLOAD_WIFI_IMAGE", z).apply();
    }

    public final String m6933e() {
        return this.f8278a.getString("mobi.mmdt.ott.model.pref.PrefKeys.KEY_PROFILE_COUNTRY_CODE", C2537c.f8283b);
    }

    public final void m6934e(int i) {
        this.f8278a.edit().putInt("mobi.mmdt.ott.model.pref.KEY_WEATHER_DEFAULT_CITY_NEW", i).apply();
    }

    public final void m6935e(long j) {
        this.f8278a.edit().putLong("mobi.mmdt.ott.model.pref.KEY_LAST_CONVERSATION_LIST_UPDATE_TIME2", j).apply();
    }

    public final void m6936e(String str) {
        this.f8278a.edit().putString("mobi.mmdt.ott.model.pref.KEY_ENCRYPT_PASS_CODE", str).apply();
    }

    public final void m6937e(boolean z) {
        this.f8278a.edit().putBoolean("mobi.mmdt.ott.model.pref.KEY_IS_AUTO_DOWNLOAD_MOBILE_IMAGE", z).apply();
    }

    public final String m6938f() {
        return this.f8278a.getString("mobi.mmdt.ott.model.pref.PrefKeys.KEY_PROFILE_PHONE_NUMBER", C2537c.f8284c);
    }

    public final void m6939f(int i) {
        this.f8278a.edit().putInt("mobi.mmdt.ott.model.pref.KEY_LAST_UPDATE_ALARM_MODE", i).apply();
    }

    public final void m6940f(String str) {
        this.f8278a.edit().putString("mobi.mmdt.ott.model.pref.KEY_CONVERSATION_BACKGROUND_PATH", str).apply();
    }

    public final void m6941f(boolean z) {
        this.f8278a.edit().putBoolean("mobi.mmdt.ott.model.pref.KEY_IS_AUTO_DOWNLOAD_WIFI_VIDEO", z).apply();
    }

    public final String m6942g() {
        SharedPreferences sharedPreferences;
        String str;
        if (C2480b.f8158a) {
            sharedPreferences = this.f8278a;
            str = "mobi.mmdt.ott.model.pref.PrefKeys.KEY_DEBUG_HTTPS_FILES_WEBSERVICE_ADDRESS";
        } else {
            sharedPreferences = this.f8278a;
            str = "mobi.mmdt.ott.model.pref.PrefKeys.KEY_HTTPS_FILES_WEBSERVICE_ADDRESS";
        }
        return sharedPreferences.getString(str, "https://fs2.soroush-hamrah.ir/");
    }

    public final void m6943g(int i) {
        this.f8278a.edit().putInt("mobi.mmdt.ott.model.pref.KEY_REMAINED_RATING_REQUEST", i).apply();
    }

    public final void m6944g(String str) {
        this.f8278a.edit().putString("mobi.mmdt.ott.model.pref.PrefKeys.KEY_FCM_TOKEN", str).apply();
    }

    public final void m6945g(boolean z) {
        this.f8278a.edit().putBoolean("mobi.mmdt.ott.model.pref.KEY_IS_AUTO_DOWNLOAD_MOBILE_VIDEO", z).apply();
    }

    public final void m6946h(String str) {
        this.f8278a.edit().putString("mobi.mmdt.ott.model.pref.KEY_WEATHER_CITY_LIST_NEW", str).apply();
    }

    public final void m6947h(boolean z) {
        this.f8278a.edit().putBoolean("mobi.mmdt.ott.model.pref.KEY_IS_AUTO_DOWNLOAD_WIFI_FILE", z).apply();
    }

    public final boolean m6948h() {
        return MyApplication.m12952b().getPackageManager().getPackageInfo(MyApplication.m12952b().getPackageName(), 0).versionCode <= this.f8278a.getInt("mobi.mmdt.ott.model.pref.PrefKeys.KEY_OBSOLETE_VERSION", -1);
    }

    public final void m6949i(boolean z) {
        this.f8278a.edit().putBoolean("mobi.mmdt.ott.model.pref.KEY_IS_AUTO_DOWNLOAD_WIFI_GIF", z).apply();
    }

    public final boolean m6950i() {
        return this.f8278a.getBoolean("mobi.mmdt.ott.model.pref.PrefKeys.KEY_IS_EXITED", false);
    }

    public final void m6951j(boolean z) {
        this.f8278a.edit().putBoolean("mobi.mmdt.ott.model.pref.KEY_IS_AUTO_DOWNLOAD_MOBILE_FILE", z).apply();
    }

    public final boolean m6952j() {
        return (m6928d() == null || this.f8278a.getString("mobi.mmdt.ott.model.pref.PrefKeys.KEY_PROFILE_PIN_CODE", C2537c.f8285d) == null) ? false : true;
    }

    public final void m6953k(boolean z) {
        this.f8278a.edit().putBoolean("mobi.mmdt.ott.model.pref.KEY_IS_AUTO_DOWNLOAD_MOBILE_GIF", z).apply();
    }

    public final boolean m6954k() {
        return this.f8278a.getBoolean("mobi.mmdt.ott.model.pref.KEY_IS_AUTO_DOWNLOAD_WIFI_IMAGE", false);
    }

    public final void m6955l(boolean z) {
        this.f8278a.edit().putBoolean("mobi.mmdt.ott.model.pref.KEY_IS_DEFAULT_OPEN_INTERNAL_BROWSER", z).apply();
    }

    public final boolean m6956l() {
        return this.f8278a.getBoolean("mobi.mmdt.ott.model.pref.KEY_IS_AUTO_DOWNLOAD_MOBILE_IMAGE", false);
    }

    public final void m6957m(boolean z) {
        this.f8278a.edit().putBoolean("mobi.mmdt.ott.model.pref.KEY_IS_NIGHT_MODE_ENABLE", z).apply();
    }

    public final boolean m6958m() {
        return this.f8278a.getBoolean("mobi.mmdt.ott.model.pref.KEY_IS_AUTO_DOWNLOAD_WIFI_VIDEO", false);
    }

    public final void m6959n(boolean z) {
        this.f8278a.edit().putBoolean("mobi.mmdt.ott.model.pref.KEY_IS_LOCAL_PASS_CODE_ENABLE", z).apply();
    }

    public final boolean m6960n() {
        return this.f8278a.getBoolean("mobi.mmdt.ott.model.pref.KEY_IS_AUTO_DOWNLOAD_MOBILE_VIDEO", false);
    }

    public final void m6961o(boolean z) {
        this.f8278a.edit().putBoolean("mobi.mmdt.ott.model.pref.KEY_IS_PASS_CODE_SHOWED", z).apply();
    }

    public final boolean m6962o() {
        return this.f8278a.getBoolean("mobi.mmdt.ott.model.pref.KEY_IS_AUTO_DOWNLOAD_WIFI_FILE", false);
    }

    public final void m6963p(boolean z) {
        this.f8278a.edit().putBoolean("mobi.mmdt.ott.model.pref.KEY_IS_NOTIFICATION_MESSAGE_PREVIEW_ENABLE", z).apply();
    }

    public final boolean m6964p() {
        return this.f8278a.getBoolean("mobi.mmdt.ott.model.pref.KEY_IS_AUTO_DOWNLOAD_WIFI_GIF", false);
    }

    public final void m6965q(boolean z) {
        this.f8278a.edit().putBoolean("mobi.mmdt.ott.model.pref.KEY_IS_TIME_SYNCED_BY_NTP", z).apply();
    }

    public final boolean m6966q() {
        return this.f8278a.getBoolean("mobi.mmdt.ott.model.pref.KEY_IS_AUTO_DOWNLOAD_MOBILE_FILE", false);
    }

    public final void m6967r(boolean z) {
        this.f8278a.edit().putBoolean("mobi.mmdt.ott.model.pref.PrefKeys.KEY_IS_FCM_TOKEN_SENDED", z).apply();
    }

    public final boolean m6968r() {
        return this.f8278a.getBoolean("mobi.mmdt.ott.model.pref.KEY_IS_AUTO_DOWNLOAD_MOBILE_GIF", false);
    }

    public final void m6969s(boolean z) {
        this.f8278a.edit().putBoolean("mobi.mmdt.ott.model.pref.KEY_NEED_SALAM_WEBSERVICE", z).apply();
    }

    public final boolean m6970s() {
        return this.f8278a.getBoolean("mobi.mmdt.ott.model.pref.KEY_IS_DEFAULT_SAVE_TO_GALLERY", false);
    }

    public final void m6971t(boolean z) {
        this.f8278a.edit().putBoolean("mobi.mmdt.ott.model.pref.PrefKeys.KEY_IS_GOOGLE_PLAY_SERVICE_AVILABLE", z).apply();
    }

    public final boolean m6972t() {
        return this.f8278a.getBoolean("mobi.mmdt.ott.model.pref.KEY_IS_LOCAL_PASS_CODE_ENABLE", false);
    }

    public final void m6973u(boolean z) {
        this.f8278a.edit().putBoolean("mobi.mmdt.ott.model.pref.PrefKeys.KEY_IS_SHARE_LOCATION_ENABLE", z).apply();
    }

    public final boolean m6974u() {
        return this.f8278a.getBoolean("mobi.mmdt.ott.model.pref.KEY_IS_PASS_CODE_SHOWED", true);
    }

    public final String m6975v() {
        return this.f8278a.getString("mobi.mmdt.ott.model.pref.KEY_PASS_CODE", "");
    }

    public final void m6976v(boolean z) {
        this.f8278a.edit().putBoolean("mobi.mmdt.ott.model.pref.KEY_IS_RUN_BACKGROUND", z).apply();
    }

    public final String m6977w() {
        return this.f8278a.getString("mobi.mmdt.ott.model.pref.KEY_ENCRYPT_PASS_CODE", "");
    }

    public final void m6978w(boolean z) {
        this.f8278a.edit().putBoolean("mobi.mmdt.ott.model.pref.KEY_IS_PRAY_TIME_NOTIFICATION_ENABLE", z).apply();
    }

    public final int m6979x() {
        return this.f8278a.getInt("mobi.mmdt.ott.model.pref.KEY_AUTO_LOCK_IF_AWAY_ENUM", C2537c.f8288g);
    }

    public final boolean m6980y() {
        return this.f8278a.getBoolean("mobi.mmdt.ott.model.pref.KEY_IS_DEFAULT_OPEN_INTERNAL_BROWSER", true);
    }

    public final boolean m6981z() {
        return this.f8278a.getBoolean("mobi.mmdt.ott.model.pref.KEY_IS_AUTO_PALY_GIFS", true);
    }
}
