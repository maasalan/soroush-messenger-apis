package com.google.firebase.perf.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.Keep;
import com.google.android.gms.common.internal.ac;
import com.google.android.gms.internal.mt;
import com.google.android.gms.internal.ng;
import com.google.android.gms.internal.zzevc;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.google.firebase.perf.metrics.AppStartTrace.C2097a;

@Keep
public class FirebasePerfProvider extends ContentProvider {
    private static final zzevc zznzr = new zzevc();
    private final Handler mHandler = new Handler(Looper.getMainLooper());

    static {
        ng ngVar = new ng();
    }

    public static zzevc zzciu() {
        return zznzr;
    }

    public void attachInfo(Context context, ProviderInfo providerInfo) {
        ac.m4377a((Object) providerInfo, (Object) "FirebasePerfProvider ProviderInfo cannot be null.");
        if ("com.google.firebase.firebaseperfprovider".equals(providerInfo.authority)) {
            throw new IllegalStateException("Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle.");
        }
        super.attachInfo(context, providerInfo);
        mt.m5013a().m5018a(getContext());
        AppStartTrace a = AppStartTrace.m5732a();
        a.m5736a(getContext());
        this.mHandler.post(new C2097a(a));
    }

    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public String getType(Uri uri) {
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public boolean onCreate() {
        return false;
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
