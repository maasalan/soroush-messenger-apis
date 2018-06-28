package mobi.mmdt.ott.view.conversation.activities.p419a.p420a.p422b;

import android.database.Cursor;
import mobi.mmdt.ott.provider.p384f.C2972l;
import mobi.mmdt.ott.provider.p385g.C2978e;

public final class C3314b {

    static /* synthetic */ class C33121 {
        static final /* synthetic */ int[] f10159a = new int[C2978e.values().length];
        static final /* synthetic */ int[] f10160b = new int[C2972l.values().length];

        static {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r0 = mobi.mmdt.ott.provider.p384f.C2972l.values();
            r0 = r0.length;
            r0 = new int[r0];
            f10160b = r0;
            r0 = 1;
            r1 = f10160b;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = mobi.mmdt.ott.provider.p384f.C2972l.CALL;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = r2.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r1 = 2;
            r2 = f10160b;	 Catch:{ NoSuchFieldError -> 0x001f }
            r3 = mobi.mmdt.ott.provider.p384f.C2972l.FILE;	 Catch:{ NoSuchFieldError -> 0x001f }
            r3 = r3.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2[r3] = r1;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r2 = 3;
            r3 = f10160b;	 Catch:{ NoSuchFieldError -> 0x002a }
            r4 = mobi.mmdt.ott.provider.p384f.C2972l.PUSH_TO_TALK;	 Catch:{ NoSuchFieldError -> 0x002a }
            r4 = r4.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r3[r4] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r3 = 4;
            r4 = f10160b;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r5 = mobi.mmdt.ott.provider.p384f.C2972l.AUDIO;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r5 = r5.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r4[r5] = r3;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            r4 = f10160b;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r5 = mobi.mmdt.ott.provider.p384f.C2972l.IMAGE;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r5 = r5.ordinal();	 Catch:{ NoSuchFieldError -> 0x0040 }
            r6 = 5;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r4[r5] = r6;	 Catch:{ NoSuchFieldError -> 0x0040 }
        L_0x0040:
            r4 = f10160b;	 Catch:{ NoSuchFieldError -> 0x004b }
            r5 = mobi.mmdt.ott.provider.p384f.C2972l.VIDEO;	 Catch:{ NoSuchFieldError -> 0x004b }
            r5 = r5.ordinal();	 Catch:{ NoSuchFieldError -> 0x004b }
            r6 = 6;	 Catch:{ NoSuchFieldError -> 0x004b }
            r4[r5] = r6;	 Catch:{ NoSuchFieldError -> 0x004b }
        L_0x004b:
            r4 = f10160b;	 Catch:{ NoSuchFieldError -> 0x0056 }
            r5 = mobi.mmdt.ott.provider.p384f.C2972l.MISSED_CALL;	 Catch:{ NoSuchFieldError -> 0x0056 }
            r5 = r5.ordinal();	 Catch:{ NoSuchFieldError -> 0x0056 }
            r6 = 7;	 Catch:{ NoSuchFieldError -> 0x0056 }
            r4[r5] = r6;	 Catch:{ NoSuchFieldError -> 0x0056 }
        L_0x0056:
            r4 = f10160b;	 Catch:{ NoSuchFieldError -> 0x0062 }
            r5 = mobi.mmdt.ott.provider.p384f.C2972l.STICKER;	 Catch:{ NoSuchFieldError -> 0x0062 }
            r5 = r5.ordinal();	 Catch:{ NoSuchFieldError -> 0x0062 }
            r6 = 8;	 Catch:{ NoSuchFieldError -> 0x0062 }
            r4[r5] = r6;	 Catch:{ NoSuchFieldError -> 0x0062 }
        L_0x0062:
            r4 = f10160b;	 Catch:{ NoSuchFieldError -> 0x006e }
            r5 = mobi.mmdt.ott.provider.p384f.C2972l.TEXT;	 Catch:{ NoSuchFieldError -> 0x006e }
            r5 = r5.ordinal();	 Catch:{ NoSuchFieldError -> 0x006e }
            r6 = 9;	 Catch:{ NoSuchFieldError -> 0x006e }
            r4[r5] = r6;	 Catch:{ NoSuchFieldError -> 0x006e }
        L_0x006e:
            r4 = f10160b;	 Catch:{ NoSuchFieldError -> 0x007a }
            r5 = mobi.mmdt.ott.provider.p384f.C2972l.LOCATION;	 Catch:{ NoSuchFieldError -> 0x007a }
            r5 = r5.ordinal();	 Catch:{ NoSuchFieldError -> 0x007a }
            r6 = 10;	 Catch:{ NoSuchFieldError -> 0x007a }
            r4[r5] = r6;	 Catch:{ NoSuchFieldError -> 0x007a }
        L_0x007a:
            r4 = f10160b;	 Catch:{ NoSuchFieldError -> 0x0086 }
            r5 = mobi.mmdt.ott.provider.p384f.C2972l.VOTE;	 Catch:{ NoSuchFieldError -> 0x0086 }
            r5 = r5.ordinal();	 Catch:{ NoSuchFieldError -> 0x0086 }
            r6 = 11;	 Catch:{ NoSuchFieldError -> 0x0086 }
            r4[r5] = r6;	 Catch:{ NoSuchFieldError -> 0x0086 }
        L_0x0086:
            r4 = f10160b;	 Catch:{ NoSuchFieldError -> 0x0092 }
            r5 = mobi.mmdt.ott.provider.p384f.C2972l.NO_MESSAGE;	 Catch:{ NoSuchFieldError -> 0x0092 }
            r5 = r5.ordinal();	 Catch:{ NoSuchFieldError -> 0x0092 }
            r6 = 12;	 Catch:{ NoSuchFieldError -> 0x0092 }
            r4[r5] = r6;	 Catch:{ NoSuchFieldError -> 0x0092 }
        L_0x0092:
            r4 = f10160b;	 Catch:{ NoSuchFieldError -> 0x009e }
            r5 = mobi.mmdt.ott.provider.p384f.C2972l.REPORT;	 Catch:{ NoSuchFieldError -> 0x009e }
            r5 = r5.ordinal();	 Catch:{ NoSuchFieldError -> 0x009e }
            r6 = 13;	 Catch:{ NoSuchFieldError -> 0x009e }
            r4[r5] = r6;	 Catch:{ NoSuchFieldError -> 0x009e }
        L_0x009e:
            r4 = mobi.mmdt.ott.provider.p385g.C2978e.values();
            r4 = r4.length;
            r4 = new int[r4];
            f10159a = r4;
            r4 = f10159a;	 Catch:{ NoSuchFieldError -> 0x00b1 }
            r5 = mobi.mmdt.ott.provider.p385g.C2978e.SINGLE;	 Catch:{ NoSuchFieldError -> 0x00b1 }
            r5 = r5.ordinal();	 Catch:{ NoSuchFieldError -> 0x00b1 }
            r4[r5] = r0;	 Catch:{ NoSuchFieldError -> 0x00b1 }
        L_0x00b1:
            r0 = f10159a;	 Catch:{ NoSuchFieldError -> 0x00bb }
            r4 = mobi.mmdt.ott.provider.p385g.C2978e.GROUP;	 Catch:{ NoSuchFieldError -> 0x00bb }
            r4 = r4.ordinal();	 Catch:{ NoSuchFieldError -> 0x00bb }
            r0[r4] = r1;	 Catch:{ NoSuchFieldError -> 0x00bb }
        L_0x00bb:
            r0 = f10159a;	 Catch:{ NoSuchFieldError -> 0x00c5 }
            r1 = mobi.mmdt.ott.provider.p385g.C2978e.CHANNEL;	 Catch:{ NoSuchFieldError -> 0x00c5 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x00c5 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x00c5 }
        L_0x00c5:
            r0 = f10159a;	 Catch:{ NoSuchFieldError -> 0x00cf }
            r1 = mobi.mmdt.ott.provider.p385g.C2978e.BOT;	 Catch:{ NoSuchFieldError -> 0x00cf }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x00cf }
            r0[r1] = r3;	 Catch:{ NoSuchFieldError -> 0x00cf }
        L_0x00cf:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.conversation.activities.a.a.b.b.1.<clinit>():void");
        }
    }

    public interface C3313a {
        Cursor m7794a();
    }

    public static mobi.mmdt.ott.view.components.p401c.C6829g m7795a(android.content.Context r63, android.database.Cursor r64, int r65, java.lang.String r66, int r67, java.util.HashMap<java.lang.String, java.lang.Integer> r68) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:230:0x07c9 in {4, 5, 8, 11, 12, 15, 16, 23, 25, 26, 31, 32, 33, 37, 38, 39, 40, 43, 47, 52, 53, 54, 57, 60, 65, 66, 68, 71, 72, 75, 76, 79, 80, 81, 84, 85, 89, 92, 94, 95, 99, 100, 101, 104, 105, 108, 109, 113, 114, 115, 118, 119, 120, 121, 124, 126, 128, 129, 130, 131, 132, 135, 136, 139, 140, 141, 142, 143, 144, 145, 151, 154, 155, 156, 157, 168, 169, 170, 171, 172, 177, 178, 181, 182, 184, 188, 191, 192, 195, 196, 201, 202, 203, 204, 207, 208, 211, 212, 217, 218, 219, 220, 221, 222, 224, 227, 228, 229} preds:[]
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:129)
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:48)
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:38)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r1 = r63;
        r2 = r64;
        r4 = mobi.mmdt.ott.p246d.p248b.C2535a.m6888a();
        r4 = r4.m6919b();
        r5 = "_id";
        r5 = r2.getColumnIndex(r5);
        r5 = r2.getInt(r5);
        r6 = "dialog_party";
        r6 = r2.getColumnIndex(r6);
        r6 = r2.getString(r6);
        r7 = "conversations_peer_user_id";
        r7 = r2.getColumnIndex(r7);
        r7 = r2.getString(r7);
        if (r66 == 0) goto L_0x0035;
    L_0x002c:
        r8 = r66.isEmpty();
        if (r8 != 0) goto L_0x0035;
    L_0x0032:
        r8 = "conversations_send_time";
        goto L_0x0037;
    L_0x0035:
        r8 = "dialog_updated_at";
    L_0x0037:
        r8 = r2.getColumnIndex(r8);
        r8 = r2.getLong(r8);
        r10 = "dialog_unread_messages_count";
        r10 = r2.getColumnIndex(r10);
        r10 = r2.getInt(r10);
        r11 = "conversations_direction_type";
        r11 = r2.getColumnIndex(r11);
        r11 = r2.getInt(r11);
        r12 = "conversations_event_type";
        r12 = r2.getColumnIndex(r12);
        r12 = r2.getInt(r12);
        r13 = "conversations_event";
        r13 = r2.getColumnIndex(r13);
        r13 = r2.getString(r13);
        r14 = "conversations_event_state";
        r14 = r2.getColumnIndex(r14);
        r14 = r2.getInt(r14);
        if (r13 != 0) goto L_0x0079;
    L_0x0073:
        r12 = mobi.mmdt.ott.provider.p384f.C2972l.NO_MESSAGE;
        r12 = r12.ordinal();
    L_0x0079:
        r15 = "conversations_message_id";
        r15 = r2.getColumnIndex(r15);
        r15 = r2.getString(r15);
        r16 = r6;
        r6 = "dialog_is_mute";
        r6 = r2.getColumnIndex(r6);
        r6 = r2.getInt(r6);
        r17 = r11;
        if (r6 == 0) goto L_0x0095;
    L_0x0093:
        r6 = 1;
        goto L_0x0096;
    L_0x0095:
        r6 = 0;
    L_0x0096:
        r11 = "dialog_is_pinned";
        r11 = r2.getColumnIndex(r11);
        r11 = r2.getInt(r11);
        if (r11 <= 0) goto L_0x00a4;
    L_0x00a2:
        r11 = 1;
        goto L_0x00a5;
    L_0x00a4:
        r11 = 0;
    L_0x00a5:
        r19 = "";
        r20 = "";
        r21 = "";
        r22 = r6;
        r6 = "dialog_type";
        r6 = r2.getColumnIndex(r6);
        r6 = r2.getString(r6);
        r23 = r12;
        r12 = "dialog_draft_data";
        r12 = r2.getColumnIndex(r12);
        r12 = r2.getString(r12);
        r24 = r13;
        if (r12 == 0) goto L_0x00da;
    L_0x00c7:
        r13 = "";
        r13 = r12.equals(r13);
        if (r13 != 0) goto L_0x00da;
    L_0x00cf:
        r13 = new mobi.mmdt.ott.d.a.d;	 Catch:{ JSONException -> 0x00d5 }
        r13.<init>(r12);	 Catch:{ JSONException -> 0x00d5 }
        goto L_0x00db;
    L_0x00d5:
        r0 = move-exception;
        r12 = r0;
        r12.printStackTrace();
    L_0x00da:
        r13 = 0;
    L_0x00db:
        if (r13 == 0) goto L_0x0100;
    L_0x00dd:
        r12 = r13.f8244a;
        if (r12 != 0) goto L_0x00e5;
    L_0x00e1:
        r12 = r13.f8246c;
        if (r12 == 0) goto L_0x0100;
    L_0x00e5:
        r12 = mobi.mmdt.ott.provider.p384f.C2972l.DRAFT;
        r12 = r12.ordinal();
        r13 = r13.f8244a;
        r14 = mobi.mmdt.ott.provider.p384f.C2971k.DRAFT;
        r14 = r14.ordinal();
        r25 = r12;
        r12 = mobi.mmdt.ott.provider.p384f.C2970j.OUT;
        r12 = r12.ordinal();
        r17 = r12;
        r12 = r25;
        goto L_0x0104;
    L_0x0100:
        r12 = r23;
        r13 = r24;
    L_0x0104:
        if (r6 == 0) goto L_0x0118;
    L_0x0106:
        r26 = r15;
        r15 = java.lang.Integer.parseInt(r6);
        r27 = r11;
        r11 = mobi.mmdt.ott.provider.p385g.C2978e.values();
        r11 = r11.length;
        if (r15 < r11) goto L_0x0116;
    L_0x0115:
        goto L_0x011c;
    L_0x0116:
        r11 = 0;
        goto L_0x011d;
    L_0x0118:
        r27 = r11;
        r26 = r15;
    L_0x011c:
        r11 = 1;
    L_0x011d:
        r8 = mobi.mmdt.componentsutils.p232b.C2491i.m6829d(r1, r8, r4);
        r9 = "fa";
        r4 = r4.equals(r9);
        if (r4 == 0) goto L_0x012d;
    L_0x0129:
        r8 = mobi.mmdt.componentsutils.p232b.C2491i.m6814b(r8);
    L_0x012d:
        r4 = 41;
        r9 = r65;
        if (r9 != r4) goto L_0x016c;
    L_0x0133:
        if (r67 != 0) goto L_0x0137;
    L_0x0135:
        r4 = 1;
        goto L_0x016d;
    L_0x0137:
        r4 = 0;
        r9 = r4.m7794a();
        r4 = "dialog_type";
        r4 = r2.getColumnIndex(r4);
        r4 = r9.getString(r4);
        if (r4 == 0) goto L_0x0156;
    L_0x0148:
        r9 = java.lang.Integer.parseInt(r4);
        r15 = mobi.mmdt.ott.provider.p385g.C2978e.values();
        r15 = r15.length;
        if (r9 < r15) goto L_0x0154;
    L_0x0153:
        goto L_0x0156;
    L_0x0154:
        r9 = 0;
        goto L_0x0157;
    L_0x0156:
        r9 = 1;
    L_0x0157:
        if (r4 != 0) goto L_0x015c;
    L_0x0159:
        if (r11 != 0) goto L_0x015c;
    L_0x015b:
        goto L_0x0135;
    L_0x015c:
        if (r4 == 0) goto L_0x0161;
    L_0x015e:
        if (r9 == r11) goto L_0x0161;
    L_0x0160:
        goto L_0x0135;
    L_0x0161:
        if (r4 == 0) goto L_0x016c;
    L_0x0163:
        if (r6 == 0) goto L_0x016c;
    L_0x0165:
        r4 = r6.equals(r4);
        if (r4 != 0) goto L_0x016c;
    L_0x016b:
        goto L_0x0135;
    L_0x016c:
        r4 = 0;
    L_0x016d:
        if (r11 == 0) goto L_0x018a;
    L_0x016f:
        r7 = "DIALOGS_MEMBERS_members_user_id";
        r7 = r2.getColumnIndex(r7);
        r7 = r2.getString(r7);
        r41 = r8;
        r39 = r10;
        r40 = r14;
        r6 = r19;
        r9 = r20;
        r13 = r21;
        r8 = r22;
        r10 = 0;
        goto L_0x03ad;
    L_0x018a:
        r9 = mobi.mmdt.ott.provider.p385g.C2978e.values();
        r15 = "dialog_type";
        r15 = r2.getColumnIndex(r15);
        r15 = r2.getInt(r15);
        r9 = r9[r15];
        r15 = mobi.mmdt.ott.view.conversation.activities.p419a.p420a.p422b.C3314b.C33121.f10159a;
        r21 = r9.ordinal();
        r15 = r15[r21];
        switch(r15) {
            case 1: goto L_0x029d;
            case 2: goto L_0x0209;
            case 3: goto L_0x01ae;
            case 4: goto L_0x01ae;
            default: goto L_0x01a5;
        };
    L_0x01a5:
        r41 = r8;
        r39 = r10;
        r40 = r14;
    L_0x01ab:
        r6 = 0;
        goto L_0x02f2;
    L_0x01ae:
        r15 = "DIALOGS_MEMBERS_members_nick_name";
        r15 = r2.getColumnIndex(r15);
        r15 = r2.getString(r15);
        r6 = "DIALOGS_MEMBERS_members_local_name";
        r6 = r2.getColumnIndex(r6);
        r6 = r2.getString(r6);
        r39 = r10;
        r10 = "DIALOGS_MEMBERS_members_local_phone_number";
        r10 = r2.getColumnIndex(r10);
        r10 = r2.getString(r10);
        r40 = r14;
        r14 = "DIALOGS_MEMBERS_members_is_local_user";
        r14 = r2.getColumnIndex(r14);
        r14 = r2.getInt(r14);
        if (r14 == 0) goto L_0x01e0;
    L_0x01dc:
        r41 = r8;
        r14 = 1;
        goto L_0x01e3;
    L_0x01e0:
        r41 = r8;
        r14 = 0;
    L_0x01e3:
        r8 = "DIALOGS_MEMBERS_members_user_id";
        r8 = r2.getColumnIndex(r8);
        r2.getString(r8);
        if (r14 == 0) goto L_0x01f3;
    L_0x01ee:
        r6 = mobi.mmdt.ott.view.tools.C4508f.m8221a(r6, r10);
        goto L_0x01f7;
    L_0x01f3:
        r6 = mobi.mmdt.ott.view.tools.C4508f.m8220a(r15);
    L_0x01f7:
        r8 = "dialog_title";
        r8 = r8.trim();
        r8 = r2.getColumnIndex(r8);
        r8 = r2.getString(r8);
        r19 = r8;
        goto L_0x02f2;
    L_0x0209:
        r41 = r8;
        r39 = r10;
        r40 = r14;
        r6 = "dialog_title";
        r6 = r2.getColumnIndex(r6);
        r6 = r2.getString(r6);
        r8 = "CONVERSATIONS_MEMBERS_members_nick_name";
        r8 = r2.getColumnIndex(r8);
        r8 = r2.getString(r8);
        r10 = "CONVERSATIONS_MEMBERS_members_user_id";
        r10 = r2.getColumnIndex(r10);
        r10 = r2.getString(r10);
        r14 = "CONVERSATIONS_MEMBERS_members_is_local_user";
        r14 = r2.getColumnIndex(r14);
        r14 = r2.getInt(r14);
        if (r14 == 0) goto L_0x023b;
    L_0x0239:
        r14 = 1;
        goto L_0x023c;
    L_0x023b:
        r14 = 0;
    L_0x023c:
        r15 = mobi.mmdt.ott.p246d.p248b.C2535a.m6888a();
        r15 = r15.m6928d();
        if (r15 == 0) goto L_0x024c;
    L_0x0246:
        r10 = r15.equals(r10);
        if (r10 != 0) goto L_0x0254;
    L_0x024c:
        r10 = mobi.mmdt.ott.provider.p384f.C2972l.DRAFT;
        r10 = r10.ordinal();
        if (r12 != r10) goto L_0x025c;
    L_0x0254:
        r8 = 2131690577; // 0x7f0f0451 float:1.9010202E38 double:1.0531950817E-314;
        r8 = r1.getString(r8);
        goto L_0x027b;
    L_0x025c:
        if (r14 == 0) goto L_0x0277;
    L_0x025e:
        r8 = "CONVERSATIONS_MEMBERS_members_local_name";
        r8 = r2.getColumnIndex(r8);
        r8 = r2.getString(r8);
        r10 = "CONVERSATIONS_MEMBERS_members_local_phone_number";
        r10 = r2.getColumnIndex(r10);
        r10 = r2.getString(r10);
        r8 = mobi.mmdt.ott.view.tools.C4508f.m8221a(r8, r10);
        goto L_0x027b;
    L_0x0277:
        r8 = mobi.mmdt.ott.view.tools.C4508f.m8220a(r8);
    L_0x027b:
        if (r8 == 0) goto L_0x0295;
    L_0x027d:
        r10 = r8.isEmpty();
        if (r10 != 0) goto L_0x0295;
    L_0x0283:
        r10 = new java.lang.StringBuilder;
        r10.<init>();
        r10.append(r8);
        r8 = ": ";
        r10.append(r8);
        r8 = r10.toString();
        goto L_0x0297;
    L_0x0295:
        r8 = "";
    L_0x0297:
        r19 = r6;
        r20 = r8;
        goto L_0x01ab;
    L_0x029d:
        r41 = r8;
        r39 = r10;
        r40 = r14;
        r6 = "dialog_is_mute";
        r6 = r2.getColumnIndex(r6);
        r6 = r2.getInt(r6);
        if (r6 == 0) goto L_0x02b1;
    L_0x02af:
        r6 = 1;
        goto L_0x02b2;
    L_0x02b1:
        r6 = 0;
    L_0x02b2:
        r8 = "DIALOGS_MEMBERS_members_is_local_user";
        r8 = r2.getColumnIndex(r8);
        r8 = r2.getInt(r8);
        if (r8 == 0) goto L_0x02c0;
    L_0x02be:
        r8 = 1;
        goto L_0x02c1;
    L_0x02c0:
        r8 = 0;
    L_0x02c1:
        r10 = "DIALOGS_MEMBERS_members_local_name";
        r10 = r2.getColumnIndex(r10);
        r10 = r2.getString(r10);
        if (r8 == 0) goto L_0x02de;
    L_0x02cd:
        if (r10 == 0) goto L_0x02de;
    L_0x02cf:
        r8 = "DIALOGS_MEMBERS_members_local_phone_number";
        r8 = r2.getColumnIndex(r8);
        r8 = r2.getString(r8);
        r8 = mobi.mmdt.ott.view.tools.C4508f.m8221a(r10, r8);
        goto L_0x02ec;
    L_0x02de:
        r8 = "DIALOGS_MEMBERS_members_nick_name";
        r8 = r2.getColumnIndex(r8);
        r8 = r2.getString(r8);
        r8 = mobi.mmdt.ott.view.tools.C4508f.m8220a(r8);
    L_0x02ec:
        r22 = r6;
        r19 = r8;
        goto L_0x01ab;
    L_0x02f2:
        r8 = mobi.mmdt.ott.view.conversation.activities.p419a.p420a.p422b.C3314b.C33121.f10160b;
        r10 = mobi.mmdt.ott.provider.p384f.C2972l.values();
        r10 = r10[r12];
        r10 = r10.ordinal();
        r8 = r8[r10];
        switch(r8) {
            case 1: goto L_0x036b;
            case 2: goto L_0x035a;
            case 3: goto L_0x0356;
            case 4: goto L_0x0352;
            case 5: goto L_0x0346;
            case 6: goto L_0x033a;
            case 7: goto L_0x0336;
            case 8: goto L_0x0332;
            case 9: goto L_0x03a4;
            case 10: goto L_0x032e;
            case 11: goto L_0x0313;
            case 12: goto L_0x030e;
            case 13: goto L_0x0305;
            default: goto L_0x0303;
        };
    L_0x0303:
        goto L_0x03a4;
    L_0x0305:
        r8 = r63.getApplicationContext();
        r21 = mobi.mmdt.ott.view.tools.C4532q.m8242a(r8, r13, r9, r7, r6);
        goto L_0x0310;
    L_0x030e:
        r21 = "";
    L_0x0310:
        r20 = "";
        goto L_0x0361;
    L_0x0313:
        r6 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x031d }
        r6.<init>(r13);	 Catch:{ JSONException -> 0x031d }
        r13 = mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.base.PollUtils.PollDataParser(r6);	 Catch:{ JSONException -> 0x031d }
        goto L_0x0323;
    L_0x031d:
        r0 = move-exception;
        r6 = r0;
        mobi.mmdt.componentsutils.p232b.p235c.C2480b.m6738b(r6);
        r13 = 0;
    L_0x0323:
        if (r13 == 0) goto L_0x032a;
    L_0x0325:
        r6 = r13.f8400b;
        r13 = r6;
        goto L_0x03a4;
    L_0x032a:
        r6 = 2131690386; // 0x7f0f0392 float:1.9009814E38 double:1.0531949873E-314;
        goto L_0x035d;
    L_0x032e:
        r6 = 2131690384; // 0x7f0f0390 float:1.900981E38 double:1.0531949863E-314;
        goto L_0x035d;
    L_0x0332:
        r6 = 2131690388; // 0x7f0f0394 float:1.9009818E38 double:1.0531949883E-314;
        goto L_0x035d;
    L_0x0336:
        r6 = 2131690157; // 0x7f0f02ad float:1.900935E38 double:1.053194874E-314;
        goto L_0x035d;
    L_0x033a:
        if (r13 == 0) goto L_0x0342;
    L_0x033c:
        r6 = r13.isEmpty();
        if (r6 == 0) goto L_0x03a4;
    L_0x0342:
        r6 = 2131690389; // 0x7f0f0395 float:1.900982E38 double:1.053194989E-314;
        goto L_0x035d;
    L_0x0346:
        if (r13 == 0) goto L_0x034e;
    L_0x0348:
        r6 = r13.isEmpty();
        if (r6 == 0) goto L_0x03a4;
    L_0x034e:
        r6 = 2131690385; // 0x7f0f0391 float:1.9009812E38 double:1.053194987E-314;
        goto L_0x035d;
    L_0x0352:
        r6 = 2131689664; // 0x7f0f00c0 float:1.900835E38 double:1.0531946306E-314;
        goto L_0x035d;
    L_0x0356:
        r6 = 2131690546; // 0x7f0f0432 float:1.9010139E38 double:1.0531950663E-314;
        goto L_0x035d;
    L_0x035a:
        r6 = 2131690382; // 0x7f0f038e float:1.9009806E38 double:1.0531949853E-314;
    L_0x035d:
        r21 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r6);
    L_0x0361:
        r10 = r9;
        r7 = r16;
        r6 = r19;
        r9 = r20;
        r13 = r21;
        goto L_0x03ab;
    L_0x036b:
        if (r13 == 0) goto L_0x03a0;
    L_0x036d:
        r6 = ",";
        r6 = r13.split(r6);
        r7 = r6.length;
        r8 = 2;
        if (r7 != r8) goto L_0x03a4;
    L_0x0377:
        r7 = 0;
        r8 = r6[r7];
        r8 = r8.trim();
        r8 = r8.charAt(r7);
        r8 = java.lang.Character.isDigit(r8);
        if (r8 == 0) goto L_0x038c;
    L_0x0388:
        r8 = 1;
        r21 = r6[r8];
        goto L_0x0361;
    L_0x038c:
        r8 = 1;
        r10 = r6[r8];
        r8 = r10.trim();
        r8 = r8.charAt(r7);
        r8 = java.lang.Character.isDigit(r8);
        if (r8 == 0) goto L_0x03a4;
    L_0x039d:
        r21 = r6[r7];
        goto L_0x0361;
    L_0x03a0:
        r6 = 2131689711; // 0x7f0f00ef float:1.9008445E38 double:1.053194654E-314;
        goto L_0x035d;
    L_0x03a4:
        r10 = r9;
        r7 = r16;
        r6 = r19;
        r9 = r20;
    L_0x03ab:
        r8 = r22;
    L_0x03ad:
        r14 = mobi.mmdt.componentsutils.p232b.C2491i.m6806b(r1, r7);
        if (r66 == 0) goto L_0x03e3;
    L_0x03b3:
        r15 = r66.isEmpty();
        if (r15 != 0) goto L_0x03e3;
    L_0x03b9:
        if (r6 == 0) goto L_0x03dc;
    L_0x03bb:
        if (r13 == 0) goto L_0x03dc;
    L_0x03bd:
        r15 = r6.toLowerCase();
        r42 = r8;
        r8 = r66.toLowerCase();
        r8 = r15.contains(r8);
        if (r8 == 0) goto L_0x03de;
    L_0x03cd:
        r8 = r13.toLowerCase();
        r3 = r66.toLowerCase();
        r3 = r8.contains(r3);
        if (r3 != 0) goto L_0x03de;
    L_0x03db:
        goto L_0x03e5;
    L_0x03dc:
        r42 = r8;
    L_0x03de:
        r3 = r68;
        r8 = r26;
        goto L_0x03e8;
    L_0x03e3:
        r42 = r8;
    L_0x03e5:
        r3 = r68;
        r8 = 0;
    L_0x03e8:
        r3 = r3.containsKey(r7);
        if (r11 == 0) goto L_0x0475;
    L_0x03ee:
        r3 = "DIALOGS_MEMBERS__id";
        r3 = r2.getColumnIndex(r3);
        r29 = r2.getInt(r3);
        r3 = "DIALOGS_MEMBERS_members_moto";
        r3 = r2.getColumnIndex(r3);
        r33 = r2.getString(r3);
        r3 = "DIALOGS_MEMBERS_members_avatar_thumbnail_url";
        r3 = r2.getColumnIndex(r3);
        r34 = r2.getString(r3);
        r3 = "DIALOGS_MEMBERS_members_local_image_uri";
        r3 = r2.getColumnIndex(r3);
        r35 = r2.getString(r3);
        r3 = "DIALOGS_MEMBERS_members_user_id";
        r3 = r2.getColumnIndex(r3);
        r3 = r2.getString(r3);
        r36 = mobi.mmdt.componentsutils.p232b.C2491i.m6806b(r1, r3);
        r1 = "DIALOGS_MEMBERS_members_local_name";
        r1 = r2.getColumnIndex(r1);
        r1 = r2.getString(r1);
        r5 = "DIALOGS_MEMBERS_members_is_local_user";
        r5 = r2.getColumnIndex(r5);
        r5 = r2.getInt(r5);
        if (r5 == 0) goto L_0x043d;
    L_0x043a:
        r18 = 1;
        goto L_0x043f;
    L_0x043d:
        r18 = 0;
    L_0x043f:
        if (r18 == 0) goto L_0x0452;
    L_0x0441:
        if (r1 == 0) goto L_0x0452;
    L_0x0443:
        r5 = "DIALOGS_MEMBERS_members_local_phone_number";
        r5 = r2.getColumnIndex(r5);
        r5 = r2.getString(r5);
        r1 = mobi.mmdt.ott.view.tools.C4508f.m8221a(r1, r5);
        goto L_0x0460;
    L_0x0452:
        r1 = "DIALOGS_MEMBERS_members_nick_name";
        r1 = r2.getColumnIndex(r1);
        r1 = r2.getString(r1);
        r1 = mobi.mmdt.ott.view.tools.C4508f.m8220a(r1);
    L_0x0460:
        r32 = r1;
        r1 = new mobi.mmdt.ott.view.main.d.a.a.b;
        r37 = r64.getPosition();
        r28 = r1;
        r30 = r7;
        r31 = r3;
        r38 = r4;
        r28.<init>(r29, r30, r31, r32, r33, r34, r35, r36, r37, r38);
        r13 = r1;
        return r13;
    L_0x0475:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r1.append(r9);
        r1.append(r13);
        r1 = r1.toString();
        r9 = java.text.Normalizer.Form.NFD;
        r1 = java.text.Normalizer.normalize(r1, r9);
        r9 = "[\n]";
        r11 = " ";
        r1 = r1.replaceAll(r9, r11);
        r9 = mobi.mmdt.ott.view.conversation.activities.p419a.p420a.p422b.C3314b.C33121.f10159a;
        r10 = r10.ordinal();
        r9 = r9[r10];
        switch(r9) {
            case 1: goto L_0x0711;
            case 2: goto L_0x0681;
            case 3: goto L_0x058a;
            case 4: goto L_0x04a0;
            default: goto L_0x049d;
        };
    L_0x049d:
        r5 = 0;
        r13 = r5;
        return r13;
    L_0x04a0:
        r9 = "dialog_extra";
        r9 = r2.getColumnIndex(r9);
        r9 = r2.getInt(r9);
        r10 = "dialog_is_pinned";
        r10 = r2.getColumnIndex(r10);
        r10 = r2.getInt(r10);
        if (r10 == 0) goto L_0x04b8;
    L_0x04b6:
        r10 = 1;
        goto L_0x04b9;
    L_0x04b8:
        r10 = 0;
    L_0x04b9:
        r11 = mobi.mmdt.ott.provider.p390l.C3004f.values();
        r13 = "dialog_my_role";
        r13 = r2.getColumnIndex(r13);
        r13 = r2.getInt(r13);
        r11 = r11[r13];
        r13 = "dialog_avatar_thumbnail_url";
        r13 = r2.getColumnIndex(r13);
        r13 = r2.getString(r13);
        r15 = "dialog_is_mute";
        r15 = r2.getColumnIndex(r15);
        r15 = r2.getInt(r15);
        if (r15 == 0) goto L_0x04e3;
    L_0x04df:
        r43 = r3;
        r15 = 1;
        goto L_0x04e6;
    L_0x04e3:
        r43 = r3;
        r15 = 0;
    L_0x04e6:
        r3 = "dialog_last_position";
        r3 = r2.getColumnIndex(r3);
        r3 = r2.getString(r3);
        r44 = r9;
        r9 = mobi.mmdt.ott.provider.p390l.C3004f.ADMIN;
        if (r11 == r9) goto L_0x04ff;
    L_0x04f6:
        r9 = mobi.mmdt.ott.provider.p390l.C3004f.OWNER;
        if (r11 != r9) goto L_0x04fb;
    L_0x04fa:
        goto L_0x04ff;
    L_0x04fb:
        r45 = r11;
        r9 = 0;
        goto L_0x0502;
    L_0x04ff:
        r45 = r11;
        r9 = 1;
    L_0x0502:
        r11 = new mobi.mmdt.ott.view.conversation.activities.a.a.b.a$a;
        r46 = r9;
        r9 = 5;
        r47 = r3;
        r3 = mobi.mmdt.ott.provider.p385g.C2978e.CHANNEL;
        r2 = r64.getPosition();
        r11.<init>(r9, r7, r3, r2);
        r2 = r11.m7773a(r5);
        r2 = r2.m7774a(r6);
        r2 = r2.m7782b(r13);
        r3 = 0;
        r2 = r2.m7785c(r3);
        r2 = r2.m7781b(r14);
        r3 = r41;
        r2 = r2.m7787d(r3);
        r1 = r2.m7789e(r1);
        r2 = mobi.mmdt.ott.provider.p384f.C2971k.values();
        r2 = r2[r40];
        r1 = r1.m7776a(r2);
        r2 = mobi.mmdt.ott.provider.p384f.C2970j.values();
        r2 = r2[r17];
        r1 = r1.m7775a(r2);
        r2 = mobi.mmdt.ott.provider.p384f.C2972l.values();
        r2 = r2[r12];
        r1 = r1.m7777a(r2);
        r9 = r39;
        r1 = r1.m7784c(r9);
        r2 = 0;
        r1 = r1.m7780a(r2);
        r1 = r1.m7791f(r8);
        r1 = r1.m7783b(r4);
        r1 = r1.m7786c(r15);
        r1 = r1.m7788d(r10);
        r2 = r47;
        r1 = r1.m7793g(r2);
        r2 = mobi.mmdt.ott.provider.p385g.C2974a.values();
        r2 = r2[r44];
        r1 = r1.m7778a(r2);
        r2 = r46;
        r1 = r1.m7790e(r2);
        r2 = r45;
        r1 = r1.m7779a(r2);
        r10 = r43;
        goto L_0x067b;
    L_0x058a:
        r10 = r3;
        r9 = r39;
        r3 = r41;
        r11 = "channel_type";
        r11 = r2.getColumnIndex(r11);
        r11 = r2.getInt(r11);
        r13 = "dialog_is_pinned";
        r13 = r2.getColumnIndex(r13);
        r13 = r2.getInt(r13);
        if (r13 == 0) goto L_0x05a7;
    L_0x05a5:
        r13 = 1;
        goto L_0x05a8;
    L_0x05a7:
        r13 = 0;
    L_0x05a8:
        r15 = mobi.mmdt.ott.provider.p390l.C3004f.values();
        r48 = r10;
        r10 = "dialog_my_role";
        r10 = r2.getColumnIndex(r10);
        r10 = r2.getInt(r10);
        r10 = r15[r10];
        r15 = "dialog_avatar_thumbnail_url";
        r15 = r2.getColumnIndex(r15);
        r15 = r2.getString(r15);
        r49 = r11;
        r11 = "dialog_is_mute";
        r11 = r2.getColumnIndex(r11);
        r11 = r2.getInt(r11);
        if (r11 == 0) goto L_0x05d6;
    L_0x05d2:
        r50 = r13;
        r11 = 1;
        goto L_0x05d9;
    L_0x05d6:
        r50 = r13;
        r11 = 0;
    L_0x05d9:
        r13 = "dialog_last_position";
        r13 = r2.getColumnIndex(r13);
        r13 = r2.getString(r13);
        r51 = r13;
        r13 = mobi.mmdt.ott.provider.p390l.C3004f.ADMIN;
        if (r10 == r13) goto L_0x05f2;
    L_0x05e9:
        r13 = mobi.mmdt.ott.provider.p390l.C3004f.OWNER;
        if (r10 != r13) goto L_0x05ee;
    L_0x05ed:
        goto L_0x05f2;
    L_0x05ee:
        r52 = r10;
        r13 = 0;
        goto L_0x05f5;
    L_0x05f2:
        r52 = r10;
        r13 = 1;
    L_0x05f5:
        r10 = new mobi.mmdt.ott.view.conversation.activities.a.a.b.a$a;
        r53 = r13;
        r13 = 3;
        r54 = r11;
        r11 = mobi.mmdt.ott.provider.p385g.C2978e.CHANNEL;
        r2 = r64.getPosition();
        r10.<init>(r13, r7, r11, r2);
        r2 = r10.m7773a(r5);
        r2 = r2.m7774a(r6);
        r2 = r2.m7782b(r15);
        r5 = 0;
        r2 = r2.m7785c(r5);
        r2 = r2.m7781b(r14);
        r2 = r2.m7787d(r3);
        r1 = r2.m7789e(r1);
        r2 = mobi.mmdt.ott.provider.p384f.C2971k.values();
        r2 = r2[r40];
        r1 = r1.m7776a(r2);
        r2 = mobi.mmdt.ott.provider.p384f.C2970j.values();
        r2 = r2[r17];
        r1 = r1.m7775a(r2);
        r2 = mobi.mmdt.ott.provider.p384f.C2972l.values();
        r2 = r2[r12];
        r1 = r1.m7777a(r2);
        r1 = r1.m7784c(r9);
        r2 = 0;
        r1 = r1.m7780a(r2);
        r1 = r1.m7791f(r8);
        r1 = r1.m7783b(r4);
        r2 = r54;
        r1 = r1.m7786c(r2);
        r2 = r50;
        r1 = r1.m7788d(r2);
        r2 = r51;
        r1 = r1.m7793g(r2);
        r2 = mobi.mmdt.ott.provider.p385g.C2974a.values();
        r2 = r2[r49];
        r1 = r1.m7778a(r2);
        r2 = r53;
        r1 = r1.m7790e(r2);
        r2 = r52;
        r1 = r1.m7779a(r2);
        r10 = r48;
    L_0x067b:
        r1 = r1.m7792f(r10);
        goto L_0x070e;
    L_0x0681:
        r10 = r3;
        r9 = r39;
        r3 = r41;
        r11 = "dialog_avatar_thumbnail_url";
        r11 = r2.getColumnIndex(r11);
        r11 = r2.getString(r11);
        r13 = "dialog_last_position";
        r13 = r2.getColumnIndex(r13);
        r13 = r2.getString(r13);
        r15 = new mobi.mmdt.ott.view.conversation.activities.a.a.b.a$a;
        r55 = r10;
        r10 = mobi.mmdt.ott.provider.p385g.C2978e.GROUP;
        r2 = r64.getPosition();
        r56 = r13;
        r13 = 2;
        r15.<init>(r13, r7, r10, r2);
        r2 = r15.m7773a(r5);
        r2 = r2.m7774a(r6);
        r2 = r2.m7782b(r11);
        r5 = 0;
        r2 = r2.m7785c(r5);
        r2 = r2.m7781b(r14);
        r2 = r2.m7787d(r3);
        r1 = r2.m7789e(r1);
        r2 = mobi.mmdt.ott.provider.p384f.C2971k.values();
        r2 = r2[r40];
        r1 = r1.m7776a(r2);
        r2 = mobi.mmdt.ott.provider.p384f.C2970j.values();
        r2 = r2[r17];
        r1 = r1.m7775a(r2);
        r2 = mobi.mmdt.ott.provider.p384f.C2972l.values();
        r2 = r2[r12];
        r1 = r1.m7777a(r2);
        r1 = r1.m7784c(r9);
        r10 = 0;
        r1 = r1.m7780a(r10);
        r1 = r1.m7791f(r8);
        r1 = r1.m7783b(r4);
        r11 = r42;
        r1 = r1.m7786c(r11);
        r13 = r27;
        r1 = r1.m7788d(r13);
        r2 = r56;
        r1 = r1.m7793g(r2);
        r15 = r55;
        r1 = r1.m7792f(r15);
    L_0x070e:
        r13 = r1.f10158a;
        return r13;
    L_0x0711:
        r15 = r3;
        r13 = r27;
        r9 = r39;
        r3 = r41;
        r11 = r42;
        r10 = "DIALOGS_MEMBERS_members_avatar_thumbnail_url";
        r10 = r2.getColumnIndex(r10);
        r10 = r2.getString(r10);
        r57 = r15;
        r15 = "DIALOGS_MEMBERS_members_local_image_uri";
        r15 = r2.getColumnIndex(r15);
        r15 = r2.getString(r15);
        r58 = r13;
        r13 = "DIALOGS_MEMBERS_members_is_anouncer";
        r13 = r2.getColumnIndex(r13);
        r13 = r2.getInt(r13);
        if (r13 == 0) goto L_0x0742;
    L_0x073e:
        r59 = r11;
        r13 = 1;
        goto L_0x0745;
    L_0x0742:
        r59 = r11;
        r13 = 0;
    L_0x0745:
        r11 = "dialog_last_position";
        r11 = r2.getColumnIndex(r11);
        r11 = r2.getString(r11);
        r60 = r11;
        r11 = new mobi.mmdt.ott.view.conversation.activities.a.a.b.a$a;
        r61 = r4;
        r4 = mobi.mmdt.ott.provider.p385g.C2978e.SINGLE;
        r2 = r64.getPosition();
        r62 = r8;
        r8 = 1;
        r11.<init>(r8, r7, r4, r2);
        r2 = r11.m7773a(r5);
        r2 = r2.m7774a(r6);
        r2 = r2.m7782b(r10);
        r2 = r2.m7785c(r15);
        r2 = r2.m7781b(r14);
        r2 = r2.m7787d(r3);
        r1 = r2.m7789e(r1);
        r2 = mobi.mmdt.ott.provider.p384f.C2971k.values();
        r2 = r2[r40];
        r1 = r1.m7776a(r2);
        r2 = mobi.mmdt.ott.provider.p384f.C2970j.values();
        r2 = r2[r17];
        r1 = r1.m7775a(r2);
        r2 = mobi.mmdt.ott.provider.p384f.C2972l.values();
        r2 = r2[r12];
        r1 = r1.m7777a(r2);
        r1 = r1.m7784c(r9);
        r1 = r1.m7780a(r13);
        r2 = r62;
        r1 = r1.m7791f(r2);
        r2 = r61;
        r1 = r1.m7783b(r2);
        r2 = r59;
        r1 = r1.m7786c(r2);
        r2 = r58;
        r1 = r1.m7788d(r2);
        r2 = r60;
        r1 = r1.m7793g(r2);
        r2 = r57;
        r1 = r1.m7792f(r2);
        goto L_0x070e;
        return r13;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.conversation.activities.a.a.b.b.a(android.content.Context, android.database.Cursor, int, java.lang.String, int, java.util.HashMap):mobi.mmdt.ott.view.components.c.g");
    }
}
