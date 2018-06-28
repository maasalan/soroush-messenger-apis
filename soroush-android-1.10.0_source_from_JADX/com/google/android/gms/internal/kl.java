package com.google.android.gms.internal;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class kl {
    private static final ConcurrentHashMap<Uri, kl> f6073b = new ConcurrentHashMap();
    private static String[] f6074g = new String[]{"key", "value"};
    final ContentResolver f6075a;
    private final Uri f6076c;
    private final ContentObserver f6077d;
    private final Object f6078e = new Object();
    private volatile Map<String, String> f6079f;

    private kl(ContentResolver contentResolver, Uri uri) {
        this.f6075a = contentResolver;
        this.f6076c = uri;
        this.f6077d = new kn(this);
    }

    public static kl m4958a(ContentResolver contentResolver, Uri uri) {
        kl klVar = (kl) f6073b.get(uri);
        if (klVar == null) {
            klVar = new kl(contentResolver, uri);
            kl klVar2 = (kl) f6073b.putIfAbsent(uri, klVar);
            if (klVar2 == null) {
                klVar.f6075a.registerContentObserver(klVar.f6076c, false, klVar.f6077d);
                return klVar;
            }
            klVar = klVar2;
        }
        return klVar;
    }

    private final Map<String, String> m4960b() {
        Map<String, String> hashMap = new HashMap();
        Cursor query = this.f6075a.query(this.f6076c, f6074g, null, null, null);
        if (query == null) {
            return hashMap;
        }
        while (query.moveToNext()) {
            try {
                hashMap.put(query.getString(0), query.getString(1));
            } finally {
                query.close();
            }
        }
        return hashMap;
    }

    public final Map<String, String> m4962a() {
        Map<String, String> b = ((Boolean) ky.m4966a(new km(this))).booleanValue() ? m4960b() : this.f6079f;
        if (b != null) {
            return b;
        }
        synchronized (this.f6078e) {
            b = this.f6079f;
            if (b == null) {
                b = m4960b();
                this.f6079f = b;
            }
        }
        return b;
    }
}
