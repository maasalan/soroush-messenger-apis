package com.google.android.gms.p158a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.common.C1771k;
import com.google.android.gms.common.C5458b;
import com.google.android.gms.common.internal.az;
import java.util.LinkedList;

public abstract class C1646c<T extends C1645b> {
    public T f5103a;
    public Bundle f5104b;
    LinkedList<C1648k> f5105c;
    private final C1649n<T> f5106d = new C5426d(this);

    private final void m4224a(Bundle bundle, C1648k c1648k) {
        if (this.f5103a != null) {
            c1648k.mo1531b();
            return;
        }
        if (this.f5105c == null) {
            this.f5105c = new LinkedList();
        }
        this.f5105c.add(c1648k);
        if (bundle != null) {
            if (this.f5104b == null) {
                this.f5104b = (Bundle) bundle.clone();
            } else {
                this.f5104b.putAll(bundle);
            }
        }
        mo1674a(this.f5106d);
    }

    public final View m4225a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View frameLayout = new FrameLayout(layoutInflater.getContext());
        m4224a(bundle, new C5429g(this, frameLayout, layoutInflater, viewGroup, bundle));
        if (this.f5103a == null) {
            C1771k a = C5458b.m11789a();
            Context context = frameLayout.getContext();
            int a2 = a.mo1557a(context);
            CharSequence c = az.m4442c(context, a2);
            CharSequence e = az.m4444e(context, a2);
            View linearLayout = new LinearLayout(frameLayout.getContext());
            linearLayout.setOrientation(1);
            linearLayout.setLayoutParams(new LayoutParams(-2, -2));
            frameLayout.addView(linearLayout);
            View textView = new TextView(frameLayout.getContext());
            textView.setLayoutParams(new LayoutParams(-2, -2));
            textView.setText(c);
            linearLayout.addView(textView);
            Intent a3 = C1771k.m4471a(context, a2, null);
            if (a3 != null) {
                View button = new Button(context);
                button.setId(16908313);
                button.setLayoutParams(new LayoutParams(-2, -2));
                button.setText(e);
                linearLayout.addView(button);
                button.setOnClickListener(new C1647h(context, a3));
            }
        }
        return frameLayout;
    }

    public final void m4226a() {
        m4224a(null, new C5430i(this));
    }

    public final void m4227a(int i) {
        while (!this.f5105c.isEmpty() && ((C1648k) this.f5105c.getLast()).mo1530a() >= i) {
            this.f5105c.removeLast();
        }
    }

    public final void m4228a(Activity activity, Bundle bundle, Bundle bundle2) {
        m4224a(bundle2, new C5427e(this, activity, bundle, bundle2));
    }

    public final void m4229a(Bundle bundle) {
        m4224a(bundle, new C5428f(this, bundle));
    }

    protected abstract void mo1674a(C1649n<T> c1649n);

    public final void m4231b() {
        m4224a(null, new C5431j(this));
    }
}
