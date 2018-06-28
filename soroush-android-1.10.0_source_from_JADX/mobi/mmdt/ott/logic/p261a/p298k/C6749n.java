package mobi.mmdt.ott.logic.p261a.p298k;

import android.media.MediaMetadataRetriever;
import android.net.Uri;
import com.p072b.p073a.p074a.C1073q;
import java.io.File;
import java.util.ArrayList;
import mobi.mmdt.componentsutils.p232b.C2484d;
import mobi.mmdt.componentsutils.p232b.C2486e;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.componentsutils.p232b.p236d.C2483a;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.logic.C2778b;
import mobi.mmdt.ott.logic.C2791c;
import mobi.mmdt.ott.logic.C2808d;
import mobi.mmdt.ott.logic.p261a.C2642e;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p261a.af.C6673p;
import mobi.mmdt.ott.logic.p261a.p298k.p299a.C5949z;
import mobi.mmdt.ott.logic.p261a.p308q.p310b.C2731a;
import mobi.mmdt.ott.logic.videocompressor.VideoCompressor;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p384f.C2966b;
import mobi.mmdt.ott.provider.p384f.C2970j;
import mobi.mmdt.ott.provider.p384f.C2971k;
import mobi.mmdt.ott.provider.p384f.C2972l;
import mobi.mmdt.ott.provider.p384f.C2973m;
import mobi.mmdt.ott.provider.p385g.C2980g;
import mobi.mmdt.ott.provider.p386h.C2984c;
import mobi.mmdt.ott.provider.p386h.C2987i;
import mobi.mmdt.ott.provider.p386h.C2988j;
import p000a.p001a.p002a.C0005c;

public final class C6749n extends C5891a {
    private String f19252a;
    private C2972l f19253b;
    private long f19254c;
    private String f19255d;
    private C2988j f19256e;
    private String f19257f;
    private String f19258g;
    private Long f19259h;
    private int f19260i;
    private String f19261j = null;
    private C2484d f19262k;
    private C2731a f19263l;

    public C6749n(String str, String str2, String str3, C2988j c2988j, String str4, C2731a c2731a) {
        super(C2683h.f8620b);
        this.f19252a = str;
        this.f19258g = str2;
        this.f19257f = str3;
        this.f19256e = c2988j;
        this.f19261j = str4;
        this.f19263l = c2731a;
    }

    public C6749n(String str, String str2, String str3, C2988j c2988j, C2731a c2731a) {
        super(C2683h.f8620b);
        this.f19252a = str;
        this.f19258g = str2;
        this.f19257f = str3;
        this.f19256e = c2988j;
        this.f19263l = c2731a;
    }

