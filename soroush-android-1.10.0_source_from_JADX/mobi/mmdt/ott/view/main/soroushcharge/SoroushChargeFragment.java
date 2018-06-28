package mobi.mmdt.ott.view.main.soroushcharge;

import android.app.Dialog;
import android.content.ClipData.Item;
import android.content.Context;
import android.databinding.C0131g;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.app.C0401p;
import android.support.v4.app.Fragment;
import android.support.v7.app.C6389b.C0663a;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.text.ClipboardManager;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.C2808d;
import mobi.mmdt.ott.logic.p261a.ai.p274a.p546b.C6678a;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.p561a.C7158b;
import mobi.mmdt.ott.view.components.p398a.C7176b;
import mobi.mmdt.ott.view.components.p398a.C7176b.C3102a;
import mobi.mmdt.ott.view.components.p401c.C3126i;
import mobi.mmdt.ott.view.components.p401c.C6074f;
import mobi.mmdt.ott.view.components.p405e.C6830b;
import mobi.mmdt.ott.view.tools.C4522p;
import mobi.mmdt.ott.view.vas.payservices.charge.p486b.C6995c;
import mobi.mmdt.ott.view.vas.payservices.charge.p593c.C7236c;

public class SoroushChargeFragment extends C6830b implements C3102a, C3126i {
    private C7158b f20860a;
    private String[] f20861b = new String[]{"10000", "20000", "50000", "1000000"};
    private Dialog f20862c;

    class C42281 implements OnClickListener {
        final /* synthetic */ SoroushChargeFragment f11990a;

        C42281(SoroushChargeFragment soroushChargeFragment) {
            this.f11990a = soroushChargeFragment;
        }

        public final void onClick(View view) {
            Bundle bundle = new Bundle();
            bundle.putInt("dialog_id", 100);
            this.f11990a.m19108k(bundle);
        }
    }

    class C42292 implements OnClickListener {
        final /* synthetic */ SoroushChargeFragment f11991a;

        C42292(SoroushChargeFragment soroushChargeFragment) {
            this.f11991a = soroushChargeFragment;
        }

        public final void onClick(View view) {
            Bundle bundle = new Bundle();
            bundle.putInt("dialog_id", 101);
            this.f11991a.m19108k(bundle);
        }
    }

    private class C6937a extends C6074f {
        final /* synthetic */ SoroushChargeFragment f19823a;

        C6937a(SoroushChargeFragment soroushChargeFragment, Context context) {
            this.f19823a = soroushChargeFragment;
            super(context);
        }

