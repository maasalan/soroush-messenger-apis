package org.jivesoftware.smackx.iot.discovery;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.b.a.a;
import org.b.a.i;
import org.jivesoftware.smack.ConnectionCreationListener;
import org.jivesoftware.smack.Manager;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPConnectionRegistry;
import org.jivesoftware.smack.iqrequest.AbstractIqRequestHandler;
import org.jivesoftware.smack.iqrequest.IQRequestHandler.Mode;
import org.jivesoftware.smack.packet.IQ;
import org.jivesoftware.smack.packet.IQ.Type;
import org.jivesoftware.smack.util.Objects;
import org.jivesoftware.smackx.disco.ServiceDiscoveryManager;
import org.jivesoftware.smackx.disco.packet.DiscoverInfo;
import org.jivesoftware.smackx.iot.IoTManager;
import org.jivesoftware.smackx.iot.Thing;
import org.jivesoftware.smackx.iot.control.IoTControlManager;
import org.jivesoftware.smackx.iot.data.IoTDataManager;
import org.jivesoftware.smackx.iot.discovery.element.IoTClaimed;
import org.jivesoftware.smackx.iot.discovery.element.IoTDisown;
import org.jivesoftware.smackx.iot.discovery.element.IoTDisowned;
import org.jivesoftware.smackx.iot.discovery.element.IoTMine;
import org.jivesoftware.smackx.iot.discovery.element.IoTRegister;
import org.jivesoftware.smackx.iot.discovery.element.IoTRemove;
import org.jivesoftware.smackx.iot.discovery.element.IoTRemoved;
import org.jivesoftware.smackx.iot.discovery.element.IoTUnregister;
import org.jivesoftware.smackx.iot.discovery.element.Tag;
import org.jivesoftware.smackx.iot.element.NodeInfo;
import org.jivesoftware.smackx.iot.provisioning.IoTProvisioningManager;

public final class IoTDiscoveryManager extends Manager {
    private static final Map<XMPPConnection, IoTDiscoveryManager> INSTANCES = new WeakHashMap();
    private static final Logger LOGGER = Logger.getLogger(IoTDiscoveryManager.class.getName());
    private i preconfiguredRegistry;
    private final Map<NodeInfo, ThingState> things = new HashMap();
    private final Set<i> usedRegistries = new HashSet();

    static class C79271 implements ConnectionCreationListener {
        C79271() {
        }

        public final void connectionCreated(XMPPConnection xMPPConnection) {
            if (IoTManager.isAutoEnableActive()) {
                IoTDiscoveryManager.getInstanceFor(xMPPConnection);
            }
        }
    }

    static {
        XMPPConnectionRegistry.addConnectionCreationListener(new C79271());
    }

