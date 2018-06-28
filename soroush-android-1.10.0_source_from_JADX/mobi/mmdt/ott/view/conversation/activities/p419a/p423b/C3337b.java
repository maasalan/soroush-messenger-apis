package mobi.mmdt.ott.view.conversation.activities.p419a.p423b;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import android.support.v7.app.C6389b;
import android.support.v7.app.C6389b.C0663a;
import android.text.ClipboardManager;
import android.view.ActionMode;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.gms.common.C5462e;
import com.google.android.gms.location.places.p161a.C5508a.C5507a;
import com.p072b.p073a.p074a.C1063i;
import com.p085c.p086a.C1212c;
import com.p085c.p086a.p089c.p092b.C1144h;
import com.p085c.p086a.p105g.C1248f;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.componentsutils.view.roundavatarimageview.RoundAvatarImageView;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.lib_webservicescomponent.p257d.C2556b;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.lookup.base.LookUpGroupJoinLinkResponse;
import mobi.mmdt.ott.logic.C2808d;
import mobi.mmdt.ott.logic.p261a.ac.p267b.C6651b;
import mobi.mmdt.ott.logic.p261a.ae.p544b.C6661b;
import mobi.mmdt.ott.logic.p261a.ae.p544b.C6662c;
import mobi.mmdt.ott.logic.p261a.p287g.p293b.C2676c;
import mobi.mmdt.ott.logic.p261a.p287g.p293b.C6727b;
import mobi.mmdt.ott.logic.p261a.p287g.p293b.C6728e;
import mobi.mmdt.ott.logic.p261a.p298k.C6741f;
import mobi.mmdt.ott.logic.p261a.p301l.p548b.C6758e;
import mobi.mmdt.ott.logic.p261a.p308q.p309a.C2729d;
import mobi.mmdt.ott.logic.p261a.p308q.p309a.C6766b;
import mobi.mmdt.ott.logic.p357j.C6811c;
import mobi.mmdt.ott.logic.p359k.C2837a;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p384f.C2973m;
import mobi.mmdt.ott.provider.p385g.C2980g;
import mobi.mmdt.ott.provider.p386h.C2984c;
import mobi.mmdt.ott.provider.p386h.C2987i;
import mobi.mmdt.ott.provider.p390l.C3004f;
import mobi.mmdt.ott.provider.p394p.C3014a;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.conversation.activities.p419a.C6123a;
import mobi.mmdt.ott.view.conversation.activities.p419a.C6875d;
import mobi.mmdt.ott.view.conversation.activities.p419a.C6876e;
import mobi.mmdt.ott.view.conversation.activities.p419a.C6877f;
import mobi.mmdt.ott.view.conversation.activities.p419a.p423b.C3337b;
import mobi.mmdt.ott.view.conversation.p573f.C7197a;
import mobi.mmdt.ott.view.conversation.p573f.p597a.C7358a;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p602c.C7584c;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p602c.C7585d;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p602c.C7586e;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p602c.C7587f;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p602c.C7588g;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p602c.C7589h;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p602c.C7592k;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p602c.C7593l;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p602c.C7594m;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p602c.C7595n;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p603d.C7597c;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p603d.C7598d;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p603d.C7599e;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p603d.C7600f;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p603d.C7601g;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p603d.C7602h;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p603d.C7605k;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p603d.C7606l;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p603d.C7607m;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p603d.C7608n;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p604e.C7610c;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p604e.C7611d;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p604e.C7612e;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p604e.C7613f;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p604e.C7614g;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p604e.C7615h;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p604e.C7618k;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p604e.C7619l;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p604e.C7620m;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p604e.C7621n;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p605f.C7623c;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p605f.C7624d;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p605f.C7625e;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p605f.C7626f;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p605f.C7627g;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p605f.C7628h;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p605f.C7631k;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p605f.C7632l;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p605f.C7633m;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p605f.C7634n;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p606g.C7636c;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p606g.C7637d;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p606g.C7638e;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p606g.C7639f;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p606g.C7640g;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p606g.C7641h;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p606g.C7644k;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p606g.C7645l;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p606g.C7646m;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p606g.C7647n;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p607h.C7649c;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p607h.C7650d;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p607h.C7651e;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p607h.C7652f;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p607h.C7653g;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p607h.C7654h;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p607h.C7657k;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p607h.C7658l;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p607h.C7659m;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p607h.C7660n;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p608i.C7662c;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p608i.C7663d;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p608i.C7664e;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p608i.C7665f;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p608i.C7666g;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p608i.C7667h;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p608i.C7670k;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p608i.C7671l;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p608i.C7672m;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p608i.C7673n;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p609j.C7675c;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p609j.C7676d;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p609j.C7677e;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p609j.C7678f;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p609j.C7679g;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p609j.C7680h;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p609j.C7683k;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p609j.C7684l;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p609j.C7685m;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p609j.C7686n;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p610a.C7699c;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p610a.C7700d;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p610a.C7701e;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p610a.C7702f;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p610a.C7703g;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p610a.C7704h;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p610a.C7706j;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p610a.C7707k;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p610a.C7708l;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p610a.C7709m;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p611b.C7711c;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p611b.C7712d;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p611b.C7713e;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p611b.C7714f;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p611b.C7715g;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p611b.C7716h;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p611b.C7718j;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p611b.C7719k;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p611b.C7720l;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p611b.C7721m;
import mobi.mmdt.ott.view.stickermarket.StickerDetailsActivity;
import mobi.mmdt.ott.view.tools.C4478a;
import mobi.mmdt.ott.view.tools.C4488b;
import mobi.mmdt.ott.view.tools.C4515k;
import mobi.mmdt.ott.view.tools.C4516l;
import mobi.mmdt.ott.view.tools.C4522p;
import mobi.mmdt.ott.view.tools.C4533r;
import mobi.mmdt.ott.view.tools.p479c.C4501c;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

public final class C3337b {

    static class AnonymousClass15 implements OnClickListener {
        final /* synthetic */ C6123a f10219a;
        final /* synthetic */ String f10220b;
        final /* synthetic */ String[] f10221c;
        final /* synthetic */ ActionMode f10222d;

        public AnonymousClass15(C6123a c6123a, String str, String[] strArr, ActionMode actionMode) {
            this.f10219a = c6123a;
            this.f10220b = str;
            this.f10221c = strArr;
            this.f10222d = actionMode;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C3337b.m7808a(this.f10219a, this.f10220b, this.f10221c, this.f10222d, false);
        }
    }

    static class AnonymousClass16 implements OnClickListener {
        final /* synthetic */ C6123a f10223a;
        final /* synthetic */ String f10224b;
        final /* synthetic */ String[] f10225c;
        final /* synthetic */ ActionMode f10226d;

        public AnonymousClass16(C6123a c6123a, String str, String[] strArr, ActionMode actionMode) {
            this.f10223a = c6123a;
            this.f10224b = str;
            this.f10225c = strArr;
            this.f10226d = actionMode;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C3337b.m7813b(this.f10223a, this.f10224b, this.f10225c, this.f10226d, false);
        }
    }

    static class AnonymousClass17 implements OnClickListener {
        final /* synthetic */ C6123a f10227a;
        final /* synthetic */ boolean f10228b;
        final /* synthetic */ String f10229c;
        final /* synthetic */ String[] f10230d;
        final /* synthetic */ String[] f10231e;
        final /* synthetic */ ActionMode f10232f;

        public AnonymousClass17(C6123a c6123a, boolean z, String str, String[] strArr, String[] strArr2, ActionMode actionMode) {
            this.f10227a = c6123a;
            this.f10228b = z;
            this.f10229c = str;
            this.f10230d = strArr;
            this.f10231e = strArr2;
            this.f10232f = actionMode;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            if (((C6875d) this.f10227a).ai == C3004f.MEMBER || this.f10228b) {
                C3337b.m7807a(this.f10229c, this.f10231e, C2973m.SINGLE, false);
            } else {
                C2808d.m7147a(new C6741f(this.f10229c, this.f10230d));
            }
            if (this.f10232f != null) {
                this.f10232f.finish();
            }
        }
    }

    static class AnonymousClass18 implements OnClickListener {
        final /* synthetic */ C6123a f10233a;
        final /* synthetic */ boolean f10234b;
        final /* synthetic */ String f10235c;
        final /* synthetic */ String f10236d;
        final /* synthetic */ String[] f10237e;
        final /* synthetic */ ActionMode f10238f;

        public AnonymousClass18(C6123a c6123a, boolean z, String str, String str2, String[] strArr, ActionMode actionMode) {
            this.f10233a = c6123a;
            this.f10234b = z;
            this.f10235c = str;
            this.f10236d = str2;
            this.f10237e = strArr;
            this.f10238f = actionMode;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            if (((C6875d) this.f10233a).ai == C3004f.MEMBER || this.f10234b) {
                C3337b.m7807a(this.f10235c, this.f10237e, C2973m.SINGLE, false);
            } else {
                C2808d.m7147a(new C6741f(this.f10235c, new String[]{this.f10236d}));
            }
            if (this.f10238f != null) {
                this.f10238f.finish();
            }
        }
    }

    static class AnonymousClass19 implements OnClickListener {
        final /* synthetic */ Activity f10239a;

        public AnonymousClass19(Activity activity) {
            this.f10239a = activity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C2837a.m7167a(this.f10239a, "android.permission.RECORD_AUDIO", 185);
        }
    }

    static class C33281 implements Comparator<C7197a> {
        C33281() {
        }

