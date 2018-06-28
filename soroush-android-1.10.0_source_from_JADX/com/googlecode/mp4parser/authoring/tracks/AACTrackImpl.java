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
import com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.AudioSpecificConfig;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitReaderBuffer;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.DecoderConfigDescriptor;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ESDescriptor;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.SLConfigDescriptor;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

public class AACTrackImpl extends AbstractTrack {
    static Map<Integer, String> audioObjectTypes;
    public static Map<Integer, Integer> samplingFrequencyIndexMap;
    long avgBitRate;
    int bufferSizeDB;
    private DataSource dataSource;
    long[] decTimes;
    AdtsHeader firstHeader;
    private String lang;
    long maxBitRate;
    SampleDescriptionBox sampleDescriptionBox;
    private List<Sample> samples;
    TrackMetaData trackMetaData;

    class AdtsHeader {
        int bufferFullness;
        int channelconfig;
        int copyrightStart;
        int copyrightedStream;
        int frameLength;
        int home;
        int layer;
        int mpegVersion;
        int numAacFramesPerAdtsFrame;
        int original;
        int profile;
        int protectionAbsent;
        int sampleFrequencyIndex;
        int sampleRate;

        AdtsHeader() {
        }

        int getSize() {
            return 7 + (this.protectionAbsent == 0 ? 2 : 0);
        }
    }

    static {
        Map hashMap = new HashMap();
        audioObjectTypes = hashMap;
        hashMap.put(Integer.valueOf(1), "AAC Main");
        audioObjectTypes.put(Integer.valueOf(2), "AAC LC (Low Complexity)");
        audioObjectTypes.put(Integer.valueOf(3), "AAC SSR (Scalable Sample Rate)");
        audioObjectTypes.put(Integer.valueOf(4), "AAC LTP (Long Term Prediction)");
        audioObjectTypes.put(Integer.valueOf(5), "SBR (Spectral Band Replication)");
        audioObjectTypes.put(Integer.valueOf(6), "AAC Scalable");
        audioObjectTypes.put(Integer.valueOf(7), "TwinVQ");
        audioObjectTypes.put(Integer.valueOf(8), "CELP (Code Excited Linear Prediction)");
        audioObjectTypes.put(Integer.valueOf(9), "HXVC (Harmonic Vector eXcitation Coding)");
        audioObjectTypes.put(Integer.valueOf(10), "Reserved");
        audioObjectTypes.put(Integer.valueOf(11), "Reserved");
        audioObjectTypes.put(Integer.valueOf(12), "TTSI (Text-To-Speech Interface)");
        audioObjectTypes.put(Integer.valueOf(13), "Main Synthesis");
        audioObjectTypes.put(Integer.valueOf(14), "Wavetable Synthesis");
        audioObjectTypes.put(Integer.valueOf(15), "General MIDI");
        audioObjectTypes.put(Integer.valueOf(16), "Algorithmic Synthesis and Audio Effects");
        audioObjectTypes.put(Integer.valueOf(17), "ER (Error Resilient) AAC LC");
        audioObjectTypes.put(Integer.valueOf(18), "Reserved");
        audioObjectTypes.put(Integer.valueOf(19), "ER AAC LTP");
        audioObjectTypes.put(Integer.valueOf(20), "ER AAC Scalable");
        audioObjectTypes.put(Integer.valueOf(21), "ER TwinVQ");
        audioObjectTypes.put(Integer.valueOf(22), "ER BSAC (Bit-Sliced Arithmetic Coding)");
        audioObjectTypes.put(Integer.valueOf(23), "ER AAC LD (Low Delay)");
        audioObjectTypes.put(Integer.valueOf(24), "ER CELP");
        audioObjectTypes.put(Integer.valueOf(25), "ER HVXC");
        audioObjectTypes.put(Integer.valueOf(26), "ER HILN (Harmonic and Individual Lines plus Noise)");
        audioObjectTypes.put(Integer.valueOf(27), "ER Parametric");
        audioObjectTypes.put(Integer.valueOf(28), "SSC (SinuSoidal Coding)");
        audioObjectTypes.put(Integer.valueOf(29), "PS (Parametric Stereo)");
        audioObjectTypes.put(Integer.valueOf(30), "MPEG Surround");
        audioObjectTypes.put(Integer.valueOf(31), "(Escape value)");
        audioObjectTypes.put(Integer.valueOf(32), "Layer-1");
        audioObjectTypes.put(Integer.valueOf(33), "Layer-2");
        audioObjectTypes.put(Integer.valueOf(34), "Layer-3");
        audioObjectTypes.put(Integer.valueOf(35), "DST (Direct Stream Transfer)");
        audioObjectTypes.put(Integer.valueOf(36), "ALS (Audio Lossless)");
        audioObjectTypes.put(Integer.valueOf(37), "SLS (Scalable LosslesS)");
        audioObjectTypes.put(Integer.valueOf(38), "SLS non-core");
        audioObjectTypes.put(Integer.valueOf(39), "ER AAC ELD (Enhanced Low Delay)");
        audioObjectTypes.put(Integer.valueOf(40), "SMR (Symbolic Music Representation) Simple");
        audioObjectTypes.put(Integer.valueOf(41), "SMR Main");
        audioObjectTypes.put(Integer.valueOf(42), "USAC (Unified Speech and Audio Coding) (no SBR)");
        audioObjectTypes.put(Integer.valueOf(43), "SAOC (Spatial Audio Object Coding)");
        audioObjectTypes.put(Integer.valueOf(44), "LD MPEG Surround");
        audioObjectTypes.put(Integer.valueOf(45), "USAC");
        hashMap = new HashMap();
        samplingFrequencyIndexMap = hashMap;
        hashMap.put(Integer.valueOf(96000), Integer.valueOf(0));
        samplingFrequencyIndexMap.put(Integer.valueOf(88200), Integer.valueOf(1));
        samplingFrequencyIndexMap.put(Integer.valueOf(64000), Integer.valueOf(2));
        samplingFrequencyIndexMap.put(Integer.valueOf(48000), Integer.valueOf(3));
        samplingFrequencyIndexMap.put(Integer.valueOf(44100), Integer.valueOf(4));
        samplingFrequencyIndexMap.put(Integer.valueOf(32000), Integer.valueOf(5));
        samplingFrequencyIndexMap.put(Integer.valueOf(24000), Integer.valueOf(6));
        samplingFrequencyIndexMap.put(Integer.valueOf(22050), Integer.valueOf(7));
        samplingFrequencyIndexMap.put(Integer.valueOf(16000), Integer.valueOf(8));
        samplingFrequencyIndexMap.put(Integer.valueOf(12000), Integer.valueOf(9));
        samplingFrequencyIndexMap.put(Integer.valueOf(11025), Integer.valueOf(10));
        samplingFrequencyIndexMap.put(Integer.valueOf(8000), Integer.valueOf(11));
        samplingFrequencyIndexMap.put(Integer.valueOf(0), Integer.valueOf(96000));
        samplingFrequencyIndexMap.put(Integer.valueOf(1), Integer.valueOf(88200));
        samplingFrequencyIndexMap.put(Integer.valueOf(2), Integer.valueOf(64000));
        samplingFrequencyIndexMap.put(Integer.valueOf(3), Integer.valueOf(48000));
        samplingFrequencyIndexMap.put(Integer.valueOf(4), Integer.valueOf(44100));
        samplingFrequencyIndexMap.put(Integer.valueOf(5), Integer.valueOf(32000));
        samplingFrequencyIndexMap.put(Integer.valueOf(6), Integer.valueOf(24000));
        samplingFrequencyIndexMap.put(Integer.valueOf(7), Integer.valueOf(22050));
        samplingFrequencyIndexMap.put(Integer.valueOf(8), Integer.valueOf(16000));
        samplingFrequencyIndexMap.put(Integer.valueOf(9), Integer.valueOf(12000));
        samplingFrequencyIndexMap.put(Integer.valueOf(10), Integer.valueOf(11025));
        samplingFrequencyIndexMap.put(Integer.valueOf(11), Integer.valueOf(8000));
    }