    private IoTDiscoveryManager(XMPPConnection xMPPConnection) {
        super(xMPPConnection);
        xMPPConnection.registerIQRequestHandler(new AbstractIqRequestHandler(IoTClaimed.ELEMENT, "urn:xmpp:iot:discovery", Type.set, Mode.sync) {
            public IQ handleIQRequest(IQ iq) {
                if (IoTDiscoveryManager.this.isRegistry(iq.getFrom())) {
                    IoTClaimed ioTClaimed = (IoTClaimed) iq;
                    i jid = ioTClaimed.getJid();
                    IoTDiscoveryManager.this.getStateFor(ioTClaimed.getNodeInfo()).setOwner(jid.m());
                    Logger access$000 = IoTDiscoveryManager.LOGGER;
                    StringBuilder stringBuilder = new StringBuilder("Our thing got claimed by ");
                    stringBuilder.append(jid);
                    stringBuilder.append(". ");
                    stringBuilder.append(ioTClaimed);
                    access$000.info(stringBuilder.toString());
                    try {
                        IoTProvisioningManager.getInstanceFor(IoTDiscoveryManager.this.connection()).sendFriendshipRequest(jid.m());
                    } catch (Throwable e) {
                        IoTDiscoveryManager.LOGGER.log(Level.WARNING, "Could not friendship owner", e);
                    }
                    return IQ.createResultIQ(iq);
                }
                Logger access$0002 = IoTDiscoveryManager.LOGGER;
                Level level = Level.SEVERE;
                StringBuilder stringBuilder2 = new StringBuilder("Received control stanza from non-registry entity: ");
                stringBuilder2.append(iq);
                access$0002.log(level, stringBuilder2.toString());
                return null;
            }
        });
        xMPPConnection.registerIQRequestHandler(new AbstractIqRequestHandler("disown", "urn:xmpp:iot:discovery", Type.set, Mode.sync) {
            public IQ handleIQRequest(IQ iq) {
                if (IoTDiscoveryManager.this.isRegistry(iq.getFrom())) {
                    IoTDisowned ioTDisowned = (IoTDisowned) iq;
                    i from = iq.getFrom();
                    NodeInfo nodeInfo = ioTDisowned.getNodeInfo();
                    ThingState access$100 = IoTDiscoveryManager.this.getStateFor(nodeInfo);
                    if (from.a(access$100.getRegistry())) {
                        if (access$100.isOwned()) {
                            access$100.setUnowned();
                        } else {
                            Logger access$000 = IoTDiscoveryManager.LOGGER;
                            StringBuilder stringBuilder = new StringBuilder("Received <disowned/> for ");
                            stringBuilder.append(nodeInfo);
                            stringBuilder.append(" but thing was not owned.");
                            access$000.fine(stringBuilder.toString());
                        }
                        return IQ.createResultIQ(iq);
                    }
                    Logger access$0002 = IoTDiscoveryManager.LOGGER;
                    StringBuilder stringBuilder2 = new StringBuilder("Received <disowned/> for ");
                    stringBuilder2.append(nodeInfo);
                    stringBuilder2.append(" from ");
                    stringBuilder2.append(from);
                    stringBuilder2.append(" but this is not the registry ");
                    stringBuilder2.append(access$100.getRegistry());
                    stringBuilder2.append(" of the thing.");
                    access$0002.severe(stringBuilder2.toString());
                    return null;
                }
                Logger access$0003 = IoTDiscoveryManager.LOGGER;
                Level level = Level.SEVERE;
                StringBuilder stringBuilder3 = new StringBuilder("Received control stanza from non-registry entity: ");
                stringBuilder3.append(iq);
                access$0003.log(level, stringBuilder3.toString());
                return null;
            }
        });
        xMPPConnection.registerIQRequestHandler(new AbstractIqRequestHandler(IoTRemoved.ELEMENT, "urn:xmpp:iot:discovery", Type.set, Mode.async) {
            public IQ handleIQRequest(IQ iq) {
                if (IoTDiscoveryManager.this.isRegistry(iq.getFrom())) {
                    IoTRemoved ioTRemoved = (IoTRemoved) iq;
                    IoTDiscoveryManager.this.getStateFor(ioTRemoved.getNodeInfo()).setRemoved();
                    try {
                        IoTProvisioningManager.getInstanceFor(IoTDiscoveryManager.this.connection()).unfriend(ioTRemoved.getFrom());
                    } catch (Throwable e) {
                        IoTDiscoveryManager.LOGGER.log(Level.SEVERE, "Could not unfriend registry after <removed/>", e);
                    }
                    return IQ.createResultIQ(iq);
                }
                Logger access$000 = IoTDiscoveryManager.LOGGER;
                Level level = Level.SEVERE;
                StringBuilder stringBuilder = new StringBuilder("Received control stanza from non-registry entity: ");
                stringBuilder.append(iq);
                access$000.log(level, stringBuilder.toString());
                return null;
            }
        });
    }

    public static synchronized IoTDiscoveryManager getInstanceFor(XMPPConnection xMPPConnection) {
        IoTDiscoveryManager ioTDiscoveryManager;
        synchronized (IoTDiscoveryManager.class) {
            ioTDiscoveryManager = (IoTDiscoveryManager) INSTANCES.get(xMPPConnection);
            if (ioTDiscoveryManager == null) {
                ioTDiscoveryManager = new IoTDiscoveryManager(xMPPConnection);
                INSTANCES.put(xMPPConnection, ioTDiscoveryManager);
            }
        }
        return ioTDiscoveryManager;
    }

    private ThingState getStateFor(NodeInfo nodeInfo) {
        ThingState thingState = (ThingState) this.things.get(nodeInfo);
        if (thingState != null) {
            return thingState;
        }
        thingState = new ThingState(nodeInfo);
        this.things.put(nodeInfo, thingState);
        return thingState;
    }

    private void interactWithRegistry(i iVar) {
        if (this.usedRegistries.add(iVar)) {
            IoTProvisioningManager.getInstanceFor(connection()).sendFriendshipRequestIfRequired(iVar.m());
        }
    }

    public final IoTClaimed claimThing(Collection<Tag> collection) {
        return claimThing(collection, true);
    }

    public final IoTClaimed claimThing(Collection<Tag> collection, boolean z) {
        return claimThing(findRegistry(), collection, z);
    }

