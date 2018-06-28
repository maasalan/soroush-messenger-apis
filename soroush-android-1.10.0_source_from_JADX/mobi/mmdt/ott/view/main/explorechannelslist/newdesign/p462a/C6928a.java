package mobi.mmdt.ott.view.main.explorechannelslist.newdesign.p462a;

import android.app.Activity;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.ViewGroup;
import mobi.mmdt.ott.provider.p388j.C2998f;
import mobi.mmdt.ott.view.components.p401c.C6071a;
import mobi.mmdt.ott.view.components.p401c.C6072d;
import mobi.mmdt.ott.view.main.explorechannelslist.newdesign.C4224d;
import mobi.mmdt.ott.view.main.explorechannelslist.newdesign.p556c.C6934a;
import mobi.mmdt.ott.view.main.explorechannelslist.newdesign.p556c.C6935b;
import mobi.mmdt.ott.view.main.explorechannelslist.newdesign.p556c.C6936c;

public final class C6928a extends C6072d {
    private final Activity f19799c;
    private final C4224d f19800d;

    static /* synthetic */ class C42091 {
        static final /* synthetic */ int[] f11964a = new int[C2998f.m7495a().length];

        static {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r0 = mobi.mmdt.ott.provider.p388j.C2998f.m7495a();
            r0 = r0.length;
            r0 = new int[r0];
            f11964a = r0;
            r0 = 1;
            r1 = f11964a;	 Catch:{ NoSuchFieldError -> 0x0011 }
            r2 = mobi.mmdt.ott.provider.p388j.C2998f.f9408a;	 Catch:{ NoSuchFieldError -> 0x0011 }
            r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x0011 }
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x0011 }
        L_0x0011:
            r1 = f11964a;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r2 = mobi.mmdt.ott.provider.p388j.C2998f.f9409b;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r3 = 2;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r1[r2] = r3;	 Catch:{ NoSuchFieldError -> 0x0019 }
        L_0x0019:
            r1 = f11964a;	 Catch:{ NoSuchFieldError -> 0x0021 }
            r2 = mobi.mmdt.ott.provider.p388j.C2998f.f9410c;	 Catch:{ NoSuchFieldError -> 0x0021 }
            r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x0021 }
            r0 = 3;	 Catch:{ NoSuchFieldError -> 0x0021 }
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x0021 }
        L_0x0021:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.main.explorechannelslist.newdesign.a.a.1.<clinit>():void");
        }
    }

    public C6928a(Activity activity, C4224d c4224d) {
        super(activity);
        this.f19800d = c4224d;
        this.f19799c = activity;
    }

    public final void mo3247a(C6071a c6071a, int i) {
        super.mo3247a(c6071a, i);
    }

    public final int getItemViewType(int i) {
        switch (C42091.f11964a[C2998f.m7495a()[m13664a(i).f19503j] - 1]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            default:
                return super.getItemViewType(i);
        }
    }

    public final /* synthetic */ void onBindViewHolder(ViewHolder viewHolder, int i) {
        super.mo3247a((C6071a) viewHolder, i);
    }

    public final /* synthetic */ ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        switch (i) {
            case 0:
                return new C6934a(this.f19799c, i, viewGroup, this.f19800d);
            case 1:
                return new C6936c(this.f19799c, i, viewGroup, this.f19800d);
            case 2:
                return new C6935b(this.f19799c, i, viewGroup, this.f19800d);
            default:
                return null;
        }
    }
}
