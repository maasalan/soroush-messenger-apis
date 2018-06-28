package org.jivesoftware.smackx.commands;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.b.a.i;
import org.jivesoftware.smack.ConnectionCreationListener;
import org.jivesoftware.smack.Manager;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPConnectionRegistry;
import org.jivesoftware.smack.XMPPException.XMPPErrorException;
import org.jivesoftware.smack.iqrequest.AbstractIqRequestHandler;
import org.jivesoftware.smack.iqrequest.IQRequestHandler.Mode;
import org.jivesoftware.smack.packet.IQ;
import org.jivesoftware.smack.packet.IQ.Type;
import org.jivesoftware.smack.packet.XMPPError;
import org.jivesoftware.smack.packet.XMPPError.Builder;
import org.jivesoftware.smack.packet.XMPPError.Condition;
import org.jivesoftware.smack.util.StringUtils;
import org.jivesoftware.smackx.commands.AdHocCommand.Action;
import org.jivesoftware.smackx.commands.AdHocCommand.SpecificErrorCondition;
import org.jivesoftware.smackx.commands.AdHocCommand.Status;
import org.jivesoftware.smackx.commands.packet.AdHocCommandData;
import org.jivesoftware.smackx.commands.packet.AdHocCommandData.SpecificError;
import org.jivesoftware.smackx.disco.AbstractNodeInformationProvider;
import org.jivesoftware.smackx.disco.ServiceDiscoveryManager;
import org.jivesoftware.smackx.disco.packet.DiscoverInfo.Identity;
import org.jivesoftware.smackx.disco.packet.DiscoverItems;
import org.jivesoftware.smackx.disco.packet.DiscoverItems.Item;
import org.jivesoftware.smackx.xdata.Form;

public final class AdHocCommandManager extends Manager {
    private static final Logger LOGGER = Logger.getLogger(AdHocCommandManager.class.getName());
    public static final String NAMESPACE = "http://jabber.org/protocol/commands";
    private static final int SESSION_TIMEOUT = 120;
    private static Map<XMPPConnection, AdHocCommandManager> instances = new WeakHashMap();
    private final Map<String, AdHocCommandInfo> commands = new ConcurrentHashMap();
    private final Map<String, LocalCommand> executingCommands = new ConcurrentHashMap();
    private final ServiceDiscoveryManager serviceDiscoveryManager;
    private Thread sessionsSweeper;

    class C77826 implements Runnable {
        C77826() {
        }

