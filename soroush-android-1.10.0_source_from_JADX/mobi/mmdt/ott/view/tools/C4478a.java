package mobi.mmdt.ott.view.tools;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.location.ChannelsMapsActivity;
import mobi.mmdt.ott.logic.location.MapsActivity;
import mobi.mmdt.ott.provider.p384f.C2973m;
import mobi.mmdt.ott.view.autoupdate.UserNameUpdateActivity;
import mobi.mmdt.ott.view.call.CallActivity;
import mobi.mmdt.ott.view.channel.addmembers.ManageFollowersActivity;
import mobi.mmdt.ott.view.components.mediaviewer.ImageViewerActivity;
import mobi.mmdt.ott.view.components.mediaviewer.MediaViewerActivity;
import mobi.mmdt.ott.view.components.report.ReportActivity;
import mobi.mmdt.ott.view.contact.contactprofileinfo.ContactProfileInfoActivity;
import mobi.mmdt.ott.view.contact.contactprofileinfo.ContactProfileInfoActivityThemeDialog;
import mobi.mmdt.ott.view.conversation.C3290a;
import mobi.mmdt.ott.view.conversation.activities.C3383b;
import mobi.mmdt.ott.view.conversation.activities.ConversationActivity;
import mobi.mmdt.ott.view.conversation.createpayment.CreatePaymentActivity;
import mobi.mmdt.ott.view.conversation.createpoll.CreatePollActivity;
import mobi.mmdt.ott.view.conversation.forward.ForwardActivity;
import mobi.mmdt.ott.view.conversation.groupinfo.invitelink.CreateInviteLinkActivity;
import mobi.mmdt.ott.view.conversation.sharedmediaviewer.SharedMediaViewerActivity;
import mobi.mmdt.ott.view.main.ContactsActivity;
import mobi.mmdt.ott.view.newdesign.mainpage.MainActivity;
import mobi.mmdt.ott.view.passcode.PassCodeActivity;
import mobi.mmdt.ott.view.search.SearchActivity;
import mobi.mmdt.ott.view.settings.forceupdate.ForceUpdateActivity;
import mobi.mmdt.ott.view.settings.mainsettings.localpasscode.LocalPassCodeSettingsListActivity;
import mobi.mmdt.ott.view.settings.mainsettings.profileinfo.ProfileInfoSettingsActivity;
import mobi.mmdt.ott.view.stickermarket.StickerMarketActivity;
import mobi.mmdt.ott.view.stickermarket.stickersettings.StickerSettingsActivity;
import mobi.mmdt.ott.view.stickermarket.stickersettings.StickerSettingsActivityThemeDialog;
import mobi.mmdt.ott.view.vas.owghat.OwghatActivity;
import mobi.mmdt.ott.view.vas.owghat.setting.OwghatSettingActivity;
import mobi.mmdt.ott.view.vas.payservices.bill.view.BillPaymentActivity;
import mobi.mmdt.ott.view.vas.payservices.charge.view.ChargeActivity;
import mobi.mmdt.ott.view.vas.weather.WeatherActivity;

public final class C4478a {
    public static PendingIntent m8136a(int i, String str, C3290a c3290a) {
        Intent intent = new Intent(MyApplication.m12952b(), CallActivity.class);
        intent.putExtra("key_contact_user_id_string", str);
        intent.putExtra("key_start_mode", c3290a.ordinal());
        return PendingIntent.getActivity(MyApplication.m12952b(), i, intent, 134217728);
    }

    public static void m8137a() {
        Intent intent = new Intent(MyApplication.m12952b(), ForceUpdateActivity.class);
        intent.setFlags(268435456);
        MyApplication.m12952b().startActivity(intent);
    }

    public static void m8138a(Activity activity) {
        Intent intent = new Intent(activity, ProfileInfoSettingsActivity.class);
        intent.putExtra("KEY_ENTER_FOR_SETTING", true);
        if (activity != null) {
            activity.startActivity(intent);
            C4478a.m8165c(activity, true);
        }
    }

    public static void m8139a(Activity activity, double d, double d2) {
        Intent intent = new Intent(activity, ChannelsMapsActivity.class);
        intent.putExtra("KEY_LATITUDE", d);
        intent.putExtra("KEY_LONGITUDE", d2);
        activity.startActivityForResult(intent, 100);
    }

    public static void m8140a(Activity activity, double d, double d2, boolean z) {
        Intent intent = new Intent(activity, MapsActivity.class);
        intent.putExtra("KEY_LATITUDE", d);
        intent.putExtra("KEY_LONGITUDE", d2);
        intent.putExtra("KEY_ENTER_FROM_CHANNEL_INFO", z);
        activity.startActivity(intent);
    }

