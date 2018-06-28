package mobi.mmdt.ott.logic.p261a.p308q;

public final class C2730a {
    public long f8675a;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C2730a(java.util.Map<java.lang.String, java.lang.String> r26) {
        /*
        r25 = this;
        r0 = r25;
        r1 = r26;
        r25.<init>();
        r2 = "FILE_TYPE";
        r2 = r1.get(r2);
        r2 = (java.lang.String) r2;
        r3 = r2.hashCode();
        r5 = 4;
        r6 = 0;
        switch(r3) {
            case -2131014526: goto L_0x0041;
            case 327328941: goto L_0x0037;
            case 796404377: goto L_0x002d;
            case 802160718: goto L_0x0023;
            case 808293817: goto L_0x0019;
            default: goto L_0x0018;
        };
    L_0x0018:
        goto L_0x004b;
    L_0x0019:
        r3 = "FILE_TYPE_VIDEO";
        r2 = r2.equals(r3);
        if (r2 == 0) goto L_0x004b;
    L_0x0021:
        r2 = 2;
        goto L_0x004c;
    L_0x0023:
        r3 = "FILE_TYPE_OTHER";
        r2 = r2.equals(r3);
        if (r2 == 0) goto L_0x004b;
    L_0x002b:
        r2 = r5;
        goto L_0x004c;
    L_0x002d:
        r3 = "FILE_TYPE_IMAGE";
        r2 = r2.equals(r3);
        if (r2 == 0) goto L_0x004b;
    L_0x0035:
        r2 = r6;
        goto L_0x004c;
    L_0x0037:
        r3 = "FILE_TYPE_PUSH_TO_TALK";
        r2 = r2.equals(r3);
        if (r2 == 0) goto L_0x004b;
    L_0x003f:
        r2 = 3;
        goto L_0x004c;
    L_0x0041:
        r3 = "FILE_TYPE_GIF";
        r2 = r2.equals(r3);
        if (r2 == 0) goto L_0x004b;
    L_0x0049:
        r2 = 1;
        goto L_0x004c;
    L_0x004b:
        r2 = -1;
    L_0x004c:
        switch(r2) {
            case 0: goto L_0x0061;
            case 1: goto L_0x005e;
            case 2: goto L_0x005b;
            case 3: goto L_0x0058;
            case 4: goto L_0x0055;
            default: goto L_0x004f;
        };
    L_0x004f:
        r1 = "Undefined file type";
        mobi.mmdt.componentsutils.p232b.p235c.C2480b.m6736b(r1);
        return;
    L_0x0055:
        r2 = mobi.mmdt.ott.provider.p386h.C2988j.OTHER;
        goto L_0x0063;
    L_0x0058:
        r2 = mobi.mmdt.ott.provider.p386h.C2988j.PUSH_TO_TALK;
        goto L_0x0063;
    L_0x005b:
        r2 = mobi.mmdt.ott.provider.p386h.C2988j.VIDEO;
        goto L_0x0063;
    L_0x005e:
        r2 = mobi.mmdt.ott.provider.p386h.C2988j.GIF;
        goto L_0x0063;
    L_0x0061:
        r2 = mobi.mmdt.ott.provider.p386h.C2988j.IMAGE;
    L_0x0063:
        r3 = "FILE_NAME";
        r3 = r1.get(r3);
        r12 = r3;
        r12 = (java.lang.String) r12;
        r3 = "FILE_URL";
        r3 = r1.get(r3);
        r9 = r3;
        r9 = (java.lang.String) r9;
        r3 = "FILE_ID";
        r3 = r1.get(r3);
        r3 = (java.lang.String) r3;
        if (r3 == 0) goto L_0x0088;
    L_0x007f:
        r7 = r3.isEmpty();
        if (r7 == 0) goto L_0x0086;
    L_0x0085:
        goto L_0x0088;
    L_0x0086:
        r10 = r3;
        goto L_0x0091;
    L_0x0088:
        r3 = "/";
        r3 = r9.split(r3);
        r3 = r3[r5];
        goto L_0x0086;
    L_0x0091:
        r3 = mobi.mmdt.ott.provider.p386h.C2988j.IMAGE;
        if (r2 != r3) goto L_0x0114;
    L_0x0095:
        r3 = mobi.mmdt.ott.logic.C2791c.m7109a();
        r3 = r3.m7112a(r10);
        r5 = mobi.mmdt.ott.logic.C2791c.m7109a();
        r5 = r5.m7118c(r10);
        r7 = "FILE_IMAGE_WIDTH";
        r7 = r1.containsKey(r7);
        if (r7 == 0) goto L_0x00bc;
    L_0x00ad:
        r7 = "FILE_IMAGE_WIDTH";
        r7 = r1.get(r7);
        r7 = (java.lang.String) r7;
        r7 = java.lang.Integer.parseInt(r7);
        r22 = r7;
        goto L_0x00be;
    L_0x00bc:
        r22 = r6;
    L_0x00be:
        r7 = "FILE_IMAGE_HEIGHT";
        r7 = r1.containsKey(r7);
        if (r7 == 0) goto L_0x00d2;
    L_0x00c6:
        r6 = "FILE_IMAGE_HEIGHT";
        r6 = r1.get(r6);
        r6 = (java.lang.String) r6;
        r6 = java.lang.Integer.parseInt(r6);
    L_0x00d2:
        r23 = new mobi.mmdt.ott.provider.h.a;
        r7 = new java.io.File;
        r7.<init>(r3);
        r8 = android.net.Uri.fromFile(r7);
        r3 = "FILE_SIZE";
        r3 = r1.get(r3);
        r3 = (java.lang.String) r3;
        r13 = java.lang.Long.parseLong(r3);
        r3 = new java.io.File;
        r3.<init>(r5);
        r15 = android.net.Uri.fromFile(r3);
        r3 = "FILE_THUMBNAIL_URL";
        r1 = r1.get(r3);
        r16 = r1;
        r16 = (java.lang.String) r16;
        r17 = -1;
        r18 = mobi.mmdt.ott.provider.p386h.C2987i.NOT_STARTED;
        r19 = mobi.mmdt.ott.provider.p386h.C2987i.NOT_STARTED;
        r20 = mobi.mmdt.ott.provider.p386h.C2986h.STOP;
        r21 = -1;
        r7 = r23;
        r11 = r2;
        r7.<init>(r8, r9, r10, r11, r12, r13, r15, r16, r17, r18, r19, r20, r21);
    L_0x010c:
        r20 = r6;
        r19 = r22;
        r3 = r23;
        goto L_0x0290;
    L_0x0114:
        r3 = mobi.mmdt.ott.provider.p386h.C2988j.GIF;
        if (r2 != r3) goto L_0x0191;
    L_0x0118:
        r3 = mobi.mmdt.ott.logic.C2791c.m7109a();
        r3 = r3.m7112a(r10);
        r5 = mobi.mmdt.ott.logic.C2791c.m7109a();
        r5 = r5.m7118c(r10);
        r7 = "FILE_IMAGE_WIDTH";
        r7 = r1.containsKey(r7);
        if (r7 == 0) goto L_0x013f;
    L_0x0130:
        r7 = "FILE_IMAGE_WIDTH";
        r7 = r1.get(r7);
        r7 = (java.lang.String) r7;
        r7 = java.lang.Integer.parseInt(r7);
        r22 = r7;
        goto L_0x0141;
    L_0x013f:
        r22 = r6;
    L_0x0141:
        r7 = "FILE_IMAGE_HEIGHT";
        r7 = r1.containsKey(r7);
        if (r7 == 0) goto L_0x0155;
    L_0x0149:
        r6 = "FILE_IMAGE_HEIGHT";
        r6 = r1.get(r6);
        r6 = (java.lang.String) r6;
        r6 = java.lang.Integer.parseInt(r6);
    L_0x0155:
        r23 = new mobi.mmdt.ott.provider.h.a;
        r7 = new java.io.File;
        r7.<init>(r3);
        r8 = android.net.Uri.fromFile(r7);
        r3 = "FILE_SIZE";
        r3 = r1.get(r3);
        r3 = (java.lang.String) r3;
        r13 = java.lang.Long.parseLong(r3);
        r3 = new java.io.File;
        r3.<init>(r5);
        r15 = android.net.Uri.fromFile(r3);
        r3 = "FILE_THUMBNAIL_URL";
        r1 = r1.get(r3);
        r16 = r1;
        r16 = (java.lang.String) r16;
        r17 = -1;
        r18 = mobi.mmdt.ott.provider.p386h.C2987i.NOT_STARTED;
        r19 = mobi.mmdt.ott.provider.p386h.C2987i.NOT_STARTED;
        r20 = mobi.mmdt.ott.provider.p386h.C2986h.STOP;
        r21 = -1;
        r7 = r23;
        r11 = r2;
        r7.<init>(r8, r9, r10, r11, r12, r13, r15, r16, r17, r18, r19, r20, r21);
        goto L_0x010c;
    L_0x0191:
        r3 = mobi.mmdt.ott.provider.p386h.C2988j.PUSH_TO_TALK;
        if (r2 != r3) goto L_0x01d6;
    L_0x0195:
        r3 = mobi.mmdt.ott.logic.C2791c.m7109a();
        r3 = r3.m7119d(r10);
        r5 = new java.io.File;
        r5.<init>(r3);
        r3 = "FILE_TYPE_PUSH_TO_TALK_DURATION";
        r3 = r1.get(r3);
        r3 = (java.lang.String) r3;
        r17 = java.lang.Integer.parseInt(r3);
        r3 = new mobi.mmdt.ott.provider.h.a;
        r8 = android.net.Uri.fromFile(r5);
        r5 = "FILE_SIZE";
        r1 = r1.get(r5);
        r1 = (java.lang.String) r1;
        r13 = java.lang.Long.parseLong(r1);
        r15 = 0;
        r16 = 0;
        r18 = mobi.mmdt.ott.provider.p386h.C2987i.NOT_STARTED;
        r19 = mobi.mmdt.ott.provider.p386h.C2987i.NOT_STARTED;
        r20 = mobi.mmdt.ott.provider.p386h.C2986h.STOP;
        r21 = 0;
        r7 = r3;
        r11 = r2;
        r7.<init>(r8, r9, r10, r11, r12, r13, r15, r16, r17, r18, r19, r20, r21);
    L_0x01d0:
        r19 = r6;
        r20 = r19;
        goto L_0x0290;
    L_0x01d6:
        r3 = mobi.mmdt.ott.provider.p386h.C2988j.VIDEO;
        if (r2 != r3) goto L_0x025d;
    L_0x01da:
        r3 = mobi.mmdt.ott.logic.C2791c.m7109a();
        r3 = r3.m7115b(r10);
        r5 = mobi.mmdt.ott.logic.C2791c.m7109a();
        r5 = r5.m7118c(r10);
        r7 = "FILE_IMAGE_WIDTH";
        r7 = r1.containsKey(r7);
        if (r7 == 0) goto L_0x0201;
    L_0x01f2:
        r7 = "FILE_IMAGE_WIDTH";
        r7 = r1.get(r7);
        r7 = (java.lang.String) r7;
        r7 = java.lang.Integer.parseInt(r7);
        r22 = r7;
        goto L_0x0203;
    L_0x0201:
        r22 = r6;
    L_0x0203:
        r7 = "FILE_IMAGE_HEIGHT";
        r7 = r1.containsKey(r7);
        if (r7 == 0) goto L_0x0217;
    L_0x020b:
        r6 = "FILE_IMAGE_HEIGHT";
        r6 = r1.get(r6);
        r6 = (java.lang.String) r6;
        r6 = java.lang.Integer.parseInt(r6);
    L_0x0217:
        r7 = "FILE_TYPE_VIDEO_DURATION";
        r7 = r1.get(r7);
        r7 = (java.lang.String) r7;
        r17 = java.lang.Integer.parseInt(r7);
        r23 = new mobi.mmdt.ott.provider.h.a;
        r7 = new java.io.File;
        r7.<init>(r3);
        r8 = android.net.Uri.fromFile(r7);
        r3 = "FILE_SIZE";
        r3 = r1.get(r3);
        r3 = (java.lang.String) r3;
        r13 = java.lang.Long.parseLong(r3);
        r3 = new java.io.File;
        r3.<init>(r5);
        r15 = android.net.Uri.fromFile(r3);
        r3 = "FILE_THUMBNAIL_URL";
        r1 = r1.get(r3);
        r16 = r1;
        r16 = (java.lang.String) r16;
        r18 = mobi.mmdt.ott.provider.p386h.C2987i.NOT_STARTED;
        r19 = mobi.mmdt.ott.provider.p386h.C2987i.NOT_STARTED;
        r20 = mobi.mmdt.ott.provider.p386h.C2986h.STOP;
        r21 = 0;
        r7 = r23;
        r11 = r2;
        r7.<init>(r8, r9, r10, r11, r12, r13, r15, r16, r17, r18, r19, r20, r21);
        goto L_0x010c;
    L_0x025d:
        r3 = mobi.mmdt.ott.logic.C2791c.m7109a();
        r3 = r3.m7120e(r10);
        r5 = new java.io.File;
        r5.<init>(r3);
        r3 = new mobi.mmdt.ott.provider.h.a;
        r8 = android.net.Uri.fromFile(r5);
        r5 = "FILE_SIZE";
        r1 = r1.get(r5);
        r1 = (java.lang.String) r1;
        r13 = java.lang.Long.parseLong(r1);
        r15 = 0;
        r16 = 0;
        r17 = -1;
        r18 = mobi.mmdt.ott.provider.p386h.C2987i.NOT_STARTED;
        r19 = mobi.mmdt.ott.provider.p386h.C2987i.NOT_STARTED;
        r20 = mobi.mmdt.ott.provider.p386h.C2986h.STOP;
        r21 = 0;
        r7 = r3;
        r11 = r2;
        r7.<init>(r8, r9, r10, r11, r12, r13, r15, r16, r17, r18, r19, r20, r21);
        goto L_0x01d0;
    L_0x0290:
        r5 = r3.f9318a;
        r6 = r3.f9320c;
        r7 = r3.f9321d;
        r8 = r3.f9326i;
        r9 = r3.f9322e;
        r10 = r3.f9327j;
        r12 = r3.f9319b;
        r13 = r3.f9323f;
        r14 = r3.f9328k;
        r15 = r3.f9324g;
        r1 = r3.f9325h;
        r4 = r3.f9329l;
        r24 = r2;
        r2 = r3.f9330m;
        r16 = r1;
        r17 = r4;
        r18 = r2;
        r1 = mobi.mmdt.ott.provider.p386h.C2984c.m7459a(r5, r6, r7, r8, r9, r10, r12, r13, r14, r15, r16, r17, r18, r19, r20);
        r0.f8675a = r1;
        r1 = r3.f9318a;
        r2 = r3.f9319b;
        if (r1 == 0) goto L_0x02d4;
    L_0x02be:
        r3 = new java.io.File;
        r1 = r1.getPath();
        r3.<init>(r1);
        r1 = r3.exists();
        if (r1 == 0) goto L_0x02d4;
    L_0x02cd:
        r3 = r0.f8675a;
        r1 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        mobi.mmdt.ott.provider.p386h.C2984c.m7456a(r3, r1);
    L_0x02d4:
        if (r2 == 0) goto L_0x02ec;
    L_0x02d6:
        r1 = new java.io.File;
        r2 = r2.getPath();
        r1.<init>(r2);
        r1 = r1.exists();
        if (r1 == 0) goto L_0x02ec;
    L_0x02e5:
        r1 = r0.f8675a;
        r3 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;
        mobi.mmdt.ott.provider.p386h.C2984c.m7464b(r1, r3);
    L_0x02ec:
        r1 = mobi.mmdt.ott.provider.p386h.C2988j.PUSH_TO_TALK;
        r2 = r24;
        r1 = r2.equals(r1);
        if (r1 == 0) goto L_0x0301;
    L_0x02f6:
        r1 = new mobi.mmdt.ott.logic.a.af.m;
        r2 = r0.f8675a;
        r4 = 1;
        r1.<init>(r2, r4);
        mobi.mmdt.ott.logic.C2808d.m7149c(r1);
    L_0x0301:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.logic.a.q.a.<init>(java.util.Map):void");
    }
}
