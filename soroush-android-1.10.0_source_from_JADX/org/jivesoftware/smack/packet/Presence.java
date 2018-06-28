package org.jivesoftware.smack.packet;

import java.util.Locale;
import org.b.a.i;
import org.jivesoftware.smack.packet.id.StanzaIdUtil;
import org.jivesoftware.smack.util.Objects;
import org.jivesoftware.smack.util.StringUtils;
import org.jivesoftware.smack.util.TypedCloneable;
import org.jivesoftware.smack.util.XmlStringBuilder;
import org.jivesoftware.smackx.muc.packet.MUCUser.Status;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

public final class Presence extends Stanza implements TypedCloneable<Presence> {
    public static final String ELEMENT = "presence";
    private Mode mode;
    private int priority;
    private String status;
    private Type type;

    public enum Mode {
        chat,
        available,
        away,
        xa,
        dnd;

        public static Mode fromString(String str) {
            return valueOf(str.toLowerCase(Locale.US));
        }
    }

    public enum Type {
        available,
        unavailable,
        subscribe,
        subscribed,
        unsubscribe,
        unsubscribed,
        error,
        probe;

        public static Type fromString(String str) {
            return valueOf(str.toLowerCase(Locale.US));
        }
    }

    public Presence(i iVar, Type type) {
        this(type);
        setTo(iVar);
    }

    public Presence(Type type) {
        this.type = Type.available;
        this.status = null;
        this.priority = Integer.MIN_VALUE;
        this.mode = null;
        setType(type);
    }

    public Presence(Type type, String str, int i, Mode mode) {
        this.type = Type.available;
        this.status = null;
        this.priority = Integer.MIN_VALUE;
        this.mode = null;
        setType(type);
        setStatus(str);
        setPriority(i);
        setMode(mode);
    }

    public Presence(Presence presence) {
        super((Stanza) presence);
        this.type = Type.available;
        this.status = null;
        this.priority = Integer.MIN_VALUE;
        this.mode = null;
        this.type = presence.type;
        this.status = presence.status;
        this.priority = presence.priority;
        this.mode = presence.mode;
    }

    public final Presence clone() {
        return new Presence(this);
    }

    public final Presence cloneWithNewId() {
        Presence clone = clone();
        clone.setStanzaId(StanzaIdUtil.newStanzaId());
        return clone;
    }

    public final Mode getMode() {
        return this.mode == null ? Mode.available : this.mode;
    }

    public final int getPriority() {
        return this.priority;
    }

    public final String getStatus() {
        return this.status;
    }

    public final Type getType() {
        return this.type;
    }

    public final boolean isAvailable() {
        return this.type == Type.available;
    }

    public final boolean isAway() {
        return this.type == Type.available && (this.mode == Mode.away || this.mode == Mode.xa || this.mode == Mode.dnd);
    }

    public final void setMode(Mode mode) {
        this.mode = mode;
    }

    public final void setPriority(int i) {
        if (i >= -128) {
            if (i <= 127) {
                this.priority = i;
                return;
            }
        }
        StringBuilder stringBuilder = new StringBuilder("Priority value ");
        stringBuilder.append(i);
        stringBuilder.append(" is not valid. Valid range is -128 through 127.");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public final void setStatus(String str) {
        this.status = str;
    }

    public final void setType(Type type) {
        this.type = (Type) Objects.requireNonNull(type, "Type cannot be null");
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Presence Stanza [");
        logCommonAttributes(stringBuilder);
        stringBuilder.append("type=");
        stringBuilder.append(this.type);
        stringBuilder.append(',');
        if (this.mode != null) {
            stringBuilder.append("mode=");
            stringBuilder.append(this.mode);
            stringBuilder.append(',');
        }
        if (!StringUtils.isNullOrEmpty(this.status)) {
            stringBuilder.append("status=");
            stringBuilder.append(this.status);
            stringBuilder.append(',');
        }
        if (this.priority != Integer.MIN_VALUE) {
            stringBuilder.append("prio=");
            stringBuilder.append(this.priority);
            stringBuilder.append(',');
        }
        stringBuilder.append(']');
        return stringBuilder.toString();
    }

    public final XmlStringBuilder toXML() {
        XmlStringBuilder xmlStringBuilder = new XmlStringBuilder();
        xmlStringBuilder.halfOpenElement(ELEMENT);
        addCommonAttributes(xmlStringBuilder);
        if (this.type != Type.available) {
            xmlStringBuilder.attribute(IjkMediaMeta.IJKM_KEY_TYPE, this.type);
        }
        xmlStringBuilder.rightAngleBracket();
        xmlStringBuilder.optElement(Status.ELEMENT, this.status);
        if (this.priority != Integer.MIN_VALUE) {
            xmlStringBuilder.element("priority", Integer.toString(this.priority));
        }
        if (!(this.mode == null || this.mode == Mode.available)) {
            xmlStringBuilder.element("show", this.mode);
        }
        xmlStringBuilder.append(getExtensionsXML());
        appendErrorIfExists(xmlStringBuilder);
        xmlStringBuilder.closeElement(ELEMENT);
        return xmlStringBuilder;
    }
}
