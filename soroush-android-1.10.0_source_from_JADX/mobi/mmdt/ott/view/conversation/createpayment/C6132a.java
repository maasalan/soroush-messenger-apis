package mobi.mmdt.ott.view.conversation.createpayment;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import java.util.ArrayList;
import java.util.List;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.view.components.p401c.C3126i;
import mobi.mmdt.ott.view.components.p401c.C6074f;
import mobi.mmdt.ott.view.components.p405e.C3150a;
import mobi.mmdt.ott.view.conversation.createpayment.p429a.C6879a;
import mobi.mmdt.ott.view.conversation.createpayment.p570b.C7192a;
import mobi.mmdt.ott.view.conversation.createpayment.p570b.C7341b;
import mobi.mmdt.ott.view.conversation.createpoll.C3469b;

public final class C6132a extends C3150a implements C3126i, C3469b {
    C6879a f16594a;
    RecyclerView f16595b;
    Button f16596c;
    EditText f16597e;
    TextInputLayout f16598f;
    TextInputLayout f16599g;
    C6878b f16600h;
    int f16601i = C3456b.f10574a;
    private View f16602j;
    private OnClickListener f16603k = new C34511(this);

    class C34511 implements OnClickListener {
        final /* synthetic */ C6132a f10569a;

        C34511(C6132a c6132a) {
            this.f10569a = c6132a;
        }

        public final void onClick(View view) {
            long currentTimeMillis = System.currentTimeMillis();
            if (C34522.f10570a[this.f10569a.f16601i - 1] == 1) {
                this.f10569a.f16600h.m13675a(new C7341b("", currentTimeMillis), this.f10569a.f16600h.getItemCount());
            }
        }
    }

    static /* synthetic */ class C34522 {
        static final /* synthetic */ int[] f10570a = new int[C3456b.m7885a().length];

        static {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r0 = mobi.mmdt.ott.view.conversation.createpayment.C3456b.m7885a();
            r0 = r0.length;
            r0 = new int[r0];
            f10570a = r0;
            r0 = f10570a;	 Catch:{ NoSuchFieldError -> 0x0011 }
            r1 = mobi.mmdt.ott.view.conversation.createpayment.C3456b.f10574a;	 Catch:{ NoSuchFieldError -> 0x0011 }
            r2 = 1;	 Catch:{ NoSuchFieldError -> 0x0011 }
            r1 = r1 - r2;	 Catch:{ NoSuchFieldError -> 0x0011 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0011 }
        L_0x0011:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.conversation.createpayment.a.2.<clinit>():void");
        }
    }

    public interface C6879a {
        void mo3665a(String str, ArrayList<String> arrayList);
    }

    private class C6878b extends C6074f {
        final /* synthetic */ C6132a f19607a;

        public C6878b(C6132a c6132a, Context context) {
            this.f19607a = c6132a;
            super(context);
        }

        public final /* synthetic */ ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return i != 1001 ? null : new C6879a(this.f16246b, viewGroup, this.f19607a, this.f19607a);
        }
    }

    final ArrayList<String> m14114a() {
        ArrayList<String> arrayList = new ArrayList();
        if (C34522.f10570a[this.f16601i - 1] != 1) {
            return arrayList;
        }
        for (int i = 0; i < this.f16600h.getItemCount(); i++) {
            Object obj = ((C7341b) this.f16600h.m13671a(i)).f21207b;
            if (obj == null) {
                obj = "";
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    public final void mo2361a(long j) {
        int i = 0;
        int i2 = 0;
        while (i < this.f16600h.getItemCount()) {
            if (((C7192a) this.f16600h.m13671a(i)).f20719a == j) {
                i2 = i;
            }
            i++;
        }
        this.f16600h.m13676b(i2);
        this.f16595b.setAdapter(this.f16600h);
    }

    public final void mo2234c(int i) {
    }

    public final void mo2235d(int i) {
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
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
        r0 = (mobi.mmdt.ott.view.conversation.createpayment.C6132a.C6879a) r0;	 Catch:{ ClassCastException -> 0x0009 }
        r2.f16594a = r0;	 Catch:{ ClassCastException -> 0x0009 }
        return;
    L_0x0009:
        r0 = new java.lang.ClassCastException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r3 = r3.toString();
        r1.append(r3);
        r3 = " must implement ICreatePaymentFragmentInteractionListener";
        r1.append(r3);
        r3 = r1.toString();
        r0.<init>(r3);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.conversation.createpayment.a.onAttach(android.app.Activity):void");
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f16602j = layoutInflater.inflate(R.layout.fragment_create_payment, viewGroup, false);
        return this.f16602j;
    }

    public final void onDestroyView() {
        super.onDestroyView();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f16596c = (Button) this.f16602j.findViewById(R.id.add_item_button);
        this.f16597e = (EditText) this.f16602j.findViewById(R.id.question_editText);
        this.f16598f = (TextInputLayout) this.f16602j.findViewById(R.id.question_textInputLayout);
        this.f16599g = (TextInputLayout) this.f16602j.findViewById(R.id.question_type_textInputLayout);
        this.f16596c.setOnClickListener(this.f16603k);
        this.f16600h = new C6878b(this, getActivity());
        this.f16595b = (RecyclerView) this.f16602j.findViewById(R.id.recycler_view);
        this.f16595b.setHasFixedSize(false);
        this.f16595b.setNestedScrollingEnabled(false);
        this.f16595b.setAdapter(this.f16600h);
        this.f16595b.setLayoutManager(new LinearLayoutManager(getActivity()));
        if (getArguments() != null) {
            Bundle arguments = getArguments();
            CharSequence string = arguments.getString("KEY_QUESTION_STRING");
            ArrayList stringArrayList = arguments.getStringArrayList("KEY_OPTION_TITLES_STRING_ARRAY_LIST");
            this.f16597e.setText(string);
            if (C34522.f10570a[this.f16601i - 1] == 1) {
                List arrayList = new ArrayList();
                if (stringArrayList != null) {
                    for (int i = 0; i < stringArrayList.size(); i++) {
                        arrayList.add(new C7341b((String) stringArrayList.get(i), System.currentTimeMillis()));
                    }
                }
                this.f16600h.m13673a(arrayList);
            }
        }
        C2491i.m6819b(this.f16596c, UIThemeManager.getmInstance().getAccent_color());
        C2491i.m6798a(this.f16596c, UIThemeManager.getmInstance().getButton_text_color());
        C2491i.m6779a(UIThemeManager.getmInstance().getText_primary_color(), UIThemeManager.getmInstance().getText_primary_new_design_with_opacity_color(), UIThemeManager.getmInstance().getAccent_color(), this.f16597e);
        C2491i.m6781a(UIThemeManager.getmInstance().getAccent_color(), this.f16598f);
    }
}
