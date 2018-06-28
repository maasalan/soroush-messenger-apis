package mobi.mmdt.ott.logic.core;

import java.util.Timer;
import java.util.TimerTask;
import mobi.mmdt.ott.logic.p360l.C5996e;

public final class C2802d {
    private static C2802d f8865a;

    private C2802d() {
    }

    public static C2802d m7142a() {
        if (f8865a == null) {
            f8865a = new C2802d();
        }
        return f8865a;
    }

    public final synchronized void m7143a(final String str) {
        if (C5996e.m13260a().f16147a.m7105a(false)) {
            new Timer().schedule(new TimerTask(this) {
                final /* synthetic */ C2802d f8864b;

                public final void run() {
                    this.f8864b.m7144b(str);
                }
            }, 3000);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    final synchronized void m7144b(java.lang.String r5) {
        /*
        r4 = this;
        monitor-enter(r4);
        r0 = new mobi.mmdt.ott.provider.f.g;	 Catch:{ all -> 0x0058 }
        r0.<init>();	 Catch:{ all -> 0x0058 }
        r1 = 1;
        r2 = new java.lang.String[r1];	 Catch:{ all -> 0x0058 }
        r3 = 0;
        r2[r3] = r5;	 Catch:{ all -> 0x0058 }
        r0.m13378a(r2);	 Catch:{ all -> 0x0058 }
        r5 = r0.m13393i();	 Catch:{ all -> 0x0058 }
        r0 = 0;
        r2 = r5.moveToFirst();	 Catch:{ all -> 0x0058 }
        if (r2 == 0) goto L_0x001e;
    L_0x001a:
        r0 = r5.m13370j();	 Catch:{ all -> 0x0058 }
    L_0x001e:
        r5.close();	 Catch:{ all -> 0x0058 }
        if (r0 == 0) goto L_0x0056;
    L_0x0023:
        r5 = mobi.mmdt.ott.provider.p384f.C2971k.SENDING;	 Catch:{ all -> 0x0058 }
        r5 = r0.equals(r5);	 Catch:{ all -> 0x0058 }
        if (r5 == 0) goto L_0x0056;
    L_0x002b:
        r5 = mobi.mmdt.ott.logic.p360l.C5996e.m13260a();	 Catch:{ all -> 0x0058 }
        r5 = r5.f16147a;	 Catch:{ all -> 0x0058 }
        r5 = r5.m7105a(r3);	 Catch:{ all -> 0x0058 }
        if (r5 == 0) goto L_0x0056;
    L_0x0037:
        r5 = mobi.mmdt.ott.logic.p360l.C5996e.m13260a();	 Catch:{ all -> 0x0058 }
        r5 = r5.f16147a;	 Catch:{ all -> 0x0058 }
        r5 = r5.m7105a(r1);	 Catch:{ all -> 0x0058 }
        if (r5 == 0) goto L_0x004d;
    L_0x0043:
        r5 = new mobi.mmdt.ott.logic.a.g.a.b.l;	 Catch:{ all -> 0x0058 }
        r5.<init>();	 Catch:{ all -> 0x0058 }
        mobi.mmdt.ott.logic.C2808d.m7147a(r5);	 Catch:{ all -> 0x0058 }
        monitor-exit(r4);
        return;
    L_0x004d:
        r5 = mobi.mmdt.ott.logic.core.C2800c.m7135a();	 Catch:{ all -> 0x0058 }
        r0 = mobi.mmdt.ott.logic.core.C2800c.C2799a.f8850b;	 Catch:{ all -> 0x0058 }
        r5.m7139b(r0);	 Catch:{ all -> 0x0058 }
    L_0x0056:
        monitor-exit(r4);
        return;
    L_0x0058:
        r5 = move-exception;
        monitor-exit(r4);
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.logic.core.d.b(java.lang.String):void");
    }
}
