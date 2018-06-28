package org.linphone.core;

import java.util.Vector;

public interface LinphoneAddress {

    public static class TransportType {
        public static TransportType LinphoneTransportTcp = new TransportType(1, "LinphoneTransportTcp");
        public static TransportType LinphoneTransportTls = new TransportType(2, "LinphoneTransportTls");
        public static TransportType LinphoneTransportUdp = new TransportType(0, "LinphoneTransportUdp");
        private static Vector<TransportType> values = new Vector();
        private final String mStringValue;
        private final int mValue;

        private TransportType(int i, String str) {
            this.mValue = i;
            values.addElement(this);
            this.mStringValue = str;
        }

        public static TransportType fromInt(int i) {
            for (int i2 = 0; i2 < values.size(); i2++) {
                TransportType transportType = (TransportType) values.elementAt(i2);
                if (transportType.mValue == i) {
                    return transportType;
                }
            }
            StringBuilder stringBuilder = new StringBuilder("state not found [");
            stringBuilder.append(i);
            stringBuilder.append("]");
            throw new RuntimeException(stringBuilder.toString());
        }

        public int toInt() {
            return this.mValue;
        }

        public String toString() {
            return this.mStringValue;
        }
    }

    String asString();

    String asStringUriOnly();

    void clean();

    String getDisplayName();

    String getDomain();

    int getPort();

    TransportType getTransport();

    String getUserName();

    void setDisplayName(String str);

    void setDomain(String str);

    void setPort(int i);

    void setTransport(TransportType transportType);

    void setUserName(String str);

    String toString();
}
