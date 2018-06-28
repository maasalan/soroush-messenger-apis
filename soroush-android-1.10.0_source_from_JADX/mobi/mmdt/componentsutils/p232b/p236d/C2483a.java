package mobi.mmdt.componentsutils.p232b.p236d;

import android.content.Context;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.Calendar;
import java.util.TimeZone;
import mobi.mmdt.componentsutils.p232b.C2492j;
import mobi.mmdt.componentsutils.p232b.p237e.C2485a;

public final class C2483a {
    public static String m6744a(Context context) {
        String b;
        StringBuilder stringBuilder;
        long timeInMillis = Calendar.getInstance(TimeZone.getTimeZone("GMT")).getTimeInMillis();
        String e = C2492j.m6846e(context);
        try {
            b = C2492j.m6843b(C2492j.m6846e(context));
        } catch (UnsupportedEncodingException e2) {
            e2.printStackTrace();
            b = e;
            e = C2485a.m6745a(4);
            stringBuilder = new StringBuilder();
            stringBuilder.append(timeInMillis);
            stringBuilder.append(b.substring(0, 7));
            stringBuilder.append(e);
            return stringBuilder.toString();
        } catch (NoSuchAlgorithmException e3) {
            e3.printStackTrace();
            b = e;
            e = C2485a.m6745a(4);
            stringBuilder = new StringBuilder();
            stringBuilder.append(timeInMillis);
            stringBuilder.append(b.substring(0, 7));
            stringBuilder.append(e);
            return stringBuilder.toString();
        }
        e = C2485a.m6745a(4);
        stringBuilder = new StringBuilder();
        stringBuilder.append(timeInMillis);
        stringBuilder.append(b.substring(0, 7));
        stringBuilder.append(e);
        return stringBuilder.toString();
    }
}