        public final /* synthetic */ ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C6995c(this.f19823a, this.f19823a.m8911k().getLayoutInflater(), viewGroup);
        }
    }

    public final Dialog mo2398a(Bundle bundle) {
        int i = 0;
        switch (bundle.getInt("dialog_id")) {
            case 100:
                List arrayList = new ArrayList();
                while (i < this.f20861b.length) {
                    StringBuilder stringBuilder = new StringBuilder();
                    String str = this.f20861b[i];
                    if (C2535a.m6888a().m6919b().equalsIgnoreCase("fa")) {
                        str = C2491i.m6814b(str);
                    }
                    stringBuilder.append(C2491i.m6776a(str));
                    stringBuilder.append(" ");
                    stringBuilder.append(C4522p.m8236a(R.string.rial));
                    arrayList.add(new C7236c(stringBuilder.toString(), i));
                    i++;
                }
                C0663a c0663a = new C0663a(m8911k(), R.style.AppCompatAlertDialogStyle);
                View inflate = m8911k().getLayoutInflater().inflate(R.layout.dialog_select_charge_type, null);
                m8911k().getWindow().getDecorView().getWindowVisibleDisplayFrame(new Rect());
                c0663a.m1607a(inflate);
                RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.rv_charge_type_dialog);
                recyclerView.setLayoutManager(new LinearLayoutManager(m8911k()));
                Adapter c6937a = new C6937a(this, m8911k());
                c6937a.m13673a(arrayList);
                recyclerView.setAdapter(c6937a);
                this.f20862c = c0663a.m1612a();
                return this.f20862c;
            case 101:
                Context k = m8911k();
                C0663a c0663a2 = new C0663a(k, R.style.AppCompatAlertDialogStyle);
                View inflate2 = k.getLayoutInflater().inflate(R.layout.dialog_apply_charge, null);
                TextView textView = (TextView) inflate2.findViewById(R.id.text_view);
                final TextView textView2 = (TextView) inflate2.findViewById(R.id.error_text_view);
                textView.setTypeface(textView.getTypeface(), 1);
                final EditText editText = (EditText) inflate2.findViewById(R.id.feed_back_edit_text);
                InputMethodManager inputMethodManager = (InputMethodManager) m8911k().getSystemService("input_method");
                if (inputMethodManager != null) {
                    inputMethodManager.toggleSoftInputFromWindow(editText.getWindowToken(), 0, 0);
                }
                editText.setMaxLines(1);
                C2491i.m6780a(UIThemeManager.getmInstance().getText_primary_color(), UIThemeManager.getmInstance().getAccent_color(), editText);
                C2491i.m6800a(editText, 64);
                ((ImageView) inflate2.findViewById(R.id.past_icon)).setOnClickListener(new OnClickListener(this) {
                    final /* synthetic */ SoroushChargeFragment f11993b;

                    public final void onClick(View view) {
                        CharSequence charSequence;
                        if (VERSION.SDK_INT < 11) {
                            ClipboardManager clipboardManager = (ClipboardManager) this.f11993b.m8911k().getSystemService("clipboard");
                            if (clipboardManager != null) {
                                charSequence = clipboardManager.getText() != null ? clipboardManager.getText().toString() : "";
                                if (!charSequence.isEmpty()) {
                                    editText.setText(charSequence);
                                }
                            }
                            return;
                        }
                        android.content.ClipboardManager clipboardManager2 = (android.content.ClipboardManager) this.f11993b.m8911k().getSystemService("clipboard");
                        if (clipboardManager2 != null) {
                            if (clipboardManager2.hasPrimaryClip()) {
                                Item itemAt = clipboardManager2.getPrimaryClip().getItemAt(0);
                                charSequence = itemAt.getText() != null ? itemAt.getText().toString() : null;
                                if (charSequence != null) {
                                    editText.setText(charSequence);
                                    return;
                                }
                            }
                        }
                        Toast.makeText(this.f11993b.m8911k(), "Nothing to Paste", 0).show();
                    }
                });
                AppCompatButton appCompatButton = (AppCompatButton) inflate2.findViewById(R.id.apply_button_);
                AppCompatButton appCompatButton2 = (AppCompatButton) inflate2.findViewById(R.id.cancel_button_);
                TextWatcher c42314 = new TextWatcher(this) {
                    final /* synthetic */ SoroushChargeFragment f11995b;

                    public final void afterTextChanged(Editable editable) {
                    }

                    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                    }

                    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                        textView2.setVisibility(4);
                    }
                };
                editText.requestFocus();
                editText.addTextChangedListener(c42314);
                c0663a2.m1607a(inflate2);
                final Dialog a = c0663a2.m1612a();
                if (a.getWindow() != null) {
                    a.getWindow().setSoftInputMode(4);
                }
                a.show();
                appCompatButton.setOnClickListener(new OnClickListener(this) {
                    final /* synthetic */ SoroushChargeFragment f11998c;

                    public final void onClick(View view) {
                        StringBuilder stringBuilder = new StringBuilder("::>> ");
                        stringBuilder.append(editText.getText().toString());
                        C2480b.m6742f(stringBuilder.toString());
                        a.dismiss();
                    }
                });
                appCompatButton2.setOnClickListener(new OnClickListener(this) {
                    final /* synthetic */ SoroushChargeFragment f12000b;

                    public final void onClick(View view) {
                        a.dismiss();
                    }
                });
                return a;
            default:
                return null;
        }
    }

    public final View mo3056a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f20860a = (C7158b) C0131g.m207a(layoutInflater, viewGroup);
        this.ak = this.f20860a.f20511k;
        m17263a(m8911k(), -1);
        m17262S();
        int accent_color = UIThemeManager.getmInstance().getAccent_color();
        String b = C2535a.m6888a().m6919b();
        C2491i.m6796a(this.f20860a.f20512l, UIThemeManager.getmInstance().getAccent_color());
        TextView textView = this.f20860a.f20508h;
        textView.setTypeface(textView.getTypeface(), 1);
        textView = this.f20860a.f20509i;
        CharSequence charSequence = "آخرین بازدید : 10/09/1396";
        if (b.equals("fa") || b.equals("ar")) {
            charSequence = C2491i.m6814b((String) charSequence);
        }
        textView.setText(charSequence);
        C2491i.m6802a(this.f20860a.f20510j, UIThemeManager.getmInstance().getText_primary_color());
        Button button = this.f20860a.f20506f;
        Button button2 = this.f20860a.f20504d;
        C2491i.m6819b(button, accent_color);
        C2491i.m6819b(button2, accent_color);
        button.setOnClickListener(new C42281(this));
        button2.setOnClickListener(new C42292(this));
        this.ak.setTitle((CharSequence) "");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        C2808d.m7147a(new C6678a());
        return this.f20860a.f17291b;
    }

    public final void mo2482c() {
        super.mo2482c();
    }

    public final void mo2234c(int i) {
        if (this.f20862c != null && this.f20862c.isShowing()) {
            this.f20862c.dismiss();
        }
    }

    public final void mo2235d(int i) {
    }

    protected final void m19108k(Bundle bundle) {
        Fragment a = C7176b.m18967a(bundle, this);
        C0401p a2 = m8911k().m19188c().mo254a();
        a2.mo237a(a, "tag");
        a2.mo244d();
    }

    public final void mo3060v() {
        super.mo3060v();
        this.ak.setTitle((CharSequence) "");
    }
}
