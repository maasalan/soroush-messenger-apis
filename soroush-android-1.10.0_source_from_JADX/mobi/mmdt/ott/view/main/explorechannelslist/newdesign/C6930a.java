package mobi.mmdt.ott.view.main.explorechannelslist.newdesign;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.List;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.C2808d;
import mobi.mmdt.ott.logic.p261a.p284f.p285a.C2645g;
import mobi.mmdt.ott.logic.p261a.p284f.p285a.C2650p;
import mobi.mmdt.ott.logic.p261a.p284f.p285a.C2651r;
import mobi.mmdt.ott.logic.p261a.p284f.p285a.C5922o;
import mobi.mmdt.ott.logic.p261a.p284f.p285a.C5923q;
import mobi.mmdt.ott.logic.p261a.p306p.C6765c;
import mobi.mmdt.ott.logic.p261a.p306p.p307a.C2725d;
import mobi.mmdt.ott.logic.p261a.p306p.p307a.C5954c;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.provider.p387i.C2989a;
import mobi.mmdt.ott.provider.p387i.C2992c;
import mobi.mmdt.ott.provider.p388j.C2996b;
import mobi.mmdt.ott.provider.p388j.C2998f;
import mobi.mmdt.ott.view.components.ProgressWheel;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.main.C6232c;
import mobi.mmdt.ott.view.main.explorechannelslist.newdesign.p462a.C6928a;
import mobi.mmdt.ott.view.main.explorechannelslist.newdesign.p463b.C4218b;
import mobi.mmdt.ott.view.main.explorechannelslist.newdesign.p463b.C4219c;
import mobi.mmdt.ott.view.main.explorechannelslist.newdesign.p463b.C6931a;
import mobi.mmdt.ott.view.main.explorechannelslist.newdesign.p464d.C4223b.C42221;
import mobi.mmdt.ott.view.main.explorechannelslist.newdesign.p464d.C7370c;
import mobi.mmdt.ott.view.main.explorechannelslist.newdesign.p464d.C7371d;
import mobi.mmdt.ott.view.main.explorechannelslist.newdesign.p464d.C7372e;
import mobi.mmdt.ott.view.main.explorechannelslist.newdesign.p464d.p580a.C7217a;
import mobi.mmdt.ott.view.main.explorechannelslist.newdesign.p464d.p580a.C7218b;
import mobi.mmdt.ott.view.main.explorechannelslist.newdesign.p464d.p580a.C7219c;
import mobi.mmdt.ott.view.tools.C4513i;
import mobi.mmdt.ott.view.tools.p479c.C4501c;

public final class C6930a extends C6232c implements C4224d {
    private View f19802a;
    private RecyclerView f19803b;
    private C6928a f19804c;
    private boolean f19805e = false;
    private boolean f19806f = false;
    private ProgressWheel f19807g;
    private LinearLayout f19808h;
    private int f19809i = -1;

    class C42021 implements OnClickListener {
        final /* synthetic */ C6930a f11955a;

        C42021(C6930a c6930a) {
            this.f11955a = c6930a;
        }

        public final void onClick(View view) {
            this.f11955a.m17953d();
        }
    }

    class C42043 implements Runnable {
        final /* synthetic */ C6930a f11958a;

        C42043(C6930a c6930a) {
            this.f11958a = c6930a;
        }

        public final void run() {
            C4501c.m8189a().m8193b();
        }
    }

    class C42065 implements Runnable {
        final /* synthetic */ C6930a f11961a;

        C42065(C6930a c6930a) {
            this.f11961a = c6930a;
        }

        public final void run() {
            C4501c.m8189a().m8193b();
        }
    }

    class C42076 implements Runnable {
        final /* synthetic */ C6930a f11962a;

        C42076(C6930a c6930a) {
            this.f11962a = c6930a;
        }

        public final void run() {
            C4501c.m8189a().m8193b();
        }
    }

    class C42087 implements Runnable {
        final /* synthetic */ C6930a f11963a;

        C42087(C6930a c6930a) {
            this.f11963a = c6930a;
        }

        public final void run() {
            if (this.f11963a.f19804c.getItemCount() <= 0) {
                this.f11963a.f19808h.setVisibility(0);
            }
            this.f11963a.f19807g.setVisibility(8);
        }
    }

    private void m17948a() {
        C2808d.m7147a(new C6931a(this.f19809i));
    }

    private void m17953d() {
        if (!this.f19805e) {
            this.f19808h.setVisibility(8);
            if (this.f19804c.getItemCount() == 0) {
                this.f19807g.setVisibility(0);
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.f19809i);
            C2808d.m7148b(new C6765c(stringBuilder.toString()));
            this.f19805e = true;
        }
    }

