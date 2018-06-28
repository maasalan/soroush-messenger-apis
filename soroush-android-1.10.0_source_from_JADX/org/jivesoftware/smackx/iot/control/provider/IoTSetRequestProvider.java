package org.jivesoftware.smackx.iot.control.provider;

import org.jivesoftware.smack.provider.IQProvider;
import org.jivesoftware.smackx.iot.control.element.IoTSetRequest;

public class IoTSetRequestProvider extends IQProvider<IoTSetRequest> {
    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.jivesoftware.smackx.iot.control.element.IoTSetRequest parse(org.xmlpull.v1.XmlPullParser r6, int r7) {
        /*
        r5 = this;
        r0 = new java.util.ArrayList;
        r1 = 4;
        r0.<init>(r1);
    L_0x0006:
        r1 = r6.next();
        r2 = r6.getName();
        switch(r1) {
            case 2: goto L_0x001f;
            case 3: goto L_0x0012;
            default: goto L_0x0011;
        };
    L_0x0011:
        goto L_0x0006;
    L_0x0012:
        r1 = r6.getDepth();
        if (r1 == r7) goto L_0x0019;
    L_0x0018:
        goto L_0x0006;
    L_0x0019:
        r6 = new org.jivesoftware.smackx.iot.control.element.IoTSetRequest;
        r6.<init>(r0);
        return r6;
    L_0x001f:
        r1 = -1;
        r3 = r2.hashCode();
        r4 = -1325958191; // 0xffffffffb0f77bd1 float:-1.8006806E-9 double:NaN;
        if (r3 == r4) goto L_0x0057;
    L_0x0029:
        r4 = 104431; // 0x197ef float:1.46339E-40 double:5.1596E-319;
        if (r3 == r4) goto L_0x004d;
    L_0x002e:
        r4 = 3029738; // 0x2e3aea float:4.245567E-39 double:1.4968895E-317;
        if (r3 == r4) goto L_0x0043;
    L_0x0033:
        r4 = 3327612; // 0x32c67c float:4.662978E-39 double:1.644059E-317;
        if (r3 == r4) goto L_0x0039;
    L_0x0038:
        goto L_0x0060;
    L_0x0039:
        r3 = "long";
        r2 = r2.equals(r3);
        if (r2 == 0) goto L_0x0060;
    L_0x0041:
        r1 = 3;
        goto L_0x0060;
    L_0x0043:
        r3 = "bool";
        r2 = r2.equals(r3);
        if (r2 == 0) goto L_0x0060;
    L_0x004b:
        r1 = 0;
        goto L_0x0060;
    L_0x004d:
        r3 = "int";
        r2 = r2.equals(r3);
        if (r2 == 0) goto L_0x0060;
    L_0x0055:
        r1 = 2;
        goto L_0x0060;
    L_0x0057:
        r3 = "double";
        r2 = r2.equals(r3);
        if (r2 == 0) goto L_0x0060;
    L_0x005f:
        r1 = 1;
    L_0x0060:
        r2 = 0;
        switch(r1) {
            case 0: goto L_0x00ab;
            case 1: goto L_0x0091;
            case 2: goto L_0x007b;
            case 3: goto L_0x0065;
            default: goto L_0x0064;
        };
    L_0x0064:
        goto L_0x0006;
    L_0x0065:
        r1 = "name";
        r1 = r6.getAttributeValue(r2, r1);
        r3 = "value";
        r2 = r6.getAttributeValue(r2, r3);
        r2 = java.lang.Long.parseLong(r2);
        r4 = new org.jivesoftware.smackx.iot.control.element.SetLongData;
        r4.<init>(r1, r2);
        goto L_0x00a6;
    L_0x007b:
        r1 = "name";
        r1 = r6.getAttributeValue(r2, r1);
        r3 = "value";
        r2 = r6.getAttributeValue(r2, r3);
        r2 = java.lang.Integer.parseInt(r2);
        r3 = new org.jivesoftware.smackx.iot.control.element.SetIntData;
        r3.<init>(r1, r2);
        goto L_0x00c0;
    L_0x0091:
        r1 = "name";
        r1 = r6.getAttributeValue(r2, r1);
        r3 = "value";
        r2 = r6.getAttributeValue(r2, r3);
        r2 = java.lang.Double.parseDouble(r2);
        r4 = new org.jivesoftware.smackx.iot.control.element.SetDoubleData;
        r4.<init>(r1, r2);
    L_0x00a6:
        r0.add(r4);
        goto L_0x0006;
    L_0x00ab:
        r1 = "name";
        r1 = r6.getAttributeValue(r2, r1);
        r3 = "value";
        r2 = r6.getAttributeValue(r2, r3);
        r2 = java.lang.Boolean.parseBoolean(r2);
        r3 = new org.jivesoftware.smackx.iot.control.element.SetBoolData;
        r3.<init>(r1, r2);
    L_0x00c0:
        r0.add(r3);
        goto L_0x0006;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smackx.iot.control.provider.IoTSetRequestProvider.parse(org.xmlpull.v1.XmlPullParser, int):org.jivesoftware.smackx.iot.control.element.IoTSetRequest");
    }
}
