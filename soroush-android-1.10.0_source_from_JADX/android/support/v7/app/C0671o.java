package android.support.v7.app;

import android.content.res.Resources;
import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;
import java.util.Map;

final class C0671o {
    private static Field f2231a;
    private static boolean f2232b;
    private static Class f2233c;
    private static boolean f2234d;
    private static Field f2235e;
    private static boolean f2236f;
    private static Field f2237g;
    private static boolean f2238h;

    static boolean m1646a(Resources resources) {
        if (!f2232b) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f2231a = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable e) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e);
            }
            f2232b = true;
        }
        if (f2231a != null) {
            Map map;
            try {
                map = (Map) f2231a.get(resources);
            } catch (Throwable e2) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e2);
                map = null;
            }
            if (map != null) {
                map.clear();
                return true;
            }
        }
        return false;
    }

    private static boolean m1647a(Object obj) {
        if (!f2234d) {
            try {
                f2233c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (Throwable e) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e);
            }
            f2234d = true;
        }
        if (f2233c == null) {
            return false;
        }
        if (!f2236f) {
            try {
                Field declaredField = f2233c.getDeclaredField("mUnthemedEntries");
                f2235e = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable e2) {
                Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e2);
            }
            f2236f = true;
        }
        if (f2235e == null) {
            return false;
        }
        LongSparseArray longSparseArray;
        try {
            longSparseArray = (LongSparseArray) f2235e.get(obj);
        } catch (Throwable e3) {
            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e3);
            longSparseArray = null;
        }
        if (longSparseArray == null) {
            return false;
        }
        longSparseArray.clear();
        return true;
    }

    static boolean m1648b(Resources resources) {
        Object obj;
        if (!f2232b) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f2231a = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable e) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e);
            }
            f2232b = true;
        }
        if (f2231a != null) {
            try {
                obj = f2231a.get(resources);
            } catch (Throwable e2) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e2);
            }
            return obj == null && obj != null && C0671o.m1647a(obj);
        }
        obj = null;
        if (obj == null) {
            return false;
        }
    }

    static boolean m1649c(Resources resources) {
        if (!f2238h) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                f2237g = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable e) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e);
            }
            f2238h = true;
        }
        if (f2237g == null) {
            return false;
        }
        Object obj;
        try {
            obj = f2237g.get(resources);
        } catch (Throwable e2) {
            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e2);
            obj = null;
        }
        if (obj == null) {
            return false;
        }
        if (!f2232b) {
            try {
                Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                f2231a = declaredField2;
                declaredField2.setAccessible(true);
            } catch (Throwable e3) {
                Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e3);
            }
            f2232b = true;
        }
        if (f2231a != null) {
            try {
                obj = f2231a.get(obj);
            } catch (Throwable e22) {
                Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e22);
            }
            return obj == null && C0671o.m1647a(obj);
        }
        obj = null;
        if (obj == null) {
        }
    }
}
