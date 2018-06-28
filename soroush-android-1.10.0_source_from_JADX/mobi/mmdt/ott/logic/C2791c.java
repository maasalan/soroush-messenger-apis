package mobi.mmdt.ott.logic;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Environment;
import android.util.DisplayMetrics;
import java.io.File;
import java.util.Calendar;
import java.util.Locale;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.lib_webservicescomponent.p257d.C2556b;
import mobi.mmdt.ott.logic.p359k.C2837a;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p386h.C2988j;
import mobi.mmdt.ott.view.tools.C4516l;
import org.jivesoftware.smack.util.StringUtils;
import org.msgpack.util.TemplatePrecompiler;

public final class C2791c {
    private static C2791c f8814j;
    public String f8815a;
    public String f8816b;
    public String f8817c;
    public String f8818d;
    public String f8819e;
    public String f8820f;
    public String f8821g;
    public String f8822h;
    public String f8823i;
    private String f8824k;
    private String f8825l;

    static /* synthetic */ class C27871 {
        public static final /* synthetic */ int[] f8807a = new int[C2988j.values().length];

        static {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
            /*
            r0 = mobi.mmdt.ott.provider.p386h.C2988j.values();
            r0 = r0.length;
            r0 = new int[r0];
            f8807a = r0;
            r0 = f8807a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = mobi.mmdt.ott.provider.p386h.C2988j.IMAGE;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = f8807a;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = mobi.mmdt.ott.provider.p386h.C2988j.VIDEO;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;	 Catch:{ NoSuchFieldError -> 0x001f }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = f8807a;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = mobi.mmdt.ott.provider.p386h.C2988j.PUSH_TO_TALK;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;	 Catch:{ NoSuchFieldError -> 0x002a }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r0 = f8807a;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = mobi.mmdt.ott.provider.p386h.C2988j.AUDIO;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r2 = 4;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            r0 = f8807a;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r1 = mobi.mmdt.ott.provider.p386h.C2988j.GIF;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0040 }
            r2 = 5;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0040 }
        L_0x0040:
            r0 = f8807a;	 Catch:{ NoSuchFieldError -> 0x004b }
            r1 = mobi.mmdt.ott.provider.p386h.C2988j.OTHER;	 Catch:{ NoSuchFieldError -> 0x004b }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x004b }
            r2 = 6;	 Catch:{ NoSuchFieldError -> 0x004b }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x004b }
        L_0x004b:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.logic.c.1.<clinit>():void");
        }
    }

    private C2791c() {
        StringBuilder stringBuilder;
        String stringBuilder2;
        Configuration configuration = MyApplication.m12952b().getResources().getConfiguration();
        configuration.locale = new Locale("en");
        String string = new Resources(MyApplication.m12952b().getAssets(), new DisplayMetrics(), configuration).getString(R.string.app_name);
        if (!C4516l.m8232a() || C2837a.m7169a()) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(Environment.getExternalStorageDirectory());
            stringBuilder.append(File.separator);
            stringBuilder.append(string);
            stringBuilder2 = stringBuilder.toString();
        } else {
            stringBuilder2 = MyApplication.m12952b().getExternalFilesDir(null).getPath();
        }
        this.f8824k = stringBuilder2;
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append(stringBuilder2);
        stringBuilder3.append(File.separator);
        stringBuilder3.append(string);
        stringBuilder3.append("Images");
        this.f8815a = stringBuilder3.toString();
        stringBuilder3 = new StringBuilder();
        stringBuilder3.append(stringBuilder2);
        stringBuilder3.append(File.separator);
        stringBuilder3.append(TemplatePrecompiler.DEFAULT_DEST);
        stringBuilder3.append(string);
        stringBuilder3.append(".TEMPS");
        this.f8823i = stringBuilder3.toString();
        stringBuilder3 = new StringBuilder();
        stringBuilder3.append(stringBuilder2);
        stringBuilder3.append(File.separator);
        stringBuilder3.append(string);
        stringBuilder3.append("Videos");
        this.f8816b = stringBuilder3.toString();
        stringBuilder3 = new StringBuilder();
        stringBuilder3.append(stringBuilder2);
        stringBuilder3.append(File.separator);
        stringBuilder3.append(".Thumbnails");
        this.f8817c = stringBuilder3.toString();
        stringBuilder3 = new StringBuilder();
        stringBuilder3.append(stringBuilder2);
        stringBuilder3.append(File.separator);
        stringBuilder3.append(".PushToTalks");
        this.f8818d = stringBuilder3.toString();
        stringBuilder3 = new StringBuilder();
        stringBuilder3.append(MyApplication.m12952b().getExternalFilesDir(null).getPath());
        stringBuilder3.append(File.separator);
        stringBuilder3.append(".Stickers");
        this.f8825l = stringBuilder3.toString();
        stringBuilder3 = new StringBuilder();
        stringBuilder3.append(MyApplication.m12952b().getExternalFilesDir(null).getPath());
        stringBuilder3.append(File.separator);
        stringBuilder3.append(".Themes");
        this.f8820f = stringBuilder3.toString();
        stringBuilder3 = new StringBuilder();
        stringBuilder3.append(MyApplication.m12952b().getExternalFilesDir(null).getPath());
        stringBuilder3.append(File.separator);
        stringBuilder3.append(".City");
        this.f8821g = stringBuilder3.toString();
        StringBuilder stringBuilder4 = new StringBuilder();
        stringBuilder4.append(stringBuilder2);
        stringBuilder4.append(File.separator);
        stringBuilder4.append("Others");
        this.f8819e = stringBuilder4.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append(Environment.getExternalStorageDirectory());
        stringBuilder.append(File.separator);
        stringBuilder.append("Pictures");
        stringBuilder2 = stringBuilder.toString();
        if (!new File(stringBuilder2).exists()) {
            new File(stringBuilder2).mkdir();
        }
        stringBuilder4 = new StringBuilder();
        stringBuilder4.append(stringBuilder2);
        stringBuilder4.append(File.separator);
        stringBuilder4.append(string);
        this.f8822h = stringBuilder4.toString();
    }

    public static C2791c m7109a() {
        if (f8814j == null) {
            f8814j = new C2791c();
        }
        return f8814j;
    }

    public static void m7110a(Uri uri) {
        Intent intent;
        Context b;
        if (VERSION.SDK_INT >= 19) {
            intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
            intent.setData(uri);
            b = MyApplication.m12952b();
        } else {
            b = MyApplication.m12952b();
            StringBuilder stringBuilder = new StringBuilder("file://");
            stringBuilder.append(Environment.getExternalStorageDirectory());
            intent = new Intent("android.intent.action.MEDIA_MOUNTED", Uri.parse(stringBuilder.toString()));
        }
        b.sendBroadcast(intent);
    }

    public static void m7111j(String str) {
        if (!new File(str).exists()) {
            new File(str).mkdirs();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(File.separator);
        stringBuilder.append(".nomedia");
        str = stringBuilder.toString();
        if (new File(str).exists() || C2535a.m6888a().m6970s()) {
            if (new File(str).exists() && C2535a.m6888a().m6970s()) {
                new File(str).delete();
            }
            return;
        }
        try {
            new File(str).createNewFile();
        } catch (Throwable e) {
            C2480b.m6738b(e);
        }
    }

    public final String m7112a(String str) {
        String str2 = this.f8815a;
        C2791c.m7111j(str2);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str2);
        stringBuilder.append(File.separator);
        stringBuilder.append(str);
        return stringBuilder.toString();
    }

    public final String m7113a(String str, String str2) {
        if (str.split("\\.").length != 1) {
            return m7121f(str);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(TemplatePrecompiler.DEFAULT_DEST);
        stringBuilder.append(str2);
        return m7121f(stringBuilder.toString());
    }

    public final String m7114b() {
        String str = this.f8817c;
        C2791c.m7111j(str);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(File.separator);
        stringBuilder.append(System.currentTimeMillis());
        stringBuilder.append(".png");
        return stringBuilder.toString();
    }

    public final String m7115b(String str) {
        String str2 = this.f8816b;
        C2791c.m7111j(str2);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str2);
        stringBuilder.append(File.separator);
        stringBuilder.append(str);
        return stringBuilder.toString();
    }

    public final String m7116b(String str, String str2) {
        String str3 = this.f8825l;
        C2791c.m7111j(str3);
        String a = C2556b.m6997a(MyApplication.m12952b());
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str3);
        stringBuilder.append(File.separator);
        stringBuilder.append(str);
        stringBuilder.append(File.separator);
        stringBuilder.append(str);
        stringBuilder.append("_");
        stringBuilder.append(a);
        C2791c.m7111j(stringBuilder.toString());
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(str3);
        stringBuilder2.append(File.separator);
        stringBuilder2.append(str);
        stringBuilder2.append(File.separator);
        stringBuilder2.append(str);
        stringBuilder2.append("_");
        stringBuilder2.append(a);
        stringBuilder2.append(File.separator);
        stringBuilder2.append(str2);
        File file = new File(stringBuilder2.toString());
        file.createNewFile();
        return file.getPath();
    }

    public final String m7117c() {
        String str = this.f8823i;
        C2791c.m7111j(str);
        Calendar instance = Calendar.getInstance();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(File.separator);
        stringBuilder.append(instance.get(1));
        stringBuilder.append(instance.get(2) + 1);
        stringBuilder.append(instance.get(5));
        stringBuilder.append("_");
        stringBuilder.append(instance.get(11));
        stringBuilder.append(instance.get(12));
        stringBuilder.append(instance.get(13));
        stringBuilder.append(".jpg");
        return stringBuilder.toString();
    }

    public final String m7118c(String str) {
        String str2 = this.f8817c;
        C2791c.m7111j(str2);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str2);
        stringBuilder.append(File.separator);
        stringBuilder.append(str);
        stringBuilder.append(".png");
        return stringBuilder.toString();
    }

    public final String m7119d(String str) {
        String str2 = this.f8818d;
        C2791c.m7111j(str2);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str2);
        stringBuilder.append(File.separator);
        stringBuilder.append(str);
        return stringBuilder.toString();
    }

    public final String m7120e(String str) {
        String str2 = this.f8819e;
        C2791c.m7111j(str2);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str2);
        stringBuilder.append(File.separator);
        stringBuilder.append(str);
        return stringBuilder.toString();
    }

    public final String m7121f(String str) {
        String str2 = this.f8823i;
        C2791c.m7111j(str2);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str2);
        stringBuilder.append(File.separator);
        stringBuilder.append("TMP_");
        stringBuilder.append(StringUtils.randomString(5));
        stringBuilder.append(str);
        return stringBuilder.toString();
    }

    public final String m7122g(String str) {
        String str2 = this.f8825l;
        C2791c.m7111j(str2);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str2);
        stringBuilder.append(File.separator);
        stringBuilder.append("stpk_");
        stringBuilder.append(str);
        return stringBuilder.toString();
    }

    public final String m7123h(String str) {
        String str2 = this.f8820f;
        C2791c.m7111j(str2);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str2);
        stringBuilder.append(File.separator);
        stringBuilder.append(str);
        return stringBuilder.toString();
    }

    public final String m7124i(String str) {
        String str2 = this.f8825l;
        C2791c.m7111j(str2);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str2);
        stringBuilder.append(File.separator);
        stringBuilder.append(str);
        File file = new File(stringBuilder.toString());
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getPath();
    }
}
