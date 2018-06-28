package com.p111d.p112a.p114b.p117d;

import com.p111d.p112a.p114b.C1382p;
import com.p111d.p112a.p114b.C1385s;
import com.p111d.p112a.p114b.C5301g;
import com.p111d.p112a.p114b.C5301g.C1368a;
import com.p111d.p112a.p114b.C5304n;
import com.p111d.p112a.p114b.p116c.C1345a;
import com.p111d.p112a.p114b.p116c.C1346b;
import com.p111d.p112a.p114b.p116c.C1347c;
import com.p111d.p112a.p114b.p120g.C1374j;
import com.p111d.p112a.p114b.p120g.C5300d;
import com.p111d.p112a.p114b.p539a.C6464a;

public abstract class C7042c extends C6464a {
    protected static final int[] f20115a = C1345a.m3185f();
    protected final C1347c f20116b;
    protected int[] f20117c = f20115a;
    protected int f20118d;
    protected C1346b f20119e;
    protected C1382p f20120f = C5300d.f14700a;

    public C7042c(C1347c c1347c, int i, C5304n c5304n) {
        super(i, c5304n);
        this.f20116b = c1347c;
        if (isEnabled(C1368a.ESCAPE_NON_ASCII)) {
            this.f20118d = 127;
        }
    }

    public C1346b getCharacterEscapes() {
        return this.f20119e;
    }

    public int getHighestEscapedChar() {
        return this.f20118d;
    }

    public com.p111d.p112a.p114b.C5301g setCharacterEscapes(com.p111d.p112a.p114b.p116c.C1346b r1) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:6:0x000e in {2, 4, 5} preds:[]
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:129)
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:48)
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:38)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r0 = this;
        r0.f20119e = r1;
        if (r1 != 0) goto L_0x0009;
    L_0x0004:
        r1 = f20115a;
    L_0x0006:
        r0.f20117c = r1;
        return r0;
    L_0x0009:
        r1 = r1.m3188a();
        goto L_0x0006;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.d.a.b.d.c.setCharacterEscapes(com.d.a.b.c.b):com.d.a.b.g");
    }

    public C5301g setHighestNonEscapedChar(int i) {
        if (i < 0) {
            i = 0;
        }
        this.f20118d = i;
        return this;
    }

    public C5301g setRootValueSeparator(C1382p c1382p) {
        this.f20120f = c1382p;
        return this;
    }

    public C1385s version() {
        return C1374j.m3346a(getClass());
    }

    public final void writeStringField(String str, String str2) {
        writeFieldName(str);
        writeString(str2);
    }
}
