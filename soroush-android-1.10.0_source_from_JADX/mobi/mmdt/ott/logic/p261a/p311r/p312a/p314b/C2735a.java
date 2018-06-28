package mobi.mmdt.ott.logic.p261a.p311r.p312a.p314b;

import java.util.ArrayList;
import java.util.Iterator;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.lib_webservicescomponent.p257d.C2556b;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.base.PrivateGroupInfo;
import mobi.mmdt.ott.logic.C2808d;
import mobi.mmdt.ott.logic.p261a.C2631c;
import mobi.mmdt.ott.logic.p261a.p311r.p315b.p317b.C6775c;
import mobi.mmdt.ott.p246d.p247a.C6635e;
import mobi.mmdt.ott.provider.p385g.C2980g;
import mobi.mmdt.ott.provider.p385g.C6022i;
import mobi.mmdt.ott.provider.p385g.C6024k;
import mobi.mmdt.ott.provider.p390l.C3004f;

public final class C2735a {
    public static void m7073a(PrivateGroupInfo... privateGroupInfoArr) {
        PrivateGroupInfo[] privateGroupInfoArr2 = privateGroupInfoArr;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        for (PrivateGroupInfo privateGroupInfo : privateGroupInfoArr2) {
            boolean b = C2980g.m7439b(privateGroupInfo.getGroupJID());
            C3004f a = C2631c.m7049a(privateGroupInfo.getMyRole());
            if (b) {
                String groupJID = privateGroupInfo.getGroupJID();
                String groupName = privateGroupInfo.getGroupName();
                String description = privateGroupInfo.getDescription();
                String b2 = C2556b.m7000b(privateGroupInfo.getGroupAvatarURL());
                String b3 = C2556b.m7000b(privateGroupInfo.getGroupThumbnailAvatarURL());
                boolean z = C2980g.m7433a(privateGroupInfo.getGroupJID()).f9292l;
                int membersCount = privateGroupInfo.getMembersCount();
                if (groupJID == null) {
                    throw new NullPointerException();
                }
                C6022i c6022i = new C6022i();
                c6022i.m13412c(description).m13409b(groupName).m13415e(b2).m13416f(b3).m13404a(a).m13399a(Boolean.valueOf(z)).m13400a(Integer.valueOf(membersCount));
                C6024k c6024k = new C6024k();
                c6024k.m13440a(groupJID);
                c6022i.m13395a(MyApplication.m12952b(), c6024k);
            } else {
                arrayList2.add(privateGroupInfo.getGroupJID());
                arrayList.add(new C6635e(privateGroupInfo.getGroupJID(), privateGroupInfo.getGroupName(), privateGroupInfo.getDescription(), C2556b.m7000b(privateGroupInfo.getGroupAvatarURL()), C2556b.m7000b(privateGroupInfo.getGroupThumbnailAvatarURL()), a, privateGroupInfo.getCreationDate(), privateGroupInfo.getMembersCount()));
                C2808d.m7148b(new C6775c(privateGroupInfo.getGroupJID()));
            }
        }
        if (arrayList.size() > 0) {
            C2980g.m7436a(arrayList);
        }
        int length = privateGroupInfoArr2.length;
        while (i < length) {
            C2980g.m7446g(privateGroupInfoArr2[i].getGroupJID());
            i++;
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            C2980g.m7447h((String) it.next());
        }
    }
}
