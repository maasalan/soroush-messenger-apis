package jp.wasabeef.recyclerview.animators.internal;

import android.support.v4.view.C0571r;
import android.view.View;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

public final class ViewHelper {
    public static void clear(View view) {
        C0571r.m1355c(view, (float) BallPulseIndicator.SCALE);
        C0571r.m1368g(view, BallPulseIndicator.SCALE);
        C0571r.m1365f(view, (float) BallPulseIndicator.SCALE);
        C0571r.m1351b(view, 0.0f);
        C0571r.m1333a(view, 0.0f);
        C0571r.m1381r(view);
        C0571r.m1362e(view, 0.0f);
        C0571r.m1358d(view, 0.0f);
        view.setPivotY((float) (view.getMeasuredHeight() / 2));
        C0571r.m1370h(view, (float) (view.getMeasuredWidth() / 2));
        C0571r.m1380q(view).m1414a(null);
    }
}
