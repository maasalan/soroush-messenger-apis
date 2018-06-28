package com.p196h.p197a;

import android.util.TypedValue;
import android.view.View;

final class C2128e {
    static int m5805a(int i, View view) {
        return (int) TypedValue.applyDimension(1, (float) i, view.getResources().getDisplayMetrics());
    }
}
