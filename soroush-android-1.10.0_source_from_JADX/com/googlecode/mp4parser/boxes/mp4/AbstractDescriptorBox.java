package com.googlecode.mp4parser.boxes.mp4;

import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ObjectDescriptorFactory;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.p487a.p488a.C4596a.C7000a;
import org.p487a.p490b.p492b.C4600b;

public class AbstractDescriptorBox extends AbstractFullBox {
    private static final C7000a ajc$tjp_0 = null;
    private static final C7000a ajc$tjp_1 = null;
    private static final C7000a ajc$tjp_2 = null;
    private static final C7000a ajc$tjp_3 = null;
    private static final C7000a ajc$tjp_4 = null;
    private static Logger log = Logger.getLogger(AbstractDescriptorBox.class.getName());
    protected ByteBuffer data;
    protected BaseDescriptor descriptor;

    static {
        ajc$preClinit();
    }

    public AbstractDescriptorBox(String str) {
        super(str);
    }

    private static void ajc$preClinit() {
        C4600b c4600b = new C4600b("AbstractDescriptorBox.java", AbstractDescriptorBox.class);
        ajc$tjp_0 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getData", "com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox", "", "", "", "java.nio.ByteBuffer"), 42);
        ajc$tjp_1 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getDescriptor", "com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox", "", "", "", "com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor"), 58);
        ajc$tjp_2 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getDescriptorAsString", "com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox", "", "", "", "java.lang.String"), 62);
        ajc$tjp_3 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setDescriptor", "com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox", "com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor", "descriptor", "", "void"), 66);
        ajc$tjp_4 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setData", "com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox", "java.nio.ByteBuffer", "data", "", "void"), 70);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.data = byteBuffer.slice();
        byteBuffer.position(byteBuffer.position() + byteBuffer.remaining());
        try {
            this.data.rewind();
            this.descriptor = ObjectDescriptorFactory.createFrom(-1, this.data);
        } catch (Throwable e) {
            log.log(Level.WARNING, "Error parsing ObjectDescriptor", e);
        }
    }

    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        this.data.rewind();
        byteBuffer.put(this.data);
    }

    protected long getContentSize() {
        return (long) (4 + this.data.limit());
    }

    public ByteBuffer getData() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_0, (Object) this, (Object) this));
        return this.data;
    }

    public BaseDescriptor getDescriptor() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_1, (Object) this, (Object) this));
        return this.descriptor;
    }

    public String getDescriptorAsString() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_2, (Object) this, (Object) this));
        return this.descriptor.toString();
    }

    public void setData(ByteBuffer byteBuffer) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_4, (Object) this, (Object) this, (Object) byteBuffer));
        this.data = byteBuffer;
    }

    public void setDescriptor(BaseDescriptor baseDescriptor) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_3, (Object) this, (Object) this, (Object) baseDescriptor));
        this.descriptor = baseDescriptor;
    }
}
