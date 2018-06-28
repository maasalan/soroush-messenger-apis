package org.p501b.p507c;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.msgpack.util.TemplatePrecompiler;

public final class C4624a {
    private static final C4621a f12702a = C4621a.XEP_0082_DATE_PROFILE;
    private static final Pattern f12703b = Pattern.compile("^\\d+-\\d+-\\d+$");
    private static final C4621a f12704c = C4621a.XEP_0082_TIME_MILLIS_ZONE_PROFILE;
    private static final Pattern f12705d = Pattern.compile("^(\\d+:){2}\\d+.\\d+(Z|([+-](\\d+:\\d+)))$");
    private static final C4621a f12706e = C4621a.XEP_0082_TIME_MILLIS_PROFILE;
    private static final Pattern f12707f = Pattern.compile("^(\\d+:){2}\\d+.\\d+$");
    private static final C4621a f12708g = C4621a.XEP_0082_TIME_ZONE_PROFILE;
    private static final Pattern f12709h = Pattern.compile("^(\\d+:){2}\\d+(Z|([+-](\\d+:\\d+)))$");
    private static final C4621a f12710i = C4621a.XEP_0082_TIME_PROFILE;
    private static final Pattern f12711j = Pattern.compile("^(\\d+:){2}\\d+$");
    private static final C4621a f12712k = C4621a.XEP_0082_DATETIME_MILLIS_PROFILE;
    private static final Pattern f12713l = Pattern.compile("^\\d+(-\\d+){2}+T(\\d+:){2}\\d+.\\d+(Z|([+-](\\d+:\\d+)))?$");
    private static final C4621a f12714m = C4621a.XEP_0082_DATETIME_PROFILE;
    private static final Pattern f12715n = Pattern.compile("^\\d+(-\\d+){2}+T(\\d+:){2}\\d+(Z|([+-](\\d+:\\d+)))?$");
    private static final DateFormat f12716o = new SimpleDateFormat("yyyyMMdd'T'HH:mm:ss");
    private static final DateFormat f12717p = new SimpleDateFormat("yyyyMd'T'HH:mm:ss");
    private static final DateFormat f12718q = new SimpleDateFormat("yyyyMdd'T'HH:mm:ss");
    private static final DateFormat f12719r = new SimpleDateFormat("yyyyMMd'T'HH:mm:ss");
    private static final Pattern f12720s = Pattern.compile("^\\d+T\\d+:\\d+:\\d+$");
    private static final List<C6311b> f12721t = new ArrayList();
    private static final Pattern f12722u = Pattern.compile(".*\\.(\\d{1,})(Z|((\\+|-)\\d{4}))");

    private enum C4621a {
        XEP_0082_DATE_PROFILE("yyyy-MM-dd"),
        XEP_0082_DATETIME_PROFILE("yyyy-MM-dd'T'HH:mm:ssZ"),
        XEP_0082_DATETIME_MILLIS_PROFILE("yyyy-MM-dd'T'HH:mm:ss.SSSZ"),
        XEP_0082_TIME_PROFILE("hh:mm:ss"),
        XEP_0082_TIME_ZONE_PROFILE("hh:mm:ssZ"),
        XEP_0082_TIME_MILLIS_PROFILE("hh:mm:ss.SSS"),
        XEP_0082_TIME_MILLIS_ZONE_PROFILE("hh:mm:ss.SSSZ"),
        XEP_0091_DATETIME("yyyyMMdd'T'HH:mm:ss");
        
        private final String f12692i;
        private final DateFormat f12693j;
        private final boolean f12694k;
        private final boolean f12695l;

        private C4621a(String str) {
            this.f12692i = str;
            this.f12693j = new SimpleDateFormat(this.f12692i);
            this.f12693j.setTimeZone(TimeZone.getTimeZone("UTC"));
            boolean z = true;
            if (str.charAt(str.length() - 1) != 'Z') {
                z = false;
            }
            this.f12694k = z;
            this.f12695l = str.contains("SSS");
        }

        private String m8400a(Date date) {
            String format;
            synchronized (this.f12693j) {
                format = this.f12693j.format(date);
            }
            return this.f12694k ? C4624a.m8412d(format) : format;
        }

        private Date m8402a(String str) {
            Date parse;
            if (this.f12694k) {
                str = C4624a.m8411c(str);
            }
            if (this.f12695l) {
                str = C4624a.m8413e(str);
            }
            synchronized (this.f12693j) {
                parse = this.f12693j.parse(str);
            }
            return parse;
        }
    }

    private static class C6311b {
        final Pattern f12696a;
        final C4621a f12697b;

        public C6311b(Pattern pattern, C4621a c4621a) {
            this.f12696a = pattern;
            this.f12697b = c4621a;
        }
    }

