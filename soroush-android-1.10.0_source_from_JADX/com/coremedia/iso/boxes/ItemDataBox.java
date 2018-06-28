package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.AbstractBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import org.p487a.p488a.C4596a.C7000a;
import org.p487a.p490b.p492b.C4600b;

public class ItemDataBox extends AbstractBox {
    public static final String TYPE = "idat";
    private static final C7000a ajc$tjp_0 = null;
    private static final C7000a ajc$tjp_1 = null;
    ByteBuffer data = ByteBuffer.allocate(0);

    static {
        ajc$preClinit();
    }

    public ItemDataBox() {
        super(TYPE);
    }

    private static void ajc$preClinit() {
        C4600b c4600b = new C4600b("ItemDataBox.java", ItemDataBox.class);
        ajc$tjp_0 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getData", "com.coremedia.iso.boxes.ItemDataBox", "", "", "", "java.nio.ByteBuffer"), 19);
        ajc$tjp_1 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setData", "com.coremedia.iso.boxes.ItemDataBox", "java.nio.ByteBuffer", "data", "", "void"), 23);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        this.data = byteBuffer.slice();
        byteBuffer.position(byteBuffer.position() + byteBuffer.remaining());
    }

    protected void getContent(ByteBuffer byteBuffer) {
        byteBuffer.put(this.data);
    }

    protected long getContentSize() {
        return (long) this.data.limit();
    }

    public ByteBuffer getData() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_0, (Object) this, (Object) this));
        return this.data;
    }

    public void setData(ByteBuffer byteBuffer) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_1, (Object) this, (Object) this, (Object) byteBuffer));
        this.data = byteBuffer;
    }
}
