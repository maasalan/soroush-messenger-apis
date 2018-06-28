package mobi.mmdt.ott.view.registeration.activationcode;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.widget.AppCompatButton;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.C2808d;
import mobi.mmdt.ott.logic.p261a.p332z.p336b.p338b.C6798f;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.view.components.p405e.C3150a;
import mobi.mmdt.ott.view.conversation.p424b.C3406c;
import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;

public class ActivationCodeFragment extends C3150a {
    EditText f16935a;
    boolean f16936b = false;
    boolean f16937c;
    TextView f16938e;
    String f16939f;
    private int f16940g = 16;
    private C4301a f16941h;
    private View f16942i;
    private TextView f16943j;
    private TextView f16944k;
    private boolean f16945l = false;
    private AppCompatButton f16946m;
    private AppCompatButton f16947n;
    private AppCompatButton f16948o;

    class C42941 implements OnClickListener {
        final /* synthetic */ ActivationCodeFragment f12116a;

        C42941(ActivationCodeFragment activationCodeFragment) {
            this.f12116a = activationCodeFragment;
        }

        public final void onClick(View view) {
            if (!this.f12116a.f16945l && !this.f12116a.f16936b) {
                this.f12116a.f16936b = true;
                this.f12116a.f16941h.mo3676h();
            }
        }
    }

    class C42952 implements OnClickListener {
        final /* synthetic */ ActivationCodeFragment f12117a;

        C42952(ActivationCodeFragment activationCodeFragment) {
            this.f12117a = activationCodeFragment;
        }

        public final void onClick(View view) {
            this.f12117a.f16944k.setVisibility(8);
            this.f12117a.f16943j.setVisibility(0);
            this.f12117a.f16936b = false;
            this.f12117a.f16940g = 16;
            this.f12117a.m14490a();
            C2808d.m7148b(new C6798f(this.f12117a.f16939f.substring(1)));
        }
    }

    class C42963 implements OnClickListener {
        final /* synthetic */ ActivationCodeFragment f12118a;

        C42963(ActivationCodeFragment activationCodeFragment) {
            this.f12118a = activationCodeFragment;
        }

        public final void onClick(View view) {
            this.f12118a.f16941h.mo3643g();
        }
    }

    class C42974 implements OnClickListener {
        final /* synthetic */ ActivationCodeFragment f12119a;

        C42974(ActivationCodeFragment activationCodeFragment) {
            this.f12119a = activationCodeFragment;
        }

        public final void onClick(View view) {
            this.f12119a.f16941h.mo3643g();
        }
    }

    class C42985 implements TextWatcher {
        final /* synthetic */ ActivationCodeFragment f12120a;

        C42985(ActivationCodeFragment activationCodeFragment) {
            this.f12120a = activationCodeFragment;
        }

        public final void afterTextChanged(Editable editable) {
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (this.f12120a.f16935a.length() == 5 && this.f12120a.getActivity() != null) {
                ((ActivationCodeActivity) this.f12120a.getActivity()).m21345i();
            }
        }
    }

    class C42996 implements Runnable {
        final /* synthetic */ ActivationCodeFragment f12121a;

        C42996(ActivationCodeFragment activationCodeFragment) {
            this.f12121a = activationCodeFragment;
        }

        public final void run() {
            this.f12121a.f16936b = false;
            this.f12121a.f16940g = 16;
            this.f12121a.f16943j.setVisibility(0);
            this.f12121a.f16944k.setVisibility(8);
            this.f12121a.m14490a();
        }
    }

    public interface C4301a {
        void mo3643g();

        void mo3676h();
    }

    private void m14490a() {
        if (this.f16940g != 1) {
            this.f16948o.setVisibility(8);
            this.f16945l = true;
            new CountDownTimer(this, (long) (this.f16940g * IjkMediaCodecInfo.RANK_MAX)) {
                final /* synthetic */ ActivationCodeFragment f12122a;

                public final void onFinish() {
                }

                public final void onTick(long j) {
                    int i = ((int) (j / 1000)) - 1;
                    this.f12122a.f16940g = i + 1;
                    StringBuilder stringBuilder = i < 10 ? new StringBuilder("00 : 0") : new StringBuilder("00 : ");
                    stringBuilder.append(i);
                    CharSequence stringBuilder2 = stringBuilder.toString();
                    if (this.f12122a.f16937c) {
                        stringBuilder2 = C2491i.m6814b((String) stringBuilder2);
                    }
                    this.f12122a.f16943j.setText(stringBuilder2);
                    if (i == 0) {
                        this.f12122a.m14492b();
                    }
                }
            }.start();
            return;
        }
        m14492b();
    }

    private void m14492b() {
        this.f16945l = false;
        this.f16944k.setVisibility(0);
        this.f16943j.setVisibility(8);
        this.f16948o.setVisibility(0);
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
        r0 = (mobi.mmdt.ott.view.registeration.activationcode.ActivationCodeFragment.C4301a) r0;	 Catch:{ ClassCastException -> 0x0009 }
        r2.f16941h = r0;	 Catch:{ ClassCastException -> 0x0009 }
        return;
    L_0x0009:
        r0 = new java.lang.ClassCastException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r3 = r3.toString();
        r1.append(r3);
        r3 = " must implement IActivationCodeFragmentCallback.";
        r1.append(r3);
        r3 = r1.toString();
        r0.<init>(r3);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.registeration.activationcode.ActivationCodeFragment.onAttach(android.app.Activity):void");
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f16937c = C2535a.m6888a().m6919b().equals("fa");
        this.f16942i = layoutInflater.inflate(R.layout.fragment_activation_code, viewGroup, false);
        return this.f16942i;
    }

    public void onViewCreated(View view, Bundle bundle) {
        this.f16935a = (EditText) this.f16942i.findViewById(R.id.activationCode_editText);
        this.f16943j = (TextView) this.f16942i.findViewById(R.id.counter);
        this.f16938e = (TextView) this.f16942i.findViewById(R.id.title_text_view);
        this.f16948o = (AppCompatButton) this.f16942i.findViewById(R.id.ivr);
        this.f16944k = (TextView) this.f16942i.findViewById(R.id.resend_sms);
        this.f16944k.setVisibility(8);
        this.f16947n = (AppCompatButton) this.f16942i.findViewById(R.id.incorrect_number_button_en);
        this.f16946m = (AppCompatButton) this.f16942i.findViewById(R.id.incorrect_number_button);
        if (this.f16937c) {
            this.f16947n.setVisibility(8);
            this.f16946m.setVisibility(0);
        } else {
            this.f16947n.setVisibility(0);
            this.f16946m.setVisibility(8);
        }
        m14490a();
        this.f16948o.setOnClickListener(new C42941(this));
        this.f16944k.setOnClickListener(new C42952(this));
        this.f16946m.setOnClickListener(new C42963(this));
        this.f16947n.setOnClickListener(new C42974(this));
        C2491i.m6779a((int) UIThemeManager.color_text_primary_default_theme, (int) UIThemeManager.color_text_primary_new_design_with_opacity_default_theme, (int) UIThemeManager.color_accent_default_theme, this.f16935a);
        C2491i.m6798a(this.f16946m, (int) UIThemeManager.color_accent_default_theme);
        C2491i.m6798a(this.f16947n, (int) UIThemeManager.color_accent_default_theme);
        C2491i.m6798a(this.f16948o, (int) UIThemeManager.color_text_primary_default_theme);
        this.f16935a.addTextChangedListener(new C42985(this));
        C3406c.m7861c(getActivity(), this.f16935a);
    }
}
