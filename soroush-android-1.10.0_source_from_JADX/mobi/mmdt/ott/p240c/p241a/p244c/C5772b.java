package mobi.mmdt.ott.p240c.p241a.p244c;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.ott.p240c.p241a.p242a.C5769b;
import org.jivesoftware.smack.XMPPException.XMPPErrorException;
import org.jivesoftware.smack.packet.Presence;
import org.jivesoftware.smack.packet.XMPPError.Condition;
import org.jivesoftware.smack.roster.RosterListener;
import org.jivesoftware.smack.tcp.XMPPTCPConnection;
import org.jivesoftware.smackx.iqlast.LastActivityManager;
import org.jivesoftware.smackx.privacy.PrivacyList;
import org.jivesoftware.smackx.privacy.PrivacyListManager;
import org.jivesoftware.smackx.privacy.packet.PrivacyItem;
import org.jivesoftware.smackx.privacy.packet.PrivacyItem.Type;
import org.p501b.p502a.C4614i;

public final class C5772b implements RosterListener {
    public XMPPTCPConnection f15945a;
    public LastActivityManager f15946b;
    public PrivacyListManager f15947c;
    private C2514a f15948d;

    public C5772b(C2514a c2514a) {
        this.f15948d = c2514a;
    }

    private void m13001a(PrivacyList privacyList, String[] strArr) {
        List<PrivacyItem> items = privacyList.getItems();
        for (String privacyItem : strArr) {
            String privacyItem2;
            PrivacyItem privacyItem3 = new PrivacyItem(Type.jid, privacyItem2, false, 100);
            boolean z = true;
            privacyItem3.setFilterMessage(true);
            privacyItem3.setFilterIQ(true);
            privacyItem3.setFilterPresenceIn(true);
            privacyItem3.setFilterPresenceOut(true);
            for (PrivacyItem value : items) {
                privacyItem2 = value.getValue();
                if (privacyItem2 != null && privacyItem2.equals(privacyItem3.getValue())) {
                    break;
                }
            }
            z = false;
            if (!z) {
                items.add(privacyItem3);
            }
        }
        this.f15947c.updatePrivacyList("MY_BLOCK_LIST", items);
    }

    private PrivacyList m13002b() {
        return this.f15947c.getPrivacyList("MY_BLOCK_LIST");
    }

    private void m13003c() {
        String activeListName = this.f15947c.getActiveListName();
        if (activeListName == null || !activeListName.equals("MY_BLOCK_LIST")) {
            this.f15947c.setActiveListName("MY_BLOCK_LIST");
        }
        activeListName = this.f15947c.getDefaultListName();
        if (activeListName == null || !activeListName.equals("MY_BLOCK_LIST")) {
            this.f15947c.setDefaultListName("MY_BLOCK_LIST");
        }
    }

    public final long m13004a(String str) {
        try {
            long[] jArr = new long[]{-1};
            jArr[0] = this.f15946b.getLastActivity(C5769b.m12963a(str)).lastActivity;
            return jArr[0];
        } catch (Throwable e) {
            C2480b.m6738b(e);
            throw e;
        }
    }

    public final ArrayList<String> m13005a() {
        PrivacyList b;
        ArrayList<String> arrayList = null;
        try {
            b = m13002b();
        } catch (XMPPErrorException e) {
            if (e.getXMPPError().getCondition().equals(Condition.item_not_found)) {
                return null;
            }
            b = null;
        }
        if (b == null) {
            return null;
        }
        List items = b.getItems();
        if (items != null) {
            arrayList = new ArrayList();
            for (int i = 0; i < items.size(); i++) {
                String value = ((PrivacyItem) items.get(i)).getValue();
                if (value != null) {
                    arrayList.add(value.split("@")[0]);
                }
            }
        }
        return arrayList;
    }

    public final void m13006a(String[] strArr) {
        PrivacyList b;
        try {
            b = m13002b();
        } catch (Throwable e) {
            C2480b.m6737b("no block list exist", e);
            b = null;
        }
        if (b == null) {
            List arrayList = new ArrayList();
            for (String privacyItem : strArr) {
                PrivacyItem privacyItem2 = new PrivacyItem(Type.jid, privacyItem, false, 1);
                privacyItem2.setFilterMessage(true);
                privacyItem2.setFilterIQ(true);
                privacyItem2.setFilterPresenceIn(true);
                privacyItem2.setFilterPresenceOut(true);
                arrayList.add(privacyItem2);
            }
            this.f15947c.createPrivacyList("MY_BLOCK_LIST", arrayList);
        } else {
            m13001a(b, strArr);
        }
        m13003c();
    }

    public final void m13007b(String[] strArr) {
        PrivacyList b = m13002b();
        if (b != null) {
            List<PrivacyItem> items = b.getItems();
            for (Object obj : strArr) {
                for (PrivacyItem privacyItem : items) {
                    if (privacyItem.getValue().equals(obj)) {
                        items.remove(privacyItem);
                        break;
                    }
                }
            }
            if (items.size() > 0) {
                this.f15947c.updatePrivacyList("MY_BLOCK_LIST", items);
                m13003c();
                return;
            }
            this.f15947c.declineActiveList();
            this.f15947c.declineDefaultList();
            this.f15947c.deletePrivacyList("MY_BLOCK_LIST");
        }
    }

    public final void entriesAdded(Collection<C4614i> collection) {
    }

    public final void entriesDeleted(Collection<C4614i> collection) {
    }

    public final void entriesUpdated(Collection<C4614i> collection) {
    }

    public final void presenceChanged(Presence presence) {
        this.f15948d.mo2146a(presence.getFrom().toString(), presence);
    }
}
