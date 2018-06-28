package mobi.mmdt.ott.view.settings.mainsettings.privacy.permission;

import android.os.Bundle;
import android.view.View;
import java.util.List;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.settings.C6260b;
import mobi.mmdt.ott.view.settings.p583b.C7378c;
import mobi.mmdt.ott.view.settings.p583b.C7382g;
import mobi.mmdt.ott.view.settings.p583b.C7387l;
import mobi.mmdt.ott.view.tools.C4522p;

public final class C6983a extends C6260b {
    protected final void mo3261a(List<C6829g> list) {
        list.clear();
        list.add(new C7387l(C4522p.m8236a(R.string.last_seen_setting_item), C4522p.m8236a(R.string.contacts_setting_item), true, 8006, 0));
        list.add(new C7387l(C4522p.m8236a(R.string.profile_image_setting_item), C4522p.m8236a(R.string.all_setting_item), true, 8007, 1));
        list.add(new C7382g());
        list.add(new C7387l(C4522p.m8236a(R.string.call_setting_item), C4522p.m8236a(R.string.contacts_setting_item), false, 8008, 3));
        list.add(new C7387l(C4522p.m8236a(R.string.group_join_setting_item), C4522p.m8236a(R.string.all_setting_item), true, 8009, 4));
        list.add(new C7387l(C4522p.m8236a(R.string.channel_join_setting_item), C4522p.m8236a(R.string.no_body_setting_item), true, 8010, 5));
        list.add(new C7378c(C4522p.m8236a(R.string.comment_setting_item)));
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
    }
}
