package com.googlecode.mp4parser.authoring.tracks;

import com.coremedia.iso.boxes.CompositionTimeToSample.Entry;
import com.coremedia.iso.boxes.SampleDependencyTypeBox;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.SubSampleInformationBox;
import com.googlecode.mp4parser.authoring.AbstractTrack;
import com.googlecode.mp4parser.authoring.Sample;
import com.googlecode.mp4parser.authoring.SampleImpl;
import com.googlecode.mp4parser.authoring.Track;
import com.googlecode.mp4parser.authoring.TrackMetaData;
import java.nio.ByteBuffer;
import java.util.AbstractList;
import java.util.List;

public class ReplaceSampleTrack extends AbstractTrack {
    Track origTrack;
    private Sample sampleContent;
    private long sampleNumber;
    private List<Sample> samples = new ReplaceASingleEntryList();

    private class ReplaceASingleEntryList extends AbstractList<Sample> {
        private ReplaceASingleEntryList() {
        }

        public Sample get(int i) {
            return ReplaceSampleTrack.this.sampleNumber == ((long) i) ? ReplaceSampleTrack.this.sampleContent : (Sample) ReplaceSampleTrack.this.origTrack.getSamples().get(i);
        }

        public int size() {
            return ReplaceSampleTrack.this.origTrack.getSamples().size();
        }
    }

    public ReplaceSampleTrack(Track track, long j, ByteBuffer byteBuffer) {
        StringBuilder stringBuilder = new StringBuilder("replace(");
        stringBuilder.append(track.getName());
        stringBuilder.append(")");
        super(stringBuilder.toString());
        this.origTrack = track;
        this.sampleNumber = j;
        this.sampleContent = new SampleImpl(byteBuffer);
    }

    public void close() {
        this.origTrack.close();
    }

    public List<Entry> getCompositionTimeEntries() {
        return this.origTrack.getCompositionTimeEntries();
    }

    public String getHandler() {
        return this.origTrack.getHandler();
    }

    public List<SampleDependencyTypeBox.Entry> getSampleDependencies() {
        return this.origTrack.getSampleDependencies();
    }

    public SampleDescriptionBox getSampleDescriptionBox() {
        return this.origTrack.getSampleDescriptionBox();
    }

    public synchronized long[] getSampleDurations() {
        return this.origTrack.getSampleDurations();
    }

    public List<Sample> getSamples() {
        return this.samples;
    }

    public SubSampleInformationBox getSubsampleInformationBox() {
        return this.origTrack.getSubsampleInformationBox();
    }

    public synchronized long[] getSyncSamples() {
        return this.origTrack.getSyncSamples();
    }

    public TrackMetaData getTrackMetaData() {
        return this.origTrack.getTrackMetaData();
    }
}
