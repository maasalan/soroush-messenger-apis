package org.jivesoftware.smackx.search;

import java.util.List;
import org.b.a.b;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smackx.disco.ServiceDiscoveryManager;
import org.jivesoftware.smackx.xdata.Form;

public class UserSearchManager {
    private XMPPConnection con;
    private UserSearch userSearch = new UserSearch();

    public UserSearchManager(XMPPConnection xMPPConnection) {
        this.con = xMPPConnection;
    }

    public Form getSearchForm(b bVar) {
        return this.userSearch.getSearchForm(this.con, bVar);
    }

    public ReportedData getSearchResults(Form form, b bVar) {
        return this.userSearch.sendSearchForm(this.con, form, bVar);
    }

    public List<b> getSearchServices() {
        return ServiceDiscoveryManager.getInstanceFor(this.con).findServices("jabber:iq:search", false, false);
    }
}
