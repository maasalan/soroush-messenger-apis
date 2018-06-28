package mobi.mmdt.ott.logic.p360l;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Timer;
import java.util.TimerTask;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.ott.C2544e;
import mobi.mmdt.ott.C2544e.C25411;
import mobi.mmdt.ott.logic.C2808d;
import mobi.mmdt.ott.logic.p261a.p284f.p286b.C6708s;

public final class C2842a {
    private static C2842a f8921a;
    private static HashSet<String> f8922b = new HashSet();
    private C2544e f8923c = new C2544e();

    class C28381 implements Runnable {
        final /* synthetic */ C2842a f8920a;

        C28381(C2842a c2842a) {
            this.f8920a = c2842a;
        }

        public final void run() {
            C2808d.m7148b(new C6708s(C2842a.f8922b));
        }
    }

    private C2842a() {
    }

    public static C2842a m7197a() {
        if (f8921a == null) {
            f8921a = new C2842a();
        }
        return f8921a;
    }

    public final void m7199a(HashSet<String> hashSet) {
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            StringBuilder stringBuilder = new StringBuilder("SendVisitedMessagesJob addConversationToQueue message ID : ");
            stringBuilder.append(str);
            C2480b.m6742f(stringBuilder.toString());
            f8922b.add(str);
        }
        C2544e c2544e = this.f8923c;
        c2544e.f8308c = new C28381(this);
        if (c2544e.f8306a != null) {
            c2544e.f8306a.cancel();
        }
        TimerTask c25411 = new C25411(c2544e);
        c2544e.f8306a = new Timer();
        c2544e.f8306a.schedule(c25411, (long) c2544e.f8307b);
    }
}