    public AACTrackImpl(DataSource dataSource) {
        this(dataSource, "eng");
    }

    public AACTrackImpl(DataSource dataSource, String str) {
        super(dataSource.toString());
        this.trackMetaData = new TrackMetaData();
        this.lang = "eng";
        this.lang = str;
        this.dataSource = dataSource;
        this.samples = new ArrayList();
        this.firstHeader = readSamples(dataSource);
        double d = ((double) this.firstHeader.sampleRate) / 1024.0d;
        double size = ((double) this.samples.size()) / d;
        LinkedList linkedList = new LinkedList();
        Iterator it = this.samples.iterator();
        long j = 0;
        while (true) {
            int i = 0;
            if (!it.hasNext()) {
                break;
            }
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
        }
        this.avgBitRate = (long) ((int) (((double) (8 * j)) / size));
        this.bufferSizeDB = 1536;
        this.sampleDescriptionBox = new SampleDescriptionBox();
        Box audioSampleEntry = new AudioSampleEntry(AudioSampleEntry.TYPE3);
        audioSampleEntry.setChannelCount(this.firstHeader.channelconfig == 7 ? 8 : this.firstHeader.channelconfig);
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
        decoderConfigDescriptor.setObjectTypeIndication(64);
        decoderConfigDescriptor.setStreamType(5);
        decoderConfigDescriptor.setBufferSizeDB(this.bufferSizeDB);
        decoderConfigDescriptor.setMaxBitRate(this.maxBitRate);
        decoderConfigDescriptor.setAvgBitRate(this.avgBitRate);
        AudioSpecificConfig audioSpecificConfig = new AudioSpecificConfig();
        audioSpecificConfig.setAudioObjectType(2);
        audioSpecificConfig.setSamplingFrequencyIndex(this.firstHeader.sampleFrequencyIndex);
        audioSpecificConfig.setChannelConfiguration(this.firstHeader.channelconfig);
        decoderConfigDescriptor.setAudioSpecificInfo(audioSpecificConfig);
        eSDescriptor.setDecoderConfigDescriptor(decoderConfigDescriptor);
        ByteBuffer serialize = eSDescriptor.serialize();
        eSDescriptorBox.setEsDescriptor(eSDescriptor);
        eSDescriptorBox.setData(serialize);
        audioSampleEntry.addBox(eSDescriptorBox);
        this.sampleDescriptionBox.addBox(audioSampleEntry);
        this.trackMetaData.setCreationTime(new Date());
        this.trackMetaData.setModificationTime(new Date());
        this.trackMetaData.setLanguage(str);
        this.trackMetaData.setVolume(BallPulseIndicator.SCALE);
        this.trackMetaData.setTimescale((long) this.firstHeader.sampleRate);
        this.decTimes = new long[this.samples.size()];
        Arrays.fill(this.decTimes, IjkMediaMeta.AV_CH_SIDE_RIGHT);
    }

