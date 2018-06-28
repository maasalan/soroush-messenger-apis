package com.googlecode.mp4parser;

import com.coremedia.iso.BoxParser;
import com.coremedia.iso.Hex;
import com.coremedia.iso.IsoFile;
import com.coremedia.iso.IsoTypeWriter;
import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.Container;
import com.coremedia.iso.boxes.UserBox;
import com.googlecode.mp4parser.annotations.DoNotParseDetail;
import com.googlecode.mp4parser.util.CastUtils;
import com.googlecode.mp4parser.util.Logger;
import com.googlecode.mp4parser.util.Path;
import java.io.PrintStream;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

public abstract class AbstractBox implements Box {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static Logger LOG = Logger.getLogger(AbstractBox.class);
    private ByteBuffer content;
    long contentStartPosition;
    DataSource dataSource;
    private ByteBuffer deadBytes = null;
    boolean isParsed;
    boolean isRead;
    long memMapSize = -1;
    long offset;
    private Container parent;
    protected String type;
    private byte[] userType;

    protected AbstractBox(String str) {
        this.type = str;
        this.isRead = true;
        this.isParsed = true;
    }

    protected AbstractBox(String str, byte[] bArr) {
        this.type = str;
        this.userType = bArr;
        this.isRead = true;
        this.isParsed = true;
    }

    private void getHeader(ByteBuffer byteBuffer) {
        if (isSmallBox()) {
            IsoTypeWriter.writeUInt32(byteBuffer, getSize());
            byteBuffer.put(IsoFile.fourCCtoBytes(getType()));
        } else {
            IsoTypeWriter.writeUInt32(byteBuffer, 1);
            byteBuffer.put(IsoFile.fourCCtoBytes(getType()));
            IsoTypeWriter.writeUInt64(byteBuffer, getSize());
        }
        if (UserBox.TYPE.equals(getType())) {
            byteBuffer.put(getUserType());
        }
    }

    private boolean isSmallBox() {
        int i = UserBox.TYPE.equals(getType()) ? 24 : 8;
        if (!this.isRead) {
            return this.memMapSize + ((long) i) < IjkMediaMeta.AV_CH_WIDE_RIGHT;
        } else {
            if (!this.isParsed) {
                return ((long) (this.content.limit() + i)) < IjkMediaMeta.AV_CH_WIDE_RIGHT;
            } else {
                return (getContentSize() + ((long) (this.deadBytes != null ? this.deadBytes.limit() : 0))) + ((long) i) < IjkMediaMeta.AV_CH_WIDE_RIGHT;
            }
        }
    }

    private synchronized void readContent() {
        if (!this.isRead) {
            try {
                Logger logger = LOG;
                StringBuilder stringBuilder = new StringBuilder("mem mapping ");
                stringBuilder.append(getType());
                logger.logDebug(stringBuilder.toString());
                this.content = this.dataSource.map(this.contentStartPosition, this.memMapSize);
                this.isRead = true;
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }
    }

    private boolean verify(ByteBuffer byteBuffer) {
        ByteBuffer allocate = ByteBuffer.allocate(CastUtils.l2i(getContentSize() + ((long) (this.deadBytes != null ? this.deadBytes.limit() : 0))));
        getContent(allocate);
        if (this.deadBytes != null) {
            this.deadBytes.rewind();
            while (this.deadBytes.remaining() > 0) {
                allocate.put(this.deadBytes);
            }
        }
        byteBuffer.rewind();
        allocate.rewind();
        if (byteBuffer.remaining() != allocate.remaining()) {
            PrintStream printStream = System.err;
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(getType()));
            stringBuilder.append(": remaining differs ");
            stringBuilder.append(byteBuffer.remaining());
            stringBuilder.append(" vs. ");
            stringBuilder.append(allocate.remaining());
            printStream.print(stringBuilder.toString());
            Logger logger = LOG;
            stringBuilder = new StringBuilder(String.valueOf(getType()));
            stringBuilder.append(": remaining differs ");
            stringBuilder.append(byteBuffer.remaining());
            stringBuilder.append(" vs. ");
            stringBuilder.append(allocate.remaining());
            logger.logError(stringBuilder.toString());
            return false;
        }
        int position = byteBuffer.position();
        int limit = byteBuffer.limit() - 1;
        int limit2 = allocate.limit() - 1;
        while (limit >= position) {
            if (byteBuffer.get(limit) != allocate.get(limit2)) {
                LOG.logError(String.format("%s: buffers differ at %d: %2X/%2X", new Object[]{getType(), Integer.valueOf(limit), Byte.valueOf(byteBuffer.get(limit)), Byte.valueOf(allocate.get(limit2))}));
                byte[] bArr = new byte[byteBuffer.remaining()];
                byte[] bArr2 = new byte[allocate.remaining()];
                byteBuffer.get(bArr);
                allocate.get(bArr2);
                PrintStream printStream2 = System.err;
                StringBuilder stringBuilder2 = new StringBuilder("original      : ");
                stringBuilder2.append(Hex.encodeHex(bArr, 4));
                printStream2.println(stringBuilder2.toString());
                printStream2 = System.err;
                stringBuilder2 = new StringBuilder("reconstructed : ");
                stringBuilder2.append(Hex.encodeHex(bArr2, 4));
                printStream2.println(stringBuilder2.toString());
                return false;
            }
            limit--;
            limit2--;
        }
        return true;
    }

