package com.coremedia.iso.boxes.fragment;

import com.coremedia.iso.boxes.SampleDependencyTypeBox;
import com.coremedia.iso.boxes.SampleDependencyTypeBox.Entry;
import com.googlecode.mp4parser.AbstractContainerBox;
import com.googlecode.mp4parser.DataSource;
import java.util.ArrayList;
import java.util.List;

public class MovieFragmentBox extends AbstractContainerBox {
    public static final String TYPE = "moof";

    public MovieFragmentBox() {
        super(TYPE);
    }

    public DataSource getFileChannel() {
        return this.dataSource;
    }

    public List<Long> getSyncSamples(SampleDependencyTypeBox sampleDependencyTypeBox) {
        List<Long> arrayList = new ArrayList();
        long j = 1;
        for (Entry sampleDependsOn : sampleDependencyTypeBox.getEntries()) {
            if (sampleDependsOn.getSampleDependsOn() == 2) {
                arrayList.add(Long.valueOf(j));
            }
            j++;
        }
        return arrayList;
    }

    public int getTrackCount() {
        return getBoxes(TrackFragmentBox.class, false).size();
    }

    public List<TrackFragmentHeaderBox> getTrackFragmentHeaderBoxes() {
        return getBoxes(TrackFragmentHeaderBox.class, true);
    }

    public long[] getTrackNumbers() {
        int i = 0;
        List boxes = getBoxes(TrackFragmentBox.class, false);
        long[] jArr = new long[boxes.size()];
        while (i < boxes.size()) {
            jArr[i] = ((TrackFragmentBox) boxes.get(i)).getTrackFragmentHeaderBox().getTrackId();
            i++;
        }
        return jArr;
    }

    public List<TrackRunBox> getTrackRunBoxes() {
        return getBoxes(TrackRunBox.class, true);
    }
}
