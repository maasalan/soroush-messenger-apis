package mobi.mmdt.ott.view.main.explorechannelslist.newdesign;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.lookup.base.LookUpGroupJoinLinkResponse;
import mobi.mmdt.ott.logic.C2808d;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p261a.p284f.p286b.C6706o;
import mobi.mmdt.ott.logic.p261a.p284f.p286b.C6707p;
import mobi.mmdt.ott.logic.p357j.C6812d;
import mobi.mmdt.ott.logic.p357j.p358a.C2831f;
import mobi.mmdt.ott.logic.p357j.p358a.C2832g;
import mobi.mmdt.ott.logic.p357j.p358a.C2833i;
import mobi.mmdt.ott.logic.p357j.p358a.C2834j;
import mobi.mmdt.ott.logic.p357j.p358a.C5988h;
import mobi.mmdt.ott.provider.p387i.C2989a;
import mobi.mmdt.ott.view.components.browser.C3112a;
import mobi.mmdt.ott.view.conversation.activities.p419a.p423b.C3337b;
import mobi.mmdt.ott.view.tools.C4478a;
import mobi.mmdt.ott.view.tools.C4504d;
import mobi.mmdt.ott.view.tools.C4513i;
import mobi.mmdt.ott.view.tools.C4514j;
import mobi.mmdt.ott.view.tools.p479c.C4501c;

public final class C4220b {

