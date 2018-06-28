package mobi.mmdt.ott.provider.p385g;

import android.content.ContentProvider;
import android.content.ContentProviderClient;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import mobi.mmdt.componentsutils.p232b.C2490h;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.lib_webservicescomponent.p257d.C2555a;
import mobi.mmdt.ott.p246d.p247a.C5773c;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p384f.C2966b;
import mobi.mmdt.ott.provider.p384f.C2967c;
import mobi.mmdt.ott.provider.p384f.C2968f;
import mobi.mmdt.ott.provider.p389k.C3000b;
import mobi.mmdt.ott.provider.p390l.C3004f;

public final class C2980g {
    public static int m7423a(String str, long j) {
        C6022i c6022i = new C6022i();
        c6022i.m13407b(j);
        C6024k c6024k = new C6024k();
        c6024k.m13440a(str);
        return c6022i.m13395a(MyApplication.m12952b(), c6024k);
    }

    public static long m7424a(String str, String str2, Long l) {
        if (str == null) {
            throw new NullPointerException();
        }
        C6022i c6022i = new C6022i();
        c6022i.m13418h(str2).m13407b(l.longValue());
        C6024k c6024k = new C6024k();
        c6024k.m13440a(str);
        return (long) c6022i.m13395a(MyApplication.m12952b(), c6024k);
    }

    public static long m7425a(String str, String str2, String str3, String str4, String str5, C3004f c3004f, int i, boolean z, String str6, boolean z2, C2974a c2974a, String str7, String str8) {
        String d = C2535a.m6888a().m6928d();
        C2555a.m6994a(d);
        C2555a.m6995a(str6, d.getBytes());
        str6 = C2555a.f8313b;
        C6022i c6022i = new C6022i();
        c6022i.m13412c(str3).m13409b(str2).m13415e(str4).m13416f(str5).m13404a(c3004f).m13400a(Integer.valueOf(i)).m13399a(Boolean.valueOf(z)).m13417g(str6).m13405a(z2).m13402a(c2974a).m13414d(str7).m13420j(str8);
        C6024k c6024k = new C6024k();
        c6024k.m13440a(str);
        return (long) c6022i.m13395a(MyApplication.m12952b(), c6024k);
    }

    public static long m7426a(String str, String str2, String str3, String str4, String str5, boolean z, String str6, String str7, C3004f c3004f) {
        C6022i c6022i = new C6022i();
        c6022i.m13412c(str3).m13409b(str2).m13415e(str4).m13416f(str5).m13399a(Boolean.valueOf(z)).m13414d(str6).m13420j(str7).m13404a(c3004f);
        C6024k c6024k = new C6024k();
        c6024k.m13440a(str);
        return (long) c6022i.m13395a(MyApplication.m12952b(), c6024k);
    }

    public static Uri m7427a(String str, long j, boolean z, boolean z2, int i, String str2, Long l) {
        return C2980g.m7429a(str, null, null, null, null, null, C3004f.ADMIN, null, j, 0, false, z, z2, false, i, str2, l, C2977d.f9306a, C2978e.SINGLE, null, null);
    }

    public static Uri m7428a(String str, String str2, String str3, String str4, String str5, String str6, long j, Long l, String str7, C3004f c3004f) {
        return C2980g.m7429a(str, str2, str3, str4, str5, str6, c3004f, null, j, 0, true, false, false, false, 0, null, l, C2977d.f9306a, C2978e.BOT, null, str7);
    }

