package mobi.mmdt.componentsutils.p232b;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.PorterDuff.Mode;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.os.Build.VERSION;
import android.os.Vibrator;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TabLayout;
import android.support.design.widget.TextInputLayout;
import android.support.v4.p029a.C0346c;
import android.support.v4.p031b.p032a.C0429a;
import android.support.v4.view.C0571r;
import android.support.v4.widget.C0615d;
import android.support.v7.widget.CardView;
import android.support.v7.widget.SwitchCompat;
import android.support.v7.widget.Toolbar;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.p085c.p086a.C1212c;
import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import mobi.mmdt.componentsutils.C2493b.C2474a;
import mobi.mmdt.componentsutils.C2493b.C2482c;
import mobi.mmdt.componentsutils.p231a.C2464b;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

public final class C2491i {
    public static final char[] f8168a = new char[]{'۰', '۱', '۲', '۳', '۴', '۵', '۶', '۷', '۸', '۹'};
    public static final char[] f8169b = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    public static final Pattern f8170c = Pattern.compile("[۰-۹]");

    public static float m6758a() {
        return (float) ((C2489g.m6754a().m6756b(BallPulseIndicator.SCALE) * 70) / 100);
    }

    public static int m6759a(Context context) {
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        return identifier > 0 ? context.getResources().getDimensionPixelSize(identifier) : 0;
    }

    public static int m6760a(android.view.View r4) {
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
        if (r4 == 0) goto L_0x0032;
    L_0x0003:
        r1 = android.os.Build.VERSION.SDK_INT;
        r2 = 21;
        if (r1 >= r2) goto L_0x000a;
    L_0x0009:
        return r0;
    L_0x000a:
        r1 = android.view.View.class;	 Catch:{ Exception -> 0x0032 }
        r2 = "mAttachInfo";	 Catch:{ Exception -> 0x0032 }
        r1 = r1.getDeclaredField(r2);	 Catch:{ Exception -> 0x0032 }
        r2 = 1;	 Catch:{ Exception -> 0x0032 }
        r1.setAccessible(r2);	 Catch:{ Exception -> 0x0032 }
        r4 = r1.get(r4);	 Catch:{ Exception -> 0x0032 }
        if (r4 == 0) goto L_0x0032;	 Catch:{ Exception -> 0x0032 }
    L_0x001c:
        r1 = r4.getClass();	 Catch:{ Exception -> 0x0032 }
        r3 = "mStableInsets";	 Catch:{ Exception -> 0x0032 }
        r1 = r1.getDeclaredField(r3);	 Catch:{ Exception -> 0x0032 }
        r1.setAccessible(r2);	 Catch:{ Exception -> 0x0032 }
        r4 = r1.get(r4);	 Catch:{ Exception -> 0x0032 }
        r4 = (android.graphics.Rect) r4;	 Catch:{ Exception -> 0x0032 }
        r4 = r4.bottom;	 Catch:{ Exception -> 0x0032 }
        return r4;
    L_0x0032:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.componentsutils.b.i.a(android.view.View):int");
    }

    public static Bitmap m6761a(Context context, String str) {
        return (Bitmap) C1212c.m2875b(context).m10958e().m3037a((Object) str).m3039c().get();
    }

