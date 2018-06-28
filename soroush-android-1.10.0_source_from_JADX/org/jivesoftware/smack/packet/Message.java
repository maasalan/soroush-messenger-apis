package org.jivesoftware.smack.packet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.b.a.a.d;
import org.b.a.i;
import org.jivesoftware.smack.util.TypedCloneable;
import org.jivesoftware.smack.util.XmlStringBuilder;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

public final class Message extends Stanza implements TypedCloneable<Message> {
    public static final String BODY = "body";
    public static final String ELEMENT = "message";
    private final Set<Body> bodies;
    private final Set<Subject> subjects;
    private String thread;
    private Type type;

    public static final class Body {
        private final String language;
        private final String message;

        private Body(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("Language cannot be null.");
            } else if (str2 == null) {
                throw new NullPointerException("Message cannot be null.");
            } else {
                this.language = str;
                this.message = str2;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Body body = (Body) obj;
            return this.language.equals(body.language) && this.message.equals(body.message);
        }

        public final String getLanguage() {
            return this.language;
        }

        public final String getMessage() {
            return this.message;
        }

        public final int hashCode() {
            return (31 * (this.language.hashCode() + 31)) + this.message.hashCode();
        }
    }

    public static final class Subject {
        private final String language;
        private final String subject;

        private Subject(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("Language cannot be null.");
            } else if (str2 == null) {
                throw new NullPointerException("Subject cannot be null.");
            } else {
                this.language = str;
                this.subject = str2;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Subject subject = (Subject) obj;
            return this.language.equals(subject.language) && this.subject.equals(subject.subject);
        }

        public final String getLanguage() {
            return this.language;
        }

        public final String getSubject() {
            return this.subject;
        }

        public final int hashCode() {
            return (31 * (this.language.hashCode() + 31)) + this.subject.hashCode();
        }
    }

    public enum Type {
        normal,
        chat,
        groupchat,
        headline,
        error;

        public static Type fromString(String str) {
            return valueOf(str.toLowerCase(Locale.US));
        }
    }

    public Message() {
        this.thread = null;
        this.subjects = new HashSet();
        this.bodies = new HashSet();
    }

    public Message(String str, String str2) {
        this(d.a(str), str2);
    }

    public Message(i iVar) {
        this.thread = null;
        this.subjects = new HashSet();
        this.bodies = new HashSet();
        setTo(iVar);
    }

    public Message(i iVar, String str) {
        this(iVar);
        setBody(str);
    }

    public Message(i iVar, ExtensionElement extensionElement) {
        this(iVar);
        addExtension(extensionElement);
    }

    public Message(i iVar, Type type) {
        this(iVar);
        setType(type);
    }

    public Message(Message message) {
        super((Stanza) message);
        this.thread = null;
        this.subjects = new HashSet();
        this.bodies = new HashSet();
        this.type = message.type;
        this.thread = message.thread;
        this.subjects.addAll(message.subjects);
        this.bodies.addAll(message.bodies);
    }

    private String determineLanguage(String str) {
        if ("".equals(str)) {
            str = null;
        }
        if (str == null && this.language != null) {
            return this.language;
        }
        if (str == null) {
            str = Stanza.getDefaultLanguage();
        }
        return str;
    }

    private Body getMessageBody(String str) {
        str = determineLanguage(str);
        for (Body body : this.bodies) {
            if (str.equals(body.language)) {
                return body;
            }
        }
        return null;
    }

    private Subject getMessageSubject(String str) {
        str = determineLanguage(str);
        for (Subject subject : this.subjects) {
            if (str.equals(subject.language)) {
                return subject;
            }
        }
        return null;
    }

    public final Body addBody(String str, String str2) {
        Body body = new Body(determineLanguage(str), str2);
        this.bodies.add(body);
        return body;
    }

    public final Subject addSubject(String str, String str2) {
        Subject subject = new Subject(determineLanguage(str), str2);
        this.subjects.add(subject);
        return subject;
    }

    public final Message clone() {
        return new Message(this);
    }

    public final Set<Body> getBodies() {
        return Collections.unmodifiableSet(this.bodies);
    }

    public final String getBody() {
        return getBody(null);
    }

