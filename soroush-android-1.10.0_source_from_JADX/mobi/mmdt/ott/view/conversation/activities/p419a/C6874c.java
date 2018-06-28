package mobi.mmdt.ott.view.conversation.activities.p419a;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.p029a.C0350e;
import android.support.v7.app.C7406c;
import com.p085c.p086a.C1212c;
import com.p085c.p086a.p105g.C1248f;
import java.util.ArrayList;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.C2808d;
import mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b.C6720i;
import mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b.C6721j;
import mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b.C6725n;
import mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b.C6726o;
import mobi.mmdt.ott.logic.p261a.p308q.p310b.C2731a;
import mobi.mmdt.ott.p240c.C2524c.C2522a;
import mobi.mmdt.ott.provider.p384f.C2966b;
import mobi.mmdt.ott.provider.p384f.C2973m;
import mobi.mmdt.ott.provider.p386h.C2988j;
import mobi.mmdt.ott.view.components.p402d.C7576b;
import mobi.mmdt.ott.view.main.NewBulkMessageContactSelectionListActivity;
import mobi.mmdt.ott.view.tools.C4522p;

public final class C6874c extends C6123a {
    private ArrayList<String> ah;

    class C33471 implements Runnable {
        final /* synthetic */ C6874c f10275a;

        C33471(C6874c c6874c) {
            this.f10275a = c6874c;
        }

        public final void run() {
            this.f10275a.m14012g();
            this.f10275a.m13958a((int) R.anim.anim_slide_in_right, (int) R.anim.anim_slide_out_right);
        }
    }

    class C33482 implements Runnable {
        final /* synthetic */ C6874c f10276a;

        C33482(C6874c c6874c) {
            this.f10276a = c6874c;
        }

        public final void run() {
            this.f10276a.m14012g();
            this.f10276a.m13958a((int) R.anim.anim_slide_in_right, (int) R.anim.anim_slide_out_right);
        }
    }

    class C33493 implements Runnable {
        final /* synthetic */ C6874c f10277a;

        C33493(C6874c c6874c) {
            this.f10277a = c6874c;
        }

        public final void run() {
            this.f10277a.m14012g();
            this.f10277a.m13958a((int) R.anim.anim_slide_in_right, (int) R.anim.anim_slide_out_right);
        }
    }

    public C6874c(C7406c c7406c, Intent intent, String str, C2973m c2973m) {
        super(c7406c, intent, str, c2973m, null);
    }

    public final void mo3190N() {
    }

    public final void mo3191O() {
    }

    public final boolean mo3192P() {
        return true;
    }

    protected final void mo3193Q() {
        Intent intent = new Intent((C7576b) this.f10377a, NewBulkMessageContactSelectionListActivity.class);
        intent.putExtra("KEY_CHECKED_USERNAME_ARRAYLIST", this.ah);
        m13968a(intent, 1440);
        m13958a((int) R.anim.anim_slide_in_left, (int) R.anim.anim_slide_out_left);
    }

    protected final void mo3194R() {
    }

    public final int mo3195S() {
        return 0;
    }

    public final int mo3196T() {
        return 0;
    }

    public final int mo3197U() {
        return 0;
    }

    public final boolean mo3198V() {
        return false;
    }

    public final void mo3199W() {
    }

    public final void mo3200X() {
    }

    public final String mo3201Y() {
        return null;
    }

    public final void mo3202Z() {
    }

    protected final void mo3203a(int i, int i2, int i3, String str, String str2) {
    }

