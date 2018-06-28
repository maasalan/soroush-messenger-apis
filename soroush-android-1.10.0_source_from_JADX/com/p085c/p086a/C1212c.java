package com.p085c.p086a;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.support.v4.app.C7249g;
import android.util.Log;
import com.p085c.p086a.p088b.C1087a;
import com.p085c.p086a.p089c.C1162b;
import com.p085c.p086a.p089c.C1211k;
import com.p085c.p086a.p089c.p090a.C5111i.C5110a;
import com.p085c.p086a.p089c.p092b.C5149i;
import com.p085c.p086a.p089c.p092b.p093a.C1104b;
import com.p085c.p086a.p089c.p092b.p093a.C1106e;
import com.p085c.p086a.p089c.p092b.p093a.C5120i;
import com.p085c.p086a.p089c.p092b.p093a.C5122j;
import com.p085c.p086a.p089c.p092b.p094b.C1121h;
import com.p085c.p086a.p089c.p092b.p094b.C1124i;
import com.p085c.p086a.p089c.p092b.p094b.C1124i.C1122a;
import com.p085c.p086a.p089c.p092b.p094b.C5131g;
import com.p085c.p086a.p089c.p092b.p094b.C6446f;
import com.p085c.p086a.p089c.p092b.p095c.C1130a;
import com.p085c.p086a.p089c.p092b.p096d.C1132a;
import com.p085c.p086a.p089c.p097c.C5170a.C5163b;
import com.p085c.p086a.p089c.p097c.C5170a.C5165c;
import com.p085c.p086a.p089c.p097c.C5176b.C5172a;
import com.p085c.p086a.p089c.p097c.C5176b.C5175d;
import com.p085c.p086a.p089c.p097c.C5177c;
import com.p085c.p086a.p089c.p097c.C5180d.C5179b;
import com.p085c.p086a.p089c.p097c.C5184e.C5183c;
import com.p085c.p086a.p089c.p097c.C5189f.C6447b;
import com.p085c.p086a.p089c.p097c.C5189f.C6448e;
import com.p085c.p086a.p089c.p097c.C5190g;
import com.p085c.p086a.p089c.p097c.C5196k.C5194a;
import com.p085c.p086a.p089c.p097c.C5203r.C5201a;
import com.p085c.p086a.p089c.p097c.C5203r.C5202b;
import com.p085c.p086a.p089c.p097c.C5204s;
import com.p085c.p086a.p089c.p097c.C5207t.C5205a;
import com.p085c.p086a.p089c.p097c.C5207t.C5206b;
import com.p085c.p086a.p089c.p097c.C5210u.C5208a;
import com.p085c.p086a.p089c.p097c.C5213v.C5211a;
import com.p085c.p086a.p089c.p097c.C5213v.C5212c;
import com.p085c.p086a.p089c.p097c.C5215w.C5214a;
import com.p085c.p086a.p089c.p097c.p512a.C5161a.C5160a;
import com.p085c.p086a.p089c.p097c.p512a.C5163b.C5162a;
import com.p085c.p086a.p089c.p097c.p512a.C5165c.C5164a;
import com.p085c.p086a.p089c.p097c.p512a.C5167d.C5166a;
import com.p085c.p086a.p089c.p097c.p512a.C5169e.C5168a;
import com.p085c.p086a.p089c.p098d.p099a.C1188m;
import com.p085c.p086a.p089c.p098d.p099a.C5216a;
import com.p085c.p086a.p089c.p098d.p099a.C5218g;
import com.p085c.p086a.p089c.p098d.p099a.C5221k;
import com.p085c.p086a.p089c.p098d.p099a.C5231q;
import com.p085c.p086a.p089c.p098d.p099a.C5234s;
import com.p085c.p086a.p089c.p098d.p099a.C6449b;
import com.p085c.p086a.p089c.p098d.p099a.C6451d;
import com.p085c.p086a.p089c.p098d.p100e.C5242a;
import com.p085c.p086a.p089c.p098d.p100e.C5244c;
import com.p085c.p086a.p089c.p098d.p100e.C5246h;
import com.p085c.p086a.p089c.p098d.p100e.C5247i;
import com.p085c.p086a.p089c.p098d.p100e.C6455d;
import com.p085c.p086a.p089c.p098d.p101f.C5248a;
import com.p085c.p086a.p089c.p098d.p101f.C5249b;
import com.p085c.p086a.p089c.p098d.p101f.C5250c;
import com.p085c.p086a.p089c.p098d.p513b.C5237a.C5236a;
import com.p085c.p086a.p089c.p098d.p515d.C5241a;
import com.p085c.p086a.p102d.C1214d;
import com.p085c.p086a.p102d.C1220l;
import com.p085c.p086a.p102d.C5259f;
import com.p085c.p086a.p103e.C1224b;
import com.p085c.p086a.p103e.C1226d;
import com.p085c.p086a.p105g.C1248f;
import com.p085c.p086a.p105g.p106a.C1238e;
import com.p085c.p086a.p109i.C1271h;
import com.p085c.p086a.p109i.C1273i;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

