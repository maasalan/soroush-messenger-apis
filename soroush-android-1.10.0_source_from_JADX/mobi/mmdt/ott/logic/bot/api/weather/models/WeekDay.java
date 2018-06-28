package mobi.mmdt.ott.logic.bot.api.weather.models;

import mobi.mmdt.ott.R;
import mobi.mmdt.ott.view.tools.C4522p;

public enum WeekDay {
    SAT,
    SUN,
    MON,
    TUE,
    WED,
    THU,
    FRI;

    public final String getString() {
        int i;
        switch (this) {
            case SAT:
                return C4522p.m8236a(R.string.day_saturday);
            case SUN:
                i = R.string.day_sunday;
                break;
            case MON:
                i = R.string.day_monday;
                break;
            case TUE:
                i = R.string.day_tuesday;
                break;
            case WED:
                i = R.string.day_wednesday;
                break;
            case THU:
                i = R.string.day_thursday;
                break;
            case FRI:
                i = R.string.day_friday;
                break;
            default:
                return C4522p.m8236a(R.string.day_saturday);
        }
        return C4522p.m8236a(i);
    }
}
