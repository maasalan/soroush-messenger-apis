package com.googlecode.mp4parser.authoring.tracks;

import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.CompositionTimeToSample;
import com.coremedia.iso.boxes.CompositionTimeToSample.Entry;
import com.coremedia.iso.boxes.SampleDependencyTypeBox;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.SubSampleInformationBox;
import com.coremedia.iso.boxes.sampleentry.AudioSampleEntry;
import com.coremedia.iso.boxes.sampleentry.SampleEntry;
import com.coremedia.iso.boxes.sampleentry.VisualSampleEntry;
import com.googlecode.mp4parser.authoring.AbstractTrack;
import com.googlecode.mp4parser.authoring.Sample;
import com.googlecode.mp4parser.authoring.Track;
import com.googlecode.mp4parser.authoring.TrackMetaData;
import com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox;
import com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox;
import com.googlecode.mp4parser.util.Logger;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.channels.Channels;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class AppendTrack extends AbstractTrack {
    private static Logger LOG = Logger.getLogger(AppendTrack.class);
    SampleDescriptionBox stsd;
    Track[] tracks;

    public AppendTrack(Track... trackArr) {
        super(appendTracknames(trackArr));
        this.tracks = trackArr;
        for (Track track : trackArr) {
            if (this.stsd == null) {
                this.stsd = new SampleDescriptionBox();
                this.stsd.addBox((Box) track.getSampleDescriptionBox().getBoxes(SampleEntry.class).get(0));
            } else {
                this.stsd = mergeStsds(this.stsd, track.getSampleDescriptionBox());
            }
        }
    }

    public static String appendTracknames(Track... trackArr) {
        String str = "";
        for (Track track : trackArr) {
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str));
            stringBuilder.append(track.getName());
            stringBuilder.append(" + ");
            str = stringBuilder.toString();
        }
        return str.substring(0, str.length() - 3);
    }

    private AudioSampleEntry mergeAudioSampleEntries(AudioSampleEntry audioSampleEntry, AudioSampleEntry audioSampleEntry2) {
        AudioSampleEntry audioSampleEntry3 = new AudioSampleEntry(audioSampleEntry2.getType());
        if (audioSampleEntry.getBytesPerFrame() == audioSampleEntry2.getBytesPerFrame()) {
            audioSampleEntry3.setBytesPerFrame(audioSampleEntry.getBytesPerFrame());
            if (audioSampleEntry.getBytesPerPacket() == audioSampleEntry2.getBytesPerPacket()) {
                audioSampleEntry3.setBytesPerPacket(audioSampleEntry.getBytesPerPacket());
                if (audioSampleEntry.getBytesPerSample() == audioSampleEntry2.getBytesPerSample()) {
                    audioSampleEntry3.setBytesPerSample(audioSampleEntry.getBytesPerSample());
                    if (audioSampleEntry.getChannelCount() == audioSampleEntry2.getChannelCount()) {
                        audioSampleEntry3.setChannelCount(audioSampleEntry.getChannelCount());
                        if (audioSampleEntry.getPacketSize() == audioSampleEntry2.getPacketSize()) {
                            audioSampleEntry3.setPacketSize(audioSampleEntry.getPacketSize());
                            if (audioSampleEntry.getCompressionId() == audioSampleEntry2.getCompressionId()) {
                                audioSampleEntry3.setCompressionId(audioSampleEntry.getCompressionId());
                                if (audioSampleEntry.getSampleRate() == audioSampleEntry2.getSampleRate()) {
                                    audioSampleEntry3.setSampleRate(audioSampleEntry.getSampleRate());
                                    if (audioSampleEntry.getSampleSize() == audioSampleEntry2.getSampleSize()) {
                                        audioSampleEntry3.setSampleSize(audioSampleEntry.getSampleSize());
                                        if (audioSampleEntry.getSamplesPerPacket() == audioSampleEntry2.getSamplesPerPacket()) {
                                            audioSampleEntry3.setSamplesPerPacket(audioSampleEntry.getSamplesPerPacket());
                                            if (audioSampleEntry.getSoundVersion() == audioSampleEntry2.getSoundVersion()) {
                                                audioSampleEntry3.setSoundVersion(audioSampleEntry.getSoundVersion());
                                                if (Arrays.equals(audioSampleEntry.getSoundVersion2Data(), audioSampleEntry2.getSoundVersion2Data())) {
                                                    audioSampleEntry3.setSoundVersion2Data(audioSampleEntry.getSoundVersion2Data());
                                                    if (audioSampleEntry.getBoxes().size() != audioSampleEntry2.getBoxes().size()) {
                                                        return audioSampleEntry3;
                                                    }
                                                    Iterator it = audioSampleEntry2.getBoxes().iterator();
                                                    for (Box box : audioSampleEntry.getBoxes()) {
                                                        Box box2 = (Box) it.next();
                                                        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                                        OutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                                                        try {
                                                            box.getBox(Channels.newChannel(byteArrayOutputStream));
                                                            box2.getBox(Channels.newChannel(byteArrayOutputStream2));
                                                            if (!Arrays.equals(byteArrayOutputStream.toByteArray(), byteArrayOutputStream2.toByteArray())) {
                                                                if (ESDescriptorBox.TYPE.equals(box.getType()) && ESDescriptorBox.TYPE.equals(box2.getType())) {
                                                                    ESDescriptorBox eSDescriptorBox = (ESDescriptorBox) box;
                                                                    eSDescriptorBox.setDescriptor(mergeDescriptors(eSDescriptorBox.getEsDescriptor(), ((ESDescriptorBox) box2).getEsDescriptor()));
                                                                }
                                                            }
                                                            audioSampleEntry3.addBox(box);
                                                        } catch (IOException e) {
                                                            LOG.logWarn(e.getMessage());
                                                            return null;
                                                        }
                                                    }
                                                    return audioSampleEntry3;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            return null;
                        }
                        LOG.logError("ChannelCount differ");
                    }
                    return null;
                }
                LOG.logError("BytesPerSample differ");
            }
            return null;
        }
        LOG.logError("BytesPerFrame differ");
        return null;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ESDescriptor mergeDescriptors(com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor r10, com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor r11) {
        /*
        r9 = this;
        r0 = r10 instanceof com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ESDescriptor;
        r1 = 0;
        if (r0 == 0) goto L_0x017b;
    L_0x0005:
        r0 = r11 instanceof com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ESDescriptor;
        if (r0 == 0) goto L_0x017b;
    L_0x0009:
        r10 = (com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ESDescriptor) r10;
        r11 = (com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ESDescriptor) r11;
        r0 = r10.getURLFlag();
        r2 = r11.getURLFlag();
        if (r0 == r2) goto L_0x0018;
    L_0x0017:
        return r1;
    L_0x0018:
        r10.getURLLength();
        r11.getURLLength();
        r0 = r10.getDependsOnEsId();
        r2 = r11.getDependsOnEsId();
        if (r0 == r2) goto L_0x0029;
    L_0x0028:
        return r1;
    L_0x0029:
        r0 = r10.getEsId();
        r2 = r11.getEsId();
        if (r0 == r2) goto L_0x0034;
    L_0x0033:
        return r1;
    L_0x0034:
        r0 = r10.getoCREsId();
        r2 = r11.getoCREsId();
        if (r0 == r2) goto L_0x003f;
    L_0x003e:
        return r1;
    L_0x003f:
        r0 = r10.getoCRstreamFlag();
        r2 = r11.getoCRstreamFlag();
        if (r0 == r2) goto L_0x004a;
    L_0x0049:
        return r1;
    L_0x004a:
        r0 = r10.getRemoteODFlag();
        r2 = r11.getRemoteODFlag();
        if (r0 == r2) goto L_0x0055;
    L_0x0054:
        return r1;
    L_0x0055:
        r0 = r10.getStreamDependenceFlag();
        r2 = r11.getStreamDependenceFlag();
        if (r0 == r2) goto L_0x0060;
    L_0x005f:
        return r1;
    L_0x0060:
        r10.getStreamPriority();
        r11.getStreamPriority();
        r0 = r10.getURLString();
        if (r0 == 0) goto L_0x0078;
    L_0x006c:
        r0 = r10.getURLString();
        r2 = r11.getURLString();
        r0.equals(r2);
        goto L_0x007b;
    L_0x0078:
        r11.getURLString();
    L_0x007b:
        r0 = r10.getDecoderConfigDescriptor();
        if (r0 == 0) goto L_0x0090;
    L_0x0081:
        r0 = r10.getDecoderConfigDescriptor();
        r2 = r11.getDecoderConfigDescriptor();
        r0 = r0.equals(r2);
        if (r0 != 0) goto L_0x0142;
    L_0x008f:
        goto L_0x0096;
    L_0x0090:
        r0 = r11.getDecoderConfigDescriptor();
        if (r0 == 0) goto L_0x0142;
    L_0x0096:
        r0 = r10.getDecoderConfigDescriptor();
        r2 = r11.getDecoderConfigDescriptor();
        r3 = r0.getAudioSpecificInfo();
        if (r3 == 0) goto L_0x00b9;
    L_0x00a4:
        r3 = r2.getAudioSpecificInfo();
        if (r3 == 0) goto L_0x00b9;
    L_0x00aa:
        r3 = r0.getAudioSpecificInfo();
        r4 = r2.getAudioSpecificInfo();
        r3 = r3.equals(r4);
        if (r3 != 0) goto L_0x00b9;
    L_0x00b8:
        return r1;
    L_0x00b9:
        r3 = r0.getAvgBitRate();
        r5 = r2.getAvgBitRate();
        r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r7 == 0) goto L_0x00d5;
    L_0x00c5:
        r3 = r0.getAvgBitRate();
        r5 = r2.getAvgBitRate();
        r7 = r3 + r5;
        r3 = 2;
        r7 = r7 / r3;
        r0.setAvgBitRate(r7);
    L_0x00d5:
        r0.getBufferSizeDB();
        r2.getBufferSizeDB();
        r3 = r0.getDecoderSpecificInfo();
        if (r3 == 0) goto L_0x00f0;
    L_0x00e1:
        r3 = r0.getDecoderSpecificInfo();
        r4 = r2.getDecoderSpecificInfo();
        r3 = r3.equals(r4);
        if (r3 != 0) goto L_0x00f7;
    L_0x00ef:
        return r1;
    L_0x00f0:
        r3 = r2.getDecoderSpecificInfo();
        if (r3 == 0) goto L_0x00f7;
    L_0x00f6:
        return r1;
    L_0x00f7:
        r3 = r0.getMaxBitRate();
        r5 = r2.getMaxBitRate();
        r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r7 == 0) goto L_0x0112;
    L_0x0103:
        r3 = r0.getMaxBitRate();
        r5 = r2.getMaxBitRate();
        r3 = java.lang.Math.max(r3, r5);
        r0.setMaxBitRate(r3);
    L_0x0112:
        r3 = r0.getProfileLevelIndicationDescriptors();
        r4 = r2.getProfileLevelIndicationDescriptors();
        r3 = r3.equals(r4);
        if (r3 != 0) goto L_0x0121;
    L_0x0120:
        return r1;
    L_0x0121:
        r3 = r0.getObjectTypeIndication();
        r4 = r2.getObjectTypeIndication();
        if (r3 == r4) goto L_0x012c;
    L_0x012b:
        return r1;
    L_0x012c:
        r3 = r0.getStreamType();
        r4 = r2.getStreamType();
        if (r3 == r4) goto L_0x0137;
    L_0x0136:
        return r1;
    L_0x0137:
        r0 = r0.getUpStream();
        r2 = r2.getUpStream();
        if (r0 == r2) goto L_0x0142;
    L_0x0141:
        return r1;
    L_0x0142:
        r0 = r10.getOtherDescriptors();
        if (r0 == 0) goto L_0x0157;
    L_0x0148:
        r0 = r10.getOtherDescriptors();
        r2 = r11.getOtherDescriptors();
        r0 = r0.equals(r2);
        if (r0 != 0) goto L_0x015e;
    L_0x0156:
        return r1;
    L_0x0157:
        r0 = r11.getOtherDescriptors();
        if (r0 == 0) goto L_0x015e;
    L_0x015d:
        return r1;
    L_0x015e:
        r0 = r10.getSlConfigDescriptor();
        if (r0 == 0) goto L_0x0173;
    L_0x0164:
        r0 = r10.getSlConfigDescriptor();
        r11 = r11.getSlConfigDescriptor();
        r11 = r0.equals(r11);
        if (r11 != 0) goto L_0x017a;
    L_0x0172:
        return r1;
    L_0x0173:
        r11 = r11.getSlConfigDescriptor();
        if (r11 == 0) goto L_0x017a;
    L_0x0179:
        return r1;
    L_0x017a:
        return r10;
    L_0x017b:
        r10 = LOG;
        r11 = "I can only merge ESDescriptors";
        r10.logError(r11);
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.googlecode.mp4parser.authoring.tracks.AppendTrack.mergeDescriptors(com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor, com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor):com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ESDescriptor");
    }

    private SampleEntry mergeSampleEntry(SampleEntry sampleEntry, SampleEntry sampleEntry2) {
        return !sampleEntry.getType().equals(sampleEntry2.getType()) ? null : ((sampleEntry instanceof VisualSampleEntry) && (sampleEntry2 instanceof VisualSampleEntry)) ? mergeVisualSampleEntry((VisualSampleEntry) sampleEntry, (VisualSampleEntry) sampleEntry2) : ((sampleEntry instanceof AudioSampleEntry) && (sampleEntry2 instanceof AudioSampleEntry)) ? mergeAudioSampleEntries((AudioSampleEntry) sampleEntry, (AudioSampleEntry) sampleEntry2) : null;
    }

    private SampleDescriptionBox mergeStsds(SampleDescriptionBox sampleDescriptionBox, SampleDescriptionBox sampleDescriptionBox2) {
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        OutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            sampleDescriptionBox.getBox(Channels.newChannel(byteArrayOutputStream));
            sampleDescriptionBox2.getBox(Channels.newChannel(byteArrayOutputStream2));
            if (Arrays.equals(byteArrayOutputStream2.toByteArray(), byteArrayOutputStream.toByteArray())) {
                return sampleDescriptionBox;
            }
            SampleEntry mergeSampleEntry = mergeSampleEntry((SampleEntry) sampleDescriptionBox.getBoxes(SampleEntry.class).get(0), (SampleEntry) sampleDescriptionBox2.getBoxes(SampleEntry.class).get(0));
            if (mergeSampleEntry != null) {
                sampleDescriptionBox.setBoxes(Collections.singletonList(mergeSampleEntry));
                return sampleDescriptionBox;
            }
            StringBuilder stringBuilder = new StringBuilder("Cannot merge ");
            stringBuilder.append(sampleDescriptionBox.getBoxes(SampleEntry.class).get(0));
            stringBuilder.append(" and ");
            stringBuilder.append(sampleDescriptionBox2.getBoxes(SampleEntry.class).get(0));
            throw new IOException(stringBuilder.toString());
        } catch (IOException e) {
            LOG.logError(e.getMessage());
            return null;
        }
    }

    private VisualSampleEntry mergeVisualSampleEntry(VisualSampleEntry visualSampleEntry, VisualSampleEntry visualSampleEntry2) {
        VisualSampleEntry visualSampleEntry3 = new VisualSampleEntry();
        if (visualSampleEntry.getHorizresolution() == visualSampleEntry2.getHorizresolution()) {
            visualSampleEntry3.setHorizresolution(visualSampleEntry.getHorizresolution());
            visualSampleEntry3.setCompressorname(visualSampleEntry.getCompressorname());
            if (visualSampleEntry.getDepth() == visualSampleEntry2.getDepth()) {
                visualSampleEntry3.setDepth(visualSampleEntry.getDepth());
                if (visualSampleEntry.getFrameCount() == visualSampleEntry2.getFrameCount()) {
                    visualSampleEntry3.setFrameCount(visualSampleEntry.getFrameCount());
                    if (visualSampleEntry.getHeight() == visualSampleEntry2.getHeight()) {
                        visualSampleEntry3.setHeight(visualSampleEntry.getHeight());
                        if (visualSampleEntry.getWidth() == visualSampleEntry2.getWidth()) {
                            visualSampleEntry3.setWidth(visualSampleEntry.getWidth());
                            if (visualSampleEntry.getVertresolution() == visualSampleEntry2.getVertresolution()) {
                                visualSampleEntry3.setVertresolution(visualSampleEntry.getVertresolution());
                                if (visualSampleEntry.getHorizresolution() == visualSampleEntry2.getHorizresolution()) {
                                    visualSampleEntry3.setHorizresolution(visualSampleEntry.getHorizresolution());
                                    if (visualSampleEntry.getBoxes().size() != visualSampleEntry2.getBoxes().size()) {
                                        return visualSampleEntry3;
                                    }
                                    Iterator it = visualSampleEntry2.getBoxes().iterator();
                                    for (Box box : visualSampleEntry.getBoxes()) {
                                        Box box2 = (Box) it.next();
                                        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                        OutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                                        try {
                                            box.getBox(Channels.newChannel(byteArrayOutputStream));
                                            box2.getBox(Channels.newChannel(byteArrayOutputStream2));
                                            if (!Arrays.equals(byteArrayOutputStream.toByteArray(), byteArrayOutputStream2.toByteArray())) {
                                                if ((box instanceof AbstractDescriptorBox) && (box2 instanceof AbstractDescriptorBox)) {
                                                    AbstractDescriptorBox abstractDescriptorBox = (AbstractDescriptorBox) box;
                                                    abstractDescriptorBox.setDescriptor(mergeDescriptors(abstractDescriptorBox.getDescriptor(), ((AbstractDescriptorBox) box2).getDescriptor()));
                                                }
                                            }
                                            visualSampleEntry3.addBox(box);
                                        } catch (IOException e) {
                                            LOG.logWarn(e.getMessage());
                                            return null;
                                        }
                                    }
                                    return visualSampleEntry3;
                                }
                                LOG.logError("horizontal resolution differs");
                                return null;
                            }
                            LOG.logError("vert resolution differs");
                            return null;
                        }
                        LOG.logError("width differs");
                        return null;
                    }
                    LOG.logError("height differs");
                    return null;
                }
                LOG.logError("frame count differs");
                return null;
            }
            LOG.logError("Depth differs");
            return null;
        }
        LOG.logError("Horizontal Resolution differs");
        return null;
    }

    public void close() {
        for (Track close : this.tracks) {
            close.close();
        }
    }

    public List<Entry> getCompositionTimeEntries() {
        if (this.tracks[0].getCompositionTimeEntries() == null || this.tracks[0].getCompositionTimeEntries().isEmpty()) {
            return null;
        }
        List<int[]> linkedList = new LinkedList();
        for (Track compositionTimeEntries : this.tracks) {
            linkedList.add(CompositionTimeToSample.blowupCompositionTimes(compositionTimeEntries.getCompositionTimeEntries()));
        }
        List linkedList2 = new LinkedList();
        for (int[] iArr : linkedList) {
            for (int i : (int[]) r6.next()) {
                if (!linkedList2.isEmpty()) {
                    if (((Entry) linkedList2.getLast()).getOffset() == i) {
                        Entry entry = (Entry) linkedList2.getLast();
                        entry.setCount(entry.getCount() + 1);
                    }
                }
                linkedList2.add(new Entry(1, i));
            }
        }
        return linkedList2;
    }

    public String getHandler() {
        return this.tracks[0].getHandler();
    }

    public List<SampleDependencyTypeBox.Entry> getSampleDependencies() {
        int i = 0;
        if (this.tracks[0].getSampleDependencies() == null || this.tracks[0].getSampleDependencies().isEmpty()) {
            return null;
        }
        List<SampleDependencyTypeBox.Entry> linkedList = new LinkedList();
        Track[] trackArr = this.tracks;
        int length = trackArr.length;
        while (i < length) {
            linkedList.addAll(trackArr[i].getSampleDependencies());
            i++;
        }
        return linkedList;
    }

    public SampleDescriptionBox getSampleDescriptionBox() {
        return this.stsd;
    }

    public synchronized long[] getSampleDurations() {
        long[] jArr;
        Track[] trackArr = this.tracks;
        int i = 0;
        int i2 = i;
        while (i < trackArr.length) {
            i2 += trackArr[i].getSampleDurations().length;
            i++;
        }
        jArr = new long[i2];
        Track[] trackArr2 = this.tracks;
        i = trackArr2.length;
        i2 = 0;
        int i3 = i2;
        while (i2 < i) {
            long[] sampleDurations = trackArr2[i2].getSampleDurations();
            int length = sampleDurations.length;
            int i4 = i3;
            i3 = 0;
            while (i3 < length) {
                int i5 = i4 + 1;
                jArr[i4] = sampleDurations[i3];
                i3++;
                i4 = i5;
            }
            i2++;
            i3 = i4;
        }
        return jArr;
    }

    public List<Sample> getSamples() {
        List arrayList = new ArrayList();
        for (Track samples : this.tracks) {
            arrayList.addAll(samples.getSamples());
        }
        return arrayList;
    }

    public SubSampleInformationBox getSubsampleInformationBox() {
        return this.tracks[0].getSubsampleInformationBox();
    }

    public long[] getSyncSamples() {
        if (this.tracks[0].getSyncSamples() == null || r0.tracks[0].getSyncSamples().length <= 0) {
            return null;
        }
        Track[] trackArr = r0.tracks;
        int i = 0;
        int i2 = i;
        while (i < trackArr.length) {
            i2 += trackArr[i].getSyncSamples().length;
            i++;
        }
        long[] jArr = new long[i2];
        Track[] trackArr2 = r0.tracks;
        int length = trackArr2.length;
        int i3 = 0;
        int i4 = i3;
        long j = 0;
        while (i4 < length) {
            Track track = trackArr2[i4];
            long[] syncSamples = track.getSyncSamples();
            int length2 = syncSamples.length;
            int i5 = i3;
            i3 = 0;
            while (i3 < length2) {
                int i6 = i5 + 1;
                jArr[i5] = j + syncSamples[i3];
                i3++;
                i5 = i6;
            }
            i4++;
            i3 = i5;
            j += (long) track.getSamples().size();
        }
        return jArr;
    }

    public TrackMetaData getTrackMetaData() {
        return this.tracks[0].getTrackMetaData();
    }
}
