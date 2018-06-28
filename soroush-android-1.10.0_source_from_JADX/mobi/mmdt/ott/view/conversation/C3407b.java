package mobi.mmdt.ott.view.conversation;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.support.v4.p029a.C0346c;
import android.support.v7.widget.AppCompatCheckBox;
import android.support.v7.widget.AppCompatEditText;
import android.support.v7.widget.AppCompatRadioButton;
import android.text.Editable;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.TextWatcher;
import android.view.ContextThemeWrapper;
import android.view.ViewGroup.LayoutParams;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.EditText;
import android.widget.RadioButton;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.view.conversation.p418a.C3281b;

public final class C3407b {
    private static Typeface m7862a(Context context) {
        AssetManager assets = context.getAssets();
        StringBuilder stringBuilder = new StringBuilder("fonts/");
        stringBuilder.append(C2535a.m6888a().at());
        return Typeface.createFromAsset(assets, stringBuilder.toString());
    }

    public static CheckBox m7863a(Context context, final String str, final String str2, final boolean z, final C3281b c3281b, boolean z2) {
        CompoundButton appCompatCheckBox;
        int output_button_color;
        if (z2) {
            appCompatCheckBox = new AppCompatCheckBox(new ContextThemeWrapper(context, R.style.colorControlNormalThemeOutput));
            output_button_color = UIThemeManager.getmInstance().getOutput_button_color();
        } else {
            appCompatCheckBox = new AppCompatCheckBox(new ContextThemeWrapper(context, R.style.colorControlNormalThemeInput));
            output_button_color = UIThemeManager.getmInstance().getAccent_color();
        }
        C2491i.m6799a(appCompatCheckBox, output_button_color);
        appCompatCheckBox.setTextSize(0, context.getResources().getDimension(R.dimen.chat_text_size));
        appCompatCheckBox.setTextColor(C0346c.m687c(context, R.color.input_chat_text_color));
        appCompatCheckBox.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                MyApplication.m12950a().m12956a(str).putBoolean(C3407b.m7866a(str, str2), z);
                if (c3281b != null) {
                    c3281b.mo2362a(str, z, z);
                }
            }
        });
        appCompatCheckBox.setTypeface(C3407b.m7862a(context));
        return appCompatCheckBox;
    }

    public static EditText m7864a(Context context, final String str, int i, boolean z) {
        EditText appCompatEditText = z ? new AppCompatEditText(new ContextThemeWrapper(context, R.style.colorControlNormalThemeOutput)) : new AppCompatEditText(new ContextThemeWrapper(context, R.style.colorControlNormalThemeInput));
        appCompatEditText.setTextColor(C0346c.m687c(context, R.color.input_chat_text_color));
        appCompatEditText.setTextSize(0, context.getResources().getDimension(R.dimen.chat_text_size));
        appCompatEditText.setLayoutParams(new LayoutParams(-1, -2));
        appCompatEditText.setFilters(new InputFilter[]{new LengthFilter(i)});
        appCompatEditText.addTextChangedListener(new TextWatcher() {
            final /* synthetic */ int f10395b = 1;

            public final void afterTextChanged(Editable editable) {
                MyApplication.m12950a().m12956a(str).putString(C3407b.m7865a(str, this.f10395b), editable.toString());
            }

            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        });
        appCompatEditText.setTypeface(C3407b.m7862a(context));
        return appCompatEditText;
    }

    public static String m7865a(String str, int i) {
        StringBuilder stringBuilder = new StringBuilder("EDIT_TEXT_");
        stringBuilder.append(str);
        stringBuilder.append("_");
        stringBuilder.append(i);
        return stringBuilder.toString();
    }

    public static String m7866a(String str, String str2) {
        StringBuilder stringBuilder = new StringBuilder("CHECK_BOX_");
        stringBuilder.append(str);
        stringBuilder.append("_");
        stringBuilder.append(str2);
        return stringBuilder.toString();
    }

    public static RadioButton m7867b(Context context, final String str, final String str2, final boolean z, final C3281b c3281b, boolean z2) {
        RadioButton appCompatRadioButton;
        int output_button_color;
        CompoundButton[] compoundButtonArr;
        if (z2) {
            appCompatRadioButton = new AppCompatRadioButton(new ContextThemeWrapper(context, R.style.colorControlNormalThemeOutput));
            output_button_color = UIThemeManager.getmInstance().getOutput_button_color();
            compoundButtonArr = new CompoundButton[]{appCompatRadioButton};
        } else {
            appCompatRadioButton = new AppCompatRadioButton(new ContextThemeWrapper(context, R.style.colorControlNormalThemeInput));
            output_button_color = UIThemeManager.getmInstance().getInput_button_color();
            compoundButtonArr = new CompoundButton[]{appCompatRadioButton};
        }
        C2491i.m6782a(output_button_color, compoundButtonArr);
        appCompatRadioButton.setTextSize(0, context.getResources().getDimension(R.dimen.chat_text_size));
        appCompatRadioButton.setTextColor(C0346c.m687c(context, R.color.input_chat_text_color));
        appCompatRadioButton.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                MyApplication.m12950a().m12956a(str).putBoolean(C3407b.m7868b(str, str2), z);
                if (c3281b != null) {
                    c3281b.mo2362a(str, z, z);
                }
            }
        });
        appCompatRadioButton.setTypeface(C3407b.m7862a(context));
        return appCompatRadioButton;
    }

    public static String m7868b(String str, String str2) {
        StringBuilder stringBuilder = new StringBuilder("RADIO_BUTTON_");
        stringBuilder.append(str);
        stringBuilder.append("_");
        stringBuilder.append(str2);
        return stringBuilder.toString();
    }
}
