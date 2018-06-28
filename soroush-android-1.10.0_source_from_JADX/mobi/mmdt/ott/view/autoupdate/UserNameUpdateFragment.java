package mobi.mmdt.ott.view.autoupdate;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.p029a.C0346c;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.ArrayList;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.C2808d;
import mobi.mmdt.ott.logic.p261a.aa.C6645d;
import mobi.mmdt.ott.logic.p261a.p296j.p297a.C2694a;
import mobi.mmdt.ott.logic.p261a.p321u.C6778a;
import mobi.mmdt.ott.logic.p261a.p321u.C6779b;
import mobi.mmdt.ott.logic.p261a.p321u.p322a.C2746b;
import mobi.mmdt.ott.logic.p261a.p321u.p322a.C5967a;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.C2960d;
import mobi.mmdt.ott.provider.C2963e;
import mobi.mmdt.ott.provider.p389k.C6033c;
import mobi.mmdt.ott.provider.p389k.C6035f;
import mobi.mmdt.ott.view.autoupdate.p552a.C6818a;
import mobi.mmdt.ott.view.autoupdate.p562b.C7171a;
import mobi.mmdt.ott.view.components.p401c.C6074f;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.components.p405e.C3150a;
import mobi.mmdt.ott.view.tools.C4478a;
import mobi.mmdt.ott.view.tools.p479c.C4501c;

public class UserNameUpdateFragment extends C3150a {
    boolean f16185a = false;
    Handler f16186b = new Handler();
    private View f16187c;
    private C6817a f16188e;
    private ArrayList<C6829g> f16189f;
    private final int f16190g = 10000;
    private RelativeLayout f16191h;
    private ImageView f16192i;
    private TextView f16193j;
    private TextView f16194k;
    private Activity f16195l;

    class C30221 implements OnClickListener {
        final /* synthetic */ UserNameUpdateFragment f9497a;

        C30221(UserNameUpdateFragment userNameUpdateFragment) {
            this.f9497a = userNameUpdateFragment;
        }

        public final void onClick(View view) {
            UserNameUpdateFragment.m13617d();
            UserNameUpdateFragment.m13611a(this.f9497a);
        }
    }

    class C30253 implements Runnable {
        final /* synthetic */ UserNameUpdateFragment f9501a;

        class C30241 implements Runnable {
            final /* synthetic */ C30253 f9500a;

            C30241(C30253 c30253) {
                this.f9500a = c30253;
            }

            public final void run() {
                UserNameUpdateFragment.m13618e(this.f9500a.f9501a);
            }
        }

        C30253(UserNameUpdateFragment userNameUpdateFragment) {
            this.f9501a = userNameUpdateFragment;
        }

        public final void run() {
            C4501c.m8189a().m8193b();
            new Handler().postDelayed(new C30241(this), 100);
        }
    }

    private class C6817a extends C6074f {
        final /* synthetic */ UserNameUpdateFragment f19445a;

        C6817a(UserNameUpdateFragment userNameUpdateFragment, Context context) {
            this.f19445a = userNameUpdateFragment;
            super(context);
        }

