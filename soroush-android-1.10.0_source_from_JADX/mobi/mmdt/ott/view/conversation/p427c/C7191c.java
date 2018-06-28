package mobi.mmdt.ott.view.conversation.p427c;

import android.app.Activity;
import android.database.Cursor;
import android.os.Build.VERSION;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import java.util.HashSet;
import java.util.LinkedHashMap;
import mobi.mmdt.componentsutils.p232b.C2489g;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.view.components.p401c.C6073e;
import mobi.mmdt.ott.view.components.p401c.C6827b;
import mobi.mmdt.ott.view.conversation.activities.p419a.C6123a;
import mobi.mmdt.ott.view.conversation.p418a.C3280a;
import mobi.mmdt.ott.view.conversation.p418a.C3282c;
import mobi.mmdt.ott.view.conversation.p418a.C3284e;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p434a.C7424a;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p434a.C7425c;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p434a.C7426d;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p434a.C7427e;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p434a.C7428f;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p434a.C7429g;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p434a.C7430h;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p434a.C7431i;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p434a.C7432j;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p434a.C7433k;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p434a.C7434l;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p434a.C7435m;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p435b.C7436a;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p435b.C7437c;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p435b.C7438d;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p435b.C7439e;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p435b.C7440f;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p435b.C7441g;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p435b.C7442h;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p435b.C7443i;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p435b.C7444j;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p435b.C7445k;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p435b.C7446l;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p435b.C7447m;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p436c.C7448a;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p436c.C7449c;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p436c.C7450d;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p436c.C7451e;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p436c.C7452f;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p436c.C7453g;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p436c.C7454h;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p436c.C7455i;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p436c.C7456j;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p436c.C7457k;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p436c.C7458l;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p436c.C7459m;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p436c.C7460n;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p437d.C7461a;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p437d.C7462c;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p437d.C7463d;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p437d.C7464e;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p437d.C7465f;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p437d.C7466g;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p437d.C7467h;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p437d.C7468i;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p437d.C7469j;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p437d.C7470k;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p437d.C7471l;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p437d.C7472m;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p437d.C7473n;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p438e.C7474a;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p438e.C7475c;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p438e.C7476d;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p438e.C7477e;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p438e.C7478f;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p438e.C7479g;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p438e.C7480h;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p438e.C7481i;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p438e.C7482j;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p438e.C7483k;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p438e.C7484l;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p438e.C7485m;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p438e.C7486n;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p439f.C7487a;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p439f.C7488c;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p439f.C7489d;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p439f.C7490e;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p439f.C7491f;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p439f.C7492g;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p439f.C7493h;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p439f.C7494i;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p439f.C7495j;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p439f.C7496k;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p439f.C7497l;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p439f.C7498m;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p439f.C7499n;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p440g.C7500a;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p440g.C7501c;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p440g.C7502d;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p440g.C7503e;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p440g.C7504f;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p440g.C7505g;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p440g.C7506h;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p440g.C7507i;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p440g.C7508j;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p440g.C7509k;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p440g.C7510l;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p440g.C7511m;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p440g.C7512n;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p441h.C7513a;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p441h.C7514c;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p441h.C7515d;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p441h.C7516e;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p441h.C7517f;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p441h.C7518g;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p441h.C7519h;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p441h.C7520i;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p441h.C7521j;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p441h.C7522k;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p441h.C7523l;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p441h.C7524m;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p441h.C7525n;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p442i.C7526a;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p442i.C7527c;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p442i.C7528d;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p442i.C7529e;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p442i.C7530f;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p442i.C7531g;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p442i.C7532h;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p442i.C7533i;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p442i.C7534j;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p442i.C7535k;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p442i.C7536l;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p442i.C7537m;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p442i.C7538n;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p443j.C7539a;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p443j.C7540c;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p443j.C7541d;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p443j.C7542e;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p443j.C7543f;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p443j.C7544g;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p443j.C7545h;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p443j.C7546i;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p443j.C7547j;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p443j.C7548k;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p443j.C7549l;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p443j.C7550m;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p443j.C7551n;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p444k.C7552a;
import mobi.mmdt.ott.view.conversation.p432e.p445b.C7355b;
import mobi.mmdt.ott.view.conversation.p432e.p445b.C7356c;
import mobi.mmdt.ott.view.conversation.p432e.p445b.C7357d;
import mobi.mmdt.ott.view.conversation.p573f.C7197a;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

public final class C7191c extends C6827b {
    private int f20702A;
    public String f20703a;
    boolean f20704l;
    private final boolean f20705m;
    private final boolean f20706n;
    private Activity f20707o;
    private C6123a f20708p;
    private C3282c f20709q;
    private int f20710r;
    private int f20711s;
    private int f20712t;
    private int f20713u;
    private int f20714v;
    private String f20715w;
    private LinkedHashMap<Long, C7197a> f20716x;
    private HashSet<String> f20717y = new HashSet();
    private float f20718z;

    C7191c(Activity activity, C6123a c6123a, C3282c c3282c, int i, int i2, int i3, int i4, int i5, String str, String str2) {
        boolean z;
        super(activity);
        this.f20707o = activity;
        this.f20708p = c6123a;
        this.f20715w = str;
        this.f20709q = c3282c;
        this.f20710r = i3;
        this.f20711s = i;
        this.f20712t = i2;
        this.f20713u = i4;
        this.f20714v = i5;
        this.f20716x = MyApplication.m12950a().f15910p;
        boolean z2 = true;
        if (!this.f20715w.equals("fa")) {
            if (!this.f20715w.equals("ar")) {
                z = false;
                this.f20705m = z;
                this.f20703a = str2;
                if (VERSION.SDK_INT >= 16) {
                    z2 = false;
                }
                this.f20706n = z2;
                this.f20718z = (float) C2489g.m6754a().m6755a(BallPulseIndicator.SCALE);
                this.f20702A = (int) C2491i.m6758a();
            }
        }
        z = true;
        this.f20705m = z;
        this.f20703a = str2;
        if (VERSION.SDK_INT >= 16) {
            z2 = false;
        }
        this.f20706n = z2;
        this.f20718z = (float) C2489g.m6754a().m6755a(BallPulseIndicator.SCALE);
        this.f20702A = (int) C2491i.m6758a();
    }

