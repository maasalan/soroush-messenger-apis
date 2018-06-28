package mobi.mmdt.ott.view.registeration.activationcode;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.telephony.SmsMessage;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

public final class C4303b extends BroadcastReceiver {
    private C4302a f12123a;

    public C4303b(C4302a c4302a) {
        this.f12123a = c4302a;
    }

    public final void onReceive(Context context, Intent intent) {
        try {
            if (intent.getAction().equals("android.provider.Telephony.SMS_RECEIVED")) {
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    Object[] objArr = (Object[]) extras.get("pdus");
                    if (objArr != null) {
                        int length = objArr.length;
                        int i = 0;
                        while (i < length) {
                            Object obj = objArr[i];
                            String replaceAll = (VERSION.SDK_INT >= 23 ? SmsMessage.createFromPdu((byte[]) obj, extras.getString(IjkMediaMeta.IJKM_KEY_FORMAT)) : SmsMessage.createFromPdu((byte[]) obj)).getMessageBody().replaceAll("[^0-9]", "");
                            if (replaceAll.length() != 5) {
                                if (replaceAll.length() != 6) {
                                    i++;
                                }
                            }
                            this.f12123a.mo3675a(replaceAll);
                            abortBroadcast();
                            break;
                        }
                    }
                }
            }
        } catch (Throwable e) {
            C2480b.m6738b(e);
        }
    }
}
