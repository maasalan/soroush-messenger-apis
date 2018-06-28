package mobi.mmdt.ott.logic.core;

import android.hardware.display.DisplayManager;
import android.os.Build.VERSION;
import android.os.PowerManager;
import android.view.Display;
import java.util.Timer;
import java.util.TimerTask;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.C2560a;
import mobi.mmdt.ott.logic.C2778b;
import mobi.mmdt.ott.logic.C2808d;
import mobi.mmdt.ott.logic.p261a.p294h.C6731b;
import mobi.mmdt.ott.logic.p360l.C2845b;
import mobi.mmdt.ott.logic.p360l.C5996e;
import mobi.mmdt.ott.p246d.p248b.C2535a;

public final class C2800c {
    private static C2800c f8854e;
    int f8855a = 2;
    boolean f8856b = false;
    public long f8857c = Long.valueOf(C2535a.m6888a().f8278a.getLong("mobi.mmdt.ott.model.pref.PrefKeys.KEY_FCM_DELAY_START_CONNECTION_TIME", 0)).longValue();
    public long f8858d = C2535a.m6888a().f8278a.getLong("mobi.mmdt.ott.model.pref.PrefKeys.KEY_FCM_DELAY_SEND_TIME", 0);
    private long f8859f = 0;
    private int f8860g = 192;
    private boolean f8861h = true;
    private Timer f8862i = new Timer();

    class C27971 extends TimerTask {
        final /* synthetic */ C2800c f8847a;

        C27971(C2800c c2800c) {
            this.f8847a = c2800c;
        }

        public final void run() {
            int i = 64;
            if (this.f8847a.m7140b()) {
                C2795a.m7133b();
                MyApplication.m12950a().m12958a(C2845b.CONNECTING);
                StringBuilder stringBuilder = new StringBuilder("TEMPORARILY_UNAVAILABLE.  start_in:");
                stringBuilder.append(this.f8847a.f8857c);
                C2480b.m6742f(stringBuilder.toString());
                C2535a.m6888a().m6969s(false);
            } else if (C5996e.m13260a().f16147a.m7105a(true)) {
                C2535a.m6888a().m6969s(false);
                this.f8847a.f8855a = 64;
            } else if (this.f8847a.m7141c()) {
                C2795a.m7133b();
            } else {
                C2535a.m6888a();
                if (C2535a.m6887T() != null) {
                    C2808d.m7149c(new C6731b());
                } else {
                    C2795a.m7132a();
                }
            }
            if (this.f8847a.f8855a < 64) {
                C2800c c2800c;
                if (this.f8847a.f8855a * 2 > 64) {
                    c2800c = this.f8847a;
                } else {
                    c2800c = this.f8847a;
                    i = this.f8847a.f8855a * 2;
                }
                c2800c.f8855a = i;
            }
            this.f8847a.f8856b = false;
            this.f8847a.m7137a(this.f8847a.f8855a);
        }
    }