    static {
        TimeZone timeZone = TimeZone.getTimeZone("UTC");
        f12716o.setTimeZone(timeZone);
        f12717p.setTimeZone(timeZone);
        f12718q.setTimeZone(timeZone);
        f12718q.setLenient(false);
        f12719r.setTimeZone(timeZone);
        f12719r.setLenient(false);
        f12721t.add(new C6311b(f12703b, f12702a));
        f12721t.add(new C6311b(f12713l, f12712k));
        f12721t.add(new C6311b(f12715n, f12714m));
        f12721t.add(new C6311b(f12705d, f12704c));
        f12721t.add(new C6311b(f12707f, f12706e));
        f12721t.add(new C6311b(f12709h, f12708g));
        f12721t.add(new C6311b(f12711j, f12710i));
    }

    public static String m8405a(Date date) {
        String a;
        synchronized (f12712k) {
            a = f12712k.m8400a(date);
        }
        return a;
    }

    public static String m8406a(TimeZone timeZone) {
        int rawOffset = timeZone.getRawOffset();
        rawOffset = Math.abs((rawOffset / 60000) - ((rawOffset / 3600000) * 60));
        return String.format("%+d:%02d", new Object[]{Integer.valueOf(r0), Integer.valueOf(rawOffset)});
    }

    private static java.util.Calendar m8407a(java.lang.String r0, java.text.DateFormat r1) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        monitor-enter(r1);	 Catch:{ ParseException -> 0x000d }
        r1.parse(r0);	 Catch:{ all -> 0x000a }
        r0 = r1.getCalendar();	 Catch:{ all -> 0x000a }
        monitor-exit(r1);	 Catch:{ all -> 0x000a }
        return r0;	 Catch:{ all -> 0x000a }
    L_0x000a:
        r0 = move-exception;	 Catch:{ all -> 0x000a }
        monitor-exit(r1);	 Catch:{ all -> 0x000a }
        throw r0;	 Catch:{ ParseException -> 0x000d }
    L_0x000d:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.b.c.a.a(java.lang.String, java.text.DateFormat):java.util.Calendar");
    }

    public static Date m8408a(String str) {
        Date a;
        for (C6311b c6311b : f12721t) {
            if (c6311b.f12696a.matcher(str).matches()) {
                return c6311b.f12697b.m8402a(str);
            }
        }
        synchronized (f12714m) {
            a = f12714m.m8402a(str);
        }
        return a;
    }

    private static Date m8409a(String str, int i) {
        if (i == 6) {
            Date parse;
            synchronized (f12717p) {
                parse = f12717p.parse(str);
            }
            return parse;
        }
        final Calendar instance = Calendar.getInstance();
        Calendar a = C4624a.m8407a(str, f12718q);
        Calendar a2 = C4624a.m8407a(str, f12719r);
        Calendar[] calendarArr = new Calendar[]{a, a2};
        List arrayList = new ArrayList();
        for (int i2 = 0; i2 < 2; i2++) {
            Calendar calendar = calendarArr[i2];
            if (calendar != null && calendar.before(instance)) {
                arrayList.add(calendar);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        Collections.sort(arrayList, new Comparator<Calendar>() {
            public final /* synthetic */ int compare(Object obj, Object obj2) {
                return new Long(instance.getTimeInMillis() - ((Calendar) obj).getTimeInMillis()).compareTo(new Long(instance.getTimeInMillis() - ((Calendar) obj2).getTimeInMillis()));
            }
        });
        return ((Calendar) arrayList.get(0)).getTime();
    }

    public static Date m8410b(String str) {
        if (f12720s.matcher(str).matches()) {
            int length = str.split("T")[0].length();
            if (length < 8) {
                Date a = C4624a.m8409a(str, length);
                if (a != null) {
                    return a;
                }
            }
            Date parse;
            synchronized (f12716o) {
                parse = f12716o.parse(str);
            }
            return parse;
        }
        return C4624a.m8408a(str);
    }

    public static String m8411c(String str) {
        return str.charAt(str.length() + -1) == 'Z' ? str.replace("Z", "+0000") : str.replaceAll("([\\+\\-]\\d\\d):(\\d\\d)", "$1$2");
    }

    public static String m8412d(String str) {
        int length = str.length();
        int i = length - 2;
        String substring = str.substring(0, i);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(substring);
        stringBuilder.append(':');
        substring = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append(substring);
        stringBuilder.append(str.substring(i, length));
        return stringBuilder.toString();
    }

    static /* synthetic */ String m8413e(String str) {
        Matcher matcher = f12722u.matcher(str);
        if (!matcher.matches()) {
            return str;
        }
        int length = matcher.group(1).length();
        if (length == 3) {
            return str;
        }
        int indexOf = str.indexOf(TemplatePrecompiler.DEFAULT_DEST);
        StringBuilder stringBuilder = new StringBuilder((str.length() - length) + 3);
        if (length > 3) {
            stringBuilder.append(str.substring(0, indexOf + 4));
        } else {
            stringBuilder.append(str.substring(0, (indexOf + length) + 1));
            for (int i = length; i < 3; i++) {
                stringBuilder.append('0');
            }
        }
        stringBuilder.append(str.substring((indexOf + length) + 1));
        return stringBuilder.toString();
    }
}
