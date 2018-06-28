package mobi.mmdt.ott.provider.p384f;

import android.database.Cursor;
import android.net.Uri;
import java.util.ArrayList;
import java.util.HashMap;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.provider.p385g.C2981h;
import mobi.mmdt.ott.provider.p386h.C2985d;
import mobi.mmdt.ott.provider.p386h.C2987i;
import mobi.mmdt.ott.provider.p389k.C3000b;
import mobi.mmdt.ott.provider.p393o.C3012b;

public final class C2966b {
    public static int m7393a(String str, long j) {
        C6019d c6019d = new C6019d();
        c6019d.m13340a(C2971k.READ);
        C6021g c6021g = new C6021g();
        ((C6021g) ((C6021g) c6021g.m13390c(str).m7368c()).m13380a(C2971k.NOT_READ).m7368c()).m13385b(j);
        return c6019d.m13332a(c6021g);
    }

    public static int m7394a(String str, String str2) {
        StringBuilder stringBuilder = new StringBuilder("SELECT COUNT(*) FROM conversations WHERE conversations_party = '");
        stringBuilder.append(str);
        stringBuilder.append("' AND conversations_event_state <> '");
        stringBuilder.append(C2971k.DELETED.ordinal());
        stringBuilder.append("' AND conversations_send_time >=  ( SELECT conversations_send_time FROM conversations WHERE conversations_message_id = '");
        stringBuilder.append(str2);
        stringBuilder.append("'  ) ");
        C6020e b = new C6021g().m13384b(stringBuilder.toString());
        b.moveToFirst();
        int i = b.getInt(0);
        b.close();
        return i;
    }

    public static int m7395a(String str, String str2, long j) {
        C6019d c6019d = new C6019d();
        c6019d.m13346b(str2).m13349c(j);
        C6021g c6021g = new C6021g();
        c6021g.m13378a(str);
        return c6019d.m13332a(c6021g);
    }

    public static int m7396a(String[] strArr, C2971k c2971k) {
        C6019d c6019d = new C6019d();
        c6019d.m13340a(c2971k);
        C6021g c6021g = new C6021g();
        c6021g.m13378a(strArr);
        return c6019d.m13332a(c6021g);
    }

    public static Uri m7397a(String str, C2972l c2972l, String str2, long j, long j2, C2970j c2970j, C2971k c2971k, String str3, C2973m c2973m, String str4, Long l, String str5, String str6, String str7, boolean z) {
        String str8 = str3;
        String str9 = str4;
        String str10 = str6;
        String str11 = str7;
        if (C2966b.m7408b(str)) {
            throw new C2964a();
        }
        if (str8 != null) {
            if (str9 != null) {
                if (!str3.isEmpty()) {
                    if (!str4.isEmpty()) {
                        C6019d c6019d = new C6019d();
                        c6019d.m13337a(str).m13341a(c2972l).m13346b(str2.trim()).m13335a(j).m13345b(j2).m13339a(c2970j).m13340a(c2971k).m13356h(str8).m13347b(c2973m).m13357i(str9).m13336a(l).m13358j(str5).m13343a(z);
                        if (!(str10 == null || str6.isEmpty())) {
                            c6019d.m13352d(str10);
                        }
                        if (!(str11 == null || str7.isEmpty())) {
                            c6019d.m13359k(str11);
                        }
                        return MyApplication.m12952b().getContentResolver().insert(C2967c.f9203a, c6019d.m7350b());
                    }
                }
                throw new NullPointerException();
            }
        }
        throw new NullPointerException();
    }

    public static ArrayList<String> m7398a(String[] strArr) {
        C6021g c6021g = new C6021g();
        c6021g.m13378a(strArr);
        C6020e i = c6021g.m13393i();
        ArrayList<String> arrayList = new ArrayList();
        if (i.moveToFirst()) {
            do {
                arrayList.add(i.m13362b());
            } while (i.moveToNext());
        }
        i.close();
        return arrayList;
    }

    public static C2968f m7399a(long j) {
        C2968f c2968f;
        C6021g c6021g = new C6021g();
        c6021g.m13386b(j);
        C6020e i = c6021g.m13393i();
        if (i.moveToFirst()) {
            C2968f c2968f2 = new C2968f(i.m13361a(), i.m13362b(), i.m13363c(), i.m7352a("conversations_event"), i.m13364d(), i.m13365e(), i.m13369i(), i.m13370j(), i.m13371k(), i.m13373m(), i.m13372l(), i.m7354c("conversations_file_id"), i.m7352a("conversations_sticker_id"), i.m7352a("conversations_reply_message_id"), i.m7352a("conversations_extra"), i.m7352a("conversations_forward_user_id"), i.m13374n(), i.m7352a("conversations_forward_name"), i.m7354c("conversations_edit_time"), i.m7352a("conversations_forward_message_id"), i.m13368h(), i.m13366f(), i.m13367g());
        } else {
            c2968f = null;
        }
        i.close();
        return c2968f;
    }

