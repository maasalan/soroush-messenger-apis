package org.jivesoftware.smack.util.dns.minidns;

import a.b.a.c.g;
import a.b.a.f.a;
import a.b.a.f.b;
import a.b.a.f.c;
import a.b.a.f.d;
import a.b.a.i.s;
import java.util.LinkedList;
import java.util.List;
import org.jivesoftware.smack.ConnectionConfiguration.DnssecMode;
import org.jivesoftware.smack.initializer.SmackInitializer;
import org.jivesoftware.smack.util.DNSUtil;
import org.jivesoftware.smack.util.dns.DNSResolver;
import org.jivesoftware.smack.util.dns.HostAddress;
import org.jivesoftware.smack.util.dns.SRVRecord;

public class MiniDnsResolver extends DNSResolver implements SmackInitializer {
    private static final c DNSSEC_RESOLVER = a.a;
    private static final MiniDnsResolver INSTANCE = new MiniDnsResolver();
    private static final c NON_DNSSEC_RESOLVER = c.b;

    public MiniDnsResolver() {
        super(true);
    }

    private static b getExceptionFrom(d<?> dVar) {
        return new b(dVar.a, dVar.b);
    }

    public static DNSResolver getInstance() {
        return INSTANCE;
    }

    private static c getResolver(DnssecMode dnssecMode) {
        return dnssecMode == DnssecMode.disabled ? NON_DNSSEC_RESOLVER : DNSSEC_RESOLVER;
    }

    public static void setup() {
        DNSUtil.setDNSResolver(getInstance());
    }

    private static boolean shouldAbortIfNotAuthentic(String str, DnssecMode dnssecMode, d<?> dVar, List<HostAddress> list) {
        switch (dnssecMode) {
            case needsDnssec:
            case needsDnssecAndDane:
                dVar.c();
                if (!dVar.c) {
                    StringBuilder stringBuilder = new StringBuilder("DNSSEC verification failed: ");
                    dVar.c();
                    stringBuilder.append(((g) dVar.d.iterator().next()).a());
                    list.add(new HostAddress(str, new Exception(stringBuilder.toString())));
                    return true;
                }
                break;
            case disabled:
                break;
            default:
                StringBuilder stringBuilder2 = new StringBuilder("Unknown DnssecMode: ");
                stringBuilder2.append(dnssecMode);
                throw new IllegalStateException(stringBuilder2.toString());
        }
        return false;
    }

    public List<Exception> initialize() {
        setup();
        MiniDnsDane.setup();
        return null;
    }

    protected java.util.List<java.net.InetAddress> lookupHostAddress0(java.lang.String r5, java.util.List<org.jivesoftware.smack.util.dns.HostAddress> r6, org.jivesoftware.smack.ConnectionConfiguration.DnssecMode r7) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r4 = this;
        r0 = getResolver(r7);
        r1 = 0;
        r2 = a.b.a.i.a.class;	 Catch:{ IOException -> 0x00a9 }
        r2 = r0.a(r5, r2);	 Catch:{ IOException -> 0x00a9 }
        r3 = a.b.a.i.b.class;	 Catch:{ IOException -> 0x00a9 }
        r0 = r0.a(r5, r3);	 Catch:{ IOException -> 0x00a9 }
        r3 = r2.a();
        if (r3 != 0) goto L_0x0036;
    L_0x0017:
        r3 = r0.a();
        if (r3 != 0) goto L_0x0036;
    L_0x001d:
        r7 = new org.jivesoftware.smack.util.dns.HostAddress;
        r2 = getExceptionFrom(r2);
        r7.<init>(r5, r2);
        r6.add(r7);
        r7 = new org.jivesoftware.smack.util.dns.HostAddress;
        r0 = getExceptionFrom(r0);
        r7.<init>(r5, r0);
        r6.add(r7);
        return r1;
    L_0x0036:
        r3 = shouldAbortIfNotAuthentic(r5, r7, r2, r6);
        if (r3 != 0) goto L_0x00a8;
    L_0x003c:
        r6 = shouldAbortIfNotAuthentic(r5, r7, r0, r6);
        if (r6 == 0) goto L_0x0043;
    L_0x0042:
        return r1;
    L_0x0043:
        r6 = r2.a();
        if (r6 == 0) goto L_0x004e;
    L_0x0049:
        r6 = r2.b();
        goto L_0x0052;
    L_0x004e:
        r6 = java.util.Collections.emptySet();
    L_0x0052:
        r7 = r0.a();
        if (r7 == 0) goto L_0x005d;
    L_0x0058:
        r7 = r0.b();
        goto L_0x0061;
    L_0x005d:
        r7 = java.util.Collections.emptySet();
    L_0x0061:
        r0 = new java.util.ArrayList;
        r1 = r6.size();
        r2 = r7.size();
        r1 = r1 + r2;
        r0.<init>(r1);
        r6 = r6.iterator();
    L_0x0073:
        r1 = r6.hasNext();
        if (r1 == 0) goto L_0x008b;
    L_0x0079:
        r1 = r6.next();
        r1 = (a.b.a.i.a) r1;
        r1 = r1.a();	 Catch:{ UnknownHostException -> 0x0073 }
        r1 = java.net.InetAddress.getByAddress(r1);	 Catch:{ UnknownHostException -> 0x0073 }
        r0.add(r1);
        goto L_0x0073;
    L_0x008b:
        r6 = r7.iterator();
    L_0x008f:
        r7 = r6.hasNext();
        if (r7 == 0) goto L_0x00a7;
    L_0x0095:
        r7 = r6.next();
        r7 = (a.b.a.i.b) r7;
        r7 = r7.a();	 Catch:{ UnknownHostException -> 0x008f }
        r7 = java.net.InetAddress.getByAddress(r5, r7);	 Catch:{ UnknownHostException -> 0x008f }
        r0.add(r7);
        goto L_0x008f;
    L_0x00a7:
        return r0;
    L_0x00a8:
        return r1;
    L_0x00a9:
        r7 = move-exception;
        r0 = new org.jivesoftware.smack.util.dns.HostAddress;
        r0.<init>(r5, r7);
        r6.add(r0);
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smack.util.dns.minidns.MiniDnsResolver.lookupHostAddress0(java.lang.String, java.util.List, org.jivesoftware.smack.ConnectionConfiguration$DnssecMode):java.util.List<java.net.InetAddress>");
    }

    protected List<SRVRecord> lookupSRVRecords0(String str, List<HostAddress> list, DnssecMode dnssecMode) {
        Object hostAddress;
        try {
            d a = getResolver(dnssecMode).a(str, s.class);
            if (!a.a()) {
                hostAddress = new HostAddress(str, getExceptionFrom(a));
                list.add(hostAddress);
                return null;
            } else if (shouldAbortIfNotAuthentic(str, dnssecMode, a, list)) {
                return null;
            } else {
                List<SRVRecord> linkedList = new LinkedList();
                for (s sVar : a.b()) {
                    String str2 = sVar.d.d;
                    List lookupHostAddress0 = lookupHostAddress0(str2, list, dnssecMode);
                    if (lookupHostAddress0 != null) {
                        linkedList.add(new SRVRecord(str2, sVar.c, sVar.a, sVar.b, lookupHostAddress0));
                    }
                }
                return linkedList;
            }
        } catch (Exception e) {
            hostAddress = new HostAddress(str, e);
        }
    }
}
