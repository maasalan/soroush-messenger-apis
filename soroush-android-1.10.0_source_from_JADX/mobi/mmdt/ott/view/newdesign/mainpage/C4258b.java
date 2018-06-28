package mobi.mmdt.ott.view.newdesign.mainpage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.C4767a;
import android.widget.Toast;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.C2808d;
import mobi.mmdt.ott.logic.p261a.aa.C6645d;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.view.components.p402d.C3130a;
import mobi.mmdt.ott.view.tools.C4478a;
import mobi.mmdt.ott.view.tools.C4522p;
import p000a.p001a.p002a.C0005c;

public final class C4258b {
    public static void m8065a() {
        C2808d.m7147a(new C6645d());
    }

    public static void m8066a(Activity activity) {
        C0005c.m0a().m9d(new C3130a());
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        intent.setFlags(268435456);
        activity.startActivity(intent);
        C4767a.m8920a(activity);
    }

    public static void m8067a(Activity activity, Intent intent, Bundle bundle) {
        boolean containsKey = bundle.containsKey("KEY_START_SINGLE_PARTY");
        boolean containsKey2 = bundle.containsKey("KEY_START_GROUP_PARTY");
        boolean containsKey3 = bundle.containsKey("KEY_START_CHANNEL_PARTY");
        boolean containsKey4 = bundle.containsKey("KEY_SHOW_TOAST_FOR_CHANNEL_NOT_EXIST");
        if (!(containsKey || containsKey2 || containsKey3)) {
            if (!containsKey4) {
                containsKey = false;
                containsKey2 = C2535a.m6888a().m6975v() == null && !C2535a.m6888a().m6975v().isEmpty();
                if (!C2535a.m6888a().m6974u()) {
                    if (MyApplication.m12950a().f15902Q) {
                        containsKey3 = false;
                        containsKey2 = C2535a.m6888a().m6972t() && containsKey2 && containsKey3;
                        if (!containsKey && containsKey2) {
                            activity.finish();
                            C2535a.m6888a().m6961o(true);
                            C4478a.m8141a(activity, intent);
                            return;
                        } else if (!bundle.containsKey("KEY_START_SINGLE_PARTY")) {
                            C4478a.m8150a(activity, intent.getStringExtra("KEY_START_SINGLE_PARTY"), false, null, "");
                            intent.removeExtra("KEY_START_SINGLE_PARTY");
                        } else if (!bundle.containsKey("KEY_START_GROUP_PARTY")) {
                            C4478a.m8160b(activity, intent.getStringExtra("KEY_START_GROUP_PARTY"), false, null, "");
                            intent.removeExtra("KEY_START_GROUP_PARTY");
                        } else if (bundle.containsKey("KEY_START_CHANNEL_PARTY")) {
                            if (bundle.containsKey("KEY_SHOW_TOAST_FOR_CHANNEL_NOT_EXIST")) {
                                Toast.makeText(activity, C4522p.m8236a(R.string.there_is_no_channel_with_this_username), 0).show();
                                intent.removeExtra("KEY_SHOW_TOAST_FOR_CHANNEL_NOT_EXIST");
                            }
                        } else {
                            C4478a.m8144a(activity, intent.getStringExtra("KEY_START_CHANNEL_PARTY"), null, "");
                            intent.removeExtra("KEY_START_CHANNEL_PARTY");
                        }
                    }
                }
                containsKey3 = true;
                if (!C2535a.m6888a().m6972t()) {
                }
                if (!containsKey) {
                }
                if (!bundle.containsKey("KEY_START_SINGLE_PARTY")) {
                    C4478a.m8150a(activity, intent.getStringExtra("KEY_START_SINGLE_PARTY"), false, null, "");
                    intent.removeExtra("KEY_START_SINGLE_PARTY");
                } else if (!bundle.containsKey("KEY_START_GROUP_PARTY")) {
                    C4478a.m8160b(activity, intent.getStringExtra("KEY_START_GROUP_PARTY"), false, null, "");
                    intent.removeExtra("KEY_START_GROUP_PARTY");
                } else if (bundle.containsKey("KEY_START_CHANNEL_PARTY")) {
                    if (bundle.containsKey("KEY_SHOW_TOAST_FOR_CHANNEL_NOT_EXIST")) {
                        Toast.makeText(activity, C4522p.m8236a(R.string.there_is_no_channel_with_this_username), 0).show();
                        intent.removeExtra("KEY_SHOW_TOAST_FOR_CHANNEL_NOT_EXIST");
                    }
                } else {
                    C4478a.m8144a(activity, intent.getStringExtra("KEY_START_CHANNEL_PARTY"), null, "");
                    intent.removeExtra("KEY_START_CHANNEL_PARTY");
                }
            }
        }
        containsKey = true;
        if (C2535a.m6888a().m6975v() == null) {
        }
        if (C2535a.m6888a().m6974u()) {
            if (MyApplication.m12950a().f15902Q) {
                containsKey3 = false;
                if (C2535a.m6888a().m6972t()) {
                }
                if (!containsKey) {
                }
                if (!bundle.containsKey("KEY_START_SINGLE_PARTY")) {
                    C4478a.m8150a(activity, intent.getStringExtra("KEY_START_SINGLE_PARTY"), false, null, "");
                    intent.removeExtra("KEY_START_SINGLE_PARTY");
                } else if (!bundle.containsKey("KEY_START_GROUP_PARTY")) {
                    C4478a.m8160b(activity, intent.getStringExtra("KEY_START_GROUP_PARTY"), false, null, "");
                    intent.removeExtra("KEY_START_GROUP_PARTY");
                } else if (bundle.containsKey("KEY_START_CHANNEL_PARTY")) {
                    C4478a.m8144a(activity, intent.getStringExtra("KEY_START_CHANNEL_PARTY"), null, "");
                    intent.removeExtra("KEY_START_CHANNEL_PARTY");
                } else {
                    if (bundle.containsKey("KEY_SHOW_TOAST_FOR_CHANNEL_NOT_EXIST")) {
                        Toast.makeText(activity, C4522p.m8236a(R.string.there_is_no_channel_with_this_username), 0).show();
                        intent.removeExtra("KEY_SHOW_TOAST_FOR_CHANNEL_NOT_EXIST");
                    }
                }
            }
        }
        containsKey3 = true;
        if (C2535a.m6888a().m6972t()) {
        }
        if (!containsKey) {
        }
        if (!bundle.containsKey("KEY_START_SINGLE_PARTY")) {
            C4478a.m8150a(activity, intent.getStringExtra("KEY_START_SINGLE_PARTY"), false, null, "");
            intent.removeExtra("KEY_START_SINGLE_PARTY");
        } else if (!bundle.containsKey("KEY_START_GROUP_PARTY")) {
            C4478a.m8160b(activity, intent.getStringExtra("KEY_START_GROUP_PARTY"), false, null, "");
            intent.removeExtra("KEY_START_GROUP_PARTY");
        } else if (bundle.containsKey("KEY_START_CHANNEL_PARTY")) {
            if (bundle.containsKey("KEY_SHOW_TOAST_FOR_CHANNEL_NOT_EXIST")) {
                Toast.makeText(activity, C4522p.m8236a(R.string.there_is_no_channel_with_this_username), 0).show();
                intent.removeExtra("KEY_SHOW_TOAST_FOR_CHANNEL_NOT_EXIST");
            }
        } else {
            C4478a.m8144a(activity, intent.getStringExtra("KEY_START_CHANNEL_PARTY"), null, "");
            intent.removeExtra("KEY_START_CHANNEL_PARTY");
        }
    }
}
