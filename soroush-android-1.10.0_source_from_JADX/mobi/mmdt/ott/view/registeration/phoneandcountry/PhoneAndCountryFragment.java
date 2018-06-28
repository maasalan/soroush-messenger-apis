package mobi.mmdt.ott.view.registeration.phoneandcountry;

import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.text.Editable;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import java.util.Timer;
import java.util.TimerTask;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.view.components.p405e.C3150a;
import mobi.mmdt.ott.view.conversation.p424b.C3406c;
import mobi.mmdt.ott.view.registeration.phoneandcountry.countryselection.components.C4335b;
import mobi.mmdt.ott.view.tools.C4522p;

public class PhoneAndCountryFragment extends C3150a {
    TextView f16959a;
    EditText f16960b;
    boolean f16961c;
    TextWatcher f16962e = new C43221(this);
    private C4325a f16963f;
    private View f16964g;
    private EditText f16965h;
    private TextInputLayout f16966i;
    private String f16967j;
    private String f16968k;
    private String f16969l;
    private TextView f16970m;
    private TextView f16971n;
    private TextView f16972o;
    private String f16973p;
    private boolean f16974q;
    private Timer f16975r;

    class C43221 implements TextWatcher {
        final /* synthetic */ PhoneAndCountryFragment f12146a;
        private String f12147b = "";

        class C43211 extends TimerTask {
            final /* synthetic */ C43221 f12145a;

            class C43201 implements Runnable {
                final /* synthetic */ C43211 f12144a;

                C43201(C43211 c43211) {
                    this.f12144a = c43211;
                }

                public final void run() {
                    this.f12144a.f12145a.f12146a.m14511a(C4335b.m8090a(this.f12144a.f12145a.f12147b));
                }
            }

            C43211(C43221 c43221) {
                this.f12145a = c43221;
            }

            public final void run() {
                this.f12145a.f12146a.f16974q = false;
                this.f12145a.f12146a.getActivity().runOnUiThread(new C43201(this));
            }
        }

        C43221(PhoneAndCountryFragment phoneAndCountryFragment) {
            this.f12146a = phoneAndCountryFragment;
        }

        public final void afterTextChanged(Editable editable) {
            String obj = editable.toString();
            if (!obj.equals(this.f12147b)) {
                this.f12147b = obj;
                if (!this.f12146a.f16974q) {
                    this.f12146a.f16974q = true;
                }
                if (this.f12146a.f16975r != null) {
                    this.f12146a.f16975r.cancel();
                    this.f12146a.f16975r.purge();
                }
                this.f12146a.f16975r = new Timer();
                this.f12146a.f16975r.schedule(new C43211(this), 300);
            }
            if (editable.length() <= 0) {
                this.f12146a.f16965h.setText("+");
                this.f12146a.f16965h.moveCursorToVisibleOffset();
            }
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    class C43232 implements TextWatcher {
        final /* synthetic */ PhoneAndCountryFragment f12148a;

        C43232(PhoneAndCountryFragment phoneAndCountryFragment) {
            this.f12148a = phoneAndCountryFragment;
        }

        public final void afterTextChanged(Editable editable) {
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (this.f12148a.f16960b.getText().toString().matches("^0")) {
                this.f12148a.f16960b.setText("");
            }
        }
    }

    class C43243 implements OnClickListener {
        final /* synthetic */ PhoneAndCountryFragment f12149a;

        C43243(PhoneAndCountryFragment phoneAndCountryFragment) {
            this.f12149a = phoneAndCountryFragment;
        }

        public final void onClick(View view) {
            this.f12149a.f16963f.mo3643g();
        }
    }

    interface C4325a {
        void mo3643g();
    }

    private static void m14509a(TextView textView, String str) {
        textView.setCompoundDrawables(null, null, null, null);
        textView.setTypeface(null, 0);
        textView.setTypeface(textView.getTypeface(), 1);
        textView.setTextSize(20.0f);
        textView.setText(str);
    }

    private static void m14510a(TextView textView, boolean z) {
        textView.setTextSize(15.0f);
        textView.setTypeface(textView.getTypeface(), 0);
        textView.setText("");
        if (z) {
            textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_small_location, 0, 0, 0);
        } else {
            textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_small_location, 0);
        }
        textView.setCompoundDrawablePadding(2);
    }

    private void m14511a(String str) {
        if (m14519f()) {
            m14509a(this.f16959a, str);
            m14510a(this.f16972o, true);
        } else {
            m14509a(this.f16972o, str);
            m14510a(this.f16959a, false);
        }
        this.f16972o.setVisibility(0);
        this.f16959a.setVisibility(0);
        this.f16971n.setText(C4522p.m8236a(R.string.country_hint));
    }

    private boolean m14519f() {
        if (!this.f16973p.equals("fa")) {
            if (!this.f16973p.equals("ar")) {
                return false;
            }
        }
        return true;
    }

    public final void m14520a(String str, String str2) {
        CharSequence charSequence;
        if (str == null) {
            str = "";
        }
        m14511a(str);
        if (str2 == null) {
            charSequence = "";
        }
        if (this.f16961c) {
            charSequence = C2491i.m6814b((String) charSequence);
        }
        this.f16965h.setText(charSequence);
    }

