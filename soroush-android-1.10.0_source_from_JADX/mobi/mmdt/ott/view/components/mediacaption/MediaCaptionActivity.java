package mobi.mmdt.ott.view.components.mediacaption;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.C0390k;
import android.support.v4.app.C4785o;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.C0523f;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import mobi.mmdt.componentsutils.p232b.C2488f;
import mobi.mmdt.componentsutils.p232b.C2489g;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.componentsutils.p232b.p234b.C2475a;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.C2791c;
import mobi.mmdt.ott.logic.p261a.p308q.p310b.C2731a;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.view.components.mediacaption.p409a.C7179a;
import mobi.mmdt.ott.view.components.mediacaption.p409a.C7326b;
import mobi.mmdt.ott.view.components.mediacaption.p409a.C7327c;
import mobi.mmdt.ott.view.components.mediacaption.p409a.C7328d;
import mobi.mmdt.ott.view.components.mediacaption.p409a.C7328d.C3201a;
import mobi.mmdt.ott.view.components.mediacaption.p410b.C6101a;
import mobi.mmdt.ott.view.components.mediacaption.p410b.C6101a.C6852a;
import mobi.mmdt.ott.view.components.mediacaption.p410b.p566b.C7330d;
import mobi.mmdt.ott.view.components.mediacaption.p412c.C3209a;
import mobi.mmdt.ott.view.components.mediacaption.p412c.C6102b;
import mobi.mmdt.ott.view.components.mediacaption.p412c.C6103c;
import mobi.mmdt.ott.view.components.mediacaption.p412c.C6104d;
import mobi.mmdt.ott.view.components.mediaselector.MainMediaSelectorActivity;
import mobi.mmdt.ott.view.components.p402d.C7576b;
import mobi.mmdt.ott.view.components.squarecrop.SquareCropActivityCopy;
import mobi.mmdt.ott.view.tools.C4522p;

public class MediaCaptionActivity extends C7576b implements C3201a, C6852a {
    private LinkedHashMap<String, C7179a> f23993A = new LinkedHashMap();
    private int f23994B = 1;
    private int f23995C = 215;
    private boolean f23996D = false;
    private String f23997E;
    private MenuItem f23998F;
    private boolean f23999G = false;
    private C0523f f24000H = new C60982(this);
    public String f24001m;
    protected String f24002n;
    private C6101a f24003o;
    private String f24004p;
    private C6850a f24005q;
    private ViewPager f24006r;
    private FrameLayout f24007s;
    private LinkedHashMap<String, C3209a> f24008t = new LinkedHashMap();
    private boolean f24009u = true;
    private int f24010v = -1;
    private Bundle f24011w;
    private int f24012z;

    class C31891 implements Runnable {
        final /* synthetic */ MediaCaptionActivity f9921a;

        C31891(MediaCaptionActivity mediaCaptionActivity) {
            this.f9921a = mediaCaptionActivity;
        }

        public final void run() {
            this.f9921a.m21110j();
        }
    }

    class C60982 implements C0523f {
        final /* synthetic */ MediaCaptionActivity f16362a;

        class C31901 implements Runnable {
            final /* synthetic */ C60982 f9922a;

            C31901(C60982 c60982) {
                this.f9922a = c60982;
            }

            public final void run() {
                this.f9922a.f16362a.f24003o.m13809a();
            }
        }

        C60982(MediaCaptionActivity mediaCaptionActivity) {
            this.f16362a = mediaCaptionActivity;
        }

        public final void mo173a(int i) {
        }

        public final void mo174a(int i, float f, int i2) {
        }

        public final void mo175b(int i) {
            this.f16362a.f24001m = ((C3209a) new ArrayList(this.f16362a.f24008t.values()).get(i)).f9939a;
            new Handler().postDelayed(new C31901(this), 400);
        }
    }

    public class C6850a extends C4785o {
        final /* synthetic */ MediaCaptionActivity f19538a;
        private ArrayList<C3209a> f19539b = new ArrayList();

        public C6850a(MediaCaptionActivity mediaCaptionActivity, C0390k c0390k, ArrayList<C3209a> arrayList) {
            this.f19538a = mediaCaptionActivity;
            super(c0390k);
            this.f19539b = arrayList;
        }

