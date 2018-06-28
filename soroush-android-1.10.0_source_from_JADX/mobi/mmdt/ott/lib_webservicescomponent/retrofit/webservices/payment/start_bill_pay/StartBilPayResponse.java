package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.payment.start_bill_pay;

import com.google.p164b.p165a.C1902a;
import com.google.p164b.p165a.C1904c;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.payment.base.PaymentModule;

public class StartBilPayResponse extends BaseResponse {
    @C1902a
    @C1904c(a = "BillPayID")
    private String mBillPayId;
    @C1902a
    @C1904c(a = "PaymentId")
    private String mPaymentId;
    @C1902a
    @C1904c(a = "ValidModules")
    private PaymentModule[] mValidModules;

    public StartBilPayResponse(int i, String str, PaymentModule[] paymentModuleArr, String str2, String str3) {
        super(i, str);
        this.mValidModules = paymentModuleArr;
        this.mBillPayId = str2;
        this.mPaymentId = str3;
    }

    public String getBillPayId() {
        return this.mBillPayId;
    }

    public String getPaymentId() {
        return this.mPaymentId;
    }

    public PaymentModule[] getValidModules() {
        return this.mValidModules;
    }
}
