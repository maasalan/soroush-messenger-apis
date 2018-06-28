package android.support.v4.p029a.p030a;

import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

public final class C0344c {
    public static float m672a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, float f) {
        return !C0344c.m677a(xmlPullParser, str) ? f : typedArray.getFloat(i, f);
    }

    public static int m673a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        return !C0344c.m677a(xmlPullParser, str) ? 0 : typedArray.getResourceId(i, 0);
    }

    public static int m674a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !C0344c.m677a(xmlPullParser, str) ? i2 : typedArray.getInt(i, i2);
    }

    public static TypedArray m675a(Resources resources, Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static TypedValue m676a(TypedArray typedArray, XmlPullParser xmlPullParser, String str) {
        return !C0344c.m677a(xmlPullParser, str) ? null : typedArray.peekValue(0);
    }

    public static boolean m677a(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static int m678b(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !C0344c.m677a(xmlPullParser, str) ? i2 : typedArray.getColor(i, i2);
    }

    public static String m679b(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        return !C0344c.m677a(xmlPullParser, str) ? null : typedArray.getString(i);
    }
}