@TargetApi(14)
public class C1212c implements ComponentCallbacks2 {
    private static volatile C1212c f3828j;
    private static volatile boolean f3829k;
    public final C1106e f3830a;
    public final C1121h f3831b;
    public final C1227e f3832c;
    public final C1254h f3833d;
    public final C1104b f3834e;
    public final C1220l f3835f;
    final C1214d f3836g;
    final List<C5284j> f3837h = new ArrayList();
    public C1237f f3838i = C1237f.NORMAL;
    private final C5149i f3839l;
    private final C1132a f3840m;

    @TargetApi(14)
    private C1212c(Context context, C5149i c5149i, C1121h c1121h, C1106e c1106e, C1104b c1104b, C1220l c1220l, C1214d c1214d, int i, C1248f c1248f) {
        Context context2 = context;
        C1121h c1121h2 = c1121h;
        C1106e c1106e2 = c1106e;
        C1104b c1104b2 = c1104b;
        C5149i c5149i2 = c5149i;
        this.f3839l = c5149i2;
        this.f3830a = c1106e2;
        this.f3834e = c1104b2;
        this.f3831b = c1121h2;
        this.f3835f = c1220l;
        this.f3836g = c1214d;
        C1248f c1248f2 = c1248f;
        this.f3840m = new C1132a(c1121h2, c1106e2, (C1162b) c1248f2.f3922q.m10873a(C1188m.f3767a));
        Resources resources = context2.getResources();
        this.f3833d = new C1254h();
        C1254h c1254h = this.f3833d;
        c1254h.f3948d.m2902a(new C5221k());
        C1188m c1188m = new C1188m(this.f3833d.m2976a(), resources.getDisplayMetrics(), c1106e2, c1104b2);
        C1211k c5242a = new C5242a(context2, this.f3833d.m2976a(), c1106e2, c1104b2);
        this.f3833d.m2971a(ByteBuffer.class, new C5177c()).m2971a(InputStream.class, new C5204s(c1104b2)).m2975a(ByteBuffer.class, Bitmap.class, new C5218g(c1188m)).m2975a(InputStream.class, Bitmap.class, new C5231q(c1188m, c1104b2)).m2975a(ParcelFileDescriptor.class, Bitmap.class, new C5234s(c1106e2)).m2972a(Bitmap.class, new C6451d()).m2975a(ByteBuffer.class, BitmapDrawable.class, new C5216a(resources, c1106e2, new C5218g(c1188m))).m2975a(InputStream.class, BitmapDrawable.class, new C5216a(resources, c1106e2, new C5231q(c1188m, c1104b2))).m2975a(ParcelFileDescriptor.class, BitmapDrawable.class, new C5216a(resources, c1106e2, new C5234s(c1106e2))).m2972a(BitmapDrawable.class, new C6449b(c1106e2, new C6451d())).m2978b(InputStream.class, C5244c.class, new C5247i(this.f3833d.m2976a(), c5242a, c1104b2)).m2978b(ByteBuffer.class, C5244c.class, c5242a).m2972a(C5244c.class, new C6455d()).m2973a(C1087a.class, C1087a.class, new C5208a()).m2975a(C1087a.class, Bitmap.class, new C5246h(c1106e2)).m2970a(new C5236a()).m2973a(File.class, ByteBuffer.class, new C5179b()).m2973a(File.class, InputStream.class, new C6448e()).m2975a(File.class, File.class, new C5241a()).m2973a(File.class, ParcelFileDescriptor.class, new C6447b()).m2973a(File.class, File.class, new C5208a()).m2970a(new C5110a(c1104b2)).m2973a(Integer.TYPE, InputStream.class, new C5202b(resources)).m2973a(Integer.TYPE, ParcelFileDescriptor.class, new C5201a(resources)).m2973a(Integer.class, InputStream.class, new C5202b(resources)).m2973a(Integer.class, ParcelFileDescriptor.class, new C5201a(resources)).m2973a(String.class, InputStream.class, new C5183c()).m2973a(String.class, InputStream.class, new C5206b()).m2973a(String.class, ParcelFileDescriptor.class, new C5205a()).m2973a(Uri.class, InputStream.class, new C5162a()).m2973a(Uri.class, InputStream.class, new C5165c(context2.getAssets())).m2973a(Uri.class, ParcelFileDescriptor.class, new C5163b(context2.getAssets())).m2973a(Uri.class, InputStream.class, new C5164a(context2)).m2973a(Uri.class, InputStream.class, new C5166a(context2)).m2973a(Uri.class, InputStream.class, new C5212c(context2.getContentResolver())).m2973a(Uri.class, ParcelFileDescriptor.class, new C5211a(context2.getContentResolver())).m2973a(Uri.class, InputStream.class, new C5214a()).m2973a(URL.class, InputStream.class, new C5168a()).m2973a(Uri.class, File.class, new C5194a(context2)).m2973a(C5190g.class, InputStream.class, new C5160a()).m2973a(byte[].class, ByteBuffer.class, new C5172a()).m2973a(byte[].class, InputStream.class, new C5175d()).m2974a(Bitmap.class, BitmapDrawable.class, new C5249b(resources, c1106e2)).m2974a(Bitmap.class, byte[].class, new C5248a()).m2974a(C5244c.class, byte[].class, new C5250c());
        this.f3832c = new C1227e(context2, this.f3833d, new C1238e(), c1248f2, c5149i2, this, i);
    }

