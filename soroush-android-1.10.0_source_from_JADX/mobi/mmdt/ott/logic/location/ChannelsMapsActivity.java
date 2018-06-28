package mobi.mmdt.ott.logic.location;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.design.widget.BottomSheetBehavior;
import android.support.v4.p029a.C0346c;
import android.support.v7.app.C7406c;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
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
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.componentsutils.p232b.p234b.C2475a;
import mobi.mmdt.componentsutils.view.roundavatarimageview.RoundAvatarImageView;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.lib_webservicescomponent.p257d.C2556b;
import mobi.mmdt.ott.logic.C2808d;
import mobi.mmdt.ott.logic.p261a.p279d.p280a.C2632b;
import mobi.mmdt.ott.logic.p261a.p279d.p280a.C5910a;
import mobi.mmdt.ott.logic.p261a.p279d.p523c.C5911a;
import mobi.mmdt.ott.logic.p261a.p279d.p547b.C6685a;
import mobi.mmdt.ott.logic.p261a.p318s.p319a.C2743a;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.view.components.p398a.C7175a.C3101a;
import mobi.mmdt.ott.view.components.p402d.C7576b;
import mobi.mmdt.ott.view.tools.C4478a;
import mobi.mmdt.ott.view.tools.C4488b;
import mobi.mmdt.ott.view.tools.C4513i;
import mobi.mmdt.ott.view.tools.C4522p;

public class ChannelsMapsActivity extends C7576b implements C1864e, C3101a {
    private String f23878A;
    private String f23879B;
    private String f23880C;
    private RelativeLayout f23881D;
    private LinearLayout f23882E;
    private TextView f23883F;
    private String f23884G;
    private C1862c f23885m;
    private double f23886n = 35.7285203d;
    private double f23887o = 51.3864899d;
    private boolean f23888p = false;
    private boolean f23889q = false;
    private View f23890r;
    private BottomSheetBehavior f23891s;
    private RoundAvatarImageView f23892t;
    private TextView f23893u;
    private TextView f23894v;
    private String f23895w;
    private int f23896z;

    class C28501 implements Runnable {
        final /* synthetic */ C5911a[] f8936a;
        final /* synthetic */ ChannelsMapsActivity f8937b;

        class C59972 implements C1861a {
            final /* synthetic */ C28501 f16149a;

            C59972(C28501 c28501) {
                this.f16149a = c28501;
            }

            public final boolean mo2205a(C1876d c1876d) {
                C5284j b;
                Object a;
                C5911a c5911a = (C5911a) MyApplication.m12950a().f15908n.get(c1876d.m5229b());
                this.f16149a.f8937b.f23895w = c5911a.f8270b;
                this.f16149a.f8937b.f23891s.m8743c(3);
                this.f16149a.f8937b.f23892t.setImageBitmap(null);
                this.f16149a.f8937b.f23892t.setName(this.f16149a.f8937b.f23878A);
                this.f16149a.f8937b.f23892t.setBackgroundColor(this.f16149a.f8937b.f23896z);
                if (c5911a.mo2185e() != null && !c5911a.mo2185e().isEmpty()) {
                    this.f16149a.f8937b.f23879B = C2556b.m6998a(c5911a.mo2185e());
                    b = C1212c.m2875b(this.f16149a.f8937b.f23892t.getContext());
                    a = C2556b.m6998a(c5911a.mo2185e());
                } else if (c5911a.mo2182a() != null) {
                    this.f16149a.f8937b.f23879B = C2556b.m6998a(c5911a.mo2182a());
                    b = C1212c.m2875b(this.f16149a.f8937b.f23892t.getContext());
                    a = this.f16149a.f8937b.f23879B;
                } else {
                    C1212c.m2875b(this.f16149a.f8937b.f23892t.getContext()).m10953a(this.f16149a.f8937b.f23892t);
                    this.f16149a.f8937b.f23896z = c5911a.f8274f;
                    this.f16149a.f8937b.f23878A = c5911a.i_();
                    this.f16149a.f8937b.f23884G = c5911a.f16072a;
                    this.f16149a.f8937b.f23893u.setText(this.f16149a.f8937b.f23878A);
                    this.f16149a.f8937b.f23894v.setText(this.f16149a.f8937b.f23884G);
                    return false;
                }
                b.m10950a(a).m3034a(C1248f.m2945b().m2955b(C1144h.f3689a)).m3031a(this.f16149a.f8937b.f23892t);
                this.f16149a.f8937b.f23896z = c5911a.f8274f;
                this.f16149a.f8937b.f23878A = c5911a.i_();
                this.f16149a.f8937b.f23884G = c5911a.f16072a;
                this.f16149a.f8937b.f23893u.setText(this.f16149a.f8937b.f23878A);
                this.f16149a.f8937b.f23894v.setText(this.f16149a.f8937b.f23884G);
                return false;
            }
        }

