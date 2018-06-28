package mobi.mmdt.ott.view.vas.payservices.charge.view;

import android.app.Dialog;
import android.app.FragmentTransaction;
import android.app.LoaderManager.LoaderCallbacks;
import android.content.Context;
import android.content.CursorLoader;
import android.content.DialogInterface;
import android.content.Loader;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.Snackbar;
import android.support.v4.app.C0401p;
import android.support.v4.app.Fragment;
import android.support.v7.app.C6389b.C0663a;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.WindowManager.LayoutParams;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.p085c.p086a.C1212c;
import com.p085c.p086a.C1274i;
import com.p085c.p086a.p105g.C1248f;
import java.util.ArrayList;
import java.util.List;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.componentsutils.view.roundavatarimageview.RoundAvatarImageView;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.lib_webservicescomponent.p257d.C2556b;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.vas_webservices.base.ChargeType;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.vas_webservices.base.OperatorType;
import mobi.mmdt.ott.logic.C2808d;
import mobi.mmdt.ott.logic.p261a.aa.C2580f;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.logic.vas.p372a.C2910a;
import mobi.mmdt.ott.logic.vas.p372a.C2912b;
import mobi.mmdt.ott.logic.vas.p372a.p550b.C6814a;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p383e.C2961a;
import mobi.mmdt.ott.provider.p383e.C6017c;
import mobi.mmdt.ott.provider.p389k.C2999a;
import mobi.mmdt.ott.provider.p389k.C3001e;
import mobi.mmdt.ott.view.components.p398a.C7176b;
import mobi.mmdt.ott.view.components.p398a.C7176b.C3102a;
import mobi.mmdt.ott.view.components.p401c.C3126i;
import mobi.mmdt.ott.view.components.p401c.C6074f;
import mobi.mmdt.ott.view.components.p402d.C7576b;
import mobi.mmdt.ott.view.components.p405e.C3150a;
import mobi.mmdt.ott.view.tools.C4515k;
import mobi.mmdt.ott.view.tools.C4522p;
import mobi.mmdt.ott.view.tools.p479c.C4501c;
import mobi.mmdt.ott.view.vas.payservices.charge.p486b.C6995c;
import mobi.mmdt.ott.view.vas.payservices.charge.p593c.C7236c;

public final class C6287c extends C3150a implements OnClickListener, C3102a, C3126i {
    private final C3126i f17171A = new C62865(this);
    EditText f17172a;
    C2910a f17173b;
    private String[] f17174c = new String[]{"10000", "20000", "50000", "1000000"};
    private TextView f17175e;
    private TextView f17176f;
    private RoundAvatarImageView f17177g;
    private TextView f17178h;
    private TextView f17179i;
    private View f17180j;
    private Dialog f17181k;
    private TextView f17182l;
    private ImageView f17183m;
    private ImageView f17184n;
    private ImageView f17185o;
    private LinearLayout f17186p;
    private LinearLayout f17187q;
    private LinearLayout f17188r;
    private LinearLayout f17189s;
    private TextView f17190t;
    private TextView f17191u;
    private TextView f17192v;
    private TextView f17193w;
    private boolean f17194x = false;
    private final TextWatcher f17195y = new C45742(this);
    private LoaderCallbacks<Cursor> f17196z = new C45763(this);

    class C45731 implements Runnable {
        final /* synthetic */ C6287c f12589a;

        C45731(C6287c c6287c) {
            this.f12589a = c6287c;
        }

        public final void run() {
            if (this.f12589a.f17176f.getLineCount() > 1) {
                this.f12589a.f17176f.setText(R.string.charge_my_phone_abbr);
            }
            if (this.f12589a.f17175e.getLineCount() > 1) {
                this.f12589a.f17175e.setText(R.string.charge_for_others_abbr);
            }
        }
    }

    class C45742 implements TextWatcher {
        final /* synthetic */ C6287c f12590a;

        C45742(C6287c c6287c) {
            this.f12590a = c6287c;
        }

