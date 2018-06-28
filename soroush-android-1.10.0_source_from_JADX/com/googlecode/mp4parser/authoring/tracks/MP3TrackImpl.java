package com.googlecode.mp4parser.authoring.tracks;

import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.sampleentry.AudioSampleEntry;
import com.googlecode.mp4parser.DataSource;
import com.googlecode.mp4parser.authoring.AbstractTrack;
import com.googlecode.mp4parser.authoring.Sample;
import com.googlecode.mp4parser.authoring.SampleImpl;
import com.googlecode.mp4parser.authoring.TrackMetaData;
import com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitReaderBuffer;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.DecoderConfigDescriptor;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ESDescriptor;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.SLConfigDescriptor;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

public class MP3TrackImpl extends AbstractTrack {
    private static final int[] BIT_RATE;
    private static final int ES_OBJECT_TYPE_INDICATION = 107;
    private static final int ES_STREAM_TYPE = 5;
    private static final int MPEG_L3 = 1;
    private static final int MPEG_V1 = 3;
    private static final int SAMPLES_PER_FRAME = 1152;
    private static final int[] SAMPLE_RATE;
    long avgBitRate;
    private final DataSource dataSource;
    private long[] durations;
    MP3Header firstHeader;
    long maxBitRate;
    SampleDescriptionBox sampleDescriptionBox;
    private List<Sample> samples;
    TrackMetaData trackMetaData;

    class MP3Header {
        int bitRate;
        int bitRateIndex;
        int channelCount;
        int channelMode;
        int layer;
        int mpegVersion;
        int padding;
        int protectionAbsent;
        int sampleFrequencyIndex;
        int sampleRate;

        MP3Header() {
        }

        int getFrameLength() {
            return ((IjkMediaMeta.FF_PROFILE_H264_HIGH_444 * this.bitRate) / this.sampleRate) + this.padding;
        }
    }

    static {
        int[] iArr = new int[4];
        iArr[0] = 44100;
        iArr[1] = 48000;
        iArr[2] = 32000;
        SAMPLE_RATE = iArr;
        iArr = new int[16];
        iArr[1] = 32000;
        iArr[2] = 40000;
        iArr[3] = 48000;
        iArr[4] = 56000;
        iArr[5] = 64000;
        iArr[6] = 80000;
        iArr[7] = 96000;
        iArr[8] = 112000;
        iArr[9] = 128000;
        iArr[10] = 160000;
        iArr[11] = 192000;
        iArr[12] = 224000;
        iArr[13] = 256000;
        iArr[14] = 320000;
        BIT_RATE = iArr;
    }

    public MP3TrackImpl(DataSource dataSource) {
        this(dataSource, "eng");
    }

    public MP3TrackImpl(DataSource dataSource, String str) {
        super(dataSource.toString());
        this.trackMetaData = new TrackMetaData();
        this.dataSource = dataSource;
        this.samples = new LinkedList();
        this.firstHeader = readSamples(dataSource);
        double d = ((double) this.firstHeader.sampleRate) / 1152.0d;
        double size = ((double) this.samples.size()) / d;
        LinkedList linkedList = new LinkedList();
        Iterator it = this.samples.iterator();
        long j = 0;
        while (true) {
            int i = 0;
            if (it.hasNext()) {
                int size2 = (int) ((Sample) it.next()).getSize();
                long j2 = j + ((long) size2);
                linkedList.add(Integer.valueOf(size2));
                while (((double) linkedList.size()) > d) {
                    linkedList.pop();
                }
                if (linkedList.size() == ((int) d)) {
                    Iterator it2 = linkedList.iterator();
                    while (it2.hasNext()) {
                        i += ((Integer) it2.next()).intValue();
                    }
                    double size3 = ((8.0d * ((double) i)) / ((double) linkedList.size())) * d;
                    if (size3 > ((double) this.maxBitRate)) {
                        this.maxBitRate = (long) ((int) size3);
                    }
                }
                j = j2;
            } else {
                this.avgBitRate = (long) ((int) (((double) (8 * j)) / size));
                this.sampleDescriptionBox = new SampleDescriptionBox();
                Box audioSampleEntry = new AudioSampleEntry(AudioSampleEntry.TYPE3);
                audioSampleEntry.setChannelCount(this.firstHeader.channelCount);
                audioSampleEntry.setSampleRate((long) this.firstHeader.sampleRate);
                audioSampleEntry.setDataReferenceIndex(1);
                audioSampleEntry.setSampleSize(16);
                Box eSDescriptorBox = new ESDescriptorBox();
                ESDescriptor eSDescriptor = new ESDescriptor();
                eSDescriptor.setEsId(0);
                SLConfigDescriptor sLConfigDescriptor = new SLConfigDescriptor();
                sLConfigDescriptor.setPredefined(2);
                eSDescriptor.setSlConfigDescriptor(sLConfigDescriptor);
                DecoderConfigDescriptor decoderConfigDescriptor = new DecoderConfigDescriptor();
                decoderConfigDescriptor.setObjectTypeIndication(107);
                decoderConfigDescriptor.setStreamType(5);
                decoderConfigDescriptor.setMaxBitRate(this.maxBitRate);
                decoderConfigDescriptor.setAvgBitRate(this.avgBitRate);
                eSDescriptor.setDecoderConfigDescriptor(decoderConfigDescriptor);
                eSDescriptorBox.setData(eSDescriptor.serialize());
                audioSampleEntry.addBox(eSDescriptorBox);
                this.sampleDescriptionBox.addBox(audioSampleEntry);
                this.trackMetaData.setCreationTime(new Date());
                this.trackMetaData.setModificationTime(new Date());
                this.trackMetaData.setLanguage(str);
                this.trackMetaData.setVolume(BallPulseIndicator.SCALE);
                this.trackMetaData.setTimescale((long) this.firstHeader.sampleRate);
                this.durations = new long[this.samples.size()];
                Arrays.fill(this.durations, 1152);
                return;
            }
        }
    }

