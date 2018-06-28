package mobi.mmdt.ott.view.conversation.activities.p419a;

import android.app.Activity;
import android.app.Dialog;
import android.app.SearchManager;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.C0417s.C0416a;
import android.support.v4.p029a.C0350e;
import android.support.v7.app.C6389b;
import android.support.v7.app.C6389b.C0663a;
import android.support.v7.app.C7406c;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.SearchView.OnQueryTextListener;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.p072b.p073a.p074a.C1063i;
import com.p085c.p086a.C1212c;
import com.p085c.p086a.p089c.p092b.C1144h;
import com.p085c.p086a.p105g.C1248f;
import com.p085c.p086a.p105g.p106a.C7408b;
import com.p085c.p086a.p105g.p107b.C1242b;
import java.util.ArrayList;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.lib_webservicescomponent.p257d.C2556b;
import mobi.mmdt.ott.logic.C2778b;
import mobi.mmdt.ott.logic.C2808d;
import mobi.mmdt.ott.logic.p261a.ab.C2582a;
import mobi.mmdt.ott.logic.p261a.ab.p542a.C6649a;
import mobi.mmdt.ott.logic.p261a.p284f.p285a.C2643a;
import mobi.mmdt.ott.logic.p261a.p284f.p285a.C2644e;
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
import mobi.mmdt.ott.logic.p261a.p284f.p286b.C6699h;
import mobi.mmdt.ott.logic.p261a.p284f.p286b.C6700i;
import mobi.mmdt.ott.logic.p261a.p284f.p286b.C6701j;
import mobi.mmdt.ott.logic.p261a.p284f.p286b.C6704m;
import mobi.mmdt.ott.logic.p261a.p284f.p286b.C6706o;
import mobi.mmdt.ott.logic.p261a.p284f.p286b.C6707p;
import mobi.mmdt.ott.logic.p261a.p284f.p286b.C6710u;
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
import mobi.mmdt.ott.logic.p261a.p301l.p548b.C6757d;
import mobi.mmdt.ott.logic.p261a.p303m.C6762d;
import mobi.mmdt.ott.logic.p261a.p308q.p310b.C2731a;
import mobi.mmdt.ott.logic.p261a.p320t.C6777a;
import mobi.mmdt.ott.logic.p349f.C2814a;
import mobi.mmdt.ott.logic.p366o.p367a.C2878a;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.p240c.C2524c.C2522a;
import mobi.mmdt.ott.provider.p384f.C2967c;
import mobi.mmdt.ott.provider.p384f.C2971k;
import mobi.mmdt.ott.provider.p384f.C2972l;
import mobi.mmdt.ott.provider.p384f.C2973m;
import mobi.mmdt.ott.provider.p384f.C7316h;
import mobi.mmdt.ott.provider.p385g.C2974a;
import mobi.mmdt.ott.provider.p385g.C2977d;
import mobi.mmdt.ott.provider.p385g.C2980g;
import mobi.mmdt.ott.provider.p385g.C2981h;
import mobi.mmdt.ott.provider.p385g.C6023j;
import mobi.mmdt.ott.provider.p386h.C2985d;
import mobi.mmdt.ott.provider.p386h.C2988j;
import mobi.mmdt.ott.provider.p389k.C3000b;
import mobi.mmdt.ott.provider.p390l.C3004f;
import mobi.mmdt.ott.provider.p393o.C3012b;
import mobi.mmdt.ott.view.channel.ChannelInfoActivity;
import mobi.mmdt.ott.view.channel.ChannelInfoActivityThemeDialog;
import mobi.mmdt.ott.view.components.p398a.C7175a.C3101a;
import mobi.mmdt.ott.view.components.p402d.C7576b;
import mobi.mmdt.ott.view.conversation.activities.a.d.AnonymousClass20;
import mobi.mmdt.ott.view.conversation.activities.p419a.C6875d;
import mobi.mmdt.ott.view.conversation.editchannelinfo.EditChannelInfoActivity;
import mobi.mmdt.ott.view.conversation.p418a.C3280a;
import mobi.mmdt.ott.view.tools.C4478a;
import mobi.mmdt.ott.view.tools.C4488b;
import mobi.mmdt.ott.view.tools.C4513i;
import mobi.mmdt.ott.view.tools.C4515k;
import mobi.mmdt.ott.view.tools.C4522p;
import mobi.mmdt.ott.view.tools.p479c.C4501c;

public final class C6875d extends C6123a implements C3101a, C3280a {
    String aA;
    boolean aB = false;
    private boolean aC;
    private MenuItem aD;
    private MenuItem aE;
    private TextView aF;
    private boolean aG;
    private boolean aH;
    private SearchView aI;
    private boolean aJ = true;
    private boolean aK = false;
    private C0416a<Cursor> aL = new C61261(this);
    private OnClickListener aM = new OnClickListener(this) {
        final /* synthetic */ C6875d f10283a;

        {
            this.f10283a = r1;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C1063i c6707p = new C6707p(this.f10283a.aj);
            C2808d.m7147a(c6707p);
            C4501c.m8189a().m8192a((C7576b) this.f10283a.f10377a, c6707p);
        }
    };
    boolean ah = true;
    public C3004f ai = C3004f.NONE;
    String aj;
    MenuItem ak;
    MenuItem al;
    MenuItem am;
    MenuItem an;
    MenuItem ao;
    boolean ap;
    boolean aq;
    Button ar;
    int as = C2977d.f9306a;
    int at = -1;
    String au = "";
    boolean av;
    boolean aw;
    boolean ax;
    boolean ay = false;
    C2974a az;