        public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
            return ((C7197a) obj).f20781g < ((C7197a) obj2).f20781g ? -1 : 1;
        }
    }

    static class C33292 implements OnClickListener {
        final /* synthetic */ Activity f10240a;

        public C33292(Activity activity) {
            this.f10240a = activity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C2837a.m7167a(this.f10240a, "android.permission.WRITE_EXTERNAL_STORAGE", 187);
        }
    }

    static class C33303 implements OnClickListener {
        final /* synthetic */ Activity f10241a;
        final /* synthetic */ int f10242b;

        public C33303(Activity activity, int i) {
            this.f10241a = activity;
            this.f10242b = i;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            switch (i) {
                case 0:
                    C3014a.m7527a(this.f10241a, this.f10242b, true);
                    return;
                case 1:
                    C2808d.m7148b(new C6651b(this.f10242b));
                    return;
                default:
                    return;
            }
        }
    }

    static class C33314 implements OnClickListener {
        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    static class C33325 implements OnClickListener {
        final /* synthetic */ Activity f10243a;
        final /* synthetic */ long f10244b;

        public C33325(Activity activity, long j) {
            this.f10243a = activity;
            this.f10244b = j;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            Object obj = (!C4516l.m8232a() || C2837a.m7169a()) ? null : 1;
            if (obj != null) {
                C2837a.m7167a(this.f10243a, "android.permission.WRITE_EXTERNAL_STORAGE", 187);
            } else {
                C2808d.m7147a(new C6766b(this.f10244b));
            }
        }
    }

    static class C33336 implements OnClickListener {
        final /* synthetic */ Activity f10245a;
        final /* synthetic */ String f10246b;

        public C33336(Activity activity, String str) {
            this.f10245a = activity;
            this.f10246b = str;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C2729d.m7072a(this.f10245a, this.f10246b);
        }
    }

    static class C33347 implements OnClickListener {
        final /* synthetic */ String f10247a;
        final /* synthetic */ String f10248b;

        public C33347(String str, String str2) {
            this.f10247a = str;
            this.f10248b = str2;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C2808d.m7147a(new C6661b(this.f10247a, this.f10248b));
        }
    }

    static class C33358 implements OnClickListener {
        final /* synthetic */ String f10249a;
        final /* synthetic */ String f10250b;

        public C33358(String str, String str2) {
            this.f10249a = str;
            this.f10250b = str2;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C2808d.m7147a(new C6662c(this.f10249a, this.f10250b));
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.os.Bundle m7797a(android.app.Activity r17, mobi.mmdt.ott.view.conversation.p573f.C7197a r18) {
        /*
        r1 = r17;
        r2 = r18;
        r3 = "";
        r4 = "";
        r5 = r2.f19503j;
        r11 = 2131231935; // 0x7f0804bf float:1.8079965E38 double:1.0529684824E-314;
        r12 = 0;
        switch(r5) {
            case 12: goto L_0x0882;
            case 13: goto L_0x087b;
            case 14: goto L_0x0874;
            case 15: goto L_0x086d;
            case 16: goto L_0x0866;
            case 17: goto L_0x085f;
            case 18: goto L_0x0858;
            case 19: goto L_0x0858;
            default: goto L_0x0011;
        };
    L_0x0011:
        r13 = 2131690385; // 0x7f0f0391 float:1.9009812E38 double:1.053194987E-314;
        switch(r5) {
            case 22: goto L_0x083d;
            case 23: goto L_0x0822;
            case 24: goto L_0x0807;
            case 25: goto L_0x07ec;
            case 26: goto L_0x07d1;
            case 27: goto L_0x07b6;
            case 28: goto L_0x079b;
            case 29: goto L_0x0780;
            default: goto L_0x0017;
        };
    L_0x0017:
        r14 = 2131690389; // 0x7f0f0395 float:1.900982E38 double:1.053194989E-314;
        switch(r5) {
            case 32: goto L_0x075e;
            case 33: goto L_0x0742;
            case 34: goto L_0x0726;
            case 35: goto L_0x070a;
            case 36: goto L_0x06ec;
            case 37: goto L_0x06cd;
            case 38: goto L_0x06ae;
            case 39: goto L_0x068f;
            default: goto L_0x001d;
        };
    L_0x001d:
        r15 = 2131690382; // 0x7f0f038e float:1.9009806E38 double:1.0531949853E-314;
        r6 = 2131099784; // 0x7f060088 float:1.781193E38 double:1.052903191E-314;
        switch(r5) {
            case 42: goto L_0x0681;
            case 43: goto L_0x0681;
            case 44: goto L_0x0681;
            case 45: goto L_0x0681;
            case 46: goto L_0x0681;
            case 47: goto L_0x0681;
            case 48: goto L_0x0681;
            case 49: goto L_0x0681;
            default: goto L_0x0026;
        };
    L_0x0026:
        r7 = 2131690387; // 0x7f0f0393 float:1.9009816E38 double:1.053194988E-314;
        switch(r5) {
            case 52: goto L_0x0673;
            case 53: goto L_0x0673;
            case 54: goto L_0x0673;
            case 55: goto L_0x0673;
            case 56: goto L_0x0673;
            case 57: goto L_0x0673;
            case 58: goto L_0x0673;
            case 59: goto L_0x0673;
            default: goto L_0x002c;
        };
    L_0x002c:
        r8 = 2131690388; // 0x7f0f0394 float:1.9009818E38 double:1.0531949883E-314;
        switch(r5) {
            case 62: goto L_0x0668;
            case 63: goto L_0x065d;
            case 64: goto L_0x0652;
            case 65: goto L_0x0647;
            case 66: goto L_0x063c;
            case 67: goto L_0x0631;
            case 68: goto L_0x0626;
            case 69: goto L_0x061b;
            default: goto L_0x0032;
        };
    L_0x0032:
        switch(r5) {
            case 72: goto L_0x0602;
            case 73: goto L_0x05e9;
            case 74: goto L_0x05d0;
            case 75: goto L_0x05b7;
            case 76: goto L_0x059e;
            case 77: goto L_0x0585;
            case 78: goto L_0x056c;
            case 79: goto L_0x0553;
            default: goto L_0x0035;
        };
    L_0x0035:
        switch(r5) {
            case 82: goto L_0x0536;
            case 83: goto L_0x0519;
            case 84: goto L_0x04fc;
            case 85: goto L_0x04df;
            case 86: goto L_0x04c2;
            case 87: goto L_0x04a5;
            case 88: goto L_0x0488;
            case 89: goto L_0x046b;
            default: goto L_0x0038;
        };
    L_0x0038:
        switch(r5) {
            case 92: goto L_0x0450;
            case 93: goto L_0x0435;
            case 94: goto L_0x041a;
            case 95: goto L_0x03f6;
            default: goto L_0x003b;
        };
    L_0x003b:
        r9 = 2131690383; // 0x7f0f038f float:1.9009808E38 double:1.053194986E-314;
        switch(r5) {
            case 102: goto L_0x03db;
            case 103: goto L_0x03c0;
            case 104: goto L_0x03a5;
            case 105: goto L_0x038a;
            case 106: goto L_0x036f;
            case 107: goto L_0x0354;
            case 108: goto L_0x0339;
            case 109: goto L_0x031e;
            default: goto L_0x0041;
        };
    L_0x0041:
        switch(r5) {
            case 112: goto L_0x0305;
            case 113: goto L_0x02ec;
            case 114: goto L_0x02d3;
            case 115: goto L_0x02ba;
            case 116: goto L_0x02a1;
            case 117: goto L_0x0288;
            case 118: goto L_0x026f;
            case 119: goto L_0x0256;
            default: goto L_0x0044;
        };
    L_0x0044:
        r10 = 2131690384; // 0x7f0f0390 float:1.900981E38 double:1.0531949863E-314;
        switch(r5) {
            case 122: goto L_0x024b;
            case 123: goto L_0x0240;
            case 124: goto L_0x0235;
            case 125: goto L_0x022a;
            case 126: goto L_0x021f;
            case 127: goto L_0x0214;
            case 128: goto L_0x0209;
            case 129: goto L_0x01fe;
            default: goto L_0x004a;
        };
    L_0x004a:
        switch(r5) {
            case 6: goto L_0x01e2;
            case 8: goto L_0x01cd;
            case 1111: goto L_0x01c7;
            case 1115: goto L_0x01c1;
            case 2111: goto L_0x01a6;
            case 2115: goto L_0x018b;
            case 3111: goto L_0x016c;
            case 3115: goto L_0x014d;
            case 4111: goto L_0x0681;
            case 4115: goto L_0x0681;
            case 5111: goto L_0x0673;
            case 5115: goto L_0x0673;
            case 6111: goto L_0x0142;
            case 6115: goto L_0x0137;
            case 7111: goto L_0x011e;
            case 7115: goto L_0x0105;
            case 8111: goto L_0x00e8;
            case 8115: goto L_0x00cb;
            case 10111: goto L_0x00b2;
            case 10115: goto L_0x0099;
            case 11111: goto L_0x0082;
            case 12111: goto L_0x0077;
            case 12115: goto L_0x006c;
            case 111115: goto L_0x0050;
            default: goto L_0x004d;
        };
    L_0x004d:
        r11 = -1;
        goto L_0x0889;
    L_0x0050:
        r1 = r2;
        r1 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p607h.C7650d) r1;
        r3 = r1.f23602T;
        r2 = r1.f23605Y;
        r4 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        if (r2 != r4) goto L_0x0060;
    L_0x005b:
        r1 = r1.f23601S;
    L_0x005d:
        r4 = r1;
        goto L_0x0889;
    L_0x0060:
        r2 = r1.f23604V;
        r4 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        if (r2 != r4) goto L_0x0069;
    L_0x0066:
        r1 = r1.f23600R;
        goto L_0x005d;
    L_0x0069:
        r1 = "";
        goto L_0x005d;
    L_0x006c:
        r1 = r2;
        r1 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p607h.C7654h) r1;
        r3 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r10);
        r4 = r1.f23638T;
        goto L_0x0889;
    L_0x0077:
        r1 = r2;
        r1 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p609j.C7680h) r1;
        r3 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r10);
        r4 = r1.f23827T;
        goto L_0x0889;
    L_0x0082:
        r1 = r2;
        r1 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p609j.C7676d) r1;
        r3 = r1.f23791T;
        r2 = r1.f23794Y;
        r4 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        if (r2 != r4) goto L_0x0090;
    L_0x008d:
        r1 = r1.f23790S;
        goto L_0x005d;
    L_0x0090:
        r2 = r1.f23793V;
        r4 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        if (r2 != r4) goto L_0x0069;
    L_0x0096:
        r1 = r1.f23789R;
        goto L_0x005d;
    L_0x0099:
        r1 = r2;
        r1 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p607h.C7651e) r1;
        r3 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r9);
        r2 = r1.f23614Y;
        r4 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        if (r2 != r4) goto L_0x00a9;
    L_0x00a6:
        r1 = r1.f23611T;
        goto L_0x005d;
    L_0x00a9:
        r2 = r1.f23613V;
        r4 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        if (r2 != r4) goto L_0x0069;
    L_0x00af:
        r1 = r1.f23610S;
        goto L_0x005d;
    L_0x00b2:
        r1 = r2;
        r1 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p609j.C7677e) r1;
        r3 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r9);
        r2 = r1.f23803Y;
        r4 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        if (r2 != r4) goto L_0x00c2;
    L_0x00bf:
        r1 = r1.f23800T;
        goto L_0x005d;
    L_0x00c2:
        r2 = r1.f23802V;
        r4 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        if (r2 != r4) goto L_0x0069;
    L_0x00c8:
        r1 = r1.f23799S;
        goto L_0x005d;
    L_0x00cb:
        r1 = r2;
        r1 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p607h.C7659m) r1;
        r3 = r1.f23670U;
        r2 = r1.ab;
        r4 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        if (r2 != r4) goto L_0x00da;
    L_0x00d6:
        r1 = r1.f23669T;
        goto L_0x076d;
    L_0x00da:
        r2 = r1.aa;
        r4 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        if (r2 != r4) goto L_0x00e4;
    L_0x00e0:
        r1 = r1.f23668S;
        goto L_0x076d;
    L_0x00e4:
        r1 = "";
        goto L_0x076d;
    L_0x00e8:
        r1 = r2;
        r1 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p609j.C7685m) r1;
        r3 = r1.f23859U;
        r2 = r1.ab;
        r4 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        if (r2 != r4) goto L_0x00f7;
    L_0x00f3:
        r1 = r1.f23858T;
        goto L_0x076d;
    L_0x00f7:
        r2 = r1.aa;
        r4 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        if (r2 != r4) goto L_0x0101;
    L_0x00fd:
        r1 = r1.f23857S;
        goto L_0x076d;
    L_0x0101:
        r1 = "";
        goto L_0x076d;
    L_0x0105:
        r1 = r2;
        r1 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p607h.C7652f) r1;
        r3 = r1.f23621U;
        r2 = r1.f23624Z;
        r4 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        if (r2 != r4) goto L_0x0114;
    L_0x0110:
        r1 = r1.f23620T;
        goto L_0x005d;
    L_0x0114:
        r2 = r1.f23623Y;
        r4 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        if (r2 != r4) goto L_0x0069;
    L_0x011a:
        r1 = r1.f23619S;
        goto L_0x005d;
    L_0x011e:
        r1 = r2;
        r1 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p609j.C7678f) r1;
        r3 = r1.f23810U;
        r2 = r1.f23813Z;
        r4 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        if (r2 != r4) goto L_0x012d;
    L_0x0129:
        r1 = r1.f23809T;
        goto L_0x005d;
    L_0x012d:
        r2 = r1.f23812Y;
        r4 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        if (r2 != r4) goto L_0x0069;
    L_0x0133:
        r1 = r1.f23808S;
        goto L_0x005d;
    L_0x0137:
        r1 = r2;
        r1 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p607h.C7657k) r1;
        r3 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r8);
        r4 = r1.f23656R;
        goto L_0x004d;
    L_0x0142:
        r1 = r2;
        r1 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p609j.C7683k) r1;
        r3 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r8);
        r4 = r1.f23845R;
        goto L_0x004d;
    L_0x014d:
        r1 = r2;
        r1 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p607h.C7660n) r1;
        r3 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r14);
        r2 = r1.aa;
        r4 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        if (r2 != r4) goto L_0x015e;
    L_0x015a:
        r1 = r1.f23678T;
        goto L_0x076d;
    L_0x015e:
        r2 = r1.f23682Z;
        r4 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        if (r2 != r4) goto L_0x0168;
    L_0x0164:
        r1 = r1.f23677S;
        goto L_0x076d;
    L_0x0168:
        r1 = "";
        goto L_0x076d;
    L_0x016c:
        r1 = r2;
        r1 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p609j.C7686n) r1;
        r3 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r14);
        r2 = r1.aa;
        r4 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        if (r2 != r4) goto L_0x017d;
    L_0x0179:
        r1 = r1.f23866S;
        goto L_0x076d;
    L_0x017d:
        r2 = r1.f23871Z;
        r4 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        if (r2 != r4) goto L_0x0187;
    L_0x0183:
        r1 = r1.f23865R;
        goto L_0x076d;
    L_0x0187:
        r1 = "";
        goto L_0x076d;
    L_0x018b:
        r1 = r2;
        r1 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p607h.C7653g) r1;
        r3 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r13);
        r2 = r1.f23632Y;
        r4 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        if (r2 != r4) goto L_0x019c;
    L_0x0198:
        r1 = r1.f23629T;
        goto L_0x005d;
    L_0x019c:
        r2 = r1.f23631V;
        r4 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        if (r2 != r4) goto L_0x0069;
    L_0x01a2:
        r1 = r1.f23628S;
        goto L_0x005d;
    L_0x01a6:
        r1 = r2;
        r1 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p609j.C7679g) r1;
        r3 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r13);
        r2 = r1.f23821Y;
        r4 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        if (r2 != r4) goto L_0x01b7;
    L_0x01b3:
        r1 = r1.f23818T;
        goto L_0x005d;
    L_0x01b7:
        r2 = r1.f23820V;
        r4 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        if (r2 != r4) goto L_0x0069;
    L_0x01bd:
        r1 = r1.f23817S;
        goto L_0x005d;
    L_0x01c1:
        r1 = r2;
        r1 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p607h.C7658l) r1;
        r3 = r1.f23663P;
        goto L_0x01df;
    L_0x01c7:
        r1 = r2;
        r1 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p609j.C7684l) r1;
        r3 = r1.f23852P;
        goto L_0x01df;
    L_0x01cd:
        r2 = (mobi.mmdt.ott.view.conversation.p573f.p598b.C7562c) r2;
        r3 = r2.f21343n;
        r4 = r2.f21342m;
        r4 = mobi.mmdt.ott.view.main.C4226f.m8056a(r4);
        r5 = r2.f21346q;
        r2 = r2.f21341l;
        r3 = mobi.mmdt.ott.view.tools.C4532q.m8242a(r1, r3, r4, r5, r2);
    L_0x01df:
        r4 = 0;
        goto L_0x004d;
    L_0x01e2:
        r1 = r2;
        r1 = (mobi.mmdt.ott.view.conversation.p573f.p598b.C7561b) r1;
        r3 = r1.f21343n;
        r1 = r1.f23114r;
        switch(r1) {
            case 1: goto L_0x01f6;
            case 2: goto L_0x01f2;
            case 3: goto L_0x01ee;
            default: goto L_0x01ec;
        };
    L_0x01ec:
        r6 = -1;
        goto L_0x01fa;
    L_0x01ee:
        r1 = 2131231839; // 0x7f08045f float:1.807977E38 double:1.052968435E-314;
        goto L_0x01f9;
    L_0x01f2:
        r1 = 2131231841; // 0x7f080461 float:1.8079774E38 double:1.052968436E-314;
        goto L_0x01f9;
    L_0x01f6:
        r1 = 2131231840; // 0x7f080460 float:1.8079772E38 double:1.0529684355E-314;
    L_0x01f9:
        r6 = r1;
    L_0x01fa:
        r11 = r6;
        r4 = 0;
        goto L_0x0889;
    L_0x01fe:
        r1 = r2;
        r1 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p605f.C7628h) r1;
        r3 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r10);
        r4 = r1.f23475T;
        goto L_0x0889;
    L_0x0209:
        r1 = r2;
        r1 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p604e.C7615h) r1;
        r3 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r10);
        r4 = r1.f23399T;
        goto L_0x0889;
    L_0x0214:
        r1 = r2;
        r1 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p611b.C7716h) r1;
        r3 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r10);
        r4 = r1.f24284T;
        goto L_0x0889;
    L_0x021f:
        r1 = r2;
        r1 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p610a.C7704h) r1;
        r3 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r10);
        r4 = r1.f24173T;
        goto L_0x0889;
    L_0x022a:
        r1 = r2;
        r1 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p603d.C7602h) r1;
        r3 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r10);
        r4 = r1.f23307T;
        goto L_0x0889;
    L_0x0235:
        r1 = r2;
        r1 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p602c.C7589h) r1;
        r3 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r10);
        r4 = r1.f23194T;
        goto L_0x0889;
    L_0x0240:
        r1 = r2;
        r1 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p606g.C7641h) r1;
        r3 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r10);
        r4 = r1.f23550T;
        goto L_0x0889;
    L_0x024b:
        r1 = r2;
        r1 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p608i.C7667h) r1;
        r3 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r10);
        r4 = r1.f23732T;
        goto L_0x0889;
    L_0x0256:
        r1 = r2;
        r1 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p605f.C7624d) r1;
        r3 = r1.f23447T;
        r2 = r1.aa;
        r4 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        if (r2 != r4) goto L_0x0265;
    L_0x0261:
        r1 = r1.f23446S;
        goto L_0x005d;
    L_0x0265:
        r2 = r1.f23449V;
        r4 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        if (r2 != r4) goto L_0x0069;
    L_0x026b:
        r1 = r1.f23445R;
        goto L_0x005d;
    L_0x026f:
        r1 = r2;
        r1 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p604e.C7611d) r1;
        r3 = r1.f23376U;
        r2 = r1.ae;
        r4 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        if (r2 != r4) goto L_0x027e;
    L_0x027a:
        r1 = r1.f23375T;
        goto L_0x005d;
    L_0x027e:
        r2 = r1.ad;
        r4 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        if (r2 != r4) goto L_0x0069;
    L_0x0284:
        r1 = r1.f23374S;
        goto L_0x005d;
    L_0x0288:
        r1 = r2;
        r1 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p611b.C7712d) r1;
        r3 = r1.f24240T;
        r2 = r1.f24243W;
        r4 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        if (r2 != r4) goto L_0x0297;
    L_0x0293:
        r1 = r1.f24239S;
        goto L_0x005d;
    L_0x0297:
        r2 = r1.f24242V;
        r4 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        if (r2 != r4) goto L_0x0069;
    L_0x029d:
        r1 = r1.f24238R;
        goto L_0x005d;
    L_0x02a1:
        r1 = r2;
        r1 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p610a.C7700d) r1;
        r3 = r1.f24138U;
        r2 = r1.f24141X;
        r4 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        if (r2 != r4) goto L_0x02b0;
    L_0x02ac:
        r1 = r1.f24137T;
        goto L_0x005d;
    L_0x02b0:
        r2 = r1.f24140W;
        r4 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        if (r2 != r4) goto L_0x0069;
    L_0x02b6:
        r1 = r1.f24136S;
        goto L_0x005d;
    L_0x02ba:
        r1 = r2;
        r1 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p603d.C7598d) r1;
        r3 = r1.f23263T;
        r2 = r1.f23266W;
        r4 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        if (r2 != r4) goto L_0x02c9;
    L_0x02c5:
        r1 = r1.f23262S;
        goto L_0x005d;
    L_0x02c9:
        r2 = r1.f23265V;
        r4 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        if (r2 != r4) goto L_0x0069;
    L_0x02cf:
        r1 = r1.f23261R;
        goto L_0x005d;
    L_0x02d3:
        r1 = r2;
        r1 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p602c.C7585d) r1;
        r3 = r1.f23159U;
        r2 = r1.f23162X;
        r4 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        if (r2 != r4) goto L_0x02e2;
    L_0x02de:
        r1 = r1.f23158T;
        goto L_0x005d;
    L_0x02e2:
        r2 = r1.f23161W;
        r4 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        if (r2 != r4) goto L_0x0069;
    L_0x02e8:
        r1 = r1.f23157S;
        goto L_0x005d;
    L_0x02ec:
        r1 = r2;
        r1 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p606g.C7637d) r1;
        r3 = r1.f23527U;
        r2 = r1.ac;
        r4 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        if (r2 != r4) goto L_0x02fb;
    L_0x02f7:
        r1 = r1.f23526T;
        goto L_0x005d;
    L_0x02fb:
        r2 = r1.ab;
        r4 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        if (r2 != r4) goto L_0x0069;
    L_0x0301:
        r1 = r1.f23525S;
        goto L_0x005d;
    L_0x0305:
        r1 = r2;
        r1 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p608i.C7663d) r1;
        r3 = r1.f23701U;
        r2 = r1.aa;
        r4 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        if (r2 != r4) goto L_0x0314;
    L_0x0310:
        r1 = r1.f23700T;
        goto L_0x005d;
    L_0x0314:
        r2 = r1.f23703Z;
        r4 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        if (r2 != r4) goto L_0x0069;
    L_0x031a:
        r1 = r1.f23699S;
        goto L_0x005d;
    L_0x031e:
        r1 = r2;
        r1 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p605f.C7625e) r1;
        r3 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r9);
        r2 = r1.aa;
        r4 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        if (r2 != r4) goto L_0x032f;
    L_0x032b:
        r1 = r1.f23454T;
        goto L_0x005d;
    L_0x032f:
        r2 = r1.f23456V;
        r4 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        if (r2 != r4) goto L_0x0069;
    L_0x0335:
        r1 = r1.f23453S;
        goto L_0x005d;
    L_0x0339:
        r1 = r2;
        r1 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p604e.C7612e) r1;
        r3 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r9);
        r2 = r1.ad;
        r4 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        if (r2 != r4) goto L_0x034a;
    L_0x0346:
        r1 = r1.f23381T;
        goto L_0x005d;
    L_0x034a:
        r2 = r1.ac;
        r4 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        if (r2 != r4) goto L_0x0069;
    L_0x0350:
        r1 = r1.f23380S;
        goto L_0x005d;
    L_0x0354:
        r1 = r2;
        r1 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p611b.C7713e) r1;
        r3 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r9);
        r2 = r1.f24254W;
        r4 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        if (r2 != r4) goto L_0x0365;
    L_0x0361:
        r1 = r1.f24251T;
        goto L_0x005d;
    L_0x0365:
        r2 = r1.f24253V;
        r4 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        if (r2 != r4) goto L_0x0069;
    L_0x036b:
        r1 = r1.f24250S;
        goto L_0x005d;
    L_0x036f:
        r1 = r2;
        r1 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p610a.C7701e) r1;
        r3 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r9);
        r2 = r1.f24150W;
        r4 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        if (r2 != r4) goto L_0x0380;
    L_0x037c:
        r1 = r1.f24147T;
        goto L_0x005d;
    L_0x0380:
        r2 = r1.f24149V;
        r4 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        if (r2 != r4) goto L_0x0069;
    L_0x0386:
        r1 = r1.f24146S;
        goto L_0x005d;
    L_0x038a:
        r1 = r2;
        r1 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p603d.C7599e) r1;
        r3 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r9);
        r2 = r1.f23277W;
        r4 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        if (r2 != r4) goto L_0x039b;
    L_0x0397:
        r1 = r1.f23274T;
        goto L_0x005d;
    L_0x039b:
        r2 = r1.f23276V;
        r4 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        if (r2 != r4) goto L_0x0069;
    L_0x03a1:
        r1 = r1.f23273S;
        goto L_0x005d;
    L_0x03a5:
        r1 = r2;
        r1 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p602c.C7586e) r1;
        r3 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r9);
        r2 = r1.f23171W;
        r4 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        if (r2 != r4) goto L_0x03b6;
    L_0x03b2:
        r1 = r1.f23168T;
        goto L_0x005d;
    L_0x03b6:
        r2 = r1.f23170V;
        r4 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        if (r2 != r4) goto L_0x0069;
    L_0x03bc:
        r1 = r1.f23167S;
        goto L_0x005d;
    L_0x03c0:
        r1 = r2;
        r1 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p606g.C7638e) r1;
        r3 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r9);
        r2 = r1.ab;
        r4 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        if (r2 != r4) goto L_0x03d1;
    L_0x03cd:
        r1 = r1.f23532T;
        goto L_0x005d;
    L_0x03d1:
        r2 = r1.aa;
        r4 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        if (r2 != r4) goto L_0x0069;
    L_0x03d7:
        r1 = r1.f23531S;
        goto L_0x005d;
    L_0x03db:
        r1 = r2;
        r1 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p608i.C7664e) r1;
        r3 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r9);
        r2 = r1.f23711Z;
        r4 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        if (r2 != r4) goto L_0x03ec;
    L_0x03e8:
        r1 = r1.f23708T;
        goto L_0x005d;
    L_0x03ec:
        r2 = r1.f23710Y;
        r4 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        if (r2 != r4) goto L_0x0069;
    L_0x03f2:
        r1 = r1.f23707S;
        goto L_0x005d;
    L_0x03f6:
        r1 = r2;
        r1 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p605f.C7629i) r1;
        r2 = 2131690386; // 0x7f0f0392 float:1.9009814E38 double:1.0531949873E-314;
        r2 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r2);
        r3 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x0410 }
        r1 = r1.f23478P;	 Catch:{ JSONException -> 0x0410 }
        r3.<init>(r1);	 Catch:{ JSONException -> 0x0410 }
        r1 = mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.base.PollUtils.PollDataParser(r3);	 Catch:{ JSONException -> 0x0410 }
        r1 = r1.f8400b;	 Catch:{ JSONException -> 0x0410 }
    L_0x040d:
        r3 = r1;
        goto L_0x01df;
    L_0x0410:
        r0 = move-exception;
        r1 = r0;
    L_0x0412:
        r3 = "Error in parsing poll data.";
        mobi.mmdt.componentsutils.p232b.p235c.C2480b.m6737b(r3, r1);
        r3 = r2;
        goto L_0x01df;
    L_0x041a:
        r1 = r2;
        r1 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p604e.C7616i) r1;
        r2 = 2131690386; // 0x7f0f0392 float:1.9009814E38 double:1.0531949873E-314;
        r2 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r2);
        r3 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x0432 }
        r1 = r1.f23401P;	 Catch:{ JSONException -> 0x0432 }
        r3.<init>(r1);	 Catch:{ JSONException -> 0x0432 }
        r1 = mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.base.PollUtils.PollDataParser(r3);	 Catch:{ JSONException -> 0x0432 }
        r1 = r1.f8400b;	 Catch:{ JSONException -> 0x0432 }
        goto L_0x040d;
    L_0x0432:
        r0 = move-exception;
        r1 = r0;
        goto L_0x0412;
    L_0x0435:
        r1 = r2;
        r1 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p603d.C7603i) r1;
        r2 = 2131690386; // 0x7f0f0392 float:1.9009814E38 double:1.0531949873E-314;
        r2 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r2);
        r3 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x044d }
        r1 = r1.f23313P;	 Catch:{ JSONException -> 0x044d }
        r3.<init>(r1);	 Catch:{ JSONException -> 0x044d }
        r1 = mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.base.PollUtils.PollDataParser(r3);	 Catch:{ JSONException -> 0x044d }
        r1 = r1.f8400b;	 Catch:{ JSONException -> 0x044d }
        goto L_0x040d;
    L_0x044d:
        r0 = move-exception;
        r1 = r0;
        goto L_0x0412;
    L_0x0450:
        r1 = r2;
        r1 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p602c.C7590i) r1;
        r2 = 2131690386; // 0x7f0f0392 float:1.9009814E38 double:1.0531949873E-314;
        r2 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r2);
        r3 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x0468 }
        r1 = r1.f23197P;	 Catch:{ JSONException -> 0x0468 }
        r3.<init>(r1);	 Catch:{ JSONException -> 0x0468 }
        r1 = mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.base.PollUtils.PollDataParser(r3);	 Catch:{ JSONException -> 0x0468 }
        r1 = r1.f8400b;	 Catch:{ JSONException -> 0x0468 }
        goto L_0x040d;
    L_0x0468:
        r0 = move-exception;
        r1 = r0;
        goto L_0x0412;
    L_0x046b:
        r1 = r2;
        r1 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p605f.C7633m) r1;
        r3 = r1.f23501U;
        r2 = r1.ad;
        r4 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        if (r2 != r4) goto L_0x047a;
    L_0x0476:
        r1 = r1.f23500T;
        goto L_0x076d;
    L_0x047a:
        r2 = r1.ac;
        r4 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        if (r2 != r4) goto L_0x0484;
    L_0x0480:
        r1 = r1.f23499S;
        goto L_0x076d;
    L_0x0484:
        r1 = "";
        goto L_0x076d;
    L_0x0488:
        r1 = r2;
        r1 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p604e.C7620m) r1;
        r3 = r1.f23422U;
        r2 = r1.ag;
        r4 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        if (r2 != r4) goto L_0x0497;
    L_0x0493:
        r1 = r1.f23421T;
        goto L_0x076d;
    L_0x0497:
        r2 = r1.af;
        r4 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        if (r2 != r4) goto L_0x04a1;
    L_0x049d:
        r1 = r1.f23420S;
        goto L_0x076d;
    L_0x04a1:
        r1 = "";
        goto L_0x076d;
    L_0x04a5:
        r1 = r2;
        r1 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p611b.C7720l) r1;
        r3 = r1.f24317U;
        r2 = r1.f24322Z;
        r4 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        if (r2 != r4) goto L_0x04b4;
    L_0x04b0:
        r1 = r1.f24316T;
        goto L_0x076d;
    L_0x04b4:
        r2 = r1.f24321Y;
        r4 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        if (r2 != r4) goto L_0x04be;
    L_0x04ba:
        r1 = r1.f24315S;
        goto L_0x076d;
    L_0x04be:
        r1 = "";
        goto L_0x076d;
    L_0x04c2:
        r1 = r2;
        r1 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p610a.C7708l) r1;
        r3 = r1.f24200U;
        r2 = r1.f24205Z;
        r4 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        if (r2 != r4) goto L_0x04d1;
    L_0x04cd:
        r1 = r1.f24199T;
        goto L_0x076d;
    L_0x04d1:
        r2 = r1.f24204Y;
        r4 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        if (r2 != r4) goto L_0x04db;
    L_0x04d7:
        r1 = r1.f24198S;
        goto L_0x076d;
    L_0x04db:
        r1 = "";
        goto L_0x076d;
    L_0x04df:
        r1 = r2;
        r1 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p603d.C7607m) r1;
        r3 = r1.f23342U;
        r2 = r1.f23347Z;
        r4 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        if (r2 != r4) goto L_0x04ee;
    L_0x04ea:
        r1 = r1.f23341T;
        goto L_0x076d;
    L_0x04ee:
        r2 = r1.f23346Y;
        r4 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        if (r2 != r4) goto L_0x04f8;
    L_0x04f4:
        r1 = r1.f23340S;
        goto L_0x076d;
    L_0x04f8:
        r1 = "";
        goto L_0x076d;
    L_0x04fc:
        r1 = r2;
        r1 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p602c.C7594m) r1;
        r3 = r1.f23223U;
        r2 = r1.f23228Z;
        r4 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        if (r2 != r4) goto L_0x050b;
    L_0x0507:
        r1 = r1.f23222T;
        goto L_0x076d;
    L_0x050b:
        r2 = r1.f23227Y;
        r4 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        if (r2 != r4) goto L_0x0515;
    L_0x0511:
        r1 = r1.f23221S;
        goto L_0x076d;
    L_0x0515:
        r1 = "";
        goto L_0x076d;
    L_0x0519:
        r1 = r2;
        r1 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p606g.C7646m) r1;
        r3 = r1.f23573U;
        r2 = r1.ae;
        r4 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        if (r2 != r4) goto L_0x0528;
    L_0x0524:
        r1 = r1.f23572T;
        goto L_0x076d;
    L_0x0528:
        r2 = r1.ad;
        r4 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        if (r2 != r4) goto L_0x0532;
    L_0x052e:
        r1 = r1.f23571S;
        goto L_0x076d;
    L_0x0532:
        r1 = "";
        goto L_0x076d;
    L_0x0536:
        r1 = r2;
        r1 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p608i.C7672m) r1;
        r3 = r1.f23758U;
        r2 = r1.ac;
        r4 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        if (r2 != r4) goto L_0x0545;
    L_0x0541:
        r1 = r1.f23757T;
        goto L_0x076d;
    L_0x0545:
        r2 = r1.ab;
        r4 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        if (r2 != r4) goto L_0x054f;
    L_0x054b:
        r1 = r1.f23756S;
        goto L_0x076d;
    L_0x054f:
        r1 = "";
        goto L_0x076d;
    L_0x0553:
        r1 = r2;
        r1 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p605f.C7626f) r1;
        r3 = r1.f23462U;
        r2 = r1.ab;
        r4 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        if (r2 != r4) goto L_0x0562;
    L_0x055e:
        r1 = r1.f23461T;
        goto L_0x005d;
    L_0x0562:
        r2 = r1.aa;
        r4 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        if (r2 != r4) goto L_0x0069;
    L_0x0568:
        r1 = r1.f23460S;
        goto L_0x005d;
    L_0x056c:
        r1 = r2;
        r1 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p604e.C7613f) r1;
        r3 = r1.f23388U;
        r2 = r1.ae;
        r4 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        if (r2 != r4) goto L_0x057b;
    L_0x0577:
        r1 = r1.f23387T;
        goto L_0x005d;
    L_0x057b:
        r2 = r1.ad;
        r4 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        if (r2 != r4) goto L_0x0069;
    L_0x0581:
        r1 = r1.f23386S;
        goto L_0x005d;
    L_0x0585:
        r1 = r2;
        r1 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p611b.C7714f) r1;
        r3 = r1.f24263U;
        r2 = r1.f24266X;
        r4 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        if (r2 != r4) goto L_0x0594;
    L_0x0590:
        r1 = r1.f24262T;
        goto L_0x005d;
    L_0x0594:
        r2 = r1.f24265W;
        r4 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        if (r2 != r4) goto L_0x0069;
    L_0x059a:
        r1 = r1.f24261S;
        goto L_0x005d;
    L_0x059e:
        r1 = r2;
        r1 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p610a.C7702f) r1;
        r3 = r1.f24156U;
        r2 = r1.f24159X;
        r4 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        if (r2 != r4) goto L_0x05ad;
    L_0x05a9:
        r1 = r1.f24155T;
        goto L_0x005d;
    L_0x05ad:
        r2 = r1.f24158W;
        r4 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        if (r2 != r4) goto L_0x0069;
    L_0x05b3:
        r1 = r1.f24154S;
        goto L_0x005d;
    L_0x05b7:
        r1 = r2;
        r1 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p603d.C7600f) r1;
        r3 = r1.f23286U;
        r2 = r1.f23289X;
        r4 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        if (r2 != r4) goto L_0x05c6;
    L_0x05c2:
        r1 = r1.f23285T;
        goto L_0x005d;
    L_0x05c6:
        r2 = r1.f23288W;
        r4 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        if (r2 != r4) goto L_0x0069;
    L_0x05cc:
        r1 = r1.f23284S;
        goto L_0x005d;
    L_0x05d0:
        r1 = r2;
        r1 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p602c.C7587f) r1;
        r3 = r1.f23177U;
        r2 = r1.f23180X;
        r4 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        if (r2 != r4) goto L_0x05df;
    L_0x05db:
        r1 = r1.f23176T;
        goto L_0x005d;
    L_0x05df:
        r2 = r1.f23179W;
        r4 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        if (r2 != r4) goto L_0x0069;
    L_0x05e5:
        r1 = r1.f23175S;
        goto L_0x005d;
    L_0x05e9:
        r1 = r2;
        r1 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p606g.C7639f) r1;
        r3 = r1.f23539U;
        r2 = r1.ac;
        r4 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        if (r2 != r4) goto L_0x05f8;
    L_0x05f4:
        r1 = r1.f23538T;
        goto L_0x005d;
    L_0x05f8:
        r2 = r1.ab;
        r4 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        if (r2 != r4) goto L_0x0069;
    L_0x05fe:
        r1 = r1.f23537S;
        goto L_0x005d;
    L_0x0602:
        r1 = r2;
        r1 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p608i.C7665f) r1;
        r3 = r1.f23717U;
        r2 = r1.aa;
        r4 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        if (r2 != r4) goto L_0x0611;
    L_0x060d:
        r1 = r1.f23716T;
        goto L_0x005d;
    L_0x0611:
        r2 = r1.f23719Z;
        r4 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        if (r2 != r4) goto L_0x0069;
    L_0x0617:
        r1 = r1.f23715S;
        goto L_0x005d;
    L_0x061b:
        r1 = r2;
        r1 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p605f.C7631k) r1;
        r3 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r8);
        r4 = r1.f23489R;
        goto L_0x004d;
    L_0x0626:
        r1 = r2;
        r1 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p604e.C7618k) r1;
        r3 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r8);
        r4 = r1.f23411R;
        goto L_0x004d;
    L_0x0631:
        r1 = r2;
        r1 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p611b.C7718j) r1;
        r3 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r8);
        r4 = r1.f24301R;
        goto L_0x004d;
    L_0x063c:
        r1 = r2;
        r1 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p610a.C7706j) r1;
        r3 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r8);
        r4 = r1.f24184R;
        goto L_0x004d;
    L_0x0647:
        r1 = r2;
        r1 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p603d.C7605k) r1;
        r3 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r8);
        r4 = r1.f23326R;
        goto L_0x004d;
    L_0x0652:
        r1 = r2;
        r1 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p602c.C7592k) r1;
        r3 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r8);
        r4 = r1.f23207R;
        goto L_0x004d;
    L_0x065d:
        r1 = r2;
        r1 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p606g.C7644k) r1;
        r3 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r8);
        r4 = r1.f23562R;
        goto L_0x004d;
    L_0x0668:
        r1 = r2;
        r1 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p608i.C7670k) r1;
        r3 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r8);
        r4 = r1.f23745R;
        goto L_0x004d;
    L_0x0673:
        r3 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r7);
        r12 = android.support.v4.p029a.C0346c.m687c(r1, r6);
        r4 = 0;
        r11 = 2131232038; // 0x7f080526 float:1.8080174E38 double:1.0529685333E-314;
        goto L_0x0889;
    L_0x0681:
        r3 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r15);
        r12 = android.support.v4.p029a.C0346c.m687c(r1, r6);
        r4 = 0;
        r11 = 2131231895; // 0x7f080497 float:1.8079884E38 double:1.0529684626E-314;
        goto L_0x0889;
    L_0x068f:
        r1 = r2;
        r1 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p605f.C7634n) r1;
        r3 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r14);
        r2 = r1.ab;
        r4 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        if (r2 != r4) goto L_0x06a0;
    L_0x069c:
        r1 = r1.f23506S;
        goto L_0x076d;
    L_0x06a0:
        r2 = r1.aa;
        r4 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        if (r2 != r4) goto L_0x06aa;
    L_0x06a6:
        r1 = r1.f23505R;
        goto L_0x076d;
    L_0x06aa:
        r1 = "";
        goto L_0x076d;
    L_0x06ae:
        r1 = r2;
        r1 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p604e.C7621n) r1;
        r3 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r14);
        r2 = r1.af;
        r4 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        if (r2 != r4) goto L_0x06bf;
    L_0x06bb:
        r1 = r1.f23427T;
        goto L_0x076d;
    L_0x06bf:
        r2 = r1.ae;
        r4 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        if (r2 != r4) goto L_0x06c9;
    L_0x06c5:
        r1 = r1.f23426S;
        goto L_0x076d;
    L_0x06c9:
        r1 = "";
        goto L_0x076d;
    L_0x06cd:
        r1 = r2;
        r1 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p611b.C7721m) r1;
        r3 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r14);
        r2 = r1.f24332Y;
        r4 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        if (r2 != r4) goto L_0x06de;
    L_0x06da:
        r1 = r1.f24327T;
        goto L_0x076d;
    L_0x06de:
        r2 = r1.f24331X;
        r4 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        if (r2 != r4) goto L_0x06e8;
    L_0x06e4:
        r1 = r1.f24326S;
        goto L_0x076d;
    L_0x06e8:
        r1 = "";
        goto L_0x076d;
    L_0x06ec:
        r1 = r2;
        r1 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p610a.C7709m) r1;
        r3 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r14);
        r2 = r1.f24215Y;
        r4 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        if (r2 != r4) goto L_0x06fd;
    L_0x06f9:
        r1 = r1.f24210T;
        goto L_0x076d;
    L_0x06fd:
        r2 = r1.f24214X;
        r4 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        if (r2 != r4) goto L_0x0707;
    L_0x0703:
        r1 = r1.f24209S;
        goto L_0x076d;
    L_0x0707:
        r1 = "";
        goto L_0x076d;
    L_0x070a:
        r1 = r2;
        r1 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p603d.C7608n) r1;
        r3 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r14);
        r2 = r1.f23357Y;
        r4 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        if (r2 != r4) goto L_0x071a;
    L_0x0717:
        r1 = r1.f23352T;
        goto L_0x076d;
    L_0x071a:
        r2 = r1.f23356X;
        r4 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        if (r2 != r4) goto L_0x0723;
    L_0x0720:
        r1 = r1.f23351S;
        goto L_0x076d;
    L_0x0723:
        r1 = "";
        goto L_0x076d;
    L_0x0726:
        r1 = r2;
        r1 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p602c.C7595n) r1;
        r3 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r14);
        r2 = r1.f23238Y;
        r4 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        if (r2 != r4) goto L_0x0736;
    L_0x0733:
        r1 = r1.f23233T;
        goto L_0x076d;
    L_0x0736:
        r2 = r1.f23237X;
        r4 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        if (r2 != r4) goto L_0x073f;
    L_0x073c:
        r1 = r1.f23232S;
        goto L_0x076d;
    L_0x073f:
        r1 = "";
        goto L_0x076d;
    L_0x0742:
        r1 = r2;
        r1 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p606g.C7647n) r1;
        r3 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r14);
        r2 = r1.ad;
        r4 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        if (r2 != r4) goto L_0x0752;
    L_0x074f:
        r1 = r1.f23578T;
        goto L_0x076d;
    L_0x0752:
        r2 = r1.ac;
        r4 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        if (r2 != r4) goto L_0x075b;
    L_0x0758:
        r1 = r1.f23577S;
        goto L_0x076d;
    L_0x075b:
        r1 = "";
        goto L_0x076d;
    L_0x075e:
        r1 = r2;
        r1 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p608i.C7673n) r1;
        r3 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r14);
        r2 = r1.ab;
        r4 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        if (r2 != r4) goto L_0x076f;
    L_0x076b:
        r1 = r1.f23765T;
    L_0x076d:
        r4 = r1;
        goto L_0x077b;
    L_0x076f:
        r2 = r1.aa;
        r4 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        if (r2 != r4) goto L_0x0778;
    L_0x0775:
        r1 = r1.f23764S;
        goto L_0x076d;
    L_0x0778:
        r1 = "";
        goto L_0x076d;
    L_0x077b:
        r11 = 2131232104; // 0x7f080568 float:1.8080308E38 double:1.052968566E-314;
        goto L_0x0889;
    L_0x0780:
        r1 = r2;
        r1 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p605f.C7627g) r1;
        r3 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r13);
        r2 = r1.aa;
        r4 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        if (r2 != r4) goto L_0x0791;
    L_0x078d:
        r1 = r1.f23468T;
        goto L_0x005d;
    L_0x0791:
        r2 = r1.f23470V;
        r4 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        if (r2 != r4) goto L_0x0069;
    L_0x0797:
        r1 = r1.f23467S;
        goto L_0x005d;
    L_0x079b:
        r1 = r2;
        r1 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p604e.C7614g) r1;
        r3 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r13);
        r2 = r1.ad;
        r4 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        if (r2 != r4) goto L_0x07ac;
    L_0x07a8:
        r1 = r1.f23393T;
        goto L_0x005d;
    L_0x07ac:
        r2 = r1.ac;
        r4 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        if (r2 != r4) goto L_0x0069;
    L_0x07b2:
        r1 = r1.f23392S;
        goto L_0x005d;
    L_0x07b6:
        r1 = r2;
        r1 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p611b.C7715g) r1;
        r3 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r13);
        r2 = r1.f24276W;
        r4 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        if (r2 != r4) goto L_0x07c7;
    L_0x07c3:
        r1 = r1.f24273T;
        goto L_0x005d;
    L_0x07c7:
        r2 = r1.f24275V;
        r4 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        if (r2 != r4) goto L_0x0069;
    L_0x07cd:
        r1 = r1.f24272S;
        goto L_0x005d;
    L_0x07d1:
        r1 = r2;
        r1 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p610a.C7703g) r1;
        r3 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r13);
        r2 = r1.f24168W;
        r4 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        if (r2 != r4) goto L_0x07e2;
    L_0x07de:
        r1 = r1.f24165T;
        goto L_0x005d;
    L_0x07e2:
        r2 = r1.f24167V;
        r4 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        if (r2 != r4) goto L_0x0069;
    L_0x07e8:
        r1 = r1.f24164S;
        goto L_0x005d;
    L_0x07ec:
        r1 = r2;
        r1 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p603d.C7601g) r1;
        r3 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r13);
        r2 = r1.f23299W;
        r4 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        if (r2 != r4) goto L_0x07fd;
    L_0x07f9:
        r1 = r1.f23296T;
        goto L_0x005d;
    L_0x07fd:
        r2 = r1.f23298V;
        r4 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        if (r2 != r4) goto L_0x0069;
    L_0x0803:
        r1 = r1.f23295S;
        goto L_0x005d;
    L_0x0807:
        r1 = r2;
        r1 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p602c.C7588g) r1;
        r3 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r13);
        r2 = r1.f23189W;
        r4 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        if (r2 != r4) goto L_0x0818;
    L_0x0814:
        r1 = r1.f23186T;
        goto L_0x005d;
    L_0x0818:
        r2 = r1.f23188V;
        r4 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        if (r2 != r4) goto L_0x0069;
    L_0x081e:
        r1 = r1.f23185S;
        goto L_0x005d;
    L_0x0822:
        r1 = r2;
        r1 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p606g.C7640g) r1;
        r3 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r13);
        r2 = r1.ab;
        r4 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        if (r2 != r4) goto L_0x0833;
    L_0x082f:
        r1 = r1.f23544T;
        goto L_0x005d;
    L_0x0833:
        r2 = r1.aa;
        r4 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        if (r2 != r4) goto L_0x0069;
    L_0x0839:
        r1 = r1.f23543S;
        goto L_0x005d;
    L_0x083d:
        r1 = r2;
        r1 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p608i.C7666g) r1;
        r3 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r13);
        r2 = r1.f23727Z;
        r4 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        if (r2 != r4) goto L_0x084e;
    L_0x084a:
        r1 = r1.f23724T;
        goto L_0x005d;
    L_0x084e:
        r2 = r1.f23726Y;
        r4 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        if (r2 != r4) goto L_0x0069;
    L_0x0854:
        r1 = r1.f23723S;
        goto L_0x005d;
    L_0x0858:
        r1 = r2;
        r1 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p604e.C7619l) r1;
        r3 = r1.f23415P;
        goto L_0x01df;
    L_0x085f:
        r1 = r2;
        r1 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p611b.C7719k) r1;
        r3 = r1.f24310P;
        goto L_0x01df;
    L_0x0866:
        r1 = r2;
        r1 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p610a.C7707k) r1;
        r3 = r1.f24193P;
        goto L_0x01df;
    L_0x086d:
        r1 = r2;
        r1 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p603d.C7606l) r1;
        r3 = r1.f23335P;
        goto L_0x01df;
    L_0x0874:
        r1 = r2;
        r1 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p602c.C7593l) r1;
        r3 = r1.f23216P;
        goto L_0x01df;
    L_0x087b:
        r1 = r2;
        r1 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p606g.C7645l) r1;
        r3 = r1.f23566P;
        goto L_0x01df;
    L_0x0882:
        r1 = r2;
        r1 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p608i.C7671l) r1;
        r3 = r1.f23751P;
        goto L_0x01df;
    L_0x0889:
        r1 = new android.os.Bundle;
        r1.<init>();
        r2 = "REPLY_BOTTOM_TEXT";
        r1.putString(r2, r3);
        r2 = "REPLY_IMAGE_URI";
        r1.putString(r2, r4);
        r2 = "REPLY_IMAGE_RES_ID";
        r1.putInt(r2, r11);
        r2 = "REPLY_IMAGE_BACKGROUND_COLOR";
        r1.putInt(r2, r12);
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.conversation.activities.a.b.b.a(android.app.Activity, mobi.mmdt.ott.view.conversation.f.a):android.os.Bundle");
    }

    public static C6389b m7798a(boolean z, Activity activity, String str, String str2, String str3, C6123a c6123a, String str4, String[] strArr, ActionMode actionMode, String str5) {
        Context context = activity;
        C0663a c0663a = new C0663a(context, R.style.AppCompatAlertDialogStyle);
        c0663a.m1613b(str);
        View inflate = context.getLayoutInflater().inflate(R.layout.dialog_delete_message_selected_item, null);
        TextView textView = (TextView) inflate.findViewById(R.id.sub_Title);
        final CheckBox checkBox = (CheckBox) inflate.findViewById(R.id.checkBox1);
        C6123a c6123a2 = c6123a;
        if (c6123a2 instanceof C6876e) {
            textView.setGravity(C2535a.m6888a().m6919b().equals("fa") ? 5 : 3);
            checkBox.setVisibility(8);
            textView.setText(C4522p.m8236a(z ? R.string.delete_messages_in_group : R.string.delete_message_in_group));
            textView.setVisibility(0);
            checkBox.setChecked(true);
        } else {
            C2491i.m6782a(UIThemeManager.getmInstance().getAccent_color(), checkBox);
            checkBox.setText(str5 == null ? "" : str5);
        }
        c0663a.m1607a(inflate);
        c0663a.m1614b(str3, null);
        final boolean z2 = z;
        final C6123a c6123a3 = c6123a2;
        final String str6 = str4;
        final String[] strArr2 = strArr;
        final ActionMode actionMode2 = actionMode;
        c0663a.m1609a((CharSequence) str2, new OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                boolean isChecked = checkBox.isChecked();
                if (z2) {
                    C3337b.m7813b(c6123a3, str6, strArr2, actionMode2, isChecked);
                } else {
                    C3337b.m7808a(c6123a3, str6, strArr2, actionMode2, isChecked);
                }
            }
        });
        C6389b a = c0663a.m1612a();
        a.show();
        a.m15114a(-2).setTextColor(UIThemeManager.getmInstance().getAccent_color());
        a.m15114a(-1).setTextColor(UIThemeManager.getmInstance().getAccent_color());
        return a;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m7799a(java.util.ArrayList<mobi.mmdt.ott.view.conversation.p573f.C7197a> r5) {
        /*
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = new mobi.mmdt.ott.view.conversation.activities.a.b.b$12;
        r1.<init>();
        java.util.Collections.sort(r5, r1);
        r1 = r5.iterator();
        r2 = 0;
    L_0x0012:
        r3 = r1.hasNext();
        if (r3 == 0) goto L_0x02da;
    L_0x0018:
        r3 = r1.next();
        r3 = (mobi.mmdt.ott.view.conversation.p573f.C7197a) r3;
        r4 = r3.f19503j;
        switch(r4) {
            case 12: goto L_0x02c2;
            case 13: goto L_0x02b2;
            case 14: goto L_0x02a2;
            case 15: goto L_0x0292;
            case 16: goto L_0x0282;
            case 17: goto L_0x0272;
            case 18: goto L_0x0262;
            case 19: goto L_0x0251;
            default: goto L_0x0023;
        };
    L_0x0023:
        switch(r4) {
            case 72: goto L_0x0240;
            case 73: goto L_0x022f;
            case 74: goto L_0x021e;
            case 75: goto L_0x020d;
            case 76: goto L_0x01fc;
            case 77: goto L_0x01eb;
            case 78: goto L_0x01da;
            case 79: goto L_0x01c9;
            default: goto L_0x0026;
        };
    L_0x0026:
        switch(r4) {
            case 82: goto L_0x01b8;
            case 83: goto L_0x01a7;
            case 84: goto L_0x0196;
            case 85: goto L_0x0185;
            case 86: goto L_0x0174;
            case 87: goto L_0x0163;
            case 88: goto L_0x0152;
            case 89: goto L_0x0141;
            default: goto L_0x0029;
        };
    L_0x0029:
        switch(r4) {
            case 112: goto L_0x0130;
            case 113: goto L_0x011f;
            case 114: goto L_0x010e;
            case 115: goto L_0x00fd;
            case 116: goto L_0x00ec;
            case 117: goto L_0x00db;
            case 118: goto L_0x00ca;
            case 119: goto L_0x00b9;
            default: goto L_0x002c;
        };
    L_0x002c:
        switch(r4) {
            case 1111: goto L_0x00a8;
            case 1115: goto L_0x0097;
            case 7111: goto L_0x0086;
            case 7115: goto L_0x0075;
            case 8111: goto L_0x0064;
            case 8115: goto L_0x0053;
            case 11111: goto L_0x0042;
            case 111115: goto L_0x0031;
            default: goto L_0x002f;
        };
    L_0x002f:
        goto L_0x02d6;
    L_0x0031:
        r3 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p607h.C7650d) r3;
        r3 = r3.f23602T;
        r0.append(r3);
        r3 = r5.size();
        r3 = r3 + -1;
        if (r2 == r3) goto L_0x02d6;
    L_0x0040:
        goto L_0x02d1;
    L_0x0042:
        r3 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p609j.C7676d) r3;
        r3 = r3.f23791T;
        r0.append(r3);
        r3 = r5.size();
        r3 = r3 + -1;
        if (r2 == r3) goto L_0x02d6;
    L_0x0051:
        goto L_0x02d1;
    L_0x0053:
        r3 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p607h.C7659m) r3;
        r3 = r3.f23670U;
        r0.append(r3);
        r3 = r5.size();
        r3 = r3 + -1;
        if (r2 == r3) goto L_0x02d6;
    L_0x0062:
        goto L_0x02d1;
    L_0x0064:
        r3 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p609j.C7685m) r3;
        r3 = r3.f23859U;
        r0.append(r3);
        r3 = r5.size();
        r3 = r3 + -1;
        if (r2 == r3) goto L_0x02d6;
    L_0x0073:
        goto L_0x02d1;
    L_0x0075:
        r3 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p607h.C7652f) r3;
        r3 = r3.f23621U;
        r0.append(r3);
        r3 = r5.size();
        r3 = r3 + -1;
        if (r2 == r3) goto L_0x02d6;
    L_0x0084:
        goto L_0x02d1;
    L_0x0086:
        r3 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p609j.C7678f) r3;
        r3 = r3.f23810U;
        r0.append(r3);
        r3 = r5.size();
        r3 = r3 + -1;
        if (r2 == r3) goto L_0x02d6;
    L_0x0095:
        goto L_0x02d1;
    L_0x0097:
        r3 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p607h.C7658l) r3;
        r3 = r3.f23663P;
        r0.append(r3);
        r3 = r5.size();
        r3 = r3 + -1;
        if (r2 == r3) goto L_0x02d6;
    L_0x00a6:
        goto L_0x02d1;
    L_0x00a8:
        r3 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p609j.C7684l) r3;
        r3 = r3.f23852P;
        r0.append(r3);
        r3 = r5.size();
        r3 = r3 + -1;
        if (r2 == r3) goto L_0x02d6;
    L_0x00b7:
        goto L_0x02d1;
    L_0x00b9:
        r3 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p605f.C7624d) r3;
        r3 = r3.f23447T;
        r0.append(r3);
        r3 = r5.size();
        r3 = r3 + -1;
        if (r2 == r3) goto L_0x02d6;
    L_0x00c8:
        goto L_0x02d1;
    L_0x00ca:
        r3 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p604e.C7611d) r3;
        r3 = r3.f23376U;
        r0.append(r3);
        r3 = r5.size();
        r3 = r3 + -1;
        if (r2 == r3) goto L_0x02d6;
    L_0x00d9:
        goto L_0x02d1;
    L_0x00db:
        r3 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p611b.C7712d) r3;
        r3 = r3.f24240T;
        r0.append(r3);
        r3 = r5.size();
        r3 = r3 + -1;
        if (r2 == r3) goto L_0x02d6;
    L_0x00ea:
        goto L_0x02d1;
    L_0x00ec:
        r3 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p610a.C7700d) r3;
        r3 = r3.f24138U;
        r0.append(r3);
        r3 = r5.size();
        r3 = r3 + -1;
        if (r2 == r3) goto L_0x02d6;
    L_0x00fb:
        goto L_0x02d1;
    L_0x00fd:
        r3 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p603d.C7598d) r3;
        r3 = r3.f23263T;
        r0.append(r3);
        r3 = r5.size();
        r3 = r3 + -1;
        if (r2 == r3) goto L_0x02d6;
    L_0x010c:
        goto L_0x02d1;
    L_0x010e:
        r3 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p602c.C7585d) r3;
        r3 = r3.f23159U;
        r0.append(r3);
        r3 = r5.size();
        r3 = r3 + -1;
        if (r2 == r3) goto L_0x02d6;
    L_0x011d:
        goto L_0x02d1;
    L_0x011f:
        r3 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p606g.C7637d) r3;
        r3 = r3.f23527U;
        r0.append(r3);
        r3 = r5.size();
        r3 = r3 + -1;
        if (r2 == r3) goto L_0x02d6;
    L_0x012e:
        goto L_0x02d1;
    L_0x0130:
        r3 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p608i.C7663d) r3;
        r3 = r3.f23701U;
        r0.append(r3);
        r3 = r5.size();
        r3 = r3 + -1;
        if (r2 == r3) goto L_0x02d6;
    L_0x013f:
        goto L_0x02d1;
    L_0x0141:
        r3 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p605f.C7633m) r3;
        r3 = r3.f23501U;
        r0.append(r3);
        r3 = r5.size();
        r3 = r3 + -1;
        if (r2 == r3) goto L_0x02d6;
    L_0x0150:
        goto L_0x02d1;
    L_0x0152:
        r3 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p604e.C7620m) r3;
        r3 = r3.f23422U;
        r0.append(r3);
        r3 = r5.size();
        r3 = r3 + -1;
        if (r2 == r3) goto L_0x02d6;
    L_0x0161:
        goto L_0x02d1;
    L_0x0163:
        r3 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p611b.C7720l) r3;
        r3 = r3.f24317U;
        r0.append(r3);
        r3 = r5.size();
        r3 = r3 + -1;
        if (r2 == r3) goto L_0x02d6;
    L_0x0172:
        goto L_0x02d1;
    L_0x0174:
        r3 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p610a.C7708l) r3;
        r3 = r3.f24200U;
        r0.append(r3);
        r3 = r5.size();
        r3 = r3 + -1;
        if (r2 == r3) goto L_0x02d6;
    L_0x0183:
        goto L_0x02d1;
    L_0x0185:
        r3 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p603d.C7607m) r3;
        r3 = r3.f23342U;
        r0.append(r3);
        r3 = r5.size();
        r3 = r3 + -1;
        if (r2 == r3) goto L_0x02d6;
    L_0x0194:
        goto L_0x02d1;
    L_0x0196:
        r3 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p602c.C7594m) r3;
        r3 = r3.f23223U;
        r0.append(r3);
        r3 = r5.size();
        r3 = r3 + -1;
        if (r2 == r3) goto L_0x02d6;
    L_0x01a5:
        goto L_0x02d1;
    L_0x01a7:
        r3 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p606g.C7646m) r3;
        r3 = r3.f23573U;
        r0.append(r3);
        r3 = r5.size();
        r3 = r3 + -1;
        if (r2 == r3) goto L_0x02d6;
    L_0x01b6:
        goto L_0x02d1;
    L_0x01b8:
        r3 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p608i.C7672m) r3;
        r3 = r3.f23758U;
        r0.append(r3);
        r3 = r5.size();
        r3 = r3 + -1;
        if (r2 == r3) goto L_0x02d6;
    L_0x01c7:
        goto L_0x02d1;
    L_0x01c9:
        r3 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p605f.C7626f) r3;
        r3 = r3.f23462U;
        r0.append(r3);
        r3 = r5.size();
        r3 = r3 + -1;
        if (r2 == r3) goto L_0x02d6;
    L_0x01d8:
        goto L_0x02d1;
    L_0x01da:
        r3 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p604e.C7613f) r3;
        r3 = r3.f23388U;
        r0.append(r3);
        r3 = r5.size();
        r3 = r3 + -1;
        if (r2 == r3) goto L_0x02d6;
    L_0x01e9:
        goto L_0x02d1;
    L_0x01eb:
        r3 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p611b.C7714f) r3;
        r3 = r3.f24263U;
        r0.append(r3);
        r3 = r5.size();
        r3 = r3 + -1;
        if (r2 == r3) goto L_0x02d6;
    L_0x01fa:
        goto L_0x02d1;
    L_0x01fc:
        r3 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p610a.C7702f) r3;
        r3 = r3.f24156U;
        r0.append(r3);
        r3 = r5.size();
        r3 = r3 + -1;
        if (r2 == r3) goto L_0x02d6;
    L_0x020b:
        goto L_0x02d1;
    L_0x020d:
        r3 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p603d.C7600f) r3;
        r3 = r3.f23286U;
        r0.append(r3);
        r3 = r5.size();
        r3 = r3 + -1;
        if (r2 == r3) goto L_0x02d6;
    L_0x021c:
        goto L_0x02d1;
    L_0x021e:
        r3 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p602c.C7587f) r3;
        r3 = r3.f23177U;
        r0.append(r3);
        r3 = r5.size();
        r3 = r3 + -1;
        if (r2 == r3) goto L_0x02d6;
    L_0x022d:
        goto L_0x02d1;
    L_0x022f:
        r3 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p606g.C7639f) r3;
        r3 = r3.f23539U;
        r0.append(r3);
        r3 = r5.size();
        r3 = r3 + -1;
        if (r2 == r3) goto L_0x02d6;
    L_0x023e:
        goto L_0x02d1;
    L_0x0240:
        r3 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p608i.C7665f) r3;
        r3 = r3.f23717U;
        r0.append(r3);
        r3 = r5.size();
        r3 = r3 + -1;
        if (r2 == r3) goto L_0x02d6;
    L_0x024f:
        goto L_0x02d1;
    L_0x0251:
        r3 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p605f.C7632l) r3;
        r3 = r3.f23494P;
        r0.append(r3);
        r3 = r5.size();
        r3 = r3 + -1;
        if (r2 == r3) goto L_0x02d6;
    L_0x0260:
        goto L_0x02d1;
    L_0x0262:
        r3 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p604e.C7619l) r3;
        r3 = r3.f23415P;
        r0.append(r3);
        r3 = r5.size();
        r3 = r3 + -1;
        if (r2 == r3) goto L_0x02d6;
    L_0x0271:
        goto L_0x02d1;
    L_0x0272:
        r3 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p611b.C7719k) r3;
        r3 = r3.f24310P;
        r0.append(r3);
        r3 = r5.size();
        r3 = r3 + -1;
        if (r2 == r3) goto L_0x02d6;
    L_0x0281:
        goto L_0x02d1;
    L_0x0282:
        r3 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p610a.C7707k) r3;
        r3 = r3.f24193P;
        r0.append(r3);
        r3 = r5.size();
        r3 = r3 + -1;
        if (r2 == r3) goto L_0x02d6;
    L_0x0291:
        goto L_0x02d1;
    L_0x0292:
        r3 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p603d.C7606l) r3;
        r3 = r3.f23335P;
        r0.append(r3);
        r3 = r5.size();
        r3 = r3 + -1;
        if (r2 == r3) goto L_0x02d6;
    L_0x02a1:
        goto L_0x02d1;
    L_0x02a2:
        r3 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p602c.C7593l) r3;
        r3 = r3.f23216P;
        r0.append(r3);
        r3 = r5.size();
        r3 = r3 + -1;
        if (r2 == r3) goto L_0x02d6;
    L_0x02b1:
        goto L_0x02d1;
    L_0x02b2:
        r3 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p606g.C7645l) r3;
        r3 = r3.f23566P;
        r0.append(r3);
        r3 = r5.size();
        r3 = r3 + -1;
        if (r2 == r3) goto L_0x02d6;
    L_0x02c1:
        goto L_0x02d1;
    L_0x02c2:
        r3 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p608i.C7671l) r3;
        r3 = r3.f23751P;
        r0.append(r3);
        r3 = r5.size();
        r3 = r3 + -1;
        if (r2 == r3) goto L_0x02d6;
    L_0x02d1:
        r3 = "\n";
        r0.append(r3);
    L_0x02d6:
        r2 = r2 + 1;
        goto L_0x0012;
    L_0x02da:
        r5 = r0.toString();
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.conversation.activities.a.b.b.a(java.util.ArrayList):java.lang.String");
    }

    public static String m7800a(C7358a c7358a) {
        if (c7358a.m19056c() && c7358a.f21337w != null) {
            switch (c7358a.f21337w) {
                case ERROR:
                case SENDING:
                    return null;
                default:
                    break;
            }
        }
        return c7358a.f20777c;
    }

    public static void m7801a(Activity activity) {
        Toast.makeText(activity, C4522p.m8236a(R.string.please_wait_until_download_finished), 0).show();
    }

    public static void m7802a(final Activity activity, final Intent intent, final String str, final C2973m c2973m) {
        if (!(intent == null || intent.getExtras() == null || !intent.getExtras().containsKey("key_to_forward_message_id"))) {
            final ArrayList stringArrayList = intent.getExtras().getStringArrayList("key_to_forward_message_id");
            int i = 0;
            boolean booleanExtra = intent.getExtras().containsKey("KEY_IS_MULTI_USER") ? intent.getBooleanExtra("KEY_IS_MULTI_USER", false) : false;
            if (stringArrayList != null && stringArrayList.size() > 0) {
                if (booleanExtra) {
                    String[] strArr = (String[]) stringArrayList.toArray(new String[stringArrayList.size()]);
                    ArrayList stringArrayList2 = intent.getExtras().getStringArrayList("KEY_TO_FORWARD_ARRAY_LIST_PEER_PARTY");
                    stringArrayList = intent.getExtras().getIntegerArrayList("KEY_TO_FORWARD_ARRAY_LIST_GROUP_ID");
                    if (!(stringArrayList2 == null || stringArrayList == null)) {
                        ArrayList arrayList = new ArrayList();
                        while (i < stringArrayList2.size()) {
                            arrayList.add(new C2676c((String) stringArrayList2.get(i), C2973m.values()[((Integer) stringArrayList.get(i)).intValue()]));
                            i++;
                        }
                        C2808d.m7147a(new C6728e(strArr, arrayList));
                    }
                    intent.removeExtra("key_to_forward_message_id");
                    intent.removeExtra("KEY_IS_MULTI_USER");
                    intent.removeExtra("KEY_TO_FORWARD_ARRAY_LIST_PEER_PARTY");
                    intent.removeExtra("KEY_TO_FORWARD_ARRAY_LIST_GROUP_ID");
                    activity.finish();
                    return;
                }
                C4488b.m8185b(activity, C4522p.m8236a(R.string.forward), C4522p.m8236a(R.string.are_you_wanna_send_to_here), C4522p.m8236a(R.string.send), new OnClickListener() {
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        ((C6389b) dialogInterface).m15114a(-1).setEnabled(false);
                        C2808d.m7147a(new C6727b((String[]) stringArrayList.toArray(new String[stringArrayList.size()]), str, c2973m));
                        intent.removeExtra("key_to_forward_message_id");
                    }
                }, C4522p.m8236a(R.string.cancel), new OnClickListener() {
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        activity.finish();
                    }
                });
            }
        }
    }

    public static void m7803a(Activity activity, ArrayList<C7197a> arrayList, C2973m c2973m, String str) {
        ArrayList arrayList2;
        Collections.sort(arrayList, new C33281());
        Iterator it = arrayList.iterator();
        boolean z = true;
        while (it.hasNext()) {
            Iterator it2;
            String a;
            C7358a c7358a = (C7358a) ((C7197a) it.next());
            if (c7358a != null) {
                if (c7358a.m19056c()) {
                    if (c7358a.f21337w != null) {
                        switch (c7358a.f21337w) {
                            case ERROR:
                            case SENDING:
                                break;
                            default:
                                break;
                        }
                    }
                    z = false;
                    if (z) {
                        arrayList2 = new ArrayList();
                        if (z) {
                            it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                a = C3337b.m7800a((C7358a) ((C7197a) it2.next()));
                                if (a == null) {
                                    arrayList2.add(a);
                                }
                            }
                            C4478a.m8151a(activity, arrayList2, str, c2973m.ordinal(), false);
                            return;
                        }
                        C3337b.m7801a(activity);
                    }
                }
                z = true;
                if (z) {
                    arrayList2 = new ArrayList();
                    if (z) {
                        C3337b.m7801a(activity);
                    }
                    it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        a = C3337b.m7800a((C7358a) ((C7197a) it2.next()));
                        if (a == null) {
                            arrayList2.add(a);
                        }
                    }
                    C4478a.m8151a(activity, arrayList2, str, c2973m.ordinal(), false);
                    return;
                }
            }
        }
        arrayList2 = new ArrayList();
        if (z) {
            it2 = arrayList.iterator();
            while (it2.hasNext()) {
                a = C3337b.m7800a((C7358a) ((C7197a) it2.next()));
                if (a == null) {
                    arrayList2.add(a);
                }
            }
            C4478a.m8151a(activity, arrayList2, str, c2973m.ordinal(), false);
            return;
        }
        C3337b.m7801a(activity);
    }

    public static void m7804a(Activity activity, LookUpGroupJoinLinkResponse lookUpGroupJoinLinkResponse) {
        int b;
        final LookUpGroupJoinLinkResponse lookUpGroupJoinLinkResponse2;
        C6389b a;
        final Context context = activity;
        final String str = lookUpGroupJoinLinkResponse.getmJID();
        String str2 = lookUpGroupJoinLinkResponse.getmName();
        CharSequence charSequence = lookUpGroupJoinLinkResponse.getmDescription();
        String str3 = lookUpGroupJoinLinkResponse.getmAvatarThumbnailURL();
        int i = lookUpGroupJoinLinkResponse.getmMembersCount();
        C0663a c0663a = new C0663a(context, R.style.AppCompatAlertDialogStyle);
        View inflate = activity.getLayoutInflater().inflate(R.layout.dialog_lookup_profile, null);
        View view = (RoundAvatarImageView) inflate.findViewById(R.id.imageView1);
        TextView textView = (TextView) inflate.findViewById(R.id.textView1);
        TextView textView2 = (TextView) inflate.findViewById(R.id.textView2);
        String d = C2535a.m6888a().m6928d();
        String a2;
        String a3;
        StringBuilder stringBuilder;
        if (C2535a.m6888a().m6919b().equals("fa")) {
            textView.setText(C2491i.m6814b(str2));
            if (charSequence == null || charSequence.isEmpty()) {
                if (i > 0) {
                    a2 = C4522p.m8236a(R.string.member);
                    a3 = C4522p.m8236a(R.string.members);
                    if (i > 1) {
                        a2 = a3;
                    }
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(i);
                    stringBuilder.append(" ");
                    stringBuilder.append(a2);
                    a2 = stringBuilder.toString();
                }
                textView2.setVisibility(8);
                view.setImageBitmap(null);
                if (str3 != null || str3.isEmpty()) {
                    C1212c.m2872a(activity).m10953a(view);
                } else {
                    C1212c.m2872a(activity).m10950a(C4515k.m8231a(C2556b.m6998a(str3))).m3034a(C1248f.m2945b().m2955b(C1144h.f3689a)).m3031a((ImageView) view);
                }
                b = C2491i.m6806b(MyApplication.m12952b(), d);
                view.setName(str2);
                view.setBackgroundColor(b);
                c0663a.m1607a(inflate);
                c0663a.m1614b(C4522p.m8236a(R.string.cancel_cap), null);
                lookUpGroupJoinLinkResponse2 = lookUpGroupJoinLinkResponse;
                c0663a.m1609a(C4522p.m8236a(R.string.action_join), new OnClickListener() {
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        if (str != null && !str.isEmpty()) {
                            Activity activity = context;
                            C1063i c6811c = new C6811c(str, lookUpGroupJoinLinkResponse2);
                            C2808d.m7147a(c6811c);
                            C4501c.m8189a().m8192a(activity, c6811c);
                        }
                    }
                });
                a = c0663a.m1612a();
                a.show();
                a.m15114a(-2).setTextColor(UIThemeManager.getmInstance().getAccent_color());
                a.m15114a(-1).setTextColor(UIThemeManager.getmInstance().getAccent_color());
            }
            charSequence = C2491i.m6814b(a2);
        } else {
            textView.setText(str2);
            if (charSequence == null || charSequence.isEmpty()) {
                if (i > 0) {
                    a2 = C4522p.m8236a(R.string.member);
                    a3 = C4522p.m8236a(R.string.members);
                    if (i > 1) {
                        a2 = a3;
                    }
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(i);
                    stringBuilder.append(" ");
                    stringBuilder.append(a2);
                    charSequence = stringBuilder.toString();
                }
                textView2.setVisibility(8);
                view.setImageBitmap(null);
                if (str3 != null) {
                }
                C1212c.m2872a(activity).m10953a(view);
                b = C2491i.m6806b(MyApplication.m12952b(), d);
                view.setName(str2);
                view.setBackgroundColor(b);
                c0663a.m1607a(inflate);
                c0663a.m1614b(C4522p.m8236a(R.string.cancel_cap), null);
                lookUpGroupJoinLinkResponse2 = lookUpGroupJoinLinkResponse;
                c0663a.m1609a(C4522p.m8236a(R.string.action_join), /* anonymous class already generated */);
                a = c0663a.m1612a();
                a.show();
                a.m15114a(-2).setTextColor(UIThemeManager.getmInstance().getAccent_color());
                a.m15114a(-1).setTextColor(UIThemeManager.getmInstance().getAccent_color());
            }
        }
        textView2.setText(charSequence);
        view.setImageBitmap(null);
        if (str3 != null) {
        }
        C1212c.m2872a(activity).m10953a(view);
        b = C2491i.m6806b(MyApplication.m12952b(), d);
        view.setName(str2);
        view.setBackgroundColor(b);
        c0663a.m1607a(inflate);
        c0663a.m1614b(C4522p.m8236a(R.string.cancel_cap), null);
        lookUpGroupJoinLinkResponse2 = lookUpGroupJoinLinkResponse;
        c0663a.m1609a(C4522p.m8236a(R.string.action_join), /* anonymous class already generated */);
        a = c0663a.m1612a();
        a.show();
        a.m15114a(-2).setTextColor(UIThemeManager.getmInstance().getAccent_color());
        a.m15114a(-1).setTextColor(UIThemeManager.getmInstance().getAccent_color());
    }

    public static void m7805a(Activity activity, C6829g c6829g) {
        String str;
        int i = c6829g.f19503j;
        if (i == 6111) {
            str = ((C7683k) c6829g).f23844Q;
        } else if (i != 6115) {
            switch (i) {
                case 62:
                    str = ((C7670k) c6829g).f23744Q;
                    break;
                case 63:
                    str = ((C7644k) c6829g).f23561Q;
                    break;
                case 64:
                    str = ((C7592k) c6829g).f23206Q;
                    break;
                case 65:
                    str = ((C7605k) c6829g).f23325Q;
                    break;
                case 66:
                    str = ((C7706j) c6829g).f24183Q;
                    break;
                case 67:
                    str = ((C7718j) c6829g).f24300Q;
                    break;
                case 68:
                    str = ((C7618k) c6829g).f23410Q;
                    break;
                case 69:
                    str = ((C7631k) c6829g).f23488Q;
                    break;
                default:
                    str = null;
                    break;
            }
        } else {
            str = ((C7657k) c6829g).f23655Q;
        }
        if (str != null) {
            Intent intent = new Intent(MyApplication.m12952b(), StickerDetailsActivity.class);
            intent.putExtra("StickerDetailsActivity.KEY_PACKAGE_ID", Integer.parseInt(str));
            intent.putExtra("StickerDetailsActivity.KEY_PACKAGE_NAME", "");
            intent.putExtra("StickerDetailsActivity.KEY_DOWNLOAD_COUNT", "");
            intent.putExtra("StickerDetailsActivity.KEY_PRICE", "");
            activity.startActivity(intent);
            activity.overridePendingTransition(R.anim.anim_slide_in_left, R.anim.anim_slide_out_left);
        }
    }

    @SuppressLint({"NewApi"})
    public static void m7806a(String str) {
        if (VERSION.SDK_INT < 11) {
            ((ClipboardManager) MyApplication.m12952b().getSystemService("clipboard")).setText(str);
        } else {
            ((android.content.ClipboardManager) MyApplication.m12952b().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(C4522p.m8236a(R.string.app_name), str));
        }
    }

    static void m7807a(String str, String[] strArr, C2973m c2973m, boolean z) {
        C2808d.m7147a(new C6758e(str, strArr, c2973m, z));
    }

    static /* synthetic */ void m7808a(C6123a c6123a, String str, String[] strArr, ActionMode actionMode, boolean z) {
        if (c6123a instanceof C6877f) {
            C3337b.m7807a(str, strArr, C2973m.SINGLE, z);
            C2980g.m7446g(str);
        } else if (c6123a instanceof C6876e) {
            C3337b.m7807a(str, strArr, C2973m.GROUP, z);
        }
        if (actionMode != null) {
            actionMode.finish();
        }
    }

    public static boolean m7809a(int i) {
        if (!(i == 7111 || i == 7115 || i == 8111 || i == 8115 || i == 11111 || i == 111115)) {
            switch (i) {
                case 72:
                case 73:
                case 74:
                case 75:
                case 76:
                case 77:
                case 78:
                case 79:
                    break;
                default:
                    switch (i) {
                        case 82:
                        case 83:
                        case 84:
                        case 85:
                        case 86:
                        case 87:
                        case 88:
                        case 89:
                            break;
                        default:
                            switch (i) {
                                case 112:
                                case 113:
                                case 114:
                                case 115:
                                case 116:
                                case 117:
                                case 118:
                                case 119:
                                    break;
                                default:
                                    return false;
                            }
                    }
            }
        }
        return true;
    }

    public static boolean m7810a(C7197a c7197a) {
        int i = c7197a.f19503j;
        if (i == 4111) {
            C7675c c7675c = (C7675c) c7197a;
            if (!(c7675c.f23778P == null || c7675c.f23778P.isEmpty())) {
                return true;
            }
        } else if (i != 4115) {
            switch (i) {
                case 42:
                    C7662c c7662c = (C7662c) c7197a;
                    if (!(c7662c.f23689P == null || c7662c.f23689P.isEmpty())) {
                        return true;
                    }
                case 43:
                    C7636c c7636c = (C7636c) c7197a;
                    if (!(c7636c.f23516P == null || c7636c.f23516P.isEmpty())) {
                        return true;
                    }
                case 44:
                    C7584c c7584c = (C7584c) c7197a;
                    if (!(c7584c.f23147Q == null || c7584c.f23147Q.isEmpty())) {
                        return true;
                    }
                case 45:
                    C7597c c7597c = (C7597c) c7197a;
                    if (!(c7597c.f23248P == null || c7597c.f23248P.isEmpty())) {
                        return true;
                    }
                case 46:
                    C7699c c7699c = (C7699c) c7197a;
                    if (!(c7699c.f24126Q == null || c7699c.f24126Q.isEmpty())) {
                        return true;
                    }
                case 47:
                    C7711c c7711c = (C7711c) c7197a;
                    if (!(c7711c.f24226Q == null || c7711c.f24226Q.isEmpty())) {
                        return true;
                    }
                case 48:
                    C7610c c7610c = (C7610c) c7197a;
                    if (!(c7610c.f23366Q == null || c7610c.f23366Q.isEmpty())) {
                        return true;
                    }
                case 49:
                    C7623c c7623c = (C7623c) c7197a;
                    if (!(c7623c.f23437Q == null || c7623c.f23437Q.isEmpty())) {
                        return true;
                    }
                default:
                    break;
            }
        } else {
            C7649c c7649c = (C7649c) c7197a;
            if (!(c7649c.f23589P == null || c7649c.f23589P.isEmpty())) {
                return true;
            }
        }
        return false;
    }

    public static void m7811b(Activity activity) {
        if (C3337b.m7816c(activity)) {
            try {
                activity.startActivityForResult(new C5507a().mo1673a(activity), 100);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void m7812b(Activity activity, C7197a c7197a) {
        int i = c7197a.f19503j;
        switch (i) {
            case 12:
                C4533r.m8256a(activity, ((C7671l) c7197a).f23751P);
                return;
            case 13:
                C4533r.m8256a(activity, ((C7645l) c7197a).f23566P);
                return;
            case 14:
                C4533r.m8256a(activity, ((C7593l) c7197a).f23216P);
                return;
            case 15:
                C4533r.m8256a(activity, ((C7606l) c7197a).f23335P);
                return;
            case 16:
                C4533r.m8256a(activity, ((C7707k) c7197a).f24193P);
                return;
            case 17:
                C4533r.m8256a(activity, ((C7719k) c7197a).f24310P);
                return;
            case 18:
                C4533r.m8256a(activity, ((C7619l) c7197a).f23415P);
                return;
            case 19:
                C4533r.m8256a(activity, ((C7632l) c7197a).f23494P);
                return;
            default:
                switch (i) {
                    case 22:
                        C7666g c7666g = (C7666g) c7197a;
                        if (new File(Uri.parse(c7666g.f23723S).getPath()).exists()) {
                            C4533r.m8257b(activity, c7666g.f23723S);
                            return;
                        }
                        C2984c.m7457a(c7666g.f23723S, C2987i.NOT_STARTED);
                        Toast.makeText(activity, C4522p.m8236a(R.string.file_not_exists), 0).show();
                        return;
                    case 23:
                        C7640g c7640g = (C7640g) c7197a;
                        if (new File(Uri.parse(c7640g.f23543S).getPath()).exists()) {
                            C4533r.m8257b(activity, c7640g.f23543S);
                            return;
                        }
                        C2984c.m7457a(c7640g.f23543S, C2987i.NOT_STARTED);
                        Toast.makeText(activity, C4522p.m8236a(R.string.file_not_exists), 0).show();
                        return;
                    case 24:
                        C7588g c7588g = (C7588g) c7197a;
                        if (new File(Uri.parse(c7588g.f23185S).getPath()).exists()) {
                            C4533r.m8257b(activity, c7588g.f23185S);
                            return;
                        }
                        C2984c.m7457a(c7588g.f23185S, C2987i.NOT_STARTED);
                        Toast.makeText(activity, C4522p.m8236a(R.string.file_not_exists), 0).show();
                        return;
                    case 25:
                        C7601g c7601g = (C7601g) c7197a;
                        if (new File(Uri.parse(c7601g.f23295S).getPath()).exists()) {
                            C4533r.m8257b(activity, c7601g.f23295S);
                            return;
                        }
                        C2984c.m7457a(c7601g.f23295S, C2987i.NOT_STARTED);
                        Toast.makeText(activity, C4522p.m8236a(R.string.file_not_exists), 0).show();
                        return;
                    case 26:
                        C7703g c7703g = (C7703g) c7197a;
                        if (new File(Uri.parse(c7703g.f24164S).getPath()).exists()) {
                            C4533r.m8257b(activity, c7703g.f24164S);
                            return;
                        }
                        C2984c.m7457a(c7703g.f24164S, C2987i.NOT_STARTED);
                        Toast.makeText(activity, C4522p.m8236a(R.string.file_not_exists), 0).show();
                        return;
                    case 27:
                        C7715g c7715g = (C7715g) c7197a;
                        if (new File(Uri.parse(c7715g.f24272S).getPath()).exists()) {
                            C4533r.m8257b(activity, c7715g.f24272S);
                            return;
                        }
                        C2984c.m7457a(c7715g.f24272S, C2987i.NOT_STARTED);
                        Toast.makeText(activity, C4522p.m8236a(R.string.file_not_exists), 0).show();
                        return;
                    case 28:
                        C7614g c7614g = (C7614g) c7197a;
                        if (new File(Uri.parse(c7614g.f23392S).getPath()).exists()) {
                            C4533r.m8257b(activity, c7614g.f23392S);
                            return;
                        }
                        C2984c.m7457a(c7614g.f23392S, C2987i.NOT_STARTED);
                        Toast.makeText(activity, C4522p.m8236a(R.string.file_not_exists), 0).show();
                        return;
                    case 29:
                        C7627g c7627g = (C7627g) c7197a;
                        if (new File(Uri.parse(c7627g.f23467S).getPath()).exists()) {
                            C4533r.m8257b(activity, c7627g.f23467S);
                            return;
                        }
                        C2984c.m7457a(c7627g.f23467S, C2987i.NOT_STARTED);
                        Toast.makeText(activity, C4522p.m8236a(R.string.file_not_exists), 0).show();
                        return;
                    default:
                        switch (i) {
                            case 32:
                                C7673n c7673n = (C7673n) c7197a;
                                if (new File(Uri.parse(c7673n.f23764S).getPath()).exists()) {
                                    C4533r.m8259d(activity, c7673n.f23764S);
                                    return;
                                }
                                C2984c.m7457a(c7673n.f23764S, C2987i.NOT_STARTED);
                                Toast.makeText(activity, C4522p.m8236a(R.string.file_not_exists), 0).show();
                                return;
                            case 33:
                                C7647n c7647n = (C7647n) c7197a;
                                if (new File(Uri.parse(c7647n.f23577S).getPath()).exists()) {
                                    C4533r.m8259d(activity, c7647n.f23577S);
                                    return;
                                }
                                C2984c.m7457a(c7647n.f23577S, C2987i.NOT_STARTED);
                                Toast.makeText(activity, C4522p.m8236a(R.string.file_not_exists), 0).show();
                                return;
                            case 34:
                                C7595n c7595n = (C7595n) c7197a;
                                if (new File(Uri.parse(c7595n.f23232S).getPath()).exists()) {
                                    C4533r.m8259d(activity, c7595n.f23232S);
                                    return;
                                }
                                C2984c.m7457a(c7595n.f23232S, C2987i.NOT_STARTED);
                                Toast.makeText(activity, C4522p.m8236a(R.string.file_not_exists), 0).show();
                                return;
                            case 35:
                                C7608n c7608n = (C7608n) c7197a;
                                if (new File(Uri.parse(c7608n.f23351S).getPath()).exists()) {
                                    C4533r.m8259d(activity, c7608n.f23351S);
                                    return;
                                }
                                C2984c.m7457a(c7608n.f23351S, C2987i.NOT_STARTED);
                                Toast.makeText(activity, C4522p.m8236a(R.string.file_not_exists), 0).show();
                                return;
                            case 36:
                                C7709m c7709m = (C7709m) c7197a;
                                if (new File(Uri.parse(c7709m.f24209S).getPath()).exists()) {
                                    C4533r.m8259d(activity, c7709m.f24209S);
                                    return;
                                }
                                C2984c.m7457a(c7709m.f24209S, C2987i.NOT_STARTED);
                                Toast.makeText(activity, C4522p.m8236a(R.string.file_not_exists), 0).show();
                                return;
                            case 37:
                                C7721m c7721m = (C7721m) c7197a;
                                if (new File(Uri.parse(c7721m.f24326S).getPath()).exists()) {
                                    C4533r.m8259d(activity, c7721m.f24326S);
                                    return;
                                }
                                C2984c.m7457a(c7721m.f24326S, C2987i.NOT_STARTED);
                                Toast.makeText(activity, C4522p.m8236a(R.string.file_not_exists), 0).show();
                                return;
                            case 38:
                                C7621n c7621n = (C7621n) c7197a;
                                if (new File(Uri.parse(c7621n.f23426S).getPath()).exists()) {
                                    C4533r.m8259d(activity, c7621n.f23426S);
                                    return;
                                }
                                C2984c.m7457a(c7621n.f23426S, C2987i.NOT_STARTED);
                                Toast.makeText(activity, C4522p.m8236a(R.string.file_not_exists), 0).show();
                                return;
                            case 39:
                                C7634n c7634n = (C7634n) c7197a;
                                if (new File(Uri.parse(c7634n.f23505R).getPath()).exists()) {
                                    C4533r.m8259d(activity, c7634n.f23505R);
                                    return;
                                }
                                C2984c.m7457a(c7634n.f23505R, C2987i.NOT_STARTED);
                                Toast.makeText(activity, C4522p.m8236a(R.string.file_not_exists), 0).show();
                                return;
                            default:
                                switch (i) {
                                    case 42:
                                        C7662c c7662c = (C7662c) c7197a;
                                        if (new File(Uri.parse(c7662c.f23692S).getPath()).exists()) {
                                            C4533r.m8260e(activity, c7662c.f23692S);
                                            return;
                                        }
                                        C2984c.m7457a(c7662c.f23692S, C2987i.NOT_STARTED);
                                        Toast.makeText(activity, C4522p.m8236a(R.string.file_not_exists), 0).show();
                                        return;
                                    case 43:
                                        C7636c c7636c = (C7636c) c7197a;
                                        if (new File(Uri.parse(c7636c.f23519S).getPath()).exists()) {
                                            C4533r.m8260e(activity, c7636c.f23519S);
                                            return;
                                        }
                                        C2984c.m7457a(c7636c.f23519S, C2987i.NOT_STARTED);
                                        Toast.makeText(activity, C4522p.m8236a(R.string.file_not_exists), 0).show();
                                        return;
                                    case 44:
                                        C7584c c7584c = (C7584c) c7197a;
                                        if (new File(Uri.parse(c7584c.f23150T).getPath()).exists()) {
                                            C4533r.m8260e(activity, c7584c.f23150T);
                                            return;
                                        }
                                        C2984c.m7457a(c7584c.f23150T, C2987i.NOT_STARTED);
                                        Toast.makeText(activity, C4522p.m8236a(R.string.file_not_exists), 0).show();
                                        return;
                                    case 45:
                                        C7597c c7597c = (C7597c) c7197a;
                                        if (new File(Uri.parse(c7597c.f23251S).getPath()).exists()) {
                                            C4533r.m8260e(activity, c7597c.f23251S);
                                            return;
                                        }
                                        C2984c.m7457a(c7597c.f23251S, C2987i.NOT_STARTED);
                                        Toast.makeText(activity, C4522p.m8236a(R.string.file_not_exists), 0).show();
                                        return;
                                    case 46:
                                        C7699c c7699c = (C7699c) c7197a;
                                        if (new File(Uri.parse(c7699c.f24129T).getPath()).exists()) {
                                            C4533r.m8260e(activity, c7699c.f24129T);
                                            return;
                                        }
                                        C2984c.m7457a(c7699c.f24129T, C2987i.NOT_STARTED);
                                        Toast.makeText(activity, C4522p.m8236a(R.string.file_not_exists), 0).show();
                                        return;
                                    case 47:
                                        C7711c c7711c = (C7711c) c7197a;
                                        if (new File(Uri.parse(c7711c.f24229T).getPath()).exists()) {
                                            C4533r.m8260e(activity, c7711c.f24229T);
                                            return;
                                        }
                                        C2984c.m7457a(c7711c.f24229T, C2987i.NOT_STARTED);
                                        Toast.makeText(activity, C4522p.m8236a(R.string.file_not_exists), 0).show();
                                        return;
                                    case 48:
                                        C7610c c7610c = (C7610c) c7197a;
                                        if (new File(Uri.parse(c7610c.f23369T).getPath()).exists()) {
                                            C4533r.m8260e(activity, c7610c.f23369T);
                                            return;
                                        }
                                        C2984c.m7457a(c7610c.f23369T, C2987i.NOT_STARTED);
                                        Toast.makeText(activity, C4522p.m8236a(R.string.file_not_exists), 0).show();
                                        return;
                                    case 49:
                                        C7623c c7623c = (C7623c) c7197a;
                                        if (new File(Uri.parse(c7623c.f23440T).getPath()).exists()) {
                                            C4533r.m8260e(activity, c7623c.f23440T);
                                            return;
                                        }
                                        C2984c.m7457a(c7623c.f23440T, C2987i.NOT_STARTED);
                                        Toast.makeText(activity, C4522p.m8236a(R.string.file_not_exists), 0).show();
                                        return;
                                    default:
                                        switch (i) {
                                            case 72:
                                                C7665f c7665f = (C7665f) c7197a;
                                                if (new File(Uri.parse(c7665f.f23715S).getPath()).exists()) {
                                                    C4533r.m8257b(activity, c7665f.f23715S);
                                                    return;
                                                }
                                                C2984c.m7457a(c7665f.f23715S, C2987i.NOT_STARTED);
                                                Toast.makeText(activity, C4522p.m8236a(R.string.file_not_exists), 0).show();
                                                return;
                                            case 73:
                                                C7639f c7639f = (C7639f) c7197a;
                                                if (new File(Uri.parse(c7639f.f23537S).getPath()).exists()) {
                                                    C4533r.m8257b(activity, c7639f.f23537S);
                                                    return;
                                                }
                                                C2984c.m7457a(c7639f.f23537S, C2987i.NOT_STARTED);
                                                Toast.makeText(activity, C4522p.m8236a(R.string.file_not_exists), 0).show();
                                                return;
                                            case 74:
                                                C7587f c7587f = (C7587f) c7197a;
                                                if (new File(Uri.parse(c7587f.f23175S).getPath()).exists()) {
                                                    C4533r.m8257b(activity, c7587f.f23175S);
                                                    return;
                                                }
                                                C2984c.m7457a(c7587f.f23175S, C2987i.NOT_STARTED);
                                                Toast.makeText(activity, C4522p.m8236a(R.string.file_not_exists), 0).show();
                                                return;
                                            case 75:
                                                C7600f c7600f = (C7600f) c7197a;
                                                if (new File(Uri.parse(c7600f.f23284S).getPath()).exists()) {
                                                    C4533r.m8257b(activity, c7600f.f23284S);
                                                    return;
                                                }
                                                C2984c.m7457a(c7600f.f23284S, C2987i.NOT_STARTED);
                                                Toast.makeText(activity, C4522p.m8236a(R.string.file_not_exists), 0).show();
                                                return;
                                            case 76:
                                                C7702f c7702f = (C7702f) c7197a;
                                                if (new File(Uri.parse(c7702f.f24154S).getPath()).exists()) {
                                                    C4533r.m8257b(activity, c7702f.f24154S);
                                                    return;
                                                }
                                                C2984c.m7457a(c7702f.f24154S, C2987i.NOT_STARTED);
                                                Toast.makeText(activity, C4522p.m8236a(R.string.file_not_exists), 0).show();
                                                return;
                                            case 77:
                                                C7714f c7714f = (C7714f) c7197a;
                                                if (new File(Uri.parse(c7714f.f24261S).getPath()).exists()) {
                                                    C4533r.m8257b(activity, c7714f.f24261S);
                                                    return;
                                                }
                                                C2984c.m7457a(c7714f.f24261S, C2987i.NOT_STARTED);
                                                Toast.makeText(activity, C4522p.m8236a(R.string.file_not_exists), 0).show();
                                                return;
                                            case 78:
                                                C7613f c7613f = (C7613f) c7197a;
                                                if (new File(Uri.parse(c7613f.f23386S).getPath()).exists()) {
                                                    C4533r.m8257b(activity, c7613f.f23386S);
                                                    return;
                                                }
                                                C2984c.m7457a(c7613f.f23386S, C2987i.NOT_STARTED);
                                                Toast.makeText(activity, C4522p.m8236a(R.string.file_not_exists), 0).show();
                                                return;
                                            case 79:
                                                C7626f c7626f = (C7626f) c7197a;
                                                if (new File(Uri.parse(c7626f.f23460S).getPath()).exists()) {
                                                    C4533r.m8257b(activity, c7626f.f23460S);
                                                    return;
                                                }
                                                C2984c.m7457a(c7626f.f23460S, C2987i.NOT_STARTED);
                                                Toast.makeText(activity, C4522p.m8236a(R.string.file_not_exists), 0).show();
                                                return;
                                            default:
                                                switch (i) {
                                                    case 82:
                                                        C7672m c7672m = (C7672m) c7197a;
                                                        if (new File(Uri.parse(c7672m.f23756S).getPath()).exists()) {
                                                            C4533r.m8259d(activity, c7672m.f23756S);
                                                            return;
                                                        }
                                                        C2984c.m7457a(c7672m.f23756S, C2987i.NOT_STARTED);
                                                        Toast.makeText(activity, C4522p.m8236a(R.string.file_not_exists), 0).show();
                                                        return;
                                                    case 83:
                                                        C7646m c7646m = (C7646m) c7197a;
                                                        if (new File(Uri.parse(c7646m.f23571S).getPath()).exists()) {
                                                            C4533r.m8259d(activity, c7646m.f23571S);
                                                            return;
                                                        }
                                                        C2984c.m7457a(c7646m.f23571S, C2987i.NOT_STARTED);
                                                        Toast.makeText(activity, C4522p.m8236a(R.string.file_not_exists), 0).show();
                                                        return;
                                                    case 84:
                                                        C7594m c7594m = (C7594m) c7197a;
                                                        if (new File(Uri.parse(c7594m.f23221S).getPath()).exists()) {
                                                            C4533r.m8259d(activity, c7594m.f23221S);
                                                            return;
                                                        }
                                                        C2984c.m7457a(c7594m.f23221S, C2987i.NOT_STARTED);
                                                        Toast.makeText(activity, C4522p.m8236a(R.string.file_not_exists), 0).show();
                                                        return;
                                                    case 85:
                                                        C7607m c7607m = (C7607m) c7197a;
                                                        if (new File(Uri.parse(c7607m.f23340S).getPath()).exists()) {
                                                            C4533r.m8259d(activity, c7607m.f23340S);
                                                            return;
                                                        }
                                                        C2984c.m7457a(c7607m.f23340S, C2987i.NOT_STARTED);
                                                        Toast.makeText(activity, C4522p.m8236a(R.string.file_not_exists), 0).show();
                                                        return;
                                                    case 86:
                                                        C7708l c7708l = (C7708l) c7197a;
                                                        if (new File(Uri.parse(c7708l.f24198S).getPath()).exists()) {
                                                            C4533r.m8259d(activity, c7708l.f24198S);
                                                            return;
                                                        }
                                                        C2984c.m7457a(c7708l.f24198S, C2987i.NOT_STARTED);
                                                        Toast.makeText(activity, C4522p.m8236a(R.string.file_not_exists), 0).show();
                                                        return;
                                                    case 87:
                                                        C7720l c7720l = (C7720l) c7197a;
                                                        if (new File(Uri.parse(c7720l.f24315S).getPath()).exists()) {
                                                            C4533r.m8259d(activity, c7720l.f24315S);
                                                            return;
                                                        }
                                                        C2984c.m7457a(c7720l.f24315S, C2987i.NOT_STARTED);
                                                        Toast.makeText(activity, C4522p.m8236a(R.string.file_not_exists), 0).show();
                                                        return;
                                                    case 88:
                                                        C7620m c7620m = (C7620m) c7197a;
                                                        if (new File(Uri.parse(c7620m.f23420S).getPath()).exists()) {
                                                            C4533r.m8259d(activity, c7620m.f23420S);
                                                            return;
                                                        }
                                                        C2984c.m7457a(c7620m.f23420S, C2987i.NOT_STARTED);
                                                        Toast.makeText(activity, C4522p.m8236a(R.string.file_not_exists), 0).show();
                                                        return;
                                                    case 89:
                                                        C7633m c7633m = (C7633m) c7197a;
                                                        if (new File(Uri.parse(c7633m.f23499S).getPath()).exists()) {
                                                            C4533r.m8259d(activity, c7633m.f23499S);
                                                            return;
                                                        }
                                                        C2984c.m7457a(c7633m.f23499S, C2987i.NOT_STARTED);
                                                        Toast.makeText(activity, C4522p.m8236a(R.string.file_not_exists), 0).show();
                                                        return;
                                                    default:
                                                        switch (i) {
                                                            case 102:
                                                                C7664e c7664e = (C7664e) c7197a;
                                                                if (new File(Uri.parse(c7664e.f23707S).getPath()).exists()) {
                                                                    C4533r.m8258c(activity, c7664e.f23707S);
                                                                    return;
                                                                }
                                                                C2984c.m7457a(c7664e.f23707S, C2987i.NOT_STARTED);
                                                                Toast.makeText(activity, C4522p.m8236a(R.string.file_not_exists), 0).show();
                                                                return;
                                                            case 103:
                                                                C7638e c7638e = (C7638e) c7197a;
                                                                if (new File(Uri.parse(c7638e.f23531S).getPath()).exists()) {
                                                                    C4533r.m8258c(activity, c7638e.f23531S);
                                                                    return;
                                                                }
                                                                C2984c.m7457a(c7638e.f23531S, C2987i.NOT_STARTED);
                                                                Toast.makeText(activity, C4522p.m8236a(R.string.file_not_exists), 0).show();
                                                                return;
                                                            case 104:
                                                                C7586e c7586e = (C7586e) c7197a;
                                                                if (new File(Uri.parse(c7586e.f23167S).getPath()).exists()) {
                                                                    C4533r.m8258c(activity, c7586e.f23167S);
                                                                    return;
                                                                }
                                                                C2984c.m7457a(c7586e.f23167S, C2987i.NOT_STARTED);
                                                                Toast.makeText(activity, C4522p.m8236a(R.string.file_not_exists), 0).show();
                                                                return;
                                                            case 105:
                                                                C7599e c7599e = (C7599e) c7197a;
                                                                if (new File(Uri.parse(c7599e.f23273S).getPath()).exists()) {
                                                                    C4533r.m8258c(activity, c7599e.f23273S);
                                                                    return;
                                                                }
                                                                C2984c.m7457a(c7599e.f23273S, C2987i.NOT_STARTED);
                                                                Toast.makeText(activity, C4522p.m8236a(R.string.file_not_exists), 0).show();
                                                                return;
                                                            case 106:
                                                                C7701e c7701e = (C7701e) c7197a;
                                                                if (new File(Uri.parse(c7701e.f24146S).getPath()).exists()) {
                                                                    C4533r.m8258c(activity, c7701e.f24146S);
                                                                    return;
                                                                }
                                                                C2984c.m7457a(c7701e.f24146S, C2987i.NOT_STARTED);
                                                                Toast.makeText(activity, C4522p.m8236a(R.string.file_not_exists), 0).show();
                                                                return;
                                                            case 107:
                                                                C7713e c7713e = (C7713e) c7197a;
                                                                if (new File(Uri.parse(c7713e.f24250S).getPath()).exists()) {
                                                                    C4533r.m8258c(activity, c7713e.f24250S);
                                                                    return;
                                                                }
                                                                C2984c.m7457a(c7713e.f24250S, C2987i.NOT_STARTED);
                                                                Toast.makeText(activity, C4522p.m8236a(R.string.file_not_exists), 0).show();
                                                                return;
                                                            case 108:
                                                                C7612e c7612e = (C7612e) c7197a;
                                                                if (new File(Uri.parse(c7612e.f23380S).getPath()).exists()) {
                                                                    C4533r.m8258c(activity, c7612e.f23380S);
                                                                    return;
                                                                }
                                                                C2984c.m7457a(c7612e.f23380S, C2987i.NOT_STARTED);
                                                                Toast.makeText(activity, C4522p.m8236a(R.string.file_not_exists), 0).show();
                                                                return;
                                                            case 109:
                                                                C7625e c7625e = (C7625e) c7197a;
                                                                if (new File(Uri.parse(c7625e.f23453S).getPath()).exists()) {
                                                                    C4533r.m8258c(activity, c7625e.f23453S);
                                                                    return;
                                                                }
                                                                C2984c.m7457a(c7625e.f23453S, C2987i.NOT_STARTED);
                                                                Toast.makeText(activity, C4522p.m8236a(R.string.file_not_exists), 0).show();
                                                                return;
                                                            default:
                                                                switch (i) {
                                                                    case 112:
                                                                        C7663d c7663d = (C7663d) c7197a;
                                                                        if (new File(Uri.parse(c7663d.f23699S).getPath()).exists()) {
                                                                            C4533r.m8258c(activity, c7663d.f23699S);
                                                                            return;
                                                                        }
                                                                        C2984c.m7457a(c7663d.f23699S, C2987i.NOT_STARTED);
                                                                        Toast.makeText(activity, C4522p.m8236a(R.string.file_not_exists), 0).show();
                                                                        return;
                                                                    case 113:
                                                                        C7637d c7637d = (C7637d) c7197a;
                                                                        if (new File(Uri.parse(c7637d.f23525S).getPath()).exists()) {
                                                                            C4533r.m8258c(activity, c7637d.f23525S);
                                                                            return;
                                                                        }
                                                                        C2984c.m7457a(c7637d.f23525S, C2987i.NOT_STARTED);
                                                                        Toast.makeText(activity, C4522p.m8236a(R.string.file_not_exists), 0).show();
                                                                        return;
                                                                    case 114:
                                                                        C7585d c7585d = (C7585d) c7197a;
                                                                        if (new File(Uri.parse(c7585d.f23157S).getPath()).exists()) {
                                                                            C4533r.m8258c(activity, c7585d.f23157S);
                                                                            return;
                                                                        }
                                                                        C2984c.m7457a(c7585d.f23157S, C2987i.NOT_STARTED);
                                                                        Toast.makeText(activity, C4522p.m8236a(R.string.file_not_exists), 0).show();
                                                                        return;
                                                                    case 115:
                                                                        C7598d c7598d = (C7598d) c7197a;
                                                                        if (new File(Uri.parse(c7598d.f23261R).getPath()).exists()) {
                                                                            C4533r.m8258c(activity, c7598d.f23261R);
                                                                            return;
                                                                        }
                                                                        C2984c.m7457a(c7598d.f23261R, C2987i.NOT_STARTED);
                                                                        Toast.makeText(activity, C4522p.m8236a(R.string.file_not_exists), 0).show();
                                                                        return;
                                                                    case 116:
                                                                        C7700d c7700d = (C7700d) c7197a;
                                                                        if (new File(Uri.parse(c7700d.f24136S).getPath()).exists()) {
                                                                            C4533r.m8258c(activity, c7700d.f24136S);
                                                                            return;
                                                                        }
                                                                        C2984c.m7457a(c7700d.f24136S, C2987i.NOT_STARTED);
                                                                        Toast.makeText(activity, C4522p.m8236a(R.string.file_not_exists), 0).show();
                                                                        return;
                                                                    case 117:
                                                                        C7712d c7712d = (C7712d) c7197a;
                                                                        if (new File(Uri.parse(c7712d.f24238R).getPath()).exists()) {
                                                                            C4533r.m8258c(activity, c7712d.f24238R);
                                                                            return;
                                                                        }
                                                                        C2984c.m7457a(c7712d.f24238R, C2987i.NOT_STARTED);
                                                                        Toast.makeText(activity, C4522p.m8236a(R.string.file_not_exists), 0).show();
                                                                        return;
                                                                    case 118:
                                                                        C7611d c7611d = (C7611d) c7197a;
                                                                        if (new File(Uri.parse(c7611d.f23374S).getPath()).exists()) {
                                                                            C4533r.m8258c(activity, c7611d.f23374S);
                                                                            return;
                                                                        }
                                                                        C2984c.m7457a(c7611d.f23374S, C2987i.NOT_STARTED);
                                                                        Toast.makeText(activity, C4522p.m8236a(R.string.file_not_exists), 0).show();
                                                                        return;
                                                                    case 119:
                                                                        C7624d c7624d = (C7624d) c7197a;
                                                                        if (new File(Uri.parse(c7624d.f23445R).getPath()).exists()) {
                                                                            C4533r.m8258c(activity, c7624d.f23445R);
                                                                            return;
                                                                        }
                                                                        C2984c.m7457a(c7624d.f23445R, C2987i.NOT_STARTED);
                                                                        Toast.makeText(activity, C4522p.m8236a(R.string.file_not_exists), 0).show();
                                                                        return;
                                                                    default:
                                                                        switch (i) {
                                                                            case IjkMediaMeta.FF_PROFILE_H264_HIGH_422 /*122*/:
                                                                                C7667h c7667h = (C7667h) c7197a;
                                                                                if (new File(Uri.parse(c7667h.f23732T).getPath()).exists()) {
                                                                                    C4533r.m8257b(activity, c7667h.f23732T);
                                                                                    return;
                                                                                }
                                                                                C2984c.m7457a(c7667h.f23732T, C2987i.NOT_STARTED);
                                                                                Toast.makeText(activity, C4522p.m8236a(R.string.file_not_exists), 0).show();
                                                                                return;
                                                                            case 123:
                                                                                C7641h c7641h = (C7641h) c7197a;
                                                                                if (new File(Uri.parse(c7641h.f23550T).getPath()).exists()) {
                                                                                    C4533r.m8257b(activity, c7641h.f23550T);
                                                                                    return;
                                                                                }
                                                                                C2984c.m7457a(c7641h.f23550T, C2987i.NOT_STARTED);
                                                                                Toast.makeText(activity, C4522p.m8236a(R.string.file_not_exists), 0).show();
                                                                                return;
                                                                            case 124:
                                                                                C7589h c7589h = (C7589h) c7197a;
                                                                                if (new File(Uri.parse(c7589h.f23194T).getPath()).exists()) {
                                                                                    C4533r.m8257b(activity, c7589h.f23194T);
                                                                                    return;
                                                                                }
                                                                                C2984c.m7457a(c7589h.f23194T, C2987i.NOT_STARTED);
                                                                                Toast.makeText(activity, C4522p.m8236a(R.string.file_not_exists), 0).show();
                                                                                return;
                                                                            case 125:
                                                                                C7602h c7602h = (C7602h) c7197a;
                                                                                if (new File(Uri.parse(c7602h.f23307T).getPath()).exists()) {
                                                                                    C4533r.m8257b(activity, c7602h.f23307T);
                                                                                    return;
                                                                                }
                                                                                C2984c.m7457a(c7602h.f23307T, C2987i.NOT_STARTED);
                                                                                Toast.makeText(activity, C4522p.m8236a(R.string.file_not_exists), 0).show();
                                                                                return;
                                                                            case 126:
                                                                                C7704h c7704h = (C7704h) c7197a;
                                                                                if (new File(Uri.parse(c7704h.f24173T).getPath()).exists()) {
                                                                                    C4533r.m8257b(activity, c7704h.f24173T);
                                                                                    return;
                                                                                }
                                                                                C2984c.m7457a(c7704h.f24173T, C2987i.NOT_STARTED);
                                                                                Toast.makeText(activity, C4522p.m8236a(R.string.file_not_exists), 0).show();
                                                                                return;
                                                                            case 127:
                                                                                C7716h c7716h = (C7716h) c7197a;
                                                                                if (new File(Uri.parse(c7716h.f24284T).getPath()).exists()) {
                                                                                    C4533r.m8257b(activity, c7716h.f24284T);
                                                                                    return;
                                                                                }
                                                                                C2984c.m7457a(c7716h.f24284T, C2987i.NOT_STARTED);
                                                                                Toast.makeText(activity, C4522p.m8236a(R.string.file_not_exists), 0).show();
                                                                                return;
                                                                            case 128:
                                                                                C7615h c7615h = (C7615h) c7197a;
                                                                                if (new File(Uri.parse(c7615h.f23399T).getPath()).exists()) {
                                                                                    C4533r.m8257b(activity, c7615h.f23399T);
                                                                                    return;
                                                                                }
                                                                                C2984c.m7457a(c7615h.f23399T, C2987i.NOT_STARTED);
                                                                                Toast.makeText(activity, C4522p.m8236a(R.string.file_not_exists), 0).show();
                                                                                return;
                                                                            case 129:
                                                                                C7628h c7628h = (C7628h) c7197a;
                                                                                if (new File(Uri.parse(c7628h.f23475T).getPath()).exists()) {
                                                                                    C4533r.m8257b(activity, c7628h.f23475T);
                                                                                    return;
                                                                                }
                                                                                C2984c.m7457a(c7628h.f23475T, C2987i.NOT_STARTED);
                                                                                Toast.makeText(activity, C4522p.m8236a(R.string.file_not_exists), 0).show();
                                                                                return;
                                                                            default:
                                                                                StringBuilder stringBuilder;
                                                                                Intent intent;
                                                                                switch (i) {
                                                                                    case 1111:
                                                                                        C4533r.m8256a(activity, ((C7684l) c7197a).f23852P);
                                                                                        return;
                                                                                    case 1115:
                                                                                        C4533r.m8256a(activity, ((C7658l) c7197a).f23663P);
                                                                                        return;
                                                                                    case 2111:
                                                                                        C7679g c7679g = (C7679g) c7197a;
                                                                                        if (new File(Uri.parse(c7679g.f23817S).getPath()).exists()) {
                                                                                            C4533r.m8257b(activity, c7679g.f23817S);
                                                                                            return;
                                                                                        }
                                                                                        C2984c.m7457a(c7679g.f23817S, C2987i.NOT_STARTED);
                                                                                        Toast.makeText(activity, C4522p.m8236a(R.string.file_not_exists), 0).show();
                                                                                        return;
                                                                                    case 2115:
                                                                                        C7653g c7653g = (C7653g) c7197a;
                                                                                        if (new File(Uri.parse(c7653g.f23628S).getPath()).exists()) {
                                                                                            C4533r.m8257b(activity, c7653g.f23628S);
                                                                                            return;
                                                                                        }
                                                                                        C2984c.m7457a(c7653g.f23628S, C2987i.NOT_STARTED);
                                                                                        Toast.makeText(activity, C4522p.m8236a(R.string.file_not_exists), 0).show();
                                                                                        return;
                                                                                    case 3111:
                                                                                        C7686n c7686n = (C7686n) c7197a;
                                                                                        if (new File(Uri.parse(c7686n.f23865R).getPath()).exists()) {
                                                                                            C4533r.m8259d(activity, c7686n.f23865R);
                                                                                            return;
                                                                                        }
                                                                                        C2984c.m7457a(c7686n.f23865R, C2987i.NOT_STARTED);
                                                                                        Toast.makeText(activity, C4522p.m8236a(R.string.file_not_exists), 0).show();
                                                                                        return;
                                                                                    case 3115:
                                                                                        C7660n c7660n = (C7660n) c7197a;
                                                                                        if (new File(Uri.parse(c7660n.f23677S).getPath()).exists()) {
                                                                                            C4533r.m8259d(activity, c7660n.f23677S);
                                                                                            return;
                                                                                        }
                                                                                        C2984c.m7457a(c7660n.f23677S, C2987i.NOT_STARTED);
                                                                                        Toast.makeText(activity, C4522p.m8236a(R.string.file_not_exists), 0).show();
                                                                                        return;
                                                                                    case 4111:
                                                                                        C7675c c7675c = (C7675c) c7197a;
                                                                                        if (new File(Uri.parse(c7675c.f23781S).getPath()).exists()) {
                                                                                            C4533r.m8260e(activity, c7675c.f23781S);
                                                                                            return;
                                                                                        }
                                                                                        C2984c.m7457a(c7675c.f23781S, C2987i.NOT_STARTED);
                                                                                        Toast.makeText(activity, C4522p.m8236a(R.string.file_not_exists), 0).show();
                                                                                        return;
                                                                                    case 4115:
                                                                                        C7649c c7649c = (C7649c) c7197a;
                                                                                        if (new File(Uri.parse(c7649c.f23592S).getPath()).exists()) {
                                                                                            C4533r.m8260e(activity, c7649c.f23592S);
                                                                                            return;
                                                                                        }
                                                                                        C2984c.m7457a(c7649c.f23592S, C2987i.NOT_STARTED);
                                                                                        Toast.makeText(activity, C4522p.m8236a(R.string.file_not_exists), 0).show();
                                                                                        return;
                                                                                    case 7111:
                                                                                        C7678f c7678f = (C7678f) c7197a;
                                                                                        if (new File(Uri.parse(c7678f.f23808S).getPath()).exists()) {
                                                                                            C4533r.m8257b(activity, c7678f.f23808S);
                                                                                            return;
                                                                                        }
                                                                                        C2984c.m7457a(c7678f.f23808S, C2987i.NOT_STARTED);
                                                                                        Toast.makeText(activity, C4522p.m8236a(R.string.file_not_exists), 0).show();
                                                                                        return;
                                                                                    case 7115:
                                                                                        C7652f c7652f = (C7652f) c7197a;
                                                                                        if (new File(Uri.parse(c7652f.f23619S).getPath()).exists()) {
                                                                                            C4533r.m8257b(activity, c7652f.f23619S);
                                                                                            return;
                                                                                        }
                                                                                        C2984c.m7457a(c7652f.f23619S, C2987i.NOT_STARTED);
                                                                                        Toast.makeText(activity, C4522p.m8236a(R.string.file_not_exists), 0).show();
                                                                                        return;
                                                                                    case 8111:
                                                                                        C7685m c7685m = (C7685m) c7197a;
                                                                                        if (new File(Uri.parse(c7685m.f23857S).getPath()).exists()) {
                                                                                            C4533r.m8259d(activity, c7685m.f23857S);
                                                                                            return;
                                                                                        }
                                                                                        C2984c.m7457a(c7685m.f23857S, C2987i.NOT_STARTED);
                                                                                        Toast.makeText(activity, C4522p.m8236a(R.string.file_not_exists), 0).show();
                                                                                        return;
                                                                                    case 8115:
                                                                                        C7659m c7659m = (C7659m) c7197a;
                                                                                        if (new File(Uri.parse(c7659m.f23668S).getPath()).exists()) {
                                                                                            C4533r.m8259d(activity, c7659m.f23668S);
                                                                                            return;
                                                                                        }
                                                                                        C2984c.m7457a(c7659m.f23668S, C2987i.NOT_STARTED);
                                                                                        Toast.makeText(activity, C4522p.m8236a(R.string.file_not_exists), 0).show();
                                                                                        return;
                                                                                    case 10111:
                                                                                        C7677e c7677e = (C7677e) c7197a;
                                                                                        if (new File(Uri.parse(c7677e.f23799S).getPath()).exists()) {
                                                                                            C4533r.m8258c(activity, c7677e.f23799S);
                                                                                            return;
                                                                                        }
                                                                                        C2984c.m7457a(c7677e.f23799S, C2987i.NOT_STARTED);
                                                                                        Toast.makeText(activity, C4522p.m8236a(R.string.file_not_exists), 0).show();
                                                                                        return;
                                                                                    case 10115:
                                                                                        C7651e c7651e = (C7651e) c7197a;
                                                                                        if (new File(Uri.parse(c7651e.f23610S).getPath()).exists()) {
                                                                                            C4533r.m8258c(activity, c7651e.f23610S);
                                                                                            return;
                                                                                        }
                                                                                        C2984c.m7457a(c7651e.f23610S, C2987i.NOT_STARTED);
                                                                                        Toast.makeText(activity, C4522p.m8236a(R.string.file_not_exists), 0).show();
                                                                                        return;
                                                                                    case 11111:
                                                                                        C7676d c7676d = (C7676d) c7197a;
                                                                                        if (new File(Uri.parse(c7676d.f23789R).getPath()).exists()) {
                                                                                            C4533r.m8258c(activity, c7676d.f23789R);
                                                                                            return;
                                                                                        }
                                                                                        C2984c.m7457a(c7676d.f23789R, C2987i.NOT_STARTED);
                                                                                        Toast.makeText(activity, C4522p.m8236a(R.string.file_not_exists), 0).show();
                                                                                        return;
                                                                                    case 12111:
                                                                                        C7680h c7680h = (C7680h) c7197a;
                                                                                        stringBuilder = new StringBuilder("geo:");
                                                                                        stringBuilder.append(c7680h.f23823P);
                                                                                        stringBuilder.append(", ");
                                                                                        stringBuilder.append(c7680h.f23824Q);
                                                                                        intent = new Intent("android.intent.action.VIEW", Uri.parse(stringBuilder.toString()));
                                                                                        intent.setPackage("com.google.android.apps.maps");
                                                                                        activity.startActivity(intent);
                                                                                        return;
                                                                                    case 12115:
                                                                                        C7654h c7654h = (C7654h) c7197a;
                                                                                        stringBuilder = new StringBuilder("geo:");
                                                                                        stringBuilder.append(c7654h.f23634P);
                                                                                        stringBuilder.append(", ");
                                                                                        stringBuilder.append(c7654h.f23635Q);
                                                                                        intent = new Intent("android.intent.action.VIEW", Uri.parse(stringBuilder.toString()));
                                                                                        intent.setPackage("com.google.android.apps.maps");
                                                                                        activity.startActivity(intent);
                                                                                        return;
                                                                                    case 111115:
                                                                                        C7650d c7650d = (C7650d) c7197a;
                                                                                        if (new File(Uri.parse(c7650d.f23600R).getPath()).exists()) {
                                                                                            C4533r.m8258c(activity, c7650d.f23600R);
                                                                                            return;
                                                                                        }
                                                                                        C2984c.m7457a(c7650d.f23600R, C2987i.NOT_STARTED);
                                                                                        Toast.makeText(activity, C4522p.m8236a(R.string.file_not_exists), 0).show();
                                                                                        return;
                                                                                    default:
                                                                                        return;
                                                                                }
                                                                        }
                                                                }
                                                        }
                                                }
                                        }
                                }
                        }
                }
        }
    }

    static /* synthetic */ void m7813b(C6123a c6123a, String str, String[] strArr, ActionMode actionMode, boolean z) {
        C2973m c2973m;
        if (c6123a instanceof C6877f) {
            c2973m = C2973m.SINGLE;
        } else {
            if (c6123a instanceof C6876e) {
                c2973m = C2973m.GROUP;
            }
            if (actionMode != null) {
                actionMode.finish();
            }
        }
        C3337b.m7807a(str, strArr, c2973m, z);
        if (actionMode != null) {
            actionMode.finish();
        }
    }

    public static boolean m7814b(int i) {
        switch (i) {
            case 18:
            case 28:
            case 38:
            case 48:
            case 58:
            case 68:
            case 78:
            case 88:
            case 108:
            case 118:
            case 128:
                return true;
            default:
                return false;
        }
    }

    public static boolean m7815c(int i) {
        switch (i) {
            case 17:
            case 18:
            case 27:
            case 28:
            case 37:
            case 38:
            case 47:
            case 48:
            case 57:
            case 58:
            case 67:
            case 68:
            case 77:
            case 78:
            case 87:
            case 88:
            case 107:
            case 108:
            case 117:
            case 118:
            case 127:
            case 128:
            case 147:
                return true;
            default:
                return false;
        }
    }

    public static boolean m7816c(Activity activity) {
        int a = C5462e.m11799a(activity);
        if (a != 9) {
            if (a != 19) {
                switch (a) {
                    case 0:
                        return true;
                    case 1:
                        break;
                    case 2:
                        a = R.string.google_play_services_requires_updating;
                        break;
                    case 3:
                        a = R.string.google_play_services_is_disabled;
                        break;
                    default:
                        return false;
                }
            }
            a = R.string.google_play_services_permission_is_missing;
            Toast.makeText(activity, C4522p.m8236a(a), 0).show();
            return false;
        }
        a = R.string.google_play_services_missing;
        Toast.makeText(activity, C4522p.m8236a(a), 0).show();
        return false;
    }

    public static boolean m7818d(int i) {
        switch (i) {
            case 15:
            case 17:
            case 19:
            case 25:
            case 27:
            case 29:
            case 35:
            case 37:
            case 39:
            case 45:
            case 47:
            case 49:
            case 55:
            case 57:
            case 59:
            case 65:
            case 67:
            case 69:
            case 75:
            case 77:
            case 79:
            case 85:
            case 87:
            case 89:
            case 93:
            case 95:
            case 105:
            case 107:
            case 109:
            case 115:
            case 117:
            case 119:
            case 125:
            case 127:
            case 129:
                return true;
            default:
                return false;
        }
    }

    public static boolean m7819e(int i) {
        switch (i) {
            case 14:
            case 16:
            case 18:
            case 24:
            case 26:
            case 28:
            case 34:
            case 36:
            case 38:
            case 44:
            case 46:
            case 48:
            case 54:
            case 56:
            case 58:
            case 64:
            case 66:
            case 68:
            case 74:
            case 76:
            case 78:
            case 84:
            case 86:
            case 88:
            case 92:
            case 94:
            case 104:
            case 106:
            case 108:
            case 114:
            case 116:
            case 118:
            case 124:
            case 126:
            case 128:
                return true;
            default:
                return false;
        }
    }

    public static boolean m7820f(int i) {
        switch (i) {
            case 15:
            case 17:
            case 19:
            case 25:
            case 27:
            case 29:
            case 35:
            case 37:
            case 39:
            case 45:
            case 47:
            case 49:
            case 75:
            case 77:
            case 79:
            case 85:
            case 87:
            case 89:
            case 105:
            case 107:
            case 109:
            case 115:
            case 117:
            case 119:
            case 1111:
            case 1115:
            case 2111:
            case 2115:
            case 3111:
            case 3115:
            case 4111:
            case 4115:
            case 7111:
            case 7115:
            case 8111:
            case 8115:
            case 10111:
            case 10115:
            case 11111:
            case 111115:
                return true;
            default:
                return false;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static mobi.mmdt.ott.provider.p384f.C2972l m7821g(int r0) {
        /*
        switch(r0) {
            case 12: goto L_0x0047;
            case 13: goto L_0x0047;
            case 14: goto L_0x0047;
            case 15: goto L_0x0047;
            case 16: goto L_0x0047;
            case 17: goto L_0x0047;
            case 18: goto L_0x0047;
            case 19: goto L_0x0047;
            default: goto L_0x0003;
        };
    L_0x0003:
        switch(r0) {
            case 22: goto L_0x0044;
            case 23: goto L_0x0044;
            case 24: goto L_0x0044;
            case 25: goto L_0x0044;
            case 26: goto L_0x0044;
            case 27: goto L_0x0044;
            case 28: goto L_0x0044;
            case 29: goto L_0x0044;
            default: goto L_0x0006;
        };
    L_0x0006:
        switch(r0) {
            case 32: goto L_0x0041;
            case 33: goto L_0x0041;
            case 34: goto L_0x0041;
            case 35: goto L_0x0041;
            case 36: goto L_0x0041;
            case 37: goto L_0x0041;
            case 38: goto L_0x0041;
            case 39: goto L_0x0041;
            default: goto L_0x0009;
        };
    L_0x0009:
        switch(r0) {
            case 42: goto L_0x003e;
            case 43: goto L_0x003e;
            case 44: goto L_0x003e;
            case 45: goto L_0x003e;
            case 46: goto L_0x003e;
            case 47: goto L_0x003e;
            case 48: goto L_0x003e;
            case 49: goto L_0x003e;
            default: goto L_0x000c;
        };
    L_0x000c:
        switch(r0) {
            case 52: goto L_0x003e;
            case 53: goto L_0x003b;
            case 54: goto L_0x003e;
            case 55: goto L_0x003b;
            case 56: goto L_0x003b;
            case 57: goto L_0x003b;
            case 58: goto L_0x003e;
            case 59: goto L_0x003b;
            default: goto L_0x000f;
        };
    L_0x000f:
        switch(r0) {
            case 62: goto L_0x0038;
            case 63: goto L_0x0038;
            case 64: goto L_0x0038;
            case 65: goto L_0x0038;
            case 66: goto L_0x0038;
            case 67: goto L_0x0038;
            case 68: goto L_0x0038;
            case 69: goto L_0x0038;
            default: goto L_0x0012;
        };
    L_0x0012:
        switch(r0) {
            case 72: goto L_0x0044;
            case 73: goto L_0x0044;
            case 74: goto L_0x0044;
            case 75: goto L_0x0044;
            case 76: goto L_0x0044;
            case 77: goto L_0x0044;
            case 78: goto L_0x0044;
            case 79: goto L_0x0044;
            default: goto L_0x0015;
        };
    L_0x0015:
        switch(r0) {
            case 82: goto L_0x0041;
            case 83: goto L_0x0041;
            case 84: goto L_0x0041;
            case 85: goto L_0x0041;
            case 86: goto L_0x0041;
            case 87: goto L_0x0041;
            case 88: goto L_0x0041;
            case 89: goto L_0x0041;
            default: goto L_0x0018;
        };
    L_0x0018:
        switch(r0) {
            case 92: goto L_0x0035;
            case 93: goto L_0x0035;
            case 94: goto L_0x0035;
            case 95: goto L_0x0035;
            default: goto L_0x001b;
        };
    L_0x001b:
        switch(r0) {
            case 102: goto L_0x0032;
            case 103: goto L_0x0032;
            case 104: goto L_0x0032;
            case 105: goto L_0x0032;
            case 106: goto L_0x0032;
            case 107: goto L_0x0032;
            case 108: goto L_0x0032;
            case 109: goto L_0x0032;
            default: goto L_0x001e;
        };
    L_0x001e:
        switch(r0) {
            case 112: goto L_0x0032;
            case 113: goto L_0x0032;
            case 114: goto L_0x0032;
            case 115: goto L_0x0032;
            case 116: goto L_0x0032;
            case 117: goto L_0x0032;
            case 118: goto L_0x0032;
            case 119: goto L_0x0032;
            default: goto L_0x0021;
        };
    L_0x0021:
        switch(r0) {
            case 122: goto L_0x002f;
            case 123: goto L_0x002f;
            case 124: goto L_0x002f;
            case 125: goto L_0x002f;
            case 126: goto L_0x002f;
            case 127: goto L_0x002f;
            case 128: goto L_0x002f;
            case 129: goto L_0x002f;
            default: goto L_0x0024;
        };
    L_0x0024:
        switch(r0) {
            case 132: goto L_0x0035;
            case 133: goto L_0x0035;
            default: goto L_0x0027;
        };
    L_0x0027:
        switch(r0) {
            case 6: goto L_0x002c;
            case 8: goto L_0x002c;
            case 135: goto L_0x0035;
            case 137: goto L_0x0035;
            case 1111: goto L_0x0047;
            case 1115: goto L_0x0047;
            case 2111: goto L_0x0044;
            case 2115: goto L_0x0044;
            case 3111: goto L_0x0041;
            case 3115: goto L_0x0041;
            case 4111: goto L_0x003e;
            case 4115: goto L_0x003e;
            case 5111: goto L_0x003b;
            case 5115: goto L_0x003b;
            case 6111: goto L_0x0038;
            case 6115: goto L_0x0038;
            case 7111: goto L_0x0044;
            case 7115: goto L_0x0044;
            case 8111: goto L_0x0041;
            case 8115: goto L_0x0041;
            case 10111: goto L_0x0032;
            case 10115: goto L_0x0032;
            case 11111: goto L_0x0032;
            case 12111: goto L_0x002f;
            case 12115: goto L_0x002f;
            case 111115: goto L_0x0032;
            default: goto L_0x002a;
        };
    L_0x002a:
        r0 = 0;
        return r0;
    L_0x002c:
        r0 = mobi.mmdt.ott.provider.p384f.C2972l.REPORT;
        return r0;
    L_0x002f:
        r0 = mobi.mmdt.ott.provider.p384f.C2972l.LOCATION;
        return r0;
    L_0x0032:
        r0 = mobi.mmdt.ott.provider.p384f.C2972l.GIF;
        return r0;
    L_0x0035:
        r0 = mobi.mmdt.ott.provider.p384f.C2972l.VOTE;
        return r0;
    L_0x0038:
        r0 = mobi.mmdt.ott.provider.p384f.C2972l.STICKER;
        return r0;
    L_0x003b:
        r0 = mobi.mmdt.ott.provider.p384f.C2972l.PUSH_TO_TALK;
        return r0;
    L_0x003e:
        r0 = mobi.mmdt.ott.provider.p384f.C2972l.FILE;
        return r0;
    L_0x0041:
        r0 = mobi.mmdt.ott.provider.p384f.C2972l.VIDEO;
        return r0;
    L_0x0044:
        r0 = mobi.mmdt.ott.provider.p384f.C2972l.IMAGE;
        return r0;
    L_0x0047:
        r0 = mobi.mmdt.ott.provider.p384f.C2972l.TEXT;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.conversation.activities.a.b.b.g(int):mobi.mmdt.ott.provider.f.l");
    }
}
