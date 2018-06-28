package mobi.mmdt.ott.view.conversation.forward;

import android.app.Activity;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.C0417s.C0416a;
import android.support.v4.p029a.C0350e;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.HashMap;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p385g.C2978e;
import mobi.mmdt.ott.provider.p385g.C2980g;
import mobi.mmdt.ott.view.components.p401c.C3126i;
import mobi.mmdt.ott.view.components.p402d.C7576b;
import mobi.mmdt.ott.view.main.p451a.C4143a;
import mobi.mmdt.ott.view.main.p454c.p455a.C7210a;
import mobi.mmdt.ott.view.main.p454c.p455a.p457b.C7365a;
import mobi.mmdt.ott.view.tools.C4522p;

public final class C6218c extends C4143a implements C0416a<Cursor>, C3126i, C4054e {
    C7210a f16824a;
    private boolean f16825b;
    private String f16826e;
    private String f16827f;
    private ViewGroup f16828g;
    private RecyclerView f16829h;
    private C4053d f16830i;
    private TextView f16831j;
    private int f16832k;
    private String f16833l = "";

    public C6218c(Activity activity, C4053d c4053d, boolean z) {
        super(activity);
        this.f16825b = z;
        this.f16830i = c4053d;
        int i = 0;
        this.d = LayoutInflater.from(activity).inflate(R.layout.fragment_forward_recent_conversations_list, null, false);
        this.f16826e = C2535a.m6888a().m6928d();
        this.f16827f = C2535a.m6888a().m6919b();
        this.f16827f = C2535a.m6888a().m6919b();
        this.f16824a = new C7210a(this.f11833c, this, this, m14342d(), this.f16825b);
        Bundle bundle = new Bundle();
        bundle.putString("searchPattern", "");
        ((C7576b) this.f11833c).m19190e().mo268a(13, bundle, this);
        this.f16828g = (ViewGroup) this.d.findViewById(R.id.root_relativeLayout);
        this.f16829h = (RecyclerView) this.d.findViewById(R.id.recycler_view);
        this.f16831j = (TextView) this.d.findViewById(R.id.divider_textView);
        m14348b();
        this.f16829h.setHasFixedSize(true);
        this.f16829h.setAdapter(this.f16824a);
        RecyclerView recyclerView = this.f16829h;
        if (recyclerView.getLayoutManager() != null) {
            i = ((LinearLayoutManager) recyclerView.getLayoutManager()).findFirstCompletelyVisibleItemPosition();
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(this.f11833c));
        recyclerView.scrollToPosition(i);
    }

    private HashMap<String, Integer> m14342d() {
        return ((ForwardActivity) this.f11833c).f24334m;
    }

    public final C0350e<Cursor> mo2226a(int i, Bundle bundle) {
        return C2980g.m7449j(bundle.getString("searchPattern"));
    }

    public final void mo2227a() {
        if (this.f16824a != null) {
            this.f16824a.m13684c(null);
        }
    }

    public final void mo2374a(int i) {
        HashMap d;
        Object obj;
        C2978e c2978e;
        C7365a c7365a = (C7365a) this.f16824a.m17259a(i);
        switch (c7365a.f19503j) {
            case 1:
                c7365a.f21396w = true;
                m14342d().put(c7365a.f20832z, Integer.valueOf(C2978e.SINGLE.ordinal()));
                ((ForwardActivity) this.f11833c).m21262k();
                break;
            case 2:
                c7365a.f21396w = true;
                d = m14342d();
                obj = c7365a.f20832z;
                c2978e = C2978e.GROUP;
                break;
            case 3:
                c7365a.f21396w = true;
                d = m14342d();
                obj = c7365a.f20832z;
                c2978e = C2978e.CHANNEL;
                break;
            default:
                break;
        }
        d.put(obj, Integer.valueOf(c2978e.ordinal()));
        ((ForwardActivity) this.f11833c).m21261j();
        this.f16832k++;
        m14348b();
        if (!this.f16833l.isEmpty()) {
            ((ForwardActivity) this.f11833c).m21259h();
        }
        ((ForwardActivity) this.f11833c).mo3643g();
        ((ForwardActivity) this.f11833c).m21261j();
    }

