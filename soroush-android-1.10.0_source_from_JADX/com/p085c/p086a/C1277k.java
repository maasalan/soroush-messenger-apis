package com.p085c.p086a;

import com.p085c.p086a.p105g.p107b.C1243c;
import com.p085c.p086a.p105g.p107b.C5268a;

public abstract class C1277k<CHILD extends C1277k<CHILD, TranscodeType>, TranscodeType> implements Cloneable {
    C1243c<? super TranscodeType> f4001a = C5268a.m10899a();

    protected final CHILD m3040a() {
        try {
            return (C1277k) super.clone();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    protected /* synthetic */ Object clone() {
        return m3040a();
    }
}