    public static Uri m7429a(String str, String str2, String str3, String str4, String str5, String str6, C3004f c3004f, String str7, long j, int i, boolean z, boolean z2, boolean z3, boolean z4, int i2, String str8, Long l, int i3, C2978e c2978e, C2974a c2974a, String str9) {
        String str10 = str;
        if (C2980g.m7439b(str10)) {
            throw new C2975b();
        }
        if (str10 != null) {
            if (!str10.isEmpty()) {
                C6022i c6022i = new C6022i();
                c6022i.m13401a(str10).m13409b(str2).m13412c(str3).m13414d(str4).m13415e(str5).m13416f(str6).m13404a(c3004f).m13417g(str7).m13398a(j).m13400a(Integer.valueOf(i)).m13405a(z).m13399a(Boolean.valueOf(z2)).m13408b(Boolean.valueOf(z3)).m13411c(Boolean.valueOf(z4)).m13397a(i2).m13418h(str8).m13419i(null).m13407b(l.longValue()).m13406b(i3).m13403a(c2978e).m13402a(c2974a).m13420j(str9);
                return MyApplication.m12952b().getContentResolver().insert(C2981h.f9316a, c6022i.m7350b());
            }
        }
        throw new NullPointerException();
    }

    public static ArrayList<C2976c> m7430a(C2978e c2978e) {
        C6024k c6024k = new C6024k();
        c6024k.m13441a(c2978e);
        C6023j b = c6024k.m13442b(MyApplication.m12952b());
        ArrayList<C2976c> arrayList = new ArrayList();
        if (b.moveToFirst()) {
            do {
                String a = b.m13423a();
                String a2 = b.m7352a("dialog_title");
                String a3 = b.m7352a("dialog_description");
                String a4 = b.m7352a("dialog_link");
                String a5 = b.m7352a("dialog_avatar_url");
                String a6 = b.m7352a("dialog_avatar_thumbnail_url");
                C3004f b2 = b.m13424b();
                String a7 = b.m7352a("channel_owner");
                long c = b.m13425c();
                int d = b.m13426d();
                arrayList.add(new C2976c(a, a2, a3, a4, a5, a6, b2, a7, c, d, b.m13427e(), b.m13428f(), b.m13429g(), b.m13430h(), b.m13431i(), b.m7352a("dialog_last_message_id"), b.m7352a("dialog_last_position"), Long.valueOf(b.m13432j()), b.m13433k(), b.m13434l(), b.m13435m(), b.m7352a("dialog_extra"), b.m7352a("dialog_draft_data"), b.m13436n()));
            } while (b.moveToNext());
        }
        b.close();
        return arrayList;
    }

    public static HashMap<C2978e, Integer> m7431a() {
        C6023j a = new C6024k().m13437a("SELECT dialog_type, SUM(dialog_unread_messages_count) as dialog_unread_messages_count FROM dialogs WHERE dialog_is_mute = 0  GROUP BY dialog_type");
        HashMap<C2978e, Integer> hashMap = new HashMap();
        if (a.moveToFirst()) {
            do {
                Object obj = C2978e.values()[a.getInt(a.getColumnIndex("dialog_type"))];
                int i = a.getInt(a.getColumnIndex("dialog_unread_messages_count"));
                if (obj != null) {
                    hashMap.put(obj, Integer.valueOf(i));
                }
            } while (a.moveToNext());
        }
        a.close();
        return hashMap;
    }

    public static C2974a m7432a(boolean z, boolean z2) {
        return z ? z2 ? C2974a.OFFICIAL_PAYMENT : C2974a.OFFICIAL : z2 ? C2974a.PAYMENT : C2974a.NORMAL;
    }

    public static C2976c m7433a(String str) {
        C2976c c2976c;
        C6024k c6024k = new C6024k();
        StringBuilder stringBuilder = new StringBuilder("SELECT * FROM dialogs WHERE LOWER(dialog_party) = LOWER('");
        stringBuilder.append(str);
        stringBuilder.append("')");
        C6023j a = c6024k.m13437a(stringBuilder.toString());
        if (a.moveToFirst()) {
            String a2 = a.m13423a();
            String a3 = a.m7352a("dialog_title");
            String a4 = a.m7352a("dialog_description");
            String a5 = a.m7352a("dialog_link");
            String a6 = a.m7352a("dialog_avatar_url");
            String a7 = a.m7352a("dialog_avatar_thumbnail_url");
            C3004f b = a.m13424b();
            String a8 = a.m7352a("channel_owner");
            long c = a.m13425c();
            int d = a.m13426d();
            boolean e = a.m13427e();
            C2976c c2976c2 = new C2976c(a2, a3, a4, a5, a6, a7, b, a8, c, d, e, a.m13428f(), a.m13429g(), a.m13430h(), a.m13431i(), a.m7352a("dialog_last_message_id"), a.m7352a("dialog_last_position"), Long.valueOf(a.m13432j()), a.m13433k(), a.m13434l(), a.m13435m(), a.m7352a("dialog_extra"), a.m7352a("dialog_draft_data"), a.m13436n());
        } else {
            c2976c = null;
        }
        a.close();
        return c2976c;
    }

