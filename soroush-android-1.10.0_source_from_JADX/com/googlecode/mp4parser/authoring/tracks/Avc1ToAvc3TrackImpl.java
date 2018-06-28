package com.googlecode.mp4parser.authoring.tracks;

import com.coremedia.iso.IsoFile;
import com.coremedia.iso.IsoTypeWriterVariable;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.sampleentry.VisualSampleEntry;
import com.googlecode.mp4parser.MemoryDataSourceImpl;
import com.googlecode.mp4parser.authoring.Sample;
import com.googlecode.mp4parser.authoring.Track;
import com.googlecode.mp4parser.authoring.WrappingTrack;
import com.googlecode.mp4parser.util.CastUtils;
import com.googlecode.mp4parser.util.Path;
import com.p149g.p150a.p151b.C6533a;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.List;

public class Avc1ToAvc3TrackImpl extends WrappingTrack {
    C6533a avcC;
    List<Sample> samples;
    SampleDescriptionBox stsd;

    private class ReplaceSyncSamplesList extends AbstractList<Sample> {
        List<Sample> parentSamples;

        public ReplaceSyncSamplesList(List<Sample> list) {
            this.parentSamples = list;
        }

        public Sample get(int i) {
            if (Arrays.binarySearch(Avc1ToAvc3TrackImpl.this.getSyncSamples(), (long) (i + 1)) < 0) {
                return (Sample) this.parentSamples.get(i);
            }
            final int a = Avc1ToAvc3TrackImpl.this.avcC.m15775a() + 1;
            final ByteBuffer allocate = ByteBuffer.allocate(a);
            final Sample sample = (Sample) this.parentSamples.get(i);
            return new Sample() {
                public ByteBuffer asByteBuffer() {
                    int i = 0;
                    for (byte[] length : Avc1ToAvc3TrackImpl.this.avcC.m15778b()) {
                        i += a + length.length;
                    }
                    for (byte[] length2 : Avc1ToAvc3TrackImpl.this.avcC.m15787f()) {
                        i += a + length2.length;
                    }
                    for (byte[] length3 : Avc1ToAvc3TrackImpl.this.avcC.m15781c()) {
                        i += a + length3.length;
                    }
                    ByteBuffer allocate = ByteBuffer.allocate(CastUtils.l2i(sample.getSize()) + i);
                    for (byte[] length22 : Avc1ToAvc3TrackImpl.this.avcC.m15778b()) {
                        IsoTypeWriterVariable.write((long) length22.length, allocate, a);
                        allocate.put(length22);
                    }
                    for (byte[] bArr : Avc1ToAvc3TrackImpl.this.avcC.m15787f()) {
                        IsoTypeWriterVariable.write((long) bArr.length, allocate, a);
                        allocate.put(bArr);
                    }
                    for (byte[] length222 : Avc1ToAvc3TrackImpl.this.avcC.m15781c()) {
                        IsoTypeWriterVariable.write((long) length222.length, allocate, a);
                        allocate.put(length222);
                    }
                    allocate.put(sample.asByteBuffer());
                    return (ByteBuffer) allocate.rewind();
                }

                public long getSize() {
                    int i = 0;
                    for (byte[] length : Avc1ToAvc3TrackImpl.this.avcC.m15778b()) {
                        i += a + length.length;
                    }
                    for (byte[] length2 : Avc1ToAvc3TrackImpl.this.avcC.m15787f()) {
                        i += a + length2.length;
                    }
                    for (byte[] length3 : Avc1ToAvc3TrackImpl.this.avcC.m15781c()) {
                        i += a + length3.length;
                    }
                    return sample.getSize() + ((long) i);
                }

                public void writeTo(WritableByteChannel writableByteChannel) {
                    for (byte[] bArr : Avc1ToAvc3TrackImpl.this.avcC.m15778b()) {
                        IsoTypeWriterVariable.write((long) bArr.length, (ByteBuffer) allocate.rewind(), a);
                        writableByteChannel.write((ByteBuffer) allocate.rewind());
                        writableByteChannel.write(ByteBuffer.wrap(bArr));
                    }
                    for (byte[] bArr2 : Avc1ToAvc3TrackImpl.this.avcC.m15787f()) {
                        IsoTypeWriterVariable.write((long) bArr2.length, (ByteBuffer) allocate.rewind(), a);
                        writableByteChannel.write((ByteBuffer) allocate.rewind());
                        writableByteChannel.write(ByteBuffer.wrap(bArr2));
                    }
                    for (byte[] bArr3 : Avc1ToAvc3TrackImpl.this.avcC.m15781c()) {
                        IsoTypeWriterVariable.write((long) bArr3.length, (ByteBuffer) allocate.rewind(), a);
                        writableByteChannel.write((ByteBuffer) allocate.rewind());
                        writableByteChannel.write(ByteBuffer.wrap(bArr3));
                    }
                    sample.writeTo(writableByteChannel);
                }
            };
        }

        public int size() {
            return this.parentSamples.size();
        }
    }

    public Avc1ToAvc3TrackImpl(Track track) {
        super(track);
        if (VisualSampleEntry.TYPE3.equals(track.getSampleDescriptionBox().getSampleEntry().getType())) {
            OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            track.getSampleDescriptionBox().getBox(Channels.newChannel(byteArrayOutputStream));
            this.stsd = (SampleDescriptionBox) Path.getPath(new IsoFile(new MemoryDataSourceImpl(byteArrayOutputStream.toByteArray())), SampleDescriptionBox.TYPE);
            ((VisualSampleEntry) this.stsd.getSampleEntry()).setType(VisualSampleEntry.TYPE4);
            this.avcC = (C6533a) Path.getPath(this.stsd, "avc./avcC");
            this.samples = new ReplaceSyncSamplesList(track.getSamples());
            return;
        }
        throw new RuntimeException("Only avc1 tracks can be converted to avc3 tracks");
    }

    public SampleDescriptionBox getSampleDescriptionBox() {
        return this.stsd;
    }

    public List<Sample> getSamples() {
        return this.samples;
    }
}