    public static void m8141a(Activity activity, Intent intent) {
        if (activity != null) {
            Intent intent2 = new Intent(activity, PassCodeActivity.class);
            if (intent.getExtras() != null) {
                intent2.putExtras(intent.getExtras());
            }
            if (intent.getData() != null) {
                intent2.setData(intent.getData());
            }
            if (intent.getAction() != null) {
                intent2.setAction(intent.getAction());
            }
            if (intent.getType() != null) {
                intent2.setType(intent.getType());
            }
            intent2.setFlags(268435456);
            intent2.putExtra("FROM_SETTING", false);
            intent2.putExtra("KEY_ENTER_WITH_TIMER", false);
            intent2.putExtra("KEY_ENTER_FROM_NOTIFICATION", true);
            activity.startActivity(intent2);
        }
    }

    public static void m8142a(Activity activity, Class<?> cls) {
        activity.startActivity(new Intent(activity, cls));
        C4478a.m8165c(activity, true);
    }

    public static void m8143a(Activity activity, String str) {
        Intent intent = new Intent(activity, ManageFollowersActivity.class);
        intent.putExtra("KEY_CHANNEL_ID", str);
        if (activity != null) {
            activity.startActivity(intent);
            C4478a.m8165c(activity, true);
        }
    }

    public static void m8144a(Activity activity, String str, String str2, String str3) {
        C4478a.m8146a(activity, str, str2, str3, false);
    }

    public static void m8145a(Activity activity, String str, String str2, String str3, String str4) {
        Intent intent = new Intent(activity, CreateInviteLinkActivity.class);
        intent.putExtra("KEY_GROUP_ID", str);
        intent.putExtra("KEY_GROUP_NAME", str2);
        intent.putExtra("KEY_GROUP_IMAGE", str3);
        intent.putExtra("KEY_GROUP_MEMBER_COUNT", str4);
        if (activity != null) {
            activity.startActivity(intent);
            C4478a.m8165c(activity, true);
        }
    }

    public static void m8146a(Activity activity, String str, String str2, String str3, boolean z) {
        Intent intent = new Intent(activity, ConversationActivity.class);
        intent.putExtra("KEY_START_KIND", C3383b.f10381c - 1);
        intent.putExtra("KEY_LAST_POSITION", str3);
        intent.putExtra("KEY_PARTY", str);
        intent.putExtra("isOpenByLink", z);
        if (str2 != null) {
            intent.putExtra("key_searched_message_id", str2);
        }
        if (activity != null) {
            activity.startActivity(intent);
            C4478a.m8161b(activity, false);
            C4478a.m8165c(activity, true);
        }
    }

    public static void m8147a(Activity activity, String str, String str2, C2973m c2973m) {
        Intent intent = new Intent(activity, SharedMediaViewerActivity.class);
        intent.putExtra("KEY_PEER_PARTY", str);
        intent.putExtra("KEY_TITLE_TEXT", str2);
        if (c2973m != null) {
            intent.putExtra("KEY_GROUP_TYPE", c2973m.ordinal());
        }
        if (activity != null) {
            activity.startActivity(intent);
            C4478a.m8165c(activity, true);
        }
    }

    public static void m8148a(Activity activity, String str, String str2, C2973m c2973m, String str3) {
        Intent intent = new Intent(activity, MediaViewerActivity.class);
        intent.putExtra("KEY_PEER_PARTY", str2);
        intent.putExtra("KEY_TITLE", str3);
        if (c2973m != null) {
            intent.putExtra("KEY_GROUP_TYPE", c2973m.ordinal());
        }
        intent.putExtra("KEY_MEDIA_PATH", str);
        if (activity != null) {
            activity.startActivityForResult(intent, 27);
            C4478a.m8165c(activity, true);
        }
    }

    public static void m8149a(Activity activity, String str, boolean z) {
        if (activity.getResources().getBoolean(R.bool.xlarge)) {
            Intent intent = new Intent(activity, ContactProfileInfoActivityThemeDialog.class);
            intent.putExtra("KEY_CONTACT_USER_ID_STRING", str);
            intent.putExtra("KEY_SHOW_LOCAL_INFO_BOOLEAN", z);
            activity.startActivity(intent);
            activity.overridePendingTransition(R.anim.anim_fade_in_activity_theme_dialog, R.anim.anim_fade_out_activity_theme_dialog);
            return;
        }
        intent = new Intent(activity, ContactProfileInfoActivity.class);
        intent.putExtra("KEY_CONTACT_USER_ID_STRING", str);
        intent.putExtra("KEY_SHOW_LOCAL_INFO_BOOLEAN", z);
        activity.startActivity(intent);
        C4478a.m8161b(activity, false);
        C4478a.m8165c(activity, true);
    }

