package com.googlecode.mp4parser.authoring.tracks;

import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.CompositionTimeToSample.Entry;
import com.coremedia.iso.boxes.SampleDependencyTypeBox;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.SubSampleInformationBox;
import com.coremedia.iso.boxes.sampleentry.AudioSampleEntry;
import com.googlecode.mp4parser.DataSource;
import com.googlecode.mp4parser.authoring.AbstractTrack;
import com.googlecode.mp4parser.authoring.Sample;
import com.googlecode.mp4parser.authoring.TrackMetaData;
import com.googlecode.mp4parser.boxes.AC3SpecificBox;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitReaderBuffer;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

public class AC3TrackImpl extends AbstractTrack {
    static int[][][][] bitRateAndFrameSizeTable;
    private final DataSource dataSource;
    private long[] duration;
    private SampleDescriptionBox sampleDescriptionBox;
    private List<Sample> samples;
    private TrackMetaData trackMetaData;

    class AnonymousClass1SampleImpl implements Sample {
        private final DataSource dataSource;
        private final long size;
        private final long start;

        public AnonymousClass1SampleImpl(long j, long j2, DataSource dataSource) {
            this.start = j;
            this.size = j2;
            this.dataSource = dataSource;
        }

        public ByteBuffer asByteBuffer() {
            try {
                return this.dataSource.map(this.start, this.size);
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }

        public long getSize() {
            return this.size;
        }

        public void writeTo(WritableByteChannel writableByteChannel) {
            this.dataSource.transferTo(this.start, this.size, writableByteChannel);
        }
    }

