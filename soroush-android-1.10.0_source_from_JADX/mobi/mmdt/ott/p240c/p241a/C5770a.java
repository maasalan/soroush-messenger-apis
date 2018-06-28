package mobi.mmdt.ott.p240c.p241a;

import android.content.Context;
import java.io.IOException;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManagerFactory;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.ott.p240c.C2521b.C2517a;
import mobi.mmdt.ott.p240c.C2524c;
import mobi.mmdt.ott.p240c.C2524c.C2522a;
import mobi.mmdt.ott.p240c.C2524c.C2523b;
import mobi.mmdt.ott.p240c.C2526d;
import mobi.mmdt.ott.p240c.C2526d.C2525a;
import mobi.mmdt.ott.p240c.C2528e.C2527a;
import mobi.mmdt.ott.p240c.p241a.p242a.C2510a;
import mobi.mmdt.ott.p240c.p241a.p242a.C5769b;
import mobi.mmdt.ott.p240c.p241a.p242a.C5769b.C57681;
import mobi.mmdt.ott.p240c.p241a.p243b.C2512a;
import mobi.mmdt.ott.p240c.p241a.p243b.C5771b;
import mobi.mmdt.ott.p240c.p241a.p244c.C2514a;
import mobi.mmdt.ott.p240c.p241a.p244c.C5772b;
import mobi.mmdt.ott.p240c.p245b.C2518b;
import mobi.mmdt.ott.p240c.p245b.C2519c;
import mobi.mmdt.ott.p240c.p245b.C2520d;
import org.jivesoftware.smack.ConnectionListener;
import org.jivesoftware.smack.ReconnectionManager;
import org.jivesoftware.smack.SmackException.NotConnectedException;
import org.jivesoftware.smack.StanzaListener;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.chat2.ChatManager;
import org.jivesoftware.smack.filter.MessageTypeFilter;
import org.jivesoftware.smack.packet.Message;
import org.jivesoftware.smack.packet.Presence;
import org.jivesoftware.smack.packet.Presence.Type;
import org.jivesoftware.smack.packet.Stanza;
import org.jivesoftware.smack.roster.Roster;
import org.jivesoftware.smack.sm.StreamManagementException.StreamManagementNotEnabledException;
import org.jivesoftware.smack.tcp.XMPPTCPConnection;
import org.jivesoftware.smack.util.TLSUtils;
import org.jivesoftware.smackx.chatstates.ChatState;
import org.jivesoftware.smackx.iqlast.LastActivityManager;
import org.jivesoftware.smackx.muc.MUCAffiliation;
import org.jivesoftware.smackx.muc.MultiUserChatManager;
import org.jivesoftware.smackx.ping.PingManager;
import org.jivesoftware.smackx.privacy.PrivacyListManager;
import org.jivesoftware.smackx.receipts.DeliveryReceiptManager;
import org.jivesoftware.smackx.receipts.DeliveryReceiptManager.AutoReceiptMode;
import org.jivesoftware.smackx.receipts.ReceiptReceivedListener;
import org.p501b.p502a.C7005e;

public final class C5770a implements C2510a, C2512a, C2514a, C2524c {
    private static C5770a f15930g;
    XMPPTCPConnection f15931a;
    C2526d f15932b;
    C5769b f15933c;
    C5772b f15934d;
    C5771b f15935e;
    PingManager f15936f;
    private final String f15937h = "b1gs3cr3t";
    private boolean f15938i = false;
    private int f15939j = 0;
    private HostnameVerifier f15940k = new C25082(this);
    private ConnectionListener f15941l = new C57673(this);

    class C25071 implements Runnable {
        final /* synthetic */ C5770a f8188a;

        C25071(C5770a c5770a) {
            this.f8188a = c5770a;
        }

        public final void run() {
            Throwable e;
            String str;
            try {
                this.f8188a.f15931a.sendSmAcknowledgement();
                this.f8188a.f15931a.requestSmAcknowledgement();
            } catch (StreamManagementNotEnabledException e2) {
                e = e2;
                str = "Error in request Lost Messages";
                C2480b.m6737b(str, e);
            } catch (InterruptedException e3) {
                e = e3;
                str = "Error in request Lost Messages InterruptedException";
                C2480b.m6737b(str, e);
            }
        }
    }

    class C25082 implements HostnameVerifier {
        final /* synthetic */ C5770a f8189a;

        C25082(C5770a c5770a) {
            this.f8189a = c5770a;
        }

        public final boolean verify(String str, SSLSession sSLSession) {
            return true;
        }
    }