    public final void onAdded() {
        this.f19255d = C2483a.m6744a(MyApplication.m12952b());
        this.f19254c = C2778b.m7093a();
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        String a;
        long j;
        VideoCompressor videoCompressor;
        this.f19262k = new C2484d(0, 0);
        if (this.f19256e.equals(C2988j.IMAGE)) {
            a = C2791c.m7109a().m7112a(new File(r1.f19257f).getName());
            try {
                C2486e.m6747a(r1.f19257f, a);
                r1.f19257f = a;
            } catch (Throwable e) {
                C2480b.m6737b("OutOfMemoryError in compress image", e);
            }
            r1.f19262k = C2486e.m6748b(r1.f19257f);
        } else if (r1.f19256e.equals(C2988j.VIDEO)) {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            mediaMetadataRetriever.setDataSource(r1.f19257f);
            r1.f19262k = new C2484d(Integer.parseInt(mediaMetadataRetriever.extractMetadata(18)), Integer.parseInt(mediaMetadataRetriever.extractMetadata(19)));
        }
        File file = new File(r1.f19257f);
        long length = file.length();
        if (r1.f19263l == null || !r1.f19263l.f8676a) {
            j = length;
            a = null;
            videoCompressor = a;
        } else {
            String b = C2791c.m7109a().m7115b(file.getName());
            j = (long) r1.f19263l.f8686k;
            videoCompressor = new VideoCompressor(r1.f19257f, b, r1.f19263l);
            a = b;
        }
        try {
            C2972l c2972l;
            switch (r1.f19256e) {
                case IMAGE:
                    file.getName();
                    r1.f19259h = C2642e.m7052a(file, false, true, -1, r1.f19257f, r1.f19256e, r1.f19262k.f8163a, r1.f19262k.f8164b, j);
                    c2972l = C2972l.IMAGE;
                    break;
                case GIF:
                    file.getName();
                    r1.f19259h = C2642e.m7052a(file, false, true, -1, r1.f19257f, r1.f19256e, r1.f19262k.f8163a, r1.f19262k.f8164b, j);
                    c2972l = C2972l.GIF;
                    break;
                case VIDEO:
                    if (r1.f19263l != null) {
                        r1.f19260i = (int) r1.f19263l.f8687l;
                    } else {
                        r1.f19260i = C2642e.m7051a(r1.f19257f);
                    }
                    file.getName();
                    r1.f19259h = C2642e.m7052a(file, false, true, r1.f19260i, r1.f19257f, r1.f19256e, r1.f19262k.f8163a, r1.f19262k.f8164b, j);
                    c2972l = C2972l.VIDEO;
                    break;
                case PUSH_TO_TALK:
                    r1.f19260i = C2642e.m7051a(r1.f19257f);
                    file.getName();
                    r1.f19259h = C2642e.m7052a(file, true, false, r1.f19260i, r1.f19257f, r1.f19256e, r1.f19262k.f8163a, r1.f19262k.f8164b, j);
                    c2972l = C2972l.PUSH_TO_TALK;
                    break;
                case AUDIO:
                    r1.f19260i = C2642e.m7051a(r1.f19257f);
                    file.getName();
                    r1.f19259h = C2642e.m7052a(file, true, false, r1.f19260i, r1.f19257f, r1.f19256e, r1.f19262k.f8163a, r1.f19262k.f8164b, j);
                    c2972l = C2972l.AUDIO;
                    break;
                case OTHER:
                    file.getName();
                    r1.f19259h = C2642e.m7052a(file, false, false, -1, r1.f19257f, r1.f19256e, r1.f19262k.f8163a, r1.f19262k.f8164b, j);
                    c2972l = C2972l.FILE;
                    break;
                default:
                    break;
            }
            r1.f19253b = c2972l;
        } catch (Throwable e2) {
            C2480b.m6737b("IOException", e2);
        }
        try {
            C2966b.m7397a(r1.f19255d, r1.f19253b, r1.f19258g, r1.f19254c, r1.f19254c, C2970j.OUT, C2971k.SENDING, r1.f19252a, C2973m.CHANNEL, C2535a.m6888a().m6928d(), r1.f19259h, null, r1.f19261j, null, false);
            C2980g.m7424a(r1.f19252a, r1.f19255d, Long.valueOf(r1.f19254c));
        } catch (Throwable e22) {
            C2480b.m6738b(e22);
        }
        if (!(r1.f19263l == null || videoCompressor == null || a == null || !r1.f19263l.f8676a || !VideoCompressor.processOpenVideo(r1.f19257f, r1.f19263l.f8679d))) {
            videoCompressor.startConvert();
            C2984c.m7466c(r1.f19259h.longValue(), Uri.fromFile(new File(a)));
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(r1.f19252a);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(r1.f19255d);
        C2808d.m7149c(new C6673p(arrayList, r1.f19259h.longValue(), arrayList2, r1.f19258g, r1.f19261j, r1.f19256e, C2973m.CHANNEL, r1.f19260i, null, null, null, null));
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        C2984c.m7456a(this.f19259h.longValue(), C2987i.ERROR);
        C0005c.m0a().m9d(new C5949z(th));
        return C1073q.f3504b;
    }
}
