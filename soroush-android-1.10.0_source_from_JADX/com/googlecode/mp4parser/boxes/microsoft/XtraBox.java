package com.googlecode.mp4parser.boxes.microsoft;

import com.googlecode.mp4parser.AbstractBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.io.PrintStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Date;
import java.util.Iterator;
import java.util.Vector;
import org.jivesoftware.smack.util.StringUtils;
import org.p487a.p488a.C4596a.C7000a;
import org.p487a.p490b.p491a.C4599a;
import org.p487a.p490b.p492b.C4600b;

public class XtraBox extends AbstractBox {
    private static final long FILETIME_EPOCH_DIFF = 11644473600000L;
    private static final long FILETIME_ONE_MILLISECOND = 10000;
    public static final int MP4_XTRA_BT_FILETIME = 21;
    public static final int MP4_XTRA_BT_GUID = 72;
    public static final int MP4_XTRA_BT_INT64 = 19;
    public static final int MP4_XTRA_BT_UNICODE = 8;
    public static final String TYPE = "Xtra";
    private static final C7000a ajc$tjp_0 = null;
    private static final C7000a ajc$tjp_1 = null;
    private static final C7000a ajc$tjp_10 = null;
    private static final C7000a ajc$tjp_2 = null;
    private static final C7000a ajc$tjp_3 = null;
    private static final C7000a ajc$tjp_4 = null;
    private static final C7000a ajc$tjp_5 = null;
    private static final C7000a ajc$tjp_6 = null;
    private static final C7000a ajc$tjp_7 = null;
    private static final C7000a ajc$tjp_8 = null;
    private static final C7000a ajc$tjp_9 = null;
    ByteBuffer data;
    private boolean successfulParse = false;
    Vector<XtraTag> tags = new Vector();

    private static class XtraTag {
        private int inputSize;
        private String tagName;
        private Vector<XtraValue> values;

        private XtraTag() {
            this.values = new Vector();
        }

        private XtraTag(String str) {
            this();
            this.tagName = str;
        }

        private void getContent(ByteBuffer byteBuffer) {
            byteBuffer.putInt(getContentSize());
            byteBuffer.putInt(this.tagName.length());
            XtraBox.writeAsciiString(byteBuffer, this.tagName);
            byteBuffer.putInt(this.values.size());
            for (int i = 0; i < this.values.size(); i++) {
                ((XtraValue) this.values.elementAt(i)).getContent(byteBuffer);
            }
        }

        private int getContentSize() {
            int length = 12 + this.tagName.length();
            for (int i = 0; i < this.values.size(); i++) {
                length += ((XtraValue) this.values.elementAt(i)).getContentSize();
            }
            return length;
        }

        private void parse(ByteBuffer byteBuffer) {
            this.inputSize = byteBuffer.getInt();
            this.tagName = XtraBox.readAsciiString(byteBuffer, byteBuffer.getInt());
            int i = byteBuffer.getInt();
            for (int i2 = 0; i2 < i; i2++) {
                XtraValue xtraValue = new XtraValue();
                xtraValue.parse(byteBuffer);
                this.values.addElement(xtraValue);
            }
            if (this.inputSize != getContentSize()) {
                StringBuilder stringBuilder = new StringBuilder("Improperly handled Xtra tag: Sizes don't match ( ");
                stringBuilder.append(this.inputSize);
                stringBuilder.append("/");
                stringBuilder.append(getContentSize());
                stringBuilder.append(") on ");
                stringBuilder.append(this.tagName);
                throw new RuntimeException(stringBuilder.toString());
            }
        }

        public String toString() {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(this.tagName);
            stringBuffer.append(" [");
            stringBuffer.append(this.inputSize);
            stringBuffer.append("/");
            stringBuffer.append(this.values.size());
            stringBuffer.append("]:\n");
            for (int i = 0; i < this.values.size(); i++) {
                stringBuffer.append("  ");
                stringBuffer.append(((XtraValue) this.values.elementAt(i)).toString());
                stringBuffer.append("\n");
            }
            return stringBuffer.toString();
        }
    }

    private static class XtraValue {
        public Date fileTimeValue;
        public long longValue;
        public byte[] nonParsedValue;
        public String stringValue;
        public int type;

        private XtraValue() {
        }

        private XtraValue(long j) {
            this.type = 19;
            this.longValue = j;
        }

