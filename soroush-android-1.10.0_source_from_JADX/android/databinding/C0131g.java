package android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import mobi.mmdt.ott.R;

public final class C0131g {
    private static C0129d f413a = new C4694e();
    private static C0130f f414b;

    static <T extends ViewDataBinding> T m205a(C0130f c0130f, View view, int i) {
        return f413a.mo49a(c0130f, view, i);
    }

    public static <T extends ViewDataBinding> T m206a(LayoutInflater layoutInflater, int i, ViewGroup viewGroup, C0130f c0130f) {
        return C0131g.m205a(c0130f, layoutInflater.inflate(i, viewGroup, false), i);
    }

    public static <T extends ViewDataBinding> T m207a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C0131g.m206a(layoutInflater, R.layout.fragment_soroush_charge, viewGroup, f414b);
    }

    public static C0130f m208a() {
        return f414b;
    }

    static <T extends ViewDataBinding> T m209b() {
        return null;
    }
}
