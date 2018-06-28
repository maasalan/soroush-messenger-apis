package org.jivesoftware.smackx.mam.element;

import org.jivesoftware.smack.packet.IQ;
import org.jivesoftware.smack.packet.IQ.IQChildElementXmlStringBuilder;
import org.jivesoftware.smack.packet.IQ.Type;
import org.jivesoftware.smackx.iot.data.element.NodeElement;
import org.jivesoftware.smackx.xdata.FormField;
import org.jivesoftware.smackx.xdata.packet.DataForm;

public class MamQueryIQ extends IQ {
    public static final String ELEMENT = "query";
    public static final String NAMESPACE = "urn:xmpp:mam:1";
    private final DataForm dataForm;
    private final String node;
    private final String queryId;

    public MamQueryIQ(String str) {
        this(str, null, null);
        setType(Type.get);
    }

    public MamQueryIQ(String str, String str2, DataForm dataForm) {
        super("query", "urn:xmpp:mam:1");
        this.queryId = str;
        this.node = str2;
        this.dataForm = dataForm;
        if (dataForm != null) {
            FormField hiddenFormTypeField = dataForm.getHiddenFormTypeField();
            if (hiddenFormTypeField == null) {
                throw new IllegalArgumentException("If a data form is given it must posses a hidden form type field");
            } else if (((String) hiddenFormTypeField.getValues().get(0)).equals("urn:xmpp:mam:1")) {
                addExtension(dataForm);
            } else {
                throw new IllegalArgumentException("Value of the hidden form type field must be 'urn:xmpp:mam:1'");
            }
        }
    }

    public MamQueryIQ(String str, DataForm dataForm) {
        this(str, null, dataForm);
    }

    public MamQueryIQ(DataForm dataForm) {
        this(null, null, dataForm);
    }

    public DataForm getDataForm() {
        return this.dataForm;
    }

    protected IQChildElementXmlStringBuilder getIQChildElementBuilder(IQChildElementXmlStringBuilder iQChildElementXmlStringBuilder) {
        iQChildElementXmlStringBuilder.optAttribute("queryid", this.queryId);
        iQChildElementXmlStringBuilder.optAttribute(NodeElement.ELEMENT, this.node);
        iQChildElementXmlStringBuilder.rightAngleBracket();
        return iQChildElementXmlStringBuilder;
    }

    public String getNode() {
        return this.node;
    }

    public String getQueryId() {
        return this.queryId;
    }
}
