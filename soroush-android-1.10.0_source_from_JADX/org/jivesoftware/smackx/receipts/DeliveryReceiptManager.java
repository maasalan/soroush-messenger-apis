package org.jivesoftware.smackx.receipts;

import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Logger;
import org.b.a.i;
import org.jivesoftware.smack.ConnectionCreationListener;
import org.jivesoftware.smack.Manager;
import org.jivesoftware.smack.StanzaListener;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPConnectionRegistry;
import org.jivesoftware.smack.filter.AndFilter;
import org.jivesoftware.smack.filter.MessageTypeFilter;
import org.jivesoftware.smack.filter.MessageWithBodiesFilter;
import org.jivesoftware.smack.filter.NotFilter;
import org.jivesoftware.smack.filter.StanzaExtensionFilter;
import org.jivesoftware.smack.filter.StanzaFilter;
import org.jivesoftware.smack.filter.StanzaTypeFilter;
import org.jivesoftware.smack.packet.Message;
import org.jivesoftware.smack.packet.Stanza;
import org.jivesoftware.smack.util.StringUtils;
import org.jivesoftware.smackx.disco.ServiceDiscoveryManager;

public final class DeliveryReceiptManager extends Manager {
    private static final StanzaListener AUTO_ADD_DELIVERY_RECEIPT_REQUESTS_LISTENER = new C79624();
    private static final Logger LOGGER = Logger.getLogger(DeliveryReceiptManager.class.getName());
    private static final StanzaFilter MESSAGES_TO_REQUEST_RECEIPTS_FOR = new AndFilter(MessageTypeFilter.NORMAL_OR_CHAT_OR_HEADLINE, new NotFilter(new StanzaExtensionFilter("received", DeliveryReceipt.NAMESPACE)), MessageWithBodiesFilter.INSTANCE);
    private static final StanzaFilter MESSAGES_WITH_DELIVERY_RECEIPT = new AndFilter(StanzaTypeFilter.MESSAGE, new StanzaExtensionFilter("received", DeliveryReceipt.NAMESPACE));
    private static final StanzaFilter MESSAGES_WITH_DEVLIERY_RECEIPT_REQUEST = new AndFilter(StanzaTypeFilter.MESSAGE, new StanzaExtensionFilter(new DeliveryReceiptRequest()));
    private static AutoReceiptMode defaultAutoReceiptMode = AutoReceiptMode.ifIsSubscribed;
    private static Map<XMPPConnection, DeliveryReceiptManager> instances = new WeakHashMap();
    private AutoReceiptMode autoReceiptMode = defaultAutoReceiptMode;
    private final Set<ReceiptReceivedListener> receiptReceivedListeners = new CopyOnWriteArraySet();

    public enum AutoReceiptMode {
        disabled,
        ifIsSubscribed,
        always
    }

    static class C79591 implements ConnectionCreationListener {
        C79591() {
        }

        public final void connectionCreated(XMPPConnection xMPPConnection) {
            DeliveryReceiptManager.getInstanceFor(xMPPConnection);
        }
    }

    class C79602 implements StanzaListener {
        C79602() {
        }

        public void processStanza(Stanza stanza) {
            DeliveryReceipt from = DeliveryReceipt.from((Message) stanza);
            for (ReceiptReceivedListener onReceiptReceived : DeliveryReceiptManager.this.receiptReceivedListeners) {
                onReceiptReceived.onReceiptReceived(stanza.getFrom(), stanza.getTo(), from.getId(), stanza);
            }
        }
    }

