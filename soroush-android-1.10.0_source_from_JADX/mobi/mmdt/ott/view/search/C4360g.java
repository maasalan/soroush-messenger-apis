package mobi.mmdt.ott.view.search;

import android.database.Cursor;
import java.util.Set;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p385g.C6024k;
import mobi.mmdt.ott.view.tools.p481e.C4505a;

final class C4360g {
    public static Cursor m8113a() {
        Set av = C2535a.m6888a().av();
        if (av != null) {
            if (av.size() != 0) {
                String[] strArr = (String[]) av.toArray(new String[av.size()]);
                StringBuilder stringBuilder = new StringBuilder();
                for (int i = 0; i < strArr.length - 1; i++) {
                    stringBuilder.append("dialog_party = '");
                    stringBuilder.append(strArr[i]);
                    stringBuilder.append("' OR ");
                }
                stringBuilder.append("dialog_party = '");
                stringBuilder.append(strArr[strArr.length - 1]);
                stringBuilder.append("'");
                StringBuilder stringBuilder2 = new StringBuilder("SELECT dialogs._id as _id,dialog_party,dialog_title,dialog_avatar_thumbnail_url,dialog_avatar_url,dialog_description,dialog_is_mute,dialog_is_pinned,dialog_my_role,dialog_creation_date,dialog_is_reply_allowed,dialog_show_all_messages,dialog_unread_messages_count,dialog_last_message_id,dialog_updated_at,dialog_link,dialog_state,dialog_last_position,dialog_extra,channel_owner,dialog_members_count,dialog_type,channel_type,dialog_keyboard,dialog_draft_data,members_nick_name,members_avatar_url,members_avatar_thumbnail_url,members_user_id,members_is_local_user,members_last_online,members_can_reply,members_is_anouncer,members_local_name,members_local_phone_number,members_is_new_user,members_is_deactivated_user,members_is_synced_contact,members_is_soroush_member,members_soroush_id,members_is_pined,members_last_position,members_is_mute,members_extra,members_local_image_uri FROM dialogs LEFT JOIN members ON dialog_party = members_user_id WHERE (");
                stringBuilder2.append(stringBuilder);
                stringBuilder2.append(");");
                return new C6024k().m13437a(stringBuilder2.toString());
            }
        }
        return null;
    }

    public static String m8114a(Cursor cursor) {
        String a = C4505a.m8203a(cursor, "dialog_party");
        if (a == null) {
            a = C4505a.m8203a(cursor, "members_user_id");
        }
        return a == null ? C4505a.m8203a(cursor, "party") : a;
    }
}
