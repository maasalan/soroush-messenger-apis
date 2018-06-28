package mobi.mmdt.ott.logic.p261a.p281e.p282a;

import mobi.mmdt.ott.logic.p368p.C2881b;

public final class C2635a {
    public C2881b f8538a;
    public String f8539b;
    private String f8540c;

    public C2635a(C2881b c2881b, String str, String str2) {
        this.f8538a = c2881b;
        this.f8540c = str;
        this.f8539b = str2;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String m7050a() {
        /*
        r3 = this;
        r0 = r3.f8540c;
        r1 = new java.lang.StringBuilder;
        r2 = "call_message : ";
        r1.<init>(r2);
        r1.append(r0);
        r1 = r1.toString();
        mobi.mmdt.componentsutils.p232b.p235c.C2480b.m6742f(r1);
        r1 = r0.hashCode();
        switch(r1) {
            case -2081673052: goto L_0x00d7;
            case -1125680648: goto L_0x00cd;
            case -293761761: goto L_0x00c2;
            case -82064904: goto L_0x00b7;
            case 444033355: goto L_0x00ac;
            case 458319730: goto L_0x00a2;
            case 640207570: goto L_0x0098;
            case 752814702: goto L_0x008d;
            case 791549598: goto L_0x0083;
            case 898877978: goto L_0x0079;
            case 1178737925: goto L_0x006e;
            case 1198055831: goto L_0x0062;
            case 1224763664: goto L_0x0057;
            case 1253884296: goto L_0x004b;
            case 1424757481: goto L_0x0040;
            case 1786305461: goto L_0x0034;
            case 1813458064: goto L_0x0028;
            case 2107930264: goto L_0x001c;
            default: goto L_0x001a;
        };
    L_0x001a:
        goto L_0x00e2;
    L_0x001c:
        r1 = "Call ended";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x00e2;
    L_0x0024:
        r1 = 13;
        goto L_0x00e3;
    L_0x0028:
        r1 = "Request Timeout";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x00e2;
    L_0x0030:
        r1 = 15;
        goto L_0x00e3;
    L_0x0034:
        r1 = "Not Found";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x00e2;
    L_0x003c:
        r1 = 9;
        goto L_0x00e3;
    L_0x0040:
        r1 = "Connected";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x00e2;
    L_0x0048:
        r1 = 6;
        goto L_0x00e3;
    L_0x004b:
        r1 = "Connected (streams running)";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x00e2;
    L_0x0053:
        r1 = 12;
        goto L_0x00e3;
    L_0x0057:
        r1 = "Call paused";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x00e2;
    L_0x005f:
        r1 = 5;
        goto L_0x00e3;
    L_0x0062:
        r1 = "Busy here";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x00e2;
    L_0x006a:
        r1 = 11;
        goto L_0x00e3;
    L_0x006e:
        r1 = "Call terminated";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x00e2;
    L_0x0076:
        r1 = 4;
        goto L_0x00e3;
    L_0x0079:
        r1 = "Outgoing call in progress";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x00e2;
    L_0x0081:
        r1 = 1;
        goto L_0x00e3;
    L_0x0083:
        r1 = "Call declined.";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x00e2;
    L_0x008b:
        r1 = 3;
        goto L_0x00e3;
    L_0x008d:
        r1 = "IO Error";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x00e2;
    L_0x0095:
        r1 = 16;
        goto L_0x00e3;
    L_0x0098:
        r1 = "Starting outgoing call";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x00e2;
    L_0x00a0:
        r1 = 0;
        goto L_0x00e3;
    L_0x00a2:
        r1 = "Streams running";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x00e2;
    L_0x00aa:
        r1 = 7;
        goto L_0x00e3;
    L_0x00ac:
        r1 = "Pausing call";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x00e2;
    L_0x00b4:
        r1 = 8;
        goto L_0x00e3;
    L_0x00b7:
        r1 = "Incoming call";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x00e2;
    L_0x00bf:
        r1 = 14;
        goto L_0x00e3;
    L_0x00c2:
        r1 = "Call paused by remote";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x00e2;
    L_0x00ca:
        r1 = 17;
        goto L_0x00e3;
    L_0x00cd:
        r1 = "Remote ringing";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x00e2;
    L_0x00d5:
        r1 = 2;
        goto L_0x00e3;
    L_0x00d7:
        r1 = "Calling";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x00e2;
    L_0x00df:
        r1 = 10;
        goto L_0x00e3;
    L_0x00e2:
        r1 = -1;
    L_0x00e3:
        switch(r1) {
            case 0: goto L_0x012f;
            case 1: goto L_0x012b;
            case 2: goto L_0x0127;
            case 3: goto L_0x0123;
            case 4: goto L_0x011f;
            case 5: goto L_0x011b;
            case 6: goto L_0x0117;
            case 7: goto L_0x0113;
            case 8: goto L_0x010f;
            case 9: goto L_0x010b;
            case 10: goto L_0x0107;
            case 11: goto L_0x0103;
            case 12: goto L_0x00ff;
            case 13: goto L_0x00fb;
            case 14: goto L_0x00f7;
            case 15: goto L_0x00f3;
            case 16: goto L_0x00ef;
            case 17: goto L_0x00e7;
            default: goto L_0x00e6;
        };
    L_0x00e6:
        return r0;
    L_0x00e7:
        r0 = 2131689720; // 0x7f0f00f8 float:1.9008463E38 double:1.053194658E-314;
    L_0x00ea:
        r0 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r0);
        return r0;
    L_0x00ef:
        r0 = 2131690099; // 0x7f0f0273 float:1.9009232E38 double:1.0531948455E-314;
        goto L_0x00ea;
    L_0x00f3:
        r0 = 2131690335; // 0x7f0f035f float:1.900971E38 double:1.053194962E-314;
        goto L_0x00ea;
    L_0x00f7:
        r0 = 2131690047; // 0x7f0f023f float:1.9009127E38 double:1.05319482E-314;
        goto L_0x00ea;
    L_0x00fb:
        r0 = 2131689716; // 0x7f0f00f4 float:1.9008455E38 double:1.0531946563E-314;
        goto L_0x00ea;
    L_0x00ff:
        r0 = 2131689828; // 0x7f0f0164 float:1.9008682E38 double:1.0531947116E-314;
        goto L_0x00ea;
    L_0x0103:
        r0 = 2131689701; // 0x7f0f00e5 float:1.9008425E38 double:1.053194649E-314;
        goto L_0x00ea;
    L_0x0107:
        r0 = 2131689723; // 0x7f0f00fb float:1.900847E38 double:1.0531946597E-314;
        goto L_0x00ea;
    L_0x010b:
        r0 = 2131690192; // 0x7f0f02d0 float:1.900942E38 double:1.0531948914E-314;
        goto L_0x00ea;
    L_0x010f:
        r0 = 2131690241; // 0x7f0f0301 float:1.900952E38 double:1.0531949157E-314;
        goto L_0x00ea;
    L_0x0113:
        r0 = 2131690445; // 0x7f0f03cd float:1.9009934E38 double:1.0531950164E-314;
        goto L_0x00ea;
    L_0x0117:
        r0 = 2131689827; // 0x7f0f0163 float:1.900868E38 double:1.053194711E-314;
        goto L_0x00ea;
    L_0x011b:
        r0 = 2131689719; // 0x7f0f00f7 float:1.9008461E38 double:1.0531946578E-314;
        goto L_0x00ea;
    L_0x011f:
        r0 = 2131689722; // 0x7f0f00fa float:1.9008467E38 double:1.053194659E-314;
        goto L_0x00ea;
    L_0x0123:
        r0 = 2131689715; // 0x7f0f00f3 float:1.9008453E38 double:1.053194656E-314;
        goto L_0x00ea;
    L_0x0127:
        r0 = 2131690332; // 0x7f0f035c float:1.9009705E38 double:1.0531949606E-314;
        goto L_0x00ea;
    L_0x012b:
        r0 = 2131690225; // 0x7f0f02f1 float:1.9009488E38 double:1.0531949077E-314;
        goto L_0x00ea;
    L_0x012f:
        r0 = 2131690437; // 0x7f0f03c5 float:1.9009918E38 double:1.0531950125E-314;
        goto L_0x00ea;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.logic.a.e.a.a.a():java.lang.String");
    }
}
