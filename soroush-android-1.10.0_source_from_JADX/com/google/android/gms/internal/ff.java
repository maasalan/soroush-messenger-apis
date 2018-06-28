package com.google.android.gms.internal;

import com.google.android.gms.common.internal.ac;

final class ff {
    final String f5734a;
    final String f5735b;
    final long f5736c;
    final long f5737d;
    final long f5738e;
    final long f5739f;
    final Long f5740g;
    final Long f5741h;
    final Boolean f5742i;

    ff(String str, String str2, long j, long j2, long j3, long j4, Long l, Long l2, Boolean bool) {
        ff ffVar = this;
        long j5 = j;
        long j6 = j2;
        long j7 = j4;
        ac.m4378a(str);
        ac.m4378a(str2);
        boolean z = false;
        ac.m4385b(j5 >= 0);
        ac.m4385b(j6 >= 0);
        if (j7 >= 0) {
            z = true;
        }
        ac.m4385b(z);
        ffVar.f5734a = str;
        ffVar.f5735b = str2;
        ffVar.f5736c = j5;
        ffVar.f5737d = j6;
        ffVar.f5738e = j3;
        ffVar.f5739f = j7;
        ffVar.f5740g = l;
        ffVar.f5741h = l2;
        ffVar.f5742i = bool;
    }

    final ff m4821a() {
        String str = this.f5734a;
        String str2 = this.f5735b;
        long j = this.f5736c + 1;
        long j2 = this.f5737d + 1;
        long j3 = this.f5738e;
        long j4 = this.f5739f;
        return new ff(str, str2, j, j2, j3, j4, this.f5740g, this.f5741h, this.f5742i);
    }

    final ff m4822a(long j) {
        return new ff(this.f5734a, this.f5735b, this.f5736c, this.f5737d, j, this.f5739f, this.f5740g, this.f5741h, this.f5742i);
    }

    final ff m4823a(Long l, Long l2, Boolean bool) {
        ff ffVar = this;
        Boolean bool2 = (bool == null || bool.booleanValue()) ? bool : null;
        return new ff(ffVar.f5734a, ffVar.f5735b, ffVar.f5736c, ffVar.f5737d, ffVar.f5738e, ffVar.f5739f, l, l2, bool2);
    }

    final ff m4824b(long j) {
        return new ff(this.f5734a, this.f5735b, this.f5736c, this.f5737d, this.f5738e, j, this.f5740g, this.f5741h, this.f5742i);
    }
}
