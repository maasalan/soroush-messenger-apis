package org.jivesoftware.smack.filter;

import org.jivesoftware.smack.packet.IQ;
import org.jivesoftware.smack.packet.IQ.Type;
import org.jivesoftware.smack.util.Objects;

public final class IQTypeFilter extends FlexibleStanzaTypeFilter<IQ> {
    public static final StanzaFilter ERROR = new IQTypeFilter(Type.error);
    public static final StanzaFilter GET = new IQTypeFilter(Type.get);
    public static final StanzaFilter GET_OR_SET = new OrFilter(GET, SET);
    public static final StanzaFilter RESULT = new IQTypeFilter(Type.result);
    public static final StanzaFilter SET = new IQTypeFilter(Type.set);
    private final Type type;

    private IQTypeFilter(Type type) {
        super(IQ.class);
        this.type = (Type) Objects.requireNonNull(type, "Type must not be null");
    }

    protected final boolean acceptSpecific(IQ iq) {
        return iq.getType() == this.type;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getClass().getSimpleName());
        stringBuilder.append(": type=");
        stringBuilder.append(this.type);
        return stringBuilder.toString();
    }
}
