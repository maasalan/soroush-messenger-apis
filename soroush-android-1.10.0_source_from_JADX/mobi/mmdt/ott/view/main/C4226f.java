package mobi.mmdt.ott.view.main;

import mobi.mmdt.ott.provider.p384f.C2973m;
import mobi.mmdt.ott.provider.p385g.C2978e;

public final class C4226f {
    public static C2978e m8056a(C2973m c2973m) {
        switch (c2973m) {
            case CHANNEL:
            case CHANNEL_DIRECT:
            case CHANNEL_REPLY:
                return C2978e.CHANNEL;
            case SINGLE:
                return C2978e.SINGLE;
            case GROUP:
                return C2978e.GROUP;
            default:
                return null;
        }
    }
}
