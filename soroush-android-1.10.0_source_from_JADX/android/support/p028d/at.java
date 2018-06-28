package android.support.p028d;

import android.os.IBinder;

final class at implements av {
    private final IBinder f12954a;

    at(IBinder iBinder) {
        this.f12954a = iBinder;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof at) && ((at) obj).f12954a.equals(this.f12954a);
    }

    public final int hashCode() {
        return this.f12954a.hashCode();
    }
}
