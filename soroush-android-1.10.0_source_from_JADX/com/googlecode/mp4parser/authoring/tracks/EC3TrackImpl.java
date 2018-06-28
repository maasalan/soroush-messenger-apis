package com.googlecode.mp4parser.authoring.tracks;

import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.CompositionTimeToSample;
import com.coremedia.iso.boxes.SampleDependencyTypeBox;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.SubSampleInformationBox;
import com.coremedia.iso.boxes.sampleentry.AudioSampleEntry;
import com.googlecode.mp4parser.DataSource;
import com.googlecode.mp4parser.authoring.AbstractTrack;
import com.googlecode.mp4parser.authoring.Sample;
import com.googlecode.mp4parser.authoring.TrackMetaData;
import com.googlecode.mp4parser.boxes.EC3SpecificBox;
import com.googlecode.mp4parser.boxes.EC3SpecificBox.Entry;
import com.googlecode.mp4parser.util.CastUtils;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;
import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;

public class EC3TrackImpl extends AbstractTrack {
    private static final long MAX_FRAMES_PER_MMAP = 20;
    private List<BitStreamInfo> bitStreamInfos = new LinkedList();
    private int bitrate;
    private final DataSource dataSource;
    private long[] decodingTimes;
    private int frameSize;
    SampleDescriptionBox sampleDescriptionBox;
    private List<Sample> samples;
    TrackMetaData trackMetaData = new TrackMetaData();

