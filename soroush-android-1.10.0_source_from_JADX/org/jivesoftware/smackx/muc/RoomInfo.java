package org.jivesoftware.smackx.muc;

import java.net.URL;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.b.a.e;
import org.jivesoftware.smackx.disco.packet.DiscoverInfo;
import org.jivesoftware.smackx.disco.packet.DiscoverInfo.Identity;
import org.jivesoftware.smackx.xdata.Form;
import org.jivesoftware.smackx.xdata.FormField;

public class RoomInfo {
    private static final Logger LOGGER = Logger.getLogger(RoomInfo.class.getName());
    private final List<String> contactJid;
    private final String description;
    private final Form form;
    private final String lang;
    private final String ldapgroup;
    private final URL logs;
    private final int maxhistoryfetch;
    private final boolean membersOnly;
    private final boolean moderated;
    private final String name;
    private final boolean nonanonymous;
    private final int occupantsCount;
    private final boolean passwordProtected;
    private final boolean persistent;
    private final String pubsub;
    private final e room;
    private final String subject;
    private final Boolean subjectmod;

    RoomInfo(DiscoverInfo discoverInfo) {
        String str;
        int parseInt;
        List values;
        String str2;
        String str3;
        Boolean valueOf;
        URL url;
        String str4 = null;
        if (discoverInfo.getFrom() != null) {
            this.room = discoverInfo.getFrom().n();
        } else {
            this.room = null;
        }
        this.membersOnly = discoverInfo.containsFeature("muc_membersonly");
        this.moderated = discoverInfo.containsFeature("muc_moderated");
        this.nonanonymous = discoverInfo.containsFeature("muc_nonanonymous");
        this.passwordProtected = discoverInfo.containsFeature("muc_passwordprotected");
        this.persistent = discoverInfo.containsFeature("muc_persistent");
        List identities = discoverInfo.getIdentities();
        if (identities.isEmpty()) {
            Logger logger = LOGGER;
            StringBuilder stringBuilder = new StringBuilder("DiscoverInfo does not contain any Identity: ");
            stringBuilder.append(discoverInfo.toXML());
            logger.warning(stringBuilder.toString());
            str = "";
        } else {
            str = ((Identity) identities.get(0)).getName();
        }
        this.name = str;
        str = "";
        String str5 = "";
        this.form = Form.getFormFrom(discoverInfo);
        int i = -1;
        if (this.form != null) {
            FormField field = this.form.getField("muc#roominfo_description");
            if (!(field == null || field.getValues().isEmpty())) {
                str5 = (String) field.getValues().get(0);
            }
            field = this.form.getField("muc#roominfo_subject");
            if (!(field == null || field.getValues().isEmpty())) {
                str = (String) field.getValues().get(0);
            }
            field = this.form.getField("muc#roominfo_occupants");
            parseInt = (field == null || field.getValues().isEmpty()) ? -1 : Integer.parseInt((String) field.getValues().get(0));
            FormField field2 = this.form.getField("muc#maxhistoryfetch");
            if (!(field2 == null || field2.getValues().isEmpty())) {
                i = Integer.parseInt((String) field2.getValues().get(0));
            }
            field2 = this.form.getField("muc#roominfo_contactjid");
            values = (field2 == null || field2.getValues().isEmpty()) ? null : field2.getValues();
            FormField field3 = this.form.getField("muc#roominfo_lang");
            str2 = (field3 == null || field3.getValues().isEmpty()) ? null : (String) field3.getValues().get(0);
            FormField field4 = this.form.getField("muc#roominfo_ldapgroup");
            str3 = (field4 == null || field4.getValues().isEmpty()) ? null : (String) field4.getValues().get(0);
            FormField field5 = this.form.getField("muc#roominfo_subjectmod");
            valueOf = (field5 == null || field5.getValues().isEmpty()) ? null : Boolean.valueOf((String) field5.getValues().get(0));
            FormField field6 = this.form.getField("muc#roominfo_logs");
            if (!(field6 == null || field6.getValues().isEmpty())) {
                try {
                    url = new URL((String) field6.getValues().get(0));
                } catch (Throwable e) {
                    LOGGER.log(Level.SEVERE, "Could not parse URL", e);
                }
                field6 = this.form.getField("muc#roominfo_pubsub");
                if (!(field6 == null || field6.getValues().isEmpty())) {
                    str4 = (String) field6.getValues().get(0);
                }
            }
            url = null;
            field6 = this.form.getField("muc#roominfo_pubsub");
            str4 = (String) field6.getValues().get(0);
        } else {
            values = null;
            str2 = values;
            str3 = str2;
            valueOf = str3;
            url = valueOf;
            parseInt = -1;
        }
        this.description = str5;
        this.subject = str;
        this.occupantsCount = parseInt;
        this.maxhistoryfetch = i;
        this.contactJid = values;
        this.lang = str2;
        this.ldapgroup = str3;
        this.subjectmod = valueOf;
        this.logs = url;
        this.pubsub = str4;
    }

    public List<String> getContactJids() {
        return this.contactJid;
    }

    public String getDescription() {
        return this.description;
    }

    public Form getForm() {
        return this.form;
    }

    public String getLang() {
        return this.lang;
    }

    public String getLdapGroup() {
        return this.ldapgroup;
    }

    public URL getLogsUrl() {
        return this.logs;
    }

    public int getMaxHistoryFetch() {
        return this.maxhistoryfetch;
    }

    public String getName() {
        return this.name;
    }

    public int getOccupantsCount() {
        return this.occupantsCount;
    }

    public String getPubSub() {
        return this.pubsub;
    }

    public e getRoom() {
        return this.room;
    }

    public String getSubject() {
        return this.subject;
    }

    public boolean isMembersOnly() {
        return this.membersOnly;
    }

    public boolean isModerated() {
        return this.moderated;
    }

    public boolean isNonanonymous() {
        return this.nonanonymous;
    }

    public boolean isPasswordProtected() {
        return this.passwordProtected;
    }

    public boolean isPersistent() {
        return this.persistent;
    }

    public Boolean isSubjectModifiable() {
        return this.subjectmod;
    }
}
