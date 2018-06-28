package android.support.v7.p043c.p044a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.support.v4.p031b.C0433a;
import android.support.v7.p041a.C0645a.C0635a;
import android.support.v7.p041a.C0645a.C0644j;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

final class C0681a {
    public static ColorStateList m1653a(Resources resources, XmlPullParser xmlPullParser, Theme theme) {
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
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
        String name = xmlPullParser.getName();
        if (name.equals("selector")) {
            return C0681a.m1654a(resources, xmlPullParser, asAttributeSet, theme);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(xmlPullParser.getPositionDescription());
        stringBuilder.append(": invalid color state list tag ");
        stringBuilder.append(name);
        throw new XmlPullParserException(stringBuilder.toString());
    }

    private static ColorStateList m1654a(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        AttributeSet attributeSet2 = attributeSet;
        Theme theme2 = theme;
        int i = 1;
        int depth = xmlPullParser.getDepth() + 1;
        Object obj = new int[20][];
        Object obj2 = new int[20];
        int i2 = 0;
        while (true) {
            int next = xmlPullParser.next();
            if (next == i) {
                break;
            }
            int depth2 = xmlPullParser.getDepth();
            if (depth2 < depth && next == 3) {
                break;
            }
            Resources resources2;
            if (next == 2 && depth2 <= depth && xmlPullParser.getName().equals("item")) {
                TypedArray obtainAttributes;
                int i3;
                int[] iArr;
                int i4;
                int i5;
                int attributeNameResource;
                Object trimStateSet;
                int[] iArr2 = C0644j.ColorStateListItem;
                if (theme2 == null) {
                    obtainAttributes = resources.obtainAttributes(attributeSet2, iArr2);
                } else {
                    resources2 = resources;
                    obtainAttributes = theme2.obtainStyledAttributes(attributeSet2, iArr2, 0, 0);
                }
                int color = obtainAttributes.getColor(C0644j.ColorStateListItem_android_color, -65281);
                boolean hasValue = obtainAttributes.hasValue(C0644j.ColorStateListItem_android_alpha);
                float f = BallPulseIndicator.SCALE;
                if (hasValue) {
                    i3 = C0644j.ColorStateListItem_android_alpha;
                } else {
                    if (obtainAttributes.hasValue(C0644j.ColorStateListItem_alpha)) {
                        i3 = C0644j.ColorStateListItem_alpha;
                    }
                    obtainAttributes.recycle();
                    next = attributeSet.getAttributeCount();
                    iArr = new int[next];
                    i4 = 0;
                    i5 = i4;
                    while (i4 < next) {
                        attributeNameResource = attributeSet2.getAttributeNameResource(i4);
                        if (!(attributeNameResource == 16843173 || attributeNameResource == 16843551 || attributeNameResource == C0635a.alpha)) {
                            i = i5 + 1;
                            if (attributeSet2.getAttributeBooleanValue(i4, false)) {
                                attributeNameResource = -attributeNameResource;
                            }
                            iArr[i5] = attributeNameResource;
                            i5 = i;
                        }
                        i4++;
                    }
                    trimStateSet = StateSet.trimStateSet(iArr, i5);
                    obj2 = C0684c.m1660a((int[]) obj2, i2, C0433a.m908b(color, Math.round(((float) Color.alpha(color)) * f)));
                    obj = (int[][]) C0684c.m1661a((Object[]) obj, i2, trimStateSet);
                    i2++;
                }
                f = obtainAttributes.getFloat(i3, BallPulseIndicator.SCALE);
                obtainAttributes.recycle();
                next = attributeSet.getAttributeCount();
                iArr = new int[next];
                i4 = 0;
                i5 = i4;
                while (i4 < next) {
                    attributeNameResource = attributeSet2.getAttributeNameResource(i4);
                    i = i5 + 1;
                    if (attributeSet2.getAttributeBooleanValue(i4, false)) {
                        attributeNameResource = -attributeNameResource;
                    }
                    iArr[i5] = attributeNameResource;
                    i5 = i;
                    i4++;
                }
                trimStateSet = StateSet.trimStateSet(iArr, i5);
                obj2 = C0684c.m1660a((int[]) obj2, i2, C0433a.m908b(color, Math.round(((float) Color.alpha(color)) * f)));
                obj = (int[][]) C0684c.m1661a((Object[]) obj, i2, trimStateSet);
                i2++;
            } else {
                resources2 = resources;
            }
            i = 1;
        }
        Object obj3 = new int[i2];
        Object obj4 = new int[i2][];
        System.arraycopy(obj2, 0, obj3, 0, i2);
        System.arraycopy(obj, 0, obj4, 0, i2);
        return new ColorStateList(obj4, obj3);
    }
}
