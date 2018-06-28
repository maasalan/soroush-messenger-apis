package mobi.mmdt.ott.view.contact.p415a;

import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p389k.C2999a;
import mobi.mmdt.ott.provider.p389k.C3001e;
import mobi.mmdt.ott.view.components.p401c.C6073e;
import mobi.mmdt.ott.view.components.p401c.C6074f;
import mobi.mmdt.ott.view.components.p401c.C6075j;
import mobi.mmdt.ott.view.components.p401c.C6075j.C3128a;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.components.p405e.C3150a;
import mobi.mmdt.ott.view.contact.p415a.p416a.C6868a;
import mobi.mmdt.ott.view.contact.p415a.p417b.C6869a;
import mobi.mmdt.ott.view.contact.p415a.p417b.C6870b;
import mobi.mmdt.ott.view.contact.p415a.p417b.C6871c;
import mobi.mmdt.ott.view.contact.p415a.p569c.C7189a;
import mobi.mmdt.ott.view.contact.p415a.p569c.C7337b;
import mobi.mmdt.ott.view.contact.p415a.p569c.C7338c;
import mobi.mmdt.ott.view.contact.p415a.p569c.C7339d;
import mobi.mmdt.ott.view.tools.C4508f;
import p000a.p001a.p002a.C0005c;

public final class C6121a extends C3150a implements C3128a, C3266c {
    LinearLayoutManager f16439a;
    private RecyclerView f16440b;
    private C6868a f16441c;
    private C3260c f16442e;
    private int f16443f = 0;
    private int f16444g = 0;
    private C7338c f16445h;
    private int f16446i = 0;
    private boolean f16447j;
    private C3001e[] f16448k;
    private FrameLayout f16449l;
    private LinearLayout f16450m;
    private boolean f16451n = true;
    private TextView f16452o;
    private View f16453p;

    class C32582 implements Runnable {
        final /* synthetic */ C6121a f10025a;

        C32582(C6121a c6121a) {
            this.f10025a = c6121a;
        }

        public final void run() {
            if (this.f10025a.f16441c != null) {
                this.f10025a.f16441c.notifyDataSetChanged();
            }
        }
    }

    public class C3259b extends AsyncTask<Object, ArrayList, ArrayList> {
        final /* synthetic */ C6121a f10026a;
        private String f10027b = "";

        public C3259b(C6121a c6121a) {
            this.f10026a = c6121a;
        }

        private void m7726a(List<C7189a> list, List<String> list2) {
            List arrayList = new ArrayList();
            for (String str : list2) {
                for (C7189a c7189a : list) {
                    if (c7189a instanceof C7337b) {
                        C7337b c7337b = (C7337b) c7189a;
                        if (c7337b.f21165b.equals(str)) {
                            arrayList.add(c7337b);
                            list.remove(c7337b);
                            if (!C6121a.m13869a().containsKey(str)) {
                                C6121a.m13869a().put(str, Boolean.valueOf(true));
                                this.f10026a.f16443f = this.f10026a.f16443f + 1;
                            }
                            this.f10026a.f16445h.f21175b = this.f10026a.f16443f;
                        }
                    }
                }
            }
            Collections.sort(arrayList);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                list.add(0, arrayList.get(size));
            }
        }

