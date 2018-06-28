package mobi.mmdt.ott.p240c.p241a.p243b;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import mobi.mmdt.ott.p240c.p241a.p242a.C5769b;
import org.jivesoftware.smack.MessageListener;
import org.jivesoftware.smack.StanzaListener;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPConnection.FromMode;
import org.jivesoftware.smack.packet.ExtensionElement;
import org.jivesoftware.smack.packet.Message;
import org.jivesoftware.smack.packet.Message.Body;
import org.jivesoftware.smack.packet.Message.Type;
import org.jivesoftware.smack.packet.Stanza;
import org.jivesoftware.smack.tcp.XMPPTCPConnection;
import org.jivesoftware.smackx.chatstates.ChatState;
import org.jivesoftware.smackx.muc.InvitationListener;
import org.jivesoftware.smackx.muc.MUCAffiliation;
import org.jivesoftware.smackx.muc.MultiUserChat;
import org.jivesoftware.smackx.muc.MultiUserChatManager;
import org.jivesoftware.smackx.muc.packet.MUCUser.Invite;
import org.p501b.p502a.C4614i;
import org.p501b.p502a.C6308g;
import org.p501b.p502a.C7005e;

public final class C5771b implements MessageListener, StanzaListener, InvitationListener {
    public XMPPTCPConnection f15942a;
    public MultiUserChatManager f15943b;
    private C2512a f15944c;

    static /* synthetic */ class C25131 {
        static final /* synthetic */ int[] f8195a = new int[MUCAffiliation.values().length];

        static {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r0 = org.jivesoftware.smackx.muc.MUCAffiliation.values();
            r0 = r0.length;
            r0 = new int[r0];
            f8195a = r0;
            r0 = f8195a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = org.jivesoftware.smackx.muc.MUCAffiliation.admin;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = f8195a;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = org.jivesoftware.smackx.muc.MUCAffiliation.member;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;	 Catch:{ NoSuchFieldError -> 0x001f }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = f8195a;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = org.jivesoftware.smackx.muc.MUCAffiliation.owner;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;	 Catch:{ NoSuchFieldError -> 0x002a }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r0 = f8195a;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = org.jivesoftware.smackx.muc.MUCAffiliation.outcast;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r2 = 4;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.c.a.b.b.1.<clinit>():void");
        }
    }

    public C5771b(C2512a c2512a) {
        this.f15944c = c2512a;
    }

    public final java.lang.String m12997a(android.content.Context r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r0 = "GMT";
        r0 = java.util.TimeZone.getTimeZone(r0);
        r0 = java.util.Calendar.getInstance(r0);
        r0 = r0.getTimeInMillis();
        r2 = mobi.mmdt.componentsutils.p232b.C2492j.m6846e(r4);
        r4 = mobi.mmdt.componentsutils.p232b.C2492j.m6846e(r4);	 Catch:{ UnsupportedEncodingException -> 0x0020, NoSuchAlgorithmException -> 0x001b }
        r4 = mobi.mmdt.componentsutils.p232b.C2492j.m6843b(r4);	 Catch:{ UnsupportedEncodingException -> 0x0020, NoSuchAlgorithmException -> 0x001b }
        goto L_0x0025;
    L_0x001b:
        r4 = move-exception;
        r4.printStackTrace();
        goto L_0x0024;
    L_0x0020:
        r4 = move-exception;
        r4.printStackTrace();
    L_0x0024:
        r4 = r2;
    L_0x0025:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r2.append(r0);
        r0 = 0;
        r1 = 7;
        r4 = r4.substring(r0, r1);
        r2.append(r4);
        r4 = "@";
        r2.append(r4);
        r4 = r3.f15942a;
        r4 = r4.getConfiguration();
        r4 = r4.getGroupHostName();
        r2.append(r4);
        r4 = r2.toString();
        r4 = r4.toLowerCase();
        r0 = mobi.mmdt.ott.p240c.p241a.p242a.C5769b.m12963a(r4);
        r1 = r3.f15943b;
        r1 = r1.getMultiUserChat(r0);
        r1.addMessageListener(r3);
        r1 = r3.f15943b;	 Catch:{ InterruptedException -> 0x0078, c -> 0x0075 }
        r1 = r1.getMultiUserChat(r0);	 Catch:{ InterruptedException -> 0x0078, c -> 0x0075 }
        r2 = r3.f15942a;	 Catch:{ InterruptedException -> 0x0078, c -> 0x0075 }
        r2 = r2.getUser();	 Catch:{ InterruptedException -> 0x0078, c -> 0x0075 }
        r2 = r2.toString();	 Catch:{ InterruptedException -> 0x0078, c -> 0x0075 }
        r2 = org.p501b.p502a.p504b.C6306d.m14764a(r2);	 Catch:{ InterruptedException -> 0x0078, c -> 0x0075 }
        r1.create(r2);	 Catch:{ InterruptedException -> 0x0078, c -> 0x0075 }
        goto L_0x007d;
    L_0x0075:
        r1 = "XmppStringprepException in MyGroupManager createGroup";
        goto L_0x007a;
    L_0x0078:
        r1 = "InterruptedException in MyGroupManager createGroup";
    L_0x007a:
        mobi.mmdt.componentsutils.p232b.p235c.C2480b.m6742f(r1);
    L_0x007d:
        r1 = r3.f15943b;
        r0 = r1.getMultiUserChat(r0);
        r0 = r0.isJoined();
        if (r0 != 0) goto L_0x008c;
    L_0x0089:
        r3.m12999a(r4);
    L_0x008c:
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.c.a.b.b.a(android.content.Context):java.lang.String");
    }