    public final String getBody(String str) {
        Body messageBody = getMessageBody(str);
        return messageBody == null ? null : messageBody.message;
    }

    public final List<String> getBodyLanguages() {
        Body messageBody = getMessageBody(null);
        List arrayList = new ArrayList();
        for (Body body : this.bodies) {
            if (!body.equals(messageBody)) {
                arrayList.add(body.language);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final String getSubject() {
        return getSubject(null);
    }

    public final String getSubject(String str) {
        Subject messageSubject = getMessageSubject(str);
        return messageSubject == null ? null : messageSubject.subject;
    }

    public final List<String> getSubjectLanguages() {
        Subject messageSubject = getMessageSubject(null);
        List arrayList = new ArrayList();
        for (Subject subject : this.subjects) {
            if (!subject.equals(messageSubject)) {
                arrayList.add(subject.language);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final Set<Subject> getSubjects() {
        return Collections.unmodifiableSet(this.subjects);
    }

    public final String getThread() {
        return this.thread;
    }

    public final Type getType() {
        return this.type == null ? Type.normal : this.type;
    }

    public final boolean removeBody(String str) {
        str = determineLanguage(str);
        for (Body body : this.bodies) {
            if (str.equals(body.language)) {
                return this.bodies.remove(body);
            }
        }
        return false;
    }

    public final boolean removeBody(Body body) {
        return this.bodies.remove(body);
    }

    public final boolean removeSubject(String str) {
        str = determineLanguage(str);
        for (Subject subject : this.subjects) {
            if (str.equals(subject.language)) {
                return this.subjects.remove(subject);
            }
        }
        return false;
    }

    public final boolean removeSubject(Subject subject) {
        return this.subjects.remove(subject);
    }

    public final void setBody(CharSequence charSequence) {
        setBody(charSequence != null ? charSequence.toString() : null);
    }

    public final void setBody(String str) {
        if (str == null) {
            removeBody("");
        } else {
            addBody(null, str);
        }
    }

    public final void setSubject(String str) {
        if (str == null) {
            removeSubject("");
        } else {
            addSubject(null, str);
        }
    }

    public final void setThread(String str) {
        this.thread = str;
    }

    public final void setType(Type type) {
        this.type = type;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Message Stanza [");
        logCommonAttributes(stringBuilder);
        if (this.type != null) {
            stringBuilder.append("type=");
            stringBuilder.append(this.type);
            stringBuilder.append(',');
        }
        stringBuilder.append(']');
        return stringBuilder.toString();
    }

    public final XmlStringBuilder toXML() {
        XmlStringBuilder xmlStringBuilder = new XmlStringBuilder();
        xmlStringBuilder.halfOpenElement(ELEMENT);
        addCommonAttributes(xmlStringBuilder);
        xmlStringBuilder.optAttribute(IjkMediaMeta.IJKM_KEY_TYPE, this.type);
        xmlStringBuilder.rightAngleBracket();
        Subject messageSubject = getMessageSubject(null);
        if (messageSubject != null) {
            xmlStringBuilder.element("subject", messageSubject.subject);
        }
        for (Subject subject : getSubjects()) {
            if (!subject.equals(messageSubject)) {
                xmlStringBuilder.halfOpenElement("subject").xmllangAttribute(subject.language).rightAngleBracket();
                xmlStringBuilder.escape(subject.subject);
                xmlStringBuilder.closeElement("subject");
            }
        }
        Body messageBody = getMessageBody(null);
        if (messageBody != null) {
            xmlStringBuilder.element(BODY, messageBody.message);
        }
        for (Body body : getBodies()) {
            if (!body.equals(messageBody)) {
                xmlStringBuilder.halfOpenElement(BODY).xmllangAttribute(body.getLanguage()).rightAngleBracket();
                xmlStringBuilder.escape(body.getMessage());
                xmlStringBuilder.closeElement(BODY);
            }
        }
        xmlStringBuilder.optElement("thread", this.thread);
        if (this.type == Type.error) {
            appendErrorIfExists(xmlStringBuilder);
        }
        xmlStringBuilder.append(getExtensionsXML());
        xmlStringBuilder.closeElement(ELEMENT);
        return xmlStringBuilder;
    }
}