    public static C2968f m7400a(String str) {
        C2968f c2968f;
        C6021g c6021g = new C6021g();
        c6021g.m13378a(str);
        C6020e i = c6021g.m13393i();
        if (i.moveToFirst()) {
            C2968f c2968f2 = new C2968f(i.m13361a(), i.m13362b(), i.m13363c(), i.m7352a("conversations_event"), i.m13364d(), i.m13365e(), i.m13369i(), i.m13370j(), i.m13371k(), i.m13373m(), i.m13372l(), i.m7354c("conversations_file_id"), i.m7352a("conversations_sticker_id"), i.m7352a("conversations_reply_message_id"), i.m7352a("conversations_extra"), i.m7352a("conversations_forward_user_id"), i.m13374n(), i.m7352a("conversations_forward_name"), i.m7354c("conversations_edit_time"), i.m7352a("conversations_forward_message_id"), i.m13368h(), i.m13366f(), i.m13367g());
        } else {
            c2968f = null;
        }
        i.close();
        return c2968f;
    }

    public static C7316h m7401a(String str, int i) {
        StringBuilder stringBuilder = new StringBuilder("SELECT conversations._id as _id,conversations_message_id,conversations_event_type,conversations_event,conversations_send_time,conversations_receive_time,conversations_likes,conversations_my_like,conversations_visits,conversations_my_visit,conversations_my_vote,conversations_is_need_notify,conversations_reply_message_id,conversations_link_preview,conversations_direction_type,conversations_event_state,conversations_party,conversations_peer_user_id,conversations_group_type,conversations_file_id,conversations_sticker_id,conversations_forward_user_id,conversations_forward_group_type,conversations_forward_name,conversations_forward_message_id,conversations_edit_time,conversations_extra,files_file_uri,files_type,files_name,files_size,files_progress,files_thumbnail_uri,files_download_state,files_thumbnail_download_state,files_duration,files_audio_playing_time,files_audio_state,files_image_width,files_image_height,stickers_sticker_id,stickers_package_id,stickers_sticker_version,stickers_original_uri,stickers_thumbnail_uri,stickers_ver_span,stickers_hor_span,stickers_view_multiplier,stickers_download_state,members_nick_name,members_avatar_url,members_avatar_thumbnail_url,members_user_id,members_is_local_user,members_last_online,members_last_position,members_can_reply,members_is_anouncer,members_local_name,members_local_phone_number,members_moto,members_is_pined,members_is_mute,members_local_image_uri,dialog_party,dialog_title,dialog_avatar_thumbnail_url,dialog_avatar_url,dialog_description,dialog_is_mute,dialog_is_pinned,dialog_my_role,dialog_creation_date,dialog_is_reply_allowed,dialog_show_all_messages,dialog_unread_messages_count,dialog_last_message_id,dialog_updated_at,dialog_link,dialog_state,dialog_last_position,dialog_extra,channel_owner,dialog_members_count,dialog_type,channel_type FROM (((( conversations LEFT JOIN files ON conversations_file_id = files._id) LEFT JOIN stickers ON conversations_sticker_id = stickers_complete_sticker_id) LEFT JOIN members ON conversations_peer_user_id = ");
        stringBuilder.append("members_user_id) LEFT JOIN dialogs ON conversations_party = dialog_party) WHERE conversations_party = '");
        stringBuilder.append(str);
        stringBuilder.append("' AND conversations_event_state <> '");
        stringBuilder.append(C2971k.DRAFT.ordinal());
        stringBuilder.append("' AND conversations_event_state <> '");
        stringBuilder.append(C2971k.DELETED.ordinal());
        stringBuilder.append("' AND conversations_event_type <> '");
        stringBuilder.append(C2972l.HEAD_MESSAGE.ordinal());
        stringBuilder.append("'");
        str = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(" ORDER BY conversations.conversations_send_time DESC  LIMIT ");
        stringBuilder.append(i);
        str = stringBuilder.toString();
        return new C7316h(C2967c.f9203a, str, C2967c.f9203a, C2985d.f9350a, C3012b.f9455a, C3000b.f9413a, C2981h.f9316a);
    }