    public static C6023j m7434a(String str, int i) {
        str = C2979f.m7422a(C2490h.m6757a(str));
        StringBuilder stringBuilder = new StringBuilder("SELECT dialogs._id as _id,dialog_party,dialog_title,dialog_avatar_thumbnail_url,dialog_avatar_url,dialog_description,dialog_is_mute,dialog_is_pinned,dialog_my_role,dialog_creation_date,dialog_is_reply_allowed,dialog_show_all_messages,dialog_unread_messages_count,dialog_last_message_id,dialog_updated_at,dialog_link,dialog_state,dialog_last_position,dialog_extra,channel_owner,dialog_members_count,dialog_type,channel_type,dialog_keyboard,dialog_draft_data,members_nick_name,members_avatar_url,members_avatar_thumbnail_url,members_user_id,members_is_local_user,members_last_online,members_can_reply,members_is_anouncer,members_local_name,members_local_phone_number,members_is_new_user,members_is_deactivated_user,members_is_synced_contact,members_is_soroush_member,members_soroush_id,members_is_pined,members_last_position,members_is_mute,members_extra,members_local_image_uri FROM dialogs LEFT JOIN members ON dialog_party = members_user_id WHERE (dialog_type <> '");
        stringBuilder.append(C2978e.SINGLE.ordinal());
        stringBuilder.append("' AND dialog_my_role <> '");
        stringBuilder.append(C3004f.NONE.ordinal());
        stringBuilder.append("' AND LOWER(dialog_title) GLOB '");
        stringBuilder.append(str);
        stringBuilder.append("') OR LOWER(members_local_name) GLOB '");
        stringBuilder.append(str);
        stringBuilder.append("' OR LOWER(members_nick_name) GLOB '");
        stringBuilder.append(str);
        stringBuilder.append("'");
        String stringBuilder2 = stringBuilder.toString();
        StringBuilder stringBuilder3 = new StringBuilder("SELECT members._id as _id,dialog_party,dialog_title,dialog_avatar_thumbnail_url,dialog_avatar_url,dialog_description,dialog_is_mute,dialog_is_pinned,dialog_my_role,dialog_creation_date,dialog_is_reply_allowed,dialog_show_all_messages,dialog_unread_messages_count,dialog_last_message_id,dialog_updated_at,dialog_link,dialog_state,dialog_last_position,dialog_extra,channel_owner,dialog_members_count,dialog_type,channel_type,dialog_keyboard,dialog_draft_data,members_nick_name,members_avatar_url,members_avatar_thumbnail_url,members_user_id,members_is_local_user,members_last_online,members_can_reply,members_is_anouncer,members_local_name,members_local_phone_number,members_is_new_user,members_is_deactivated_user,members_is_synced_contact,members_is_soroush_member,members_soroush_id,members_is_pined,members_last_position,members_is_mute,members_extra,members_local_image_uri FROM members LEFT JOIN dialogs ON dialog_party = members_user_id WHERE members_is_soroush_member = '1' AND dialog_party IS NULL   AND (LOWER(members_local_name) GLOB '");
        stringBuilder3.append(str);
        stringBuilder3.append("' OR LOWER(members_nick_name) GLOB '");
        stringBuilder3.append(str);
        stringBuilder3.append("')");
        str = stringBuilder3.toString();
        stringBuilder3 = new StringBuilder();
        stringBuilder3.append(stringBuilder2);
        stringBuilder3.append(" UNION ");
        stringBuilder3.append(str);
        stringBuilder3.append(" LIMIT ");
        stringBuilder3.append(i);
        stringBuilder3.append(" COLLATE NOCASE");
        return new C6024k().m13437a(stringBuilder3.toString());
    }

