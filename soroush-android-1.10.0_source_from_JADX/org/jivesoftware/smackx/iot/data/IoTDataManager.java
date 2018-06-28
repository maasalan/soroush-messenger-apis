package org.jivesoftware.smackx.iot.data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.b.a.f;
import org.b.a.i;
import org.jivesoftware.smack.ConnectionCreationListener;
import org.jivesoftware.smack.StanzaCollector;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPConnectionRegistry;
import org.jivesoftware.smack.filter.StanzaFilter;
import org.jivesoftware.smack.iqrequest.IQRequestHandler.Mode;
import org.jivesoftware.smack.packet.ExtensionElement;
import org.jivesoftware.smack.packet.IQ;
import org.jivesoftware.smack.packet.IQ.Type;
import org.jivesoftware.smack.packet.Message;
import org.jivesoftware.smack.packet.Stanza;
import org.jivesoftware.smackx.iot.IoTManager;
import org.jivesoftware.smackx.iot.Thing;
import org.jivesoftware.smackx.iot.data.element.IoTDataField;
import org.jivesoftware.smackx.iot.data.element.IoTDataReadOutAccepted;
import org.jivesoftware.smackx.iot.data.element.IoTDataRequest;
import org.jivesoftware.smackx.iot.data.element.IoTFieldsExtension;
import org.jivesoftware.smackx.iot.data.filter.IoTFieldsExtensionFilter;
import org.jivesoftware.smackx.iot.element.NodeInfo;

public final class IoTDataManager extends IoTManager {
    private static final Map<XMPPConnection, IoTDataManager> INSTANCES = new WeakHashMap();
    private static final Logger LOGGER = Logger.getLogger(IoTDataManager.class.getName());
    private final AtomicInteger nextSeqNr = new AtomicInteger();
    private final Map<NodeInfo, Thing> things = new ConcurrentHashMap();

    static class C79251 implements ConnectionCreationListener {
        C79251() {
        }

        public final void connectionCreated(XMPPConnection xMPPConnection) {
            if (IoTManager.isAutoEnableActive()) {
                IoTDataManager.getInstanceFor(xMPPConnection);
            }
        }
    }

    static {
        XMPPConnectionRegistry.addConnectionCreationListener(new C79251());
    }

    private IoTDataManager(XMPPConnection xMPPConnection) {
        super(xMPPConnection);
        xMPPConnection.registerIQRequestHandler(new IoTIqRequestHandler("req", "urn:xmpp:iot:sensordata", Type.get, Mode.async) {
            public IQ handleIoTIqRequest(IQ iq) {
                final IoTDataRequest ioTDataRequest = (IoTDataRequest) iq;
                if (!ioTDataRequest.isMomentary()) {
                    return null;
                }
                final Thing thing = (Thing) IoTDataManager.this.things.get(NodeInfo.EMPTY);
                if (thing == null) {
                    return null;
                }
                ThingMomentaryReadOutRequest momentaryReadOutRequestHandler = thing.getMomentaryReadOutRequestHandler();
                if (momentaryReadOutRequestHandler == null) {
                    return null;
                }
                momentaryReadOutRequestHandler.momentaryReadOutRequest(new ThingMomentaryReadOutResult() {
                    public void momentaryReadOut(List<? extends IoTDataField> list) {
                        ExtensionElement buildFor = IoTFieldsExtension.buildFor(ioTDataRequest.getSequenceNr(), true, thing.getNodeInfo(), list);
                        Stanza message = new Message(ioTDataRequest.getFrom());
                        message.addExtension(buildFor);
                        try {
                            IoTDataManager.this.connection().sendStanza(message);
                        } catch (Throwable e) {
                            Logger access$200 = IoTDataManager.LOGGER;
                            Level level = Level.SEVERE;
                            StringBuilder stringBuilder = new StringBuilder("Could not send read-out response ");
                            stringBuilder.append(message);
                            access$200.log(level, stringBuilder.toString(), e);
                        }
                    }
                });
                return new IoTDataReadOutAccepted(ioTDataRequest);
            }
        });
    }

    public static synchronized IoTDataManager getInstanceFor(XMPPConnection xMPPConnection) {
        IoTDataManager ioTDataManager;
        synchronized (IoTDataManager.class) {
            ioTDataManager = (IoTDataManager) INSTANCES.get(xMPPConnection);
            if (ioTDataManager == null) {
                ioTDataManager = new IoTDataManager(xMPPConnection);
                INSTANCES.put(xMPPConnection, ioTDataManager);
            }
        }
        return ioTDataManager;
    }

    public final void installThing(Thing thing) {
        this.things.put(thing.getNodeInfo(), thing);
    }

    public final List<IoTFieldsExtension> requestMomentaryValuesReadOut(f fVar) {
        XMPPConnection connection = connection();
        int incrementAndGet = this.nextSeqNr.incrementAndGet();
        IQ ioTDataRequest = new IoTDataRequest(incrementAndGet, true);
        ioTDataRequest.setTo((i) fVar);
        StanzaFilter ioTFieldsExtensionFilter = new IoTFieldsExtensionFilter(incrementAndGet, true);
        int i = 0;
        StanzaFilter ioTFieldsExtensionFilter2 = new IoTFieldsExtensionFilter(incrementAndGet, false);
        StanzaCollector createStanzaCollector = connection.createStanzaCollector(ioTFieldsExtensionFilter);
        StanzaCollector createStanzaCollector2 = connection.createStanzaCollector(StanzaCollector.newConfiguration().setStanzaFilter(ioTFieldsExtensionFilter2).setCollectorToReset(createStanzaCollector));
        try {
            connection.createStanzaCollectorAndSend(ioTDataRequest).nextResultOrThrow();
            createStanzaCollector.nextResult();
            int collectedCount = createStanzaCollector2.getCollectedCount();
            List<IoTFieldsExtension> arrayList = new ArrayList(collectedCount);
            while (i < collectedCount) {
                arrayList.add(IoTFieldsExtension.from((Message) createStanzaCollector2.pollResult()));
                i++;
            }
            return arrayList;
        } finally {
            createStanzaCollector2.cancel();
            createStanzaCollector.cancel();
        }
    }

    public final Thing uninstallThing(Thing thing) {
        return uninstallThing(thing.getNodeInfo());
    }

    public final Thing uninstallThing(NodeInfo nodeInfo) {
        return (Thing) this.things.remove(nodeInfo);
    }
}
