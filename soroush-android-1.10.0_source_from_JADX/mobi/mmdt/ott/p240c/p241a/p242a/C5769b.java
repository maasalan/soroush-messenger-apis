package mobi.mmdt.ott.p240c.p241a.p242a;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import org.jivesoftware.smack.StanzaListener;
import org.jivesoftware.smack.chat2.Chat;
import org.jivesoftware.smack.chat2.ChatManager;
import org.jivesoftware.smack.chat2.IncomingChatMessageListener;
import org.jivesoftware.smack.chat2.OutgoingChatMessageListener;
import org.jivesoftware.smack.packet.ExtensionElement;
import org.jivesoftware.smack.packet.Message;
import org.jivesoftware.smack.packet.Message.Body;
import org.jivesoftware.smack.packet.Message.Type;
import org.jivesoftware.smack.packet.Stanza;
import org.jivesoftware.smack.tcp.XMPPTCPConnection;
import org.jivesoftware.smackx.carbons.packet.CarbonExtension;
import org.jivesoftware.smackx.chatstates.ChatState;
import org.jivesoftware.smackx.chatstates.packet.ChatStateExtension;
import org.jivesoftware.smackx.receipts.DeliveryReceiptManager;
import org.jivesoftware.smackx.receipts.ReceiptReceivedListener;
import org.p501b.p502a.C4614i;
import org.p501b.p502a.C7005e;
import org.p501b.p502a.p503a.C4611d;
import org.p501b.p506b.C4617c;

public final class C5769b implements IncomingChatMessageListener, OutgoingChatMessageListener, ReceiptReceivedListener {
    public XMPPTCPConnection f15925a;
    public ChatManager f15926b;
    public DeliveryReceiptManager f15927c;
    private final Map<Chat, ChatState> f15928d = new WeakHashMap();
    private C2510a f15929e;