    public static C7317l m7435a(C2978e... c2978eArr) {
        StringBuilder stringBuilder;
        String str = "";
        if (c2978eArr.length > 0) {
            Iterable arrayList = new ArrayList();
            for (C2978e ordinal : c2978eArr) {
                arrayList.add(Integer.valueOf(ordinal.ordinal()));
            }
            stringBuilder = new StringBuilder(" AND dialog_type IN (");
            stringBuilder.append(TextUtils.join(",", arrayList));
            stringBuilder.append(") ");
            str = stringBuilder.toString();
        }
        stringBuilder = new StringBuilder("SELECT dialogs._id as _id,dialog_party,dialog_title,dialog_avatar_thumbnail_url,dialog_avatar_url,dialog_description,dialog_is_mute,dialog_is_pinned,dialog_my_role,dialog_creation_date,dialog_is_reply_allowed,dialog_show_all_messages,dialog_unread_messages_count,dialog_last_message_id,dialog_updated_at,dialog_link,dialog_state,dialog_last_position,dialog_extra,channel_owner,dialog_members_count,dialog_type,channel_type,dialog_keyboard,dialog_draft_data,");
        stringBuilder.append(C2980g.m7441c("DIALOGS_MEMBERS"));
        stringBuilder.append(",conversations_message_id,conversations_event_type,conversations_event,conversations_send_time,conversations_receive_time,conversations_likes,conversations_my_like,conversations_visits,conversations_my_visit,conversations_my_vote,conversations_is_need_notify,conversations_reply_message_id,conversations_link_preview,conversations_direction_type,conversations_event_state,conversations_party,conversations_peer_user_id,conversations_group_type,conversations_file_id,conversations_sticker_id,conversations_forward_user_id,conversations_forward_group_type,conversations_forward_name,conversations_forward_message_id,conversations_edit_time,conversations_extra,");
        stringBuilder.append(C2980g.m7441c("CONVERSATIONS_MEMBERS"));
        stringBuilder.append(" FROM dialogs LEFT JOIN members DIALOGS_MEMBERS ON dialog_party = DIALOGS_MEMBERS_members_user_id LEFT JOIN conversations ON dialog_last_message_id = conversations_message_id LEFT JOIN members CONVERSATIONS_MEMBERS ON conversations_peer_user_id =CONVERSATIONS_MEMBERS_members_user_id WHERE (((dialog_type = '");
        stringBuilder.append(C2978e.CHANNEL.ordinal());
        stringBuilder.append("' OR dialog_type = '");
        stringBuilder.append(C2978e.BOT.ordinal());
        stringBuilder.append("') AND dialog_my_role <> '");
        stringBuilder.append(C3004f.NONE.ordinal());
        stringBuilder.append("') OR dialog_type <> '");
        stringBuilder.append(C2978e.CHANNEL.ordinal());
        stringBuilder.append("' AND dialog_type <> '");
        stringBuilder.append(C2978e.BOT.ordinal());
        stringBuilder.append("')");
        stringBuilder.append(str);
        stringBuilder.append(" GROUP BY dialog_party ORDER BY dialog_is_pinned DESC , dialog_updated_at DESC ");
        return new C7317l(C2967c.f9203a, stringBuilder.toString(), C2967c.f9203a, C3000b.f9413a, C2981h.f9316a);
    }