        private XtraValue(String str) {
            this.type = 8;
            this.stringValue = str;
        }

        private XtraValue(Date date) {
            this.type = 21;
            this.fileTimeValue = date;
        }

        private void getContent(ByteBuffer byteBuffer) {
            try {
                byteBuffer.putInt(getContentSize());
                byteBuffer.putShort((short) this.type);
                byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                int i = this.type;
                if (i != 8) {
                    long j;
                    if (i == 19) {
                        j = this.longValue;
                    } else if (i != 21) {
                        byteBuffer.put(this.nonParsedValue);
                    } else {
                        j = XtraBox.millisToFiletime(this.fileTimeValue.getTime());
                    }
                    byteBuffer.putLong(j);
                } else {
                    XtraBox.writeUtf16String(byteBuffer, this.stringValue);
                }
                byteBuffer.order(ByteOrder.BIG_ENDIAN);
            } catch (Throwable th) {
                byteBuffer.order(ByteOrder.BIG_ENDIAN);
            }
        }

        private int getContentSize() {
            /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:12:0x0022 in {6, 8, 10, 11} preds:[]
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:129)
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:48)
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:38)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
            /*
            r3 = this;
            r0 = r3.type;
            r1 = 8;
            r2 = 6;
            if (r0 == r1) goto L_0x0017;
        L_0x0007:
            r1 = 19;
            if (r0 == r1) goto L_0x0014;
        L_0x000b:
            r1 = 21;
            if (r0 == r1) goto L_0x0014;
        L_0x000f:
            r0 = r3.nonParsedValue;
            r0 = r0.length;
        L_0x0012:
            r2 = r2 + r0;
            return r2;
        L_0x0014:
            r2 = 14;
            return r2;
        L_0x0017:
            r0 = r3.stringValue;
            r0 = r0.length();
            r0 = r0 * 2;
            r0 = r0 + 2;
            goto L_0x0012;
            return r2;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.googlecode.mp4parser.boxes.microsoft.XtraBox.XtraValue.getContentSize():int");
        }

        private Object getValueAsObject() {
            int i = this.type;
            return i != 8 ? i != 19 ? i != 21 ? this.nonParsedValue : this.fileTimeValue : new Long(this.longValue) : this.stringValue;
        }

        private void parse(ByteBuffer byteBuffer) {
            int i = byteBuffer.getInt() - 6;
            this.type = byteBuffer.getShort();
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            int i2 = this.type;
            if (i2 == 8) {
                this.stringValue = XtraBox.readUtf16String(byteBuffer, i);
            } else if (i2 == 19) {
                this.longValue = byteBuffer.getLong();
            } else if (i2 != 21) {
                this.nonParsedValue = new byte[i];
                byteBuffer.get(this.nonParsedValue);
            } else {
                this.fileTimeValue = new Date(XtraBox.filetimeToMillis(byteBuffer.getLong()));
            }
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        public String toString() {
            StringBuilder stringBuilder;
            String str;
            int i = this.type;
            if (i == 8) {
                stringBuilder = new StringBuilder("[string]");
                str = this.stringValue;
            } else if (i == 19) {
                stringBuilder = new StringBuilder("[long]");
                str = String.valueOf(this.longValue);
            } else if (i != 21) {
                return "[GUID](nonParsed)";
            } else {
                stringBuilder = new StringBuilder("[filetime]");
                str = this.fileTimeValue.toString();
            }
            stringBuilder.append(str);
            return stringBuilder.toString();
        }
    }

    static {
        ajc$preClinit();
    }

    public XtraBox() {
        super(TYPE);
    }

    public XtraBox(String str) {
        super(str);
    }

    private static void ajc$preClinit() {
        C4600b c4600b = new C4600b("XtraBox.java", XtraBox.class);
        ajc$tjp_0 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "toString", "com.googlecode.mp4parser.boxes.microsoft.XtraBox", "", "", "", "java.lang.String"), 88);
        ajc$tjp_1 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getAllTagNames", "com.googlecode.mp4parser.boxes.microsoft.XtraBox", "", "", "", "[Ljava.lang.String;"), 151);
        ajc$tjp_10 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setTagValue", "com.googlecode.mp4parser.boxes.microsoft.XtraBox", "java.lang.String:long", "name:value", "", "void"), 289);
        ajc$tjp_2 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getFirstStringValue", "com.googlecode.mp4parser.boxes.microsoft.XtraBox", "java.lang.String", "name", "", "java.lang.String"), 166);
        ajc$tjp_3 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getFirstDateValue", "com.googlecode.mp4parser.boxes.microsoft.XtraBox", "java.lang.String", "name", "", "java.util.Date"), 183);
        ajc$tjp_4 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getFirstLongValue", "com.googlecode.mp4parser.boxes.microsoft.XtraBox", "java.lang.String", "name", "", "java.lang.Long"), 200);
        ajc$tjp_5 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getValues", "com.googlecode.mp4parser.boxes.microsoft.XtraBox", "java.lang.String", "name", "", "[Ljava.lang.Object;"), 216);
        ajc$tjp_6 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "removeTag", "com.googlecode.mp4parser.boxes.microsoft.XtraBox", "java.lang.String", "name", "", "void"), 236);
        ajc$tjp_7 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setTagValues", "com.googlecode.mp4parser.boxes.microsoft.XtraBox", "java.lang.String:[Ljava.lang.String;", "name:values", "", "void"), 249);
        ajc$tjp_8 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setTagValue", "com.googlecode.mp4parser.boxes.microsoft.XtraBox", "java.lang.String:java.lang.String", "name:value", "", "void"), 265);
        ajc$tjp_9 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setTagValue", "com.googlecode.mp4parser.boxes.microsoft.XtraBox", "java.lang.String:java.util.Date", "name:date", "", "void"), 276);
    }

    private int detailSize() {
        int i = 0;
        int i2 = 0;
        while (i < this.tags.size()) {
            i2 += ((XtraTag) this.tags.elementAt(i)).getContentSize();
            i++;
        }
        return i2;
    }

    private static long filetimeToMillis(long j) {
        return (j / FILETIME_ONE_MILLISECOND) - FILETIME_EPOCH_DIFF;
    }

    private XtraTag getTagByName(String str) {
        Iterator it = this.tags.iterator();
        while (it.hasNext()) {
            XtraTag xtraTag = (XtraTag) it.next();
            if (xtraTag.tagName.equals(str)) {
                return xtraTag;
            }
        }
        return null;
    }

    private static long millisToFiletime(long j) {
        return (j + FILETIME_EPOCH_DIFF) * FILETIME_ONE_MILLISECOND;
    }

    private static String readAsciiString(ByteBuffer byteBuffer, int i) {
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr);
        try {
            return new String(bArr, StringUtils.USASCII);
        } catch (Throwable e) {
            throw new RuntimeException("Shouldn't happen", e);
        }
    }

    private static String readUtf16String(ByteBuffer byteBuffer, int i) {
        i = (i / 2) - 1;
        char[] cArr = new char[i];
        for (int i2 = 0; i2 < i; i2++) {
            cArr[i2] = byteBuffer.getChar();
        }
        byteBuffer.getChar();
        return new String(cArr);
    }

    private static void writeAsciiString(ByteBuffer byteBuffer, String str) {
        try {
            byteBuffer.put(str.getBytes(StringUtils.USASCII));
        } catch (Throwable e) {
            throw new RuntimeException("Shouldn't happen", e);
        }
    }

    private static void writeUtf16String(ByteBuffer byteBuffer, String str) {
        char[] toCharArray = str.toCharArray();
        for (char putChar : toCharArray) {
            byteBuffer.putChar(putChar);
        }
        byteBuffer.putChar('\u0000');
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        this.data = byteBuffer.slice();
        this.successfulParse = false;
        try {
            this.tags.clear();
            while (byteBuffer.remaining() > 0) {
                XtraTag xtraTag = new XtraTag();
                xtraTag.parse(byteBuffer);
                this.tags.addElement(xtraTag);
            }
            int detailSize = detailSize();
            if (remaining != detailSize) {
                StringBuilder stringBuilder = new StringBuilder("Improperly handled Xtra tag: Calculated sizes don't match ( ");
                stringBuilder.append(remaining);
                stringBuilder.append("/");
                stringBuilder.append(detailSize);
                stringBuilder.append(")");
                throw new RuntimeException(stringBuilder.toString());
            }
            this.successfulParse = true;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        } catch (Exception e) {
            this.successfulParse = false;
            PrintStream printStream = System.err;
            StringBuilder stringBuilder2 = new StringBuilder("Malformed Xtra Tag detected: ");
            stringBuilder2.append(e.toString());
            printStream.println(stringBuilder2.toString());
            e.printStackTrace();
            byteBuffer.position(byteBuffer.position() + byteBuffer.remaining());
        } catch (Throwable th) {
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }
    }

    public String[] getAllTagNames() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_1, (Object) this, (Object) this));
        String[] strArr = new String[this.tags.size()];
        for (int i = 0; i < this.tags.size(); i++) {
            strArr[i] = ((XtraTag) this.tags.elementAt(i)).tagName;
        }
        return strArr;
    }

    protected void getContent(ByteBuffer byteBuffer) {
        if (this.successfulParse) {
            for (int i = 0; i < this.tags.size(); i++) {
                ((XtraTag) this.tags.elementAt(i)).getContent(byteBuffer);
            }
            return;
        }
        this.data.rewind();
        byteBuffer.put(this.data);
    }

    protected long getContentSize() {
        return (long) (this.successfulParse ? detailSize() : this.data.limit());
    }

    public Date getFirstDateValue(String str) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_3, (Object) this, (Object) this, (Object) str));
        for (Object obj : getValues(str)) {
            if (obj instanceof Date) {
                return (Date) obj;
            }
        }
        return null;
    }

    public Long getFirstLongValue(String str) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_4, (Object) this, (Object) this, (Object) str));
        for (Object obj : getValues(str)) {
            if (obj instanceof Long) {
                return (Long) obj;
            }
        }
        return null;
    }

    public String getFirstStringValue(String str) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_2, (Object) this, (Object) this, (Object) str));
        for (Object obj : getValues(str)) {
            if (obj instanceof String) {
                return (String) obj;
            }
        }
        return null;
    }

    public Object[] getValues(String str) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_5, (Object) this, (Object) this, (Object) str));
        XtraTag tagByName = getTagByName(str);
        int i = 0;
        if (tagByName == null) {
            return new Object[0];
        }
        Object[] objArr = new Object[tagByName.values.size()];
        while (i < tagByName.values.size()) {
            objArr[i] = ((XtraValue) tagByName.values.elementAt(i)).getValueAsObject();
            i++;
        }
        return objArr;
    }

    public void removeTag(String str) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_6, (Object) this, (Object) this, (Object) str));
        XtraTag tagByName = getTagByName(str);
        if (tagByName != null) {
            this.tags.remove(tagByName);
        }
    }

    public void setTagValue(String str, long j) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8322a(ajc$tjp_10, this, this, str, C4599a.m8315a(j)));
        removeTag(str);
        XtraTag xtraTag = new XtraTag(str);
        xtraTag.values.addElement(new XtraValue(j));
        this.tags.addElement(xtraTag);
    }

    public void setTagValue(String str, String str2) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8322a(ajc$tjp_8, this, this, str, str2));
        setTagValues(str, new String[]{str2});
    }

    public void setTagValue(String str, Date date) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8322a(ajc$tjp_9, this, this, str, date));
        removeTag(str);
        XtraTag xtraTag = new XtraTag(str);
        xtraTag.values.addElement(new XtraValue(date));
        this.tags.addElement(xtraTag);
    }

    public void setTagValues(String str, String[] strArr) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8322a(ajc$tjp_7, this, this, str, strArr));
        removeTag(str);
        XtraTag xtraTag = new XtraTag(str);
        for (String xtraValue : strArr) {
            xtraTag.values.addElement(new XtraValue(xtraValue));
        }
        this.tags.addElement(xtraTag);
    }

    public String toString() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_0, (Object) this, (Object) this));
        if (!isParsed()) {
            parseDetails();
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("XtraBox[");
        Iterator it = this.tags.iterator();
        while (it.hasNext()) {
            XtraTag xtraTag = (XtraTag) it.next();
            Iterator it2 = xtraTag.values.iterator();
            while (it2.hasNext()) {
                XtraValue xtraValue = (XtraValue) it2.next();
                stringBuffer.append(xtraTag.tagName);
                stringBuffer.append("=");
                stringBuffer.append(xtraValue.toString());
                stringBuffer.append(";");
            }
        }
        stringBuffer.append("]");
        return stringBuffer.toString();
    }
}
