package android.support.design.widget;

import android.graphics.PorterDuff.Mode;

final class C0333x {
    static Mode m656a(int i) {
        if (i == 3) {
            return Mode.SRC_OVER;
        }
        if (i == 5) {
            return Mode.SRC_IN;
        }
        if (i == 9) {
            return Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return Mode.MULTIPLY;
            case 15:
                return Mode.SCREEN;
            default:
                return null;
        }
    }
}
