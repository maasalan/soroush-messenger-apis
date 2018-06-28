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

public class DivideTimeScaleTrack implements Track {
    Track source;
    private int timeScaleDivisor;

    public DivideTimeScaleTrack(Track track, int i) {
        this.source = track;
        this.timeScaleDivisor = i;
    }

    List<Entry> adjustCtts() {
        List<Entry> compositionTimeEntries = this.source.getCompositionTimeEntries();
        if (compositionTimeEntries == null) {
            return null;
        }
        List<Entry> arrayList = new ArrayList(compositionTimeEntries.size());
        for (Entry entry : compositionTimeEntries) {
            arrayList.add(new Entry(entry.getCount(), entry.getOffset() / this.timeScaleDivisor));
        }
        return arrayList;
    }

    public void close() {
        this.source.close();
    }

    public List<Entry> getCompositionTimeEntries() {
        return adjustCtts();
    }

    public long getDuration() {
        long[] sampleDurations = getSampleDurations();
        long j = 0;
        int i = 0;
        while (i < sampleDurations.length) {
            i++;
            j += sampleDurations[i];
        }
        return j;
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
            jArr[i] = this.source.getSampleDurations()[i] / ((long) this.timeScaleDivisor);
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
        trackMetaData.setTimescale(this.source.getTrackMetaData().getTimescale() / ((long) this.timeScaleDivisor));
        return trackMetaData;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("MultiplyTimeScaleTrack{source=");
        stringBuilder.append(this.source);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
