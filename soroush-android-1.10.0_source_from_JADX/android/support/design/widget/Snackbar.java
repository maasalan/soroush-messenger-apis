package android.support.design.widget;

import android.content.Context;
import android.support.design.C0249a.C0245h;
import android.support.design.internal.SnackbarContentLayout;
import android.support.design.widget.C0306b.C0302b;
import android.support.design.widget.C0306b.C0305e;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.TextView;
import mobi.mmdt.ott.R;

public final class Snackbar extends C0306b<Snackbar> {

    public static final class SnackbarLayout extends C0305e {
        public SnackbarLayout(Context context) {
            super(context);
        }

        public SnackbarLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        protected final void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            i = getChildCount();
            i2 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            for (int i3 = 0; i3 < i; i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getLayoutParams().width == -1) {
                    childAt.measure(MeasureSpec.makeMeasureSpec(i2, 1073741824), MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
                }
            }
        }
    }

    private Snackbar(ViewGroup viewGroup, View view, C0302b c0302b) {
        super(viewGroup, view, c0302b);
    }

    public static Snackbar m8770a(View view, CharSequence charSequence, int i) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2 = null;
        while (!(view instanceof CoordinatorLayout)) {
            if (view instanceof FrameLayout) {
                if (view.getId() == 16908290) {
                    break;
                }
                viewGroup2 = (ViewGroup) view;
            }
            if (view != null) {
                ViewParent parent = view.getParent();
                if (parent instanceof View) {
                    view = (View) parent;
                    continue;
                } else {
                    view = null;
                    continue;
                }
            }
            if (view == null) {
                viewGroup = viewGroup2;
                break;
            }
        }
        viewGroup = (ViewGroup) view;
        if (viewGroup == null) {
            throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
        }
        SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) LayoutInflater.from(viewGroup.getContext()).inflate(C0245h.design_layout_snackbar_include, viewGroup, false);
        C0306b snackbar = new Snackbar(viewGroup, snackbarContentLayout, snackbarContentLayout);
        ((SnackbarContentLayout) snackbar.d.getChildAt(0)).getMessageView().setText(charSequence);
        snackbar.f1147e = i;
        return snackbar;
    }

    public final Snackbar m8771a(OnClickListener onClickListener) {
        return m8772a(this.f1145c.getText(R.string.retry), onClickListener);
    }

    public final Snackbar m8772a(CharSequence charSequence, final OnClickListener onClickListener) {
        OnClickListener c02791;
        TextView actionView = ((SnackbarContentLayout) this.d.getChildAt(0)).getActionView();
        if (!TextUtils.isEmpty(charSequence)) {
            if (onClickListener != null) {
                actionView.setVisibility(0);
                actionView.setText(charSequence);
                c02791 = new OnClickListener(this) {
                    final /* synthetic */ Snackbar f1007b;

                    public final void onClick(View view) {
                        onClickListener.onClick(view);
                        this.f1007b.m573a(1);
                    }
                };
                actionView.setOnClickListener(c02791);
                return this;
            }
        }
        actionView.setVisibility(8);
        c02791 = null;
        actionView.setOnClickListener(c02791);
        return this;
    }
}
