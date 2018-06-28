package mobi.mmdt.componentsutils.p232b.p233a;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import android.provider.Telephony.Sms;
import org.jivesoftware.smackx.address.packet.MultipleAddresses.Address;

public final class C2473a {
    public static boolean m6716a(Context context, String str, String str2) {
        StringBuilder stringBuilder = new StringBuilder("sms:");
        stringBuilder.append(str);
        Uri parse = Uri.parse(stringBuilder.toString());
        Intent intent = new Intent();
        intent.setData(parse);
        intent.putExtra("android.intent.extra.TEXT", str2);
        intent.putExtra("sms_body", str2);
        intent.putExtra(Address.ELEMENT, str);
        if (VERSION.SDK_INT >= 19) {
            intent.setAction("android.intent.action.SENDTO");
            str = Sms.getDefaultSmsPackage(context);
            if (str != null) {
                intent.setPackage(str);
            }
        } else {
            intent.setAction("android.intent.action.VIEW");
            intent.setType("vnd.android-dir/mms-sms");
        }
        try {
            context.startActivity(intent);
            return true;
        } catch (ActivityNotFoundException e) {
            e.printStackTrace();
            return false;
        }
    }
}
