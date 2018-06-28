package org.jivesoftware.smackx.muc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.b.a.c.a;
import org.b.a.i;
import org.jivesoftware.smack.util.StringUtils;
import org.jivesoftware.smackx.muc.MultiUserChatException.MucConfigurationNotSupportedException;
import org.jivesoftware.smackx.xdata.Form;
import org.jivesoftware.smackx.xdata.FormField;
import org.jivesoftware.smackx.xdata.FormField.Type;

public class MucConfigFormManager {
    public static final String MUC_ROOMCONFIG_MEMBERSONLY = "muc#roomconfig_membersonly";
    public static final String MUC_ROOMCONFIG_PASSWORDPROTECTEDROOM = "muc#roomconfig_passwordprotectedroom";
    public static final String MUC_ROOMCONFIG_ROOMOWNERS = "muc#roomconfig_roomowners";
    public static final String MUC_ROOMCONFIG_ROOMSECRET = "muc#roomconfig_roomsecret";
    private final Form answerForm;
    private final MultiUserChat multiUserChat;
    private final List<i> owners;

    MucConfigFormManager(MultiUserChat multiUserChat) {
        this.multiUserChat = multiUserChat;
        Form configurationForm = multiUserChat.getConfigurationForm();
        this.answerForm = configurationForm.createAnswerForm();
        for (FormField formField : configurationForm.getFields()) {
            if (!(formField.getType() == Type.hidden || StringUtils.isNullOrEmpty(formField.getVariable()))) {
                this.answerForm.setDefaultAnswer(formField.getVariable());
            }
        }
        if (this.answerForm.hasField(MUC_ROOMCONFIG_ROOMOWNERS)) {
            Collection values = this.answerForm.getField(MUC_ROOMCONFIG_ROOMOWNERS).getValues();
            this.owners = new ArrayList(values.size());
            a.a(values, this.owners);
            return;
        }
        this.owners = null;
    }

    public MucConfigFormManager makeMembersOnly() {
        return setMembersOnly(true);
    }

    public MucConfigFormManager makePasswordProtected() {
        return setIsPasswordProtected(true);
    }

    public MucConfigFormManager setAndEnablePassword(String str) {
        return setIsPasswordProtected(true).setRoomSecret(str);
    }

    public MucConfigFormManager setIsPasswordProtected(boolean z) {
        if (supportsMembersOnly()) {
            this.answerForm.setAnswer(MUC_ROOMCONFIG_PASSWORDPROTECTEDROOM, z);
            return this;
        }
        throw new MucConfigurationNotSupportedException(MUC_ROOMCONFIG_PASSWORDPROTECTEDROOM);
    }

    public MucConfigFormManager setMembersOnly(boolean z) {
        if (supportsMembersOnly()) {
            this.answerForm.setAnswer(MUC_ROOMCONFIG_MEMBERSONLY, z);
            return this;
        }
        throw new MucConfigurationNotSupportedException(MUC_ROOMCONFIG_MEMBERSONLY);
    }

    public MucConfigFormManager setRoomOwners(Collection<? extends i> collection) {
        if (supportsRoomOwners()) {
            this.owners.clear();
            this.owners.addAll(collection);
            return this;
        }
        throw new MucConfigurationNotSupportedException(MUC_ROOMCONFIG_ROOMOWNERS);
    }

    public MucConfigFormManager setRoomSecret(String str) {
        if (this.answerForm.hasField(MUC_ROOMCONFIG_ROOMSECRET)) {
            this.answerForm.setAnswer(MUC_ROOMCONFIG_ROOMSECRET, str);
            return this;
        }
        throw new MucConfigurationNotSupportedException(MUC_ROOMCONFIG_ROOMSECRET);
    }

    public void submitConfigurationForm() {
        if (this.owners != null) {
            this.answerForm.setAnswer(MUC_ROOMCONFIG_ROOMOWNERS, a.a(this.owners));
        }
        this.multiUserChat.sendConfigurationForm(this.answerForm);
    }

    public boolean supportsMembersOnly() {
        return this.answerForm.hasField(MUC_ROOMCONFIG_MEMBERSONLY);
    }

    public boolean supportsPasswordProtected() {
        return this.answerForm.hasField(MUC_ROOMCONFIG_PASSWORDPROTECTEDROOM);
    }

    public boolean supportsRoomOwners() {
        return this.owners != null;
    }
}
