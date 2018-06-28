package mobi.mmdt.ott.view.conversation.createpayment.p429a;

import android.support.v7.widget.AppCompatEditText;
import android.support.v7.widget.AppCompatImageButton;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.view.components.p401c.C3126i;
import mobi.mmdt.ott.view.components.p401c.C6073e;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.conversation.createpayment.C3457c;
import mobi.mmdt.ott.view.conversation.createpayment.p570b.C7341b;
import mobi.mmdt.ott.view.conversation.createpoll.C3469b;
import mobi.mmdt.ott.view.tools.C4522p;

public final class C6879a extends C6073e {
    private TextView f19608b = ((TextView) this.itemView.findViewById(R.id.error_textView));
    private AppCompatEditText f19609c = ((AppCompatEditText) this.itemView.findViewById(R.id.editText1));
    private AppCompatImageButton f19610d = ((AppCompatImageButton) this.itemView.findViewById(R.id.imageButton1));
    private TextWatcher f19611e = new C34552(this);

    class C34552 implements TextWatcher {
        final /* synthetic */ C6879a f10573a;

        C34552(C6879a c6879a) {
            this.f10573a = c6879a;
        }

        public final void afterTextChanged(Editable editable) {
            ((C7341b) this.f10573a.f16244a).f21207b = editable.toString();
            this.f10573a.f19608b.setVisibility(8);
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    public C6879a(LayoutInflater layoutInflater, ViewGroup viewGroup, C3126i c3126i, final C3469b c3469b) {
        super(layoutInflater, viewGroup, R.layout.question_payment_radio_item, c3126i);
        this.f19610d.setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ C6879a f10572b;

            public final void onClick(View view) {
                c3469b.mo2361a(((C7341b) this.f10572b.f16244a).f20719a);
            }
        });
        this.f19609c.addTextChangedListener(this.f19611e);
        C2491i.m6779a(UIThemeManager.getmInstance().getText_primary_color(), UIThemeManager.getmInstance().getText_primary_new_design_with_opacity_color(), UIThemeManager.getmInstance().getAccent_color(), this.f19609c);
    }

    protected final void mo3180a(C6829g c6829g) {
        TextView textView;
        CharSequence a;
        C7341b c7341b = (C7341b) c6829g;
        this.f19609c.setText(c7341b.f21207b);
        this.f19609c.requestFocus();
        int i = c7341b.f21208c;
        if (i != 0) {
            if (i != C3457c.f10580e) {
                int i2;
                if (i == C3457c.f10578c) {
                    this.f19608b.setVisibility(0);
                    textView = this.f19608b;
                    i2 = R.string.amount_cant_be_empty;
                } else if (i == C3457c.f10577b) {
                    this.f19608b.setVisibility(0);
                    textView = this.f19608b;
                    i2 = R.string.the_minimum_amount_is;
                } else {
                    if (i == C3457c.f10576a) {
                        this.f19608b.setVisibility(0);
                        this.f19608b.setText(C4522p.m8236a(R.string.the_maximum_amount_is));
                    }
                    return;
                }
                a = C4522p.m8236a(i2);
                textView.setText(a);
            }
        }
        this.f19608b.setVisibility(8);
        textView = this.f19608b;
        a = "";
        textView.setText(a);
    }
}