    private void m17955e() {
        Activity activity = getActivity();
        if (activity != null) {
            this.f19805e = false;
            activity.runOnUiThread(new C42087(this));
        }
    }

    public final void mo3248a(int i, String str, String str2, String str3) {
        C4220b.m8045a(getActivity(), i, str, str2, str3, false);
    }

    public final void mo3249a(C6829g c6829g) {
        int i;
        String str;
        C7217a c7217a = (C7217a) c6829g;
        if (c7217a.f20834a) {
            i = c7217a.f20838e;
            str = c7217a.f20837d;
        } else {
            i = c7217a.f20835b;
            str = c7217a.f20836c;
        }
        C4220b.m8045a(getActivity(), i, str, c7217a.f20841h, null, c7217a.f20834a);
    }

    public final void mo3239b() {
        if (this.f19803b != null) {
            this.f19803b.scrollToPosition(0);
        }
    }

    public final void mo3250b(C6829g c6829g) {
        C7218b c7218b = (C7218b) c6829g;
        C4220b.m8045a(getActivity(), c7218b.f20849d, c7218b.f20848c, c7218b.f20847b, c7218b.f20846a, false);
    }

    public final void mo3251c(C6829g c6829g) {
        C7370c c7370c = (C7370c) c6829g;
        Activity activity = getActivity();
        int i = C2989a.f9374d;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(c7370c.f21439a);
        C4220b.m8045a(activity, i, stringBuilder.toString(), c7370c.f21442d, c7370c.f21440b, false);
    }

    public final void mo3252d(C6829g c6829g) {
        C7217a c7217a = (C7217a) c6829g;
        C4220b.m8045a(getActivity(), c7217a.f20838e, c7217a.f20837d, c7217a.f20841h, c7217a.f20843l, false);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f19802a = layoutInflater.inflate(R.layout.fragment_explore_channels_list_v2, viewGroup, false);
        return this.f19802a;
    }

    public final void onEvent(C2645g c2645g) {
        m17948a();
    }

    public final void onEvent(final C5922o c5922o) {
        C2480b.m6742f(" OnJoinChannelErrorEvent ");
        Activity activity = getActivity();
        if (activity != null) {
            activity.runOnUiThread(new Runnable(this) {
                final /* synthetic */ C6930a f11960b;

                public final void run() {
                    C4501c.m8189a().m8193b();
                    C4513i.m8228a(this.f11960b.getActivity(), c5922o.f8890a);
                }
            });
        }
    }

    public final void onEvent(C2650p c2650p) {
        C2480b.m6742f(" OnJoinChannelSuccessfulEvent ");
        Activity activity = getActivity();
        if (activity != null) {
            activity.runOnUiThread(new C42043(this));
        }
    }

    public final void onEvent(C5923q c5923q) {
        Activity activity = getActivity();
        if (activity != null) {
            activity.runOnUiThread(new C42076(this));
        }
    }

    public final void onEvent(C2651r c2651r) {
        Activity activity = getActivity();
        if (activity != null) {
            activity.runOnUiThread(new C42065(this));
            m17948a();
        }
    }

    public final void onEvent(C5954c c5954c) {
        m17955e();
    }

    public final void onEvent(C2725d c2725d) {
        m17955e();
    }

