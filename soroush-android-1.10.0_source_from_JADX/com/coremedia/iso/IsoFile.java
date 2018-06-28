package com.coremedia.iso;

import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.MovieBox;
import com.googlecode.mp4parser.BasicContainer;
import com.googlecode.mp4parser.DataSource;
import com.googlecode.mp4parser.FileDataSourceImpl;
import com.googlecode.mp4parser.annotations.DoNotParseDetail;
import com.googlecode.mp4parser.util.Logger;
import java.io.Closeable;
import java.io.File;
import java.nio.channels.WritableByteChannel;

@DoNotParseDetail
public class IsoFile extends BasicContainer implements Closeable {
    private static Logger LOG = Logger.getLogger(IsoFile.class);

    public IsoFile(DataSource dataSource) {
        this(dataSource, new PropertyBoxParserImpl(new String[0]));
    }

    public IsoFile(DataSource dataSource, BoxParser boxParser) {
        initContainer(dataSource, dataSource.size(), boxParser);
    }

    public IsoFile(String str) {
        this(new FileDataSourceImpl(new File(str)));
    }

    public static String bytesToFourCC(byte[] bArr) {
        Object obj = new byte[4];
        if (bArr != null) {
            System.arraycopy(bArr, 0, obj, 0, Math.min(bArr.length, 4));
        }
        try {
            return new String(obj, "ISO-8859-1");
        } catch (Throwable e) {
            throw new Error("Required character encoding is missing", e);
        }
    }

    public static byte[] fourCCtoBytes(String str) {
        byte[] bArr = new byte[4];
        if (str == null) {
            return bArr;
        }
        for (int i = 0; i < Math.min(4, str.length()); i++) {
            bArr[i] = (byte) str.charAt(i);
        }
        return bArr;
    }

    public void close() {
        this.dataSource.close();
    }

    public void getBox(WritableByteChannel writableByteChannel) {
        writeContainer(writableByteChannel);
    }

    public MovieBox getMovieBox() {
        for (Box box : getBoxes()) {
            if (box instanceof MovieBox) {
                return (MovieBox) box;
            }
        }
        return null;
    }

    public long getSize() {
        return getContainerSize();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("model(");
        stringBuilder.append(this.dataSource.toString());
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
