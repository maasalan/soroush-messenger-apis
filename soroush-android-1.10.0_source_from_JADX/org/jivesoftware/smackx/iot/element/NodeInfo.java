package org.jivesoftware.smackx.iot.element;

import org.jivesoftware.smack.util.StringUtils;
import org.jivesoftware.smack.util.XmlStringBuilder;

public final class NodeInfo {
    public static final NodeInfo EMPTY = new NodeInfo();
    private final String cacheType;
    private final String nodeId;
    private final String sourceId;

    private NodeInfo() {
        this.nodeId = null;
        this.sourceId = null;
        this.cacheType = null;
    }

    public NodeInfo(String str, String str2, String str3) {
        this.nodeId = (String) StringUtils.requireNotNullOrEmpty(str, "Node ID must not be null or empty");
        this.sourceId = str2;
        this.cacheType = str3;
    }

    public final void appendTo(XmlStringBuilder xmlStringBuilder) {
        if (this.nodeId != null) {
            xmlStringBuilder.attribute("nodeId", this.nodeId).optAttribute("sourceId", this.sourceId).optAttribute("cacheType", this.cacheType);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof NodeInfo)) {
            return false;
        }
        NodeInfo nodeInfo = (NodeInfo) obj;
        return this.nodeId.equals(nodeInfo.nodeId) && StringUtils.nullSafeCharSequenceEquals(this.sourceId, nodeInfo.sourceId) && StringUtils.nullSafeCharSequenceEquals(this.cacheType, nodeInfo.cacheType);
    }

    public final String getCacheType() {
        return this.cacheType;
    }

    public final String getNodeId() {
        return this.nodeId;
    }

    public final String getSourceId() {
        return this.sourceId;
    }

    public final int hashCode() {
        int i = 0;
        if (this == EMPTY) {
            return 0;
        }
        int hashCode = 31 * (((this.nodeId.hashCode() + 31) * 31) + (this.sourceId == null ? 0 : this.sourceId.hashCode()));
        if (this.cacheType != null) {
            i = this.cacheType.hashCode();
        }
        return hashCode + i;
    }
}
