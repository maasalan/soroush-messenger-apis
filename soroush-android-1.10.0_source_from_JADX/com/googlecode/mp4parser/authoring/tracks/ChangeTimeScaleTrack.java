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
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

public class ChangeTimeScaleTrack implements Track {
    private static final Logger LOG = Logger.getLogger(ChangeTimeScaleTrack.class.getName());
    List<Entry> ctts;
    long[] decodingTimes;
    Track source;
    long timeScale;

    public ChangeTimeScaleTrack(Track track, long j, long[] jArr) {
        this.source = track;
        this.timeScale = j;
        double timescale = ((double) j) / ((double) track.getTrackMetaData().getTimescale());
        this.ctts = adjustCtts(track.getCompositionTimeEntries(), timescale);
        this.decodingTimes = adjustTts(track.getSampleDurations(), timescale, jArr, getTimes(track, jArr, j));
    }

    static List<Entry> adjustCtts(List<Entry> list, double d) {
        if (list == null) {
            return null;
        }
        List<Entry> arrayList = new ArrayList(list.size());
        for (Entry entry : list) {
            arrayList.add(new Entry(entry.getCount(), (int) Math.round(((double) entry.getOffset()) * d)));
        }
        return arrayList;
    }

    static long[] adjustTts(long[] jArr, double d, long[] jArr2, long[] jArr3) {
        long[] jArr4 = jArr;
        long[] jArr5 = new long[jArr4.length];
        long j = 0;
        int i = 1;
        while (i <= jArr4.length) {
            int i2;
            long j2;
            long j3;
            int i3 = i - 1;
            long round = Math.round(((double) jArr4[i3]) * d);
            int i4 = i + 1;
            int binarySearch = Arrays.binarySearch(jArr2, (long) i4);
            if (binarySearch < 0 || jArr3[binarySearch] == j) {
                i2 = i4;
                j2 = round;
            } else {
                int i5 = i;
                j3 = jArr3[binarySearch] - (j + round);
                Logger logger = LOG;
                r9 = new Object[4];
                i2 = i4;
                r9[0] = Integer.valueOf(i5);
                r9[1] = Long.valueOf(j);
                r9[2] = Long.valueOf(jArr3[binarySearch]);
                r9[3] = Long.valueOf(j3);
                logger.finest(String.format("Sample %d %d / %d - correct by %d", r9));
                j2 = round + j3;
            }
            j3 = j + j2;
            jArr5[i3] = j2;
            j = j3;
            i = i2;
            jArr4 = jArr;
        }
        return jArr5;
    }

    private static long[] getTimes(Track track, long[] jArr, long j) {
        int i = 0;
        long[] jArr2 = new long[jArr.length];
        long j2 = 0;
        int i2 = 1;
        while (true) {
            long j3 = (long) i2;
            if (j3 > jArr[jArr.length - 1]) {
                return jArr2;
            }
            if (j3 == jArr[i]) {
                int i3 = i + 1;
                jArr2[i] = (j2 * j) / track.getTrackMetaData().getTimescale();
                i = i3;
            }
            i2++;
            j2 += track.getSampleDurations()[i2 - 1];
        }
    }

    public void close() {
        this.source.close();
    }

    public List<Entry> getCompositionTimeEntries() {
        return this.ctts;
    }

    public long getDuration() {
        long[] jArr = this.decodingTimes;
        long j = 0;
        int i = 0;
        while (i < jArr.length) {
            i++;
            j += jArr[i];
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
        StringBuilder stringBuilder = new StringBuilder("timeScale(");
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
        return this.decodingTimes;
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
        trackMetaData.setTimescale(this.timeScale);
        return trackMetaData;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("ChangeTimeScaleTrack{source=");
        stringBuilder.append(this.source);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
