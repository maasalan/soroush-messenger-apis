package org.jivesoftware.smack.proxy;

public class ProxyInfo {
    private String proxyAddress;
    private String proxyPassword;
    private int proxyPort;
    private final ProxySocketConnection proxySocketConnection;
    private ProxyType proxyType;
    private String proxyUsername;

    public enum ProxyType {
        HTTP,
        SOCKS4,
        SOCKS5
    }

    public ProxyInfo(ProxyType proxyType, String str, int i, String str2, String str3) {
        ProxySocketConnection hTTPProxySocketConnection;
        this.proxyType = proxyType;
        this.proxyAddress = str;
        this.proxyPort = i;
        this.proxyUsername = str2;
        this.proxyPassword = str3;
        switch (this.proxyType) {
            case HTTP:
                hTTPProxySocketConnection = new HTTPProxySocketConnection(this);
                break;
            case SOCKS4:
                hTTPProxySocketConnection = new Socks4ProxySocketConnection(this);
                break;
            case SOCKS5:
                hTTPProxySocketConnection = new Socks5ProxySocketConnection(this);
                break;
            default:
                throw new IllegalStateException();
        }
        this.proxySocketConnection = hTTPProxySocketConnection;
    }

    public static ProxyInfo forHttpProxy(String str, int i, String str2, String str3) {
        return new ProxyInfo(ProxyType.HTTP, str, i, str2, str3);
    }

    public static ProxyInfo forSocks4Proxy(String str, int i, String str2, String str3) {
        return new ProxyInfo(ProxyType.SOCKS4, str, i, str2, str3);
    }

    public static ProxyInfo forSocks5Proxy(String str, int i, String str2, String str3) {
        return new ProxyInfo(ProxyType.SOCKS5, str, i, str2, str3);
    }

    public String getProxyAddress() {
        return this.proxyAddress;
    }

    public String getProxyPassword() {
        return this.proxyPassword;
    }

    public int getProxyPort() {
        return this.proxyPort;
    }

    public ProxySocketConnection getProxySocketConnection() {
        return this.proxySocketConnection;
    }

    public ProxyType getProxyType() {
        return this.proxyType;
    }

    public String getProxyUsername() {
        return this.proxyUsername;
    }
}
