package ir.pec.mpl.pecpayment.p209a.p210a;

import ir.pec.mpl.pecpayment.C2338R;

public class C2342d {
    public Integer m6348a(int i) {
        switch (i) {
            case 1:
                i = C2338R.drawable.mci_logo;
                break;
            case 2:
                i = C2338R.drawable.mtn_logo;
                break;
            case 3:
                i = C2338R.drawable.rightel_logo;
                break;
            default:
                i = 0;
                break;
        }
        return Integer.valueOf(i);
    }

    public String m6349b(int i) {
        switch (i) {
            case 1:
                return "همراه اول";
            case 2:
                return "ایرانسل";
            case 3:
                return "رایتل";
            default:
                return "ناشناخته";
        }
    }
}
