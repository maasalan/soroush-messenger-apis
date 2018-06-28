package mobi.mmdt.ott.logic.location;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.Snackbar;
import android.support.v4.p029a.C0346c;
import android.support.v7.app.C7406c;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.maps.C1860b;
import com.google.android.gms.maps.C1862c;
import com.google.android.gms.maps.C1862c.C1861a;
import com.google.android.gms.maps.C1864e;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.C1873a;
import com.google.android.gms.maps.model.C1876d;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.p085c.p086a.C1212c;
import com.p085c.p086a.C5284j;
import com.p085c.p086a.p089c.p092b.C1144h;
import com.p085c.p086a.p105g.C1248f;
import com.p085c.p086a.p105g.p106a.C7038f;
import java.util.ArrayList;
import java.util.Iterator;
import mobi.mmdt.componentsutils.p232b.C2474a;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.componentsutils.p232b.p234b.C2475a;
import mobi.mmdt.componentsutils.view.roundavatarimageview.RoundAvatarImageView;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.lib_webservicescomponent.p257d.C2556b;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.C2569b;
import mobi.mmdt.ott.logic.p261a.p318s.C5966a;
import mobi.mmdt.ott.logic.p261a.p318s.p319a.C2743a;
import mobi.mmdt.ott.logic.p261a.p318s.p319a.C2744c;
import mobi.mmdt.ott.logic.p261a.p318s.p319a.C5965b;
import mobi.mmdt.ott.logic.p359k.C2837a;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.view.components.p398a.C7175a.C3101a;
import mobi.mmdt.ott.view.components.p402d.C7576b;
import mobi.mmdt.ott.view.tools.C4478a;
import mobi.mmdt.ott.view.tools.C4488b;
import mobi.mmdt.ott.view.tools.C4513i;
import mobi.mmdt.ott.view.tools.C4516l;
import mobi.mmdt.ott.view.tools.C4522p;

public class MapsActivity extends C7576b implements C1864e, C3101a {
    private String f23897A;
    private int f23898B;
    private String f23899C;
    private String f23900D;
    private String f23901E;
    private C2569b f23902F = C2569b.GSM;
    private RelativeLayout f23903G;
    private LinearLayout f23904H;
    private TextView f23905I;
    private TextView f23906J;
    private OnClickListener f23907K = new C28561(this);
    private C1862c f23908m;
    private double f23909n = 35.7285203d;
    private double f23910o = 51.3864899d;
    private boolean f23911p = false;
    private boolean f23912q = false;
    private ViewGroup f23913r;
    private View f23914s;
    private BottomSheetBehavior f23915t;
    private RoundAvatarImageView f23916u;
    private TextView f23917v;
    private TextView f23918w;
    private TextView f23919z;

    class C28561 implements OnClickListener {
        final /* synthetic */ MapsActivity f8946a;

        C28561(MapsActivity mapsActivity) {
            this.f8946a = mapsActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C2535a.m6888a().m6973u(false);
            this.f8946a.onBackPressed();
        }
    }

    class C28572 implements Runnable {
        final /* synthetic */ ArrayList f8947a;
        final /* synthetic */ MapsActivity f8948b;

        class C59982 implements C1861a {
            final /* synthetic */ C28572 f16150a;

            C59982(C28572 c28572) {
                this.f16150a = c28572;
            }

