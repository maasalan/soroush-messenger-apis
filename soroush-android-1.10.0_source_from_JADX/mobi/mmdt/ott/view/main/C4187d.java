package mobi.mmdt.ott.view.main;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;

public final class C4187d {
    public static void m8040a(Activity activity, String str) {
        Intent intent = new Intent("android.intent.action.SENDTO");
        intent.setData(Uri.parse(String.format("mailto:%s", new Object[]{str})));
        intent.putExtra("android.intent.extra.SUBJECT", "");
        if (intent.resolveActivity(activity.getPackageManager()) != null) {
            activity.startActivity(intent);
        }
    }
}
