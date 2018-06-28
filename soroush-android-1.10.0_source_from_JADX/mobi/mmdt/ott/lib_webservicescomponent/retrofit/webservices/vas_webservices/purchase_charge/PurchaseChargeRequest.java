package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.vas_webservices.purchase_charge;

import com.google.p164b.p165a.C1902a;
import com.google.p164b.p165a.C1904c;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.RegisteredRequest;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.payment.base.PaymentModule;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.vas_webservices.base.ChargeType;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.vas_webservices.base.OperatorType;

public class PurchaseChargeRequest extends RegisteredRequest {
    @C1902a
    @C1904c(a = "EChargeAmount")
    private String chargeAmount;
    @C1902a
    @C1904c(a = "EChargeType")
    private String chargeType;
    @C1902a
    @C1904c(a = "EChargeMNPStatus")
    private String isTarabord;
    @C1902a
    @C1904c(a = "AvailablePaymentMethods")
    private PaymentModule[] modules;
    @C1902a
    @C1904c(a = "EChargeOperator")
    private String operatorType;
    @C1902a
    @C1904c(a = "EChargeNumber")
    private String phoneNumber;

    public PurchaseChargeRequest(String str, ChargeType chargeType, long j, String str2, OperatorType operatorType, boolean z, PaymentModule[] paymentModuleArr) {
        super(str);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(chargeType.ordinal() + 1);
        this.chargeType = stringBuilder.toString();
        this.chargeAmount = String.valueOf(j);
        this.phoneNumber = str2;
        stringBuilder = new StringBuilder();
        stringBuilder.append(operatorType.ordinal() + 1);
        this.operatorType = stringBuilder.toString();
        this.isTarabord = z ? "1" : "0";
        this.modules = paymentModuleArr;
    }
}