        public final void afterTextChanged(Editable editable) {
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (charSequence.length() == 11) {
                if (this.f12590a.f17173b.f9076c == null) {
                    this.f12590a.f17173b.f9076c = C2912b.m7286a(charSequence.toString());
                }
                if (this.f12590a.f17173b.f9076c != null) {
                    C1274i a;
                    this.f12590a.f17194x = true;
                    this.f12590a.f17173b.f9075b = charSequence.toString();
                    String a2 = C2580f.m7024a(C2535a.m6888a().m6933e(), charSequence.toString());
                    C3001e a3 = C2999a.m7500a(a2);
                    if (a3 == null || a3.f9417c == null) {
                        a = C1212c.m2872a(this.f12590a.getActivity()).m10950a(Integer.valueOf(R.drawable.ic_contact_tab_white_new_design));
                    } else {
                        a = C1212c.m2872a(this.f12590a.getActivity()).m10950a(C4515k.m8231a(C2556b.m6998a(a3.f9417c.substring(0, a3.f9417c.length() - 1))));
                    }
                    a.m3034a(C1248f.m2945b()).m3031a(this.f12590a.f17177g);
                    this.f12590a.f17177g.setBackgroundColor(C2491i.m6806b(this.f12590a.getActivity(), a2));
                    this.f12590a.m14698d();
                    this.f12590a.m14688a(this.f12590a.f17173b.f9076c);
                    return;
                }
                this.f12590a.m14694b();
                Snackbar.m8770a(this.f12590a.f17180j, C4522p.m8236a(R.string.please_enter_phone_number_correctly), 0).m572a();
                return;
            }
            C6287c c6287c;
            String str = null;
            this.f12590a.f17173b.f9076c = null;
            this.f12590a.f17173b.f9075b = null;
            this.f12590a.f17173b.f9079f = -1;
            this.f12590a.f17173b.f9078e = null;
            this.f12590a.f17173b.f9077d = false;
            this.f12590a.f17179i.setText(C2912b.m7285a(this.f12590a.f17173b.f9079f));
            if (this.f12590a.f17173b != null) {
                if (this.f12590a.f17173b.f9078e != null) {
                    c6287c = this.f12590a;
                    str = this.f12590a.f17173b.f9078e;
                    c6287c.m14687a(str);
                    this.f12590a.f17179i.setOnClickListener(this.f12590a);
                    this.f12590a.m14694b();
                    C6287c.m14707j(this.f12590a);
                }
            }
            c6287c = this.f12590a;
            c6287c.m14687a(str);
            this.f12590a.f17179i.setOnClickListener(this.f12590a);
            this.f12590a.m14694b();
            C6287c.m14707j(this.f12590a);
        }
    }

    class C45763 implements LoaderCallbacks<Cursor> {
        final /* synthetic */ C6287c f12593a;

        C45763(C6287c c6287c) {
            this.f12593a = c6287c;
        }

        public final Loader<Cursor> onCreateLoader(int i, Bundle bundle) {
            return new CursorLoader(MyApplication.m12952b(), C2961a.f9199a, null, "IsFavorite = ?", new String[]{"1"}, null);
        }

        public final /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
            C2910a c2910a;
            C6017c c6017c = new C6017c((Cursor) obj);
            if (c6017c.moveToFirst()) {
                do {
                    c2910a = new C2910a();
                    c2910a.f9074a = c6017c.m7352a("ChargeId");
                    c2910a.f9079f = c6017c.m7353b("ChargeType").intValue();
                    boolean z = false;
                    c2910a.f9077d = c6017c.m7353b("IsTarabord").intValue() == 1;
                    c2910a.f9075b = c6017c.m7352a("PhoneNumber");
                    c2910a.f9078e = c6017c.m7352a("Amount");
                    if (c6017c.m7353b("IsTarabord").intValue() == 1) {
                        z = true;
                    }
                    c2910a.f9077d = z;
                    c2910a.f9076c = C2912b.m7289c(c6017c.m7353b("Operator").intValue());
                } while (c6017c.moveToNext());
            } else {
                c2910a = null;
            }
            this.f12593a.getActivity().runOnUiThread(new Runnable(this) {
                final /* synthetic */ C45763 f12592b;

                public final void run() {
                    if (c2910a != null) {
                        C6287c.m14691a(this.f12592b.f12593a, c2910a);
                    } else {
                        Snackbar.m8770a(this.f12592b.f12593a.f17180j, C4522p.m8236a(R.string.favorite_charge_warning), 0).m572a();
                    }
                }
            });
        }

