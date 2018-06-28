package org.jivesoftware.smackx.iot.discovery;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.b.a.a;
import org.jivesoftware.smack.util.Async;
import org.jivesoftware.smackx.iot.element.NodeInfo;

public class ThingState {
    private final List<ThingStateChangeListener> listeners = new CopyOnWriteArrayList();
    private final NodeInfo nodeInfo;
    private a owner;
    private a registry;
    private boolean removed;

    ThingState(NodeInfo nodeInfo) {
        this.nodeInfo = nodeInfo;
    }

    public NodeInfo getNodeInfo() {
        return this.nodeInfo;
    }

    public a getOwner() {
        return this.owner;
    }

    public a getRegistry() {
        return this.registry;
    }

    public boolean isOwned() {
        return this.owner != null;
    }

    public boolean isRemoved() {
        return this.removed;
    }

    public boolean removeThingStateChangeListener(ThingStateChangeListener thingStateChangeListener) {
        return this.listeners.remove(thingStateChangeListener);
    }

    void setOwner(final a aVar) {
        this.owner = aVar;
        Async.go(new Runnable() {
            public void run() {
                for (ThingStateChangeListener owned : ThingState.this.listeners) {
                    owned.owned(aVar);
                }
            }
        });
    }

    void setRegistry(a aVar) {
        this.registry = aVar;
    }

    void setRemoved() {
        this.removed = true;
    }

    public boolean setThingStateChangeListener(ThingStateChangeListener thingStateChangeListener) {
        return this.listeners.add(thingStateChangeListener);
    }

    void setUnowned() {
        this.owner = null;
    }

    void setUnregistered() {
        this.registry = null;
    }
}
