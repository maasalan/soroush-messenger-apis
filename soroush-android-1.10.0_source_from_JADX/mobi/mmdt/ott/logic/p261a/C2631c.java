package mobi.mmdt.ott.logic.p261a;

import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.base.Role;
import mobi.mmdt.ott.provider.p390l.C3004f;

public final class C2631c {
    public static Role m7048a(C3004f c3004f) {
        switch (c3004f) {
            case OWNER:
                return Role.ADMIN;
            case ADMIN:
                return Role.ADMIN;
            case MEMBER:
                return Role.MEMBER;
            case VISITOR:
                return Role.VISITOR;
            default:
                return Role.NONE;
        }
    }

    public static C3004f m7049a(Role role) {
        switch (role) {
            case ADMIN:
                return C3004f.ADMIN;
            case OWNER:
                return C3004f.OWNER;
            case MEMBER:
                return C3004f.MEMBER;
            case VISITOR:
                return C3004f.VISITOR;
            case NONE:
                return C3004f.NONE;
            default:
                return C3004f.NONE;
        }
    }
}
