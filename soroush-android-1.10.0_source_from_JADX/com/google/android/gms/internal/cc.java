package com.google.android.gms.internal;

final class cc extends C1825u implements aw<cd> {
    private final cd f15205a = new cd();

    public cc(C1827x c1827x) {
        super(c1827x);
    }

    public final /* synthetic */ au mo1589a() {
        return this.f15205a;
    }

    public final void mo1590a(String str, int i) {
        if ("ga_sessionTimeout".equals(str)) {
            this.f15205a.f15208c = i;
        } else {
            m5151d("int configuration name not recognized", str);
        }
    }

    public final void mo1591a(String str, String str2) {
        this.f15205a.f15212g.put(str, str2);
    }

    public final void mo1592a(String str, boolean z) {
        if ("ga_autoActivityTracking".equals(str)) {
            this.f15205a.f15209d = z;
        } else if ("ga_anonymizeIp".equals(str)) {
            this.f15205a.f15210e = z;
        } else if ("ga_reportUncaughtExceptions".equals(str)) {
            this.f15205a.f15211f = z;
        } else {
            m5151d("bool configuration name not recognized", str);
        }
    }

    public final void mo1593b(String str, String str2) {
        if ("ga_trackingId".equals(str)) {
            this.f15205a.f15206a = str2;
        } else if ("ga_sampleFrequency".equals(str)) {
            try {
                this.f15205a.f15207b = Double.parseDouble(str2);
            } catch (NumberFormatException e) {
                m5149c("Error parsing ga_sampleFrequency value", str2, e);
            }
        } else {
            m5151d("string configuration name not recognized", str);
        }
    }
}
