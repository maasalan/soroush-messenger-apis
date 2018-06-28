package org.jivesoftware.smackx.iot;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import org.jivesoftware.smackx.iot.control.ThingControlRequest;
import org.jivesoftware.smackx.iot.data.ThingMomentaryReadOutRequest;
import org.jivesoftware.smackx.iot.discovery.element.Tag;
import org.jivesoftware.smackx.iot.discovery.element.Tag.Type;
import org.jivesoftware.smackx.iot.element.NodeInfo;

public final class Thing {
    private final ThingControlRequest controlRequestHandler;
    private final HashMap<String, Tag> metaTags;
    private final ThingMomentaryReadOutRequest momentaryReadOutRequestHandler;
    private final NodeInfo nodeInfo;
    private final boolean selfOwned;
    private String toStringCache;

    public static class Builder {
        private ThingControlRequest controlRequest;
        private HashMap<String, Tag> metaTags = new HashMap();
        private ThingMomentaryReadOutRequest momentaryReadOutRequest;
        private NodeInfo nodeInfo = NodeInfo.EMPTY;
        private boolean selfOwned;

        public Thing build() {
            return new Thing();
        }

        public Builder setControlRequestHandler(ThingControlRequest thingControlRequest) {
            this.controlRequest = thingControlRequest;
            return this;
        }

        public Builder setKey(String str) {
            this.metaTags.put("KEY", new Tag("KEY", Type.str, str));
            return this;
        }

        public Builder setManufacturer(String str) {
            this.metaTags.put("MAN", new Tag("MAN", Type.str, str));
            return this;
        }

        public Builder setModel(String str) {
            this.metaTags.put("MODEL", new Tag("MODEL", Type.str, str));
            return this;
        }

        public Builder setMomentaryReadOutRequestHandler(ThingMomentaryReadOutRequest thingMomentaryReadOutRequest) {
            this.momentaryReadOutRequest = thingMomentaryReadOutRequest;
            return this;
        }

        public Builder setSerialNumber(String str) {
            this.metaTags.put("SN", new Tag("SN", Type.str, str));
            return this;
        }

        public Builder setVersion(String str) {
            this.metaTags.put("V", new Tag("V", Type.num, str));
            return this;
        }
    }

    private Thing(Builder builder) {
        this.metaTags = builder.metaTags;
        this.selfOwned = builder.selfOwned;
        this.nodeInfo = builder.nodeInfo;
        this.momentaryReadOutRequestHandler = builder.momentaryReadOutRequest;
        this.controlRequestHandler = builder.controlRequest;
    }

    public static Builder builder() {
        return new Builder();
    }

    public final String getCacheType() {
        return this.nodeInfo.getCacheType();
    }

    public final ThingControlRequest getControlRequestHandler() {
        return this.controlRequestHandler;
    }

    public final Collection<Tag> getMetaTags() {
        return this.metaTags.values();
    }

    public final ThingMomentaryReadOutRequest getMomentaryReadOutRequestHandler() {
        return this.momentaryReadOutRequestHandler;
    }

    public final String getNodeId() {
        return this.nodeInfo.getNodeId();
    }

    public final NodeInfo getNodeInfo() {
        return this.nodeInfo;
    }

    public final String getSourceId() {
        return this.nodeInfo.getSourceId();
    }

    public final boolean isSelfOwened() {
        return this.selfOwned;
    }

    public final String toString() {
        if (this.toStringCache == null) {
            StringBuilder stringBuilder = new StringBuilder();
            StringBuilder stringBuilder2 = new StringBuilder("Thing ");
            stringBuilder2.append(this.nodeInfo);
            stringBuilder2.append(" [");
            stringBuilder.append(stringBuilder2.toString());
            Iterator it = this.metaTags.values().iterator();
            while (it.hasNext()) {
                stringBuilder.append((Tag) it.next());
                if (it.hasNext()) {
                    stringBuilder.append(' ');
                }
            }
            stringBuilder.append(']');
            this.toStringCache = stringBuilder.toString();
        }
        return this.toStringCache;
    }
}
