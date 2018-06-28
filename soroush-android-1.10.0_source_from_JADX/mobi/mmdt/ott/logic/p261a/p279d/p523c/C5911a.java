package mobi.mmdt.ott.logic.p261a.p279d.p523c;

import com.google.android.gms.maps.model.LatLng;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.p246d.C2534a;

public final class C5911a extends C2534a {
    public String f16072a;
    private int f16073h;
    private int f16074i;

    public C5911a(int i, String str, int i2, String str2, String str3, String str4, LatLng latLng) {
        this.f16074i = i;
        this.f16072a = str;
        this.f16073h = i2;
        this.f8270b = str3;
        this.f8271c = str2;
        this.f8272d = str4;
        this.f8274f = C2491i.m6806b(MyApplication.m12952b(), str2);
        this.f8273e = latLng;
    }

    public final String i_() {
        return this.f8271c;
    }
}
