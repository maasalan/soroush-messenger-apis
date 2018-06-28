package com.google.android.gms.analytics;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.analytics.C6567d.C1663a;
import com.google.android.gms.analytics.C6567d.C1664b;
import com.google.android.gms.common.internal.ac;
import com.google.android.gms.internal.C1827x;
import com.google.android.gms.internal.C5506v;
import com.google.android.gms.internal.bn;
import com.google.android.gms.internal.cd;
import com.google.android.gms.internal.ce;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;

public final class C6569h extends C5506v {
    public boolean f17944a;
    final Map<String, String> f17945b = new HashMap();
    final bn f17946c;
    final C6568a f17947d;
    cd f17948e;
    private final Map<String, String> f17949g = new HashMap();
    private C1662c f17950h;

    class C6568a extends C5506v implements C1663a {
        boolean f17938a;
        long f17939b = -1;
        private int f17940c;
        private boolean f17941d;
        private long f17942e;
        private /* synthetic */ C6569h f17943g;

        protected C6568a(C6569h c6569h, C1827x c1827x) {
            this.f17943g = c6569h;
            super(c1827x);
        }

        public final void mo3002a() {
            this.f17940c--;
            this.f17940c = Math.max(0, this.f17940c);
            if (this.f17940c == 0) {
                this.f17942e = this.f6279f.f6285c.mo1576b();
            }
        }

        public final void mo3003a(Activity activity) {
            if (this.f17940c == 0) {
                if (this.f6279f.f6285c.mo1576b() >= this.f17942e + Math.max(1000, this.f17939b)) {
                    this.f17941d = true;
                }
            }
            this.f17940c++;
            if (this.f17938a) {
                C6569h c6569h;
                String str;
                String canonicalName;
                Intent intent = activity.getIntent();
                if (intent != null) {
                    c6569h = this.f17943g;
                    Uri data = intent.getData();
                    if (data != null) {
                        if (!data.isOpaque()) {
                            CharSequence queryParameter = data.getQueryParameter("referrer");
                            if (!TextUtils.isEmpty(queryParameter)) {
                                str = "http://hostname/?";
                                String valueOf = String.valueOf(queryParameter);
                                data = Uri.parse(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                                str = data.getQueryParameter("utm_id");
                                if (str != null) {
                                    c6569h.f17945b.put("&ci", str);
                                }
                                str = data.getQueryParameter("anid");
                                if (str != null) {
                                    c6569h.f17945b.put("&anid", str);
                                }
                                str = data.getQueryParameter("utm_campaign");
                                if (str != null) {
                                    c6569h.f17945b.put("&cn", str);
                                }
                                str = data.getQueryParameter("utm_content");
                                if (str != null) {
                                    c6569h.f17945b.put("&cc", str);
                                }
                                str = data.getQueryParameter("utm_medium");
                                if (str != null) {
                                    c6569h.f17945b.put("&cm", str);
                                }
                                str = data.getQueryParameter("utm_source");
                                if (str != null) {
                                    c6569h.f17945b.put("&cs", str);
                                }
                                str = data.getQueryParameter("utm_term");
                                if (str != null) {
                                    c6569h.f17945b.put("&ck", str);
                                }
                                str = data.getQueryParameter("dclid");
                                if (str != null) {
                                    c6569h.f17945b.put("&dclid", str);
                                }
                                str = data.getQueryParameter("gclid");
                                if (str != null) {
                                    c6569h.f17945b.put("&gclid", str);
                                }
                                valueOf = data.getQueryParameter("aclid");
                                if (valueOf != null) {
                                    c6569h.f17945b.put("&aclid", valueOf);
                                }
                            }
                        }
                    }
                }
                Map hashMap = new HashMap();
                hashMap.put("&t", "screenview");
                c6569h = this.f17943g;
                str = "&cd";
                if (this.f17943g.f17948e != null) {
                    cd cdVar = this.f17943g.f17948e;
                    canonicalName = activity.getClass().getCanonicalName();
                    String str2 = (String) cdVar.f15212g.get(canonicalName);
                    if (str2 != null) {
                        canonicalName = str2;
                    }
                } else {
                    canonicalName = activity.getClass().getCanonicalName();
                }
                c6569h.m15860a(str, canonicalName);
                if (TextUtils.isEmpty((CharSequence) hashMap.get("&dr"))) {
                    ac.m4376a((Object) activity);
                    Intent intent2 = activity.getIntent();
                    CharSequence charSequence = null;
                    if (intent2 != null) {
                        CharSequence stringExtra = intent2.getStringExtra("android.intent.extra.REFERRER_NAME");
                        if (!TextUtils.isEmpty(stringExtra)) {
                            charSequence = stringExtra;
                        }
                    }
                    if (!TextUtils.isEmpty(charSequence)) {
                        hashMap.put("&dr", charSequence);
                    }
                }
                this.f17943g.m15861a(hashMap);
            }
        }

        public final synchronized boolean m15855b() {
            boolean z;
            z = this.f17941d;
            this.f17941d = false;
            return z;
        }

        final void m15856c() {
            if (this.f17939b < 0) {
                if (!this.f17938a) {
                    C6567d d = this.f6279f.m5163d();
                    d.f17934b.remove(this.f17943g.f17947d);
                    return;
                }
            }
            C5436i d2 = this.f6279f.m5163d();
            d2.f17934b.add(this.f17943g.f17947d);
            Context context = d2.f15089f.f6283a;
            if (context instanceof Application) {
                Application application = (Application) context;
                if (!d2.f17935c) {
                    application.registerActivityLifecycleCallbacks(new C1664b(d2));
                    d2.f17935c = true;
                }
            }
        }

        protected final void c_() {
        }
    }

