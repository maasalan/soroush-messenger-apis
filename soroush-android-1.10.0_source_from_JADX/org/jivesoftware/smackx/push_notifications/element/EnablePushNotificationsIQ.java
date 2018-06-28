package org.jivesoftware.smackx.push_notifications.element;

import java.util.HashMap;
import java.util.Map.Entry;
import org.b.a.i;
import org.jivesoftware.smack.packet.Element;
import org.jivesoftware.smack.packet.IQ;
import org.jivesoftware.smack.packet.IQ.IQChildElementXmlStringBuilder;
import org.jivesoftware.smack.packet.IQ.Type;
import org.jivesoftware.smack.util.ParserUtils;
import org.jivesoftware.smackx.iot.data.element.NodeElement;
import org.jivesoftware.smackx.xdata.FormField;
import org.jivesoftware.smackx.xdata.packet.DataForm;

public class EnablePushNotificationsIQ extends IQ {
    public static final String ELEMENT = "enable";
    public static final String NAMESPACE = "urn:xmpp:push:0";
    private final i jid;
    private final String node;
    private final HashMap<String, String> publishOptions;

    public EnablePushNotificationsIQ(i iVar, String str) {
        this(iVar, str, null);
    }

    public EnablePushNotificationsIQ(i iVar, String str, HashMap<String, String> hashMap) {
        super("enable", "urn:xmpp:push:0");
        this.jid = iVar;
        this.node = str;
        this.publishOptions = hashMap;
        setType(Type.set);
    }

    protected IQChildElementXmlStringBuilder getIQChildElementBuilder(IQChildElementXmlStringBuilder iQChildElementXmlStringBuilder) {
        iQChildElementXmlStringBuilder.attribute(ParserUtils.JID, this.jid);
        iQChildElementXmlStringBuilder.attribute(NodeElement.ELEMENT, this.node);
        iQChildElementXmlStringBuilder.rightAngleBracket();
        if (this.publishOptions != null) {
            Element dataForm = new DataForm(DataForm.Type.form);
            FormField formField = new FormField(FormField.FORM_TYPE);
            formField.addValue("http://jabber.org/protocol/pubsub#publish-options");
            dataForm.addField(formField);
            for (Entry entry : this.publishOptions.entrySet()) {
                FormField formField2 = new FormField((String) entry.getKey());
                formField2.addValue((String) entry.getValue());
                dataForm.addField(formField2);
            }
            iQChildElementXmlStringBuilder.element(dataForm);
        }
        return iQChildElementXmlStringBuilder;
    }

    public i getJid() {
        return this.jid;
    }

    public String getNode() {
        return this.node;
    }

    public HashMap<String, String> getPublishOptions() {
        return this.publishOptions;
    }
}
