package com.p149g.p150a.p151b;

import java.util.ArrayList;
import java.util.List;

public final class C1611d {
    boolean f5021A;
    int f5022a;
    int f5023b;
    boolean f5024c;
    int f5025d;
    long f5026e;
    long f5027f;
    int f5028g;
    int f5029h = 15;
    int f5030i;
    int f5031j = 63;
    int f5032k;
    int f5033l = 63;
    int f5034m;
    int f5035n = 31;
    int f5036o;
    int f5037p = 31;
    int f5038q;
    public int f5039r;
    int f5040s;
    int f5041t;
    boolean f5042u;
    public int f5043v;
    public List<C1610a> f5044w = new ArrayList();
    boolean f5045x;
    boolean f5046y;
    boolean f5047z;

    public static class C1610a {
        public boolean f5017a;
        public boolean f5018b;
        public int f5019c;
        public List<byte[]> f5020d;

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean equals(java.lang.Object r6) {
            /*
            r5 = this;
            r0 = 1;
            if (r5 != r6) goto L_0x0004;
        L_0x0003:
            return r0;
        L_0x0004:
            r1 = 0;
            if (r6 == 0) goto L_0x0068;
        L_0x0007:
            r2 = r5.getClass();
            r3 = r6.getClass();
            if (r2 == r3) goto L_0x0012;
        L_0x0011:
            return r1;
        L_0x0012:
            r6 = (com.p149g.p150a.p151b.C1611d.C1610a) r6;
            r2 = r5.f5017a;
            r3 = r6.f5017a;
            if (r2 == r3) goto L_0x001b;
        L_0x001a:
            return r1;
        L_0x001b:
            r2 = r5.f5019c;
            r3 = r6.f5019c;
            if (r2 == r3) goto L_0x0022;
        L_0x0021:
            return r1;
        L_0x0022:
            r2 = r5.f5018b;
            r3 = r6.f5018b;
            if (r2 == r3) goto L_0x0029;
        L_0x0028:
            return r1;
        L_0x0029:
            r2 = r5.f5020d;
            r2 = r2.listIterator();
            r6 = r6.f5020d;
            r6 = r6.listIterator();
        L_0x0035:
            r3 = r2.hasNext();
            if (r3 == 0) goto L_0x005a;
        L_0x003b:
            r3 = r6.hasNext();
            if (r3 != 0) goto L_0x0042;
        L_0x0041:
            goto L_0x005a;
        L_0x0042:
            r3 = r2.next();
            r3 = (byte[]) r3;
            r4 = r6.next();
            r4 = (byte[]) r4;
            if (r3 != 0) goto L_0x0053;
        L_0x0050:
            if (r4 == 0) goto L_0x0035;
        L_0x0052:
            return r1;
        L_0x0053:
            r3 = java.util.Arrays.equals(r3, r4);
            if (r3 != 0) goto L_0x0035;
        L_0x0059:
            return r1;
        L_0x005a:
            r2 = r2.hasNext();
            if (r2 != 0) goto L_0x0068;
        L_0x0060:
            r6 = r6.hasNext();
            if (r6 == 0) goto L_0x0067;
        L_0x0066:
            return r1;
        L_0x0067:
            return r0;
        L_0x0068:
            return r1;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.g.a.b.d.a.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            return (31 * ((((this.f5017a * 31) + this.f5018b) * 31) + this.f5019c)) + (this.f5020d != null ? this.f5020d.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("Array{nal_unit_type=");
            stringBuilder.append(this.f5019c);
            stringBuilder.append(", reserved=");
            stringBuilder.append(this.f5018b);
            stringBuilder.append(", array_completeness=");
            stringBuilder.append(this.f5017a);
            stringBuilder.append(", num_nals=");
            stringBuilder.append(this.f5020d.size());
            stringBuilder.append('}');
            return stringBuilder.toString();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C1611d c1611d = (C1611d) obj;
        if (this.f5039r != c1611d.f5039r || this.f5038q != c1611d.f5038q || this.f5036o != c1611d.f5036o || this.f5034m != c1611d.f5034m || this.f5022a != c1611d.f5022a || this.f5040s != c1611d.f5040s || this.f5027f != c1611d.f5027f || this.f5028g != c1611d.f5028g || this.f5026e != c1611d.f5026e || this.f5025d != c1611d.f5025d || this.f5023b != c1611d.f5023b || this.f5024c != c1611d.f5024c || this.f5043v != c1611d.f5043v || this.f5030i != c1611d.f5030i || this.f5041t != c1611d.f5041t || this.f5032k != c1611d.f5032k || this.f5029h != c1611d.f5029h || this.f5031j != c1611d.f5031j || this.f5033l != c1611d.f5033l || this.f5035n != c1611d.f5035n || this.f5037p != c1611d.f5037p || this.f5042u != c1611d.f5042u) {
            return false;
        }
        if (this.f5044w != null) {
            if (!this.f5044w.equals(c1611d.f5044w)) {
                return false;
            }
        } else if (c1611d.f5044w != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (31 * ((((((((((((((((((((((((((((((((((((((((((this.f5022a * 31) + this.f5023b) * 31) + this.f5024c) * 31) + this.f5025d) * 31) + ((int) (this.f5026e ^ (this.f5026e >>> 32)))) * 31) + ((int) (this.f5027f ^ (this.f5027f >>> 32)))) * 31) + this.f5028g) * 31) + this.f5029h) * 31) + this.f5030i) * 31) + this.f5031j) * 31) + this.f5032k) * 31) + this.f5033l) * 31) + this.f5034m) * 31) + this.f5035n) * 31) + this.f5036o) * 31) + this.f5037p) * 31) + this.f5038q) * 31) + this.f5039r) * 31) + this.f5040s) * 31) + this.f5041t) * 31) + this.f5042u) * 31) + this.f5043v)) + (this.f5044w != null ? this.f5044w.hashCode() : 0);
    }

    public final String toString() {
        String stringBuilder;
        StringBuilder stringBuilder2 = new StringBuilder("HEVCDecoderConfigurationRecord{configurationVersion=");
        stringBuilder2.append(this.f5022a);
        stringBuilder2.append(", general_profile_space=");
        stringBuilder2.append(this.f5023b);
        stringBuilder2.append(", general_tier_flag=");
        stringBuilder2.append(this.f5024c);
        stringBuilder2.append(", general_profile_idc=");
        stringBuilder2.append(this.f5025d);
        stringBuilder2.append(", general_profile_compatibility_flags=");
        stringBuilder2.append(this.f5026e);
        stringBuilder2.append(", general_constraint_indicator_flags=");
        stringBuilder2.append(this.f5027f);
        stringBuilder2.append(", general_level_idc=");
        stringBuilder2.append(this.f5028g);
        if (this.f5029h != 15) {
            StringBuilder stringBuilder3 = new StringBuilder(", reserved1=");
            stringBuilder3.append(this.f5029h);
            stringBuilder = stringBuilder3.toString();
        } else {
            stringBuilder = "";
        }
        stringBuilder2.append(stringBuilder);
        stringBuilder2.append(", min_spatial_segmentation_idc=");
        stringBuilder2.append(this.f5030i);
        if (this.f5031j != 63) {
            stringBuilder3 = new StringBuilder(", reserved2=");
            stringBuilder3.append(this.f5031j);
            stringBuilder = stringBuilder3.toString();
        } else {
            stringBuilder = "";
        }
        stringBuilder2.append(stringBuilder);
        stringBuilder2.append(", parallelismType=");
        stringBuilder2.append(this.f5032k);
        if (this.f5033l != 63) {
            stringBuilder3 = new StringBuilder(", reserved3=");
            stringBuilder3.append(this.f5033l);
            stringBuilder = stringBuilder3.toString();
        } else {
            stringBuilder = "";
        }
        stringBuilder2.append(stringBuilder);
        stringBuilder2.append(", chromaFormat=");
        stringBuilder2.append(this.f5034m);
        if (this.f5035n != 31) {
            stringBuilder3 = new StringBuilder(", reserved4=");
            stringBuilder3.append(this.f5035n);
            stringBuilder = stringBuilder3.toString();
        } else {
            stringBuilder = "";
        }
        stringBuilder2.append(stringBuilder);
        stringBuilder2.append(", bitDepthLumaMinus8=");
        stringBuilder2.append(this.f5036o);
        if (this.f5037p != 31) {
            stringBuilder3 = new StringBuilder(", reserved5=");
            stringBuilder3.append(this.f5037p);
            stringBuilder = stringBuilder3.toString();
        } else {
            stringBuilder = "";
        }
        stringBuilder2.append(stringBuilder);
        stringBuilder2.append(", bitDepthChromaMinus8=");
        stringBuilder2.append(this.f5038q);
        stringBuilder2.append(", avgFrameRate=");
        stringBuilder2.append(this.f5039r);
        stringBuilder2.append(", constantFrameRate=");
        stringBuilder2.append(this.f5040s);
        stringBuilder2.append(", numTemporalLayers=");
        stringBuilder2.append(this.f5041t);
        stringBuilder2.append(", temporalIdNested=");
        stringBuilder2.append(this.f5042u);
        stringBuilder2.append(", lengthSizeMinusOne=");
        stringBuilder2.append(this.f5043v);
        stringBuilder2.append(", arrays=");
        stringBuilder2.append(this.f5044w);
        stringBuilder2.append('}');
        return stringBuilder2.toString();
    }
}
