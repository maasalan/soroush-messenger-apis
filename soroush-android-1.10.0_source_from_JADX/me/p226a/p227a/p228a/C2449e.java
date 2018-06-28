package me.p226a.p227a.p228a;

import android.hardware.Camera;

public final class C2449e {
    public final Camera f8141a;
    public final int f8142b;

    C2449e(Camera camera, int i) {
        if (camera == null) {
            throw new NullPointerException("Camera cannot be null");
        }
        this.f8141a = camera;
        this.f8142b = i;
    }
}
