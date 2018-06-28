package org.jivesoftware.smackx.muclight;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import org.b.a.b;
import org.b.a.e;
import org.b.a.i;
import org.jivesoftware.smack.Manager;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.filter.IQReplyFilter;
import org.jivesoftware.smack.packet.IQ;
import org.jivesoftware.smack.packet.IQ.Type;
import org.jivesoftware.smack.packet.Stanza;
import org.jivesoftware.smackx.disco.ServiceDiscoveryManager;
import org.jivesoftware.smackx.disco.packet.DiscoverItems.Item;
import org.jivesoftware.smackx.muclight.element.MUCLightBlockingIQ;

public final class MultiUserChatLightManager extends Manager {
    private static final Map<XMPPConnection, MultiUserChatLightManager> INSTANCES = new WeakHashMap();
    private final Map<e, WeakReference<MultiUserChatLight>> multiUserChatLights = new HashMap();

    private MultiUserChatLightManager(XMPPConnection xMPPConnection) {
        super(xMPPConnection);
    }

    private MultiUserChatLight createNewMucLightAndAddToMap(e eVar) {
        MultiUserChatLight multiUserChatLight = new MultiUserChatLight(connection(), eVar);
        this.multiUserChatLights.put(eVar, new WeakReference(multiUserChatLight));
        return multiUserChatLight;
    }

    private MUCLightBlockingIQ getBlockingList(b bVar) {
        Stanza mUCLightBlockingIQ = new MUCLightBlockingIQ(null, null);
        mUCLightBlockingIQ.setType(Type.get);
        mUCLightBlockingIQ.setTo((i) bVar);
        return (MUCLightBlockingIQ) ((IQ) connection().createStanzaCollectorAndSend(new IQReplyFilter(mUCLightBlockingIQ, connection()), mUCLightBlockingIQ).nextResultOrThrow());
    }

    public static synchronized MultiUserChatLightManager getInstanceFor(XMPPConnection xMPPConnection) {
        MultiUserChatLightManager multiUserChatLightManager;
        synchronized (MultiUserChatLightManager.class) {
            multiUserChatLightManager = (MultiUserChatLightManager) INSTANCES.get(xMPPConnection);
            if (multiUserChatLightManager == null) {
                multiUserChatLightManager = new MultiUserChatLightManager(xMPPConnection);
                INSTANCES.put(xMPPConnection, multiUserChatLightManager);
            }
        }
        return multiUserChatLightManager;
    }

    private void sendBlockRooms(b bVar, HashMap<i, Boolean> hashMap) {
        IQ mUCLightBlockingIQ = new MUCLightBlockingIQ(hashMap, null);
        mUCLightBlockingIQ.setType(Type.set);
        mUCLightBlockingIQ.setTo((i) bVar);
        connection().createStanzaCollectorAndSend(mUCLightBlockingIQ).nextResultOrThrow();
    }

    private void sendBlockUsers(b bVar, HashMap<i, Boolean> hashMap) {
        IQ mUCLightBlockingIQ = new MUCLightBlockingIQ(null, hashMap);
        mUCLightBlockingIQ.setType(Type.set);
        mUCLightBlockingIQ.setTo((i) bVar);
        connection().createStanzaCollectorAndSend(mUCLightBlockingIQ).nextResultOrThrow();
    }

    private void sendUnblockRooms(b bVar, HashMap<i, Boolean> hashMap) {
        IQ mUCLightBlockingIQ = new MUCLightBlockingIQ(hashMap, null);
        mUCLightBlockingIQ.setType(Type.set);
        mUCLightBlockingIQ.setTo((i) bVar);
        connection().createStanzaCollectorAndSend(mUCLightBlockingIQ).nextResultOrThrow();
    }

    private void sendUnblockUsers(b bVar, HashMap<i, Boolean> hashMap) {
        IQ mUCLightBlockingIQ = new MUCLightBlockingIQ(null, hashMap);
        mUCLightBlockingIQ.setType(Type.set);
        mUCLightBlockingIQ.setTo((i) bVar);
        connection().createStanzaCollectorAndSend(mUCLightBlockingIQ).nextResultOrThrow();
    }

