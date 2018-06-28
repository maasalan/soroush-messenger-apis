package mobi.mmdt.ott.provider.p379a;

public final class C2941c {
    public static mobi.mmdt.ott.provider.p389k.C3001e m7333a(java.lang.String r30) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r0 = 0;
        r1 = "/data/data/mobi.mmdt.ott/databases/ott4.db";	 Catch:{ Exception -> 0x0148 }
        r2 = 17;	 Catch:{ Exception -> 0x0148 }
        r1 = android.database.sqlite.SQLiteDatabase.openDatabase(r1, r0, r2);	 Catch:{ Exception -> 0x0148 }
        r2 = new java.lang.StringBuilder;
        r3 = "SELECT * FROM members WHERE members_user_id = ";
        r2.<init>(r3);
        r3 = r30;
        r2.append(r3);
        r2 = r2.toString();
        r1 = r1.rawQuery(r2, r0);
        if (r1 == 0) goto L_0x0148;
    L_0x001f:
        r2 = r1.moveToFirst();
        if (r2 == 0) goto L_0x0145;
    L_0x0025:
        r2 = 0;
        r3 = r2;
    L_0x0027:
        r4 = "members_local_image_uri";
        r4 = r1.getColumnIndex(r4);
        r4 = r1.getString(r4);
        if (r4 == 0) goto L_0x0044;
    L_0x0033:
        r4 = "members_local_image_uri";
        r4 = r1.getColumnIndex(r4);
        r4 = r1.getString(r4);
        r4 = android.net.Uri.parse(r4);
        r19 = r4;
        goto L_0x0046;
    L_0x0044:
        r19 = r0;
    L_0x0046:
        r4 = "members_nick_name";
        r4 = r1.getColumnIndex(r4);
        r8 = r1.getString(r4);
        r4 = "members_avatar_url";
        r4 = r1.getColumnIndex(r4);
        r9 = r1.getString(r4);
        r4 = "members_avatar_thumbnail_url";
        r4 = r1.getColumnIndex(r4);
        r10 = r1.getString(r4);
        r4 = "members_user_id";
        r4 = r1.getColumnIndex(r4);
        r11 = r1.getString(r4);
        r4 = "members_local_phone_number";
        r4 = r1.getColumnIndex(r4);
        r12 = r1.getString(r4);
        r4 = "members_last_online";
        r4 = r1.getColumnIndex(r4);
        r4 = r1.getLong(r4);
        r13 = java.lang.Long.valueOf(r4);
        r4 = "members_is_local_user";
        r4 = r1.getColumnIndex(r4);
        r4 = r1.getInt(r4);
        r5 = 1;
        if (r4 == 0) goto L_0x0095;
    L_0x0093:
        r14 = r5;
        goto L_0x0096;
    L_0x0095:
        r14 = r2;
    L_0x0096:
        r4 = "members_is_anouncer";
        r4 = r1.getColumnIndex(r4);
        r4 = r1.getInt(r4);
        if (r4 == 0) goto L_0x00a4;
    L_0x00a2:
        r15 = r5;
        goto L_0x00a5;
    L_0x00a4:
        r15 = r2;
    L_0x00a5:
        r4 = "members_can_reply";
        r4 = r1.getColumnIndex(r4);
        r4 = r1.getInt(r4);
        if (r4 == 0) goto L_0x00b4;
    L_0x00b1:
        r16 = r5;
        goto L_0x00b6;
    L_0x00b4:
        r16 = r2;
    L_0x00b6:
        r4 = "members_local_name";
        r4 = r1.getColumnIndex(r4);
        r17 = r1.getString(r4);
        r4 = "members_moto";
        r4 = r1.getColumnIndex(r4);
        r18 = r1.getString(r4);
        r4 = "members_is_synced_contact";
        r4 = r1.getColumnIndex(r4);
        r4 = r1.getInt(r4);
        if (r4 == 0) goto L_0x00d9;
    L_0x00d6:
        r21 = r5;
        goto L_0x00db;
    L_0x00d9:
        r21 = r2;
    L_0x00db:
        r4 = "members_is_soroush_member";
        r4 = r1.getColumnIndex(r4);
        r4 = r1.getInt(r4);
        if (r4 == 0) goto L_0x00ea;
    L_0x00e7:
        r23 = r5;
        goto L_0x00ec;
    L_0x00ea:
        r23 = r2;
    L_0x00ec:
        r4 = "members_is_pined";
        r4 = r1.getColumnIndex(r4);
        r4 = r1.getInt(r4);
        if (r4 == 0) goto L_0x00fb;
    L_0x00f8:
        r24 = r5;
        goto L_0x00fd;
    L_0x00fb:
        r24 = r2;
    L_0x00fd:
        r4 = "members_standard_phone_number";
        r4 = r1.getColumnIndex(r4);
        r25 = r1.getString(r4);
        r4 = "members_last_position";
        r4 = r1.getColumnIndex(r4);
        r26 = r1.getString(r4);
        r4 = "members_is_mute";
        r4 = r1.getColumnIndex(r4);
        r4 = r1.getInt(r4);
        if (r4 == 0) goto L_0x0120;
    L_0x011d:
        r27 = r5;
        goto L_0x0122;
    L_0x0120:
        r27 = r2;
    L_0x0122:
        r4 = "members_soroush_id";
        r4 = r1.getColumnIndex(r4);
        r28 = r1.getString(r4);
        r4 = new mobi.mmdt.ott.provider.k.e;
        r29 = r3 + 1;
        r6 = (long) r3;
        r20 = 0;
        r22 = 0;
        r5 = r4;
        r5.<init>(r6, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28);
        r3 = r1.moveToNext();
        if (r3 != 0) goto L_0x0141;
    L_0x013f:
        r0 = r4;
        goto L_0x0145;
    L_0x0141:
        r3 = r29;
        goto L_0x0027;
    L_0x0145:
        r1.close();
    L_0x0148:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.provider.a.c.a(java.lang.String):mobi.mmdt.ott.provider.k.e");
    }
}
