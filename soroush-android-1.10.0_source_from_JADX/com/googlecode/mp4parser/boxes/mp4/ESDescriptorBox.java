package com.googlecode.mp4parser.boxes.mp4;

import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ESDescriptor;
import org.p487a.p488a.C4596a.C7000a;
import org.p487a.p490b.p492b.C4600b;

public class ESDescriptorBox extends AbstractDescriptorBox {
    public static final String TYPE = "esds";
    private static final C7000a ajc$tjp_0 = null;
    private static final C7000a ajc$tjp_1 = null;
    private static final C7000a ajc$tjp_2 = null;
    private static final C7000a ajc$tjp_3 = null;

    static {
        ajc$preClinit();
    }

    public ESDescriptorBox() {
        super(TYPE);
    }

    private static void ajc$preClinit() {
        C4600b c4600b = new C4600b("ESDescriptorBox.java", ESDescriptorBox.class);
        ajc$tjp_0 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getEsDescriptor", "com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox", "", "", "", "com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ESDescriptor"), 33);
        ajc$tjp_1 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setEsDescriptor", "com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox", "com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ESDescriptor", "esDescriptor", "", "void"), 37);
        ajc$tjp_2 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "equals", "com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox", "java.lang.Object", "o", "", "boolean"), 42);
        ajc$tjp_3 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "hashCode", "com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox", "", "", "", "int"), 53);
    }

    public boolean equals(Object obj) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_2, (Object) this, (Object) this, obj));
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ESDescriptorBox eSDescriptorBox = (ESDescriptorBox) obj;
        if (this.data != null) {
            if (!this.data.equals(eSDescriptorBox.data)) {
                return false;
            }
        } else if (eSDescriptorBox.data != null) {
            return false;
        }
        return true;
    }

    public ESDescriptor getEsDescriptor() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_0, (Object) this, (Object) this));
        return (ESDescriptor) super.getDescriptor();
    }

    public int hashCode() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_3, (Object) this, (Object) this));
        return this.data != null ? this.data.hashCode() : 0;
    }

    public void setEsDescriptor(ESDescriptor eSDescriptor) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_1, (Object) this, (Object) this, (Object) eSDescriptor));
        super.setDescriptor(eSDescriptor);
    }
}