    public static Bitmap m6762a(Drawable drawable) {
        Bitmap createBitmap;
        Canvas canvas;
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() != null) {
                return bitmapDrawable.getBitmap();
            }
        }
        if (drawable.getIntrinsicWidth() > 0) {
            if (drawable.getIntrinsicHeight() > 0) {
                createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Config.ARGB_8888);
                canvas = new Canvas(createBitmap);
                drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                drawable.draw(canvas);
                return createBitmap;
            }
        }
        createBitmap = Bitmap.createBitmap(1, 1, Config.ARGB_8888);
        canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    public static Point m6763a(int i, int i2, int i3) {
        Point b = C2491i.m6807b(i, i2, i3);
        if (b.x > i2) {
            b.x = i2;
            b.y = i3;
        }
        return b;
    }

    public static String m6764a(int i) {
        return String.format(Locale.getDefault(), "%d", new Object[]{Integer.valueOf(i)});
    }

    public static java.lang.String m6765a(android.app.Activity r5, float r6) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:10:0x0068 in {3, 6, 8, 9} preds:[]
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:129)
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:48)
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:38)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r0 = 1148846080; // 0x447a0000 float:1000.0 double:5.676053805E-315;
        r1 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1));
        if (r1 >= 0) goto L_0x0014;
    L_0x0006:
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r6 = (int) r6;
        r5.append(r6);
        r5 = r5.toString();
        return r5;
    L_0x0014:
        r1 = 1232348160; // 0x49742400 float:1000000.0 double:6.088608896E-315;
        r2 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1));
        r3 = 0;
        r4 = 1;
        if (r2 >= 0) goto L_0x0048;
    L_0x001d:
        r6 = r6 / r0;
        r0 = java.util.Locale.US;
        r1 = mobi.mmdt.componentsutils.C2493b.C2482c.format_string_float;
        r1 = r5.getString(r1);
        r2 = new java.lang.Object[r4];
        r6 = java.lang.Float.valueOf(r6);
        r2[r3] = r6;
        r6 = java.lang.String.format(r0, r1, r2);
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r0.append(r6);
        r6 = mobi.mmdt.componentsutils.C2493b.C2482c.size_of_followers_k;
    L_0x003c:
        r5 = r5.getString(r6);
        r0.append(r5);
        r5 = r0.toString();
        return r5;
    L_0x0048:
        r6 = r6 / r1;
        r0 = java.util.Locale.US;
        r1 = mobi.mmdt.componentsutils.C2493b.C2482c.format_string_float;
        r1 = r5.getString(r1);
        r2 = new java.lang.Object[r4];
        r6 = java.lang.Float.valueOf(r6);
        r2[r3] = r6;
        r6 = java.lang.String.format(r0, r1, r2);
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r0.append(r6);
        r6 = mobi.mmdt.componentsutils.C2493b.C2482c.size_of_followers_m;
        goto L_0x003c;
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.componentsutils.b.i.a(android.app.Activity, float):java.lang.String");
    }

    public static java.lang.String m6766a(android.app.Activity r6, float r7, java.lang.String r8, java.lang.String r9) {
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
        r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1));
        if (r0 > 0) goto L_0x0008;
    L_0x0005:
        r6 = "";
        return r6;
    L_0x0008:
        r0 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1));
        if (r0 <= 0) goto L_0x000f;
    L_0x000e:
        r8 = r9;
    L_0x000f:
        r9 = 0;
        r0 = mobi.mmdt.componentsutils.C2493b.C2482c.format_thousand_separator;	 Catch:{ Exception -> 0x0021 }
        r1 = 1;	 Catch:{ Exception -> 0x0021 }
        r1 = new java.lang.Object[r1];	 Catch:{ Exception -> 0x0021 }
        r2 = (int) r7;	 Catch:{ Exception -> 0x0021 }
        r2 = java.lang.Integer.valueOf(r2);	 Catch:{ Exception -> 0x0021 }
        r1[r9] = r2;	 Catch:{ Exception -> 0x0021 }
        r6 = r6.getString(r0, r1);	 Catch:{ Exception -> 0x0021 }
        goto L_0x0072;
    L_0x0021:
        r6 = (int) r7;
        r7 = java.lang.Integer.toString(r6);	 Catch:{ Exception -> 0x006e }
        r0 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;	 Catch:{ Exception -> 0x006e }
        if (r6 <= r0) goto L_0x0068;	 Catch:{ Exception -> 0x006e }
    L_0x002a:
        r0 = r7.length();	 Catch:{ Exception -> 0x006e }
        r1 = 3;	 Catch:{ Exception -> 0x006e }
        r0 = r0 / r1;	 Catch:{ Exception -> 0x006e }
        r2 = r1;	 Catch:{ Exception -> 0x006e }
        r1 = r7;	 Catch:{ Exception -> 0x006e }
        r7 = r9;	 Catch:{ Exception -> 0x006e }
    L_0x0033:
        if (r7 >= r0) goto L_0x0066;	 Catch:{ Exception -> 0x006e }
    L_0x0035:
        r3 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x006e }
        r3.<init>();	 Catch:{ Exception -> 0x006e }
        r4 = r1.length();	 Catch:{ Exception -> 0x006e }
        r5 = r2 + r7;	 Catch:{ Exception -> 0x006e }
        r4 = r4 - r5;	 Catch:{ Exception -> 0x006e }
        r4 = r1.substring(r9, r4);	 Catch:{ Exception -> 0x006e }
        r3.append(r4);	 Catch:{ Exception -> 0x006e }
        r4 = ",";	 Catch:{ Exception -> 0x006e }
        r3.append(r4);	 Catch:{ Exception -> 0x006e }
        r4 = r1.length();	 Catch:{ Exception -> 0x006e }
        r4 = r4 - r5;	 Catch:{ Exception -> 0x006e }
        r5 = r1.length();	 Catch:{ Exception -> 0x006e }
        r1 = r1.substring(r4, r5);	 Catch:{ Exception -> 0x006e }
        r3.append(r1);	 Catch:{ Exception -> 0x006e }
        r1 = r3.toString();	 Catch:{ Exception -> 0x006e }
        r2 = r2 + 3;	 Catch:{ Exception -> 0x006e }
        r7 = r7 + 1;	 Catch:{ Exception -> 0x006e }
        goto L_0x0033;	 Catch:{ Exception -> 0x006e }
    L_0x0066:
        r6 = r1;	 Catch:{ Exception -> 0x006e }
        goto L_0x0072;	 Catch:{ Exception -> 0x006e }
    L_0x0068:
        r7 = java.lang.Integer.toString(r6);	 Catch:{ Exception -> 0x006e }
        r6 = r7;
        goto L_0x0072;
    L_0x006e:
        r6 = java.lang.Integer.toString(r6);
    L_0x0072:
        r7 = new java.lang.StringBuilder;
        r7.<init>();
        r7.append(r6);
        r6 = " ";
        r7.append(r6);
        r7.append(r8);
        r6 = r7.toString();
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.componentsutils.b.i.a(android.app.Activity, float, java.lang.String, java.lang.String):java.lang.String");
    }

    public static String m6767a(Activity activity, int i) {
        if (i < 3600) {
            String string = activity.getString(C2482c.format_string_call_time_two_parameter);
            r2 = new Object[2];
            long j = (long) i;
            r2[0] = Long.valueOf(TimeUnit.SECONDS.toMinutes(j));
            r2[1] = Long.valueOf(TimeUnit.SECONDS.toSeconds(j) % TimeUnit.MINUTES.toSeconds(1));
            return String.format(string, r2);
        }
        string = activity.getString(C2482c.format_string_call_time_three_parameter);
        r5 = new Object[3];
        long j2 = (long) i;
        r5[0] = Long.valueOf(TimeUnit.SECONDS.toHours(j2));
        r5[1] = Long.valueOf(TimeUnit.SECONDS.toMinutes(j2) % TimeUnit.HOURS.toMinutes(1));
        r5[2] = Long.valueOf(TimeUnit.SECONDS.toSeconds(j2) % TimeUnit.MINUTES.toSeconds(1));
        return String.format(string, r5);
    }

    public static String m6768a(Activity activity, long j) {
        return new SimpleDateFormat(activity.getString(C2482c.simple_date_format_hh_mm), Locale.getDefault()).format(new Date(j));
    }

    public static String m6769a(Activity activity, String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(activity.getString(C2482c.channel_address));
        stringBuilder.append(str);
        return stringBuilder.toString();
    }

    public static java.lang.String m6770a(android.content.Context r6, float r7) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:9:0x0094 in {2, 4, 7, 8} preds:[]
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:129)
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:48)
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:38)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r0 = "";
        r1 = 1149239296; // 0x44800000 float:1024.0 double:5.67799655E-315;
        r2 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1));
        if (r2 >= 0) goto L_0x002e;
    L_0x0008:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r1.append(r0);
        r7 = (int) r7;
        r1.append(r7);
        r7 = r1.toString();
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r0.append(r7);
        r7 = mobi.mmdt.componentsutils.C2493b.C2482c.format_file_size_b;
    L_0x0022:
        r6 = r6.getString(r7);
        r0.append(r6);
        r6 = r0.toString();
        return r6;
    L_0x002e:
        r2 = 1233125376; // 0x49800000 float:1048576.0 double:6.092448853E-315;
        r3 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1));
        r4 = 0;
        r5 = 1;
        if (r3 >= 0) goto L_0x0065;
    L_0x0036:
        r7 = r7 / r1;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r1.append(r0);
        r0 = java.util.Locale.US;
        r2 = mobi.mmdt.componentsutils.C2493b.C2482c.format_string_float;
        r2 = r6.getString(r2);
        r3 = new java.lang.Object[r5];
        r7 = java.lang.Float.valueOf(r7);
        r3[r4] = r7;
        r7 = java.lang.String.format(r0, r2, r3);
        r1.append(r7);
        r7 = r1.toString();
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r0.append(r7);
        r7 = mobi.mmdt.componentsutils.C2493b.C2482c.format_file_size_kb;
        goto L_0x0022;
    L_0x0065:
        r7 = r7 / r2;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r1.append(r0);
        r0 = java.util.Locale.US;
        r2 = mobi.mmdt.componentsutils.C2493b.C2482c.format_string_float;
        r2 = r6.getString(r2);
        r3 = new java.lang.Object[r5];
        r7 = java.lang.Float.valueOf(r7);
        r3[r4] = r7;
        r7 = java.lang.String.format(r0, r2, r3);
        r1.append(r7);
        r7 = r1.toString();
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r0.append(r7);
        r7 = mobi.mmdt.componentsutils.C2493b.C2482c.format_file_size_mb;
        goto L_0x0022;
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.componentsutils.b.i.a(android.content.Context, float):java.lang.String");
    }

    public static String m6771a(Context context, long j) {
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j);
        return C2477b.m6725b(instance) ? context.getString(C2482c.today) : C2477b.m6726c(instance) ? context.getString(C2482c.yesterday) : C2477b.m6723a(instance) ? new SimpleDateFormat(context.getString(C2482c.simple_date_format_mmmm_d), Locale.getDefault()).format(new Date(j)) : instance.get(1) < 2010 ? "" : new SimpleDateFormat(context.getString(C2482c.simple_date_format_mmmm_d_yyyy), Locale.getDefault()).format(new Date(j));
    }

    public static String m6772a(Context context, long j, long j2) {
        Context context2 = context;
        long j3 = j2;
        String str = "";
        if (j3 <= 0 || j3 - System.currentTimeMillis() >= 120000) {
            return str;
        }
        String stringBuilder;
        StringBuilder stringBuilder2;
        int i;
        long j4 = j - j3;
        Calendar instance = Calendar.getInstance();
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        long timeInMillis = instance.getTimeInMillis();
        instance.set(11, 23);
        instance.set(12, 59);
        instance.set(13, 59);
        instance.set(14, 999);
        long timeInMillis2 = instance.getTimeInMillis();
        instance.setTimeInMillis(j3);
        instance.set(13, 0);
        instance.set(14, 0);
        StringBuilder stringBuilder3;
        if (j3 < timeInMillis || j3 > timeInMillis2) {
            long j5 = timeInMillis - 86400000;
            timeInMillis = timeInMillis2 - 86400000;
            if (j3 >= j5 && j3 <= timeInMillis) {
                stringBuilder3 = instance.get(12) < 10 ? new StringBuilder("0") : new StringBuilder();
                stringBuilder3.append(instance.get(12));
                stringBuilder = stringBuilder3.toString();
                stringBuilder2 = new StringBuilder();
                i = C2482c.yesterday;
            } else if (instance.get(1) < 2010) {
                return "";
            } else {
                StringBuilder stringBuilder4 = instance.get(12) < 10 ? new StringBuilder("0") : new StringBuilder();
                stringBuilder4.append(instance.get(12));
                String stringBuilder5 = stringBuilder4.toString();
                stringBuilder3 = new StringBuilder();
                stringBuilder3.append(instance.get(5));
                stringBuilder3.append("/");
                stringBuilder3.append(instance.get(2) + 1);
                stringBuilder3.append("/");
                stringBuilder3.append(instance.get(1));
                stringBuilder3.append("  ");
                stringBuilder3.append(instance.get(11));
                stringBuilder3.append(":");
                stringBuilder3.append(stringBuilder5);
                return stringBuilder3.toString();
            }
        }
        int i2;
        if (j4 < 60000) {
            i2 = C2482c.online;
        } else if (j4 < 60000 || j4 >= 3600000) {
            stringBuilder3 = instance.get(12) < 10 ? new StringBuilder("0") : new StringBuilder();
            stringBuilder3.append(instance.get(12));
            stringBuilder = stringBuilder3.toString();
            stringBuilder2 = new StringBuilder();
            i = C2482c.today;
        } else {
            i2 = (int) (j4 / 60000);
            if (i2 == 1) {
                i2 = C2482c.one_minute_ago;
            } else {
                stringBuilder2 = new StringBuilder();
                stringBuilder2.append(i2);
                stringBuilder2.append("  ");
                stringBuilder2.append(context2.getString(C2482c.minutes_ago));
                return stringBuilder2.toString();
            }
        }
        return context2.getString(i2);
        stringBuilder2.append(context2.getString(i).toLowerCase());
        stringBuilder2.append("  ");
        stringBuilder2.append(instance.get(11));
        stringBuilder2.append(":");
        stringBuilder2.append(stringBuilder);
        return stringBuilder2.toString();
    }

    public static String m6773a(Context context, long j, String str) {
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j);
        return C2477b.m6725b(instance) ? context.getString(C2482c.today) : C2477b.m6726c(instance) ? context.getString(C2482c.yesterday) : C2477b.m6723a(instance) ? str.equals("fa") ? C2464b.m6697a(context, instance).m12937a() : new SimpleDateFormat(context.getString(C2482c.simple_date_format_mmmm_d), Locale.getDefault()).format(new Date(j)) : instance.get(1) < 2010 ? "" : str.equals("fa") ? C2464b.m6697a(context, instance).m12938b() : new SimpleDateFormat(context.getString(C2482c.simple_date_format_mmmm_d_yyyy), Locale.getDefault()).format(new Date(j));
    }

    public static java.lang.String m6774a(android.content.Context r10, long r11, boolean r13) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:13:0x00e6 in {3, 5, 6, 8, 11, 12} preds:[]
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:129)
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:48)
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:38)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r0 = java.util.concurrent.TimeUnit.HOURS;
        r1 = 1;
        r3 = r0.toMillis(r1);
        r0 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1));
        r3 = 1;
        r4 = 0;
        r5 = 2;
        if (r0 >= 0) goto L_0x006b;
    L_0x000f:
        if (r13 == 0) goto L_0x003f;
    L_0x0011:
        r13 = java.util.Locale.US;
        r0 = mobi.mmdt.componentsutils.C2493b.C2482c.format_string_call_time_two_parameter;
        r10 = r10.getString(r0);
        r0 = new java.lang.Object[r5];
        r5 = java.util.concurrent.TimeUnit.MILLISECONDS;
        r5 = r5.toMinutes(r11);
        r5 = java.lang.Long.valueOf(r5);
        r0[r4] = r5;
        r4 = java.util.concurrent.TimeUnit.MILLISECONDS;
        r11 = r4.toSeconds(r11);
        r4 = java.util.concurrent.TimeUnit.MINUTES;
        r1 = r4.toSeconds(r1);
        r11 = r11 % r1;
        r11 = java.lang.Long.valueOf(r11);
        r0[r3] = r11;
    L_0x003a:
        r10 = java.lang.String.format(r13, r10, r0);
        return r10;
    L_0x003f:
        r13 = mobi.mmdt.componentsutils.C2493b.C2482c.format_string_call_time_two_parameter;
        r10 = r10.getString(r13);
        r13 = new java.lang.Object[r5];
        r0 = java.util.concurrent.TimeUnit.MILLISECONDS;
        r5 = r0.toMinutes(r11);
        r0 = java.lang.Long.valueOf(r5);
        r13[r4] = r0;
        r0 = java.util.concurrent.TimeUnit.MILLISECONDS;
        r11 = r0.toSeconds(r11);
        r0 = java.util.concurrent.TimeUnit.MINUTES;
        r0 = r0.toSeconds(r1);
        r11 = r11 % r0;
        r11 = java.lang.Long.valueOf(r11);
        r13[r3] = r11;
    L_0x0066:
        r10 = java.lang.String.format(r10, r13);
        return r10;
    L_0x006b:
        r0 = 3;
        if (r13 == 0) goto L_0x00ab;
    L_0x006e:
        r13 = java.util.Locale.US;
        r6 = mobi.mmdt.componentsutils.C2493b.C2482c.format_string_call_time_three_parameter;
        r10 = r10.getString(r6);
        r0 = new java.lang.Object[r0];
        r6 = java.util.concurrent.TimeUnit.MILLISECONDS;
        r6 = r6.toHours(r11);
        r6 = java.lang.Long.valueOf(r6);
        r0[r4] = r6;
        r4 = java.util.concurrent.TimeUnit.MILLISECONDS;
        r6 = r4.toMinutes(r11);
        r4 = java.util.concurrent.TimeUnit.HOURS;
        r8 = r4.toMinutes(r1);
        r6 = r6 % r8;
        r4 = java.lang.Long.valueOf(r6);
        r0[r3] = r4;
        r3 = java.util.concurrent.TimeUnit.MILLISECONDS;
        r11 = r3.toSeconds(r11);
        r3 = java.util.concurrent.TimeUnit.MINUTES;
        r1 = r3.toSeconds(r1);
        r11 = r11 % r1;
        r11 = java.lang.Long.valueOf(r11);
        r0[r5] = r11;
        goto L_0x003a;
    L_0x00ab:
        r13 = mobi.mmdt.componentsutils.C2493b.C2482c.format_string_call_time_three_parameter;
        r10 = r10.getString(r13);
        r13 = new java.lang.Object[r0];
        r0 = java.util.concurrent.TimeUnit.MILLISECONDS;
        r6 = r0.toHours(r11);
        r0 = java.lang.Long.valueOf(r6);
        r13[r4] = r0;
        r0 = java.util.concurrent.TimeUnit.MILLISECONDS;
        r6 = r0.toMinutes(r11);
        r0 = java.util.concurrent.TimeUnit.HOURS;
        r8 = r0.toMinutes(r1);
        r6 = r6 % r8;
        r0 = java.lang.Long.valueOf(r6);
        r13[r3] = r0;
        r0 = java.util.concurrent.TimeUnit.MILLISECONDS;
        r11 = r0.toSeconds(r11);
        r0 = java.util.concurrent.TimeUnit.MINUTES;
        r0 = r0.toSeconds(r1);
        r11 = r11 % r0;
        r11 = java.lang.Long.valueOf(r11);
        r13[r5] = r11;
        goto L_0x0066;
        return r10;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.componentsutils.b.i.a(android.content.Context, long, boolean):java.lang.String");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m6775a(android.content.Context r7, java.lang.Long r8, long r9, java.lang.String r11) {
        /*
        r0 = 0;
        if (r8 != 0) goto L_0x0008;
    L_0x0004:
        r8 = java.lang.Long.valueOf(r0);
    L_0x0008:
        r2 = r8.longValue();
        r4 = -1;
        r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r6 == 0) goto L_0x0071;
    L_0x0012:
        r2 = r8.longValue();
        r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1));
        if (r4 == 0) goto L_0x0071;
    L_0x001a:
        r0 = r8.longValue();
        r9 = mobi.mmdt.componentsutils.p232b.C2491i.m6772a(r7, r9, r0);
        r10 = "fa";
        r10 = r11.equals(r10);
        if (r10 == 0) goto L_0x0070;
    L_0x002a:
        r10 = mobi.mmdt.componentsutils.C2493b.C2482c.online;
        r10 = r7.getString(r10);
        r10 = r9.contains(r10);
        if (r10 != 0) goto L_0x0070;
    L_0x0036:
        r10 = mobi.mmdt.componentsutils.C2493b.C2482c.one_minute_ago;
        r10 = r7.getString(r10);
        r10 = r9.contains(r10);
        if (r10 != 0) goto L_0x0070;
    L_0x0042:
        r10 = mobi.mmdt.componentsutils.C2493b.C2482c.minutes_ago;
        r10 = r7.getString(r10);
        r10 = r9.contains(r10);
        if (r10 != 0) goto L_0x0070;
    L_0x004e:
        r10 = mobi.mmdt.componentsutils.C2493b.C2482c.today;
        r10 = r7.getString(r10);
        r10 = r9.contains(r10);
        if (r10 != 0) goto L_0x0070;
    L_0x005a:
        r10 = mobi.mmdt.componentsutils.C2493b.C2482c.yesterday;
        r10 = r7.getString(r10);
        r10 = r9.contains(r10);
        if (r10 == 0) goto L_0x0067;
    L_0x0066:
        return r9;
    L_0x0067:
        r8 = r8.longValue();
        r7 = mobi.mmdt.componentsutils.p232b.C2491i.m6825c(r7, r8, r11);
        return r7;
    L_0x0070:
        return r9;
    L_0x0071:
        r7 = "";
        return r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.componentsutils.b.i.a(android.content.Context, java.lang.Long, long, java.lang.String):java.lang.String");
    }

    public static java.lang.String m6776a(java.lang.String r8) {
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
        r0 = java.lang.Integer.parseInt(r8);	 Catch:{ Exception -> 0x0046 }
        r1 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;	 Catch:{ Exception -> 0x0046 }
        if (r0 <= r1) goto L_0x0046;	 Catch:{ Exception -> 0x0046 }
    L_0x0008:
        r0 = r8.length();	 Catch:{ Exception -> 0x0046 }
        r1 = 3;	 Catch:{ Exception -> 0x0046 }
        r0 = r0 / r1;	 Catch:{ Exception -> 0x0046 }
        r2 = 0;	 Catch:{ Exception -> 0x0046 }
        r3 = r8;	 Catch:{ Exception -> 0x0046 }
        r4 = r1;	 Catch:{ Exception -> 0x0046 }
        r1 = r2;	 Catch:{ Exception -> 0x0046 }
    L_0x0012:
        if (r1 >= r0) goto L_0x0045;	 Catch:{ Exception -> 0x0046 }
    L_0x0014:
        r5 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0046 }
        r5.<init>();	 Catch:{ Exception -> 0x0046 }
        r6 = r3.length();	 Catch:{ Exception -> 0x0046 }
        r7 = r4 + r1;	 Catch:{ Exception -> 0x0046 }
        r6 = r6 - r7;	 Catch:{ Exception -> 0x0046 }
        r6 = r3.substring(r2, r6);	 Catch:{ Exception -> 0x0046 }
        r5.append(r6);	 Catch:{ Exception -> 0x0046 }
        r6 = ",";	 Catch:{ Exception -> 0x0046 }
        r5.append(r6);	 Catch:{ Exception -> 0x0046 }
        r6 = r3.length();	 Catch:{ Exception -> 0x0046 }
        r6 = r6 - r7;	 Catch:{ Exception -> 0x0046 }
        r7 = r3.length();	 Catch:{ Exception -> 0x0046 }
        r3 = r3.substring(r6, r7);	 Catch:{ Exception -> 0x0046 }
        r5.append(r3);	 Catch:{ Exception -> 0x0046 }
        r3 = r5.toString();	 Catch:{ Exception -> 0x0046 }
        r4 = r4 + 3;
        r1 = r1 + 1;
        goto L_0x0012;
    L_0x0045:
        r8 = r3;
    L_0x0046:
        r0 = ",";
        r0 = r8.startsWith(r0);
        if (r0 == 0) goto L_0x0057;
    L_0x004e:
        r0 = r8.length();
        r1 = 1;
        r8 = r8.substring(r1, r0);
    L_0x0057:
        return r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.componentsutils.b.i.a(java.lang.String):java.lang.String");
    }

    public static String m6777a(String str, String str2) {
        if (str2 != null) {
            if (str != null) {
                if (!str.equals("fa")) {
                    return str2;
                }
                StringBuilder stringBuilder = new StringBuilder();
                for (char c : str2.toCharArray()) {
                    char c2;
                    if (Character.isDigit(c2)) {
                        c2 = f8168a[Integer.parseInt(String.valueOf(c2))];
                    }
                    stringBuilder.append(c2);
                }
                return stringBuilder.toString();
            }
        }
        return "";
    }

    public static String m6778a(String str, boolean z) {
        return z ? C2491i.m6814b(str) : str;
    }

    public static void m6779a(int i, int i2, int i3, EditText... editTextArr) {
        for (View view : editTextArr) {
            if (view != null) {
                view.setTextColor(i);
                view.setHintTextColor(i2);
                view.setHighlightColor(-6316129);
                if (view.isEnabled() && view.isFocusable()) {
                    C2491i.m6818b(view, i3);
                }
            }
        }
    }

    public static void m6780a(int i, int i2, EditText... editTextArr) {
        for (View view : editTextArr) {
            if (view != null) {
                view.setTextColor(i);
                view.setHighlightColor(-6316129);
                if (view.isEnabled() && view.isFocusable()) {
                    C2491i.m6818b(view, i2);
                }
            }
        }
    }

    public static void m6781a(int i, TextInputLayout... textInputLayoutArr) {
        for (Object obj : textInputLayoutArr) {
            try {
                Field declaredField = TextInputLayout.class.getDeclaredField("e");
                declaredField.setAccessible(true);
                int[][] iArr = new int[1][];
                iArr[0] = new int[]{0};
                declaredField.set(obj, new ColorStateList(iArr, new int[]{-6316129}));
                declaredField = TextInputLayout.class.getDeclaredField("f");
                declaredField.setAccessible(true);
                iArr = new int[1][];
                iArr[0] = new int[]{0};
                declaredField.set(obj, new ColorStateList(iArr, new int[]{i}));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void m6782a(int i, CompoundButton... compoundButtonArr) {
        for (CompoundButton compoundButton : compoundButtonArr) {
            if (compoundButton != null) {
                C2491i.m6820b(compoundButton, i);
            }
        }
    }

    public static void m6783a(int i, ImageView... imageViewArr) {
        for (ImageView imageView : imageViewArr) {
            if (imageView != null) {
                imageView.setColorFilter(i);
            }
        }
    }

    public static void m6784a(int i, TextView... textViewArr) {
        for (TextView a : textViewArr) {
            C2491i.m6802a(a, i);
        }
    }

    public static void m6785a(Activity activity) {
        activity.setRequestedOrientation(-1);
    }

    public static void m6786a(Activity activity, FrameLayout frameLayout) {
        int a = activity.getResources().getConfiguration().orientation == 1 ? (C2489g.m6754a().m6755a(BallPulseIndicator.SCALE) * 50) / 100 : (C2489g.m6754a().m6756b(BallPulseIndicator.SCALE) * 40) / 100;
        frameLayout.setLayoutParams(new LayoutParams(a, a));
    }

    public static void m6787a(Context context, int i) {
        ((Vibrator) context.getSystemService("vibrator")).vibrate((long) i);
    }

    public static void m6788a(Context context, ImageView imageView) {
        if (VERSION.SDK_INT >= 16) {
            imageView.setBackground(C0346c.m682a(context, (int) R.drawable.circle_bg));
        } else {
            imageView.setBackgroundDrawable(C0346c.m682a(context, (int) R.drawable.circle_bg));
        }
    }

    public static void m6789a(Typeface typeface, TextView... textViewArr) {
        int i = 0;
        while (i <= 0) {
            TextView textView = textViewArr[0];
            if (textView != null) {
                textView.setTypeface(typeface, 1);
                i++;
            } else {
                return;
            }
        }
    }

    public static void m6790a(Drawable drawable, int i) {
        if (drawable != null) {
            drawable.setColorFilter(i, Mode.SRC_IN);
        }
    }

    public static void m6791a(FloatingActionButton floatingActionButton, int i, int i2) {
        if (floatingActionButton != null) {
            floatingActionButton.setBackgroundTintList(ColorStateList.valueOf(i));
            floatingActionButton.setRippleColor(i2);
        }
    }

    public static void m6792a(TabLayout tabLayout, int i, int i2) {
        if (tabLayout != null) {
            tabLayout.m542a(i, i2);
            tabLayout.setSelectedTabIndicatorColor(i2);
        }
    }

    public static void m6793a(CardView cardView, int i) {
        if (cardView != null) {
            cardView.setCardBackgroundColor(i);
        }
    }

    public static void m6794a(SwitchCompat switchCompat, int i, int i2) {
        r1 = new int[2][];
        r1[0] = new int[]{-16842912};
        r1[1] = new int[]{16842912};
        int[] iArr = new int[]{-1250068, i2};
        int[] iArr2 = new int[]{-5066062, i};
        if (switchCompat != null) {
            C0429a.m885a(C0429a.m896g(switchCompat.getThumbDrawable()), new ColorStateList(r1, iArr));
            C0429a.m885a(C0429a.m896g(switchCompat.getTrackDrawable()), new ColorStateList(r1, iArr2));
        }
    }

    public static void m6795a(Toolbar toolbar, int i) {
        if (toolbar != null) {
            toolbar.setTitleTextColor(i);
        }
    }

    public static void m6796a(View view, int i) {
        if (view != null) {
            view.setBackgroundColor(i);
        }
    }

    public static void m6797a(View view, int i, int i2) {
        if (view != null) {
            Drawable gradientDrawable = new GradientDrawable(Orientation.TOP_BOTTOM, new int[]{i, i2});
            gradientDrawable.setCornerRadius(0.0f);
            if (VERSION.SDK_INT >= 16) {
                view.setBackground(gradientDrawable);
                return;
            }
            view.setBackgroundDrawable(gradientDrawable);
        }
    }

    public static void m6798a(Button button, int i) {
        if (button != null) {
            button.setTextColor(i);
        }
    }

    public static void m6799a(CompoundButton compoundButton, int i) {
        if (compoundButton != null) {
            C2491i.m6820b(compoundButton, i);
        }
    }

    public static void m6800a(EditText editText, int i) {
        if (editText != null) {
            editText.setFilters(new InputFilter[]{new LengthFilter(i)});
        }
    }

    public static void m6801a(ImageView imageView, int i) {
        if (imageView != null) {
            imageView.setColorFilter(i);
        }
    }

    public static void m6802a(TextView textView, int i) {
        if (textView != null) {
            textView.setTextColor(i);
        }
    }

    public static void m6803a(TextView... textViewArr) {
        int i = 0;
        while (i <= 0) {
            TextView textView = textViewArr[0];
            if (textView != null) {
                textView.setTypeface(textView.getTypeface(), 1);
                i++;
            } else {
                return;
            }
        }
    }

    public static float m6804b(Context context, float f) {
        return f * context.getResources().getDisplayMetrics().density;
    }

    public static int m6805b(Context context) {
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(16843499, typedValue, true) ? TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()) : 0;
    }

    public static int m6806b(Context context, String str) {
        String str2;
        String[] stringArray;
        if (str == null) {
            Random random = new Random();
            stringArray = context.getResources().getStringArray(C2474a.colors);
            str2 = stringArray[random.nextInt(stringArray.length)];
        } else {
            int i = 0;
            int i2 = 0;
            while (i < str.length()) {
                i2 += str.charAt(i);
                i++;
            }
            stringArray = context.getResources().getStringArray(C2474a.colors);
            str2 = stringArray[i2 % stringArray.length];
        }
        return Color.parseColor(str2);
    }

    public static Point m6807b(int i, int i2, int i3) {
        Point point = new Point();
        double d = (double) i3;
        double d2 = (double) i;
        double d3 = (double) i2;
        int i4 = (int) ((d2 / d3) * d);
        d2 *= 1.25d;
        if (((double) i4) > d2) {
            i4 = (int) d2;
            i = (int) (d3 * (((double) i4) / d));
        }
        point.x = i;
        point.y = i4;
        return point;
    }

    public static Drawable m6808b(Drawable drawable, int i) {
        if (drawable != null) {
            drawable.setColorFilter(i, Mode.SRC_IN);
        }
        return drawable;
    }

    public static String m6809b(int i) {
        String num = Integer.toString(i);
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : num.toCharArray()) {
            char c2;
            if (Character.isDigit(c2)) {
                c2 = f8168a[Integer.parseInt(String.valueOf(c2))];
            }
            stringBuilder.append(c2);
        }
        return stringBuilder.toString();
    }

    public static java.lang.String m6810b(android.app.Activity r5, float r6) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:10:0x0064 in {3, 6, 8, 9} preds:[]
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:129)
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:48)
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:38)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r0 = 1148846080; // 0x447a0000 float:1000.0 double:5.676053805E-315;
        r1 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1));
        if (r1 >= 0) goto L_0x0014;
    L_0x0006:
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r6 = (int) r6;
        r5.append(r6);
        r5 = r5.toString();
        return r5;
    L_0x0014:
        r1 = 1232348160; // 0x49742400 float:1000000.0 double:6.088608896E-315;
        r2 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1));
        r3 = 0;
        r4 = 1;
        if (r2 >= 0) goto L_0x0044;
    L_0x001d:
        r6 = r6 / r0;
        r0 = java.util.Locale.US;
        r1 = mobi.mmdt.componentsutils.C2493b.C2482c.format_string_float;
        r5 = r5.getString(r1);
        r1 = new java.lang.Object[r4];
        r6 = java.lang.Float.valueOf(r6);
        r1[r3] = r6;
        r5 = java.lang.String.format(r0, r5, r1);
        r6 = new java.lang.StringBuilder;
        r6.<init>();
        r6.append(r5);
        r5 = "K";
    L_0x003c:
        r6.append(r5);
        r5 = r6.toString();
        return r5;
    L_0x0044:
        r6 = r6 / r1;
        r0 = java.util.Locale.US;
        r1 = mobi.mmdt.componentsutils.C2493b.C2482c.format_string_float;
        r5 = r5.getString(r1);
        r1 = new java.lang.Object[r4];
        r6 = java.lang.Float.valueOf(r6);
        r1[r3] = r6;
        r5 = java.lang.String.format(r0, r5, r1);
        r6 = new java.lang.StringBuilder;
        r6.<init>();
        r6.append(r5);
        r5 = "M";
        goto L_0x003c;
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.componentsutils.b.i.b(android.app.Activity, float):java.lang.String");
    }

    public static String m6811b(Activity activity, long j) {
        if (j < IjkMediaMeta.AV_CH_SIDE_RIGHT) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(j);
            stringBuilder.append(" ");
            stringBuilder.append(activity.getString(C2482c.clear_cache_format_file_size_b));
            return stringBuilder.toString();
        }
        int i;
        int log = (int) (Math.log((double) j) / Math.log(1024.0d));
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("kMGTPE".charAt(log - 1));
        String stringBuilder3 = stringBuilder2.toString();
        if (stringBuilder3.equalsIgnoreCase("k")) {
            stringBuilder2 = new StringBuilder(" ");
            i = C2482c.clear_cache_format_file_size_kb;
        } else if (stringBuilder3.equalsIgnoreCase("m")) {
            stringBuilder2 = new StringBuilder(" ");
            i = C2482c.clear_cache_format_file_size_mb;
        } else if (stringBuilder3.equalsIgnoreCase("g")) {
            stringBuilder2 = new StringBuilder(" ");
            i = C2482c.clear_cache_format_file_size_gb;
        } else {
            stringBuilder2 = new StringBuilder(" ");
            i = C2482c.clear_cache_format_file_size_b;
        }
        stringBuilder2.append(activity.getString(i));
        String stringBuilder4 = stringBuilder2.toString();
        stringBuilder2 = new StringBuilder();
        stringBuilder2.append(String.format("%.1f", new Object[]{Double.valueOf(r10 / Math.pow(1024.0d, (double) log))}));
        stringBuilder2.append(stringBuilder4);
        return stringBuilder2.toString();
    }

    public static String m6812b(Context context, long j) {
        Calendar.getInstance(Locale.ENGLISH).setTimeInMillis(j);
        return new SimpleDateFormat(context.getString(C2482c.simple_date_format_hh_mm), Locale.getDefault()).format(new Date(j));
    }

    public static String m6813b(Context context, long j, String str) {
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j);
        return str.equals("fa") ? C2464b.m6697a(context, instance).m12938b() : new SimpleDateFormat(context.getString(C2482c.simple_date_format_mmmm_d_yyyy), Locale.getDefault()).format(new Date(j));
    }

    public static String m6814b(String str) {
        if (str == null) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : str.toCharArray()) {
            char c2;
            if (Character.isDigit(c2)) {
                c2 = f8168a[Integer.parseInt(String.valueOf(c2))];
            }
            stringBuilder.append(c2);
        }
        return stringBuilder.toString();
    }

    public static void m6815b(int i, TextView... textViewArr) {
        for (int i2 = 0; i2 < 3; i2++) {
            C2491i.m6821b(textViewArr[i2], i);
        }
    }

    public static void m6816b(Activity activity) {
        int rotation;
        switch (activity.getResources().getConfiguration().orientation) {
            case 1:
                if (VERSION.SDK_INT < 8) {
                    activity.setRequestedOrientation(1);
                    return;
                }
                rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
                if (rotation != 1) {
                    if (rotation != 2) {
                        activity.setRequestedOrientation(1);
                        return;
                    }
                }
                activity.setRequestedOrientation(9);
                return;
            case 2:
                if (VERSION.SDK_INT < 8) {
                    activity.setRequestedOrientation(0);
                    return;
                }
                rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
                if (rotation != 0) {
                    if (rotation != 1) {
                        activity.setRequestedOrientation(8);
                        return;
                    }
                }
                activity.setRequestedOrientation(0);
                return;
            default:
                return;
        }
    }

    public static void m6817b(Toolbar toolbar, int i) {
        if (toolbar != null) {
            toolbar.setSubtitleTextColor(i);
        }
    }

    public static void m6818b(android.view.View r8, int r9) {
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
        r0 = android.widget.TextView.class;	 Catch:{ Throwable -> 0x0066 }
        r1 = "mCursorDrawableRes";	 Catch:{ Throwable -> 0x0066 }
        r0 = r0.getDeclaredField(r1);	 Catch:{ Throwable -> 0x0066 }
        r1 = 1;	 Catch:{ Throwable -> 0x0066 }
        r0.setAccessible(r1);	 Catch:{ Throwable -> 0x0066 }
        r0 = r0.getInt(r8);	 Catch:{ Throwable -> 0x0066 }
        r2 = android.widget.TextView.class;	 Catch:{ Throwable -> 0x0066 }
        r3 = "mEditor";	 Catch:{ Throwable -> 0x0066 }
        r2 = r2.getDeclaredField(r3);	 Catch:{ Throwable -> 0x0066 }
        r2.setAccessible(r1);	 Catch:{ Throwable -> 0x0066 }
        r2 = r2.get(r8);	 Catch:{ Throwable -> 0x0066 }
        r3 = r2.getClass();	 Catch:{ Throwable -> 0x0066 }
        r4 = "mCursorDrawable";	 Catch:{ Throwable -> 0x0066 }
        r3 = r3.getDeclaredField(r4);	 Catch:{ Throwable -> 0x0066 }
        r3.setAccessible(r1);	 Catch:{ Throwable -> 0x0066 }
        r4 = 2;	 Catch:{ Throwable -> 0x0066 }
        r4 = new android.graphics.drawable.Drawable[r4];	 Catch:{ Throwable -> 0x0066 }
        r5 = r8.getContext();	 Catch:{ Throwable -> 0x0066 }
        r5 = r5.getResources();	 Catch:{ Throwable -> 0x0066 }
        r6 = 0;	 Catch:{ Throwable -> 0x0066 }
        r5 = android.support.v4.p029a.p030a.C0343b.m671a(r5, r0, r6);	 Catch:{ Throwable -> 0x0066 }
        r7 = 0;	 Catch:{ Throwable -> 0x0066 }
        r4[r7] = r5;	 Catch:{ Throwable -> 0x0066 }
        r8 = r8.getContext();	 Catch:{ Throwable -> 0x0066 }
        r8 = r8.getResources();	 Catch:{ Throwable -> 0x0066 }
        r8 = android.support.v4.p029a.p030a.C0343b.m671a(r8, r0, r6);	 Catch:{ Throwable -> 0x0066 }
        r4[r1] = r8;	 Catch:{ Throwable -> 0x0066 }
        r8 = r4[r7];	 Catch:{ Throwable -> 0x0066 }
        if (r8 == 0) goto L_0x0066;	 Catch:{ Throwable -> 0x0066 }
    L_0x0051:
        r8 = r4[r1];	 Catch:{ Throwable -> 0x0066 }
        if (r8 == 0) goto L_0x0066;	 Catch:{ Throwable -> 0x0066 }
    L_0x0055:
        r8 = r4[r7];	 Catch:{ Throwable -> 0x0066 }
        r0 = android.graphics.PorterDuff.Mode.SRC_IN;	 Catch:{ Throwable -> 0x0066 }
        r8.setColorFilter(r9, r0);	 Catch:{ Throwable -> 0x0066 }
        r8 = r4[r1];	 Catch:{ Throwable -> 0x0066 }
        r0 = android.graphics.PorterDuff.Mode.SRC_IN;	 Catch:{ Throwable -> 0x0066 }
        r8.setColorFilter(r9, r0);	 Catch:{ Throwable -> 0x0066 }
        r3.set(r2, r4);	 Catch:{ Throwable -> 0x0066 }
    L_0x0066:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.componentsutils.b.i.b(android.view.View, int):void");
    }

    public static void m6819b(Button button, int i) {
        C0571r.m1335a((View) button, new ColorStateList(new int[][]{new int[0]}, new int[]{i}));
    }

    private static void m6820b(CompoundButton compoundButton, int i) {
        if (!compoundButton.isEnabled()) {
            i = UIThemeManager.disable_color;
        }
        C0615d.m1498a(compoundButton, C2491i.m6823c(i));
    }

    public static void m6821b(TextView textView, int i) {
        if (textView != null) {
            textView.setLinkTextColor(i);
        }
    }

    public static int m6822c(Context context) {
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        return identifier > 0 ? context.getResources().getDimensionPixelSize(identifier) : 0;
    }

    private static ColorStateList m6823c(int i) {
        r1 = new int[2][];
        r1[0] = new int[]{16842912};
        r1[1] = new int[0];
        return new ColorStateList(r1, new int[]{i, UIThemeManager.disable_color});
    }

    public static String m6824c(Context context, long j) {
        if (j < IjkMediaMeta.AV_CH_SIDE_RIGHT) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(j);
            stringBuilder.append(" ");
            stringBuilder.append(context.getString(C2482c.clear_cache_format_file_size_b));
            return stringBuilder.toString();
        }
        int i;
        int log = (int) (Math.log((double) j) / Math.log(1024.0d));
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("kMGTPE".charAt(log - 1));
        String stringBuilder3 = stringBuilder2.toString();
        if (stringBuilder3.equalsIgnoreCase("k")) {
            stringBuilder2 = new StringBuilder(" ");
            i = C2482c.clear_cache_format_file_size_kb;
        } else if (stringBuilder3.equalsIgnoreCase("m")) {
            stringBuilder2 = new StringBuilder(" ");
            i = C2482c.clear_cache_format_file_size_mb;
        } else if (stringBuilder3.equalsIgnoreCase("g")) {
            stringBuilder2 = new StringBuilder(" ");
            i = C2482c.clear_cache_format_file_size_gb;
        } else {
            stringBuilder2 = new StringBuilder(" ");
            i = C2482c.clear_cache_format_file_size_b;
        }
        stringBuilder2.append(context.getString(i));
        String stringBuilder4 = stringBuilder2.toString();
        stringBuilder2 = new StringBuilder();
        stringBuilder2.append(String.format("%.1f", new Object[]{Double.valueOf(r10 / Math.pow(1024.0d, (double) log))}));
        stringBuilder2.append(stringBuilder4);
        return stringBuilder2.toString();
    }

    public static String m6825c(Context context, long j, String str) {
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j);
        if (C2477b.m6725b(instance)) {
            return new SimpleDateFormat(context.getString(C2482c.simple_date_format_hh_mm), Locale.getDefault()).format(new Date(j));
        }
        if (C2477b.m6726c(instance)) {
            StringBuilder stringBuilder;
            String str2;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(context.getString(C2482c.simple_date_format_hh_mm), Locale.getDefault());
            if (str.equals("fa")) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(context.getString(C2482c.yesterday));
                str2 = "، ";
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append(context.getString(C2482c.yesterday));
                str2 = ", ";
            }
            stringBuilder.append(str2);
            str2 = stringBuilder.toString();
            stringBuilder = new StringBuilder();
            stringBuilder.append(str2);
            stringBuilder.append(simpleDateFormat.format(new Date(j)));
            return stringBuilder.toString();
        } else if (C2477b.m6723a(instance)) {
            if (!str.equals("fa")) {
                return new SimpleDateFormat(context.getString(C2482c.simple_date_format_mmmm_d_hh_mm), Locale.getDefault()).format(new Date(j));
            }
            r6 = new SimpleDateFormat(context.getString(C2482c.simple_date_format_hh_mm), Locale.getDefault());
            r3 = C2464b.m6697a(context, instance);
            r0 = new StringBuilder();
            r0.append(r3.m12937a());
            r0.append("، ");
            r0.append(r6.format(new Date(j)));
            return r0.toString();
        } else if (instance.get(1) < 2010) {
            return "";
        } else {
            if (!str.equals("fa")) {
                return new SimpleDateFormat(context.getString(C2482c.simple_date_format_mmmm_d_yyyy_hh_mm), Locale.getDefault()).format(new Date(j));
            }
            r6 = new SimpleDateFormat(context.getString(C2482c.simple_date_format_hh_mm), Locale.getDefault());
            r3 = C2464b.m6697a(context, instance);
            r0 = new StringBuilder();
            r0.append(r3.m12938b());
            r0.append("، ");
            r0.append(r6.format(new Date(j)));
            return r0.toString();
        }
    }

    public static String m6826c(String str) {
        if (str == null) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : str.toCharArray()) {
            char c2;
            if (Character.isDigit(c2)) {
                c2 = f8169b[Integer.parseInt(String.valueOf(c2))];
            }
            stringBuilder.append(c2);
        }
        return stringBuilder.toString();
    }

    public static void m6827c(Activity activity) {
        Intent intent = new Intent("android.intent.action.INSERT");
        intent.setType("vnd.android.cursor.dir/contact");
        activity.startActivityForResult(intent, 2);
    }

    public static void m6828c(TextView textView, int i) {
        if (textView != null && textView.getCompoundDrawables().length > 0 && textView.getCompoundDrawables()[0] != null) {
            textView.getCompoundDrawables()[0].setColorFilter(i, Mode.SRC_IN);
        }
    }

    public static String m6829d(Context context, long j, String str) {
        Calendar instance = Calendar.getInstance(Locale.ENGLISH);
        instance.setTimeInMillis(j);
        if (C2477b.m6725b(instance)) {
            return new SimpleDateFormat(context.getString(C2482c.simple_date_format_hh_mm), Locale.getDefault()).format(new Date(j));
        }
        if (C2477b.m6726c(instance)) {
            StringBuilder stringBuilder;
            String str2;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(context.getString(C2482c.simple_date_format_hh_mm), Locale.getDefault());
            if (str.equals("fa")) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(context.getString(C2482c.yesterday));
                str2 = "، ";
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append(context.getString(C2482c.yesterday));
                str2 = ", ";
            }
            stringBuilder.append(str2);
            str2 = stringBuilder.toString();
            stringBuilder = new StringBuilder();
            stringBuilder.append(str2);
            stringBuilder.append(simpleDateFormat.format(new Date(j)));
            return stringBuilder.toString();
        } else if (C2477b.m6723a(instance)) {
            if (!str.equals("fa")) {
                return new SimpleDateFormat(context.getString(C2482c.simple_date_format_mmm_d_hh_mm), Locale.getDefault()).format(new Date(j));
            }
            r6 = new SimpleDateFormat(context.getString(C2482c.simple_date_format_hh_mm), Locale.getDefault());
            r3 = C2464b.m6697a(context, instance);
            r0 = new StringBuilder();
            r0.append(r3.m12937a());
            r0.append("، ");
            r0.append(r6.format(new Date(j)));
            return r0.toString();
        } else if (instance.get(1) < 2010) {
            return "";
        } else {
            if (!str.equals("fa")) {
                return new SimpleDateFormat(context.getString(C2482c.simple_date_format_mmm_d_yyyy_hh_mm), Locale.getDefault()).format(new Date(j));
            }
            r6 = new SimpleDateFormat(context.getString(C2482c.simple_date_format_hh_mm), Locale.getDefault());
            r3 = C2464b.m6697a(context, instance);
            r0 = new StringBuilder();
            r0.append(r3.m12938b());
            r0.append("، ");
            r0.append(r6.format(new Date(j)));
            return r0.toString();
        }
    }

    public static boolean m6830d(Context context) {
        return context.getResources().getConfiguration().orientation == 1;
    }

    public static boolean m6831d(String str) {
        return f8170c.matcher(str).find();
    }

    public static float m6832e(Context context) {
        int a = C2489g.m6754a().m6755a(BallPulseIndicator.SCALE);
        int b = C2489g.m6754a().m6756b(BallPulseIndicator.SCALE);
        return context.getResources().getConfiguration().orientation == 1 ? C2491i.m6833f(context) ? (float) ((a * 40) / 100) : C2491i.m6834g(context) ? (float) ((a * 50) / 100) : (float) ((a * 70) / 100) : C2491i.m6833f(context) ? (float) ((b * 40) / 100) : C2491i.m6834g(context) ? (float) ((b * 50) / 100) : (float) ((b * 70) / 100);
    }

    public static boolean m6833f(Context context) {
        return (context.getResources().getConfiguration().screenLayout & 15) == 4;
    }

    public static boolean m6834g(Context context) {
        return (context.getResources().getConfiguration().screenLayout & 15) == 3;
    }

    public static boolean m6835h(Context context) {
        return (context.getResources().getConfiguration().screenLayout & 15) == 2;
    }

    public static float m6836i(Context context) {
        int a = C2489g.m6754a().m6755a(BallPulseIndicator.SCALE);
        int b = C2489g.m6754a().m6756b(BallPulseIndicator.SCALE);
        return context.getResources().getConfiguration().orientation == 1 ? C2491i.m6833f(context) ? (float) ((a * 15) / 100) : (float) ((a * 20) / 100) : C2491i.m6833f(context) ? (float) ((b * 15) / 100) : (float) ((b * 20) / 100);
    }

    public static int m6837j(Context context) {
        int i = context.getResources().getDisplayMetrics().densityDpi;
        return i <= 120 ? 8 : (i <= 120 || i > 160) ? (i <= 160 || i > 240) ? (i <= 240 || i > 320) ? (i <= 320 || i > 480) ? (i <= 480 || i <= 640) ? 24 : 24 : 21 : 16 : 12 : 8;
    }

    public static int m6838k(Context context) {
        int i = context.getResources().getDisplayMetrics().densityDpi;
        return i <= 120 ? 0 : (i <= 120 || i > 160) ? (i <= 160 || i > 240) ? (i <= 240 || i > 320) ? (i <= 320 || i > 480) ? (i <= 480 || i > 640) ? 6 : 5 : 4 : 3 : 2 : 1;
    }

    public static String m6839l(Context context) {
        String str = "";
        if ((context.getResources().getConfiguration().screenLayout & 15) == 2) {
            int i = context.getResources().getDisplayMetrics().densityDpi;
            if (i != 120) {
                return i != 160 ? i != 213 ? i != 240 ? i != 320 ? i != 480 ? i != 640 ? "normal-unknown" : "normal-xxxhdpi" : "normal-xxhdpi" : "normal-xhdpi" : "normal-hdpi" : "normal-tvdpi" : "normal-mdpi";
            } else {
                str = "normal-ldpi";
            }
        }
        return str;
    }
}