    static /* synthetic */ class C25094 {
        static final /* synthetic */ int[] f8191b = new int[C2517a.m6853a().length];
        static final /* synthetic */ int[] f8192c = new int[ChatState.values().length];
        static final /* synthetic */ int[] f8193d = new int[Type.values().length];

        static {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r0 = org.jivesoftware.smack.packet.Presence.Type.values();
            r0 = r0.length;
            r0 = new int[r0];
            f8193d = r0;
            r0 = 1;
            r1 = f8193d;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = org.jivesoftware.smack.packet.Presence.Type.available;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = r2.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r1 = 2;
            r2 = f8193d;	 Catch:{ NoSuchFieldError -> 0x001f }
            r3 = org.jivesoftware.smack.packet.Presence.Type.unavailable;	 Catch:{ NoSuchFieldError -> 0x001f }
            r3 = r3.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2[r3] = r1;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r2 = org.jivesoftware.smackx.chatstates.ChatState.values();
            r2 = r2.length;
            r2 = new int[r2];
            f8192c = r2;
            r2 = f8192c;	 Catch:{ NoSuchFieldError -> 0x0032 }
            r3 = org.jivesoftware.smackx.chatstates.ChatState.composing;	 Catch:{ NoSuchFieldError -> 0x0032 }
            r3 = r3.ordinal();	 Catch:{ NoSuchFieldError -> 0x0032 }
            r2[r3] = r0;	 Catch:{ NoSuchFieldError -> 0x0032 }
        L_0x0032:
            r2 = f8192c;	 Catch:{ NoSuchFieldError -> 0x003c }
            r3 = org.jivesoftware.smackx.chatstates.ChatState.gone;	 Catch:{ NoSuchFieldError -> 0x003c }
            r3 = r3.ordinal();	 Catch:{ NoSuchFieldError -> 0x003c }
            r2[r3] = r1;	 Catch:{ NoSuchFieldError -> 0x003c }
        L_0x003c:
            r2 = 3;
            r3 = f8192c;	 Catch:{ NoSuchFieldError -> 0x0047 }
            r4 = org.jivesoftware.smackx.chatstates.ChatState.inactive;	 Catch:{ NoSuchFieldError -> 0x0047 }
            r4 = r4.ordinal();	 Catch:{ NoSuchFieldError -> 0x0047 }
            r3[r4] = r2;	 Catch:{ NoSuchFieldError -> 0x0047 }
        L_0x0047:
            r3 = 4;
            r4 = f8192c;	 Catch:{ NoSuchFieldError -> 0x0052 }
            r5 = org.jivesoftware.smackx.chatstates.ChatState.paused;	 Catch:{ NoSuchFieldError -> 0x0052 }
            r5 = r5.ordinal();	 Catch:{ NoSuchFieldError -> 0x0052 }
            r4[r5] = r3;	 Catch:{ NoSuchFieldError -> 0x0052 }
        L_0x0052:
            r4 = 5;
            r5 = f8192c;	 Catch:{ NoSuchFieldError -> 0x005d }
            r6 = org.jivesoftware.smackx.chatstates.ChatState.active;	 Catch:{ NoSuchFieldError -> 0x005d }
            r6 = r6.ordinal();	 Catch:{ NoSuchFieldError -> 0x005d }
            r5[r6] = r4;	 Catch:{ NoSuchFieldError -> 0x005d }
        L_0x005d:
            r5 = mobi.mmdt.ott.p240c.C2521b.C2517a.m6853a();
            r5 = r5.length;
            r5 = new int[r5];
            f8191b = r5;
            r5 = f8191b;	 Catch:{ NoSuchFieldError -> 0x006d }
            r6 = mobi.mmdt.ott.p240c.C2521b.C2517a.f8207b;	 Catch:{ NoSuchFieldError -> 0x006d }
            r6 = r6 - r0;	 Catch:{ NoSuchFieldError -> 0x006d }
            r5[r6] = r0;	 Catch:{ NoSuchFieldError -> 0x006d }
        L_0x006d:
            r5 = f8191b;	 Catch:{ NoSuchFieldError -> 0x0074 }
            r6 = mobi.mmdt.ott.p240c.C2521b.C2517a.f8208c;	 Catch:{ NoSuchFieldError -> 0x0074 }
            r6 = r6 - r0;	 Catch:{ NoSuchFieldError -> 0x0074 }
            r5[r6] = r1;	 Catch:{ NoSuchFieldError -> 0x0074 }
        L_0x0074:
            r5 = f8191b;	 Catch:{ NoSuchFieldError -> 0x007b }
            r6 = mobi.mmdt.ott.p240c.C2521b.C2517a.f8209d;	 Catch:{ NoSuchFieldError -> 0x007b }
            r6 = r6 - r0;	 Catch:{ NoSuchFieldError -> 0x007b }
            r5[r6] = r2;	 Catch:{ NoSuchFieldError -> 0x007b }
        L_0x007b:
            r5 = f8191b;	 Catch:{ NoSuchFieldError -> 0x0082 }
            r6 = mobi.mmdt.ott.p240c.C2521b.C2517a.f8206a;	 Catch:{ NoSuchFieldError -> 0x0082 }
            r6 = r6 - r0;	 Catch:{ NoSuchFieldError -> 0x0082 }
            r5[r6] = r3;	 Catch:{ NoSuchFieldError -> 0x0082 }
        L_0x0082:
            r5 = mobi.mmdt.ott.p240c.C2524c.C2522a.values();
            r5 = r5.length;
            r5 = new int[r5];
            f8190a = r5;
            r5 = f8190a;	 Catch:{ NoSuchFieldError -> 0x0095 }
            r6 = mobi.mmdt.ott.p240c.C2524c.C2522a.INACTIVE;	 Catch:{ NoSuchFieldError -> 0x0095 }
            r6 = r6.ordinal();	 Catch:{ NoSuchFieldError -> 0x0095 }
            r5[r6] = r0;	 Catch:{ NoSuchFieldError -> 0x0095 }
        L_0x0095:
            r0 = f8190a;	 Catch:{ NoSuchFieldError -> 0x009f }
            r5 = mobi.mmdt.ott.p240c.C2524c.C2522a.PAUSED;	 Catch:{ NoSuchFieldError -> 0x009f }
            r5 = r5.ordinal();	 Catch:{ NoSuchFieldError -> 0x009f }
            r0[r5] = r1;	 Catch:{ NoSuchFieldError -> 0x009f }
        L_0x009f:
            r0 = f8190a;	 Catch:{ NoSuchFieldError -> 0x00a9 }
            r1 = mobi.mmdt.ott.p240c.C2524c.C2522a.COMPOSING;	 Catch:{ NoSuchFieldError -> 0x00a9 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x00a9 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x00a9 }
        L_0x00a9:
            r0 = f8190a;	 Catch:{ NoSuchFieldError -> 0x00b3 }
            r1 = mobi.mmdt.ott.p240c.C2524c.C2522a.GONE;	 Catch:{ NoSuchFieldError -> 0x00b3 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x00b3 }
            r0[r1] = r3;	 Catch:{ NoSuchFieldError -> 0x00b3 }
        L_0x00b3:
            r0 = f8190a;	 Catch:{ NoSuchFieldError -> 0x00bd }
            r1 = mobi.mmdt.ott.p240c.C2524c.C2522a.ACTIVE;	 Catch:{ NoSuchFieldError -> 0x00bd }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x00bd }
            r0[r1] = r4;	 Catch:{ NoSuchFieldError -> 0x00bd }
        L_0x00bd:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.c.a.a.4.<clinit>():void");
        }
    }

    class C57673 implements ConnectionListener {
        final /* synthetic */ C5770a f15923a;

        class C57661 implements StanzaListener {
            final /* synthetic */ C57673 f15922a;

            C57661(C57673 c57673) {
                this.f15922a = c57673;
            }

            public final void processStanza(Stanza stanza) {
                if (stanza instanceof Message) {
                    this.f15922a.f15923a.f15932b.mo2198a(stanza.getStanzaId());
                }
            }
        }

        C57673(C5770a c5770a) {
            this.f15923a = c5770a;
        }

        public final void authenticated(XMPPConnection xMPPConnection, boolean z) {
            if (xMPPConnection instanceof XMPPTCPConnection) {
                this.f15923a.f15931a = (XMPPTCPConnection) xMPPConnection;
                ReceiptReceivedListener receiptReceivedListener = this.f15923a.f15933c;
                receiptReceivedListener.f15925a = this.f15923a.f15931a;
                receiptReceivedListener.f15926b = ChatManager.getInstanceFor(receiptReceivedListener.f15925a);
                receiptReceivedListener.f15925a.addSyncStanzaListener(new C57681(receiptReceivedListener), MessageTypeFilter.CHAT);
                receiptReceivedListener.f15927c = DeliveryReceiptManager.getInstanceFor(receiptReceivedListener.f15925a);
                receiptReceivedListener.f15927c.setAutoReceiptMode(AutoReceiptMode.always);
                receiptReceivedListener.f15927c.addReceiptReceivedListener(receiptReceivedListener);
                C5772b c5772b = this.f15923a.f15934d;
                c5772b.f15945a = this.f15923a.f15931a;
                c5772b.f15946b = LastActivityManager.getInstanceFor(c5772b.f15945a);
                Roster.getInstanceFor(c5772b.f15945a).setRosterLoadedAtLogin(false);
                c5772b.f15947c = PrivacyListManager.getInstanceFor(c5772b.f15945a);
                StanzaListener stanzaListener = this.f15923a.f15935e;
                stanzaListener.f15942a = this.f15923a.f15931a;
                stanzaListener.f15943b = MultiUserChatManager.getInstanceFor(stanzaListener.f15942a);
                stanzaListener.f15942a.addSyncStanzaListener(stanzaListener, MessageTypeFilter.GROUPCHAT);
                this.f15923a.f15936f = PingManager.getInstanceFor(this.f15923a.f15931a);
                this.f15923a.f15931a.addStanzaAcknowledgedListener(new C57661(this));
            }
            if (!z) {
                this.f15923a.f15932b.mo2203a(C2525a.CONNECTED);
            }
        }

        public final void connected(XMPPConnection xMPPConnection) {
        }

        public final void connectionClosed() {
            this.f15923a.f15932b.mo2203a(C2525a.DISCONNECTED_ON_REQUEST);
        }

        public final void connectionClosedOnError(Exception exception) {
            C2480b.m6738b((Throwable) exception);
            this.f15923a.f15932b.mo2203a(C2525a.DISCONNECTED_ON_ERROR);
        }

        public final void reconnectingIn(int i) {
        }

        public final void reconnectionFailed(Exception exception) {
            C2480b.m6738b((Throwable) exception);
        }

        public final void reconnectionSuccessful() {
        }
    }

    private C5770a() {
        ReconnectionManager.setEnabledPerDefault(false);
        LastActivityManager.setEnabledPerDefault(true);
    }

    private static SSLContext m12969b(Context context) {
        KeyStore keystore = KeyStore.getInstance("BKS");
        keystore.load(context.getResources().openRawResource(C2527a.ssl_keystore_prod), "b1gs3cr3t".toCharArray());
        TrustManagerFactory trustFactory = TrustManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
        trustFactory.init(keystore);
        SSLContext instance3 = SSLContext.getInstance(TLSUtils.TLS);
        instance3.init(null, trustFactory.getTrustManagers(), new SecureRandom());
        return instance3;
    }

    public static C5770a m12970c() {
        if (f15930g == null) {
            f15930g = new C5770a();
        }
        return f15930g;
    }

    public final long mo2137a(String str) {
        if (mo2152a(false)) {
            try {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append("@");
                stringBuilder.append(this.f15931a.getServiceName());
                return this.f15934d.m13004a(stringBuilder.toString());
            } catch (Exception e) {
                throw new C2520d(e);
            } catch (Exception e2) {
                throw new C2519c(e2);
            } catch (Exception e22) {
                throw new C2518b(e22);
            } catch (Exception e222) {
                C2480b.m6732a("InterruptedException in SmackManager - getLastOnlineSeconds");
                throw new C2519c(e222);
            }
        }
        throw new C2519c(new IOException());
    }

    public final String mo2138a(Context context) {
        if (mo2152a(false)) {
            try {
                return this.f15935e.m12997a(context).split("@")[0];
            } catch (Exception e) {
                throw new C2519c(e);
            } catch (Exception e2) {
                throw new C2520d(e2);
            } catch (Exception e22) {
                throw new C2518b(e22);
            } catch (Exception e222) {
                throw new mobi.mmdt.ott.p240c.p245b.C2517a(e222);
            } catch (Exception e2222) {
                C2480b.m6732a("InterruptedException in SmackManager - createGroup");
                throw new C2519c(e2222);
            }
        }
        throw new C2519c(new IOException());
    }

    public final String mo2139a(String str, String str2, String str3, Map<String, String> map) {
        if (mo2152a(false)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append("@");
            stringBuilder.append(this.f15931a.getServiceName());
            try {
                return this.f15933c.m12967a(stringBuilder.toString(), str2, str3, map);
            } catch (Exception e) {
                throw new C2519c(e);
            } catch (Exception e2) {
                C2480b.m6732a("InterruptedException in SmackManager - SendMessage");
                throw new C2519c(e2);
            }
        }
        throw new C2519c(new IOException());
    }

    public final String mo2140a(String str, String str2, String str3, Map<String, String> map, String str4) {
        if (mo2152a(false)) {
            try {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append("@");
                stringBuilder.append(this.f15931a.getConfiguration().getGroupHostName());
                str = stringBuilder.toString();
                C5771b c5771b = this.f15935e;
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append(str4);
                stringBuilder2.append("@");
                stringBuilder2.append(this.f15931a.getServiceName());
                return c5771b.m12998a(str, str2, str3, map);
            } catch (Exception e) {
                throw new C2519c(e);
            } catch (Exception e2) {
                throw new C2520d(e2);
            } catch (Exception e22) {
                C2480b.m6732a("InterruptedException in SmackManager - sendGroupMessage");
                throw new C2519c(e22);
            }
        }
        throw new C2519c(new IOException());
    }

    public final void mo2141a() {
        if (this.f15931a != null) {
            this.f15931a.disconnect();
        }
    }

    public final void mo2142a(String str, String str2) {
        if (mo2152a(false)) {
            try {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str2);
                stringBuilder.append("@");
                stringBuilder.append(this.f15931a.getServiceName());
                str2 = stringBuilder.toString();
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append("@");
                stringBuilder.append(this.f15931a.getConfiguration().getGroupHostName());
                str = stringBuilder.toString();
                C5771b c5771b = this.f15935e;
                C7005e a = C5769b.m12963a(str);
                c5771b.f15943b.getMultiUserChat(a).revokeMembership(C5769b.m12963a(str2));
                return;
            } catch (Throwable e) {
                C2480b.m6738b(e);
                throw e;
            } catch (Exception e2) {
                throw new C2519c(e2);
            } catch (Exception e22) {
                throw new C2520d(e22);
            } catch (Exception e222) {
                throw new mobi.mmdt.ott.p240c.p245b.C2517a(e222);
            } catch (Exception e2222) {
                C2480b.m6732a("InterruptedException in SmackManager - leaveGroup");
                throw new C2519c(e2222);
            }
        }
        throw new C2519c(new IOException());
    }

    public final void mo2143a(String str, String str2, int i) {
        if (mo2152a(false)) {
            try {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str2);
                stringBuilder.append("@");
                stringBuilder.append(this.f15931a.getServiceName());
                str2 = stringBuilder.toString();
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append("@");
                stringBuilder.append(this.f15931a.getConfiguration().getGroupHostName());
                str = stringBuilder.toString();
                switch (C25094.f8191b[i - 1]) {
                    case 1:
                        this.f15935e.m13000a(str, str2, MUCAffiliation.admin);
                        return;
                    case 2:
                        this.f15935e.m13000a(str, str2, MUCAffiliation.member);
                        return;
                    case 3:
                        this.f15935e.m13000a(str, str2, MUCAffiliation.outcast);
                        return;
                    case 4:
                        this.f15935e.m13000a(str, str2, MUCAffiliation.owner);
                        return;
                    default:
                        return;
                }
            } catch (Exception e) {
                throw new C2519c(e);
            } catch (Exception e2) {
                throw new C2520d(e2);
            } catch (Exception e22) {
                throw new C2518b(e22);
            } catch (Exception e222) {
                C2480b.m6732a("InterruptedException in SmackManager - setUserAffiliate");
                throw new C2519c(e222);
            }
        }
        throw new C2519c(new IOException());
    }

    public final void mo2144a(String str, String str2, String str3, String str4, Map<String, String> map) {
        this.f15932b.mo2199a(str.split("@")[0], str2.split("@")[0], str3, str4, map);
    }

    public final void mo2145a(java.lang.String r3, java.lang.String r4, org.jivesoftware.smackx.chatstates.ChatState r5) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:11:0x003c in {2, 4, 5, 7, 8, 9, 10} preds:[]
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:129)
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:48)
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:38)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r2 = this;
        r0 = "@";
        r4 = r4.split(r0);
        r0 = 0;
        r4 = r4[r0];
        r1 = "@";
        r3 = r3.split(r1);
        r3 = r3[r0];
        r0 = mobi.mmdt.ott.p240c.p241a.C5770a.C25094.f8192c;
        r5 = r5.ordinal();
        r5 = r0[r5];
        switch(r5) {
            case 1: goto L_0x0037;
            case 2: goto L_0x0032;
            case 3: goto L_0x002d;
            case 4: goto L_0x0025;
            case 5: goto L_0x001d;
            default: goto L_0x001c;
        };
    L_0x001c:
        return;
    L_0x001d:
        r5 = r2.f15932b;
        r0 = mobi.mmdt.ott.p240c.C2524c.C2522a.ACTIVE;
        r5.mo2201a(r3, r4, r0);
        return;
    L_0x0025:
        r5 = r2.f15932b;
        r0 = mobi.mmdt.ott.p240c.C2524c.C2522a.PAUSED;
    L_0x0029:
        r5.mo2201a(r3, r4, r0);
        return;
    L_0x002d:
        r5 = r2.f15932b;
        r0 = mobi.mmdt.ott.p240c.C2524c.C2522a.INACTIVE;
        goto L_0x0029;
    L_0x0032:
        r5 = r2.f15932b;
        r0 = mobi.mmdt.ott.p240c.C2524c.C2522a.GONE;
        goto L_0x0029;
    L_0x0037:
        r5 = r2.f15932b;
        r0 = mobi.mmdt.ott.p240c.C2524c.C2522a.COMPOSING;
        goto L_0x0029;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.c.a.a.a(java.lang.String, java.lang.String, org.jivesoftware.smackx.chatstates.ChatState):void");
    }

    public final void mo2146a(String str, Presence presence) {
        str.split("@");
        int i;
        switch (C25094.f8193d[presence.getType().ordinal()]) {
            case 1:
                i = C2523b.f8217a;
                return;
            case 2:
                i = C2523b.f8218b;
                return;
            default:
                return;
        }
    }

    public final void mo2147a(ArrayList<String> arrayList) {
        int i = 0;
        if (mo2152a(false)) {
            String[] strArr = new String[arrayList.size()];
            while (i < strArr.length) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append((String) arrayList.get(i));
                stringBuilder.append("@");
                stringBuilder.append(this.f15931a.getServiceName());
                strArr[i] = stringBuilder.toString();
                i++;
            }
            try {
                this.f15934d.m13006a(strArr);
                return;
            } catch (Exception e) {
                C2480b.m6732a("InterruptedException in SmackManager - blockUser");
                throw new C2519c(e);
            }
        }
        throw new C2519c(new IOException());
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo2148a(mobi.mmdt.ott.p240c.C2515a r11, android.content.Context r12) {
        /*
        r10 = this;
        monitor-enter(r10);
        r0 = r12.getAssets();	 Catch:{ all -> 0x0139 }
        org.jivesoftware.smack.util.FileUtils.setAssetManager(r0);	 Catch:{ all -> 0x0139 }
        r0 = r10.f15938i;	 Catch:{ all -> 0x0139 }
        if (r0 != 0) goto L_0x0137;
    L_0x000c:
        r0 = 0;
        r1 = r10.mo2152a(r0);	 Catch:{ all -> 0x0139 }
        if (r1 == 0) goto L_0x0015;
    L_0x0013:
        goto L_0x0137;
    L_0x0015:
        r1 = 5000; // 0x1388 float:7.006E-42 double:2.4703E-320;
        r3 = r10.f15939j;	 Catch:{ all -> 0x0139 }
        r4 = 10;
        r5 = 60000; // 0xea60 float:8.4078E-41 double:2.9644E-319;
        r7 = 1;
        if (r3 <= r4) goto L_0x0023;
    L_0x0021:
        r1 = r5;
        goto L_0x0028;
    L_0x0023:
        r3 = r10.f15939j;	 Catch:{ all -> 0x0139 }
        r3 = r3 + r7;
        r10.f15939j = r3;	 Catch:{ all -> 0x0139 }
    L_0x0028:
        r10.f15938i = r7;	 Catch:{ all -> 0x0139 }
        r3 = 0;
        r4 = org.jivesoftware.smack.tcp.XMPPTCPConnectionConfiguration.builder();	 Catch:{ Exception -> 0x010c }
        r4 = r4.setSendPresence(r7);	 Catch:{ Exception -> 0x010c }
        r4 = (org.jivesoftware.smack.tcp.XMPPTCPConnectionConfiguration.Builder) r4;	 Catch:{ Exception -> 0x010c }
        r4 = r4.setCompressionEnabled(r7);	 Catch:{ Exception -> 0x010c }
        r8 = mobi.mmdt.componentsutils.p232b.p235c.C2480b.f8158a;	 Catch:{ Exception -> 0x010c }
        r4 = r4.setDebuggerEnabled(r8);	 Catch:{ Exception -> 0x010c }
        r4 = (org.jivesoftware.smack.tcp.XMPPTCPConnectionConfiguration.Builder) r4;	 Catch:{ Exception -> 0x010c }
        r8 = r11.f8196a;	 Catch:{ Exception -> 0x010c }
        r8 = java.net.InetAddress.getByName(r8);	 Catch:{ Exception -> 0x010c }
        r4 = r4.setHostAddress(r8);	 Catch:{ Exception -> 0x010c }
        r4 = (org.jivesoftware.smack.tcp.XMPPTCPConnectionConfiguration.Builder) r4;	 Catch:{ Exception -> 0x010c }
        r8 = r11.f8197b;	 Catch:{ Exception -> 0x010c }
        r4 = r4.setPort(r8);	 Catch:{ Exception -> 0x010c }
        r4 = (org.jivesoftware.smack.tcp.XMPPTCPConnectionConfiguration.Builder) r4;	 Catch:{ Exception -> 0x010c }
        r8 = r11.f8200e;	 Catch:{ Exception -> 0x010c }
        r4 = r4.setXmppDomain(r8);	 Catch:{ Exception -> 0x010c }
        r4 = (org.jivesoftware.smack.tcp.XMPPTCPConnectionConfiguration.Builder) r4;	 Catch:{ Exception -> 0x010c }
        r8 = r11.f8201f;	 Catch:{ Exception -> 0x010c }
        r4 = r4.setGroupHostName(r8);	 Catch:{ Exception -> 0x010c }
        r4 = (org.jivesoftware.smack.tcp.XMPPTCPConnectionConfiguration.Builder) r4;	 Catch:{ Exception -> 0x010c }
        r8 = r10.f15940k;	 Catch:{ Exception -> 0x010c }
        r4 = r4.setHostnameVerifier(r8);	 Catch:{ Exception -> 0x010c }
        r4 = (org.jivesoftware.smack.tcp.XMPPTCPConnectionConfiguration.Builder) r4;	 Catch:{ Exception -> 0x010c }
        r8 = r11.f8202g;	 Catch:{ Exception -> 0x010c }
        r9 = mobi.mmdt.ott.p240c.C2515a.C2506b.f8185c;	 Catch:{ Exception -> 0x010c }
        if (r8 != r9) goto L_0x0087;
    L_0x0073:
        r8 = org.jivesoftware.smack.ConnectionConfiguration.SecurityMode.disabled;	 Catch:{ Exception -> 0x010c }
        r8 = r4.setSecurityMode(r8);	 Catch:{ Exception -> 0x010c }
        r8 = (org.jivesoftware.smack.tcp.XMPPTCPConnectionConfiguration.Builder) r8;	 Catch:{ Exception -> 0x010c }
        r9 = mobi.mmdt.ott.p240c.p241a.C5770a.m12969b(r12);	 Catch:{ Exception -> 0x010c }
        r9 = r9.getSocketFactory();	 Catch:{ Exception -> 0x010c }
        r8.setSocketFactory(r9);	 Catch:{ Exception -> 0x010c }
        goto L_0x0096;
    L_0x0087:
        r8 = org.jivesoftware.smack.ConnectionConfiguration.SecurityMode.required;	 Catch:{ Exception -> 0x010c }
        r8 = r4.setSecurityMode(r8);	 Catch:{ Exception -> 0x010c }
        r8 = (org.jivesoftware.smack.tcp.XMPPTCPConnectionConfiguration.Builder) r8;	 Catch:{ Exception -> 0x010c }
        r9 = mobi.mmdt.ott.p240c.p241a.C5770a.m12969b(r12);	 Catch:{ Exception -> 0x010c }
        r8.setCustomSSLContext(r9);	 Catch:{ Exception -> 0x010c }
    L_0x0096:
        r4 = r4.build();	 Catch:{ Exception -> 0x010c }
        org.jivesoftware.smack.util.FileUtils.removeAssetManager();	 Catch:{ Exception -> 0x010c }
        r8 = new org.jivesoftware.smack.tcp.XMPPTCPConnection;	 Catch:{ Exception -> 0x010c }
        r8.<init>(r4);	 Catch:{ Exception -> 0x010c }
        r10.f15931a = r8;	 Catch:{ Exception -> 0x010c }
        r4 = r10.f15931a;	 Catch:{ Exception -> 0x010c }
        r4.setPacketReplyTimeout(r1);	 Catch:{ Exception -> 0x010c }
        r1 = new mobi.mmdt.ott.c.a.a.b;	 Catch:{ Exception -> 0x010c }
        r1.<init>(r10);	 Catch:{ Exception -> 0x010c }
        r10.f15933c = r1;	 Catch:{ Exception -> 0x010c }
        r1 = new mobi.mmdt.ott.c.a.c.b;	 Catch:{ Exception -> 0x010c }
        r1.<init>(r10);	 Catch:{ Exception -> 0x010c }
        r10.f15934d = r1;	 Catch:{ Exception -> 0x010c }
        r1 = new mobi.mmdt.ott.c.a.b.b;	 Catch:{ Exception -> 0x010c }
        r1.<init>(r10);	 Catch:{ Exception -> 0x010c }
        r10.f15935e = r1;	 Catch:{ Exception -> 0x010c }
        r1 = r10.f15931a;	 Catch:{ Exception -> 0x010c }
        r1.setUseStreamManagementResumption(r7);	 Catch:{ Exception -> 0x010c }
        r1 = r10.f15931a;	 Catch:{ Exception -> 0x010c }
        r1.setUseStreamManagement(r7);	 Catch:{ Exception -> 0x010c }
        r1 = r10.f15931a;	 Catch:{ Exception -> 0x010c }
        r2 = r10.f15941l;	 Catch:{ Exception -> 0x010c }
        r1.addConnectionListener(r2);	 Catch:{ Exception -> 0x010c }
        r1 = r10.f15931a;	 Catch:{ Exception -> 0x010c }
        r1.connect();	 Catch:{ Exception -> 0x010c }
        r1 = r10.f15931a;	 Catch:{ Exception -> 0x010c }
        r2 = r11.f8198c;	 Catch:{ Exception -> 0x010c }
        r4 = r11.f8199d;	 Catch:{ Exception -> 0x010c }
        r11 = r11.f8203h;	 Catch:{ Exception -> 0x010c }
        r11 = org.p501b.p502a.p504b.C6306d.m14764a(r11);	 Catch:{ Exception -> 0x010c }
        r1.login(r2, r4, r11);	 Catch:{ Exception -> 0x010c }
        r11 = r10.f15931a;	 Catch:{ Exception -> 0x010c }
        r11.setPacketReplyTimeout(r5);	 Catch:{ Exception -> 0x010c }
        r10.f15939j = r0;	 Catch:{ Exception -> 0x010c }
        r11 = new java.lang.Thread;	 Catch:{ Exception -> 0x0105 }
        r1 = new mobi.mmdt.ott.c.a.a$1;	 Catch:{ Exception -> 0x0105 }
        r1.<init>(r10);	 Catch:{ Exception -> 0x0105 }
        r11.<init>(r1);	 Catch:{ Exception -> 0x0105 }
        r11.start();	 Catch:{ Exception -> 0x0105 }
        r11 = r10.f15931a;	 Catch:{ Exception -> 0x0105 }
        if (r11 == 0) goto L_0x0130;
    L_0x00fb:
        r11 = r10.f15931a;	 Catch:{ Exception -> 0x0105 }
        r11 = org.jivesoftware.smackx.carbons.CarbonManager.getInstanceFor(r11);	 Catch:{ Exception -> 0x0105 }
        r11.enableCarbons();	 Catch:{ Exception -> 0x0105 }
        goto L_0x0130;
    L_0x0105:
        r11 = move-exception;
        r1 = "Error in use Stream Management";
        mobi.mmdt.componentsutils.p232b.p235c.C2480b.m6737b(r1, r11);	 Catch:{ Exception -> 0x010c }
        goto L_0x0130;
    L_0x010c:
        r11 = move-exception;
        r3 = r11;
        r11 = r10.f15931a;	 Catch:{ all -> 0x0139 }
        r11 = r11.isAuthenticated();	 Catch:{ all -> 0x0139 }
        if (r11 != 0) goto L_0x0129;
    L_0x0116:
        r11 = "mobi.mmdt.ott.model.pref.PrefKeys.KEY_MAIN_PREF_1";
        r11 = r12.getSharedPreferences(r11, r0);	 Catch:{ all -> 0x0139 }
        r11 = r11.edit();	 Catch:{ all -> 0x0139 }
        r12 = "mobi.mmdt.ott.model.pref.KEY_NEED_SALAM_WEBSERVICE";
        r11 = r11.putBoolean(r12, r7);	 Catch:{ all -> 0x0139 }
        r11.apply();	 Catch:{ all -> 0x0139 }
    L_0x0129:
        r10.mo2141a();	 Catch:{ all -> 0x0139 }
        mobi.mmdt.componentsutils.p232b.p235c.C2480b.m6738b(r3);	 Catch:{ all -> 0x0139 }
        r7 = r0;
    L_0x0130:
        r10.f15938i = r0;	 Catch:{ all -> 0x0139 }
        if (r7 != 0) goto L_0x0135;
    L_0x0134:
        throw r3;	 Catch:{ all -> 0x0139 }
    L_0x0135:
        monitor-exit(r10);
        return;
    L_0x0137:
        monitor-exit(r10);
        return;
    L_0x0139:
        r11 = move-exception;
        monitor-exit(r10);
        throw r11;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.c.a.a.a(mobi.mmdt.ott.c.a, android.content.Context):void");
    }

    public final void mo2149a(C2522a c2522a, String str) {
        if (mo2152a(false)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append("@");
            stringBuilder.append(this.f15931a.getServiceName());
            str = stringBuilder.toString();
            try {
                switch (c2522a) {
                    case INACTIVE:
                        this.f15933c.m12968a(ChatState.inactive, str);
                        return;
                    case PAUSED:
                        this.f15933c.m12968a(ChatState.paused, str);
                        return;
                    case COMPOSING:
                        this.f15933c.m12968a(ChatState.composing, str);
                        return;
                    case GONE:
                        this.f15933c.m12968a(ChatState.gone, str);
                        return;
                    case ACTIVE:
                        this.f15933c.m12968a(ChatState.active, str);
                        return;
                    default:
                        return;
                }
            } catch (Exception e) {
                throw new C2519c(e);
            } catch (Exception e2) {
                C2480b.m6732a("InterruptedException in SmackManager in sendMyChatStateToUser ");
                throw new C2519c(e2);
            }
        }
        throw new C2519c(new IOException());
    }

    public final void mo2150a(C2526d c2526d) {
        if (this.f15932b == null) {
            this.f15932b = c2526d;
        }
    }

    public final void mo2151a(ChatState chatState, String str) {
        C2526d c2526d;
        C2522a c2522a;
        str = str.split("@")[0];
        switch (C25094.f8192c[chatState.ordinal()]) {
            case 1:
                this.f15932b.mo2202a(str, C2522a.COMPOSING);
                return;
            case 2:
                c2526d = this.f15932b;
                c2522a = C2522a.GONE;
                break;
            case 3:
                c2526d = this.f15932b;
                c2522a = C2522a.INACTIVE;
                break;
            case 4:
                c2526d = this.f15932b;
                c2522a = C2522a.PAUSED;
                break;
            case 5:
                c2526d = this.f15932b;
                c2522a = C2522a.ACTIVE;
                break;
            default:
                return;
        }
        c2526d.mo2202a(str, c2522a);
    }

    public final boolean mo2152a(boolean z) {
        if (this.f15931a == null || !this.f15931a.isConnected() || !this.f15931a.isAuthenticated()) {
            return false;
        }
        if (!z) {
            return true;
        }
        if (this.f15936f != null) {
            try {
                return this.f15936f.pingMyServer();
            } catch (Throwable e) {
                C2480b.m6738b(e);
            }
        }
        return false;
    }

    public final String mo2153b(String str, String str2, String str3, Map<String, String> map) {
        if (mo2152a(false)) {
            try {
                return this.f15933c.m12967a(str, str2, str3, map);
            } catch (Exception e) {
                throw new C2519c(e);
            } catch (Exception e2) {
                C2480b.m6732a("InterruptedException in SmackManager - SendMessage");
                throw new C2519c(e2);
            }
        }
        throw new C2519c(new IOException());
    }

    public final ArrayList<String> mo2154b() {
        try {
            return this.f15934d.m13005a();
        } catch (InterruptedException e) {
            C2480b.m6732a("InterruptedException in SmackManager - getBlockedUsers");
            throw new NotConnectedException(e.toString());
        }
    }

    public final void mo2155b(String str) {
        if (mo2152a(false)) {
            try {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append("@");
                stringBuilder.append(this.f15931a.getConfiguration().getGroupHostName());
                this.f15935e.m12999a(stringBuilder.toString());
                return;
            } catch (Exception e) {
                throw new C2519c(e);
            } catch (Exception e2) {
                throw new C2520d(e2);
            } catch (Exception e22) {
                throw new mobi.mmdt.ott.p240c.p245b.C2517a(e22);
            }
        }
        throw new C2519c(new IOException());
    }

    public final void mo2156b(String str, String str2) {
        if (mo2152a(false)) {
            try {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str2);
                stringBuilder.append("@");
                stringBuilder.append(this.f15931a.getServiceName());
                str2 = stringBuilder.toString();
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append("@");
                stringBuilder.append(this.f15931a.getConfiguration().getGroupHostName());
                str = stringBuilder.toString();
                C5771b c5771b = this.f15935e;
                C7005e a = C5769b.m12963a(str);
                c5771b.f15943b.getMultiUserChat(a).revokeMembership(C5769b.m12963a(str2));
                return;
            } catch (Throwable e) {
                C2480b.m6738b(e);
                throw e;
            } catch (Exception e2) {
                throw new C2519c(e2);
            } catch (Exception e22) {
                throw new C2520d(e22);
            } catch (Exception e222) {
                throw new C2518b(e222);
            } catch (Exception e2222) {
                C2480b.m6732a("InterruptedException in SmackManager - removeUserFromGroup");
                throw new C2519c(e2222);
            }
        }
        throw new C2519c(new IOException());
    }

    public final void mo2157b(String str, String str2, String str3, String str4, Map<String, String> map) {
        String str5 = str3.split("@")[0];
        this.f15932b.mo2204b(str2.split("@")[0], str5, str4, str, map);
    }

    public final void mo2158b(ArrayList<String> arrayList) {
        int i = 0;
        if (mo2152a(false)) {
            String[] strArr = new String[arrayList.size()];
            while (i < strArr.length) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append((String) arrayList.get(i));
                stringBuilder.append("@");
                stringBuilder.append(this.f15931a.getServiceName());
                strArr[i] = stringBuilder.toString();
                i++;
            }
            try {
                this.f15934d.m13007b(strArr);
                return;
            } catch (Exception e) {
                C2480b.m6732a("InterruptedException in SmackManager - unblockUser");
                throw new C2519c(e);
            }
        }
        throw new C2519c(new IOException());
    }

    public final void mo2159b(C2526d c2526d) {
        this.f15932b = c2526d;
    }

    public final void m12994b(boolean r2) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r1 = this;
        r0 = r1.f15931a;
        if (r0 == 0) goto L_0x002e;
    L_0x0004:
        r0 = r1.f15931a;
        r0 = org.jivesoftware.smackx.csi.ClientStateIndicationManager.isSupported(r0);
        if (r0 == 0) goto L_0x002e;
    L_0x000c:
        r0 = 0;
        r0 = r1.mo2152a(r0);
        if (r0 == 0) goto L_0x002e;
    L_0x0013:
        if (r2 == 0) goto L_0x001d;
    L_0x0015:
        r2 = r1.f15931a;	 Catch:{ NotConnectedException -> 0x001b, InterruptedException -> 0x0023 }
        org.jivesoftware.smackx.csi.ClientStateIndicationManager.inactive(r2);	 Catch:{ NotConnectedException -> 0x001b, InterruptedException -> 0x0023 }
        return;	 Catch:{ NotConnectedException -> 0x001b, InterruptedException -> 0x0023 }
    L_0x001b:
        r2 = move-exception;	 Catch:{ NotConnectedException -> 0x001b, InterruptedException -> 0x0023 }
        goto L_0x0029;	 Catch:{ NotConnectedException -> 0x001b, InterruptedException -> 0x0023 }
    L_0x001d:
        r2 = r1.f15931a;	 Catch:{ NotConnectedException -> 0x001b, InterruptedException -> 0x0023 }
        org.jivesoftware.smackx.csi.ClientStateIndicationManager.active(r2);	 Catch:{ NotConnectedException -> 0x001b, InterruptedException -> 0x0023 }
        return;
    L_0x0023:
        r2 = "InterruptedException in SmackManager - inactiveClientStateIndication";
        mobi.mmdt.componentsutils.p232b.p235c.C2480b.m6732a(r2);
        return;
    L_0x0029:
        r0 = "inactiveClientStateIndication NotConnectedException";
        mobi.mmdt.componentsutils.p232b.p235c.C2480b.m6737b(r0, r2);
    L_0x002e:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.c.a.a.b(boolean):void");
    }

    public final void mo2160c(String str) {
        if (mo2152a(false)) {
            try {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append("@");
                stringBuilder.append(this.f15931a.getConfiguration().getGroupHostName());
                this.f15935e.m12999a(stringBuilder.toString());
                return;
            } catch (Exception e) {
                throw new C2519c(e);
            } catch (Exception e2) {
                throw new C2520d(e2);
            } catch (Exception e22) {
                throw new mobi.mmdt.ott.p240c.p245b.C2517a(e22);
            }
        }
        throw new C2519c(new IOException());
    }

    public final void mo2161c(String str, String str2, String str3, Map<String, String> map) {
        this.f15932b.mo2200a(str, str2, str3, map);
    }
}
