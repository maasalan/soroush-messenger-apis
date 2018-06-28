package android.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.p041a.C0645a.C0635a;

final class C0330t {
    private static final int[] f1271a = new int[]{C0635a.colorPrimary};

    static void m650a(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f1271a);
        int hasValue = obtainStyledAttributes.hasValue(0) ^ 1;
        obtainStyledAttributes.recycle();
        if (hasValue != 0) {
            throw new IllegalArgumentException("You need to use a Theme.AppCompat theme (or descendant) with the design library.");
        }
    }
}
