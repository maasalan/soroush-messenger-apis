package org.msgpack.type;

import java.util.Arrays;

abstract class AbstractRawValue extends AbstractValue implements RawValue {
    private static final char[] HEX_TABLE = "0123456789ABCDEF".toCharArray();
    static final String UTF8 = "UTF-8";

    AbstractRawValue() {
    }

    private void escapeChar(StringBuilder stringBuilder, int i) {
        stringBuilder.append("\\u");
        stringBuilder.append(HEX_TABLE[(i >> 12) & 15]);
        stringBuilder.append(HEX_TABLE[(i >> 8) & 15]);
        stringBuilder.append(HEX_TABLE[(i >> 4) & 15]);
        stringBuilder.append(HEX_TABLE[i & 15]);
    }

    public RawValue asRawValue() {
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Value)) {
            return false;
        }
        Value value = (Value) obj;
        return !value.isRawValue() ? false : Arrays.equals(getByteArray(), value.asRawValue().getByteArray());
    }

    public ValueType getType() {
        return ValueType.RAW;
    }

    public int hashCode() {
        return Arrays.hashCode(getByteArray());
    }

    public boolean isRawValue() {
        return true;
    }

    public String toString() {
        return toString(new StringBuilder()).toString();
    }

    public java.lang.StringBuilder toString(java.lang.StringBuilder r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r4 = this;
        r0 = r4.getClass();
        r1 = org.msgpack.type.StringRawValueImpl.class;
        if (r0 != r1) goto L_0x000d;
    L_0x0008:
        r0 = r4.getString();
        goto L_0x003d;
    L_0x000d:
        r0 = "UTF-8";
        r0 = java.nio.charset.Charset.forName(r0);
        r0 = r0.newDecoder();
        r1 = java.nio.charset.CodingErrorAction.IGNORE;
        r0 = r0.onMalformedInput(r1);
        r1 = java.nio.charset.CodingErrorAction.IGNORE;
        r0 = r0.onUnmappableCharacter(r1);
        r1 = r4.getByteArray();	 Catch:{ CharacterCodingException -> 0x0034 }
        r1 = java.nio.ByteBuffer.wrap(r1);	 Catch:{ CharacterCodingException -> 0x0034 }
        r0 = r0.decode(r1);	 Catch:{ CharacterCodingException -> 0x0034 }
        r0 = r0.toString();	 Catch:{ CharacterCodingException -> 0x0034 }
        goto L_0x003d;
    L_0x0034:
        r0 = new java.lang.String;
        r1 = r4.getByteArray();
        r0.<init>(r1);
    L_0x003d:
        r1 = "\"";
        r5.append(r1);
        r1 = 0;
    L_0x0043:
        r2 = r0.length();
        if (r1 >= r2) goto L_0x008e;
    L_0x0049:
        r2 = r0.charAt(r1);
        r3 = 32;
        if (r2 >= r3) goto L_0x006a;
    L_0x0051:
        switch(r2) {
            case 8: goto L_0x0064;
            case 9: goto L_0x0061;
            case 10: goto L_0x005e;
            case 11: goto L_0x0054;
            case 12: goto L_0x005b;
            case 13: goto L_0x0058;
            default: goto L_0x0054;
        };
    L_0x0054:
        r4.escapeChar(r5, r2);
        goto L_0x008b;
    L_0x0058:
        r2 = "\\r";
        goto L_0x0066;
    L_0x005b:
        r2 = "\\f";
        goto L_0x0066;
    L_0x005e:
        r2 = "\\n";
        goto L_0x0066;
    L_0x0061:
        r2 = "\\t";
        goto L_0x0066;
    L_0x0064:
        r2 = "\\b";
    L_0x0066:
        r5.append(r2);
        goto L_0x008b;
    L_0x006a:
        r3 = 127; // 0x7f float:1.78E-43 double:6.27E-322;
        if (r2 > r3) goto L_0x0080;
    L_0x006e:
        r3 = 34;
        if (r2 == r3) goto L_0x007d;
    L_0x0072:
        r3 = 92;
        if (r2 == r3) goto L_0x007a;
    L_0x0076:
        r5.append(r2);
        goto L_0x008b;
    L_0x007a:
        r2 = "\\\\";
        goto L_0x0066;
    L_0x007d:
        r2 = "\\\"";
        goto L_0x0066;
    L_0x0080:
        r3 = 55296; // 0xd800 float:7.7486E-41 double:2.732E-319;
        if (r2 < r3) goto L_0x0076;
    L_0x0085:
        r3 = 57343; // 0xdfff float:8.0355E-41 double:2.8331E-319;
        if (r2 > r3) goto L_0x0076;
    L_0x008a:
        goto L_0x0054;
    L_0x008b:
        r1 = r1 + 1;
        goto L_0x0043;
    L_0x008e:
        r0 = "\"";
        r5.append(r0);
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.msgpack.type.AbstractRawValue.toString(java.lang.StringBuilder):java.lang.StringBuilder");
    }
}
