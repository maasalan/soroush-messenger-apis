package android.support.v7.view.menu;

import android.content.Context;
import android.support.v7.view.menu.C4890h.C0723b;
import android.support.v7.widget.TintTypedArray;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public final class ExpandedMenuView extends ListView implements C0723b, C0729p, OnItemClickListener {
    private static final int[] f13594a = new int[]{16842964, 16843049};
    private C4890h f13595b;
    private int f13596c;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, f13594a, i, 0);
        if (obtainStyledAttributes.hasValue(0)) {
            setBackgroundDrawable(obtainStyledAttributes.getDrawable(0));
        }
        if (obtainStyledAttributes.hasValue(1)) {
            setDivider(obtainStyledAttributes.getDrawable(1));
        }
        obtainStyledAttributes.recycle();
    }

    public final int getWindowAnimations() {
        return this.f13596c;
    }

    public final void initialize(C4890h c4890h) {
        this.f13595b = c4890h;
    }

    public final boolean invokeItem(C4893j c4893j) {
        return this.f13595b.m9481a((MenuItem) c4893j, null, 0);
    }

    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        invokeItem((C4893j) getAdapter().getItem(i));
    }
}
