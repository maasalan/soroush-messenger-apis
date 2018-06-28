package mobi.mmdt.ott.view.conversation.activities.p419a;

import android.app.Dialog;
import android.app.SearchManager;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.C0417s.C0416a;
import android.support.v4.p029a.C0350e;
import android.support.v7.app.C6389b.C0663a;
import android.support.v7.app.C7406c;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.SearchView.OnQueryTextListener;
import android.text.Html;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.p072b.p073a.p074a.C1063i;
import java.util.ArrayList;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.C2778b;
import mobi.mmdt.ott.logic.C2808d;
import mobi.mmdt.ott.logic.p261a.ab.C2582a;
import mobi.mmdt.ott.logic.p261a.ab.p542a.C6649a;
import mobi.mmdt.ott.logic.p261a.p277c.C2630a;
import mobi.mmdt.ott.logic.p261a.p277c.C6683c;
import mobi.mmdt.ott.logic.p261a.p284f.p285a.C2644e;
import mobi.mmdt.ott.logic.p261a.p284f.p285a.C2645g;
import mobi.mmdt.ott.logic.p261a.p284f.p285a.C2649n;
import mobi.mmdt.ott.logic.p261a.p284f.p285a.C2650p;
import mobi.mmdt.ott.logic.p261a.p284f.p285a.C2651r;
import mobi.mmdt.ott.logic.p261a.p284f.p285a.C2652u;
import mobi.mmdt.ott.logic.p261a.p284f.p285a.C5917d;
import mobi.mmdt.ott.logic.p261a.p284f.p285a.C5918f;
import mobi.mmdt.ott.logic.p261a.p284f.p285a.C5921m;
import mobi.mmdt.ott.logic.p261a.p284f.p285a.C5922o;
import mobi.mmdt.ott.logic.p261a.p284f.p285a.C5923q;
import mobi.mmdt.ott.logic.p261a.p284f.p285a.C5925t;
import mobi.mmdt.ott.logic.p261a.p284f.p286b.C6694c;
import mobi.mmdt.ott.logic.p261a.p284f.p286b.C6695d;
import mobi.mmdt.ott.logic.p261a.p284f.p286b.C6696e;
import mobi.mmdt.ott.logic.p261a.p284f.p286b.C6697f;
import mobi.mmdt.ott.logic.p261a.p284f.p286b.C6698g;
import mobi.mmdt.ott.logic.p261a.p284f.p286b.C6704m;
import mobi.mmdt.ott.logic.p261a.p284f.p286b.C6707p;
import mobi.mmdt.ott.logic.p261a.p284f.p286b.C6711v;
import mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b.C6721j;
import mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b.C6725n;
import mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b.C6726o;
import mobi.mmdt.ott.logic.p261a.p287g.p293b.C2674a;
import mobi.mmdt.ott.logic.p261a.p298k.C6749n;
import mobi.mmdt.ott.logic.p261a.p298k.C6750o;
import mobi.mmdt.ott.logic.p261a.p298k.C6751p;
import mobi.mmdt.ott.logic.p261a.p298k.C6753r;
import mobi.mmdt.ott.logic.p261a.p298k.p299a.C2707u;
import mobi.mmdt.ott.logic.p261a.p298k.p299a.C5949z;
import mobi.mmdt.ott.logic.p261a.p301l.p302a.C2716a;
import mobi.mmdt.ott.logic.p261a.p301l.p548b.C6754a;
import mobi.mmdt.ott.logic.p261a.p301l.p548b.C6757d;
import mobi.mmdt.ott.logic.p261a.p303m.C6762d;
import mobi.mmdt.ott.logic.p261a.p308q.p310b.C2731a;
import mobi.mmdt.ott.logic.p261a.p320t.C6777a;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.p240c.C2524c.C2522a;
import mobi.mmdt.ott.provider.p384f.C2966b;
import mobi.mmdt.ott.provider.p384f.C2973m;
import mobi.mmdt.ott.provider.p384f.C7316h;
import mobi.mmdt.ott.provider.p385g.C2974a;
import mobi.mmdt.ott.provider.p385g.C2977d;
import mobi.mmdt.ott.provider.p385g.C2980g;
import mobi.mmdt.ott.provider.p386h.C2988j;
import mobi.mmdt.ott.provider.p390l.C3004f;
import mobi.mmdt.ott.view.components.p398a.C7175a.C3101a;
import mobi.mmdt.ott.view.components.p402d.C7576b;
import mobi.mmdt.ott.view.conversation.activities.a.b.AnonymousClass17;
import mobi.mmdt.ott.view.conversation.activities.a.b.AnonymousClass23;
import mobi.mmdt.ott.view.conversation.activities.a.b.AnonymousClass24;
import mobi.mmdt.ott.view.conversation.activities.p419a.C6873b;
import mobi.mmdt.ott.view.conversation.activities.p419a.C6873b.23.C33171;
import mobi.mmdt.ott.view.conversation.activities.p419a.C6873b.24.C33181;
import mobi.mmdt.ott.view.conversation.bot.BotInfoActivity;
import mobi.mmdt.ott.view.conversation.editchannelinfo.EditChannelInfoActivity;
import mobi.mmdt.ott.view.conversation.p418a.C3280a;
import mobi.mmdt.ott.view.tools.C4478a;
import mobi.mmdt.ott.view.tools.C4488b;
import mobi.mmdt.ott.view.tools.C4513i;
import mobi.mmdt.ott.view.tools.C4522p;

public final class C6873b extends C6123a implements C3101a, C3280a {
    private boolean aA;
    private MenuItem aB;
    private SearchView aC;
    private C7316h aD;
    private MenuItem aE;
    private OnClickListener aF = new OnClickListener(this) {
        final /* synthetic */ C6873b f10166a;

        {
            this.f10166a = r1;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C2808d.m7147a(new C6707p(this.f10166a.aj));
        }
    };
    public boolean ah = true;
    C3004f ai = C3004f.NONE;
    String aj;
    MenuItem ak;
    MenuItem al;
    boolean am;
    boolean an;
    Button ao;
    TextView ap;
    int aq = C2977d.f9306a;
    int ar = -1;
    String as = "";
    boolean at;
    boolean au;
    boolean av;
    boolean aw = false;
    C2974a ax;
    String ay;
    C0416a<Cursor> az = new C61241(this);

