package mobi.mmdt.ott.view.components.browser;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class ShareBroadcastReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        String dataString = intent.getDataString();
        if (dataString != null) {
            Intent intent2 = new Intent("android.intent.action.SEND");
            intent2.setType("text/plain");
            intent2.putExtra("android.intent.extra.TEXT", dataString);
            intent = Intent.createChooser(intent2, "ShareLink");
            intent.setFlags(268435456);
            context.startActivity(intent);
        }
    }
}
