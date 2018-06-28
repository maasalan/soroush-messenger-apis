package com.p111d.p112a.p114b;

import org.jivesoftware.smack.util.StringUtils;

public enum C1359d {
    UTF8(StringUtils.UTF8, false, 8),
    UTF16_BE("UTF-16BE", true, 16),
    UTF16_LE("UTF-16LE", false, 16),
    UTF32_BE("UTF-32BE", true, 32),
    UTF32_LE("UTF-32LE", false, 32);
    
    protected final String f4258f;
    protected final boolean f4259g;
    protected final int f4260h;

    private C1359d(String str, boolean z, int i) {
        this.f4258f = str;
        this.f4259g = z;
        this.f4260h = i;
    }

    public final String m3270a() {
        return this.f4258f;
    }

    public final boolean m3271b() {
        return this.f4259g;
    }

    public final int m3272c() {
        return this.f4260h;
    }
}
