package org.jivesoftware.smackx.commands;

import java.util.List;
import org.b.a.i;
import org.jivesoftware.smack.packet.XMPPError;
import org.jivesoftware.smackx.commands.packet.AdHocCommandData;
import org.jivesoftware.smackx.xdata.Form;

public abstract class AdHocCommand {
    private AdHocCommandData data = new AdHocCommandData();

    public enum Action {
        execute,
        cancel,
        prev,
        next,
        complete,
        unknown
    }

    public enum SpecificErrorCondition {
        badAction("bad-action"),
        malformedAction("malformed-action"),
        badLocale("bad-locale"),
        badPayload("bad-payload"),
        badSessionid("bad-sessionid"),
        sessionExpired("session-expired");
        
        private final String value;

        private SpecificErrorCondition(String str) {
            this.value = str;
        }

        public final String toString() {
            return this.value;
        }
    }

    public enum Status {
        executing,
        completed,
        canceled
    }

    public static SpecificErrorCondition getSpecificErrorCondition(XMPPError xMPPError) {
        for (SpecificErrorCondition specificErrorCondition : SpecificErrorCondition.values()) {
            if (xMPPError.getExtension(specificErrorCondition.toString(), "http://jabber.org/protocol/commands") != null) {
                return specificErrorCondition;
            }
        }
        return null;
    }

    protected void addActionAvailable(Action action) {
        this.data.addAction(action);
    }

    protected void addNote(AdHocCommandNote adHocCommandNote) {
        this.data.addNote(adHocCommandNote);
    }

    public abstract void cancel();

    public abstract void complete(Form form);

    public abstract void execute();

    protected List<Action> getActions() {
        return this.data.getActions();
    }

    AdHocCommandData getData() {
        return this.data;
    }

    protected Action getExecuteAction() {
        return this.data.getExecuteAction();
    }

    public Form getForm() {
        return this.data.getForm() == null ? null : new Form(this.data.getForm());
    }

    public String getName() {
        return this.data.getName();
    }

    public String getNode() {
        return this.data.getNode();
    }

    public List<AdHocCommandNote> getNotes() {
        return this.data.getNotes();
    }

    public abstract i getOwnerJID();

    public String getRaw() {
        return this.data.getChildElementXML().toString();
    }

    public Status getStatus() {
        return this.data.getStatus();
    }

    public boolean isCompleted() {
        return getStatus() == Status.completed;
    }

    protected boolean isValidAction(Action action) {
        if (!getActions().contains(action)) {
            if (!Action.cancel.equals(action)) {
                return false;
            }
        }
        return true;
    }

    public abstract void next(Form form);

    public abstract void prev();

    void setData(AdHocCommandData adHocCommandData) {
        this.data = adHocCommandData;
    }

    protected void setExecuteAction(Action action) {
        this.data.setExecuteAction(action);
    }

    protected void setForm(Form form) {
        this.data.setForm(form.getDataFormToSend());
    }

    public void setName(String str) {
        this.data.setName(str);
    }

    public void setNode(String str) {
        this.data.setNode(str);
    }
}
