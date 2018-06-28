package android.support.v4.p029a.p030a;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources.Theme;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.p029a.p030a.C4761a.C0340a;
import android.support.v4.p031b.C0438c;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

public final class C0343b {
    public static Typeface m670a(Context context, Resources resources, TypedValue typedValue, int i, int i2, TextView textView) {
        Throwable e;
        String str;
        StringBuilder stringBuilder;
        if (typedValue.string == null) {
            StringBuilder stringBuilder2 = new StringBuilder("Resource \"");
            stringBuilder2.append(resources.getResourceName(i));
            stringBuilder2.append("\" (");
            stringBuilder2.append(Integer.toHexString(i));
            stringBuilder2.append(") is not a Font: ");
            stringBuilder2.append(typedValue);
            throw new NotFoundException(stringBuilder2.toString());
        }
        String charSequence = typedValue.string.toString();
        if (!charSequence.startsWith("res/")) {
            return null;
        }
        Typeface a = C0438c.m928a(resources, i, i2);
        if (a != null) {
            return a;
        }
        try {
            if (!charSequence.toLowerCase().endsWith(".xml")) {
                return C0438c.m925a(context, resources, i, charSequence, i2);
            }
            C0340a a2 = C4761a.m664a(resources.getXml(i), resources);
            if (a2 != null) {
                return C0438c.m926a(context, a2, resources, i, i2, textView);
            }
            Log.e("ResourcesCompat", "Failed to find font-family tag");
            return null;
        } catch (XmlPullParserException e2) {
            e = e2;
            str = "ResourcesCompat";
            stringBuilder = new StringBuilder("Failed to parse xml resource ");
            stringBuilder.append(charSequence);
            Log.e(str, stringBuilder.toString(), e);
            return null;
        } catch (IOException e3) {
            e = e3;
            str = "ResourcesCompat";
            stringBuilder = new StringBuilder("Failed to read xml resource ");
            stringBuilder.append(charSequence);
            Log.e(str, stringBuilder.toString(), e);
            return null;
        }
    }

    public static Drawable m671a(Resources resources, int i, Theme theme) {
        return VERSION.SDK_INT >= 21 ? resources.getDrawable(i, theme) : resources.getDrawable(i);
    }
}
