package com.p111d.p112a.p121c.p137l;

import java.io.Serializable;

public final class C1509b implements Serializable, Comparable<C1509b> {
    private String f4683a;
    private Class<?> f4684b;
    private int f4685c;

    public C1509b() {
        this.f4684b = null;
        this.f4683a = null;
        this.f4685c = 0;
    }

    public C1509b(Class<?> cls) {
        this.f4684b = cls;
        this.f4683a = cls.getName();
        this.f4685c = this.f4683a.hashCode();
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f4683a.compareTo(((C1509b) obj).f4683a);
    }

    public final boolean equals(Object obj) {
        return obj == this ? true : obj != null && obj.getClass() == getClass() && ((C1509b) obj).f4684b == this.f4684b;
    }

    public final int hashCode() {
        return this.f4685c;
    }

    public final String toString() {
        return this.f4683a;
    }
}