        public void run() {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r8 = this;
        L_0x0000:
            r0 = org.jivesoftware.smackx.commands.AdHocCommandManager.this;
            r0 = r0.executingCommands;
            r0 = r0.keySet();
            r0 = r0.iterator();
        L_0x000e:
            r1 = r0.hasNext();
            if (r1 == 0) goto L_0x0043;
        L_0x0014:
            r1 = r0.next();
            r1 = (java.lang.String) r1;
            r2 = org.jivesoftware.smackx.commands.AdHocCommandManager.this;
            r2 = r2.executingCommands;
            r2 = r2.get(r1);
            r2 = (org.jivesoftware.smackx.commands.LocalCommand) r2;
            if (r2 == 0) goto L_0x000e;
        L_0x0028:
            r2 = r2.getCreationDate();
            r4 = java.lang.System.currentTimeMillis();
            r6 = r4 - r2;
            r2 = 240000; // 0x3a980 float:3.36312E-40 double:1.18576E-318;
            r4 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1));
            if (r4 <= 0) goto L_0x000e;
        L_0x0039:
            r2 = org.jivesoftware.smackx.commands.AdHocCommandManager.this;
            r2 = r2.executingCommands;
            r2.remove(r1);
            goto L_0x000e;
        L_0x0043:
            r0 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
            java.lang.Thread.sleep(r0);	 Catch:{ InterruptedException -> 0x0000 }
            goto L_0x0000;
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smackx.commands.AdHocCommandManager.6.run():void");
        }
    }

    private static class AdHocCommandInfo {
        private LocalCommandFactory factory;
        private String name;
        private String node;
        private final i ownerJID;

        public AdHocCommandInfo(String str, String str2, i iVar, LocalCommandFactory localCommandFactory) {
            this.node = str;
            this.name = str2;
            this.ownerJID = iVar;
            this.factory = localCommandFactory;
        }

        public LocalCommand getCommandInstance() {
            return this.factory.getInstance();
        }

        public String getName() {
            return this.name;
        }

        public String getNode() {
            return this.node;
        }

        public i getOwnerJID() {
            return this.ownerJID;
        }
    }

    static class C79181 implements ConnectionCreationListener {
        C79181() {
        }

        public final void connectionCreated(XMPPConnection xMPPConnection) {
            AdHocCommandManager.getAddHocCommandsManager(xMPPConnection);
        }
    }

    class C80142 extends AbstractNodeInformationProvider {
        C80142() {
        }

        public List<Item> getNodeItems() {
            List<Item> arrayList = new ArrayList();
            for (AdHocCommandInfo adHocCommandInfo : AdHocCommandManager.this.getRegisteredCommands()) {
                Item item = new Item(adHocCommandInfo.getOwnerJID());
                item.setName(adHocCommandInfo.getName());
                item.setNode(adHocCommandInfo.getNode());
                arrayList.add(item);
            }
            return arrayList;
        }
    }

    static {
        XMPPConnectionRegistry.addConnectionCreationListener(new C79181());
    }

    private AdHocCommandManager(XMPPConnection xMPPConnection) {
        super(xMPPConnection);
        this.serviceDiscoveryManager = ServiceDiscoveryManager.getInstanceFor(xMPPConnection);
        ServiceDiscoveryManager.getInstanceFor(xMPPConnection).addFeature("http://jabber.org/protocol/commands");
        ServiceDiscoveryManager.getInstanceFor(xMPPConnection).setNodeInformationProvider("http://jabber.org/protocol/commands", new C80142());
        xMPPConnection.registerIQRequestHandler(new AbstractIqRequestHandler(AdHocCommandData.ELEMENT, "http://jabber.org/protocol/commands", Type.set, Mode.async) {
            public IQ handleIQRequest(IQ iq) {
                try {
                    return AdHocCommandManager.this.processAdHocCommand((AdHocCommandData) iq);
                } catch (Throwable e) {
                    AdHocCommandManager.LOGGER.log(Level.INFO, "processAdHocCommand threw exceptino", e);
                    return null;
                }
            }
        });
        this.sessionsSweeper = null;
    }

    public static synchronized AdHocCommandManager getAddHocCommandsManager(XMPPConnection xMPPConnection) {
        AdHocCommandManager adHocCommandManager;
        synchronized (AdHocCommandManager.class) {
            adHocCommandManager = (AdHocCommandManager) instances.get(xMPPConnection);
            if (adHocCommandManager == null) {
                adHocCommandManager = new AdHocCommandManager(xMPPConnection);
                instances.put(xMPPConnection, adHocCommandManager);
            }
        }
        return adHocCommandManager;
    }

    private Collection<AdHocCommandInfo> getRegisteredCommands() {
        return this.commands.values();
    }

    private org.jivesoftware.smackx.commands.LocalCommand newInstanceOfCmd(java.lang.String r2, java.lang.String r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r1 = this;
        r0 = r1.commands;
        r2 = r0.get(r2);
        r2 = (org.jivesoftware.smackx.commands.AdHocCommandManager.AdHocCommandInfo) r2;
        r0 = r2.getCommandInstance();	 Catch:{ InstantiationException -> 0x002a, IllegalAccessException -> 0x001e }
        r0.setSessionID(r3);	 Catch:{ InstantiationException -> 0x002a, IllegalAccessException -> 0x001e }
        r3 = r2.getName();	 Catch:{ InstantiationException -> 0x002a, IllegalAccessException -> 0x001e }
        r0.setName(r3);	 Catch:{ InstantiationException -> 0x002a, IllegalAccessException -> 0x001e }
        r2 = r2.getNode();	 Catch:{ InstantiationException -> 0x002a, IllegalAccessException -> 0x001e }
        r0.setNode(r2);	 Catch:{ InstantiationException -> 0x002a, IllegalAccessException -> 0x001e }
        return r0;
    L_0x001e:
        r2 = new org.jivesoftware.smack.XMPPException$XMPPErrorException;
        r3 = org.jivesoftware.smack.packet.XMPPError.Condition.internal_server_error;
        r3 = org.jivesoftware.smack.packet.XMPPError.getBuilder(r3);
        r2.<init>(r3);
        throw r2;
    L_0x002a:
        r2 = new org.jivesoftware.smack.XMPPException$XMPPErrorException;
        r3 = org.jivesoftware.smack.packet.XMPPError.Condition.internal_server_error;
        r3 = org.jivesoftware.smack.packet.XMPPError.getBuilder(r3);
        r2.<init>(r3);
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smackx.commands.AdHocCommandManager.newInstanceOfCmd(java.lang.String, java.lang.String):org.jivesoftware.smackx.commands.LocalCommand");
    }

    private IQ processAdHocCommand(AdHocCommandData adHocCommandData) {
        XMPPError xMPPError;
        AdHocCommandData adHocCommandData2 = new AdHocCommandData();
        adHocCommandData2.setTo(adHocCommandData.getFrom());
        adHocCommandData2.setStanzaId(adHocCommandData.getStanzaId());
        adHocCommandData2.setNode(adHocCommandData.getNode());
        adHocCommandData2.setId(adHocCommandData.getTo());
        String sessionID = adHocCommandData.getSessionID();
        String node = adHocCommandData.getNode();
        LocalCommand localCommand;
        if (sessionID != null) {
            localCommand = (LocalCommand) this.executingCommands.get(sessionID);
            if (localCommand == null) {
                return respondError(adHocCommandData2, Condition.bad_request, SpecificErrorCondition.badSessionid);
            }
            if (System.currentTimeMillis() - localCommand.getCreationDate() > 120000) {
                this.executingCommands.remove(sessionID);
                return respondError(adHocCommandData2, Condition.not_allowed, SpecificErrorCondition.sessionExpired);
            }
            synchronized (localCommand) {
                Action action = adHocCommandData.getAction();
                IQ respondError;
                if (action == null || !action.equals(Action.unknown)) {
                    if (action == null || Action.execute.equals(action)) {
                        action = localCommand.getExecuteAction();
                    }
                    if (localCommand.isValidAction(action)) {
                        try {
                            adHocCommandData2.setType(Type.result);
                            localCommand.setData(adHocCommandData2);
                            if (Action.next.equals(action)) {
                                localCommand.incrementStage();
                                localCommand.next(new Form(adHocCommandData.getForm()));
                                adHocCommandData2.setStatus(localCommand.isLastStage() ? Status.completed : Status.executing);
                            } else {
                                Map map;
                                if (Action.complete.equals(action)) {
                                    localCommand.incrementStage();
                                    localCommand.complete(new Form(adHocCommandData.getForm()));
                                    adHocCommandData2.setStatus(Status.completed);
                                    map = this.executingCommands;
                                } else if (Action.prev.equals(action)) {
                                    localCommand.decrementStage();
                                    localCommand.prev();
                                } else if (Action.cancel.equals(action)) {
                                    localCommand.cancel();
                                    adHocCommandData2.setStatus(Status.canceled);
                                    map = this.executingCommands;
                                }
                                map.remove(sessionID);
                            }
                            return adHocCommandData2;
                        } catch (XMPPErrorException e) {
                            xMPPError = e.getXMPPError();
                            if (XMPPError.Type.CANCEL.equals(xMPPError.getType())) {
                                adHocCommandData2.setStatus(Status.canceled);
                                this.executingCommands.remove(sessionID);
                            }
                            return respondError(adHocCommandData2, XMPPError.getBuilder(xMPPError));
                        }
                    }
                    respondError = respondError(adHocCommandData2, Condition.bad_request, SpecificErrorCondition.badAction);
                    return respondError;
                }
                respondError = respondError(adHocCommandData2, Condition.bad_request, SpecificErrorCondition.malformedAction);
                return respondError;
            }
        } else if (!this.commands.containsKey(node)) {
            return respondError(adHocCommandData2, Condition.item_not_found);
        } else {
            sessionID = StringUtils.randomString(15);
            try {
                localCommand = newInstanceOfCmd(node, sessionID);
                adHocCommandData2.setType(Type.result);
                localCommand.setData(adHocCommandData2);
                if (!localCommand.hasPermission(adHocCommandData.getFrom())) {
                    return respondError(adHocCommandData2, Condition.forbidden);
                }
                Action action2 = adHocCommandData.getAction();
                if (action2 != null && action2.equals(Action.unknown)) {
                    return respondError(adHocCommandData2, Condition.bad_request, SpecificErrorCondition.malformedAction);
                }
                if (action2 != null && !action2.equals(Action.execute)) {
                    return respondError(adHocCommandData2, Condition.bad_request, SpecificErrorCondition.badAction);
                }
                localCommand.incrementStage();
                localCommand.execute();
                if (localCommand.isLastStage()) {
                    adHocCommandData2.setStatus(Status.completed);
                    return adHocCommandData2;
                }
                adHocCommandData2.setStatus(Status.executing);
                this.executingCommands.put(sessionID, localCommand);
                if (this.sessionsSweeper == null) {
                    this.sessionsSweeper = new Thread(new C77826());
                    this.sessionsSweeper.setDaemon(true);
                    this.sessionsSweeper.start();
                }
                return adHocCommandData2;
            } catch (XMPPErrorException e2) {
                xMPPError = e2.getXMPPError();
                if (XMPPError.Type.CANCEL.equals(xMPPError.getType())) {
                    adHocCommandData2.setStatus(Status.canceled);
                    this.executingCommands.remove(sessionID);
                }
                return respondError(adHocCommandData2, XMPPError.getBuilder(xMPPError));
            }
        }
    }

    private static IQ respondError(AdHocCommandData adHocCommandData, Builder builder) {
        adHocCommandData.setType(Type.error);
        adHocCommandData.setError(builder);
        return adHocCommandData;
    }

    private static IQ respondError(AdHocCommandData adHocCommandData, Condition condition) {
        return respondError(adHocCommandData, XMPPError.getBuilder(condition));
    }

    private static IQ respondError(AdHocCommandData adHocCommandData, Condition condition, SpecificErrorCondition specificErrorCondition) {
        return respondError(adHocCommandData, (Builder) XMPPError.getBuilder(condition).addExtension(new SpecificError(specificErrorCondition)));
    }

    public final DiscoverItems discoverCommands(i iVar) {
        return this.serviceDiscoveryManager.discoverItems(iVar, "http://jabber.org/protocol/commands");
    }

    public final RemoteCommand getRemoteCommand(i iVar, String str) {
        return new RemoteCommand(connection(), str, iVar);
    }

    public final void publishCommands(i iVar) {
        DiscoverItems discoverItems = new DiscoverItems();
        for (AdHocCommandInfo adHocCommandInfo : getRegisteredCommands()) {
            Item item = new Item(adHocCommandInfo.getOwnerJID());
            item.setName(adHocCommandInfo.getName());
            item.setNode(adHocCommandInfo.getNode());
            discoverItems.addItem(item);
        }
        this.serviceDiscoveryManager.publishItems(iVar, "http://jabber.org/protocol/commands", discoverItems);
    }

    public final void registerCommand(String str, String str2, final Class<? extends LocalCommand> cls) {
        registerCommand(str, str2, new LocalCommandFactory() {
            public LocalCommand getInstance() {
                try {
                    return (LocalCommand) cls.getConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable e) {
                    throw new IllegalStateException(e);
                }
            }
        });
    }

    public final void registerCommand(String str, final String str2, LocalCommandFactory localCommandFactory) {
        this.commands.put(str, new AdHocCommandInfo(str, str2, connection().getUser(), localCommandFactory));
        this.serviceDiscoveryManager.setNodeInformationProvider(str, new AbstractNodeInformationProvider() {
            public List<String> getNodeFeatures() {
                List<String> arrayList = new ArrayList();
                arrayList.add("http://jabber.org/protocol/commands");
                arrayList.add("jabber:x:data");
                return arrayList;
            }

            public List<Identity> getNodeIdentities() {
                List<Identity> arrayList = new ArrayList();
                arrayList.add(new Identity("automation", str2, "command-node"));
                return arrayList;
            }
        });
    }
}
