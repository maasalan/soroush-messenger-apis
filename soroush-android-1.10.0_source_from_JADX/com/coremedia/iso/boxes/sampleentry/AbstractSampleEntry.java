package com.coremedia.iso.boxes.sampleentry;

import com.coremedia.iso.BoxParser;
import com.googlecode.mp4parser.AbstractContainerBox;
import com.googlecode.mp4parser.DataSource;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

public abstract class AbstractSampleEntry extends AbstractContainerBox implements SampleEntry {
    protected int dataReferenceIndex = 1;

    protected AbstractSampleEntry(String str) {
        super(str);
    }

    public abstract void getBox(WritableByteChannel writableByteChannel);

    public int getDataReferenceIndex() {
        return this.dataReferenceIndex;
    }

    public abstract void parse(DataSource dataSource, ByteBuffer byteBuffer, long j, BoxParser boxParser);

    public void setDataReferenceIndex(int i) {
        this.dataReferenceIndex = i;
    }
}