        public final Fragment mo3186a(int i) {
            boolean booleanValue;
            Fragment fragment;
            C3209a c3209a = (C3209a) this.f19539b.get(i);
            String str = "";
            if (this.f19538a.m21113m().containsKey(c3209a.f9939a)) {
                str = (String) this.f19538a.m21113m().get(c3209a.f9939a);
                if (c3209a.f9940b == 1) {
                    booleanValue = ((Boolean) this.f19538a.m21114n().get(c3209a.f9939a)).booleanValue();
                    fragment = null;
                    switch (c3209a.f9940b) {
                        case 1:
                            fragment = C7327c.m19600a(i + 1, c3209a.f9939a, str, booleanValue);
                            break;
                        case 2:
                            fragment = C7328d.m19611a(i + 1, c3209a.f9939a, str, this.f19538a.f24011w);
                            break;
                        case 3:
                            fragment = C7326b.m19592a(i + 1, c3209a.f9939a, str);
                            break;
                        default:
                            break;
                    }
                    this.f19538a.f23993A.put(c3209a.f9939a, fragment);
                    return fragment;
                }
            }
            booleanValue = true;
            fragment = null;
            switch (c3209a.f9940b) {
                case 1:
                    fragment = C7327c.m19600a(i + 1, c3209a.f9939a, str, booleanValue);
                    break;
                case 2:
                    fragment = C7328d.m19611a(i + 1, c3209a.f9939a, str, this.f19538a.f24011w);
                    break;
                case 3:
                    fragment = C7326b.m19592a(i + 1, c3209a.f9939a, str);
                    break;
                default:
                    break;
            }
            this.f19538a.f23993A.put(c3209a.f9939a, fragment);
            return fragment;
        }

        public final void m17296a(String str) {
            int i = -1;
            for (int i2 = 0; i2 < this.f19539b.size(); i2++) {
                if (((C3209a) this.f19539b.get(i2)).f9939a.equals(str)) {
                    i = i2;
                }
            }
            if (i != -1) {
                this.f19539b.remove(i);
                m1270d();
            }
            this.f19538a.m21113m().remove(str);
            this.f19538a.m21114n().remove(str);
            this.f19538a.f23993A.remove(str);
            for (Entry entry : this.f19538a.f23993A.entrySet()) {
                ((C7179a) entry.getValue()).mo3574a((String) this.f19538a.m21113m().get(entry.getKey()));
                if (this.f19538a.f23994B == 1 && this.f19538a.m21114n().containsKey(entry.getKey())) {
                    ((C7179a) entry.getValue()).mo3575a(((Boolean) this.f19538a.m21114n().get(entry.getKey())).booleanValue());
                }
            }
        }

        public final int mo2270b() {
            return this.f19539b.size();
        }

        public final CharSequence mo2364b(int i) {
            return "";
        }

        public final int mo2272c() {
            return -2;
        }
    }

    private void m21096a(int i, boolean z) {
        this.f24006r.m1157b(this.f24000H);
        this.f24006r.m1154a(i, z);
        this.f24006r.m1155a(this.f24000H);
    }

    private void m21097a(ArrayList<C3209a> arrayList) {
        this.f24005q = new C6850a(this, m19188c(), arrayList);
        this.f24006r = (ViewPager) findViewById(R.id.pager);
        if (this.f24006r != null) {
            this.f24006r.setAdapter(this.f24005q);
            this.f24006r.m1155a(this.f24000H);
        }
    }

    private void m21098a(ArrayList<String> arrayList, ArrayList<String> arrayList2, ArrayList<Boolean> arrayList3) {
        MediaCaptionActivity mediaCaptionActivity = this;
        ArrayList<String> arrayList4 = arrayList;
        ArrayList<Boolean> arrayList5 = arrayList3;
        m21113m().clear();
        m21114n().clear();
        Intent intent = new Intent();
        intent.putExtra("KEY_RESULT_ARRAYLIST_OF_PATH", arrayList4);
        intent.putExtra("KEY_RESULT_ARRAYLIST_OF_CAPTION", arrayList2);
        if (arrayList5 != null && mediaCaptionActivity.f23994B == 1) {
            boolean[] zArr = new boolean[arrayList3.size()];
            for (int i = 0; i < zArr.length; i++) {
                zArr[i] = ((Boolean) arrayList5.get(i)).booleanValue();
            }
            intent.putExtra("KEY_RESULT_ARRAYLIST_OF_IS_COMPRESS", zArr);
        }
        intent.putExtra("KEY_RESULT_TYPE", mediaCaptionActivity.f23994B);
        if (mediaCaptionActivity.f23994B == 2) {
            Serializable serializable;
            String str;
            C7328d c7328d = (C7328d) mediaCaptionActivity.f23993A.get(arrayList4.get(0));
            String str2 = "KEY_COMPRESS_VIDEO_INFO";
            if (c7328d.af == 0.0f) {
                serializable = null;
                str = str2;
            } else if (c7328d.f21116a.isChecked()) {
                long j = c7328d.ag;
                long j2 = c7328d.ah;
                float f = c7328d.af;
                int i2 = c7328d.f21119d;
                int i3 = c7328d.f21120e;
                int i4 = c7328d.f21121f;
                int i5 = c7328d.f21122g;
                int i6 = c7328d.f21123h;
                int i7 = c7328d.f21124i;
                int i8 = i7;
                str = str2;
                serializable = new C2731a(true, j, j2, f, i2, i3, i4, i5, i6, i8, c7328d.ai, c7328d.aj);
            } else {
                String str3 = str2;
                serializable = new C2731a(false, c7328d.ag, c7328d.ah, c7328d.af, c7328d.f21119d, c7328d.f21120e, c7328d.f21121f, c7328d.f21120e, c7328d.f21121f, c7328d.ae, c7328d.ai, c7328d.aj);
                str = str3;
            }
            intent.putExtra(str, serializable);
        }
        setResult(-1, intent);
        finish();
        overridePendingTransition(R.anim.anim_slide_in_right, R.anim.anim_slide_out_right);
    }