    class C79613 implements StanzaListener {
        C79613() {
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void processStanza(org.jivesoftware.smack.packet.Stanza r5) {
            /*
            r4 = this;
            r0 = r5.getFrom();
            r1 = org.jivesoftware.smackx.receipts.DeliveryReceiptManager.this;
            r1 = r1.connection();
            r2 = org.jivesoftware.smackx.receipts.DeliveryReceiptManager.C78035.f24836xc3f23bee;
            r3 = org.jivesoftware.smackx.receipts.DeliveryReceiptManager.this;
            r3 = r3.autoReceiptMode;
            r3 = r3.ordinal();
            r2 = r2[r3];
            switch(r2) {
                case 1: goto L_0x0026;
                case 2: goto L_0x001c;
                default: goto L_0x001b;
            };
        L_0x001b:
            goto L_0x0027;
        L_0x001c:
            r2 = org.jivesoftware.smack.roster.Roster.getInstanceFor(r1);
            r2 = r2.isSubscribedToMyPresence(r0);
            if (r2 != 0) goto L_0x0027;
        L_0x0026:
            return;
        L_0x0027:
            r5 = (org.jivesoftware.smack.packet.Message) r5;
            r2 = org.jivesoftware.smackx.receipts.DeliveryReceiptManager.receiptMessageFor(r5);
            if (r2 != 0) goto L_0x004d;
        L_0x002f:
            r1 = org.jivesoftware.smackx.receipts.DeliveryReceiptManager.LOGGER;
            r2 = new java.lang.StringBuilder;
            r3 = "Received message stanza with receipt request from '";
            r2.<init>(r3);
            r2.append(r0);
            r0 = "' without a stanza ID set. Message: ";
            r2.append(r0);
            r2.append(r5);
            r5 = r2.toString();
            r1.warning(r5);
            return;
        L_0x004d:
            r1.sendStanza(r2);
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smackx.receipts.DeliveryReceiptManager.3.processStanza(org.jivesoftware.smack.packet.Stanza):void");
        }
    }

    static class C79624 implements StanzaListener {
        C79624() {
        }

        public final void processStanza(Stanza stanza) {
            DeliveryReceiptRequest.addTo((Message) stanza);
        }
    }

    static {
        XMPPConnectionRegistry.addConnectionCreationListener(new C79591());
    }

    private DeliveryReceiptManager(XMPPConnection xMPPConnection) {
        super(xMPPConnection);
        ServiceDiscoveryManager.getInstanceFor(xMPPConnection).addFeature(DeliveryReceipt.NAMESPACE);
        xMPPConnection.addAsyncStanzaListener(new C79602(), MESSAGES_WITH_DELIVERY_RECEIPT);
        xMPPConnection.addAsyncStanzaListener(new C79613(), MESSAGES_WITH_DEVLIERY_RECEIPT_REQUEST);
    }

    @Deprecated
    public static String addDeliveryReceiptRequest(Message message) {
        return DeliveryReceiptRequest.addTo(message);
    }

    public static synchronized DeliveryReceiptManager getInstanceFor(XMPPConnection xMPPConnection) {
        DeliveryReceiptManager deliveryReceiptManager;
        synchronized (DeliveryReceiptManager.class) {
            deliveryReceiptManager = (DeliveryReceiptManager) instances.get(xMPPConnection);
            if (deliveryReceiptManager == null) {
                deliveryReceiptManager = new DeliveryReceiptManager(xMPPConnection);
                instances.put(xMPPConnection, deliveryReceiptManager);
            }
        }
        return deliveryReceiptManager;
    }

    public static boolean hasDeliveryReceiptRequest(Message message) {
        return DeliveryReceiptRequest.from(message) != null;
    }

    public static Message receiptMessageFor(Message message) {
        CharSequence stanzaId = message.getStanzaId();
        if (StringUtils.isNullOrEmpty(stanzaId)) {
            return null;
        }
        Message message2 = new Message(message.getFrom(), message.getType());
        message2.addExtension(new DeliveryReceipt(stanzaId));
        return message2;
    }

    public static void setDefaultAutoReceiptMode(AutoReceiptMode autoReceiptMode) {
        defaultAutoReceiptMode = autoReceiptMode;
    }

    public final void addReceiptReceivedListener(ReceiptReceivedListener receiptReceivedListener) {
        this.receiptReceivedListeners.add(receiptReceivedListener);
    }

    public final void autoAddDeliveryReceiptRequests() {
        connection().addPacketInterceptor(AUTO_ADD_DELIVERY_RECEIPT_REQUESTS_LISTENER, MESSAGES_TO_REQUEST_RECEIPTS_FOR);
    }

    public final void dontAutoAddDeliveryReceiptRequests() {
        connection().removePacketInterceptor(AUTO_ADD_DELIVERY_RECEIPT_REQUESTS_LISTENER);
    }

    public final AutoReceiptMode getAutoReceiptMode() {
        return this.autoReceiptMode;
    }

    public final boolean isSupported(i iVar) {
        return ServiceDiscoveryManager.getInstanceFor(connection()).supportsFeature(iVar, DeliveryReceipt.NAMESPACE);
    }

    public final void removeReceiptReceivedListener(ReceiptReceivedListener receiptReceivedListener) {
        this.receiptReceivedListeners.remove(receiptReceivedListener);
    }

    public final void setAutoReceiptMode(AutoReceiptMode autoReceiptMode) {
        this.autoReceiptMode = autoReceiptMode;
    }
}
