package mobi.mmdt.ott.view.tools.p482f;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import com.p085c.p086a.C1212c;
import com.p085c.p086a.p089c.p092b.C1144h;
import com.p085c.p086a.p105g.C1248f;
import com.p085c.p086a.p105g.p106a.C7038f;
import com.p085c.p086a.p105g.p107b.C1242b;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import jp.wasabeef.p215a.p216a.C7156b;
import mobi.mmdt.componentsutils.C2468a;
import mobi.mmdt.componentsutils.p232b.C2489g;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.C2791c;
import mobi.mmdt.ott.logic.C2808d;
import mobi.mmdt.ott.logic.p261a.ae.p544b.C6663d;
import mobi.mmdt.ott.logic.p355i.p356a.C2827a;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.view.conversation.activities.p419a.p423b.C3346g;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;
import mobi.mmdt.ott.view.settings.mainsettings.changebackground.ChangeBackgroundConversationActivity.C4386a;
import org.jivesoftware.smack.roster.Roster;

public final class C4507a {
    static /* synthetic */ void m8205a(Activity activity, Bitmap bitmap, View view) {
        LayoutParams layoutParams;
        Drawable bitmapDrawable;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int a = C2489g.m6754a().m6755a(BallPulseIndicator.SCALE);
        int b = C2489g.m6754a().m6756b(BallPulseIndicator.SCALE);
        Object obj = width < a ? 1 : null;
        if (obj == null) {
            if (height >= b) {
                a = width / a;
                b = height / b;
                if (b == a && a > 1) {
                    width /= a;
                    height /= b;
                }
                layoutParams = (LayoutParams) view.getLayoutParams();
                layoutParams.width = width;
                layoutParams.height = height;
                bitmapDrawable = new BitmapDrawable(activity.getResources(), bitmap);
                if (VERSION.SDK_INT < 16) {
                    view.setBackground(bitmapDrawable);
                } else {
                    view.setBackgroundDrawable(bitmapDrawable);
                }
            }
        }
        if (obj != null) {
            Point point = new Point();
            float f = (float) width;
            float f2 = ((float) a) / f;
            point.x = (int) (f * f2);
            point.y = (int) (((float) height) * f2);
            width = point.x;
            height = point.y;
        }
        if (height < b) {
            Point point2 = new Point();
            float f3 = (float) height;
            float f4 = ((float) b) / f3;
            point2.x = (int) (((float) width) * f4);
            point2.y = (int) (f3 * f4);
            width = point2.x;
            height = point2.y;
        }
        layoutParams = (LayoutParams) view.getLayoutParams();
        layoutParams.width = width;
        layoutParams.height = height;
        bitmapDrawable = new BitmapDrawable(activity.getResources(), bitmap);
        if (VERSION.SDK_INT < 16) {
            view.setBackgroundDrawable(bitmapDrawable);
        } else {
            view.setBackground(bitmapDrawable);
        }
    }

    public static void m8206a(final Activity activity, final View view, boolean z) {
        C2535a a = C2535a.m6888a();
        int I = a.m6897I();
        if (I == C4386a.default_background.ordinal()) {
            if (z) {
                C1212c.m2872a(activity).m10958e().m3036a(Integer.valueOf(R.drawable.default_background)).m3034a(new C1248f().m2951a(new C7156b(40)).m2955b(C1144h.f3689a).m2962h().m2954b(256, 256)).m3031a((ImageView) view);
            } else {
                C1212c.m2872a(activity).m10958e().m3036a(Integer.valueOf(R.drawable.default_background)).m3032a(new C7038f<Bitmap>() {
                    public final /* bridge */ /* synthetic */ void mo3320a(Object obj, C1242b c1242b) {
                        C4507a.m8205a(activity, (Bitmap) obj, view);
                    }
                });
            }
        } else if (I == C4386a.select_color.ordinal()) {
            view.setBackgroundColor(a.m6895F());
        } else {
            if (I == C4386a.galley_image.ordinal() || I == C4386a.web_service_image.ordinal()) {
                String G = a.m6896G();
                if (G != null) {
                    if (z) {
                        C1212c.m2872a(activity).m10958e().m3037a((Object) G).m3034a(new C1248f().m2951a(new C7156b(40)).m2955b(C1144h.f3689a).m2962h().m2954b(256, 256)).m3031a((ImageView) view);
                        return;
                    }
                    C4507a.m8207a(activity, G, view);
                }
            }
        }
    }

    public static void m8207a(final Activity activity, String str, final View view) {
        C1212c.m2872a(activity).m10958e().m3037a((Object) str).m3032a(new C7038f<Bitmap>() {
            public final /* bridge */ /* synthetic */ void mo3320a(Object obj, C1242b c1242b) {
                C4507a.m8205a(activity, (Bitmap) obj, view);
            }
        });
    }

    public static void m8208a(File file) {
        if (file.isDirectory()) {
            for (File a : file.listFiles()) {
                C4507a.m8208a(a);
            }
        }
        file.delete();
    }

