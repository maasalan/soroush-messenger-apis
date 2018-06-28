package mobi.mmdt.ott.provider;

import android.database.sqlite.SQLiteDatabase;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.ott.provider.p395q.C3017a;

public class C2963e {
    private static final String f9201a = "e";

    public static void m7389a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DELETE FROM conversations");
        sQLiteDatabase.execSQL("DELETE FROM files");
        sQLiteDatabase.execSQL("DELETE FROM members");
        sQLiteDatabase.execSQL("DELETE FROM members_group");
        sQLiteDatabase.execSQL("DELETE FROM stickers");
        sQLiteDatabase.execSQL("DELETE FROM stickerspackage");
        sQLiteDatabase.execSQL("DELETE FROM syncedcontacts");
        sQLiteDatabase.execSQL("DELETE FROM userinchatstates");
        sQLiteDatabase.execSQL("DELETE FROM charge");
        sQLiteDatabase.execSQL("DELETE FROM bill");
        sQLiteDatabase.execSQL("DELETE FROM dialogs");
        sQLiteDatabase.execSQL("DELETE FROM suggestedchannels");
        C3017a.m7530a(sQLiteDatabase);
    }

    public static void m7390b(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DELETE FROM conversations");
        sQLiteDatabase.execSQL("DELETE FROM members_group");
        sQLiteDatabase.execSQL("DELETE FROM syncedcontacts");
        sQLiteDatabase.execSQL("DELETE FROM userinchatstates");
        sQLiteDatabase.execSQL("DELETE FROM dialogs");
    }

    public static void m7391c(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS conversations");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS files");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS CHANNELS");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS PrivateGroups");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS members");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS members_group");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS stickers");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS stickerspackage");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS syncedcontacts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS userinchatstates");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS charge");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS bill");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS dialogs");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS suggestedchannels");
    }

    public static void m7392d(SQLiteDatabase sQLiteDatabase) {
        StringBuilder stringBuilder = new StringBuilder("*** CREATE TABLES ");
        stringBuilder.append(sQLiteDatabase);
        C2480b.m6742f(stringBuilder.toString());
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS conversations ( _id INTEGER PRIMARY KEY AUTOINCREMENT, conversations_message_id TEXT NOT NULL, conversations_event_type INTEGER NOT NULL, conversations_event TEXT, conversations_send_time INTEGER NOT NULL, conversations_receive_time INTEGER NOT NULL, conversations_my_vote TEXT, conversations_my_like INTEGER  DEFAULT 0, conversations_likes INTEGER NOT NULL DEFAULT 0, conversations_visits INTEGER  DEFAULT 0, conversations_my_visit INTEGER  DEFAULT 0, conversations_is_need_notify INTEGER  DEFAULT 0, conversations_forward_user_id TEXT, conversations_forward_name TEXT, conversations_forward_group_type INTEGER, conversations_forward_message_id TEXT, conversations_is_seen_send INTEGER DEFAULT 0, conversations_direction_type INTEGER NOT NULL, conversations_event_state INTEGER NOT NULL, conversations_party TEXT NOT NULL, conversations_peer_user_id TEXT NOT NULL, conversations_group_type INTEGER NOT NULL, conversations_reply_message_id TEXT, conversations_link_preview TEXT, conversations_file_id INTEGER, conversations_sticker_id TEXT, conversations_edit_time INTEGER, conversations_extra TEXT , CONSTRAINT unique_message_id UNIQUE (conversations_message_id) );");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS files ( _id INTEGER PRIMARY KEY AUTOINCREMENT, files_file_uri TEXT, files_file_url TEXT, files_server_file_id TEXT, files_type INTEGER NOT NULL, files_name TEXT NOT NULL, files_size INTEGER NOT NULL, files_progress INTEGER NOT NULL, files_thumbnail_uri TEXT, files_thumbnail_url TEXT, files_duration INTEGER, files_download_state INTEGER NOT NULL, files_thumbnail_download_state INTEGER NOT NULL, files_audio_state INTEGER, files_audio_playing_time INTEGER NOT NULL, files_image_width INTEGER DEFAULT 0, files_image_height INTEGER DEFAULT 0, files_download_task_id INTEGER DEFAULT 0, files_extra TEXT  );");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS members ( _id INTEGER PRIMARY KEY AUTOINCREMENT, members_nick_name TEXT, members_avatar_url TEXT, members_avatar_thumbnail_url TEXT, members_user_id TEXT NOT NULL, members_soroush_id TEXT, members_standard_phone_number TEXT, members_local_phone_number TEXT, members_last_online INTEGER DEFAULT -1, members_is_local_user INTEGER NOT NULL, members_can_reply INTEGER NOT NULL, members_is_anouncer INTEGER NOT NULL, members_local_name TEXT, members_moto TEXT, members_last_position TEXT, members_local_image_uri TEXT, members_is_new_user INTEGER NOT NULL ,members_is_synced_contact INTEGER NOT NULL, members_is_soroush_member INTEGER DEFAULT 0, members_is_pined INTEGER DEFAULT 0, members_is_mute INTEGER DEFAULT 0, members_is_deactivated_user INTEGER NOT NULL, members_extra TEXT, members_weight INTEGER NOT NULL, CONSTRAINT unique_user_id UNIQUE (members_user_id) ON CONFLICT REPLACE );");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS members_group ( _id INTEGER PRIMARY KEY AUTOINCREMENT, members_group_group_id TEXT NOT NULL, members_group_user_id TEXT NOT NULL, members_group_user_role INTEGER NOT NULL, members_group_added_by_me INTEGER NOT NULL, members_group_extra TEXT , CONSTRAINT unique_user_group UNIQUE (members_group_group_id, members_group_user_id) ON CONFLICT REPLACE );");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS stickers ( _id INTEGER PRIMARY KEY AUTOINCREMENT, stickers_complete_sticker_id TEXT NOT NULL, stickers_sticker_id INTEGER NOT NULL, stickers_package_id INTEGER NOT NULL, stickers_sticker_version INTEGER NOT NULL, stickers_original_uri TEXT NOT NULL, stickers_thumbnail_uri TEXT NOT NULL, stickers_download_state INTEGER NOT NULL, stickers_x_axis INTEGER NOT NULL, stickers_y_axis INTEGER NOT NULL, stickers_ver_span INTEGER NOT NULL, stickers_hor_span INTEGER NOT NULL, stickers_view_multiplier INTEGER NOT NULL, stickers_extra TEXT , CONSTRAINT sticker_unique_id UNIQUE (stickers_package_id, stickers_sticker_id,stickers_sticker_version) ON CONFLICT REPLACE );");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS stickerspackage ( _id INTEGER PRIMARY KEY AUTOINCREMENT, stickerspackage_package_version INTEGER NOT NULL, stickerspackage_package_id INTEGER NOT NULL, stickerspackage_progress INTEGER NOT NULL, stickerspackage_download_state INTEGER NOT NULL, stickerspackage_download_id INTEGER NOT NULL, stickerspackage_count INTEGER NOT NULL, stickerspackage_price TEXT NOT NULL, stickerspackage_designer TEXT NOT NULL, stickerspackage_field TEXT NOT NULL, stickerspackage_name TEXT NOT NULL, stickerspackage_is_hidden INTEGER NOT NULL DEFAULT 0, stickerspackage_thumbnail_uri TEXT NOT NULL, stickerspackage_description TEXT, stickerspackage_extra TEXT , CONSTRAINT package_unique_id UNIQUE (stickerspackage_package_id, stickerspackage_package_version) ON CONFLICT REPLACE );");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS syncedcontacts ( _id INTEGER PRIMARY KEY AUTOINCREMENT, syncedcontacts_phone_number TEXT NOT NULL, syncedcontacts_extra_field TEXT , CONSTRAINT unique_syncedcontacts_phone_number UNIQUE (syncedcontacts_phone_number) ON CONFLICT ABORT );");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS userinchatstates ( _id INTEGER PRIMARY KEY AUTOINCREMENT, userinchatstates_sender TEXT NOT NULL, userinchatstates_party TEXT NOT NULL, userinchatstates_state INTEGER NOT NULL, userinchatstates_extra TEXT , CONSTRAINT unique_sender_party UNIQUE (userinchatstates_party, userinchatstates_sender) ON CONFLICT REPLACE );");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS report_events_columns ( _id INTEGER PRIMARY KEY AUTOINCREMENT, report_events_columns_category TEXT, report_events_columns_action TEXT, report_events_columns_description TEXT, report_events_columns_extra TEXT  );");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS charge ( _id INTEGER PRIMARY KEY AUTOINCREMENT, ChargeId TEXT, CartNumber TEXT, PhoneNumber TEXT, TransactionStatus INTEGER, Operator INTEGER, ChargeType INTEGER, IsTarabord INTEGER, Amount TEXT, RefId TEXT, TransactionId TEXT, TransactionTime TEXT, Extra1 TEXT, Extra2 TEXT, PaymentType INTEGER, IsFavorite INTEGER , CONSTRAINT unique_name UNIQUE (TransactionId) ON CONFLICT REPLACE );");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS bill ( _id INTEGER PRIMARY KEY AUTOINCREMENT, UniqueId TEXT, BillId TEXT, PaymentId TEXT, TransactionStatus INTEGER, Amount TEXT, RefId TEXT, TransactionId TEXT, TransactionTime TEXT , CONSTRAINT unique_name UNIQUE (TransactionId) ON CONFLICT REPLACE );");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS dialogs ( _id INTEGER, dialog_party TEXT PRIMARY KEY NOT NULL, dialog_title TEXT, dialog_avatar_thumbnail_url TEXT, dialog_avatar_url TEXT, dialog_description TEXT, dialog_is_mute INTEGER DEFAULT 0, dialog_is_pinned INTEGER DEFAULT 0, dialog_my_role INTEGER NOT NULL, dialog_creation_date INTEGER NOT NULL DEFAULT 0, dialog_is_reply_allowed INTEGER NOT NULL DEFAULT 0, dialog_show_all_messages INTEGER NOT NULL DEFAULT 0, dialog_unread_messages_count INTEGER NOT NULL DEFAULT 0, dialog_last_message_id TEXT, dialog_updated_at INTEGER NOT NULL DEFAULT 0, dialog_link TEXT, dialog_state INTEGER, dialog_last_position TEXT DEFAULT '0', dialog_extra TEXT DEFAULT '0', channel_owner TEXT, dialog_draft_data TEXT, dialog_last_seen INTEGER NOT NULL DEFAULT 0, dialog_last_seen_sent INTEGER NOT NULL DEFAULT 1, dialog_type INTEGER NOT NULL, channel_type INTEGER, dialog_keyboard TEXT, dialog_members_count INTEGER , CONSTRAINT unique_dialog_party UNIQUE (dialog_party) );");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS suggestedchannels ( _id INTEGER , party TEXT PRIMARY KEY, title TEXT, parent_category_id INTEGER, description TEXT, channel_link TEXT, avatar_url TEXT, avatar_thumbnail_url TEXT, channel_creation_date INTEGER, channel_members_count INTEGER, item_type INTEGER, category_updated_at TEXT, item_index INTEGER, is_disabled INTEGER NOT NULL DEFAULT 0, avatar_res_id INTEGER DEFAULT -1, extra TEXT  );");
        C3017a.m7530a(sQLiteDatabase);
    }
}
