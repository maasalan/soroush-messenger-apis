package mobi.mmdt.ott.provider.p379a;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import mobi.mmdt.ott.lib_webservicescomponent.p257d.C2555a;
import mobi.mmdt.ott.p246d.p247a.C5773c;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p384f.C2971k;
import mobi.mmdt.ott.provider.p384f.C2973m;
import mobi.mmdt.ott.provider.p385g.C2974a;
import mobi.mmdt.ott.provider.p385g.C2977d;
import mobi.mmdt.ott.provider.p385g.C2978e;
import mobi.mmdt.ott.provider.p390l.C3004f;

public final class C2939a {
    private static ConcurrentHashMap<String, Integer> f9156a = new ConcurrentHashMap();
    private static SQLiteDatabase f9157b;

    public static void m7331a(SQLiteDatabase sQLiteDatabase) {
        String string;
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        f9157b = sQLiteDatabase2;
        StringBuilder stringBuilder = new StringBuilder("SELECT conversations_party, _id, conversations_group_type, COUNT(_id) AS unread_count FROM conversations WHERE conversations_event_state = '");
        stringBuilder.append(C2971k.NOT_READ.ordinal());
        stringBuilder.append("' GROUP BY conversations_party");
        Cursor rawQuery = f9157b.rawQuery(stringBuilder.toString(), null);
        List<SimpleEntry> arrayList = new ArrayList();
        if (rawQuery != null) {
            if (rawQuery.moveToFirst()) {
                do {
                    string = rawQuery.getString(rawQuery.getColumnIndex("conversations_party"));
                    int i = rawQuery.getInt(rawQuery.getColumnIndex("unread_count"));
                    if (string != null) {
                        arrayList.add(new SimpleEntry(string, Integer.valueOf(i)));
                    }
                } while (rawQuery.moveToNext());
            }
            rawQuery.close();
        }
        for (SimpleEntry simpleEntry : arrayList) {
            f9156a.put(simpleEntry.getKey(), simpleEntry.getValue());
        }
        stringBuilder = new StringBuilder("SELECT conversations._id as _id,conversations_message_id,conversations_event_type,conversations_event,conversations_send_time,conversations_receive_time,conversations_likes,conversations_my_like,conversations_visits,conversations_my_visit,conversations_my_vote,conversations_is_need_notify,conversations_reply_message_id,conversations_link_preview,conversations_direction_type,conversations_event_state,conversations_party,conversations_peer_user_id,conversations_group_type,conversations_file_id,conversations_sticker_id,conversations_forward_user_id,conversations_forward_group_type,conversations_forward_name,conversations_forward_message_id,conversations_edit_time,conversations_extra,MAX (conversations.conversations_send_time) as MAX_DATE,members_nick_name,members_avatar_url,members_avatar_thumbnail_url,members_user_id,members_is_local_user,members_last_online,members_last_position,members_can_reply,members_is_anouncer,members_local_name,members_local_phone_number,members_moto,members_is_pined,members_is_mute,members_local_image_uri,PrivateGroups_group_id,PrivateGroups_name,PrivateGroups_avatar_url,PrivateGroups_thumbnail_url,PrivateGroups_description,PrivateGroups_is_mute,PrivateGroups_creation_date,PrivateGroups_last_position,PrivateGroups_is_pined,PrivateGroups_my_role,PrivateGroups_member_counts,PrivateGroups_extra,CHANNELS_name,CHANNELS_avatar_url,CHANNELS_avatar_thumbnail_url,CHANNELS_description,CHANNELS_is_mute,CHANNELS_last_position,CHANNELS_my_role,CHANNELS_is_pined,CHANNELS_extra,CHANNELS_channel_owner,CHANNELS_id,CHANNELS_followers,CHANNELS_creation_date,CHANNELS_is_reply_allowed,CHANNELS_channel_state,CHANNELS_channel_link,CHANNELS_show_all_msg, IfNull(CHANNELS_is_pined , IfNull(PrivateGroups_is_pined,members_is_pined)) as is_pined_conversation FROM ((( conversations LEFT JOIN members ON conversations_peer_user_id = members_user_id) LEFT JOIN ");
        stringBuilder.append("CHANNELS ON conversations_party = CHANNELS_id) LEFT JOIN PrivateGroups ON conversations_party = PrivateGroups_group_id) WHERE conversations_event_state <> '");
        stringBuilder.append(C2971k.DELETED.ordinal());
        stringBuilder.append("' AND ((conversations_group_type = '");
        stringBuilder.append(C2973m.CHANNEL.ordinal());
        stringBuilder.append("' AND CHANNELS_my_role <> '");
        stringBuilder.append(C3004f.NONE.ordinal());
        stringBuilder.append("') OR conversations_group_type <> '");
        stringBuilder.append(C2973m.CHANNEL.ordinal());
        stringBuilder.append("') GROUP BY conversations_party ORDER BY is_pined_conversation DESC , MAX_DATE DESC ");
        Cursor rawQuery2 = sQLiteDatabase2.rawQuery(stringBuilder.toString(), null);
        ArrayList arrayList2 = new ArrayList();
        if (rawQuery2.moveToFirst()) {
            while (true) {
                boolean z;
                C2978e c2978e;
                int i2;
                C3004f c3004f;
                String str;
                long j;
                String string2;
                String str2;
                String str3;
                String str4;
                String str5;
                String str6;
                String str7;
                int i3;
                boolean z2;
                boolean z3;
                C2974a c2974a;
                String str8 = "";
                int i4 = C2977d.f9306a;
                C3004f c3004f2 = C3004f.ADMIN;
                String str9 = "";
                Long.valueOf(0);
                String string3 = rawQuery2.getString(rawQuery2.getColumnIndex("conversations_party"));
                C2973m c2973m = C2973m.values()[rawQuery2.getInt(rawQuery2.getColumnIndex("conversations_group_type"))];
                if (c2973m != null) {
                    String str10;
                    String string4;
                    String string5;
                    String string6;
                    switch (c2973m) {
                        case SINGLE:
                            str10 = str8;
                            z = rawQuery2.getInt(rawQuery2.getColumnIndex("members_is_mute")) != 0;
                            c2978e = C2978e.SINGLE;
                            i2 = i4;
                            c3004f = C3004f.ADMIN;
                            str = str9;
                            j = 0;
                            string2 = rawQuery2.getString(rawQuery2.getColumnIndex("members_last_position"));
                            str2 = str10;
                            str3 = null;
                            str4 = null;
                            str5 = null;
                            str6 = null;
                            str7 = null;
                            i3 = 0;
                            z2 = false;
                            z3 = true;
                            break;
                        case GROUP:
                            boolean z4 = rawQuery2.getInt(rawQuery2.getColumnIndex("PrivateGroups_is_mute")) != 0;
                            string4 = rawQuery2.getString(rawQuery2.getColumnIndex("PrivateGroups_name"));
                            str9 = rawQuery2.getString(rawQuery2.getColumnIndex("PrivateGroups_description"));
                            string5 = rawQuery2.getString(rawQuery2.getColumnIndex("PrivateGroups_avatar_url"));
                            string6 = rawQuery2.getString(rawQuery2.getColumnIndex("PrivateGroups_thumbnail_url"));
                            int i5 = rawQuery2.getInt(rawQuery2.getColumnIndex("PrivateGroups_member_counts"));
                            C2978e c2978e2 = C2978e.GROUP;
                            long j2 = rawQuery2.getLong(rawQuery2.getColumnIndex("PrivateGroups_creation_date"));
                            C3004f c3004f3 = C3004f.values()[rawQuery2.getInt(rawQuery2.getColumnIndex("PrivateGroups_my_role"))];
                            str6 = rawQuery2.getString(rawQuery2.getColumnIndex("PrivateGroups_extra"));
                            str10 = str8;
                            string2 = rawQuery2.getString(rawQuery2.getColumnIndex("PrivateGroups_last_position"));
                            z = z4;
                            i2 = i4;
                            str7 = string6;
                            i3 = i5;
                            c2978e = c2978e2;
                            j = j2;
                            c3004f = c3004f3;
                            str = str6;
                            str2 = str10;
                            str5 = null;
                            z2 = false;
                            z3 = true;
                            c2974a = null;
                            str3 = string4;
                            str4 = str9;
                            str6 = string5;
                            break;
                        case CHANNEL:
                        case CHANNEL_DIRECT:
                        case CHANNEL_REPLY:
                            boolean z5 = rawQuery2.getInt(rawQuery2.getColumnIndex("CHANNELS_is_mute")) != 0;
                            string = rawQuery2.getString(rawQuery2.getColumnIndex("CHANNELS_name"));
                            string4 = rawQuery2.getString(rawQuery2.getColumnIndex("CHANNELS_channel_link"));
                            str9 = rawQuery2.getString(rawQuery2.getColumnIndex("CHANNELS_description"));
                            string5 = rawQuery2.getString(rawQuery2.getColumnIndex("CHANNELS_avatar_url"));
                            string6 = rawQuery2.getString(rawQuery2.getColumnIndex("CHANNELS_avatar_thumbnail_url"));
                            String string7 = rawQuery2.getString(rawQuery2.getColumnIndex("CHANNELS_channel_owner"));
                            int i6 = rawQuery2.getInt(rawQuery2.getColumnIndex("CHANNELS_followers"));
                            boolean z6 = rawQuery2.getInt(rawQuery2.getColumnIndex("CHANNELS_is_reply_allowed")) != 0;
                            boolean z7 = rawQuery2.getInt(rawQuery2.getColumnIndex("CHANNELS_show_all_msg")) != 0;
                            int i7 = C2977d.m7421a()[rawQuery2.getInt(rawQuery2.getColumnIndex("CHANNELS_channel_state"))];
                            C2978e c2978e3 = C2978e.CHANNEL;
                            C2974a c2974a2 = C2974a.values()[rawQuery2.getInt(rawQuery2.getColumnIndex("CHANNELS_extra"))];
                            long j3 = rawQuery2.getLong(rawQuery2.getColumnIndex("CHANNELS_creation_date"));
                            boolean z8 = z5;
                            C3004f c3004f4 = C3004f.values()[rawQuery2.getInt(rawQuery2.getColumnIndex("CHANNELS_my_role"))];
                            str3 = rawQuery2.getString(rawQuery2.getColumnIndex("CHANNELS_extra"));
                            C3004f c3004f5 = c3004f4;
                            string2 = rawQuery2.getString(rawQuery2.getColumnIndex("CHANNELS_last_position"));
                            i2 = i7;
                            c2974a = c2974a2;
                            str = str3;
                            i3 = i6;
                            z2 = z6;
                            z3 = z7;
                            c2978e = c2978e3;
                            j = j3;
                            z = z8;
                            c3004f = c3004f5;
                            str3 = string;
                            str5 = string4;
                            str4 = str9;
                            str6 = string5;
                            str7 = string6;
                            str2 = string7;
                            break;
                        default:
                            break;
                    }
                }
                i2 = i4;
                c3004f = c3004f2;
                str = str9;
                j = 0;
                str2 = str8;
                str3 = null;
                str4 = null;
                str5 = null;
                str6 = null;
                str7 = null;
                i3 = 0;
                z2 = false;
                z = false;
                z3 = true;
                string2 = null;
                c2978e = null;
                c2974a = null;
                arrayList2.add(new C5773c(string3, str3, str4, str5, str6, str7, c3004f, str2, j, i3, z2, z, rawQuery2.getInt(rawQuery2.getColumnIndex("is_pined_conversation")) != 0, z3, f9156a.containsKey(string3) ? ((Integer) f9156a.get(string3)).intValue() : 0, rawQuery2.getString(rawQuery2.getColumnIndex("conversations_message_id")), string2, Long.valueOf(rawQuery2.getLong(rawQuery2.getColumnIndex("conversations_send_time"))), i2, c2978e, c2974a, str));
                if (rawQuery2.moveToNext()) {
                }
            }
        }
        rawQuery2.close();
        C2939a.m7332a(arrayList2);
    }

