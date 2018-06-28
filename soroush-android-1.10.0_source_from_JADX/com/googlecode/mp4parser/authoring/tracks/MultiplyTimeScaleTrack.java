package com.googlecode.mp4parser.authoring.tracks;

import com.coremedia.iso.boxes.CompositionTimeToSample.Entry;
import com.coremedia.iso.boxes.SampleDependencyTypeBox;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.SubSampleInformationBox;
import com.googlecode.mp4parser.authoring.Edit;
import com.googlecode.mp4parser.authoring.Sample;
import com.googlecode.mp4parser.authoring.Track;
import com.googlecode.mp4parser.authoring.TrackMetaData;
import com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MultiplyTimeScaleTrack implements Track {
    Track source;
    private int timeScaleFactor;

    public MultiplyTimeScaleTrack(Track track, int i) {
        this.source = track;
        this.timeScaleFactor = i;
    }

    static List<Entry> adjustCtts(List<Entry> list, int i) {
        if (list == null) {
            return null;
        }
        List<Entry> arrayList = new ArrayList(list.size());
        for (Entry entry : list) {
            arrayList.add(new Entry(entry.getCount(), entry.getOffset() * i));
        }
        return arrayList;
    }

    public void close() {
        this.source.close();
    }

    public List<Entry> getCompositionTimeEntries() {
        return adjustCtts(this.source.getCompositionTimeEntries(), this.timeScaleFactor);
    }

    public long getDuration() {
        return this.source.getDuration() * ((long) this.timeScaleFactor);
    }

    public List<Edit> getEdits() {
        return this.source.getEdits();
    }

    public String getHandler() {
        return this.source.getHandler();
    }

    public String getName() {
        StringBuilder stringBuilder = new StringBuilder("timscale(");
        stringBuilder.append(this.source.getName());
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public List<SampleDependencyTypeBox.Entry> getSampleDependencies() {
        return this.source.getSampleDependencies();
    }

    public SampleDescriptionBox getSampleDescriptionBox() {
        return this.source.getSampleDescriptionBox();
    }

    public long[] getSampleDurations() {
        long[] jArr = new long[this.source.getSampleDurations().length];
        for (int i = 0; i < this.source.getSampleDurations().length; i++) {
            jArr[i] = this.source.getSampleDurations()[i] * ((long) this.timeScaleFactor);
        }
        return jArr;
    }

    public Map<GroupEntry, long[]> getSampleGroups() {
        return this.source.getSampleGroups();
    }

    public List<Sample> getSamples() {
        return this.source.getSamples();
    }

    public SubSampleInformationBox getSubsampleInformationBox() {
        return this.source.getSubsampleInformationBox();
    }

    public long[] getSyncSamples() {
        return this.source.getSyncSamples();
    }

    public TrackMetaData getTrackMetaData() {
        TrackMetaData trackMetaData = (TrackMetaData) this.source.getTrackMetaData().clone();
        trackMetaData.setTimescale(this.source.getTrackMetaData().getTimescale() * ((long) this.timeScaleFactor));
        return trackMetaData;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("MultiplyTimeScaleTrack{source=");
        stringBuilder.append(this.source);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
