package mobi.mmdt.ott.view.registeration.phoneandcountry.countryselection;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.view.components.p401c.C6075j;
import mobi.mmdt.ott.view.components.p401c.C6075j.C3128a;
import mobi.mmdt.ott.view.components.p405e.C3150a;
import mobi.mmdt.ott.view.registeration.phoneandcountry.countryselection.components.C4335b;
import mobi.mmdt.ott.view.registeration.phoneandcountry.countryselection.components.C6251a;
import mobi.mmdt.ott.view.registeration.phoneandcountry.countryselection.components.C6251a.C4334a;
import mobi.mmdt.ott.view.registeration.phoneandcountry.countryselection.components.LayoutManager;

public final class C6249a extends C3150a implements C3128a {
    TextView f16976a;
    C6251a f16977b;
    final ArrayList<C4334a> f16978c = new ArrayList();
    private C4326a f16979e;
    private View f16980f;
    private RecyclerView f16981g;
    private RelativeLayout f16982h;

    public interface C4326a {
        void mo3679a(String str, String str2);
    }

    static List<C4334a> m14525a(List<C4334a> list) {
        List<C4334a> list2 = list;
        List<C4334a> arrayList = new ArrayList();
        int i = 0;
        int i2 = i;
        int i3 = -1;
        CharSequence charSequence = "";
        int i4 = i2;
        while (i4 < list.size()) {
            CharSequence charSequence2;
            int i5;
            int i6;
            int i7;
            CharSequence substring = ((C4334a) list2.get(i4)).f12167e.substring(0, 1);
            if (TextUtils.equals(charSequence, substring)) {
                charSequence2 = charSequence;
                i5 = i;
                i6 = i3;
                i7 = i2;
            } else {
                i6 = i4 + i;
                i++;
                arrayList.add(new C4334a(substring, "", true, 0, i6, -1));
                i7 = i6;
                i5 = i;
                charSequence2 = substring;
                i6 = 0;
            }
            arrayList.add(new C4334a(((C4334a) list2.get(i4)).f12167e, ((C4334a) list2.get(i4)).f12168f, false, i6, i7, i4));
            i4++;
            i3 = i6;
            i2 = i7;
            charSequence = charSequence2;
            i = i5;
        }
        return arrayList;
    }

    static List<C4334a> m14526a(List<C4334a> list, String str) {
        str = str.toLowerCase();
        List<C4334a> arrayList = new ArrayList();
        for (C4334a c4334a : list) {
            for (String startsWith : c4334a.f12167e.toLowerCase().split(" ")) {
                if (startsWith.startsWith(str)) {
                    arrayList.add(c4334a);
                    break;
                }
            }
        }
        return arrayList;
    }

    public final void mo2280b(int i) {
    }

    public final void c_(int i) {
        if (this.f16977b.m14557a(i).f12165c != -1) {
            this.f16979e.mo3679a(this.f16977b.m14557a(i).f12167e, this.f16977b.m14557a(i).f12168f);
        }
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
        r0 = (mobi.mmdt.ott.view.registeration.phoneandcountry.countryselection.C6249a.C4326a) r0;	 Catch:{ ClassCastException -> 0x0009 }
        r2.f16979e = r0;	 Catch:{ ClassCastException -> 0x0009 }
        return;
    L_0x0009:
        r0 = new java.lang.ClassCastException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r3 = r3.toString();
        r1.append(r3);
        r3 = " must implement ICountrySelectionFragmentCallback.";
        r1.append(r3);
        r3 = r1.toString();
        r0.<init>(r3);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.registeration.phoneandcountry.countryselection.a.onAttach(android.app.Activity):void");
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f16980f = layoutInflater.inflate(R.layout.fragment_country_selection, viewGroup, false);
        return this.f16980f;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f16976a = (TextView) this.f16980f.findViewById(R.id.empty_state_textView);
        this.f16982h = (RelativeLayout) this.f16980f.findViewById(R.id.root_layout);
        this.f16981g = (RecyclerView) this.f16980f.findViewById(R.id.recycler_view);
        this.f16981g.setLayoutManager(new LayoutManager(getActivity()));
        this.f16977b = new C6251a(getActivity(), this.f16981g);
        for (int i = 0; i < C4335b.f12169a.length; i++) {
            this.f16978c.add(new C4334a(C4335b.f12169a[i], C4335b.f12170b[i], false, 0, 0, 0));
        }
        this.f16977b.m14559a(C6249a.m14525a(this.f16978c));
        this.f16981g.addOnItemTouchListener(new C6075j(getActivity(), this.f16981g, this));
        C6251a c6251a = this.f16977b;
        c6251a.f17000b = false;
        c6251a.m14558a();
        C6251a c6251a2 = this.f16977b;
        c6251a2.f16999a = 16;
        c6251a2.m14558a();
        this.f16981g.setAdapter(this.f16977b);
        C2491i.m6802a(this.f16976a, UIThemeManager.getmInstance().getText_primary_color());
    }
}
