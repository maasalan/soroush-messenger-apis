package org.jivesoftware.smack.proxy;

import java.net.Socket;

public interface ProxySocketConnection {
    void connect(Socket socket, String str, int i, int i2);
}