    static {
        int[][][][] iArr = (int[][][][]) Array.newInstance(int.class, new int[]{19, 2, 3, 2});
        bitRateAndFrameSizeTable = iArr;
        iArr[0][0][0][0] = 32;
        bitRateAndFrameSizeTable[0][1][0][0] = 32;
        bitRateAndFrameSizeTable[0][0][0][1] = 64;
        bitRateAndFrameSizeTable[0][1][0][1] = 64;
        bitRateAndFrameSizeTable[1][0][0][0] = 40;
        bitRateAndFrameSizeTable[1][1][0][0] = 40;
        bitRateAndFrameSizeTable[1][0][0][1] = 80;
        bitRateAndFrameSizeTable[1][1][0][1] = 80;
        bitRateAndFrameSizeTable[2][0][0][0] = 48;
        bitRateAndFrameSizeTable[2][1][0][0] = 48;
        bitRateAndFrameSizeTable[2][0][0][1] = 96;
        bitRateAndFrameSizeTable[2][1][0][1] = 96;
        bitRateAndFrameSizeTable[3][0][0][0] = 56;
        bitRateAndFrameSizeTable[3][1][0][0] = 56;
        bitRateAndFrameSizeTable[3][0][0][1] = 112;
        bitRateAndFrameSizeTable[3][1][0][1] = 112;
        bitRateAndFrameSizeTable[4][0][0][0] = 64;
        bitRateAndFrameSizeTable[4][1][0][0] = 64;
        bitRateAndFrameSizeTable[4][0][0][1] = 128;
        bitRateAndFrameSizeTable[4][1][0][1] = 128;
        bitRateAndFrameSizeTable[5][0][0][0] = 80;
        bitRateAndFrameSizeTable[5][1][0][0] = 80;
        bitRateAndFrameSizeTable[5][0][0][1] = 160;
        bitRateAndFrameSizeTable[5][1][0][1] = 160;
        bitRateAndFrameSizeTable[6][0][0][0] = 96;
        bitRateAndFrameSizeTable[6][1][0][0] = 96;
        bitRateAndFrameSizeTable[6][0][0][1] = 192;
        bitRateAndFrameSizeTable[6][1][0][1] = 192;
        bitRateAndFrameSizeTable[7][0][0][0] = 112;
        bitRateAndFrameSizeTable[7][1][0][0] = 112;
        bitRateAndFrameSizeTable[7][0][0][1] = 224;
        bitRateAndFrameSizeTable[7][1][0][1] = 224;
        bitRateAndFrameSizeTable[8][0][0][0] = 128;
        bitRateAndFrameSizeTable[8][1][0][0] = 128;
        bitRateAndFrameSizeTable[8][0][0][1] = 256;
        bitRateAndFrameSizeTable[8][1][0][1] = 256;
        bitRateAndFrameSizeTable[9][0][0][0] = 160;
        bitRateAndFrameSizeTable[9][1][0][0] = 160;
        bitRateAndFrameSizeTable[9][0][0][1] = 320;
        bitRateAndFrameSizeTable[9][1][0][1] = 320;
        bitRateAndFrameSizeTable[10][0][0][0] = 192;
        bitRateAndFrameSizeTable[10][1][0][0] = 192;
        bitRateAndFrameSizeTable[10][0][0][1] = 384;
        bitRateAndFrameSizeTable[10][1][0][1] = 384;
        bitRateAndFrameSizeTable[11][0][0][0] = 224;
        bitRateAndFrameSizeTable[11][1][0][0] = 224;
        bitRateAndFrameSizeTable[11][0][0][1] = 448;
        bitRateAndFrameSizeTable[11][1][0][1] = 448;
        bitRateAndFrameSizeTable[12][0][0][0] = 256;
        bitRateAndFrameSizeTable[12][1][0][0] = 256;
        bitRateAndFrameSizeTable[12][0][0][1] = 512;
        bitRateAndFrameSizeTable[12][1][0][1] = 512;
        bitRateAndFrameSizeTable[13][0][0][0] = 320;
        bitRateAndFrameSizeTable[13][1][0][0] = 320;
        bitRateAndFrameSizeTable[13][0][0][1] = 640;
        bitRateAndFrameSizeTable[13][1][0][1] = 640;
        bitRateAndFrameSizeTable[14][0][0][0] = 384;
        bitRateAndFrameSizeTable[14][1][0][0] = 384;
        bitRateAndFrameSizeTable[14][0][0][1] = 768;
        bitRateAndFrameSizeTable[14][1][0][1] = 768;
        bitRateAndFrameSizeTable[15][0][0][0] = 448;
        bitRateAndFrameSizeTable[15][1][0][0] = 448;
        bitRateAndFrameSizeTable[15][0][0][1] = 896;
        bitRateAndFrameSizeTable[15][1][0][1] = 896;
        bitRateAndFrameSizeTable[16][0][0][0] = 512;
        bitRateAndFrameSizeTable[16][1][0][0] = 512;
        bitRateAndFrameSizeTable[16][0][0][1] = 1024;
        bitRateAndFrameSizeTable[16][1][0][1] = 1024;
        bitRateAndFrameSizeTable[17][0][0][0] = 576;
        bitRateAndFrameSizeTable[17][1][0][0] = 576;
        bitRateAndFrameSizeTable[17][0][0][1] = 1152;
        bitRateAndFrameSizeTable[17][1][0][1] = 1152;
        bitRateAndFrameSizeTable[18][0][0][0] = 640;
        bitRateAndFrameSizeTable[18][1][0][0] = 640;
        bitRateAndFrameSizeTable[18][0][0][1] = 1280;
        bitRateAndFrameSizeTable[18][1][0][1] = 1280;
        bitRateAndFrameSizeTable[0][0][1][0] = 32;
        bitRateAndFrameSizeTable[0][1][1][0] = 32;
        bitRateAndFrameSizeTable[0][0][1][1] = 69;
        bitRateAndFrameSizeTable[0][1][1][1] = 70;
        bitRateAndFrameSizeTable[1][0][1][0] = 40;
        bitRateAndFrameSizeTable[1][1][1][0] = 40;
        bitRateAndFrameSizeTable[1][0][1][1] = 87;
        bitRateAndFrameSizeTable[1][1][1][1] = 88;
        bitRateAndFrameSizeTable[2][0][1][0] = 48;
        bitRateAndFrameSizeTable[2][1][1][0] = 48;
        bitRateAndFrameSizeTable[2][0][1][1] = 104;
        bitRateAndFrameSizeTable[2][1][1][1] = 105;
        bitRateAndFrameSizeTable[3][0][1][0] = 56;
        bitRateAndFrameSizeTable[3][1][1][0] = 56;
        bitRateAndFrameSizeTable[3][0][1][1] = 121;
        bitRateAndFrameSizeTable[3][1][1][1] = IjkMediaMeta.FF_PROFILE_H264_HIGH_422;
        bitRateAndFrameSizeTable[4][0][1][0] = 64;
        bitRateAndFrameSizeTable[4][1][1][0] = 64;
        bitRateAndFrameSizeTable[4][0][1][1] = 139;
        bitRateAndFrameSizeTable[4][1][1][1] = 140;
        bitRateAndFrameSizeTable[5][0][1][0] = 80;
        bitRateAndFrameSizeTable[5][1][1][0] = 80;
        bitRateAndFrameSizeTable[5][0][1][1] = 174;
        bitRateAndFrameSizeTable[5][1][1][1] = 175;
        bitRateAndFrameSizeTable[6][0][1][0] = 96;
        bitRateAndFrameSizeTable[6][1][1][0] = 96;
        bitRateAndFrameSizeTable[6][0][1][1] = 208;
        bitRateAndFrameSizeTable[6][1][1][1] = 209;
        bitRateAndFrameSizeTable[7][0][1][0] = 112;
        bitRateAndFrameSizeTable[7][1][1][0] = 112;
        bitRateAndFrameSizeTable[7][0][1][1] = 243;
        bitRateAndFrameSizeTable[7][1][1][1] = 244;
        bitRateAndFrameSizeTable[8][0][1][0] = 128;
        bitRateAndFrameSizeTable[8][1][1][0] = 128;
        bitRateAndFrameSizeTable[8][0][1][1] = 278;
        bitRateAndFrameSizeTable[8][1][1][1] = 279;
        bitRateAndFrameSizeTable[9][0][1][0] = 160;
        bitRateAndFrameSizeTable[9][1][1][0] = 160;
        bitRateAndFrameSizeTable[9][0][1][1] = 348;
        bitRateAndFrameSizeTable[9][1][1][1] = 349;
        bitRateAndFrameSizeTable[10][0][1][0] = 192;
        bitRateAndFrameSizeTable[10][1][1][0] = 192;
        bitRateAndFrameSizeTable[10][0][1][1] = 417;
        bitRateAndFrameSizeTable[10][1][1][1] = 418;
        bitRateAndFrameSizeTable[11][0][1][0] = 224;
        bitRateAndFrameSizeTable[11][1][1][0] = 224;
        bitRateAndFrameSizeTable[11][0][1][1] = 487;
        bitRateAndFrameSizeTable[11][1][1][1] = 488;
        bitRateAndFrameSizeTable[12][0][1][0] = 256;
        bitRateAndFrameSizeTable[12][1][1][0] = 256;
        bitRateAndFrameSizeTable[12][0][1][1] = 557;
        bitRateAndFrameSizeTable[12][1][1][1] = 558;
        bitRateAndFrameSizeTable[13][0][1][0] = 320;
        bitRateAndFrameSizeTable[13][1][1][0] = 320;
        bitRateAndFrameSizeTable[13][0][1][1] = 696;
        bitRateAndFrameSizeTable[13][1][1][1] = 697;
        bitRateAndFrameSizeTable[14][0][1][0] = 384;
        bitRateAndFrameSizeTable[14][1][1][0] = 384;
        bitRateAndFrameSizeTable[14][0][1][1] = 835;
        bitRateAndFrameSizeTable[14][1][1][1] = 836;
        bitRateAndFrameSizeTable[15][0][1][0] = 448;
        bitRateAndFrameSizeTable[15][1][1][0] = 448;
        bitRateAndFrameSizeTable[15][0][1][1] = 975;
        bitRateAndFrameSizeTable[15][1][1][1] = 975;
        bitRateAndFrameSizeTable[16][0][1][0] = 512;
        bitRateAndFrameSizeTable[16][1][1][0] = 512;
        bitRateAndFrameSizeTable[16][0][1][1] = 1114;
        bitRateAndFrameSizeTable[16][1][1][1] = 1115;
        bitRateAndFrameSizeTable[17][0][1][0] = 576;
        bitRateAndFrameSizeTable[17][1][1][0] = 576;
        bitRateAndFrameSizeTable[17][0][1][1] = 1253;
        bitRateAndFrameSizeTable[17][1][1][1] = 1254;
        bitRateAndFrameSizeTable[18][0][1][0] = 640;
        bitRateAndFrameSizeTable[18][1][1][0] = 640;
        bitRateAndFrameSizeTable[18][0][1][1] = 1393;
        bitRateAndFrameSizeTable[18][1][1][1] = 1394;
        bitRateAndFrameSizeTable[0][0][2][0] = 32;
        bitRateAndFrameSizeTable[0][1][2][0] = 32;
        bitRateAndFrameSizeTable[0][0][2][1] = 96;
        bitRateAndFrameSizeTable[0][1][2][1] = 96;
        bitRateAndFrameSizeTable[1][0][2][0] = 40;
        bitRateAndFrameSizeTable[1][1][2][0] = 40;
        bitRateAndFrameSizeTable[1][0][2][1] = 120;
        bitRateAndFrameSizeTable[1][1][2][1] = 120;
        bitRateAndFrameSizeTable[2][0][2][0] = 48;
        bitRateAndFrameSizeTable[2][1][2][0] = 48;
        bitRateAndFrameSizeTable[2][0][2][1] = 144;
        bitRateAndFrameSizeTable[2][1][2][1] = 144;
        bitRateAndFrameSizeTable[3][0][2][0] = 56;
        bitRateAndFrameSizeTable[3][1][2][0] = 56;
        bitRateAndFrameSizeTable[3][0][2][1] = 168;
        bitRateAndFrameSizeTable[3][1][2][1] = 168;
        bitRateAndFrameSizeTable[4][0][2][0] = 64;
        bitRateAndFrameSizeTable[4][1][2][0] = 64;
        bitRateAndFrameSizeTable[4][0][2][1] = 192;
        bitRateAndFrameSizeTable[4][1][2][1] = 192;
        bitRateAndFrameSizeTable[5][0][2][0] = 80;
        bitRateAndFrameSizeTable[5][1][2][0] = 80;
        bitRateAndFrameSizeTable[5][0][2][1] = 240;
        bitRateAndFrameSizeTable[5][1][2][1] = 240;
        bitRateAndFrameSizeTable[6][0][2][0] = 96;
        bitRateAndFrameSizeTable[6][1][2][0] = 96;
        bitRateAndFrameSizeTable[6][0][2][1] = 288;
        bitRateAndFrameSizeTable[6][1][2][1] = 288;
        bitRateAndFrameSizeTable[7][0][2][0] = 112;
        bitRateAndFrameSizeTable[7][1][2][0] = 112;
        bitRateAndFrameSizeTable[7][0][2][1] = 336;
        bitRateAndFrameSizeTable[7][1][2][1] = 336;
        bitRateAndFrameSizeTable[8][0][2][0] = 128;
        bitRateAndFrameSizeTable[8][1][2][0] = 128;
        bitRateAndFrameSizeTable[8][0][2][1] = 384;
        bitRateAndFrameSizeTable[8][1][2][1] = 384;
        bitRateAndFrameSizeTable[9][0][2][0] = 160;
        bitRateAndFrameSizeTable[9][1][2][0] = 160;
        bitRateAndFrameSizeTable[9][0][2][1] = 480;
        bitRateAndFrameSizeTable[9][1][2][1] = 480;
        bitRateAndFrameSizeTable[10][0][2][0] = 192;
        bitRateAndFrameSizeTable[10][1][2][0] = 192;
        bitRateAndFrameSizeTable[10][0][2][1] = 576;
        bitRateAndFrameSizeTable[10][1][2][1] = 576;
        bitRateAndFrameSizeTable[11][0][2][0] = 224;
        bitRateAndFrameSizeTable[11][1][2][0] = 224;
        bitRateAndFrameSizeTable[11][0][2][1] = 672;
        bitRateAndFrameSizeTable[11][1][2][1] = 672;
        bitRateAndFrameSizeTable[12][0][2][0] = 256;
        bitRateAndFrameSizeTable[12][1][2][0] = 256;
        bitRateAndFrameSizeTable[12][0][2][1] = 768;
        bitRateAndFrameSizeTable[12][1][2][1] = 768;
        bitRateAndFrameSizeTable[13][0][2][0] = 320;
        bitRateAndFrameSizeTable[13][1][2][0] = 320;
        bitRateAndFrameSizeTable[13][0][2][1] = 960;
        bitRateAndFrameSizeTable[13][1][2][1] = 960;
        bitRateAndFrameSizeTable[14][0][2][0] = 384;
        bitRateAndFrameSizeTable[14][1][2][0] = 384;
        bitRateAndFrameSizeTable[14][0][2][1] = 1152;
        bitRateAndFrameSizeTable[14][1][2][1] = 1152;
        bitRateAndFrameSizeTable[15][0][2][0] = 448;
        bitRateAndFrameSizeTable[15][1][2][0] = 448;
        bitRateAndFrameSizeTable[15][0][2][1] = 1344;
        bitRateAndFrameSizeTable[15][1][2][1] = 1344;
        bitRateAndFrameSizeTable[16][0][2][0] = 512;
        bitRateAndFrameSizeTable[16][1][2][0] = 512;
        bitRateAndFrameSizeTable[16][0][2][1] = 1536;
        bitRateAndFrameSizeTable[16][1][2][1] = 1536;
        bitRateAndFrameSizeTable[17][0][2][0] = 576;
        bitRateAndFrameSizeTable[17][1][2][0] = 576;
        bitRateAndFrameSizeTable[17][0][2][1] = 1728;
        bitRateAndFrameSizeTable[17][1][2][1] = 1728;
        bitRateAndFrameSizeTable[18][0][2][0] = 640;
        bitRateAndFrameSizeTable[18][1][2][0] = 640;
        bitRateAndFrameSizeTable[18][0][2][1] = 1920;
        bitRateAndFrameSizeTable[18][1][2][1] = 1920;
    }

