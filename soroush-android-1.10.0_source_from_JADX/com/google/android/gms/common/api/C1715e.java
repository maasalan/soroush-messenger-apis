package com.google.android.gms.common.api;

import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

public abstract class C1715e {
    private static final Set<C1715e> f5230a = Collections.newSetFromMap(new WeakHashMap());

    public interface C1713a {
        void mo3012a();

        void mo3014b();
    }

    public interface C1714b {
        void mo3013a(ConnectionResult connectionResult);
    }

    public Looper mo3015a() {
        throw new UnsupportedOperationException();
    }
}
