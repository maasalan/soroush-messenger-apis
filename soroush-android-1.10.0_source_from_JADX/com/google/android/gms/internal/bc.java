package com.google.android.gms.internal;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobInfo.Builder;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.PersistableBundle;
import com.google.android.gms.common.internal.ac;
import org.jivesoftware.smackx.amp.packet.AMPExtension.Action;

public final class bc extends C5506v {
    boolean f18090a;
    boolean f18091b;
    private final AlarmManager f18092c = ((AlarmManager) this.f6279f.f6283a.getSystemService("alarm"));
    private Integer f18093d;

    protected bc(C1827x c1827x) {
        super(c1827x);
    }

    private final PendingIntent m15985d() {
        Intent intent = new Intent("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
        intent.setComponent(new ComponentName(this.f6279f.f6283a, "com.google.android.gms.analytics.AnalyticsReceiver"));
        return PendingIntent.getBroadcast(this.f6279f.f6283a, 0, intent, 0);
    }

    private final int m15986e() {
        if (this.f18093d == null) {
            String str = "analytics";
            String valueOf = String.valueOf(this.f6279f.f6283a.getPackageName());
            this.f18093d = Integer.valueOf((valueOf.length() != 0 ? str.concat(valueOf) : new String(str)).hashCode());
        }
        return this.f18093d.intValue();
    }

    public final void m15987b() {
        m12037k();
        ac.m4382a(this.f18090a, (Object) "Receiver not registered");
        long e = ax.m4589e();
        if (e > 0) {
            m15988c();
            long b = this.f6279f.f6285c.mo1576b() + e;
            this.f18091b = true;
            if (VERSION.SDK_INT >= 24) {
                m5143b("Scheduling upload with JobScheduler");
                JobScheduler jobScheduler = (JobScheduler) this.f6279f.f6283a.getSystemService("jobscheduler");
                Builder builder = new Builder(m15986e(), new ComponentName(this.f6279f.f6283a, "com.google.android.gms.analytics.AnalyticsJobService"));
                builder.setMinimumLatency(e);
                builder.setOverrideDeadline(e << 1);
                PersistableBundle persistableBundle = new PersistableBundle();
                persistableBundle.putString(Action.ATTRIBUTE_NAME, "com.google.android.gms.analytics.ANALYTICS_DISPATCH");
                builder.setExtras(persistableBundle);
                JobInfo build = builder.build();
                m5140a("Scheduling job. JobID", Integer.valueOf(m15986e()));
                jobScheduler.schedule(build);
                return;
            }
            m5143b("Scheduling upload with AlarmManager");
            this.f18092c.setInexactRepeating(2, b, e, m15985d());
        }
    }

    public final void m15988c() {
        this.f18091b = false;
        this.f18092c.cancel(m15985d());
        if (VERSION.SDK_INT >= 24) {
            JobScheduler jobScheduler = (JobScheduler) this.f6279f.f6283a.getSystemService("jobscheduler");
            m5140a("Cancelling job. JobID", Integer.valueOf(m15986e()));
            jobScheduler.cancel(m15986e());
        }
    }

    protected final void c_() {
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
        r5 = this;
        r5.m15988c();	 Catch:{ NameNotFoundException -> 0x0033 }
        r0 = com.google.android.gms.internal.ax.m4589e();	 Catch:{ NameNotFoundException -> 0x0033 }
        r2 = 0;	 Catch:{ NameNotFoundException -> 0x0033 }
        r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));	 Catch:{ NameNotFoundException -> 0x0033 }
        if (r4 <= 0) goto L_0x0033;	 Catch:{ NameNotFoundException -> 0x0033 }
    L_0x000d:
        r0 = r5.f6279f;	 Catch:{ NameNotFoundException -> 0x0033 }
        r0 = r0.f6283a;	 Catch:{ NameNotFoundException -> 0x0033 }
        r0 = r0.getPackageManager();	 Catch:{ NameNotFoundException -> 0x0033 }
        r1 = new android.content.ComponentName;	 Catch:{ NameNotFoundException -> 0x0033 }
        r2 = r5.f6279f;	 Catch:{ NameNotFoundException -> 0x0033 }
        r2 = r2.f6283a;	 Catch:{ NameNotFoundException -> 0x0033 }
        r3 = "com.google.android.gms.analytics.AnalyticsReceiver";	 Catch:{ NameNotFoundException -> 0x0033 }
        r1.<init>(r2, r3);	 Catch:{ NameNotFoundException -> 0x0033 }
        r2 = 2;	 Catch:{ NameNotFoundException -> 0x0033 }
        r0 = r0.getReceiverInfo(r1, r2);	 Catch:{ NameNotFoundException -> 0x0033 }
        if (r0 == 0) goto L_0x0033;	 Catch:{ NameNotFoundException -> 0x0033 }
    L_0x0027:
        r0 = r0.enabled;	 Catch:{ NameNotFoundException -> 0x0033 }
        if (r0 == 0) goto L_0x0033;	 Catch:{ NameNotFoundException -> 0x0033 }
    L_0x002b:
        r0 = "Receiver registered for local dispatch.";	 Catch:{ NameNotFoundException -> 0x0033 }
        r5.m5143b(r0);	 Catch:{ NameNotFoundException -> 0x0033 }
        r0 = 1;	 Catch:{ NameNotFoundException -> 0x0033 }
        r5.f18090a = r0;	 Catch:{ NameNotFoundException -> 0x0033 }
    L_0x0033:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.bc.c_():void");
    }
}
