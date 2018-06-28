package com.googlecode.mp4parser.authoring.tracks;

import com.coremedia.iso.boxes.CompositionTimeToSample.Entry;
import com.coremedia.iso.boxes.SampleDependencyTypeBox;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.SubSampleInformationBox;
import com.coremedia.iso.boxes.TimeToSampleBox;
import com.googlecode.mp4parser.authoring.AbstractTrack;
import com.googlecode.mp4parser.authoring.Sample;
import com.googlecode.mp4parser.authoring.Track;
import com.googlecode.mp4parser.authoring.TrackMetaData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class CroppedTrack extends AbstractTrack {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private int fromSample;
    Track origTrack;
    private int toSample;

    public CroppedTrack(Track track, long j, long j2) {
        StringBuilder stringBuilder = new StringBuilder("crop(");
        stringBuilder.append(track.getName());
        stringBuilder.append(")");
        super(stringBuilder.toString());
        this.origTrack = track;
        this.fromSample = (int) j;
        this.toSample = (int) j2;
    }

    static List<Entry> getCompositionTimeEntries(List<Entry> list, long j, long j2) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        Object entry;
        long j3 = 0;
        ListIterator listIterator = list.listIterator();
        ArrayList arrayList = new ArrayList();
        while (true) {
            Entry entry2 = (Entry) listIterator.next();
            if (((long) entry2.getCount()) + j3 > j) {
                break;
            }
            j3 += (long) entry2.getCount();
        }
        if (((long) entry2.getCount()) + j3 >= j2) {
            entry = new Entry((int) (j2 - j), entry2.getOffset());
        } else {
            arrayList.add(new Entry((int) ((((long) entry2.getCount()) + j3) - j), entry2.getOffset()));
            long count = j3 + ((long) entry2.getCount());
            while (listIterator.hasNext()) {
                entry2 = (Entry) listIterator.next();
                if (((long) entry2.getCount()) + count >= j2) {
                    break;
                }
                arrayList.add(entry2);
                count += (long) entry2.getCount();
            }
            entry = new Entry((int) (j2 - count), entry2.getOffset());
        }
        arrayList.add(entry);
        return arrayList;
    }

    static List<TimeToSampleBox.Entry> getDecodingTimeEntries(List<TimeToSampleBox.Entry> list, long j, long j2) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        Object entry;
        long j3 = 0;
        ListIterator listIterator = list.listIterator();
        LinkedList linkedList = new LinkedList();
        while (true) {
            TimeToSampleBox.Entry entry2 = (TimeToSampleBox.Entry) listIterator.next();
            if (entry2.getCount() + j3 > j) {
                break;
            }
            j3 += entry2.getCount();
        }
        if (entry2.getCount() + j3 >= j2) {
            entry = new TimeToSampleBox.Entry(j2 - j, entry2.getDelta());
        } else {
            linkedList.add(new TimeToSampleBox.Entry((entry2.getCount() + j3) - j, entry2.getDelta()));
            long count = j3 + entry2.getCount();
            while (listIterator.hasNext()) {
                entry2 = (TimeToSampleBox.Entry) listIterator.next();
                if (entry2.getCount() + count >= j2) {
                    break;
                }
                linkedList.add(entry2);
                count += entry2.getCount();
            }
            entry = new TimeToSampleBox.Entry(j2 - count, entry2.getDelta());
        }
        linkedList.add(entry);
        return linkedList;
    }

    public void close() {
        this.origTrack.close();
    }

    public List<Entry> getCompositionTimeEntries() {
        return getCompositionTimeEntries(this.origTrack.getCompositionTimeEntries(), (long) this.fromSample, (long) this.toSample);
    }

    public String getHandler() {
        return this.origTrack.getHandler();
    }

    public List<SampleDependencyTypeBox.Entry> getSampleDependencies() {
        return (this.origTrack.getSampleDependencies() == null || this.origTrack.getSampleDependencies().isEmpty()) ? null : this.origTrack.getSampleDependencies().subList(this.fromSample, this.toSample);
    }

    public SampleDescriptionBox getSampleDescriptionBox() {
        return this.origTrack.getSampleDescriptionBox();
    }

    public synchronized long[] getSampleDurations() {
        Object obj;
        obj = new long[(this.toSample - this.fromSample)];
        System.arraycopy(this.origTrack.getSampleDurations(), this.fromSample, obj, 0, obj.length);
        return obj;
    }

    public List<Sample> getSamples() {
        return this.origTrack.getSamples().subList(this.fromSample, this.toSample);
    }

    public SubSampleInformationBox getSubsampleInformationBox() {
        return this.origTrack.getSubsampleInformationBox();
    }

    public synchronized long[] getSyncSamples() {
        if (this.origTrack.getSyncSamples() == null) {
            return null;
        }
        long[] syncSamples = this.origTrack.getSyncSamples();
        int length = syncSamples.length;
        int i = 0;
        int i2 = 0;
        while (i2 < syncSamples.length) {
            if (syncSamples[i2] >= ((long) this.fromSample)) {
                break;
            }
            i2++;
        }
        while (length > 0) {
            if (((long) this.toSample) >= syncSamples[length - 1]) {
                break;
            }
            length--;
        }
        syncSamples = Arrays.copyOfRange(this.origTrack.getSyncSamples(), i2, length);
        while (i < syncSamples.length) {
            syncSamples[i] = syncSamples[i] - ((long) this.fromSample);
            i++;
        }
        return syncSamples;
    }

    public TrackMetaData getTrackMetaData() {
        return this.origTrack.getTrackMetaData();
    }
}
