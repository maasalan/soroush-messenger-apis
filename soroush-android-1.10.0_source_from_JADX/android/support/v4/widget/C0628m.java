package android.support.v4.widget;

import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.widget.TextView;
import java.lang.reflect.Field;

public final class C0628m {
    static final C0627f f2058a;

    static class C0627f {
        private static Field f2054a;
        private static boolean f2055b;
        private static Field f2056c;
        private static boolean f2057d;

        C0627f() {
        }

        private static int m1522a(java.lang.reflect.Field r2, android.widget.TextView r3) {
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
            r3 = r2.getInt(r3);	 Catch:{ IllegalAccessException -> 0x0005 }
            return r3;
        L_0x0005:
            r3 = "TextViewCompatBase";
            r0 = new java.lang.StringBuilder;
            r1 = "Could not retrieve value of ";
            r0.<init>(r1);
            r2 = r2.getName();
            r0.append(r2);
            r2 = " field.";
            r0.append(r2);
            r2 = r0.toString();
            android.util.Log.d(r3, r2);
            r2 = -1;
            return r2;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.m.f.a(java.lang.reflect.Field, android.widget.TextView):int");
        }

        private static java.lang.reflect.Field m1523a(java.lang.String r4) {
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
            r0 = android.widget.TextView.class;	 Catch:{ NoSuchFieldException -> 0x000b }
            r0 = r0.getDeclaredField(r4);	 Catch:{ NoSuchFieldException -> 0x000b }
            r1 = 1;
            r0.setAccessible(r1);	 Catch:{ NoSuchFieldException -> 0x000c }
            return r0;
        L_0x000b:
            r0 = 0;
        L_0x000c:
            r1 = "TextViewCompatBase";
            r2 = new java.lang.StringBuilder;
            r3 = "Could not retrieve ";
            r2.<init>(r3);
            r2.append(r4);
            r4 = " field.";
            r2.append(r4);
            r4 = r2.toString();
            android.util.Log.e(r1, r4);
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.m.f.a(java.lang.String):java.lang.reflect.Field");
        }

        public int mo439a(TextView textView) {
            if (!f2057d) {
                f2056c = C0627f.m1523a("mMaxMode");
                f2057d = true;
            }
            if (f2056c != null && C0627f.m1522a(f2056c, textView) == 1) {
                if (!f2055b) {
                    f2054a = C0627f.m1523a("mMaximum");
                    f2055b = true;
                }
                if (f2054a != null) {
                    return C0627f.m1522a(f2054a, textView);
                }
            }
            return -1;
        }

        public void mo3502a(TextView textView, int i) {
            textView.setTextAppearance(textView.getContext(), i);
        }

        public void mo2580a(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        }

        public Drawable[] mo2581b(TextView textView) {
            return textView.getCompoundDrawables();
        }
    }

    static class C4859a extends C0627f {
        C4859a() {
        }

        public final int mo439a(TextView textView) {
            return textView.getMaxLines();
        }
    }

    static class C6385b extends C4859a {
        C6385b() {
        }

        public void mo2580a(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            Object obj = 1;
            if (textView.getLayoutDirection() != 1) {
                obj = null;
            }
            Drawable drawable5 = obj != null ? drawable3 : drawable;
            if (obj == null) {
                drawable = drawable3;
            }
            textView.setCompoundDrawables(drawable5, drawable2, drawable, drawable4);
        }

        public Drawable[] mo2581b(TextView textView) {
            int i = 1;
            if (textView.getLayoutDirection() != 1) {
                i = 0;
            }
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            if (i != 0) {
                Drawable drawable = compoundDrawables[2];
                Drawable drawable2 = compoundDrawables[0];
                compoundDrawables[0] = drawable;
                compoundDrawables[2] = drawable2;
            }
            return compoundDrawables;
        }
    }

    static class C7021c extends C6385b {
        C7021c() {
        }

        public final void mo2580a(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        }

        public final Drawable[] mo2581b(TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }
    }

    static class C7254d extends C7021c {
        C7254d() {
        }

        public final void mo3502a(TextView textView, int i) {
            textView.setTextAppearance(i);
        }
    }

    static class C7405e extends C7254d {
        C7405e() {
        }
    }

    static {
        C0627f c7405e = VERSION.SDK_INT >= 26 ? new C7405e() : VERSION.SDK_INT >= 23 ? new C7254d() : VERSION.SDK_INT >= 18 ? new C7021c() : VERSION.SDK_INT >= 17 ? new C6385b() : VERSION.SDK_INT >= 16 ? new C4859a() : new C0627f();
        f2058a = c7405e;
    }

    public static int m1528a(TextView textView) {
        return f2058a.mo439a(textView);
    }

    public static void m1529a(TextView textView, int i) {
        f2058a.mo3502a(textView, i);
    }

    public static void m1530a(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        f2058a.mo2580a(textView, drawable, drawable2, drawable3, drawable4);
    }

    public static Drawable[] m1531b(TextView textView) {
        return f2058a.mo2581b(textView);
    }
}
