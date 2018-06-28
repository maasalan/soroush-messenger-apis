package com.googlecode.mp4parser.authoring;

import com.coremedia.iso.boxes.CompositionTimeToSample.Entry;
import com.coremedia.iso.boxes.SampleDependencyTypeBox;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.SubSampleInformationBox;
import com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry;
import java.util.List;
import java.util.Map;

public class WrappingTrack implements Track {
    Track parent;

    public WrappingTrack(Track track) {
        this.parent = track;
    }

    public void close() {
        this.parent.close();
    }

    public List<Entry> getCompositionTimeEntries() {
        return this.parent.getCompositionTimeEntries();
    }

    public long getDuration() {
        return this.parent.getDuration();
    }

    public List<Edit> getEdits() {
        return this.parent.getEdits();
    }

    public String getHandler() {
        return this.parent.getHandler();
    }

    public String getName() {
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(this.parent.getName()));
        stringBuilder.append("'");
        return stringBuilder.toString();
    }

    public List<SampleDependencyTypeBox.Entry> getSampleDependencies() {
        return this.parent.getSampleDependencies();
    }

    public SampleDescriptionBox getSampleDescriptionBox() {
        return this.parent.getSampleDescriptionBox();
    }

    public long[] getSampleDurations() {
        return this.parent.getSampleDurations();
    }

    public Map<GroupEntry, long[]> getSampleGroups() {
        return this.parent.getSampleGroups();
    }

    public List<Sample> getSamples() {
        return this.parent.getSamples();
    }

    public SubSampleInformationBox getSubsampleInformationBox() {
        return this.parent.getSubsampleInformationBox();
    }

    public long[] getSyncSamples() {
        return this.parent.getSyncSamples();
    }

    public TrackMetaData getTrackMetaData() {
        return this.parent.getTrackMetaData();
    }
}