            public final boolean mo2205a(C1876d c1876d) {
                C5284j b;
                Object a;
                C5966a c5966a = (C5966a) MyApplication.m12950a().f15908n.get(c1876d.m5229b());
                this.f16150a.f8948b.f23897A = c5966a.f8270b;
                this.f16150a.f8948b.f23915t.m8743c(3);
                this.f16150a.f8948b.f23916u.setImageBitmap(null);
                if (c5966a.mo2185e() != null && !c5966a.mo2185e().isEmpty()) {
                    this.f16150a.f8948b.f23900D = C2556b.m6998a(c5966a.mo2185e());
                    b = C1212c.m2875b(this.f16150a.f8948b.f23916u.getContext());
                    a = C2556b.m6998a(c5966a.mo2185e());
                } else if (c5966a.mo2183b() != null) {
                    this.f16150a.f8948b.f23900D = c5966a.mo2183b().toString();
                    b = C1212c.m2875b(this.f16150a.f8948b.f23916u.getContext());
                    a = c5966a.mo2183b();
                } else {
                    C1212c.m2875b(this.f16150a.f8948b.f23916u.getContext()).m10953a(this.f16150a.f8948b.f23916u);
                    this.f16150a.f8948b.f23898B = c5966a.f8274f;
                    this.f16150a.f8948b.f23899C = c5966a.m13181c();
                    this.f16150a.f8948b.f23901E = C2491i.m6825c(MyApplication.m12952b(), c5966a.f16119a, C2535a.m6888a().m6919b());
                    this.f16150a.f8948b.f23902F = c5966a.mo2186f();
                    this.f16150a.f8948b.f23916u.setName(this.f16150a.f8948b.f23899C);
                    this.f16150a.f8948b.f23916u.setBackgroundColor(this.f16150a.f8948b.f23898B);
                    this.f16150a.f8948b.f23917v.setText(this.f16150a.f8948b.f23899C);
                    this.f16150a.f8948b.f23918w.setText(this.f16150a.f8948b.f23901E);
                    this.f16150a.f8948b.f23919z.setText(this.f16150a.f8948b.getString(this.f16150a.f8948b.f23902F.f8395d));
                    return false;
                }
                b.m10950a(a).m3034a(C1248f.m2945b().m2955b(C1144h.f3689a)).m3031a(this.f16150a.f8948b.f23916u);
                this.f16150a.f8948b.f23898B = c5966a.f8274f;
                this.f16150a.f8948b.f23899C = c5966a.m13181c();
                this.f16150a.f8948b.f23901E = C2491i.m6825c(MyApplication.m12952b(), c5966a.f16119a, C2535a.m6888a().m6919b());
                this.f16150a.f8948b.f23902F = c5966a.mo2186f();
                this.f16150a.f8948b.f23916u.setName(this.f16150a.f8948b.f23899C);
                this.f16150a.f8948b.f23916u.setBackgroundColor(this.f16150a.f8948b.f23898B);
                this.f16150a.f8948b.f23917v.setText(this.f16150a.f8948b.f23899C);
                this.f16150a.f8948b.f23918w.setText(this.f16150a.f8948b.f23901E);
                this.f16150a.f8948b.f23919z.setText(this.f16150a.f8948b.getString(this.f16150a.f8948b.f23902F.f8395d));
                return false;
            }
        }

        C28572(MapsActivity mapsActivity, ArrayList arrayList) {
            this.f8948b = mapsActivity;
            this.f8947a = arrayList;
        }

        public final void run() {
            Iterator it = this.f8947a.iterator();
            while (it.hasNext()) {
                final C5966a c5966a = (C5966a) it.next();
                if (c5966a.mo2185e() == null) {
                    if (c5966a.mo2183b() == null) {
                        C1873a a = this.f8948b.m20921a(c5966a);
                        MarkerOptions a2 = new MarkerOptions().m16883a(c5966a.mo2184d());
                        a2.f18741b = a;
                        MyApplication.m12950a().f15908n.put(this.f8948b.f23908m.m5210a(a2).m5229b(), c5966a);
                        this.f8948b.f23908m.m5213a(new C59982(this));
                    }
                }
                String str = null;
                if (c5966a.mo2185e() != null) {
                    str = c5966a.mo2185e();
                } else if (c5966a.mo2183b() != null) {
                    str = c5966a.mo2183b().toString();
                }
                C1873a a3 = this.f8948b.m20921a(c5966a);
                final MarkerOptions a4 = new MarkerOptions().m16883a(c5966a.mo2184d());
                a4.f18741b = a3;
                final C1876d a5 = this.f8948b.f23908m.m5210a(a4);
                MyApplication.m12950a().f15908n.put(a5.m5229b(), c5966a);
                C1212c.m2873a(MapsActivity.m20925b(this.f8948b)).m10958e().m3037a(C2556b.m6998a(str)).m3034a(C1248f.m2945b().m2955b(C1144h.f3689a).m2962h()).m3032a(new C7038f<Bitmap>(this) {
                    final /* synthetic */ C28572 f21061d;

                    public final /* synthetic */ void mo3320a(java.lang.Object r7, com.p085c.p086a.p105g.p107b.C1242b r8) {
                        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
                        /*
                        r6 = this;
                        r7 = (android.graphics.Bitmap) r7;
                        r0 = mobi.mmdt.ott.logic.C2778b.m7093a();	 Catch:{ RuntimeException -> 0x002b }
                        r8 = r1;	 Catch:{ RuntimeException -> 0x002b }
                        r2 = r8.f16119a;	 Catch:{ RuntimeException -> 0x002b }
                        r4 = r0 - r2;	 Catch:{ RuntimeException -> 0x002b }
                        r0 = 7200000; // 0x6ddd00 float:1.0089349E-38 double:3.5572727E-317;	 Catch:{ RuntimeException -> 0x002b }
                        r8 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1));	 Catch:{ RuntimeException -> 0x002b }
                        if (r8 <= 0) goto L_0x0021;	 Catch:{ RuntimeException -> 0x002b }
                    L_0x0013:
                        r8 = r6.f21061d;	 Catch:{ RuntimeException -> 0x002b }
                        r8 = r8.f8948b;	 Catch:{ RuntimeException -> 0x002b }
                        r0 = 0;	 Catch:{ RuntimeException -> 0x002b }
                        r7 = r8.m20917a(r7, r0);	 Catch:{ RuntimeException -> 0x002b }
                    L_0x001c:
                        r7 = com.google.android.gms.maps.model.C1874b.m5226a(r7);	 Catch:{ RuntimeException -> 0x002b }
                        goto L_0x002f;	 Catch:{ RuntimeException -> 0x002b }
                    L_0x0021:
                        r8 = r6.f21061d;	 Catch:{ RuntimeException -> 0x002b }
                        r8 = r8.f8948b;	 Catch:{ RuntimeException -> 0x002b }
                        r0 = 1;	 Catch:{ RuntimeException -> 0x002b }
                        r7 = r8.m20917a(r7, r0);	 Catch:{ RuntimeException -> 0x002b }
                        goto L_0x001c;
                    L_0x002b:
                        r7 = com.google.android.gms.maps.model.C1874b.m5225a();
                    L_0x002f:
                        r8 = r4;
                        r8.f18741b = r7;
                        r7 = r3;
                        r7.m5228a();
                        r7 = r6.f21061d;
                        r7 = r7.f8948b;
                        r7 = r7.f23908m;
                        r8 = r4;
                        r7 = r7.m5210a(r8);
                        r8 = mobi.mmdt.ott.MyApplication.m12950a();
                        r8 = r8.f15908n;
                        r7 = r7.m5229b();
                        r0 = r1;
                        r8.put(r7, r0);
                        return;
                        */
                        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.logic.location.MapsActivity.2.1.a(java.lang.Object, com.c.a.g.b.b):void");
                    }
                });
                this.f8948b.f23908m.m5213a(new C59982(this));
            }
        }
    }