    public AC3TrackImpl(DataSource dataSource) {
        this(dataSource, "eng");
    }

    public AC3TrackImpl(DataSource dataSource, String str) {
        super(dataSource.toString());
        this.trackMetaData = new TrackMetaData();
        this.dataSource = dataSource;
        this.trackMetaData.setLanguage(str);
        this.samples = readSamples();
        this.sampleDescriptionBox = new SampleDescriptionBox();
        Object createAudioSampleEntry = createAudioSampleEntry();
        this.sampleDescriptionBox.addBox(createAudioSampleEntry);
        this.trackMetaData.setCreationTime(new Date());
        this.trackMetaData.setModificationTime(new Date());
        this.trackMetaData.setLanguage(str);
        this.trackMetaData.setTimescale(createAudioSampleEntry.getSampleRate());
        this.trackMetaData.setVolume(BallPulseIndicator.SCALE);
    }

    private AudioSampleEntry createAudioSampleEntry() {
        BitReaderBuffer bitReaderBuffer = new BitReaderBuffer(((Sample) this.samples.get(0)).asByteBuffer());
        if (bitReaderBuffer.readBits(16) != 2935) {
            throw new RuntimeException("Stream doesn't seem to be AC3");
        }
        int i;
        bitReaderBuffer.readBits(16);
        int readBits = bitReaderBuffer.readBits(2);
        switch (readBits) {
            case 0:
                i = 48000;
                break;
            case 1:
                i = 44100;
                break;
            case 2:
                i = 32000;
                break;
            default:
                throw new RuntimeException("Unsupported Sample Rate");
        }
        int readBits2 = bitReaderBuffer.readBits(6);
        int readBits3 = bitReaderBuffer.readBits(5);
        int readBits4 = bitReaderBuffer.readBits(3);
        int readBits5 = bitReaderBuffer.readBits(3);
        if (readBits3 == 16) {
            throw new RuntimeException("You cannot read E-AC-3 track with AC3TrackImpl.class - user EC3TrackImpl.class");
        }
        if (readBits3 == 9) {
            i /= 2;
        } else if (!(readBits3 == 8 || readBits3 == 6)) {
            throw new RuntimeException("Unsupported bsid");
        }
        if (readBits5 != 1 && (readBits5 & 1) == 1) {
            bitReaderBuffer.readBits(2);
        }
        if ((readBits5 & 4) != 0) {
            bitReaderBuffer.readBits(2);
        }
        if (readBits5 == 2) {
            bitReaderBuffer.readBits(2);
        }
        switch (readBits5) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                int readBits6 = bitReaderBuffer.readBits(1);
                AudioSampleEntry audioSampleEntry = new AudioSampleEntry(AudioSampleEntry.TYPE8);
                audioSampleEntry.setChannelCount(2);
                audioSampleEntry.setSampleRate((long) i);
                audioSampleEntry.setDataReferenceIndex(1);
                audioSampleEntry.setSampleSize(16);
                Box aC3SpecificBox = new AC3SpecificBox();
                aC3SpecificBox.setAcmod(readBits5);
                aC3SpecificBox.setBitRateCode(readBits2 >> 1);
                aC3SpecificBox.setBsid(readBits3);
                aC3SpecificBox.setBsmod(readBits4);
                aC3SpecificBox.setFscod(readBits);
                aC3SpecificBox.setLfeon(readBits6);
                aC3SpecificBox.setReserved(0);
                audioSampleEntry.addBox(aC3SpecificBox);
                return audioSampleEntry;
            default:
                throw new RuntimeException("Unsupported acmod");
        }
    }

