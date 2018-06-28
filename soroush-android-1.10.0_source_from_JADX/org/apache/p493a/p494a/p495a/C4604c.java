package org.apache.p493a.p494a.p495a;

import java.util.ArrayList;
import java.util.List;

public final class C4604c {
    public final C4603b f12635a;
    public Long f12636b;
    private List<String> f12637c;
    private Long f12638d;
    private final long f12639e;
    private boolean f12640f;

    public C4604c(C4603b c4603b, long j) {
        this(c4603b, j, (byte) 0);
    }

    private C4604c(C4603b c4603b, long j, byte b) {
        C4604c c4604c = this;
        C4603b c4603b2 = c4603b;
        if (c4603b2 == null) {
            throw new IllegalArgumentException("message cannot be null");
        }
        c4604c.f12639e = j;
        c4604c.f12635a = c4603b2;
        c4604c.f12637c = null;
        if (!c4604c.f12640f) {
            c4604c.f12640f = true;
            if (c4604c.f12637c == null) {
                c4604c.f12637c = new ArrayList();
            }
            C4605d c = c4604c.f12635a.mo2447c();
            long a = C4605d.m8339a(c.f12641a);
            C4605d d = c4604c.f12635a.mo2448d();
            long a2 = C4605d.m8339a(d.f12641a);
            C4605d b2 = c4604c.f12635a.mo2446b();
            long a3 = C4605d.m8339a(b2.f12641a);
            long j2 = 0;
            if (c.f12641a != 0) {
                if (d.f12641a != 0) {
                    if (b2.f12641a != 0) {
                        List list;
                        Object obj;
                        long j3 = c4604c.f12639e - a;
                        if (a3 < a2) {
                            list = c4604c.f12637c;
                            obj = "Error: xmitTime < rcvTime";
                        } else {
                            long j4 = a3 - a2;
                            if (j4 <= j3) {
                                j2 = j3 - j4;
                            } else if (j4 - j3 == 1) {
                                if (j3 != 0) {
                                    c4604c.f12637c.add("Info: processing time > total network time by 1 ms -> assume zero delay");
                                }
                                j2 = j3;
                            } else {
                                list = c4604c.f12637c;
                                obj = "Warning: processing time > total network time";
                            }
                            c4604c.f12636b = Long.valueOf(j2);
                            if (a > c4604c.f12639e) {
                                c4604c.f12637c.add("Error: OrigTime > DestRcvTime");
                            }
                            c4604c.f12638d = Long.valueOf(((a2 - a) + (a3 - c4604c.f12639e)) / 2);
                            return;
                        }
                        list.add(obj);
                        j2 = j3;
                        c4604c.f12636b = Long.valueOf(j2);
                        if (a > c4604c.f12639e) {
                            c4604c.f12637c.add("Error: OrigTime > DestRcvTime");
                        }
                        c4604c.f12638d = Long.valueOf(((a2 - a) + (a3 - c4604c.f12639e)) / 2);
                        return;
                    }
                }
                c4604c.f12637c.add("Warning: zero rcvNtpTime or xmitNtpTime");
                if (a > c4604c.f12639e) {
                    c4604c.f12637c.add("Error: OrigTime > DestRcvTime");
                } else {
                    c4604c.f12636b = Long.valueOf(c4604c.f12639e - a);
                }
                if (d.f12641a != 0) {
                    c4604c.f12638d = Long.valueOf(a2 - a);
                } else if (b2.f12641a != 0) {
                    c4604c.f12638d = Long.valueOf(a3 - c4604c.f12639e);
                }
            } else if (b2.f12641a != 0) {
                c4604c.f12638d = Long.valueOf(a3 - c4604c.f12639e);
                c4604c.f12637c.add("Error: zero orig time -- cannot compute delay");
            } else {
                c4604c.f12637c.add("Error: zero orig time -- cannot compute delay/offset");
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C4604c c4604c = (C4604c) obj;
        return this.f12639e == c4604c.f12639e && this.f12635a.equals(c4604c.f12635a);
    }

    public final int hashCode() {
        return (31 * ((int) this.f12639e)) + this.f12635a.hashCode();
    }
}