    public static C1212c m2871a(Context context) {
        if (f3828j == null) {
            synchronized (C1212c.class) {
                if (f3828j == null) {
                    if (f3829k) {
                        throw new IllegalStateException("You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead");
                    }
                    f3829k = true;
                    C1212c.m2876c(context);
                    f3829k = false;
                }
            }
        }
        return f3828j;
    }

    public static C5284j m2872a(Activity activity) {
        return C1212c.m2877d(activity).m2892a(activity);
    }

    public static C5284j m2873a(C7249g c7249g) {
        return C1212c.m2877d(c7249g).m2894a(c7249g);
    }

    private static com.p085c.p086a.C6441a m2874b() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r0 = "com.bumptech.glide.GeneratedAppGlideModuleImpl";	 Catch:{ ClassNotFoundException -> 0x001f, InstantiationException -> 0x0016, IllegalAccessException -> 0x000d }
        r0 = java.lang.Class.forName(r0);	 Catch:{ ClassNotFoundException -> 0x001f, InstantiationException -> 0x0016, IllegalAccessException -> 0x000d }
        r0 = r0.newInstance();	 Catch:{ ClassNotFoundException -> 0x001f, InstantiationException -> 0x0016, IllegalAccessException -> 0x000d }
        r0 = (com.p085c.p086a.C6441a) r0;	 Catch:{ ClassNotFoundException -> 0x001f, InstantiationException -> 0x0016, IllegalAccessException -> 0x000d }
        return r0;
    L_0x000d:
        r0 = move-exception;
        r1 = new java.lang.IllegalStateException;
        r2 = "GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.";
        r1.<init>(r2, r0);
        throw r1;
    L_0x0016:
        r0 = move-exception;
        r1 = new java.lang.IllegalStateException;
        r2 = "GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.";
        r1.<init>(r2, r0);
        throw r1;
    L_0x001f:
        r0 = "Glide";
        r1 = 5;
        r0 = android.util.Log.isLoggable(r0, r1);
        if (r0 == 0) goto L_0x002f;
    L_0x0028:
        r0 = "Glide";
        r1 = "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored";
        android.util.Log.w(r0, r1);
    L_0x002f:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.c.a.c.b():com.c.a.a");
    }

    public static C5284j m2875b(Context context) {
        return C1212c.m2877d(context).m2893a(context);
    }

    private static void m2876c(Context context) {
        Context applicationContext = context.getApplicationContext();
        C6441a b = C1212c.m2874b();
        Collections.emptyList();
        List<C1224b> a = new C1226d(applicationContext).m2898a();
        if (!(b == null || b.m15352a().isEmpty())) {
            Set a2 = b.m15352a();
            Iterator it = a.iterator();
            while (it.hasNext()) {
                C1224b c1224b = (C1224b) it.next();
                if (a2.contains(c1224b.getClass())) {
                    if (Log.isLoggable("Glide", 3)) {
                        StringBuilder stringBuilder = new StringBuilder("AppGlideModule excludes manifest GlideModule: ");
                        stringBuilder.append(c1224b);
                        Log.d("Glide", stringBuilder.toString());
                    }
                    it.remove();
                }
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            for (C1224b c1224b2 : a) {
                StringBuilder stringBuilder2 = new StringBuilder("Discovered GlideModule from manifest: ");
                stringBuilder2.append(c1224b2.getClass());
                Log.d("Glide", stringBuilder2.toString());
            }
        }
        C1223d c1223d = new C1223d();
        c1223d.f3871l = null;
        Iterator it2 = a.iterator();
        while (it2.hasNext()) {
            it2.next();
        }
        if (c1223d.f3864e == null) {
            c1223d.f3864e = C1130a.m2729b();
        }
        if (c1223d.f3865f == null) {
            c1223d.f3865f = C1130a.m2727a();
        }
        if (c1223d.f3867h == null) {
            C1122a c1122a = new C1122a(applicationContext);
            c1223d.f3867h = new C1124i(c1122a.f3617a, c1122a.f3618b, c1122a.f3619c, c1122a.f3620d, c1122a.f3621e, c1122a.f3624h, c1122a.f3622f, c1122a.f3623g);
        }
        if (c1223d.f3868i == null) {
            c1223d.f3868i = new C5259f();
        }
        if (c1223d.f3861b == null) {
            c1223d.f3861b = new C5122j(c1223d.f3867h.f3625a);
        }
        if (c1223d.f3862c == null) {
            c1223d.f3862c = new C5120i(c1223d.f3867h.f3627c);
        }
        if (c1223d.f3863d == null) {
            c1223d.f3863d = new C5131g(c1223d.f3867h.f3626b);
        }
        if (c1223d.f3866g == null) {
            c1223d.f3866g = new C6446f(applicationContext);
        }
        if (c1223d.f3860a == null) {
            c1223d.f3860a = new C5149i(c1223d.f3863d, c1223d.f3866g, c1223d.f3865f, c1223d.f3864e, C1130a.m2730c());
        }
        C1220l c1220l = new C1220l(c1223d.f3871l);
        C5149i c5149i = c1223d.f3860a;
        C1121h c1121h = c1223d.f3863d;
        C1106e c1106e = c1223d.f3861b;
        C1104b c1104b = c1223d.f3862c;
        C1214d c1214d = c1223d.f3868i;
        int i = c1223d.f3869j;
        C1248f c1248f = c1223d.f3870k;
        c1248f.f3925t = true;
        C1212c c1212c = new C1212c(applicationContext, c5149i, c1121h, c1106e, c1104b, c1220l, c1214d, i, c1248f);
        Iterator it3 = a.iterator();
        while (it3.hasNext()) {
            it3.next();
        }
        f3828j = c1212c;
    }

    private static C1220l m2877d(Context context) {
        C1271h.m3012a((Object) context, "You cannot start a load on a not yet attached View or a  Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return C1212c.m2871a(context).f3835f;
    }

    public final void m2878a() {
        C1273i.m3021a();
        this.f3831b.m2716a();
        this.f3830a.mo1135a();
        this.f3834e.mo1131a();
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onLowMemory() {
        m2878a();
    }

    public void onTrimMemory(int i) {
        C1273i.m3021a();
        this.f3831b.mo1151a(i);
        this.f3830a.mo1137a(i);
        this.f3834e.mo1132a(i);
    }
}
