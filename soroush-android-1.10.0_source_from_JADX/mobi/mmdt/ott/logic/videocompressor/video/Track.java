package mobi.mmdt.ott.logic.videocompressor.video;

import android.annotation.TargetApi;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaFormat;
import com.coremedia.iso.boxes.AbstractMediaHeaderBox;
import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.SoundMediaHeaderBox;
import com.coremedia.iso.boxes.VideoMediaHeaderBox;
import com.coremedia.iso.boxes.sampleentry.AudioSampleEntry;
import com.coremedia.iso.boxes.sampleentry.VisualSampleEntry;
import com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.AudioSpecificConfig;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.DecoderConfigDescriptor;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ESDescriptor;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.SLConfigDescriptor;
import com.p149g.p150a.p151b.C6533a;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import mobi.mmdt.ott.logic.videocompressor.VideoCompressor;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
import tv.danmaku.ijk.media.player.misc.IMediaFormat;

@TargetApi(16)
public class Track {
    private static Map<Integer, Integer> samplingFrequencyIndexMap;
    private Date creationTime = new Date();
    private long duration = 0;
    private boolean first = true;
    private String handler;
    private AbstractMediaHeaderBox headerBox = null;
    private int height;
    private boolean isAudio = false;
    private long lastPresentationTimeUs = 0;
    private SampleDescriptionBox sampleDescriptionBox = null;
    private ArrayList<Long> sampleDurations = new ArrayList();
    private ArrayList<Sample> samples = new ArrayList();
    private LinkedList<Integer> syncSamples = null;
    private int timeScale;
    private long trackId = 0;
    private float volume = 0.0f;
    private int width;

    static {
        Map hashMap = new HashMap();
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
    }

    public Track(int i, MediaFormat mediaFormat, boolean z) {
        Box audioSampleEntry;
        this.trackId = (long) i;
        this.isAudio = z;
        if (this.isAudio) {
            this.sampleDurations.add(Long.valueOf(IjkMediaMeta.AV_CH_SIDE_RIGHT));
            this.duration = IjkMediaMeta.AV_CH_SIDE_RIGHT;
            this.volume = BallPulseIndicator.SCALE;
            this.timeScale = mediaFormat.getInteger("sample-rate");
            this.handler = "soun";
            this.headerBox = new SoundMediaHeaderBox();
            this.sampleDescriptionBox = new SampleDescriptionBox();
            audioSampleEntry = new AudioSampleEntry(AudioSampleEntry.TYPE3);
            audioSampleEntry.setChannelCount(mediaFormat.getInteger("channel-count"));
            audioSampleEntry.setSampleRate((long) mediaFormat.getInteger("sample-rate"));
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
            decoderConfigDescriptor.setBufferSizeDB(1536);
            decoderConfigDescriptor.setMaxBitRate(96000);
            decoderConfigDescriptor.setAvgBitRate(96000);
            AudioSpecificConfig audioSpecificConfig = new AudioSpecificConfig();
            audioSpecificConfig.setAudioObjectType(2);
            audioSpecificConfig.setSamplingFrequencyIndex(((Integer) samplingFrequencyIndexMap.get(Integer.valueOf((int) audioSampleEntry.getSampleRate()))).intValue());
            audioSpecificConfig.setChannelConfiguration(audioSampleEntry.getChannelCount());
            decoderConfigDescriptor.setAudioSpecificInfo(audioSpecificConfig);
            eSDescriptor.setDecoderConfigDescriptor(decoderConfigDescriptor);
            ByteBuffer serialize = eSDescriptor.serialize();
            eSDescriptorBox.setEsDescriptor(eSDescriptor);
            eSDescriptorBox.setData(serialize);
            audioSampleEntry.addBox(eSDescriptorBox);
        } else {
            this.sampleDurations.add(Long.valueOf(3015));
            this.duration = 3015;
            this.width = mediaFormat.getInteger("width");
            this.height = mediaFormat.getInteger("height");
            this.timeScale = 90000;
            this.syncSamples = new LinkedList();
            this.handler = "vide";
            this.headerBox = new VideoMediaHeaderBox();
            this.sampleDescriptionBox = new SampleDescriptionBox();
            String string = mediaFormat.getString(IMediaFormat.KEY_MIME);
            if (string.equals(VideoCompressor.MIME_TYPE)) {
                audioSampleEntry = new VisualSampleEntry(VisualSampleEntry.TYPE3);
                audioSampleEntry.setDataReferenceIndex(1);
                audioSampleEntry.setDepth(24);
                audioSampleEntry.setFrameCount(1);
                audioSampleEntry.setHorizresolution(72.0d);
                audioSampleEntry.setVertresolution(72.0d);
                audioSampleEntry.setWidth(this.width);
                audioSampleEntry.setHeight(this.height);
                Box c6533a = new C6533a();
                if (mediaFormat.getByteBuffer("csd-0") != null) {
                    List arrayList = new ArrayList();
                    ByteBuffer byteBuffer = mediaFormat.getByteBuffer("csd-0");
                    byteBuffer.position(4);
                    Object obj = new byte[byteBuffer.remaining()];
                    byteBuffer.get(obj);
                    arrayList.add(obj);
                    List arrayList2 = new ArrayList();
                    ByteBuffer byteBuffer2 = mediaFormat.getByteBuffer("csd-1");
                    byteBuffer2.position(4);
                    Object obj2 = new byte[byteBuffer2.remaining()];
                    byteBuffer2.get(obj2);
                    arrayList2.add(obj2);
                    c6533a.m15777a(arrayList);
                    c6533a.m15780b(arrayList2);
                }
                c6533a.m15782c(13);
                c6533a.m15776a(100);
                c6533a.m15786e(-1);
                c6533a.m15788f(-1);
                c6533a.m15784d(-1);
                c6533a.m15783d();
                c6533a.m15785e();
                c6533a.m15779b(0);
                audioSampleEntry.addBox(c6533a);
            } else {
                if (string.equals("video/mp4v")) {
                    audioSampleEntry = new VisualSampleEntry(VisualSampleEntry.TYPE1);
                    audioSampleEntry.setDataReferenceIndex(1);
                    audioSampleEntry.setDepth(24);
                    audioSampleEntry.setFrameCount(1);
                    audioSampleEntry.setHorizresolution(72.0d);
                    audioSampleEntry.setVertresolution(72.0d);
                    audioSampleEntry.setWidth(this.width);
                    audioSampleEntry.setHeight(this.height);
                    this.sampleDescriptionBox.addBox(audioSampleEntry);
                }
                return;
            }
        }
        this.sampleDescriptionBox.addBox(audioSampleEntry);
    }

