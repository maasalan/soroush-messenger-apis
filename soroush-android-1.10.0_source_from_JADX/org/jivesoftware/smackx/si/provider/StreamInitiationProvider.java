package org.jivesoftware.smackx.si.provider;

import java.util.logging.Logger;
import org.jivesoftware.smack.provider.IQProvider;
import org.jivesoftware.smackx.si.packet.StreamInitiation;

public class StreamInitiationProvider extends IQProvider<StreamInitiation> {
    private static final Logger LOGGER = Logger.getLogger(StreamInitiationProvider.class.getName());

    public org.jivesoftware.smackx.si.packet.StreamInitiation parse(org.xmlpull.v1.XmlPullParser r22, int r23) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r21 = this;
        r1 = r22;
        r2 = "";
        r3 = "id";
        r2 = r1.getAttributeValue(r2, r3);
        r3 = "";
        r4 = "mime-type";
        r3 = r1.getAttributeValue(r3, r4);
        r4 = new org.jivesoftware.smackx.si.packet.StreamInitiation;
        r4.<init>();
        r5 = new org.jivesoftware.smackx.xdata.provider.DataFormProvider;
        r5.<init>();
        r7 = 0;
        r8 = 0;
        r14 = r7;
        r9 = r8;
        r10 = r9;
        r11 = r10;
        r12 = r11;
        r13 = r12;
    L_0x0024:
        if (r7 != 0) goto L_0x00f7;
    L_0x0026:
        r15 = r22.next();
        r6 = r22.getName();
        r16 = r7;
        r7 = r22.getNamespace();
        r17 = r8;
        r8 = 2;
        if (r15 != r8) goto L_0x0099;
    L_0x0039:
        r8 = "file";
        r8 = r6.equals(r8);
        if (r8 == 0) goto L_0x0063;
    L_0x0041:
        r6 = "";
        r7 = "name";
        r11 = r1.getAttributeValue(r6, r7);
        r6 = "";
        r7 = "size";
        r9 = r1.getAttributeValue(r6, r7);
        r6 = "";
        r7 = "hash";
        r12 = r1.getAttributeValue(r6, r7);
        r6 = "";
        r7 = "date";
        r10 = r1.getAttributeValue(r6, r7);
        goto L_0x00f1;
    L_0x0063:
        r8 = "desc";
        r8 = r6.equals(r8);
        if (r8 == 0) goto L_0x0071;
    L_0x006b:
        r13 = r22.nextText();
        goto L_0x00f1;
    L_0x0071:
        r8 = "range";
        r8 = r6.equals(r8);
        if (r8 == 0) goto L_0x007f;
    L_0x0079:
        r7 = r16;
        r8 = r17;
        r14 = 1;
        goto L_0x0024;
    L_0x007f:
        r8 = "x";
        r6 = r6.equals(r8);
        if (r6 == 0) goto L_0x00f1;
    L_0x0087:
        r6 = "jabber:x:data";
        r6 = r7.equals(r6);
        if (r6 == 0) goto L_0x00f1;
    L_0x008f:
        r6 = r5.parse(r1);
        r8 = r6;
        r8 = (org.jivesoftware.smackx.xdata.packet.DataForm) r8;
        r7 = r16;
        goto L_0x0024;
    L_0x0099:
        r7 = 3;
        if (r15 != r7) goto L_0x00f1;
    L_0x009c:
        r7 = "si";
        r7 = r6.equals(r7);
        if (r7 == 0) goto L_0x00a9;
    L_0x00a4:
        r8 = r17;
        r7 = 1;
        goto L_0x0024;
    L_0x00a9:
        r7 = "file";
        r6 = r6.equals(r7);
        if (r6 == 0) goto L_0x00f1;
    L_0x00b1:
        if (r9 == 0) goto L_0x00ce;
    L_0x00b3:
        r8 = r9.trim();
        r8 = r8.length();
        if (r8 == 0) goto L_0x00ce;
    L_0x00bd:
        r18 = java.lang.Long.parseLong(r9);	 Catch:{ NumberFormatException -> 0x00c4 }
        r6 = r18;
        goto L_0x00d0;
    L_0x00c4:
        r0 = move-exception;
        r8 = LOGGER;
        r15 = java.util.logging.Level.SEVERE;
        r6 = "Failed to parse file size from 0";
        r8.log(r15, r6, r0);
    L_0x00ce:
        r6 = 0;
    L_0x00d0:
        r8 = new java.util.Date;
        r8.<init>();
        if (r10 == 0) goto L_0x00dc;
    L_0x00d7:
        r15 = org.b.c.a.b(r10);	 Catch:{ ParseException -> 0x00dc }
        goto L_0x00dd;
    L_0x00dc:
        r15 = r8;
    L_0x00dd:
        r8 = new org.jivesoftware.smackx.si.packet.StreamInitiation$File;
        r8.<init>(r11, r6);
        r8.setHash(r12);
        r8.setDate(r15);
        r8.setDesc(r13);
        r8.setRanged(r14);
        r4.setFile(r8);
    L_0x00f1:
        r7 = r16;
        r8 = r17;
        goto L_0x0024;
    L_0x00f7:
        r17 = r8;
        r4.setSessionID(r2);
        r4.setMimeType(r3);
        r4.setFeatureNegotiationForm(r8);
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smackx.si.provider.StreamInitiationProvider.parse(org.xmlpull.v1.XmlPullParser, int):org.jivesoftware.smackx.si.packet.StreamInitiation");
    }
}