        C28501(ChannelsMapsActivity channelsMapsActivity, C5911a[] c5911aArr) {
            this.f8937b = channelsMapsActivity;
            this.f8936a = c5911aArr;
        }

        public final void run() {
            for (final C5911a c5911a : this.f8936a) {
                if (c5911a.mo2185e() == null) {
                    if (c5911a.mo2182a() == null) {
                        C1873a a = this.f8937b.m20890a(c5911a);
                        MarkerOptions a2 = new MarkerOptions().m16883a(c5911a.mo2184d());
                        a2.f18741b = a;
                        MyApplication.m12950a().f15908n.put(this.f8937b.f23885m.m5210a(a2).m5229b(), c5911a);
                        this.f8937b.f23885m.m5213a(new C59972(this));
                    }
                }
                String str = null;
                if (c5911a.mo2185e() != null) {
                    str = c5911a.mo2185e();
                } else if (c5911a.mo2182a() != null) {
                    str = c5911a.mo2182a();
                }
                C1873a a3 = this.f8937b.m20890a(c5911a);
                final MarkerOptions a4 = new MarkerOptions().m16883a(c5911a.mo2184d());
                a4.f18741b = a3;
                final C1876d a5 = this.f8937b.f23885m.m5210a(a4);
                MyApplication.m12950a().f15908n.put(a5.m5229b(), c5911a);
                C1212c.m2873a(ChannelsMapsActivity.m20893b(this.f8937b)).m10958e().m3037a(C2556b.m6998a(str)).m3034a(C1248f.m2945b().m2955b(C1144h.f3689a).m2962h()).m3032a(new C7038f<Bitmap>(this) {
                    final /* synthetic */ C28501 f21057d;

                    public final /* synthetic */ void mo3320a(java.lang.Object r2, com.p085c.p086a.p105g.p107b.C1242b r3) {
                        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
                        /*
                        r1 = this;
                        r2 = (android.graphics.Bitmap) r2;
                        r3 = r1.f21057d;	 Catch:{ RuntimeException -> 0x000f }
                        r3 = r3.f8937b;	 Catch:{ RuntimeException -> 0x000f }
                        r2 = r3.m20886a(r2);	 Catch:{ RuntimeException -> 0x000f }
                        r2 = com.google.android.gms.maps.model.C1874b.m5226a(r2);	 Catch:{ RuntimeException -> 0x000f }
                        goto L_0x0013;
                    L_0x000f:
                        r2 = com.google.android.gms.maps.model.C1874b.m5225a();
                    L_0x0013:
                        r3 = r6;
                        r3.f18741b = r2;
                        r2 = r5;
                        r2.m5228a();
                        r2 = r1.f21057d;
                        r2 = r2.f8937b;
                        r2 = r2.f23885m;
                        r3 = r6;
                        r2 = r2.m5210a(r3);
                        r3 = mobi.mmdt.ott.MyApplication.m12950a();
                        r3 = r3.f15908n;
                        r2 = r2.m5229b();
                        r0 = r3;
                        r3.put(r2, r0);
                        return;
                        */
                        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.logic.location.ChannelsMapsActivity.1.1.a(java.lang.Object, com.c.a.g.b.b):void");
                    }
                });
                this.f8937b.f23885m.m5213a(new C59972(this));
            }
        }
    }

    class C28512 implements OnClickListener {
        final /* synthetic */ ChannelsMapsActivity f8938a;

        C28512(ChannelsMapsActivity channelsMapsActivity) {
            this.f8938a = channelsMapsActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            ChannelsMapsActivity.m20905k(this.f8938a);
        }
    }

    class C28523 implements OnClickListener {
        final /* synthetic */ ChannelsMapsActivity f8939a;

