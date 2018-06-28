package org.jivesoftware.smack.util.dns;

import java.net.InetAddress;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.jivesoftware.smack.util.StringUtils;
import org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager;

public class HostAddress {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final Map<InetAddress, Exception> exceptions;
    private final String fqdn;
    private final List<InetAddress> inetAddresses;
    private final int port;

    public HostAddress(int i, InetAddress inetAddress) {
        this(null, i, Collections.singletonList(inetAddress));
    }

    public HostAddress(String str, int i, List<InetAddress> list) {
        this.exceptions = new LinkedHashMap();
        if (i >= 0) {
            if (i <= InBandBytestreamManager.MAXIMUM_BLOCK_SIZE) {
                if (StringUtils.isNotEmpty((CharSequence) str) && str.charAt(str.length() - 1) == '.') {
                    str = str.substring(0, str.length() - 1);
                }
                this.fqdn = str;
                this.port = i;
                if (list.isEmpty()) {
                    throw new IllegalArgumentException("Must provide at least one InetAddress");
                }
                this.inetAddresses = list;
                return;
            }
        }
        StringBuilder stringBuilder = new StringBuilder("Port must be a 16-bit unsiged integer (i.e. between 0-65535. Port was: ");
        stringBuilder.append(i);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public HostAddress(String str, Exception exception) {
        this.exceptions = new LinkedHashMap();
        this.fqdn = str;
        this.port = 5222;
        this.inetAddresses = Collections.emptyList();
        setException(exception);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HostAddress)) {
            return false;
        }
        HostAddress hostAddress = (HostAddress) obj;
        return this.fqdn.equals(hostAddress.fqdn) && this.port == hostAddress.port;
    }

    public String getErrorMessage() {
        if (this.exceptions.isEmpty()) {
            return "No error logged";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('\'');
        stringBuilder.append(toString());
        stringBuilder.append("' failed because: ");
        Iterator it = this.exceptions.entrySet().iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            if (((InetAddress) entry.getKey()) != null) {
                stringBuilder.append(entry.getKey());
                stringBuilder.append(" exception: ");
            }
            stringBuilder.append(entry.getValue());
            if (it.hasNext()) {
                stringBuilder.append(", ");
            }
        }
        return stringBuilder.toString();
    }

    public Map<InetAddress, Exception> getExceptions() {
        return Collections.unmodifiableMap(this.exceptions);
    }

    public String getFQDN() {
        return this.fqdn;
    }

    public List<InetAddress> getInetAddresses() {
        return Collections.unmodifiableList(this.inetAddresses);
    }

    public int getPort() {
        return this.port;
    }

    public int hashCode() {
        return ((this.fqdn.hashCode() + 37) * 37) + this.port;
    }

    public void setException(Exception exception) {
        setException(null, exception);
    }

    public void setException(InetAddress inetAddress, Exception exception) {
        Exception exception2 = (Exception) this.exceptions.put(inetAddress, exception);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.fqdn);
        stringBuilder.append(":");
        stringBuilder.append(this.port);
        return stringBuilder.toString();
    }
}