    public final IoTClaimed claimThing(i iVar, Collection<Tag> collection, boolean z) {
        interactWithRegistry(iVar);
        IQ ioTMine = new IoTMine((Collection) collection, z);
        ioTMine.setTo(iVar);
        IoTClaimed ioTClaimed = (IoTClaimed) connection().createStanzaCollectorAndSend(ioTMine).nextResultOrThrow();
        IoTProvisioningManager.getInstanceFor(connection()).sendFriendshipRequest(ioTClaimed.getJid().m());
        return ioTClaimed;
    }

    public final void disownThing(i iVar) {
        disownThing(iVar, NodeInfo.EMPTY);
    }

    public final void disownThing(i iVar, i iVar2, NodeInfo nodeInfo) {
        interactWithRegistry(iVar);
        IQ ioTDisown = new IoTDisown(iVar2, nodeInfo);
        ioTDisown.setTo(iVar);
        connection().createStanzaCollectorAndSend(ioTDisown).nextResultOrThrow();
    }

    public final void disownThing(i iVar, NodeInfo nodeInfo) {
        disownThing(findRegistry(), iVar, nodeInfo);
    }

    public final i findRegistry() {
        if (this.preconfiguredRegistry != null) {
            return this.preconfiguredRegistry;
        }
        List findServicesDiscoverInfo = ServiceDiscoveryManager.getInstanceFor(connection()).findServicesDiscoverInfo("urn:xmpp:iot:discovery", true, true);
        return !findServicesDiscoverInfo.isEmpty() ? ((DiscoverInfo) findServicesDiscoverInfo.get(0)).getFrom() : null;
    }

    public final ThingState getStateFor(Thing thing) {
        return (ThingState) this.things.get(thing.getNodeInfo());
    }

    public final boolean isRegistry(a aVar) {
        Objects.requireNonNull(aVar, "JID argument must not be null");
        return aVar.a(findRegistry()) || this.usedRegistries.contains(aVar);
    }

    public final boolean isRegistry(i iVar) {
        try {
            return isRegistry(iVar.m());
        } catch (Throwable e) {
            Logger logger = LOGGER;
            Level level = Level.WARNING;
            StringBuilder stringBuilder = new StringBuilder("Could not determine if ");
            stringBuilder.append(iVar);
            stringBuilder.append(" is a registry");
            logger.log(level, stringBuilder.toString(), e);
            return false;
        }
    }

    public final ThingState registerThing(i iVar, Thing thing) {
        XMPPConnection connection = connection();
        IQ ioTRegister = new IoTRegister(thing.getMetaTags(), thing.getNodeInfo(), thing.isSelfOwened());
        ioTRegister.setTo(iVar);
        ioTRegister = (IQ) connection.createStanzaCollectorAndSend(ioTRegister).nextResultOrThrow();
        if (ioTRegister instanceof IoTClaimed) {
            throw new IoTClaimedException((IoTClaimed) ioTRegister);
        }
        ThingState stateFor = getStateFor(thing.getNodeInfo());
        stateFor.setRegistry(iVar.m());
        interactWithRegistry(iVar);
        IoTDataManager.getInstanceFor(connection).installThing(thing);
        IoTControlManager.getInstanceFor(connection).installThing(thing);
        return stateFor;
    }

    public final ThingState registerThing(Thing thing) {
        return registerThing(findRegistry(), thing);
    }

    public final void removeThing(a aVar) {
        removeThing(aVar, NodeInfo.EMPTY);
    }

    public final void removeThing(a aVar, NodeInfo nodeInfo) {
        removeThing(findRegistry(), aVar, nodeInfo);
    }

    public final void removeThing(i iVar, a aVar, NodeInfo nodeInfo) {
        interactWithRegistry(iVar);
        IQ ioTRemove = new IoTRemove(aVar, nodeInfo);
        ioTRemove.setTo(iVar);
        connection().createStanzaCollectorAndSend(ioTRemove).nextResultOrThrow();
    }

    public final void unregister() {
        unregister(NodeInfo.EMPTY);
    }

    public final void unregister(i iVar, NodeInfo nodeInfo) {
        interactWithRegistry(iVar);
        IQ ioTUnregister = new IoTUnregister(nodeInfo);
        ioTUnregister.setTo(iVar);
        connection().createStanzaCollectorAndSend(ioTUnregister).nextResultOrThrow();
        getStateFor(nodeInfo).setUnregistered();
        XMPPConnection connection = connection();
        IoTDataManager.getInstanceFor(connection).uninstallThing(nodeInfo);
        IoTControlManager.getInstanceFor(connection).uninstallThing(nodeInfo);
    }

    public final void unregister(NodeInfo nodeInfo) {
        unregister(findRegistry(), nodeInfo);
    }
}
