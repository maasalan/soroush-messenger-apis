package com.googlecode.mp4parser.authoring.tracks.mjpeg;

import com.coremedia.iso.Hex;
import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.CompositionTimeToSample;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.sampleentry.VisualSampleEntry;
import com.googlecode.mp4parser.authoring.AbstractTrack;
import com.googlecode.mp4parser.authoring.Edit;
import com.googlecode.mp4parser.authoring.Sample;
import com.googlecode.mp4parser.authoring.Track;
import com.googlecode.mp4parser.authoring.TrackMetaData;
import com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ESDescriptor;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ObjectDescriptorFactory;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel.MapMode;
import java.nio.channels.WritableByteChannel;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.List;
import javax.imageio.ImageIO;
import org.jivesoftware.smack.sm.packet.StreamManagement.AckRequest;

public class OneJpegPerIframe extends AbstractTrack {
    File[] jpegs;
    long[] sampleDurations;
    SampleDescriptionBox stsd;
    long[] syncSamples;
    TrackMetaData trackMetaData = new TrackMetaData();

    class C21141 extends AbstractList<Sample> {
        C21141() {
        }

        public Sample get(final int i) {
            return new Sample() {
                ByteBuffer sample = null;

                public ByteBuffer asByteBuffer() {
                    if (this.sample == null) {
                        try {
                            RandomAccessFile randomAccessFile = new RandomAccessFile(OneJpegPerIframe.this.jpegs[i], AckRequest.ELEMENT);
                            this.sample = randomAccessFile.getChannel().map(MapMode.READ_ONLY, 0, randomAccessFile.length());
                        } catch (Throwable e) {
                            throw new RuntimeException(e);
                        }
                    }
                    return this.sample;
                }

                public long getSize() {
                    return OneJpegPerIframe.this.jpegs[i].length();
                }

                public void writeTo(WritableByteChannel writableByteChannel) {
                    RandomAccessFile randomAccessFile = new RandomAccessFile(OneJpegPerIframe.this.jpegs[i], AckRequest.ELEMENT);
                    randomAccessFile.getChannel().transferTo(0, randomAccessFile.length(), writableByteChannel);
                    randomAccessFile.close();
                }
            };
        }

        public int size() {
            return OneJpegPerIframe.this.jpegs.length;
        }
    }

    public OneJpegPerIframe(String str, File[] fileArr, Track track) {
        File[] fileArr2 = fileArr;
        super(str);
        this.jpegs = fileArr2;
        if (track.getSyncSamples().length != fileArr2.length) {
            StringBuilder stringBuilder = new StringBuilder("Number of sync samples doesn't match the number of stills (");
            stringBuilder.append(track.getSyncSamples().length);
            stringBuilder.append(" vs. ");
            stringBuilder.append(fileArr2.length);
            stringBuilder.append(")");
            throw new RuntimeException(stringBuilder.toString());
        }
        BufferedImage read = ImageIO.read(fileArr2[0]);
        r0.trackMetaData.setWidth((double) read.getWidth());
        r0.trackMetaData.setHeight((double) read.getHeight());
        r0.trackMetaData.setTimescale(track.getTrackMetaData().getTimescale());
        long[] sampleDurations = track.getSampleDurations();
        long[] syncSamples = track.getSyncSamples();
        long j = 0;
        int i = 1;
        r0.sampleDurations = new long[syncSamples.length];
        long j2 = 0;
        int i2 = 1;
        int i3 = i2;
        while (i2 < sampleDurations.length) {
            if (i3 < syncSamples.length && ((long) i2) == syncSamples[i3]) {
                r0.sampleDurations[i3 - 1] = j2;
                i3++;
                j2 = 0;
            }
            i2++;
            j2 += sampleDurations[i2];
        }
        r0.sampleDurations[r0.sampleDurations.length - 1] = j2;
        r0.stsd = new SampleDescriptionBox();
        Object visualSampleEntry = new VisualSampleEntry(VisualSampleEntry.TYPE1);
        r0.stsd.addBox(visualSampleEntry);
        Box eSDescriptorBox = new ESDescriptorBox();
        eSDescriptorBox.setData(ByteBuffer.wrap(Hex.decodeHex("038080801B000100048080800D6C11000000000A1CB4000A1CB4068080800102")));
        eSDescriptorBox.setEsDescriptor((ESDescriptor) ObjectDescriptorFactory.createFrom(-1, ByteBuffer.wrap(Hex.decodeHex("038080801B000100048080800D6C11000000000A1CB4000A1CB4068080800102"))));
        visualSampleEntry.addBox(eSDescriptorBox);
        r0.syncSamples = new long[fileArr2.length];
        int i4 = 0;
        while (i4 < r0.syncSamples.length) {
            int i5 = i4 + 1;
            r0.syncSamples[i4] = (long) i5;
            i4 = i5;
        }
        i4 = 1;
        double d = 0.0d;
        for (Edit edit : track.getEdits()) {
            if (edit.getMediaTime() == -1 && r7 == 0) {
                throw new RuntimeException("Cannot accept edit list for processing (1)");
            } else if (edit.getMediaTime() >= 0 && r1 == 0) {
                throw new RuntimeException("Cannot accept edit list for processing (2)");
            } else if (edit.getMediaTime() == -1) {
                d += edit.getSegmentDuration();
            } else {
                d -= ((double) edit.getMediaTime()) / ((double) edit.getTimeScale());
                i4 = 0;
                i = i4;
            }
        }
        if (track.getCompositionTimeEntries() != null && track.getCompositionTimeEntries().size() > 0) {
            int[] copyOfRange = Arrays.copyOfRange(CompositionTimeToSample.blowupCompositionTimes(track.getCompositionTimeEntries()), 0, 50);
            int i6 = 0;
            while (i6 < copyOfRange.length) {
                copyOfRange[i6] = (int) (((long) copyOfRange[i6]) + j);
                i6++;
                j += track.getSampleDurations()[i6];
            }
            Arrays.sort(copyOfRange);
            d += ((double) copyOfRange[0]) / ((double) track.getTrackMetaData().getTimescale());
        }
        if (d < 0.0d) {
            getEdits().add(new Edit((long) ((-d) * ((double) getTrackMetaData().getTimescale())), getTrackMetaData().getTimescale(), 1.0d, ((double) getDuration()) / ((double) getTrackMetaData().getTimescale())));
            return;
        }
        if (d > 0.0d) {
            getEdits().add(new Edit(-1, getTrackMetaData().getTimescale(), 1.0d, d));
            getEdits().add(new Edit(0, getTrackMetaData().getTimescale(), 1.0d, ((double) getDuration()) / ((double) getTrackMetaData().getTimescale())));
        }
    }

    public void close() {
    }

    public String getHandler() {
        return "vide";
    }

    public SampleDescriptionBox getSampleDescriptionBox() {
        return this.stsd;
    }

    public long[] getSampleDurations() {
        return this.sampleDurations;
    }

    public List<Sample> getSamples() {
        return new C21141();
    }

    public long[] getSyncSamples() {
        return this.syncSamples;
    }

    public TrackMetaData getTrackMetaData() {
        return this.trackMetaData;
    }
}
