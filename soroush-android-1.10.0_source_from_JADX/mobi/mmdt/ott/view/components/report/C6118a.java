package mobi.mmdt.ott.view.components.report;

import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.C2808d;
import mobi.mmdt.ott.logic.p261a.ab.C2582a;
import mobi.mmdt.ott.logic.p261a.ab.p542a.C6649a;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.provider.p384f.C2973m;
import mobi.mmdt.ott.view.components.p405e.C3150a;
import mobi.mmdt.ott.view.main.C4144a;
import mobi.mmdt.ott.view.tools.C4522p;

public final class C6118a extends C3150a {
    private View f16425a;
    private Button f16426b;
    private LinearLayout f16427c;
    private EditText f16428e;
    private String f16429f = "";
    private TextInputLayout f16430g;
    private String f16431h;
    private C2973m f16432i;

    class C32361 implements TextWatcher {
        final /* synthetic */ C6118a f9966a;

        C32361(C6118a c6118a) {
            this.f9966a = c6118a;
        }

        public final void afterTextChanged(Editable editable) {
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (this.f9966a.f16430g.f1098b) {
                this.f9966a.f16430g.setErrorEnabled(false);
            }
        }
    }

    class C32372 implements OnClickListener {
        final /* synthetic */ C6118a f9967a;

        C32372(C6118a c6118a) {
            this.f9967a = c6118a;
        }

        public final void onClick(View view) {
            C6118a.m13859b(this.f9967a);
        }
    }

    static /* synthetic */ void m13859b(C6118a c6118a) {
        if (c6118a.f16428e != null) {
            if (c6118a.f16428e.getText().toString().isEmpty()) {
                c6118a.f16430g.setErrorEnabled(true);
                c6118a.f16430g.setError(C4522p.m8236a(R.string.description_can_t_be_empty_));
                C4144a.m8005a(c6118a.f16430g);
            } else {
                C2808d.m7148b(new C6649a(c6118a.f16432i, c6118a.f16431h, C2582a.REPORT_OTHER, c6118a.f16428e.getText().toString()));
                c6118a.getActivity().setResult(10);
                c6118a.getActivity().finish();
                c6118a.getActivity().overridePendingTransition(R.anim.anim_slide_in_right, R.anim.anim_slide_out_right);
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f16425a = layoutInflater.inflate(R.layout.fragment_report, viewGroup, false);
        return this.f16425a;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        if (!(this.f16428e == null || this.f16428e.getText().toString().isEmpty())) {
            bundle.putString("ROTATE_TEXT", this.f16428e.getText().toString());
        }
        super.onSaveInstanceState(bundle);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f16427c = (LinearLayout) this.f16425a.findViewById(R.id.linearLayout);
        this.f16430g = (TextInputLayout) this.f16425a.findViewById(R.id.description_textInputLayout);
        this.f16428e = (EditText) this.f16425a.findViewById(R.id.description_editText);
        this.f16428e.addTextChangedListener(new C32361(this));
        this.f16426b = (Button) this.f16425a.findViewById(R.id.send);
        this.f16426b.setText(C4522p.m8236a(R.string.send));
        this.f16426b.setOnClickListener(new C32372(this));
        if (bundle != null) {
            this.f16428e.setText(bundle.getString("ROTATE_TEXT", ""));
        }
        if (getArguments() != null) {
            Bundle arguments = getArguments();
            this.f16431h = arguments.getString("KEY_BUNDLE_PEER_PARTY");
            this.f16432i = C2973m.values()[arguments.getInt("KEY_BUNDLE_GROUP_TYPE")];
        }
        C2491i.m6819b(this.f16426b, UIThemeManager.getmInstance().getAccent_color());
        C2491i.m6798a(this.f16426b, UIThemeManager.getmInstance().getButton_text_color());
        C2491i.m6780a(UIThemeManager.getmInstance().getText_primary_color(), UIThemeManager.getmInstance().getAccent_color(), this.f16428e);
        C2491i.m6781a(UIThemeManager.getmInstance().getAccent_color(), this.f16430g);
    }
}
