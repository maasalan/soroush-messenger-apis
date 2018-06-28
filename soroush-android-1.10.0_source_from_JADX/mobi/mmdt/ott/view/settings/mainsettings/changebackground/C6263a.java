package mobi.mmdt.ott.view.settings.mainsettings.changebackground;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import mobi.mmdt.componentsutils.p232b.C2489g;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.view.components.p401c.C6073e;
import mobi.mmdt.ott.view.components.p401c.C6074f;
import mobi.mmdt.ott.view.components.p401c.C6075j;
import mobi.mmdt.ott.view.components.p401c.C6075j.C3128a;
import mobi.mmdt.ott.view.components.p405e.C3150a;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;
import mobi.mmdt.ott.view.settings.mainsettings.changebackground.p473a.C6969a;
import mobi.mmdt.ott.view.settings.mainsettings.changebackground.p585b.C7225a;
import mobi.mmdt.ott.view.settings.mainsettings.changebackground.p585b.C7390b;
import mobi.mmdt.ott.view.settings.mainsettings.changebackground.p585b.C7391c;

public final class C6263a extends C3150a implements C3128a, C4390b {
    private RecyclerView f17070a;
    private C6970b f17071b;
    private LinearLayoutManager f17072c;
    private C6969a f17073e;
    private int f17074f;
    private int f17075g;
    private View f17076h;

    public interface C6969a {
        void mo3682a(C7225a c7225a);

        void mo3684b(C7225a c7225a);
    }

    class C6970b extends C6074f {
        final /* synthetic */ C6263a f19897a;

        public C6970b(C6263a c6263a, Context context) {
            this.f19897a = c6263a;
            super(context);
        }

        public final void mo3181a(C6073e c6073e, int i) {
            if (c6073e.getItemViewType() == 1) {
                C7391c c7391c = (C7391c) this.c.get(i);
                c7391c.f21491c = false;
                if (c7391c.f19504k == ((ChangeBackgroundConversationActivity) this.f19897a.getActivity()).f24441o) {
                    c7391c.f21491c = true;
                } else {
                    c7391c.f21491c = false;
                }
            } else if (c6073e.getItemViewType() == 2) {
                C7390b c7390b = (C7390b) this.c.get(i);
                c7390b.f21487b = false;
                if (c7390b.f21486a.equals(((ChangeBackgroundConversationActivity) this.f19897a.getActivity()).f24442p)) {
                    c7390b.f21487b = true;
                } else {
                    c7390b.f21487b = false;
                }
            }
            super.mo3181a(c6073e, i);
        }

        public final /* synthetic */ void onBindViewHolder(ViewHolder viewHolder, int i) {
            mo3181a((C6073e) viewHolder, i);
        }

        public final /* synthetic */ ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            if (i == 1) {
                return new mobi.mmdt.ott.view.settings.mainsettings.changebackground.p473a.C6970b(this.f19897a.getActivity(), this.f16246b, viewGroup, this.f19897a.f17074f, this.f19897a.f17075g, this.f19897a);
            } else if (i != 2) {
                return null;
            } else {
                return new C6969a(this.f19897a.getActivity(), this.f16246b, viewGroup, this.f19897a.f17074f, this.f19897a.f17075g, this.f19897a);
            }
        }
    }

    public final void m14610a() {
        if (this.f17071b != null) {
            this.f17071b.notifyDataSetChanged();
        }
    }

    public final void mo2429a(C7225a c7225a) {
        if (c7225a.f19503j == 2) {
            this.f17073e.mo3682a(c7225a);
            return;
        }
        if (c7225a.f19503j == 1) {
            this.f17073e.mo3684b(c7225a);
        }
    }

    public final void mo2280b(int i) {
    }

    public final void c_(int i) {
        C7225a c7225a = (C7225a) this.f17071b.m13671a(i);
        if (c7225a.f19503j == 1) {
            this.f17073e.mo3684b(c7225a);
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (getArguments() != null && getArguments().containsKey("KEY_RESULT_ARRAYLIST_OF_PATH") && getArguments().containsKey("KEY_RESULT_ARRAYLIST_OF_TEXT_RESOURCE")) {
            ArrayList integerArrayList = getArguments().getIntegerArrayList("KEY_RESULT_ARRAYLIST_OF_PATH");
            ArrayList stringArrayList = getArguments().getStringArrayList("KEY_RESULT_ARRAYLIST_OF_TEXT_RESOURCE");
            ArrayList stringArrayList2 = getArguments().getStringArrayList("KEY_RESULT_ARRAYLIST_OF_IMAGE_PATH");
            List arrayList = new ArrayList();
            if (integerArrayList != null) {
                int i = 0;
                int i2 = i;
                while (i < integerArrayList.size() + stringArrayList2.size()) {
                    if (i < integerArrayList.size()) {
                        arrayList.add(new C7391c(i, ((Integer) integerArrayList.get(i)).intValue(), i == ((ChangeBackgroundConversationActivity) getActivity()).f24441o, (String) stringArrayList.get(i)));
                    } else {
                        int i3 = i2 + 1;
                        String str = (String) stringArrayList2.get(i2);
                        arrayList.add(new C7390b(i, str, str, str.equals(((ChangeBackgroundConversationActivity) getActivity()).f24442p)));
                        i2 = i3;
                    }
                    i++;
                }
            }
            this.f17071b.m13673a(arrayList);
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
        r0 = (mobi.mmdt.ott.view.settings.mainsettings.changebackground.C6263a.C6969a) r0;	 Catch:{ ClassCastException -> 0x0009 }
        r2.f17073e = r0;	 Catch:{ ClassCastException -> 0x0009 }
        return;
    L_0x0009:
        r0 = new java.lang.ClassCastException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r3 = r3.toString();
        r1.append(r3);
        r3 = " must implement OnImageCaptionPhotosGridFragmentInteractionListener";
        r1.append(r3);
        r3 = r1.toString();
        r0.<init>(r3);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.settings.mainsettings.changebackground.a.onAttach(android.app.Activity):void");
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f17076h = layoutInflater.inflate(R.layout.fragment_change_backgroung_conversation_grid, viewGroup, false);
        return this.f17076h;
    }

    public final void onDestroyView() {
        if (this.f17070a != null) {
            this.f17070a.setItemAnimator(null);
            this.f17070a.setAdapter(null);
            this.f17070a = null;
        }
        this.f17071b = null;
        super.onDestroyView();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        int a = C2489g.m6754a().m6755a(BallPulseIndicator.SCALE);
        a = getResources().getConfiguration().orientation == 1 ? C2491i.m6833f(getActivity()) ? a / 7 : C2491i.m6834g(getActivity()) ? a / 5 : a / 4 : C2491i.m6833f(getActivity()) ? a / 11 : C2491i.m6834g(getActivity()) ? a / 8 : a / 7;
        this.f17074f = a;
        this.f17075g = this.f17074f;
        this.f17072c = new LinearLayoutManager(getActivity(), 0, false);
        this.f17070a = (RecyclerView) this.f17076h.findViewById(R.id.recycler_view);
        this.f17070a.addOnItemTouchListener(new C6075j(getActivity(), this.f17070a, this));
        this.f17071b = new C6970b(this, getActivity());
        this.f17070a.setHasFixedSize(true);
        this.f17070a.setAdapter(this.f17071b);
        this.f17070a.setLayoutManager(this.f17072c);
    }
}
