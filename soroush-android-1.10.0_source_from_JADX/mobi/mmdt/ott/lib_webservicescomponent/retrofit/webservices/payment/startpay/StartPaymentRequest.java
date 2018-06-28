package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.payment.startpay;

import com.google.p164b.p165a.C1902a;
import com.google.p164b.p165a.C1904c;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.RegisteredRequest;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.payment.base.PaymentModule;

public class StartPaymentRequest extends RegisteredRequest {
    @C1902a
    @C1904c(a = "Amount")
    private String amount;
    @C1902a
    @C1904c(a = "Module")
    private PaymentModule module;
    @C1902a
    @C1904c(a = "PaymentId")
    private String paymentid;
    @C1902a
    @C1904c(a = "PaymentMessageId")
    private String paymentmessageid;
    @C1902a
    @C1904c(a = "PaymentThreadId")
    private String paymentthreadid;
    @C1902a
    @C1904c(a = "PaymentThreadType")
    private String paymentthreadtype;

    StartPaymentRequest(String str, PaymentModule paymentModule, String str2, String str3, String str4, String str5, String str6) {
        super(str);
        this.module = paymentModule;
        this.paymentmessageid = str2;
        this.paymentthreadid = str3;
        this.paymentthreadtype = str4;
        this.amount = str5;
        this.paymentid = str6;
    }

    public String getAmount() {
        return this.amount;
    }

    public PaymentModule getModule() {
        return this.module;
    }

    public String getPaymentid() {
        return this.paymentid;
    }

    public String getPaymentmessageid() {
        return this.paymentmessageid;
    }

    public String getPaymentthreadid() {
        return this.paymentthreadid;
    }

    public String getPaymentthreadtype() {
        return this.paymentthreadtype;
    }

    public void setAmount(String str) {
        this.amount = str;
    }

    public void setModule(PaymentModule paymentModule) {
        this.module = paymentModule;
    }

    public void setPaymentid(String str) {
        this.paymentid = str;
    }

    public void setPaymentmessageid(String str) {
        this.paymentmessageid = str;
    }

    public void setPaymentthreadid(String str) {
        this.paymentthreadid = str;
    }

    public void setPaymentthreadtype(String str) {
        this.paymentthreadtype = str;
    }
}