    private MP3Header readMP3Header(DataSource dataSource) {
        MP3Header mP3Header = new MP3Header();
        ByteBuffer allocate = ByteBuffer.allocate(4);
        while (allocate.position() < 4) {
            if (dataSource.read(allocate) == -1) {
                return null;
            }
        }
        BitReaderBuffer bitReaderBuffer = new BitReaderBuffer((ByteBuffer) allocate.rewind());
        if (bitReaderBuffer.readBits(11) != 2047) {
            throw new IOException("Expected Start Word 0x7ff");
        }
        int i = 2;
        mP3Header.mpegVersion = bitReaderBuffer.readBits(2);
        if (mP3Header.mpegVersion != 3) {
            throw new IOException("Expected MPEG Version 1 (ISO/IEC 11172-3)");
        }
        mP3Header.layer = bitReaderBuffer.readBits(2);
        if (mP3Header.layer != 1) {
            throw new IOException("Expected Layer III");
        }
        mP3Header.protectionAbsent = bitReaderBuffer.readBits(1);
        mP3Header.bitRateIndex = bitReaderBuffer.readBits(4);
        mP3Header.bitRate = BIT_RATE[mP3Header.bitRateIndex];
        if (mP3Header.bitRate == 0) {
            throw new IOException("Unexpected (free/bad) bit rate");
        }
        mP3Header.sampleFrequencyIndex = bitReaderBuffer.readBits(2);
        mP3Header.sampleRate = SAMPLE_RATE[mP3Header.sampleFrequencyIndex];
        if (mP3Header.sampleRate == 0) {
            throw new IOException("Unexpected (reserved) sample rate frequency");
        }
        mP3Header.padding = bitReaderBuffer.readBits(1);
        bitReaderBuffer.readBits(1);
        mP3Header.channelMode = bitReaderBuffer.readBits(2);
        if (mP3Header.channelMode == 3) {
            i = 1;
        }
        mP3Header.channelCount = i;
        return mP3Header;
    }

    private MP3Header readSamples(DataSource dataSource) {
        MP3Header mP3Header = null;
        while (true) {
            long position = dataSource.position();
            MP3Header readMP3Header = readMP3Header(dataSource);
            if (readMP3Header == null) {
                return mP3Header;
            }
            if (mP3Header == null) {
                mP3Header = readMP3Header;
            }
            dataSource.position(position);
            ByteBuffer allocate = ByteBuffer.allocate(readMP3Header.getFrameLength());
            dataSource.read(allocate);
            allocate.rewind();
            this.samples.add(new SampleImpl(allocate));
        }
    }

    public void close() {
        this.dataSource.close();
    }

    public String getHandler() {
        return "soun";
    }

    public SampleDescriptionBox getSampleDescriptionBox() {
        return this.sampleDescriptionBox;
    }

    public long[] getSampleDurations() {
        return this.durations;
    }

    public List<Sample> getSamples() {
        return this.samples;
    }

    public TrackMetaData getTrackMetaData() {
        return this.trackMetaData;
    }

    public String toString() {
        return "MP3TrackImpl";
    }
}
