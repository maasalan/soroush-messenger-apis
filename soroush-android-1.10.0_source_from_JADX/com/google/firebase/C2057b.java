package com.google.firebase;

import com.google.android.gms.common.internal.aa;
import com.google.android.gms.common.internal.ac;
import com.google.android.gms.common.util.C1795o;
import java.util.Arrays;

public final class C2057b {
    public final String f6911a;
    public final String f6912b;
    public final String f6913c;
    private final String f6914d;
    private final String f6915e;
    private final String f6916f;
    private final String f6917g;

    C2057b(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        ac.m4382a(C1795o.m4538a(str) ^ 1, (Object) "ApplicationId must be set.");
        this.f6912b = str;
        this.f6911a = str2;
        this.f6914d = str3;
        this.f6915e = str4;
        this.f6913c = str5;
        this.f6916f = str6;
        this.f6917g = str7;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2057b)) {
            return false;
        }
        C2057b c2057b = (C2057b) obj;
        return aa.m4374a(this.f6912b, c2057b.f6912b) && aa.m4374a(this.f6911a, c2057b.f6911a) && aa.m4374a(this.f6914d, c2057b.f6914d) && aa.m4374a(this.f6915e, c2057b.f6915e) && aa.m4374a(this.f6913c, c2057b.f6913c) && aa.m4374a(this.f6916f, c2057b.f6916f) && aa.m4374a(this.f6917g, c2057b.f6917g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6912b, this.f6911a, this.f6914d, this.f6915e, this.f6913c, this.f6916f, this.f6917g});
    }

    public final String toString() {
        return aa.m4373a(this).m4375a("applicationId", this.f6912b).m4375a("apiKey", this.f6911a).m4375a("databaseUrl", this.f6914d).m4375a("gcmSenderId", this.f6913c).m4375a("storageBucket", this.f6916f).m4375a("projectId", this.f6917g).toString();
    }
}