        protected final /* synthetic */ Object doInBackground(Object[] objArr) {
            int i = 0;
            this.f10027b = (String) objArr[0];
            List arrayList = new ArrayList();
            for (String add : C6121a.m13869a().keySet()) {
                String add2;
                arrayList.add(add2);
            }
            List arrayList2 = new ArrayList();
            if (this.f10026a.f16448k == null) {
                add2 = C2535a.m6888a().m6928d();
                List arrayList3 = new ArrayList();
                arrayList3.add(add2);
                this.f10026a.f16448k = C2999a.m7509b(arrayList3);
            }
            if (!this.f10026a.f16451n && this.f10027b.isEmpty()) {
                this.f10026a.f16444g = this.f10026a.f16448k.length;
            }
            this.f10026a.f16445h = new C7338c(this.f10026a.f16444g, this.f10026a.f16443f);
            if (this.f10026a.f16447j) {
                arrayList2.add(this.f10026a.f16445h);
            }
            C3001e[] c;
            int length;
            if (this.f10027b == null || this.f10027b.isEmpty()) {
                c = this.f10026a.f16448k;
                length = c.length;
                while (i < length) {
                    arrayList2.add(C6121a.m13872a(this.f10026a, c[i], this.f10026a.f16447j));
                    i++;
                }
            } else {
                c = this.f10026a.f16448k;
                length = c.length;
                while (i < length) {
                    String a;
                    C3001e c3001e = c[i];
                    if (c3001e.f9422h) {
                        a = C4508f.m8221a(c3001e.f9425k, c3001e.f9420f);
                    } else {
                        a = C4508f.m8220a(c3001e.f9416b);
                    }
                    if (a.toLowerCase().contains(this.f10027b.toLowerCase())) {
                        arrayList2.add(C6121a.m13872a(this.f10026a, c3001e, this.f10026a.f16447j));
                    }
                    i++;
                }
            }
            Collections.sort(arrayList2);
            if (this.f10026a.f16447j && !arrayList.isEmpty()) {
                m7726a(arrayList2, arrayList);
            }
            return arrayList2;
        }