    public final /* synthetic */ void mo2228a(C0350e c0350e, Object obj) {
        Cursor cursor = (Cursor) obj;
        if (this.f16824a != null) {
            this.f16824a.m19095a(this.f16833l);
            this.f16824a.m13684c(cursor);
        }
    }

    public final void mo2375a(String str) {
        this.f16833l = str;
        Bundle bundle = new Bundle();
        bundle.putString("searchPattern", str);
        ((C7576b) this.f11833c).m19190e().mo270b(13, bundle, this);
    }

    final void m14348b() {
        TextView textView;
        String a;
        Object[] objArr;
        if (this.f16827f.equals("fa")) {
            textView = this.f16831j;
            a = C4522p.m8236a(R.string.forward_divider_selection);
            objArr = new Object[]{C2491i.m6809b(this.f16832k), C4522p.m8236a(R.string.conversation_selected)};
        } else {
            textView = this.f16831j;
            a = C4522p.m8236a(R.string.forward_divider_selection);
            objArr = new Object[]{Integer.valueOf(this.f16832k), C4522p.m8236a(R.string.conversation_selected)};
        }
        textView.setText(String.format(a, objArr));
    }

    public final void mo2376b(int i) {
        C7365a c7365a = (C7365a) this.f16824a.m17259a(i);
        if (m14342d().containsKey(c7365a.f20832z)) {
            m14342d().remove(c7365a.f20832z);
            switch (c7365a.f19503j) {
                case 1:
                    c7365a.f21396w = false;
                    ((ForwardActivity) this.f11833c).m21262k();
                    break;
                case 2:
                case 3:
                    c7365a.f21396w = false;
                    ((ForwardActivity) this.f11833c).m21261j();
                    break;
                default:
                    break;
            }
            this.f16832k--;
            m14348b();
            if (!this.f16833l.isEmpty()) {
                ((ForwardActivity) this.f11833c).m21259h();
            }
        }
        ((ForwardActivity) this.f11833c).mo3643g();
    }

    public final void mo2234c(int i) {
    }

    public final void mo2235d(int i) {
    }

    public final void mo2377e(int r7) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:9:0x002b in {2, 4, 5, 7, 8} preds:[]
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:129)
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:48)
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:38)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r6 = this;
        r0 = r6.f16824a;
        r7 = r0.m17259a(r7);
        r7 = (mobi.mmdt.ott.view.main.p454c.p455a.p457b.C7365a) r7;
        r1 = r7.f20832z;
        r7 = r7.f19503j;
        switch(r7) {
            case 1: goto L_0x0026;
            case 2: goto L_0x001b;
            case 3: goto L_0x0010;
            default: goto L_0x000f;
        };
    L_0x000f:
        return;
    L_0x0010:
        r0 = r6.f16830i;
        r2 = mobi.mmdt.ott.provider.p385g.C2978e.CHANNEL;
        r3 = 0;
        r4 = 0;
        r5 = 0;
        r0.mo3667a(r1, r2, r3, r4, r5);
        return;
    L_0x001b:
        r0 = r6.f16830i;
        r2 = mobi.mmdt.ott.provider.p385g.C2978e.GROUP;
    L_0x001f:
        r3 = 0;
        r4 = 0;
        r5 = 0;
        r0.mo3667a(r1, r2, r3, r4, r5);
        return;
    L_0x0026:
        r0 = r6.f16830i;
        r2 = mobi.mmdt.ott.provider.p385g.C2978e.SINGLE;
        goto L_0x001f;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.conversation.forward.c.e(int):void");
    }
}