    static /* synthetic */ class C27982 {
        static final /* synthetic */ int[] f8848a = new int[C2799a.m7134a().length];

        static {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
            /*
            r0 = mobi.mmdt.ott.logic.core.C2800c.C2799a.m7134a();
            r0 = r0.length;
            r0 = new int[r0];
            f8848a = r0;
            r0 = 1;
            r1 = f8848a;	 Catch:{ NoSuchFieldError -> 0x0011 }
            r2 = mobi.mmdt.ott.logic.core.C2800c.C2799a.f8849a;	 Catch:{ NoSuchFieldError -> 0x0011 }
            r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x0011 }
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x0011 }
        L_0x0011:
            r1 = f8848a;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r2 = mobi.mmdt.ott.logic.core.C2800c.C2799a.f8850b;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r3 = 2;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r1[r2] = r3;	 Catch:{ NoSuchFieldError -> 0x0019 }
        L_0x0019:
            r1 = f8848a;	 Catch:{ NoSuchFieldError -> 0x0021 }
            r2 = mobi.mmdt.ott.logic.core.C2800c.C2799a.f8851c;	 Catch:{ NoSuchFieldError -> 0x0021 }
            r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x0021 }
            r3 = 3;	 Catch:{ NoSuchFieldError -> 0x0021 }
            r1[r2] = r3;	 Catch:{ NoSuchFieldError -> 0x0021 }
        L_0x0021:
            r1 = f8848a;	 Catch:{ NoSuchFieldError -> 0x0029 }
            r2 = mobi.mmdt.ott.logic.core.C2800c.C2799a.f8852d;	 Catch:{ NoSuchFieldError -> 0x0029 }
            r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x0029 }
            r0 = 4;	 Catch:{ NoSuchFieldError -> 0x0029 }
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x0029 }
        L_0x0029:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.logic.core.c.2.<clinit>():void");
        }
    }

    public enum C2799a {
        ;
        
        public static final int f8849a = 1;
        public static final int f8850b = 2;
        public static final int f8851c = 3;
        public static final int f8852d = 4;

        static {
            f8853e = new int[]{f8849a, f8850b, f8851c, f8852d};
        }

        public static int[] m7134a() {
            return (int[]) f8853e.clone();
        }
    }

    private C2800c() {
        C2560a.m7006a(MyApplication.m12952b());
        if (C2560a.m7007a()) {
            m7137a(0);
        }
    }

    public static C2800c m7135a() {
        if (f8854e == null) {
            f8854e = new C2800c();
        }
        return f8854e;
    }

    private boolean m7136d() {
        if (VERSION.SDK_INT < 20) {
            return ((PowerManager) MyApplication.m12952b().getSystemService("power")).isScreenOn() || this.f8861h;
        } else {
            for (Display state : ((DisplayManager) MyApplication.m12952b().getSystemService("display")).getDisplays()) {
                if (state.getState() != 1) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    final synchronized void m7137a(int r11) {
        /*
        r10 = this;
        monitor-enter(r10);
        r0 = mobi.mmdt.ott.p246d.p248b.C2535a.m6888a();	 Catch:{ all -> 0x01a0 }
        r0 = r0.m6952j();	 Catch:{ all -> 0x01a0 }
        r1 = 64;
        if (r0 == 0) goto L_0x0197;
    L_0x000d:
        r0 = mobi.mmdt.ott.p246d.p248b.C2535a.m6888a();	 Catch:{ all -> 0x01a0 }
        r0 = r0.m6902N();	 Catch:{ all -> 0x01a0 }
        if (r0 == 0) goto L_0x0019;
    L_0x0017:
        goto L_0x0197;
    L_0x0019:
        r0 = 2;
        if (r11 != 0) goto L_0x001f;
    L_0x001c:
        r10.f8855a = r0;	 Catch:{ all -> 0x01a0 }
        goto L_0x0021;
    L_0x001f:
        r10.f8855a = r11;	 Catch:{ all -> 0x01a0 }
    L_0x0021:
        r2 = mobi.mmdt.ott.MyApplication.m12952b();	 Catch:{ all -> 0x01a0 }
        r2 = mobi.mmdt.componentsutils.p232b.C2474a.m6718b(r2);	 Catch:{ all -> 0x01a0 }
        if (r2 != 0) goto L_0x0032;
    L_0x002b:
        r10.f8855a = r1;	 Catch:{ all -> 0x01a0 }
        r2 = "Connectivity.isConnected(MyApplication.getContext())";
        mobi.mmdt.componentsutils.p232b.p235c.C2480b.m6742f(r2);	 Catch:{ all -> 0x01a0 }
    L_0x0032:
        r2 = mobi.mmdt.ott.p246d.p248b.C2535a.m6888a();	 Catch:{ all -> 0x01a0 }
        r2 = r2.m6913Z();	 Catch:{ all -> 0x01a0 }
        r4 = mobi.mmdt.ott.logic.C2778b.m7093a();	 Catch:{ all -> 0x01a0 }
        r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r6 <= 0) goto L_0x004d;
    L_0x0042:
        r2 = mobi.mmdt.ott.p246d.p248b.C2535a.m6888a();	 Catch:{ all -> 0x01a0 }
        r3 = mobi.mmdt.ott.logic.C2778b.m7093a();	 Catch:{ all -> 0x01a0 }
        r2.m6926c(r3);	 Catch:{ all -> 0x01a0 }
    L_0x004d:
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x01a0 }
        r3 = "New Reconnect called! isScreenOn: ";
        r2.<init>(r3);	 Catch:{ all -> 0x01a0 }
        r3 = r10.m7136d();	 Catch:{ all -> 0x01a0 }
        r2.append(r3);	 Catch:{ all -> 0x01a0 }
        r2 = r2.toString();	 Catch:{ all -> 0x01a0 }
        mobi.mmdt.componentsutils.p232b.p235c.C2480b.m6742f(r2);	 Catch:{ all -> 0x01a0 }
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x01a0 }
        r3 = "New Reconnect called! isNeedCloseConnection: ";
        r2.<init>(r3);	 Catch:{ all -> 0x01a0 }
        r3 = r10.m7141c();	 Catch:{ all -> 0x01a0 }
        r2.append(r3);	 Catch:{ all -> 0x01a0 }
        r2 = r2.toString();	 Catch:{ all -> 0x01a0 }
        mobi.mmdt.componentsutils.p232b.p235c.C2480b.m6742f(r2);	 Catch:{ all -> 0x01a0 }
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x01a0 }
        r3 = "New Reconnect called! mVisibileActivityCount: ";
        r2.<init>(r3);	 Catch:{ all -> 0x01a0 }
        r3 = mobi.mmdt.ott.MyApplication.m12950a();	 Catch:{ all -> 0x01a0 }
        r3 = r3.f15907m;	 Catch:{ all -> 0x01a0 }
        r2.append(r3);	 Catch:{ all -> 0x01a0 }
        r2 = r2.toString();	 Catch:{ all -> 0x01a0 }
        mobi.mmdt.componentsutils.p232b.p235c.C2480b.m6742f(r2);	 Catch:{ all -> 0x01a0 }
        r2 = r10.m7141c();	 Catch:{ all -> 0x01a0 }
        if (r2 == 0) goto L_0x00a2;
    L_0x0094:
        r2 = r10.f8855a;	 Catch:{ all -> 0x01a0 }
        if (r2 == r0) goto L_0x00a2;
    L_0x0098:
        r2 = "isNeedCloseConnection()";
        mobi.mmdt.componentsutils.p232b.p235c.C2480b.m6742f(r2);	 Catch:{ all -> 0x01a0 }
        r10.f8855a = r1;	 Catch:{ all -> 0x01a0 }
        mobi.mmdt.ott.logic.core.C2795a.m7133b();	 Catch:{ all -> 0x01a0 }
    L_0x00a2:
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x01a0 }
        r3 = "New Reconnect called! isNeedSalamWebService: ";
        r2.<init>(r3);	 Catch:{ all -> 0x01a0 }
        r3 = mobi.mmdt.ott.p246d.p248b.C2535a.m6888a();	 Catch:{ all -> 0x01a0 }
        r3 = r3.m6908U();	 Catch:{ all -> 0x01a0 }
        r2.append(r3);	 Catch:{ all -> 0x01a0 }
        r2 = r2.toString();	 Catch:{ all -> 0x01a0 }
        mobi.mmdt.componentsutils.p232b.p235c.C2480b.m6742f(r2);	 Catch:{ all -> 0x01a0 }
        r2 = mobi.mmdt.ott.p246d.p248b.C2535a.m6888a();	 Catch:{ all -> 0x01a0 }
        r2 = r2.m6908U();	 Catch:{ all -> 0x01a0 }
        if (r2 == 0) goto L_0x00c8;
    L_0x00c5:
        mobi.mmdt.ott.logic.core.C2795a.m7132a();	 Catch:{ all -> 0x01a0 }
    L_0x00c8:
        r2 = 0;
        if (r11 != 0) goto L_0x00cd;
    L_0x00cb:
        r11 = r2;
        goto L_0x00e7;
    L_0x00cd:
        r11 = r10.f8855a;	 Catch:{ all -> 0x01a0 }
        if (r11 != r1) goto L_0x00d4;
    L_0x00d1:
        r11 = 115; // 0x73 float:1.61E-43 double:5.7E-322;
        goto L_0x00e7;
    L_0x00d4:
        r11 = new java.util.Random;	 Catch:{ all -> 0x01a0 }
        r3 = mobi.mmdt.ott.logic.C2778b.m7093a();	 Catch:{ all -> 0x01a0 }
        r11.<init>(r3);	 Catch:{ all -> 0x01a0 }
        r1 = r10.f8855a;	 Catch:{ all -> 0x01a0 }
        r0 = r0 * r1;
        r11 = r11.nextInt(r0);	 Catch:{ all -> 0x01a0 }
        r0 = r10.f8855a;	 Catch:{ all -> 0x01a0 }
        r11 = r11 + r0;
    L_0x00e7:
        r0 = new java.lang.StringBuilder;	 Catch:{ all -> 0x01a0 }
        r1 = "ping isAlarm set: ";
        r0.<init>(r1);	 Catch:{ all -> 0x01a0 }
        r1 = r10.f8856b;	 Catch:{ all -> 0x01a0 }
        r0.append(r1);	 Catch:{ all -> 0x01a0 }
        r1 = " scheduledDelay:";
        r0.append(r1);	 Catch:{ all -> 0x01a0 }
        r1 = r10.f8860g;	 Catch:{ all -> 0x01a0 }
        r0.append(r1);	 Catch:{ all -> 0x01a0 }
        r1 = "  delay:";
        r0.append(r1);	 Catch:{ all -> 0x01a0 }
        r1 = r10.f8855a;	 Catch:{ all -> 0x01a0 }
        r0.append(r1);	 Catch:{ all -> 0x01a0 }
        r1 = " delayWithRandom:";
        r0.append(r1);	 Catch:{ all -> 0x01a0 }
        r0.append(r11);	 Catch:{ all -> 0x01a0 }
        r0 = r0.toString();	 Catch:{ all -> 0x01a0 }
        mobi.mmdt.componentsutils.p232b.p235c.C2480b.m6742f(r0);	 Catch:{ all -> 0x01a0 }
        r0 = r10.f8856b;	 Catch:{ all -> 0x01a0 }
        if (r0 == 0) goto L_0x0120;
    L_0x011a:
        r0 = r10.f8860g;	 Catch:{ all -> 0x01a0 }
        if (r0 > r11) goto L_0x0120;
    L_0x011e:
        monitor-exit(r10);
        return;
    L_0x0120:
        r0 = -4616189618054758400; // 0xbff0000000000000 float:0.0 double:-1.0;
        r3 = r10.f8859f;	 Catch:{ all -> 0x01a0 }
        r5 = 0;
        r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        r3 = 1;
        if (r7 == 0) goto L_0x014d;
    L_0x012b:
        r0 = r10.f8860g;	 Catch:{ all -> 0x01a0 }
        r0 = (double) r0;	 Catch:{ all -> 0x01a0 }
        r4 = mobi.mmdt.ott.logic.C2778b.m7093a();	 Catch:{ all -> 0x01a0 }
        r6 = r10.f8859f;	 Catch:{ all -> 0x01a0 }
        r8 = r4 - r6;
        r4 = (double) r8;	 Catch:{ all -> 0x01a0 }
        r6 = 4652007308841189376; // 0x408f400000000000 float:0.0 double:1000.0;
        r4 = r4 / r6;
        r0 = r0 - r4;
        r4 = 0;
        r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1));
        if (r6 < 0) goto L_0x014d;
    L_0x0144:
        r4 = (double) r11;	 Catch:{ all -> 0x01a0 }
        r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1));
        if (r6 > 0) goto L_0x014d;
    L_0x0149:
        r4 = r10.f8856b;	 Catch:{ all -> 0x01a0 }
        if (r4 != 0) goto L_0x014e;
    L_0x014d:
        r2 = r3;
    L_0x014e:
        r4 = new java.lang.StringBuilder;	 Catch:{ all -> 0x01a0 }
        r5 = "ping remainTime : ";
        r4.<init>(r5);	 Catch:{ all -> 0x01a0 }
        r4.append(r0);	 Catch:{ all -> 0x01a0 }
        r0 = "  setNewTimer:";
        r4.append(r0);	 Catch:{ all -> 0x01a0 }
        r4.append(r2);	 Catch:{ all -> 0x01a0 }
        r0 = r4.toString();	 Catch:{ all -> 0x01a0 }
        mobi.mmdt.componentsutils.p232b.p235c.C2480b.m6742f(r0);	 Catch:{ all -> 0x01a0 }
        if (r2 != 0) goto L_0x016b;
    L_0x0169:
        monitor-exit(r10);
        return;
    L_0x016b:
        r10.f8856b = r3;	 Catch:{ all -> 0x01a0 }
        r10.f8860g = r11;	 Catch:{ all -> 0x01a0 }
        r11 = r10.f8862i;	 Catch:{ all -> 0x01a0 }
        r11.cancel();	 Catch:{ all -> 0x01a0 }
        r11 = r10.f8862i;	 Catch:{ all -> 0x01a0 }
        r11.purge();	 Catch:{ all -> 0x01a0 }
        r11 = new java.util.Timer;	 Catch:{ all -> 0x01a0 }
        r11.<init>();	 Catch:{ all -> 0x01a0 }
        r10.f8862i = r11;	 Catch:{ all -> 0x01a0 }
        r0 = mobi.mmdt.ott.logic.C2778b.m7093a();	 Catch:{ all -> 0x01a0 }
        r10.f8859f = r0;	 Catch:{ all -> 0x01a0 }
        r11 = r10.f8862i;	 Catch:{ all -> 0x01a0 }
        r0 = new mobi.mmdt.ott.logic.core.c$1;	 Catch:{ all -> 0x01a0 }
        r0.<init>(r10);	 Catch:{ all -> 0x01a0 }
        r1 = r10.f8860g;	 Catch:{ all -> 0x01a0 }
        r1 = r1 * 1000;
        r1 = (long) r1;	 Catch:{ all -> 0x01a0 }
        r11.schedule(r0, r1);	 Catch:{ all -> 0x01a0 }
        monitor-exit(r10);
        return;
    L_0x0197:
        r10.f8855a = r1;	 Catch:{ all -> 0x01a0 }
        r11 = "AppPrefSetting.getInstance().isRegister()";
        mobi.mmdt.componentsutils.p232b.p235c.C2480b.m6742f(r11);	 Catch:{ all -> 0x01a0 }
        monitor-exit(r10);
        return;
    L_0x01a0:
        r11 = move-exception;
        monitor-exit(r10);
        throw r11;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.logic.core.c.a(int):void");
    }

    public final void m7138a(boolean z) {
        StringBuilder stringBuilder = new StringBuilder("New Reconnect called! screenTurned : ");
        stringBuilder.append(z);
        C2480b.m6742f(stringBuilder.toString());
        this.f8861h = z;
        if (z) {
            m7139b(C2799a.f8850b);
            return;
        }
        if (!C2535a.m6888a().m6912Y()) {
            C2795a.m7133b();
        }
    }

    public final void m7139b(int i) {
        C2560a.m7006a(MyApplication.m12952b());
        if (C2560a.m7007a()) {
            C2480b.m6742f("New Reconnect called! resetTimer ");
            switch (C27982.f8848a[i - 1]) {
                case 1:
                    i = 0;
                    break;
                case 2:
                    i = 2;
                    break;
                case 3:
                    i = 8;
                    break;
                case 4:
                    m7137a(32);
                    return;
                default:
                    return;
            }
            m7137a(i);
        }
    }

    public final boolean m7140b() {
        return this.f8857c > C2778b.m7093a();
    }

    final boolean m7141c() {
        return !C2535a.m6888a().m6912Y() && ((MyApplication.m12950a().f15907m == 0 || !m7136d()) && C2535a.m6888a().m6913Z() < C2778b.m7093a() - 30000);
    }
}