    static /* synthetic */ class C25112 {
        static final /* synthetic */ int[] f8194a = new int[Type.values().length];

        static {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r0 = org.jivesoftware.smack.packet.Message.Type.values();
            r0 = r0.length;
            r0 = new int[r0];
            f8194a = r0;
            r0 = f8194a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = org.jivesoftware.smack.packet.Message.Type.chat;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = f8194a;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = org.jivesoftware.smack.packet.Message.Type.error;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;	 Catch:{ NoSuchFieldError -> 0x001f }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = f8194a;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = org.jivesoftware.smack.packet.Message.Type.groupchat;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;	 Catch:{ NoSuchFieldError -> 0x002a }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r0 = f8194a;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = org.jivesoftware.smack.packet.Message.Type.headline;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r2 = 4;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            r0 = f8194a;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r1 = org.jivesoftware.smack.packet.Message.Type.normal;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0040 }
            r2 = 5;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0040 }
        L_0x0040:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.c.a.a.b.2.<clinit>():void");
        }
    }

    class C57681 implements StanzaListener {
        final /* synthetic */ C5769b f15924a;

        public C57681(C5769b c5769b) {
            this.f15924a = c5769b;
        }

        public final void processStanza(Stanza stanza) {
            Message message = (Message) stanza;
            if (message.getExtensions() != null && message.getExtensions().size() > 0 && (message.getExtensions().get(0) instanceof CarbonExtension)) {
                C2480b.m6742f("carbon message");
                message = (Message) ((CarbonExtension) message.getExtensions().get(0)).getForwarded().getForwardedStanza();
            }
            C4614i from = message.getFrom();
            if (!from.mo3471d().toString().endsWith("api.soroush")) {
                if (!from.mo3471d().toString().endsWith("bot.soroush")) {
                    C7005e b = from.mo2461q().mo3482b();
                    Chat chatWith = this.f15924a.f15926b.chatWith(b);
                    C2480b.m6742f("MyGroupManager sendMessage processStanza");
                    this.f15924a.newIncomingMessage(b, message, chatWith);
                    return;
                }
            }
            Collection<Body> bodies = message.getBodies();
            Map hashMap = new HashMap();
            for (Body body : bodies) {
                hashMap.put(body.getLanguage(), body.getMessage());
            }
            this.f15924a.f15929e.mo2161c(message.getFrom().toString(), message.getBody(), message.getStanzaId(), hashMap);
        }
    }

    public C5769b(C2510a c2510a) {
        this.f15929e = c2510a;
    }

    public static C7005e m12963a(String str) {
        try {
            return (C7005e) C4611d.m8363a(str);
        } catch (C4617c e) {
            e.printStackTrace();
            return null;
        }
    }

    private synchronized boolean m12964a(Chat chat, ChatState chatState) {
        boolean z;
        if (((ChatState) this.f15928d.get(chat)) != chatState) {
            this.f15928d.put(chat, chatState);
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    private Chat m12965b(String str) {
        return this.f15926b.chatWith(C5769b.m12963a(str));
    }

    public final String m12967a(String str, String str2, String str3, Map<String, String> map) {
        StringBuilder stringBuilder = new StringBuilder("MyGroupManager sendMessage ");
        stringBuilder.append(str2);
        C2480b.m6742f(stringBuilder.toString());
        Message message = new Message();
        message.setBody(str2);
        if (str3 != null) {
            message.setStanzaId(str3);
        }
        for (String str4 : map.keySet()) {
            String str5 = (String) map.get(str4);
            if (str5 != null) {
                message.addBody(str4, str5);
            }
        }
        message.setType(Type.chat);
        StringBuilder stringBuilder2 = new StringBuilder("sendMessage to:");
        stringBuilder2.append(str);
        stringBuilder2.append(", message:");
        stringBuilder2.append(str2);
        stringBuilder2.append(",");
        stringBuilder2.append(str3);
        C2480b.m6742f(stringBuilder2.toString());
        m12965b(str).send(message);
        return message.getStanzaId();
    }

    public final void m12968a(ChatState chatState, String str) {
        C2480b.m6742f("MyGroupManager setChatState ");
        Chat b = m12965b(str);
        if (b != null) {
            if (chatState != null) {
                if (m12964a(b, chatState)) {
                    Message message = new Message();
                    message.addExtension(new ChatStateExtension(chatState));
                    message.setType(Type.chat);
                    b.send(message);
                    return;
                }
                return;
            }
        }
        throw new IllegalArgumentException("Arguments cannot be null.");
    }

    public final void newIncomingMessage(C7005e c7005e, Message message, Chat chat) {
        String str;
        StringBuilder stringBuilder = new StringBuilder("MyGroupManager newIncomingMessage ");
        stringBuilder.append(message.toString());
        C2480b.m6742f(stringBuilder.toString());
        switch (C25112.f8194a[message.getType().ordinal()]) {
            case 1:
                C2480b.m6742f("newIncomingMessage chat");
                ExtensionElement extension = message.getExtension("http://jabber.org/protocol/chatstates");
                if (extension != null) {
                    C2480b.m6742f("newIncomingMessage (extension != null)");
                    this.f15929e.mo2151a(ChatState.valueOf(extension.getElementName()), message.getFrom().toString());
                }
                if (message.getBody() != null) {
                    C2480b.m6742f("newIncomingMessage (extension != null)");
                    Collection<Body> bodies = message.getBodies();
                    Map hashMap = new HashMap();
                    for (Body body : bodies) {
                        hashMap.put(body.getLanguage(), body.getMessage());
                    }
                    str = "";
                    if (message.getTo() != null) {
                        str = message.getTo().toString();
                    }
                    this.f15929e.mo2144a(message.getFrom().toString(), str, message.getBody(), message.getStanzaId(), hashMap);
                    break;
                }
                break;
            case 2:
                str = "onReceiveMessageerror";
                break;
            case 3:
                str = "onReceiveMessagegroupchat";
                break;
            case 4:
                str = "onReceiveMessageheadline";
                break;
            case 5:
                str = "onReceiveMessagenormal";
                break;
            default:
                str = "onReceiveMessagedefault";
                break;
        }
        C2480b.m6741e(str);
        stringBuilder = new StringBuilder();
        stringBuilder.append(message.getType());
        stringBuilder.append(" , ");
        stringBuilder.append(message.getBody());
        stringBuilder.append(",");
        stringBuilder.append(message.getFrom());
        stringBuilder.append(",");
        stringBuilder.append(message.getStanzaId());
        C2480b.m6742f(stringBuilder.toString());
    }

    public final void newOutgoingMessage(C7005e c7005e, Message message, Chat chat) {
        StringBuilder stringBuilder = new StringBuilder("MyGroupManager newOutgoingMessage ");
        stringBuilder.append(message.toString());
        C2480b.m6742f(stringBuilder.toString());
    }

    public final void onReceiptReceived(C4614i c4614i, C4614i c4614i2, String str, Stanza stanza) {
    }
}