    public static void m7436a(ArrayList<C5773c> arrayList) {
        ContentValues[] contentValuesArr = new ContentValues[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            C5773c c5773c = (C5773c) it.next();
            contentValuesArr[i] = new ContentValues();
            String d = C2535a.m6888a().m6928d();
            C2555a.m6994a(d);
            C2555a.m6995a(c5773c.f9288h, d.getBytes());
            d = C2555a.f8313b;
            contentValuesArr[i].put("dialog_party", c5773c.f9281a);
            contentValuesArr[i].put("dialog_title", c5773c.f9282b);
            contentValuesArr[i].put("dialog_description", c5773c.f9283c);
            contentValuesArr[i].put("dialog_avatar_url", c5773c.f9285e);
            contentValuesArr[i].put("dialog_avatar_thumbnail_url", c5773c.f9286f);
            contentValuesArr[i].put("dialog_my_role", Integer.valueOf(c5773c.f9287g.ordinal()));
            contentValuesArr[i].put("dialog_is_mute", Boolean.valueOf(c5773c.f9292l));
            contentValuesArr[i].put("dialog_members_count", Integer.valueOf(c5773c.f9290j));
            contentValuesArr[i].put("dialog_creation_date", Long.valueOf(c5773c.f9289i.longValue()));
            contentValuesArr[i].put("dialog_is_reply_allowed", Boolean.valueOf(c5773c.f9291k));
            contentValuesArr[i].put("channel_owner", d);
            contentValuesArr[i].put("dialog_state", Integer.valueOf(c5773c.f9298r - 1));
            contentValuesArr[i].put("dialog_show_all_messages", Integer.valueOf(1));
            if (c5773c.f9300t != null) {
                contentValuesArr[i].put("dialog_extra", c5773c.f9301u);
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(c5773c.f9299s.ordinal());
            contentValuesArr[i].put("dialog_type", stringBuilder.toString());
            contentValuesArr[i].put("dialog_is_pinned", Boolean.valueOf(c5773c.f9293m));
            contentValuesArr[i].put("dialog_last_message_id", c5773c.f9295o);
            contentValuesArr[i].put("dialog_updated_at", c5773c.f9297q);
            contentValuesArr[i].put("dialog_link", c5773c.f9284d);
            if (c5773c.f9300t != null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(c5773c.f9300t.ordinal());
                contentValuesArr[i].put("channel_type", stringBuilder.toString());
            }
            i++;
        }
        C6024k c6024k = new C6024k();
        ContentProviderClient acquireContentProviderClient = MyApplication.m12952b().getContentResolver().acquireContentProviderClient("mobi.mmdt.ott.provider");
        if (acquireContentProviderClient != null) {
            ContentProvider localContentProvider = acquireContentProviderClient.getLocalContentProvider();
            if (localContentProvider != null) {
                localContentProvider.bulkInsert(c6024k.m7372g(), contentValuesArr);
            }
            acquireContentProviderClient.release();
        }
    }

    public static int m7437b(String str, String str2, Long l) {
        C6022i c6022i = new C6022i();
        c6022i.m13421k(str2);
        if (l != null) {
            c6022i.m13407b(l.longValue());
        }
        C6024k c6024k = new C6024k();
        c6024k.m13440a(str);
        return c6022i.m13395a(MyApplication.m12952b(), c6024k);
    }

    public static C6023j m7438b(String str, int i) {
        str = C2979f.m7422a(C2490h.m6757a(str));
        StringBuilder stringBuilder = new StringBuilder("SELECT dialogs._id as _id,dialog_party,dialog_title,dialog_avatar_thumbnail_url,dialog_avatar_url,dialog_description,dialog_is_mute,dialog_is_pinned,dialog_my_role,dialog_creation_date,dialog_is_reply_allowed,dialog_show_all_messages,dialog_unread_messages_count,dialog_last_message_id,dialog_updated_at,dialog_link,dialog_state,dialog_last_position,dialog_extra,channel_owner,dialog_members_count,dialog_type,channel_type,dialog_keyboard,dialog_draft_data,conversations_message_id,conversations_event_type,conversations_event,conversations_send_time,conversations_receive_time,conversations_likes,conversations_my_like,conversations_visits,conversations_my_visit,conversations_my_vote,conversations_is_need_notify,conversations_reply_message_id,conversations_link_preview,conversations_direction_type,conversations_event_state,conversations_party,conversations_peer_user_id,conversations_group_type,conversations_file_id,conversations_sticker_id,conversations_forward_user_id,conversations_forward_group_type,conversations_forward_name,conversations_forward_message_id,conversations_edit_time,conversations_extra,members_nick_name,members_avatar_url,members_avatar_thumbnail_url,members_user_id,members_is_local_user,members_last_online,members_can_reply,members_is_anouncer,members_local_name,members_local_phone_number,members_is_new_user,members_is_deactivated_user,members_is_synced_contact,members_is_soroush_member,members_soroush_id,members_is_pined,members_last_position,members_is_mute,members_extra,members_local_image_uri FROM dialogs LEFT JOIN conversations ON dialog_party = conversations_party LEFT JOIN members ON dialog_party = members_user_id WHERE dialog_my_role <> ");
        stringBuilder.append(C3004f.NONE.ordinal());
        stringBuilder.append(" AND (LOWER(conversations.conversations_event) GLOB '");
        stringBuilder.append(str);
        stringBuilder.append("')  ORDER BY conversations_send_time DESC , dialog_updated_at DESC  LIMIT ");
        stringBuilder.append(i);
        stringBuilder.append(" COLLATE NOCASE");
        return new C6024k().m13437a(stringBuilder.toString());
    }

    public static boolean m7439b(String str) {
        C6024k c6024k = new C6024k();
        c6024k.m13440a(str);
        C6023j b = c6024k.m13442b(MyApplication.m12952b());
        if (b.getCount() > 0) {
            b.close();
            return true;
        }
        b.close();
        return false;
    }

    public static int m7440c(String str, int i) {
        C6022i c6022i = new C6022i();
        c6022i.m13397a(i);
        C6024k c6024k = new C6024k();
        c6024k.m13440a(str);
        return c6022i.m13395a(MyApplication.m12952b(), c6024k);
    }

    public static String m7441c(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str.concat(".members_nick_name"));
        stringBuilder.append(" as ");
        stringBuilder.append(str.concat("_members_nick_name"));
        stringBuilder.append(",");
        stringBuilder.append(str.concat(".members_avatar_url"));
        stringBuilder.append(" as ");
        stringBuilder.append(str.concat("_members_avatar_url"));
        stringBuilder.append(",");
        stringBuilder.append(str.concat(".members_avatar_thumbnail_url"));
        stringBuilder.append(" as ");
        stringBuilder.append(str.concat("_members_avatar_thumbnail_url"));
        stringBuilder.append(",");
        stringBuilder.append(str.concat(".members_user_id"));
        stringBuilder.append(" as ");
        stringBuilder.append(str.concat("_members_user_id"));
        stringBuilder.append(",");
        stringBuilder.append(str.concat(".members_is_local_user"));
        stringBuilder.append(" as ");
        stringBuilder.append(str.concat("_members_is_local_user"));
        stringBuilder.append(",");
        stringBuilder.append(str.concat(".members_last_online"));
        stringBuilder.append(" as ");
        stringBuilder.append(str.concat("_members_last_online"));
        stringBuilder.append(",");
        stringBuilder.append(str.concat(".members_is_anouncer"));
        stringBuilder.append(" as ");
        stringBuilder.append(str.concat("_members_is_anouncer"));
        stringBuilder.append(",");
        stringBuilder.append(str.concat(".members_local_name"));
        stringBuilder.append(" as ");
        stringBuilder.append(str.concat("_members_local_name"));
        stringBuilder.append(",");
        stringBuilder.append(str.concat(".members_local_phone_number"));
        stringBuilder.append(" as ");
        stringBuilder.append(str.concat("_members_local_phone_number"));
        stringBuilder.append(",");
        stringBuilder.append(str.concat(".members_is_pined"));
        stringBuilder.append(" as ");
        stringBuilder.append(str.concat("_members_is_pined"));
        stringBuilder.append(",");
        stringBuilder.append(str.concat(".members_is_mute"));
        stringBuilder.append(" as ");
        stringBuilder.append(str.concat("_members_is_mute"));
        stringBuilder.append(",");
        stringBuilder.append(str.concat(".members_local_image_uri"));
        stringBuilder.append(" as ");
        stringBuilder.append(str.concat("_members_local_image_uri"));
        return stringBuilder.toString();
    }

