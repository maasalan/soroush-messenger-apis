package com.google.firebase.iid;

import android.os.Bundle;

public final class C5634w extends C2087x<Void> {
    public C5634w(int i, Bundle bundle) {
        super(i, 2, bundle);
    }

    final void mo1779a(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            m5691a(null);
        } else {
            m5690a(new C2088y(4, "Invalid response to one way request"));
        }
    }

    final boolean mo1780a() {
        return true;
    }
}