    public static void m8150a(Activity activity, String str, boolean z, String str2, String str3) {
        Intent intent = new Intent(activity, ConversationActivity.class);
        intent.putExtra("KEY_LAST_POSITION", str3);
        intent.putExtra("KEY_START_KIND", C3383b.f10379a - 1);
        intent.putExtra("KEY_PARTY", str);
        if (!(str2 == null || str2.isEmpty())) {
            intent.putExtra("key_searched_message_id", str2);
        }
        if (activity != null) {
            activity.startActivity(intent);
            C4478a.m8161b(activity, z);
            C4478a.m8165c(activity, true);
        }
    }

    public static void m8151a(Activity activity, ArrayList<String> arrayList, String str, int i, boolean z) {
        Intent intent = new Intent(activity, ForwardActivity.class);
        intent.putStringArrayListExtra("key_to_forward_message_id", arrayList);
        intent.putExtra("key_is_forward_mode", true);
        intent.putExtra("KEY_PEER_PARTY", str);
        intent.putExtra("KEY_GROUP_TYPE", i);
        if (activity != null) {
            activity.startActivityForResult(intent, 19);
            C4478a.m8161b(activity, z);
            C4478a.m8165c(activity, true);
        }
    }

    public static void m8152a(Activity activity, C2973m c2973m, String str, String str2) {
        Intent intent = new Intent(activity, ReportActivity.class);
        intent.putExtra("KEY_PEER_PARTY", str);
        intent.putExtra("KEY_NAME_CONVERSATION", str2);
        intent.putExtra("KEY_GROUP_TYPE", c2973m.ordinal());
        if (activity != null) {
            activity.startActivityForResult(intent, 10);
            C4478a.m8165c(activity, true);
        }
    }

    public static void m8153a(Activity activity, C4509g c4509g) {
        Intent intent = new Intent(activity, ContactsActivity.class);
        intent.putExtra("KEY_CONTACTS_ACTIVITY_TYPE", c4509g);
        activity.startActivity(intent);
        C4478a.m8165c(activity, true);
    }

    public static void m8154a(Activity activity, boolean z) {
        Intent intent = new Intent(activity, SearchActivity.class);
        intent.putExtra("full_search", z);
        intent.addFlags(65536);
        activity.startActivity(intent);
        activity.overridePendingTransition(0, 0);
    }

    public static void m8155a(Activity activity, boolean z, boolean z2, boolean z3) {
        Intent intent = new Intent(activity, PassCodeActivity.class);
        intent.putExtra("FROM_SETTING", true);
        intent.putExtra("SET_MODE", z);
        intent.putExtra("KEY_IS_CHANGE_MODE", z2);
        activity.startActivity(intent);
        C4478a.m8165c(activity, true);
        C4478a.m8161b(activity, z3);
    }

    public static void m8156b() {
        Context b = MyApplication.m12952b();
        Intent intent = new Intent(b, UserNameUpdateActivity.class);
        intent.setFlags(268435456);
        b.startActivity(intent);
    }

    public static void m8157b(Activity activity) {
        if (activity.getResources().getBoolean(R.bool.xlarge)) {
            activity.startActivity(new Intent(activity, StickerSettingsActivityThemeDialog.class));
            activity.overridePendingTransition(R.anim.anim_fade_in_activity_theme_dialog, R.anim.anim_fade_out_activity_theme_dialog);
            return;
        }
        activity.startActivity(new Intent(activity, StickerSettingsActivity.class));
        C4478a.m8165c(activity, true);
    }

