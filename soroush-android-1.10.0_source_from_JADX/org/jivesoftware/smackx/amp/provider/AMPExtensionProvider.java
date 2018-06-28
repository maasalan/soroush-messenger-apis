package org.jivesoftware.smackx.amp.provider;

import java.util.logging.Logger;
import org.jivesoftware.smack.provider.ExtensionElementProvider;
import org.jivesoftware.smackx.amp.packet.AMPExtension;

public class AMPExtensionProvider extends ExtensionElementProvider<AMPExtension> {
    private static final Logger LOGGER = Logger.getLogger(AMPExtensionProvider.class.getName());

    private static org.jivesoftware.smackx.amp.packet.AMPExtension.Condition createCondition(java.lang.String r3, java.lang.String r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = 0;
        if (r3 == 0) goto L_0x0074;
    L_0x0003:
        if (r4 != 0) goto L_0x0006;
    L_0x0005:
        goto L_0x0074;
    L_0x0006:
        r1 = "deliver";
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x002c;
    L_0x000e:
        r3 = new org.jivesoftware.smackx.amp.AMPDeliverCondition;	 Catch:{ IllegalArgumentException -> 0x0018 }
        r1 = org.jivesoftware.smackx.amp.AMPDeliverCondition.Value.valueOf(r4);	 Catch:{ IllegalArgumentException -> 0x0018 }
        r3.<init>(r1);	 Catch:{ IllegalArgumentException -> 0x0018 }
        return r3;
    L_0x0018:
        r3 = LOGGER;
        r1 = new java.lang.StringBuilder;
        r2 = "Found invalid rule delivery condition value ";
        r1.<init>(r2);
        r1.append(r4);
        r4 = r1.toString();
        r3.severe(r4);
        return r0;
    L_0x002c:
        r1 = "expire-at";
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x003a;
    L_0x0034:
        r3 = new org.jivesoftware.smackx.amp.AMPExpireAtCondition;
        r3.<init>(r4);
        return r3;
    L_0x003a:
        r1 = "match-resource";
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0060;
    L_0x0042:
        r3 = new org.jivesoftware.smackx.amp.AMPMatchResourceCondition;	 Catch:{ IllegalArgumentException -> 0x004c }
        r1 = org.jivesoftware.smackx.amp.AMPMatchResourceCondition.Value.valueOf(r4);	 Catch:{ IllegalArgumentException -> 0x004c }
        r3.<init>(r1);	 Catch:{ IllegalArgumentException -> 0x004c }
        return r3;
    L_0x004c:
        r3 = LOGGER;
        r1 = new java.lang.StringBuilder;
        r2 = "Found invalid rule match-resource condition value ";
        r1.<init>(r2);
        r1.append(r4);
        r4 = r1.toString();
        r3.severe(r4);
        return r0;
    L_0x0060:
        r4 = LOGGER;
        r1 = new java.lang.StringBuilder;
        r2 = "Found unknown rule condition name ";
        r1.<init>(r2);
        r1.append(r3);
        r3 = r1.toString();
        r4.severe(r3);
        return r0;
    L_0x0074:
        r3 = LOGGER;
        r4 = "Can't create rule condition from null name and/or value";
        r3.severe(r4);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smackx.amp.provider.AMPExtensionProvider.createCondition(java.lang.String, java.lang.String):org.jivesoftware.smackx.amp.packet.AMPExtension$Condition");
    }

    public org.jivesoftware.smackx.amp.packet.AMPExtension parse(org.xmlpull.v1.XmlPullParser r8, int r9) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r7 = this;
        r9 = "from";
        r0 = 0;
        r9 = r8.getAttributeValue(r0, r9);
        r1 = "to";
        r1 = r8.getAttributeValue(r0, r1);
        r2 = "status";
        r2 = r8.getAttributeValue(r0, r2);
        if (r2 == 0) goto L_0x002d;
    L_0x0015:
        r3 = org.jivesoftware.smackx.amp.packet.AMPExtension.Status.valueOf(r2);	 Catch:{ IllegalArgumentException -> 0x001a }
        goto L_0x002e;
    L_0x001a:
        r3 = LOGGER;
        r4 = new java.lang.StringBuilder;
        r5 = "Found invalid amp status ";
        r4.<init>(r5);
        r4.append(r2);
        r2 = r4.toString();
        r3.severe(r2);
    L_0x002d:
        r3 = r0;
    L_0x002e:
        r2 = new org.jivesoftware.smackx.amp.packet.AMPExtension;
        r2.<init>(r9, r1, r3);
        r9 = "per-hop";
        r9 = r8.getAttributeValue(r0, r9);
        if (r9 == 0) goto L_0x0042;
    L_0x003b:
        r9 = java.lang.Boolean.parseBoolean(r9);
        r2.setPerHop(r9);
    L_0x0042:
        r9 = 0;
    L_0x0043:
        if (r9 != 0) goto L_0x00b0;
    L_0x0045:
        r1 = r8.next();
        r3 = 2;
        if (r1 != r3) goto L_0x009f;
    L_0x004c:
        r1 = r8.getName();
        r3 = "rule";
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0043;
    L_0x0058:
        r1 = "action";
        r1 = r8.getAttributeValue(r0, r1);
        r3 = "condition";
        r3 = r8.getAttributeValue(r0, r3);
        r4 = "value";
        r4 = r8.getAttributeValue(r0, r4);
        r3 = createCondition(r3, r4);
        if (r1 == 0) goto L_0x0088;
    L_0x0070:
        r4 = org.jivesoftware.smackx.amp.packet.AMPExtension.Action.valueOf(r1);	 Catch:{ IllegalArgumentException -> 0x0075 }
        goto L_0x0089;
    L_0x0075:
        r4 = LOGGER;
        r5 = new java.lang.StringBuilder;
        r6 = "Found invalid rule action value ";
        r5.<init>(r6);
        r5.append(r1);
        r1 = r5.toString();
        r4.severe(r1);
    L_0x0088:
        r4 = r0;
    L_0x0089:
        if (r4 == 0) goto L_0x0097;
    L_0x008b:
        if (r3 != 0) goto L_0x008e;
    L_0x008d:
        goto L_0x0097;
    L_0x008e:
        r1 = new org.jivesoftware.smackx.amp.packet.AMPExtension$Rule;
        r1.<init>(r4, r3);
        r2.addRule(r1);
        goto L_0x0043;
    L_0x0097:
        r1 = LOGGER;
        r3 = "Rule is skipped because either it's action or it's condition is invalid";
        r1.severe(r3);
        goto L_0x0043;
    L_0x009f:
        r3 = 3;
        if (r1 != r3) goto L_0x0043;
    L_0x00a2:
        r1 = r8.getName();
        r3 = "amp";
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0043;
    L_0x00ae:
        r9 = 1;
        goto L_0x0043;
    L_0x00b0:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smackx.amp.provider.AMPExtensionProvider.parse(org.xmlpull.v1.XmlPullParser, int):org.jivesoftware.smackx.amp.packet.AMPExtension");
    }
}
