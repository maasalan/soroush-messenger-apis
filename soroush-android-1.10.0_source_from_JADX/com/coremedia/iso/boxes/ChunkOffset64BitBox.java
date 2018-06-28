package com.coremedia.iso.boxes;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.googlecode.mp4parser.util.CastUtils;
import java.nio.ByteBuffer;
import org.p487a.p488a.C4596a.C7000a;
import org.p487a.p490b.p492b.C4600b;

public class ChunkOffset64BitBox extends ChunkOffsetBox {
    public static final String TYPE = "co64";
    private static final C7000a ajc$tjp_0 = null;
    private static final C7000a ajc$tjp_1 = null;
    private long[] chunkOffsets;

    static {
        ajc$preClinit();
    }

    public ChunkOffset64BitBox() {
        super(TYPE);
    }

    private static void ajc$preClinit() {
        C4600b c4600b = new C4600b("ChunkOffset64BitBox.java", ChunkOffset64BitBox.class);
        ajc$tjp_0 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getChunkOffsets", "com.coremedia.iso.boxes.ChunkOffset64BitBox", "", "", "", "[J"), 23);
        ajc$tjp_1 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setChunkOffsets", "com.coremedia.iso.boxes.ChunkOffset64BitBox", "[J", "chunkOffsets", "", "void"), 28);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        int l2i = CastUtils.l2i(IsoTypeReader.readUInt32(byteBuffer));
        this.chunkOffsets = new long[l2i];
        for (int i = 0; i < l2i; i++) {
            this.chunkOffsets[i] = IsoTypeReader.readUInt64(byteBuffer);
        }
    }

    public long[] getChunkOffsets() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_0, (Object) this, (Object) this));
        return this.chunkOffsets;
    }

    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        IsoTypeWriter.writeUInt32(byteBuffer, (long) this.chunkOffsets.length);
        for (long writeUInt64 : this.chunkOffsets) {
            IsoTypeWriter.writeUInt64(byteBuffer, writeUInt64);
        }
    }

    protected long getContentSize() {
        return (long) (8 + (this.chunkOffsets.length * 8));
    }

    public void setChunkOffsets(long[] jArr) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_1, (Object) this, (Object) this, (Object) jArr));
        this.chunkOffsets = jArr;
    }
}