        public final void onLoaderReset(Loader<Cursor> loader) {
        }
    }

    class C62865 implements C3126i {
        final /* synthetic */ C6287c f17170a;

        C62865(C6287c c6287c) {
            this.f17170a = c6287c;
        }

        public final void mo2234c(int i) {
            this.f17170a.f17173b.f9078e = this.f17170a.f17174c[i];
            this.f17170a.m14687a(this.f17170a.f17174c[i]);
            if (this.f17170a.f17181k != null && this.f17170a.f17181k.isShowing()) {
                this.f17170a.f17181k.dismiss();
            }
        }

        public final void mo2235d(int i) {
        }
    }

    private class C6996a extends C6074f {
        final /* synthetic */ C6287c f20000a;

        C6996a(C6287c c6287c, Context context) {
            this.f20000a = c6287c;
            super(context);
        }

        public final /* synthetic */ ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C6995c(this.f20000a.f17171A, this.f20000a.getActivity().getLayoutInflater(), viewGroup);
        }
    }

    private class C6997b extends C6074f {
        final /* synthetic */ C6287c f20001a;

        public C6997b(C6287c c6287c, Context context) {
            this.f20001a = c6287c;
            super(context);
        }

        public final /* synthetic */ ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C6995c(this.f20001a, this.f20001a.getActivity().getLayoutInflater(), viewGroup);
        }
    }

    private void m14686a() {
        String str;
        this.f17179i.setText(C2912b.m7285a(this.f17173b.f9079f));
        if (!(this.f17173b == null || this.f17173b.f9076c == null)) {
            m14696b(this.f17173b.f9076c);
        }
        if (this.f17173b != null) {
            if (this.f17173b.f9075b != null) {
                this.f17172a.setText(this.f17173b.f9075b);
                if (this.f17173b != null) {
                    if (this.f17173b.f9078e == null) {
                        str = this.f17173b.f9078e;
                        m14687a(str);
                    }
                }
                str = null;
                m14687a(str);
            }
        }
        this.f17172a.setHint(C4522p.m8236a(R.string.phone_number));
        if (this.f17173b != null) {
            if (this.f17173b.f9078e == null) {
                str = this.f17173b.f9078e;
                m14687a(str);
            }
        }
        str = null;
        m14687a(str);
    }

    private void m14687a(String str) {
        if (str == null) {
            this.f17178h.setText(C4522p.m8236a(R.string.charge_amount));
            return;
        }
        this.f17178h.setText(String.format("%s %s", new Object[]{C6287c.m14693b(C2491i.m6776a(str)), C4522p.m8236a(R.string.rial)}));
    }

    private void m14688a(OperatorType operatorType) {
        this.f17173b.f9079f = 0;
        this.f17179i.setText(C2912b.m7285a(this.f17173b.f9079f));
        if (this.f17173b.f9076c != operatorType) {
            this.f17173b.f9077d = true;
        }
        this.f17173b.f9076c = operatorType;
        m14696b(operatorType);
    }

    static /* synthetic */ void m14691a(C6287c c6287c, C2910a c2910a) {
        c6287c.f17173b = c2910a;
        c6287c.m14698d();
        c6287c.m14686a();
    }

    private static String m14693b(String str) {
        return C2535a.m6888a().m6919b().equalsIgnoreCase("fa") ? C2491i.m6814b(str) : str;
    }

    private void m14694b() {
        C1212c.m2872a(getActivity()).m10950a(Integer.valueOf(R.drawable.ic_contact_tab_white_new_design)).m3034a(C1248f.m2945b()).m3031a(this.f17177g);
        this.f17177g.setBackgroundColor(UIThemeManager.getmInstance().getAccent_color());
    }

    private void m14695b(Bundle bundle) {
        Fragment a = C7176b.m18967a(bundle, this);
        C0401p a2 = ((C7576b) getActivity()).m19188c().mo254a();
        a2.mo237a(a, "tag");
        a2.mo244d();
    }

    private void m14696b(OperatorType operatorType) {
        if (operatorType == null) {
            Toast.makeText(getActivity(), C4522p.m8236a(R.string.please_enter_phone_number_correctly), 0).show();
            return;
        }
        switch (operatorType) {
            case Irancell:
                this.f17183m.setImageResource(R.drawable.ic_irancell_colored);
                this.f17184n.setImageResource(R.drawable.ic_mci_bw);
                this.f17185o.setImageResource(R.drawable.ic_rightel_bw);
                return;
            case HamraheAval:
                this.f17183m.setImageResource(R.drawable.ic_irancell_bw);
                this.f17184n.setImageResource(R.drawable.ic_mci);
                this.f17185o.setImageResource(R.drawable.ic_rightel_bw);
                return;
            case Rightel:
                this.f17183m.setImageResource(R.drawable.ic_irancell_bw);
                this.f17184n.setImageResource(R.drawable.ic_mci_bw);
                this.f17185o.setImageResource(R.drawable.ic_rightel);
                return;
            default:
                return;
        }
    }

    private void m14698d() {
        this.f17190t.setVisibility(0);
        this.f17189s.setVisibility(0);
        this.f17191u.setVisibility(0);
        this.f17179i.setVisibility(0);
        this.f17193w.setVisibility(0);
        this.f17178h.setVisibility(0);
        this.f17182l.setVisibility(0);
    }

    private Dialog m14700e() {
        OperatorType operatorType = this.f17173b.f9076c;
        int i = 0;
        String[] strArr = operatorType == OperatorType.HamraheAval ? new String[]{"10000", "20000", "50000", "100000", "200000"} : operatorType == OperatorType.Irancell ? new String[]{"10000", "20000", "50000", "100000", "200000"} : operatorType == OperatorType.Rightel ? C2912b.m7288b(this.f17173b.f9079f) == ChargeType.CHARGE_MAGIC ? new String[]{"20000", "50000", "100000", "200000", "500000", "1000000"} : new String[]{"10000", "20000", "50000", "100000", "200000", "500000", "1000000"} : null;
        this.f17174c = strArr;
        List arrayList = new ArrayList();
        while (i < this.f17174c.length) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(C2491i.m6776a(C6287c.m14693b(this.f17174c[i])));
            stringBuilder.append(" ");
            stringBuilder.append(C4522p.m8236a(R.string.rial));
            arrayList.add(new C7236c(stringBuilder.toString(), i));
            i++;
        }
        C0663a c0663a = new C0663a(getActivity(), R.style.AppCompatAlertDialogStyle);
        View inflate = getActivity().getLayoutInflater().inflate(R.layout.dialog_select_charge_type, null);
        Rect rect = new Rect();
        getActivity().getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        c0663a.m1607a(inflate);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.rv_charge_type_dialog);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        Adapter c6996a = new C6996a(this, getActivity());
        c6996a.m13673a(arrayList);
        recyclerView.setAdapter(c6996a);
        Dialog a = c0663a.m1612a();
        a.show();
        LayoutParams layoutParams = new LayoutParams();
        if (a.getWindow() != null) {
            layoutParams.copyFrom(a.getWindow().getAttributes());
            layoutParams.width = (int) (((float) rect.width()) * 0.7f);
            layoutParams.height = -2;
            layoutParams.gravity = 17;
        }
        return a;
    }

    private void m14702f() {
        ((InputMethodManager) getActivity().getSystemService("input_method")).hideSoftInputFromWindow(this.f17172a.getWindowToken(), 0);
    }

    static /* synthetic */ void m14707j(C6287c c6287c) {
        c6287c.f17190t.setVisibility(8);
        c6287c.f17189s.setVisibility(8);
        c6287c.f17191u.setVisibility(8);
        c6287c.f17179i.setVisibility(8);
        c6287c.f17193w.setVisibility(8);
        c6287c.f17178h.setVisibility(8);
        c6287c.f17182l.setVisibility(8);
    }

    public final Dialog mo2398a(Bundle bundle) {
        Dialog a;
        View inflate;
        switch (bundle.getInt("dialog_id", -1)) {
            case 10001:
                C2480b.m6736b("showChargeTypeListDialog");
                List arrayList = new ArrayList();
                arrayList.add(new C7236c(C2912b.m7285a(0), 0));
                if (this.f17173b.f9076c == OperatorType.Irancell) {
                    arrayList.add(new C7236c(C2912b.m7285a(2), 2));
                    arrayList.add(new C7236c(C2912b.m7285a(4), 4));
                }
                if (this.f17173b.f9076c == OperatorType.Rightel) {
                    arrayList.add(new C7236c(C2912b.m7285a(3), 3));
                }
                C0663a c0663a = new C0663a(getActivity(), R.style.AppCompatAlertDialogStyle);
                inflate = getActivity().getLayoutInflater().inflate(R.layout.dialog_select_charge_type, null);
                c0663a.m1607a(inflate);
                RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.rv_charge_type_dialog);
                recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
                Adapter c6997b = new C6997b(this, getActivity());
                c6997b.m13673a(arrayList);
                recyclerView.setAdapter(c6997b);
                a = c0663a.m1612a();
                break;
            case 10002:
                a = m14700e();
                break;
            case 10003:
                C0663a c0663a2 = new C0663a(getActivity(), R.style.AppCompatAlertDialogStyle);
                inflate = getActivity().getLayoutInflater().inflate(R.layout.dialog_select_custom_amount, null);
                c0663a2.m1607a(inflate);
                final EditText editText = (EditText) inflate.findViewById(R.id.et_charge_custom_amount);
                ((TextView) inflate.findViewById(R.id.tv_money_currency)).setText(C4522p.m8236a(R.string.rial));
                c0663a2.m1614b(C4522p.m8236a(R.string.cancel), null);
                c0663a2.m1609a(C4522p.m8236a(R.string.select_cap), new DialogInterface.OnClickListener(this) {
                    final /* synthetic */ C6287c f12595b;

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        this.f12595b.f17173b.f9078e = editText.getText().toString();
                        this.f12595b.m14687a(this.f12595b.f17173b.f9078e);
                    }
                });
                a = c0663a2.m1612a();
                break;
            default:
                return null;
        }
        a.show();
        this.f17181k = a;
        return this.f17181k;
    }

    public final void mo2234c(int i) {
        this.f17173b.f9079f = i;
        this.f17173b.f9078e = null;
        if (this.f17173b != null) {
            if (this.f17173b.f9078e != null) {
                m14687a(this.f17173b.f9078e);
                this.f17179i.setText(C2912b.m7285a(this.f17173b.f9079f));
                if (this.f17181k != null && this.f17181k.isShowing()) {
                    this.f17181k.dismiss();
                    return;
                }
            }
        }
        m14687a(null);
        this.f17179i.setText(C2912b.m7285a(this.f17173b.f9079f));
        if (this.f17181k != null) {
        }
    }

    public final void mo2235d(int i) {
    }

    public final void onClick(View view) {
        m14702f();
        int i = 0;
        Bundle bundle;
        if (view.getId() == this.f17179i.getId()) {
            if (this.f17173b.f9076c == null) {
                Snackbar.m8770a(this.f17180j, C4522p.m8236a(R.string.please_first_enter_phone_number), 0).m572a();
                return;
            }
            bundle = new Bundle();
            bundle.putInt("dialog_id", 10001);
            m14695b(bundle);
        } else if (view.getId() == this.f17178h.getId()) {
            if (this.f17173b.f9076c == null) {
                Snackbar.m8770a(this.f17180j, C4522p.m8236a(R.string.please_first_enter_phone_number), 0).m572a();
            } else if (this.f17173b.f9079f == -1) {
                Snackbar.m8770a(this.f17180j, C4522p.m8236a(R.string.please_select_charge_type), 0).m572a();
            } else {
                bundle = new Bundle();
                bundle.putInt("dialog_id", 10002);
                m14695b(bundle);
            }
        } else if (view.getId() == this.f17182l.getId()) {
            if (this.f17173b.f9076c == null) {
                Snackbar.m8770a(this.f17180j, C4522p.m8236a(R.string.please_first_enter_phone_number), 0).m572a();
                return;
            }
            int i2;
            CharSequence a;
            StringBuilder stringBuilder;
            String stringBuilder2;
            getActivity().getLoaderManager().destroyLoader(55);
            m14702f();
            r9 = this.f17173b.f9075b;
            int i3 = (r9 == null || !r9.matches("(\\+98|0)?9\\d{9}")) ? 0 : 1;
            if (i3 == 0) {
                view = this.f17180j;
                i2 = R.string.please_enter_phone_number_correctly;
            } else if (this.f17173b.f9079f == -1) {
                view = this.f17180j;
                a = C4522p.m8236a(R.string.please_select_charge_type);
                Snackbar.m8770a(view, a, 0).m572a();
                if (i != 0) {
                    r9 = (ChargeActivity) getActivity();
                    MyApplication.m12950a().m12960c("CHARGE_REQUEST_CLICK");
                    C4501c.m8189a().m8192a(r9, null);
                    stringBuilder = new StringBuilder("charge_");
                    stringBuilder.append(System.currentTimeMillis());
                    stringBuilder2 = stringBuilder.toString();
                    r9.f24552o = r9.f24550m.f17173b;
                    r9.f24552o.f9074a = stringBuilder2;
                    C2808d.m7147a(new C6814a(r9.f24552o));
                }
            } else if (this.f17173b.f9078e == null) {
                view = this.f17180j;
                i2 = R.string.please_select_charge_amount;
            } else {
                i = 1;
                if (i != 0) {
                    r9 = (ChargeActivity) getActivity();
                    MyApplication.m12950a().m12960c("CHARGE_REQUEST_CLICK");
                    C4501c.m8189a().m8192a(r9, null);
                    stringBuilder = new StringBuilder("charge_");
                    stringBuilder.append(System.currentTimeMillis());
                    stringBuilder2 = stringBuilder.toString();
                    r9.f24552o = r9.f24550m.f17173b;
                    r9.f24552o.f9074a = stringBuilder2;
                    C2808d.m7147a(new C6814a(r9.f24552o));
                }
            }
            a = C4522p.m8236a(i2);
            Snackbar.m8770a(view, a, 0).m572a();
            if (i != 0) {
                r9 = (ChargeActivity) getActivity();
                MyApplication.m12950a().m12960c("CHARGE_REQUEST_CLICK");
                C4501c.m8189a().m8192a(r9, null);
                stringBuilder = new StringBuilder("charge_");
                stringBuilder.append(System.currentTimeMillis());
                stringBuilder2 = stringBuilder.toString();
                r9.f24552o = r9.f24550m.f17173b;
                r9.f24552o.f9074a = stringBuilder2;
                C2808d.m7147a(new C6814a(r9.f24552o));
            }
        } else if (view.getId() == this.f17176f.getId()) {
            r9 = C2535a.m6888a().m6938f();
            this.f17172a.setText(r9);
            m14688a(C2912b.m7286a(r9));
        } else if (view.getId() == this.f17175e.getId()) {
            this.f17172a.setText("");
            r9 = (ChargeActivity) getActivity();
            FragmentTransaction beginTransaction = r9.getFragmentManager().beginTransaction();
            beginTransaction.replace(R.id.container_frame, r9.f24551n);
            beginTransaction.setTransition(4099);
            beginTransaction.commit();
        } else {
            if (view.getId() == this.f17186p.getId()) {
                if (this.f17194x) {
                    m14688a(OperatorType.Irancell);
                    if (this.f17181k != null && this.f17181k.isShowing()) {
                        this.f17181k.dismiss();
                        return;
                    }
                }
                Snackbar.m8770a(this.f17180j, C4522p.m8236a(R.string.please_first_enter_phone_number), 0).m572a();
            } else if (view.getId() == this.f17187q.getId()) {
                if (this.f17194x) {
                    m14688a(OperatorType.HamraheAval);
                    if (this.f17181k != null && this.f17181k.isShowing()) {
                        this.f17181k.dismiss();
                        return;
                    }
                }
                Snackbar.m8770a(this.f17180j, C4522p.m8236a(R.string.please_first_enter_phone_number), 0).m572a();
            } else if (view.getId() == this.f17188r.getId()) {
                if (this.f17194x) {
                    m14688a(OperatorType.Rightel);
                    if (this.f17181k != null && this.f17181k.isShowing()) {
                        this.f17181k.dismiss();
                        return;
                    }
                }
                Snackbar.m8770a(this.f17180j, C4522p.m8236a(R.string.please_first_enter_phone_number), 0).m572a();
            } else if (view.getId() == this.f17192v.getId()) {
                getActivity().getLoaderManager().initLoader(55, null, this.f17196z);
            }
        }
    }

    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(R.menu.menu_history_ref, menu);
        C2491i.m6790a(menu.findItem(R.id.menu_history_icon).getIcon(), UIThemeManager.getmInstance().getIcon_not_selected_color());
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f17180j = layoutInflater.inflate(R.layout.fragment_charge, viewGroup, false);
        this.f17173b = new C2910a();
        this.f17175e = (TextView) this.f17180j.findViewById(R.id.charge_contacts_button);
        this.f17176f = (TextView) this.f17180j.findViewById(R.id.charge_yourself_button);
        this.f17172a = (EditText) this.f17180j.findViewById(R.id.et_charge_phone_number);
        this.f17177g = (RoundAvatarImageView) this.f17180j.findViewById(R.id.profile_avatar);
        this.f17179i = (TextView) this.f17180j.findViewById(R.id.charge_type_btn);
        this.f17178h = (TextView) this.f17180j.findViewById(R.id.charge_amount_btn);
        this.f17182l = (TextView) this.f17180j.findViewById(R.id.charge_accept_text);
        this.f17183m = (ImageView) this.f17180j.findViewById(R.id.charge_type_irancell_icon);
        this.f17184n = (ImageView) this.f17180j.findViewById(R.id.charge_type_mci_icon);
        this.f17185o = (ImageView) this.f17180j.findViewById(R.id.charge_type_rightel_icon);
        this.f17186p = (LinearLayout) this.f17180j.findViewById(R.id.charge_type_irancell_layout);
        this.f17187q = (LinearLayout) this.f17180j.findViewById(R.id.charge_type_mci_layout);
        this.f17188r = (LinearLayout) this.f17180j.findViewById(R.id.charge_type_rightel_layout);
        this.f17189s = (LinearLayout) this.f17180j.findViewById(R.id.operators_layout);
        TextView textView = (TextView) this.f17180j.findViewById(R.id.charge_type_irancell_text);
        TextView textView2 = (TextView) this.f17180j.findViewById(R.id.charge_type_mci_text);
        TextView textView3 = (TextView) this.f17180j.findViewById(R.id.charge_type_rightel_text);
        this.f17190t = (TextView) this.f17180j.findViewById(R.id.charge_operator_title);
        this.f17191u = (TextView) this.f17180j.findViewById(R.id.charge_type_title);
        this.f17193w = (TextView) this.f17180j.findViewById(R.id.charge_amount_title);
        this.f17192v = (TextView) this.f17180j.findViewById(R.id.favorite_charge_btn);
        new Handler().postDelayed(new C45731(this), 100);
        this.f17175e.setOnClickListener(this);
        this.f17176f.setOnClickListener(this);
        this.f17179i.setOnClickListener(this);
        this.f17178h.setOnClickListener(this);
        this.f17182l.setOnClickListener(this);
        this.f17186p.setOnClickListener(this);
        this.f17187q.setOnClickListener(this);
        this.f17188r.setOnClickListener(this);
        this.f17192v.setOnClickListener(this);
        setHasOptionsMenu(true);
        if (C2491i.m6835h(getActivity().getApplicationContext())) {
            textView.setVisibility(8);
            textView2.setVisibility(8);
            textView3.setVisibility(8);
        }
        m14694b();
        this.f17172a.addTextChangedListener(this.f17195y);
        m14686a();
        ((GradientDrawable) this.f17182l.getBackground()).setColor(UIThemeManager.getmInstance().getAccent_color());
        ((GradientDrawable) this.f17175e.getBackground()).setColor(UIThemeManager.getmInstance().getAccent_color());
        ((GradientDrawable) this.f17176f.getBackground()).setColor(UIThemeManager.getmInstance().getAccent_color());
        C2491i.m6796a(this.f17192v, UIThemeManager.getmInstance().getAccent_color());
        return this.f17180j;
    }

    public final void onDestroy() {
        super.onDestroy();
        getActivity().getLoaderManager().destroyLoader(55);
    }
}