    private static void m7332a(ArrayList<C5773c> arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C5773c c5773c = (C5773c) it.next();
            ContentValues contentValues = new ContentValues();
            String d = C2535a.m6888a().m6928d();
            C2555a.m6994a(d);
            C2555a.m6995a(c5773c.f9288h, d.getBytes());
            d = C2555a.f8313b;
            contentValues.put("dialog_party", c5773c.f9281a);
            contentValues.put("dialog_title", c5773c.f9282b);
            contentValues.put("dialog_description", c5773c.f9283c);
            contentValues.put("dialog_avatar_url", c5773c.f9285e);
            contentValues.put("dialog_avatar_thumbnail_url", c5773c.f9286f);
            contentValues.put("dialog_my_role", Integer.valueOf(c5773c.f9287g.ordinal()));
            contentValues.put("dialog_is_mute", Boolean.valueOf(c5773c.f9292l));
            contentValues.put("dialog_members_count", Integer.valueOf(c5773c.f9290j));
            contentValues.put("dialog_creation_date", Long.valueOf(c5773c.f9289i.longValue()));
            contentValues.put("dialog_is_reply_allowed", Boolean.valueOf(c5773c.f9291k));
            contentValues.put("channel_owner", d);
            contentValues.put("dialog_state", Integer.valueOf(c5773c.f9298r - 1));
            contentValues.put("dialog_show_all_messages", Integer.valueOf(1));
            if (c5773c.f9300t != null) {
                contentValues.put("dialog_extra", c5773c.f9301u);
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(c5773c.f9299s.ordinal());
            contentValues.put("dialog_type", stringBuilder.toString());
            contentValues.put("dialog_is_pinned", Boolean.valueOf(c5773c.f9293m));
            contentValues.put("dialog_last_message_id", c5773c.f9295o);
            contentValues.put("dialog_updated_at", c5773c.f9297q);
            contentValues.put("dialog_link", c5773c.f9284d);
            if (c5773c.f9300t != null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(c5773c.f9300t.ordinal());
                contentValues.put("channel_type", stringBuilder.toString());
            }
            f9157b.insert("dialogs", null, contentValues);
        }
    }
}
