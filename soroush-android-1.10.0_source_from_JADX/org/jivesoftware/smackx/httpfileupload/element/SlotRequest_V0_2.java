package org.jivesoftware.smackx.httpfileupload.element;

import org.b.a.b;

public class SlotRequest_V0_2 extends SlotRequest {
    public static final String NAMESPACE = "urn:xmpp:http:upload";

    public SlotRequest_V0_2(b bVar, String str, long j) {
        this(bVar, str, j, null);
    }

    public SlotRequest_V0_2(b bVar, String str, long j, String str2) {
        super(bVar, str, j, str2, "urn:xmpp:http:upload");
    }
}