    public final void onEvent(C4219c c4219c) {
        ArrayList arrayList = c4219c.f11984a;
        final List arrayList2 = new ArrayList();
        if (arrayList != null) {
            int i = 0;
            while (i < arrayList.size()) {
                int i2;
                boolean z;
                String str;
                long j;
                Object c7372e;
                C4218b c4218b = (C4218b) arrayList.get(i);
                C2996b c2996b = c4218b.f11982a;
                long j2 = c2996b.f9395a;
                String b = C2491i.m6814b(c2996b.f9396b);
                int i3 = c2996b.f9397c;
                boolean booleanValue = c2996b.f9400f == null ? false : c2996b.f9400f.booleanValue();
                int intValue = c2996b.f9401g == null ? 0 : c2996b.f9401g.intValue();
                String str2 = c2996b.f9402h;
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = c4218b.f11983b;
                int i4 = 0;
                while (i4 < arrayList4.size()) {
                    C2992c c2992c = (C2992c) arrayList4.get(i4);
                    String b2 = C2491i.m6814b(c2992c.f9380b);
                    String str3 = c2992c.f9381c;
                    String b3 = C2491i.m6814b(c2992c.f9383e);
                    ArrayList arrayList5 = arrayList4;
                    int i5 = c2992c.f9385g;
                    i2 = intValue;
                    String str4 = c2992c.f9386h;
                    z = booleanValue;
                    int i6 = c2992c.f9388j;
                    str = b;
                    b = c2992c.f9389k;
                    j = j2;
                    int i7 = c2992c.f9387i;
                    boolean z2 = c2992c.f9390l;
                    int i8 = i3 - 1;
                    switch (C42221.f11987a[i8]) {
                        case 1:
                            C7219c c7219c = new C7219c(i8, b2, str3, str2, i5, str4, i7, i4);
                            break;
                        case 2:
                            String str5 = str3;
                            String b4 = C2491i.m6814b(c2992c.f9382d);
                            if (!(!z2 || b3 == null || b3.isEmpty())) {
                                b3 = "مشاهده";
                            }
                            C7217a c7217a = new C7217a(i8, b2, b4, str5, str2, b3, i5, str4, i6, b, i7, z2, i4);
                            break;
                        case 3:
                            C7218b c7218b = new C7218b(i8, b2, str3, str2, i5, str4, i7, i4);
                            break;
                        default:
                            break;
                    }
                    arrayList3.add(c7372e);
                    i4++;
                    arrayList4 = arrayList5;
                    intValue = i2;
                    booleanValue = z;
                    b = str;
                    j2 = j;
                }
                j = j2;
                str = b;
                z = booleanValue;
                i2 = intValue;
                int i9 = i3 - 1;
                switch (C42221.f11987a[i9]) {
                    case 1:
                        c7372e = new C7372e(i9, Integer.valueOf(i2), arrayList3, i);
                        break;
                    case 2:
                        boolean z3;
                        C7370c c7370c;
                        C2996b c2996b2 = i > 0 ? ((C4218b) arrayList.get(i - 1)).f11982a : null;
                        if (i != 0) {
                            if (c2996b2 != null) {
                                if (c2996b2.f9397c != C2998f.f9409b) {
                                    z3 = true;
                                    c7370c = new C7370c(j, i9, str, z, str2, arrayList3, z3, i);
                                    break;
                                }
                            }
                        }
                        z3 = false;
                        c7370c = new C7370c(j, i9, str, z, str2, arrayList3, z3, i);
                    case 3:
                        c7372e = new C7371d(i9, arrayList3, i);
                        break;
                    default:
                        continue;
                }
                arrayList2.add(c7372e);
                i++;
            }
        }
        getActivity().runOnUiThread(new Runnable(this) {
            final /* synthetic */ C6930a f11957b;

            /* JADX WARNING: inconsistent code. */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                r3 = this;
                r0 = r3.f11957b;
                r0 = r0.f19807g;
                r1 = 8;
                r0.setVisibility(r1);
                r0 = r3.f11957b;
                r0 = r0.f19804c;
                if (r0 == 0) goto L_0x0040;
            L_0x0013:
                r0 = r3.f11957b;
                r0 = r0.f19804c;
                r2 = r1;
                r0.m13665a(r2);
                r0 = r3.f11957b;
                r0 = r0.f19804c;
                r0 = r0.getItemCount();
                if (r0 <= 0) goto L_0x0030;
            L_0x002a:
                r0 = r3.f11957b;
                r0.f19808h.setVisibility(r1);
                return;
            L_0x0030:
                r0 = r3.f11957b;
                r0 = r0.f19806f;
                if (r0 != 0) goto L_0x0046;
            L_0x0038:
                r0 = r3.f11957b;
                r0 = r0.f19805e;
                if (r0 != 0) goto L_0x0046;
            L_0x0040:
                r0 = r3.f11957b;
                r1 = 0;
                r0.f19808h.setVisibility(r1);
            L_0x0046:
                return;
                */
                throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.main.explorechannelslist.newdesign.a.2.run():void");
            }
        });
    }

    public final void onResume() {
        super.onResume();
        m17948a();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (getArguments().containsKey("LANDING_PAGE_NUMBER")) {
            this.f19809i = getArguments().getInt("LANDING_PAGE_NUMBER");
        }
        this.f19803b = (RecyclerView) this.f19802a.findViewById(R.id.recycler_view);
        this.f19807g = (ProgressWheel) this.f19802a.findViewById(R.id.progress_wheel);
        this.f19808h = (LinearLayout) this.f19802a.findViewById(R.id.retry_linearLayout);
        Button button = (Button) this.f19802a.findViewById(R.id.retryExploreChannelButton);
        button.setOnClickListener(new C42021(this));
        this.f19804c = new C6928a(getActivity(), this);
        this.f19803b.setHasFixedSize(true);
        this.f19803b.setAdapter(this.f19804c);
        this.f19803b.setLayoutManager(new LinearLayoutManager(getActivity()));
        C2491i.m6819b(button, UIThemeManager.getmInstance().getAccent_color());
        C2491i.m6798a(button, UIThemeManager.getmInstance().getButton_text_color());
        m17953d();
    }
}
