package com.googlecode.mp4parser.authoring.container.mp4;

import com.coremedia.iso.IsoFile;
import com.coremedia.iso.boxes.SchemeTypeBox;
import com.coremedia.iso.boxes.TrackBox;
import com.googlecode.mp4parser.AbstractContainerBox;
import com.googlecode.mp4parser.DataSource;
import com.googlecode.mp4parser.FileDataSourceImpl;
import com.googlecode.mp4parser.authoring.CencMp4TrackImplImpl;
import com.googlecode.mp4parser.authoring.Movie;
import com.googlecode.mp4parser.authoring.Mp4TrackImpl;
import com.googlecode.mp4parser.authoring.Track;
import com.googlecode.mp4parser.util.Path;
import java.io.File;

public class MovieCreator {
    public static Movie build(DataSource dataSource) {
        IsoFile isoFile = new IsoFile(dataSource);
        Movie movie = new Movie();
        for (AbstractContainerBox abstractContainerBox : isoFile.getMovieBox().getBoxes(TrackBox.class)) {
            Track mp4TrackImpl;
            SchemeTypeBox schemeTypeBox = (SchemeTypeBox) Path.getPath(abstractContainerBox, "mdia[0]/minf[0]/stbl[0]/stsd[0]/enc.[0]/sinf[0]/schm[0]");
            StringBuilder stringBuilder;
            if (schemeTypeBox == null || !(schemeTypeBox.getSchemeType().equals("cenc") || schemeTypeBox.getSchemeType().equals("cbc1"))) {
                stringBuilder = new StringBuilder(String.valueOf(dataSource.toString()));
                stringBuilder.append("[");
                stringBuilder.append(abstractContainerBox.getTrackHeaderBox().getTrackId());
                stringBuilder.append("]");
                mp4TrackImpl = new Mp4TrackImpl(stringBuilder.toString(), abstractContainerBox, new IsoFile[0]);
            } else {
                stringBuilder = new StringBuilder(String.valueOf(dataSource.toString()));
                stringBuilder.append("[");
                stringBuilder.append(abstractContainerBox.getTrackHeaderBox().getTrackId());
                stringBuilder.append("]");
                mp4TrackImpl = new CencMp4TrackImplImpl(stringBuilder.toString(), abstractContainerBox, new IsoFile[0]);
            }
            movie.addTrack(mp4TrackImpl);
        }
        movie.setMatrix(isoFile.getMovieBox().getMovieHeaderBox().getMatrix());
        return movie;
    }

    public static Movie build(String str) {
        return build(new FileDataSourceImpl(new File(str)));
    }
}
