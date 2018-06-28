package org.jivesoftware.smack.proxy;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.StringReader;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jivesoftware.smack.proxy.ProxyInfo.ProxyType;
import org.jivesoftware.smack.roster.Roster;
import org.jivesoftware.smack.util.StringUtils;
import org.jivesoftware.smack.util.stringencoder.Base64;

class HTTPProxySocketConnection implements ProxySocketConnection {
    private static final Pattern RESPONSE_PATTERN = Pattern.compile("HTTP/\\S+\\s(\\d+)\\s(.*)\\s*");
    private final ProxyInfo proxy;

    HTTPProxySocketConnection(ProxyInfo proxyInfo) {
        this.proxy = proxyInfo;
    }

    public void connect(Socket socket, String str, int i, int i2) {
        StringBuilder stringBuilder;
        String proxyAddress = this.proxy.getProxyAddress();
        socket.connect(new InetSocketAddress(proxyAddress, this.proxy.getProxyPort()));
        StringBuilder stringBuilder2 = new StringBuilder("CONNECT ");
        stringBuilder2.append(str);
        stringBuilder2.append(":");
        stringBuilder2.append(i);
        str = stringBuilder2.toString();
        String proxyUsername = this.proxy.getProxyUsername();
        if (proxyUsername == null) {
            proxyUsername = "";
        } else {
            String proxyPassword = this.proxy.getProxyPassword();
            stringBuilder = new StringBuilder("\r\nProxy-Authorization: Basic ");
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append(proxyUsername);
            stringBuilder3.append(":");
            stringBuilder3.append(proxyPassword);
            stringBuilder.append(Base64.encode(stringBuilder3.toString()));
            proxyUsername = stringBuilder.toString();
        }
        OutputStream outputStream = socket.getOutputStream();
        stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(" HTTP/1.1\r\nHost: ");
        stringBuilder.append(str);
        stringBuilder.append(proxyUsername);
        stringBuilder.append("\r\n\r\n");
        outputStream.write(stringBuilder.toString().getBytes(StringUtils.UTF8));
        InputStream inputStream = socket.getInputStream();
        StringBuilder stringBuilder4 = new StringBuilder(100);
        int i3 = 0;
        do {
            int read = inputStream.read();
            if (read == -1) {
                throw new ProxyException(ProxyType.HTTP);
            }
            char c = (char) read;
            stringBuilder4.append(c);
            if (stringBuilder4.length() > Roster.INITIAL_DEFAULT_NON_ROSTER_PRESENCE_MAP_SIZE) {
                ProxyType proxyType = ProxyType.HTTP;
                StringBuilder stringBuilder5 = new StringBuilder("Recieved header of >1024 characters from ");
                stringBuilder5.append(proxyAddress);
                stringBuilder5.append(", cancelling connection");
                throw new ProxyException(proxyType, stringBuilder5.toString());
            }
            if (!((i3 == 0 || i3 == 2) && c == '\r')) {
                if ((i3 != 1 && i3 != 3) || c != '\n') {
                    i3 = 0;
                }
            }
            i3++;
        } while (i3 != 4);
        if (i3 != 4) {
            proxyType = ProxyType.HTTP;
            stringBuilder5 = new StringBuilder("Never received blank line from ");
            stringBuilder5.append(proxyAddress);
            stringBuilder5.append(", cancelling connection");
            throw new ProxyException(proxyType, stringBuilder5.toString());
        }
        Object readLine = new BufferedReader(new StringReader(stringBuilder4.toString())).readLine();
        if (readLine == null) {
            proxyType = ProxyType.HTTP;
            stringBuilder5 = new StringBuilder("Empty proxy response from ");
            stringBuilder5.append(proxyAddress);
            stringBuilder5.append(", cancelling");
            throw new ProxyException(proxyType, stringBuilder5.toString());
        }
        Matcher matcher = RESPONSE_PATTERN.matcher(readLine);
        if (!matcher.matches()) {
            ProxyType proxyType2 = ProxyType.HTTP;
            stringBuilder2 = new StringBuilder("Unexpected proxy response from ");
            stringBuilder2.append(proxyAddress);
            stringBuilder2.append(": ");
            stringBuilder2.append(readLine);
            throw new ProxyException(proxyType2, stringBuilder2.toString());
        } else if (Integer.parseInt(matcher.group(1)) != 200) {
            throw new ProxyException(ProxyType.HTTP);
        }
    }
}
