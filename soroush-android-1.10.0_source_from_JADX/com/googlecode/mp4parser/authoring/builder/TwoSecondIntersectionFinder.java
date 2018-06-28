package com.googlecode.mp4parser.authoring.builder;

import com.googlecode.mp4parser.authoring.Movie;
import com.googlecode.mp4parser.authoring.Track;
import java.util.Arrays;

public class TwoSecondIntersectionFinder implements FragmentIntersectionFinder {
    private int fragmentLength = 2;
    private Movie movie;

    public TwoSecondIntersectionFinder(Movie movie, int i) {
        this.movie = movie;
        this.fragmentLength = i;
    }

    public long[] sampleNumbers(Track track) {
        int timescale;
        double d = 0.0d;
        for (Track track2 : this.movie.getTracks()) {
            double duration = (double) (track2.getDuration() / track2.getTrackMetaData().getTimescale());
            if (d < duration) {
                d = duration;
            }
        }
        int min = Math.min(((int) Math.ceil(d / ((double) r0.fragmentLength))) - 1, track.getSamples().size());
        if (min <= 0) {
            min = 1;
        }
        long[] jArr = new long[min];
        Arrays.fill(jArr, -1);
        int i = 0;
        jArr[0] = 1;
        long[] sampleDurations = track.getSampleDurations();
        int length = sampleDurations.length;
        long j = 0;
        min = 0;
        int i2 = min;
        while (min < length) {
            long j2 = sampleDurations[min];
            timescale = ((int) ((j / track.getTrackMetaData().getTimescale()) / ((long) r0.fragmentLength))) + 1;
            if (timescale >= jArr.length) {
                break;
            }
            i2++;
            jArr[timescale] = (long) i2;
            min++;
            j += j2;
        }
        long j3 = (long) (i2 + 1);
        for (int length2 = jArr.length - 1; length2 >= 0; length2--) {
            if (jArr[length2] == -1) {
                jArr[length2] = j3;
            }
            j3 = jArr[length2];
        }
        long[] jArr2 = new long[0];
        timescale = jArr.length;
        while (i < timescale) {
            long j4 = jArr[i];
            if (jArr2.length == 0 || jArr2[jArr2.length - 1] != j4) {
                jArr2 = Arrays.copyOf(jArr2, jArr2.length + 1);
                jArr2[jArr2.length - 1] = j4;
            }
            i++;
        }
        return jArr2;
    }
}
