package mobi.mmdt.ott.view.components.browser;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.C7249g;
import android.support.v4.app.Fragment;
import android.support.v4.p029a.C0346c;
import android.util.Log;
import com.p072b.p073a.p074a.C1063i;
import java.lang.ref.WeakReference;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.C2808d;
import mobi.mmdt.ott.logic.p349f.C2814a;
import mobi.mmdt.ott.logic.p355i.p356a.C2827a;
import mobi.mmdt.ott.logic.p357j.C6812d;
import mobi.mmdt.ott.logic.p366o.p367a.C2878a;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.view.components.browser.C3116d.C3115a;
import mobi.mmdt.ott.view.streamplayer.C7564a;
import mobi.mmdt.ott.view.tools.C4504d;
import mobi.mmdt.ott.view.tools.C4522p;
import mobi.mmdt.ott.view.tools.p479c.C4501c;

public final class C3112a {
    public static String f9688a = "KEY_External_BROWSER";
    private static WeakReference<C3117e> f9689b;
    private static C3117e f9690c;
    private static C3114c f9691d;

    private static class C6069a extends C3113b {
        private C6069a() {
        }
    }

    public static void m7566a(Activity activity, Uri uri) {
        if (activity != null && uri != null) {
            boolean z;
            String host;
            if (uri != null) {
                try {
                    if (uri.toString().equalsIgnoreCase("https://cafebazaar.ir/app/mobi.mmdt.ott/?l=fa/rating") && C2878a.m7234b()) {
                        z = true;
                        if (z) {
                            C2827a.m7165a(C2814a.LINK);
                            C2878a.m7232a();
                        }
                        z = C3112a.m7568a(uri);
                        host = uri.getHost();
                        if (z || !host.equalsIgnoreCase("sapp.ir")) {
                            if (!z && host.equalsIgnoreCase("stream.sapp.ir")) {
                                Bundle bundle = new Bundle();
                                bundle.putString("KEY_STREAM_URL", uri.toString());
                                Fragment c7564a = new C7564a();
                                c7564a.mo3059e(bundle);
                                c7564a.mo3404a(((C7249g) activity).m19188c(), c7564a.f13180H);
                                return;
                            } else if (VERSION.SDK_INT >= 15 || !C2535a.m6888a().m6980y()) {
                                C3112a.m7569b(activity, uri);
                            } else {
                                Intent intent = new Intent(activity, ShareBroadcastReceiver.class);
                                intent.setAction("android.intent.action.SEND");
                                if (f9691d == null) {
                                    f9690c = null;
                                } else if (f9690c == null) {
                                    C3117e a = f9691d.m7570a(new C6069a());
                                    f9690c = a;
                                    f9689b = new WeakReference(a);
                                }
                                C3115a c3115a = new C3115a(f9690c);
                                c3115a.f9694a.putExtra("android.support.customtabs.extra.TOOLBAR_COLOR", C0346c.m687c(activity, R.color.colorBrowser));
                                Parcelable decodeResource = BitmapFactory.decodeResource(activity.getResources(), R.drawable.ic_share_dark_24);
                                String a2 = C4522p.m8236a(R.string.share);
                                Parcelable broadcast = PendingIntent.getBroadcast(activity, 0, intent, 0);
                                Bundle bundle2 = new Bundle();
                                bundle2.putInt("android.support.customtabs.customaction.ID", 0);
                                bundle2.putParcelable("android.support.customtabs.customaction.ICON", decodeResource);
                                bundle2.putString("android.support.customtabs.customaction.DESCRIPTION", a2);
                                bundle2.putParcelable("android.support.customtabs.customaction.PENDING_INTENT", broadcast);
                                c3115a.f9694a.putExtra("android.support.customtabs.extra.ACTION_BUTTON_BUNDLE", bundle2);
                                c3115a.f9694a.putExtra("android.support.customtabs.extra.TINT_ACTION_BUTTON", true);
                                c3115a.f9694a.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", 1);
                                if (c3115a.f9695b != null) {
                                    c3115a.f9694a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", c3115a.f9695b);
                                }
                                if (c3115a.f9697d != null) {
                                    c3115a.f9694a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", c3115a.f9697d);
                                }
                                C3116d c3116d = new C3116d(c3115a.f9694a, c3115a.f9696c);
                                c3116d.f9698a.setData(uri);
                                C0346c.m683a(activity, c3116d.f9698a, c3116d.f9699b);
                                activity.overridePendingTransition(R.anim.anim_slide_in_left, R.anim.anim_slide_out_left);
                                return;
                            }
                        } else if (C4504d.m8199a(uri.toString())) {
                            C4504d.m8198a(activity, uri.toString());
                            return;
                        } else {
                            C1063i c6812d = new C6812d(uri.toString());
                            C2808d.m7147a(c6812d);
                            C4501c.m8189a().m8192a(activity, c6812d);
                            return;
                        }
                    }
                } catch (Exception e) {
                    Log.e("error message", String.valueOf(e));
                    return;
                }
            }
            z = false;
            if (z) {
                C2827a.m7165a(C2814a.LINK);
                C2878a.m7232a();
            }
            z = C3112a.m7568a(uri);
            host = uri.getHost();
            if (z) {
            }
            if (!z) {
            }
            if (VERSION.SDK_INT >= 15) {
            }
            C3112a.m7569b(activity, uri);
        }
    }

    public static void m7567a(Activity activity, String str) {
        try {
            StringBuilder stringBuilder = new StringBuilder("googlechrome://navigate?url=");
            stringBuilder.append(str);
            Uri parse = Uri.parse(stringBuilder.toString());
            Log.e("***", parse.toString());
            Intent intent = new Intent("android.intent.action.VIEW", parse);
            intent.addFlags(268435456);
            intent.setPackage("com.android.chrome");
            activity.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            C2480b.m6742f(e.getMessage());
        }
    }

    public static boolean m7568a(Uri uri) {
        String host = uri.getHost();
        Object toLowerCase = host != null ? host.toLowerCase() : "";
        if (!"sapp.ir".equals(toLowerCase)) {
            if (!"stream.sapp.ir".equals(toLowerCase)) {
                return false;
            }
        }
        return true;
    }

    public static void m7569b(Activity activity, Uri uri) {
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        intent.putExtra(f9688a, true);
        activity.startActivity(intent);
    }
}
