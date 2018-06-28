package mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b;

import android.net.Uri;
import com.p072b.p073a.p074a.C1073q;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
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
import mobi.mmdt.ott.logic.p261a.p287g.p288a.p289a.C5927d;
import mobi.mmdt.ott.logic.p261a.p287g.p293b.C2674a;
import mobi.mmdt.ott.logic.p261a.p287g.p293b.C6729f;
import mobi.mmdt.ott.logic.p261a.p308q.p310b.C2731a;
import mobi.mmdt.ott.logic.videocompressor.VideoCompressor;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p384f.C2964a;
import mobi.mmdt.ott.provider.p384f.C2966b;
import mobi.mmdt.ott.provider.p384f.C2970j;
import mobi.mmdt.ott.provider.p384f.C2971k;
import mobi.mmdt.ott.provider.p384f.C2972l;
import mobi.mmdt.ott.provider.p384f.C2973m;
import mobi.mmdt.ott.provider.p385g.C2975b;
import mobi.mmdt.ott.provider.p385g.C2980g;
import mobi.mmdt.ott.provider.p386h.C2984c;
import mobi.mmdt.ott.provider.p386h.C2987i;
import mobi.mmdt.ott.provider.p386h.C2988j;
import p000a.p001a.p002a.C0005c;

public final class C6721j extends C5891a {
    private String f19132a;
    private String f19133b;
    private String f19134c;
    private ArrayList<String> f19135d = new ArrayList();
    private ArrayList<String> f19136e;
    private C2988j f19137f;
    private long f19138g;
    private C2973m f19139h;
    private String f19140i = null;
    private String f19141j;
    private C2731a f19142k;
    private C2674a f19143l = new C2674a(null, null, null);
    private boolean f19144m;

    public C6721j(ArrayList<String> arrayList, String str, String str2, C2988j c2988j, String str3, C2973m c2973m, String str4, String str5, C2731a c2731a, boolean z) {
        super(C2683h.f8620b, str3);
        this.f19132a = str2;
        this.f19136e = arrayList;
        this.f19137f = c2988j;
        if (str == null) {
            str = "";
        }
        this.f19133b = str;
        this.f19139h = c2973m;
        this.f19140i = str4;
        this.f19141j = str5;
        this.f19142k = c2731a;
        this.f19144m = z;
    }

    public C6721j(ArrayList<String> arrayList, String str, String str2, C2988j c2988j, String str3, C2973m c2973m, String str4, C2731a c2731a, boolean z) {
        super(C2683h.f8620b, str3);
        this.f19132a = str2;
        this.f19136e = arrayList;
        this.f19137f = c2988j;
        if (str == null) {
            str = "";
        }
        this.f19133b = str;
        this.f19139h = c2973m;
        this.f19140i = str4;
        this.f19142k = c2731a;
        this.f19144m = z;
    }

