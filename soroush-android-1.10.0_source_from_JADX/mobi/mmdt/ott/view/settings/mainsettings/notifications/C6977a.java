package mobi.mmdt.ott.view.settings.mainsettings.notifications;

import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import java.util.List;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.p246d.p248b.C2539e;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.settings.C6260b;
import mobi.mmdt.ott.view.settings.p583b.C7379d;
import mobi.mmdt.ott.view.settings.p583b.C7384i;
import mobi.mmdt.ott.view.settings.p583b.C7388m;
import mobi.mmdt.ott.view.settings.p583b.C7389n;
import mobi.mmdt.ott.view.tools.C4522p;

public final class C6977a extends C6260b {

    static /* synthetic */ class C44161 {
        static final /* synthetic */ int[] f12319a = new int[C2539e.m6982a().length];

        static {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r0 = mobi.mmdt.ott.p246d.p248b.C2539e.m6982a();
            r0 = r0.length;
            r0 = new int[r0];
            f12319a = r0;
            r0 = 1;
            r1 = f12319a;	 Catch:{ NoSuchFieldError -> 0x0011 }
            r2 = mobi.mmdt.ott.p246d.p248b.C2539e.f8299b;	 Catch:{ NoSuchFieldError -> 0x0011 }
            r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x0011 }
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x0011 }
        L_0x0011:
            r1 = f12319a;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r2 = mobi.mmdt.ott.p246d.p248b.C2539e.f8298a;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r3 = 2;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r1[r2] = r3;	 Catch:{ NoSuchFieldError -> 0x0019 }
        L_0x0019:
            r1 = f12319a;	 Catch:{ NoSuchFieldError -> 0x0021 }
            r2 = mobi.mmdt.ott.p246d.p248b.C2539e.f8300c;	 Catch:{ NoSuchFieldError -> 0x0021 }
            r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x0021 }
            r3 = 3;	 Catch:{ NoSuchFieldError -> 0x0021 }
            r1[r2] = r3;	 Catch:{ NoSuchFieldError -> 0x0021 }
        L_0x0021:
            r1 = f12319a;	 Catch:{ NoSuchFieldError -> 0x0029 }
            r2 = mobi.mmdt.ott.p246d.p248b.C2539e.f8301d;	 Catch:{ NoSuchFieldError -> 0x0029 }
            r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x0029 }
            r0 = 4;	 Catch:{ NoSuchFieldError -> 0x0029 }
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x0029 }
        L_0x0029:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.settings.mainsettings.notifications.a.1.<clinit>():void");
        }
    }

    protected final void mo3261a(List<C6829g> list) {
        int i;
        String a;
        List<C6829g> list2 = list;
        switch (C44161.f12319a[C2535a.m6888a().m6890A() - 1]) {
            case 2:
                i = R.string.action_disable;
                break;
            case 3:
                i = R.string.action_short;
                break;
            case 4:
                i = R.string.action_long;
                break;
            default:
                a = C4522p.m8236a(R.string.action_default);
                break;
        }
        a = C4522p.m8236a(i);
        boolean D = C2535a.m6888a().m6893D();
        boolean O = C2535a.m6888a().m6903O();
        boolean booleanValue = C2535a.m6888a().ai().booleanValue();
        String str = "None";
        Uri E = C2535a.m6888a().m6894E();
        if (E != null) {
            Ringtone ringtone = RingtoneManager.getRingtone(getActivity(), E);
            if (ringtone != null) {
                str = ringtone.getTitle(getActivity());
            }
        }
        String str2 = str;
        int K = C2535a.m6888a().m6899K();
        boolean Y = C2535a.m6888a().m6912Y();
        list.clear();
        list2.add(new C7388m(C4522p.m8236a(R.string.always_enable_title), C4522p.m8236a(R.string.always_enable_sub_title), Y, 5005, 0));
        list2.add(new C7389n(C4522p.m8236a(R.string.enable_send_message_sound), booleanValue, 4003, 1));
        list2.add(new C7389n(C4522p.m8236a(R.string.notifications_switch_text), O ^ 1, 4002, 2));
        if (!O) {
            list2.add(new C7388m(C4522p.m8236a(R.string.notifications_message_preview), C4522p.m8236a(R.string.notifications_message_preview_description), D, 5002, 3));
            list2.add(new C7379d(C4522p.m8236a(R.string.notifications_sound), str2, 2008, 4));
            list2.add(new C7379d(C4522p.m8236a(R.string.vibrate), a, 2005, 5));
            list2.add(new C7384i(C4522p.m8236a(R.string.led_color), "●", K));
        }
    }
}
