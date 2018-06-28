package org.jivesoftware.smackx.amp.packet;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.jivesoftware.smack.packet.ExtensionElement;

public class AMPExtension implements ExtensionElement {
    public static final String ELEMENT = "amp";
    public static final String NAMESPACE = "http://jabber.org/protocol/amp";
    private final String from;
    private boolean perHop;
    private CopyOnWriteArrayList<Rule> rules;
    private final Status status;
    private final String to;

    public enum Action {
        alert,
        drop,
        error,
        notify;
        
        public static final String ATTRIBUTE_NAME = "action";
    }

    public interface Condition {
        public static final String ATTRIBUTE_NAME = "condition";

        String getName();

        String getValue();
    }

    public static class Rule {
        public static final String ELEMENT = "rule";
        private final Action action;
        private final Condition condition;

        public Rule(Action action, Condition condition) {
            if (action == null) {
                throw new NullPointerException("Can't create Rule with null action");
            } else if (condition == null) {
                throw new NullPointerException("Can't create Rule with null condition");
            } else {
                this.action = action;
                this.condition = condition;
            }
        }

        private String toXML() {
            StringBuilder stringBuilder = new StringBuilder("<rule action=\"");
            stringBuilder.append(this.action.toString());
            stringBuilder.append("\" condition=\"");
            stringBuilder.append(this.condition.getName());
            stringBuilder.append("\" value=\"");
            stringBuilder.append(this.condition.getValue());
            stringBuilder.append("\"/>");
            return stringBuilder.toString();
        }

        public Action getAction() {
            return this.action;
        }

        public Condition getCondition() {
            return this.condition;
        }
    }

    public enum Status {
        alert,
        error,
        notify
    }

    public AMPExtension() {
        this.rules = new CopyOnWriteArrayList();
        this.perHop = false;
        this.from = null;
        this.to = null;
        this.status = null;
    }

    public AMPExtension(String str, String str2, Status status) {
        this.rules = new CopyOnWriteArrayList();
        this.perHop = false;
        this.from = str;
        this.to = str2;
        this.status = status;
    }

    public void addRule(Rule rule) {
        this.rules.add(rule);
    }

    public String getElementName() {
        return ELEMENT;
    }

    public String getFrom() {
        return this.from;
    }

    public String getNamespace() {
        return NAMESPACE;
    }

    public List<Rule> getRules() {
        return Collections.unmodifiableList(this.rules);
    }

    public int getRulesCount() {
        return this.rules.size();
    }

    public Status getStatus() {
        return this.status;
    }

    public String getTo() {
        return this.to;
    }

    public synchronized boolean isPerHop() {
        return this.perHop;
    }

    public synchronized void setPerHop(boolean z) {
        this.perHop = z;
    }

    public String toXML() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('<');
        stringBuilder.append(getElementName());
        stringBuilder.append(" xmlns=\"");
        stringBuilder.append(getNamespace());
        stringBuilder.append('\"');
        if (this.status != null) {
            stringBuilder.append(" status=\"");
            stringBuilder.append(this.status.toString());
            stringBuilder.append('\"');
        }
        if (this.to != null) {
            stringBuilder.append(" to=\"");
            stringBuilder.append(this.to);
            stringBuilder.append('\"');
        }
        if (this.from != null) {
            stringBuilder.append(" from=\"");
            stringBuilder.append(this.from);
            stringBuilder.append('\"');
        }
        if (this.perHop) {
            stringBuilder.append(" per-hop=\"true\"");
        }
        stringBuilder.append('>');
        for (Rule access$000 : getRules()) {
            stringBuilder.append(access$000.toXML());
        }
        stringBuilder.append("</");
        stringBuilder.append(getElementName());
        stringBuilder.append('>');
        return stringBuilder.toString();
    }
}