    private int getFrameSize(int i, int i2) {
        int i3 = i >>> 1;
        i &= 1;
        if (i3 <= 18 && i <= 1) {
            if (i2 <= 2) {
                return 2 * bitRateAndFrameSizeTable[i3][i][i2][1];
            }
        }
        throw new RuntimeException("Cannot determine framesize of current sample");
    }

    private List<Sample> readSamples() {
        ByteBuffer allocate = ByteBuffer.allocate(5);
        List<Sample> arrayList = new ArrayList();
        while (-1 != this.dataSource.read(allocate)) {
            long frameSize = (long) getFrameSize(allocate.get(4) & 63, allocate.get(4) >> 6);
            arrayList.add(new AnonymousClass1SampleImpl(this.dataSource.position() - 5, frameSize, this.dataSource));
            this.dataSource.position((this.dataSource.position() - 5) + frameSize);
            allocate.rewind();
        }
        this.duration = new long[arrayList.size()];
        Arrays.fill(this.duration, 1536);
        return arrayList;
    }

    public void close() {
        this.dataSource.close();
    }

    public List<Entry> getCompositionTimeEntries() {
        return null;
    }

    public String getHandler() {
        return "soun";
    }

    public List<SampleDependencyTypeBox.Entry> getSampleDependencies() {
        return null;
    }

    public SampleDescriptionBox getSampleDescriptionBox() {
        return this.sampleDescriptionBox;
    }

    public synchronized long[] getSampleDurations() {
        return this.duration;
    }

    public List<Sample> getSamples() {
        return this.samples;
    }

    public SubSampleInformationBox getSubsampleInformationBox() {
        return null;
    }

    public long[] getSyncSamples() {
        return null;
    }

    public TrackMetaData getTrackMetaData() {
        return this.trackMetaData;
    }
}
