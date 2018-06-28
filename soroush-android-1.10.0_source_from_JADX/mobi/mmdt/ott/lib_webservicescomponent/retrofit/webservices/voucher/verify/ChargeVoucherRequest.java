package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.voucher.verify;

import com.google.p164b.p165a.C1904c;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.RegisteredRequest;

public class ChargeVoucherRequest extends RegisteredRequest {
    @C1904c(a = "Voucher")
    private String voucher;

    ChargeVoucherRequest(String str, String str2) {
        super(str);
        this.voucher = str2;
    }

    public String getVoucher() {
        return this.voucher;
    }

    public void setVoucher(String str) {
        this.voucher = str;
    }
}
