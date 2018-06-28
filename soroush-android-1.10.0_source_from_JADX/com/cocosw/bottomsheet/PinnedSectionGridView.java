package com.cocosw.bottomsheet;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.GridView;

public class PinnedSectionGridView extends GridView {
    private int f4015a;
    private int f4016b;
    private int f4017c;
    private int f4018d;

    public PinnedSectionGridView(Context context) {
        super(context);
    }

    public PinnedSectionGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PinnedSectionGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public int getAvailableWidth() {
        return this.f4018d != 0 ? this.f4018d : getWidth();
    }

    public int getColumnWidth() {
        return this.f4017c;
    }

    public int getHorizontalSpacing() {
        return this.f4016b;
    }

    public int getNumColumns() {
        return this.f4015a;
    }

    public void setColumnWidth(int i) {
        this.f4017c = i;
        super.setColumnWidth(i);
    }

    public void setHorizontalSpacing(int i) {
        this.f4016b = i;
        super.setHorizontalSpacing(i);
    }

    public void setNumColumns(int i) {
        this.f4015a = i;
        super.setNumColumns(i);
    }
}
