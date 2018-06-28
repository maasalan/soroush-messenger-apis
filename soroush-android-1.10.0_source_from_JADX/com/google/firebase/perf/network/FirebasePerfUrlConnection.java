package com.google.firebase.perf.network;

import android.support.annotation.Keep;
import com.google.android.gms.internal.ms;
import com.google.android.gms.internal.mv;
import com.google.android.gms.internal.nk;
import com.google.android.gms.internal.zzevc;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;

public class FirebasePerfUrlConnection {
    private FirebasePerfUrlConnection() {
    }

    private static InputStream m5747a(nk nkVar, mv mvVar, zzevc com_google_android_gms_internal_zzevc) {
        com_google_android_gms_internal_zzevc.m5169a();
        long j = com_google_android_gms_internal_zzevc.f6304a;
        ms a = ms.m16709a(mvVar);
        try {
            URLConnection openConnection = nkVar.f6227a.openConnection();
            return openConnection instanceof HttpsURLConnection ? new C2105d((HttpsURLConnection) openConnection, com_google_android_gms_internal_zzevc, a).getInputStream() : openConnection instanceof HttpURLConnection ? new C2104c((HttpURLConnection) openConnection, com_google_android_gms_internal_zzevc, a).getInputStream() : openConnection.getInputStream();
        } catch (IOException e) {
            a.m16716c(j);
            a.m16719e(com_google_android_gms_internal_zzevc.m5170b());
            a.m16712a(nkVar.toString());
            C2108h.m5793a(a);
            throw e;
        }
    }

    private static Object m5748a(nk nkVar, Class[] clsArr, mv mvVar, zzevc com_google_android_gms_internal_zzevc) {
        com_google_android_gms_internal_zzevc.m5169a();
        long j = com_google_android_gms_internal_zzevc.f6304a;
        ms a = ms.m16709a(mvVar);
        try {
            URLConnection openConnection = nkVar.f6227a.openConnection();
            return openConnection instanceof HttpsURLConnection ? new C2105d((HttpsURLConnection) openConnection, com_google_android_gms_internal_zzevc, a).getContent(clsArr) : openConnection instanceof HttpURLConnection ? new C2104c((HttpURLConnection) openConnection, com_google_android_gms_internal_zzevc, a).getContent(clsArr) : openConnection.getContent(clsArr);
        } catch (IOException e) {
            a.m16716c(j);
            a.m16719e(com_google_android_gms_internal_zzevc.m5170b());
            a.m16712a(nkVar.toString());
            C2108h.m5793a(a);
            throw e;
        }
    }

    private static Object m5749b(nk nkVar, mv mvVar, zzevc com_google_android_gms_internal_zzevc) {
        com_google_android_gms_internal_zzevc.m5169a();
        long j = com_google_android_gms_internal_zzevc.f6304a;
        ms a = ms.m16709a(mvVar);
        try {
            URLConnection openConnection = nkVar.f6227a.openConnection();
            return openConnection instanceof HttpsURLConnection ? new C2105d((HttpsURLConnection) openConnection, com_google_android_gms_internal_zzevc, a).getContent() : openConnection instanceof HttpURLConnection ? new C2104c((HttpURLConnection) openConnection, com_google_android_gms_internal_zzevc, a).getContent() : openConnection.getContent();
        } catch (IOException e) {
            a.m16716c(j);
            a.m16719e(com_google_android_gms_internal_zzevc.m5170b());
            a.m16712a(nkVar.toString());
            C2108h.m5793a(a);
            throw e;
        }
    }

    @Keep
    public static Object getContent(URL url) {
        return m5749b(new nk(url), mv.m5020a(), new zzevc());
    }

    @Keep
    public static Object getContent(URL url, Class[] clsArr) {
        return m5748a(new nk(url), clsArr, mv.m5020a(), new zzevc());
    }

    @Keep
    public static Object instrument(Object obj) {
        return obj instanceof HttpsURLConnection ? new C2105d((HttpsURLConnection) obj, new zzevc(), ms.m16709a(mv.m5020a())) : obj instanceof HttpURLConnection ? new C2104c((HttpURLConnection) obj, new zzevc(), ms.m16709a(mv.m5020a())) : obj;
    }

    @Keep
    public static InputStream openStream(URL url) {
        return m5747a(new nk(url), mv.m5020a(), new zzevc());
    }
}