    public final void mo2303a(int i, int i2, Intent intent) {
        super.mo2303a(i, i2, intent);
        if (i == 1440 && i2 == -1) {
            this.ah = new ArrayList(intent.getStringArrayListExtra("KEY_PEER_PARTIES_ARRAYLIST"));
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.ah.size());
            stringBuilder.append(" participants");
            m13990b(stringBuilder.toString());
        }
    }

    public final void mo3204a(int i, boolean z, boolean z2, boolean z3) {
    }

    protected final void mo3206a(String str, String str2, String str3) {
        ArrayList arrayList = this.ah;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(System.currentTimeMillis());
        C2808d.m7147a(new C6720i(arrayList, str, str2, stringBuilder.toString(), C2973m.GROUP, str3));
    }

    protected final void mo3207a(String str, String str2, C2988j c2988j, String str3, C2731a c2731a, boolean z) {
    }

    protected final void mo3208a(String str, String str2, C2988j c2988j, C2731a c2731a, boolean z) {
        ArrayList arrayList = this.ah;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(System.currentTimeMillis());
        C2808d.m7147a(new C6721j(arrayList, str2, str, c2988j, stringBuilder.toString(), C2973m.SINGLE, c2731a, z));
        new Handler().postDelayed(new C33493(this), 1000);
    }

    public final void mo3209a(C2522a c2522a) {
    }

    public final void aa() {
    }

    public final void ab() {
    }

    protected final boolean ac() {
        return false;
    }

    public final C0350e<Cursor> mo3217b(int i) {
        return C2966b.m7401a(this.l, i);
    }

    protected final void mo3218b(int i, int i2, int i3, String str) {
        ArrayList arrayList = this.ah;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(System.currentTimeMillis());
        C2808d.m7147a(new C6725n(arrayList, str, i, i2, i3, stringBuilder.toString(), C2973m.SINGLE, null, null));
        new Handler().postDelayed(new C33482(this), 1000);
    }

    public final void mo2318b(Bundle bundle) {
        C7576b c7576b;
        int i;
        Object[] objArr;
        String str;
        if (!(this.f16471Q == null || this.f16471Q.getExtras() == null || !this.f16471Q.getExtras().containsKey("KEY_PEER_PARTIES_ARRAYLIST"))) {
            this.ah = this.f16471Q.getStringArrayListExtra("KEY_PEER_PARTIES_ARRAYLIST");
        }
        super.mo2318b(bundle);
        m13978a(C4522p.m8236a(R.string.bulk_message), false);
        int size = this.ah.size();
        if (size == 1) {
            c7576b = (C7576b) this.f10377a;
            i = R.string.recipient;
            objArr = new Object[]{String.valueOf(size)};
        } else if (size > 1) {
            c7576b = (C7576b) this.f10377a;
            i = R.string.recipients;
            objArr = new Object[]{String.valueOf(size)};
        } else {
            str = null;
            m13990b(str);
            this.i.setBackgroundColor(C2491i.m6806b((C7576b) this.f10377a, null));
            C1212c.m2872a((C7576b) this.f10377a).m10950a(Integer.valueOf(R.drawable.ic_place_holder_group)).m3034a(C1248f.m2945b()).m3033a().m3031a(this.i);
        }
        str = c7576b.getString(i, objArr);
        m13990b(str);
        this.i.setBackgroundColor(C2491i.m6806b((C7576b) this.f10377a, null));
        C1212c.m2872a((C7576b) this.f10377a).m10950a(Integer.valueOf(R.drawable.ic_place_holder_group)).m3034a(C1248f.m2945b()).m3033a().m3031a(this.i);
    }

    public final void mo3219b(String str, String str2, String[] strArr, String str3) {
    }

    protected final void mo3220f(String str) {
        ArrayList arrayList = this.ah;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(System.currentTimeMillis());
        C2808d.m7147a(new C6726o(arrayList, str, stringBuilder.toString(), C2973m.SINGLE, null, null));
        new Handler().postDelayed(new C33471(this), 1000);
    }

    public final void mo3221g(String str) {
    }

    public final void mo3222h(String str) {
    }

    protected final void mo3223h(String str, String str2) {
    }

    public final void mo3224i(String str) {
    }

    protected final void mo3225i(String str, String str2) {
    }

    public final void mo3226j(String str) {
    }

    public final void mo3227k(String str) {
    }
}
