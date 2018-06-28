package android.support.p028d;

import android.util.Log;
import android.view.ViewGroup;
import java.lang.reflect.Method;

final class ag extends af {
    private static Method f17326a;
    private static boolean f17327b;

    ag() {
    }

    public final ad mo72a(ViewGroup viewGroup) {
        return new ac(viewGroup);
    }

    public final void mo73a(ViewGroup viewGroup, boolean z) {
        if (!f17327b) {
            try {
                Method declaredMethod = ViewGroup.class.getDeclaredMethod("suppressLayout", new Class[]{Boolean.TYPE});
                f17326a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Throwable e) {
                Log.i("ViewUtilsApi18", "Failed to retrieve suppressLayout method", e);
            }
            f17327b = true;
        }
        if (f17326a != null) {
            try {
                f17326a.invoke(viewGroup, new Object[]{Boolean.valueOf(z)});
            } catch (Throwable e2) {
                Log.i("ViewUtilsApi18", "Failed to invoke suppressLayout method", e2);
            } catch (Throwable e22) {
                Log.i("ViewUtilsApi18", "Error invoking suppressLayout method", e22);
            }
        }
    }
}
