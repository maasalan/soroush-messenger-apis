package android.support.v7.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;

public abstract class C0665e {
    static int f2213a = -1;
    private static boolean f2214b = false;

    C0665e() {
    }

    public static C0665e m1616a(Activity activity, C0664d c0664d) {
        return C0665e.m1618a(activity, activity.getWindow(), c0664d);
    }

    public static C0665e m1617a(Dialog dialog, C0664d c0664d) {
        return C0665e.m1618a(dialog.getContext(), dialog.getWindow(), c0664d);
    }

    private static C0665e m1618a(Context context, Window window, C0664d c0664d) {
        return VERSION.SDK_INT >= 24 ? new C7568g(context, window, c0664d) : VERSION.SDK_INT >= 23 ? new C7407j(context, window, c0664d) : VERSION.SDK_INT >= 14 ? new C7256i(context, window, c0664d) : VERSION.SDK_INT >= 11 ? new C7022h(context, window, c0664d) : new AppCompatDelegateImplV9(context, window, c0664d);
    }

    public static boolean m1619k() {
        return f2214b;
    }

    public abstract C0662a mo457a();

    public abstract <T extends View> T mo2582a(int i);

    public abstract void mo2583a(Configuration configuration);

    public abstract void mo2584a(Bundle bundle);

    public abstract void mo2585a(Toolbar toolbar);

    public abstract void mo2586a(View view);

    public abstract void mo2587a(View view, LayoutParams layoutParams);

    public abstract void mo458a(CharSequence charSequence);

    public abstract MenuInflater mo459b();

    public abstract void mo2590b(int i);

    public abstract void mo460b(Bundle bundle);

    public abstract void mo2591b(View view, LayoutParams layoutParams);

    public abstract void mo2593c();

    public abstract boolean mo2594c(int i);

    public abstract void mo461d();

    public abstract void mo462e();

    public abstract void mo2597f();

    public abstract void mo2598g();

    public abstract void mo463h();

    public abstract void mo2599i();

    public abstract boolean mo464j();
}
