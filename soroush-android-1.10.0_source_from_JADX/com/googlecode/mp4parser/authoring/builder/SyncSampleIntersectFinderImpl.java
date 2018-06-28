package com.googlecode.mp4parser.authoring.builder;

import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.OriginalFormatBox;
import com.coremedia.iso.boxes.sampleentry.AudioSampleEntry;
import com.coremedia.iso.boxes.sampleentry.VisualSampleEntry;
import com.googlecode.mp4parser.authoring.Movie;
import com.googlecode.mp4parser.authoring.Track;
import com.googlecode.mp4parser.util.Math;
import com.googlecode.mp4parser.util.Path;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;

public class SyncSampleIntersectFinderImpl implements FragmentIntersectionFinder {
    private static Logger LOG = Logger.getLogger(SyncSampleIntersectFinderImpl.class.getName());
    private final int minFragmentDurationSeconds;
    private Movie movie;
    private Track referenceTrack;

    public SyncSampleIntersectFinderImpl(Movie movie, Track track, int i) {
        this.movie = movie;
        this.referenceTrack = track;
        this.minFragmentDurationSeconds = i;
    }

    private static long calculateTracktimesScalingFactor(Movie movie, Track track) {
        long j = 1;
        for (Track track2 : movie.getTracks()) {
            if (track2.getHandler().equals(track.getHandler()) && track2.getTrackMetaData().getTimescale() != track.getTrackMetaData().getTimescale()) {
                j = Math.lcm(j, track2.getTrackMetaData().getTimescale());
            }
        }
        return j;
    }

    static String getFormat(Track track) {
        Box sampleEntry = track.getSampleDescriptionBox().getSampleEntry();
        String type = sampleEntry.getType();
        return (type.equals(VisualSampleEntry.TYPE_ENCRYPTED) || type.equals(AudioSampleEntry.TYPE_ENCRYPTED) || type.equals(VisualSampleEntry.TYPE_ENCRYPTED)) ? ((OriginalFormatBox) Path.getPath(sampleEntry, "sinf/frma")).getDataFormat() : type;
    }

    public static List<long[]> getSyncSamplesTimestamps(Movie movie, Track track) {
        List<long[]> linkedList = new LinkedList();
        for (Track track2 : movie.getTracks()) {
            if (track2.getHandler().equals(track.getHandler())) {
                long[] syncSamples = track2.getSyncSamples();
                if (syncSamples != null && syncSamples.length > 0) {
                    linkedList.add(getTimes(track2, movie));
                }
            }
        }
        return linkedList;
    }

    private static long[] getTimes(Track track, Movie movie) {
        long[] syncSamples = track.getSyncSamples();
        long j = 0;
        int i = 0;
        long[] jArr = new long[syncSamples.length];
        long calculateTracktimesScalingFactor = calculateTracktimesScalingFactor(movie, track);
        int i2 = 1;
        while (true) {
            long j2 = (long) i2;
            if (j2 > syncSamples[syncSamples.length - 1]) {
                return jArr;
            }
            if (j2 == syncSamples[i]) {
                int i3 = i + 1;
                jArr[i] = j * calculateTracktimesScalingFactor;
                i = i3;
            }
            j += track.getSampleDurations()[-1 + i2];
            i2++;
        }
    }

