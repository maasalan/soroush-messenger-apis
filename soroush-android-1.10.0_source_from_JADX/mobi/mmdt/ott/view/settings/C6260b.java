package mobi.mmdt.ott.view.settings;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import jp.wasabeef.recyclerview.animators.adapters.SlideInRightAnimationAdapter;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.view.components.p401c.C3126i;
import mobi.mmdt.ott.view.components.p401c.C6074f;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.components.p405e.C3150a;
import mobi.mmdt.ott.view.settings.p471a.C6950a;
import mobi.mmdt.ott.view.settings.p471a.C6951b;
import mobi.mmdt.ott.view.settings.p471a.C6952c;
import mobi.mmdt.ott.view.settings.p471a.C6953d;
import mobi.mmdt.ott.view.settings.p471a.C6954e;
import mobi.mmdt.ott.view.settings.p471a.C6955f;
import mobi.mmdt.ott.view.settings.p471a.C6956g;
import mobi.mmdt.ott.view.settings.p471a.C6957h;
import mobi.mmdt.ott.view.settings.p471a.C6958i;
import mobi.mmdt.ott.view.settings.p471a.C6959j;
import mobi.mmdt.ott.view.settings.p471a.C6960k;
import mobi.mmdt.ott.view.settings.p471a.C6961l;
import mobi.mmdt.ott.view.settings.p471a.C6962m;
import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;

public abstract class C6260b extends C3150a implements C3126i {
    View f17054a;
    private RecyclerView f17055b;
    private C7223a f17056c;
    private C4369c f17057e;
    private LinearLayoutManager f17058f;
    private List<C6829g> f17059g = new ArrayList();

    private class C7223a extends C6074f {
        final /* synthetic */ C6260b f19883a;

        public C7223a(C6260b c6260b, Context context) {
            this.f19883a = c6260b;
            super(context);
        }

        public final /* synthetic */ ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            if (i > 16000) {
                return new C6950a(this.f19883a.getActivity(), this.f19883a.f17056c.f16246b, viewGroup);
            }
            if (i > 15000) {
                return new C6951b(this.f19883a.f17056c.f16246b, viewGroup);
            }
            if (i > 14000) {
                return new C6955f(this.f19883a.f17056c.f16246b, viewGroup);
            }
            if (i <= 12000) {
                return i > 9000 ? new C6956g(this.f19883a.getActivity(), this.f19883a, this.f19883a.f17056c.f16246b, viewGroup) : i > 8000 ? new C6960k(this.f19883a, this.f19883a.f17056c.f16246b, viewGroup) : i > 7000 ? new C6953d(this.f19883a, this.f19883a.f17056c.f16246b, viewGroup) : i > 6000 ? new C6957h(this.f19883a, this.f19883a.f17056c.f16246b, viewGroup) : i > 5000 ? new C6961l(this.f19883a, this.f19883a.f17056c.f16246b, viewGroup, (C7722a) this.f19883a.getActivity()) : i > 4000 ? new C6962m(this.f19883a, this.f19883a.f17056c.f16246b, viewGroup, (C7722a) this.f19883a.getActivity()) : i > 3000 ? new C6954e(this.f19883a, this.f19883a.f17056c.f16246b, viewGroup) : i > 2000 ? new C6952c(this.f19883a.getActivity(), this.f19883a, this.f19883a.f17056c.f16246b, viewGroup) : i > IjkMediaCodecInfo.RANK_MAX ? new C6959j(this.f19883a.getActivity(), this.f19883a, this.f19883a.f17056c.f16246b, viewGroup) : null;
            } else {
                this.f19883a.getActivity();
                return new C6958i(this.f19883a, this.f19883a.f17056c.f16246b, viewGroup);
            }
        }
    }

    public final void m14602a() {
        mo3261a(this.f17059g);
        this.f17056c = new C7223a(this, getActivity());
        this.f17056c.m13673a(this.f17059g);
        this.f17055b.setAdapter(this.f17056c);
    }

    public abstract void mo3261a(List<C6829g> list);

    public final void mo2234c(int i) {
        this.f17057e.mo3680d(this.f17056c.m13671a(i).f19503j);
    }

    public final void mo2235d(int i) {
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
        r0 = (mobi.mmdt.ott.view.settings.C4369c) r0;	 Catch:{ ClassCastException -> 0x0009 }
        r2.f17057e = r0;	 Catch:{ ClassCastException -> 0x0009 }
        return;
    L_0x0009:
        r0 = new java.lang.ClassCastException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r3 = r3.toString();
        r1.append(r3);
        r3 = " must implement OnSettingsListFragmentInteractionListener";
        r1.append(r3);
        r3 = r1.toString();
        r0.<init>(r3);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.settings.b.onAttach(android.app.Activity):void");
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f17054a = layoutInflater.inflate(R.layout.fragment_settings_list, viewGroup, false);
        return this.f17054a;
    }

    public void onDestroyView() {
        if (this.f17055b != null) {
            this.f17055b.setItemAnimator(null);
            this.f17055b.setAdapter(null);
            this.f17055b = null;
        }
        this.f17056c = null;
        super.onDestroyView();
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f17055b = (RecyclerView) this.f17054a.findViewById(R.id.recycler_view);
        Adapter slideInRightAnimationAdapter = new SlideInRightAnimationAdapter(this.f17056c);
        slideInRightAnimationAdapter.setFirstOnly(true);
        this.f17055b.setAdapter(slideInRightAnimationAdapter);
        this.f17055b.setHasFixedSize(true);
        this.f17058f = new LinearLayoutManager(getActivity());
        this.f17055b.setLayoutManager(this.f17058f);
        m14602a();
    }
}
