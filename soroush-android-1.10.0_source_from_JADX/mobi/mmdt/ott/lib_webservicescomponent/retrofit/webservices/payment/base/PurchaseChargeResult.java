package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.payment.base;

import mobi.mmdt.ott.lib_webservicescomponent.p250a.p252b.p253a.C2548a;

public class PurchaseChargeResult extends C2548a {
    private String mEChargeId;
    private String mPaymentId;
    private PaymentModule[] mValidModules;

    public PurchaseChargeResult(String str, String str2, PaymentModule[] paymentModuleArr, String str3, String str4) {
        super(str, str2);
        this.mValidModules = paymentModuleArr;
        this.mEChargeId = str3;
        this.mPaymentId = str4;
    }

    public String getmEChargeId() {
        return this.mEChargeId;
    }

    public String getmPaymentId() {
        return this.mPaymentId;
    }

    public PaymentModule[] getmValidModules() {
        return this.mValidModules;
    }
}
