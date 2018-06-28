package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.payment.start_bill_pay;

import com.google.p164b.p165a.C1902a;
import com.google.p164b.p165a.C1904c;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.RegisteredRequest;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.payment.base.PaymentModule;

public class StartBilPayRequest extends RegisteredRequest {
    @C1902a
    @C1904c(a = "AvailablePaymentMethods")
    private PaymentModule[] availableModules;
    @C1902a
    @C1904c(a = "BillAmount")
    private String bilPayAmount;
    @C1902a
    @C1904c(a = "BillID")
    private String billID;
    @C1902a
    @C1904c(a = "PayID")
    private String payID;

    StartBilPayRequest(String str, String str2, String str3, String str4, PaymentModule[] paymentModuleArr) {
        super(str);
        this.billID = str2;
        this.payID = str3;
        this.bilPayAmount = str4;
        this.availableModules = paymentModuleArr;
    }

    public PaymentModule[] getAvailableModules() {
        return this.availableModules;
    }

    public String getBilPayAmount() {
        return this.bilPayAmount;
    }

    public String getBillID() {
        return this.billID;
    }

    public String getPayID() {
        return this.payID;
    }

    public void setAvailableModules(PaymentModule[] paymentModuleArr) {
        this.availableModules = paymentModuleArr;
    }

    public void setBilPayAmount(String str) {
        this.bilPayAmount = str;
    }

    public void setBillID(String str) {
        this.billID = str;
    }

    public void setPayID(String str) {
        this.payID = str;
    }
}
