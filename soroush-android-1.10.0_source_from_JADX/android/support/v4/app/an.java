package android.support.v4.app;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

public final class an implements Iterable<Intent> {
    private static final C0380c f1405c = (VERSION.SDK_INT >= 16 ? new C4776b() : new C0380c());
    public final ArrayList<Intent> f1406a = new ArrayList();
    public final Context f1407b;

    public interface C0379a {
        Intent a_();
    }

    static class C0380c {
        C0380c() {
        }
    }

    static class C4776b extends C0380c {
        C4776b() {
        }
    }

    private an(Context context) {
        this.f1407b = context;
    }

    public static an m748a(Context context) {
        return new an(context);
    }

    public final an m749a(ComponentName componentName) {
        int size = this.f1406a.size();
        try {
            Context context = this.f1407b;
            while (true) {
                Intent a = C0418u.m841a(context, componentName);
                if (a == null) {
                    return this;
                }
                this.f1406a.add(size, a);
                context = this.f1407b;
                componentName = a.getComponent();
            }
        } catch (Throwable e) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e);
        }
    }

    @Deprecated
    public final Iterator<Intent> iterator() {
        return this.f1406a.iterator();
    }
}
