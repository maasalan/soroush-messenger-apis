package mobi.mmdt.ott.view.conversation.createpoll;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.widget.AppCompatSpinner;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import java.util.ArrayList;
import java.util.List;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.poll.base.PollType;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.view.components.p401c.C3126i;
import mobi.mmdt.ott.view.components.p401c.C6074f;
import mobi.mmdt.ott.view.components.p405e.C3150a;
import mobi.mmdt.ott.view.conversation.createpayment.C3457c;
import mobi.mmdt.ott.view.conversation.createpoll.p430a.C6881a;
import mobi.mmdt.ott.view.conversation.createpoll.p430a.C6883c;
import mobi.mmdt.ott.view.conversation.createpoll.p571b.C7193a;
import mobi.mmdt.ott.view.conversation.createpoll.p571b.C7342b;
import mobi.mmdt.ott.view.conversation.createpoll.p571b.C7344d;
import mobi.mmdt.ott.view.tools.C4522p;

public final class C6133a extends C3150a implements C3126i, C3469b {
    C6881a f16604a;
    AppCompatSpinner f16605b;
    RecyclerView f16606c;
    Button f16607e;
    CheckBox f16608f;
    EditText f16609g;
    TextInputLayout f16610h;
    TextInputLayout f16611i;
    C6882b f16612j;
    int f16613k = C3470c.f10596a;
    private View f16614l;
    private C3472e f16615m;
    private LinearLayoutManager f16616n;
    private OnItemSelectedListener f16617o = new C34611(this);
    private OnClickListener f16618p = new C34622(this);

    class C34611 implements OnItemSelectedListener {
        final /* synthetic */ C6133a f10587a;

