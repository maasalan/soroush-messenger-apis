package com.p149g.p150a.p594c;

import com.coremedia.iso.BoxParser;
import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry;
import com.googlecode.mp4parser.DataSource;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import org.jivesoftware.smack.roster.Roster;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

public final class C7308a extends AbstractSampleEntry {
    public String f21049a = "";
    public String f21050b = "";
    public String f21051c = "";

    public C7308a() {
        super("stpp");
    }

    public final void getBox(WritableByteChannel writableByteChannel) {
        writableByteChannel.write(getHeader());
        ByteBuffer allocate = ByteBuffer.allocate((((8 + this.f21049a.length()) + this.f21050b.length()) + this.f21051c.length()) + 3);
        allocate.position(6);
        IsoTypeWriter.writeUInt16(allocate, this.dataReferenceIndex);
        IsoTypeWriter.writeZeroTermUtf8String(allocate, this.f21049a);
        IsoTypeWriter.writeZeroTermUtf8String(allocate, this.f21050b);
        IsoTypeWriter.writeZeroTermUtf8String(allocate, this.f21051c);
        writableByteChannel.write((ByteBuffer) allocate.rewind());
        writeContainer(writableByteChannel);
    }

    public final long getSize() {
        int i = 8;
        long containerSize = getContainerSize() + ((long) ((((this.f21049a.length() + 8) + this.f21050b.length()) + this.f21051c.length()) + 3));
        if (this.largeBox || containerSize + 8 >= IjkMediaMeta.AV_CH_WIDE_RIGHT) {
            i = 16;
        }
        return containerSize + ((long) i);
    }

    public final void parse(DataSource dataSource, ByteBuffer byteBuffer, long j, BoxParser boxParser) {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        dataSource.read((ByteBuffer) allocate.rewind());
        allocate.position(6);
        this.dataReferenceIndex = IsoTypeReader.readUInt16(allocate);
        long position = dataSource.position();
        ByteBuffer allocate2 = ByteBuffer.allocate(Roster.INITIAL_DEFAULT_NON_ROSTER_PRESENCE_MAP_SIZE);
        dataSource.read((ByteBuffer) allocate2.rewind());
        this.f21049a = IsoTypeReader.readString((ByteBuffer) allocate2.rewind());
        dataSource.position((position + ((long) this.f21049a.length())) + 1);
        dataSource.read((ByteBuffer) allocate2.rewind());
        this.f21050b = IsoTypeReader.readString((ByteBuffer) allocate2.rewind());
        dataSource.position(((position + ((long) this.f21049a.length())) + ((long) this.f21050b.length())) + 2);
        dataSource.read((ByteBuffer) allocate2.rewind());
        this.f21051c = IsoTypeReader.readString((ByteBuffer) allocate2.rewind());
        dataSource.position((((position + ((long) this.f21049a.length())) + ((long) this.f21050b.length())) + ((long) this.f21051c.length())) + 3);
        initContainer(dataSource, j - ((long) ((((byteBuffer.remaining() + this.f21049a.length()) + this.f21050b.length()) + this.f21051c.length()) + 3)), boxParser);
    }
}
