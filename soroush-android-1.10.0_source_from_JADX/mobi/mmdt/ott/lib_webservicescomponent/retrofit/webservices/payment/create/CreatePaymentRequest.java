package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.payment.create;

import com.google.p164b.p165a.C1902a;
import com.google.p164b.p165a.C1904c;
import java.util.List;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.RegisteredRequest;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.payment.base.ThreadType;

public class CreatePaymentRequest extends RegisteredRequest {
    @C1902a
    @C1904c(a = "AllowCustomAmount")
    private int allowCustomAmount;
    @C1902a
    @C1904c(a = "Amounts")
    private List<String> amountList;
    @C1902a
    @C1904c(a = "PaymentMessageId")
    private String paymentMessageId;
    @C1902a
    @C1904c(a = "ThreadId")
    private String threadID;
    @C1902a
    @C1904c(a = "ThreadType")
    private ThreadType threadType;

    public CreatePaymentRequest(String str, ThreadType threadType, String str2, String str3, List<String> list, int i) {
        super(str);
        this.threadType = threadType;
        this.threadID = str2;
        this.paymentMessageId = str3;
        this.amountList = list;
        this.allowCustomAmount = i;
    }

    public int getAllowCustomAmount() {
        return this.allowCustomAmount;
    }

    public List<String> getAmountList() {
        return this.amountList;
    }

    public String getPaymentMessageId() {
        return this.paymentMessageId;
    }

    public String getThreadID() {
        return this.threadID;
    }

    public ThreadType getThreadType() {
        return this.threadType;
    }

    public void setAllowCustomAmount(int i) {
        this.allowCustomAmount = i;
    }

    public void setAmountList(List<String> list) {
        this.amountList = list;
    }

    public void setPaymentMessageId(String str) {
        this.paymentMessageId = str;
    }

    public void setThreadID(String str) {
        this.threadID = str;
    }

    public void setThreadType(ThreadType threadType) {
        this.threadType = threadType;
    }
}
