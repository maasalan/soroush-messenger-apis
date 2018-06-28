package mobi.mmdt.ott.view.components.mediacaption.p410b;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import mobi.mmdt.componentsutils.C2468a;
import mobi.mmdt.componentsutils.p232b.C2489g;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.view.components.mediacaption.C3202a;
import mobi.mmdt.ott.view.components.mediacaption.MediaCaptionActivity;
import mobi.mmdt.ott.view.components.mediacaption.p410b.p411a.C6852a;
import mobi.mmdt.ott.view.components.mediacaption.p410b.p411a.C6854c;
import mobi.mmdt.ott.view.components.mediacaption.p410b.p566b.C7329c;
import mobi.mmdt.ott.view.components.mediacaption.p410b.p566b.C7330d;
import mobi.mmdt.ott.view.components.mediacaption.p410b.p566b.C7422b;
import mobi.mmdt.ott.view.components.mediaselector.C6105a;
import mobi.mmdt.ott.view.components.p401c.C6073e;
import mobi.mmdt.ott.view.components.p401c.C6074f;
import mobi.mmdt.ott.view.components.p401c.C6075j;
import mobi.mmdt.ott.view.components.p401c.C6075j.C3128a;
import mobi.mmdt.ott.view.components.p405e.C3150a;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

public final class C6101a extends C3150a implements C3128a, C3202a {
    private RecyclerView f16366a;
    private C6853b f16367b;
    private GridLayoutManager f16368c;
    private C6852a f16369e;
    private int f16370f;
    private int f16371g;
    private int f16372h = -1;

    class C32031 implements Runnable {
        final /* synthetic */ C6101a f9934a;

        C32031(C6101a c6101a) {
            this.f9934a = c6101a;
        }

        public final void run() {
            if (this.f9934a.f16367b != null) {
                this.f9934a.f16367b.notifyDataSetChanged();
            }
        }
    }

    public interface C6852a {
        void mo3653a(C7330d c7330d);

        void mo3654b(C7330d c7330d);

        void mo3643g();
    }

    private class C6853b extends C6074f {
        final /* synthetic */ C6101a f19540a;

        public C6853b(C6101a c6101a, Context context) {
            this.f19540a = c6101a;
            super(context);
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo3181a(mobi.mmdt.ott.view.components.p401c.C6073e r6, int r7) {
            /*
            r5 = this;
            r0 = r6.getItemViewType();
            r1 = 0;
            r2 = 1;
            if (r0 != r2) goto L_0x002a;
        L_0x0008:
            r0 = r5.c;
            r0 = r0.get(r7);
            r0 = (mobi.mmdt.ott.view.components.mediacaption.p410b.p566b.C7330d) r0;
            r3 = r5.f19540a;
            r3 = r3.getActivity();
            r3 = (mobi.mmdt.ott.view.components.mediacaption.MediaCaptionActivity) r3;
            r3 = r3.f24001m;
            if (r3 == 0) goto L_0x0027;
        L_0x001c:
            r4 = r0.f21125a;
            r3 = r4.equals(r3);
            if (r3 == 0) goto L_0x0027;
        L_0x0024:
            r0.f21126b = r2;
            goto L_0x004e;
        L_0x0027:
            r0.f21126b = r1;
            goto L_0x004e;
        L_0x002a:
            r0 = r6.getItemViewType();
            r3 = 3;
            if (r0 != r3) goto L_0x004e;
        L_0x0031:
            r0 = r5.c;
            r0 = r0.get(r7);
            r0 = (mobi.mmdt.ott.view.components.mediacaption.p410b.p566b.C7422b) r0;
            r3 = r5.f19540a;
            r3 = r3.getActivity();
            r3 = (mobi.mmdt.ott.view.components.mediacaption.MediaCaptionActivity) r3;
            r3 = r3.f24001m;
            if (r3 == 0) goto L_0x0027;
        L_0x0045:
            r4 = r0.f21125a;
            r3 = r4.equals(r3);
            if (r3 == 0) goto L_0x0027;
        L_0x004d:
            goto L_0x0024;
        L_0x004e:
            super.mo3181a(r6, r7);
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.components.mediacaption.b.a.b.a(mobi.mmdt.ott.view.components.c.e, int):void");
        }

        public final void m17301a(C7330d c7330d) {
            int i = 0;
            int i2 = 0;
            while (i2 < this.c.size()) {
                if ((this.c.get(i2) instanceof C7330d) && ((C7330d) this.c.get(i2)).f21125a.equals(c7330d.f21125a)) {
                    i = i2;
                    break;
                }
                i2++;
            }
            this.c.remove(i);
            notifyItemRemoved(i);
            if ((this.f19540a.f16372h == -1 || this.c.size() < this.f19540a.f16372h) && !(this.c.get(this.c.size() - 1) instanceof C7329c)) {
                int size = this.c.size();
                this.c.add(new C7329c(size));
                notifyItemInserted(size);
            }
        }

        public final /* synthetic */ void onBindViewHolder(ViewHolder viewHolder, int i) {
            mo3181a((C6073e) viewHolder, i);
        }

        public final /* synthetic */ ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            if (i == 1) {
                ViewHolder c6854c = new C6854c(this.f19540a.getActivity(), this.f16246b, viewGroup, this.f19540a.f16370f, this.f19540a.f16371g, this.f19540a);
            } else {
                ViewHolder viewHolder = null;
            }
            if (i == 3) {
                return new C6852a(this.f19540a.getActivity(), this.f16246b, viewGroup, this.f19540a.f16370f, this.f19540a.f16371g, this.f19540a);
            }
            if (i == 2) {
                viewHolder = new mobi.mmdt.ott.view.components.mediacaption.p410b.p411a.C6853b(this.f16246b, viewGroup, this.f19540a.f16370f, this.f19540a.f16371g);
            }
            return viewHolder;
        }
    }

