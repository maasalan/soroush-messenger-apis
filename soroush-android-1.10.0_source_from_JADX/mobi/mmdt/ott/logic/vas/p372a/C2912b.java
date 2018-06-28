package mobi.mmdt.ott.logic.vas.p372a;

import mobi.mmdt.ott.R;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.vas_webservices.base.ChargeType;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.vas_webservices.base.OperatorType;
import mobi.mmdt.ott.view.tools.C4522p;

public final class C2912b {
    public static int m7284a(OperatorType operatorType) {
        return operatorType == OperatorType.HamraheAval ? R.drawable.ic_mci : operatorType == OperatorType.Irancell ? R.drawable.ic_irancell_colored : operatorType == OperatorType.Rightel ? R.drawable.ic_rightel : R.drawable.ic_default;
    }

    public static String m7285a(int i) {
        switch (i) {
            case 0:
                i = R.string.charge_redirect;
                break;
            case 1:
                i = R.string.charge_with_code;
                break;
            case 2:
                i = R.string.charge_redirect_magic_irancell;
                break;
            case 3:
                i = R.string.charge_redirect_magic_raytel;
                break;
            case 4:
                i = R.string.charge_prepaid_irancell;
                break;
            default:
                i = R.string.charge_type;
                break;
        }
        return C4522p.m8236a(i);
    }

    public static OperatorType m7286a(String str) {
        return str.matches("0?(91|99)(\\d{8})") ? OperatorType.HamraheAval : str.matches("0?(90[1,2,3]|93[0,3,5,6,7,8,9])(\\d{7})") ? OperatorType.Irancell : str.matches("0?(92[0,1,2])(\\d{7})") ? OperatorType.Rightel : null;
    }

    public static String m7287b(OperatorType operatorType) {
        int i;
        switch (operatorType) {
            case Irancell:
                i = R.string.irancell;
                break;
            case HamraheAval:
                i = R.string.hamrah_aval;
                break;
            case Rightel:
                i = R.string.rightel;
                break;
            default:
                return "";
        }
        return C4522p.m8236a(i);
    }

    public static ChargeType m7288b(int i) {
        return i == 1 ? ChargeType.CHARGE_CODE : i == 0 ? ChargeType.CHARGE_REDIRECT : i == 2 ? ChargeType.CHARGE_MAGIC : i == 3 ? ChargeType.CHARGE_MAGIC : i == 4 ? ChargeType.CHARGE_PREPAID : null;
    }

    public static OperatorType m7289c(int i) {
        return i == OperatorType.Irancell.ordinal() ? OperatorType.Irancell : i == OperatorType.HamraheAval.ordinal() ? OperatorType.HamraheAval : i == OperatorType.Rightel.ordinal() ? OperatorType.Rightel : null;
    }
}
