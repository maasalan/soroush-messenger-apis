package mobi.mmdt.ott.logic.p261a.ac.p267b;

import com.p072b.p073a.p074a.C1073q;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.sticker.base.StickerFilter;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.sticker.sticker_collection_by_filter.C5881a;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p261a.ac.p266a.C2591i;
import mobi.mmdt.ott.logic.p261a.ac.p266a.C2592j;
import mobi.mmdt.ott.logic.p371s.C2899b;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.view.stickermarket.C4462b;
import p000a.p001a.p002a.C0005c;

public final class C6658i extends C5891a {
    private int f18947a;
    private int f18948b;
    private int f18949c;

    static /* synthetic */ class C25931 {
        static final /* synthetic */ int[] f8448a = new int[C4462b.m8129a().length];

        static {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r0 = mobi.mmdt.ott.view.stickermarket.C4462b.m8129a();
            r0 = r0.length;
            r0 = new int[r0];
            f8448a = r0;
            r0 = 1;
            r1 = f8448a;	 Catch:{ NoSuchFieldError -> 0x0011 }
            r2 = mobi.mmdt.ott.view.stickermarket.C4462b.f12383a;	 Catch:{ NoSuchFieldError -> 0x0011 }
            r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x0011 }
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x0011 }
        L_0x0011:
            r1 = f8448a;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r2 = mobi.mmdt.ott.view.stickermarket.C4462b.f12384b;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r3 = 2;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r1[r2] = r3;	 Catch:{ NoSuchFieldError -> 0x0019 }
        L_0x0019:
            r1 = f8448a;	 Catch:{ NoSuchFieldError -> 0x0021 }
            r2 = mobi.mmdt.ott.view.stickermarket.C4462b.f12385c;	 Catch:{ NoSuchFieldError -> 0x0021 }
            r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x0021 }
            r0 = 3;	 Catch:{ NoSuchFieldError -> 0x0021 }
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x0021 }
        L_0x0021:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.logic.a.ac.b.i.1.<clinit>():void");
        }
    }

    public C6658i(int i, int i2, int i3) {
        super(C2683h.f8620b);
        this.f18947a = i;
        this.f18948b = i2;
        this.f18949c = i3;
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        StickerFilter stickerFilter = StickerFilter.Date;
        switch (C25931.f8448a[this.f18947a - 1]) {
            case 1:
                stickerFilter = StickerFilter.Date;
                break;
            case 2:
                stickerFilter = StickerFilter.Downloads;
                break;
            case 3:
                stickerFilter = StickerFilter.Free;
                break;
            default:
                break;
        }
        String b = C2535a.m6888a().m6919b();
        C2899b a = C2899b.m7275a();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f18948b);
        String stringBuilder2 = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append(this.f18949c);
        String stringBuilder3 = stringBuilder.toString();
        String name = stickerFilter.name();
        C0005c.m0a().m9d(new C2592j(new C5881a(C2535a.m6888a().m6928d(), a.m7276a(b), stringBuilder2, stringBuilder3, name).m13086a(MyApplication.m12952b()).getmStickerCollections(), this.f18947a));
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        C0005c.m0a().m9d(new C2591i());
        return C1073q.f3504b;
    }
}
