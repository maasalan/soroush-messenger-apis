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
import mobi.mmdt.ott.view.conversation.createpoll.p571b.C7342b;
import mobi.mmdt.ott.view.tools.C4522p;

public final class C6881a extends C6073e {
    private AppCompatEditText f19613b = ((AppCompatEditText) this.itemView.findViewById(R.id.editText1));
    private AppCompatImageButton f19614c = ((AppCompatImageButton) this.itemView.findViewById(R.id.imageButton1));
    private TextView f19615d = ((TextView) this.itemView.findViewById(R.id.error_textView));
    private TextWatcher f19616e = new C34662(this);

    class C34662 implements TextWatcher {
        final /* synthetic */ C6881a f10592a;

        C34662(C6881a c6881a) {
            this.f10592a = c6881a;
        }

        public final void afterTextChanged(Editable editable) {
            ((C7342b) this.f10592a.f16244a).f21209b = editable.toString();
            this.f10592a.f19615d.setVisibility(8);
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    public C6881a(LayoutInflater layoutInflater, ViewGroup viewGroup, C3126i c3126i, final C3469b c3469b) {
        super(layoutInflater, viewGroup, R.layout.question_poll_check_box_item, c3126i);
        this.f19614c.setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ C6881a f10591b;

            public final void onClick(View view) {
                c3469b.mo2361a(((C7342b) this.f10591b.f16244a).f20720a);
            }
        });
        this.f19613b.addTextChangedListener(this.f19616e);
        C2491i.m6779a(UIThemeManager.getmInstance().getText_primary_color(), UIThemeManager.getmInstance().getText_primary_new_design_with_opacity_color(), UIThemeManager.getmInstance().getAccent_color(), this.f19613b);
    }

    protected final void mo3180a(C6829g c6829g) {
        C7342b c7342b = (C7342b) c6829g;
        this.f19613b.setText(c7342b.f21209b);
        this.f19613b.requestFocus();
        int i = c7342b.f21210c;
        if (i != 0) {
            if (i != C3457c.f10580e) {
                if (i == C3457c.f10578c) {
                    this.f19615d.setVisibility(0);
                    this.f19615d.setText(C4522p.m8236a(R.string.option_cant_be_empty));
                }
                return;
            }
        }
        this.f19615d.setVisibility(8);
        this.f19615d.setText("");
    }
}
