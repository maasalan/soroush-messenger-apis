package android.support.v4.view;

import android.os.Build.VERSION;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.LayoutInflater.Factory;
import android.view.LayoutInflater.Factory2;
import java.lang.reflect.Field;

public final class C0557e {
    static final C0556b f1848a = (VERSION.SDK_INT >= 21 ? new C4839a() : new C0556b());
    private static Field f1849b;
    private static boolean f1850c;

    static class C0556b {
        C0556b() {
        }

        public void mo400a(LayoutInflater layoutInflater, Factory2 factory2) {
            layoutInflater.setFactory2(factory2);
            Factory factory = layoutInflater.getFactory();
            if (factory instanceof Factory2) {
                C0557e.m1227a(layoutInflater, (Factory2) factory);
            } else {
                C0557e.m1227a(layoutInflater, factory2);
            }
        }
    }

    static class C4839a extends C0556b {
        C4839a() {
        }

        public final void mo400a(LayoutInflater layoutInflater, Factory2 factory2) {
            layoutInflater.setFactory2(factory2);
        }
    }

    static void m1227a(LayoutInflater layoutInflater, Factory2 factory2) {
        if (!f1850c) {
            try {
                Field declaredField = LayoutInflater.class.getDeclaredField("mFactory2");
                f1849b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable e) {
                StringBuilder stringBuilder = new StringBuilder("forceSetFactory2 Could not find field 'mFactory2' on class ");
                stringBuilder.append(LayoutInflater.class.getName());
                stringBuilder.append("; inflation may have unexpected results.");
                Log.e("LayoutInflaterCompatHC", stringBuilder.toString(), e);
            }
            f1850c = true;
        }
        if (f1849b != null) {
            try {
                f1849b.set(layoutInflater, factory2);
            } catch (Throwable e2) {
                StringBuilder stringBuilder2 = new StringBuilder("forceSetFactory2 could not set the Factory2 on LayoutInflater ");
                stringBuilder2.append(layoutInflater);
                stringBuilder2.append("; inflation may have unexpected results.");
                Log.e("LayoutInflaterCompatHC", stringBuilder2.toString(), e2);
            }
        }
    }

    public static void m1228b(LayoutInflater layoutInflater, Factory2 factory2) {
        f1848a.mo400a(layoutInflater, factory2);
    }
}
