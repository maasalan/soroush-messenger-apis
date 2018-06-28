package android.support.v4.p031b;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.support.v4.p029a.p030a.C4761a.C0340a;
import android.support.v4.p029a.p030a.C4761a.C4762b;
import android.support.v4.p029a.p030a.C4761a.C4763d;
import android.support.v4.p036e.C0449b;
import android.support.v4.p036e.C0449b.C0448b;
import android.support.v4.p038g.C0469g;
import android.widget.TextView;

public final class C0438c {
    private static final C0437a f1546a;
    private static final C0469g<String, Typeface> f1547b = new C0469g(16);

    interface C0437a {
        Typeface mo291a(Context context, Resources resources, int i, String str, int i2);

        Typeface mo292a(Context context, C4762b c4762b, Resources resources, int i);

        Typeface mo293a(Context context, C0448b[] c0448bArr, int i);
    }

    static {
        C0437a c7016f = VERSION.SDK_INT >= 26 ? new C7016f() : (VERSION.SDK_INT < 24 || !C6364e.m14983a()) ? VERSION.SDK_INT >= 21 ? new C6363d() : new C4804g() : new C6364e();
        f1546a = c7016f;
    }

    public static Typeface m925a(Context context, Resources resources, int i, String str, int i2) {
        Typeface a = f1546a.mo291a(context, resources, i, str, i2);
        if (a != null) {
            f1547b.put(C0438c.m929b(resources, i, i2), a);
        }
        return a;
    }

    public static Typeface m926a(Context context, C0340a c0340a, Resources resources, int i, int i2, TextView textView) {
        Typeface a;
        if (c0340a instanceof C4763d) {
            C4763d c4763d = (C4763d) c0340a;
            a = C0449b.m945a(context, c4763d.f13160a, textView, c4763d.f13162c, c4763d.f13161b, i2);
        } else {
            a = f1546a.mo292a(context, (C4762b) c0340a, resources, i2);
        }
        if (a != null) {
            f1547b.put(C0438c.m929b(resources, i, i2), a);
        }
        return a;
    }

    public static Typeface m927a(Context context, C0448b[] c0448bArr, int i) {
        return f1546a.mo293a(context, c0448bArr, i);
    }

    public static Typeface m928a(Resources resources, int i, int i2) {
        return (Typeface) f1547b.get(C0438c.m929b(resources, i, i2));
    }

    private static String m929b(Resources resources, int i, int i2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(resources.getResourcePackageName(i));
        stringBuilder.append("-");
        stringBuilder.append(i);
        stringBuilder.append("-");
        stringBuilder.append(i2);
        return stringBuilder.toString();
    }
}