    public final void blockRoom(b bVar, i iVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(iVar, Boolean.valueOf(false));
        sendBlockRooms(bVar, hashMap);
    }

    public final void blockRooms(b bVar, List<i> list) {
        HashMap hashMap = new HashMap();
        for (i put : list) {
            hashMap.put(put, Boolean.valueOf(false));
        }
        sendBlockRooms(bVar, hashMap);
    }

    public final void blockUser(b bVar, i iVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(iVar, Boolean.valueOf(false));
        sendBlockUsers(bVar, hashMap);
    }

    public final void blockUsers(b bVar, List<i> list) {
        HashMap hashMap = new HashMap();
        for (i put : list) {
            hashMap.put(put, Boolean.valueOf(false));
        }
        sendBlockUsers(bVar, hashMap);
    }

    public final List<b> getLocalServices() {
        return ServiceDiscoveryManager.getInstanceFor(connection()).findServices(MultiUserChatLight.NAMESPACE, false, false);
    }

    public final synchronized MultiUserChatLight getMultiUserChatLight(e eVar) {
        WeakReference weakReference = (WeakReference) this.multiUserChatLights.get(eVar);
        if (weakReference == null) {
            return createNewMucLightAndAddToMap(eVar);
        }
        MultiUserChatLight multiUserChatLight = (MultiUserChatLight) weakReference.get();
        if (multiUserChatLight != null) {
            return multiUserChatLight;
        }
        return createNewMucLightAndAddToMap(eVar);
    }

    public final List<i> getOccupiedRooms(b bVar) {
        List<Item> items = ServiceDiscoveryManager.getInstanceFor(connection()).discoverItems(bVar).getItems();
        List<i> arrayList = new ArrayList(items.size());
        for (Item entityID : items) {
            arrayList.add(entityID.getEntityID());
        }
        return arrayList;
    }

    public final List<i> getRoomsBlocked(b bVar) {
        MUCLightBlockingIQ blockingList = getBlockingList(bVar);
        List<i> arrayList = new ArrayList();
        if (blockingList.getRooms() != null) {
            arrayList.addAll(blockingList.getRooms().keySet());
        }
        return arrayList;
    }

    public final List<i> getUsersAndRoomsBlocked(b bVar) {
        MUCLightBlockingIQ blockingList = getBlockingList(bVar);
        List<i> arrayList = new ArrayList();
        if (blockingList.getRooms() != null) {
            arrayList.addAll(blockingList.getRooms().keySet());
        }
        if (blockingList.getUsers() != null) {
            arrayList.addAll(blockingList.getUsers().keySet());
        }
        return arrayList;
    }

    public final List<i> getUsersBlocked(b bVar) {
        MUCLightBlockingIQ blockingList = getBlockingList(bVar);
        List<i> arrayList = new ArrayList();
        if (blockingList.getUsers() != null) {
            arrayList.addAll(blockingList.getUsers().keySet());
        }
        return arrayList;
    }

    public final boolean isFeatureSupported(b bVar) {
        return ServiceDiscoveryManager.getInstanceFor(connection()).discoverInfo(bVar).containsFeature(MultiUserChatLight.NAMESPACE);
    }

    public final void unblockRoom(b bVar, i iVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(iVar, Boolean.valueOf(true));
        sendUnblockRooms(bVar, hashMap);
    }

    public final void unblockRooms(b bVar, List<i> list) {
        HashMap hashMap = new HashMap();
        for (i put : list) {
            hashMap.put(put, Boolean.valueOf(true));
        }
        sendUnblockRooms(bVar, hashMap);
    }

    public final void unblockUser(b bVar, i iVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(iVar, Boolean.valueOf(true));
        sendUnblockUsers(bVar, hashMap);
    }

    public final void unblockUsers(b bVar, List<i> list) {
        HashMap hashMap = new HashMap();
        for (i put : list) {
            hashMap.put(put, Boolean.valueOf(true));
        }
        sendUnblockUsers(bVar, hashMap);
    }
}