    private void m21101b(ArrayList<String> arrayList) {
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("KEY_RESULT_ARRAYLIST_OF_PATH", arrayList);
        bundle.putString("KEY_SELECTED_PHOTO_PATH", null);
        this.f24003o = new C6101a();
        this.f24003o.setArguments(bundle);
        FragmentTransaction beginTransaction = getFragmentManager().beginTransaction();
        beginTransaction.replace(R.id.container_frame_grid_items, this.f24003o);
        beginTransaction.setTransition(4099);
        beginTransaction.commit();
        m21110j();
    }

    private void m21102b(boolean z) {
        int i = z ? 3 : 1;
        int i2 = this.f24010v;
        Intent intent = new Intent(this, MainMediaSelectorActivity.class);
        intent.putExtra("EXTRA_MAX_PHOTO_SELECT_COUNT", i2);
        intent.putExtra("EXTRA_SELECT_MODE", i);
        intent.putExtra("EXTRA_SELECTOR_TITLE", this.f24004p);
        startActivityForResult(intent, 215);
        overridePendingTransition(R.anim.anim_slide_in_left, R.anim.anim_slide_out_left);
    }

    private int m21109i() {
        int i = 0;
        if (this.f24001m != null) {
            for (Entry value : this.f24008t.entrySet()) {
                if (((C3209a) value.getValue()).f9939a.equals(this.f24001m)) {
                    return i;
                }
                i++;
            }
        } else if (this.f24008t.size() > 0) {
            this.f24001m = ((C3209a) new ArrayList(this.f24008t.values()).get(0)).f9939a;
            return 0;
        }
        return -1;
    }

    private void m21110j() {
        int size = this.f24008t.size();
        LayoutParams layoutParams = this.f24007s.getLayoutParams();
        if (getResources().getConfiguration().orientation == 1) {
            int a = C2489g.m6754a().m6755a(0.2f);
            if (size <= 4) {
                layoutParams.height = a + (((int) C2491i.m6804b(getApplicationContext(), 2.0f)) * 2);
                this.f24007s.setLayoutParams(layoutParams);
                return;
            }
            layoutParams.height = (a * 2) + (((int) C2491i.m6804b(getApplicationContext(), 2.0f)) * 3);
            this.f24007s.setLayoutParams(layoutParams);
            return;
        }
        layoutParams.height = C2489g.m6754a().m6755a(0.1f) + (((int) C2491i.m6804b(getApplicationContext(), 2.0f)) * 2);
    }

    private void m21111k() {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        this.f24002n = C2791c.m7109a().m7117c();
        intent.putExtra("output", Uri.fromFile(new File(this.f24002n)));
        intent.putExtra("android.intent.extra.sizeLimit", 10485760);
        startActivityForResult(intent, 172);
        overridePendingTransition(R.anim.anim_slide_in_left, R.anim.anim_slide_out_left);
    }

    private void m21112l() {
        Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
        intent.putExtra("android.intent.extra.videoQuality", 0);
        startActivityForResult(intent, 173);
        overridePendingTransition(R.anim.anim_slide_in_left, R.anim.anim_slide_out_left);
    }

    private LinkedHashMap<String, String> m21113m() {
        return ((MyApplication) getApplication()).f15915u;
    }

    private LinkedHashMap<String, Boolean> m21114n() {
        return ((MyApplication) getApplication()).f15916v;
    }

    public final void mo3653a(C7330d c7330d) {
        int i = m21109i();
        int size = this.f24008t.size();
        int i2 = 0;
        while (i2 < this.f24008t.size()) {
            if (((C3209a) new ArrayList(this.f24008t.values()).get(i2)).f9939a.equals(c7330d.f21125a)) {
                break;
            }
            i2++;
        }
        i2 = -1;
        if (size == 1 || size <= 1) {
            i = -1;
        } else if (i == i2) {
            i = i2 < size - 1 ? i2 : i2 - 1;
        } else if (i >= i2) {
            i--;
        }
        for (Entry entry : this.f23993A.entrySet()) {
            if (m21113m().containsKey(entry.getKey())) {
                m21113m().remove(entry.getKey());
                if (this.f23994B == 1) {
                    m21114n().remove(entry.getKey());
                }
            }
            m21113m().put(entry.getKey(), ((C7179a) entry.getValue()).mo2533e());
            if (this.f23994B == 1) {
                m21114n().put(entry.getKey(), Boolean.valueOf(((C7179a) entry.getValue()).mo3573O()));
            }
        }
        this.f24008t.remove(c7330d.f21125a);
        this.f24005q.m17296a(c7330d.f21125a);
        if (i >= 0) {
            this.f24001m = ((C3209a) new ArrayList(this.f24008t.values()).get(i)).f9939a;
            m21096a(i, false);
            this.f24003o.m13813c(c7330d);
            new Handler().postDelayed(new C31891(this), 750);
        } else {
            this.f24001m = null;
            this.f24003o.m13813c(c7330d);
        }
        if (this.f24008t.size() == 0) {
            onBackPressed();
        }
    }

