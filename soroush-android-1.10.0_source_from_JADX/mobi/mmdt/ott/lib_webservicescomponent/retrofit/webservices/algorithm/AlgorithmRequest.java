package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.algorithm;

import com.google.p164b.p165a.C1904c;
import java.util.Arrays;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.p259b.C2563a;

public class AlgorithmRequest {
    @C1904c(a = "EncryptionMethods")
    private String[] encryptionMethos = C2563a.f8371b;
    @C1904c(a = "HashMethods")
    private String[] hashMethods = C2563a.f8370a;

    public String[] getEncryptionMethos() {
        return this.encryptionMethos;
    }

    public String[] getHashMethods() {
        return this.hashMethods;
    }

    public void setEncryptionMethos(String[] strArr) {
        this.encryptionMethos = strArr;
    }

    public void setHashMethods(String[] strArr) {
        this.hashMethods = strArr;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("AlgorithmRequest{hashMethods=");
        stringBuilder.append(Arrays.toString(this.hashMethods));
        stringBuilder.append(", encryptionMethos=");
        stringBuilder.append(Arrays.toString(this.encryptionMethos));
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