    public long[] getCommonIndices(long[] jArr, long[] jArr2, long j, long[]... jArr3) {
        SyncSampleIntersectFinderImpl syncSampleIntersectFinderImpl = this;
        long[] jArr4 = jArr;
        long[] jArr5 = jArr2;
        long[][] jArr6 = jArr3;
        List<Long> linkedList = new LinkedList();
        List linkedList2 = new LinkedList();
        int i = 0;
        for (int i2 = 0; i2 < jArr5.length; i2++) {
            int i3 = 1;
            for (long[] binarySearch : jArr6) {
                i3 &= Arrays.binarySearch(binarySearch, jArr5[i2]) >= 0 ? 1 : 0;
            }
            if (i3 != 0) {
                linkedList.add(Long.valueOf(jArr4[i2]));
                linkedList2.add(Long.valueOf(jArr5[i2]));
            }
        }
        Iterator it;
        if (((double) linkedList.size()) < ((double) jArr4.length) * 0.25d) {
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(""));
            stringBuilder.append(String.format("%5d - Common:  [", new Object[]{Integer.valueOf(linkedList.size())}));
            Object stringBuilder2 = stringBuilder.toString();
            for (Long longValue : linkedList) {
                long longValue2 = longValue.longValue();
                StringBuilder stringBuilder3 = new StringBuilder(String.valueOf(stringBuilder2));
                stringBuilder3.append(String.format("%10d,", new Object[]{Long.valueOf(longValue2)}));
                stringBuilder2 = stringBuilder3.toString();
            }
            stringBuilder = new StringBuilder(String.valueOf(stringBuilder2));
            stringBuilder.append("]");
            LOG.warning(stringBuilder.toString());
            stringBuilder = new StringBuilder(String.valueOf(""));
            stringBuilder.append(String.format("%5d - In    :  [", new Object[]{Integer.valueOf(jArr4.length)}));
            String stringBuilder4 = stringBuilder.toString();
            Object obj = stringBuilder4;
            for (long j2 : jArr4) {
                long j22;
                StringBuilder stringBuilder5 = new StringBuilder(String.valueOf(obj));
                stringBuilder5.append(String.format("%10d,", new Object[]{Long.valueOf(j22)}));
                obj = stringBuilder5.toString();
            }
            StringBuilder stringBuilder6 = new StringBuilder(String.valueOf(obj));
            stringBuilder6.append("]");
            LOG.warning(stringBuilder6.toString());
            LOG.warning("There are less than 25% of common sync samples in the given track.");
            throw new RuntimeException("There are less than 25% of common sync samples in the given track.");
        }
        List list;
        if (((double) linkedList.size()) < ((double) jArr4.length) * 0.5d) {
            LOG.fine("There are less than 50% of common sync samples in the given track. This is implausible but I'm ok to continue.");
        } else if (linkedList.size() < jArr4.length) {
            Logger logger = LOG;
            stringBuilder = new StringBuilder("Common SyncSample positions vs. this tracks SyncSample positions: ");
            stringBuilder.append(linkedList.size());
            stringBuilder.append(" vs. ");
            stringBuilder.append(jArr4.length);
            logger.finest(stringBuilder.toString());
        }
        List linkedList3 = new LinkedList();
        if (syncSampleIntersectFinderImpl.minFragmentDurationSeconds > 0) {
            it = linkedList2.iterator();
            longValue2 = -1;
            long j3 = -1;
            for (Long longValue3 : linkedList) {
                if (!it.hasNext()) {
                    break;
                }
                j22 = longValue3.longValue();
                long longValue4 = ((Long) it.next()).longValue();
                if (j3 != longValue2) {
                    if ((longValue4 - j3) / j < ((long) syncSampleIntersectFinderImpl.minFragmentDurationSeconds)) {
                        longValue2 = -1;
                    }
                }
                linkedList3.add(Long.valueOf(j22));
                j3 = longValue4;
                longValue2 = -1;
            }
            list = linkedList3;
        } else {
            list = linkedList;
        }
        long[] jArr7 = new long[list.size()];
        while (i < jArr7.length) {
            jArr7[i] = ((Long) list.get(i)).longValue();
            i++;
        }
        return jArr7;
    }

    public long[] sampleNumbers(Track track) {
        SyncSampleIntersectFinderImpl syncSampleIntersectFinderImpl = this;
        Track track2 = track;
        if (!"vide".equals(track.getHandler())) {
            int i = 0;
            if ("soun".equals(track.getHandler())) {
                if (syncSampleIntersectFinderImpl.referenceTrack == null) {
                    for (Track track3 : syncSampleIntersectFinderImpl.movie.getTracks()) {
                        if (track3.getSyncSamples() != null && "vide".equals(track3.getHandler()) && track3.getSyncSamples().length > 0) {
                            syncSampleIntersectFinderImpl.referenceTrack = track3;
                        }
                    }
                }
                if (syncSampleIntersectFinderImpl.referenceTrack != null) {
                    long j;
                    Track track4;
                    AudioSampleEntry audioSampleEntry;
                    AudioSampleEntry audioSampleEntry2;
                    long j2;
                    double sampleRate;
                    long[] sampleNumbers = sampleNumbers(syncSampleIntersectFinderImpl.referenceTrack);
                    int size = syncSampleIntersectFinderImpl.referenceTrack.getSamples().size();
                    long[] jArr = new long[sampleNumbers.length];
                    Iterator it = syncSampleIntersectFinderImpl.movie.getTracks().iterator();
                    while (true) {
                        j = 192000;
                        if (!it.hasNext()) {
                            break;
                        }
                        track4 = (Track) it.next();
                        if (getFormat(track).equals(getFormat(track4))) {
                            audioSampleEntry = (AudioSampleEntry) track4.getSampleDescriptionBox().getSampleEntry();
                            if (audioSampleEntry.getSampleRate() < 192000) {
                                break;
                            }
                        }
                        audioSampleEntry2 = (AudioSampleEntry) track.getSampleDescriptionBox().getSampleEntry();
                        j2 = track.getSampleDurations()[i];
                        sampleRate = ((double) audioSampleEntry2.getSampleRate()) / ((double) j);
                        if (sampleRate == Math.rint(sampleRate)) {
                            throw new RuntimeException("Sample rates must be a multiple of the lowest sample rate to create a correct file!");
                        }
                        while (i < jArr.length) {
                            jArr[i] = (long) (1.0d + ((((double) jArr[i]) * sampleRate) / ((double) j2)));
                            i++;
                        }
                        return jArr;
                    }
                    j = audioSampleEntry.getSampleRate();
                    double size2 = ((double) ((long) track4.getSamples().size())) / ((double) size);
                    long j3 = track4.getSampleDurations()[0];
                    size = 0;
                    while (size < jArr.length) {
                        int i2 = size;
                        jArr[i2] = (long) Math.ceil((((double) (sampleNumbers[size] - 1)) * size2) * ((double) j3));
                        size = i2 + 1;
                        i = 0;
                    }
                    audioSampleEntry2 = (AudioSampleEntry) track.getSampleDescriptionBox().getSampleEntry();
                    j2 = track.getSampleDurations()[i];
                    sampleRate = ((double) audioSampleEntry2.getSampleRate()) / ((double) j);
                    if (sampleRate == Math.rint(sampleRate)) {
                        while (i < jArr.length) {
                            jArr[i] = (long) (1.0d + ((((double) jArr[i]) * sampleRate) / ((double) j2)));
                            i++;
                        }
                        return jArr;
                    }
                    throw new RuntimeException("Sample rates must be a multiple of the lowest sample rate to create a correct file!");
                }
                throw new RuntimeException("There was absolutely no Track with sync samples. I can't work with that!");
            }
            for (Track track5 : syncSampleIntersectFinderImpl.movie.getTracks()) {
                if (track5.getSyncSamples() != null && track5.getSyncSamples().length > 0) {
                    long[] sampleNumbers2 = sampleNumbers(track5);
                    int size3 = track5.getSamples().size();
                    long[] jArr2 = new long[sampleNumbers2.length];
                    double size4 = ((double) ((long) track.getSamples().size())) / ((double) size3);
                    for (int i3 = 0; i3 < jArr2.length; i3++) {
                        jArr2[i3] = ((long) Math.ceil(((double) (sampleNumbers2[i3] - 1)) * size4)) + 1;
                    }
                    return jArr2;
                }
            }
            throw new RuntimeException("There was absolutely no Track with sync samples. I can't work with that!");
        } else if (track.getSyncSamples() == null || track.getSyncSamples().length <= 0) {
            throw new RuntimeException("Video Tracks need sync samples. Only tracks other than video may have no sync samples.");
        } else {
            List syncSamplesTimestamps = getSyncSamplesTimestamps(syncSampleIntersectFinderImpl.movie, track2);
            return getCommonIndices(track.getSyncSamples(), getTimes(track2, syncSampleIntersectFinderImpl.movie), track.getTrackMetaData().getTimescale(), (long[][]) syncSamplesTimestamps.toArray(new long[syncSamplesTimestamps.size()][]));
        }
    }
}
