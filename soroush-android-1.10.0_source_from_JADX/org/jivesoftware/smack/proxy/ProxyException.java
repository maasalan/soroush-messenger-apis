package org.jivesoftware.smack.proxy;

import java.io.IOException;
import org.jivesoftware.smack.proxy.ProxyInfo.ProxyType;

public class ProxyException extends IOException {
    private static final long serialVersionUID = 1;

    public ProxyException(ProxyType proxyType) {
        StringBuilder stringBuilder = new StringBuilder("Proxy Exception ");
        stringBuilder.append(proxyType.toString());
        stringBuilder.append(" : Unknown Error");
        super(stringBuilder.toString());
    }

    public ProxyException(ProxyType proxyType, String str) {
        StringBuilder stringBuilder = new StringBuilder("Proxy Exception ");
        stringBuilder.append(proxyType.toString());
        stringBuilder.append(" : ");
        stringBuilder.append(str);
        super(stringBuilder.toString());
    }
}
