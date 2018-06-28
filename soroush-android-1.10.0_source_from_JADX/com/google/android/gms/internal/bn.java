package com.google.android.gms.internal;

import com.google.android.gms.common.util.C1785d;

public final class bn {
    private final long f5594a;
    private final int f5595b;
    private double f5596c;
    private long f5597d;
    private final Object f5598e;
    private final String f5599f;
    private final C1785d f5600g;

    private bn(String str, C1785d c1785d) {
        this.f5598e = new Object();
        this.f5595b = 60;
        this.f5596c = (double) this.f5595b;
        this.f5594a = 2000;
        this.f5599f = str;
        this.f5600g = c1785d;
    }

    public bn(String str, C1785d c1785d, byte b) {
        this(str, c1785d);
    }

    public final boolean m4617a() {
        synchronized (this.f5598e) {
            long a = this.f5600g.mo1575a();
            if (this.f5596c < ((double) this.f5595b)) {
                double d = ((double) (a - this.f5597d)) / ((double) this.f5594a);
                if (d > 0.0d) {
                    this.f5596c = Math.min((double) this.f5595b, this.f5596c + d);
                }
            }
            this.f5597d = a;
            if (this.f5596c >= 1.0d) {
                this.f5596c -= 1.0d;
                return true;
            }
            String str = this.f5599f;
            StringBuilder stringBuilder = new StringBuilder(34 + String.valueOf(str).length());
            stringBuilder.append("Excessive ");
            stringBuilder.append(str);
            stringBuilder.append(" detected; call ignored.");
            bo.m4621b(stringBuilder.toString());
            return false;
        }
    }
}
