package org.jivesoftware.smackx.privacy.packet;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.jivesoftware.smack.packet.IQ;
import org.jivesoftware.smack.packet.IQ.IQChildElementXmlStringBuilder;
import org.jivesoftware.smack.util.XmlStringBuilder;

public class Privacy extends IQ {
    public static final String ELEMENT = "query";
    public static final String NAMESPACE = "jabber:iq:privacy";
    private String activeName;
    private boolean declineActiveList = false;
    private boolean declineDefaultList = false;
    private String defaultName;
    private Map<String, List<PrivacyItem>> itemLists = new HashMap();

    public Privacy() {
        super("query", "jabber:iq:privacy");
    }

    public boolean changeDefaultList(String str) {
        if (!getItemLists().containsKey(str)) {
            return false;
        }
        setDefaultName(str);
        return true;
    }

    public void deleteList(String str) {
        getItemLists().remove(str);
    }

    public void deletePrivacyList(String str) {
        getItemLists().remove(str);
        if (getDefaultName() != null && str.equals(getDefaultName())) {
            setDefaultName(null);
        }
    }

    public String getActiveName() {
        return this.activeName;
    }

    public List<PrivacyItem> getActivePrivacyList() {
        return getActiveName() == null ? null : (List) getItemLists().get(getActiveName());
    }

    public String getDefaultName() {
        return this.defaultName;
    }

    public List<PrivacyItem> getDefaultPrivacyList() {
        return getDefaultName() == null ? null : (List) getItemLists().get(getDefaultName());
    }

    protected IQChildElementXmlStringBuilder getIQChildElementBuilder(IQChildElementXmlStringBuilder iQChildElementXmlStringBuilder) {
        iQChildElementXmlStringBuilder.rightAngleBracket();
        if (isDeclineActiveList()) {
            iQChildElementXmlStringBuilder.append((CharSequence) "<active/>");
        } else if (getActiveName() != null) {
            iQChildElementXmlStringBuilder.append((CharSequence) "<active name=\"").escape(getActiveName()).append((CharSequence) "\"/>");
        }
        if (isDeclineDefaultList()) {
            iQChildElementXmlStringBuilder.append((CharSequence) "<default/>");
        } else if (getDefaultName() != null) {
            iQChildElementXmlStringBuilder.append((CharSequence) "<default name=\"").escape(getDefaultName()).append((CharSequence) "\"/>");
        }
        for (Entry entry : getItemLists().entrySet()) {
            XmlStringBuilder escape;
            CharSequence charSequence;
            String str = (String) entry.getKey();
            List<PrivacyItem> list = (List) entry.getValue();
            if (list.isEmpty()) {
                escape = iQChildElementXmlStringBuilder.append((CharSequence) "<list name=\"").escape(str);
                charSequence = "\"/>";
            } else {
                escape = iQChildElementXmlStringBuilder.append((CharSequence) "<list name=\"").escape(str);
                charSequence = "\">";
            }
            escape.append(charSequence);
            for (PrivacyItem toXML : list) {
                iQChildElementXmlStringBuilder.append(toXML.toXML());
            }
            if (!list.isEmpty()) {
                iQChildElementXmlStringBuilder.append((CharSequence) "</list>");
            }
        }
        return iQChildElementXmlStringBuilder;
    }

    public PrivacyItem getItem(String str, int i) {
        Iterator it = getPrivacyList(str).iterator();
        PrivacyItem privacyItem = null;
        while (privacyItem == null && it.hasNext()) {
            PrivacyItem privacyItem2 = (PrivacyItem) it.next();
            if (privacyItem2.getOrder() == ((long) i)) {
                privacyItem = privacyItem2;
            }
        }
        return privacyItem;
    }

    public Map<String, List<PrivacyItem>> getItemLists() {
        return this.itemLists;
    }

    public List<PrivacyItem> getPrivacyList(String str) {
        return (List) getItemLists().get(str);
    }

    public Set<String> getPrivacyListNames() {
        return this.itemLists.keySet();
    }

    public boolean isDeclineActiveList() {
        return this.declineActiveList;
    }

    public boolean isDeclineDefaultList() {
        return this.declineDefaultList;
    }

    public void setActiveName(String str) {
        this.activeName = str;
    }

    public List<PrivacyItem> setActivePrivacyList() {
        setActiveName(getDefaultName());
        return (List) getItemLists().get(getActiveName());
    }

    public void setDeclineActiveList(boolean z) {
        this.declineActiveList = z;
    }

    public void setDeclineDefaultList(boolean z) {
        this.declineDefaultList = z;
    }

    public void setDefaultName(String str) {
        this.defaultName = str;
    }

    public List<PrivacyItem> setPrivacyList(String str, List<PrivacyItem> list) {
        getItemLists().put(str, list);
        return list;
    }
}