    public static long m7442d(String str, int i) {
        C6022i c6022i = new C6022i();
        c6022i.m13406b(i);
        C6024k c6024k = new C6024k();
        c6024k.m13440a(str);
        return (long) c6022i.m13395a(MyApplication.m12952b(), c6024k);
    }

    public static C7317l m7443d(String str) {
        StringBuilder stringBuilder = new StringBuilder("SELECT dialogs._id as _id,dialog_party,dialog_title,dialog_avatar_thumbnail_url,dialog_avatar_url,dialog_description,dialog_is_mute,dialog_is_pinned,dialog_my_role,dialog_creation_date,dialog_is_reply_allowed,dialog_show_all_messages,dialog_unread_messages_count,dialog_last_message_id,dialog_updated_at,dialog_link,dialog_state,dialog_last_position,dialog_extra,channel_owner,dialog_members_count,dialog_type,channel_type,dialog_keyboard,dialog_draft_data FROM dialogs WHERE dialog_party = '");
        stringBuilder.append(str);
        stringBuilder.append("'");
        str = stringBuilder.toString();
        return new C7317l(C2981h.f9316a, str, C2981h.f9316a);
    }

    public static int m7444e(String str) {
        return new C6024k().m13440a(str).m7360a(MyApplication.m12952b());
    }

