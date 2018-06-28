package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.TimeZone;
import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;

public final class ci {
    int f5640a;
    String f5641b;
    String f5642c;
    String f5643d;
    boolean f5644e;
    final op f5645f;
    boolean f5646g;
    /* synthetic */ cg f5647h;
    private int f5648i;
    private final ck f5649j;
    private ArrayList<Integer> f5650k;
    private ArrayList<String> f5651l;
    private ArrayList<Integer> f5652m;
    private ArrayList<zzcsv> f5653n;
    private ArrayList<byte[]> f5654o;

    private ci(cg cgVar, byte[] bArr) {
        this(cgVar, bArr, (byte) 0);
    }

    private ci(cg cgVar, byte[] bArr, byte b) {
        this.f5647h = cgVar;
        this.f5640a = this.f5647h.f5631j;
        this.f5641b = this.f5647h.f5630i;
        this.f5642c = null;
        this.f5643d = null;
        this.f5648i = 0;
        this.f5650k = null;
        this.f5651l = null;
        this.f5652m = null;
        this.f5653n = null;
        this.f5654o = null;
        this.f5644e = true;
        this.f5645f = new op();
        this.f5646g = false;
        this.f5642c = null;
        this.f5643d = null;
        this.f5645f.f18409a = cgVar.f5637p.mo1575a();
        this.f5645f.f18410b = cgVar.f5637p.mo1576b();
        op opVar = this.f5645f;
        cgVar.f5638q;
        opVar.f18412d = (long) (TimeZone.getDefault().getOffset(this.f5645f.f18409a) / IjkMediaCodecInfo.RANK_MAX);
        if (bArr != null) {
            this.f5645f.f18411c = bArr;
        }
        this.f5649j = null;
    }
}
