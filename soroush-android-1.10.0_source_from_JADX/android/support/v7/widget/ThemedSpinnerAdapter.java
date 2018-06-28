package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources.Theme;
import android.support.v7.view.C0707d;
import android.view.LayoutInflater;
import android.widget.SpinnerAdapter;

public interface ThemedSpinnerAdapter extends SpinnerAdapter {

    public static final class Helper {
        private final Context mContext;
        private LayoutInflater mDropDownInflater;
        private final LayoutInflater mInflater;

        public Helper(Context context) {
            this.mContext = context;
            this.mInflater = LayoutInflater.from(context);
        }

        public final LayoutInflater getDropDownViewInflater() {
            return this.mDropDownInflater != null ? this.mDropDownInflater : this.mInflater;
        }

        public final Theme getDropDownViewTheme() {
            return this.mDropDownInflater == null ? null : this.mDropDownInflater.getContext().getTheme();
        }

        public final void setDropDownViewTheme(Theme theme) {
            LayoutInflater from = theme == null ? null : theme == this.mContext.getTheme() ? this.mInflater : LayoutInflater.from(new C0707d(this.mContext, theme));
            this.mDropDownInflater = from;
        }
    }

    Theme getDropDownViewTheme();

    void setDropDownViewTheme(Theme theme);
}
