package com.google.android.gms.internal;

import android.content.BroadcastReceiver.PendingResult;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.common.internal.ac;

public final class gi {
    private final gk f5835a;

    public gi(gk gkVar) {
        ac.m4376a((Object) gkVar);
        this.f5835a = gkVar;
    }

    public static boolean m4859a(android.content.Context r4) {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        com.google.android.gms.common.internal.ac.m4376a(r4);
        r0 = 0;
        r1 = r4.getPackageManager();	 Catch:{ NameNotFoundException -> 0x001f }
        if (r1 != 0) goto L_0x000b;	 Catch:{ NameNotFoundException -> 0x001f }
    L_0x000a:
        return r0;	 Catch:{ NameNotFoundException -> 0x001f }
    L_0x000b:
        r2 = new android.content.ComponentName;	 Catch:{ NameNotFoundException -> 0x001f }
        r3 = "com.google.android.gms.measurement.AppMeasurementReceiver";	 Catch:{ NameNotFoundException -> 0x001f }
        r2.<init>(r4, r3);	 Catch:{ NameNotFoundException -> 0x001f }
        r4 = 2;	 Catch:{ NameNotFoundException -> 0x001f }
        r4 = r1.getReceiverInfo(r2, r4);	 Catch:{ NameNotFoundException -> 0x001f }
        if (r4 == 0) goto L_0x001f;	 Catch:{ NameNotFoundException -> 0x001f }
    L_0x0019:
        r4 = r4.enabled;	 Catch:{ NameNotFoundException -> 0x001f }
        if (r4 == 0) goto L_0x001f;
    L_0x001d:
        r4 = 1;
        return r4;
    L_0x001f:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gi.a(android.content.Context):boolean");
    }

    public final void m4860a(Context context, Intent intent) {
        gr a = gr.m4871a(context);
        ft e = a.m4906e();
        if (intent == null) {
            e.f18136c.m4846a("Receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        e.f18140g.m4847a("Local receiver got", action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            intent = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            intent.setAction("com.google.android.gms.measurement.UPLOAD");
            e.f18140g.m4846a("Starting wakeful intent.");
            this.f5835a.mo1707a(context, intent);
            return;
        }
        if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
            PendingResult a2 = this.f5835a.mo1706a();
            action = intent.getStringExtra("referrer");
            if (action == null) {
                e.f18140g.m4846a("Install referrer extras are null");
                if (a2 != null) {
                    a2.finish();
                }
                return;
            }
            e.f18138e.m4847a("Install referrer extras are", action);
            if (!action.contains("?")) {
                String str = "?";
                action = String.valueOf(action);
                action = action.length() != 0 ? str.concat(action) : new String(str);
            }
            Bundle a3 = a.m4910i().m16590a(Uri.parse(action));
            if (a3 == null) {
                e.f18140g.m4846a("No campaign defined in install referrer broadcast");
                if (a2 != null) {
                    a2.finish();
                    return;
                }
            }
            long longExtra = intent.getLongExtra("referrer_timestamp_seconds", 0) * 1000;
            if (longExtra == 0) {
                e.f18136c.m4846a("Install referrer is missing timestamp");
            }
            a.m4907f().m16336a(new gj(a, longExtra, a3, context, e, a2));
        }
    }
}