        protected final /* synthetic */ void onPostExecute(Object obj) {
            ArrayList arrayList = (ArrayList) obj;
            super.onPostExecute(arrayList);
            if (this.f10026a.getView() != null) {
                if (this.f10026a.f16441c == null) {
                    this.f10026a.f16441c = new C6868a(this.f10026a, this.f10026a.getActivity());
                }
                this.f10026a.f16441c.m13673a((List) arrayList);
                if ((!this.f10026a.f16447j || arrayList.size() <= 1) && (this.f10026a.f16447j || !arrayList.isEmpty())) {
                    this.f10026a.f16450m.setVisibility(0);
                    if (this.f10027b != null) {
                        if (!this.f10027b.isEmpty()) {
                            this.f10026a.f16449l.setVisibility(8);
                            return;
                        }
                    }
                    this.f10026a.f16449l.setVisibility(0);
                } else {
                    this.f10026a.f16450m.setVisibility(8);
                }
            }
        }
    }

    public interface C3260c {
        void mo3663a(String str);
    }

    public class C6868a extends C6074f {
        final /* synthetic */ C6121a f19583a;

        public C6868a(C6121a c6121a, Context context) {
            this.f19583a = c6121a;
            super(context);
        }

        public final void m17319a(int i, int i2) {
            C7337b c7337b = (C7337b) this.c.remove(i);
            if (i2 > this.c.size()) {
                i2--;
            }
            if (i2 < 0) {
                i2 = 0;
            }
            this.c.add(i2, c7337b);
            notifyItemMoved(i, i2);
        }

        public final void mo3181a(C6073e c6073e, int i) {
            C6829g c6829g = (C6829g) this.c.get(i);
            boolean z = true;
            if (c6073e.getItemViewType() == 1) {
                C7337b c7337b = (C7337b) c6829g;
                boolean containsKey = C6121a.m13869a().containsKey(c7337b.f21165b);
                if (containsKey) {
                    z = ((Boolean) C6121a.m13869a().get(c7337b.f21165b)).booleanValue();
                }
                c7337b.f21172i = z;
                c7337b.f21171h = containsKey;
            } else if (c6073e.getItemViewType() == 2) {
                this.f19583a.f16445h.f21175b = C6121a.m13869a().size();
            }
            super.mo3181a(c6073e, i);
        }

        public final int m17321c(int i) {
            int i2 = 0;
            while (i2 < this.c.size()) {
                if ((this.c.get(i2) instanceof C7337b) && ((C7337b) this.c.get(i2)).f21164a == i) {
                    return i2;
                }
                i2++;
            }
            return -1;
        }

        public final /* synthetic */ void onBindViewHolder(ViewHolder viewHolder, int i) {
            mo3181a((C6073e) viewHolder, i);
        }

        public final /* synthetic */ ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            switch (i) {
                case 1:
                    return new C6869a(this.f19583a.getActivity(), this.f16246b, viewGroup, this.f19583a);
                case 2:
                    return new C6870b(this.f19583a.getActivity(), this.f16246b, viewGroup);
                case 3:
                    return new C6871c(this.f19583a.getActivity(), this.f16246b, viewGroup);
                default:
                    return null;
            }
        }
    }

    public static LinkedHashMap<String, Boolean> m13869a() {
        return MyApplication.m12950a().f15912r;
    }

    static /* synthetic */ C7189a m13872a(C6121a c6121a, C3001e c3001e, boolean z) {
        int i = (int) c3001e.f9415a;
        String str = c3001e.f9418d;
        String a = C4508f.m8221a(c3001e.f9425k, c3001e.f9420f);
        String str2 = c3001e.f9426l;
        String str3 = c3001e.f9429o;
        Uri uri = c3001e.f9427m;
        int b = C2491i.m6806b(c6121a.getActivity(), str);
        return z ? new C7337b(i, str, a, str2, str3, uri, b) : new C7339d(i, str, a, str2, str3, uri, b);
    }

    public final void m13884a(String str) {
        new C3259b(this).execute(new Object[]{str});
    }

    public final void mo2280b(int i) {
    }

    public final void mo2290c(final int i) {
        boolean z;
        int c = this.f16441c.m17321c(i);
        C7337b c7337b = (C7337b) this.f16441c.m13671a(c);
        if (MyApplication.m12950a().f15912r.size() < this.f16444g) {
            MyApplication.m12950a().f15912r.put(c7337b.f21165b, Boolean.valueOf(true));
            z = true;
        } else {
            z = false;
        }
        int i2 = c;
        int i3 = i2;
        while (i2 >= 0) {
            if (!(this.f16441c.m13671a(i2) instanceof C7338c)) {
                if (this.f16441c.m13671a(i2) instanceof C7337b) {
                    C7337b c7337b2 = (C7337b) this.f16441c.m13671a(i2);
                    if (MyApplication.m12950a().f15912r.containsKey(c7337b2.f21165b)) {
                        if (c7337b.f21166c.compareTo(c7337b2.f21166c) < 0) {
                        }
                    }
                }
                i2--;
            }
            i3--;
            i2--;
        }
        this.f16441c.m17319a(c, i3);
        if (z) {
            this.f16443f++;
        }
        C0005c.m0a().m9d(new C6868a(this.f16443f, this.f16444g));
        if (!z) {
            new Handler().postDelayed(new Runnable(this) {
                final /* synthetic */ C6121a f10024b;

                public final void run() {
                    this.f10024b.mo2291d(i);
                }
            }, 500);
            new Handler().postDelayed(new C32582(this), 1000);
            Context activity = getActivity();
            StringBuilder stringBuilder = new StringBuilder("Can not select more than ");
            stringBuilder.append(this.f16444g);
            stringBuilder.append(" contacts!");
            Toast.makeText(activity, stringBuilder.toString(), 0).show();
        }
        if (this.f16447j) {
            ((C7696b) getActivity()).m21198i();
        }
    }

    public final void c_(int i) {
        if (!this.f16447j && i >= 0) {
            this.f16442e.mo3663a(((C7339d) this.f16441c.m13671a(i)).f21176a);
        }
    }

    public final void mo2291d(int i) {
        int i2;
        i = this.f16441c.m17321c(i);
        C7337b c7337b = (C7337b) this.f16441c.m13671a(i);
        if (MyApplication.m12950a().f15912r.containsKey(c7337b.f21165b)) {
            MyApplication.m12950a().f15912r.remove(c7337b.f21165b);
            i2 = 1;
        } else {
            i2 = 0;
        }
        int i3 = i;
        int i4 = i3;
        while (i3 < this.f16441c.getItemCount()) {
            if (!(this.f16441c.m13671a(i3) instanceof C7338c)) {
                if (this.f16441c.m13671a(i3) instanceof C7337b) {
                    C7337b c7337b2 = (C7337b) this.f16441c.m13671a(i3);
                    if (!MyApplication.m12950a().f15912r.containsKey(c7337b2.f21165b)) {
                        if (c7337b.f21166c.compareTo(c7337b2.f21166c) > 0) {
                        }
                    }
                }
                i3++;
            }
            i4++;
            i3++;
        }
        this.f16441c.m17319a(i, i4);
        if (i2 != 0) {
            this.f16443f--;
        }
        C0005c.m0a().m9d(new C6868a(this.f16443f, this.f16444g));
        if (this.f16447j) {
            ((C7696b) getActivity()).m21198i();
        }
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
        r0 = (mobi.mmdt.ott.view.contact.p415a.C6121a.C3260c) r0;	 Catch:{ ClassCastException -> 0x0009 }
        r2.f16442e = r0;	 Catch:{ ClassCastException -> 0x0009 }
        return;
    L_0x0009:
        r0 = new java.lang.ClassCastException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r3 = r3.toString();
        r1.append(r3);
        r3 = " must implement OnCheckableContactsListFragmentInteractionListener";
        r1.append(r3);
        r3 = r1.toString();
        r0.<init>(r3);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.contact.a.a.onAttach(android.app.Activity):void");
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String str = "";
        if (getArguments() != null) {
            if (getArguments().containsKey("KEY_FIRST_COMPLETELY_VISIBLE_ITEM_POSITION")) {
                this.f16446i = getArguments().getInt("KEY_FIRST_COMPLETELY_VISIBLE_ITEM_POSITION");
            }
            if (getArguments().containsKey("KEY_MULTIPLE_CONTACT_SELECTION")) {
                this.f16447j = getArguments().getBoolean("KEY_MULTIPLE_CONTACT_SELECTION");
            }
            if (getArguments().containsKey("KEY_MAXIMUM_CONTACT_SELECTION")) {
                this.f16444g = getArguments().getInt("KEY_MAXIMUM_CONTACT_SELECTION");
            }
            if (getArguments().containsKey("KEY_SEARCH_FILTER")) {
                str = getArguments().getString("KEY_SEARCH_FILTER");
            }
            if (getArguments().containsKey("KEY_IS_CONTACT_SELECTION_LIMIT")) {
                this.f16451n = getArguments().getBoolean("KEY_IS_CONTACT_SELECTION_LIMIT");
            }
        }
        this.f16441c = new C6868a(this, getActivity());
        this.f16443f = MyApplication.m12950a().f15912r.size();
        new C3259b(this).execute(new Object[]{str});
        C2491i.m6802a(this.f16452o, UIThemeManager.getmInstance().getText_primary_color());
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f16453p = layoutInflater.inflate(R.layout.fragment_checkable_contacts_list, viewGroup, false);
        return this.f16453p;
    }

    public final void onDestroyView() {
        if (this.f16440b != null) {
            this.f16440b.setItemAnimator(null);
            this.f16440b.setAdapter(null);
            this.f16440b = null;
        }
        this.f16441c = null;
        super.onDestroyView();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f16440b = (RecyclerView) this.f16453p.findViewById(R.id.recycler_view);
        this.f16450m = (LinearLayout) this.f16453p.findViewById(R.id.empty_state_linearLayout);
        this.f16449l = (FrameLayout) this.f16453p.findViewById(R.id.empty_state_frameLayout_image);
        this.f16452o = (TextView) this.f16453p.findViewById(R.id.empty_state_textView);
        this.f16440b.setHasFixedSize(true);
        this.f16440b.setAdapter(this.f16441c);
        this.f16440b.addOnItemTouchListener(new C6075j(getActivity(), this.f16440b, this));
        this.f16439a = new LinearLayoutManager(getActivity());
        this.f16440b.setLayoutManager(this.f16439a);
        this.f16440b.scrollToPosition(this.f16446i);
        C2491i.m6786a(getActivity(), this.f16449l);
    }
}
