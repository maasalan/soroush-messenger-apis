package com.googlecode.mp4parser.boxes;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.googlecode.mp4parser.annotations.DoNotParseDetail;
import com.p149g.p152b.p153a.C1613a;
import com.p149g.p152b.p153a.C1613a.C1612j;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.p487a.p488a.C4596a.C7000a;
import org.p487a.p490b.p492b.C4600b;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

public abstract class AbstractSampleEncryptionBox extends AbstractFullBox {
    private static final C7000a ajc$tjp_0 = null;
    private static final C7000a ajc$tjp_1 = null;
    private static final C7000a ajc$tjp_2 = null;
    private static final C7000a ajc$tjp_3 = null;
    private static final C7000a ajc$tjp_4 = null;
    private static final C7000a ajc$tjp_5 = null;
    protected int algorithmId = -1;
    List<C1613a> entries = Collections.emptyList();
    protected int ivSize = -1;
    protected byte[] kid = new byte[]{(byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1};

    static {
        ajc$preClinit();
    }

    protected AbstractSampleEncryptionBox(String str) {
        super(str);
    }

    private static void ajc$preClinit() {
        C4600b c4600b = new C4600b("AbstractSampleEncryptionBox.java", AbstractSampleEncryptionBox.class);
        ajc$tjp_0 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getOffsetToFirstIV", "com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox", "", "", "", "int"), 29);
        ajc$tjp_1 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getEntries", "com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox", "", "", "", "java.util.List"), 89);
        ajc$tjp_2 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setEntries", "com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox", "java.util.List", "entries", "", "void"), 93);
        ajc$tjp_3 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "equals", "com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox", "java.lang.Object", "o", "", "boolean"), 162);
        ajc$tjp_4 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "hashCode", "com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox", "", "", "", "int"), 189);
        ajc$tjp_5 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getEntrySizes", "com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox", "", "", "", "java.util.List"), 197);
    }

    private java.util.List<com.p149g.p152b.p153a.C1613a> parseEntries(java.nio.ByteBuffer r8, long r9, int r11) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r7 = this;
        r0 = new java.util.ArrayList;
        r0.<init>();
    L_0x0005:
        r1 = 1;
        r3 = r9 - r1;
        r1 = 0;
        r5 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1));
        if (r5 > 0) goto L_0x0010;
    L_0x000f:
        return r0;
    L_0x0010:
        r9 = new com.g.b.a.a;	 Catch:{ BufferUnderflowException -> 0x004d }
        r9.<init>();	 Catch:{ BufferUnderflowException -> 0x004d }
        r10 = new byte[r11];	 Catch:{ BufferUnderflowException -> 0x004d }
        r9.f5048a = r10;	 Catch:{ BufferUnderflowException -> 0x004d }
        r10 = r9.f5048a;	 Catch:{ BufferUnderflowException -> 0x004d }
        r8.get(r10);	 Catch:{ BufferUnderflowException -> 0x004d }
        r10 = r7.getFlags();	 Catch:{ BufferUnderflowException -> 0x004d }
        r10 = r10 & 2;	 Catch:{ BufferUnderflowException -> 0x004d }
        if (r10 <= 0) goto L_0x0048;	 Catch:{ BufferUnderflowException -> 0x004d }
    L_0x0026:
        r10 = com.coremedia.iso.IsoTypeReader.readUInt16(r8);	 Catch:{ BufferUnderflowException -> 0x004d }
        r10 = new com.p149g.p152b.p153a.C1613a.C1612j[r10];	 Catch:{ BufferUnderflowException -> 0x004d }
        r9.f5049b = r10;	 Catch:{ BufferUnderflowException -> 0x004d }
        r10 = 0;	 Catch:{ BufferUnderflowException -> 0x004d }
    L_0x002f:
        r1 = r9.f5049b;	 Catch:{ BufferUnderflowException -> 0x004d }
        r1 = r1.length;	 Catch:{ BufferUnderflowException -> 0x004d }
        if (r10 < r1) goto L_0x0035;	 Catch:{ BufferUnderflowException -> 0x004d }
    L_0x0034:
        goto L_0x0048;	 Catch:{ BufferUnderflowException -> 0x004d }
    L_0x0035:
        r1 = r9.f5049b;	 Catch:{ BufferUnderflowException -> 0x004d }
        r2 = com.coremedia.iso.IsoTypeReader.readUInt16(r8);	 Catch:{ BufferUnderflowException -> 0x004d }
        r5 = com.coremedia.iso.IsoTypeReader.readUInt32(r8);	 Catch:{ BufferUnderflowException -> 0x004d }
        r2 = r9.m4153a(r2, r5);	 Catch:{ BufferUnderflowException -> 0x004d }
        r1[r10] = r2;	 Catch:{ BufferUnderflowException -> 0x004d }
        r10 = r10 + 1;	 Catch:{ BufferUnderflowException -> 0x004d }
        goto L_0x002f;	 Catch:{ BufferUnderflowException -> 0x004d }
    L_0x0048:
        r0.add(r9);	 Catch:{ BufferUnderflowException -> 0x004d }
        r9 = r3;
        goto L_0x0005;
    L_0x004d:
        r8 = 0;
        return r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox.parseEntries(java.nio.ByteBuffer, long, int):java.util.List<com.g.b.a.a>");
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        if ((getFlags() & 1) > 0) {
            this.algorithmId = IsoTypeReader.readUInt24(byteBuffer);
            this.ivSize = IsoTypeReader.readUInt8(byteBuffer);
            this.kid = new byte[16];
            byteBuffer.get(this.kid);
        }
        long readUInt32 = IsoTypeReader.readUInt32(byteBuffer);
        ByteBuffer duplicate = byteBuffer.duplicate();
        ByteBuffer duplicate2 = byteBuffer.duplicate();
        this.entries = parseEntries(duplicate, readUInt32, 8);
        if (this.entries == null) {
            this.entries = parseEntries(duplicate2, readUInt32, 16);
            byteBuffer.position((byteBuffer.position() + byteBuffer.remaining()) - duplicate2.remaining());
        } else {
            byteBuffer.position((byteBuffer.position() + byteBuffer.remaining()) - duplicate.remaining());
        }
        if (this.entries == null) {
            throw new RuntimeException("Cannot parse SampleEncryptionBox");
        }
    }

    public boolean equals(Object obj) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_3, (Object) this, (Object) this, obj));
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractSampleEncryptionBox abstractSampleEncryptionBox = (AbstractSampleEncryptionBox) obj;
        if (this.algorithmId != abstractSampleEncryptionBox.algorithmId || this.ivSize != abstractSampleEncryptionBox.ivSize) {
            return false;
        }
        if (this.entries != null) {
            if (!this.entries.equals(abstractSampleEncryptionBox.entries)) {
                return false;
            }
        } else if (abstractSampleEncryptionBox.entries != null) {
            return false;
        }
        return Arrays.equals(this.kid, abstractSampleEncryptionBox.kid);
    }

    public void getBox(WritableByteChannel writableByteChannel) {
        super.getBox(writableByteChannel);
    }

    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        if (isOverrideTrackEncryptionBoxParameters()) {
            IsoTypeWriter.writeUInt24(byteBuffer, this.algorithmId);
            IsoTypeWriter.writeUInt8(byteBuffer, this.ivSize);
            byteBuffer.put(this.kid);
        }
        IsoTypeWriter.writeUInt32(byteBuffer, (long) this.entries.size());
        for (C1613a c1613a : this.entries) {
            if (c1613a.m4152a() > 0) {
                if (c1613a.f5048a.length == 8 || c1613a.f5048a.length == 16) {
                    byteBuffer.put(c1613a.f5048a);
                    if (isSubSampleEncryption()) {
                        IsoTypeWriter.writeUInt16(byteBuffer, c1613a.f5049b.length);
                        for (C1612j c1612j : c1613a.f5049b) {
                            IsoTypeWriter.writeUInt16(byteBuffer, c1612j.mo2986a());
                            IsoTypeWriter.writeUInt32(byteBuffer, c1612j.mo2987b());
                        }
                    }
                } else {
                    throw new RuntimeException("IV must be either 8 or 16 bytes");
                }
            }
        }
    }

    protected long getContentSize() {
        long length = (isOverrideTrackEncryptionBoxParameters() ? 8 + ((long) this.kid.length) : 4) + 4;
        for (C1613a a : this.entries) {
            length += (long) a.m4152a();
        }
        return length;
    }

    public List<C1613a> getEntries() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_1, (Object) this, (Object) this));
        return this.entries;
    }

    public List<Short> getEntrySizes() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_5, (Object) this, (Object) this));
        List<Short> arrayList = new ArrayList(this.entries.size());
        for (C1613a c1613a : this.entries) {
            short length = (short) c1613a.f5048a.length;
            if (isSubSampleEncryption()) {
                length = (short) (((short) (length + 2)) + (c1613a.f5049b.length * 6));
            }
            arrayList.add(Short.valueOf(length));
        }
        return arrayList;
    }

    public int getOffsetToFirstIV() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_0, (Object) this, (Object) this));
        return ((getSize() > IjkMediaMeta.AV_CH_WIDE_RIGHT ? 16 : 8) + (isOverrideTrackEncryptionBoxParameters() ? this.kid.length + 4 : 0)) + 4;
    }

    public int hashCode() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_4, (Object) this, (Object) this));
        int i = 0;
        int hashCode = 31 * ((((this.algorithmId * 31) + this.ivSize) * 31) + (this.kid != null ? Arrays.hashCode(this.kid) : 0));
        if (this.entries != null) {
            i = this.entries.hashCode();
        }
        return hashCode + i;
    }

    @DoNotParseDetail
    public boolean isOverrideTrackEncryptionBoxParameters() {
        return (getFlags() & 1) > 0;
    }

    @DoNotParseDetail
    public boolean isSubSampleEncryption() {
        return (getFlags() & 2) > 0;
    }

    public void setEntries(List<C1613a> list) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_2, (Object) this, (Object) this, (Object) list));
        this.entries = list;
    }

    @DoNotParseDetail
    public void setSubSampleEncryption(boolean z) {
        setFlags(z ? getFlags() | 2 : getFlags() & 16777213);
    }
}
