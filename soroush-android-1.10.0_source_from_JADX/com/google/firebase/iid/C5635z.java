package com.google.firebase.iid;

import android.os.Bundle;

final class C5635z extends C2087x<Bundle> {
    C5635z(int i, Bundle bundle) {
        super(i, 1, bundle);
    }

    final void mo1779a(Bundle bundle) {
        Object bundle2 = bundle.getBundle("data");
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        m5691a(bundle2);
    }

    final boolean mo1780a() {
        return false;
    }
}
