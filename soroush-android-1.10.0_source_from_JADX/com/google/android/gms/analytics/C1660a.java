package com.google.android.gms.analytics;

import android.content.BroadcastReceiver;
import android.content.BroadcastReceiver.PendingResult;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ac;
import com.google.android.gms.internal.C1821q;
import com.google.android.gms.internal.C1825u;
import com.google.android.gms.internal.C1827x;
import com.google.android.gms.internal.ax;
import com.google.android.gms.internal.ce;

public final class C1660a extends BroadcastReceiver {
    private static Boolean f5134a;

    public static boolean m4251a(Context context) {
        ac.m4376a((Object) context);
        if (f5134a != null) {
            return f5134a.booleanValue();
        }
        boolean a = ce.m4652a(context, "com.google.android.gms.analytics.CampaignTrackingReceiver", true);
        f5134a = Boolean.valueOf(a);
        return a;
    }

    public final void onReceive(Context context, Intent intent) {
        C1827x a = C1827x.m5158a(context);
        C1825u a2 = a.m5160a();
        if (intent == null) {
            a2.m5153e("CampaignTrackingReceiver received null intent");
            return;
        }
        String stringExtra = intent.getStringExtra("referrer");
        String action = intent.getAction();
        a2.m5140a("CampaignTrackingReceiver received", action);
        if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
            if (!TextUtils.isEmpty(stringExtra)) {
                int c = ax.m4587c();
                if (stringExtra.length() > c) {
                    a2.m5149c("Campaign data exceed the maximum supported size and will be clipped. size, limit", Integer.valueOf(stringExtra.length()), Integer.valueOf(c));
                    stringExtra = stringExtra.substring(0, c);
                }
                PendingResult goAsync = goAsync();
                C1825u c2 = a.m5162c();
                Runnable c1668k = new C1668k(goAsync);
                ac.m4379a(stringExtra, (Object) "campaign param can't be empty");
                c2.f6279f.m5161b().m4278a(new C1821q(c2, stringExtra, c1668k));
                return;
            }
        }
        a2.m5153e("CampaignTrackingReceiver received unexpected intent without referrer extra");
    }
}