        public final /* synthetic */ ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C6818a(this.f19445a.f16195l, this.f19445a.f16195l.getLayoutInflater(), viewGroup);
        }
    }

    static /* synthetic */ void m13611a(UserNameUpdateFragment userNameUpdateFragment) {
        userNameUpdateFragment.f16194k.setText("در حال بروزرسانی ...");
        userNameUpdateFragment.f16192i.setVisibility(8);
        userNameUpdateFragment.f16193j.setVisibility(8);
    }

    private static void m13617d() {
        C2808d.m7147a(new C6778a());
    }

    static /* synthetic */ void m13618e(UserNameUpdateFragment userNameUpdateFragment) {
        userNameUpdateFragment.f16194k.setText("در روند بروزرسانی مشکلی رخ داد.");
        userNameUpdateFragment.f16192i.setVisibility(0);
        userNameUpdateFragment.f16193j.setVisibility(0);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f16187c = layoutInflater.inflate(R.layout.fragment_username_update, viewGroup, false);
        this.f16195l = getActivity();
        this.f16194k = (TextView) this.f16187c.findViewById(R.id.text_update);
        this.f16193j = (TextView) this.f16187c.findViewById(R.id.text_update_error);
        this.f16192i = (ImageView) this.f16187c.findViewById(R.id.refresh_image_view);
        this.f16191h = (RelativeLayout) this.f16187c.findViewById(R.id.update_relative_layout);
        this.f16191h.setOnClickListener(new C30221(this));
        int c = C0346c.m687c(this.f16195l, R.color.md_green_800);
        C2491i.m6801a(this.f16192i, c);
        C2491i.m6802a(this.f16193j, c);
        C2491i.m6803a(this.f16194k);
        C2491i.m6803a(this.f16193j);
        RecyclerView recyclerView = (RecyclerView) this.f16187c.findViewById(R.id.recycler_view);
        this.f16188e = new C6817a(this, this.f16195l);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(this.f16188e);
        int findFirstCompletelyVisibleItemPosition = recyclerView.getLayoutManager() != null ? ((LinearLayoutManager) recyclerView.getLayoutManager()).findFirstCompletelyVisibleItemPosition() : 0;
        recyclerView.setLayoutManager(new LinearLayoutManager(this.f16195l));
        recyclerView.scrollToPosition(findFirstCompletelyVisibleItemPosition);
        this.f16189f = new ArrayList();
        this.f16189f.add(new C7171a("دریافت بروزرسانی", true, false, 0));
        this.f16189f.add(new C7171a("نصب بروزرسانی ها", false, false, 0));
        this.f16189f.add(new C7171a("همگام سازی", false, false, 1));
        this.f16189f.add(new C7171a("نهایی سازی", false, true, 2));
        this.f16188e.m13673a(this.f16189f);
        C2808d.m7147a(new C6779b());
        m13617d();
        return this.f16187c;
    }

    public void onEvent(C5967a c5967a) {
        this.f16195l.runOnUiThread(new C30253(this));
    }

    public void onEvent(final C2746b c2746b) {
        this.f16195l.runOnUiThread(new Runnable(this) {
            final /* synthetic */ UserNameUpdateFragment f9505b;

            class C30271 implements Runnable {
                final /* synthetic */ C30284 f9503a;

                class C30261 implements Runnable {
                    final /* synthetic */ C30271 f9502a;

                    C30261(C30271 c30271) {
                        this.f9502a = c30271;
                    }

                    public final void run() {
                        C4478a.m8166d(this.f9502a.f9503a.f9505b.f16195l);
                        this.f9502a.f9503a.f9505b.f16195l.finish();
                    }
                }

                C30271(C30284 c30284) {
                    this.f9503a = c30284;
                }

                public final void run() {
                    new Handler().postDelayed(new Runnable(this.f9503a.f9505b, 1) {
                        final /* synthetic */ UserNameUpdateFragment f9499b;

                        public final void run() {
                            if (this.f9499b.f16189f != null && r3 <= this.f9499b.f16189f.size()) {
                                C6829g c6829g = (C6829g) this.f9499b.f16189f.get(r3);
                                if (c6829g != null) {
                                    ((C7171a) c6829g).f20621b = true;
                                    this.f9499b.f16188e.notifyItemChanged(r3);
                                }
                            }
                        }
                    }, (long) (200 * (1 + 1)));
                    String str = c2746b.f8691a;
                    if (C2535a.m6888a().m6928d() == null) {
                        throw new NullPointerException();
                    }
                    C6033c c6033c = new C6033c();
                    c6033c.m13499d(str);
                    c6033c.m13490a(MyApplication.m12952b(), new C6035f().m13520a(r2));
                    C2535a.m6888a().m6922b(str);
                    C2963e.m7390b(C2960d.m7386a(MyApplication.m12952b()).getWritableDatabase());
                    if (C2535a.m6888a().m6928d() == null) {
                        throw new NullPointerException();
                    }
                    C6035f c6035f = new C6035f();
                    c6035f.m13523b(str);
                    c6035f.m7360a(MyApplication.m12952b());
                    new Handler().postDelayed(/* anonymous class already generated */, (long) (200 * (2 + 1)));
                    C2535a.m6888a().m6935e(0);
                    C2535a.m6888a().m6969s(true);
                    C2535a.m6888a().m6918a(false);
                    C2808d.m7147a(new C6645d());
                    C2694a.m7065a();
                    new Handler().postDelayed(/* anonymous class already generated */, (long) (200 * (3 + 1)));
                    this.f9503a.f9505b.f16186b.postDelayed(new C30261(this), 10000);
                }
            }

            public final void run() {
                C4501c.m8189a().m8193b();
                new Handler().postDelayed(new C30271(this), 100);
            }
        });
    }

    public void onPause() {
        super.onPause();
        if (this.f16185a) {
            this.f16186b.removeCallbacksAndMessages(null);
            this.f16195l.finish();
        }
    }
}
