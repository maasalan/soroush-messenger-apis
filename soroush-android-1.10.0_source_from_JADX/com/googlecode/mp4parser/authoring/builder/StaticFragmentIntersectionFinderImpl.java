package com.googlecode.mp4parser.authoring.builder;

import com.googlecode.mp4parser.authoring.Track;
import java.util.Map;

public class StaticFragmentIntersectionFinderImpl implements FragmentIntersectionFinder {
    Map<Track, long[]> sampleNumbers;

    public StaticFragmentIntersectionFinderImpl(Map<Track, long[]> map) {
        this.sampleNumbers = map;
    }

    public long[] sampleNumbers(Track track) {
        return (long[]) this.sampleNumbers.get(track);
    }
}
