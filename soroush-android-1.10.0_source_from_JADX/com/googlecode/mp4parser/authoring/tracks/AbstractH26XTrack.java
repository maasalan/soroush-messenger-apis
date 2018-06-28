package com.googlecode.mp4parser.authoring.tracks;

import com.coremedia.iso.boxes.CompositionTimeToSample.Entry;
import com.coremedia.iso.boxes.SampleDependencyTypeBox;
import com.googlecode.mp4parser.DataSource;
import com.googlecode.mp4parser.authoring.AbstractTrack;
import com.googlecode.mp4parser.authoring.Sample;
import com.googlecode.mp4parser.authoring.SampleImpl;
import com.googlecode.mp4parser.authoring.TrackMetaData;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

public abstract class AbstractH26XTrack extends AbstractTrack {
    static int BUFFER = 67107840;
    protected List<Entry> ctts = new ArrayList();
    private DataSource dataSource;
    protected long[] decodingTimes;
    protected List<SampleDependencyTypeBox.Entry> sdtp = new ArrayList();
    protected List<Integer> stss = new ArrayList();
    TrackMetaData trackMetaData = new TrackMetaData();

    public static class LookAhead {
        ByteBuffer buffer;
        long bufferStartPos = 0;
        DataSource dataSource;
        int inBufferPos = 0;
        long start;

        public LookAhead(DataSource dataSource) {
            this.dataSource = dataSource;
            fillBuffer();
        }

        public void discardByte() {
            this.inBufferPos++;
        }

        public void discardNext3AndMarkStart() {
            this.inBufferPos += 3;
            this.start = this.bufferStartPos + ((long) this.inBufferPos);
        }

        public void fillBuffer() {
            this.buffer = this.dataSource.map(this.bufferStartPos, Math.min(this.dataSource.size() - this.bufferStartPos, (long) AbstractH26XTrack.BUFFER));
        }

        public ByteBuffer getNal() {
            if (this.start >= this.bufferStartPos) {
                this.buffer.position((int) (this.start - this.bufferStartPos));
                Buffer slice = this.buffer.slice();
                slice.limit((int) (((long) this.inBufferPos) - (this.start - this.bufferStartPos)));
                return (ByteBuffer) slice;
            }
            throw new RuntimeException("damn! NAL exceeds buffer");
        }

        public boolean nextThreeEquals000or001orEof() {
            if (this.buffer.limit() - this.inBufferPos >= 3) {
                return this.buffer.get(this.inBufferPos) == (byte) 0 && this.buffer.get(this.inBufferPos + 1) == (byte) 0 && (this.buffer.get(this.inBufferPos + 2) == (byte) 0 || this.buffer.get(this.inBufferPos + 2) == (byte) 1);
            } else {
                if ((this.bufferStartPos + ((long) this.inBufferPos)) + 3 > this.dataSource.size()) {
                    return this.bufferStartPos + ((long) this.inBufferPos) == this.dataSource.size();
                } else {
                    this.bufferStartPos = this.start;
                    this.inBufferPos = 0;
                    fillBuffer();
                    return nextThreeEquals000or001orEof();
                }
            }
        }

        public boolean nextThreeEquals001() {
            if (this.buffer.limit() - this.inBufferPos >= 3) {
                return this.buffer.get(this.inBufferPos) == (byte) 0 && this.buffer.get(this.inBufferPos + 1) == (byte) 0 && this.buffer.get(this.inBufferPos + 2) == (byte) 1;
            } else {
                if ((this.bufferStartPos + ((long) this.inBufferPos)) + 3 < this.dataSource.size()) {
                    return false;
                }
                throw new EOFException();
            }
        }
    }

    public AbstractH26XTrack(DataSource dataSource) {
        super(dataSource.toString());
        this.dataSource = dataSource;
    }

    static InputStream cleanBuffer(InputStream inputStream) {
        return new CleanInputStream(inputStream);
    }

    protected static byte[] toArray(ByteBuffer byteBuffer) {
        byteBuffer = byteBuffer.duplicate();
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr, 0, bArr.length);
        return bArr;
    }

    public void close() {
        this.dataSource.close();
    }

    protected Sample createSampleObject(List<? extends ByteBuffer> list) {
        byte[] bArr = new byte[(list.size() * 4)];
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        for (ByteBuffer remaining : list) {
            wrap.putInt(remaining.remaining());
        }
        ByteBuffer[] byteBufferArr = new ByteBuffer[(list.size() * 2)];
        for (int i = 0; i < list.size(); i++) {
            int i2 = 2 * i;
            byteBufferArr[i2] = ByteBuffer.wrap(bArr, i * 4, 4);
            byteBufferArr[i2 + 1] = (ByteBuffer) list.get(i);
        }
        return new SampleImpl(byteBufferArr);
    }

    protected java.nio.ByteBuffer findNextNal(com.googlecode.mp4parser.authoring.tracks.AbstractH26XTrack.LookAhead r2) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r1 = this;
    L_0x0000:
        r0 = r2.nextThreeEquals001();	 Catch:{ EOFException -> 0x001c }
        if (r0 == 0) goto L_0x0018;	 Catch:{ EOFException -> 0x001c }
    L_0x0006:
        r2.discardNext3AndMarkStart();	 Catch:{ EOFException -> 0x001c }
    L_0x0009:
        r0 = r2.nextThreeEquals000or001orEof();	 Catch:{ EOFException -> 0x001c }
        if (r0 == 0) goto L_0x0014;	 Catch:{ EOFException -> 0x001c }
    L_0x000f:
        r2 = r2.getNal();	 Catch:{ EOFException -> 0x001c }
        return r2;	 Catch:{ EOFException -> 0x001c }
    L_0x0014:
        r2.discardByte();	 Catch:{ EOFException -> 0x001c }
        goto L_0x0009;	 Catch:{ EOFException -> 0x001c }
    L_0x0018:
        r2.discardByte();	 Catch:{ EOFException -> 0x001c }
        goto L_0x0000;
    L_0x001c:
        r2 = 0;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.googlecode.mp4parser.authoring.tracks.AbstractH26XTrack.findNextNal(com.googlecode.mp4parser.authoring.tracks.AbstractH26XTrack$LookAhead):java.nio.ByteBuffer");
    }

    public List<Entry> getCompositionTimeEntries() {
        return this.ctts;
    }

    public List<SampleDependencyTypeBox.Entry> getSampleDependencies() {
        return this.sdtp;
    }

    public long[] getSampleDurations() {
        return this.decodingTimes;
    }

    public long[] getSyncSamples() {
        long[] jArr = new long[this.stss.size()];
        for (int i = 0; i < this.stss.size(); i++) {
            jArr[i] = (long) ((Integer) this.stss.get(i)).intValue();
        }
        return jArr;
    }

    public TrackMetaData getTrackMetaData() {
        return this.trackMetaData;
    }
}
