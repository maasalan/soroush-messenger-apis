package com.googlecode.mp4parser.boxes.apple;

import com.coremedia.iso.IsoTypeReaderVariable;
import com.coremedia.iso.IsoTypeWriterVariable;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import org.p487a.p488a.C4596a.C7000a;
import org.p487a.p490b.p491a.C4599a;
import org.p487a.p490b.p492b.C4600b;

public abstract class AppleVariableSignedIntegerBox extends AppleDataBox {
    private static final C7000a ajc$tjp_0 = null;
    private static final C7000a ajc$tjp_1 = null;
    private static final C7000a ajc$tjp_2 = null;
    private static final C7000a ajc$tjp_3 = null;
    int intLength = 1;
    long value;

    static {
        ajc$preClinit();
    }

    protected AppleVariableSignedIntegerBox(String str) {
        super(str, 15);
    }

    private static void ajc$preClinit() {
        C4600b c4600b = new C4600b("AppleVariableSignedIntegerBox.java", AppleVariableSignedIntegerBox.class);
        ajc$tjp_0 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getIntLength", "com.googlecode.mp4parser.boxes.apple.AppleVariableSignedIntegerBox", "", "", "", "int"), 19);
        ajc$tjp_1 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setIntLength", "com.googlecode.mp4parser.boxes.apple.AppleVariableSignedIntegerBox", "int", "intLength", "", "void"), 23);
        ajc$tjp_2 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getValue", "com.googlecode.mp4parser.boxes.apple.AppleVariableSignedIntegerBox", "", "", "", "long"), 27);
        ajc$tjp_3 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setValue", "com.googlecode.mp4parser.boxes.apple.AppleVariableSignedIntegerBox", "long", "value", "", "void"), 36);
    }

    protected int getDataLength() {
        return this.intLength;
    }

    public int getIntLength() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_0, (Object) this, (Object) this));
        return this.intLength;
    }

    public long getValue() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_2, (Object) this, (Object) this));
        if (!isParsed()) {
            parseDetails();
        }
        return this.value;
    }

    protected void parseData(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        this.value = IsoTypeReaderVariable.read(byteBuffer, remaining);
        this.intLength = remaining;
    }

    public void setIntLength(int i) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_1, (Object) this, (Object) this, C4599a.m8314a(i)));
        this.intLength = i;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setValue(long r4) {
        /*
        r3 = this;
        r0 = ajc$tjp_3;
        r1 = org.p487a.p490b.p491a.C4599a.m8315a(r4);
        r0 = org.p487a.p490b.p492b.C4600b.m8321a(r0, r3, r3, r1);
        r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf();
        r1.before(r0);
        r0 = 127; // 0x7f float:1.78E-43 double:6.27E-322;
        r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1));
        if (r2 > 0) goto L_0x0021;
    L_0x0017:
        r0 = -128; // 0xffffffffffffff80 float:NaN double:NaN;
        r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1));
        if (r2 <= 0) goto L_0x0021;
    L_0x001d:
        r0 = 1;
    L_0x001e:
        r3.intLength = r0;
        goto L_0x004b;
    L_0x0021:
        r0 = 32767; // 0x7fff float:4.5916E-41 double:1.6189E-319;
        r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1));
        if (r2 > 0) goto L_0x0035;
    L_0x0027:
        r0 = -32768; // 0xffffffffffff8000 float:NaN double:NaN;
        r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1));
        if (r2 <= 0) goto L_0x0035;
    L_0x002d:
        r0 = r3.intLength;
        r1 = 2;
        if (r0 >= r1) goto L_0x0035;
    L_0x0032:
        r3.intLength = r1;
        goto L_0x004b;
    L_0x0035:
        r0 = 8388607; // 0x7fffff float:1.1754942E-38 double:4.1445225E-317;
        r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1));
        if (r2 > 0) goto L_0x0049;
    L_0x003c:
        r0 = -8388608; // 0xffffffffff800000 float:-Infinity double:NaN;
        r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1));
        if (r2 <= 0) goto L_0x0049;
    L_0x0043:
        r0 = r3.intLength;
        r1 = 3;
        if (r0 >= r1) goto L_0x0049;
    L_0x0048:
        goto L_0x0032;
    L_0x0049:
        r0 = 4;
        goto L_0x001e;
    L_0x004b:
        r3.value = r4;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.googlecode.mp4parser.boxes.apple.AppleVariableSignedIntegerBox.setValue(long):void");
    }

    protected byte[] writeData() {
        int dataLength = getDataLength();
        ByteBuffer wrap = ByteBuffer.wrap(new byte[dataLength]);
        IsoTypeWriterVariable.write(this.value, wrap, dataLength);
        return wrap.array();
    }
}
