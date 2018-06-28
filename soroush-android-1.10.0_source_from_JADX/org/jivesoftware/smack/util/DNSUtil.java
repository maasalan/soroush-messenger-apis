package org.jivesoftware.smack.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jivesoftware.smack.ConnectionConfiguration.DnssecMode;
import org.jivesoftware.smack.util.dns.DNSResolver;
import org.jivesoftware.smack.util.dns.HostAddress;
import org.jivesoftware.smack.util.dns.SRVRecord;
import org.jivesoftware.smack.util.dns.SmackDaneProvider;
import org.msgpack.util.TemplatePrecompiler;

public class DNSUtil {
    private static final Logger LOGGER = Logger.getLogger(DNSUtil.class.getName());
    private static SmackDaneProvider daneProvider;
    private static DNSResolver dnsResolver;
    private static StringTransformer idnaTransformer = new C79011();

    private enum DomainType {
        Server,
        Client
    }

    static class C79011 implements StringTransformer {
        C79011() {
        }

        public final String transform(String str) {
            return str;
        }
    }

    private static int bisect(int[] iArr, double d) {
        int i = 0;
        int length = iArr.length;
        int i2 = 0;
        while (i < length && d >= ((double) iArr[i])) {
            i2++;
            i++;
        }
        return i2;
    }

    public static DNSResolver getDNSResolver() {
        return dnsResolver;
    }

    public static SmackDaneProvider getDaneProvider() {
        return daneProvider;
    }

    private static List<HostAddress> resolveDomain(String str, DomainType domainType, List<HostAddress> list, DnssecMode dnssecMode) {
        if (dnsResolver == null) {
            throw new IllegalStateException("No DNS Resolver active in Smack");
        }
        StringBuilder stringBuilder;
        List<HostAddress> arrayList = new ArrayList();
        switch (domainType) {
            case Server:
                stringBuilder = new StringBuilder("_xmpp-server._tcp.");
                break;
            case Client:
                stringBuilder = new StringBuilder("_xmpp-client._tcp.");
                break;
            default:
                throw new AssertionError();
        }
        stringBuilder.append(str);
        String stringBuilder2 = stringBuilder.toString();
        List<SRVRecord> lookupSRVRecords = dnsResolver.lookupSRVRecords(stringBuilder2, list, dnssecMode);
        StringBuilder stringBuilder3;
        if (lookupSRVRecords == null || lookupSRVRecords.isEmpty()) {
            Logger logger = LOGGER;
            stringBuilder3 = new StringBuilder("Could not resolve DNS SRV resource records for ");
            stringBuilder3.append(stringBuilder2);
            stringBuilder3.append(". Consider adding those.");
            logger.info(stringBuilder3.toString());
        } else {
            if (LOGGER.isLoggable(Level.FINE)) {
                stringBuilder3 = new StringBuilder("Resolved SRV RR for ");
                stringBuilder3.append(stringBuilder2);
                stringBuilder3.append(":");
                stringBuilder2 = stringBuilder3.toString();
                for (SRVRecord sRVRecord : lookupSRVRecords) {
                    StringBuilder stringBuilder4 = new StringBuilder();
                    stringBuilder4.append(stringBuilder2);
                    stringBuilder4.append(" ");
                    stringBuilder4.append(sRVRecord);
                    stringBuilder2 = stringBuilder4.toString();
                }
                LOGGER.fine(stringBuilder2);
            }
            arrayList.addAll(sortSRVRecords(lookupSRVRecords));
        }
        int i = -1;
        switch (domainType) {
            case Server:
                i = 5269;
                break;
            case Client:
                i = 5222;
                break;
            default:
                break;
        }
        HostAddress lookupHostAddress = dnsResolver.lookupHostAddress(str, i, list, dnssecMode);
        if (lookupHostAddress != null) {
            arrayList.add(lookupHostAddress);
        }
        return arrayList;
    }

    public static List<HostAddress> resolveXMPPServerDomain(String str, List<HostAddress> list, DnssecMode dnssecMode) {
        return resolveDomain(idnaTransformer.transform(str), DomainType.Server, list, dnssecMode);
    }

    public static List<HostAddress> resolveXMPPServiceDomain(String str, List<HostAddress> list, DnssecMode dnssecMode) {
        return resolveDomain(idnaTransformer.transform(str), DomainType.Client, list, dnssecMode);
    }

    public static void setDNSResolver(DNSResolver dNSResolver) {
        dnsResolver = (DNSResolver) Objects.requireNonNull(dNSResolver);
    }

    public static void setDaneProvider(SmackDaneProvider smackDaneProvider) {
        Objects.requireNonNull(smackDaneProvider);
    }

    public static void setIdnaTransformer(StringTransformer stringTransformer) {
        if (stringTransformer == null) {
            throw new NullPointerException();
        }
        idnaTransformer = stringTransformer;
    }

    private static List<HostAddress> sortSRVRecords(List<SRVRecord> list) {
        if (list.size() == 1 && ((SRVRecord) list.get(0)).getFQDN().equals(TemplatePrecompiler.DEFAULT_DEST)) {
            return Collections.emptyList();
        }
        Collections.sort(list);
        SortedMap treeMap = new TreeMap();
        for (SRVRecord sRVRecord : list) {
            Integer valueOf = Integer.valueOf(sRVRecord.getPriority());
            List list2 = (List) treeMap.get(valueOf);
            if (list2 == null) {
                list2 = new LinkedList();
                treeMap.put(valueOf, list2);
            }
            list2.add(sRVRecord);
        }
        List<HostAddress> arrayList = new ArrayList(list.size());
        for (Integer num : treeMap.keySet()) {
            List<SRVRecord> list3 = (List) treeMap.get(num);
            while (true) {
                int size = list3.size();
                if (size > 0) {
                    int i;
                    int[] iArr = new int[size];
                    for (SRVRecord weight : list3) {
                        if (weight.getWeight() > 0) {
                            i = 0;
                            break;
                        }
                    }
                    i = 1;
                    int i2 = 0;
                    int i3 = i2;
                    for (SRVRecord weight2 : list3) {
                        i2 += weight2.getWeight() + i;
                        iArr[i3] = i2;
                        i3++;
                    }
                    arrayList.add((SRVRecord) list3.remove(i2 == 0 ? (int) (Math.random() * ((double) size)) : bisect(iArr, Math.random() * ((double) i2))));
                }
            }
        }
        return arrayList;
    }
}