    public final void mo3654b(C7330d c7330d) {
        this.f24001m = c7330d.f21125a;
        m21096a(m21109i(), true);
        this.f24003o.m13809a();
    }

    public final void mo3643g() {
        for (int i = 0; i < this.f24008t.size(); i++) {
            ((MyApplication) getApplication()).f15913s.put(((C3209a) new ArrayList(this.f24008t.values()).get(i)).f9939a, Boolean.valueOf(true));
        }
        m21102b(true);
    }

    public final void mo3655h() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Entry entry : this.f24008t.entrySet()) {
            arrayList2.add(((C3209a) entry.getValue()).f9939a);
            arrayList.add(this.f23993A.containsKey(entry.getKey()) ? ((C7179a) this.f23993A.get(entry.getKey())).mo2533e() : "");
        }
        m21098a(arrayList2, arrayList, null);
        finish();
        overridePendingTransition(R.anim.anim_slide_in_right, R.anim.anim_slide_out_right);
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 != 0) {
            int i3 = 0;
            ArrayList arrayList;
            if (i == 172) {
                if (i2 == -1) {
                    if (this.f23998F != null) {
                        this.f23998F.setVisible(true);
                    }
                    this.f23999G = true;
                    this.f24009u = false;
                    if (this.f24002n != null) {
                        this.f23994B = 1;
                        C6103c c6103c = new C6103c(this.f24002n);
                        if (!this.f24008t.containsKey(this.f24002n)) {
                            this.f24008t.put(this.f24002n, c6103c);
                        }
                        arrayList = new ArrayList();
                        arrayList.add(c6103c);
                        m21097a(arrayList);
                    }
                }
            } else if (i == 173) {
                if (i2 == -1) {
                    if (this.f23998F != null) {
                        this.f23998F.setVisible(false);
                    }
                    this.f23999G = false;
                    this.f24009u = false;
                    Uri data = intent.getData();
                    if (data != null) {
                        this.f23994B = 2;
                        this.f24002n = C2488f.m6752a(getApplicationContext(), data);
                        C6104d c6104d = new C6104d(this.f24002n);
                        if (!this.f24008t.containsKey(this.f24002n)) {
                            this.f24008t.put(this.f24002n, c6104d);
                        }
                        arrayList = new ArrayList();
                        arrayList.add(c6104d);
                        m21097a(arrayList);
                        return;
                    }
                    C2480b.m6734a("video uri must not be null.", new IOException());
                }
            } else if (i == 215) {
                if (i2 == -1) {
                    if (intent.hasExtra("KEY_RESULT_ARRAYLIST_OF_PATH")) {
                        this.f24009u = false;
                        this.f23994B = intent.getIntExtra("KEY_RESULT_TYPE", 1);
                        r7 = intent.getStringArrayListExtra("KEY_RESULT_ARRAYLIST_OF_PATH");
                        if (r7.size() == 0) {
                            onBackPressed();
                        } else if (this.f23994B == 1) {
                            if (this.f23998F != null) {
                                this.f23998F.setVisible(true);
                            }
                            this.f23999G = true;
                            arrayList = new ArrayList();
                            this.f24008t.clear();
                            Iterator it = r7.iterator();
                            while (it.hasNext()) {
                                r0 = (String) it.next();
                                r1 = new C6103c(r0);
                                if (!this.f24008t.containsKey(r0)) {
                                    this.f24008t.put(r0, r1);
                                }
                                arrayList.add(r1);
                            }
                            m21101b(r7);
                            m21097a(arrayList);
                            i = m21109i();
                            if (i != -1) {
                                m21096a(i, false);
                            }
                        } else if (this.f23994B == 3) {
                            if (this.f23998F != null) {
                                this.f23998F.setVisible(false);
                            }
                            this.f23999G = false;
                            arrayList = new ArrayList();
                            this.f24008t.clear();
                            r7 = r7.iterator();
                            while (r7.hasNext()) {
                                r9 = (String) r7.next();
                                if (!this.f24008t.containsKey(r9)) {
                                    C6102b c6102b = new C6102b(r9);
                                    arrayList.add(c6102b);
                                    this.f24008t.put(r9, c6102b);
                                }
                            }
                            m21097a(arrayList);
                        } else {
                            if (this.f23994B == 2) {
                                if (this.f23998F != null) {
                                    this.f23998F.setVisible(false);
                                }
                                this.f23999G = false;
                                arrayList = new ArrayList();
                                this.f24008t.clear();
                                r7 = r7.iterator();
                                while (r7.hasNext()) {
                                    r9 = (String) r7.next();
                                    if (!this.f24008t.containsKey(r9)) {
                                        C6104d c6104d2 = new C6104d(r9);
                                        arrayList.add(c6104d2);
                                        this.f24008t.put(r9, c6104d2);
                                    }
                                }
                                m21097a(arrayList);
                            }
                        }
                    }
                } else if (this.f24008t.size() == 0) {
                    onBackPressed();
                }
            } else if (i == 1002 && i2 == -1) {
                if (this.f23998F != null) {
                    this.f23998F.setVisible(true);
                }
                this.f23999G = true;
                r7 = new ArrayList();
                arrayList = new ArrayList();
                r0 = ((C3209a) new ArrayList(this.f24008t.values()).get(this.f24006r.getCurrentItem())).f9939a;
                r9 = intent.getStringExtra("KEY_SQUARE_IMAGE_FILE_PATH");
                r1 = new C6103c(r9);
                while (i3 < this.f24008t.size()) {
                    String str = ((C3209a) new ArrayList(this.f24008t.values()).get(i3)).f9939a;
                    if (str.equals(r0)) {
                        this.f24008t.put((String) new ArrayList(this.f24008t.keySet()).get(this.f24006r.getCurrentItem()), r1);
                        r7.add(r1);
                        arrayList.add(r9);
                    } else {
                        r7.add(new C6103c(str));
                        arrayList.add(str);
                    }
                    i3++;
                }
                m21101b(arrayList);
                m21097a(r7);
            }
        } else if (i != 1002 && this.f24008t.size() == 0) {
            onBackPressed();
        }
    }

    public void onBackPressed() {
        super.onBackPressed();
        m21113m().clear();
        m21114n().clear();
        setResult(0);
        overridePendingTransition(R.anim.anim_slide_in_right, R.anim.anim_slide_out_right);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onCreate(android.os.Bundle r6) {
        /*
        r5 = this;
        super.onCreate(r6);
        r0 = 2131427398; // 0x7f0b0046 float:1.8476411E38 double:1.053065054E-314;
        r5.setContentView(r0);
        r0 = 2131297351; // 0x7f090447 float:1.8212644E38 double:1.053000802E-314;
        r0 = r5.findViewById(r0);
        r0 = (android.support.v7.widget.Toolbar) r0;
        r5.x = r0;
        r0 = 2131296630; // 0x7f090176 float:1.8211182E38 double:1.053000446E-314;
        r0 = r5.findViewById(r0);
        r0 = (android.widget.FrameLayout) r0;
        r5.f24007s = r0;
        r0 = r5.getIntent();
        if (r0 == 0) goto L_0x0077;
    L_0x0025:
        r0 = r5.getIntent();
        r0 = r0.getExtras();
        if (r0 == 0) goto L_0x0077;
    L_0x002f:
        r0 = r5.getIntent();
        r0 = r0.getExtras();
        r1 = "EXTRA_SELECTOR_TITLE";
        r1 = r0.containsKey(r1);
        if (r1 == 0) goto L_0x0047;
    L_0x003f:
        r1 = "EXTRA_SELECTOR_TITLE";
        r1 = r0.getString(r1);
        r5.f24004p = r1;
    L_0x0047:
        r1 = "KEY_REQUEST_CODE";
        r1 = r0.containsKey(r1);
        if (r1 == 0) goto L_0x0057;
    L_0x004f:
        r1 = "KEY_REQUEST_CODE";
        r1 = r0.getInt(r1);
        r5.f23995C = r1;
    L_0x0057:
        r1 = "KEY_IS_SHARE_VIDEO";
        r1 = r0.containsKey(r1);
        if (r1 == 0) goto L_0x0077;
    L_0x005f:
        r1 = "KEY_IS_SHARE_VIDEO";
        r1 = r0.getBoolean(r1);
        r5.f23996D = r1;
        r1 = "KEY_PATH_SHARE_VIDEO";
        r1 = r0.containsKey(r1);
        if (r1 == 0) goto L_0x0077;
    L_0x006f:
        r1 = "KEY_PATH_SHARE_VIDEO";
        r0 = r0.getString(r1);
        r5.f23997E = r0;
    L_0x0077:
        r0 = 0;
        if (r6 == 0) goto L_0x0185;
    L_0x007a:
        r1 = "KEY_REQUEST_CODE";
        r1 = r6.containsKey(r1);
        if (r1 == 0) goto L_0x008a;
    L_0x0082:
        r1 = "KEY_REQUEST_CODE";
        r1 = r6.getInt(r1);
        r5.f23995C = r1;
    L_0x008a:
        r1 = "KEY_IS_FIRST_START";
        r1 = r6.containsKey(r1);
        if (r1 == 0) goto L_0x009a;
    L_0x0092:
        r1 = "KEY_IS_FIRST_START";
        r1 = r6.getBoolean(r1);
        r5.f24009u = r1;
    L_0x009a:
        r1 = "KEY_RESULT_TYPE";
        r1 = r6.containsKey(r1);
        if (r1 == 0) goto L_0x00aa;
    L_0x00a2:
        r1 = "KEY_RESULT_TYPE";
        r1 = r6.getInt(r1);
        r5.f23994B = r1;
    L_0x00aa:
        r1 = "KEY_SELECTED_PATH";
        r1 = r6.containsKey(r1);
        if (r1 == 0) goto L_0x00ba;
    L_0x00b2:
        r1 = "KEY_SELECTED_PATH";
        r1 = r6.getString(r1);
        r5.f24001m = r1;
    L_0x00ba:
        r1 = "KEY_LAST_CAMERA_TAKEN_ADDRESS";
        r1 = r6.containsKey(r1);
        if (r1 == 0) goto L_0x00ca;
    L_0x00c2:
        r1 = "KEY_LAST_CAMERA_TAKEN_ADDRESS";
        r1 = r6.getString(r1);
        r5.f24002n = r1;
    L_0x00ca:
        r1 = "KEY_SAVE_STATE_BUNDLE";
        r1 = r6.containsKey(r1);
        if (r1 == 0) goto L_0x00da;
    L_0x00d2:
        r1 = "KEY_SAVE_STATE_BUNDLE";
        r1 = r6.getBundle(r1);
        r5.f24011w = r1;
    L_0x00da:
        r1 = "KEY_VIDEO_SIZE";
        r1 = r6.containsKey(r1);
        if (r1 == 0) goto L_0x00ea;
    L_0x00e2:
        r1 = "KEY_VIDEO_SIZE";
        r1 = r6.getInt(r1);
        r5.f24012z = r1;
    L_0x00ea:
        r1 = "KEY_IS_SHARE_MEDIA";
        r1 = r6.containsKey(r1);
        if (r1 == 0) goto L_0x00fa;
    L_0x00f2:
        r1 = "KEY_IS_SHARE_MEDIA";
        r1 = r6.getBoolean(r1);
        r5.f23996D = r1;
    L_0x00fa:
        r1 = "KEY_PATH_SHARE_VIDEO";
        r1 = r6.containsKey(r1);
        if (r1 == 0) goto L_0x010a;
    L_0x0102:
        r1 = "KEY_PATH_SHARE_VIDEO";
        r1 = r6.getString(r1);
        r5.f23997E = r1;
    L_0x010a:
        r1 = "KEY_IS_VISIBLE_MENU_ITEM_CROP";
        r1 = r6.containsKey(r1);
        if (r1 == 0) goto L_0x011a;
    L_0x0112:
        r1 = "KEY_IS_VISIBLE_MENU_ITEM_CROP";
        r1 = r6.getBoolean(r1);
        r5.f23999G = r1;
    L_0x011a:
        r1 = "KEY_CAPTIONED_MEDIA_DATA_HOLDERS_LIST_PATH";
        r1 = r6.containsKey(r1);
        if (r1 == 0) goto L_0x0185;
    L_0x0122:
        r1 = "KEY_CAPTIONED_MEDIA_DATA_HOLDERS_LIST_PATH";
        r6 = r6.getStringArrayList(r1);
        if (r6 == 0) goto L_0x0185;
    L_0x012a:
        r1 = r0;
    L_0x012b:
        r2 = r6.size();
        if (r1 >= r2) goto L_0x0185;
    L_0x0131:
        r2 = 0;
        r3 = r6.get(r1);
        r3 = (java.lang.String) r3;
        r3 = mobi.mmdt.componentsutils.C2468a.m6708e(r3);
        if (r3 == 0) goto L_0x014a;
    L_0x013e:
        r2 = new mobi.mmdt.ott.view.components.mediacaption.c.b;
        r3 = r6.get(r1);
        r3 = (java.lang.String) r3;
        r2.<init>(r3);
        goto L_0x0179;
    L_0x014a:
        r3 = r6.get(r1);
        r3 = (java.lang.String) r3;
        r3 = mobi.mmdt.componentsutils.C2468a.m6704a(r3);
        if (r3 == 0) goto L_0x0162;
    L_0x0156:
        r2 = new mobi.mmdt.ott.view.components.mediacaption.c.c;
        r3 = r6.get(r1);
        r3 = (java.lang.String) r3;
        r2.<init>(r3);
        goto L_0x0179;
    L_0x0162:
        r3 = r6.get(r1);
        r3 = (java.lang.String) r3;
        r3 = mobi.mmdt.componentsutils.C2468a.m6705b(r3);
        if (r3 == 0) goto L_0x0179;
    L_0x016e:
        r2 = new mobi.mmdt.ott.view.components.mediacaption.c.d;
        r3 = r6.get(r1);
        r3 = (java.lang.String) r3;
        r2.<init>(r3);
    L_0x0179:
        r3 = r5.f24008t;
        r4 = r6.get(r1);
        r3.put(r4, r2);
        r1 = r1 + 1;
        goto L_0x012b;
    L_0x0185:
        r6 = r5.f23996D;
        if (r6 == 0) goto L_0x01e2;
    L_0x0189:
        r6 = new java.util.ArrayList;
        r6.<init>();
        r1 = r5.f23997E;
        if (r1 == 0) goto L_0x01b2;
    L_0x0192:
        r1 = r5.f23997E;
        r1 = mobi.mmdt.componentsutils.C2468a.m6708e(r1);
        if (r1 == 0) goto L_0x01b2;
    L_0x019a:
        r1 = 3;
        r5.f23994B = r1;
        r1 = new mobi.mmdt.ott.view.components.mediacaption.c.b;
        r2 = r5.f23997E;
        r1.<init>(r2);
        r6.add(r1);
        r2 = r5.f24008t;
        r3 = r5.f23997E;
        r2 = r2.containsKey(r3);
        if (r2 != 0) goto L_0x01dc;
    L_0x01b1:
        goto L_0x01d5;
    L_0x01b2:
        r1 = r5.f23997E;
        if (r1 == 0) goto L_0x01dc;
    L_0x01b6:
        r1 = r5.f23997E;
        r1 = mobi.mmdt.componentsutils.C2468a.m6705b(r1);
        if (r1 == 0) goto L_0x01dc;
    L_0x01be:
        r1 = 2;
        r5.f23994B = r1;
        r1 = new mobi.mmdt.ott.view.components.mediacaption.c.d;
        r2 = r5.f23997E;
        r1.<init>(r2);
        r6.add(r1);
        r2 = r5.f24008t;
        r3 = r5.f23997E;
        r2 = r2.containsKey(r3);
        if (r2 != 0) goto L_0x01dc;
    L_0x01d5:
        r2 = r5.f24008t;
        r3 = r5.f23997E;
        r2.put(r3, r1);
    L_0x01dc:
        r5.m21097a(r6);
        r5.f24009u = r0;
        return;
    L_0x01e2:
        r6 = r5.f24009u;
        r1 = 215; // 0xd7 float:3.01E-43 double:1.06E-321;
        if (r6 == 0) goto L_0x022a;
    L_0x01e8:
        r5.f24009u = r0;
        r6 = r5.f23995C;
        if (r6 == r1) goto L_0x0226;
    L_0x01ee:
        switch(r6) {
            case 172: goto L_0x020c;
            case 173: goto L_0x01f2;
            default: goto L_0x01f1;
        };
    L_0x01f1:
        return;
    L_0x01f2:
        r6 = mobi.mmdt.ott.view.tools.C4516l.m8232a();
        if (r6 == 0) goto L_0x0208;
    L_0x01f8:
        r6 = "android.permission.CAMERA";
        r6 = mobi.mmdt.ott.logic.p359k.C2837a.m7170a(r6);
        if (r6 != 0) goto L_0x0208;
    L_0x0200:
        r6 = "android.permission.CAMERA";
        r0 = 175; // 0xaf float:2.45E-43 double:8.65E-322;
        mobi.mmdt.ott.logic.p359k.C2837a.m7167a(r5, r6, r0);
        return;
    L_0x0208:
        r5.m21112l();
        return;
    L_0x020c:
        r6 = mobi.mmdt.ott.view.tools.C4516l.m8232a();
        if (r6 == 0) goto L_0x0222;
    L_0x0212:
        r6 = "android.permission.CAMERA";
        r6 = mobi.mmdt.ott.logic.p359k.C2837a.m7170a(r6);
        if (r6 != 0) goto L_0x0222;
    L_0x021a:
        r6 = "android.permission.CAMERA";
        r0 = 174; // 0xae float:2.44E-43 double:8.6E-322;
        mobi.mmdt.ott.logic.p359k.C2837a.m7167a(r5, r6, r0);
        return;
    L_0x0222:
        r5.m21111k();
        return;
    L_0x0226:
        r5.m21102b(r0);
        return;
    L_0x022a:
        r6 = new java.util.ArrayList;
        r6.<init>();
        r2 = r5.f24008t;
        r2 = r2.entrySet();
        r2 = r2.iterator();
    L_0x0239:
        r3 = r2.hasNext();
        if (r3 == 0) goto L_0x024d;
    L_0x023f:
        r3 = r2.next();
        r3 = (java.util.Map.Entry) r3;
        r3 = r3.getValue();
        r6.add(r3);
        goto L_0x0239;
    L_0x024d:
        r5.m21097a(r6);
        r6 = r5.f23995C;
        if (r6 != r1) goto L_0x0271;
    L_0x0254:
        r6 = r5.f23994B;
        r1 = 1;
        if (r6 != r1) goto L_0x0271;
    L_0x0259:
        r6 = new java.util.ArrayList;
        r6.<init>();
        r1 = r5.f24008t;
        r1 = r1.keySet();
        r6.addAll(r1);
        r5.m21101b(r6);
        r6 = r5.m21109i();
        r5.m21096a(r6, r0);
    L_0x0271:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.components.mediacaption.MediaCaptionActivity.onCreate(android.os.Bundle):void");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_done_and_crop_bar, menu);
        MenuItem findItem = menu.findItem(R.id.action_done);
        this.f23998F = menu.findItem(R.id.action_crop);
        findItem.setTitle(C4522p.m8236a(R.string.action_done));
        this.f23998F.setTitle(C4522p.m8236a(R.string.action_crop));
        C2491i.m6790a(findItem.getIcon(), UIThemeManager.getmInstance().getIcon_toolbar_white_color());
        C2491i.m6790a(this.f23998F.getIcon(), UIThemeManager.getmInstance().getIcon_toolbar_white_color());
        if (this.f23999G && this.f24008t.size() > 0) {
            this.f23998F.setVisible(true);
        }
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            onBackPressed();
            return true;
        }
        int i = 0;
        if (itemId == R.id.action_done) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            while (i < this.f24008t.size()) {
                Object valueOf;
                String str = ((C3209a) new ArrayList(this.f24008t.values()).get(i)).f9939a;
                arrayList2.add(str);
                if (this.f23993A.containsKey(str)) {
                    arrayList.add(((C7179a) this.f23993A.get(str)).mo2533e());
                    if (this.f23994B == 1) {
                        valueOf = Boolean.valueOf(((C7179a) this.f23993A.get(str)).mo3573O());
                    } else {
                        i++;
                    }
                } else {
                    arrayList.add("");
                    if (this.f23994B == 1) {
                        valueOf = Boolean.valueOf(true);
                    } else {
                        i++;
                    }
                }
                arrayList3.add(valueOf);
                i++;
            }
            m21098a(arrayList2, arrayList, arrayList3);
            return true;
        } else if (itemId != R.id.action_crop) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            if (this.f24006r != null && this.f24008t.size() > 0) {
                Intent intent = new Intent(this, SquareCropActivityCopy.class);
                intent.putExtra("KEY_IMAGE_SELECTOR", 1003);
                intent.putExtra("KEY_IMAGE_PATH_EDITOR", ((C3209a) new ArrayList(this.f24008t.values()).get(this.f24006r.getCurrentItem())).f9939a);
                intent.putExtra("KEY_IS_FIX_ASPECT_RATIO", false);
                startActivityForResult(intent, 1002);
            }
            return true;
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        int i2 = 1;
        int i3 = i == 174 ? 1 : 0;
        if (i != 175) {
            i2 = 0;
        }
        if (!(i3 == 0 && i2 == 0) && iArr.length > 0) {
            if (iArr[0] == -1) {
                onBackPressed();
            } else if (i2 != 0) {
                m21112l();
            } else {
                m21111k();
            }
        }
    }

    protected void onResume() {
        super.onResume();
        m20723a(true, UIThemeManager.getmInstance().getIcon_toolbar_white_color());
        C2475a.m6719a((Activity) this, this.f24004p);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("KEY_IS_FIRST_START", this.f24009u);
        bundle.putInt("KEY_REQUEST_CODE", this.f23995C);
        bundle.putInt("KEY_RESULT_TYPE", this.f23994B);
        bundle.putString("KEY_SELECTED_PATH", this.f24001m);
        bundle.putInt("KEY_SELECTED_POSITION", this.f24006r == null ? 0 : this.f24006r.getCurrentItem());
        bundle.putBoolean("KEY_IS_SHARE_MEDIA", this.f23996D);
        bundle.putString("KEY_PATH_SHARE_VIDEO", this.f23997E);
        if (this.f23998F != null) {
            bundle.putBoolean("KEY_IS_VISIBLE_MENU_ITEM_CROP", this.f23998F.isVisible());
        }
        ArrayList arrayList = new ArrayList();
        for (Entry value : this.f24008t.entrySet()) {
            arrayList.add(((C3209a) value.getValue()).f9939a);
        }
        bundle.putStringArrayList("KEY_CAPTIONED_MEDIA_DATA_HOLDERS_LIST_PATH", arrayList);
        for (Entry value2 : this.f23993A.entrySet()) {
            if (m21113m().containsKey(value2.getKey())) {
                m21113m().remove(value2.getKey());
                if (this.f23994B == 1) {
                    m21114n().remove(value2.getKey());
                }
            }
            m21113m().put(value2.getKey(), ((C7179a) value2.getValue()).mo2533e());
            if (this.f23994B == 1) {
                m21114n().put(value2.getKey(), Boolean.valueOf(((C7179a) value2.getValue()).mo3573O()));
            }
        }
        if (this.f24002n != null) {
            bundle.putString("KEY_LAST_CAMERA_TAKEN_ADDRESS", this.f24002n);
        }
        if (this.f23994B == 2 && arrayList.size() > 0) {
            C7328d c7328d = (C7328d) this.f23993A.get(arrayList.get(0));
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("isVideoCompress", c7328d.f21116a.isChecked());
            bundle2.putFloat("LeftProgress", c7328d.f21117b.getLeftProgress());
            bundle2.putFloat("RightProgress", c7328d.f21117b.getRightProgress());
            bundle2.putFloat("SeekBarProgress", c7328d.f21118c.getFloatProgress());
            this.f24011w = bundle2;
            bundle.putBundle("KEY_SAVE_STATE_BUNDLE", this.f24011w);
        }
        bundle.putInt("KEY_VIDEO_SIZE", this.f24012z);
    }
}
