package mobi.mmdt.ott.logic.vas.pray.p378d;

import java.io.File;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.C2791c;
import mobi.mmdt.ott.logic.vas.pray.p376a.C2920c;
import mobi.mmdt.ott.view.tools.C4522p;

public final class C2925a {
    public static String m7307a(C2920c c2920c) {
        int i;
        switch (c2920c) {
            case MorningPray:
                i = R.string.morning_prayer;
                break;
            case Sunrise:
                i = R.string.sunrise;
                break;
            case NoonPray:
                i = R.string.noon_prayer;
                break;
            case EveningPray:
                i = R.string.evening_prayer;
                break;
            case Sunset:
                i = R.string.sunset;
                break;
            case MidNight:
                i = R.string.mid_night;
                break;
            default:
                return "";
        }
        return C4522p.m8236a(i);
    }

    public static boolean m7308a() {
        return new File(C2791c.m7109a().f8821g, "cities.txt").exists();
    }

    public static int m7309b(C2920c c2920c) {
        switch (c2920c) {
            case MorningPray:
                return R.drawable.ic_moorning;
            case Sunrise:
                return R.drawable.ic_sunrise;
            case NoonPray:
                return R.drawable.ic_noon_pray;
            case EveningPray:
                return R.drawable.ic_evenning_pray;
            case Sunset:
                return R.drawable.ic_sunset;
            case MidNight:
                return R.drawable.ic_mid_night;
            default:
                return R.drawable.ic_moorning;
        }
    }

    public static C2920c m7310c(C2920c c2920c) {
        int ordinal = c2920c.ordinal() + 1;
        if (ordinal == C2920c.values().length) {
            ordinal = 0;
        }
        return C2920c.values()[ordinal];
    }
}
