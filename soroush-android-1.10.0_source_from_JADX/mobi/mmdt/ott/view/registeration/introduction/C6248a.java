package mobi.mmdt.ott.view.registeration.introduction;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TextView;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.view.components.p405e.C3150a;

public final class C6248a extends C3150a {
    private C4308a f16950a;

    class C43071 implements OnCheckedChangeListener {
        final /* synthetic */ C6248a f12127a;

        C43071(C6248a c6248a) {
            this.f12127a = c6248a;
        }

        public final void onCheckedChanged(RadioGroup radioGroup, int i) {
            if (this.f12127a.f16950a != null) {
                if (i == R.id.english_radioButton) {
                    this.f12127a.f16950a.mo3677c(2);
                } else if (i == R.id.farsi_radioButton) {
                    this.f12127a.f16950a.mo3677c(1);
                }
            }
        }
    }

    interface C4308a {
        void mo3677c(int i);
    }

    public final void onAttach(android.app.Activity r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        super.onAttach(r3);
        r0 = r3;	 Catch:{ ClassCastException -> 0x0009 }
        r0 = (mobi.mmdt.ott.view.registeration.introduction.C6248a.C4308a) r0;	 Catch:{ ClassCastException -> 0x0009 }
        r2.f16950a = r0;	 Catch:{ ClassCastException -> 0x0009 }
        return;
    L_0x0009:
        r0 = new java.lang.ClassCastException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r3 = r3.toString();
        r1.append(r3);
        r3 = " must implement ILanguageFragmentCallback.";
        r1.append(r3);
        r3 = r1.toString();
        r0.<init>(r3);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.registeration.introduction.a.onAttach(android.app.Activity):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        CharSequence string;
        String string2;
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.fragment_introduction_one, viewGroup, false);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.intro_imageView);
        TextView textView = (TextView) inflate.findViewById(R.id.heading_textView);
        TextView textView2 = (TextView) inflate.findViewById(R.id.content);
        textView.setTypeface(textView.getTypeface(), 1);
        CharSequence charSequence = null;
        if (getArguments() != null) {
            i = getArguments().getInt("KEY_IMAGE");
            charSequence = getArguments().getString("KEY_TITLE");
            string = getArguments().getString("KEY_DESCRIPTION");
            string2 = getArguments().getString("KEY_FRAGMENT_TYPE");
        } else {
            i = 0;
            string = null;
            string2 = string;
        }
        imageView.setImageResource(i);
        textView.setText(charSequence);
        textView2.setText(string);
        if (string2 != null && string2.equals("1")) {
            RadioGroup radioGroup = (RadioGroup) inflate.findViewById(R.id.language_content);
            RadioButton radioButton = (RadioButton) inflate.findViewById(R.id.english_radioButton);
            RadioButton radioButton2 = (RadioButton) inflate.findViewById(R.id.farsi_radioButton);
            radioGroup.setVisibility(0);
            C2491i.m6782a((int) UIThemeManager.color_accent_default_theme, radioButton, radioButton2);
            String b = C2535a.m6888a().m6919b();
            int hashCode = b.hashCode();
            if (hashCode != 3259) {
                if (hashCode == 96599618) {
                    if (b.equals("en-us")) {
                        z = true;
                        switch (z) {
                            case false:
                                radioButton2.setChecked(true);
                                break;
                            default:
                                radioButton.setChecked(true);
                                break;
                        }
                        radioGroup.setOnCheckedChangeListener(new C43071(this));
                    }
                }
            } else if (b.equals("fa")) {
                switch (z) {
                    case false:
                        radioButton2.setChecked(true);
                        break;
                    default:
                        radioButton.setChecked(true);
                        break;
                }
                radioGroup.setOnCheckedChangeListener(new C43071(this));
            }
            z = true;
            switch (z) {
                case false:
                    radioButton2.setChecked(true);
                    break;
                default:
                    radioButton.setChecked(true);
                    break;
            }
            radioGroup.setOnCheckedChangeListener(new C43071(this));
        }
        return inflate;
    }
}