    class C28583 implements OnClickListener {
        final /* synthetic */ MapsActivity f8949a;

        C28583(MapsActivity mapsActivity) {
            this.f8949a = mapsActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C2837a.m7167a(MapsActivity.m20940l(this.f8949a), "android.permission.RECORD_AUDIO", 186);
        }
    }

    class C28594 implements OnClickListener {
        final /* synthetic */ MapsActivity f8950a;

        C28594(MapsActivity mapsActivity) {
            this.f8950a = mapsActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f8950a.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
            dialogInterface.dismiss();
        }
    }

    class C28605 implements Runnable {
        final /* synthetic */ MapsActivity f8951a;

        C28605(MapsActivity mapsActivity) {
            this.f8951a = mapsActivity;
        }

        public final void run() {
            C1862c a = this.f8951a.f23908m;
            CircleOptions circleOptions = new CircleOptions();
            circleOptions.f18713a = new LatLng(this.f8951a.f23909n, this.f8951a.f23910o);
            circleOptions = circleOptions.m16881a();
            circleOptions.f18715c = 805306623;
            circleOptions.f18714b = 805306623;
            a.m5209a(circleOptions);
        }
    }

    private android.graphics.Bitmap m20917a(android.graphics.Bitmap r7, boolean r8) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r6 = this;
        r0 = "layout_inflater";
        r0 = r6.getSystemService(r0);
        r0 = (android.view.LayoutInflater) r0;
        r1 = 0;
        r2 = 2131427904; // 0x7f0b0240 float:1.8477437E38 double:1.053065304E-314;
        r0 = r0.inflate(r2, r1);
        r2 = 2131297070; // 0x7f09032e float:1.8212075E38 double:1.0530006634E-314;
        r2 = r0.findViewById(r2);
        r2 = (mobi.mmdt.componentsutils.view.roundavatarimageview.RoundAvatarImageView) r2;
        r3 = 2131296937; // 0x7f0902a9 float:1.8211805E38 double:1.0530005977E-314;
        r3 = r0.findViewById(r3);
        r3 = (android.widget.ImageView) r3;
        if (r8 == 0) goto L_0x0028;
    L_0x0024:
        r8 = 2131232149; // 0x7f080595 float:1.80804E38 double:1.052968588E-314;
        goto L_0x002b;
    L_0x0028:
        r8 = 2131232148; // 0x7f080594 float:1.8080397E38 double:1.0529685876E-314;
    L_0x002b:
        r4 = android.os.Build.VERSION.SDK_INT;	 Catch:{ RuntimeException -> 0x0044 }
        r5 = 16;	 Catch:{ RuntimeException -> 0x0044 }
        if (r4 < r5) goto L_0x0039;	 Catch:{ RuntimeException -> 0x0044 }
    L_0x0031:
        r8 = android.support.v4.p029a.C0346c.m682a(r6, r8);	 Catch:{ RuntimeException -> 0x0044 }
        r3.setBackground(r8);	 Catch:{ RuntimeException -> 0x0044 }
        goto L_0x0040;	 Catch:{ RuntimeException -> 0x0044 }
    L_0x0039:
        r8 = android.support.v4.p029a.C0346c.m682a(r6, r8);	 Catch:{ RuntimeException -> 0x0044 }
        r3.setBackgroundDrawable(r8);	 Catch:{ RuntimeException -> 0x0044 }
    L_0x0040:
        r2.setImageBitmap(r7);	 Catch:{ RuntimeException -> 0x0044 }
        goto L_0x0047;
    L_0x0044:
        r2.setImageBitmap(r1);
    L_0x0047:
        r7 = 0;
        r0.measure(r7, r7);
        r8 = r0.getMeasuredWidth();
        r2 = r0.getMeasuredHeight();
        r0.layout(r7, r7, r8, r2);
        r0.buildDrawingCache();
        r7 = r0.getMeasuredWidth();	 Catch:{ RuntimeException -> 0x007f }
        r8 = r0.getMeasuredHeight();	 Catch:{ RuntimeException -> 0x007f }
        r2 = android.graphics.Bitmap.Config.ARGB_8888;	 Catch:{ RuntimeException -> 0x007f }
        r7 = android.graphics.Bitmap.createBitmap(r7, r8, r2);	 Catch:{ RuntimeException -> 0x007f }
        r8 = new android.graphics.Canvas;
        r8.<init>(r7);
        r1 = -1;
        r2 = android.graphics.PorterDuff.Mode.SRC_IN;
        r8.drawColor(r1, r2);
        r1 = r0.getBackground();
        if (r1 == 0) goto L_0x007b;
    L_0x0078:
        r1.draw(r8);
    L_0x007b:
        r0.draw(r8);
        return r7;
    L_0x007f:
        r7 = move-exception;
        r8 = "Custom Marker View : RuntimeException | OutOfMemoryError";
        mobi.mmdt.componentsutils.p232b.p235c.C2480b.m6737b(r8, r7);
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.logic.location.MapsActivity.a(android.graphics.Bitmap, boolean):android.graphics.Bitmap");
    }

    private android.graphics.Bitmap m20918a(java.lang.String r7, int r8, boolean r9) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r6 = this;
        r0 = "layout_inflater";
        r0 = r6.getSystemService(r0);
        r0 = (android.view.LayoutInflater) r0;
        r1 = 0;
        r2 = 2131427904; // 0x7f0b0240 float:1.8477437E38 double:1.053065304E-314;
        r0 = r0.inflate(r2, r1);
        r2 = 2131297070; // 0x7f09032e float:1.8212075E38 double:1.0530006634E-314;
        r2 = r0.findViewById(r2);
        r2 = (mobi.mmdt.componentsutils.view.roundavatarimageview.RoundAvatarImageView) r2;
        r3 = 2131296937; // 0x7f0902a9 float:1.8211805E38 double:1.0530005977E-314;
        r3 = r0.findViewById(r3);
        r3 = (android.widget.ImageView) r3;
        if (r9 == 0) goto L_0x0028;
    L_0x0024:
        r9 = 2131232149; // 0x7f080595 float:1.80804E38 double:1.052968588E-314;
        goto L_0x002b;
    L_0x0028:
        r9 = 2131232148; // 0x7f080594 float:1.8080397E38 double:1.0529685876E-314;
    L_0x002b:
        r4 = android.os.Build.VERSION.SDK_INT;	 Catch:{ RuntimeException -> 0x0047, RuntimeException -> 0x0047 }
        r5 = 16;	 Catch:{ RuntimeException -> 0x0047, RuntimeException -> 0x0047 }
        if (r4 < r5) goto L_0x0039;	 Catch:{ RuntimeException -> 0x0047, RuntimeException -> 0x0047 }
    L_0x0031:
        r9 = android.support.v4.p029a.C0346c.m682a(r6, r9);	 Catch:{ RuntimeException -> 0x0047, RuntimeException -> 0x0047 }
        r3.setBackground(r9);	 Catch:{ RuntimeException -> 0x0047, RuntimeException -> 0x0047 }
        goto L_0x0040;	 Catch:{ RuntimeException -> 0x0047, RuntimeException -> 0x0047 }
    L_0x0039:
        r9 = android.support.v4.p029a.C0346c.m682a(r6, r9);	 Catch:{ RuntimeException -> 0x0047, RuntimeException -> 0x0047 }
        r3.setBackgroundDrawable(r9);	 Catch:{ RuntimeException -> 0x0047, RuntimeException -> 0x0047 }
    L_0x0040:
        r2.setName(r7);	 Catch:{ RuntimeException -> 0x0047, RuntimeException -> 0x0047 }
        r2.setBackgroundColor(r8);	 Catch:{ RuntimeException -> 0x0047, RuntimeException -> 0x0047 }
        goto L_0x004a;
    L_0x0047:
        r2.setImageBitmap(r1);
    L_0x004a:
        r7 = 0;
        r0.measure(r7, r7);
        r8 = r0.getMeasuredWidth();
        r9 = r0.getMeasuredHeight();
        r0.layout(r7, r7, r8, r9);
        r0.buildDrawingCache();
        r7 = r0.getMeasuredWidth();	 Catch:{ RuntimeException -> 0x0082, RuntimeException -> 0x0082 }
        r8 = r0.getMeasuredHeight();	 Catch:{ RuntimeException -> 0x0082, RuntimeException -> 0x0082 }
        r9 = android.graphics.Bitmap.Config.ARGB_8888;	 Catch:{ RuntimeException -> 0x0082, RuntimeException -> 0x0082 }
        r7 = android.graphics.Bitmap.createBitmap(r7, r8, r9);	 Catch:{ RuntimeException -> 0x0082, RuntimeException -> 0x0082 }
        r8 = new android.graphics.Canvas;
        r8.<init>(r7);
        r9 = -1;
        r1 = android.graphics.PorterDuff.Mode.SRC_IN;
        r8.drawColor(r9, r1);
        r9 = r0.getBackground();
        if (r9 == 0) goto L_0x007e;
    L_0x007b:
        r9.draw(r8);
    L_0x007e:
        r0.draw(r8);
        return r7;
    L_0x0082:
        r7 = move-exception;
        r8 = "Custom Marker View : RuntimeException | OutOfMemoryError";
        mobi.mmdt.componentsutils.p232b.p235c.C2480b.m6737b(r8, r7);
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.logic.location.MapsActivity.a(java.lang.String, int, boolean):android.graphics.Bitmap");
    }

    private com.google.android.gms.maps.model.C1873a m20921a(mobi.mmdt.ott.logic.p261a.p318s.C5966a r8) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r7 = this;
        r0 = r7.getApplicationContext();	 Catch:{ RuntimeException -> 0x003a }
        r1 = r8.f8270b;	 Catch:{ RuntimeException -> 0x003a }
        r0 = mobi.mmdt.componentsutils.p232b.C2491i.m6806b(r0, r1);	 Catch:{ RuntimeException -> 0x003a }
        r1 = mobi.mmdt.ott.logic.C2778b.m7093a();	 Catch:{ RuntimeException -> 0x003a }
        r3 = r8.f16119a;	 Catch:{ RuntimeException -> 0x003a }
        r5 = r1 - r3;	 Catch:{ RuntimeException -> 0x003a }
        r1 = 7200000; // 0x6ddd00 float:1.0089349E-38 double:3.5572727E-317;	 Catch:{ RuntimeException -> 0x003a }
        r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1));	 Catch:{ RuntimeException -> 0x003a }
        if (r3 <= 0) goto L_0x002e;	 Catch:{ RuntimeException -> 0x003a }
    L_0x0019:
        r8 = r8.m13181c();	 Catch:{ RuntimeException -> 0x003a }
        r1 = 0;	 Catch:{ RuntimeException -> 0x003a }
        r8 = r7.m20918a(r8, r0, r1);	 Catch:{ RuntimeException -> 0x003a }
        if (r8 == 0) goto L_0x0029;	 Catch:{ RuntimeException -> 0x003a }
    L_0x0024:
        r8 = com.google.android.gms.maps.model.C1874b.m5226a(r8);	 Catch:{ RuntimeException -> 0x003a }
        return r8;	 Catch:{ RuntimeException -> 0x003a }
    L_0x0029:
        r8 = com.google.android.gms.maps.model.C1874b.m5225a();	 Catch:{ RuntimeException -> 0x003a }
        return r8;	 Catch:{ RuntimeException -> 0x003a }
    L_0x002e:
        r8 = r8.m13181c();	 Catch:{ RuntimeException -> 0x003a }
        r1 = 1;	 Catch:{ RuntimeException -> 0x003a }
        r8 = r7.m20918a(r8, r0, r1);	 Catch:{ RuntimeException -> 0x003a }
        if (r8 == 0) goto L_0x0029;
    L_0x0039:
        goto L_0x0024;
    L_0x003a:
        r8 = com.google.android.gms.maps.model.C1874b.m5225a();
        return r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.logic.location.MapsActivity.a(mobi.mmdt.ott.logic.a.s.a):com.google.android.gms.maps.model.a");
    }

    static /* synthetic */ C7406c m20925b(MapsActivity mapsActivity) {
        return mapsActivity;
    }

    private void m20935g() {
        if (!((LocationManager) getSystemService("location")).isProviderEnabled("gps") && !this.f23912q) {
            Bundle bundle = new Bundle();
            bundle.putInt("dialog_id", 101);
            b_(bundle);
        }
    }

    static /* synthetic */ C7406c m20940l(MapsActivity mapsActivity) {
        return mapsActivity;
    }

    static /* synthetic */ C7406c m20943o(MapsActivity mapsActivity) {
        return mapsActivity;
    }

    static /* synthetic */ C7406c m20944p(MapsActivity mapsActivity) {
        return mapsActivity;
    }

    static /* synthetic */ C7406c m20945q(MapsActivity mapsActivity) {
        return mapsActivity;
    }

    static /* synthetic */ C7406c m20946r(MapsActivity mapsActivity) {
        return mapsActivity;
    }

    static /* synthetic */ C7406c m20947s(MapsActivity mapsActivity) {
        return mapsActivity;
    }

    public final Dialog mo2299a(Bundle bundle) {
        int i = bundle.getInt("dialog_id");
        if (i != 82) {
            switch (i) {
                case 100:
                    return C4488b.m8182a(this, C4522p.m8236a(R.string.action_disable_find_friends), C4522p.m8236a(R.string.are_you_sure_to_disable_find_friends_service), C4522p.m8236a(R.string.action_disable), this.f23907K, C4522p.m8236a(R.string.cancel), null);
                case 101:
                    this.f23912q = true;
                    return C4488b.m8182a(this, C4522p.m8236a(R.string.enable_location_title), C4522p.m8236a(R.string.enable_location_description), C4522p.m8236a(R.string.ok_cap), new C28594(this), C4522p.m8236a(R.string.cancel), null);
                default:
                    return null;
            }
        }
        return C4488b.m8182a(this, C4522p.m8236a(R.string.record_audio_permission), C4522p.m8236a(R.string.allow_soroush_access_to_your_microphone), C4522p.m8236a(R.string.movafegham), new C28583(this), C4522p.m8236a(R.string.felan_na), null);
    }

    public final void mo3640a(C1862c c1862c) {
        this.f23908m = c1862c;
        LatLng latLng = new LatLng(this.f23909n, this.f23910o);
        if (this.f23911p) {
            if (!C4516l.m8232a() || C2837a.m7170a("android.permission.ACCESS_FINE_LOCATION")) {
                m20935g();
            } else {
                C2837a.m7167a(this, "android.permission.ACCESS_FINE_LOCATION", 188);
            }
        }
        if (this.f23911p) {
            this.f23908m.m5212a(C1860b.m5207a(latLng, 10.0f));
            if (C0346c.m681a((Context) this, "android.permission.ACCESS_FINE_LOCATION") == 0 && C0346c.m681a((Context) this, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                this.f23908m.m5211a();
            }
            return;
        }
        C1862c c1862c2 = this.f23908m;
        MarkerOptions a = new MarkerOptions().m16883a(latLng);
        a.f18740a = "Marker";
        c1862c2.m5210a(a);
        this.f23908m.m5212a(C1860b.m5207a(latLng, 17.0f));
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && (this.f23915t.f13049d == 3 || this.f23915t.f13049d == 2)) {
            Rect rect = new Rect();
            this.f23914s.getGlobalVisibleRect(rect);
            if (!rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                this.f23915t.m8743c(4);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void onBackPressed() {
        finish();
        overridePendingTransition(R.anim.anim_slide_in_right, R.anim.anim_slide_out_right);
    }

    public void onCallClicked(View view) {
        if (!C2474a.m6718b(getApplicationContext())) {
            Snackbar.m8770a(this.f23903G, C4522p.m8236a(R.string.connection_error_message), -1).m572a();
        } else if (!C4516l.m8232a() || C2837a.m7170a("android.permission.RECORD_AUDIO")) {
            if (this.f23897A.equals(C2535a.m6888a().m6928d())) {
                Snackbar.m8770a(this.f23903G, C4522p.m8236a(R.string.you_can_not_call_yourself), -1).m572a();
            } else {
                C4478a.m8163c((Activity) this, this.f23897A);
            }
        } else {
            Bundle bundle = new Bundle();
            bundle.putInt("dialog_id", 82);
            b_(bundle);
        }
    }

    public void onChatClicked(View view) {
        C4478a.m8150a((Activity) this, this.f23897A, false, null, "");
    }

    public void onContactDetailsClicked(View view) {
        C4478a.m8149a((Activity) this, this.f23897A, true);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_maps);
        this.x = (Toolbar) findViewById(R.id.toolbar);
        this.f23913r = (ViewGroup) findViewById(R.id.main_content);
        this.f23903G = (RelativeLayout) findViewById(R.id.root_relativeLayout);
        this.y = findViewById(R.id.shadow_line_top);
        this.f23914s = findViewById(R.id.bottom_sheet);
        this.f23915t = BottomSheetBehavior.m8727b(this.f23914s);
        if (this.f23915t != null) {
            this.f23915t.m8743c(4);
            this.f23915t.m8741b(0);
        }
        this.f23904H = (LinearLayout) this.f23914s.findViewById(R.id.root_linear_layout);
        this.f23916u = (RoundAvatarImageView) this.f23914s.findViewById(R.id.imageView1);
        this.f23917v = (TextView) this.f23914s.findViewById(R.id.textView1);
        this.f23918w = (TextView) this.f23914s.findViewById(R.id.textView2);
        this.f23919z = (TextView) this.f23914s.findViewById(R.id.textView3);
        this.f23905I = (TextView) this.f23914s.findViewById(R.id.chat_imageView);
        FrameLayout frameLayout = (FrameLayout) this.f23914s.findViewById(R.id.chat_frameLayout);
        FrameLayout frameLayout2 = (FrameLayout) this.f23914s.findViewById(R.id.call_frameLayout);
        this.f23906J = (TextView) this.f23914s.findViewById(R.id.call_imageView);
        if (!(getIntent() == null || getIntent().getExtras() == null || !getIntent().getExtras().containsKey("KEY_LATITUDE"))) {
            this.f23909n = getIntent().getDoubleExtra("KEY_LATITUDE", -34.0d);
        }
        if (!(getIntent() == null || getIntent().getExtras() == null || !getIntent().getExtras().containsKey("KEY_LONGITUDE"))) {
            this.f23910o = getIntent().getDoubleExtra("KEY_LONGITUDE", 151.0d);
        }
        if (!(getIntent() == null || getIntent().getExtras() == null || !getIntent().getExtras().containsKey("KEY_NEAR_BY"))) {
            this.f23911p = getIntent().getBooleanExtra("KEY_NEAR_BY", false);
        }
        if (bundle != null) {
            if (bundle.containsKey("KEY_IS_SHOW_DIALOG_CONTACT_PERMISSION")) {
                this.f23912q = bundle.getBoolean("KEY_IS_SHOW_DIALOG_CONTACT_PERMISSION");
            }
            if (bundle.containsKey("KEY_FOCUSED_CONTACT_USER_ID")) {
                this.f23897A = bundle.getString("KEY_FOCUSED_CONTACT_USER_ID");
                this.f23901E = bundle.getString("KEY_GET_TIME");
                this.f23899C = bundle.getString("KEY_GET_CONTACT_NAME");
                this.f23900D = bundle.getString("KEY_GET_CONTACT_AVATAR");
                this.f23898B = bundle.getInt("KEY_GET_CONTACT_COLOR");
                this.f23902F = C2569b.values()[bundle.getInt("KEY_GET_LOCATION_TYPE")];
                this.f23916u.setName(this.f23899C);
                this.f23916u.setBackgroundColor(this.f23898B);
                this.f23917v.setText(this.f23899C);
                this.f23918w.setText(this.f23901E);
                this.f23919z.setText(getString(this.f23902F.f8395d));
                if (this.f23900D != null) {
                    C1212c.m2875b(this.f23916u.getContext()).m10950a(this.f23900D).m3034a(C1248f.m2945b().m2955b(C1144h.f3689a)).m3031a(this.f23916u);
                }
            }
        }
        ((SupportMapFragment) m19188c().mo251a((int) R.id.map)).m16869a((C1864e) this);
        m20721a(UIThemeManager.getmInstance().getPrimary_color(), UIThemeManager.getmInstance().getText_primary_new_design_color(), UIThemeManager.getmInstance().getText_primary_new_design_color());
        View[] viewArr = new View[]{frameLayout, frameLayout2};
        C2491i.m6796a(this.f23904H, UIThemeManager.getmInstance().getRecycler_view_background_color());
        C2491i.m6802a(this.f23917v, UIThemeManager.getmInstance().getText_primary_color());
        C2491i.m6802a(this.f23918w, UIThemeManager.getmInstance().getText_secondary_color());
        C2491i.m6802a(this.f23919z, UIThemeManager.getmInstance().getText_secondary_color());
        C2491i.m6802a(this.f23905I, UIThemeManager.getmInstance().getText_primary_color());
        C2491i.m6802a(this.f23906J, UIThemeManager.getmInstance().getText_primary_color());
        C2491i.m6828c(this.f23905I, UIThemeManager.getmInstance().getAccent_color());
        C2491i.m6828c(this.f23906J, UIThemeManager.getmInstance().getAccent_color());
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_location, menu);
        MenuItem findItem = menu.findItem(R.id.action_share);
        MenuItem findItem2 = menu.findItem(R.id.action_disable);
        findItem.setTitle(C4522p.m8236a(R.string.action_share));
        findItem2.setTitle(C4522p.m8236a(R.string.action_disable_find_friends));
        C2491i.m6790a(findItem.getIcon(), UIThemeManager.getmInstance().getIcon_not_selected_color());
        if (this.f23911p) {
            findItem.setVisible(false);
            findItem2.setVisible(true);
            setTitle(C4522p.m8236a(R.string.find_friends));
            C2475a.m6721b(this, C4522p.m8236a(R.string.try_to_get_location_sub_title));
        } else {
            setTitle(R.string.send_you_a_location);
            findItem.setVisible(true);
            findItem2.setVisible(false);
        }
        return super.onCreateOptionsMenu(menu);
    }

    public void onEvent(C2743a c2743a) {
        if (C2535a.m6888a().m6910W() != null) {
            String[] split = C2535a.m6888a().m6910W().split(",");
            this.f23909n = Double.parseDouble(split[0]);
            this.f23910o = Double.parseDouble(split[1]);
        }
        new Handler(Looper.getMainLooper()).post(new C28605(this));
    }

    public void onEvent(final C5965b c5965b) {
        runOnUiThread(new Runnable(this) {
            final /* synthetic */ MapsActivity f8953b;

            public final void run() {
                C2475a.m6721b(MapsActivity.m20943o(this.f8953b), null);
                C4513i.m8228a(MapsActivity.m20944p(this.f8953b), c5965b.f8890a);
            }
        });
    }

    public void onEvent(final C2744c c2744c) {
        final int size = c2744c.f8690a.size();
        runOnUiThread(new Runnable(this) {
            final /* synthetic */ MapsActivity f8956c;

            public final void run() {
                if (size > 0) {
                    Activity q;
                    String a;
                    Object[] objArr;
                    if (size == 1) {
                        q = MapsActivity.m20945q(this.f8956c);
                        a = C4522p.m8236a(R.string.friend_founded);
                        objArr = new Object[]{Integer.valueOf(size)};
                    } else {
                        q = MapsActivity.m20946r(this.f8956c);
                        a = C4522p.m8236a(R.string.friends_founded);
                        objArr = new Object[]{Integer.valueOf(size)};
                    }
                    C2475a.m6721b(q, String.format(a, objArr));
                    new Handler(Looper.getMainLooper()).post(new C28572(this.f8956c, c2744c.f8690a));
                    return;
                }
                C2475a.m6721b(MapsActivity.m20947s(this.f8956c), null);
                Snackbar.m8770a(this.f8956c.f23903G, C4522p.m8236a(R.string.the_find_friends_service_of_your_friends_is_not_enabled), -2).m572a();
            }
        });
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            onBackPressed();
            return true;
        }
        if (itemId == R.id.action_share) {
            StringBuilder stringBuilder = new StringBuilder("geo:");
            stringBuilder.append(this.f23909n);
            stringBuilder.append(", ");
            stringBuilder.append(this.f23910o);
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(stringBuilder.toString()));
            intent.setPackage("com.google.android.apps.maps");
            startActivity(intent);
        } else if (itemId == R.id.action_disable) {
            Bundle bundle = new Bundle();
            bundle.putInt("dialog_id", 100);
            b_(bundle);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 188 && iArr.length > 0) {
            if (iArr[0] == -1) {
                onBackPressed();
                return;
            }
            m20935g();
        }
    }

    protected void onResume() {
        super.onResume();
        m20723a(true, UIThemeManager.getmInstance().getIcon_not_selected_color());
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("KEY_IS_SHOW_DIALOG_CONTACT_PERMISSION", this.f23912q);
        bundle.putString("KEY_FOCUSED_CONTACT_USER_ID", this.f23897A);
        bundle.putInt("KEY_GET_LOCATION_TYPE", this.f23902F.ordinal());
        bundle.putString("KEY_GET_TIME", this.f23901E);
        bundle.putString("KEY_GET_CONTACT_NAME", this.f23899C);
        bundle.putString("KEY_GET_CONTACT_AVATAR", this.f23900D);
        bundle.putInt("KEY_GET_CONTACT_COLOR", this.f23898B);
    }
}
