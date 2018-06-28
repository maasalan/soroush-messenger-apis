package org.jivesoftware.smack.util.dns;

import java.net.InetAddress;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;
import org.jivesoftware.smack.ConnectionConfiguration.DnssecMode;

public abstract class DNSResolver {
    protected static final Logger LOGGER = Logger.getLogger(DNSResolver.class.getName());
    private final boolean supportsDnssec;

    protected DNSResolver(boolean z) {
        this.supportsDnssec = z;
    }

    private final void checkIfDnssecRequestedAndSupported(DnssecMode dnssecMode) {
        if (dnssecMode != DnssecMode.disabled && !this.supportsDnssec) {
            throw new UnsupportedOperationException("This resolver does not support DNSSEC");
        }
    }

    public final HostAddress lookupHostAddress(String str, int i, List<HostAddress> list, DnssecMode dnssecMode) {
        checkIfDnssecRequestedAndSupported(dnssecMode);
        List lookupHostAddress0 = lookupHostAddress0(str, list, dnssecMode);
        if (lookupHostAddress0 != null) {
            if (!lookupHostAddress0.isEmpty()) {
                return new HostAddress(str, i, lookupHostAddress0);
            }
        }
        return null;
    }

    public List<InetAddress> lookupHostAddress0(String str, List<HostAddress> list, DnssecMode dnssecMode) {
        if (dnssecMode != DnssecMode.disabled) {
            throw new UnsupportedOperationException("This resolver does not support DNSSEC");
        }
        try {
            return Arrays.asList(InetAddress.getAllByName(str));
        } catch (Exception e) {
            list.add(new HostAddress(str, e));
            return null;
        }
    }

    public final List<SRVRecord> lookupSRVRecords(String str, List<HostAddress> list, DnssecMode dnssecMode) {
        checkIfDnssecRequestedAndSupported(dnssecMode);
        return lookupSRVRecords0(str, list, dnssecMode);
    }

    public abstract List<SRVRecord> lookupSRVRecords0(String str, List<HostAddress> list, DnssecMode dnssecMode);
}
