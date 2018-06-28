package mobi.mmdt.ott.logic.p366o.p367a;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.C6389b;
import android.support.v7.app.C6389b.C0663a;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.p349f.C2814a;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.view.tools.C4488b.C44791;
import mobi.mmdt.ott.view.tools.C4488b.C44802;
import mobi.mmdt.ott.view.tools.C4522p;

public final class C2878a {
    public static void m7232a() {
        if (C2878a.m7234b()) {
            String packageName = MyApplication.m12952b().getPackageName();
            Intent intent = new Intent("android.intent.action.EDIT");
            StringBuilder stringBuilder = new StringBuilder("bazaar://details?id=");
            stringBuilder.append(packageName);
            intent.setData(Uri.parse(stringBuilder.toString()));
            intent.addFlags(268435456);
            intent.setPackage("com.farsitel.bazaar");
            MyApplication.m12952b().startActivity(intent);
        }
    }

    public static void m7233a(Activity activity, C2814a c2814a) {
        Bundle bundle = new Bundle();
        bundle.putString("source", c2814a.name());
        MyApplication.m12950a().m12957a("cafe_bazaar_rating_dialog", bundle);
        CharSequence a = C4522p.m8236a(R.string.cafe_rate_title);
        CharSequence a2 = C4522p.m8236a(C2878a.m7236d());
        CharSequence a3 = C4522p.m8236a(R.string.cafe_rate_yes_button);
        CharSequence a4 = C4522p.m8236a(R.string.cafe_rate_no_button);
        C0663a c0663a = new C0663a(activity, R.style.AppCompatAlertDialogStyle);
        View inflate = activity.getLayoutInflater().inflate(R.layout.dialog_update, null);
        c0663a.m1607a(inflate);
        TextView textView = (TextView) inflate.findViewById(R.id.update_title);
        TextView textView2 = (TextView) inflate.findViewById(R.id.update_description);
        Button button = (Button) inflate.findViewById(R.id.update_button_yes);
        Button button2 = (Button) inflate.findViewById(R.id.update_button_no);
        textView.setText(a);
        textView2.setText(a2);
        button2.setText(a4);
        button.setText(a3);
        C2491i.m6803a(textView);
        C2491i.m6796a(inflate, UIThemeManager.getmInstance().getRecycler_view_background_color());
        C2491i.m6802a(textView, UIThemeManager.getmInstance().getText_primary_color());
        C2491i.m6802a(textView2, UIThemeManager.getmInstance().getText_primary_color());
        C2491i.m6798a(button, UIThemeManager.getmInstance().getButton_text_color());
        C2491i.m6798a(button2, UIThemeManager.getmInstance().getButton_text_color());
        C2491i.m6819b(button, UIThemeManager.getmInstance().getAccent_color());
        C2491i.m6819b(button2, UIThemeManager.getmInstance().getAccent_color());
        C6389b a5 = c0663a.m1612a();
        button.setOnClickListener(new C44791(c2814a, a5, activity));
        button2.setOnClickListener(new C44802(c2814a, a5, activity));
        a5.show();
    }

    public static boolean m7234b() {
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
        r0 = 0;
        r1 = mobi.mmdt.ott.MyApplication.m12952b();	 Catch:{ NameNotFoundException -> 0x000f }
        r1 = r1.getPackageManager();	 Catch:{ NameNotFoundException -> 0x000f }
        r2 = "com.farsitel.bazaar";	 Catch:{ NameNotFoundException -> 0x000f }
        r1.getPackageInfo(r2, r0);	 Catch:{ NameNotFoundException -> 0x000f }
        r0 = 1;
    L_0x000f:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.logic.o.a.a.b():boolean");
    }

    public static boolean m7235c() {
        int i = C2535a.m6888a().f8278a.getInt("mobi.mmdt.ott.model.pref.KEY_REMAINED_RATING_REQUEST", 3);
        if (i == 0) {
            return false;
        }
        C2535a.m6888a().m6943g(i - 1);
        return true;
    }

    private static int m7236d() {
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
        r0 = 2131689705; // 0x7f0f00e9 float:1.9008433E38 double:1.053194651E-314;
        r1 = mobi.mmdt.ott.p246d.p248b.C2535a.m6888a();	 Catch:{ Exception -> 0x001c }
        r1 = r1.m6938f();	 Catch:{ Exception -> 0x001c }
        r1 = java.lang.Long.parseLong(r1);	 Catch:{ Exception -> 0x001c }
        r3 = 2;	 Catch:{ Exception -> 0x001c }
        r1 = r1 % r3;	 Catch:{ Exception -> 0x001c }
        r3 = 0;
        r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1));
        if (r5 != 0) goto L_0x0019;
    L_0x0018:
        return r0;
    L_0x0019:
        r0 = 2131689706; // 0x7f0f00ea float:1.9008435E38 double:1.0531946513E-314;
    L_0x001c:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.logic.o.a.a.d():int");
    }
}
