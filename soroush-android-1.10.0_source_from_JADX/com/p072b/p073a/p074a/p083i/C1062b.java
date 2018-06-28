package com.p072b.p073a.p074a.p083i;

public final class C1062b {
    public String f3444a;
    public long f3445b;
    public int f3446c;
    public Long f3447d;
    private Object f3448e;

    public C1062b(String str) {
        this.f3444a = str;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("SchedulerConstraint{uuid='");
        stringBuilder.append(this.f3444a);
        stringBuilder.append('\'');
        stringBuilder.append(", delayInMs=");
        stringBuilder.append(this.f3445b);
        stringBuilder.append(", networkStatus=");
        stringBuilder.append(this.f3446c);
        stringBuilder.append(", overrideDeadlineInMs=");
        stringBuilder.append(this.f3447d);
        stringBuilder.append(", data=");
        stringBuilder.append(this.f3448e);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
