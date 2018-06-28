package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import org.p487a.p488a.C4596a.C7000a;
import org.p487a.p490b.p492b.C4600b;

public abstract class ChunkOffsetBox extends AbstractFullBox {
    private static final C7000a ajc$tjp_0 = null;

    static {
        ajc$preClinit();
    }

    public ChunkOffsetBox(String str) {
        super(str);
    }

    private static void ajc$preClinit() {
        C4600b c4600b = new C4600b("ChunkOffsetBox.java", ChunkOffsetBox.class);
        ajc$tjp_0 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "toString", "com.coremedia.iso.boxes.ChunkOffsetBox", "", "", "", "java.lang.String"), 18);
    }

    public abstract long[] getChunkOffsets();

    public abstract void setChunkOffsets(long[] jArr);

    public String toString() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_0, (Object) this, (Object) this));
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(getClass().getSimpleName()));
        stringBuilder.append("[entryCount=");
        stringBuilder.append(getChunkOffsets().length);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
