package com.googlecode.mp4parser.authoring.samples;

import com.coremedia.iso.boxes.Container;
import com.coremedia.iso.boxes.MovieBox;
import com.coremedia.iso.boxes.SampleSizeBox;
import com.coremedia.iso.boxes.SampleToChunkBox.Entry;
import com.coremedia.iso.boxes.TrackBox;
import com.googlecode.mp4parser.authoring.Sample;
import com.googlecode.mp4parser.util.CastUtils;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class DefaultMp4SampleList extends AbstractList<Sample> {
    private static final long MAX_MAP_SIZE = 268435456;
    ByteBuffer[][] cache = null;
    int[] chunkNumsStartSampleNum;
    long[] chunkOffsets;
    long[] chunkSizes;
    int lastChunk;
    long[][] sampleOffsetsWithinChunks;
    SampleSizeBox ssb;
    Container topLevel;
    TrackBox trackBox = null;

    public DefaultMp4SampleList(long j, Container container) {
        long j2 = j;
        Container container2 = container;
        int i = 0;
        this.lastChunk = 0;
        this.topLevel = container2;
        for (TrackBox trackBox : ((MovieBox) container2.getBoxes(MovieBox.class).get(0)).getBoxes(TrackBox.class)) {
            if (trackBox.getTrackHeaderBox().getTrackId() == j2) {
                r0.trackBox = trackBox;
            }
            i = 0;
        }
        if (r0.trackBox == null) {
            StringBuilder stringBuilder = new StringBuilder("This MP4 does not contain track ");
            stringBuilder.append(j2);
            throw new RuntimeException(stringBuilder.toString());
        }
        int i2;
        r0.chunkOffsets = r0.trackBox.getSampleTableBox().getChunkOffsetBox().getChunkOffsets();
        r0.chunkSizes = new long[r0.chunkOffsets.length];
        r0.cache = new ByteBuffer[r0.chunkOffsets.length][];
        r0.sampleOffsetsWithinChunks = new long[r0.chunkOffsets.length][];
        r0.ssb = r0.trackBox.getSampleTableBox().getSampleSizeBox();
        List entries = r0.trackBox.getSampleTableBox().getSampleToChunkBox().getEntries();
        Entry[] entryArr = (Entry[]) entries.toArray(new Entry[entries.size()]);
        Entry entry = entryArr[i];
        long firstChunk = entry.getFirstChunk();
        int l2i = CastUtils.l2i(entry.getSamplesPerChunk());
        int size = size();
        int i3 = l2i;
        l2i = i;
        int i4 = l2i;
        int i5 = 1;
        int i6 = i5;
        do {
            l2i++;
            if (((long) l2i) == firstChunk) {
                if (entryArr.length > i5) {
                    i2 = i5 + 1;
                    Entry entry2 = entryArr[i5];
                    i4 = i3;
                    i3 = CastUtils.l2i(entry2.getSamplesPerChunk());
                    i5 = i2;
                    firstChunk = entry2.getFirstChunk();
                } else {
                    i4 = i3;
                    i3 = -1;
                    firstChunk = Long.MAX_VALUE;
                }
            }
            r0.sampleOffsetsWithinChunks[l2i - 1] = new long[i4];
            i6 += i4;
        } while (i6 <= size);
        r0.chunkNumsStartSampleNum = new int[(l2i + 1)];
        entry = entryArr[i];
        firstChunk = entry.getFirstChunk();
        long j3 = firstChunk;
        i5 = i;
        i2 = 1;
        i3 = i2;
        int l2i2 = CastUtils.l2i(entry.getSamplesPerChunk());
        l2i = i5;
        while (true) {
            i6 = l2i + 1;
            r0.chunkNumsStartSampleNum[l2i] = i2;
            if (((long) i6) == j3) {
                if (entryArr.length > i3) {
                    l2i = i3 + 1;
                    Entry entry3 = entryArr[i3];
                    int l2i3 = CastUtils.l2i(entry3.getSamplesPerChunk());
                    j3 = entry3.getFirstChunk();
                    i3 = l2i;
                    i5 = l2i2;
                    l2i2 = l2i3;
                } else {
                    i5 = l2i2;
                    l2i2 = -1;
                    j3 = Long.MAX_VALUE;
                }
            }
            i2 += i5;
            if (i2 > size) {
                break;
            }
            l2i = i6;
        }
        r0.chunkNumsStartSampleNum[i6] = ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        long j4 = 0;
        i = 1;
        int i7 = 0;
        while (((long) i) <= r0.ssb.getSampleCount()) {
            while (i == r0.chunkNumsStartSampleNum[i7]) {
                i7++;
                j4 = 0;
            }
            long[] jArr = r0.chunkSizes;
            size = i7 - 1;
            i6 = i - 1;
            jArr[size] = jArr[size] + r0.ssb.getSampleSizeAtIndex(i6);
            r0.sampleOffsetsWithinChunks[size][i - r0.chunkNumsStartSampleNum[size]] = j4;
            i++;
            j4 += r0.ssb.getSampleSizeAtIndex(i6);
        }
    }

    public Sample get(int i) {
        int i2 = i;
        if (((long) i2) >= this.ssb.getSampleCount()) {
            throw new IndexOutOfBoundsException();
        }
        long j;
        ByteBuffer byteBuffer;
        int chunkForSample = getChunkForSample(i);
        int i3 = r8.chunkNumsStartSampleNum[chunkForSample] - 1;
        long j2 = (long) chunkForSample;
        long j3 = r8.chunkOffsets[CastUtils.l2i(j2)];
        chunkForSample = i2 - i3;
        long[] jArr = r8.sampleOffsetsWithinChunks[CastUtils.l2i(j2)];
        long j4 = jArr[chunkForSample];
        ByteBuffer[] byteBufferArr = r8.cache[CastUtils.l2i(j2)];
        if (byteBufferArr == null) {
            List arrayList = new ArrayList();
            long j5 = 0;
            int i4 = 0;
            while (i4 < jArr.length) {
                try {
                    long j6;
                    j = j4;
                    long j7 = j2;
                    if ((jArr[i4] + r8.ssb.getSampleSizeAtIndex(i4 + i3)) - j5 > MAX_MAP_SIZE) {
                        j6 = j3;
                        arrayList.add(r8.topLevel.getByteBuffer(j3 + j5, jArr[i4] - j5));
                        j5 = jArr[i4];
                    } else {
                        j6 = j3;
                    }
                    i4++;
                    j4 = j;
                    j2 = j7;
                    j3 = j6;
                } catch (IOException e) {
                    throw new IndexOutOfBoundsException(e.getMessage());
                }
            }
            j = j4;
            arrayList.add(r8.topLevel.getByteBuffer(j3 + j5, ((-j5) + jArr[jArr.length - 1]) + r8.ssb.getSampleSizeAtIndex((i3 + jArr.length) - 1)));
            byteBufferArr = (ByteBuffer[]) arrayList.toArray(new ByteBuffer[arrayList.size()]);
            r8.cache[CastUtils.l2i(j2)] = byteBufferArr;
        } else {
            j = j4;
        }
        int length = byteBufferArr.length;
        long j8 = j;
        int i5 = 0;
        while (i5 < length) {
            ByteBuffer byteBuffer2 = byteBufferArr[i5];
            if (j8 < ((long) byteBuffer2.limit())) {
                byteBuffer = byteBuffer2;
                break;
            }
            i5++;
            j8 -= (long) byteBuffer2.limit();
        }
        byteBuffer = null;
        final long sampleSizeAtIndex = r8.ssb.getSampleSizeAtIndex(i2);
        return new Sample() {
            public ByteBuffer asByteBuffer() {
                return (ByteBuffer) ((ByteBuffer) byteBuffer.position(CastUtils.l2i(j8))).slice().limit(CastUtils.l2i(sampleSizeAtIndex));
            }

            public long getSize() {
                return sampleSizeAtIndex;
            }

            public String toString() {
                StringBuilder stringBuilder = new StringBuilder("DefaultMp4Sample(size:");
                stringBuilder.append(sampleSizeAtIndex);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }

            public void writeTo(WritableByteChannel writableByteChannel) {
                writableByteChannel.write(asByteBuffer());
            }
        };
    }

    synchronized int getChunkForSample(int i) {
        i++;
        if (i >= this.chunkNumsStartSampleNum[this.lastChunk] && i < this.chunkNumsStartSampleNum[this.lastChunk + 1]) {
            return this.lastChunk;
        } else if (i < this.chunkNumsStartSampleNum[this.lastChunk]) {
            this.lastChunk = 0;
            while (this.chunkNumsStartSampleNum[this.lastChunk + 1] <= i) {
                this.lastChunk++;
            }
            return this.lastChunk;
        } else {
            int i2 = this.lastChunk;
            while (true) {
                this.lastChunk = i2 + 1;
                if (this.chunkNumsStartSampleNum[this.lastChunk + 1] > i) {
                    return this.lastChunk;
                }
                i2 = this.lastChunk;
            }
        }
    }

    public int size() {
        return CastUtils.l2i(this.trackBox.getSampleTableBox().getSampleSizeBox().getSampleCount());
    }
}
