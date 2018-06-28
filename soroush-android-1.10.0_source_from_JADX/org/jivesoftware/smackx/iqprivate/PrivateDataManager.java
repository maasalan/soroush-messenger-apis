package org.jivesoftware.smackx.iqprivate;

import java.util.Hashtable;
import java.util.Map;
import java.util.WeakHashMap;
import org.b.c.b;
import org.jivesoftware.smack.Manager;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPException.XMPPErrorException;
import org.jivesoftware.smack.packet.XMPPError.Condition;
import org.jivesoftware.smack.provider.IQProvider;
import org.jivesoftware.smackx.iqprivate.packet.DefaultPrivateData;
import org.jivesoftware.smackx.iqprivate.packet.PrivateData;
import org.jivesoftware.smackx.iqprivate.packet.PrivateDataIQ;
import org.jivesoftware.smackx.iqprivate.provider.PrivateDataProvider;
import org.xmlpull.v1.XmlPullParser;

public final class PrivateDataManager extends Manager {
    private static final PrivateData DUMMY_PRIVATE_DATA = new C79351();
    private static final Map<XMPPConnection, PrivateDataManager> instances = new WeakHashMap();
    private static Map<String, PrivateDataProvider> privateDataProviders = new Hashtable();

    static class C79351 implements PrivateData {
        C79351() {
        }

        public final String getElementName() {
            return "smackDummyPrivateData";
        }

        public final String getNamespace() {
            return "https://igniterealtime.org/projects/smack/";
        }

        public final CharSequence toXML() {
            StringBuilder stringBuilder = new StringBuilder("<");
            stringBuilder.append(getElementName());
            stringBuilder.append(" xmlns='");
            stringBuilder.append(getNamespace());
            stringBuilder.append("'/>");
            return stringBuilder.toString();
        }
    }

    public static class PrivateDataIQProvider extends IQProvider<PrivateDataIQ> {
        public PrivateDataIQ parse(XmlPullParser xmlPullParser, int i) {
            PrivateData privateData = null;
            Object obj = null;
            while (obj == null) {
                int next = xmlPullParser.next();
                if (next == 2) {
                    String name = xmlPullParser.getName();
                    String namespace = xmlPullParser.getNamespace();
                    PrivateDataProvider privateDataProvider = PrivateDataManager.getPrivateDataProvider(name, namespace);
                    if (privateDataProvider != null) {
                        privateData = privateDataProvider.parsePrivateData(xmlPullParser);
                    } else {
                        DefaultPrivateData defaultPrivateData = new DefaultPrivateData(name, namespace);
                        Object obj2 = null;
                        while (obj2 == null) {
                            int next2 = xmlPullParser.next();
                            if (next2 == 2) {
                                String str;
                                String name2 = xmlPullParser.getName();
                                if (xmlPullParser.isEmptyElementTag()) {
                                    str = "";
                                } else if (xmlPullParser.next() == 4) {
                                    str = xmlPullParser.getText();
                                }
                                defaultPrivateData.setValue(name2, str);
                            } else if (next2 == 3 && xmlPullParser.getName().equals(name)) {
                                obj2 = 1;
                            }
                        }
                        privateData = defaultPrivateData;
                    }
                } else if (next == 3 && xmlPullParser.getName().equals("query")) {
                    obj = 1;
                }
            }
            return new PrivateDataIQ(privateData);
        }
    }

    private PrivateDataManager(XMPPConnection xMPPConnection) {
        super(xMPPConnection);
        instances.put(xMPPConnection, this);
    }

    public static void addPrivateDataProvider(String str, String str2, PrivateDataProvider privateDataProvider) {
        privateDataProviders.put(b.a(str, str2), privateDataProvider);
    }

    public static synchronized PrivateDataManager getInstanceFor(XMPPConnection xMPPConnection) {
        PrivateDataManager privateDataManager;
        synchronized (PrivateDataManager.class) {
            privateDataManager = (PrivateDataManager) instances.get(xMPPConnection);
            if (privateDataManager == null) {
                privateDataManager = new PrivateDataManager(xMPPConnection);
            }
        }
        return privateDataManager;
    }

    public static PrivateDataProvider getPrivateDataProvider(String str, String str2) {
        return (PrivateDataProvider) privateDataProviders.get(b.a(str, str2));
    }

    public static void removePrivateDataProvider(String str, String str2) {
        privateDataProviders.remove(b.a(str, str2));
    }

    public final PrivateData getPrivateData(String str, String str2) {
        return ((PrivateDataIQ) connection().createStanzaCollectorAndSend(new PrivateDataIQ(str, str2)).nextResultOrThrow()).getPrivateData();
    }

    public final boolean isSupported() {
        try {
            setPrivateData(DUMMY_PRIVATE_DATA);
            return true;
        } catch (XMPPErrorException e) {
            if (e.getXMPPError().getCondition() == Condition.service_unavailable) {
                return false;
            }
            throw e;
        }
    }

    public final void setPrivateData(PrivateData privateData) {
        connection().createStanzaCollectorAndSend(new PrivateDataIQ(privateData)).nextResultOrThrow();
    }
}
