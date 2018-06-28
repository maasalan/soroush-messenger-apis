package android.databinding.p020a.p021a;

import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

public final class C0124a implements OnCheckedChangeListener {
    final C0123a f404a;
    final int f405b = 2;

    public interface C0123a {
        void mo3445a(boolean z);
    }

    public C0124a(C0123a c0123a) {
        this.f404a = c0123a;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.f404a.mo3445a(z);
    }
}