    static /* synthetic */ class C42178 {
        static final /* synthetic */ int[] f11981a = new int[C2989a.m7468a().length];

        static {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r0 = mobi.mmdt.ott.provider.p387i.C2989a.m7468a();
            r0 = r0.length;
            r0 = new int[r0];
            f11981a = r0;
            r0 = 1;
            r1 = f11981a;	 Catch:{ NoSuchFieldError -> 0x0011 }
            r2 = mobi.mmdt.ott.provider.p387i.C2989a.f9373c;	 Catch:{ NoSuchFieldError -> 0x0011 }
            r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x0011 }
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x0011 }
        L_0x0011:
            r1 = f11981a;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r2 = mobi.mmdt.ott.provider.p387i.C2989a.f9374d;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r3 = 2;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r1[r2] = r3;	 Catch:{ NoSuchFieldError -> 0x0019 }
        L_0x0019:
            r1 = f11981a;	 Catch:{ NoSuchFieldError -> 0x0021 }
            r2 = mobi.mmdt.ott.provider.p387i.C2989a.f9372b;	 Catch:{ NoSuchFieldError -> 0x0021 }
            r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x0021 }
            r3 = 3;	 Catch:{ NoSuchFieldError -> 0x0021 }
            r1[r2] = r3;	 Catch:{ NoSuchFieldError -> 0x0021 }
        L_0x0021:
            r1 = f11981a;	 Catch:{ NoSuchFieldError -> 0x0029 }
            r2 = mobi.mmdt.ott.provider.p387i.C2989a.f9371a;	 Catch:{ NoSuchFieldError -> 0x0029 }
            r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x0029 }
            r3 = 4;	 Catch:{ NoSuchFieldError -> 0x0029 }
            r1[r2] = r3;	 Catch:{ NoSuchFieldError -> 0x0029 }
        L_0x0029:
            r1 = f11981a;	 Catch:{ NoSuchFieldError -> 0x0031 }
            r2 = mobi.mmdt.ott.provider.p387i.C2989a.f9375e;	 Catch:{ NoSuchFieldError -> 0x0031 }
            r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x0031 }
            r0 = 5;	 Catch:{ NoSuchFieldError -> 0x0031 }
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x0031 }
        L_0x0031:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.main.explorechannelslist.newdesign.b.8.<clinit>():void");
        }
    }

    public static void m8045a(final Activity activity, int i, String str, String str2, String str3, boolean z) {
        final C5891a c6812d;
        switch (C42178.f11981a[i - 1]) {
            case 1:
                if (C4504d.m8201b(str)) {
                    C4504d.m8200b(activity, str);
                    return;
                }
                c6812d = new C6812d(str);
                activity.runOnUiThread(new Runnable() {
                    public final void run() {
                        C4501c.m8189a().m8192a(activity, c6812d);
                        C2808d.m7147a(c6812d);
                    }
                });
                return;
            case 2:
                i = Integer.parseInt(str);
                Intent intent = new Intent(activity, ExploreCategoryAndChannelActivity.class);
                intent.putExtra("KEY_CATEGORY_ID", i);
                intent.putExtra("KEY_CATEGORY_NAME_ID", str2);
                if (str3 != null) {
                    intent.putExtra("KEY_CATEGORY_IMAGE", str3);
                }
                activity.startActivity(intent);
                C4478a.m8165c(activity, true);
                return;
            case 3:
                i = Integer.parseInt(str);
                Fragment c6930a = new C6930a();
                Bundle bundle = new Bundle();
                bundle.putInt("LANDING_PAGE_NUMBER", i);
                c6930a.setArguments(bundle);
                C4514j.m8229a(activity, c6930a, "EXPLORE_CHANNEL_FRAGMENT_TAG", R.id.frameLayoutContainer, true);
                return;
            case 4:
                if (str != null) {
                    Uri parse = Uri.parse(str);
                    if (C3112a.m7568a(parse) && parse.getPathSegments().size() == 0) {
                        C3112a.m7567a(activity, str);
                        return;
                    }
                    C3112a.m7566a(activity, parse);
                }
                return;
            case 5:
                c6812d = z ? new C6707p(str) : new C6706o(str);
                activity.runOnUiThread(new Runnable() {
                    public final void run() {
                        C4501c.m8189a().m8192a(activity, c6812d);
                        C2808d.m7148b(c6812d);
                    }
                });
                return;
            default:
                return;
        }
    }

    public static void m8046a(final Activity activity, C2831f c2831f) {
        final String str = c2831f.f8912a;
        if (activity != null) {
            activity.runOnUiThread(new Runnable() {
                public final void run() {
                    C4501c.m8189a().m8193b();
                    if (str != null && !str.isEmpty()) {
                        C4478a.m8159b(activity, str, null, null);
                    }
                }
            });
        }
    }

    public static void m8047a(final Activity activity, final C2832g c2832g) {
        if (activity != null) {
            final String str = c2832g.f8913a;
            activity.runOnUiThread(new Runnable() {
                public final void run() {
                    C4501c.m8189a().m8193b();
                    if (!(str == null || str.isEmpty())) {
                        if (c2832g.f8914b) {
                            C4478a.m8146a(activity, str, null, null, true);
                            return;
                        }
                        C4478a.m8144a(activity, str, null, null);
                    }
                }
            });
        }
    }

    public static void m8048a(final Activity activity, final C5988h c5988h) {
        if (activity != null) {
            activity.runOnUiThread(new Runnable() {
                public final void run() {
                    C4513i.m8228a(activity, c5988h.f8890a);
                    C4501c.m8189a().m8193b();
                }
            });
        }
    }

    public static void m8049a(final Activity activity, final C2833i c2833i) {
        if (activity != null) {
            final LookUpGroupJoinLinkResponse lookUpGroupJoinLinkResponse = c2833i.f8915a;
            activity.runOnUiThread(new Runnable() {
                public final void run() {
                    C4501c.m8189a().m8193b();
                    if (!c2833i.f8916b || lookUpGroupJoinLinkResponse.getmJID() == null || lookUpGroupJoinLinkResponse.getmJID().isEmpty()) {
                        C3337b.m7804a(activity, lookUpGroupJoinLinkResponse);
                    } else {
                        C4478a.m8160b(activity, lookUpGroupJoinLinkResponse.getmJID(), false, null, "");
                    }
                }
            });
        }
    }

    public static void m8050a(final Activity activity, C2834j c2834j) {
        if (activity != null) {
            final String str = c2834j.f8917a;
            activity.runOnUiThread(new Runnable() {
                public final void run() {
                    C4501c.m8189a().m8193b();
                    if (str != null && !str.isEmpty()) {
                        C4478a.m8149a(activity, str, true);
                    }
                }
            });
        }
    }
}
