package org.jivesoftware.smackx.commands.packet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.b.a.i;
import org.jivesoftware.smack.packet.ExtensionElement;
import org.jivesoftware.smack.packet.IQ;
import org.jivesoftware.smack.packet.IQ.IQChildElementXmlStringBuilder;
import org.jivesoftware.smack.packet.IQ.Type;
import org.jivesoftware.smackx.amp.packet.AMPExtension;
import org.jivesoftware.smackx.commands.AdHocCommand.Action;
import org.jivesoftware.smackx.commands.AdHocCommand.SpecificErrorCondition;
import org.jivesoftware.smackx.commands.AdHocCommand.Status;
import org.jivesoftware.smackx.commands.AdHocCommandNote;
import org.jivesoftware.smackx.iot.data.element.NodeElement;
import org.jivesoftware.smackx.muc.packet.MUCUser;
import org.jivesoftware.smackx.xdata.packet.DataForm;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

public class AdHocCommandData extends IQ {
    public static final String ELEMENT = "command";
    public static final String NAMESPACE = "http://jabber.org/protocol/commands";
    private Action action;
    private ArrayList<Action> actions = new ArrayList();
    private Action executeAction;
    private DataForm form;
    private i id;
    private String name;
    private String node;
    private List<AdHocCommandNote> notes = new ArrayList();
    private String sessionID;
    private Status status;

    public static class SpecificError implements ExtensionElement {
        public static final String namespace = "http://jabber.org/protocol/commands";
        public SpecificErrorCondition condition;

        public SpecificError(SpecificErrorCondition specificErrorCondition) {
            this.condition = specificErrorCondition;
        }

        public SpecificErrorCondition getCondition() {
            return this.condition;
        }

        public String getElementName() {
            return this.condition.toString();
        }

        public String getNamespace() {
            return "http://jabber.org/protocol/commands";
        }

        public String toXML() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append('<');
            stringBuilder.append(getElementName());
            stringBuilder.append(" xmlns=\"");
            stringBuilder.append(getNamespace());
            stringBuilder.append("\"/>");
            return stringBuilder.toString();
        }
    }

    public AdHocCommandData() {
        super(ELEMENT, "http://jabber.org/protocol/commands");
    }

    public void addAction(Action action) {
        this.actions.add(action);
    }

    public void addNote(AdHocCommandNote adHocCommandNote) {
        this.notes.add(adHocCommandNote);
    }

    public Action getAction() {
        return this.action;
    }

    public List<Action> getActions() {
        return this.actions;
    }

    public Action getExecuteAction() {
        return this.executeAction;
    }

    public DataForm getForm() {
        return this.form;
    }

    protected IQChildElementXmlStringBuilder getIQChildElementBuilder(IQChildElementXmlStringBuilder iQChildElementXmlStringBuilder) {
        Iterator it;
        iQChildElementXmlStringBuilder.attribute(NodeElement.ELEMENT, this.node);
        iQChildElementXmlStringBuilder.optAttribute("sessionid", this.sessionID);
        iQChildElementXmlStringBuilder.optAttribute(MUCUser.Status.ELEMENT, this.status);
        iQChildElementXmlStringBuilder.optAttribute(AMPExtension.Action.ATTRIBUTE_NAME, this.action);
        iQChildElementXmlStringBuilder.rightAngleBracket();
        if (getType() == Type.result) {
            iQChildElementXmlStringBuilder.halfOpenElement("actions");
            iQChildElementXmlStringBuilder.optAttribute("execute", this.executeAction);
            if (this.actions.size() == 0) {
                iQChildElementXmlStringBuilder.closeEmptyElement();
            } else {
                iQChildElementXmlStringBuilder.rightAngleBracket();
                it = this.actions.iterator();
                while (it.hasNext()) {
                    iQChildElementXmlStringBuilder.emptyElement((Enum) (Action) it.next());
                }
                iQChildElementXmlStringBuilder.closeElement("actions");
            }
        }
        if (this.form != null) {
            iQChildElementXmlStringBuilder.append(this.form.toXML());
        }
        for (AdHocCommandNote adHocCommandNote : this.notes) {
            iQChildElementXmlStringBuilder.halfOpenElement("note").attribute(IjkMediaMeta.IJKM_KEY_TYPE, adHocCommandNote.getType().toString()).rightAngleBracket();
            iQChildElementXmlStringBuilder.append(adHocCommandNote.getValue());
            iQChildElementXmlStringBuilder.closeElement("note");
        }
        return iQChildElementXmlStringBuilder;
    }

    public i getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getNode() {
        return this.node;
    }

    public List<AdHocCommandNote> getNotes() {
        return this.notes;
    }

    public String getSessionID() {
        return this.sessionID;
    }

    public Status getStatus() {
        return this.status;
    }

    public void remveNote(AdHocCommandNote adHocCommandNote) {
        this.notes.remove(adHocCommandNote);
    }

    public void setAction(Action action) {
        this.action = action;
    }

    public void setExecuteAction(Action action) {
        this.executeAction = action;
    }

    public void setForm(DataForm dataForm) {
        this.form = dataForm;
    }

    public void setId(i iVar) {
        this.id = iVar;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setNode(String str) {
        this.node = str;
    }

    public void setSessionID(String str) {
        this.sessionID = str;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
