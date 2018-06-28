package org.jivesoftware.smackx.rsm.provider;

import org.jivesoftware.smack.provider.ExtensionElementProvider;
import org.jivesoftware.smackx.rsm.packet.RSMSet;

public class RSMSetProvider extends ExtensionElementProvider<RSMSet> {
    public static final RSMSetProvider INSTANCE = new RSMSetProvider();

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.jivesoftware.smackx.rsm.packet.RSMSet parse(org.xmlpull.v1.XmlPullParser r12, int r13) {
        /*
        r11 = this;
        r0 = 0;
        r1 = -1;
        r3 = r0;
        r4 = r3;
        r7 = r4;
        r9 = r7;
        r5 = r1;
        r6 = r5;
        r8 = r6;
        r10 = r8;
    L_0x000a:
        r0 = r12.next();
        switch(r0) {
            case 2: goto L_0x0020;
            case 3: goto L_0x0012;
            default: goto L_0x0011;
        };
    L_0x0011:
        goto L_0x000a;
    L_0x0012:
        r0 = r12.getDepth();
        if (r0 == r13) goto L_0x0019;
    L_0x0018:
        goto L_0x000a;
    L_0x0019:
        r12 = new org.jivesoftware.smackx.rsm.packet.RSMSet;
        r2 = r12;
        r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10);
        return r12;
    L_0x0020:
        r0 = r12.getName();
        r2 = r0.hashCode();
        switch(r2) {
            case -1392885889: goto L_0x0068;
            case 107876: goto L_0x005e;
            case 3314326: goto L_0x0054;
            case 92734940: goto L_0x004a;
            case 94851343: goto L_0x0040;
            case 97440432: goto L_0x0036;
            case 100346066: goto L_0x002c;
            default: goto L_0x002b;
        };
    L_0x002b:
        goto L_0x0072;
    L_0x002c:
        r2 = "index";
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x0072;
    L_0x0034:
        r0 = 4;
        goto L_0x0073;
    L_0x0036:
        r2 = "first";
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x0072;
    L_0x003e:
        r0 = 3;
        goto L_0x0073;
    L_0x0040:
        r2 = "count";
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x0072;
    L_0x0048:
        r0 = 2;
        goto L_0x0073;
    L_0x004a:
        r2 = "after";
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x0072;
    L_0x0052:
        r0 = 0;
        goto L_0x0073;
    L_0x0054:
        r2 = "last";
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x0072;
    L_0x005c:
        r0 = 5;
        goto L_0x0073;
    L_0x005e:
        r2 = "max";
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x0072;
    L_0x0066:
        r0 = 6;
        goto L_0x0073;
    L_0x0068:
        r2 = "before";
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x0072;
    L_0x0070:
        r0 = 1;
        goto L_0x0073;
    L_0x0072:
        r0 = r1;
    L_0x0073:
        switch(r0) {
            case 0: goto L_0x009f;
            case 1: goto L_0x0099;
            case 2: goto L_0x0093;
            case 3: goto L_0x0087;
            case 4: goto L_0x0082;
            case 5: goto L_0x007d;
            case 6: goto L_0x0077;
            default: goto L_0x0076;
        };
    L_0x0076:
        goto L_0x000a;
    L_0x0077:
        r0 = org.jivesoftware.smack.util.ParserUtils.getIntegerFromNextText(r12);
        r8 = r0;
        goto L_0x000a;
    L_0x007d:
        r7 = r12.nextText();
        goto L_0x000a;
    L_0x0082:
        r6 = org.jivesoftware.smack.util.ParserUtils.getIntegerFromNextText(r12);
        goto L_0x000a;
    L_0x0087:
        r0 = "index";
        r10 = org.jivesoftware.smack.util.ParserUtils.getIntegerAttribute(r12, r0, r1);
        r9 = r12.nextText();
        goto L_0x000a;
    L_0x0093:
        r5 = org.jivesoftware.smack.util.ParserUtils.getIntegerFromNextText(r12);
        goto L_0x000a;
    L_0x0099:
        r4 = r12.nextText();
        goto L_0x000a;
    L_0x009f:
        r3 = r12.nextText();
        goto L_0x000a;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smackx.rsm.provider.RSMSetProvider.parse(org.xmlpull.v1.XmlPullParser, int):org.jivesoftware.smackx.rsm.packet.RSMSet");
    }
}