    public final void m13809a() {
        if (this.f16367b != null) {
            this.f16367b.notifyDataSetChanged();
        }
    }

    public final void mo2279a(C7330d c7330d) {
        this.f16369e.mo3653a(c7330d);
    }

    public final void mo2280b(int i) {
    }

    public final void mo2281b(C7330d c7330d) {
        this.f16369e.mo3654b(c7330d);
    }

    public final void m13813c(C7330d c7330d) {
        if (this.f16367b != null) {
            this.f16367b.m17301a(c7330d);
            new Handler().postDelayed(new C32031(this), 500);
        }
    }

    public final void c_(int i) {
        if (this.f16367b.m13671a(i).f19503j == 2) {
            this.f16369e.mo3643g();
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (getArguments() != null && getArguments().containsKey("KEY_RESULT_ARRAYLIST_OF_PATH")) {
            ArrayList stringArrayList = getArguments().getStringArrayList("KEY_RESULT_ARRAYLIST_OF_PATH");
            List arrayList = new ArrayList();
            if (stringArrayList != null) {
                int size = stringArrayList.size();
                int i = 0;
                while (i < size) {
                    String str = (String) stringArrayList.get(i);
                    String str2 = ((MediaCaptionActivity) getActivity()).f24001m;
                    boolean z = str2 != null && str2.equals(str);
                    arrayList.add(C2468a.m6708e(str) ? new C7422b(i, str, str, z) : new C7330d(i, str, str, z));
                    i++;
                }
                if (this.f16372h == -1 || size < this.f16372h) {
                    arrayList.add(new C7329c(size));
                }
            }
            this.f16367b.m13673a(arrayList);
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
        r0 = (mobi.mmdt.ott.view.components.mediacaption.p410b.C6101a.C6852a) r0;	 Catch:{ ClassCastException -> 0x0009 }
        r2.f16369e = r0;	 Catch:{ ClassCastException -> 0x0009 }
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
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.components.mediacaption.b.a.onAttach(android.app.Activity):void");
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null && getArguments().containsKey("EXTRA_MAX_PHOTO_SELECT_COUNT")) {
            this.f16372h = getArguments().getInt("EXTRA_MAX_PHOTO_SELECT_COUNT");
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_image_caption_photos_grid, viewGroup, false);
    }

    public final void onDestroyView() {
        if (this.f16366a != null) {
            this.f16366a.setItemAnimator(null);
            this.f16366a.setAdapter(null);
            this.f16366a = null;
        }
        this.f16367b = null;
        super.onDestroyView();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        int i = getResources().getConfiguration().orientation == 1 ? 5 : 10;
        int a = C2489g.m6754a().m6755a(BallPulseIndicator.SCALE / ((float) i));
        this.f16370f = a;
        this.f16371g = a;
        this.f16368c = new GridLayoutManager(getActivity(), i);
        this.f16366a = (RecyclerView) getView().findViewById(R.id.recycler_view);
        this.f16366a.addOnItemTouchListener(new C6075j(getActivity(), this.f16366a, this));
        this.f16366a.addItemDecoration(new C6105a((int) C2491i.m6804b(getActivity(), 2.0f), i));
        this.f16367b = new C6853b(this, getActivity());
        this.f16366a.setHasFixedSize(true);
        this.f16366a.setAdapter(this.f16367b);
        this.f16366a.setLayoutManager(this.f16368c);
    }
}
