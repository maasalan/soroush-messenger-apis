package mobi.mmdt.ott.logic.notifications;

import me.leolin.shortcutbadger.C2461c;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.logic.p360l.p362b.C2844b;
import mobi.mmdt.ott.provider.p385g.C2980g;

public final class C2874b {
    public static void m7229a() {
        C2844b.m7202a(C2980g.m7431a());
        C2874b.m7230a(C2844b.m7200a());
    }

    public static void m7230a(int i) {
        StringBuilder stringBuilder = new StringBuilder("UpdateNotificationJob BadgeManager updateNumber to ");
        stringBuilder.append(i);
        C2480b.m6742f(stringBuilder.toString());
        if (C2461c.m6693a(MyApplication.m12952b())) {
            C2461c.m6694a(MyApplication.m12952b(), i);
        }
    }
}
