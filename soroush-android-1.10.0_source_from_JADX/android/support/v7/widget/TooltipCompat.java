package android.support.v7.widget;

import android.annotation.TargetApi;
import android.os.Build.VERSION;
import android.view.View;

public class TooltipCompat {
    private static final ViewCompatImpl IMPL = (VERSION.SDK_INT >= 26 ? new Api26ViewCompatImpl() : new BaseViewCompatImpl());

    private interface ViewCompatImpl {
        void setTooltipText(View view, CharSequence charSequence);
    }

    @TargetApi(26)
    private static class Api26ViewCompatImpl implements ViewCompatImpl {
        private Api26ViewCompatImpl() {
        }

        public void setTooltipText(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    private static class BaseViewCompatImpl implements ViewCompatImpl {
        private BaseViewCompatImpl() {
        }

        public void setTooltipText(View view, CharSequence charSequence) {
            TooltipCompatHandler.setTooltipText(view, charSequence);
        }
    }

    private TooltipCompat() {
    }

    public static void setTooltipText(View view, CharSequence charSequence) {
        IMPL.setTooltipText(view, charSequence);
    }
}
