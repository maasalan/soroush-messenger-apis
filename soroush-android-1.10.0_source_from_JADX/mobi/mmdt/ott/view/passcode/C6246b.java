package mobi.mmdt.ott.view.passcode;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.LayoutManager;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.lib_webservicescomponent.p257d.C2555a;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.view.components.p401c.C3126i;
import mobi.mmdt.ott.view.components.p401c.C6073e;
import mobi.mmdt.ott.view.components.p401c.C6074f;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.components.p405e.C3150a;
import mobi.mmdt.ott.view.newdesign.mainpage.C4258b;
import mobi.mmdt.ott.view.newdesign.mainpage.MainActivity;
import mobi.mmdt.ott.view.passcode.p558a.C6941a;
import mobi.mmdt.ott.view.passcode.p558a.C6942b;
import mobi.mmdt.ott.view.passcode.p558a.C6943c;
import mobi.mmdt.ott.view.passcode.p582b.C7222b;
import mobi.mmdt.ott.view.passcode.p582b.C7374a;
import mobi.mmdt.ott.view.passcode.p582b.C7375c;
import mobi.mmdt.ott.view.passcode.p582b.C7376d;
import mobi.mmdt.ott.view.tools.C4478a;
import mobi.mmdt.ott.view.tools.C4522p;

public final class C6246b extends C3150a implements C3126i {
    boolean f16920a;
    private View f16921b;
    private C7374a f16922c;
    private LinearLayout f16923e;
    private String f16924f = "";
    private boolean f16925g;
    private boolean f16926h;
    private boolean f16927i;
    private boolean f16928j;
    private TextView f16929k;
    private TextView f16930l;
    private boolean f16931m;
    private boolean f16932n;
    private boolean f16933o;
    private String f16934p;

    class C42831 implements Runnable {
        final /* synthetic */ C6246b f12100a;

        C42831(C6246b c6246b) {
            this.f12100a = c6246b;
        }

        public final void run() {
            this.f12100a.f16930l.setVisibility(4);
        }
    }

    public class C7374a extends C6074f {
        final /* synthetic */ C6246b f19831a;

        public C7374a(C6246b c6246b, Context context) {
            this.f19831a = c6246b;
            super(context);
        }

        public final void mo3181a(C6073e c6073e, int i) {
            super.mo3181a(c6073e, i);
        }

        public final /* synthetic */ void onBindViewHolder(ViewHolder viewHolder, int i) {
            super.mo3181a((C6073e) viewHolder, i);
        }

