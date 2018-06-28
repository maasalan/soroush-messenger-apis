package com.googlecode.mp4parser.authoring;

import com.googlecode.mp4parser.util.Matrix;
import java.util.LinkedList;
import java.util.List;

public class Movie {
    Matrix matrix = Matrix.ROTATE_0;
    List<Track> tracks = new LinkedList();

    public Movie(List<Track> list) {
        this.tracks = list;
    }

    public static long gcd(long j, long j2) {
        while (true) {
            long j3 = j;
            j = j2;
            j2 = j3;
            if (j == 0) {
                return j2;
            }
            j2 %= j;
        }
    }

    public void addTrack(Track track) {
        if (getTrackByTrackId(track.getTrackMetaData().getTrackId()) != null) {
            track.getTrackMetaData().setTrackId(getNextTrackId());
        }
        this.tracks.add(track);
    }

    public Matrix getMatrix() {
        return this.matrix;
    }

    public long getNextTrackId() {
        long j = 0;
        for (Track track : this.tracks) {
            if (j < track.getTrackMetaData().getTrackId()) {
                j = track.getTrackMetaData().getTrackId();
            }
        }
        return j + 1;
    }

    public long getTimescale() {
        long timescale = ((Track) getTracks().iterator().next()).getTrackMetaData().getTimescale();
        for (Track trackMetaData : getTracks()) {
            timescale = gcd(trackMetaData.getTrackMetaData().getTimescale(), timescale);
        }
        return timescale;
    }

    public Track getTrackByTrackId(long j) {
        for (Track track : this.tracks) {
            if (track.getTrackMetaData().getTrackId() == j) {
                return track;
            }
        }
        return null;
    }

    public List<Track> getTracks() {
        return this.tracks;
    }

    public void setMatrix(Matrix matrix) {
        this.matrix = matrix;
    }

    public void setTracks(List<Track> list) {
        this.tracks = list;
    }

    public String toString() {
        Object obj = "Movie{ ";
        for (Track track : this.tracks) {
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(obj));
            stringBuilder.append("track_");
            stringBuilder.append(track.getTrackMetaData().getTrackId());
            stringBuilder.append(" (");
            stringBuilder.append(track.getHandler());
            stringBuilder.append(") ");
            obj = stringBuilder.toString();
        }
        StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(obj));
        stringBuilder2.append('}');
        return stringBuilder2.toString();
    }
}