    public static int m7445f(String str) {
        C6024k c6024k = new C6024k();
        String[] strArr = new String[1];
        int i = 0;
        strArr[0] = str;
        c6024k.m13440a(strArr);
        C6023j b = c6024k.m13442b(MyApplication.m12952b());
        if (b.moveToFirst()) {
            i = b.m13431i();
        }
        b.close();
        return i;
    }

    public static void m7446g(String str) {
        C2968f e = C2966b.m7414e(str);
        C2976c a = C2980g.m7433a(str);
        if (a != null) {
            String str2;
            long longValue = a.f9297q.longValue();
            if (e != null) {
                String str3 = e.f9206b;
                long j = e.f9209e;
                str2 = str3;
                longValue = j;
            } else {
                str2 = null;
            }
            C2980g.m7424a(str, str2, Long.valueOf(longValue));
        }
    }

    public static void m7447h(String str) {
        C2980g.m7440c(str, C2966b.m7419j(str));
    }

    public static int m7448i(String str) {
        C2968f e = C2966b.m7414e(str);
        return e != null ? C2980g.m7437b(str, null, Long.valueOf(e.f9209e)) : C2980g.m7437b(str, null, null);
    }

    public static C7317l m7449j(String str) {
        StringBuilder stringBuilder = new StringBuilder("SELECT dialogs._id as _id,dialog_party,dialog_title,dialog_avatar_thumbnail_url,dialog_avatar_url,dialog_description,dialog_is_mute,dialog_is_pinned,dialog_my_role,dialog_creation_date,dialog_is_reply_allowed,dialog_show_all_messages,dialog_unread_messages_count,dialog_last_message_id,dialog_updated_at,dialog_link,dialog_state,dialog_last_position,dialog_extra,channel_owner,dialog_members_count,dialog_type,channel_type,dialog_keyboard,dialog_draft_data,");
        stringBuilder.append(C2980g.m7441c("DIALOGS_MEMBERS"));
        stringBuilder.append(",conversations_message_id,conversations_event_type,conversations_event,conversations_send_time,conversations_receive_time,conversations_likes,conversations_my_like,conversations_visits,conversations_my_visit,conversations_my_vote,conversations_is_need_notify,conversations_reply_message_id,conversations_link_preview,conversations_direction_type,conversations_event_state,conversations_party,conversations_peer_user_id,conversations_group_type,conversations_file_id,conversations_sticker_id,conversations_forward_user_id,conversations_forward_group_type,conversations_forward_name,conversations_forward_message_id,conversations_edit_time,conversations_extra,");
        stringBuilder.append(C2980g.m7441c("CONVERSATIONS_MEMBERS"));
        stringBuilder.append(" FROM dialogs LEFT JOIN members DIALOGS_MEMBERS ON dialog_party = DIALOGS_MEMBERS_members_user_id LEFT JOIN conversations ON dialog_last_message_id = conversations_message_id LEFT JOIN members CONVERSATIONS_MEMBERS ON conversations_peer_user_id =CONVERSATIONS_MEMBERS_members_user_id WHERE (dialogs.dialog_type");
        stringBuilder.append(" <> ");
        stringBuilder.append(C2978e.CHANNEL.ordinal());
        stringBuilder.append(" AND dialogs.dialog_state <> '");
        stringBuilder.append(C2977d.f9309d - 1);
        stringBuilder.append("') AND ( (dialogs.dialog_type = '");
        stringBuilder.append(C2978e.GROUP.ordinal());
        stringBuilder.append("' AND dialog_my_role <> '");
        stringBuilder.append(C3004f.NONE.ordinal());
        stringBuilder.append("' AND dialogs.dialog_title LIKE '%");
        stringBuilder.append(str);
        stringBuilder.append("%' )  OR ( dialogs.dialog_type = '");
        stringBuilder.append(C2978e.SINGLE.ordinal());
        stringBuilder.append("' AND ( ( DIALOGS_MEMBERS_members_is_local_user <> '0' AND DIALOGS_MEMBERS_members_local_name LIKE '%");
        stringBuilder.append(str);
        stringBuilder.append("%' ) OR ( DIALOGS_MEMBERS_members_is_local_user = '0' AND DIALOGS_MEMBERS_members_nick_name LIKE '%");
        stringBuilder.append(str);
        stringBuilder.append("%' ) )  )  )  GROUP BY dialogs.dialog_party ORDER BY dialog_is_pinned DESC , dialog_updated_at DESC LIMIT 100");
        str = stringBuilder.toString();
        return new C7317l(C2967c.f9203a, str, C2967c.f9203a, C3000b.f9413a, C2981h.f9316a);
    }