    public final String m12998a(String str, String str2, String str3, Map<String, String> map) {
        Object a = C5769b.m12963a(str);
        C4614i a2 = C5769b.m12963a(str);
        Message message = new Message();
        message.setTo(a);
        message.setType(Type.groupchat);
        message.setFrom(a2);
        message.setBody(str2);
        if (str3 != null) {
            message.setStanzaId(str3);
        }
        for (String str22 : map.keySet()) {
            String str4 = (String) map.get(str22);
            if (str4 != null) {
                message.addBody(str22, str4);
            }
        }
        this.f15942a.setFromMode(FromMode.USER);
        this.f15943b.getMultiUserChat(a).sendMessage(message);
        this.f15942a.setFromMode(FromMode.OMITTED);
        return str3;
    }

    public final void m12999a(java.lang.String r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        r3 = mobi.mmdt.ott.p240c.p241a.p242a.C5769b.m12963a(r3);
        r0 = r2.f15943b;	 Catch:{ c -> 0x001d }
        r0 = r0.getMultiUserChat(r3);	 Catch:{ c -> 0x001d }
        r1 = r2.f15942a;	 Catch:{ c -> 0x001d }
        r1 = r1.getUser();	 Catch:{ c -> 0x001d }
        r1 = r1.toString();	 Catch:{ c -> 0x001d }
        r1 = org.p501b.p502a.p504b.C6306d.m14764a(r1);	 Catch:{ c -> 0x001d }
        r0 = r0.getEnterConfigurationBuilder(r1);	 Catch:{ c -> 0x001d }
        goto L_0x0023;
    L_0x001d:
        r0 = "XmppStringprepException in MyGroupManager joinGroup(String groupId, int maxStanzas)";
        mobi.mmdt.componentsutils.p232b.p235c.C2480b.m6742f(r0);
        r0 = 0;
    L_0x0023:
        r1 = r2.f15943b;	 Catch:{ InterruptedException -> 0x0031 }
        r3 = r1.getMultiUserChat(r3);	 Catch:{ InterruptedException -> 0x0031 }
        r0 = r0.build();	 Catch:{ InterruptedException -> 0x0031 }
        r3.join(r0);	 Catch:{ InterruptedException -> 0x0031 }
        return;
    L_0x0031:
        r3 = "InterruptedException in MyGroupManager joinGroup(String groupId, int maxStanzas)";
        mobi.mmdt.componentsutils.p232b.p235c.C2480b.m6742f(r3);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.c.a.b.b.a(java.lang.String):void");
    }

    public final void m13000a(String str, String str2, MUCAffiliation mUCAffiliation) {
        C7005e a = C5769b.m12963a(str);
        C4614i a2 = C5769b.m12963a(str2);
        switch (C25131.f8195a[mUCAffiliation.ordinal()]) {
            case 1:
                this.f15943b.getMultiUserChat(a).grantAdmin(a2);
                return;
            case 2:
                this.f15943b.getMultiUserChat(a).grantMembership(a2);
                return;
            case 3:
                this.f15943b.getMultiUserChat(a).grantOwnership(a2);
                return;
            case 4:
                this.f15943b.getMultiUserChat(a).banUser(a2, null);
                return;
            default:
                return;
        }
    }

    public final void invitationReceived(XMPPConnection xMPPConnection, MultiUserChat multiUserChat, C6308g c6308g, String str, String str2, Message message, Invite invite) {
    }

    public final void processMessage(Message message) {
        if (message.getFrom().toString().split("/").length == 2 || message.getFrom().toString().split("/").length == 3) {
            ExtensionElement extension = message.getExtension("http://jabber.org/protocol/chatstates");
            if (extension != null) {
                ChatState valueOf = ChatState.valueOf(extension.getElementName());
                String str = message.getFrom().toString().split("/")[0];
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(message.getFrom().toString().split("/")[1]);
                stringBuilder.append("@");
                stringBuilder.append(this.f15942a.getServiceName());
                this.f15944c.mo2145a(str, stringBuilder.toString(), valueOf);
            }
            if (message.getBody() != null) {
                Collection<Body> bodies = message.getBodies();
                Map hashMap = new HashMap();
                for (Body body : bodies) {
                    hashMap.put(body.getLanguage(), body.getMessage());
                }
                String str2 = message.getFrom().toString().split("/")[1];
                this.f15944c.mo2157b(message.getStanzaId(), message.getFrom().toString().split("/")[0], str2, message.getBody(), hashMap);
            }
        }
    }

    public final void processStanza(Stanza stanza) {
        processMessage((Message) stanza);
    }
}
