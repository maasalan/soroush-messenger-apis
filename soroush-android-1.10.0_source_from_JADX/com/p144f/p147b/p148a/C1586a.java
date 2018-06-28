package com.p144f.p147b.p148a;

import android.app.Activity;
import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;

public final class C1586a {
    public View f4923a;
    private Activity f4924b;
    private View f4925c;
    private Context f4926d;
    private SparseArray<View> f4927e = new SparseArray();

    public C1586a(View view) {
        this.f4925c = view;
        this.f4923a = view;
        this.f4926d = view.getContext();
    }

    public final C1586a m4109a() {
        if (this.f4923a != null) {
            this.f4923a.setVisibility(0);
        }
        return this;
    }

    public final C1586a m4110a(int i) {
        this.f4923a = (View) this.f4927e.get(i);
        if (this.f4923a == null) {
            this.f4923a = this.f4925c != null ? this.f4925c.findViewById(i) : this.f4924b.findViewById(i);
            this.f4927e.put(i, this.f4923a);
        }
        return this;
    }

    public final C1586a m4111a(OnClickListener onClickListener) {
        if (this.f4923a != null) {
            this.f4923a.setOnClickListener(onClickListener);
        }
        return this;
    }

    public final C1586a m4112a(CharSequence charSequence) {
        if (this.f4923a != null && (this.f4923a instanceof TextView)) {
            ((TextView) this.f4923a).setText(charSequence);
        }
        return this;
    }

    public final C1586a m4113b() {
        if (this.f4923a != null) {
            this.f4923a.setVisibility(8);
        }
        return this;
    }

    public final C1586a m4114b(int i) {
        if (this.f4923a instanceof ImageView) {
            ((ImageView) this.f4923a).setImageResource(i);
        }
        return this;
    }

    public final C1586a m4115c() {
        if (this.f4923a != null) {
            this.f4923a.setVisibility(8);
        }
        return this;
    }

    public final C1586a m4116c(int i) {
        if (this.f4923a != null && (this.f4923a instanceof TextView)) {
            ((TextView) this.f4923a).setText(i);
        }
        return this;
    }
}