    private AdtsHeader readADTSHeader(DataSource dataSource) {
        AdtsHeader adtsHeader = new AdtsHeader();
        ByteBuffer allocate = ByteBuffer.allocate(7);
        while (allocate.position() < 7) {
            if (dataSource.read(allocate) == -1) {
                return null;
            }
        }
        BitReaderBuffer bitReaderBuffer = new BitReaderBuffer((ByteBuffer) allocate.rewind());
        if (bitReaderBuffer.readBits(12) != 4095) {
            throw new IOException("Expected Start Word 0xfff");
        }
        adtsHeader.mpegVersion = bitReaderBuffer.readBits(1);
        adtsHeader.layer = bitReaderBuffer.readBits(2);
        adtsHeader.protectionAbsent = bitReaderBuffer.readBits(1);
        adtsHeader.profile = bitReaderBuffer.readBits(2) + 1;
        adtsHeader.sampleFrequencyIndex = bitReaderBuffer.readBits(4);
        adtsHeader.sampleRate = ((Integer) samplingFrequencyIndexMap.get(Integer.valueOf(adtsHeader.sampleFrequencyIndex))).intValue();
        bitReaderBuffer.readBits(1);
        adtsHeader.channelconfig = bitReaderBuffer.readBits(3);
        adtsHeader.original = bitReaderBuffer.readBits(1);
        adtsHeader.home = bitReaderBuffer.readBits(1);
        adtsHeader.copyrightedStream = bitReaderBuffer.readBits(1);
        adtsHeader.copyrightStart = bitReaderBuffer.readBits(1);
        adtsHeader.frameLength = bitReaderBuffer.readBits(13);
        adtsHeader.bufferFullness = bitReaderBuffer.readBits(11);
        adtsHeader.numAacFramesPerAdtsFrame = bitReaderBuffer.readBits(2) + 1;
        if (adtsHeader.numAacFramesPerAdtsFrame != 1) {
            throw new IOException("This muxer can only work with 1 AAC frame per ADTS frame");
        }
        if (adtsHeader.protectionAbsent == 0) {
            dataSource.read(ByteBuffer.allocate(2));
        }
        return adtsHeader;
    }

    private AdtsHeader readSamples(DataSource dataSource) {
        AdtsHeader adtsHeader = null;
        while (true) {
            AdtsHeader readADTSHeader = readADTSHeader(dataSource);
            if (readADTSHeader == null) {
                return adtsHeader;
            }
            if (adtsHeader == null) {
                adtsHeader = readADTSHeader;
            }
            final long position = dataSource.position();
            final long size = (long) (readADTSHeader.frameLength - readADTSHeader.getSize());
            this.samples.add(new Sample() {
                public ByteBuffer asByteBuffer() {
                    try {
                        return AACTrackImpl.this.dataSource.map(position, size);
                    } catch (Throwable e) {
                        throw new RuntimeException(e);
                    }
                }

                public long getSize() {
                    return size;
                }

                public void writeTo(WritableByteChannel writableByteChannel) {
                    AACTrackImpl.this.dataSource.transferTo(position, size, writableByteChannel);
                }
            });
            dataSource.position((dataSource.position() + ((long) readADTSHeader.frameLength)) - ((long) readADTSHeader.getSize()));
        }
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

    public long[] getSampleDurations() {
        return this.decTimes;
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
        StringBuilder stringBuilder = new StringBuilder("AACTrackImpl{sampleRate=");
        stringBuilder.append(this.firstHeader.sampleRate);
        stringBuilder.append(", channelconfig=");
        stringBuilder.append(this.firstHeader.channelconfig);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