    C6569h(C1827x c1827x) {
        super(c1827x);
        this.f17949g.put("useSecure", "1");
        this.f17949g.put("&a", Integer.toString(new Random().nextInt(ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED) + 1));
        this.f17946c = new bn("tracking", this.f6279f.f6285c, (byte) 0);
        this.f17947d = new C6568a(this, c1827x);
    }

    private static String m15857a(Entry<String, String> entry) {
        int i;
        String str = (String) entry.getKey();
        if (str.startsWith("&")) {
            if (str.length() >= 2) {
                i = 1;
                return i != 0 ? null : ((String) entry.getKey()).substring(1);
            }
        }
        i = 0;
        if (i != 0) {
        }
    }

    private static void m15858a(Map<String, String> map, Map<String, String> map2) {
        ac.m4376a((Object) map2);
        if (map != null) {
            for (Entry entry : map.entrySet()) {
                String a = C6569h.m15857a(entry);
                if (a != null) {
                    map2.put(a, (String) entry.getValue());
                }
            }
        }
    }

    private static void m15859b(Map<String, String> map, Map<String, String> map2) {
        ac.m4376a((Object) map2);
        if (map != null) {
            for (Entry entry : map.entrySet()) {
                String a = C6569h.m15857a(entry);
                if (!(a == null || map2.containsKey(a))) {
                    map2.put(a, (String) entry.getValue());
                }
            }
        }
    }

    public final void m15860a(String str, String str2) {
        ac.m4377a((Object) str, (Object) "Key should be non-null");
        if (!TextUtils.isEmpty(str)) {
            this.f17949g.put(str, str2);
        }
    }

    public final void m15861a(Map<String, String> map) {
        long a = this.f6279f.f6285c.mo1575a();
        if (this.f6279f.m5163d().f17937e) {
            m5147c("AppOptOut is set to true. Not sending Google Analytics hit");
            return;
        }
        boolean z = this.f6279f.m5163d().f17936d;
        Map hashMap = new HashMap();
        C6569h.m15858a(this.f17949g, hashMap);
        C6569h.m15858a((Map) map, hashMap);
        boolean c = ce.m4655c((String) this.f17949g.get("useSecure"));
        C6569h.m15859b(this.f17945b, hashMap);
        this.f17945b.clear();
        String str = (String) hashMap.get("t");
        if (TextUtils.isEmpty(str)) {
            this.f6279f.m5160a().m15993a(hashMap, "Missing hit type parameter");
            return;
        }
        String str2 = (String) hashMap.get("tid");
        if (TextUtils.isEmpty(str2)) {
            this.f6279f.m5160a().m15993a(hashMap, "Missing tracking id parameter");
            return;
        }
        boolean z2 = this.f17944a;
        synchronized (this) {
            if ("screenview".equalsIgnoreCase(str) || "pageview".equalsIgnoreCase(str) || "appview".equalsIgnoreCase(str) || TextUtils.isEmpty(str)) {
                int parseInt = Integer.parseInt((String) this.f17949g.get("&a")) + 1;
                if (parseInt >= ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED) {
                    parseInt = 1;
                }
                this.f17949g.put("&a", Integer.toString(parseInt));
            }
        }
        this.f6279f.m5161b().m4278a(new C1681v(this, hashMap, z2, str, a, z, c, str2));
    }

    public final void m15862a(boolean z) {
        synchronized (this) {
            if ((this.f17950h != null) == z) {
                return;
            }
            String str;
            if (z) {
                this.f17950h = new C1662c(this, Thread.getDefaultUncaughtExceptionHandler(), this.f6279f.f6283a);
                Thread.setDefaultUncaughtExceptionHandler(this.f17950h);
                str = "Uncaught exceptions will be reported to Google Analytics";
            } else {
                Thread.setDefaultUncaughtExceptionHandler(this.f17950h.f5135a);
                str = "Uncaught exceptions will not be reported to Google Analytics";
            }
            m5143b(str);
        }
    }

    public final void m15863b(boolean z) {
        C6568a c6568a = this.f17947d;
        c6568a.f17938a = z;
        c6568a.m15856c();
    }

    protected final void c_() {
        this.f17947d.m12038l();
        String c = this.f6279f.m5164e().m16015c();
        if (c != null) {
            m15860a("&an", c);
        }
        c = this.f6279f.m5164e().m16014b();
        if (c != null) {
            m15860a("&av", c);
        }
    }
}