    public void addSample(long j, BufferInfo bufferInfo) {
        long j2 = bufferInfo.presentationTimeUs - this.lastPresentationTimeUs;
        if (j2 >= 0) {
            int i = (this.isAudio || (bufferInfo.flags & 1) == 0) ? false : 1;
            this.samples.add(new Sample(j, (long) bufferInfo.size));
            if (!(this.syncSamples == null || i == 0)) {
                this.syncSamples.add(Integer.valueOf(this.samples.size()));
            }
            long j3 = ((j2 * ((long) this.timeScale)) + 500000) / 1000000;
            this.lastPresentationTimeUs = bufferInfo.presentationTimeUs;
            if (!this.first) {
                this.sampleDurations.add(this.sampleDurations.size() - 1, Long.valueOf(j3));
                this.duration += j3;
            }
            this.first = false;
        }
    }

    public Date getCreationTime() {
        return this.creationTime;
    }

    public long getDuration() {
        return this.duration;
    }

    public String getHandler() {
        return this.handler;
    }

    public int getHeight() {
        return this.height;
    }

    public AbstractMediaHeaderBox getMediaHeaderBox() {
        return this.headerBox;
    }

    public SampleDescriptionBox getSampleDescriptionBox() {
        return this.sampleDescriptionBox;
    }

    public ArrayList<Long> getSampleDurations() {
        return this.sampleDurations;
    }

    public ArrayList<Sample> getSamples() {
        return this.samples;
    }

    public long[] getSyncSamples() {
        if (this.syncSamples != null) {
            if (!this.syncSamples.isEmpty()) {
                long[] jArr = new long[this.syncSamples.size()];
                for (int i = 0; i < this.syncSamples.size(); i++) {
                    jArr[i] = (long) ((Integer) this.syncSamples.get(i)).intValue();
                }
                return jArr;
            }
        }
        return null;
    }

    public int getTimeScale() {
        return this.timeScale;
    }

    public long getTrackId() {
        return this.trackId;
    }

    public float getVolume() {
        return this.volume;
    }

    public int getWidth() {
        return this.width;
    }

    public boolean isAudio() {
        return this.isAudio;
    }
}