    public static int m7450k(String str) {
        int abs = Math.abs(1);
        String str2 = ";";
        if (abs < 0) {
            str2 = " AND dialog_unread_messages_count> '0';";
        }
        StringBuilder stringBuilder = new StringBuilder("UPDATE dialogs SET dialog_unread_messages_count = dialog_unread_messages_count + ");
        stringBuilder.append(abs);
        stringBuilder.append(" WHERE dialog_party LIKE '");
        stringBuilder.append(str);
        stringBuilder.append("' ");
        stringBuilder.append(str2);
        String stringBuilder2 = stringBuilder.toString();
        StringBuilder stringBuilder3 = new StringBuilder("SELECT dialog_unread_messages_count FROMdialogs WHERE dialog_party = '");
        stringBuilder3.append(str);
        stringBuilder3.append("';");
        str = stringBuilder3.toString();
        C6024k c6024k = new C6024k();
        int i = -1;
        StringBuilder stringBuilder4 = new StringBuilder();
        stringBuilder4.append(stringBuilder2);
        stringBuilder4.append(str);
        Cursor a = c6024k.m13437a(stringBuilder4.toString());
        if (a.moveToFirst()) {
            i = a.getInt(a.getColumnIndex("dialog_unread_messages_count"));
        }
        a.close();
        return i;
    }

    public static String m7451l(String str) {
        C6024k c6024k = new C6024k();
        c6024k.m13440a(str);
        C6023j b = c6024k.m13442b(MyApplication.m12952b());
        if (b == null || !b.moveToFirst()) {
            return null;
        }
        String a = b.m7352a("channel_owner");
        String d = C2535a.m6888a().m6928d();
        C2555a.m6994a(d);
        C2555a.m6996b(a, d.getBytes());
        a = C2555a.f8312a;
        b.close();
        return a;
    }

    public static long m7452m(String str) {
        C6022i c6022i = new C6022i();
        c6022i.m13413d(1);
        C6024k c6024k = new C6024k();
        c6024k.m13440a(str);
        return (long) c6022i.m13395a(MyApplication.m12952b(), c6024k);
    }
}