    static /* synthetic */ class AnonymousClass17 {
        static final /* synthetic */ int[] f10173a = new int[C2977d.m7421a().length];

        static {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r0 = mobi.mmdt.ott.provider.p390l.C3004f.values();
            r0 = r0.length;
            r0 = new int[r0];
            f10174b = r0;
            r0 = 1;
            r1 = f10174b;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = mobi.mmdt.ott.provider.p390l.C3004f.VISITOR;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = r2.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r1 = 2;
            r2 = f10174b;	 Catch:{ NoSuchFieldError -> 0x001f }
            r3 = mobi.mmdt.ott.provider.p390l.C3004f.NONE;	 Catch:{ NoSuchFieldError -> 0x001f }
            r3 = r3.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2[r3] = r1;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r2 = 3;
            r3 = f10174b;	 Catch:{ NoSuchFieldError -> 0x002a }
            r4 = mobi.mmdt.ott.provider.p390l.C3004f.MEMBER;	 Catch:{ NoSuchFieldError -> 0x002a }
            r4 = r4.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r3[r4] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r3 = 4;
            r4 = f10174b;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r5 = mobi.mmdt.ott.provider.p390l.C3004f.ADMIN;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r5 = r5.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r4[r5] = r3;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            r4 = f10174b;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r5 = mobi.mmdt.ott.provider.p390l.C3004f.OWNER;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r5 = r5.ordinal();	 Catch:{ NoSuchFieldError -> 0x0040 }
            r6 = 5;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r4[r5] = r6;	 Catch:{ NoSuchFieldError -> 0x0040 }
        L_0x0040:
            r4 = mobi.mmdt.ott.provider.p385g.C2977d.m7421a();
            r4 = r4.length;
            r4 = new int[r4];
            f10173a = r4;
            r4 = f10173a;	 Catch:{ NoSuchFieldError -> 0x0050 }
            r5 = mobi.mmdt.ott.provider.p385g.C2977d.f9307b;	 Catch:{ NoSuchFieldError -> 0x0050 }
            r5 = r5 - r0;	 Catch:{ NoSuchFieldError -> 0x0050 }
            r4[r5] = r0;	 Catch:{ NoSuchFieldError -> 0x0050 }
        L_0x0050:
            r4 = f10173a;	 Catch:{ NoSuchFieldError -> 0x0057 }
            r5 = mobi.mmdt.ott.provider.p385g.C2977d.f9308c;	 Catch:{ NoSuchFieldError -> 0x0057 }
            r5 = r5 - r0;	 Catch:{ NoSuchFieldError -> 0x0057 }
            r4[r5] = r1;	 Catch:{ NoSuchFieldError -> 0x0057 }
        L_0x0057:
            r1 = f10173a;	 Catch:{ NoSuchFieldError -> 0x005e }
            r4 = mobi.mmdt.ott.provider.p385g.C2977d.f9309d;	 Catch:{ NoSuchFieldError -> 0x005e }
            r4 = r4 - r0;	 Catch:{ NoSuchFieldError -> 0x005e }
            r1[r4] = r2;	 Catch:{ NoSuchFieldError -> 0x005e }
        L_0x005e:
            r1 = f10173a;	 Catch:{ NoSuchFieldError -> 0x0065 }
            r2 = mobi.mmdt.ott.provider.p385g.C2977d.f9306a;	 Catch:{ NoSuchFieldError -> 0x0065 }
            r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x0065 }
            r1[r2] = r3;	 Catch:{ NoSuchFieldError -> 0x0065 }
        L_0x0065:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.conversation.activities.a.b.17.<clinit>():void");
        }
    }

    class C33258 implements Runnable {
        final /* synthetic */ C6873b f10196a;

        C33258(C6873b c6873b) {
            this.f10196a = c6873b;
        }

        public final void run() {
        }
    }

    class C33269 implements Runnable {
        final /* synthetic */ C6873b f10197a;

        C33269(C6873b c6873b) {
            this.f10197a = c6873b;
        }

        public final void run() {
            ((C7576b) this.f10197a.f10377a).m19190e().mo270b(53, null, this.f10197a.az);
        }
    }

    class C61241 implements C0416a<Cursor> {
        final /* synthetic */ C6873b f16505a;

        class C33162 implements Runnable {
            final /* synthetic */ C61241 f10161a;

            C33162(C61241 c61241) {
                this.f10161a = c61241;
            }

            public final void run() {
                if (this.f10161a.f16505a.ak != null) {
                    this.f10161a.f16505a.ak.setChecked(this.f10161a.f16505a.n);
                    this.f10161a.f16505a.ak.setVisible(this.f10161a.f16505a.an);
                    if (this.f10161a.f16505a.aq != C2977d.f9306a) {
                        this.f10161a.f16505a.al.setVisible(false);
                    } else {
                        this.f10161a.f16505a.al.setVisible(true);
                    }
                    if (!(this.f10161a.f16505a.ak == null || AnonymousClass17.f10173a[this.f10161a.f16505a.aq - 1] != 4 || this.f10161a.f16505a.ai == C3004f.ADMIN || this.f10161a.f16505a.ai == C3004f.OWNER)) {
                        if (this.f10161a.f16505a.at || this.f10161a.f16505a.aw) {
                            this.f10161a.f16505a.ak.setVisible(false);
                            if (this.f10161a.f16505a.aw) {
                                this.f10161a.f16505a.al.setVisible(false);
                            }
                        }
                        this.f10161a.f16505a.af();
                    }
                }
            }
        }

        C61241(C6873b c6873b) {
            this.f16505a = c6873b;
        }

        public final C0350e<Cursor> mo2226a(int i, Bundle bundle) {
            return C2980g.m7443d(this.f16505a.aj);
        }

        public final void mo2227a() {
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void mo2228a(android.support.v4.p029a.C0350e r12, java.lang.Object r13) {
            /*
            r11 = this;
            r13 = (android.database.Cursor) r13;
            r12 = r13.moveToFirst();
            if (r12 == 0) goto L_0x02be;
        L_0x0008:
            r12 = new mobi.mmdt.ott.provider.g.j;
            r12.<init>(r13);
            r13 = r11.f16505a;
            r13 = r13.aj;
            r0 = r12.m13423a();
            r13 = r13.equals(r0);
            if (r13 == 0) goto L_0x02bd;
        L_0x001b:
            r13 = r11.f16505a;
            r0 = "dialog_keyboard";
            r0 = r12.m7352a(r0);
            r13.ay = r0;
            r13 = r11.f16505a;
            r13 = r13.ay;
            if (r13 != 0) goto L_0x0038;
        L_0x002b:
            r13 = r11.f16505a;
            r13 = r13.j;
            r0 = r11.f16505a;
            r0 = r0.f10377a;
            r0 = (mobi.mmdt.ott.view.components.p402d.C7576b) r0;
            r13.m14065c(r0);
        L_0x0038:
            r13 = r11.f16505a;
            r0 = r12.m13435m();
            r13.ax = r0;
            r13 = r11.f16505a;
            r0 = r12.m13424b();
            r13.ai = r0;
            r13 = "dialog_extra";
            r13 = r12.m7352a(r13);
            r0 = r11.f16505a;
            r0 = r0.g;
            r1 = 8;
            r2 = 0;
            if (r0 == 0) goto L_0x0083;
        L_0x0057:
            r0 = r11.f16505a;
            r0 = r0.g;
            r3 = r0.f16548G;
            if (r3 == 0) goto L_0x0083;
        L_0x005f:
            r3 = r0.f16574g;
            if (r3 == 0) goto L_0x0083;
        L_0x0063:
            r3 = r0.f16574g;
            r3 = r3.getItemCount();
            if (r3 > 0) goto L_0x007e;
        L_0x006b:
            if (r13 == 0) goto L_0x007e;
        L_0x006d:
            r3 = r13.isEmpty();
            if (r3 != 0) goto L_0x007e;
        L_0x0073:
            r3 = r0.f16548G;
            r3.setVisibility(r2);
            r0 = r0.f16548G;
            r0.setText(r13);
            goto L_0x0083;
        L_0x007e:
            r13 = r0.f16548G;
            r13.setVisibility(r1);
        L_0x0083:
            r13 = r11.f16505a;
            r13 = r13.i;
            r0 = r11.f16505a;
            r0 = r0.f10377a;
            r0 = (mobi.mmdt.ott.view.components.p402d.C7576b) r0;
            r3 = r11.f16505a;
            r3 = r3.aj;
            r0 = mobi.mmdt.componentsutils.p232b.C2491i.m6806b(r0, r3);
            r13.setBackgroundColor(r0);
            r13 = r11.f16505a;
            r0 = "dialog_title";
            r0 = r12.m7352a(r0);
            r13.m13978a(r0, r2);
            r13 = r12.m13426d();
            r0 = r12.m13424b();
            r3 = mobi.mmdt.ott.provider.p390l.C3004f.ADMIN;
            r0 = r0.equals(r3);
            if (r0 != 0) goto L_0x00c7;
        L_0x00b3:
            r0 = r12.m13424b();
            r3 = mobi.mmdt.ott.provider.p390l.C3004f.OWNER;
            r0 = r0.equals(r3);
            if (r0 != 0) goto L_0x00c7;
        L_0x00bf:
            r0 = r11.f16505a;
            r3 = r12.m13427e();
            r0.ah = r3;
        L_0x00c7:
            r0 = r11.f16505a;
            r3 = r12.m13433k();
            if (r3 == 0) goto L_0x00d4;
        L_0x00cf:
            r3 = r12.m13433k();
            goto L_0x00d6;
        L_0x00d4:
            r3 = mobi.mmdt.ott.provider.p385g.C2977d.f9306a;
        L_0x00d6:
            r0.aq = r3;
            r0 = 2131689958; // 0x7f0f01e6 float:1.9008946E38 double:1.053194776E-314;
            r0 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r0);
            r3 = 2131689959; // 0x7f0f01e7 float:1.9008948E38 double:1.0531947763E-314;
            r3 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r3);
            r4 = r11.f16505a;
            r5 = r11.f16505a;
            r5 = r5.f10377a;
            r5 = (mobi.mmdt.ott.view.components.p402d.C7576b) r5;
            r13 = (float) r13;
            r13 = mobi.mmdt.componentsutils.p232b.C2491i.m6766a(r5, r13, r0, r3);
            r4.m13990b(r13);
            r13 = "dialog_avatar_thumbnail_url";
            r13 = r12.m7352a(r13);
            r0 = 2131232028; // 0x7f08051c float:1.8080154E38 double:1.0529685284E-314;
            if (r13 == 0) goto L_0x015d;
        L_0x0101:
            r3 = r13.isEmpty();
            if (r3 != 0) goto L_0x015d;
        L_0x0107:
            r3 = r11.f16505a;
            r3 = r3.f10377a;
            r3 = (mobi.mmdt.ott.view.components.p402d.C7576b) r3;
            r4 = 1108344832; // 0x42100000 float:36.0 double:5.47595105E-315;
            r3 = mobi.mmdt.componentsutils.p232b.C2491i.m6804b(r3, r4);
            r3 = (int) r3;
            r4 = r11.f16505a;
            r4 = r4.f10377a;
            r4 = (mobi.mmdt.ott.view.components.p402d.C7576b) r4;
            if (r4 == 0) goto L_0x0182;
        L_0x011c:
            r4 = r11.f16505a;
            r4 = r4.f10377a;
            r4 = (mobi.mmdt.ott.view.components.p402d.C7576b) r4;
            r4 = com.p085c.p086a.C1212c.m2873a(r4);
            r4 = r4.m10958e();
            r13 = mobi.mmdt.ott.lib_webservicescomponent.p257d.C2556b.m6998a(r13);
            r13 = mobi.mmdt.ott.view.tools.C4515k.m8231a(r13);
            r13 = r4.m3037a(r13);
            r4 = com.p085c.p086a.p105g.C1248f.m2945b();
            r5 = com.p085c.p086a.p089c.p092b.C1144h.f3689a;
            r4 = r4.m2955b(r5);
            r4 = r4.m2962h();
            r0 = r4.m2949a(r0);
            r0 = r0.m2954b(r3, r3);
            r13 = r13.m3034a(r0);
            r0 = new mobi.mmdt.ott.view.conversation.activities.a.b$1$1;
            r3 = r11.f16505a;
            r3 = r3.i;
            r0.<init>(r11, r3);
            r13.m3032a(r0);
            goto L_0x0182;
        L_0x015d:
            r13 = r11.f16505a;
            r13 = r13.f10377a;
            r13 = (mobi.mmdt.ott.view.components.p402d.C7576b) r13;
            r13 = com.p085c.p086a.C1212c.m2872a(r13);
            r0 = java.lang.Integer.valueOf(r0);
            r13 = r13.m10950a(r0);
            r0 = com.p085c.p086a.p105g.C1248f.m2945b();
            r13 = r13.m3034a(r0);
            r13 = r13.m3033a();
            r0 = r11.f16505a;
            r0 = r0.i;
            r13.m3031a(r0);
        L_0x0182:
            r13 = r11.f16505a;
            r13 = r13.ai;
            r0 = mobi.mmdt.ott.provider.p390l.C3004f.NONE;
            r3 = 1;
            if (r13 == r0) goto L_0x0197;
        L_0x018b:
            r13 = r11.f16505a;
            r13.an = r3;
            r13 = r11.f16505a;
            r13 = r13.ao;
            r13.setVisibility(r1);
            goto L_0x01a2;
        L_0x0197:
            r13 = r11.f16505a;
            r13.an = r2;
            r13 = r11.f16505a;
            r13 = r13.ao;
            r13.setVisibility(r2);
        L_0x01a2:
            r13 = r11.f16505a;
            r13 = r13.h;
            r13.setCompoundDrawablesWithIntrinsicBounds(r2, r2, r2, r2);
            r13 = r11.f16505a;
            r13 = r13.h;
            r13.setCompoundDrawablePadding(r2);
            r13 = mobi.mmdt.ott.view.conversation.activities.a.b.AnonymousClass17.f10174b;
            r0 = r11.f16505a;
            r0 = r0.ai;
            r0 = r0.ordinal();
            r13 = r13[r0];
            r0 = 2131232044; // 0x7f08052c float:1.8080186E38 double:1.0529685363E-314;
            r4 = 2131689766; // 0x7f0f0126 float:1.9008557E38 double:1.053194681E-314;
            r5 = 2131232023; // 0x7f080517 float:1.8080144E38 double:1.052968526E-314;
            r6 = 2131689765; // 0x7f0f0125 float:1.9008555E38 double:1.0531946805E-314;
            r7 = 2131231871; // 0x7f08047f float:1.8079835E38 double:1.052968451E-314;
            r8 = 2131689752; // 0x7f0f0118 float:1.9008528E38 double:1.053194674E-314;
            switch(r13) {
                case 1: goto L_0x0299;
                case 2: goto L_0x0299;
                case 3: goto L_0x027b;
                case 4: goto L_0x01d3;
                case 5: goto L_0x01d3;
                default: goto L_0x01d1;
            };
        L_0x01d1:
            goto L_0x029e;
        L_0x01d3:
            r13 = r11.f16505a;
            r13 = r13.h;
            r9 = 2131232042; // 0x7f08052a float:1.8080182E38 double:1.0529685353E-314;
            r13.setCompoundDrawablesWithIntrinsicBounds(r9, r2, r2, r2);
            r13 = r11.f16505a;
            r13 = r13.h;
            r9 = r11.f16505a;
            r9 = r9.f10377a;
            r9 = (mobi.mmdt.ott.view.components.p402d.C7576b) r9;
            r10 = 1082130432; // 0x40800000 float:4.0 double:5.34643471E-315;
            r9 = mobi.mmdt.componentsutils.p232b.C2491i.m6804b(r9, r10);
            r9 = (int) r9;
            r13.setCompoundDrawablePadding(r9);
            r13 = r11.f16505a;
            r13 = r13.h;
            r9 = mobi.mmdt.ott.logic.stheme.UIThemeManager.getmInstance();
            r9 = r9.getAccent_color();
            mobi.mmdt.componentsutils.p232b.C2491i.m6828c(r13, r9);
            r13 = r11.f16505a;
            r13.m13938K();
            r13 = mobi.mmdt.ott.view.conversation.activities.a.b.AnonymousClass17.f10173a;
            r9 = r11.f16505a;
            r9 = r9.aq;
            r9 = r9 - r3;
            r13 = r13[r9];
            switch(r13) {
                case 1: goto L_0x0260;
                case 2: goto L_0x0245;
                case 3: goto L_0x022a;
                case 4: goto L_0x0213;
                default: goto L_0x0211;
            };
        L_0x0211:
            goto L_0x029e;
        L_0x0213:
            r13 = r11.f16505a;
            r13 = r13.ap;
            r13.setVisibility(r1);
            r13 = r11.f16505a;
            r13.m13938K();
            r13 = r11.f16505a;
            r13 = r13.ap;
            r0 = "";
            r13.setText(r0);
            goto L_0x029e;
        L_0x022a:
            r13 = r11.f16505a;
            r13 = r13.ap;
            r13.setVisibility(r2);
            r13 = r11.f16505a;
            r13.ag();
            r13 = r11.f16505a;
            r13 = r13.ap;
            r13.setText(r8);
            r13 = r11.f16505a;
            r13 = r13.ap;
            r13.setCompoundDrawablesWithIntrinsicBounds(r7, r2, r2, r2);
            goto L_0x029e;
        L_0x0245:
            r13 = r11.f16505a;
            r13 = r13.ap;
            r13.setVisibility(r2);
            r13 = r11.f16505a;
            r13.ag();
            r13 = r11.f16505a;
            r13 = r13.ap;
            r13.setText(r6);
            r13 = r11.f16505a;
            r13 = r13.ap;
            r13.setCompoundDrawablesWithIntrinsicBounds(r5, r2, r2, r2);
            goto L_0x029e;
        L_0x0260:
            r13 = r11.f16505a;
            r13 = r13.ap;
            r13.setVisibility(r2);
            r13 = r11.f16505a;
            r13.ag();
            r13 = r11.f16505a;
            r13 = r13.ap;
            r13.setText(r4);
            r13 = r11.f16505a;
            r13 = r13.ap;
            r13.setCompoundDrawablesWithIntrinsicBounds(r0, r2, r2, r2);
            goto L_0x029e;
        L_0x027b:
            r13 = r11.f16505a;
            r13 = r13.ah;
            if (r13 == 0) goto L_0x0287;
        L_0x0281:
            r13 = r11.f16505a;
            r13.m13938K();
            goto L_0x028c;
        L_0x0287:
            r13 = r11.f16505a;
            r13.ag();
        L_0x028c:
            r13 = mobi.mmdt.ott.view.conversation.activities.a.b.AnonymousClass17.f10173a;
            r1 = r11.f16505a;
            r1 = r1.aq;
            r1 = r1 - r3;
            r13 = r13[r1];
            switch(r13) {
                case 1: goto L_0x0260;
                case 2: goto L_0x0245;
                case 3: goto L_0x022a;
                default: goto L_0x0298;
            };
        L_0x0298:
            goto L_0x029e;
        L_0x0299:
            r13 = r11.f16505a;
            r13.ag();
        L_0x029e:
            r13 = r11.f16505a;
            r0 = r12.m13428f();
            r13.n = r0;
            r13 = r11.f16505a;
            r12 = r12.m13430h();
            r13.am = r12;
            r12 = new android.os.Handler;
            r12.<init>();
            r13 = new mobi.mmdt.ott.view.conversation.activities.a.b$1$2;
            r13.<init>(r11);
            r0 = 500; // 0x1f4 float:7.0E-43 double:2.47E-321;
            r12.postDelayed(r13, r0);
        L_0x02bd:
            return;
        L_0x02be:
            r12 = r11.f16505a;
            r13 = new mobi.mmdt.ott.logic.a.c.b;
            r12 = r12.aj;
            r13.<init>(r12);
            mobi.mmdt.ott.logic.C2808d.m7148b(r13);
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.conversation.activities.a.b.1.a(android.support.v4.a.e, java.lang.Object):void");
        }
    }

    public C6873b(C7406c c7406c, Intent intent, String str, C2973m c2973m) {
        super(c7406c, intent, str, c2973m, null);
    }

    static /* synthetic */ void m17333a(C6873b c6873b, C2582a c2582a) {
        if (c6873b.aj != null) {
            C2808d.m7148b(new C6649a(C2973m.BOT, c6873b.aj, c2582a, ""));
        }
        c6873b.ah();
    }

    private void ag() {
        if (!this.at) {
            m13939L();
        }
    }

    private void ah() {
        Bundle bundle = new Bundle();
        bundle.putInt("dialog_id", 12);
        m14004e(bundle);
    }

    static /* synthetic */ void m17334b(C6873b c6873b) {
        switch (c6873b.ai) {
            case VISITOR:
            case NONE:
                c6873b.ag();
                return;
            case MEMBER:
                if (c6873b.ah) {
                    c6873b.m13938K();
                    return;
                } else {
                    c6873b.ag();
                    return;
                }
            case ADMIN:
            case OWNER:
                c6873b.m13938K();
                int i = AnonymousClass17.f10173a[c6873b.aq - 1];
                if (i != 4) {
                    switch (i) {
                        case 1:
                            c6873b.ag();
                            return;
                        case 2:
                            c6873b.ag();
                            return;
                        default:
                            return;
                    }
                }
                c6873b.m13938K();
                return;
            default:
                return;
        }
    }

    public final void mo3190N() {
    }

    public final void mo3191O() {
    }

    public final boolean mo3192P() {
        return true;
    }

    protected final void mo3193Q() {
        if (this.aq != C2977d.f9309d) {
            Intent intent = new Intent((C7576b) this.f10377a, BotInfoActivity.class);
            intent.putExtra("KEY_CHANNEL_ID", this.aj);
            intent.putExtra("KEY_IS_FOLLOWED", this.an);
            m13968a(intent, 1478);
            m13958a((int) R.anim.anim_slide_in_left, (int) R.anim.anim_slide_out_left);
        }
    }

    protected final void mo3194R() {
        if (this.aC != null) {
            this.at = false;
            this.ak.setVisible(this.an);
            this.j.m14067d((C7576b) this.f10377a);
        }
    }

    public final int mo3195S() {
        return this.k > 0 ? this.k + 20 : 20;
    }

    public final int mo3196T() {
        return 20;
    }

    public final int mo3197U() {
        return this.ar;
    }

    public final boolean mo3198V() {
        return this.at;
    }

    public final void mo3199W() {
        this.at = false;
    }

    public final void mo3200X() {
        this.ar = -1;
    }

    public final String mo3201Y() {
        return this.as;
    }

    public final void mo3202Z() {
        this.aw = true;
        ae();
    }

    public final Dialog mo2299a(Bundle bundle) {
        int i = bundle.getInt("dialog_id");
        if (i == 123) {
            return C4488b.m8181a((C7576b) this.f10377a, C4522p.m8236a(R.string.are_you_sure_to_clear_history_of_this_conversation), C4522p.m8236a(R.string.action_clear_history), new OnClickListener(this) {
                final /* synthetic */ C6873b f10171a;

                {
                    this.f10171a = r1;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                    C2808d.m7148b(new C6754a(this.f10171a.aj));
                }
            }, C4522p.m8236a(R.string.cancel), null);
        }
        switch (i) {
            case 10:
                return C4488b.m8181a((C7576b) this.f10377a, C4522p.m8236a(R.string.are_you_sure_to_leave_and_delete_this_channel), C4522p.m8236a(R.string.action_leave_and_delete_channel), this.aF, C4522p.m8236a(R.string.cancel), null);
            case 11:
                C0663a c0663a = new C0663a((C7576b) this.f10377a);
                StringBuilder stringBuilder = new StringBuilder("<b>");
                stringBuilder.append(C4522p.m8236a(R.string.action_report));
                stringBuilder.append("</b>");
                c0663a.m1608a(Html.fromHtml(stringBuilder.toString()));
                c0663a.m1611a(new CharSequence[]{C4522p.m8236a(R.string.action_spam), C4522p.m8236a(R.string.action_violence), C4522p.m8236a(R.string.action_inappropriate), C4522p.m8236a(R.string.other)}, new OnClickListener(this) {
                    final /* synthetic */ C6873b f10172a;

                    {
                        this.f10172a = r1;
                    }

                    public final void onClick(android.content.DialogInterface r3, int r4) {
                        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:9:0x0028 in {1, 3, 4, 6, 7, 8} preds:[]
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:129)
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:48)
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:38)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
                        /*
                        r2 = this;
                        switch(r4) {
                            case 0: goto L_0x0023;
                            case 1: goto L_0x001e;
                            case 2: goto L_0x0016;
                            case 3: goto L_0x0004;
                            default: goto L_0x0003;
                        };
                    L_0x0003:
                        return;
                    L_0x0004:
                        r3 = r2.f10172a;
                        r4 = r3.f10377a;
                        r4 = (mobi.mmdt.ott.view.components.p402d.C7576b) r4;
                        r0 = mobi.mmdt.ott.provider.p384f.C2973m.BOT;
                        r1 = r3.aj;
                        r3 = r3.m14027n();
                        mobi.mmdt.ott.view.tools.C4478a.m8152a(r4, r0, r1, r3);
                        return;
                    L_0x0016:
                        r3 = r2.f10172a;
                        r4 = mobi.mmdt.ott.logic.p261a.ab.C2582a.REPORT_INAPPROPRIATE;
                    L_0x001a:
                        mobi.mmdt.ott.view.conversation.activities.p419a.C6873b.m17333a(r3, r4);
                        return;
                    L_0x001e:
                        r3 = r2.f10172a;
                        r4 = mobi.mmdt.ott.logic.p261a.ab.C2582a.REPORT_VIOLENCE;
                        goto L_0x001a;
                    L_0x0023:
                        r3 = r2.f10172a;
                        r4 = mobi.mmdt.ott.logic.p261a.ab.C2582a.REPORT_SPAM;
                        goto L_0x001a;
                        return;
                        */
                        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.conversation.activities.a.b.16.onClick(android.content.DialogInterface, int):void");
                    }
                });
                return c0663a.m1612a();
            case 12:
                return C4488b.m8183a((C7576b) this.f10377a, C2973m.BOT);
            default:
                return super.mo2299a(bundle);
        }
    }

    public final void mo2300a() {
        super.mo2300a();
        this.aA = true;
        MyApplication.m12950a().f15918x = this.aj;
    }

    protected final void mo3203a(int i, int i2, int i3, String str, String str2) {
        if (AnonymousClass17.f10173a[this.aq - 1] == 4) {
            if (r0.ai != C3004f.ADMIN) {
                if (r0.ai != C3004f.OWNER) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(r0.aj);
                    C2808d.m7147a(new C6725n(arrayList, str, i, i2, i3, r0.aj, C2973m.BOT, str2, null));
                    return;
                }
            }
            C2808d.m7147a(new C6697f(r0.aj, str, i, i2, i3, r0.aj, C2973m.BOT, str2));
        }
    }

    public final void mo2303a(int i, int i2, Intent intent) {
        super.mo2303a(i, i2, intent);
        if (i2 == 1479) {
            m14012g();
            m13958a((int) R.anim.anim_slide_in_right, (int) R.anim.anim_slide_out_right);
            return;
        }
        if (i2 == 10) {
            ah();
        }
    }

    public final void mo3204a(int i, boolean z, boolean z2, boolean z3) {
        this.ar = i;
        this.g.m14089a(z, z2, z3);
    }

    public final void mo3205a(String str, int i, boolean z, boolean z2) {
    }

    protected final void mo3206a(String str, String str2, String str3) {
        if (AnonymousClass17.f10173a[this.aq - 1] == 4) {
            C1063i c6750o;
            if (this.ai != C3004f.ADMIN) {
                if (this.ai != C3004f.OWNER) {
                    if (str3 == null || str3.isEmpty()) {
                        C2808d.m7147a(new C6750o(this.aj, str, str2, new C2674a(null, null, null)));
                        return;
                    }
                    c6750o = new C6750o(this.aj, str, str2, str3);
                    C2808d.m7147a(c6750o);
                }
            }
            C1063i c6695d = new C6695d(this.aj, str, str2, this.aj, C2973m.BOT, str3);
            C2808d.m7147a(c6750o);
        }
    }

    protected final void mo3207a(String str, String str2, C2988j c2988j, String str3, C2731a c2731a, boolean z) {
        if (AnonymousClass17.f10173a[this.aq - 1] == 4) {
            if (r0.ai != C3004f.ADMIN) {
                if (r0.ai != C3004f.OWNER) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(r0.aj);
                    C2808d.m7147a(new C6721j(arrayList, str2, str, c2988j, r0.aj, C2973m.BOT, str3, c2731a, z));
                    return;
                }
            }
            C2808d.m7147a(new C6696e(r0.aj, str2, str, c2988j, r0.aj, C2973m.BOT, str3, c2731a, z));
        }
    }

    protected final void mo3208a(String str, String str2, C2988j c2988j, C2731a c2731a, boolean z) {
        if (AnonymousClass17.f10173a[this.aq - 1] == 4) {
            if (r0.ai != C3004f.ADMIN) {
                if (r0.ai != C3004f.OWNER) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(r0.aj);
                    C2808d.m7147a(new C6721j(arrayList, str2, str, c2988j, r0.aj, C2973m.BOT, c2731a, z));
                    return;
                }
            }
            C2808d.m7147a(new C6749n(r0.aj, str2, str, c2988j, c2731a));
        }
    }

    public final void mo3209a(C2522a c2522a) {
    }

    public final boolean mo3210a(Menu menu) {
        ((C7576b) this.f10377a).getMenuInflater().inflate(R.menu.menu_bot_conversation, menu);
        this.ak = menu.findItem(R.id.action_mute_notification);
        this.al = menu.findItem(R.id.action_search_chat);
        this.aB = menu.findItem(R.id.action_report);
        this.aE = menu.findItem(R.id.action_clear_history);
        this.aE.setTitle(C4522p.m8236a(R.string.action_clear_history));
        this.ak.setTitle(C4522p.m8236a(R.string.action_mute_notification));
        this.al.setTitle(C4522p.m8236a(R.string.action_search_chat));
        this.aB.setTitle(C4522p.m8236a(R.string.action_report));
        if (this.aw) {
            mo3202Z();
        } else {
            this.ak.setVisible(this.an);
        }
        SearchManager searchManager = (SearchManager) ((C7576b) this.f10377a).getSystemService("search");
        if (this.al != null) {
            this.aC = (SearchView) this.al.getActionView();
        }
        if (this.aC != null) {
            this.aC.setSearchableInfo(searchManager.getSearchableInfo(((C7576b) this.f10377a).getComponentName()));
            this.aC = m13955a(this.aC);
        }
        this.aC.setOnSearchClickListener(new View.OnClickListener(this) {
            final /* synthetic */ C6873b f10176a;

            {
                this.f10176a = r1;
            }

            public final void onClick(View view) {
                this.f10176a.o = true;
                this.f10176a.at = true;
                this.f10176a.m13938K();
                this.f10176a.m13936I();
                if (this.f10176a.f16457C) {
                    this.f10176a.m14020i();
                    this.f10176a.av = true;
                }
                this.f10176a.j.m14069e((C7576b) this.f10176a.f10377a);
                this.f10176a.ae();
                this.f10176a.at = true;
                this.f10176a.m.clear();
            }
        });
        this.aC.addOnAttachStateChangeListener(new OnAttachStateChangeListener(this) {
            final /* synthetic */ C6873b f10177a;

            {
                this.f10177a = r1;
            }

            public final void onViewAttachedToWindow(View view) {
            }

            public final void onViewDetachedFromWindow(View view) {
                this.f10177a.at = false;
                C6873b.m17334b(this.f10177a);
                this.f10177a.m13936I();
                this.f10177a.j.m14070f();
                this.f10177a.ak.setVisible(this.f10177a.an);
                this.f10177a.af();
                this.f10177a.au = false;
                if (this.f10177a.av && !this.f10177a.f16469O) {
                    this.f10177a.m14023j();
                }
            }
        });
        if (!this.as.isEmpty()) {
            m13938K();
            this.al.expandActionView();
            this.ak.setVisible(false);
            this.aE.setVisible(false);
            this.aB.setVisible(false);
            this.at = true;
            this.aC.setQuery(this.as, this.au);
            if (this.au) {
                C2808d.m7147a(new C6757d(this.aj, this.as));
            }
        }
        this.aC.setImeOptions(this.aC.getImeOptions() | 268435456);
        this.aC.setOnQueryTextListener(new OnQueryTextListener(this) {
            final /* synthetic */ C6873b f16506a;

            {
                this.f16506a = r1;
            }

            public final boolean onQueryTextChange(String str) {
                this.f16506a.au = false;
                this.f16506a.as = "";
                return false;
            }

            public final boolean onQueryTextSubmit(String str) {
                C2808d.m7147a(new C6757d(this.f16506a.aj, str));
                this.f16506a.au = true;
                return false;
            }
        });
        return super.mo3210a(menu);
    }

    public final boolean mo2315a(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.action_mute_notification) {
            C2808d.m7148b(new C6777a(C2973m.BOT, this.aj, this.n ^ 1));
        } else if (itemId == R.id.action_show_interactive_messages) {
            this.am ^= 1;
            C2808d.m7147a(new C6694c(this.aj, this.am));
            new Handler().postDelayed(new Runnable(this) {
                final /* synthetic */ C6873b f10178a;

                {
                    this.f10178a = r1;
                }

                public final void run() {
                    this.f10178a.g.m14106m();
                }
            }, 500);
        } else {
            Bundle bundle;
            String str;
            int i;
            if (itemId == R.id.action_leave_and_delete) {
                bundle = new Bundle();
                str = "dialog_id";
                i = 10;
            } else if (itemId == R.id.action_create_poll) {
                C4478a.m8167d((C7576b) this.f10377a, this.aj);
            } else if (itemId == R.id.action_payment) {
                C4478a.m8169e((C7576b) this.f10377a, this.aj);
            } else if (itemId == R.id.action_report) {
                bundle = new Bundle();
                str = "dialog_id";
                i = 11;
            } else if (itemId == R.id.action_clear_history) {
                bundle = new Bundle();
                str = "dialog_id";
                i = 123;
            }
            bundle.putInt(str, i);
            m14004e(bundle);
        }
        return super.mo2315a(menuItem);
    }

    public final void aa() {
        this.aw = false;
        if (this.ak != null && this.aq == C2977d.f9306a) {
            this.ak.setVisible(this.an);
            this.al.setVisible(true);
            af();
        }
    }

    public final void ab() {
        if (this.al != null) {
            this.al.collapseActionView();
        }
    }

    protected final boolean ac() {
        return this.an;
    }

    public final C3004f ad() {
        return this.ai;
    }

    final void ae() {
        if (this.aE != null) {
            this.aE.setVisible(false);
            this.ak.setVisible(false);
            this.al.setVisible(false);
            this.aB.setVisible(false);
        }
    }

    final void af() {
        if (this.aB != null) {
            if (this.ai == C3004f.OWNER) {
                this.aB.setVisible(false);
                return;
            }
            this.aB.setVisible(true);
        }
    }

    public final C0350e<Cursor> mo3217b(int i) {
        this.aD = C2966b.m7401a(this.aj, i);
        return this.aD;
    }

    public final void mo2316b() {
        super.mo2316b();
        this.aA = false;
        MyApplication.m12950a().f15918x = null;
    }

    protected final void mo3218b(int i, int i2, int i3, String str) {
        if (AnonymousClass17.f10173a[this.aq - 1] == 4) {
            if (r0.ai != C3004f.ADMIN) {
                if (r0.ai != C3004f.OWNER) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(r0.aj);
                    C2808d.m7147a(new C6725n(arrayList, str, i, i2, i3, r0.aj, C2973m.BOT, null, null));
                    return;
                }
            }
            C2808d.m7147a(new C6753r(r0.aj, str, i, i2, i3));
        }
    }

    public final void mo2318b(Bundle bundle) {
        if (!(this.f16471Q == null || this.f16471Q.getExtras() == null)) {
            this.aj = this.f16471Q.getStringExtra("KEY_PARTY");
            if (this.f16471Q.getExtras().containsKey("KEY_FIRST")) {
                Intent intent = new Intent((C7576b) this.f10377a, EditChannelInfoActivity.class);
                intent.putExtra("KEY_CHANNEL_ID", this.aj);
                intent.setFlags(268435456);
                ((C7576b) this.f10377a).startActivity(intent);
                m13958a((int) R.anim.anim_slide_in_left, (int) R.anim.anim_slide_out_left);
            }
        }
        if (bundle != null) {
            if (bundle.containsKey("KEY_IS_REPLY_ALLOWED")) {
                this.ah = bundle.getBoolean("KEY_IS_REPLY_ALLOWED");
                this.d = bundle.getBoolean("KEY_IS_ADMIN_OR_OWNER");
                this.ai = C3004f.values()[bundle.getInt("KEY_MY_ROLE")];
            }
            if (bundle.containsKey("KEY_SEARCH_ROTATE")) {
                this.as = bundle.getString("KEY_SEARCH_ROTATE", "");
            }
            if (bundle.containsKey("KEY_IS_SEARCHING_TEXT_MESSAGE")) {
                this.at = bundle.getBoolean("KEY_IS_SEARCHING_TEXT_MESSAGE", false);
            }
            if (bundle.containsKey("KEY_IS_SUBMIT_PRESSED")) {
                this.au = bundle.getBoolean("KEY_IS_SUBMIT_PRESSED", false);
            }
            if (bundle.containsKey("KEY_MY_ROLE_TYPE")) {
                this.ai = (C3004f) bundle.get("KEY_MY_ROLE_TYPE");
            }
            if (bundle.containsKey("KEY_CHANNEL_TYPE")) {
                this.ax = (C2974a) bundle.get("KEY_CHANNEL_TYPE");
            }
        }
        super.mo2318b(bundle);
        this.ap = (TextView) this.b.findViewById(R.id.channelState_textView);
        this.ao = (Button) this.b.findViewById(R.id.follow_button);
        this.ao.setText(C4522p.m8236a(R.string.start_bot));
        ((C7576b) this.f10377a).m19190e().mo268a(53, null, this.az);
        this.ap.setVisibility(8);
        this.ao.setVisibility(8);
        this.ao.setOnClickListener(new View.OnClickListener(this) {
            final /* synthetic */ C6873b f10175a;

            {
                this.f10175a = r1;
            }

            public final void onClick(View view) {
                C2808d.m7148b(new C6683c(this.f10175a.aj));
            }
        });
        m14026m();
        C2491i.m6819b(this.ao, UIThemeManager.getmInstance().getAccent_color());
        C2491i.m6798a(this.ao, UIThemeManager.getmInstance().getButton_text_color());
    }

    public final void mo3219b(String str, String str2, String[] strArr, String str3) {
        if (this.ai != C3004f.NONE) {
            if (strArr.length <= 0) {
                if (str3.length() <= 0) {
                    Toast.makeText((C7576b) this.f10377a, C4522p.m8236a(R.string.you_must_answer_before_submitting), 0).show();
                    return;
                }
            }
            C2808d.m7148b(new C6711v(str, str2, strArr, str3));
            return;
        }
        Toast.makeText((C7576b) this.f10377a, C4522p.m8236a(R.string.you_must_follow_this_channel_before_submitting), 0).show();
    }

    public final void mo2323c(Bundle bundle) {
        super.mo2323c(bundle);
    }

    public final void mo2326d() {
        super.mo2326d();
        MyApplication.m12950a().f15917w.clear();
        ((C7576b) this.f10377a).m19190e().mo269a(53);
    }

    public final void mo2327d(Bundle bundle) {
        super.mo2327d(bundle);
        bundle.putBoolean("KEY_IS_SUBMIT_PRESSED", this.au);
        if (this.aC != null) {
            String str;
            boolean z;
            bundle.putString("KEY_SEARCH_ROTATE", this.aC.getQuery() != null ? this.aC.getQuery().toString() : "");
            if (this.aC.getQuery() == null || !this.aC.getQuery().toString().isEmpty()) {
                str = "KEY_IS_SEARCHING_TEXT_MESSAGE";
                z = this.at;
            } else {
                str = "KEY_IS_SEARCHING_TEXT_MESSAGE";
                z = false;
            }
            bundle.putBoolean(str, z);
        }
        bundle.putSerializable("KEY_MY_ROLE_TYPE", this.ai);
        bundle.putSerializable("KEY_CHANNEL_TYPE", this.ax);
        bundle.putSerializable("KEY_POLL_RESULT", this.f);
    }

    protected final void mo3220f(String str) {
        if (AnonymousClass17.f10173a[this.aq - 1] == 4) {
            if (this.ai != C3004f.ADMIN) {
                if (this.ai != C3004f.OWNER) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(this.aj);
                    C2808d.m7147a(new C6726o(arrayList, str, this.aj, C2973m.BOT, null, null));
                    return;
                }
            }
            C2808d.m7147a(new C6751p(this.aj, str, new C2674a(null, null, null)));
        }
    }

    public final void mo3221g(String str) {
        Log.d("ccc ", " ccc in CH LoadMore");
    }

    public final void mo3222h(String str) {
        if (this.aC != null) {
            this.al.expandActionView();
            this.j.m14069e((C7576b) this.f10377a);
            this.aE.setVisible(false);
            this.ak.setVisible(false);
            this.aC.setQuery(str, true);
            this.at = true;
            this.m.clear();
            this.au = false;
        }
    }

    protected final void mo3223h(String str, String str2) {
        if (AnonymousClass17.f10173a[this.aq - 1] == 4) {
            if (r0.ai != C3004f.ADMIN) {
                if (r0.ai != C3004f.OWNER) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(r0.aj);
                    C2808d.m7147a(new C6726o(arrayList, str, r0.aj, C2973m.BOT, str2, null));
                    return;
                }
            }
            C2808d.m7147a(new C6698g(r0.aj, str, r0.aj, C2973m.BOT, str2));
        }
    }

    public final void mo3224i(String str) {
    }

    protected final void mo3225i(String str, String str2) {
        C2808d.m7147a(new C6762d(str, this.aj, C2973m.BOT, str2));
    }

    public final void mo3226j(String str) {
        C4478a.m8149a((C7576b) this.f10377a, str, true);
    }

    public final void mo3227k(String str) {
        C2808d.m7148b(new C6704m(str));
    }

    public final void onEvent(final C5917d c5917d) {
        this.e--;
        m13940M();
        Log.d("ccc ", " ccc in CH ErrEvnt");
        ((C7576b) this.f10377a).runOnUiThread(new Runnable(this) {
            final /* synthetic */ C6873b f10189b;

            public final void run() {
                this.f10189b.g.m14091b(true);
                C4513i.m8228a((C7576b) this.f10189b.f10377a, c5917d.f8890a);
            }
        });
    }

    public final void onEvent(final C2644e c2644e) {
        this.e--;
        m13940M();
        final boolean z = c2644e.f8547b ^ 1;
        StringBuilder stringBuilder = new StringBuilder(" ccc in CH SuEvnt notMM:");
        stringBuilder.append(z);
        stringBuilder.append(" UWM:");
        stringBuilder.append(c2644e.f8546a);
        Log.d("ccc ", stringBuilder.toString());
        ((C7576b) this.f10377a).runOnUiThread(new Runnable(this) {
            final /* synthetic */ C6873b f10187c;

            public final void run() {
                this.f10187c.g.f16545D = z;
                if (z) {
                    this.f10187c.g.mo2354a(false);
                    this.f10187c.g.m14107n();
                    this.f10187c.m13930C();
                }
                if (c2644e.f8546a) {
                    this.f10187c.g.m14091b(true);
                    if (this.f10187c.ar > 0) {
                        this.f10187c.g.m14089a(false, false, false);
                        this.f10187c.m13930C();
                        return;
                    }
                    this.f10187c.g.m14106m();
                    this.f10187c.m13930C();
                }
            }
        });
    }

    public final void onEvent(final C5918f c5918f) {
        ((C7576b) this.f10377a).runOnUiThread(new Runnable(this) {
            final /* synthetic */ C6873b f10163b;

            public final void run() {
                C4513i.m8228a((C7576b) this.f10163b.f10377a, c5918f.f8890a);
            }
        });
    }

    public final void onEvent(C2645g c2645g) {
        ((C7576b) this.f10377a).runOnUiThread(new C33269(this));
    }

    public final void onEvent(final C5921m c5921m) {
        ((C7576b) this.f10377a).runOnUiThread(new Runnable(this) {
            final /* synthetic */ C6873b f10168b;

            public final void run() {
                C4513i.m8228a((C7576b) this.f10168b.f10377a, c5921m.f8890a);
            }
        });
    }

    public final void onEvent(final C2649n c2649n) {
        ((C7576b) this.f10377a).runOnUiThread(new Runnable(this) {
            final /* synthetic */ C6873b f10165b;

            public final void run() {
                this.f10165b.f = c2649n.f8564a;
                this.f10165b.m13979a(this.f10165b.f);
            }
        });
    }

    public final void onEvent(final C5922o c5922o) {
        ((C7576b) this.f10377a).runOnUiThread(new Runnable(this) {
            final /* synthetic */ C6873b f10191b;

            public final void run() {
                C4513i.m8228a((C7576b) this.f10191b.f10377a, c5922o.f8890a);
            }
        });
    }

    public final void onEvent(final C2650p c2650p) {
        ((C7576b) this.f10377a).runOnUiThread(new Runnable(this) {
            final /* synthetic */ C6873b f10193b;

            public final void run() {
                C2980g.m7423a(c2650p.f8565a, C2778b.m7093a());
                this.f10193b.ao.setVisibility(8);
            }
        });
    }

    public final void onEvent(final C5923q c5923q) {
        ((C7576b) this.f10377a).runOnUiThread(new Runnable(this) {
            final /* synthetic */ C6873b f10184b;

            public final void run() {
                C4513i.m8228a((C7576b) this.f10184b.f10377a, c5923q.f8890a);
            }
        });
    }

    public final void onEvent(C2651r c2651r) {
        ((C7576b) this.f10377a).runOnUiThread(new Runnable(this) {
            final /* synthetic */ C6873b f10180a;

            class C33171 implements Runnable {
                final /* synthetic */ AnonymousClass23 f10179a;

                C33171(AnonymousClass23 anonymousClass23) {
                    this.f10179a = anonymousClass23;
                }

                public final void run() {
                    this.f10179a.f10180a.m14012g();
                    this.f10179a.f10180a.m13958a((int) R.anim.anim_slide_in_right, (int) R.anim.anim_slide_out_right);
                }
            }

            {
                this.f10180a = r1;
            }

            public final void run() {
                new Handler().postDelayed(new C33171(this), 100);
            }
        });
    }

    public final void onEvent(final C5925t c5925t) {
        ((C7576b) this.f10377a).runOnUiThread(new Runnable(this) {
            final /* synthetic */ C6873b f10195b;

            public final void run() {
                C4513i.m8228a((C7576b) this.f10195b.f10377a, c5925t.f8890a);
            }
        });
    }

    public final void onEvent(C2652u c2652u) {
        ((C7576b) this.f10377a).runOnUiThread(new C33258(this));
    }

    public final void onEvent(C2707u c2707u) {
        ((C7576b) this.f10377a).runOnUiThread(new Runnable(this) {
            final /* synthetic */ C6873b f10182a;

            class C33181 implements Runnable {
                final /* synthetic */ AnonymousClass24 f10181a;

                C33181(AnonymousClass24 anonymousClass24) {
                    this.f10181a = anonymousClass24;
                }

                public final void run() {
                    this.f10181a.f10182a.m14012g();
                    this.f10181a.f10182a.m13958a(0, 0);
                }
            }

            {
                this.f10182a = r1;
            }

            public final void run() {
                new Handler().post(new C33181(this));
            }
        });
    }

    public final void onEvent(final C5949z c5949z) {
        ((C7576b) this.f10377a).runOnUiThread(new Runnable(this) {
            final /* synthetic */ C6873b f10170b;

            public final void run() {
                C4513i.m8228a((C7576b) this.f10170b.f10377a, c5949z.f8890a);
            }
        });
    }

    public final void onEvent(C2716a c2716a) {
        m14012g();
        m13958a((int) R.anim.anim_slide_in_right, (int) R.anim.anim_slide_out_right);
    }

    public final void mo2345t() {
        if (this.j.f16523j.m7840a()) {
            this.j.m14067d((C7576b) this.f10377a);
        } else if (!(this.ay == null || this.ay.isEmpty())) {
            try {
                C2630a.m7047a(this.aj, "", this.ay);
            } catch (Throwable e) {
                C2480b.m6737b(e.getMessage(), e);
            }
        }
    }
}