    static /* synthetic */ class AnonymousClass20 {
        static final /* synthetic */ int[] f10296b = new int[C2977d.m7421a().length];

        static {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r0 = mobi.mmdt.ott.provider.p390l.C3004f.values();
            r0 = r0.length;
            r0 = new int[r0];
            f10297c = r0;
            r0 = 1;
            r1 = f10297c;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = mobi.mmdt.ott.provider.p390l.C3004f.VISITOR;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = r2.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r1 = 2;
            r2 = f10297c;	 Catch:{ NoSuchFieldError -> 0x001f }
            r3 = mobi.mmdt.ott.provider.p390l.C3004f.NONE;	 Catch:{ NoSuchFieldError -> 0x001f }
            r3 = r3.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2[r3] = r1;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r2 = 3;
            r3 = f10297c;	 Catch:{ NoSuchFieldError -> 0x002a }
            r4 = mobi.mmdt.ott.provider.p390l.C3004f.MEMBER;	 Catch:{ NoSuchFieldError -> 0x002a }
            r4 = r4.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r3[r4] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r3 = 4;
            r4 = f10297c;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r5 = mobi.mmdt.ott.provider.p390l.C3004f.ADMIN;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r5 = r5.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r4[r5] = r3;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            r4 = f10297c;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r5 = mobi.mmdt.ott.provider.p390l.C3004f.OWNER;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r5 = r5.ordinal();	 Catch:{ NoSuchFieldError -> 0x0040 }
            r6 = 5;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r4[r5] = r6;	 Catch:{ NoSuchFieldError -> 0x0040 }
        L_0x0040:
            r4 = mobi.mmdt.ott.provider.p385g.C2977d.m7421a();
            r4 = r4.length;
            r4 = new int[r4];
            f10296b = r4;
            r4 = f10296b;	 Catch:{ NoSuchFieldError -> 0x0050 }
            r5 = mobi.mmdt.ott.provider.p385g.C2977d.f9306a;	 Catch:{ NoSuchFieldError -> 0x0050 }
            r5 = r5 - r0;	 Catch:{ NoSuchFieldError -> 0x0050 }
            r4[r5] = r0;	 Catch:{ NoSuchFieldError -> 0x0050 }
        L_0x0050:
            r4 = f10296b;	 Catch:{ NoSuchFieldError -> 0x0057 }
            r5 = mobi.mmdt.ott.provider.p385g.C2977d.f9308c;	 Catch:{ NoSuchFieldError -> 0x0057 }
            r5 = r5 - r0;	 Catch:{ NoSuchFieldError -> 0x0057 }
            r4[r5] = r1;	 Catch:{ NoSuchFieldError -> 0x0057 }
        L_0x0057:
            r4 = f10296b;	 Catch:{ NoSuchFieldError -> 0x005e }
            r5 = mobi.mmdt.ott.provider.p385g.C2977d.f9307b;	 Catch:{ NoSuchFieldError -> 0x005e }
            r5 = r5 - r0;	 Catch:{ NoSuchFieldError -> 0x005e }
            r4[r5] = r2;	 Catch:{ NoSuchFieldError -> 0x005e }
        L_0x005e:
            r4 = f10296b;	 Catch:{ NoSuchFieldError -> 0x0065 }
            r5 = mobi.mmdt.ott.provider.p385g.C2977d.f9309d;	 Catch:{ NoSuchFieldError -> 0x0065 }
            r5 = r5 - r0;	 Catch:{ NoSuchFieldError -> 0x0065 }
            r4[r5] = r3;	 Catch:{ NoSuchFieldError -> 0x0065 }
        L_0x0065:
            r4 = mobi.mmdt.ott.provider.p385g.C2974a.values();
            r4 = r4.length;
            r4 = new int[r4];
            f10295a = r4;
            r4 = f10295a;	 Catch:{ NoSuchFieldError -> 0x0078 }
            r5 = mobi.mmdt.ott.provider.p385g.C2974a.NORMAL;	 Catch:{ NoSuchFieldError -> 0x0078 }
            r5 = r5.ordinal();	 Catch:{ NoSuchFieldError -> 0x0078 }
            r4[r5] = r0;	 Catch:{ NoSuchFieldError -> 0x0078 }
        L_0x0078:
            r0 = f10295a;	 Catch:{ NoSuchFieldError -> 0x0082 }
            r4 = mobi.mmdt.ott.provider.p385g.C2974a.OFFICIAL;	 Catch:{ NoSuchFieldError -> 0x0082 }
            r4 = r4.ordinal();	 Catch:{ NoSuchFieldError -> 0x0082 }
            r0[r4] = r1;	 Catch:{ NoSuchFieldError -> 0x0082 }
        L_0x0082:
            r0 = f10295a;	 Catch:{ NoSuchFieldError -> 0x008c }
            r1 = mobi.mmdt.ott.provider.p385g.C2974a.PAYMENT;	 Catch:{ NoSuchFieldError -> 0x008c }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x008c }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x008c }
        L_0x008c:
            r0 = f10295a;	 Catch:{ NoSuchFieldError -> 0x0096 }
            r1 = mobi.mmdt.ott.provider.p385g.C2974a.OFFICIAL_PAYMENT;	 Catch:{ NoSuchFieldError -> 0x0096 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0096 }
            r0[r1] = r3;	 Catch:{ NoSuchFieldError -> 0x0096 }
        L_0x0096:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.conversation.activities.a.d.20.<clinit>():void");
        }
    }

    class C33512 implements Runnable {
        final /* synthetic */ C6875d f10305a;

        C33512(C6875d c6875d) {
            this.f10305a = c6875d;
        }

        public final void run() {
            this.f10305a.g.m14106m();
        }
    }

    class C33544 implements Runnable {
        final /* synthetic */ C6875d f10309a;

        class C33531 implements Runnable {
            final /* synthetic */ C33544 f10308a;

            C33531(C33544 c33544) {
                this.f10308a = c33544;
            }

            public final void run() {
                this.f10308a.f10309a.m14012g();
                this.f10308a.f10309a.m13958a((int) R.anim.anim_slide_in_right, (int) R.anim.anim_slide_out_right);
            }
        }

        C33544(C6875d c6875d) {
            this.f10309a = c6875d;
        }

        public final void run() {
            C4501c.m8189a().m8193b();
            new Handler().postDelayed(new C33531(this), 100);
        }
    }

    class C33565 implements Runnable {
        final /* synthetic */ C6875d f10311a;

        class C33551 implements Runnable {
            final /* synthetic */ C33565 f10310a;

            C33551(C33565 c33565) {
                this.f10310a = c33565;
            }

            public final void run() {
                this.f10310a.f10311a.m14012g();
                this.f10310a.f10311a.m13958a(0, 0);
            }
        }

        C33565(C6875d c6875d) {
            this.f10311a = c6875d;
        }

        public final void run() {
            new Handler().post(new C33551(this));
        }
    }

    class C61261 implements C0416a<Cursor> {
        final /* synthetic */ C6875d f16508a;

        class C33501 implements Runnable {
            final /* synthetic */ C61261 f10278a;

            C33501(C61261 c61261) {
                this.f10278a = c61261;
            }

            /* JADX WARNING: inconsistent code. */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                r4 = this;
                r0 = r4.f10278a;
                r0 = r0.f16508a;
                r0 = r0.an;
                if (r0 == 0) goto L_0x0017;
            L_0x0008:
                r0 = r4.f10278a;
                r0 = r0.f16508a;
                r0 = r0.an;
                r1 = r4.f10278a;
                r1 = r1.f16508a;
                r1 = r1.aq;
                r0.setVisible(r1);
            L_0x0017:
                r0 = r4.f10278a;
                r0 = r0.f16508a;
                r0 = r0.ak;
                r1 = 1;
                r2 = 0;
                if (r0 == 0) goto L_0x008e;
            L_0x0021:
                r0 = r4.f10278a;
                r0 = r0.f16508a;
                r0 = r0.ak;
                r3 = r4.f10278a;
                r3 = r3.f16508a;
                r3 = r3.n;
                r0.setChecked(r3);
                r0 = r4.f10278a;
                r0 = r0.f16508a;
                r0 = r0.ak;
                r3 = r4.f10278a;
                r3 = r3.f16508a;
                r3 = r3.aq;
                r0.setVisible(r3);
                r0 = r4.f10278a;
                r0 = r0.f16508a;
                r0 = r0.as;
                r3 = mobi.mmdt.ott.provider.p385g.C2977d.f9306a;
                if (r0 == r3) goto L_0x0063;
            L_0x0049:
                r0 = r4.f10278a;
                r0 = r0.f16508a;
                r0 = r0.ao;
                r0.setVisible(r2);
                r0 = r4.f10278a;
                r0 = r0.f16508a;
                r0.m17450c(r2);
            L_0x0059:
                r0 = r4.f10278a;
                r0 = r0.f16508a;
                r0 = r0.am;
                r0.setVisible(r2);
                goto L_0x008e;
            L_0x0063:
                r0 = r4.f10278a;
                r0 = r0.f16508a;
                r0 = r0.ao;
                r0.setVisible(r1);
                r0 = r4.f10278a;
                r0 = r0.f16508a;
                r0.m17450c(r1);
                r0 = mobi.mmdt.ott.view.conversation.activities.a.d.AnonymousClass20.f10295a;
                r3 = r4.f10278a;
                r3 = r3.f16508a;
                r3 = r3.az;
                r3 = r3.ordinal();
                r0 = r0[r3];
                switch(r0) {
                    case 1: goto L_0x0059;
                    case 2: goto L_0x0059;
                    case 3: goto L_0x0085;
                    case 4: goto L_0x0085;
                    default: goto L_0x0084;
                };
            L_0x0084:
                goto L_0x008e;
            L_0x0085:
                r0 = r4.f10278a;
                r0 = r0.f16508a;
                r0 = r0.am;
                r0.setVisible(r1);
            L_0x008e:
                r0 = r4.f10278a;
                r0 = r0.f16508a;
                r0 = r0.an;
                if (r0 == 0) goto L_0x0177;
            L_0x0096:
                r0 = r4.f10278a;
                r0 = r0.f16508a;
                r0 = r0.al;
                if (r0 == 0) goto L_0x0177;
            L_0x009e:
                r0 = mobi.mmdt.ott.view.conversation.activities.a.d.AnonymousClass20.f10296b;
                r3 = r4.f10278a;
                r3 = r3.f16508a;
                r3 = r3.as;
                r3 = r3 - r1;
                r0 = r0[r3];
                switch(r0) {
                    case 1: goto L_0x00cf;
                    case 2: goto L_0x00ae;
                    case 3: goto L_0x00ae;
                    default: goto L_0x00ac;
                };
            L_0x00ac:
                goto L_0x0126;
            L_0x00ae:
                r0 = r4.f10278a;
                r0 = r0.f16508a;
                r0 = r0.an;
                r0.setVisible(r2);
            L_0x00b7:
                r0 = r4.f10278a;
                r0 = r0.f16508a;
                r0.m17450c(r2);
                r0 = r4.f10278a;
                r0 = r0.f16508a;
                r0.mo3231b(r2);
            L_0x00c5:
                r0 = r4.f10278a;
                r0 = r0.f16508a;
                r0 = r0.am;
                r0.setVisible(r2);
                goto L_0x0126;
            L_0x00cf:
                r0 = r4.f10278a;
                r0 = r0.f16508a;
                r0 = r0.ai;
                r3 = mobi.mmdt.ott.provider.p390l.C3004f.ADMIN;
                if (r0 == r3) goto L_0x00f4;
            L_0x00d9:
                r0 = r4.f10278a;
                r0 = r0.f16508a;
                r0 = r0.ai;
                r3 = mobi.mmdt.ott.provider.p390l.C3004f.OWNER;
                if (r0 != r3) goto L_0x00e4;
            L_0x00e3:
                goto L_0x00f4;
            L_0x00e4:
                r0 = r4.f10278a;
                r0 = r0.f16508a;
                r0 = r0.an;
                r1 = r4.f10278a;
                r1 = r1.f16508a;
                r1 = r1.aq;
                r0.setVisible(r1);
                goto L_0x00b7;
            L_0x00f4:
                r0 = r4.f10278a;
                r0 = r0.f16508a;
                r0 = r0.an;
                r0.setVisible(r2);
                r0 = r4.f10278a;
                r0 = r0.f16508a;
                r0.m17450c(r1);
                r0 = r4.f10278a;
                r0 = r0.f16508a;
                r0.mo3231b(r1);
                r0 = mobi.mmdt.ott.view.conversation.activities.a.d.AnonymousClass20.f10295a;
                r3 = r4.f10278a;
                r3 = r3.f16508a;
                r3 = r3.az;
                r3 = r3.ordinal();
                r0 = r0[r3];
                switch(r0) {
                    case 1: goto L_0x00c5;
                    case 2: goto L_0x00c5;
                    case 3: goto L_0x011d;
                    case 4: goto L_0x011d;
                    default: goto L_0x011c;
                };
            L_0x011c:
                goto L_0x0126;
            L_0x011d:
                r0 = r4.f10278a;
                r0 = r0.f16508a;
                r0 = r0.am;
                r0.setVisible(r1);
            L_0x0126:
                r0 = r4.f10278a;
                r0 = r0.f16508a;
                r0 = r0.av;
                if (r0 != 0) goto L_0x0136;
            L_0x012e:
                r0 = r4.f10278a;
                r0 = r0.f16508a;
                r0 = r0.ay;
                if (r0 == 0) goto L_0x0170;
            L_0x0136:
                r0 = r4.f10278a;
                r0 = r0.f16508a;
                r0 = r0.an;
                r0.setVisible(r2);
                r0 = r4.f10278a;
                r0 = r0.f16508a;
                r0.m17450c(r2);
                r0 = r4.f10278a;
                r0 = r0.f16508a;
                r0.mo3231b(r2);
                r0 = r4.f10278a;
                r0 = r0.f16508a;
                r0 = r0.am;
                r0.setVisible(r2);
                r0 = r4.f10278a;
                r0 = r0.f16508a;
                r0 = r0.ak;
                r0.setVisible(r2);
                r0 = r4.f10278a;
                r0 = r0.f16508a;
                r0 = r0.ay;
                if (r0 == 0) goto L_0x0170;
            L_0x0167:
                r0 = r4.f10278a;
                r0 = r0.f16508a;
                r0 = r0.ao;
                r0.setVisible(r2);
            L_0x0170:
                r0 = r4.f10278a;
                r0 = r0.f16508a;
                r0.ah();
            L_0x0177:
                return;
                */
                throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.conversation.activities.a.d.1.1.run():void");
            }
        }

        C61261(C6875d c6875d) {
            this.f16508a = c6875d;
        }

        public final C0350e<Cursor> mo2226a(int i, Bundle bundle) {
            return C2980g.m7443d(this.f16508a.aj);
        }

        public final void mo2227a() {
        }

        public final /* synthetic */ void mo2228a(C0350e c0350e, Object obj) {
            Cursor cursor = (Cursor) obj;
            if (cursor.moveToFirst()) {
                C6023j c6023j = new C6023j(cursor);
                if (this.f16508a.aj.equals(c6023j.m13423a())) {
                    boolean z;
                    int d;
                    C6875d c6875d;
                    this.f16508a.az = c6023j.m13435m();
                    this.f16508a.ai = c6023j.m13424b();
                    this.f16508a.i.setBackgroundColor(C2491i.m6806b((C7576b) this.f16508a.f10377a, this.f16508a.aj));
                    if (!this.f16508a.az.equals(C2974a.OFFICIAL)) {
                        if (!this.f16508a.az.equals(C2974a.OFFICIAL_PAYMENT)) {
                            z = false;
                            this.f16508a.m13978a(c6023j.m7352a("dialog_title"), z);
                            d = c6023j.m13426d();
                            if (!(c6023j.m13424b().equals(C3004f.ADMIN) || c6023j.m13424b().equals(C3004f.OWNER))) {
                                this.f16508a.ah = c6023j.m13427e();
                            }
                            this.f16508a.as = c6023j.m13433k() == 0 ? c6023j.m13433k() : C2977d.f9306a;
                            this.f16508a.ap = c6023j.m13430h();
                            C6875d.m17410a(this.f16508a, d);
                            C6875d.m17409a(this.f16508a);
                            this.f16508a.aA = c6023j.m7352a("dialog_avatar_thumbnail_url");
                            if (this.f16508a.aA != null || this.f16508a.aA.isEmpty()) {
                                C1212c.m2872a((C7576b) this.f16508a.f10377a).m10950a(Integer.valueOf(R.drawable.ic_place_holder_channel)).m3034a(C1248f.m2945b()).m3033a().m3031a(this.f16508a.i);
                            } else {
                                d = (int) C2491i.m6804b((C7576b) this.f16508a.f10377a, 36.0f);
                                if (((C7576b) this.f16508a.f10377a) != null) {
                                    C1212c.m2873a((C7576b) this.f16508a.f10377a).m10958e().m3037a(C4515k.m8231a(C2556b.m6998a(this.f16508a.aA))).m3034a(C1248f.m2945b().m2955b(C1144h.f3689a).m2962h().m2949a((int) R.drawable.ic_place_holder_channel).m2954b(d, d)).m3032a(new C7408b(this, this.f16508a.i) {
                                        final /* synthetic */ C61261 f23137b;

                                        public final /* bridge */ /* synthetic */ void mo3320a(Object obj, C1242b c1242b) {
                                            super.mo3320a((Bitmap) obj, c1242b);
                                        }
                                    });
                                }
                            }
                            c6875d = this.f16508a;
                            if (c6875d.ai == C3004f.NONE) {
                                c6875d.aq = true;
                                c6875d.ar.setVisibility(8);
                            } else {
                                c6875d.aq = false;
                                c6875d.ar.setVisibility(0);
                            }
                            this.f16508a.h.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                            this.f16508a.h.setCompoundDrawablePadding(0);
                            C6875d.m17413b(this.f16508a);
                            this.f16508a.n = c6023j.m13428f();
                            new Handler().postDelayed(new C33501(this), 500);
                        }
                    }
                    z = true;
                    this.f16508a.m13978a(c6023j.m7352a("dialog_title"), z);
                    d = c6023j.m13426d();
                    this.f16508a.ah = c6023j.m13427e();
                    if (c6023j.m13433k() == 0) {
                    }
                    this.f16508a.as = c6023j.m13433k() == 0 ? c6023j.m13433k() : C2977d.f9306a;
                    this.f16508a.ap = c6023j.m13430h();
                    C6875d.m17410a(this.f16508a, d);
                    C6875d.m17409a(this.f16508a);
                    this.f16508a.aA = c6023j.m7352a("dialog_avatar_thumbnail_url");
                    if (this.f16508a.aA != null) {
                    }
                    C1212c.m2872a((C7576b) this.f16508a.f10377a).m10950a(Integer.valueOf(R.drawable.ic_place_holder_channel)).m3034a(C1248f.m2945b()).m3033a().m3031a(this.f16508a.i);
                    c6875d = this.f16508a;
                    if (c6875d.ai == C3004f.NONE) {
                        c6875d.aq = false;
                        c6875d.ar.setVisibility(0);
                    } else {
                        c6875d.aq = true;
                        c6875d.ar.setVisibility(8);
                    }
                    this.f16508a.h.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                    this.f16508a.h.setCompoundDrawablePadding(0);
                    C6875d.m17413b(this.f16508a);
                    this.f16508a.n = c6023j.m13428f();
                    new Handler().postDelayed(new C33501(this), 500);
                }
                return;
            }
            C2808d.m7148b(new C6700i(this.f16508a.aj));
        }
    }

    public C6875d(C7406c c7406c, Intent intent, String str, String str2, C2973m c2973m, boolean z) {
        super(c7406c, intent, str, c2973m, str2);
        this.aK = z;
    }

    static /* synthetic */ void m17409a(C6875d c6875d) {
        if (!c6875d.aB || c6875d.f16457C) {
            if (c6875d.ah && c6875d.aq) {
                c6875d.am();
            }
            return;
        }
        c6875d.al();
    }

    static /* synthetic */ void m17410a(C6875d c6875d, int i) {
        String a;
        if (c6875d.aB) {
            a = C4522p.m8236a(R.string.interactive_messages);
        } else {
            a = C2491i.m6766a((C7576b) c6875d.f10377a, (float) i, C4522p.m8236a(R.string.follower), C4522p.m8236a(R.string.followers));
        }
        c6875d.m13990b(a);
    }

    static /* synthetic */ void m17411a(C6875d c6875d, C2582a c2582a) {
        if (c6875d.aj != null) {
            C2808d.m7148b(new C6649a(C2973m.CHANNEL, c6875d.aj, c2582a, ""));
        }
        c6875d.aq();
    }

    private void ai() {
        this.aF.setVisibility(0);
        al();
        this.aF.setText(R.string.channel_rejected);
        this.aF.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_rejected_channel, 0, 0, 0);
    }

    private void aj() {
        this.aF.setVisibility(0);
        al();
        this.aF.setText(R.string.channel_pending);
        this.aF.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_pending_channel, 0, 0, 0);
    }

    private void ak() {
        this.aF.setVisibility(0);
        al();
        this.aF.setText(R.string.channel_deleted);
        this.aF.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_delete_gray, 0, 0, 0);
    }

    private void al() {
        if (!this.av && this.aB) {
            m13939L();
        }
    }

    private void am() {
        if (!this.aB) {
            m13938K();
        }
    }

    private void an() {
        this.e++;
        m13940M();
    }

    private void ao() {
        this.ap ^= 1;
        C2808d.m7147a(new C6694c(this.aj, this.ap));
        new Handler().postDelayed(new C33512(this), 500);
    }

    private void ap() {
        this.e--;
        m13940M();
    }

    private void aq() {
        Bundle bundle = new Bundle();
        bundle.putInt("dialog_id", 12);
        m14004e(bundle);
    }

    private void m17412b(int i, int i2, int i3, String str, String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.aj);
        C2808d.m7147a(new C6725n(arrayList, str, i, i2, i3, this.aj, C2973m.CHANNEL, str2, null));
    }

    static /* synthetic */ void m17413b(C6875d c6875d) {
        switch (c6875d.ai) {
            case VISITOR:
            case NONE:
                c6875d.al();
                return;
            case MEMBER:
                if (c6875d.ah) {
                    c6875d.m13969a(C4522p.m8236a(R.string.channel_type_here));
                    c6875d.am();
                } else {
                    c6875d.al();
                }
                switch (AnonymousClass20.f10296b[c6875d.as - 1]) {
                    case 2:
                        c6875d.aj();
                        return;
                    case 3:
                        c6875d.ai();
                        return;
                    case 4:
                        c6875d.ak();
                        return;
                    default:
                        return;
                }
            case ADMIN:
            case OWNER:
                if (c6875d.aB && !c6875d.aH) {
                    c6875d.aH = true;
                    C2808d.m7148b(new C6701j(c6875d.aj));
                    c6875d.an();
                }
                c6875d.h.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_red_channel_conversation, 0, 0, 0);
                c6875d.h.setCompoundDrawablePadding((int) C2491i.m6804b((C7576b) c6875d.f10377a, 4.0f));
                C2491i.m6828c(c6875d.h, UIThemeManager.getmInstance().getAccent_color());
                c6875d.am();
                switch (AnonymousClass20.f10296b[c6875d.as - 1]) {
                    case 1:
                        c6875d.aF.setVisibility(8);
                        c6875d.aF.setText("");
                        return;
                    case 2:
                        c6875d.aj();
                        return;
                    case 3:
                        c6875d.ai();
                        return;
                    case 4:
                        c6875d.ak();
                        return;
                    default:
                        return;
                }
            default:
                return;
        }
    }

    static /* synthetic */ void m17414c(C6875d c6875d) {
        final C1063i c6706o = new C6706o(c6875d.aj);
        C2808d.m7148b(c6706o);
        ((C7576b) c6875d.f10377a).runOnUiThread(new Runnable(c6875d) {
            final /* synthetic */ C6875d f10300b;

            public final void run() {
                C4501c.m8189a().m8192a((C7576b) this.f10300b.f10377a, c6706o);
            }
        });
    }

    static /* synthetic */ void m17418g(C6875d c6875d) {
        switch (c6875d.ai) {
            case VISITOR:
            case NONE:
                c6875d.al();
                return;
            case MEMBER:
                if (c6875d.ah) {
                    c6875d.am();
                    return;
                } else {
                    c6875d.al();
                    return;
                }
            case ADMIN:
            case OWNER:
                c6875d.am();
                switch (AnonymousClass20.f10296b[c6875d.as - 1]) {
                    case 1:
                        c6875d.am();
                        return;
                    case 2:
                        c6875d.al();
                        return;
                    case 3:
                        c6875d.al();
                        return;
                    default:
                        return;
                }
            default:
                return;
        }
    }

    public final void mo3190N() {
        if (!this.aG) {
            this.aG = true;
            C2808d.m7148b(new C6699h(this.aj));
            an();
        }
    }

    public final void mo3191O() {
    }

    public final boolean mo3192P() {
        return this.ah && this.aq;
    }

    protected final void mo3193Q() {
        if (this.as != C2977d.f9309d) {
            Activity activity;
            if (this.ai != C3004f.ADMIN) {
                if (this.ai != C3004f.OWNER) {
                    boolean z = ((C7576b) this.f10377a).getResources().getBoolean(R.bool.xlarge);
                    activity = (C7576b) this.f10377a;
                    String str = this.aj;
                    boolean z2 = this.aq;
                    Intent intent = new Intent(activity, z ? ChannelInfoActivityThemeDialog.class : ChannelInfoActivity.class);
                    intent.putExtra("KEY_CHANNEL_ID", str);
                    intent.putExtra("KEY_IS_FOLLOWED", z2);
                    activity.startActivityForResult(intent, 1478);
                    if (z) {
                        activity.overridePendingTransition(R.anim.anim_fade_in_activity_theme_dialog, R.anim.anim_fade_out_activity_theme_dialog);
                        return;
                    }
                    activity.overridePendingTransition(R.anim.anim_slide_in_left, R.anim.anim_slide_out_left);
                }
            }
            activity = (C7576b) this.f10377a;
            String str2 = this.aj;
            Intent intent2 = new Intent(activity, EditChannelInfoActivity.class);
            intent2.putExtra("KEY_CHANNEL_ID", str2);
            intent2.setFlags(268435456);
            activity.startActivity(intent2);
            activity.overridePendingTransition(R.anim.anim_slide_in_left, R.anim.anim_slide_out_left);
        }
    }

    protected final void mo3194R() {
        if (this.aI != null) {
            this.av = false;
            this.ak.setVisible(this.aq);
            ae();
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
        return this.at;
    }

    public final boolean mo3198V() {
        return this.av;
    }

    public final void mo3199W() {
        this.av = false;
    }

    public final void mo3200X() {
        this.at = -1;
    }

    public final String mo3201Y() {
        return this.au;
    }

    public final void mo3202Z() {
        this.ay = true;
        ag();
    }

    public final Dialog mo2299a(Bundle bundle) {
        switch (bundle.getInt("dialog_id")) {
            case 10:
                return C4488b.m8181a((C7576b) this.f10377a, C4522p.m8236a(R.string.are_you_sure_to_leave_and_delete_this_channel), C4522p.m8236a(R.string.action_leave_and_delete_channel), this.aM, C4522p.m8236a(R.string.cancel), null);
            case 11:
                C0663a c0663a = new C0663a((C7576b) this.f10377a);
                StringBuilder stringBuilder = new StringBuilder("<b>");
                stringBuilder.append(C4522p.m8236a(R.string.action_report));
                stringBuilder.append("</b>");
                c0663a.m1608a(Html.fromHtml(stringBuilder.toString()));
                c0663a.m1611a(new CharSequence[]{C4522p.m8236a(R.string.action_spam), C4522p.m8236a(R.string.action_violence), C4522p.m8236a(R.string.action_inappropriate), C4522p.m8236a(R.string.other)}, new OnClickListener(this) {
                    final /* synthetic */ C6875d f10294a;

                    {
                        this.f10294a = r1;
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
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
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
                        r3 = r2.f10294a;
                        r4 = r3.f10377a;
                        r4 = (mobi.mmdt.ott.view.components.p402d.C7576b) r4;
                        r0 = mobi.mmdt.ott.provider.p384f.C2973m.CHANNEL;
                        r1 = r3.aj;
                        r3 = r3.m14027n();
                        mobi.mmdt.ott.view.tools.C4478a.m8152a(r4, r0, r1, r3);
                        return;
                    L_0x0016:
                        r3 = r2.f10294a;
                        r4 = mobi.mmdt.ott.logic.p261a.ab.C2582a.REPORT_INAPPROPRIATE;
                    L_0x001a:
                        mobi.mmdt.ott.view.conversation.activities.p419a.C6875d.m17411a(r3, r4);
                        return;
                    L_0x001e:
                        r3 = r2.f10294a;
                        r4 = mobi.mmdt.ott.logic.p261a.ab.C2582a.REPORT_VIOLENCE;
                        goto L_0x001a;
                    L_0x0023:
                        r3 = r2.f10294a;
                        r4 = mobi.mmdt.ott.logic.p261a.ab.C2582a.REPORT_SPAM;
                        goto L_0x001a;
                        return;
                        */
                        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.conversation.activities.a.d.19.onClick(android.content.DialogInterface, int):void");
                    }
                });
                return c0663a.m1612a();
            case 12:
                return C4488b.m8183a((C7576b) this.f10377a, C2973m.CHANNEL);
            default:
                return super.mo2299a(bundle);
        }
    }

    public final void mo2300a() {
        super.mo2300a();
        this.aC = true;
        MyApplication.m12950a().f15918x = this.aj;
    }

    protected final void mo3203a(int i, int i2, int i3, String str, String str2) {
        if (this.as == C2977d.f9306a) {
            if (r0.ai != C3004f.ADMIN) {
                if (r0.ai != C3004f.OWNER) {
                    m17412b(i, i2, i3, str, str2);
                    return;
                }
            }
            C2808d.m7147a(new C6697f(r0.aj, str, i, i2, i3, r0.aj, C2973m.CHANNEL, str2));
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
            aq();
        }
    }

    public final void mo3204a(int i, boolean z, boolean z2, boolean z3) {
        this.at = i;
        this.g.m14089a(z, z2, z3);
    }

    public final void mo3205a(String str, int i, boolean z, boolean z2) {
        if (!z2) {
            Toast.makeText((C7576b) this.f10377a, C4522p.m8236a(R.string.access_denied), 0).show();
        } else if (this.ai != C3004f.NONE) {
            if (this.aj.equals("officialsoroushchannel") && C2878a.m7235c() && z && this.aJ) {
                C2878a.m7233a((C7576b) this.f10377a, C2814a.LIKE);
                this.aJ = false;
            }
            C2808d.m7147a(new C6710u(str, i, z));
        }
    }

    protected final void mo3206a(String str, String str2, String str3) {
        if (AnonymousClass20.f10296b[this.as - 1] == 1) {
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
            C1063i c6695d = new C6695d(this.aj, str, str2, this.aj, C2973m.CHANNEL, str3);
            C2808d.m7147a(c6750o);
        }
    }

    protected final void mo3207a(String str, String str2, C2988j c2988j, String str3, C2731a c2731a, boolean z) {
        if (AnonymousClass20.f10296b[this.as - 1] == 1) {
            if (r0.ai != C3004f.ADMIN) {
                if (r0.ai != C3004f.OWNER) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(r0.aj);
                    C2808d.m7147a(new C6721j(arrayList, str2, str, c2988j, r0.aj, C2973m.CHANNEL, str3, c2731a, z));
                    return;
                }
            }
            C2808d.m7147a(new C6696e(r0.aj, str2, str, c2988j, r0.aj, C2973m.CHANNEL, str3, c2731a, z));
        }
    }

    protected final void mo3208a(String str, String str2, C2988j c2988j, C2731a c2731a, boolean z) {
        if (AnonymousClass20.f10296b[this.as - 1] == 1) {
            if (r0.ai != C3004f.ADMIN) {
                if (r0.ai != C3004f.OWNER) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(r0.aj);
                    C2808d.m7147a(new C6721j(arrayList, str2, str, c2988j, r0.aj, C2973m.CHANNEL, c2731a, z));
                    return;
                }
            }
            C2808d.m7147a(new C6749n(r0.aj, str2, str, c2988j, c2731a));
        }
    }

    public final void mo3209a(C2522a c2522a) {
    }

    public final boolean mo3210a(Menu menu) {
        ((C7576b) this.f10377a).getMenuInflater().inflate(R.menu.menu_channel_conversation, menu);
        this.ak = menu.findItem(R.id.action_mute_notification);
        this.ao = menu.findItem(R.id.action_search_chat);
        this.al = menu.findItem(R.id.action_show_interactive_messages);
        this.am = menu.findItem(R.id.action_payment);
        this.an = menu.findItem(R.id.action_leave_and_delete);
        this.aE = menu.findItem(R.id.action_create_poll);
        this.aD = menu.findItem(R.id.action_report);
        this.ak.setTitle(C4522p.m8236a(R.string.action_mute_notification));
        this.ao.setTitle(C4522p.m8236a(R.string.action_search_chat));
        this.al.setTitle(C4522p.m8236a(R.string.action_show_interactive_messages));
        this.am.setTitle(C4522p.m8236a(R.string.action_payment));
        this.an.setTitle(C4522p.m8236a(R.string.action_leave_and_delete_channel));
        this.aE.setTitle(C4522p.m8236a(R.string.create_poll));
        this.aD.setTitle(C4522p.m8236a(R.string.action_report));
        C2491i.m6790a(this.aE.getIcon(), UIThemeManager.getmInstance().getIcon_not_selected_color());
        if (this.ay) {
            mo3202Z();
        } else {
            this.ak.setVisible(this.aq);
            ae();
        }
        SearchManager searchManager = (SearchManager) ((C7576b) this.f10377a).getSystemService("search");
        if (this.ao != null) {
            this.aI = (SearchView) this.ao.getActionView();
        }
        if (this.aI != null) {
            this.aI.setSearchableInfo(searchManager.getSearchableInfo(((C7576b) this.f10377a).getComponentName()));
            this.aI = m13955a(this.aI);
        }
        this.aI.setOnSearchClickListener(new View.OnClickListener(this) {
            final /* synthetic */ C6875d f10303a;

            {
                this.f10303a = r1;
            }

            public final void onClick(View view) {
                this.f10303a.o = true;
                this.f10303a.av = true;
                this.f10303a.am();
                this.f10303a.m13936I();
                if (this.f10303a.f16457C) {
                    this.f10303a.m14020i();
                    this.f10303a.ax = true;
                }
                this.f10303a.j.m14069e((C7576b) this.f10303a.f10377a);
                this.f10303a.ag();
                this.f10303a.av = true;
                this.f10303a.m.clear();
            }
        });
        this.aI.addOnAttachStateChangeListener(new OnAttachStateChangeListener(this) {
            final /* synthetic */ C6875d f10304a;

            {
                this.f10304a = r1;
            }

            public final void onViewAttachedToWindow(View view) {
            }

            public final void onViewDetachedFromWindow(View view) {
                this.f10304a.av = false;
                C6875d.m17418g(this.f10304a);
                this.f10304a.m13936I();
                this.f10304a.j.m14070f();
                this.f10304a.ak.setVisible(this.f10304a.aq);
                this.f10304a.ah();
                this.f10304a.ae();
                this.f10304a.aw = false;
                if (this.f10304a.ax && !this.f10304a.f16469O) {
                    this.f10304a.m14023j();
                }
            }
        });
        if (!this.au.isEmpty()) {
            am();
            this.ao.expandActionView();
            this.ak.setVisible(false);
            m17450c(false);
            this.an.setVisible(false);
            this.aD.setVisible(false);
            mo3231b(false);
            this.am.setVisible(false);
            this.av = true;
            this.aI.setQuery(this.au, this.aw);
            if (this.aw) {
                C2808d.m7147a(new C6757d(this.aj, this.au));
            }
        }
        this.aI.setImeOptions(this.aI.getImeOptions() | 268435456);
        this.aI.setOnQueryTextListener(new OnQueryTextListener(this) {
            final /* synthetic */ C6875d f16509a;

            {
                this.f16509a = r1;
            }

            public final boolean onQueryTextChange(String str) {
                this.f16509a.aw = false;
                this.f16509a.au = "";
                return false;
            }

            public final boolean onQueryTextSubmit(String str) {
                C2808d.m7147a(new C6757d(this.f16509a.aj, str));
                this.f16509a.aw = true;
                return false;
            }
        });
        return super.mo3210a(menu);
    }

    public final boolean mo2315a(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.action_mute_notification) {
            C2808d.m7148b(new C6777a(C2973m.CHANNEL, this.aj, this.n ^ 1));
        } else if (itemId == R.id.action_show_interactive_messages) {
            this.aB ^= 1;
            ao();
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
            }
            bundle.putInt(str, i);
            m14004e(bundle);
        }
        return super.mo2315a(menuItem);
    }

    public final void aa() {
        this.ay = false;
        if (this.ak != null && this.as == C2977d.f9306a) {
            this.ak.setVisible(this.aq);
            this.ao.setVisible(true);
            ah();
            ae();
        }
    }

    public final void ab() {
        if (this.ao != null) {
            this.ao.collapseActionView();
        }
    }

    protected final boolean ac() {
        return this.aq;
    }

    public final C3004f ad() {
        return this.ai;
    }

    final void ae() {
        if (this.as != 0) {
            switch (AnonymousClass20.f10296b[this.as - 1]) {
                case 1:
                    if (this.ai != C3004f.ADMIN) {
                        if (this.ai != C3004f.OWNER) {
                            this.an.setVisible(this.aq);
                            m17450c(false);
                            this.am.setVisible(false);
                            mo3231b(false);
                            return;
                        }
                    }
                    this.an.setVisible(false);
                    m17450c(true);
                    if (this.az != null) {
                        switch (this.az) {
                            case NORMAL:
                            case OFFICIAL:
                                this.am.setVisible(false);
                                break;
                            case PAYMENT:
                            case OFFICIAL_PAYMENT:
                                break;
                            default:
                                break;
                        }
                    }
                    this.am.setVisible(true);
                    mo3231b(true);
                    return;
                case 2:
                case 3:
                    this.an.setVisible(false);
                    m17450c(false);
                    this.am.setVisible(false);
                    mo3231b(false);
                    return;
                default:
                    return;
            }
        }
    }

    final boolean af() {
        if (this.ai != C3004f.ADMIN) {
            if (this.ai != C3004f.OWNER) {
                return false;
            }
        }
        return true;
    }

    final void ag() {
        if (this.an != null) {
            this.an.setVisible(false);
            m17450c(false);
            mo3231b(false);
            this.am.setVisible(false);
            this.ak.setVisible(false);
            this.ao.setVisible(false);
            this.aD.setVisible(false);
        }
    }

    final void ah() {
        if (this.aD != null) {
            if (this.ai == C3004f.OWNER) {
                this.aD.setVisible(false);
                return;
            }
            this.aD.setVisible(true);
        }
    }

    public final C0350e<Cursor> mo3217b(int i) {
        StringBuilder stringBuilder;
        String str = this.aj;
        boolean z = this.aB;
        StringBuilder stringBuilder2 = new StringBuilder("SELECT conversations._id as _id,conversations_message_id,conversations_event_type,conversations_event,conversations_send_time,conversations_receive_time,conversations_likes,conversations_my_like,conversations_visits,conversations_my_visit,conversations_my_vote,conversations_is_need_notify,conversations_reply_message_id,conversations_link_preview,conversations_direction_type,conversations_event_state,conversations_party,conversations_peer_user_id,conversations_group_type,conversations_file_id,conversations_sticker_id,conversations_forward_user_id,conversations_forward_group_type,conversations_forward_name,conversations_forward_message_id,conversations_edit_time,conversations_extra,files_file_uri,files_type,files_name,files_size,files_progress,files_thumbnail_uri,files_download_state,files_thumbnail_download_state,files_duration,files_audio_playing_time,files_audio_state,files_image_width,files_image_height,stickers_sticker_id,stickers_package_id,stickers_sticker_version,stickers_original_uri,stickers_thumbnail_uri,stickers_ver_span,stickers_hor_span,stickers_view_multiplier,stickers_download_state,members_nick_name,members_avatar_url,members_avatar_thumbnail_url,members_user_id,members_is_local_user,members_last_online,members_last_position,members_can_reply,members_is_anouncer,members_local_name,members_local_phone_number,members_moto,members_is_pined,members_is_mute,members_local_image_uri,dialog_party,dialog_title,dialog_avatar_thumbnail_url,dialog_avatar_url,dialog_description,dialog_is_mute,dialog_is_pinned,dialog_my_role,dialog_creation_date,dialog_is_reply_allowed,dialog_show_all_messages,dialog_unread_messages_count,dialog_last_message_id,dialog_updated_at,dialog_link,dialog_state,dialog_last_position,dialog_extra,channel_owner,dialog_members_count,dialog_type,channel_type FROM (((( conversations LEFT JOIN files ON conversations_file_id = files._id) LEFT JOIN stickers ON conversations_sticker_id = stickers_complete_sticker_id) LEFT JOIN members ON conversations_peer_user_id = ");
        stringBuilder2.append("members_user_id) LEFT JOIN dialogs ON conversations_party = dialog_party ) WHERE conversations_party = '");
        stringBuilder2.append(str);
        stringBuilder2.append("' AND conversations_event_state <> ");
        stringBuilder2.append(C2971k.DRAFT.ordinal());
        stringBuilder2.append(" AND conversations_event_state <> '");
        stringBuilder2.append(C2971k.DELETED.ordinal());
        stringBuilder2.append("' AND conversations_event_type <> '");
        stringBuilder2.append(C2972l.HEAD_MESSAGE.ordinal());
        stringBuilder2.append("'");
        str = stringBuilder2.toString();
        stringBuilder2 = new StringBuilder();
        stringBuilder2.append(str);
        stringBuilder2.append(" AND (");
        str = stringBuilder2.toString();
        if (z) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            str = "conversations_group_type != ";
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            str = "conversations_group_type = ";
        }
        stringBuilder.append(str);
        stringBuilder.append(C2973m.CHANNEL.ordinal());
        stringBuilder.append(")");
        str = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(" ORDER BY conversations_send_time DESC  LIMIT ");
        stringBuilder.append(i);
        String stringBuilder3 = stringBuilder.toString();
        return new C7316h(C2967c.f9203a, stringBuilder3, C2967c.f9203a, C2985d.f9350a, C3012b.f9455a, C3000b.f9413a, C2981h.f9316a);
    }

    public final void mo2316b() {
        super.mo2316b();
        this.aC = false;
        MyApplication.m12950a().f15918x = null;
    }

    protected final void mo3218b(int i, int i2, int i3, String str) {
        if (this.as == C2977d.f9306a) {
            if (this.ai != C3004f.ADMIN) {
                if (this.ai != C3004f.OWNER) {
                    m17412b(i, i2, i3, str, null);
                    return;
                }
            }
            C2808d.m7147a(new C6753r(this.aj, str, i, i2, i3));
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
                this.au = bundle.getString("KEY_SEARCH_ROTATE", "");
            }
            if (bundle.containsKey("KEY_IS_SEARCHING_TEXT_MESSAGE")) {
                this.av = bundle.getBoolean("KEY_IS_SEARCHING_TEXT_MESSAGE", false);
            }
            if (bundle.containsKey("KEY_IS_SUBMIT_PRESSED")) {
                this.aw = bundle.getBoolean("KEY_IS_SUBMIT_PRESSED", false);
            }
            if (bundle.containsKey("KEY_MY_ROLE_TYPE")) {
                this.ai = (C3004f) bundle.get("KEY_MY_ROLE_TYPE");
            }
            if (bundle.containsKey("KEY_CHANNEL_TYPE")) {
                this.az = (C2974a) bundle.get("KEY_CHANNEL_TYPE");
            }
            if (bundle.containsKey("KEY_INTERACTIVE_MODE")) {
                this.aB = bundle.getBoolean("KEY_INTERACTIVE_MODE");
            }
        }
        super.mo2318b(bundle);
        this.aF = (TextView) this.b.findViewById(R.id.channelState_textView);
        this.ar = (Button) this.b.findViewById(R.id.follow_button);
        ((C7576b) this.f10377a).m19190e().mo268a(4, null, this.aL);
        this.aF.setVisibility(8);
        this.ar.setVisibility(8);
        this.ar.setOnClickListener(new View.OnClickListener(this) {
            final /* synthetic */ C6875d f10298a;

            {
                this.f10298a = r1;
            }

            public final void onClick(View view) {
                C6875d.m17414c(this.f10298a);
            }
        });
        m14026m();
        C2491i.m6819b(this.ar, UIThemeManager.getmInstance().getAccent_color());
        C2491i.m6798a(this.ar, UIThemeManager.getmInstance().getButton_text_color());
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

    final void mo3231b(boolean z) {
        if (this.aB) {
            z = false;
        }
        this.al.setVisible(z);
    }

    final void m17450c(boolean z) {
        if (this.aB) {
            z = false;
        }
        this.aE.setVisible(z);
    }

    public final void mo2326d() {
        super.mo2326d();
        MyApplication.m12950a().f15917w.clear();
        ((C7576b) this.f10377a).m19190e().mo269a(4);
    }

    public final void mo2327d(Bundle bundle) {
        super.mo2327d(bundle);
        bundle.putBoolean("KEY_IS_SUBMIT_PRESSED", this.aw);
        if (this.aI != null) {
            String str;
            boolean z;
            bundle.putString("KEY_SEARCH_ROTATE", this.aI.getQuery() != null ? this.aI.getQuery().toString() : "");
            if (this.aI.getQuery() == null || !this.aI.getQuery().toString().isEmpty()) {
                str = "KEY_IS_SEARCHING_TEXT_MESSAGE";
                z = this.av;
            } else {
                str = "KEY_IS_SEARCHING_TEXT_MESSAGE";
                z = false;
            }
            bundle.putBoolean(str, z);
        }
        bundle.putSerializable("KEY_MY_ROLE_TYPE", this.ai);
        bundle.putSerializable("KEY_CHANNEL_TYPE", this.az);
        bundle.putSerializable("KEY_POLL_RESULT", this.f);
        bundle.putBoolean("KEY_INTERACTIVE_MODE", this.aB);
    }

    public final void mo2330e() {
        if (this.aB) {
            this.aB ^= 1;
            ao();
        } else if (!this.aK || this.aq) {
            super.mo2330e();
        } else {
            Activity activity = (C7576b) this.f10377a;
            Object obj = this.aA;
            View.OnClickListener anonymousClass23 = new View.OnClickListener(this) {
                final /* synthetic */ C6875d f10301a;

                {
                    this.f10301a = r1;
                }

                public final void onClick(View view) {
                    C6875d.m17414c(this.f10301a);
                    super.mo2330e();
                }
            };
            View.OnClickListener anonymousClass24 = new View.OnClickListener(this) {
                final /* synthetic */ C6875d f10302a;

                {
                    this.f10302a = r1;
                }

                public final void onClick(View view) {
                    super.mo2330e();
                }
            };
            C0663a c0663a = new C0663a(activity, R.style.AppCompatAlertDialogStyle);
            View inflate = activity.getLayoutInflater().inflate(R.layout.dialog_follow_channel, null);
            c0663a.m1607a(inflate);
            ImageView imageView = (ImageView) inflate.findViewById(R.id.soroush_icon);
            Button button = (Button) inflate.findViewById(R.id.update_button_yes);
            Button button2 = (Button) inflate.findViewById(R.id.update_button_no);
            C1212c.m2872a(activity).m10950a(obj).m3034a(C1248f.m2945b()).m3033a().m3031a(imageView);
            button.setOnClickListener(anonymousClass23);
            C6389b a = c0663a.m1612a();
            button2.setOnClickListener(anonymousClass24);
            a.show();
        }
    }

    protected final void mo3220f(String str) {
        if (AnonymousClass20.f10296b[this.as - 1] == 1) {
            if (this.ai != C3004f.ADMIN) {
                if (this.ai != C3004f.OWNER) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(this.aj);
                    C2808d.m7147a(new C6726o(arrayList, str, this.aj, C2973m.CHANNEL, null, null));
                    return;
                }
            }
            C2808d.m7147a(new C6751p(this.aj, str, new C2674a(null, null, null)));
        }
    }

    public final void mo3221g(String str) {
        C2808d.m7148b(this.aB ? new C6701j(this.aj, str) : new C6699h(this.aj, str));
        an();
    }

    public final void mo3222h(String str) {
        if (this.aI != null) {
            this.ao.expandActionView();
            this.j.m14069e((C7576b) this.f10377a);
            this.an.setVisible(false);
            m17450c(false);
            mo3231b(false);
            this.am.setVisible(false);
            this.ak.setVisible(false);
            this.aI.setQuery(str, true);
            this.av = true;
            this.m.clear();
            this.aw = false;
        }
    }

    protected final void mo3223h(String str, String str2) {
        if (AnonymousClass20.f10296b[this.as - 1] == 1) {
            if (r0.ai != C3004f.ADMIN) {
                if (r0.ai != C3004f.OWNER) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(r0.aj);
                    C2808d.m7147a(new C6726o(arrayList, str, r0.aj, C2973m.CHANNEL, str2, null));
                    return;
                }
            }
            C2808d.m7147a(new C6698g(r0.aj, str, r0.aj, C2973m.CHANNEL, str2));
        }
    }

    public final void mo3224i(String str) {
    }

    protected final void mo3225i(String str, String str2) {
        C2808d.m7147a(new C6762d(str, this.aj, C2973m.CHANNEL, str2));
    }

    public final void mo3226j(String str) {
        C4478a.m8149a((C7576b) this.f10377a, str, true);
    }

    public final void mo3227k(String str) {
        final C1063i c6704m = new C6704m(str);
        C2808d.m7148b(c6704m);
        ((C7576b) this.f10377a).runOnUiThread(new Runnable(this) {
            final /* synthetic */ C6875d f10307b;

            public final void run() {
                C4501c.m8189a().m8192a((C7576b) this.f10307b.f10377a, c6704m);
            }
        });
    }

    public final void onEvent(C2643a c2643a) {
        ((C7576b) this.f10377a).runOnUiThread(new Runnable(this) {
            final /* synthetic */ C6875d f10287a;

            {
                this.f10287a = r1;
            }

            public final void run() {
                C6875d.m17409a(this.f10287a);
            }
        });
    }

    public final void onEvent(final C5917d c5917d) {
        ap();
        ((C7576b) this.f10377a).runOnUiThread(new Runnable(this) {
            final /* synthetic */ C6875d f10318b;

            public final void run() {
                this.f10318b.g.m14091b(true);
                C4501c.m8189a().m8193b();
                C4513i.m8228a((C7576b) this.f10318b.f10377a, c5917d.f8890a);
            }
        });
    }

    public final void onEvent(final C2644e c2644e) {
        ap();
        final boolean z = c2644e.f8547b ^ 1;
        ((C7576b) this.f10377a).runOnUiThread(new Runnable(this) {
            final /* synthetic */ C6875d f10316c;

            public final void run() {
                this.f10316c.g.f16545D = z;
                if (z) {
                    this.f10316c.g.mo2354a(false);
                    this.f10316c.g.m14107n();
                    this.f10316c.m13930C();
                }
                if (c2644e.f8546a) {
                    this.f10316c.g.m14091b(true);
                    if (this.f10316c.at > 0) {
                        this.f10316c.g.m14089a(false, false, false);
                        this.f10316c.m13930C();
                        return;
                    }
                    this.f10316c.g.m14106m();
                    this.f10316c.m13930C();
                    return;
                }
                C4501c.m8189a().m8193b();
            }
        });
    }

    public final void onEvent(final C5918f c5918f) {
        ((C7576b) this.f10377a).runOnUiThread(new Runnable(this) {
            final /* synthetic */ C6875d f10286b;

            public final void run() {
                C4501c.m8189a().m8193b();
                C4513i.m8228a((C7576b) this.f10286b.f10377a, c5918f.f8890a);
            }
        });
    }

    public final void onEvent(final C5921m c5921m) {
        ((C7576b) this.f10377a).runOnUiThread(new Runnable(this) {
            final /* synthetic */ C6875d f10291b;

            public final void run() {
                C4501c.m8189a().m8193b();
                C4513i.m8228a((C7576b) this.f10291b.f10377a, c5921m.f8890a);
            }
        });
    }

    public final void onEvent(final C2649n c2649n) {
        ((C7576b) this.f10377a).runOnUiThread(new Runnable(this) {
            final /* synthetic */ C6875d f10289b;

            public final void run() {
                C4501c.m8189a().m8193b();
                this.f10289b.f = c2649n.f8564a;
                this.f10289b.m13979a(this.f10289b.f);
            }
        });
    }

    public final void onEvent(final C5922o c5922o) {
        ((C7576b) this.f10377a).runOnUiThread(new Runnable(this) {
            final /* synthetic */ C6875d f10320b;

            public final void run() {
                C4501c.m8189a().m8193b();
                C4513i.m8228a((C7576b) this.f10320b.f10377a, c5922o.f8890a);
            }
        });
    }

    public final void onEvent(final C2650p c2650p) {
        ((C7576b) this.f10377a).runOnUiThread(new Runnable(this) {
            final /* synthetic */ C6875d f10280b;

            public final void run() {
                C4501c.m8189a().m8193b();
                C2980g.m7423a(c2650p.f8565a, C2778b.m7093a());
                this.f10280b.ar.setVisibility(8);
            }
        });
    }

    public final void onEvent(final C5923q c5923q) {
        ((C7576b) this.f10377a).runOnUiThread(new Runnable(this) {
            final /* synthetic */ C6875d f10313b;

            public final void run() {
                C4501c.m8189a().m8193b();
                C4513i.m8228a((C7576b) this.f10313b.f10377a, c5923q.f8890a);
            }
        });
    }

    public final void onEvent(C2651r c2651r) {
        ((C7576b) this.f10377a).runOnUiThread(new C33544(this));
    }

    public final void onEvent(final C5925t c5925t) {
        ((C7576b) this.f10377a).runOnUiThread(new Runnable(this) {
            final /* synthetic */ C6875d f10282b;

            public final void run() {
                C4501c.m8189a().m8193b();
                C4513i.m8228a((C7576b) this.f10282b.f10377a, c5925t.f8890a);
            }
        });
    }

    public final void onEvent(C2652u c2652u) {
        ((C7576b) this.f10377a).runOnUiThread(new Runnable(this) {
            final /* synthetic */ C6875d f10284a;

            {
                this.f10284a = r1;
            }

            public final void run() {
                C4501c.m8189a().m8193b();
            }
        });
    }

    public final void onEvent(C2707u c2707u) {
        ((C7576b) this.f10377a).runOnUiThread(new C33565(this));
    }

    public final void onEvent(final C5949z c5949z) {
        ((C7576b) this.f10377a).runOnUiThread(new Runnable(this) {
            final /* synthetic */ C6875d f10293b;

            public final void run() {
                C4513i.m8228a((C7576b) this.f10293b.f10377a, c5949z.f8890a);
            }
        });
    }

    public final void onEvent(C2716a c2716a) {
        C4501c.m8189a().m8193b();
        m14012g();
        m13958a((int) R.anim.anim_slide_in_right, (int) R.anim.anim_slide_out_right);
    }
}
