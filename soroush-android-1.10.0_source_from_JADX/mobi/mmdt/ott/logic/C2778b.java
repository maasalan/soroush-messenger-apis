package mobi.mmdt.ott.logic;

import java.util.Calendar;
import java.util.TimeZone;
import mobi.mmdt.ott.p246d.p248b.C2535a;

public final class C2778b {
    public static long m7093a() {
        return Calendar.getInstance(TimeZone.getTimeZone("GMT")).getTimeInMillis() - C2535a.m6888a().f8278a.getLong("mobi.mmdt.ott.model.pref.KEY_TIME_DIFFERENCE", 0);
    }
}
