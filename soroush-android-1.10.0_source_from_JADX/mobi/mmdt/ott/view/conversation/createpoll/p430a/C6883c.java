package mobi.mmdt.ott.view.conversation.createpoll.p430a;

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
import mobi.mmdt.ott.view.conversation.createpoll.C3469b;
import mobi.mmdt.ott.view.conversation.createpoll.p571b.C7344d;
import mobi.mmdt.ott.view.tools.C4522p;

public final class C6883c extends C6073e {
    private TextView f19617b = ((TextView) this.itemView.findViewById(R.id.error_textView));
    private AppCompatEditText f19618c = ((AppCompatEditText) this.itemView.findViewById(R.id.editText1));
    private AppCompatImageButton f19619d = ((AppCompatImageButton) this.itemView.findViewById(R.id.imageButton1));
    private TextWatcher f19620e = new C34682(this);

    class C34682 implements TextWatcher {
        final /* synthetic */ C6883c f10595a;

        C34682(C6883c c6883c) {
            this.f10595a = c6883c;
        }

        public final void afterTextChanged(Editable editable) {
            ((C7344d) this.f10595a.f16244a).f21213b = editable.toString();
            this.f10595a.f19617b.setVisibility(8);
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    public C6883c(LayoutInflater layoutInflater, ViewGroup viewGroup, C3126i c3126i, final C3469b c3469b) {
        super(layoutInflater, viewGroup, R.layout.question_poll_radio_item, c3126i);
        this.f19619d.setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ C6883c f10594b;

            public final void onClick(View view) {
                c3469b.mo2361a(((C7344d) this.f10594b.f16244a).f20720a);
            }
        });
        this.f19618c.addTextChangedListener(this.f19620e);
        C2491i.m6779a(UIThemeManager.getmInstance().getText_primary_color(), UIThemeManager.getmInstance().getText_primary_new_design_with_opacity_color(), UIThemeManager.getmInstance().getAccent_color(), this.f19618c);
    }

    protected final void mo3180a(C6829g c6829g) {
        C7344d c7344d = (C7344d) c6829g;
        this.f19618c.setText(c7344d.f21213b);
        this.f19618c.requestFocus();
        int i = c7344d.f21214c;
        if (i != 0) {
            if (i != C3457c.f10580e) {
                if (i == C3457c.f10578c) {
                    this.f19617b.setVisibility(0);
                    this.f19617b.setText(C4522p.m8236a(R.string.option_cant_be_empty));
                }
                return;
            }
        }
        this.f19617b.setVisibility(8);
        this.f19617b.setText("");
    }
}
