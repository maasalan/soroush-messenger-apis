package com.google.firebase.iid;

import android.content.Intent;
import android.util.Log;
import org.jivesoftware.smackx.privacy.packet.PrivacyItem;

public class FirebaseInstanceIdService extends C2071g {
    protected final Intent mo1775a(Intent intent) {
        return (Intent) C2066b.m5636a().f6956a.poll();
    }

    public void mo3175a() {
    }

    public final void mo1776b(Intent intent) {
        if ("com.google.firebase.iid.TOKEN_REFRESH".equals(intent.getAction())) {
            mo3175a();
            return;
        }
        C2078n a = C2078n.m5668a(this, intent.getStringExtra("subtype"));
        String stringExtra = intent.getStringExtra("CMD");
        if (Log.isLoggable("InstanceID", 3)) {
            String str = a.f6997b;
            String valueOf = String.valueOf(intent.getExtras());
            StringBuilder stringBuilder = new StringBuilder(((22 + String.valueOf(str).length()) + String.valueOf(stringExtra).length()) + String.valueOf(valueOf).length());
            stringBuilder.append("Received command [");
            stringBuilder.append(str);
            stringBuilder.append("]: ");
            stringBuilder.append(stringExtra);
            stringBuilder.append(" ");
            stringBuilder.append(valueOf);
            Log.d("InstanceID", stringBuilder.toString());
        }
        if ("gcm.googleapis.com/refresh".equals(intent.getStringExtra(PrivacyItem.SUBSCRIPTION_FROM))) {
            a.m5675e();
        } else if ("RST".equals(stringExtra)) {
            a.m5673c();
        } else if ("RST_FULL".equals(stringExtra)) {
            a.m5674d();
        } else {
            if ("SYNC".equals(stringExtra)) {
                a.m5675e();
            }
        }
    }
}
