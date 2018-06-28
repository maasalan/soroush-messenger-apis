package org.jivesoftware.smack.util.dns;

import java.net.InetAddress;
import java.util.List;
import org.jivesoftware.smack.util.StringUtils;
import org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager;

public class SRVRecord extends HostAddress implements Comparable<SRVRecord> {
    private int priority;
    private int weight;

    public SRVRecord(String str, int i, int i2, int i3, List<InetAddress> list) {
        StringBuilder stringBuilder;
        super(str, i, list);
        StringUtils.requireNotNullOrEmpty(str, "The FQDN must not be null");
        if (i3 >= 0) {
            if (i3 <= InBandBytestreamManager.MAXIMUM_BLOCK_SIZE) {
                if (i2 >= 0) {
                    if (i2 <= InBandBytestreamManager.MAXIMUM_BLOCK_SIZE) {
                        this.priority = i2;
                        this.weight = i3;
                        return;
                    }
                }
                stringBuilder = new StringBuilder("DNS SRV records priority must be a 16-bit unsiged integer (i.e. between 0-65535. Priority was: ");
                stringBuilder.append(i2);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        stringBuilder = new StringBuilder("DNS SRV records weight must be a 16-bit unsiged integer (i.e. between 0-65535. Weight was: ");
        stringBuilder.append(i3);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public int compareTo(SRVRecord sRVRecord) {
        int i = sRVRecord.priority - this.priority;
        return i == 0 ? this.weight - sRVRecord.weight : i;
    }

    public int getPriority() {
        return this.priority;
    }

    public int getWeight() {
        return this.weight;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append(" prio:");
        stringBuilder.append(this.priority);
        stringBuilder.append(":w:");
        stringBuilder.append(this.weight);
        return stringBuilder.toString();
    }
}
