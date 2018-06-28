package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobInfo.Builder;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.PersistableBundle;
import com.google.android.gms.common.util.C1785d;
import org.jivesoftware.smackx.amp.packet.AMPExtension.Action;

public final class jq extends hq {
    private final AlarmManager f18215a = ((AlarmManager) mo1615l().getSystemService("alarm"));
    private final fb f18216b;
    private Integer f18217c;

    protected jq(gr grVar) {
        super(grVar);
        this.f18216b = new jr(this, grVar);
    }

    private final int m16531A() {
        if (this.f18217c == null) {
            String str = "measurement";
            String valueOf = String.valueOf(mo1615l().getPackageName());
            this.f18217c = Integer.valueOf((valueOf.length() != 0 ? str.concat(valueOf) : new String(str)).hashCode());
        }
        return this.f18217c.intValue();
    }

    private final PendingIntent m16532B() {
        Intent className = new Intent().setClassName(mo1615l(), "com.google.android.gms.measurement.AppMeasurementReceiver");
        className.setAction("com.google.android.gms.measurement.UPLOAD");
        return PendingIntent.getBroadcast(mo1615l(), 0, className, 0);
    }

    @TargetApi(24)
    private final void m16533z() {
        JobScheduler jobScheduler = (JobScheduler) mo1615l().getSystemService("jobscheduler");
        mo1623t().f18140g.m4847a("Cancelling job. JobID", Integer.valueOf(m16531A()));
        jobScheduler.cancel(m16531A());
    }

    public final /* bridge */ /* synthetic */ void mo1604a() {
        super.mo1604a();
    }

    public final void m16535a(long j) {
        m11975L();
        if (!gi.m4859a(mo1615l())) {
            mo1623t().f18139f.m4846a("Receiver not registered/enabled");
        }
        if (!jf.m4947a(mo1615l())) {
            mo1623t().f18139f.m4846a("Service not registered/enabled");
        }
        m16558y();
        long b = mo1614k().mo1576b() + j;
        if (j < Math.max(0, ((Long) fj.f5785z.f5786a).longValue()) && !this.f18216b.m4818b()) {
            mo1623t().f18140g.m4846a("Scheduling upload with DelayedRunnable");
            this.f18216b.m4817a(j);
        }
        if (VERSION.SDK_INT >= 24) {
            mo1623t().f18140g.m4846a("Scheduling upload with JobScheduler");
            JobScheduler jobScheduler = (JobScheduler) mo1615l().getSystemService("jobscheduler");
            Builder builder = new Builder(m16531A(), new ComponentName(mo1615l(), "com.google.android.gms.measurement.AppMeasurementJobService"));
            builder.setMinimumLatency(j);
            builder.setOverrideDeadline(j << 1);
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putString(Action.ATTRIBUTE_NAME, "com.google.android.gms.measurement.UPLOAD");
            builder.setExtras(persistableBundle);
            JobInfo build = builder.build();
            mo1623t().f18140g.m4847a("Scheduling job. JobID", Integer.valueOf(m16531A()));
            jobScheduler.schedule(build);
            return;
        }
        mo1623t().f18140g.m4846a("Scheduling upload with AlarmManager");
        this.f18215a.setInexactRepeating(2, b, Math.max(((Long) fj.f5780u.f5786a).longValue(), j), m16532B());
    }

    public final /* bridge */ /* synthetic */ void mo1605b() {
        super.mo1605b();
    }

    public final /* bridge */ /* synthetic */ void mo1606c() {
        super.mo1606c();
    }

    public final /* bridge */ /* synthetic */ eo mo1607d() {
        return super.mo1607d();
    }

    public final /* bridge */ /* synthetic */ eu mo1608e() {
        return super.mo1608e();
    }

    public final /* bridge */ /* synthetic */ hs mo1609f() {
        return super.mo1609f();
    }

    public final /* bridge */ /* synthetic */ fo mo1610g() {
        return super.mo1610g();
    }

    public final /* bridge */ /* synthetic */ fd mo1611h() {
        return super.mo1611h();
    }

    public final /* bridge */ /* synthetic */ il mo1612i() {
        return super.mo1612i();
    }

    public final /* bridge */ /* synthetic */ ih mo1613j() {
        return super.mo1613j();
    }

    public final /* bridge */ /* synthetic */ C1785d mo1614k() {
        return super.mo1614k();
    }

    public final /* bridge */ /* synthetic */ Context mo1615l() {
        return super.mo1615l();
    }

    public final /* bridge */ /* synthetic */ fp mo1616m() {
        return super.mo1616m();
    }

    public final /* bridge */ /* synthetic */ ex mo1617n() {
        return super.mo1617n();
    }

    public final /* bridge */ /* synthetic */ fr mo1618o() {
        return super.mo1618o();
    }

    public final /* bridge */ /* synthetic */ ju mo1619p() {
        return super.mo1619p();
    }

    public final /* bridge */ /* synthetic */ gl mo1620q() {
        return super.mo1620q();
    }

    public final /* bridge */ /* synthetic */ jk mo1621r() {
        return super.mo1621r();
    }

    public final /* bridge */ /* synthetic */ gm mo1622s() {
        return super.mo1622s();
    }

    public final /* bridge */ /* synthetic */ ft mo1623t() {
        return super.mo1623t();
    }

    public final /* bridge */ /* synthetic */ gd mo1624u() {
        return super.mo1624u();
    }

    public final /* bridge */ /* synthetic */ ew mo1625v() {
        return super.mo1625v();
    }

    protected final boolean mo3036w() {
        this.f18215a.cancel(m16532B());
        if (VERSION.SDK_INT >= 24) {
            m16533z();
        }
        return false;
    }

    public final void m16558y() {
        m11975L();
        this.f18215a.cancel(m16532B());
        this.f18216b.m4819c();
        if (VERSION.SDK_INT >= 24) {
            m16533z();
        }
    }
}