    public static void m7402a(HashMap<String, Integer> hashMap, boolean z) {
        if (hashMap.size() != 0) {
            StringBuilder stringBuilder;
            String str = "";
            String str2 = "";
            int i = 1;
            for (String str3 : hashMap.keySet()) {
                StringBuilder stringBuilder2;
                StringBuilder stringBuilder3;
                if (i != 0) {
                    StringBuilder stringBuilder4 = new StringBuilder();
                    stringBuilder4.append(str);
                    stringBuilder4.append("'");
                    stringBuilder4.append(str3);
                    str = stringBuilder4.toString();
                    i = 0;
                } else {
                    stringBuilder2 = new StringBuilder();
                    stringBuilder2.append(str);
                    stringBuilder2.append("','");
                    stringBuilder2.append(str3);
                    str = stringBuilder2.toString();
                }
                Object obj = (Integer) hashMap.get(str3);
                if (obj.intValue() < 0) {
                    stringBuilder2 = new StringBuilder("LIKE COUNT BE NEGATIVE MessageId:");
                    stringBuilder2.append(str3);
                    C2480b.m6732a(stringBuilder2.toString());
                    obj = Integer.valueOf(0);
                }
                if (z) {
                    stringBuilder3 = new StringBuilder();
                    stringBuilder3.append(str2);
                    str2 = " WHEN conversations_forward_message_id = '";
                } else {
                    stringBuilder3 = new StringBuilder();
                    stringBuilder3.append(str2);
                    str2 = " WHEN conversations_message_id = '";
                }
                stringBuilder3.append(str2);
                stringBuilder3.append(str3);
                stringBuilder3.append("' THEN ");
                stringBuilder3.append(obj);
                str2 = stringBuilder3.toString();
            }
            StringBuilder stringBuilder5 = new StringBuilder();
            stringBuilder5.append(str);
            stringBuilder5.append("'");
            String stringBuilder6 = stringBuilder5.toString();
            StringBuilder stringBuilder7 = new StringBuilder("UPDATE conversations SET conversations_likes = CASE ");
            stringBuilder7.append(str2);
            stringBuilder7.append(" ELSE conversations_likes END WHERE ");
            str = stringBuilder7.toString();
            if (z) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                str = "conversations_forward_message_id IN (";
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                str = "conversations_message_id IN (";
            }
            stringBuilder.append(str);
            stringBuilder.append(stringBuilder6);
            stringBuilder.append(")");
            new C6021g().m13383a(stringBuilder.toString());
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized boolean m7403a(java.util.HashMap<java.lang.String, mobi.mmdt.ott.p246d.p247a.C2531b> r9) {
        /*
        r0 = mobi.mmdt.ott.provider.p384f.C2966b.class;
        monitor-enter(r0);
        r1 = r9.size();	 Catch:{ all -> 0x0162 }
        r2 = 0;
        if (r1 != 0) goto L_0x000c;
    L_0x000a:
        monitor-exit(r0);
        return r2;
    L_0x000c:
        r1 = new java.util.HashMap;	 Catch:{ all -> 0x0162 }
        r1.<init>();	 Catch:{ all -> 0x0162 }
        r3 = r9.keySet();	 Catch:{ all -> 0x0162 }
        r3 = r3.iterator();	 Catch:{ all -> 0x0162 }
    L_0x0019:
        r4 = r3.hasNext();	 Catch:{ all -> 0x0162 }
        if (r4 == 0) goto L_0x010b;
    L_0x001f:
        r4 = r3.next();	 Catch:{ all -> 0x0162 }
        r4 = (java.lang.String) r4;	 Catch:{ all -> 0x0162 }
        r4 = r9.get(r4);	 Catch:{ all -> 0x0162 }
        r4 = (mobi.mmdt.ott.p246d.p247a.C2531b) r4;	 Catch:{ all -> 0x0162 }
        r5 = r4.f8234h;	 Catch:{ all -> 0x0162 }
        if (r5 == 0) goto L_0x0105;
    L_0x002f:
        r5 = r4.f8236j;	 Catch:{ all -> 0x0162 }
        if (r5 != 0) goto L_0x0035;
    L_0x0033:
        goto L_0x0105;
    L_0x0035:
        r5 = r4.f8234h;	 Catch:{ all -> 0x0162 }
        r5 = r5.isEmpty();	 Catch:{ all -> 0x0162 }
        if (r5 != 0) goto L_0x00ff;
    L_0x003d:
        r5 = r4.f8236j;	 Catch:{ all -> 0x0162 }
        r5 = r5.isEmpty();	 Catch:{ all -> 0x0162 }
        if (r5 == 0) goto L_0x0047;
    L_0x0045:
        goto L_0x00ff;
    L_0x0047:
        r5 = new android.content.ContentValues;	 Catch:{ all -> 0x0162 }
        r5.<init>();	 Catch:{ all -> 0x0162 }
        r6 = "conversations_message_id";
        r7 = r4.f8227a;	 Catch:{ all -> 0x0162 }
        r5.put(r6, r7);	 Catch:{ all -> 0x0162 }
        r6 = "conversations_event_type";
        r7 = r4.f8228b;	 Catch:{ all -> 0x0162 }
        r7 = r7.ordinal();	 Catch:{ all -> 0x0162 }
        r7 = java.lang.Integer.valueOf(r7);	 Catch:{ all -> 0x0162 }
        r5.put(r6, r7);	 Catch:{ all -> 0x0162 }
        r6 = "conversations_event";
        r7 = r4.f8229c;	 Catch:{ all -> 0x0162 }
        r7 = r7.trim();	 Catch:{ all -> 0x0162 }
        r5.put(r6, r7);	 Catch:{ all -> 0x0162 }
        r6 = "conversations_send_time";
        r7 = r4.f8230d;	 Catch:{ all -> 0x0162 }
        r7 = java.lang.Long.valueOf(r7);	 Catch:{ all -> 0x0162 }
        r5.put(r6, r7);	 Catch:{ all -> 0x0162 }
        r6 = "conversations_receive_time";
        r7 = r4.f8231e;	 Catch:{ all -> 0x0162 }
        r7 = java.lang.Long.valueOf(r7);	 Catch:{ all -> 0x0162 }
        r5.put(r6, r7);	 Catch:{ all -> 0x0162 }
        r6 = "conversations_direction_type";
        r7 = r4.f8232f;	 Catch:{ all -> 0x0162 }
        r7 = r7.ordinal();	 Catch:{ all -> 0x0162 }
        r7 = java.lang.Integer.valueOf(r7);	 Catch:{ all -> 0x0162 }
        r5.put(r6, r7);	 Catch:{ all -> 0x0162 }
        r6 = "conversations_event_state";
        r7 = r4.f8233g;	 Catch:{ all -> 0x0162 }
        r7 = r7.ordinal();	 Catch:{ all -> 0x0162 }
        r7 = java.lang.Integer.valueOf(r7);	 Catch:{ all -> 0x0162 }
        r5.put(r6, r7);	 Catch:{ all -> 0x0162 }
        r6 = "conversations_party";
        r7 = r4.f8234h;	 Catch:{ all -> 0x0162 }
        r5.put(r6, r7);	 Catch:{ all -> 0x0162 }
        r6 = "conversations_group_type";
        r7 = r4.f8235i;	 Catch:{ all -> 0x0162 }
        r7 = r7.ordinal();	 Catch:{ all -> 0x0162 }
        r7 = java.lang.Integer.valueOf(r7);	 Catch:{ all -> 0x0162 }
        r5.put(r6, r7);	 Catch:{ all -> 0x0162 }
        r6 = "conversations_peer_user_id";
        r7 = r4.f8236j;	 Catch:{ all -> 0x0162 }
        r5.put(r6, r7);	 Catch:{ all -> 0x0162 }
        r6 = "conversations_file_id";
        r7 = r4.f8237k;	 Catch:{ all -> 0x0162 }
        r5.put(r6, r7);	 Catch:{ all -> 0x0162 }
        r6 = "conversations_sticker_id";
        r7 = r4.f8238l;	 Catch:{ all -> 0x0162 }
        r5.put(r6, r7);	 Catch:{ all -> 0x0162 }
        r6 = "conversations_reply_message_id";
        r7 = r4.f8239m;	 Catch:{ all -> 0x0162 }
        r5.put(r6, r7);	 Catch:{ all -> 0x0162 }
        r6 = "conversations_forward_user_id";
        r7 = r4.f8240n;	 Catch:{ all -> 0x0162 }
        r5.put(r6, r7);	 Catch:{ all -> 0x0162 }
        r6 = r4.f8241o;	 Catch:{ all -> 0x0162 }
        if (r6 == 0) goto L_0x00ed;
    L_0x00de:
        r6 = "conversations_forward_group_type";
        r7 = r4.f8241o;	 Catch:{ all -> 0x0162 }
        r7 = r7.ordinal();	 Catch:{ all -> 0x0162 }
        r7 = java.lang.Integer.valueOf(r7);	 Catch:{ all -> 0x0162 }
        r5.put(r6, r7);	 Catch:{ all -> 0x0162 }
    L_0x00ed:
        r6 = "conversations_is_need_notify";
        r7 = r4.f8243q;	 Catch:{ all -> 0x0162 }
        r7 = java.lang.Boolean.valueOf(r7);	 Catch:{ all -> 0x0162 }
        r5.put(r6, r7);	 Catch:{ all -> 0x0162 }
        r4 = r4.f8227a;	 Catch:{ all -> 0x0162 }
        r1.put(r4, r5);	 Catch:{ all -> 0x0162 }
        goto L_0x0019;
    L_0x00ff:
        r9 = new java.lang.NullPointerException;	 Catch:{ all -> 0x0162 }
        r9.<init>();	 Catch:{ all -> 0x0162 }
        throw r9;	 Catch:{ all -> 0x0162 }
    L_0x0105:
        r9 = new java.lang.NullPointerException;	 Catch:{ all -> 0x0162 }
        r9.<init>();	 Catch:{ all -> 0x0162 }
        throw r9;	 Catch:{ all -> 0x0162 }
    L_0x010b:
        r9 = r1.size();	 Catch:{ all -> 0x0162 }
        if (r9 <= 0) goto L_0x0160;
    L_0x0111:
        r9 = r1.size();	 Catch:{ all -> 0x0162 }
        r9 = new android.content.ContentValues[r9];	 Catch:{ all -> 0x0162 }
        r1 = r1.entrySet();	 Catch:{ all -> 0x0162 }
        r1 = r1.iterator();	 Catch:{ all -> 0x0162 }
        r3 = r2;
    L_0x0120:
        r4 = r1.hasNext();	 Catch:{ all -> 0x0162 }
        if (r4 == 0) goto L_0x0138;
    L_0x0126:
        r4 = r1.next();	 Catch:{ all -> 0x0162 }
        r4 = (java.util.Map.Entry) r4;	 Catch:{ all -> 0x0162 }
        r5 = r3 + 1;
        r4 = r4.getValue();	 Catch:{ all -> 0x0162 }
        r4 = (android.content.ContentValues) r4;	 Catch:{ all -> 0x0162 }
        r9[r3] = r4;	 Catch:{ all -> 0x0162 }
        r3 = r5;
        goto L_0x0120;
    L_0x0138:
        r1 = new mobi.mmdt.ott.provider.f.g;	 Catch:{ all -> 0x0162 }
        r1.<init>();	 Catch:{ all -> 0x0162 }
        r3 = mobi.mmdt.ott.MyApplication.m12952b();	 Catch:{ all -> 0x0162 }
        r3 = r3.getContentResolver();	 Catch:{ all -> 0x0162 }
        r4 = "mobi.mmdt.ott.provider";
        r3 = r3.acquireContentProviderClient(r4);	 Catch:{ all -> 0x0162 }
        if (r3 == 0) goto L_0x0160;
    L_0x014d:
        r4 = r3.getLocalContentProvider();	 Catch:{ all -> 0x0162 }
        r4 = (mobi.mmdt.ott.provider.OttProvider) r4;	 Catch:{ all -> 0x0162 }
        if (r4 == 0) goto L_0x015d;
    L_0x0155:
        r1 = r1.m7372g();	 Catch:{ all -> 0x0162 }
        r4.m7381b(r1, r9);	 Catch:{ all -> 0x0162 }
        r2 = 1;
    L_0x015d:
        r3.release();	 Catch:{ all -> 0x0162 }
    L_0x0160:
        monitor-exit(r0);
        return r2;
    L_0x0162:
        r9 = move-exception;
        monitor-exit(r0);
        throw r9;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.provider.f.b.a(java.util.HashMap):boolean");
    }

    public static C2968f[] m7404a(C2973m c2973m) {
        C6021g c6021g = new C6021g();
        C2971k[] c2971kArr = new C2971k[1];
        int i = 0;
        c2971kArr[0] = C2971k.SENDING;
        ((C6021g) c6021g.m13380a(c2971kArr).m7368c()).m13382a(c2973m).m13394j();
        C6020e i2 = c6021g.m13393i();
        C2968f[] c2968fArr = new C2968f[i2.getCount()];
        if (i2.moveToFirst()) {
            while (true) {
                int i3 = i + 1;
                c2968fArr[i] = new C2968f(i2.m13361a(), i2.m13362b(), i2.m13363c(), i2.m7352a("conversations_event"), i2.m13364d(), i2.m13365e(), i2.m13369i(), i2.m13370j(), i2.m13371k(), i2.m13373m(), i2.m13372l(), i2.m7354c("conversations_file_id"), i2.m7352a("conversations_sticker_id"), i2.m7352a("conversations_reply_message_id"), i2.m7352a("conversations_extra"), i2.m7352a("conversations_forward_user_id"), i2.m13374n(), i2.m7352a("conversations_forward_name"), i2.m7354c("conversations_edit_time"), i2.m7352a("conversations_forward_message_id"), i2.m13368h(), i2.m13366f(), i2.m13367g());
                if (!i2.moveToNext()) {
                    break;
                }
                i = i3;
            }
        }
        i2.close();
        return c2968fArr;
    }

    public static ArrayList<C2968f> m7405b(String[] strArr) {
        C6020e i;
        Throwable th;
        C6020e c6020e;
        Throwable th2;
        C6021g c6021g = new C6021g();
        c6021g.m13378a(strArr).m13394j();
        ArrayList<C2968f> arrayList = new ArrayList();
        try {
            i = c6021g.m13393i();
            try {
                if (i.moveToFirst()) {
                    do {
                        arrayList.add(new C2968f(i.m13361a(), i.m13362b(), i.m13363c(), i.m7352a("conversations_event"), i.m13364d(), i.m13365e(), i.m13369i(), i.m13370j(), i.m13371k(), i.m13373m(), i.m13372l(), i.m7354c("conversations_file_id"), i.m7352a("conversations_sticker_id"), i.m7352a("conversations_reply_message_id"), i.m7352a("conversations_extra"), i.m7352a("conversations_forward_user_id"), i.m13374n(), i.m7352a("conversations_forward_name"), i.m7354c("conversations_edit_time"), i.m7352a("conversations_forward_message_id"), i.m13368h(), i.m13366f(), i.m13367g()));
                    } while (i.moveToNext());
                }
                if (i != null) {
                    i.close();
                }
                return arrayList;
            } catch (Throwable th3) {
                th = th3;
                c6020e = i;
                th2 = th;
                if (c6020e != null) {
                    c6020e.close();
                }
                throw th2;
            }
        } catch (Throwable th4) {
            th = th4;
            i = null;
            c6020e = i;
            th2 = th;
            if (c6020e != null) {
                c6020e.close();
            }
            throw th2;
        }
    }

    public static C2968f m7406b(long j) {
        Throwable th;
        Throwable th2;
        C6021g c6021g = new C6021g();
        c6021g.m13377a(Long.valueOf(j));
        C6020e c6020e = null;
        try {
            C6020e i = c6021g.m13393i();
            try {
                if (i.moveToFirst()) {
                    C2968f c2968f = new C2968f(i.m13361a(), i.m13362b(), i.m13363c(), i.m7352a("conversations_event"), i.m13364d(), i.m13365e(), i.m13369i(), i.m13370j(), i.m13371k(), i.m13373m(), i.m13372l(), i.m7354c("conversations_file_id"), i.m7352a("conversations_sticker_id"), i.m7352a("conversations_reply_message_id"), i.m7352a("conversations_extra"), i.m7352a("conversations_forward_user_id"), i.m13374n(), i.m7352a("conversations_forward_name"), i.m7354c("conversations_edit_time"), i.m7352a("conversations_forward_message_id"), i.m13368h(), i.m13366f(), i.m13367g());
                }
                if (i != null) {
                    i.close();
                }
                return r2;
            } catch (Throwable th3) {
                th = th3;
                c6020e = i;
                th2 = th;
                if (c6020e != null) {
                    c6020e.close();
                }
                throw th2;
            }
        } catch (Throwable th4) {
            th = th4;
            th2 = th;
            if (c6020e != null) {
                c6020e.close();
            }
            throw th2;
        }
    }

    public static void m7407b(HashMap<String, Long> hashMap, boolean z) {
        if (hashMap.size() != 0) {
            StringBuilder stringBuilder;
            String str = "";
            String str2 = "";
            Object obj = 1;
            for (String str3 : hashMap.keySet()) {
                StringBuilder stringBuilder2;
                if (obj != null) {
                    StringBuilder stringBuilder3 = new StringBuilder();
                    stringBuilder3.append(str);
                    stringBuilder3.append("'");
                    stringBuilder3.append(str3);
                    str = stringBuilder3.toString();
                    obj = null;
                } else {
                    stringBuilder2 = new StringBuilder();
                    stringBuilder2.append(str);
                    stringBuilder2.append("','");
                    stringBuilder2.append(str3);
                    str = stringBuilder2.toString();
                }
                if (z) {
                    stringBuilder2 = new StringBuilder();
                    stringBuilder2.append(str2);
                    str2 = " WHEN conversations_forward_message_id = '";
                } else {
                    stringBuilder2 = new StringBuilder();
                    stringBuilder2.append(str2);
                    str2 = " WHEN conversations_message_id = '";
                }
                stringBuilder2.append(str2);
                stringBuilder2.append(str3);
                stringBuilder2.append("' THEN '");
                stringBuilder2.append(hashMap.get(str3));
                stringBuilder2.append("' ");
                str2 = stringBuilder2.toString();
            }
            StringBuilder stringBuilder4 = new StringBuilder();
            stringBuilder4.append(str);
            stringBuilder4.append("'");
            String stringBuilder5 = stringBuilder4.toString();
            StringBuilder stringBuilder6 = new StringBuilder("UPDATE conversations SET conversations_visits = CASE ");
            stringBuilder6.append(str2);
            stringBuilder6.append(" ELSE conversations_visits END WHERE ");
            str = stringBuilder6.toString();
            if (z) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                str = "conversations_forward_message_id IN (";
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                str = "conversations_message_id IN (";
            }
            stringBuilder.append(str);
            stringBuilder.append(stringBuilder5);
            stringBuilder.append(")");
            new C6021g().m13383a(stringBuilder.toString());
        }
    }

    public static boolean m7408b(String str) {
        C6021g c6021g = new C6021g();
        c6021g.m13378a(str);
        Cursor i = c6021g.m13393i();
        if (i.getCount() > 0) {
            i.close();
            return true;
        }
        i.close();
        return false;
    }

    public static int m7409c(String str) {
        C6019d c6019d = new C6019d();
        c6019d.m13340a(C2971k.DELETED);
        C6021g c6021g = new C6021g();
        c6021g.m13378a(str);
        return c6019d.m13332a(c6021g);
    }

    public static int m7410c(String[] strArr) {
        return new C6021g().m13378a(strArr).m7360a(MyApplication.m12952b());
    }

    public static int m7411d(String[] strArr) {
        C6019d c6019d = new C6019d();
        c6019d.m13340a(C2971k.DELETED);
        C6021g c6021g = new C6021g();
        c6021g.m13378a(strArr);
        return c6019d.m13332a(c6021g);
    }

    public static long m7412d(String str) {
        return (long) new C6021g().m13390c(str).m7360a(MyApplication.m12952b());
    }

    public static ArrayList<String> m7413e(String[] strArr) {
        C6021g c6021g = new C6021g();
        c6021g.m13378a(strArr);
        C6020e i = c6021g.m13393i();
        ArrayList<String> arrayList = new ArrayList();
        if (i.moveToFirst()) {
            do {
                C2973m n = i.m13374n();
                String str = null;
                if (n != null && n.equals(C2973m.CHANNEL) && i.m7352a("conversations_forward_message_id") != null) {
                    str = i.m7352a("conversations_forward_message_id");
                } else if (i.m13373m().equals(C2973m.CHANNEL)) {
                    str = i.m13362b();
                }
                if (str != null) {
                    Integer b = i.m7353b("conversations_my_visit");
                    if (b == null) {
                        throw new NullPointerException("The value of 'MY_VISIT' in the database was null, which is not allowed according to the model definition");
                    } else if (b.intValue() == 0) {
                        arrayList.add(str);
                    } else {
                        StringBuilder stringBuilder = new StringBuilder("@");
                        stringBuilder.append(str);
                        arrayList.add(stringBuilder.toString());
                    }
                }
            } while (i.moveToNext());
        }
        i.close();
        return arrayList;
    }

    public static C2968f m7414e(String str) {
        C6021g c6021g = new C6021g();
        C6021g b = ((C6021g) ((C6021g) c6021g.m13390c(str).m7368c()).m13381a(C2972l.NO_MESSAGE).m7368c()).m13388b(C2971k.DELETED);
        b.m7363a("conversations_send_time", true);
        b.m7362a(1);
        C6020e i = c6021g.m13393i();
        C2968f c2968f = null;
        if (i == null) {
            return null;
        }
        try {
            if (i.moveToFirst()) {
                C2968f c2968f2 = new C2968f(i.m13361a(), i.m13362b(), i.m13363c(), i.m7352a("conversations_event"), i.m13364d(), i.m13365e(), i.m13369i(), i.m13370j(), i.m13371k(), i.m13373m(), i.m13372l(), i.m7354c("conversations_file_id"), i.m7352a("conversations_sticker_id"), i.m7352a("conversations_reply_message_id"), i.m7352a("conversations_extra"), i.m7352a("conversations_forward_user_id"), i.m13374n(), i.m7352a("conversations_forward_name"), i.m7354c("conversations_edit_time"), i.m7352a("conversations_forward_message_id"), i.m13368h(), i.m13366f(), i.m13367g());
            }
            i.close();
            return c2968f;
        } catch (Throwable th) {
            Throwable th2 = th;
            i.close();
        }
    }

    public static int m7415f(String str) {
        C6019d c6019d = new C6019d();
        c6019d.m13340a(C2971k.READ);
        C6021g c6021g = new C6021g();
        ((C6021g) c6021g.m13390c(str).m7368c()).m13380a(C2971k.NOT_READ);
        return c6019d.m13332a(c6021g);
    }

    public static int m7416g(String str) {
        C6019d c6019d = new C6019d();
        c6019d.m13340a(C2971k.SEEN);
        C6021g c6021g = new C6021g();
        ((C6021g) ((C6021g) ((C6021g) ((C6021g) ((C6021g) c6021g.m13379a(C2970j.OUT).m7368c()).m13390c(str).m7368c()).m13388b(C2971k.DELETED).m7368c()).m13388b(C2971k.SEEN).m7368c()).m13388b(C2971k.ERROR).m7368c()).m13388b(C2971k.PENDING_RETRANSMIT);
        return c6019d.m13332a(c6021g);
    }

    public static int m7417h(String str) {
        StringBuilder stringBuilder = new StringBuilder("SELECT conversations_message_id,conversations_event_type,conversations_event,conversations_send_time,conversations_receive_time,conversations_likes,conversations_my_like,conversations_visits,conversations_my_visit,conversations_my_vote,conversations_is_need_notify,conversations_reply_message_id,conversations_link_preview,conversations_direction_type,conversations_event_state,conversations_party,conversations_peer_user_id,conversations_group_type,conversations_file_id,conversations_sticker_id,conversations_forward_user_id,conversations_forward_group_type,conversations_forward_name,conversations_forward_message_id,conversations_edit_time,conversations_extra,files_file_uri,files_type,files_name,files_size,files_progress,files_thumbnail_uri,files_download_state,files_thumbnail_download_state,files_duration,files_audio_playing_time,files_audio_state,files_image_width,files_image_height FROM ( conversations LEFT JOIN files ON conversations.conversations_file_id = files._id) WHERE conversations.conversations_party = '");
        stringBuilder.append(str);
        stringBuilder.append("' AND conversations.conversations_event_state <> ");
        stringBuilder.append(C2971k.DELETED.ordinal());
        stringBuilder.append(" AND (conversations.conversations_event_type = ");
        stringBuilder.append(C2972l.IMAGE.ordinal());
        stringBuilder.append(" OR conversations.conversations_event_type = ");
        stringBuilder.append(C2972l.VIDEO.ordinal());
        stringBuilder.append(" OR conversations.conversations_event_type = ");
        stringBuilder.append(C2972l.GIF.ordinal());
        stringBuilder.append(") AND (conversations.conversations_direction_type = ");
        stringBuilder.append(C2970j.OUT.ordinal());
        stringBuilder.append(" OR files.files_download_state = ");
        stringBuilder.append(C2987i.FINISHED.ordinal());
        stringBuilder.append(")");
        C6020e b = new C6021g().m13384b(stringBuilder.toString());
        int count = b.getCount();
        b.close();
        return count;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static mobi.mmdt.ott.provider.p384f.C2969i m7418i(java.lang.String r11) {
        /*
        r0 = new java.lang.StringBuilder;
        r1 = "SELECT conversations._id as _id,conversations_message_id,conversations_event_type,conversations_event,conversations_send_time,conversations_receive_time,conversations_likes,conversations_my_like,conversations_visits,conversations_my_visit,conversations_my_vote,conversations_is_need_notify,conversations_reply_message_id,conversations_link_preview,conversations_direction_type,conversations_event_state,conversations_party,conversations_peer_user_id,conversations_group_type,conversations_file_id,conversations_sticker_id,conversations_forward_user_id,conversations_forward_group_type,conversations_forward_name,conversations_forward_message_id,conversations_edit_time,conversations_extra,files_file_uri,files_type,files_name,files_size,files_progress,files_thumbnail_uri,files_download_state,files_thumbnail_download_state,files_duration,files_audio_playing_time,files_audio_state,files_image_width,files_image_height,stickers_sticker_id,stickers_package_id,stickers_sticker_version,stickers_original_uri,stickers_thumbnail_uri,stickers_ver_span,stickers_hor_span,stickers_view_multiplier,stickers_download_state,members_nick_name,members_avatar_url,members_avatar_thumbnail_url,members_user_id,members_is_local_user,members_last_online,members_last_position,members_can_reply,members_is_anouncer,members_local_name,members_local_phone_number,members_moto,members_is_pined,members_is_mute,members_local_image_uri FROM ((( conversations LEFT JOIN files ON conversations.conversations_file_id = files._id) LEFT JOIN stickers ON conversations.conversations_sticker_id = stickers_complete_sticker_id) LEFT JOIN members ON ";
        r0.<init>(r1);
        r1 = "conversations_peer_user_id = members_user_id) WHERE conversations.conversations_message_id = '";
        r0.append(r1);
        r0.append(r11);
        r11 = "'";
        r0.append(r11);
        r11 = r0.toString();
        r0 = new mobi.mmdt.ott.provider.f.g;
        r0.<init>();
        r11 = r0.m13384b(r11);
        r0 = r11.moveToFirst();
        if (r0 == 0) goto L_0x012d;
    L_0x0027:
        r0 = "members_user_id";
        r0 = r11.getColumnIndex(r0);
        r3 = r11.getString(r0);
        r0 = "conversations_party";
        r0 = r11.getColumnIndex(r0);
        r2 = r11.getString(r0);
        r0 = mobi.mmdt.ott.provider.p384f.C2973m.values();
        r1 = "conversations_group_type";
        r1 = r11.getColumnIndex(r1);
        r1 = r11.getInt(r1);
        r9 = r0[r1];
        r0 = mobi.mmdt.ott.provider.p384f.C2971k.values();
        r1 = "conversations_event_state";
        r1 = r11.getColumnIndex(r1);
        r1 = r11.getInt(r1);
        r10 = r0[r1];
        r0 = mobi.mmdt.ott.provider.p384f.C2970j.values();
        r1 = "conversations_direction_type";
        r1 = r11.getColumnIndex(r1);
        r1 = r11.getInt(r1);
        r0 = r0[r1];
        r1 = "members_is_local_user";
        r1 = r11.getColumnIndex(r1);
        r1 = r11.getInt(r1);
        if (r1 == 0) goto L_0x0079;
    L_0x0077:
        r1 = 1;
        goto L_0x007a;
    L_0x0079:
        r1 = 0;
    L_0x007a:
        r4 = "members_local_name";
        r4 = r11.getColumnIndex(r4);
        r4 = r11.getString(r4);
        r5 = "members_local_phone_number";
        r5 = r11.getColumnIndex(r5);
        r5 = r11.getString(r5);
        r6 = "members_nick_name";
        r6 = r11.getColumnIndex(r6);
        r6 = r11.getString(r6);
        r7 = mobi.mmdt.ott.provider.p384f.C2970j.IN;
        r0 = r0.equals(r7);
        if (r0 == 0) goto L_0x00ac;
    L_0x00a0:
        if (r1 == 0) goto L_0x00a7;
    L_0x00a2:
        r0 = mobi.mmdt.ott.view.tools.C4508f.m8221a(r4, r5);
        goto L_0x00ae;
    L_0x00a7:
        r0 = mobi.mmdt.ott.view.tools.C4508f.m8220a(r6);
        goto L_0x00ae;
    L_0x00ac:
        r0 = "You";
    L_0x00ae:
        r7 = r0;
        r0 = "conversations_event";
        r0 = r11.getColumnIndex(r0);
        r0 = r11.getString(r0);
        r1 = "files_file_uri";
        r1 = r11.getColumnIndex(r1);
        r1 = r11.getString(r1);
        r4 = "files_thumbnail_uri";
        r4 = r11.getColumnIndex(r4);
        r4 = r11.getString(r4);
        r5 = mobi.mmdt.ott.provider.p384f.C2972l.values();
        r6 = "conversations_event_type";
        r6 = r11.getColumnIndex(r6);
        r6 = r11.getInt(r6);
        r8 = r5[r6];
        r5 = mobi.mmdt.ott.provider.p384f.C2966b.C29651.f9202a;
        r6 = r8.ordinal();
        r5 = r5[r6];
        switch(r5) {
            case 1: goto L_0x00f9;
            case 2: goto L_0x00f5;
            case 3: goto L_0x00f1;
            case 4: goto L_0x00ed;
            case 5: goto L_0x00e9;
            default: goto L_0x00e8;
        };
    L_0x00e8:
        goto L_0x0100;
    L_0x00e9:
        r0 = 2131690382; // 0x7f0f038e float:1.9009806E38 double:1.0531949853E-314;
        goto L_0x00fc;
    L_0x00ed:
        r0 = 2131690387; // 0x7f0f0393 float:1.9009816E38 double:1.053194988E-314;
        goto L_0x00fc;
    L_0x00f1:
        r0 = 2131690389; // 0x7f0f0395 float:1.900982E38 double:1.053194989E-314;
        goto L_0x00fc;
    L_0x00f5:
        r0 = 2131690383; // 0x7f0f038f float:1.9009808E38 double:1.053194986E-314;
        goto L_0x00fc;
    L_0x00f9:
        r0 = 2131690385; // 0x7f0f0391 float:1.9009812E38 double:1.053194987E-314;
    L_0x00fc:
        r0 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r0);
    L_0x0100:
        r5 = mobi.mmdt.ott.provider.p384f.C2972l.STICKER;
        r5 = r8.equals(r5);
        if (r5 == 0) goto L_0x0123;
    L_0x0108:
        r0 = 2131690388; // 0x7f0f0394 float:1.9009818E38 double:1.0531949883E-314;
        r0 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r0);
        r1 = "stickers_original_uri";
        r1 = r11.getColumnIndex(r1);
        r1 = r11.getString(r1);
        r4 = "stickers_thumbnail_uri";
        r4 = r11.getColumnIndex(r4);
        r4 = r11.getString(r4);
    L_0x0123:
        r5 = r1;
        r6 = r4;
        r4 = r0;
        r0 = new mobi.mmdt.ott.provider.f.i;
        r1 = r0;
        r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10);
        goto L_0x012e;
    L_0x012d:
        r0 = 0;
    L_0x012e:
        r11.close();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.provider.f.b.i(java.lang.String):mobi.mmdt.ott.provider.f.i");
    }

    public static int m7419j(String str) {
        C6020e i;
        Throwable th;
        C6021g c6021g = new C6021g();
        String[] strArr = new String[1];
        int i2 = 0;
        strArr[0] = str;
        ((C6021g) ((C6021g) c6021g.m13390c(strArr).m7368c()).m13380a(C2971k.NOT_READ).m7368c()).m13379a(C2970j.IN);
        try {
            i = c6021g.m13393i();
            try {
                if (i.moveToFirst()) {
                    i2 = i.getCount();
                }
                if (i != null) {
                    i.close();
                }
                return i2;
            } catch (Throwable th2) {
                th = th2;
                if (i != null) {
                    i.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            i = null;
            if (i != null) {
                i.close();
            }
            throw th;
        }
    }
}
