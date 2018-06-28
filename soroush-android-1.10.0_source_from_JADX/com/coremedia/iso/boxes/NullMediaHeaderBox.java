package com.coremedia.iso.boxes;

import java.nio.ByteBuffer;

public class NullMediaHeaderBox extends AbstractMediaHeaderBox {
    public static final String TYPE = "nmhd";

    public NullMediaHeaderBox() {
        super(TYPE);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
    }

    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
    }

    protected long getContentSize() {
        return 4;
    }
}
