package p056c.p057a.p060c;

import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import p056c.p057a.C0885c;

public final class C0879d {
    private static final ThreadLocal<DateFormat> f2626a = new C08781();
    private static final String[] f2627b = new String[]{"EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};
    private static final DateFormat[] f2628c = new DateFormat[15];

    class C08781 extends ThreadLocal<DateFormat> {
        C08781() {
        }

        protected final /* synthetic */ Object initialValue() {
            DateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setLenient(false);
            simpleDateFormat.setTimeZone(C0885c.f2639g);
            return simpleDateFormat;
        }
    }

    public static String m2071a(Date date) {
        return ((DateFormat) f2626a.get()).format(date);
    }

    public static Date m2072a(String str) {
        if (str.length() == 0) {
            return null;
        }
        ParsePosition parsePosition = new ParsePosition(0);
        Date parse = ((DateFormat) f2626a.get()).parse(str, parsePosition);
        if (parsePosition.getIndex() == str.length()) {
            return parse;
        }
        synchronized (f2627b) {
            int length = f2627b.length;
            for (int i = 0; i < length; i++) {
                DateFormat dateFormat = f2628c[i];
                if (dateFormat == null) {
                    dateFormat = new SimpleDateFormat(f2627b[i], Locale.US);
                    dateFormat.setTimeZone(C0885c.f2639g);
                    f2628c[i] = dateFormat;
                }
                parsePosition.setIndex(0);
                Date parse2 = dateFormat.parse(str, parsePosition);
                if (parsePosition.getIndex() != 0) {
                    return parse2;
                }
            }
            return null;
        }
    }
}
