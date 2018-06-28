package android.databinding.p020a.p021a;

import android.view.View;
import android.view.View.OnClickListener;

public final class C0126b implements OnClickListener {
    final C0125a f406a;
    final int f407b;

    public interface C0125a {
        void mo3444a(int i);
    }

    public C0126b(C0125a c0125a, int i) {
        this.f406a = c0125a;
        this.f407b = i;
    }

    public final void onClick(View view) {
        this.f406a.mo3444a(this.f407b);
    }
}