    public abstract void _parseDetails(ByteBuffer byteBuffer);

    public void getBox(WritableByteChannel writableByteChannel) {
        int i = 8;
        int i2 = 0;
        int i3 = 16;
        ByteBuffer allocate;
        if (!this.isRead) {
            if (!isSmallBox()) {
                i = 16;
            }
            if (UserBox.TYPE.equals(getType())) {
                i2 = 16;
            }
            allocate = ByteBuffer.allocate(i + i2);
            getHeader(allocate);
            writableByteChannel.write((ByteBuffer) allocate.rewind());
            this.dataSource.transferTo(this.contentStartPosition, this.memMapSize, writableByteChannel);
        } else if (this.isParsed) {
            allocate = ByteBuffer.allocate(CastUtils.l2i(getSize()));
            getHeader(allocate);
            getContent(allocate);
            if (this.deadBytes != null) {
                this.deadBytes.rewind();
                while (this.deadBytes.remaining() > 0) {
                    allocate.put(this.deadBytes);
                }
            }
            writableByteChannel.write((ByteBuffer) allocate.rewind());
        } else {
            if (!isSmallBox()) {
                i = 16;
            }
            if (!UserBox.TYPE.equals(getType())) {
                i3 = 0;
            }
            allocate = ByteBuffer.allocate(i + i3);
            getHeader(allocate);
            writableByteChannel.write((ByteBuffer) allocate.rewind());
            writableByteChannel.write((ByteBuffer) this.content.position(0));
        }
    }

    public abstract void getContent(ByteBuffer byteBuffer);

    public abstract long getContentSize();

    public long getOffset() {
        return this.offset;
    }

    @DoNotParseDetail
    public Container getParent() {
        return this.parent;
    }

    @DoNotParseDetail
    public String getPath() {
        return Path.createPath(this);
    }

    public long getSize() {
        long j;
        int i = 0;
        if (!this.isRead) {
            j = this.memMapSize;
        } else if (this.isParsed) {
            j = getContentSize();
        } else {
            j = (long) (this.content != null ? this.content.limit() : 0);
        }
        long j2 = j + ((long) ((8 + (j >= 4294967288L ? 8 : 0)) + (UserBox.TYPE.equals(getType()) ? 16 : 0)));
        if (this.deadBytes != null) {
            i = this.deadBytes.limit();
        }
        return j2 + ((long) i);
    }

    @DoNotParseDetail
    public String getType() {
        return this.type;
    }

    @DoNotParseDetail
    public byte[] getUserType() {
        return this.userType;
    }

    public boolean isParsed() {
        return this.isParsed;
    }

    @DoNotParseDetail
    public void parse(DataSource dataSource, ByteBuffer byteBuffer, long j, BoxParser boxParser) {
        this.contentStartPosition = dataSource.position();
        this.offset = this.contentStartPosition - ((long) byteBuffer.remaining());
        this.memMapSize = j;
        this.dataSource = dataSource;
        dataSource.position(dataSource.position() + j);
        this.isRead = false;
        this.isParsed = false;
    }

    public final synchronized void parseDetails() {
        readContent();
        Logger logger = LOG;
        StringBuilder stringBuilder = new StringBuilder("parsing details of ");
        stringBuilder.append(getType());
        logger.logDebug(stringBuilder.toString());
        if (this.content != null) {
            ByteBuffer byteBuffer = this.content;
            this.isParsed = true;
            byteBuffer.rewind();
            _parseDetails(byteBuffer);
            if (byteBuffer.remaining() > 0) {
                this.deadBytes = byteBuffer.slice();
            }
            this.content = null;
        }
    }

    protected void setDeadBytes(ByteBuffer byteBuffer) {
        this.deadBytes = byteBuffer;
    }

    @DoNotParseDetail
    public void setParent(Container container) {
        this.parent = container;
    }
}
