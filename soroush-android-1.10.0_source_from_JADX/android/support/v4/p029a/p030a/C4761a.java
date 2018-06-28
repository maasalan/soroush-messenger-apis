package android.support.v4.p029a.p030a;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.p022a.C0139a.C0138a;
import android.support.v4.p036e.C0444a;
import android.util.Base64;
import android.util.Xml;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.jivesoftware.smack.tcp.XMPPTCPConnection.PacketWriter;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class C4761a {

    public interface C0340a {
    }

    public static final class C0341c {
        public final String f1294a;
        public int f1295b;
        public boolean f1296c;
        public int f1297d;

        public C0341c(String str, int i, boolean z, int i2) {
            this.f1294a = str;
            this.f1295b = i;
            this.f1296c = z;
            this.f1297d = i2;
        }
    }

    public static final class C4762b implements C0340a {
        public final C0341c[] f13159a;

        public C4762b(C0341c[] c0341cArr) {
            this.f13159a = c0341cArr;
        }
    }

    public static final class C4763d implements C0340a {
        public final C0444a f13160a;
        public final int f13161b;
        public final int f13162c;

        public C4763d(C0444a c0444a, int i, int i2) {
            this.f13160a = c0444a;
            this.f13162c = i;
            this.f13161b = i2;
        }
    }

    public static C0340a m664a(XmlPullParser xmlPullParser, Resources resources) {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return C4761a.m668b(xmlPullParser, resources);
        }
        C4761a.m667a(xmlPullParser);
        return null;
    }

    public static List<List<byte[]>> m665a(Resources resources, int i) {
        List<List<byte[]>> list = null;
        if (i != 0) {
            TypedArray obtainTypedArray = resources.obtainTypedArray(i);
            if (obtainTypedArray.length() > 0) {
                list = new ArrayList();
                if ((obtainTypedArray.getResourceId(0, 0) != 0 ? 1 : 0) != 0) {
                    for (i = 0; i < obtainTypedArray.length(); i++) {
                        list.add(C4761a.m666a(resources.getStringArray(obtainTypedArray.getResourceId(i, 0))));
                    }
                } else {
                    list.add(C4761a.m666a(resources.getStringArray(i)));
                }
            }
            obtainTypedArray.recycle();
        }
        return list != null ? list : Collections.emptyList();
    }

    private static List<byte[]> m666a(String[] strArr) {
        List<byte[]> arrayList = new ArrayList();
        for (String decode : strArr) {
            arrayList.add(Base64.decode(decode, 0));
        }
        return arrayList;
    }

    private static void m667a(XmlPullParser xmlPullParser) {
        int i = 1;
        while (i > 0) {
            switch (xmlPullParser.next()) {
                case 2:
                    i++;
                    break;
                case 3:
                    i--;
                    break;
                default:
                    break;
            }
        }
    }

    private static C0340a m668b(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C0138a.FontFamily);
        String string = obtainAttributes.getString(C0138a.FontFamily_fontProviderAuthority);
        String string2 = obtainAttributes.getString(C0138a.FontFamily_fontProviderPackage);
        String string3 = obtainAttributes.getString(C0138a.FontFamily_fontProviderQuery);
        int resourceId = obtainAttributes.getResourceId(C0138a.FontFamily_fontProviderCerts, 0);
        int integer = obtainAttributes.getInteger(C0138a.FontFamily_fontProviderFetchStrategy, 1);
        int integer2 = obtainAttributes.getInteger(C0138a.FontFamily_fontProviderFetchTimeout, PacketWriter.QUEUE_SIZE);
        obtainAttributes.recycle();
        if (string == null || string2 == null || string3 == null) {
            List arrayList = new ArrayList();
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    if (xmlPullParser.getName().equals("font")) {
                        arrayList.add(C4761a.m669c(xmlPullParser, resources));
                    } else {
                        C4761a.m667a(xmlPullParser);
                    }
                }
            }
            return arrayList.isEmpty() ? null : new C4762b((C0341c[]) arrayList.toArray(new C0341c[arrayList.size()]));
        } else {
            while (xmlPullParser.next() != 3) {
                C4761a.m667a(xmlPullParser);
            }
            return new C4763d(new C0444a(string, string2, string3, C4761a.m665a(resources, resourceId)), integer, integer2);
        }
    }

    private static C0341c m669c(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C0138a.FontFamilyFont);
        int i = obtainAttributes.getInt(C0138a.FontFamilyFont_fontWeight, 400);
        boolean z = true;
        if (1 != obtainAttributes.getInt(C0138a.FontFamilyFont_fontStyle, 0)) {
            z = false;
        }
        int resourceId = obtainAttributes.getResourceId(C0138a.FontFamilyFont_font, 0);
        String string = obtainAttributes.getString(C0138a.FontFamilyFont_font);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            C4761a.m667a(xmlPullParser);
        }
        return new C0341c(string, i, z, resourceId);
    }
}
