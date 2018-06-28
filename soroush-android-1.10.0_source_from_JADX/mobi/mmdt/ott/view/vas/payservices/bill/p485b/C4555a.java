package mobi.mmdt.ott.view.vas.payservices.bill.p485b;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.view.tools.C4522p;

public final class C4555a {
    private static final List<String> f12566a = Arrays.asList(new String[]{"090", "091", "095"});
    private static final List<String> f12567b = Arrays.asList(new String[]{"920", "921", "922", "923", "924", "925", "926", "927", "928", "929", "930"});
    private static final List<String> f12568c = Collections.singletonList("935");

    public static String m8292a() {
        StringBuilder stringBuilder = new StringBuilder("bill_");
        stringBuilder.append(System.currentTimeMillis());
        return stringBuilder.toString();
    }

    public static String m8293a(String str) {
        if (str != null) {
            if (str.length() >= 13) {
                return C4555a.m8304k(str.substring(0, 13));
            }
        }
        return "0";
    }

    public static boolean m8294a(String str, String str2) {
        str = C4555a.m8304k(str);
        str2 = C4555a.m8304k(str2);
        if (str != null && str2 != null && str2.length() >= 6 && str2.length() <= 13) {
            Object substring;
            StringBuilder stringBuilder;
            String j = C4555a.m8303j(str2.substring(0, str2.length() - 2));
            String k = C4555a.m8304k(str2);
            if (k != null) {
                if (k.length() >= 2) {
                    substring = k.substring(k.length() - 2, k.length() - 1);
                    if (j.equals(substring)) {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append(str);
                        stringBuilder.append(str2.substring(0, str2.length() - 1));
                        if (C4555a.m8303j(stringBuilder.toString()).equals(C4555a.m8302i(str2))) {
                        }
                    }
                }
            }
            substring = "0";
            if (j.equals(substring)) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(str2.substring(0, str2.length() - 1));
                return C4555a.m8303j(stringBuilder.toString()).equals(C4555a.m8302i(str2));
            }
        }
    }

    public static String m8295b(String str) {
        if (str != null) {
            if (str.length() >= 26) {
                return C4555a.m8304k(str.substring(13, 26));
            }
        }
        return "0";
    }

    public static String m8296c(String str) {
        str = C4555a.m8304k(str);
        if (str != null) {
            if (str.length() >= 5) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str.substring(0, str.length() - 5));
                stringBuilder.append("000");
                return stringBuilder.toString();
            }
        }
        return "0";
    }

    public static boolean m8297d(String str) {
        str = C4555a.m8304k(str);
        if (str != null && str.length() >= 6 && str.length() <= 13) {
            Object substring;
            String j = C4555a.m8303j(str.substring(0, str.length() - 1));
            str = C4555a.m8304k(str);
            if (str != null) {
                if (str.length() > 0) {
                    substring = str.substring(str.length() - 1);
                    if (j.equals(substring)) {
                    }
                }
            }
            substring = "0";
            return j.equals(substring);
        }
    }

    public static int m8298e(String str) {
        if (f12566a.contains(C4555a.m8301h(str))) {
            return R.drawable.ic_mci;
        }
        if (f12567b.contains(C4555a.m8301h(str))) {
            return R.drawable.ic_rightel;
        }
        if (f12568c.contains(C4555a.m8301h(str))) {
            return R.drawable.ic_irancell_colored;
        }
        str = C4555a.m8300g(str);
        Object obj = -1;
        switch (str.hashCode()) {
            case 49:
                if (str.equals("1")) {
                    obj = null;
                    break;
                }
                break;
            case 50:
                if (str.equals("2")) {
                    obj = 1;
                    break;
                }
                break;
            case 51:
                if (str.equals("3")) {
                    obj = 2;
                    break;
                }
                break;
            case 52:
                if (str.equals("4")) {
                    obj = 3;
                    break;
                }
                break;
            case 53:
                if (str.equals("5")) {
                    obj = 4;
                    break;
                }
                break;
            case 54:
                if (str.equals("6")) {
                    obj = 5;
                    break;
                }
                break;
            case 56:
                if (str.equals("8")) {
                    obj = 6;
                    break;
                }
                break;
            case 57:
                if (str.equals("9")) {
                    obj = 7;
                    break;
                }
                break;
            default:
                break;
        }
        int i = R.drawable.bill_shahrdari_pec;
        switch (obj) {
            case null:
                return R.drawable.bill_water_pec;
            case 1:
                return R.drawable.bill_elc_pec;
            case 2:
                return R.drawable.bill_gaz_pec;
            case 3:
                return R.drawable.bill_telecom_pec;
            case 4:
                return R.drawable.bill_mci_pec;
            case 5:
            case 6:
                break;
            case 7:
                i = R.drawable.bill_jarime_pec;
                break;
            default:
                return R.drawable.bill;
        }
        return i;
    }

    public static String m8299f(String str) {
        int i;
        if (!f12566a.contains(C4555a.m8301h(str))) {
            if (!f12567b.contains(C4555a.m8301h(str))) {
                if (!f12568c.contains(C4555a.m8301h(str))) {
                    str = C4555a.m8300g(str);
                    Object obj = -1;
                    switch (str.hashCode()) {
                        case 49:
                            if (str.equals("1")) {
                                obj = null;
                                break;
                            }
                            break;
                        case 50:
                            if (str.equals("2")) {
                                obj = 1;
                                break;
                            }
                            break;
                        case 51:
                            if (str.equals("3")) {
                                obj = 2;
                                break;
                            }
                            break;
                        case 52:
                            if (str.equals("4")) {
                                obj = 3;
                                break;
                            }
                            break;
                        case 53:
                            if (str.equals("5")) {
                                obj = 4;
                                break;
                            }
                            break;
                        case 54:
                            if (str.equals("6")) {
                                obj = 5;
                                break;
                            }
                            break;
                        case 56:
                            if (str.equals("8")) {
                                obj = 6;
                                break;
                            }
                            break;
                        case 57:
                            if (str.equals("9")) {
                                obj = 7;
                                break;
                            }
                            break;
                        default:
                            break;
                    }
                    switch (obj) {
                        case null:
                            i = R.string.water_co;
                            break;
                        case 1:
                            i = R.string.elec_co;
                            break;
                        case 2:
                            i = R.string.gas_co;
                            break;
                        case 3:
                            i = R.string.telecommunication_co;
                            break;
                        case 4:
                            i = R.string.mobile_bill;
                            break;
                        case 5:
                            i = R.string.urban_tax;
                            break;
                        case 6:
                            i = R.string.tax_administration;
                            break;
                        case 7:
                            i = R.string.traffic_fines;
                            break;
                        default:
                            i = R.string.bill_payment_bill_info;
                            break;
                    }
                }
                i = R.string.irancell;
            } else {
                i = R.string.rightel;
            }
        } else {
            i = R.string.hamrah_aval;
        }
        return C4522p.m8236a(i);
    }

    private static String m8300g(String str) {
        str = C4555a.m8304k(str);
        if (str != null) {
            if (str.length() >= 2) {
                return str.substring(str.length() - 2, str.length() - 1);
            }
        }
        return "0";
    }

    private static String m8301h(String str) {
        str = C4555a.m8304k(str);
        if (str != null) {
            if (str.length() >= 5) {
                return str.substring(str.length() - 5, str.length() - 2);
            }
        }
        return "0";
    }

    private static String m8302i(String str) {
        str = C4555a.m8304k(str);
        if (str != null) {
            if (str.length() > 0) {
                return str.substring(str.length() - 1);
            }
        }
        return "0";
    }

    private static String m8303j(String str) {
        char[] toCharArray = str.toCharArray();
        int i = 0;
        int i2 = 0;
        for (int length = toCharArray.length - 1; length >= 0; length--) {
            i2 += Character.getNumericValue(toCharArray[length]) * ((((toCharArray.length - 1) - length) % 6) + 2);
        }
        i2 %= 11;
        if (i2 != 0) {
            if (i2 != 1) {
                i = 11 - i2;
            }
        }
        return String.valueOf(i);
    }

    private static String m8304k(String str) {
        if (str == null) {
            return null;
        }
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (str.charAt(i2) != '0') {
                i = i2;
                break;
            }
        }
        return str.substring(i);
    }
}
