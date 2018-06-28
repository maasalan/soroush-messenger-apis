package android.support.p028d;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public final class C0237z {
    public final Map<String, Object> f922a = new HashMap();
    public View f923b;
    final ArrayList<C0233u> f924c = new ArrayList();

    public final boolean equals(Object obj) {
        if (obj instanceof C0237z) {
            C0237z c0237z = (C0237z) obj;
            if (this.f923b == c0237z.f923b && this.f922a.equals(c0237z.f922a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (31 * this.f923b.hashCode()) + this.f922a.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("TransitionValues@");
        stringBuilder.append(Integer.toHexString(hashCode()));
        stringBuilder.append(":\n");
        String stringBuilder2 = stringBuilder.toString();
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append(stringBuilder2);
        stringBuilder3.append("    view = ");
        stringBuilder3.append(this.f923b);
        stringBuilder3.append("\n");
        stringBuilder2 = stringBuilder3.toString();
        stringBuilder3 = new StringBuilder();
        stringBuilder3.append(stringBuilder2);
        stringBuilder3.append("    values:");
        stringBuilder2 = stringBuilder3.toString();
        for (String str : this.f922a.keySet()) {
            StringBuilder stringBuilder4 = new StringBuilder();
            stringBuilder4.append(stringBuilder2);
            stringBuilder4.append("    ");
            stringBuilder4.append(str);
            stringBuilder4.append(": ");
            stringBuilder4.append(this.f922a.get(str));
            stringBuilder4.append("\n");
            stringBuilder2 = stringBuilder4.toString();
        }
        return stringBuilder2;
    }
}
