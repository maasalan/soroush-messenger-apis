package mobi.mmdt.ott.view.settings.mainsettings.privacy.activesession;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.sessions.base.Sessions;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.sessions.base.Sessions.OnlineStatus;
import mobi.mmdt.ott.logic.C2775a;
import mobi.mmdt.ott.logic.C2778b;
import mobi.mmdt.ott.logic.C2808d;
import mobi.mmdt.ott.logic.p261a.p262a.p263a.C2575c;
import mobi.mmdt.ott.logic.p261a.p262a.p263a.C5889b;
import mobi.mmdt.ott.logic.p261a.p262a.p263a.C6640a;
import mobi.mmdt.ott.logic.p261a.p262a.p264b.C2576b;
import mobi.mmdt.ott.logic.p261a.p262a.p264b.C5890a;
import mobi.mmdt.ott.logic.p261a.p262a.p264b.C6641c;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.view.components.ProgressWheel;
import mobi.mmdt.ott.view.components.p401c.C3126i;
import mobi.mmdt.ott.view.components.p401c.C6074f;
import mobi.mmdt.ott.view.components.p405e.C3150a;
import mobi.mmdt.ott.view.settings.mainsettings.privacy.activesession.p475a.C6981b;
import mobi.mmdt.ott.view.settings.mainsettings.privacy.activesession.p475a.C6982c;
import mobi.mmdt.ott.view.settings.mainsettings.privacy.activesession.p587b.C7227a;
import mobi.mmdt.ott.view.settings.mainsettings.privacy.activesession.p587b.C7228b;
import mobi.mmdt.ott.view.tools.C4488b;
import mobi.mmdt.ott.view.tools.C4513i;
import mobi.mmdt.ott.view.tools.C4522p;

public final class C6264a extends C3150a implements C3126i, C4425b {
    private View f17077a;
    private RecyclerView f17078b;
    private C6980a f17079c;
    private String f17080e;
    private ProgressWheel f17081f;

    class C44224 implements Runnable {
        final /* synthetic */ C6264a f12330a;

        C44224(C6264a c6264a) {
            this.f12330a = c6264a;
        }

        public final void run() {
            C6264a.m14616b();
        }
    }

    private class C6980a extends C6074f {
        final /* synthetic */ C6264a f19928a;

        private C6980a(C6264a c6264a, Context context) {
            this.f19928a = c6264a;
            super(context);
        }

        public final /* synthetic */ ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            switch (i) {
                case 0:
                    return new mobi.mmdt.ott.view.settings.mainsettings.privacy.activesession.p475a.C6980a(this.f16246b, viewGroup);
                case 1:
                    return new C6981b(this.f16246b, viewGroup, this.f19928a);
                case 2:
                    return new C6982c(this.f16246b, viewGroup);
                default:
                    return null;
            }
        }
    }

    private static void m14616b() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        C2808d.m7147a(new C6640a());
    }

    public final void mo2234c(int i) {
    }

    public final void mo2235d(int i) {
    }

    public final void onClick(int i) {
        C7228b c7228b = (C7228b) this.f17079c.m13671a(i);
        if (c7228b.f19503j == 1) {
            final String str = c7228b.f20877g;
            C4488b.m8181a(getActivity(), C4522p.m8236a(R.string.are_you_sure_you_want_to_terminate_this_session), C4522p.m8236a(R.string.ok_cap), new OnClickListener(this) {
                final /* synthetic */ C6264a f12325b;

                public final void onClick(DialogInterface dialogInterface, int i) {
                    C2808d.m7147a(new C6641c(str));
                }
            }, C4522p.m8236a(R.string.cancel_cap), null).show();
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f17077a = layoutInflater.inflate(R.layout.fragment_active_session, viewGroup, false);
        return this.f17077a;
    }

    public final void onDestroyView() {
        if (this.f17078b != null) {
            this.f17078b.setItemAnimator(null);
            this.f17078b.setAdapter(null);
            this.f17078b = null;
        }
        this.f17079c = null;
        super.onDestroyView();
    }

    public final void onEvent(final C5889b c5889b) {
        getActivity().runOnUiThread(new Runnable(this) {
            final /* synthetic */ C6264a f12329b;

            public final void run() {
                C4513i.m8228a(this.f12329b.getActivity(), c5889b.f8890a);
            }
        });
    }

    public final void onEvent(final C2575c c2575c) {
        getActivity().runOnUiThread(new Runnable(this) {
            final /* synthetic */ C6264a f12327b;

            public final void run() {
                this.f12327b.f17081f.setVisibility(8);
                List arrayList = new ArrayList();
                ArrayList arrayList2 = c2575c.f8420a;
                Sessions sessions = c2575c.f8421b;
                int size = arrayList2.size();
                arrayList.add(new C7228b(0, true, true, sessions.getPlatform(), sessions.getModel(), sessions.getLastIP(), C4522p.m8236a(R.string.online), sessions.getDeviceId()));
                if (size > 0) {
                    arrayList.add(new C7227a(C4522p.m8236a(R.string.tap_on_a_session_to_terminate)));
                    long a = C2778b.m7093a();
                    int i = 2;
                    int i2 = 0;
                    while (i2 < size) {
                        Sessions sessions2 = (Sessions) arrayList2.get(i2);
                        String a2 = sessions2.getOnlineStatus().equals(OnlineStatus.ONLINE) ? C4522p.m8236a(R.string.online) : C2491i.m6775a(MyApplication.m12952b(), Long.valueOf(sessions2.getLastOnlineTime()), a, r0.f12327b.f17080e);
                        if (r0.f12327b.f17080e.equals("fa")) {
                            a2 = C2491i.m6814b(a2);
                        }
                        int i3 = i + 1;
                        arrayList.add(new C7228b(i, false, i2 == 0, sessions2.getPlatform(), sessions2.getModel(), sessions2.getLastIP(), a2, sessions2.getDeviceId()));
                        i2++;
                        i = i3;
                    }
                    r0.f12327b.f17079c.m13673a(arrayList);
                }
            }
        });
    }

    public final void onEvent(final C5890a c5890a) {
        getActivity().runOnUiThread(new Runnable(this) {
            final /* synthetic */ C6264a f12332b;

            public final void run() {
                if (c5890a.f8890a == C2775a.USER_NOT_HAVE_PERMISSION) {
                    Toast.makeText(this.f12332b.getActivity(), C4522p.m8236a(R.string.active_session_error_one_hour), 0).show();
                } else {
                    C4513i.m8228a(this.f12332b.getActivity(), c5890a.f8890a);
                }
            }
        });
    }

    public final void onEvent(C2576b c2576b) {
        getActivity().runOnUiThread(new C44224(this));
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f17080e = C2535a.m6888a().m6919b();
        this.f17079c = new C6980a(getActivity());
        this.f17078b = (RecyclerView) this.f17077a.findViewById(R.id.recycler_view);
        this.f17081f = (ProgressWheel) this.f17077a.findViewById(R.id.progress_wheel);
        this.f17078b.setHasFixedSize(true);
        this.f17078b.setAdapter(this.f17079c);
        this.f17078b.setLayoutManager(new LinearLayoutManager(getActivity()));
        C6264a.m14616b();
    }
}