    public C6721j(ArrayList<String> arrayList, String str, String str2, C2988j c2988j, String str3, C2973m c2973m, C2731a c2731a, boolean z) {
        super(C2683h.f8620b, str3);
        this.f19132a = str2;
        this.f19136e = arrayList;
        this.f19137f = c2988j;
        if (str == null) {
            str = "";
        }
        this.f19133b = str;
        this.f19139h = c2973m;
        this.f19142k = c2731a;
        this.f19144m = z;
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        Throwable e;
        long j;
        String str;
        VideoCompressor videoCompressor;
        C2972l c2972l;
        int i;
        String str2;
        VideoCompressor videoCompressor2;
        VideoCompressor videoCompressor3;
        String str3;
        Iterator it;
        int i2;
        long j2;
        Throwable th;
        long a = C2778b.m7093a();
        int i3 = 0;
        C2484d c2484d = new C2484d(0, 0);
        File file = new File(this.f19132a);
        if (this.f19134c == null) {
            r1.f19134c = file.getName();
        }
        if (r1.f19137f.equals(C2988j.IMAGE)) {
            if (r1.f19144m) {
                String a2 = C2791c.m7109a().m7112a(r1.f19134c);
                try {
                    C2486e.m6747a(r1.f19132a, a2);
                    r1.f19132a = a2;
                } catch (Throwable e2) {
                    C2480b.m6737b("OutOfMemoryError in compress image", e2);
                }
            }
            c2484d = C2486e.m6748b(r1.f19132a);
        }
        long length = file.length();
        if (r1.f19142k == null || !r1.f19142k.f8676a) {
            j = length;
            str = null;
            videoCompressor = str;
        } else {
            String b = C2791c.m7109a().m7115b(r1.f19134c);
            str = b;
            videoCompressor = new VideoCompressor(r1.f19132a, b, r1.f19142k);
            j = (long) r1.f19142k.f8686k;
        }
        switch (r1.f19137f) {
            case IMAGE:
                c2972l = C2972l.IMAGE;
                break;
            case GIF:
                c2972l = C2972l.GIF;
                break;
            case VIDEO:
                c2972l = C2972l.VIDEO;
                break;
            case PUSH_TO_TALK:
                c2972l = C2972l.PUSH_TO_TALK;
                break;
            case AUDIO:
                c2972l = C2972l.AUDIO;
                break;
            case LOCATION:
                c2972l = C2972l.LOCATION;
                break;
            default:
                c2972l = C2972l.FILE;
                break;
        }
        C2972l c2972l2 = c2972l;
        C2988j c2988j = r1.f19137f;
        String str4 = r1.f19132a;
        C2731a c2731a = r1.f19142k;
        switch (c2988j) {
            case VIDEO:
                if (c2731a != null) {
                    i = (int) (!c2731a.f8676a ? c2731a.f8687l * 1000 : c2731a.f8687l);
                    break;
                }
            case PUSH_TO_TALK:
            case AUDIO:
                i = C2642e.m7051a(str4);
                break;
            default:
                i = -1;
                break;
        }
        int i4 = i;
        switch (r1.f19137f) {
            case IMAGE:
            case GIF:
            case OTHER:
            case VIDEO:
            case PUSH_TO_TALK:
            case AUDIO:
                String str5 = r1.f19132a;
                C2988j c2988j2 = r1.f19137f;
                int i5 = c2484d.f8163a;
                str2 = str;
                int i6 = c2484d.f8164b;
                videoCompressor2 = videoCompressor;
                r1.f19138g = C2642e.m7052a(file, false, true, i4, str5, c2988j2, i5, i6, j).longValue();
                break;
            default:
                str2 = str;
                videoCompressor2 = videoCompressor;
                break;
        }
        Iterator it2 = r1.f19136e.iterator();
        int i7 = 0;
        while (it2.hasNext()) {
            str = (String) it2.next();
            String d = C2535a.m6888a().m6928d();
            r1.f19135d.add(C2483a.m6744a(MyApplication.m12952b()));
            try {
                int i8;
                if (r1.f19139h.equals(C2973m.SINGLE)) {
                    try {
                        if (C2980g.m7439b(str)) {
                            videoCompressor3 = videoCompressor2;
                        } else {
                            try {
                                videoCompressor3 = videoCompressor2;
                                try {
                                    C2980g.m7427a(str, a, false, false, 0, (String) r1.f19135d.get(i7), Long.valueOf(a));
                                } catch (C2975b e3) {
                                    e2 = e3;
                                    try {
                                        C2480b.m6738b(e2);
                                        str3 = str;
                                        C2980g.m7424a(str, (String) r1.f19135d.get(i7), Long.valueOf(a));
                                        i8 = i7;
                                        it = it2;
                                        i2 = i3;
                                        j2 = a;
                                        try {
                                            C2966b.m7397a((String) r1.f19135d.get(i7), c2972l2, r1.f19133b, a, a, C2970j.OUT, C2971k.SENDING, str, r1.f19139h, str3, Long.valueOf(r1.f19138g), null, r1.f19140i, r1.f19141j, false);
                                            i3 = i8;
                                        } catch (C2964a e4) {
                                            e2 = e4;
                                            i3 = i8;
                                            th = e2;
                                            C2480b.m6738b(th);
                                            i7 = i3;
                                            i3 = i2;
                                            it2 = it;
                                            a = j2;
                                            videoCompressor2 = videoCompressor3;
                                        }
                                    } catch (C2964a e5) {
                                        e2 = e5;
                                        th = e2;
                                        it = it2;
                                        i2 = i3;
                                        j2 = a;
                                        i3 = i7;
                                        C2480b.m6738b(th);
                                        i7 = i3;
                                        i3 = i2;
                                        it2 = it;
                                        a = j2;
                                        videoCompressor2 = videoCompressor3;
                                    }
                                    try {
                                        C6729f.m17190a(r1.f19143l.f8607b, r1.f19143l.f8606a, (String) r1.f19135d.get(i3), r1.f19143l.f8608c, null);
                                        C2808d.m7148b(new C6729f((String) r1.f19135d.get(i3), r1.f19143l));
                                        i7 = i3 + 1;
                                    } catch (C2964a e6) {
                                        e2 = e6;
                                        th = e2;
                                        C2480b.m6738b(th);
                                        i7 = i3;
                                        i3 = i2;
                                        it2 = it;
                                        a = j2;
                                        videoCompressor2 = videoCompressor3;
                                    }
                                    i3 = i2;
                                    it2 = it;
                                    a = j2;
                                    videoCompressor2 = videoCompressor3;
                                }
                            } catch (C2975b e7) {
                                e2 = e7;
                                videoCompressor3 = videoCompressor2;
                                C2480b.m6738b(e2);
                                str3 = str;
                                C2980g.m7424a(str, (String) r1.f19135d.get(i7), Long.valueOf(a));
                                i8 = i7;
                                it = it2;
                                i2 = i3;
                                j2 = a;
                                C2966b.m7397a((String) r1.f19135d.get(i7), c2972l2, r1.f19133b, a, a, C2970j.OUT, C2971k.SENDING, str, r1.f19139h, str3, Long.valueOf(r1.f19138g), null, r1.f19140i, r1.f19141j, false);
                                i3 = i8;
                                C6729f.m17190a(r1.f19143l.f8607b, r1.f19143l.f8606a, (String) r1.f19135d.get(i3), r1.f19143l.f8608c, null);
                                C2808d.m7148b(new C6729f((String) r1.f19135d.get(i3), r1.f19143l));
                                i7 = i3 + 1;
                                i3 = i2;
                                it2 = it;
                                a = j2;
                                videoCompressor2 = videoCompressor3;
                            }
                        }
                        str3 = str;
                    } catch (C2964a e8) {
                        e2 = e8;
                        videoCompressor3 = videoCompressor2;
                        th = e2;
                        it = it2;
                        i2 = i3;
                        j2 = a;
                        i3 = i7;
                        C2480b.m6738b(th);
                        i7 = i3;
                        i3 = i2;
                        it2 = it;
                        a = j2;
                        videoCompressor2 = videoCompressor3;
                    }
                } else {
                    videoCompressor3 = videoCompressor2;
                    str3 = d;
                }
                try {
                    C2980g.m7424a(str, (String) r1.f19135d.get(i7), Long.valueOf(a));
                    i8 = i7;
                    it = it2;
                    i2 = i3;
                    j2 = a;
                    C2966b.m7397a((String) r1.f19135d.get(i7), c2972l2, r1.f19133b, a, a, C2970j.OUT, C2971k.SENDING, str, r1.f19139h, str3, Long.valueOf(r1.f19138g), null, r1.f19140i, r1.f19141j, false);
                    i3 = i8;
                } catch (C2964a e9) {
                    e2 = e9;
                    it = it2;
                    i2 = i3;
                    j2 = a;
                    i3 = i7;
                    th = e2;
                    C2480b.m6738b(th);
                    i7 = i3;
                    i3 = i2;
                    it2 = it;
                    a = j2;
                    videoCompressor2 = videoCompressor3;
                }
                try {
                    C6729f.m17190a(r1.f19143l.f8607b, r1.f19143l.f8606a, (String) r1.f19135d.get(i3), r1.f19143l.f8608c, null);
                    C2808d.m7148b(new C6729f((String) r1.f19135d.get(i3), r1.f19143l));
                    i7 = i3 + 1;
                } catch (C2964a e10) {
                    e2 = e10;
                    th = e2;
                    C2480b.m6738b(th);
                    i7 = i3;
                    i3 = i2;
                    it2 = it;
                    a = j2;
                    videoCompressor2 = videoCompressor3;
                }
            } catch (C2964a e11) {
                e2 = e11;
                videoCompressor3 = videoCompressor2;
                it = it2;
                i2 = i3;
                j2 = a;
                i3 = i7;
                th = e2;
                C2480b.m6738b(th);
                i7 = i3;
                i3 = i2;
                it2 = it;
                a = j2;
                videoCompressor2 = videoCompressor3;
            }
            i3 = i2;
            it2 = it;
            a = j2;
            videoCompressor2 = videoCompressor3;
        }
        videoCompressor3 = videoCompressor2;
        i2 = i3;
        if (r1.f19142k != null) {
            VideoCompressor videoCompressor4 = videoCompressor3;
            if (videoCompressor4 != null) {
                b = str2;
                if (b != null && r1.f19142k.f8676a && VideoCompressor.processOpenVideo(r1.f19132a, r1.f19142k.f8679d) && videoCompressor4.startConvert()) {
                    C2984c.m7466c(r1.f19138g, Uri.fromFile(new File(b)));
                }
            }
        }
        for (int i9 = i2; i9 < r1.f19136e.size(); i9++) {
            C2808d.m7149c(new C6673p(r1.f19136e, r1.f19138g, r1.f19135d, r1.f19133b, r1.f19140i, r1.f19137f, r1.f19139h, i4, r1.f19141j, r1.f19143l.f8607b, r1.f19143l.f8608c, r1.f19143l.f8606a));
        }
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        C2984c.m7456a(this.f19138g, C2987i.ERROR);
        C0005c.m0a().m9d(new C5927d(th));
        return C1073q.f3504b;
    }
}