    private static void m8209a(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[Roster.INITIAL_DEFAULT_NON_ROSTER_PRESENCE_MAP_SIZE];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    public static void m8210a(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(File.separator);
        str = stringBuilder.toString();
        C3346g b = C4507a.m8219b(str);
        String str2 = (String) b.f10273a;
        C4507a.m8213a(str, false, (String) b.f10274b);
        if (!str2.isEmpty()) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(str);
            stringBuilder2.append(str2);
            C2808d.m7147a(new C6663d(stringBuilder2.toString()));
        }
    }

    public static void m8211a(String str, String str2, String str3, boolean z, boolean z2) {
        C3346g b = C4507a.m8219b(str3);
        String str4 = (String) b.f10273a;
        String str5 = (String) b.f10274b;
        if (str4 != null && !str4.isEmpty()) {
            C4507a.m8213a(str3, z, str5);
            new File(C2791c.m7109a().m7123h(str)).delete();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str2);
            stringBuilder.append(File.separator);
            stringBuilder.append(str4);
            C2808d.m7147a(new C6663d(stringBuilder.toString(), z2 ^ 1));
        }
    }

    public static void m8212a(String str, boolean z) {
        C2827a.m7166b(new File(str).getName());
        if (z) {
            C2808d.m7147a(new C6663d(str));
        } else {
            C4507a.m8210a(str);
        }
    }

    private static void m8213a(String str, boolean z, String str2) {
        if (!(str2 == null || str2.isEmpty())) {
            C2535a a = C2535a.m6888a();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(str2);
            a.m6940f(stringBuilder.toString());
            if (z) {
                C2535a.m6888a().m6920b(C4386a.default_background.ordinal());
                return;
            }
            C2535a.m6888a().m6920b(C4386a.galley_image.ordinal());
        }
    }

    private static void m8214a(boolean z, String str, String str2, boolean z2, boolean z3) {
        if (z) {
            C4507a.m8211a("default_theme.zip", str, str2, z2, z3);
        }
    }

    public static void m8215a(boolean z, boolean z2, boolean z3) {
        String h = C2791c.m7109a().m7123h("default_theme");
        C2535a a = C2535a.m6888a();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(h);
        stringBuilder.append(File.separator);
        stringBuilder.append("default_theme.stheme");
        a.f8278a.edit().putString("mobi.mmdt.ott.model.pref.KEY_IS_COPY_DEFAULT_THEME", stringBuilder.toString()).apply();
        String str = C2791c.m7109a().f8820f;
        stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(File.separator);
        stringBuilder.append("default_theme");
        stringBuilder.append(File.separator);
        String stringBuilder2 = stringBuilder.toString();
        boolean l = C2468a.m6715l(h);
        if (C2535a.m6888a().as() != 11 && l) {
            C4507a.m8208a(new File(h));
        }
        if (l) {
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append(h);
            stringBuilder3.append(File.separator);
            stringBuilder3.append("default_theme.stheme");
            if (new File(stringBuilder3.toString()).exists()) {
                if (C2535a.m6888a().as() == 11) {
                    C4507a.m8214a(z, h, stringBuilder2, z2, z3);
                    C2535a.m6888a().ar();
                    return;
                }
            }
        }
        C2791c.m7109a();
        C2791c.m7111j(h);
        StringBuilder stringBuilder4 = new StringBuilder();
        stringBuilder4.append(h);
        stringBuilder4.append(".stheme2");
        if (C4507a.m8216a(MyApplication.m12952b(), "default_theme.stheme2", stringBuilder4.toString()) && !C4507a.m8218a(str, stringBuilder2, "default_theme.stheme2", "default_theme.zip")) {
            C4507a.m8214a(z, h, stringBuilder2, z2, z3);
            C2535a.m6888a().ar();
        }
    }

    public static boolean m8216a(android.content.Context r4, java.lang.String r5, java.lang.String r6) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r4 = r4.getAssets();
        r0 = 0;
        r4 = r4.open(r5);	 Catch:{ IOException -> 0x0037, all -> 0x0034 }
        r1 = new java.io.File;	 Catch:{ IOException -> 0x002f, all -> 0x002a }
        r1.<init>(r6);	 Catch:{ IOException -> 0x002f, all -> 0x002a }
        r6 = new java.io.FileOutputStream;	 Catch:{ IOException -> 0x002f, all -> 0x002a }
        r6.<init>(r1);	 Catch:{ IOException -> 0x002f, all -> 0x002a }
        mobi.mmdt.ott.view.tools.p482f.C4507a.m8209a(r4, r6);	 Catch:{ IOException -> 0x0024, all -> 0x0020 }
        if (r4 == 0) goto L_0x001b;
    L_0x0018:
        r4.close();	 Catch:{ IOException -> 0x001b }
    L_0x001b:
        r6.close();	 Catch:{ IOException -> 0x001e }
    L_0x001e:
        r4 = 1;
        return r4;
    L_0x0020:
        r5 = move-exception;
        r0 = r4;
        r4 = r6;
        goto L_0x0064;
    L_0x0024:
        r0 = move-exception;
        r3 = r0;
        r0 = r4;
        r4 = r6;
        r6 = r3;
        goto L_0x003a;
    L_0x002a:
        r5 = move-exception;
        r3 = r0;
        r0 = r4;
        r4 = r3;
        goto L_0x0064;
    L_0x002f:
        r6 = move-exception;
        r3 = r0;
        r0 = r4;
        r4 = r3;
        goto L_0x003a;
    L_0x0034:
        r5 = move-exception;
        r4 = r0;
        goto L_0x0064;
    L_0x0037:
        r4 = move-exception;
        r6 = r4;
        r4 = r0;
    L_0x003a:
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0063 }
        r2 = "Failed to copy asset file: ";	 Catch:{ all -> 0x0063 }
        r1.<init>(r2);	 Catch:{ all -> 0x0063 }
        r1.append(r5);	 Catch:{ all -> 0x0063 }
        r5 = "  -  ";	 Catch:{ all -> 0x0063 }
        r1.append(r5);	 Catch:{ all -> 0x0063 }
        r5 = r6.toString();	 Catch:{ all -> 0x0063 }
        r1.append(r5);	 Catch:{ all -> 0x0063 }
        r5 = r1.toString();	 Catch:{ all -> 0x0063 }
        mobi.mmdt.componentsutils.p232b.p235c.C2480b.m6742f(r5);	 Catch:{ all -> 0x0063 }
        if (r0 == 0) goto L_0x005c;
    L_0x0059:
        r0.close();	 Catch:{ IOException -> 0x005c }
    L_0x005c:
        if (r4 == 0) goto L_0x0061;
    L_0x005e:
        r4.close();	 Catch:{ IOException -> 0x0061 }
    L_0x0061:
        r4 = 0;
        return r4;
    L_0x0063:
        r5 = move-exception;
    L_0x0064:
        if (r0 == 0) goto L_0x0069;
    L_0x0066:
        r0.close();	 Catch:{ IOException -> 0x0069 }
    L_0x0069:
        if (r4 == 0) goto L_0x006e;
    L_0x006b:
        r4.close();	 Catch:{ IOException -> 0x006e }
    L_0x006e:
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.tools.f.a.a(android.content.Context, java.lang.String, java.lang.String):boolean");
    }

    public static boolean m8217a(String str, String str2) {
        byte[] bArr = new byte[8192];
        try {
            if (!str2.endsWith(File.separator)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str2);
                stringBuilder.append(File.separator);
                str2 = stringBuilder.toString();
            }
            File file = new File(str2);
            if (!file.isDirectory()) {
                file.mkdirs();
            }
            ZipInputStream zipInputStream = new ZipInputStream(new BufferedInputStream(new FileInputStream(str), 8192));
            while (true) {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry != null) {
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append(str2);
                    stringBuilder2.append(nextEntry.getName());
                    File file2 = new File(stringBuilder2.toString());
                    if (!nextEntry.isDirectory()) {
                        File parentFile = file2.getParentFile();
                        if (!(parentFile == null || parentFile.isDirectory())) {
                            parentFile.mkdirs();
                        }
                        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file2, false), 8192);
                        while (true) {
                            try {
                                int read = zipInputStream.read(bArr, 0, 8192);
                                if (read == -1) {
                                    break;
                                }
                                bufferedOutputStream.write(bArr, 0, read);
                            } catch (Throwable th) {
                                zipInputStream.close();
                            }
                        }
                        zipInputStream.closeEntry();
                        bufferedOutputStream.flush();
                        bufferedOutputStream.close();
                    } else if (!file2.isDirectory()) {
                        file2.mkdirs();
                    }
                } else {
                    zipInputStream.close();
                    return true;
                }
            }
        } catch (Throwable e) {
            Log.e("", "Unzip exception", e);
            return false;
        }
    }

    public static boolean m8218a(String str, String str2, String str3, String str4) {
        if (!new File(C2791c.m7109a().m7123h(str3)).renameTo(new File(C2791c.m7109a().m7123h(str4)))) {
            return true;
        }
        boolean a;
        try {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(File.separator);
            stringBuilder.append(str4);
            a = C4507a.m8217a(stringBuilder.toString(), str2);
        } catch (IOException e) {
            e.printStackTrace();
            a = false;
        }
        return !a;
    }

    private static C3346g<String, String> m8219b(String str) {
        Object obj = "";
        Object obj2 = "";
        String[] list = new File(str).list();
        for (String str2 : list) {
            if (C2468a.m6709f(str2)) {
                obj = str2;
            } else if (C2468a.m6704a(str2)) {
                obj2 = str2;
            }
        }
        return new C3346g(obj, obj2);
    }
}
