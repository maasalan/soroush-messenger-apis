package org.jivesoftware.smackx.iot.control;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import org.b.a.h;
import org.b.a.i;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPException.XMPPErrorException;
import org.jivesoftware.smack.iqrequest.IQRequestHandler.Mode;
import org.jivesoftware.smack.packet.IQ;
import org.jivesoftware.smack.packet.IQ.Type;
import org.jivesoftware.smackx.iot.IoTManager;
import org.jivesoftware.smackx.iot.Thing;
import org.jivesoftware.smackx.iot.control.element.IoTSetRequest;
import org.jivesoftware.smackx.iot.control.element.IoTSetResponse;
import org.jivesoftware.smackx.iot.control.element.SetData;
import org.jivesoftware.smackx.iot.element.NodeInfo;

public final class IoTControlManager extends IoTManager {
    private static final Map<XMPPConnection, IoTControlManager> INSTANCES = new WeakHashMap();
    private final Map<NodeInfo, Thing> things = new ConcurrentHashMap();

    private IoTControlManager(XMPPConnection xMPPConnection) {
        super(xMPPConnection);
        xMPPConnection.registerIQRequestHandler(new IoTIqRequestHandler("set", "urn:xmpp:iot:control", Type.set, Mode.async) {
            public IQ handleIoTIqRequest(IQ iq) {
                iq = (IoTSetRequest) iq;
                Thing thing = (Thing) IoTControlManager.this.things.get(NodeInfo.EMPTY);
                if (thing == null) {
                    return null;
                }
                ThingControlRequest controlRequestHandler = thing.getControlRequestHandler();
                if (controlRequestHandler == null) {
                    return null;
                }
                try {
                    controlRequestHandler.processRequest(iq.getFrom(), iq.getSetData());
                    return new IoTSetResponse(iq);
                } catch (XMPPErrorException e) {
                    return IQ.createErrorResponse(iq, e.getXMPPError());
                }
            }
        });
    }

    public static synchronized IoTControlManager getInstanceFor(XMPPConnection xMPPConnection) {
        IoTControlManager ioTControlManager;
        synchronized (IoTControlManager.class) {
            ioTControlManager = (IoTControlManager) INSTANCES.get(xMPPConnection);
            if (ioTControlManager == null) {
                ioTControlManager = new IoTControlManager(xMPPConnection);
                INSTANCES.put(xMPPConnection, ioTControlManager);
            }
        }
        return ioTControlManager;
    }

    public final void installThing(Thing thing) {
        this.things.put(thing.getNodeInfo(), thing);
    }

    public final IoTSetResponse setUsingIq(h hVar, Collection<? extends SetData> collection) {
        IQ ioTSetRequest = new IoTSetRequest(collection);
        ioTSetRequest.setTo((i) hVar);
        return (IoTSetResponse) connection().createStanzaCollectorAndSend(ioTSetRequest).nextResultOrThrow();
    }

    public final IoTSetResponse setUsingIq(h hVar, SetData setData) {
        return setUsingIq(hVar, Collections.singleton(setData));
    }

    public final Thing uninstallThing(Thing thing) {
        return uninstallThing(thing.getNodeInfo());
    }

    public final Thing uninstallThing(NodeInfo nodeInfo) {
        return (Thing) this.things.remove(nodeInfo);
    }
}