    public static class BitStreamInfo extends Entry {
        public int bitrate;
        public int chanmap;
        public int frameSize;
        public int samplerate;
        public int strmtyp;
        public int substreamid;

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder("BitStreamInfo{frameSize=");
            stringBuilder.append(this.frameSize);
            stringBuilder.append(", substreamid=");
            stringBuilder.append(this.substreamid);
            stringBuilder.append(", bitrate=");
            stringBuilder.append(this.bitrate);
            stringBuilder.append(", samplerate=");
            stringBuilder.append(this.samplerate);
            stringBuilder.append(", strmtyp=");
            stringBuilder.append(this.strmtyp);
            stringBuilder.append(", chanmap=");
            stringBuilder.append(this.chanmap);
            stringBuilder.append('}');
            return stringBuilder.toString();
        }
    }

    public EC3TrackImpl(DataSource dataSource) {
        super(dataSource.toString());
        this.dataSource = dataSource;
        int i = 0;
        while (i == 0) {
            BitStreamInfo readVariables = readVariables();
            if (readVariables == null) {
                throw new IOException();
            }
            for (BitStreamInfo bitStreamInfo : this.bitStreamInfos) {
                if (readVariables.strmtyp != 1 && bitStreamInfo.substreamid == readVariables.substreamid) {
                    i = 1;
                }
            }
            if (i == 0) {
                this.bitStreamInfos.add(readVariables);
            }
        }
        if (this.bitStreamInfos.size() == 0) {
            throw new IOException();
        }
        i = ((BitStreamInfo) this.bitStreamInfos.get(0)).samplerate;
        this.sampleDescriptionBox = new SampleDescriptionBox();
        Box audioSampleEntry = new AudioSampleEntry(AudioSampleEntry.TYPE9);
        audioSampleEntry.setChannelCount(2);
        long j = (long) i;
        audioSampleEntry.setSampleRate(j);
        audioSampleEntry.setDataReferenceIndex(1);
        audioSampleEntry.setSampleSize(16);
        Box eC3SpecificBox = new EC3SpecificBox();
        int[] iArr = new int[this.bitStreamInfos.size()];
        int[] iArr2 = new int[this.bitStreamInfos.size()];
        for (BitStreamInfo bitStreamInfo2 : this.bitStreamInfos) {
            if (bitStreamInfo2.strmtyp == 1) {
                int i2 = bitStreamInfo2.substreamid;
                iArr[i2] = iArr[i2] + 1;
                iArr2[bitStreamInfo2.substreamid] = ((bitStreamInfo2.chanmap >> 5) & 255) | ((bitStreamInfo2.chanmap >> 6) & 256);
            }
        }
        for (BitStreamInfo bitStreamInfo3 : this.bitStreamInfos) {
            if (bitStreamInfo3.strmtyp != 1) {
                Entry entry = new Entry();
                entry.fscod = bitStreamInfo3.fscod;
                entry.bsid = bitStreamInfo3.bsid;
                entry.bsmod = bitStreamInfo3.bsmod;
                entry.acmod = bitStreamInfo3.acmod;
                entry.lfeon = bitStreamInfo3.lfeon;
                entry.reserved = 0;
                entry.num_dep_sub = iArr[bitStreamInfo3.substreamid];
                entry.chan_loc = iArr2[bitStreamInfo3.substreamid];
                entry.reserved2 = 0;
                eC3SpecificBox.addEntry(entry);
            }
            this.bitrate += bitStreamInfo3.bitrate;
            this.frameSize += bitStreamInfo3.frameSize;
        }
        eC3SpecificBox.setDataRate(this.bitrate / IjkMediaCodecInfo.RANK_MAX);
        audioSampleEntry.addBox(eC3SpecificBox);
        this.sampleDescriptionBox.addBox(audioSampleEntry);
        this.trackMetaData.setCreationTime(new Date());
        this.trackMetaData.setModificationTime(new Date());
        this.trackMetaData.setTimescale(j);
        this.trackMetaData.setVolume(BallPulseIndicator.SCALE);
        dataSource.position(0);
        this.samples = readSamples();
        this.decodingTimes = new long[this.samples.size()];
        Arrays.fill(this.decodingTimes, 1536);
    }

    private List<Sample> readSamples() {
        int l2i = CastUtils.l2i((this.dataSource.size() - this.dataSource.position()) / ((long) this.frameSize));
        List<Sample> arrayList = new ArrayList(l2i);
        for (int i = 0; i < l2i; i++) {
            final int i2 = this.frameSize * i;
            arrayList.add(new Sample() {
                public ByteBuffer asByteBuffer() {
                    try {
                        return EC3TrackImpl.this.dataSource.map((long) i2, (long) EC3TrackImpl.this.frameSize);
                    } catch (Throwable e) {
                        throw new RuntimeException(e);
                    }
                }

                public long getSize() {
                    return (long) EC3TrackImpl.this.frameSize;
                }

                public void writeTo(WritableByteChannel writableByteChannel) {
                    EC3TrackImpl.this.dataSource.transferTo((long) i2, (long) EC3TrackImpl.this.frameSize, writableByteChannel);
                }
            });
        }
        return arrayList;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.googlecode.mp4parser.authoring.tracks.EC3TrackImpl.BitStreamInfo readVariables() {
        /*
        r18 = this;
        r0 = r18;
        r1 = r0.dataSource;
        r1 = r1.position();
        r3 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        r3 = java.nio.ByteBuffer.allocate(r3);
        r4 = r0.dataSource;
        r4.read(r3);
        r3.rewind();
        r4 = new com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitReaderBuffer;
        r4.<init>(r3);
        r3 = 16;
        r5 = r4.readBits(r3);
        r6 = 0;
        r7 = 2935; // 0xb77 float:4.113E-42 double:1.45E-320;
        if (r5 == r7) goto L_0x0027;
    L_0x0026:
        return r6;
    L_0x0027:
        r5 = new com.googlecode.mp4parser.authoring.tracks.EC3TrackImpl$BitStreamInfo;
        r5.<init>();
        r7 = 2;
        r8 = r4.readBits(r7);
        r5.strmtyp = r8;
        r8 = 3;
        r9 = r4.readBits(r8);
        r5.substreamid = r9;
        r9 = 11;
        r9 = r4.readBits(r9);
        r10 = 1;
        r9 = r9 + r10;
        r9 = r9 * r7;
        r5.frameSize = r9;
        r9 = r4.readBits(r7);
        r5.fscod = r9;
        r9 = -1;
        r11 = r5.fscod;
        if (r11 != r8) goto L_0x0056;
    L_0x0050:
        r9 = r4.readBits(r7);
        r11 = r8;
        goto L_0x005a;
    L_0x0056:
        r11 = r4.readBits(r7);
    L_0x005a:
        r13 = 6;
        switch(r11) {
            case 0: goto L_0x0066;
            case 1: goto L_0x0064;
            case 2: goto L_0x0062;
            case 3: goto L_0x0060;
            default: goto L_0x005e;
        };
    L_0x005e:
        r14 = 0;
        goto L_0x0067;
    L_0x0060:
        r14 = r13;
        goto L_0x0067;
    L_0x0062:
        r14 = r8;
        goto L_0x0067;
    L_0x0064:
        r14 = r7;
        goto L_0x0067;
    L_0x0066:
        r14 = r10;
    L_0x0067:
        r15 = r5.frameSize;
        r16 = r13 / r14;
        r15 = r15 * r16;
        r5.frameSize = r15;
        r15 = r4.readBits(r8);
        r5.acmod = r15;
        r15 = r4.readBits(r10);
        r5.lfeon = r15;
        r15 = 5;
        r6 = r4.readBits(r15);
        r5.bsid = r6;
        r4.readBits(r15);
        r6 = r4.readBits(r10);
        r12 = 8;
        if (r10 != r6) goto L_0x0090;
    L_0x008d:
        r4.readBits(r12);
    L_0x0090:
        r6 = r5.acmod;
        if (r6 != 0) goto L_0x00a0;
    L_0x0094:
        r4.readBits(r15);
        r6 = r4.readBits(r10);
        if (r10 != r6) goto L_0x00a0;
    L_0x009d:
        r4.readBits(r12);
    L_0x00a0:
        r6 = r5.strmtyp;
        if (r10 != r6) goto L_0x00b0;
    L_0x00a4:
        r6 = r4.readBits(r10);
        if (r10 != r6) goto L_0x00b0;
    L_0x00aa:
        r3 = r4.readBits(r3);
        r5.chanmap = r3;
    L_0x00b0:
        r3 = r4.readBits(r10);
        if (r10 != r3) goto L_0x01e5;
    L_0x00b6:
        r3 = r5.acmod;
        if (r3 <= r7) goto L_0x00bd;
    L_0x00ba:
        r4.readBits(r7);
    L_0x00bd:
        r3 = r5.acmod;
        r3 = r3 & r10;
        if (r10 != r3) goto L_0x00cc;
    L_0x00c2:
        r3 = r5.acmod;
        if (r3 <= r7) goto L_0x00cc;
    L_0x00c6:
        r4.readBits(r8);
        r4.readBits(r8);
    L_0x00cc:
        r3 = r5.acmod;
        r6 = 4;
        r3 = r3 & r6;
        if (r3 <= 0) goto L_0x00d8;
    L_0x00d2:
        r4.readBits(r8);
        r4.readBits(r8);
    L_0x00d8:
        r3 = r5.lfeon;
        if (r10 != r3) goto L_0x00e5;
    L_0x00dc:
        r3 = r4.readBits(r10);
        if (r10 != r3) goto L_0x00e5;
    L_0x00e2:
        r4.readBits(r15);
    L_0x00e5:
        r3 = r5.strmtyp;
        if (r3 != 0) goto L_0x01e5;
    L_0x00e9:
        r3 = r4.readBits(r10);
        if (r10 != r3) goto L_0x00f2;
    L_0x00ef:
        r4.readBits(r13);
    L_0x00f2:
        r3 = r5.acmod;
        if (r3 != 0) goto L_0x00ff;
    L_0x00f6:
        r3 = r4.readBits(r10);
        if (r10 != r3) goto L_0x00ff;
    L_0x00fc:
        r4.readBits(r13);
    L_0x00ff:
        r3 = r4.readBits(r10);
        if (r10 != r3) goto L_0x0108;
    L_0x0105:
        r4.readBits(r13);
    L_0x0108:
        r3 = r4.readBits(r7);
        if (r10 != r3) goto L_0x0113;
    L_0x010e:
        r4.readBits(r15);
        goto L_0x01ad;
    L_0x0113:
        if (r7 != r3) goto L_0x011c;
    L_0x0115:
        r3 = 12;
        r4.readBits(r3);
        goto L_0x01ad;
    L_0x011c:
        if (r8 != r3) goto L_0x01ad;
    L_0x011e:
        r3 = r4.readBits(r15);
        r13 = r4.readBits(r10);
        if (r10 != r13) goto L_0x0182;
    L_0x0128:
        r4.readBits(r15);
        r13 = r4.readBits(r10);
        if (r10 != r13) goto L_0x0134;
    L_0x0131:
        r4.readBits(r6);
    L_0x0134:
        r13 = r4.readBits(r10);
        if (r10 != r13) goto L_0x013d;
    L_0x013a:
        r4.readBits(r6);
    L_0x013d:
        r13 = r4.readBits(r10);
        if (r10 != r13) goto L_0x0146;
    L_0x0143:
        r4.readBits(r6);
    L_0x0146:
        r13 = r4.readBits(r10);
        if (r10 != r13) goto L_0x014f;
    L_0x014c:
        r4.readBits(r6);
    L_0x014f:
        r13 = r4.readBits(r10);
        if (r10 != r13) goto L_0x0158;
    L_0x0155:
        r4.readBits(r6);
    L_0x0158:
        r13 = r4.readBits(r10);
        if (r10 != r13) goto L_0x0161;
    L_0x015e:
        r4.readBits(r6);
    L_0x0161:
        r13 = r4.readBits(r10);
        if (r10 != r13) goto L_0x016a;
    L_0x0167:
        r4.readBits(r6);
    L_0x016a:
        r13 = r4.readBits(r10);
        if (r10 != r13) goto L_0x0182;
    L_0x0170:
        r13 = r4.readBits(r10);
        if (r10 != r13) goto L_0x0179;
    L_0x0176:
        r4.readBits(r6);
    L_0x0179:
        r13 = r4.readBits(r10);
        if (r10 != r13) goto L_0x0182;
    L_0x017f:
        r4.readBits(r6);
    L_0x0182:
        r6 = r4.readBits(r10);
        if (r10 != r6) goto L_0x019e;
    L_0x0188:
        r4.readBits(r15);
        r6 = r4.readBits(r10);
        if (r10 != r6) goto L_0x019e;
    L_0x0191:
        r6 = 7;
        r4.readBits(r6);
        r6 = r4.readBits(r10);
        if (r10 != r6) goto L_0x019e;
    L_0x019b:
        r4.readBits(r12);
    L_0x019e:
        r6 = 0;
    L_0x019f:
        r13 = r3 + 2;
        if (r6 < r13) goto L_0x01a7;
    L_0x01a3:
        r4.byteSync();
        goto L_0x01ad;
    L_0x01a7:
        r4.readBits(r12);
        r6 = r6 + 1;
        goto L_0x019f;
    L_0x01ad:
        r3 = r5.acmod;
        if (r3 >= r7) goto L_0x01e5;
    L_0x01b1:
        r3 = r4.readBits(r10);
        r6 = 14;
        if (r10 != r3) goto L_0x01bc;
    L_0x01b9:
        r4.readBits(r6);
    L_0x01bc:
        r3 = r5.acmod;
        if (r3 != 0) goto L_0x01c9;
    L_0x01c0:
        r3 = r4.readBits(r10);
        if (r10 != r3) goto L_0x01c9;
    L_0x01c6:
        r4.readBits(r6);
    L_0x01c9:
        r3 = r4.readBits(r10);
        if (r10 != r3) goto L_0x01e5;
    L_0x01cf:
        if (r11 != 0) goto L_0x01d5;
    L_0x01d1:
        r4.readBits(r15);
        goto L_0x01e5;
    L_0x01d5:
        r3 = 0;
    L_0x01d6:
        if (r3 < r14) goto L_0x01d9;
    L_0x01d8:
        goto L_0x01e5;
    L_0x01d9:
        r6 = r4.readBits(r10);
        if (r10 != r6) goto L_0x01e2;
    L_0x01df:
        r4.readBits(r15);
    L_0x01e2:
        r3 = r3 + 1;
        goto L_0x01d6;
    L_0x01e5:
        r3 = r4.readBits(r10);
        if (r10 != r3) goto L_0x01f1;
    L_0x01eb:
        r3 = r4.readBits(r8);
        r5.bsmod = r3;
    L_0x01f1:
        r3 = r5.fscod;
        switch(r3) {
            case 0: goto L_0x020d;
            case 1: goto L_0x0209;
            case 2: goto L_0x0206;
            case 3: goto L_0x01f7;
            default: goto L_0x01f6;
        };
    L_0x01f6:
        goto L_0x0212;
    L_0x01f7:
        switch(r9) {
            case 0: goto L_0x0203;
            case 1: goto L_0x0200;
            case 2: goto L_0x01fd;
            case 3: goto L_0x01fb;
            default: goto L_0x01fa;
        };
    L_0x01fa:
        goto L_0x0212;
    L_0x01fb:
        r3 = 0;
        goto L_0x0210;
    L_0x01fd:
        r3 = 16000; // 0x3e80 float:2.2421E-41 double:7.905E-320;
        goto L_0x0210;
    L_0x0200:
        r3 = 22050; // 0x5622 float:3.0899E-41 double:1.0894E-319;
        goto L_0x0210;
    L_0x0203:
        r3 = 24000; // 0x5dc0 float:3.3631E-41 double:1.18576E-319;
        goto L_0x0210;
    L_0x0206:
        r3 = 32000; // 0x7d00 float:4.4842E-41 double:1.581E-319;
        goto L_0x0210;
    L_0x0209:
        r3 = 44100; // 0xac44 float:6.1797E-41 double:2.17883E-319;
        goto L_0x0210;
    L_0x020d:
        r3 = 48000; // 0xbb80 float:6.7262E-41 double:2.3715E-319;
    L_0x0210:
        r5.samplerate = r3;
    L_0x0212:
        r3 = r5.samplerate;
        if (r3 != 0) goto L_0x0218;
    L_0x0216:
        r3 = 0;
        return r3;
    L_0x0218:
        r3 = r5.samplerate;
        r3 = (double) r3;
        r6 = 4654470214887407616; // 0x4098000000000000 float:0.0 double:1536.0;
        r3 = r3 / r6;
        r6 = r5.frameSize;
        r6 = (double) r6;
        r3 = r3 * r6;
        r6 = 4620693217682128896; // 0x4020000000000000 float:0.0 double:8.0;
        r3 = r3 * r6;
        r3 = (int) r3;
        r5.bitrate = r3;
        r3 = r0.dataSource;
        r4 = r5.frameSize;
        r6 = (long) r4;
        r8 = r1 + r6;
        r3.position(r8);
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.googlecode.mp4parser.authoring.tracks.EC3TrackImpl.readVariables():com.googlecode.mp4parser.authoring.tracks.EC3TrackImpl$BitStreamInfo");
    }

    public void close() {
        this.dataSource.close();
    }

    public List<CompositionTimeToSample.Entry> getCompositionTimeEntries() {
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

    public long[] getSampleDurations() {
        return this.decodingTimes;
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

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("EC3TrackImpl{bitrate=");
        stringBuilder.append(this.bitrate);
        stringBuilder.append(", bitStreamInfos=");
        stringBuilder.append(this.bitStreamInfos);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