        public final /* synthetic */ ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            switch (i) {
                case 1:
                    this.f19831a.getActivity();
                    return new C6943c(this.f19831a, this.f16246b, viewGroup);
                case 2:
                    this.f19831a.getActivity();
                    return new C6941a(this.f19831a, this.f16246b, viewGroup);
                case 3:
                    this.f19831a.getActivity();
                    return new C6942b(this.f19831a, this.f16246b, viewGroup);
                default:
                    return null;
            }
        }
    }

    private static int m14477a(Context context, boolean z) {
        int i = context.getResources().getDisplayMetrics().densityDpi;
        return i <= 120 ? z ? 28 : 4 : (i <= 120 || i > 160) ? (i <= 160 || i > 240) ? (i <= 240 || i > 320) ? (i <= 320 || i > 480) ? (i <= 480 || i > 640) ? z ? 48 : 6 : z ? 48 : 22 : z ? 48 : 22 : z ? 48 : 20 : z ? 48 : 6 : z ? 38 : 4;
    }

    private void m14479a() {
        int i = (int) ((5.0f * getResources().getDisplayMetrics().density) + 0.5f);
        for (int i2 = 0; i2 < 4; i2++) {
            View imageView = new ImageView(getActivity());
            imageView.setImageResource(R.drawable.circle_stroke_pin_code);
            imageView.setLayoutParams(new LayoutParams(-2, -2));
            imageView.setAdjustViewBounds(true);
            imageView.setPadding(i, 0, i, 0);
            this.f16923e.addView(imageView);
        }
        m14480a(0);
    }

    private void m14480a(int i) {
        if (i <= 4) {
            int i2 = 0;
            while (i2 < 4) {
                ((ImageView) this.f16923e.getChildAt(i2)).setImageResource(i2 < i ? R.drawable.circle_fill_pin_code : R.drawable.circle_stroke_pin_code);
                i2++;
            }
        }
    }

    private void m14481a(String str) {
        C2491i.m6787a(getActivity(), 50);
        this.f16930l.setVisibility(0);
        this.f16930l.setText(str);
        new Handler().postDelayed(new C42831(this), 1000);
    }

    private static void m14482a(ArrayList<C6829g> arrayList) {
        int i;
        Object c7376d;
        r1 = new String[9];
        int i2 = 0;
        r1[0] = "1";
        r1[1] = "2";
        r1[2] = "3";
        r1[3] = "4";
        r1[4] = "5";
        r1[5] = "6";
        r1[6] = "7";
        r1[7] = "8";
        r1[8] = "9";
        String b = C2535a.m6888a().m6919b();
        int i3 = 0;
        while (i2 < 9) {
            int i4;
            Object c7376d2;
            String str = r1[i2];
            if (b.equals("fa")) {
                i4 = i3 + 1;
                c7376d2 = new C7376d(i3, C2491i.m6814b(str));
            } else {
                i4 = i3 + 1;
                c7376d2 = new C7376d(i3, str);
            }
            arrayList.add(c7376d2);
            i3 = i4;
            i2++;
        }
        int i5 = i3 + 1;
        arrayList.add(new C7375c(i3));
        if (b.equals("fa")) {
            i = i5 + 1;
            c7376d = new C7376d(i5, C2491i.m6814b("0"));
        } else {
            i = i5 + 1;
            c7376d = new C7376d(i5, "0");
        }
        arrayList.add(c7376d);
        arrayList.add(new C7374a(i));
    }

    private void m14483b(String str) {
        this.f16929k.setText(str);
    }

    private boolean m14484b() {
        return this.f16924f != null;
    }

    private boolean m14485d() {
        String w = C2535a.m6888a().m6977w();
        C2555a.m6994a(C2535a.m6888a().m6928d());
        C2555a.m6996b(w, new byte[16]);
        w = C2555a.f8312a;
        Object obj = this.f16924f;
        if (this.f16934p != null && this.f16934p.equals("fa")) {
            w = C2491i.m6814b(w);
            obj = C2491i.m6814b(this.f16924f);
        }
        return w.equals(obj);
    }

    private void m14486e() {
        this.f16924f = "";
        m14480a(0);
    }

    public final void mo2234c(int i) {
        C7222b c7222b = (C7222b) this.f16922c.m13671a(i);
        switch (c7222b.f19503j) {
            case 1:
                C7376d c7376d = (C7376d) c7222b;
                this.f16930l.setVisibility(4);
                if (m14484b() && this.f16924f.length() < 4) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(this.f16924f);
                    stringBuilder.append(c7376d.f21454a);
                    this.f16924f = stringBuilder.toString();
                    m14480a(this.f16924f.length());
                    if (this.f16924f.length() == 4) {
                        if (!this.f16920a) {
                            if (!this.f16926h) {
                                if (!this.f16927i) {
                                    if (m14485d()) {
                                        MyApplication.m12950a().f15901P = System.currentTimeMillis();
                                        if (this.f16925g) {
                                            C4478a.m8174j(getActivity());
                                        } else {
                                            if (this.f16932n) {
                                                Intent intent = new Intent(getActivity(), MainActivity.class);
                                                Intent intent2 = getActivity().getIntent();
                                                if (intent2 != null) {
                                                    intent.setFlags(603979776);
                                                    if (intent2.getExtras() != null) {
                                                        intent.putExtras(intent2.getExtras());
                                                    }
                                                    if (intent2.getData() != null) {
                                                        intent.setData(intent2.getData());
                                                    }
                                                    if (intent2.getAction() != null) {
                                                        intent.setAction(intent2.getAction());
                                                    }
                                                    if (intent2.getType() != null) {
                                                        intent.setType(intent2.getType());
                                                    }
                                                }
                                                startActivity(intent);
                                            }
                                            getActivity().finish();
                                        }
                                        if (!this.f16925g) {
                                            C2535a.m6888a().m6963p(this.f16933o);
                                        }
                                        C2535a.m6888a().m6961o(false);
                                        m14486e();
                                    } else {
                                        i = R.string.wrong_passcode;
                                    }
                                }
                            }
                            String str = this.f16924f;
                            if (this.f16934p.equals("fa")) {
                                str = C2491i.m6826c(str);
                            }
                            C2555a.m6994a(C2535a.m6888a().m6928d());
                            C2555a.m6995a(str, new byte[16]);
                            C2535a.m6888a().m6936e(C2555a.f8313b);
                            m14483b(C4522p.m8236a(this.f16927i ? R.string.re_enter_new_the_passcode : R.string.re_enter_the_passcode));
                            this.f16920a = true;
                            m14486e();
                        } else if (m14485d()) {
                            this.f16920a = false;
                            this.f16926h = false;
                            C2535a.m6888a().m6959n(true);
                            if (this.f16927i) {
                                Toast.makeText(getActivity(), C4522p.m8236a(R.string.your_passcode_has_been_changed_successfully), 0).show();
                            }
                            C4478a.m8174j(getActivity());
                            m14486e();
                            break;
                        } else {
                            this.f16920a = true;
                            i = R.string.do_not_match_passcode;
                        }
                        m14481a(C4522p.m8236a(i));
                        m14486e();
                    }
                }
                break;
            case 2:
                this.f16930l.setVisibility(4);
                if (m14484b() && !this.f16924f.isEmpty()) {
                    this.f16924f = this.f16924f.substring(0, this.f16924f.length() - 1);
                    m14480a(this.f16924f.length());
                    return;
                }
            case 3:
                if (!(this.f16920a || this.f16926h)) {
                    if (!this.f16925g) {
                        C4258b.m8066a(getActivity());
                        return;
                    }
                }
                getActivity().onBackPressed();
                return;
            default:
                return;
        }
    }

    public final void mo2235d(int i) {
        if (((C7222b) this.f16922c.m13671a(i)).f19503j == 2 && m14484b() && !this.f16924f.isEmpty()) {
            m14486e();
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f16921b = layoutInflater.inflate(R.layout.fragment_passcode, viewGroup, false);
        this.f16934p = C2535a.m6888a().m6919b();
        ArrayList arrayList = new ArrayList();
        C6246b.m14482a(arrayList);
        if (getArguments() != null) {
            Bundle arguments = getArguments();
            this.f16925g = arguments.getBoolean("KEY_BUNDLE_FROM_SETTING");
            this.f16926h = arguments.getBoolean("KEY_BUNDLE_IS_SET_MODE");
            this.f16927i = arguments.getBoolean("KEY_BUNDLE_IS_UPDATE_MODE");
            this.f16928j = arguments.getBoolean("KEY_BUNDLE_ENTER_FROM_SCREEN_TURN_ON");
            this.f16931m = arguments.getBoolean("KEY_BUNDLE_ENTER_FROM_TIMER");
            this.f16932n = arguments.getBoolean("KEY_BUNDLE_ENTER_FROM_NOTIFICATION");
        }
        if (!this.f16925g) {
            this.f16933o = C2535a.m6888a().m6893D();
            C2535a.m6888a().m6963p(false);
        }
        this.f16923e = (LinearLayout) this.f16921b.findViewById(R.id.dot_linear_layout);
        this.f16929k = (TextView) this.f16921b.findViewById(R.id.title_text);
        this.f16930l = (TextView) this.f16921b.findViewById(R.id.error_textView);
        m14483b(C4522p.m8236a(this.f16927i ? R.string.enter_new_passcode : R.string.enter_passcode));
        m14479a();
        LayoutManager gridLayoutManager = new GridLayoutManager(getActivity(), 3);
        RecyclerView recyclerView = (RecyclerView) this.f16921b.findViewById(R.id.recycler_view);
        recyclerView.addItemDecoration(new C6245a((int) C2491i.m6804b(getActivity(), (float) C6246b.m14477a(getActivity(), true)), (int) C2491i.m6804b(getActivity(), (float) C6246b.m14477a(getActivity(), false))));
        this.f16922c = new C7374a(this, getActivity());
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(this.f16922c);
        recyclerView.setLayoutManager(gridLayoutManager);
        this.f16922c.m13673a((List) arrayList);
        return this.f16921b;
    }

    public final void onDestroy() {
        super.onDestroy();
        if (!this.f16925g) {
            C2535a.m6888a().m6963p(this.f16933o);
        }
    }
}
