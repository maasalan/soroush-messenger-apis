package com.coremedia.iso.boxes;

import com.coremedia.iso.BoxParser;
import com.googlecode.mp4parser.AbstractContainerBox;
import com.googlecode.mp4parser.DataSource;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

public class UserDataBox extends AbstractContainerBox {
    public static final String TYPE = "udta";

    public UserDataBox() {
        super(TYPE);
    }

    public void getBox(WritableByteChannel writableByteChannel) {
        super.getBox(writableByteChannel);
    }

    public void parse(DataSource dataSource, ByteBuffer byteBuffer, long j, BoxParser boxParser) {
        super.parse(dataSource, byteBuffer, j, boxParser);
    }
}
