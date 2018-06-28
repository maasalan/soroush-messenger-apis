package mobi.mmdt.ott.logic.p261a.p311r.p312a.p314b;

import com.p072b.p073a.p074a.C1073q;
import java.util.ArrayList;
import java.util.Collection;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.base.ChannelInfo;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.base.PrivateGroupInfo;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.base.Role;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.privatechat.getmemberjoingroups.GetMemberJoinGroupListResponse;
import mobi.mmdt.ott.logic.C2778b;
import mobi.mmdt.ott.logic.C2808d;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p261a.p276b.C6680c;
import mobi.mmdt.ott.logic.p261a.p284f.p286b.C2653a;
import mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b.C6719h;
import mobi.mmdt.ott.logic.p360l.C5996e;
import mobi.mmdt.ott.logic.p371s.C2898a;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p385g.C2977d;
import mobi.mmdt.ott.provider.p385g.C2978e;
import mobi.mmdt.ott.provider.p385g.C2980g;
import mobi.mmdt.ott.provider.p385g.C6023j;
import mobi.mmdt.ott.provider.p385g.C6024k;
import mobi.mmdt.ott.provider.p390l.C3004f;

public final class C6771e extends C5891a {
    public C6771e() {
        super(C2683h.f8620b);
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        GetMemberJoinGroupListResponse a = C2898a.m7274a();
        C2535a.m6888a().f8278a.edit().putLong("mobi.mmdt.ott.model.pref.KEY_LAST_INIT_GROUP_TIME", C2778b.m7093a()).apply();
        PrivateGroupInfo[] privateGroups = a.getPrivateGroups();
        C2735a.m7073a(privateGroups);
        int i = 0;
        for (PrivateGroupInfo privateGroupInfo : privateGroups) {
            try {
                if (!privateGroupInfo.getMyRole().equals(Role.NONE)) {
                    C5996e.m13260a().f16147a.m7103a(privateGroupInfo.getGroupJID());
                }
            } catch (Throwable e) {
                C2480b.m6738b(e);
            }
        }
        C2808d.m7148b(new C6719h());
        C2653a.m7053a(false, a.getChannels());
        ChannelInfo[] channels = a.getChannels();
        C2978e c2978e = C2978e.CHANNEL;
        C6024k c6024k = new C6024k();
        ((C6024k) ((C6024k) c6024k.m13438a(Integer.valueOf(C2977d.f9309d - 1)).m7368c()).m13443b(C3004f.NONE.ordinal()).m7368c()).m13441a(c2978e);
        C6023j b = c6024k.m13442b(MyApplication.m12952b());
        ArrayList arrayList = new ArrayList(b.getCount());
        if (b.moveToFirst()) {
            do {
                arrayList.add(b.m13423a());
            } while (b.moveToNext());
        }
        b.close();
        Collection arrayList2 = new ArrayList(channels.length);
        for (ChannelInfo channelID : channels) {
            arrayList2.add(channelID.getChannelID());
        }
        arrayList.removeAll(arrayList2);
        while (i < arrayList.size()) {
            C2980g.m7444e((String) arrayList.get(i));
            i++;
        }
        C2808d.m7148b(new C6680c());
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        C2736g.m7074a();
        return C1073q.f3504b;
    }
}