    public final C6073e mo3449a(ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = this.f19501b;
        Activity activity = this.f20707o;
        C3284e c3284e = this.f20708p;
        int i2 = this.f20710r;
        int i3 = this.f20711s;
        int i4 = this.f20712t;
        float f = this.f20718z;
        int i5 = this.f20702A;
        int i6 = this.f20713u;
        boolean z = this.f20706n;
        switch (i) {
            case 6:
                return new C7355b(activity, layoutInflater, viewGroup);
            case 7:
                return new C7357d(activity, layoutInflater, viewGroup);
            case 8:
                return new C7356c(activity, layoutInflater, viewGroup, c3284e);
            default:
                switch (i) {
                    case 12:
                        return new C7536l(activity, layoutInflater, viewGroup, c3284e, c3284e);
                    case 13:
                        return new C7510l(activity, layoutInflater, viewGroup, c3284e, c3284e, c3284e);
                    case 14:
                        return new C7458l(activity, layoutInflater, viewGroup, (C3280a) c3284e, c3284e, c3284e);
                    case 15:
                        return new C7471l(activity, layoutInflater, viewGroup, (C3280a) c3284e, c3284e, c3284e);
                    case 16:
                        return new C7433k(activity, layoutInflater, viewGroup, c3284e, c3284e, c3284e);
                    case 17:
                        return new C7445k(activity, layoutInflater, viewGroup, (C3280a) c3284e, c3284e, c3284e);
                    case 18:
                        return new C7484l(activity, layoutInflater, viewGroup, (C3280a) c3284e, c3284e, c3284e);
                    case 19:
                        return new C7497l(activity, layoutInflater, viewGroup, (C3280a) c3284e, c3284e, c3284e);
                    default:
                        switch (i) {
                            case 22:
                                return new C7531g(activity, layoutInflater, viewGroup, i3, i4, c3284e, c3284e, c3284e);
                            case 23:
                                return new C7505g(activity, layoutInflater, viewGroup, i3, i4, c3284e, c3284e, c3284e, c3284e);
                            case 24:
                                return new C7453g(activity, layoutInflater, viewGroup, i3, f, i5, c3284e, (C3280a) c3284e, c3284e, c3284e);
                            case 25:
                                return new C7466g(activity, layoutInflater, viewGroup, i3, i4, f, i5, c3284e, c3284e, (C3280a) c3284e, c3284e);
                            case 26:
                                return new C7429g(activity, layoutInflater, viewGroup, i3, f, i5, c3284e, c3284e, c3284e, c3284e);
                            case 27:
                                return new C7441g(activity, layoutInflater, viewGroup, i3, i4, f, i5, c3284e, c3284e, (C3280a) c3284e, c3284e);
                            case 28:
                                return new C7479g(activity, layoutInflater, viewGroup, i3, f, i5, c3284e, (C3280a) c3284e, c3284e, c3284e);
                            case 29:
                                return new C7492g(activity, layoutInflater, viewGroup, i3, i4, f, i5, c3284e, c3284e, (C3280a) c3284e, c3284e);
                            default:
                                switch (i) {
                                    case 32:
                                        return new C7538n(activity, layoutInflater, viewGroup, i3, i4, z, c3284e, c3284e, c3284e, c3284e);
                                    case 33:
                                        return new C7512n(activity, layoutInflater, viewGroup, i3, i4, z, c3284e, c3284e, c3284e, c3284e, c3284e);
                                    case 34:
                                        return new C7460n(activity, layoutInflater, viewGroup, i3, i4, z, c3284e, (C3280a) c3284e, c3284e, c3284e, c3284e);
                                    case 35:
                                        return new C7473n(activity, layoutInflater, viewGroup, i3, i4, z, c3284e, c3284e, (C3280a) c3284e, c3284e, c3284e);
                                    case 36:
                                        return new C7435m(activity, layoutInflater, viewGroup, i3, i4, z, c3284e, c3284e, c3284e, c3284e, c3284e);
                                    case 37:
                                        return new C7447m(activity, layoutInflater, viewGroup, i3, i4, z, c3284e, c3284e, (C3280a) c3284e, c3284e, c3284e);
                                    case 38:
                                        return new C7486n(activity, layoutInflater, viewGroup, i3, i4, z, c3284e, (C3280a) c3284e, c3284e, c3284e, c3284e);
                                    case 39:
                                        return new C7499n(activity, layoutInflater, viewGroup, i3, i4, z, c3284e, c3284e, (C3280a) c3284e, c3284e, c3284e);
                                    default:
                                        switch (i) {
                                            case 42:
                                                return new C7527c(activity, layoutInflater, viewGroup, c3284e, c3284e, c3284e);
                                            case 43:
                                                return new C7501c(activity, layoutInflater, viewGroup, c3284e, c3284e, c3284e, c3284e);
                                            case 44:
                                                return new C7449c(activity, layoutInflater, viewGroup, c3284e, (C3280a) c3284e, c3284e, c3284e);
                                            case 45:
                                                return new C7462c(activity, layoutInflater, viewGroup, c3284e, c3284e, (C3280a) c3284e, c3284e);
                                            case 46:
                                                return new C7425c(activity, layoutInflater, viewGroup, c3284e, c3284e, c3284e, c3284e);
                                            case 47:
                                                return new C7437c(activity, layoutInflater, viewGroup, c3284e, c3284e, (C3280a) c3284e, c3284e);
                                            case 48:
                                                return new C7475c(activity, layoutInflater, viewGroup, c3284e, (C3280a) c3284e, c3284e, c3284e);
                                            case 49:
                                                return new C7488c(activity, layoutInflater, viewGroup, c3284e, c3284e, (C3280a) c3284e, c3284e);
                                            default:
                                                switch (i) {
                                                    case 52:
                                                        return new C7534j(activity, layoutInflater, viewGroup, c3284e, c3284e, c3284e);
                                                    case 53:
                                                        return new C7508j(activity, layoutInflater, viewGroup, c3284e, c3284e, c3284e, c3284e);
                                                    case 54:
                                                        return new C7456j(activity, layoutInflater, viewGroup, c3284e, c3284e, (C3280a) c3284e, c3284e);
                                                    case 55:
                                                        return new C7469j(activity, layoutInflater, viewGroup, c3284e, c3284e, (C3280a) c3284e, c3284e);
                                                    case 56:
                                                        return new C7431i(activity, layoutInflater, viewGroup, c3284e, c3284e, c3284e, c3284e);
                                                    case 57:
                                                        return new C7443i(activity, layoutInflater, viewGroup, c3284e, c3284e, (C3280a) c3284e, c3284e);
                                                    case 58:
                                                        return new C7482j(activity, layoutInflater, viewGroup, c3284e, c3284e, (C3280a) c3284e, c3284e);
                                                    case 59:
                                                        return new C7495j(activity, layoutInflater, viewGroup, c3284e, c3284e, (C3280a) c3284e, c3284e);
                                                    default:
                                                        switch (i) {
                                                            case 62:
                                                                return new C7535k(activity, layoutInflater, viewGroup, i2, c3284e, c3284e);
                                                            case 63:
                                                                return new C7509k(activity, layoutInflater, viewGroup, i2, c3284e, c3284e, c3284e);
                                                            case 64:
                                                                return new C7457k(activity, layoutInflater, viewGroup, i2, (C3280a) c3284e, c3284e, c3284e);
                                                            case 65:
                                                                return new C7470k(activity, layoutInflater, viewGroup, i2, (C3280a) c3284e, c3284e, c3284e);
                                                            case 66:
                                                                return new C7432j(activity, layoutInflater, viewGroup, i2, c3284e, c3284e, c3284e);
                                                            case 67:
                                                                return new C7444j(activity, layoutInflater, viewGroup, i2, (C3280a) c3284e, c3284e, c3284e);
                                                            case 68:
                                                                return new C7483k(activity, layoutInflater, viewGroup, i2, (C3280a) c3284e, c3284e, c3284e);
                                                            case 69:
                                                                return new C7496k(activity, layoutInflater, viewGroup, i2, (C3280a) c3284e, c3284e, c3284e);
                                                            default:
                                                                switch (i) {
                                                                    case 72:
                                                                        return new C7530f(activity, layoutInflater, viewGroup, i3, i4, c3284e, c3284e, c3284e);
                                                                    case 73:
                                                                        return new C7504f(activity, layoutInflater, viewGroup, i3, i4, c3284e, c3284e, c3284e, c3284e);
                                                                    case 74:
                                                                        return new C7452f(activity, layoutInflater, viewGroup, i3, i4, f, i5, c3284e, (C3280a) c3284e, c3284e, c3284e);
                                                                    case 75:
                                                                        return new C7465f(activity, layoutInflater, viewGroup, i3, i4, f, i5, c3284e, c3284e, (C3280a) c3284e, c3284e);
                                                                    case 76:
                                                                        return new C7428f(activity, layoutInflater, viewGroup, i3, f, i5, c3284e, c3284e, c3284e, c3284e);
                                                                    case 77:
                                                                        return new C7440f(activity, layoutInflater, viewGroup, i3, i4, f, i5, c3284e, c3284e, (C3280a) c3284e, c3284e);
                                                                    case 78:
                                                                        return new C7478f(activity, layoutInflater, viewGroup, i3, f, i5, c3284e, (C3280a) c3284e, c3284e, c3284e);
                                                                    case 79:
                                                                        return new C7491f(activity, layoutInflater, viewGroup, i3, i4, f, i5, c3284e, c3284e, (C3280a) c3284e, c3284e);
                                                                    default:
                                                                        switch (i) {
                                                                            case 82:
                                                                                return new C7537m(activity, layoutInflater, viewGroup, i3, i4, z, c3284e, c3284e, c3284e, c3284e);
                                                                            case 83:
                                                                                return new C7511m(activity, layoutInflater, viewGroup, i3, i4, z, c3284e, c3284e, c3284e, c3284e, c3284e);
                                                                            case 84:
                                                                                return new C7459m(activity, layoutInflater, viewGroup, i3, i4, z, c3284e, (C3280a) c3284e, c3284e, c3284e, c3284e);
                                                                            case 85:
                                                                                return new C7472m(activity, layoutInflater, viewGroup, i3, i4, z, c3284e, c3284e, (C3280a) c3284e, c3284e, c3284e);
                                                                            case 86:
                                                                                return new C7434l(activity, layoutInflater, viewGroup, i3, i4, z, c3284e, c3284e, c3284e, c3284e, c3284e);
                                                                            case 87:
                                                                                return new C7446l(activity, layoutInflater, viewGroup, i3, i4, z, c3284e, c3284e, (C3280a) c3284e, c3284e, c3284e);
                                                                            case 88:
                                                                                return new C7485m(activity, layoutInflater, viewGroup, i3, i4, z, c3284e, (C3280a) c3284e, c3284e, c3284e, c3284e);
                                                                            case 89:
                                                                                return new C7498m(activity, layoutInflater, viewGroup, i3, i4, z, c3284e, c3284e, (C3280a) c3284e, c3284e, c3284e);
                                                                            default:
                                                                                switch (i) {
                                                                                    case 92:
                                                                                        return new C7455i(activity, layoutInflater, viewGroup, i6, (C3280a) c3284e, c3284e, c3284e);
                                                                                    case 93:
                                                                                        return new C7468i(activity, layoutInflater, viewGroup, i6, (C3280a) c3284e, c3284e, c3284e);
                                                                                    case 94:
                                                                                        return new C7481i(activity, layoutInflater, viewGroup, i6, (C3280a) c3284e, c3284e, c3284e);
                                                                                    case 95:
                                                                                        return new C7494i(activity, layoutInflater, viewGroup, i6, (C3280a) c3284e, c3284e, c3284e);
                                                                                    default:
                                                                                        switch (i) {
                                                                                            case 102:
                                                                                                return new C7529e(activity, layoutInflater, viewGroup, i3, i4, c3284e, c3284e, c3284e);
                                                                                            case 103:
                                                                                                return new C7503e(activity, layoutInflater, viewGroup, i3, i4, c3284e, c3284e, c3284e, c3284e);
                                                                                            case 104:
                                                                                                return new C7451e(activity, layoutInflater, viewGroup, i3, i4, c3284e, (C3280a) c3284e, c3284e, c3284e);
                                                                                            case 105:
                                                                                                return new C7464e(activity, layoutInflater, viewGroup, i3, i4, c3284e, c3284e, (C3280a) c3284e, c3284e);
                                                                                            case 106:
                                                                                                return new C7427e(activity, layoutInflater, viewGroup, i3, i4, c3284e, c3284e, c3284e, c3284e);
                                                                                            case 107:
                                                                                                return new C7439e(activity, layoutInflater, viewGroup, i3, i4, c3284e, c3284e, (C3280a) c3284e, c3284e);
                                                                                            case 108:
                                                                                                return new C7477e(activity, layoutInflater, viewGroup, i3, i4, c3284e, (C3280a) c3284e, c3284e, c3284e);
                                                                                            case 109:
                                                                                                return new C7490e(activity, layoutInflater, viewGroup, i3, i4, c3284e, c3284e, (C3280a) c3284e, c3284e);
                                                                                            default:
                                                                                                switch (i) {
                                                                                                    case 112:
                                                                                                        return new C7528d(activity, layoutInflater, viewGroup, i3, i4, c3284e, c3284e, c3284e);
                                                                                                    case 113:
                                                                                                        return new C7502d(activity, layoutInflater, viewGroup, i3, i4, c3284e, c3284e, c3284e, c3284e);
                                                                                                    case 114:
                                                                                                        return new C7450d(activity, layoutInflater, viewGroup, i3, i4, c3284e, (C3280a) c3284e, c3284e, c3284e);
                                                                                                    case 115:
                                                                                                        return new C7463d(activity, layoutInflater, viewGroup, i3, i4, c3284e, c3284e, (C3280a) c3284e, c3284e);
                                                                                                    case 116:
                                                                                                        return new C7426d(activity, layoutInflater, viewGroup, i3, i4, c3284e, c3284e, c3284e, c3284e);
                                                                                                    case 117:
                                                                                                        return new C7438d(activity, layoutInflater, viewGroup, i3, i4, c3284e, c3284e, (C3280a) c3284e, c3284e);
                                                                                                    case 118:
                                                                                                        return new C7476d(activity, layoutInflater, viewGroup, i3, i4, c3284e, (C3280a) c3284e, c3284e, c3284e);
                                                                                                    case 119:
                                                                                                        return new C7489d(activity, layoutInflater, viewGroup, i3, i4, c3284e, c3284e, (C3280a) c3284e, c3284e);
                                                                                                    default:
                                                                                                        switch (i) {
                                                                                                            case IjkMediaMeta.FF_PROFILE_H264_HIGH_422 /*122*/:
                                                                                                                return new C7532h(activity, layoutInflater, viewGroup, i3, i4, c3284e, c3284e, c3284e);
                                                                                                            case 123:
                                                                                                                return new C7506h(activity, layoutInflater, viewGroup, i3, i4, c3284e, c3284e, c3284e, c3284e);
                                                                                                            case 124:
                                                                                                                return new C7454h(activity, layoutInflater, viewGroup, i3, i4, c3284e, (C3280a) c3284e, c3284e, c3284e);
                                                                                                            case 125:
                                                                                                                return new C7467h(activity, layoutInflater, viewGroup, i3, i4, c3284e, c3284e, (C3280a) c3284e, c3284e);
                                                                                                            case 126:
                                                                                                                return new C7430h(activity, layoutInflater, viewGroup, i3, i4, c3284e, c3284e, c3284e, c3284e);
                                                                                                            case 127:
                                                                                                                return new C7442h(activity, layoutInflater, viewGroup, i3, i4, c3284e, c3284e, (C3280a) c3284e, c3284e);
                                                                                                            case 128:
                                                                                                                return new C7480h(activity, layoutInflater, viewGroup, i3, i4, c3284e, (C3280a) c3284e, c3284e, c3284e);
                                                                                                            case 129:
                                                                                                                return new C7493h(activity, layoutInflater, viewGroup, i3, i4, c3284e, c3284e, (C3280a) c3284e, c3284e);
                                                                                                            default:
                                                                                                                switch (i) {
                                                                                                                    case 132:
                                                                                                                        return new C7533i(activity, layoutInflater, viewGroup, i6, c3284e, c3284e, c3284e);
                                                                                                                    case 133:
                                                                                                                        return new C7507i(activity, layoutInflater, viewGroup, i6, c3284e, c3284e, c3284e, c3284e);
                                                                                                                    default:
                                                                                                                        switch (i) {
                                                                                                                            case 142:
                                                                                                                                return new C7526a(activity, layoutInflater, viewGroup, c3284e, c3284e, c3284e);
                                                                                                                            case 143:
                                                                                                                                return new C7500a(activity, layoutInflater, viewGroup, c3284e, c3284e, c3284e, c3284e);
                                                                                                                            case IjkMediaMeta.FF_PROFILE_H264_HIGH_444 /*144*/:
                                                                                                                                return new C7448a(activity, layoutInflater, viewGroup, c3284e, (C3280a) c3284e, c3284e, c3284e);
                                                                                                                            case 145:
                                                                                                                                return new C7461a(activity, layoutInflater, viewGroup, c3284e, c3284e, (C3280a) c3284e, c3284e);
                                                                                                                            case 146:
                                                                                                                                return new C7424a(activity, layoutInflater, viewGroup, c3284e, c3284e, c3284e, c3284e);
                                                                                                                            case 147:
                                                                                                                                return new C7436a(activity, layoutInflater, viewGroup, c3284e, c3284e, (C3280a) c3284e, c3284e);
                                                                                                                            case 148:
                                                                                                                                return new C7474a(activity, layoutInflater, viewGroup, c3284e, (C3280a) c3284e, c3284e, c3284e);
                                                                                                                            case 149:
                                                                                                                                return new C7487a(activity, layoutInflater, viewGroup, c3284e, c3284e, (C3280a) c3284e, c3284e);
                                                                                                                            default:
                                                                                                                                switch (i) {
                                                                                                                                    case 135:
                                                                                                                                        return new C7546i(activity, layoutInflater, viewGroup, i6, c3284e, c3284e, c3284e);
                                                                                                                                    case 137:
                                                                                                                                        return new C7520i(activity, layoutInflater, viewGroup, i6, c3284e, c3284e, c3284e);
                                                                                                                                    case 1111:
                                                                                                                                        return new C7549l(activity, layoutInflater, viewGroup, c3284e, c3284e);
                                                                                                                                    case 1115:
                                                                                                                                        return new C7523l(activity, layoutInflater, viewGroup, c3284e, c3284e);
                                                                                                                                    case 2111:
                                                                                                                                        return new C7544g(activity, layoutInflater, viewGroup, i3, i4, c3284e, c3284e, c3284e);
                                                                                                                                    case 2115:
                                                                                                                                        return new C7518g(activity, layoutInflater, viewGroup, i3, i4, c3284e, c3284e, c3284e);
                                                                                                                                    case 3111:
                                                                                                                                        return new C7551n(activity, layoutInflater, viewGroup, i3, i4, z, c3284e, c3284e, c3284e, c3284e);
                                                                                                                                    case 3115:
                                                                                                                                        return new C7525n(activity, layoutInflater, viewGroup, i3, i4, z, c3284e, c3284e, c3284e, c3284e);
                                                                                                                                    case 4111:
                                                                                                                                        return new C7540c(activity, layoutInflater, viewGroup, c3284e, c3284e, c3284e);
                                                                                                                                    case 4115:
                                                                                                                                        return new C7514c(activity, layoutInflater, viewGroup, c3284e, c3284e, c3284e);
                                                                                                                                    case 5111:
                                                                                                                                        return new C7547j(activity, layoutInflater, viewGroup, c3284e, c3284e, c3284e);
                                                                                                                                    case 5115:
                                                                                                                                        return new C7521j(activity, layoutInflater, viewGroup, c3284e, c3284e, c3284e);
                                                                                                                                    case 6111:
                                                                                                                                        return new C7548k(activity, layoutInflater, viewGroup, i2, c3284e, c3284e);
                                                                                                                                    case 6115:
                                                                                                                                        return new C7522k(activity, layoutInflater, viewGroup, i2, c3284e, c3284e);
                                                                                                                                    case 7111:
                                                                                                                                        return new C7543f(activity, layoutInflater, viewGroup, i3, i4, c3284e, c3284e, c3284e);
                                                                                                                                    case 7115:
                                                                                                                                        return new C7517f(activity, layoutInflater, viewGroup, i3, i4, c3284e, c3284e, c3284e);
                                                                                                                                    case 8111:
                                                                                                                                        return new C7550m(activity, layoutInflater, viewGroup, i3, i4, z, c3284e, c3284e, c3284e, c3284e);
                                                                                                                                    case 8115:
                                                                                                                                        return new C7524m(activity, layoutInflater, viewGroup, i3, i4, z, c3284e, c3284e, c3284e, c3284e);
                                                                                                                                    case 9992:
                                                                                                                                        return new C7552a(activity, layoutInflater, viewGroup, c3284e, c3284e);
                                                                                                                                    case 10111:
                                                                                                                                        return new C7542e(activity, layoutInflater, viewGroup, i3, i4, c3284e, c3284e, c3284e);
                                                                                                                                    case 10115:
                                                                                                                                        return new C7516e(activity, layoutInflater, viewGroup, i3, i4, c3284e, c3284e, c3284e);
                                                                                                                                    case 11111:
                                                                                                                                        return new C7541d(activity, layoutInflater, viewGroup, i3, i4, c3284e, c3284e, c3284e);
                                                                                                                                    case 12111:
                                                                                                                                        return new C7545h(activity, layoutInflater, viewGroup, i3, i4, c3284e, c3284e, c3284e);
                                                                                                                                    case 12115:
                                                                                                                                        return new C7519h(activity, layoutInflater, viewGroup, i3, i4, c3284e, c3284e, c3284e);
                                                                                                                                    case 14111:
                                                                                                                                        return new C7539a(activity, layoutInflater, viewGroup, c3284e, c3284e, c3284e);
                                                                                                                                    case 14115:
                                                                                                                                        return new C7513a(activity, layoutInflater, viewGroup, c3284e, c3284e, c3284e);
                                                                                                                                    case 111115:
                                                                                                                                        return new C7515d(activity, layoutInflater, viewGroup, i3, i4, c3284e, c3284e, c3284e);
                                                                                                                                    default:
                                                                                                                                        return null;
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
                                        }
                                }
                        }
                }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected final mobi.mmdt.ott.view.components.p401c.C6829g mo3450a(android.database.Cursor r124, int r125) {
        /*
        r123 = this;
        r1 = r123;
        r2 = r124;
        r5 = r125;
        if (r2 == 0) goto L_0x0ae9;
    L_0x0008:
        r4 = r124.isClosed();
        if (r4 == 0) goto L_0x0010;
    L_0x000e:
        goto L_0x0ae9;
    L_0x0010:
        r4 = "";
        r6 = "";
        r7 = "_id";
        r7 = r2.getColumnIndex(r7);
        r10 = r2.getLong(r7);
        r7 = "conversations_file_id";
        r7 = r2.getColumnIndex(r7);
        r12 = r2.getLong(r7);
        r7 = "conversations_event_type";
        r7 = r2.getColumnIndex(r7);
        r14 = r2.getInt(r7);
        r7 = "conversations_event_state";
        r7 = r2.getColumnIndex(r7);
        r15 = r2.getInt(r7);
        r7 = "conversations_direction_type";
        r7 = r2.getColumnIndex(r7);
        r7 = r2.getInt(r7);
        r3 = "conversations_group_type";
        r3 = r2.getColumnIndex(r3);
        r3 = r2.getInt(r3);
        r9 = "conversations_send_time";
        r9 = r2.getColumnIndex(r9);
        r8 = r2.getLong(r9);
        r19 = r4;
        r4 = "conversations_event";
        r4 = r2.getColumnIndex(r4);
        r4 = r2.getString(r4);
        r20 = r6;
        r6 = "conversations_message_id";
        r6 = r2.getColumnIndex(r6);
        r6 = r2.getString(r6);
        r21 = r12;
        r12 = "conversations_reply_message_id";
        r12 = r2.getColumnIndex(r12);
        r12 = r2.getString(r12);
        r13 = "conversations_party";
        r13 = r2.getColumnIndex(r13);
        r13 = r2.getString(r13);
        r23 = r13;
        r13 = "members_local_name";
        r13 = r2.getColumnIndex(r13);
        r13 = r2.getString(r13);
        r24 = r12;
        r12 = "members_local_phone_number";
        r12 = r2.getColumnIndex(r12);
        r12 = r2.getString(r12);
        r25 = r12;
        r12 = "conversations_visits";
        r12 = r2.getColumnIndex(r12);
        r12 = r2.getInt(r12);
        r26 = r12;
        r12 = "conversations_likes";
        r12 = r2.getColumnIndex(r12);
        r12 = r2.getInt(r12);
        r27 = r12;
        r12 = "conversations_my_like";
        r12 = r2.getColumnIndex(r12);
        r12 = r2.getInt(r12);
        r28 = r12;
        r12 = "conversations_my_visit";
        r12 = r2.getColumnIndex(r12);
        r12 = r2.getInt(r12);
        r29 = r13;
        r13 = 1;
        if (r12 != r13) goto L_0x00d7;
    L_0x00d5:
        r12 = 1;
        goto L_0x00d8;
    L_0x00d7:
        r12 = 0;
    L_0x00d8:
        r13 = "conversations_peer_user_id";
        r13 = r2.getColumnIndex(r13);
        r13 = r2.getString(r13);
        r30 = r13;
        r13 = "members_nick_name";
        r13 = r2.getColumnIndex(r13);
        r13 = r2.getString(r13);
        r31 = r12;
        r12 = "members_avatar_thumbnail_url";
        r12 = r2.getColumnIndex(r12);
        r12 = r2.getString(r12);
        r32 = r12;
        r12 = "members_is_local_user";
        r12 = r2.getColumnIndex(r12);
        r12 = r2.getInt(r12);
        if (r12 == 0) goto L_0x010c;
    L_0x0108:
        r33 = r13;
        r12 = 1;
        goto L_0x010f;
    L_0x010c:
        r33 = r13;
        r12 = 0;
    L_0x010f:
        r13 = "conversations_forward_user_id";
        r13 = r2.getColumnIndex(r13);
        r13 = r2.getString(r13);
        r34 = r12;
        r12 = "conversations_forward_message_id";
        r12 = r2.getColumnIndex(r12);
        r12 = r2.getString(r12);
        r35 = mobi.mmdt.ott.provider.p384f.C2973m.values();
        r36 = r15;
        r15 = "conversations_forward_group_type";
        r15 = r2.getColumnIndex(r15);
        r15 = r2.getInt(r15);
        r15 = r35[r15];
        r37 = r8;
        r8 = "conversations_forward_name";
        r8 = r2.getColumnIndex(r8);
        r8 = r2.getString(r8);
        r9 = "conversations_edit_time";
        r9 = r2.getColumnIndex(r9);
        r39 = r10;
        r9 = r2.getLong(r9);
        r9 = java.lang.Long.valueOf(r9);
        r10 = "conversations_link_preview";
        r10 = r2.getColumnIndex(r10);
        r10 = r2.getString(r10);
        if (r9 == 0) goto L_0x016b;
    L_0x015f:
        r41 = r9.longValue();
        r43 = 0;
        r9 = (r41 > r43 ? 1 : (r41 == r43 ? 0 : -1));
        if (r9 == 0) goto L_0x016b;
    L_0x0169:
        r9 = 1;
        goto L_0x016c;
    L_0x016b:
        r9 = 0;
    L_0x016c:
        r11 = mobi.mmdt.ott.view.conversation.p427c.C3444a.m7878a(r14, r7, r3, r4);
        if (r13 == 0) goto L_0x01a3;
    L_0x0172:
        r35 = r13.isEmpty();
        if (r35 != 0) goto L_0x01a3;
    L_0x0178:
        if (r8 == 0) goto L_0x0184;
    L_0x017a:
        r35 = r8.isEmpty();
        if (r35 == 0) goto L_0x0181;
    L_0x0180:
        goto L_0x0184;
    L_0x0181:
        r45 = r3;
        goto L_0x01a8;
    L_0x0184:
        r45 = r3;
        r3 = r1.f20717y;
        r3 = r3.contains(r6);
        if (r3 != 0) goto L_0x01a8;
    L_0x018e:
        r3 = r1.f20717y;
        r3.add(r6);
        r3 = new mobi.mmdt.ott.logic.a.g.b.a;
        r3.<init>(r12, r13, r15);
        r8 = new mobi.mmdt.ott.logic.a.g.b.f;
        r8.<init>(r6, r3);
        mobi.mmdt.ott.logic.C2808d.m7147a(r8);
        r8 = r20;
        goto L_0x01a8;
    L_0x01a3:
        r45 = r3;
        r3 = "";
        r8 = r3;
    L_0x01a8:
        r3 = r1.f20709q;
        r3 = r3.mo2356c();
        if (r3 == 0) goto L_0x01c4;
    L_0x01b0:
        r3 = r1.f20716x;
        r47 = r8;
        r46 = r9;
        r48 = r12;
        r8 = r39;
        r12 = java.lang.Long.valueOf(r8);
        r3 = r3.containsKey(r12);
        r12 = r3;
        goto L_0x01cd;
    L_0x01c4:
        r47 = r8;
        r46 = r9;
        r48 = r12;
        r8 = r39;
        r12 = 0;
    L_0x01cd:
        r3 = mobi.mmdt.ott.MyApplication.m12950a();
        r3 = r3.f15911q;
        r3 = r3.equals(r6);
        if (r3 == 0) goto L_0x01dc;
    L_0x01d9:
        r20 = r6;
        goto L_0x01e0;
    L_0x01dc:
        r3 = "";
        r20 = r3;
    L_0x01e0:
        r3 = r124.getCount();
        r18 = 1;
        r3 = r3 + -1;
        if (r5 != r3) goto L_0x020b;
    L_0x01ea:
        r3 = r1.f20709q;
        r49 = r15;
        r15 = r1.f20709q;
        r15 = r15.mo2355b();
        r15 = r15 ^ 1;
        r3.mo2354a(r15);
        r52 = r8;
        r50 = r11;
        r51 = r12;
        r54 = r13;
        r8 = r18;
        r11 = r8;
        r12 = r36;
        r55 = r37;
        r9 = 0;
        goto L_0x02a6;
    L_0x020b:
        r49 = r15;
        r3 = r1.f20709q;
        r15 = 0;
        r3.mo2354a(r15);
        r3 = r5 + 1;
        r3 = r1.m13685c(r3);
        r3 = (android.database.Cursor) r3;
        r15 = "conversations_send_time";
        r15 = r3.getColumnIndex(r15);
        r50 = r11;
        r51 = r12;
        r11 = r3.getLong(r15);
        r15 = java.util.Calendar.getInstance();
        r52 = r8;
        r8 = r37;
        r15.setTimeInMillis(r8);
        r54 = r13;
        r13 = 6;
        r55 = r8;
        r8 = r15.get(r13);
        r15.setTimeInMillis(r11);
        r9 = r15.get(r13);
        if (r8 == r9) goto L_0x0249;
    L_0x0246:
        r8 = r18;
        goto L_0x024a;
    L_0x0249:
        r8 = 0;
    L_0x024a:
        r9 = "conversations_event_state";
        r9 = r3.getColumnIndex(r9);
        r3 = r3.getInt(r9);
        r9 = r1.f20709q;
        r9 = r9.mo2357d();
        r11 = r1.f20709q;
        r11 = r11.mo2359f();
        if (r11 != 0) goto L_0x0280;
    L_0x0262:
        r11 = mobi.mmdt.ott.provider.p384f.C2970j.IN;
        r11 = r11.ordinal();
        if (r7 != r11) goto L_0x027d;
    L_0x026a:
        r11 = mobi.mmdt.ott.provider.p384f.C2971k.NOT_READ;
        r11 = r11.ordinal();
        r12 = r36;
        if (r12 != r11) goto L_0x0286;
    L_0x0274:
        r11 = mobi.mmdt.ott.provider.p384f.C2971k.NOT_READ;
        r11 = r11.ordinal();
        if (r3 == r11) goto L_0x0286;
    L_0x027c:
        goto L_0x0291;
    L_0x027d:
        r12 = r36;
        goto L_0x0286;
    L_0x0280:
        r12 = r36;
        r3 = r9 + -1;
        if (r3 == r5) goto L_0x0291;
    L_0x0286:
        r3 = r1.f20703a;
        r3 = r3.equals(r6);
        if (r3 == 0) goto L_0x028f;
    L_0x028e:
        goto L_0x0291;
    L_0x028f:
        r9 = 0;
        goto L_0x02a2;
    L_0x0291:
        r1.f20703a = r6;
        r3 = r1.f20704l;
        if (r3 != 0) goto L_0x029f;
    L_0x0297:
        if (r9 <= 0) goto L_0x029c;
    L_0x0299:
        r3 = r18;
        goto L_0x029d;
    L_0x029c:
        r3 = 0;
    L_0x029d:
        r1.f20704l = r3;
    L_0x029f:
        r3 = r1.f20704l;
        r9 = r3;
    L_0x02a2:
        r1.m13685c(r5);
        r11 = 0;
    L_0x02a6:
        r3 = mobi.mmdt.ott.provider.p384f.C2970j.OUT;
        r3 = r3.ordinal();
        if (r7 != r3) goto L_0x02b7;
    L_0x02ae:
        r3 = 2131690577; // 0x7f0f0451 float:1.9010202E38 double:1.0531950817E-314;
        r3 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r3);
    L_0x02b5:
        r13 = r3;
        goto L_0x02c9;
    L_0x02b7:
        if (r34 == 0) goto L_0x02c2;
    L_0x02b9:
        r13 = r25;
        r3 = r29;
        r3 = mobi.mmdt.ott.view.tools.C4508f.m8221a(r3, r13);
        goto L_0x02b5;
    L_0x02c2:
        r3 = r33;
        r3 = mobi.mmdt.ott.view.tools.C4508f.m8220a(r3);
        goto L_0x02b5;
    L_0x02c9:
        if (r10 == 0) goto L_0x0354;
    L_0x02cb:
        r3 = "not_available";
        r3 = r10.equals(r3);
        if (r3 != 0) goto L_0x0354;
    L_0x02d3:
        r3 = "files_thumbnail_download_state";
        r3 = r2.getColumnIndex(r3);
        r3 = r2.getInt(r3);
        r15 = "files_file_uri";
        r15 = r2.getColumnIndex(r15);
        r15 = r2.getString(r15);
        r57 = r3;
        r3 = "files_thumbnail_uri";
        r3 = r2.getColumnIndex(r3);
        r3 = r2.getString(r3);
        r58 = r3;
        r3 = "files_progress";
        r3 = r2.getColumnIndex(r3);
        r3 = r2.getInt(r3);
        r59 = r3;
        r3 = "files_image_width";
        r3 = r2.getColumnIndex(r3);
        r3 = r2.getInt(r3);
        r60 = r3;
        r3 = "files_image_height";
        r3 = r2.getColumnIndex(r3);
        r3 = r2.getInt(r3);
        r61 = r3;
        r3 = "files_duration";
        r3 = r2.getColumnIndex(r3);
        r3 = r2.getInt(r3);
        r62 = r3;
        r3 = "files_size";
        r3 = r2.getColumnIndex(r3);
        r3 = r2.getInt(r3);
        r63 = r3;
        r3 = "files_audio_state";
        r3 = r2.getColumnIndex(r3);
        r3 = r2.getInt(r3);
        r64 = r3;
        r3 = "files_audio_playing_time";
        r3 = r2.getColumnIndex(r3);
        r3 = r2.getInt(r3);
        r65 = r3;
        r3 = "files_name";
        r3 = r2.getColumnIndex(r3);
        r3 = r2.getString(r3);
        goto L_0x0368;
    L_0x0354:
        r3 = 0;
        r15 = 0;
        r57 = 0;
        r58 = 0;
        r59 = 0;
        r60 = 0;
        r61 = 0;
        r62 = 0;
        r63 = 0;
        r64 = 0;
        r65 = 0;
    L_0x0368:
        r17 = mobi.mmdt.ott.provider.p384f.C2972l.values();
        r66 = r3;
        r3 = r17[r14];
        r67 = r6;
        r6 = "files_download_state";
        r6 = r2.getColumnIndex(r6);
        r6 = r2.getInt(r6);
        r17 = mobi.mmdt.ott.provider.p386h.C2988j.values();
        r68 = r6;
        r6 = "files_type";
        r6 = r2.getColumnIndex(r6);
        r6 = r2.getInt(r6);
        r6 = r17[r6];
        r69 = r6;
        r6 = mobi.mmdt.ott.provider.p384f.C2972l.PUSH_TO_TALK;
        if (r3 != r6) goto L_0x03a8;
    L_0x0394:
        r6 = "files_audio_state";
        r6 = r2.getColumnIndex(r6);
        r64 = r2.getInt(r6);
        r6 = "files_audio_playing_time";
        r6 = r2.getColumnIndex(r6);
        r65 = r2.getInt(r6);
    L_0x03a8:
        r70 = r15;
        r71 = r64;
        r15 = r65;
        r6 = mobi.mmdt.ott.provider.p384f.C2972l.STICKER;
        if (r3 != r6) goto L_0x044b;
    L_0x03b2:
        r6 = "conversations_sticker_id";
        r6 = r2.getColumnIndex(r6);
        r6 = r2.getString(r6);
        r72 = r6;
        r6 = "stickers_sticker_id";
        r6 = r2.getColumnIndex(r6);
        r6 = r2.getString(r6);
        r73 = r6;
        r6 = "stickers_package_id";
        r6 = r2.getColumnIndex(r6);
        r6 = r2.getString(r6);
        r74 = r6;
        r6 = "stickers_sticker_version";
        r6 = r2.getColumnIndex(r6);
        r6 = r2.getString(r6);
        r75 = r6;
        r6 = "stickers_thumbnail_uri";
        r6 = r2.getColumnIndex(r6);
        r6 = r2.getString(r6);
        r76 = r6;
        r6 = "stickers_original_uri";
        r6 = r2.getColumnIndex(r6);
        r6 = r2.getString(r6);
        r77 = r6;
        r6 = "stickers_download_state";
        r6 = r2.getColumnIndex(r6);
        r6 = r2.getInt(r6);
        r78 = r6;
        r6 = "stickers_ver_span";
        r6 = r2.getColumnIndex(r6);
        r6 = r2.getInt(r6);
        r79 = r6;
        r6 = "stickers_hor_span";
        r6 = r2.getColumnIndex(r6);
        r6 = r2.getInt(r6);
        r80 = r6;
        r6 = "stickers_download_state";
        r6 = r2.getColumnIndex(r6);
        r6 = r2.getInt(r6);
        r81 = r6;
        r6 = "stickers_view_multiplier";
        r6 = r2.getColumnIndex(r6);
        r6 = r2.getInt(r6);
        r90 = r6;
        r82 = r14;
        r91 = r72;
        r14 = r73;
        r83 = r74;
        r84 = r75;
        r85 = r76;
        r86 = r77;
        r89 = r78;
        r87 = r79;
        r88 = r80;
        goto L_0x0462;
    L_0x044b:
        r82 = r14;
        r81 = r68;
        r14 = 0;
        r83 = 0;
        r84 = 0;
        r85 = 0;
        r86 = 0;
        r87 = 0;
        r88 = 0;
        r89 = 0;
        r90 = 0;
        r91 = 0;
    L_0x0462:
        r6 = mobi.mmdt.ott.provider.p384f.C2972l.LOCATION;
        r17 = 600; // 0x258 float:8.41E-43 double:2.964E-321;
        if (r3 != r6) goto L_0x04a0;
    L_0x0468:
        r6 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x0486 }
        r6.<init>(r4);	 Catch:{ JSONException -> 0x0486 }
        r92 = r4;
        r4 = "LOCATION_LATITUDE";
        r4 = r6.getString(r4);	 Catch:{ JSONException -> 0x0484 }
        r93 = r4;
        r4 = "LOCATION_LONGITUDE";
        r4 = r6.getString(r4);	 Catch:{ JSONException -> 0x0481 }
        r6 = r4;
        r4 = r93;
        goto L_0x0492;
    L_0x0481:
        r0 = move-exception;
        r4 = r0;
        goto L_0x048c;
    L_0x0484:
        r0 = move-exception;
        goto L_0x0489;
    L_0x0486:
        r0 = move-exception;
        r92 = r4;
    L_0x0489:
        r4 = r0;
        r93 = 0;
    L_0x048c:
        r4.printStackTrace();
        r4 = r93;
        r6 = 0;
    L_0x0492:
        r25 = mobi.mmdt.ott.view.tools.C4521o.m8235a(r4, r6);
        r95 = r6;
        r60 = r17;
        r61 = r60;
        r94 = r25;
        r6 = r4;
        goto L_0x04a7;
    L_0x04a0:
        r92 = r4;
        r6 = 0;
        r94 = 0;
        r95 = 0;
    L_0x04a7:
        r4 = mobi.mmdt.ott.provider.p384f.C2972l.VOTE;
        if (r3 != r4) goto L_0x04b8;
    L_0x04ab:
        r4 = "conversations_my_vote";
        r4 = r2.getColumnIndex(r4);
        r4 = r2.getString(r4);
        r96 = r4;
        goto L_0x04ba;
    L_0x04b8:
        r96 = 0;
    L_0x04ba:
        r4 = mobi.mmdt.ott.provider.p384f.C2972l.FILE;
        if (r3 == r4) goto L_0x04c6;
    L_0x04be:
        r4 = mobi.mmdt.ott.provider.p384f.C2972l.AUDIO;
        if (r3 != r4) goto L_0x04c3;
    L_0x04c2:
        goto L_0x04c6;
    L_0x04c3:
        r97 = r66;
        goto L_0x04d2;
    L_0x04c6:
        r4 = "files_name";
        r4 = r2.getColumnIndex(r4);
        r4 = r2.getString(r4);
        r97 = r4;
    L_0x04d2:
        r4 = mobi.mmdt.ott.provider.p384f.C2972l.PUSH_TO_TALK;
        if (r3 == r4) goto L_0x04de;
    L_0x04d6:
        r4 = mobi.mmdt.ott.provider.p384f.C2972l.VIDEO;
        if (r3 != r4) goto L_0x04db;
    L_0x04da:
        goto L_0x04de;
    L_0x04db:
        r98 = r62;
        goto L_0x04e9;
    L_0x04de:
        r4 = "files_duration";
        r4 = r2.getColumnIndex(r4);
        r62 = r2.getInt(r4);
        goto L_0x04db;
    L_0x04e9:
        r4 = mobi.mmdt.ott.provider.p384f.C2972l.FILE;
        if (r3 == r4) goto L_0x04fd;
    L_0x04ed:
        r4 = mobi.mmdt.ott.provider.p384f.C2972l.AUDIO;
        if (r3 == r4) goto L_0x04fd;
    L_0x04f1:
        r4 = mobi.mmdt.ott.provider.p384f.C2972l.VIDEO;
        if (r3 == r4) goto L_0x04fd;
    L_0x04f5:
        r4 = mobi.mmdt.ott.provider.p384f.C2972l.GIF;
        if (r3 == r4) goto L_0x04fd;
    L_0x04f9:
        r4 = mobi.mmdt.ott.provider.p384f.C2972l.IMAGE;
        if (r3 != r4) goto L_0x0507;
    L_0x04fd:
        r4 = "files_size";
        r4 = r2.getColumnIndex(r4);
        r63 = r2.getInt(r4);
    L_0x0507:
        r99 = r6;
        r4 = r63;
        r6 = mobi.mmdt.ott.provider.p384f.C2972l.GIF;
        if (r3 == r6) goto L_0x0517;
    L_0x050f:
        r6 = mobi.mmdt.ott.provider.p384f.C2972l.IMAGE;
        if (r3 == r6) goto L_0x0517;
    L_0x0513:
        r6 = mobi.mmdt.ott.provider.p384f.C2972l.VIDEO;
        if (r3 != r6) goto L_0x053f;
    L_0x0517:
        r6 = "files_thumbnail_download_state";
        r6 = r2.getColumnIndex(r6);
        r57 = r2.getInt(r6);
        r6 = "files_thumbnail_uri";
        r6 = r2.getColumnIndex(r6);
        r58 = r2.getString(r6);
        r6 = "files_image_width";
        r6 = r2.getColumnIndex(r6);
        r60 = r2.getInt(r6);
        r6 = "files_image_height";
        r6 = r2.getColumnIndex(r6);
        r61 = r2.getInt(r6);
    L_0x053f:
        r100 = r14;
        r101 = r15;
        r102 = r58;
        r14 = r60;
        r15 = r61;
        r6 = mobi.mmdt.ott.provider.p384f.C2972l.TEXT;
        if (r3 != r6) goto L_0x0565;
    L_0x054d:
        r6 = mobi.mmdt.ott.provider.p384f.C2972l.STICKER;
        if (r3 != r6) goto L_0x0565;
    L_0x0551:
        r6 = mobi.mmdt.ott.provider.p384f.C2972l.VOTE;
        if (r3 != r6) goto L_0x0565;
    L_0x0555:
        r6 = mobi.mmdt.ott.provider.p384f.C2972l.REPORT;
        if (r3 == r6) goto L_0x055a;
    L_0x0559:
        goto L_0x0565;
    L_0x055a:
        r103 = r4;
        r104 = r7;
        r3 = r19;
        r6 = r59;
    L_0x0562:
        r7 = r70;
        goto L_0x05bb;
    L_0x0565:
        r6 = "files_progress";
        r6 = r2.getColumnIndex(r6);
        r6 = r2.getInt(r6);
        if (r4 <= 0) goto L_0x05a2;
    L_0x0571:
        if (r6 <= 0) goto L_0x05a2;
    L_0x0573:
        r16 = r4 / 100;
        r103 = r4;
        r4 = r16 * r6;
        r104 = r7;
        r7 = r1.f20707o;
        r4 = (float) r4;
        r4 = mobi.mmdt.componentsutils.p232b.C2491i.m6770a(r7, r4);
        r7 = new java.lang.StringBuilder;
        r7.<init>();
        r7.append(r4);
        r4 = " | ";
        r7.append(r4);
        r4 = 100;
        if (r6 < r4) goto L_0x0594;
    L_0x0593:
        goto L_0x0595;
    L_0x0594:
        r4 = r6;
    L_0x0595:
        r7.append(r4);
        r4 = "%";
        r7.append(r4);
        r4 = r7.toString();
        goto L_0x05a8;
    L_0x05a2:
        r103 = r4;
        r104 = r7;
        r4 = "0B | 0%";
    L_0x05a8:
        r7 = mobi.mmdt.ott.provider.p384f.C2972l.LOCATION;
        if (r3 == r7) goto L_0x05b9;
    L_0x05ac:
        r3 = "files_file_uri";
        r3 = r2.getColumnIndex(r3);
        r2 = r2.getString(r3);
        r7 = r2;
        r3 = r4;
        goto L_0x05bb;
    L_0x05b9:
        r3 = r4;
        goto L_0x0562;
    L_0x05bb:
        r4 = new mobi.mmdt.ott.view.conversation.c.a.a;
        r2 = r4;
        r110 = r3;
        r108 = r10;
        r106 = r14;
        r105 = r15;
        r15 = r45;
        r14 = r92;
        r112 = r95;
        r113 = r96;
        r111 = r97;
        r109 = r98;
        r107 = r103;
        r10 = r4;
        r3 = r52;
        r117 = r6;
        r114 = r67;
        r115 = r69;
        r118 = r71;
        r119 = r91;
        r120 = r99;
        r116 = r102;
        r6 = r51;
        r122 = r7;
        r121 = r104;
        r7 = r20;
        r2.<init>(r3, r5, r6, r7);
        r2 = 92;
        r3 = r50;
        if (r3 == r2) goto L_0x05ff;
    L_0x05f6:
        r2 = 93;
        if (r3 == r2) goto L_0x05ff;
    L_0x05fa:
        if (r24 == 0) goto L_0x05ff;
    L_0x05fc:
        r2 = r18;
        goto L_0x0600;
    L_0x05ff:
        r2 = 0;
    L_0x0600:
        if (r2 == 0) goto L_0x0631;
    L_0x0602:
        r4 = r24;
        r5 = mobi.mmdt.ott.provider.p384f.C2966b.m7418i(r4);
        if (r5 == 0) goto L_0x0633;
    L_0x060a:
        r6 = r5.f9231d;
        r10.al = r6;
        r6 = r5.f9229b;
        r10.am = r6;
        r6 = r5.f9234g;
        r10.an = r6;
        r6 = r5.f9236i;
        r10.ao = r6;
        r6 = r5.f9235h;
        r10.ap = r6;
        r6 = r5.f9232e;
        r10.aq = r6;
        r6 = r5.f9233f;
        r10.ar = r6;
        r6 = r5.f9228a;
        r10.as = r6;
        r5 = r5.f9230c;
        r10.at = r5;
        r10.ak = r2;
        goto L_0x0633;
    L_0x0631:
        r4 = r24;
    L_0x0633:
        r2 = r1.f20709q;
        r2 = r2.mo2358e();
        r10.au = r2;
        r2 = r23;
        r10.f10527S = r2;
        r10.f10534Z = r13;
        r10.f10518J = r15;
        r10.f10524P = r14;
        r5 = r55;
        r10.f10519K = r5;
        r2 = r1.f;
        r7 = r1.f20715w;
        r2 = mobi.mmdt.componentsutils.p232b.C2491i.m6773a(r2, r5, r7);
        r10.ac = r2;
        r10.f10537c = r8;
        r10.f10538d = r9;
        r10.f10539e = r11;
        r2 = r1.f20707o;
        r2 = mobi.mmdt.componentsutils.p232b.C2491i.m6768a(r2, r5);
        r10.ad = r2;
        r2 = mobi.mmdt.ott.provider.p384f.C2971k.values();
        r2 = r2[r12];
        r10.f10517I = r2;
        r2 = r114;
        r10.f10525Q = r2;
        r2 = r32;
        r10.f10529U = r2;
        r10.f10526R = r4;
        r2 = r31;
        r10.f10523O = r2;
        r2 = r27;
        r10.f10521M = r2;
        r2 = r26;
        r10.f10520L = r2;
        r2 = r28;
        r10.f10522N = r2;
        r2 = r1.f20714v;
        r10.ae = r2;
        r2 = mobi.mmdt.ott.provider.p386h.C2987i.values();
        r2 = r2[r81];
        r10.af = r2;
        r4 = r21;
        r10.f10516H = r4;
        r2 = r54;
        r10.f10530V = r2;
        r2 = r49;
        r10.aa = r2;
        r2 = r48;
        r10.f10531W = r2;
        r8 = r47;
        r10.f10532X = r8;
        r2 = r46;
        r10.f10535a = r2;
        r2 = r108;
        r10.f10533Y = r2;
        r2 = mobi.mmdt.ott.provider.p386h.C2987i.values();
        r2 = r2[r57];
        r10.f10556v = r2;
        r2 = r122;
        r10.f10541g = r2;
        r2 = r116;
        r10.f10543i = r2;
        r6 = r117;
        r10.f10548n = r6;
        r2 = r106;
        r10.f10549o = r2;
        r2 = r105;
        r10.f10550p = r2;
        r2 = r109;
        r10.f10551q = r2;
        r2 = r1.f20707o;
        r4 = r107;
        r4 = (float) r4;
        r2 = mobi.mmdt.componentsutils.p232b.C2491i.m6770a(r2, r4);
        r4 = r1.f20705m;
        if (r4 == 0) goto L_0x06dc;
    L_0x06d8:
        r2 = mobi.mmdt.componentsutils.p232b.C2491i.m6826c(r2);
    L_0x06dc:
        r10.f10552r = r2;
        r4 = r110;
        r10.f10553s = r4;
        r2 = r118;
        r10.f10554t = r2;
        r2 = r101;
        r10.f10555u = r2;
        r4 = r111;
        r10.f10542h = r4;
        r2 = r115;
        r10.f10547m = r2;
        r2 = r119;
        r10.f10557w = r2;
        r2 = r100;
        r10.f10558x = r2;
        r2 = r83;
        r10.f10559y = r2;
        r2 = r84;
        r10.f10560z = r2;
        r2 = r85;
        r10.f10509A = r2;
        r2 = r86;
        r10.f10510B = r2;
        r2 = r87;
        r10.f10511C = r2;
        r2 = r88;
        r10.f10512D = r2;
        r2 = r89;
        r10.f10513E = r2;
        r6 = r90;
        r10.f10514F = r6;
        r2 = r30;
        r10.f10528T = r2;
        r4 = r120;
        r10.f10544j = r4;
        r6 = r112;
        r10.f10545k = r6;
        r2 = r94;
        r10.f10546l = r2;
        r2 = r1.f20715w;
        r10.ag = r2;
        r4 = r113;
        r10.aj = r4;
        r2 = mobi.mmdt.ott.provider.p384f.C2973m.CHANNEL;
        r2 = r2.ordinal();
        if (r15 == r2) goto L_0x074a;
    L_0x073a:
        r2 = mobi.mmdt.ott.provider.p384f.C2973m.CHANNEL_REPLY;
        r2 = r2.ordinal();
        if (r15 == r2) goto L_0x074a;
    L_0x0742:
        r2 = mobi.mmdt.ott.provider.p384f.C2973m.CHANNEL_DIRECT;
        r2 = r2.ordinal();
        if (r15 != r2) goto L_0x0752;
    L_0x074a:
        r2 = r1.f20708p;
        r2 = (mobi.mmdt.ott.view.conversation.activities.p419a.C6875d) r2;
        r2 = r2.ai;
        r10.ah = r2;
    L_0x0752:
        switch(r3) {
            case 6: goto L_0x0a9d;
            case 7: goto L_0x0a97;
            case 8: goto L_0x0a91;
            default: goto L_0x0755;
        };
    L_0x0755:
        switch(r3) {
            case 12: goto L_0x0a8b;
            case 13: goto L_0x0a85;
            case 14: goto L_0x0a7f;
            case 15: goto L_0x0a79;
            case 16: goto L_0x0a73;
            case 17: goto L_0x0a6d;
            case 18: goto L_0x0a67;
            case 19: goto L_0x0a61;
            default: goto L_0x0758;
        };
    L_0x0758:
        switch(r3) {
            case 22: goto L_0x0a5b;
            case 23: goto L_0x0a55;
            case 24: goto L_0x0a4f;
            case 25: goto L_0x0a49;
            case 26: goto L_0x0a43;
            case 27: goto L_0x0a3d;
            case 28: goto L_0x0a37;
            case 29: goto L_0x0a31;
            default: goto L_0x075b;
        };
    L_0x075b:
        switch(r3) {
            case 32: goto L_0x0a2b;
            case 33: goto L_0x0a25;
            case 34: goto L_0x0a1f;
            case 35: goto L_0x0a19;
            case 36: goto L_0x0a13;
            case 37: goto L_0x0a0d;
            case 38: goto L_0x0a07;
            case 39: goto L_0x0a01;
            default: goto L_0x075e;
        };
    L_0x075e:
        switch(r3) {
            case 42: goto L_0x09fb;
            case 43: goto L_0x09f5;
            case 44: goto L_0x09ef;
            case 45: goto L_0x09e9;
            case 46: goto L_0x09e3;
            case 47: goto L_0x09dd;
            case 48: goto L_0x09d7;
            case 49: goto L_0x09d1;
            default: goto L_0x0761;
        };
    L_0x0761:
        switch(r3) {
            case 52: goto L_0x09cb;
            case 53: goto L_0x09c5;
            case 54: goto L_0x09bf;
            case 55: goto L_0x09b9;
            case 56: goto L_0x09b3;
            case 57: goto L_0x09ad;
            case 58: goto L_0x09a7;
            case 59: goto L_0x09a1;
            default: goto L_0x0764;
        };
    L_0x0764:
        switch(r3) {
            case 62: goto L_0x099b;
            case 63: goto L_0x0995;
            case 64: goto L_0x098f;
            case 65: goto L_0x0989;
            case 66: goto L_0x0983;
            case 67: goto L_0x097d;
            case 68: goto L_0x0977;
            case 69: goto L_0x0971;
            default: goto L_0x0767;
        };
    L_0x0767:
        switch(r3) {
            case 72: goto L_0x096b;
            case 73: goto L_0x0965;
            case 74: goto L_0x095f;
            case 75: goto L_0x0959;
            case 76: goto L_0x0953;
            case 77: goto L_0x094d;
            case 78: goto L_0x0947;
            case 79: goto L_0x0941;
            default: goto L_0x076a;
        };
    L_0x076a:
        switch(r3) {
            case 82: goto L_0x093b;
            case 83: goto L_0x0935;
            case 84: goto L_0x092f;
            case 85: goto L_0x0929;
            case 86: goto L_0x0923;
            case 87: goto L_0x091d;
            case 88: goto L_0x0917;
            case 89: goto L_0x0911;
            default: goto L_0x076d;
        };
    L_0x076d:
        switch(r3) {
            case 92: goto L_0x090b;
            case 93: goto L_0x0905;
            case 94: goto L_0x08ff;
            case 95: goto L_0x08f9;
            default: goto L_0x0770;
        };
    L_0x0770:
        switch(r3) {
            case 102: goto L_0x08f3;
            case 103: goto L_0x08ed;
            case 104: goto L_0x08e7;
            case 105: goto L_0x08e1;
            case 106: goto L_0x08db;
            case 107: goto L_0x08d5;
            case 108: goto L_0x08cf;
            case 109: goto L_0x08c9;
            default: goto L_0x0773;
        };
    L_0x0773:
        switch(r3) {
            case 112: goto L_0x08c3;
            case 113: goto L_0x08bd;
            case 114: goto L_0x08b7;
            case 115: goto L_0x08b1;
            case 116: goto L_0x08ab;
            case 117: goto L_0x08a5;
            case 118: goto L_0x089f;
            case 119: goto L_0x0899;
            default: goto L_0x0776;
        };
    L_0x0776:
        switch(r3) {
            case 122: goto L_0x0893;
            case 123: goto L_0x088d;
            case 124: goto L_0x0887;
            case 125: goto L_0x0881;
            case 126: goto L_0x087b;
            case 127: goto L_0x0875;
            case 128: goto L_0x086f;
            case 129: goto L_0x0869;
            default: goto L_0x0779;
        };
    L_0x0779:
        switch(r3) {
            case 132: goto L_0x0863;
            case 133: goto L_0x085d;
            default: goto L_0x077c;
        };
    L_0x077c:
        switch(r3) {
            case 142: goto L_0x0857;
            case 143: goto L_0x0851;
            case 144: goto L_0x084b;
            case 145: goto L_0x0845;
            case 146: goto L_0x083f;
            case 147: goto L_0x0839;
            case 148: goto L_0x0833;
            case 149: goto L_0x082d;
            default: goto L_0x077f;
        };
    L_0x077f:
        switch(r3) {
            case 135: goto L_0x0827;
            case 137: goto L_0x0821;
            case 1111: goto L_0x081b;
            case 1115: goto L_0x0815;
            case 2111: goto L_0x080f;
            case 2115: goto L_0x0809;
            case 3111: goto L_0x0803;
            case 3115: goto L_0x07fd;
            case 4111: goto L_0x07f7;
            case 4115: goto L_0x07f1;
            case 5111: goto L_0x07eb;
            case 5115: goto L_0x07e5;
            case 6111: goto L_0x07df;
            case 6115: goto L_0x07d9;
            case 7111: goto L_0x07d3;
            case 7115: goto L_0x07cd;
            case 8111: goto L_0x07c7;
            case 8115: goto L_0x07c1;
            case 10111: goto L_0x07bb;
            case 10115: goto L_0x07b5;
            case 11111: goto L_0x07af;
            case 12111: goto L_0x07a9;
            case 12115: goto L_0x07a3;
            case 14111: goto L_0x079d;
            case 14115: goto L_0x0797;
            case 111115: goto L_0x0791;
            default: goto L_0x0782;
        };
    L_0x0782:
        r2 = 2131690516; // 0x7f0f0414 float:1.9010078E38 double:1.0531950515E-314;
        r2 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r2);
        r10.f10524P = r2;
        r2 = new mobi.mmdt.ott.view.conversation.f.a.k.a;
        r2.<init>(r10);
        return r2;
    L_0x0791:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.h.d;
        r2.<init>(r10);
        return r2;
    L_0x0797:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.h.a;
        r2.<init>(r10);
        return r2;
    L_0x079d:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.j.a;
        r2.<init>(r10);
        return r2;
    L_0x07a3:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.h.h;
        r2.<init>(r10);
        return r2;
    L_0x07a9:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.j.h;
        r2.<init>(r10);
        return r2;
    L_0x07af:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.j.d;
        r2.<init>(r10);
        return r2;
    L_0x07b5:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.h.e;
        r2.<init>(r10);
        return r2;
    L_0x07bb:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.j.e;
        r2.<init>(r10);
        return r2;
    L_0x07c1:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.h.m;
        r2.<init>(r10);
        return r2;
    L_0x07c7:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.j.m;
        r2.<init>(r10);
        return r2;
    L_0x07cd:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.h.f;
        r2.<init>(r10);
        return r2;
    L_0x07d3:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.j.f;
        r2.<init>(r10);
        return r2;
    L_0x07d9:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.h.k;
        r2.<init>(r10);
        return r2;
    L_0x07df:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.j.k;
        r2.<init>(r10);
        return r2;
    L_0x07e5:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.h.j;
        r2.<init>(r10);
        return r2;
    L_0x07eb:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.j.j;
        r2.<init>(r10);
        return r2;
    L_0x07f1:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.h.c;
        r2.<init>(r10);
        return r2;
    L_0x07f7:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.j.c;
        r2.<init>(r10);
        return r2;
    L_0x07fd:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.h.n;
        r2.<init>(r10);
        return r2;
    L_0x0803:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.j.n;
        r2.<init>(r10);
        return r2;
    L_0x0809:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.h.g;
        r2.<init>(r10);
        return r2;
    L_0x080f:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.j.g;
        r2.<init>(r10);
        return r2;
    L_0x0815:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.h.l;
        r2.<init>(r10);
        return r2;
    L_0x081b:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.j.l;
        r2.<init>(r10);
        return r2;
    L_0x0821:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.h.i;
        r2.<init>(r10);
        return r2;
    L_0x0827:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.j.i;
        r2.<init>(r10);
        return r2;
    L_0x082d:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.f.a;
        r2.<init>(r10);
        return r2;
    L_0x0833:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.e.a;
        r2.<init>(r10);
        return r2;
    L_0x0839:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.b.a;
        r2.<init>(r10);
        return r2;
    L_0x083f:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.a.a;
        r2.<init>(r10);
        return r2;
    L_0x0845:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.d.a;
        r2.<init>(r10);
        return r2;
    L_0x084b:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.c.a;
        r2.<init>(r10);
        return r2;
    L_0x0851:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.g.a;
        r2.<init>(r10);
        return r2;
    L_0x0857:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.i.a;
        r2.<init>(r10);
        return r2;
    L_0x085d:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.g.i;
        r2.<init>(r10);
        return r2;
    L_0x0863:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.i.i;
        r2.<init>(r10);
        return r2;
    L_0x0869:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.f.h;
        r2.<init>(r10);
        return r2;
    L_0x086f:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.e.h;
        r2.<init>(r10);
        return r2;
    L_0x0875:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.b.h;
        r2.<init>(r10);
        return r2;
    L_0x087b:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.a.h;
        r2.<init>(r10);
        return r2;
    L_0x0881:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.d.h;
        r2.<init>(r10);
        return r2;
    L_0x0887:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.c.h;
        r2.<init>(r10);
        return r2;
    L_0x088d:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.g.h;
        r2.<init>(r10);
        return r2;
    L_0x0893:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.i.h;
        r2.<init>(r10);
        return r2;
    L_0x0899:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.f.d;
        r2.<init>(r10);
        return r2;
    L_0x089f:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.e.d;
        r2.<init>(r10);
        return r2;
    L_0x08a5:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.b.d;
        r2.<init>(r10);
        return r2;
    L_0x08ab:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.a.d;
        r2.<init>(r10);
        return r2;
    L_0x08b1:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.d.d;
        r2.<init>(r10);
        return r2;
    L_0x08b7:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.c.d;
        r2.<init>(r10);
        return r2;
    L_0x08bd:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.g.d;
        r2.<init>(r10);
        return r2;
    L_0x08c3:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.i.d;
        r2.<init>(r10);
        return r2;
    L_0x08c9:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.f.e;
        r2.<init>(r10);
        return r2;
    L_0x08cf:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.e.e;
        r2.<init>(r10);
        return r2;
    L_0x08d5:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.b.e;
        r2.<init>(r10);
        return r2;
    L_0x08db:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.a.e;
        r2.<init>(r10);
        return r2;
    L_0x08e1:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.d.e;
        r2.<init>(r10);
        return r2;
    L_0x08e7:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.c.e;
        r2.<init>(r10);
        return r2;
    L_0x08ed:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.g.e;
        r2.<init>(r10);
        return r2;
    L_0x08f3:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.i.e;
        r2.<init>(r10);
        return r2;
    L_0x08f9:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.f.i;
        r2.<init>(r10);
        return r2;
    L_0x08ff:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.e.i;
        r2.<init>(r10);
        return r2;
    L_0x0905:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.d.i;
        r2.<init>(r10);
        return r2;
    L_0x090b:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.c.i;
        r2.<init>(r10);
        return r2;
    L_0x0911:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.f.m;
        r2.<init>(r10);
        return r2;
    L_0x0917:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.e.m;
        r2.<init>(r10);
        return r2;
    L_0x091d:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.b.l;
        r2.<init>(r10);
        return r2;
    L_0x0923:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.a.l;
        r2.<init>(r10);
        return r2;
    L_0x0929:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.d.m;
        r2.<init>(r10);
        return r2;
    L_0x092f:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.c.m;
        r2.<init>(r10);
        return r2;
    L_0x0935:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.g.m;
        r2.<init>(r10);
        return r2;
    L_0x093b:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.i.m;
        r2.<init>(r10);
        return r2;
    L_0x0941:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.f.f;
        r2.<init>(r10);
        return r2;
    L_0x0947:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.e.f;
        r2.<init>(r10);
        return r2;
    L_0x094d:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.b.f;
        r2.<init>(r10);
        return r2;
    L_0x0953:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.a.f;
        r2.<init>(r10);
        return r2;
    L_0x0959:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.d.f;
        r2.<init>(r10);
        return r2;
    L_0x095f:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.c.f;
        r2.<init>(r10);
        return r2;
    L_0x0965:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.g.f;
        r2.<init>(r10);
        return r2;
    L_0x096b:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.i.f;
        r2.<init>(r10);
        return r2;
    L_0x0971:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.f.k;
        r2.<init>(r10);
        return r2;
    L_0x0977:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.e.k;
        r2.<init>(r10);
        return r2;
    L_0x097d:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.b.j;
        r2.<init>(r10);
        return r2;
    L_0x0983:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.a.j;
        r2.<init>(r10);
        return r2;
    L_0x0989:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.d.k;
        r2.<init>(r10);
        return r2;
    L_0x098f:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.c.k;
        r2.<init>(r10);
        return r2;
    L_0x0995:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.g.k;
        r2.<init>(r10);
        return r2;
    L_0x099b:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.i.k;
        r2.<init>(r10);
        return r2;
    L_0x09a1:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.f.j;
        r2.<init>(r10);
        return r2;
    L_0x09a7:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.e.j;
        r2.<init>(r10);
        return r2;
    L_0x09ad:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.b.i;
        r2.<init>(r10);
        return r2;
    L_0x09b3:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.a.i;
        r2.<init>(r10);
        return r2;
    L_0x09b9:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.d.j;
        r2.<init>(r10);
        return r2;
    L_0x09bf:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.c.j;
        r2.<init>(r10);
        return r2;
    L_0x09c5:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.g.j;
        r2.<init>(r10);
        return r2;
    L_0x09cb:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.i.j;
        r2.<init>(r10);
        return r2;
    L_0x09d1:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.f.c;
        r2.<init>(r10);
        return r2;
    L_0x09d7:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.e.c;
        r2.<init>(r10);
        return r2;
    L_0x09dd:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.b.c;
        r2.<init>(r10);
        return r2;
    L_0x09e3:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.a.c;
        r2.<init>(r10);
        return r2;
    L_0x09e9:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.d.c;
        r2.<init>(r10);
        return r2;
    L_0x09ef:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.c.c;
        r2.<init>(r10);
        return r2;
    L_0x09f5:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.g.c;
        r2.<init>(r10);
        return r2;
    L_0x09fb:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.i.c;
        r2.<init>(r10);
        return r2;
    L_0x0a01:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.f.n;
        r2.<init>(r10);
        return r2;
    L_0x0a07:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.e.n;
        r2.<init>(r10);
        return r2;
    L_0x0a0d:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.b.m;
        r2.<init>(r10);
        return r2;
    L_0x0a13:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.a.m;
        r2.<init>(r10);
        return r2;
    L_0x0a19:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.d.n;
        r2.<init>(r10);
        return r2;
    L_0x0a1f:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.c.n;
        r2.<init>(r10);
        return r2;
    L_0x0a25:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.g.n;
        r2.<init>(r10);
        return r2;
    L_0x0a2b:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.i.n;
        r2.<init>(r10);
        return r2;
    L_0x0a31:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.f.g;
        r2.<init>(r10);
        return r2;
    L_0x0a37:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.e.g;
        r2.<init>(r10);
        return r2;
    L_0x0a3d:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.b.g;
        r2.<init>(r10);
        return r2;
    L_0x0a43:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.a.g;
        r2.<init>(r10);
        return r2;
    L_0x0a49:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.d.g;
        r2.<init>(r10);
        return r2;
    L_0x0a4f:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.c.g;
        r2.<init>(r10);
        return r2;
    L_0x0a55:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.g.g;
        r2.<init>(r10);
        return r2;
    L_0x0a5b:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.i.g;
        r2.<init>(r10);
        return r2;
    L_0x0a61:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.f.l;
        r2.<init>(r10);
        return r2;
    L_0x0a67:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.e.l;
        r2.<init>(r10);
        return r2;
    L_0x0a6d:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.b.k;
        r2.<init>(r10);
        return r2;
    L_0x0a73:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.a.k;
        r2.<init>(r10);
        return r2;
    L_0x0a79:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.d.l;
        r2.<init>(r10);
        return r2;
    L_0x0a7f:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.c.l;
        r2.<init>(r10);
        return r2;
    L_0x0a85:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.g.l;
        r2.<init>(r10);
        return r2;
    L_0x0a8b:
        r2 = new mobi.mmdt.ott.view.conversation.f.a.i.l;
        r2.<init>(r10);
        return r2;
    L_0x0a91:
        r2 = new mobi.mmdt.ott.view.conversation.f.b.c;
        r2.<init>(r10);
        return r2;
    L_0x0a97:
        r2 = new mobi.mmdt.ott.view.conversation.f.b.d;
        r2.<init>(r10);
        return r2;
    L_0x0a9d:
        r2 = r10.f10524P;
        r3 = mobi.mmdt.ott.p246d.p248b.C2535a.m6888a();
        r3 = r3.m6919b();
        r4 = mobi.mmdt.ott.provider.p384f.C2972l.MISSED_CALL;
        r4 = r4.ordinal();
        r5 = r82;
        if (r5 != r4) goto L_0x0abb;
    L_0x0ab1:
        r2 = 2131690157; // 0x7f0f02ad float:1.900935E38 double:1.053194874E-314;
        r2 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r2);
    L_0x0ab8:
        r8 = r18;
        goto L_0x0adf;
    L_0x0abb:
        r4 = mobi.mmdt.ott.provider.p384f.C2972l.CALL;
        r4 = r4.ordinal();
        if (r5 != r4) goto L_0x0ab8;
    L_0x0ac3:
        r4 = mobi.mmdt.ott.provider.p384f.C2970j.IN;
        r4 = r4.ordinal();
        r5 = r121;
        if (r5 != r4) goto L_0x0ada;
    L_0x0acd:
        r8 = 2;
        r4 = 2131690047; // 0x7f0f023f float:1.9009127E38 double:1.05319482E-314;
    L_0x0ad1:
        r4 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r4);
        r2 = mobi.mmdt.ott.view.conversation.p427c.C3444a.m7879a(r2, r4, r3);
        goto L_0x0adf;
    L_0x0ada:
        r8 = 3;
        r4 = 2131690224; // 0x7f0f02f0 float:1.9009486E38 double:1.0531949073E-314;
        goto L_0x0ad1;
    L_0x0adf:
        r10.ai = r8;
        r10.f10524P = r2;
        r2 = new mobi.mmdt.ott.view.conversation.f.b.b;
        r2.<init>(r10);
        return r2;
    L_0x0ae9:
        r18 = 1;
        r3 = new java.lang.StringBuilder;
        r4 = "+++++***^^^^  (cursor == null )  in retrieveCurrentViewModel ";
        r3.<init>(r4);
        if (r2 == 0) goto L_0x0afd;
    L_0x0af4:
        r2 = r124.isClosed();
        if (r2 == 0) goto L_0x0afb;
    L_0x0afa:
        goto L_0x0afd;
    L_0x0afb:
        r2 = 0;
        goto L_0x0aff;
    L_0x0afd:
        r2 = r18;
    L_0x0aff:
        r3.append(r2);
        r2 = r3.toString();
        mobi.mmdt.componentsutils.p232b.p235c.C2480b.m6742f(r2);
        r2 = r1.f20709q;
        r2.mo2360g();
        r2 = 0;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.conversation.c.c.a(android.database.Cursor, int):mobi.mmdt.ott.view.components.c.g");
    }

    public final int getItemViewType(int i) {
        boolean z;
        Cursor cursor = (Cursor) m13685c(i);
        if (cursor != null) {
            if (!cursor.isClosed()) {
                return C3444a.m7878a(cursor.getInt(cursor.getColumnIndex("conversations_event_type")), cursor.getInt(cursor.getColumnIndex("conversations_direction_type")), cursor.getInt(cursor.getColumnIndex("conversations_group_type")), cursor.getString(cursor.getColumnIndex("conversations_event")));
            }
        }
        StringBuilder stringBuilder = new StringBuilder("+++++***^^^^ (cursor == null )  in getItemViewType  ");
        if (cursor != null) {
            if (!cursor.isClosed()) {
                z = false;
                stringBuilder.append(z);
                C2480b.m6742f(stringBuilder.toString());
                this.f20709q.mo2360g();
                return super.getItemViewType(i);
            }
        }
        z = true;
        stringBuilder.append(z);
        C2480b.m6742f(stringBuilder.toString());
        this.f20709q.mo2360g();
        return super.getItemViewType(i);
    }

    public final /* synthetic */ ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return mo3449a(viewGroup, i);
    }
}
