package com.p111d.p112a.p114b;

public abstract class C1379l {
    protected int f4373a;
    protected int f4374b;

    protected C1379l() {
    }

    public abstract C1379l mo1278a();

    public void mo1279a(Object obj) {
    }

    public final boolean m3357b() {
        return this.f4373a == 1;
    }

    public final boolean m3358c() {
        return this.f4373a == 0;
    }

    public final boolean m3359d() {
        return this.f4373a == 2;
    }

    public final String m3360e() {
        switch (this.f4373a) {
            case 0:
                return "ROOT";
            case 1:
                return "ARRAY";
            case 2:
                return "OBJECT";
            default:
                return "?";
        }
    }

    public final int m3361f() {
        return this.f4374b + 1;
    }

    public final int m3362g() {
        return this.f4374b < 0 ? 0 : this.f4374b;
    }

    public Object mo1280h() {
        return null;
    }
}
