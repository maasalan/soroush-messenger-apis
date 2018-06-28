package mobi.mmdt.ott.view.tools;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import mobi.mmdt.componentsutils.p232b.C2492j;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.p246d.p248b.C2535a;

public final class C4533r {
    public static void m8255a(Activity activity) {
        String c = C2535a.m6888a().m6924c();
        if (c == null) {
            c = C2492j.m6841a(C2535a.m6888a().m6928d());
            C2535a.m6888a().m6916a(c);
        }
        String a = C4522p.m8236a(R.string.invite_msg);
        c = C4522p.m8236a(R.string.invite_link_url).concat(c).concat("/");
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", a.concat(c));
        intent.setType("text/plain");
        activity.startActivity(Intent.createChooser(intent, activity.getResources().getText(R.string.share_with)));
    }

    public static void m8256a(Activity activity, String str) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        StringBuilder stringBuilder = new StringBuilder("[Forwarded from ");
        stringBuilder.append(C4522p.m8236a(R.string.app_name));
        stringBuilder.append("]:\n");
        stringBuilder.append(str);
        intent.putExtra("android.intent.extra.TEXT", stringBuilder.toString());
        intent.setType("text/plain");
        activity.startActivity(Intent.createChooser(intent, activity.getResources().getText(R.string.share_with)));
    }

    public static void m8257b(Activity activity, String str) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.STREAM", Uri.parse(str));
        intent.setType("image/*");
        intent.addFlags(1);
        activity.startActivity(Intent.createChooser(intent, activity.getResources().getText(R.string.share_with)));
    }

    public static void m8258c(Activity activity, String str) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.STREAM", Uri.parse(str));
        intent.setType("image/gif");
        intent.addFlags(1);
        activity.startActivity(Intent.createChooser(intent, activity.getResources().getText(R.string.share_with)));
    }

    public static void m8259d(Activity activity, String str) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.STREAM", Uri.parse(str));
        intent.setType("video/*");
        intent.addFlags(1);
        activity.startActivity(Intent.createChooser(intent, activity.getResources().getText(R.string.share_with)));
    }

    public static void m8260e(Activity activity, String str) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.STREAM", Uri.parse(str));
        intent.setType("*/*");
        intent.addFlags(1);
        activity.startActivity(Intent.createChooser(intent, activity.getResources().getText(R.string.share_with)));
    }
}
