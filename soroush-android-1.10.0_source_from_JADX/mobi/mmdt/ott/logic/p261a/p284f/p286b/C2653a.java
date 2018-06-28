package mobi.mmdt.ott.logic.p261a.p284f.p286b;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Iterator;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.lib_webservicescomponent.p257d.C2556b;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.p259b.C2564b;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.base.ChannelInfo;
import mobi.mmdt.ott.logic.C2778b;
import mobi.mmdt.ott.logic.p261a.C2631c;
import mobi.mmdt.ott.p246d.p247a.C6634a;
import mobi.mmdt.ott.provider.p385g.C2977d;
import mobi.mmdt.ott.provider.p385g.C2980g;
import mobi.mmdt.ott.provider.p390l.C3004f;
import mobi.mmdt.ott.provider.p395q.C3017a;
import mobi.mmdt.ott.provider.p395q.C3019b;
import mobi.mmdt.ott.provider.p395q.C6052g;

public final class C2653a {
    public static void m7053a(boolean z, ChannelInfo... channelInfoArr) {
        ChannelInfo[] channelInfoArr2 = channelInfoArr;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int length = channelInfoArr2.length;
        int i = 0;
        while (i < length) {
            int i2;
            ChannelInfo channelInfo = channelInfoArr2[i];
            C3004f a = C2631c.m7049a(channelInfo.getMyRole());
            if (C2980g.m7439b(channelInfo.getChannelID())) {
                i2 = length;
                length = 1;
                C2980g.m7425a(channelInfo.getChannelID(), channelInfo.getChannelName(), channelInfo.getDescription(), C2556b.m7000b(channelInfo.getGroupAvatarURL()), C2556b.m7000b(channelInfo.getGroupThumbnailAvatarURL()), a, channelInfo.getMembersCount(), C2980g.m7433a(channelInfo.getChannelID()).f9292l, channelInfo.getOwnerUsername(), channelInfo.getReplyAllow() == 1, C2980g.m7432a(channelInfo.isOfficial(), channelInfo.isHavePayment()), channelInfo.getLink(), C2564b.m7016a(channelInfo.getChannelLocation()));
                if (z) {
                    C2980g.m7423a(channelInfo.getChannelID(), C2778b.m7093a());
                }
            } else {
                i2 = length;
                length = 1;
                arrayList2.add(channelInfo.getChannelID());
                long creationDate = channelInfo.getCreationDate();
                if (z) {
                    creationDate = C2778b.m7093a();
                }
                arrayList.add(new C6634a(channelInfo.getChannelID(), channelInfo.getChannelName(), channelInfo.getDescription(), C2556b.m7000b(channelInfo.getGroupAvatarURL()), C2556b.m7000b(channelInfo.getGroupThumbnailAvatarURL()), a, channelInfo.getMembersCount(), channelInfo.getCreationDate(), channelInfo.getReplyAllow() == length ? length : false, channelInfo.getOwnerUsername(), C2977d.f9306a, C2980g.m7432a(channelInfo.isOfficial(), channelInfo.isHavePayment()), channelInfo.getLink(), creationDate, C2564b.m7016a(channelInfo.getChannelLocation())));
            }
            String channelID = channelInfo.getChannelID();
            C6052g c6052g = new C6052g();
            C3019b c3019b = null;
            String[] strArr = new String[length];
            strArr[0] = channelID;
            c6052g.m13607a(strArr);
            Cursor b = c6052g.m13608b(MyApplication.m12952b());
            if (b.moveToFirst()) {
                c3019b = C3019b.m7542a(b);
            }
            b.close();
            if (c3019b != null) {
                c3019b.f9482i = Long.valueOf((long) channelInfo.getMembersCount());
                c3019b.f9479f = channelInfo.getGroupAvatarURL();
                c3019b.f9480g = channelInfo.getGroupThumbnailAvatarURL();
                c3019b.f9475b = channelInfo.getChannelName();
                c3019b.f9477d = channelInfo.getDescription();
                C3017a.m7528a(c3019b);
            }
            i++;
            length = i2;
        }
        if (arrayList.size() > 0) {
            C2980g.m7436a(arrayList);
        }
        for (ChannelInfo channelID2 : channelInfoArr2) {
            C2980g.m7446g(channelID2.getChannelID());
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            C2980g.m7447h((String) it.next());
        }
    }
}