        C34611(C6133a c6133a) {
            this.f10587a = c6133a;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onItemSelected(android.widget.AdapterView<?> r7, android.view.View r8, int r9, long r10) {
            /*
            r6 = this;
            r7 = mobi.mmdt.ott.view.conversation.createpoll.C3470c.m7888a();
            r7 = r7[r9];
            r8 = mobi.mmdt.ott.view.conversation.createpoll.C6133a.C34633.f10589a;
            r9 = r6.f10587a;
            r9 = r9.f16613k;
            r10 = 1;
            r9 = r9 - r10;
            r8 = r8[r9];
            r9 = 8;
            r11 = 0;
            switch(r8) {
                case 1: goto L_0x009d;
                case 2: goto L_0x0042;
                case 3: goto L_0x001a;
                default: goto L_0x0018;
            };
        L_0x0018:
            goto L_0x00e1;
        L_0x001a:
            r8 = mobi.mmdt.ott.view.conversation.createpoll.C6133a.C34633.f10589a;
            r9 = r7 + -1;
            r8 = r8[r9];
            switch(r8) {
                case 1: goto L_0x0025;
                case 2: goto L_0x0025;
                default: goto L_0x0023;
            };
        L_0x0023:
            goto L_0x00e1;
        L_0x0025:
            r8 = r6.f10587a;
            r8 = r8.f16612j;
            r8.m13672a();
            r8 = r6.f10587a;
            r8 = r8.f16607e;
            r8.setVisibility(r11);
            r8 = r6.f10587a;
            r8 = r8.f16608f;
            r8.setVisibility(r11);
            goto L_0x00e1;
        L_0x0042:
            r8 = mobi.mmdt.ott.view.conversation.createpoll.C6133a.C34633.f10589a;
            r0 = r7 + -1;
            r8 = r8[r0];
            if (r8 == r10) goto L_0x006c;
        L_0x004a:
            r10 = 3;
            if (r8 == r10) goto L_0x004f;
        L_0x004d:
            goto L_0x00e1;
        L_0x004f:
            r8 = r6.f10587a;
            r8 = r8.f16612j;
            r8.m13672a();
            r8 = r6.f10587a;
            r8 = r8.f16607e;
            r8.setVisibility(r9);
            r8 = r6.f10587a;
            r8 = r8.f16608f;
            r8.setVisibility(r9);
            goto L_0x00e1;
        L_0x006c:
            r8 = new java.util.ArrayList;
            r8.<init>();
        L_0x0071:
            r9 = r6.f10587a;
            r9 = r9.f16612j;
            r9 = r9.getItemCount();
            if (r11 >= r9) goto L_0x00d8;
        L_0x007d:
            r9 = r6.f10587a;
            r9 = r9.f16612j;
            r9 = r9.m13671a(r11);
            r9 = (mobi.mmdt.ott.view.conversation.createpoll.p571b.C7344d) r9;
            r10 = new mobi.mmdt.ott.view.conversation.createpoll.b.b;
            r1 = r9.f21213b;
            r2 = r9.f20720a;
            r4 = r9.f19504k;
            r5 = mobi.mmdt.ott.view.conversation.createpayment.C3457c.f10580e;
            r0 = r10;
            r0.<init>(r1, r2, r4, r5);
            r8.add(r10);
            r11 = r11 + 1;
            goto L_0x0071;
        L_0x009d:
            r8 = mobi.mmdt.ott.view.conversation.createpoll.C6133a.C34633.f10589a;
            r10 = r7 + -1;
            r8 = r8[r10];
            switch(r8) {
                case 2: goto L_0x00a7;
                case 3: goto L_0x004f;
                default: goto L_0x00a6;
            };
        L_0x00a6:
            goto L_0x00e1;
        L_0x00a7:
            r8 = new java.util.ArrayList;
            r8.<init>();
        L_0x00ac:
            r9 = r6.f10587a;
            r9 = r9.f16612j;
            r9 = r9.getItemCount();
            if (r11 >= r9) goto L_0x00d8;
        L_0x00b8:
            r9 = r6.f10587a;
            r9 = r9.f16612j;
            r9 = r9.m13671a(r11);
            r9 = (mobi.mmdt.ott.view.conversation.createpoll.p571b.C7342b) r9;
            r10 = new mobi.mmdt.ott.view.conversation.createpoll.b.d;
            r1 = r9.f21209b;
            r2 = r9.f20720a;
            r4 = r9.f19504k;
            r5 = mobi.mmdt.ott.view.conversation.createpayment.C3457c.f10580e;
            r0 = r10;
            r0.<init>(r1, r2, r4, r5);
            r8.add(r10);
            r11 = r11 + 1;
            goto L_0x00ac;
        L_0x00d8:
            r9 = r6.f10587a;
            r9 = r9.f16612j;
            r9.m13673a(r8);
        L_0x00e1:
            r8 = r6.f10587a;
            r8.f16613k = r7;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.conversation.createpoll.a.1.onItemSelected(android.widget.AdapterView, android.view.View, int, long):void");
        }

        public final void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    class C34622 implements OnClickListener {
        final /* synthetic */ C6133a f10588a;

        C34622(C6133a c6133a) {
            this.f10588a = c6133a;
        }

        public final void onClick(android.view.View r8) {
            /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:9:0x0062 in {2, 4, 5, 7, 8} preds:[]
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:129)
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:48)
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:38)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
            /*
            r7 = this;
            r2 = java.lang.System.currentTimeMillis();
            r8 = mobi.mmdt.ott.view.conversation.createpoll.C6133a.C34633.f10589a;
            r0 = r7.f10588a;
            r0 = r0.f16613k;
            r0 = r0 + -1;
            r8 = r8[r0];
            switch(r8) {
                case 1: goto L_0x0050;
                case 2: goto L_0x0031;
                case 3: goto L_0x0014;
                default: goto L_0x0013;
            };
        L_0x0013:
            return;
        L_0x0014:
            r8 = r7.f10588a;
            r8 = r8.f16612j;
            r0 = new mobi.mmdt.ott.view.conversation.createpoll.b.c;
            r1 = "";
            r4 = mobi.mmdt.ott.view.conversation.createpayment.C3457c.f10580e;
            r0.<init>(r1, r2, r4);
            r1 = r7.f10588a;
            r1 = r1.f16612j;
            r1 = r1.getItemCount();
            r8.m13675a(r0, r1);
            return;
        L_0x0031:
            r8 = r7.f10588a;
            r8 = r8.f16612j;
            r6 = new mobi.mmdt.ott.view.conversation.createpoll.b.d;
            r1 = "";
            r4 = 0;
            r5 = mobi.mmdt.ott.view.conversation.createpayment.C3457c.f10580e;
            r0 = r6;
            r0.<init>(r1, r2, r4, r5);
        L_0x0042:
            r0 = r7.f10588a;
            r0 = r0.f16612j;
            r0 = r0.getItemCount();
            r8.m13675a(r6, r0);
            return;
        L_0x0050:
            r8 = r7.f10588a;
            r8 = r8.f16612j;
            r6 = new mobi.mmdt.ott.view.conversation.createpoll.b.b;
            r1 = "";
            r4 = 0;
            r5 = mobi.mmdt.ott.view.conversation.createpayment.C3457c.f10580e;
            r0 = r6;
            r0.<init>(r1, r2, r4, r5);
            goto L_0x0042;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.conversation.createpoll.a.2.onClick(android.view.View):void");
        }
    }

    static /* synthetic */ class C34633 {
        static final /* synthetic */ int[] f10589a = new int[C3470c.m7888a().length];

        static {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r0 = mobi.mmdt.ott.view.conversation.createpoll.C3470c.m7888a();
            r0 = r0.length;
            r0 = new int[r0];
            f10589a = r0;
            r0 = 1;
            r1 = f10589a;	 Catch:{ NoSuchFieldError -> 0x0011 }
            r2 = mobi.mmdt.ott.view.conversation.createpoll.C3470c.f10597b;	 Catch:{ NoSuchFieldError -> 0x0011 }
            r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x0011 }
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x0011 }
        L_0x0011:
            r1 = f10589a;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r2 = mobi.mmdt.ott.view.conversation.createpoll.C3470c.f10596a;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r3 = 2;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r1[r2] = r3;	 Catch:{ NoSuchFieldError -> 0x0019 }
        L_0x0019:
            r1 = f10589a;	 Catch:{ NoSuchFieldError -> 0x0021 }
            r2 = mobi.mmdt.ott.view.conversation.createpoll.C3470c.f10598c;	 Catch:{ NoSuchFieldError -> 0x0021 }
            r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x0021 }
            r0 = 3;	 Catch:{ NoSuchFieldError -> 0x0021 }
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x0021 }
        L_0x0021:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.conversation.createpoll.a.3.<clinit>():void");
        }
    }

    public interface C6881a {
        void mo3666a(String str, PollType pollType, ArrayList<String> arrayList, boolean z);
    }

    private class C6882b extends C6074f {
        final /* synthetic */ C6133a f19612a;

        public C6882b(C6133a c6133a, Context context) {
            this.f19612a = c6133a;
            super(context);
        }

        public final /* synthetic */ ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            switch (i) {
                case 1001:
                    return new C6883c(this.f16246b, viewGroup, this.f19612a, this.f19612a);
                case 1002:
                    return new C6881a(this.f16246b, viewGroup, this.f19612a, this.f19612a);
                case 1003:
                    return new mobi.mmdt.ott.view.conversation.createpoll.p430a.C6882b(this.f16246b, viewGroup, this.f19612a);
                default:
                    return null;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    final java.util.ArrayList<java.lang.String> m14123a() {
        /*
        r3 = this;
        r0 = new java.util.ArrayList;
        r0.<init>();
        r1 = mobi.mmdt.ott.view.conversation.createpoll.C6133a.C34633.f10589a;
        r2 = r3.f16613k;
        r2 = r2 + -1;
        r1 = r1[r2];
        r2 = 0;
        switch(r1) {
            case 1: goto L_0x002e;
            case 2: goto L_0x0012;
            default: goto L_0x0011;
        };
    L_0x0011:
        return r0;
    L_0x0012:
        r1 = r3.f16612j;
        r1 = r1.getItemCount();
        if (r2 >= r1) goto L_0x004a;
    L_0x001a:
        r1 = r3.f16612j;
        r1 = r1.m13671a(r2);
        r1 = (mobi.mmdt.ott.view.conversation.createpoll.p571b.C7344d) r1;
        r1 = r1.f21213b;
        if (r1 != 0) goto L_0x0028;
    L_0x0026:
        r1 = "";
    L_0x0028:
        r0.add(r1);
        r2 = r2 + 1;
        goto L_0x0012;
    L_0x002e:
        r1 = r3.f16612j;
        r1 = r1.getItemCount();
        if (r2 >= r1) goto L_0x004a;
    L_0x0036:
        r1 = r3.f16612j;
        r1 = r1.m13671a(r2);
        r1 = (mobi.mmdt.ott.view.conversation.createpoll.p571b.C7342b) r1;
        r1 = r1.f21209b;
        if (r1 != 0) goto L_0x0044;
    L_0x0042:
        r1 = "";
    L_0x0044:
        r0.add(r1);
        r2 = r2 + 1;
        goto L_0x002e;
    L_0x004a:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.conversation.createpoll.a.a():java.util.ArrayList<java.lang.String>");
    }

    public final void mo2361a(long j) {
        int i = 0;
        int i2 = 0;
        while (i < this.f16612j.getItemCount()) {
            if (((C7193a) this.f16612j.m13671a(i)).f20720a == j) {
                i2 = i;
            }
            i++;
        }
        this.f16612j.m13676b(i2);
        this.f16606c.setAdapter(this.f16612j);
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
        r0 = (mobi.mmdt.ott.view.conversation.createpoll.C6133a.C6881a) r0;	 Catch:{ ClassCastException -> 0x0009 }
        r2.f16604a = r0;	 Catch:{ ClassCastException -> 0x0009 }
        return;
    L_0x0009:
        r0 = new java.lang.ClassCastException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r3 = r3.toString();
        r1.append(r3);
        r3 = " must implement ICreatePollFragmentInteractionListener";
        r1.append(r3);
        r3 = r1.toString();
        r0.<init>(r3);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.conversation.createpoll.a.onAttach(android.app.Activity):void");
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f16614l = layoutInflater.inflate(R.layout.fragment_create_poll, viewGroup, false);
        return this.f16614l;
    }

    public final void onDestroyView() {
        super.onDestroyView();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f16605b = (AppCompatSpinner) this.f16614l.findViewById(R.id.types_spinner);
        this.f16607e = (Button) this.f16614l.findViewById(R.id.add_item_button);
        this.f16608f = (CheckBox) this.f16614l.findViewById(R.id.has_else_checkBox);
        this.f16609g = (EditText) this.f16614l.findViewById(R.id.question_editText);
        this.f16610h = (TextInputLayout) this.f16614l.findViewById(R.id.question_textInputLayout);
        this.f16611i = (TextInputLayout) this.f16614l.findViewById(R.id.question_type_textInputLayout);
        this.f16607e.setOnClickListener(this.f16618p);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C3471d(C4522p.m8236a(R.string.question_type_radio), R.drawable.ic_radio_button_checked_gray_18dp));
        arrayList.add(new C3471d(C4522p.m8236a(R.string.question_type_check_box), R.drawable.ic_check_box_gray_18dp));
        this.f16615m = new C3472e(getActivity(), arrayList);
        this.f16605b.setAdapter(this.f16615m);
        this.f16605b.setOnItemSelectedListener(this.f16617o);
        this.f16612j = new C6882b(this, getActivity());
        this.f16606c = (RecyclerView) this.f16614l.findViewById(R.id.recycler_view);
        this.f16606c.setHasFixedSize(false);
        this.f16606c.setNestedScrollingEnabled(false);
        this.f16606c.setAdapter(this.f16612j);
        this.f16616n = new LinearLayoutManager(getActivity());
        this.f16606c.setLayoutManager(this.f16616n);
        if (getArguments() != null) {
            List arrayList2;
            Bundle arguments = getArguments();
            CharSequence string = arguments.getString("KEY_QUESTION_STRING");
            boolean z = arguments.getBoolean("KEY_HAS_ELSE_OPTION_BOOLEAN");
            int i = arguments.getInt("KEY_POLL_ITEMS_TYPE_INTEGER");
            arrayList = arguments.getStringArrayList("KEY_OPTION_TITLES_STRING_ARRAY_LIST");
            this.f16609g.setText(string);
            this.f16608f.setChecked(z);
            this.f16605b.setSelection(i);
            int i2;
            switch (C34633.f10589a[this.f16613k - 1]) {
                case 1:
                    arrayList2 = new ArrayList();
                    if (arrayList != null) {
                        for (i2 = 0; i2 < arrayList.size(); i2++) {
                            arrayList2.add(new C7342b((String) arrayList.get(i2), System.currentTimeMillis(), 0, C3457c.f10580e));
                        }
                        break;
                    }
                    break;
                case 2:
                    arrayList2 = new ArrayList();
                    if (arrayList != null) {
                        for (i2 = 0; i2 < arrayList.size(); i2++) {
                            arrayList2.add(new C7344d((String) arrayList.get(i2), System.currentTimeMillis(), 0, C3457c.f10580e));
                        }
                        break;
                    }
                    break;
                default:
                    break;
            }
            this.f16612j.m13673a(arrayList2);
        }
        C2491i.m6819b(this.f16607e, UIThemeManager.getmInstance().getAccent_color());
        C2491i.m6798a(this.f16607e, UIThemeManager.getmInstance().getButton_text_color());
        C2491i.m6779a(UIThemeManager.getmInstance().getText_primary_color(), UIThemeManager.getmInstance().getText_primary_new_design_with_opacity_color(), UIThemeManager.getmInstance().getAccent_color(), this.f16609g);
        C2491i.m6799a(this.f16608f, UIThemeManager.getmInstance().getAccent_color());
        C2491i.m6781a(UIThemeManager.getmInstance().getAccent_color(), this.f16610h, this.f16611i);
        this.f16605b.setPopupBackgroundDrawable(new ColorDrawable(UIThemeManager.getmInstance().getRecycler_view_background_color()));
    }
}
