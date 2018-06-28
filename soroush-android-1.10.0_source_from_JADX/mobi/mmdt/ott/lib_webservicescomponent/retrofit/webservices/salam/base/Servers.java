package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.salam.base;

import com.google.p164b.p165a.C1904c;
import java.util.Arrays;

public class Servers {
    public static final String CHAT = "chat";
    public static final String TCP = "tcp";
    public static final String TLS = "tls";
    public static final String VOIP = "voip";
    @C1904c(a = "Application")
    private String application;
    @C1904c(a = "EncryptionMode")
    private String encryptionMode;
    @C1904c(a = "GroupHostname")
    private String groupHostName;
    private GroupJoinProtocol groupJoinProtocol;
    @C1904c(a = "GProto")
    private String groupJoinProtocolString;
    @C1904c(a = "Hostname")
    private String hostName;
    @C1904c(a = "Iv")
    private String iv;
    @C1904c(a = "Password")
    private String password;
    @C1904c(a = "PortNo")
    private int portNo;
    @C1904c(a = "Protocol")
    private String[] protocol;
    @C1904c(a = "ServerAddress")
    private String serverAddress;
    @C1904c(a = "Username")
    private String userName;

    public enum GroupJoinProtocol {
        MUCSub,
        MUC
    }

    public enum Protocol {
        TCP(Servers.TCP),
        UDP("udp"),
        TLS_V2("tls2"),
        TLS(Servers.TLS);
        
        String value;

        private Protocol(String str) {
            this.value = str;
        }

        public final String getProtocolValue() {
            return this.value;
        }
    }

    public String getApplication() {
        return this.application;
    }

    public String getEncryptionMode() {
        return this.encryptionMode;
    }

    public String getGroupHostName() {
        return this.groupHostName;
    }

    public GroupJoinProtocol getGroupJoinProtocol() {
        GroupJoinProtocol groupJoinProtocol;
        if (this.groupJoinProtocolString.equalsIgnoreCase("proto1")) {
            groupJoinProtocol = GroupJoinProtocol.MUC;
        } else {
            if (this.groupJoinProtocolString.equalsIgnoreCase("proto2")) {
                groupJoinProtocol = GroupJoinProtocol.MUCSub;
            }
            return this.groupJoinProtocol;
        }
        this.groupJoinProtocol = groupJoinProtocol;
        return this.groupJoinProtocol;
    }

    public String getHostName() {
        return this.hostName;
    }

    public String getIv() {
        return this.iv;
    }

    public String getPassword() {
        return this.password;
    }

    public int getPortNo() {
        return this.portNo;
    }

    public String[] getProtocol() {
        return this.protocol;
    }

    public String getServerAddress() {
        return this.serverAddress;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setApplication(String str) {
        this.application = str;
    }

    public void setEncryptionMode(String str) {
        this.encryptionMode = str;
    }

    public void setGroupHostName(String str) {
        this.groupHostName = str;
    }

    public void setHostName(String str) {
        this.hostName = str;
    }

    public void setIv(String str) {
        this.iv = str;
    }

    public void setPassword(String str) {
        this.password = str;
    }

    public void setPortNo(int i) {
        this.portNo = i;
    }

    public void setProtocol(String[] strArr) {
        this.protocol = strArr;
    }

    public void setServerAddress(String str) {
        this.serverAddress = str;
    }

    public void setUserName(String str) {
        this.userName = str;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Servers{application='");
        stringBuilder.append(this.application);
        stringBuilder.append('\'');
        stringBuilder.append(", serverAddress='");
        stringBuilder.append(this.serverAddress);
        stringBuilder.append('\'');
        stringBuilder.append(", portNo='");
        stringBuilder.append(this.portNo);
        stringBuilder.append('\'');
        stringBuilder.append(", protocol=");
        stringBuilder.append(Arrays.toString(this.protocol));
        stringBuilder.append(", hostName='");
        stringBuilder.append(this.hostName);
        stringBuilder.append('\'');
        stringBuilder.append(", groupHostName='");
        stringBuilder.append(this.groupHostName);
        stringBuilder.append('\'');
        stringBuilder.append(", userName='");
        stringBuilder.append(this.userName);
        stringBuilder.append('\'');
        stringBuilder.append(", password='");
        stringBuilder.append(this.password);
        stringBuilder.append('\'');
        stringBuilder.append(", encryptionMode='");
        stringBuilder.append(this.encryptionMode);
        stringBuilder.append('\'');
        stringBuilder.append(", iv='");
        stringBuilder.append(this.iv);
        stringBuilder.append('\'');
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
