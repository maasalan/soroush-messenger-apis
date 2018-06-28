package com.google.firebase.iid;

import android.os.Bundle;
import android.os.ConditionVariable;

final class ac implements ad {
    final ConditionVariable f15495a;
    Bundle f15496b;
    String f15497c;

    private ac() {
        this.f15495a = new ConditionVariable();
    }

    public final void mo1777a(Bundle bundle) {
        this.f15496b = bundle;
        this.f15495a.open();
    }

    public final void mo1778a(String str) {
        this.f15497c = str;
        this.f15495a.open();
    }
}
