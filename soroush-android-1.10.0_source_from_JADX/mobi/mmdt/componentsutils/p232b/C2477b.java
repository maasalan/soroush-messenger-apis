package mobi.mmdt.componentsutils.p232b;

import java.util.Calendar;
import java.util.Date;

public final class C2477b {
    public static Date f8153a = new Date(Long.MAX_VALUE);

    public static boolean m6723a(Calendar calendar) {
        if (calendar == null) {
            throw new IllegalArgumentException("The dates must not be null");
        }
        Calendar instance = Calendar.getInstance();
        instance.set(6, 1);
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        return calendar.getTimeInMillis() >= instance.getTimeInMillis();
    }

    private static boolean m6724a(Calendar calendar, Calendar calendar2) {
        if (calendar != null) {
            if (calendar2 != null) {
                return calendar.get(0) < calendar2.get(0) ? true : calendar.get(0) > calendar2.get(0) ? false : calendar.get(1) < calendar2.get(1) ? true : calendar.get(1) <= calendar2.get(1) && calendar.get(6) < calendar2.get(6);
            }
        }
        throw new IllegalArgumentException("The dates must not be null");
    }

    public static boolean m6725b(Calendar calendar) {
        Calendar instance = Calendar.getInstance();
        if (calendar != null) {
            if (instance != null) {
                return calendar.get(0) == instance.get(0) && calendar.get(1) == instance.get(1) && calendar.get(6) == instance.get(6);
            }
        }
        throw new IllegalArgumentException("The dates must not be null");
    }

    public static boolean m6726c(Calendar calendar) {
        if (calendar == null) {
            throw new IllegalArgumentException("The date must not be null");
        }
        Calendar instance = Calendar.getInstance();
        Calendar instance2 = Calendar.getInstance();
        instance2.add(6, -1);
        return C2477b.m6724a(calendar, instance) && !C2477b.m6724a(calendar, instance2);
    }
}