    final boolean m14521a() {
        boolean z;
        if (this.f16959a != null) {
            String b = m14522b();
            if (b.isEmpty() || b.equals(C4522p.m8236a(R.string.look_for_country))) {
                this.f16971n.setText(C4522p.m8236a(R.string.you_must_select_a_country));
                this.f16959a.setVisibility(8);
                this.f16972o.setVisibility(8);
                z = false;
                if (this.f16960b != null) {
                    if (this.f16960b.getText().toString().isEmpty()) {
                        this.f16966i.setErrorEnabled(false);
                        return z;
                    }
                    this.f16966i.setErrorEnabled(true);
                    this.f16966i.setError(C4522p.m8236a(R.string.you_must_select_a_phone_number));
                    z = false;
                }
                return z;
            }
        }
        z = true;
        if (this.f16960b != null) {
            if (this.f16960b.getText().toString().isEmpty()) {
                this.f16966i.setErrorEnabled(true);
                this.f16966i.setError(C4522p.m8236a(R.string.you_must_select_a_phone_number));
                z = false;
            } else {
                this.f16966i.setErrorEnabled(false);
                return z;
            }
        }
        return z;
    }

    final String m14522b() {
        return (m14519f() ? this.f16959a : this.f16972o).getText().toString();
    }

    public final String m14523d() {
        return m14521a() ? this.f16965h.getText().toString() : null;
    }

    public final String m14524e() {
        return m14521a() ? this.f16960b.getText().toString() : null;
    }

    public void onAttach(android.app.Activity r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        super.onAttach(r3);
        r0 = r3;	 Catch:{ ClassCastException -> 0x0009 }
        r0 = (mobi.mmdt.ott.view.registeration.phoneandcountry.PhoneAndCountryFragment.C4325a) r0;	 Catch:{ ClassCastException -> 0x0009 }
        r2.f16963f = r0;	 Catch:{ ClassCastException -> 0x0009 }
        return;
    L_0x0009:
        r0 = new java.lang.ClassCastException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r3 = r3.toString();
        r1.append(r3);
        r3 = " must implement IPhoneAndCountryFragmentCallback.";
        r1.append(r3);
        r3 = r1.toString();
        r0.<init>(r3);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.registeration.phoneandcountry.PhoneAndCountryFragment.onAttach(android.app.Activity):void");
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f16973p = C2535a.m6888a().m6919b();
        this.f16961c = false;
        if (bundle != null) {
            if (bundle.containsKey("KEY_COUNTRY_NAME")) {
                this.f16967j = bundle.getString("KEY_COUNTRY_NAME");
            }
            if (bundle.containsKey("KEY_COUNTRY_CODE")) {
                this.f16968k = bundle.getString("KEY_COUNTRY_CODE");
            }
            if (bundle.containsKey("KEY_PHONE_NUMBER")) {
                this.f16969l = bundle.getString("KEY_PHONE_NUMBER");
            }
        }
        this.f16964g = layoutInflater.inflate(R.layout.fragment_phone_and_country, viewGroup, false);
        return this.f16964g;
    }

    public void onViewCreated(View view, Bundle bundle) {
        TextView textView;
        this.f16970m = (TextView) this.f16964g.findViewById(R.id.text);
        view = this.f16964g.findViewById(R.id.touch_view);
        this.f16959a = (TextView) this.f16964g.findViewById(R.id.country_name_editText);
        this.f16971n = (TextView) this.f16964g.findViewById(R.id.i_am_here);
        this.f16972o = (TextView) this.f16964g.findViewById(R.id.location_drawable);
        if (m14519f()) {
            m14510a(this.f16972o, true);
        } else {
            m14510a(this.f16959a, false);
        }
        this.f16965h = (EditText) this.f16964g.findViewById(R.id.country_code_editText);
        this.f16960b = (EditText) this.f16964g.findViewById(R.id.phone_number_editText);
        this.f16966i = (TextInputLayout) this.f16964g.findViewById(R.id.phone_number_textInputLayout);
        this.f16965h.addTextChangedListener(this.f16962e);
        if (this.f16967j != null) {
            m14511a(this.f16967j);
        }
        if (this.f16968k != null) {
            if (this.f16961c) {
                this.f16968k = C2491i.m6814b(this.f16968k);
            }
            this.f16965h.setText(this.f16968k);
        }
        if (this.f16969l != null) {
            if (this.f16961c) {
                this.f16969l = C2491i.m6814b(this.f16969l);
            }
            this.f16960b.setText(this.f16969l);
        }
        this.f16960b.addTextChangedListener(new C43232(this));
        this.f16960b.setFilters(new InputFilter[]{new LengthFilter(16)});
        view.setOnClickListener(new C43243(this));
        C2491i.m6779a((int) UIThemeManager.color_text_primary_default_theme, (int) UIThemeManager.color_text_primary_new_design_with_opacity_default_theme, (int) UIThemeManager.color_accent_default_theme, this.f16965h, this.f16960b);
        C2491i.m6781a((int) UIThemeManager.color_accent_default_theme, this.f16966i);
        if (m14519f()) {
            C2491i.m6802a(this.f16959a, (int) UIThemeManager.color_accent_default_theme);
            textView = this.f16972o;
        } else {
            C2491i.m6802a(this.f16972o, (int) UIThemeManager.color_accent_default_theme);
            textView = this.f16959a;
        }
        C2491i.m6828c(textView, (int) UIThemeManager.color_text_primary_default_theme);
        C2491i.m6802a(this.f16971n, (int) UIThemeManager.color_text_primary_default_theme);
        C2491i.m6802a(this.f16970m, (int) UIThemeManager.color_text_primary_default_theme);
        C3406c.m7861c(getActivity(), this.f16960b);
    }
}
