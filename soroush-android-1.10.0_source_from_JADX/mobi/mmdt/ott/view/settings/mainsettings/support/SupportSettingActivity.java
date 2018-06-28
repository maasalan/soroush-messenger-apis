package mobi.mmdt.ott.view.settings.mainsettings.support;

import android.net.Uri;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.view.components.browser.C3112a;
import mobi.mmdt.ott.view.settings.C6260b;
import mobi.mmdt.ott.view.settings.C7722a;
import mobi.mmdt.ott.view.tools.C4522p;

public class SupportSettingActivity extends C7722a {
    public final void mo3690a(int i, boolean z) {
        if (i == 5003) {
            C2535a.m6888a().m6955l(z);
        }
    }

    public final void mo3705c(int i) {
        if (i == 1012) {
            C3112a.m7569b(this, Uri.parse(C4522p.m8236a(R.string.terms_and_conditions_url)));
        } else if (i == 1025) {
            C3112a.m7569b(this, Uri.parse(C4522p.m8236a(R.string.url_page_frequently_asked_question)));
        }
    }

    protected final String mo3643g() {
        return C4522p.m8236a(R.string.setting_support_title);
    }

    protected final C6260b mo3706h() {
        return new C6984a();
    }
}