    public static void m8158b(android.app.Activity r2, java.lang.String r3) {
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
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r0 = new android.content.Intent;
        r1 = "android.intent.action.VIEW";
        r0.<init>(r1);
        r3 = android.net.Uri.parse(r3);
        r1 = "video/*";
        r0.setDataAndType(r3, r1);
        if (r2 == 0) goto L_0x0028;
    L_0x0012:
        r3 = 1;
        r2.startActivity(r0);	 Catch:{ ActivityNotFoundException -> 0x001a }
        mobi.mmdt.ott.view.tools.C4478a.m8165c(r2, r3);	 Catch:{ ActivityNotFoundException -> 0x001a }
        return;
    L_0x001a:
        r0 = 2131690177; // 0x7f0f02c1 float:1.900939E38 double:1.053194884E-314;
        r0 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r0);
        r2 = android.widget.Toast.makeText(r2, r0, r3);
        r2.show();
    L_0x0028:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.tools.a.b(android.app.Activity, java.lang.String):void");
    }

    public static void m8159b(Activity activity, String str, String str2, String str3) {
        Intent intent = new Intent(activity, ConversationActivity.class);
        intent.putExtra("KEY_START_KIND", C3383b.f10383e - 1);
        intent.putExtra("KEY_LAST_POSITION", str3);
        intent.putExtra("KEY_PARTY", str);
        if (str2 != null) {
            intent.putExtra("key_searched_message_id", str2);
        }
        if (activity != null) {
            activity.startActivity(intent);
            C4478a.m8161b(activity, false);
            C4478a.m8165c(activity, true);
        }
    }

    public static void m8160b(Activity activity, String str, boolean z, String str2, String str3) {
        Intent intent = new Intent(activity, ConversationActivity.class);
        intent.putExtra("KEY_START_KIND", C3383b.f10380b - 1);
        intent.putExtra("KEY_LAST_POSITION", str3);
        intent.putExtra("KEY_PARTY", str);
        if (str2 != null) {
            intent.putExtra("key_searched_message_id", str2);
        }
        if (activity != null) {
            activity.startActivity(intent);
            C4478a.m8161b(activity, z);
            C4478a.m8165c(activity, true);
        }
    }

    public static void m8161b(Activity activity, boolean z) {
        if (z) {
            activity.finish();
        }
    }

    public static void m8162c(Activity activity) {
        Intent intent = new Intent(activity, StickerMarketActivity.class);
        if (activity != null) {
            activity.startActivity(intent);
            C4478a.m8165c(activity, true);
        }
    }

    public static void m8163c(Activity activity, String str) {
        Intent intent = new Intent(activity, CallActivity.class);
        intent.putExtra("key_contact_user_id_string", str);
        intent.putExtra("key_start_mode", C3290a.MAKE_CALL.ordinal());
        if (activity != null) {
            activity.startActivity(intent);
            C4478a.m8165c(activity, true);
        }
    }

    public static void m8164c(Activity activity, String str, String str2, String str3) {
        Intent intent = new Intent(activity, ImageViewerActivity.class);
        intent.putExtra("KEY_MEDIA_PATH", str);
        intent.putExtra("KEY_THUMBNAIL_IMAGE_PATH", str2);
        intent.putExtra("KEY_TITLE", str3);
        if (activity != null) {
            activity.startActivity(intent);
            C4478a.m8165c(activity, true);
        }
    }

    public static void m8165c(Activity activity, boolean z) {
        if (z) {
            activity.overridePendingTransition(R.anim.anim_slide_in_left, R.anim.anim_slide_out_left);
        }
    }

    public static void m8166d(Activity activity) {
        Intent intent = new Intent(activity, MainActivity.class);
        intent.addFlags(67108864);
        intent.addFlags(131072);
        if (activity != null) {
            activity.startActivity(intent);
            C4478a.m8165c(activity, false);
        }
    }

    public static void m8167d(Activity activity, String str) {
        Intent intent = new Intent(activity, CreatePollActivity.class);
        intent.putExtra("key_channel_id", str);
        if (activity != null) {
            activity.startActivity(intent);
            C4478a.m8165c(activity, true);
        }
    }

    public static void m8168e(Activity activity) {
        if (activity.getResources().getBoolean(R.bool.xlarge)) {
            activity.startActivity(new Intent(activity, OwghatSettingActivity.class));
            activity.overridePendingTransition(R.anim.anim_fade_in_activity_theme_dialog, R.anim.anim_fade_out_activity_theme_dialog);
            return;
        }
        activity.startActivity(new Intent(activity, OwghatSettingActivity.class));
        C4478a.m8165c(activity, true);
    }

    public static void m8169e(Activity activity, String str) {
        Intent intent = new Intent(activity, CreatePaymentActivity.class);
        intent.putExtra("key_channel_id", str);
        if (activity != null) {
            activity.startActivity(intent);
            C4478a.m8165c(activity, true);
        }
    }

    public static void m8170f(Activity activity) {
        Intent intent = new Intent(activity, OwghatActivity.class);
        activity.startActivity(intent);
        intent.setFlags(1073741824);
        C4478a.m8165c(activity, true);
    }

    public static void m8171g(Activity activity) {
        Intent intent = new Intent(activity, ChargeActivity.class);
        activity.startActivity(intent);
        intent.setFlags(1073741824);
        C4478a.m8165c(activity, true);
    }

    public static void m8172h(Activity activity) {
        Intent intent = new Intent(activity, BillPaymentActivity.class);
        activity.startActivity(intent);
        intent.setFlags(1073741824);
        C4478a.m8165c(activity, true);
    }

    public static void m8173i(Activity activity) {
        Intent intent = new Intent(activity, WeatherActivity.class);
        activity.startActivity(intent);
        intent.setFlags(1073741824);
        C4478a.m8165c(activity, true);
    }

    public static void m8174j(Activity activity) {
        Intent intent = new Intent(activity, LocalPassCodeSettingsListActivity.class);
        intent.putExtra("FROM_SETTING", true);
        activity.startActivity(intent);
        C4478a.m8165c(activity, true);
        C4478a.m8161b(activity, true);
    }
}
