package mobi.mmdt.ott.view.registeration.phoneandcountry.countryselection.components;

import android.text.TextUtils;
import android.view.View;
import mobi.mmdt.ott.view.registeration.phoneandcountry.countryselection.components.LayoutManager.C6250b;

public final class C4338g {
    public final int f12177a;
    public final boolean f12178b;
    public final int f12179c;
    public final String f12180d;
    public final int f12181e;
    public final int f12182f;
    public final int f12183g;
    public final int f12184h;
    public final int f12185i;
    final int f12186j;
    final int f12187k;
    C6250b f12188l;

    public C4338g(LayoutManager layoutManager, View view) {
        int i;
        int paddingStart = layoutManager.getPaddingStart();
        int paddingEnd = layoutManager.getPaddingEnd();
        this.f12188l = (C6250b) view.getLayoutParams();
        if (this.f12188l.f16983c) {
            this.f12182f = layoutManager.getDecoratedMeasuredWidth(view);
            this.f12183g = layoutManager.getDecoratedMeasuredHeight(view);
            if (this.f12188l.m14535c()) {
                if (!this.f12188l.m14536d()) {
                    this.f12179c = 0;
                    if (this.f12188l.f16987g) {
                        i = this.f12188l.f16986f;
                    } else if (this.f12188l.m14537e() || this.f12188l.m14536d()) {
                        this.f12186j = 0;
                        if (this.f12188l.f16988h) {
                            if (this.f12188l.m14534b() || this.f12188l.m14536d()) {
                                this.f12187k = 0;
                                this.f12184h = this.f12187k + paddingEnd;
                                this.f12185i = this.f12186j + paddingStart;
                                this.f12178b = this.f12188l.f16983c;
                                this.f12177a = this.f12188l.m14533a();
                                this.f12180d = this.f12188l.f16989i;
                                this.f12181e = this.f12188l.f16990j;
                            }
                            i = this.f12182f;
                            this.f12187k = i;
                            this.f12184h = this.f12187k + paddingEnd;
                            this.f12185i = this.f12186j + paddingStart;
                            this.f12178b = this.f12188l.f16983c;
                            this.f12177a = this.f12188l.m14533a();
                            this.f12180d = this.f12188l.f16989i;
                            this.f12181e = this.f12188l.f16990j;
                        }
                    } else {
                        i = this.f12182f;
                    }
                    this.f12186j = i;
                    if (this.f12188l.f16988h) {
                        if (this.f12188l.m14534b()) {
                        }
                        this.f12187k = 0;
                        this.f12184h = this.f12187k + paddingEnd;
                        this.f12185i = this.f12186j + paddingStart;
                        this.f12178b = this.f12188l.f16983c;
                        this.f12177a = this.f12188l.m14533a();
                        this.f12180d = this.f12188l.f16989i;
                        this.f12181e = this.f12188l.f16990j;
                    }
                }
            }
            this.f12179c = this.f12183g;
            if (this.f12188l.f16987g) {
                i = this.f12188l.f16986f;
            } else {
                if (this.f12188l.m14537e()) {
                }
                this.f12186j = 0;
                if (this.f12188l.f16988h) {
                    if (this.f12188l.m14534b()) {
                    }
                    this.f12187k = 0;
                    this.f12184h = this.f12187k + paddingEnd;
                    this.f12185i = this.f12186j + paddingStart;
                    this.f12178b = this.f12188l.f16983c;
                    this.f12177a = this.f12188l.m14533a();
                    this.f12180d = this.f12188l.f16989i;
                    this.f12181e = this.f12188l.f16990j;
                }
            }
            this.f12186j = i;
            if (this.f12188l.f16988h) {
                if (this.f12188l.m14534b()) {
                }
                this.f12187k = 0;
                this.f12184h = this.f12187k + paddingEnd;
                this.f12185i = this.f12186j + paddingStart;
                this.f12178b = this.f12188l.f16983c;
                this.f12177a = this.f12188l.m14533a();
                this.f12180d = this.f12188l.f16989i;
                this.f12181e = this.f12188l.f16990j;
            }
        }
        this.f12179c = 0;
        this.f12183g = 0;
        this.f12182f = 0;
        this.f12186j = this.f12188l.f16986f;
        i = this.f12188l.f16985e;
        this.f12187k = i;
        this.f12184h = this.f12187k + paddingEnd;
        this.f12185i = this.f12186j + paddingStart;
        this.f12178b = this.f12188l.f16983c;
        this.f12177a = this.f12188l.m14533a();
        this.f12180d = this.f12188l.f16989i;
        this.f12181e = this.f12188l.f16990j;
    }

    public final boolean m8096a(C6250b c6250b) {
        if (c6250b.f16990j != this.f12181e) {
            if (!TextUtils.equals(c6250b.f16989i, this.f12180d)) {
                return false;
            }
        }
        return true;
    }
}