        C28523(ChannelsMapsActivity channelsMapsActivity) {
            this.f8939a = channelsMapsActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            ChannelsMapsActivity.m20906l(this.f8939a);
        }
    }

    class C28534 implements Runnable {
        final /* synthetic */ ChannelsMapsActivity f8940a;

        C28534(ChannelsMapsActivity channelsMapsActivity) {
            this.f8940a = channelsMapsActivity;
        }

        public final void run() {
            C1862c a = this.f8940a.f23885m;
            CircleOptions circleOptions = new CircleOptions();
            circleOptions.f18713a = new LatLng(this.f8940a.f23886n, this.f8940a.f23887o);
            circleOptions = circleOptions.m16881a();
            circleOptions.f18715c = 805306623;
            circleOptions.f18714b = 805306623;
            a.m5209a(circleOptions);
        }
    }

    private android.graphics.Bitmap m20886a(android.graphics.Bitmap r8) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r7 = this;
        r0 = "layout_inflater";
        r0 = r7.getSystemService(r0);
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
        r4 = android.os.Build.VERSION.SDK_INT;	 Catch:{ RuntimeException -> 0x003e }
        r5 = 16;	 Catch:{ RuntimeException -> 0x003e }
        r6 = 2131232147; // 0x7f080593 float:1.8080395E38 double:1.052968587E-314;	 Catch:{ RuntimeException -> 0x003e }
        if (r4 < r5) goto L_0x0033;	 Catch:{ RuntimeException -> 0x003e }
    L_0x002b:
        r4 = android.support.v4.p029a.C0346c.m682a(r7, r6);	 Catch:{ RuntimeException -> 0x003e }
        r3.setBackground(r4);	 Catch:{ RuntimeException -> 0x003e }
        goto L_0x003a;	 Catch:{ RuntimeException -> 0x003e }
    L_0x0033:
        r4 = android.support.v4.p029a.C0346c.m682a(r7, r6);	 Catch:{ RuntimeException -> 0x003e }
        r3.setBackgroundDrawable(r4);	 Catch:{ RuntimeException -> 0x003e }
    L_0x003a:
        r2.setImageBitmap(r8);	 Catch:{ RuntimeException -> 0x003e }
        goto L_0x0041;
    L_0x003e:
        r2.setImageBitmap(r1);
    L_0x0041:
        r8 = 0;
        r0.measure(r8, r8);
        r2 = r0.getMeasuredWidth();
        r3 = r0.getMeasuredHeight();
        r0.layout(r8, r8, r2, r3);
        r0.buildDrawingCache();
        r8 = r0.getMeasuredWidth();	 Catch:{ RuntimeException -> 0x0079 }
        r2 = r0.getMeasuredHeight();	 Catch:{ RuntimeException -> 0x0079 }
        r3 = android.graphics.Bitmap.Config.ARGB_8888;	 Catch:{ RuntimeException -> 0x0079 }
        r8 = android.graphics.Bitmap.createBitmap(r8, r2, r3);	 Catch:{ RuntimeException -> 0x0079 }
        r1 = new android.graphics.Canvas;
        r1.<init>(r8);
        r2 = -1;
        r3 = android.graphics.PorterDuff.Mode.SRC_IN;
        r1.drawColor(r2, r3);
        r2 = r0.getBackground();
        if (r2 == 0) goto L_0x0075;
    L_0x0072:
        r2.draw(r1);
    L_0x0075:
        r0.draw(r1);
        return r8;
    L_0x0079:
        r8 = move-exception;
        r0 = "Custom Marker View : RuntimeException | OutOfMemoryError";
        mobi.mmdt.componentsutils.p232b.p235c.C2480b.m6737b(r0, r8);
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.logic.location.ChannelsMapsActivity.a(android.graphics.Bitmap):android.graphics.Bitmap");
    }

    private android.graphics.Bitmap m20887a(java.lang.String r8, int r9) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r7 = this;
        r0 = "layout_inflater";
        r0 = r7.getSystemService(r0);
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
        r4 = android.os.Build.VERSION.SDK_INT;	 Catch:{ RuntimeException -> 0x0041, RuntimeException -> 0x0041 }
        r5 = 16;	 Catch:{ RuntimeException -> 0x0041, RuntimeException -> 0x0041 }
        r6 = 2131232147; // 0x7f080593 float:1.8080395E38 double:1.052968587E-314;	 Catch:{ RuntimeException -> 0x0041, RuntimeException -> 0x0041 }
        if (r4 < r5) goto L_0x0033;	 Catch:{ RuntimeException -> 0x0041, RuntimeException -> 0x0041 }
    L_0x002b:
        r4 = android.support.v4.p029a.C0346c.m682a(r7, r6);	 Catch:{ RuntimeException -> 0x0041, RuntimeException -> 0x0041 }
        r3.setBackground(r4);	 Catch:{ RuntimeException -> 0x0041, RuntimeException -> 0x0041 }
        goto L_0x003a;	 Catch:{ RuntimeException -> 0x0041, RuntimeException -> 0x0041 }
    L_0x0033:
        r4 = android.support.v4.p029a.C0346c.m682a(r7, r6);	 Catch:{ RuntimeException -> 0x0041, RuntimeException -> 0x0041 }
        r3.setBackgroundDrawable(r4);	 Catch:{ RuntimeException -> 0x0041, RuntimeException -> 0x0041 }
    L_0x003a:
        r2.setName(r8);	 Catch:{ RuntimeException -> 0x0041, RuntimeException -> 0x0041 }
        r2.setBackgroundColor(r9);	 Catch:{ RuntimeException -> 0x0041, RuntimeException -> 0x0041 }
        goto L_0x0044;
    L_0x0041:
        r2.setImageBitmap(r1);
    L_0x0044:
        r8 = 0;
        r0.measure(r8, r8);
        r9 = r0.getMeasuredWidth();
        r2 = r0.getMeasuredHeight();
        r0.layout(r8, r8, r9, r2);
        r0.buildDrawingCache();
        r8 = r0.getMeasuredWidth();	 Catch:{ RuntimeException -> 0x007c, RuntimeException -> 0x007c }
        r9 = r0.getMeasuredHeight();	 Catch:{ RuntimeException -> 0x007c, RuntimeException -> 0x007c }
        r2 = android.graphics.Bitmap.Config.ARGB_8888;	 Catch:{ RuntimeException -> 0x007c, RuntimeException -> 0x007c }
        r8 = android.graphics.Bitmap.createBitmap(r8, r9, r2);	 Catch:{ RuntimeException -> 0x007c, RuntimeException -> 0x007c }
        r9 = new android.graphics.Canvas;
        r9.<init>(r8);
        r1 = -1;
        r2 = android.graphics.PorterDuff.Mode.SRC_IN;
        r9.drawColor(r1, r2);
        r1 = r0.getBackground();
        if (r1 == 0) goto L_0x0078;
    L_0x0075:
        r1.draw(r9);
    L_0x0078:
        r0.draw(r9);
        return r8;
    L_0x007c:
        r8 = move-exception;
        r9 = "Custom Marker View : RuntimeException | OutOfMemoryError";
        mobi.mmdt.componentsutils.p232b.p235c.C2480b.m6737b(r9, r8);
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.logic.location.ChannelsMapsActivity.a(java.lang.String, int):android.graphics.Bitmap");
    }

    private com.google.android.gms.maps.model.C1873a m20890a(mobi.mmdt.ott.logic.p261a.p279d.p523c.C5911a r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        r0 = r2.getApplicationContext();	 Catch:{ RuntimeException -> 0x001e }
        r1 = r3.f8270b;	 Catch:{ RuntimeException -> 0x001e }
        r0 = mobi.mmdt.componentsutils.p232b.C2491i.m6806b(r0, r1);	 Catch:{ RuntimeException -> 0x001e }
        r3 = r3.i_();	 Catch:{ RuntimeException -> 0x001e }
        r3 = r2.m20887a(r3, r0);	 Catch:{ RuntimeException -> 0x001e }
        if (r3 == 0) goto L_0x0019;	 Catch:{ RuntimeException -> 0x001e }
    L_0x0014:
        r3 = com.google.android.gms.maps.model.C1874b.m5226a(r3);	 Catch:{ RuntimeException -> 0x001e }
        return r3;	 Catch:{ RuntimeException -> 0x001e }
    L_0x0019:
        r3 = com.google.android.gms.maps.model.C1874b.m5225a();	 Catch:{ RuntimeException -> 0x001e }
        return r3;
    L_0x001e:
        r3 = com.google.android.gms.maps.model.C1874b.m5225a();
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.logic.location.ChannelsMapsActivity.a(mobi.mmdt.ott.logic.a.d.c.a):com.google.android.gms.maps.model.a");
    }

    static /* synthetic */ C7406c m20893b(ChannelsMapsActivity channelsMapsActivity) {
        return channelsMapsActivity;
    }

    static /* synthetic */ void m20905k(ChannelsMapsActivity channelsMapsActivity) {
        Intent intent = new Intent();
        intent.putExtra("KEY_RESULT_TYPE", 112);
        channelsMapsActivity.setResult(-1, intent);
        channelsMapsActivity.onBackPressed();
    }

    static /* synthetic */ void m20906l(ChannelsMapsActivity channelsMapsActivity) {
        Intent intent = new Intent();
        intent.putExtra("KEY_RESULT_TYPE", 111);
        channelsMapsActivity.setResult(-1, intent);
        channelsMapsActivity.onBackPressed();
    }

    static /* synthetic */ C7406c m20909o(ChannelsMapsActivity channelsMapsActivity) {
        return channelsMapsActivity;
    }

    static /* synthetic */ C7406c m20910p(ChannelsMapsActivity channelsMapsActivity) {
        return channelsMapsActivity;
    }

    static /* synthetic */ C7406c m20911q(ChannelsMapsActivity channelsMapsActivity) {
        return channelsMapsActivity;
    }

    static /* synthetic */ C7406c m20912r(ChannelsMapsActivity channelsMapsActivity) {
        return channelsMapsActivity;
    }

    static /* synthetic */ C7406c m20913s(ChannelsMapsActivity channelsMapsActivity) {
        return channelsMapsActivity;
    }

    public final Dialog mo2299a(Bundle bundle) {
        OnClickListener c28512;
        String a;
        int i;
        int i2 = bundle.getInt("dialog_id");
        if (i2 == 100) {
            c28512 = new C28512(this);
            a = C4522p.m8236a(R.string.action_delete);
            i = R.string.are_you_sure_to_delete_channel_location;
        } else if (i2 != 200) {
            return null;
        } else {
            c28512 = new C28523(this);
            a = C4522p.m8236a(R.string.action_edit);
            i = R.string.are_you_sure_to_edit_channel_location;
        }
        return C4488b.m8182a(this, a, C4522p.m8236a(i), C4522p.m8236a(R.string.ok_cap), c28512, C4522p.m8236a(R.string.cancel), null);
    }

    public final void mo3640a(C1862c c1862c) {
        this.f23885m = c1862c;
        LatLng latLng = new LatLng(this.f23886n, this.f23887o);
        if (this.f23888p) {
            C2808d.m7148b(new C6685a(new int[]{132}));
        }
        if (this.f23888p) {
            this.f23885m.m5212a(C1860b.m5207a(latLng, 12.0f));
            if (C0346c.m681a((Context) this, "android.permission.ACCESS_FINE_LOCATION") == 0 && C0346c.m681a((Context) this, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                this.f23885m.m5211a();
            }
            return;
        }
        C1862c c1862c2 = this.f23885m;
        MarkerOptions a = new MarkerOptions().m16883a(latLng);
        a.f18740a = "Marker";
        c1862c2.m5210a(a);
        this.f23885m.m5212a(C1860b.m5207a(latLng, 17.0f));
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && (this.f23891s.f13049d == 3 || this.f23891s.f13049d == 2)) {
            Rect rect = new Rect();
            this.f23890r.getGlobalVisibleRect(rect);
            if (!rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                this.f23891s.m8743c(4);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void onBackPressed() {
        finish();
        overridePendingTransition(R.anim.anim_slide_in_right, R.anim.anim_slide_out_right);
    }

    public void onChatClicked(View view) {
        C4478a.m8144a((Activity) this, this.f23895w, null, "");
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_channels_maps);
        this.x = (Toolbar) findViewById(R.id.toolbar);
        this.f23881D = (RelativeLayout) findViewById(R.id.root_relativeLayout);
        this.y = findViewById(R.id.shadow_line_top);
        this.f23890r = findViewById(R.id.bottom_sheet);
        this.f23891s = BottomSheetBehavior.m8727b(this.f23890r);
        if (this.f23891s != null) {
            this.f23891s.m8743c(4);
            this.f23891s.m8741b(0);
        }
        this.f23882E = (LinearLayout) this.f23890r.findViewById(R.id.root_linear_layout);
        this.f23892t = (RoundAvatarImageView) this.f23890r.findViewById(R.id.imageView1);
        this.f23893u = (TextView) this.f23890r.findViewById(R.id.textView1);
        this.f23894v = (TextView) this.f23890r.findViewById(R.id.textView3);
        this.f23883F = (TextView) this.f23890r.findViewById(R.id.chat_imageView);
        FrameLayout frameLayout = (FrameLayout) this.f23890r.findViewById(R.id.chat_frameLayout);
        FrameLayout frameLayout2 = (FrameLayout) this.f23890r.findViewById(R.id.call_frameLayout);
        if (!(getIntent() == null || getIntent().getExtras() == null || !getIntent().getExtras().containsKey("KEY_LATITUDE"))) {
            this.f23886n = getIntent().getDoubleExtra("KEY_LATITUDE", -34.0d);
        }
        if (!(getIntent() == null || getIntent().getExtras() == null || !getIntent().getExtras().containsKey("KEY_LONGITUDE"))) {
            this.f23887o = getIntent().getDoubleExtra("KEY_LONGITUDE", 151.0d);
        }
        if (!(getIntent() == null || getIntent().getExtras() == null || !getIntent().getExtras().containsKey("KEY_NEAR_BY"))) {
            this.f23888p = getIntent().getBooleanExtra("KEY_NEAR_BY", false);
        }
        if (bundle != null) {
            if (bundle.containsKey("KEY_IS_SHOW_DIALOG_LOCATION_PERMISSION")) {
                this.f23889q = bundle.getBoolean("KEY_IS_SHOW_DIALOG_LOCATION_PERMISSION");
            }
            if (bundle.containsKey("KEY_FOCUSED_CHANNEL_USER_ID")) {
                this.f23895w = bundle.getString("KEY_FOCUSED_CHANNEL_USER_ID");
                this.f23880C = bundle.getString("KEY_GET_TIME");
                this.f23878A = bundle.getString("KEY_GET_CHANNEL_NAME");
                this.f23879B = bundle.getString("KEY_GET_CHANNEL_AVATAR");
                this.f23884G = bundle.getString("KEY_LOCATION_LABEL");
                this.f23896z = bundle.getInt("KEY_GET_CHANNEL_COLOR");
                this.f23892t.setName(this.f23878A);
                this.f23892t.setBackgroundColor(this.f23896z);
                this.f23893u.setText(this.f23878A);
                this.f23894v.setText(this.f23884G);
                if (this.f23879B != null) {
                    C1212c.m2875b(this.f23892t.getContext()).m10950a(this.f23879B).m3034a(C1248f.m2945b().m2955b(C1144h.f3689a)).m3031a(this.f23892t);
                }
            }
        }
        ((SupportMapFragment) m19188c().mo251a((int) R.id.map)).m16869a((C1864e) this);
        m20721a(UIThemeManager.getmInstance().getPrimary_color(), UIThemeManager.getmInstance().getText_primary_new_design_color(), UIThemeManager.getmInstance().getText_primary_new_design_color());
        View[] viewArr = new View[]{frameLayout, frameLayout2};
        C2491i.m6796a(this.f23882E, UIThemeManager.getmInstance().getRecycler_view_background_color());
        C2491i.m6802a(this.f23893u, UIThemeManager.getmInstance().getText_primary_color());
        C2491i.m6802a(this.f23894v, UIThemeManager.getmInstance().getText_secondary_color());
        C2491i.m6802a(this.f23883F, UIThemeManager.getmInstance().getText_primary_color());
        C2491i.m6828c(this.f23883F, UIThemeManager.getmInstance().getAccent_color());
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_channels_location, menu);
        MenuItem findItem = menu.findItem(R.id.action_share);
        MenuItem findItem2 = menu.findItem(R.id.action_edit);
        MenuItem findItem3 = menu.findItem(R.id.action_delete);
        findItem.setTitle(C4522p.m8236a(R.string.action_share));
        findItem2.setTitle(C4522p.m8236a(R.string.action_edit));
        findItem3.setTitle(C4522p.m8236a(R.string.action_delete));
        C2491i.m6790a(findItem.getIcon(), UIThemeManager.getmInstance().getIcon_not_selected_color());
        if (this.f23888p) {
            findItem.setVisible(false);
            findItem2.setVisible(false);
            findItem3.setVisible(false);
            setTitle(C4522p.m8236a(R.string.channels_maps_activity_title));
            C2475a.m6721b(this, C4522p.m8236a(R.string.try_to_get_channels_location_sub_title));
        } else {
            setTitle(R.string.channels_maps_activity_title);
            findItem.setVisible(true);
            findItem2.setVisible(true);
            findItem3.setVisible(true);
        }
        return super.onCreateOptionsMenu(menu);
    }

    public void onDetailsClicked(View view) {
    }

    public void onEvent(final C5910a c5910a) {
        runOnUiThread(new Runnable(this) {
            final /* synthetic */ ChannelsMapsActivity f8942b;

            public final void run() {
                C2475a.m6721b(ChannelsMapsActivity.m20909o(this.f8942b), null);
                C4513i.m8228a(ChannelsMapsActivity.m20910p(this.f8942b), c5910a.f8890a);
            }
        });
    }

    public void onEvent(final C2632b c2632b) {
        final int length = c2632b.f8533a.length;
        runOnUiThread(new Runnable(this) {
            final /* synthetic */ ChannelsMapsActivity f8945c;

            public final void run() {
                if (length > 0) {
                    Activity q;
                    String a;
                    Object[] objArr;
                    if (length == 1) {
                        q = ChannelsMapsActivity.m20911q(this.f8945c);
                        a = C4522p.m8236a(R.string.channel_founded);
                        objArr = new Object[]{Integer.valueOf(length)};
                    } else {
                        q = ChannelsMapsActivity.m20912r(this.f8945c);
                        a = C4522p.m8236a(R.string.channels_founded);
                        objArr = new Object[]{Integer.valueOf(length)};
                    }
                    C2475a.m6721b(q, String.format(a, objArr));
                    new Handler(Looper.getMainLooper()).post(new C28501(this.f8945c, c2632b.f8533a));
                    return;
                }
                C2475a.m6721b(ChannelsMapsActivity.m20913s(this.f8945c), C4522p.m8236a(R.string.no_location_found));
            }
        });
    }

    public void onEvent(C2743a c2743a) {
        if (C2535a.m6888a().m6910W() != null) {
            String[] split = C2535a.m6888a().m6910W().split(",");
            this.f23886n = Double.parseDouble(split[0]);
            this.f23887o = Double.parseDouble(split[1]);
        }
        new Handler(Looper.getMainLooper()).post(new C28534(this));
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            onBackPressed();
            return true;
        }
        if (itemId == R.id.action_share) {
            StringBuilder stringBuilder = new StringBuilder("geo:");
            stringBuilder.append(this.f23886n);
            stringBuilder.append(", ");
            stringBuilder.append(this.f23887o);
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(stringBuilder.toString()));
            intent.setPackage("com.google.android.apps.maps");
            startActivity(intent);
        } else {
            Bundle bundle;
            String str;
            int i;
            if (itemId == R.id.action_delete) {
                bundle = new Bundle();
                str = "dialog_id";
                i = 100;
            } else if (itemId == R.id.action_edit) {
                bundle = new Bundle();
                str = "dialog_id";
                i = 200;
            }
            bundle.putInt(str, i);
            b_(bundle);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    protected void onResume() {
        super.onResume();
        m20723a(true, UIThemeManager.getmInstance().getIcon_not_selected_color());
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("KEY_IS_SHOW_DIALOG_LOCATION_PERMISSION", this.f23889q);
        bundle.putString("KEY_FOCUSED_CHANNEL_USER_ID", this.f23895w);
        bundle.putString("KEY_LOCATION_LABEL", this.f23884G);
        bundle.putString("KEY_GET_TIME", this.f23880C);
        bundle.putString("KEY_GET_CHANNEL_NAME", this.f23878A);
        bundle.putString("KEY_GET_CHANNEL_AVATAR", this.f23879B);
        bundle.putInt("KEY_GET_CHANNEL_COLOR", this.f23896z);
    }
}
