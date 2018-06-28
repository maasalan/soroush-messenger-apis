package mobi.mmdt.ott.view.conversation.p432e.p445b;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b.p292b.C2664g;
import mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b.p292b.C2665h;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.view.conversation.p418a.C3284e;
import mobi.mmdt.ott.view.conversation.p573f.C7197a;

public final class C7356c extends C7195a {
    protected TextView f21295e = ((TextView) this.itemView.findViewById(R.id.message_textView));
    private final C3284e f21296f;
    private LinearLayout f21297g = ((LinearLayout) this.itemView.findViewById(R.id.call_linear_layout));
    private C2664g f21298h;

    class C39831 implements OnClickListener {
        final /* synthetic */ C7356c f11481a;

        C39831(C7356c c7356c) {
            this.f11481a = c7356c;
        }

        public final void onClick(View view) {
            this.f11481a.f21296f.mo2333e((C7197a) this.f11481a.f16244a);
        }
    }

    static /* synthetic */ class C39842 {
        static final /* synthetic */ int[] f11482a = new int[C2665h.m7058a().length];

        static {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r0 = mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b.p292b.C2665h.m7058a();
            r0 = r0.length;
            r0 = new int[r0];
            f11482a = r0;
            r0 = 1;
            r1 = f11482a;	 Catch:{ NoSuchFieldError -> 0x0011 }
            r2 = mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b.p292b.C2665h.f8589g;	 Catch:{ NoSuchFieldError -> 0x0011 }
            r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x0011 }
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x0011 }
        L_0x0011:
            r1 = f11482a;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r2 = mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b.p292b.C2665h.f8583a;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r3 = 2;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r1[r2] = r3;	 Catch:{ NoSuchFieldError -> 0x0019 }
        L_0x0019:
            r1 = f11482a;	 Catch:{ NoSuchFieldError -> 0x0021 }
            r2 = mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b.p292b.C2665h.f8590h;	 Catch:{ NoSuchFieldError -> 0x0021 }
            r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x0021 }
            r3 = 3;	 Catch:{ NoSuchFieldError -> 0x0021 }
            r1[r2] = r3;	 Catch:{ NoSuchFieldError -> 0x0021 }
        L_0x0021:
            r1 = f11482a;	 Catch:{ NoSuchFieldError -> 0x0029 }
            r2 = mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b.p292b.C2665h.f8588f;	 Catch:{ NoSuchFieldError -> 0x0029 }
            r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x0029 }
            r3 = 4;	 Catch:{ NoSuchFieldError -> 0x0029 }
            r1[r2] = r3;	 Catch:{ NoSuchFieldError -> 0x0029 }
        L_0x0029:
            r1 = f11482a;	 Catch:{ NoSuchFieldError -> 0x0031 }
            r2 = mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b.p292b.C2665h.f8584b;	 Catch:{ NoSuchFieldError -> 0x0031 }
            r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x0031 }
            r3 = 5;	 Catch:{ NoSuchFieldError -> 0x0031 }
            r1[r2] = r3;	 Catch:{ NoSuchFieldError -> 0x0031 }
        L_0x0031:
            r1 = f11482a;	 Catch:{ NoSuchFieldError -> 0x0039 }
            r2 = mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b.p292b.C2665h.f8585c;	 Catch:{ NoSuchFieldError -> 0x0039 }
            r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x0039 }
            r3 = 6;	 Catch:{ NoSuchFieldError -> 0x0039 }
            r1[r2] = r3;	 Catch:{ NoSuchFieldError -> 0x0039 }
        L_0x0039:
            r1 = f11482a;	 Catch:{ NoSuchFieldError -> 0x0041 }
            r2 = mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b.p292b.C2665h.f8587e;	 Catch:{ NoSuchFieldError -> 0x0041 }
            r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x0041 }
            r3 = 7;	 Catch:{ NoSuchFieldError -> 0x0041 }
            r1[r2] = r3;	 Catch:{ NoSuchFieldError -> 0x0041 }
        L_0x0041:
            r1 = f11482a;	 Catch:{ NoSuchFieldError -> 0x004a }
            r2 = mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b.p292b.C2665h.f8586d;	 Catch:{ NoSuchFieldError -> 0x004a }
            r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x004a }
            r0 = 8;	 Catch:{ NoSuchFieldError -> 0x004a }
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x004a }
        L_0x004a:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.conversation.e.b.c.2.<clinit>():void");
        }
    }

    public C7356c(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, C3284e c3284e) {
        super(activity, layoutInflater, viewGroup, R.layout.chat_event_list_item);
        this.f21296f = c3284e;
        this.itemView.setOnClickListener(new C39831(this));
        C2491i.m6802a(this.f21295e, UIThemeManager.getmInstance().getDate_bubble_text_color());
        C2491i.m6821b(this.f21295e, UIThemeManager.getmInstance().getInput_link_message_text_color());
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected final void mo3180a(mobi.mmdt.ott.view.components.p401c.C6829g r7) {
        /*
        r6 = this;
        r7 = (mobi.mmdt.ott.view.conversation.p573f.p598b.C7562c) r7;
        super.m19053a(r7);
        r0 = r7.f21345p;
        r1 = r7.f21343n;
        r2 = r7.f21342m;
        r3 = 0;
        r4 = 1;
        if (r2 == 0) goto L_0x002a;
    L_0x000f:
        r5 = mobi.mmdt.ott.provider.p384f.C2973m.CHANNEL;
        if (r2 == r5) goto L_0x001e;
    L_0x0013:
        r5 = mobi.mmdt.ott.provider.p384f.C2973m.CHANNEL_DIRECT;
        if (r2 == r5) goto L_0x001e;
    L_0x0017:
        r5 = mobi.mmdt.ott.provider.p384f.C2973m.CHANNEL_REPLY;
        if (r2 != r5) goto L_0x001c;
    L_0x001b:
        goto L_0x001e;
    L_0x001c:
        r2 = r3;
        goto L_0x001f;
    L_0x001e:
        r2 = r4;
    L_0x001f:
        if (r2 == 0) goto L_0x002a;
    L_0x0021:
        r2 = "CHANNEL_MEMBERSHIP_ADD";
        r2 = r1.equals(r2);
        if (r2 == 0) goto L_0x002a;
    L_0x0029:
        r3 = r4;
    L_0x002a:
        if (r3 == 0) goto L_0x0046;
    L_0x002c:
        r1 = r7.f21346q;
        r2 = r7.f21341l;
        r3 = r6.c;
        r0 = mobi.mmdt.ott.view.tools.C4532q.m8239a(r3, r0, r1, r2);
    L_0x0036:
        r1 = r6.f21295e;
        r1.setText(r0);
    L_0x003b:
        r0 = r6.f21295e;
        r1 = android.text.method.LinkMovementMethod.getInstance();
        r0.setMovementMethod(r1);
        goto L_0x0101;
    L_0x0046:
        r2 = new mobi.mmdt.ott.logic.a.g.a.b.b.g;
        r2.<init>(r1);
        r6.f21298h = r2;
        r2 = r6.f21298h;
        r2 = r2.f8581a;
        r3 = mobi.mmdt.ott.view.conversation.p432e.p445b.C7356c.C39842.f11482a;
        r2 = r2 - r4;
        r2 = r3[r2];
        r3 = 2131689479; // 0x7f0f0007 float:1.9007975E38 double:1.053194539E-314;
        switch(r2) {
            case 1: goto L_0x00fc;
            case 2: goto L_0x00db;
            case 3: goto L_0x00c4;
            case 4: goto L_0x00ae;
            case 5: goto L_0x0099;
            case 6: goto L_0x0089;
            case 7: goto L_0x0074;
            case 8: goto L_0x005e;
            default: goto L_0x005c;
        };
    L_0x005c:
        goto L_0x0101;
    L_0x005e:
        r2 = r6.f21298h;
        r2 = r2.f8582b;
        r2 = (mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b.p292b.C5934j) r2;
        if (r2 != 0) goto L_0x006d;
    L_0x0066:
        r0 = r6.f21295e;
        r1 = 2131690420; // 0x7f0f03b4 float:1.9009883E38 double:1.053195004E-314;
        goto L_0x00e8;
    L_0x006d:
        r2 = r6.c;
        r0 = mobi.mmdt.ott.view.tools.C4532q.m8252f(r2, r0, r1);
        goto L_0x0036;
    L_0x0074:
        r2 = r6.f21298h;
        r2 = r2.f8582b;
        r2 = (mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b.p292b.C5933f) r2;
        if (r2 != 0) goto L_0x0082;
    L_0x007c:
        r0 = r6.f21295e;
        r1 = 2131690419; // 0x7f0f03b3 float:1.9009881E38 double:1.0531950036E-314;
        goto L_0x00e8;
    L_0x0082:
        r2 = r6.c;
        r0 = mobi.mmdt.ott.view.tools.C4532q.m8250e(r2, r0, r1);
        goto L_0x0036;
    L_0x0089:
        r2 = r6.f21298h;
        r2 = r2.f8582b;
        r2 = (mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b.p292b.C5932e) r2;
        if (r2 != 0) goto L_0x0092;
    L_0x0091:
        goto L_0x00cc;
    L_0x0092:
        r2 = r6.c;
        r0 = mobi.mmdt.ott.view.tools.C4532q.m8246c(r2, r0, r1);
        goto L_0x0036;
    L_0x0099:
        r2 = r6.f21298h;
        r2 = r2.f8582b;
        r2 = (mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b.p292b.C5930c) r2;
        if (r2 != 0) goto L_0x00a7;
    L_0x00a1:
        r0 = r6.f21295e;
        r1 = 2131690530; // 0x7f0f0422 float:1.9010106E38 double:1.0531950584E-314;
        goto L_0x00e8;
    L_0x00a7:
        r2 = r6.c;
        r0 = mobi.mmdt.ott.view.tools.C4532q.m8244b(r2, r0, r1);
        goto L_0x0036;
    L_0x00ae:
        r2 = r6.f21298h;
        r2 = r2.f8582b;
        r2 = (mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b.p292b.C5928a) r2;
        if (r2 != 0) goto L_0x00bc;
    L_0x00b6:
        r0 = r6.f21295e;
        r1 = 2131690009; // 0x7f0f0219 float:1.900905E38 double:1.053194801E-314;
        goto L_0x00e8;
    L_0x00bc:
        r2 = r6.c;
        r0 = mobi.mmdt.ott.view.tools.C4532q.m8238a(r2, r0, r1);
        goto L_0x0036;
    L_0x00c4:
        r2 = r6.f21298h;
        r2 = r2.f8582b;
        r2 = (mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b.p292b.C5931d) r2;
        if (r2 != 0) goto L_0x00d3;
    L_0x00cc:
        r0 = r6.f21295e;
        r1 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r3);
        goto L_0x00fe;
    L_0x00d3:
        r2 = r6.c;
        r0 = mobi.mmdt.ott.view.tools.C4532q.m8248d(r2, r0, r1);
        goto L_0x0036;
    L_0x00db:
        r0 = r6.f21298h;
        r0 = r0.f8582b;
        r0 = (mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b.p292b.C5929b) r0;
        if (r0 != 0) goto L_0x00ed;
    L_0x00e3:
        r0 = r6.f21295e;
        r1 = 2131690010; // 0x7f0f021a float:1.9009052E38 double:1.0531948015E-314;
    L_0x00e8:
        r1 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r1);
        goto L_0x00fe;
    L_0x00ed:
        r0 = r6.c;
        r0 = mobi.mmdt.ott.view.tools.C4532q.m8237a(r0, r1);
        r1 = r6.f21295e;
        r2 = android.widget.TextView.BufferType.SPANNABLE;
        r1.setText(r0, r2);
        goto L_0x003b;
    L_0x00fc:
        r0 = r6.f21295e;
    L_0x00fe:
        r0.setText(r1);
    L_0x0101:
        r0 = r6.f21297g;
        r6.m19054a(r7, r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.conversation.e.b.c.a(mobi.mmdt.ott.view.components.c.g):void");
    }
}
