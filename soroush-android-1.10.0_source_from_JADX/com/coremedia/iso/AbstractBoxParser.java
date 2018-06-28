package com.coremedia.iso;

import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.Container;
import com.coremedia.iso.boxes.UserBox;
import com.googlecode.mp4parser.DataSource;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.logging.Logger;

public abstract class AbstractBoxParser implements BoxParser {
    private static Logger LOG = Logger.getLogger(AbstractBoxParser.class.getName());
    ThreadLocal<ByteBuffer> header = new C12991();

    class C12991 extends ThreadLocal<ByteBuffer> {
        C12991() {
        }

        protected ByteBuffer initialValue() {
            return ByteBuffer.allocate(32);
        }
    }

    public abstract Box createBox(String str, byte[] bArr, String str2);

    public Box parseBox(DataSource dataSource, Container container) {
        long position = dataSource.position();
        ((ByteBuffer) this.header.get()).rewind().limit(8);
        int read;
        do {
            read = dataSource.read((ByteBuffer) this.header.get());
            if (read == 8) {
                ((ByteBuffer) this.header.get()).rewind();
                position = IsoTypeReader.readUInt32((ByteBuffer) this.header.get());
                if (position >= 8 || position <= 1) {
                    long readUInt64;
                    byte[] bArr;
                    long j;
                    String read4cc = IsoTypeReader.read4cc((ByteBuffer) this.header.get());
                    if (position == 1) {
                        ((ByteBuffer) this.header.get()).limit(16);
                        dataSource.read((ByteBuffer) this.header.get());
                        ((ByteBuffer) this.header.get()).position(8);
                        readUInt64 = IsoTypeReader.readUInt64((ByteBuffer) this.header.get()) - 16;
                    } else {
                        readUInt64 = position == 0 ? dataSource.size() - dataSource.position() : position - 8;
                    }
                    if (UserBox.TYPE.equals(read4cc)) {
                        ((ByteBuffer) this.header.get()).limit(((ByteBuffer) this.header.get()).limit() + 16);
                        dataSource.read((ByteBuffer) this.header.get());
                        bArr = new byte[16];
                        for (int position2 = ((ByteBuffer) this.header.get()).position() - 16; position2 < ((ByteBuffer) this.header.get()).position(); position2++) {
                            bArr[position2 - (((ByteBuffer) this.header.get()).position() - 16)] = ((ByteBuffer) this.header.get()).get(position2);
                        }
                        j = readUInt64 - 16;
                    } else {
                        bArr = null;
                        j = readUInt64;
                    }
                    Box createBox = createBox(read4cc, bArr, container instanceof Box ? ((Box) container).getType() : "");
                    createBox.setParent(container);
                    ((ByteBuffer) this.header.get()).rewind();
                    createBox.parse(dataSource, (ByteBuffer) this.header.get(), j, this);
                    return createBox;
                }
                Logger logger = LOG;
                StringBuilder stringBuilder = new StringBuilder("Plausibility check failed: size < 8 (size = ");
                stringBuilder.append(position);
                stringBuilder.append("). Stop parsing!");
                logger.severe(stringBuilder.toString());
                return null;
            }
        } while (read >= 0);
        dataSource.position(position);
        throw new EOFException();
    }
}
