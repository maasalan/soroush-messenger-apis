package mobi.mmdt.ott.provider;

import android.annotation.TargetApi;
import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.DefaultDatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.base.ChannelState;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p379a.C2939a;
import mobi.mmdt.ott.provider.p395q.C3017a;

public final class C2960d extends SQLiteOpenHelper {
    private static C2960d f9197a;
    private final C2963e f9198b = new C2963e();

    @TargetApi(11)
    private C2960d(Context context, DatabaseErrorHandler databaseErrorHandler) {
        super(context, "ott.db", null, 76, databaseErrorHandler);
    }

    public static C2960d m7386a(Context context) {
        if (f9197a == null) {
            f9197a = new C2960d(context.getApplicationContext(), new DefaultDatabaseErrorHandler());
        }
        return f9197a;
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        C2480b.m6741e("onCreate");
        C2480b.m6741e("onPreCreate");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS conversations ( _id INTEGER PRIMARY KEY AUTOINCREMENT, conversations_message_id TEXT NOT NULL, conversations_event_type INTEGER NOT NULL, conversations_event TEXT, conversations_send_time INTEGER NOT NULL, conversations_receive_time INTEGER NOT NULL, conversations_my_vote TEXT, conversations_my_like INTEGER  DEFAULT 0, conversations_likes INTEGER NOT NULL DEFAULT 0, conversations_visits INTEGER  DEFAULT 0, conversations_my_visit INTEGER  DEFAULT 0, conversations_is_need_notify INTEGER  DEFAULT 0, conversations_forward_user_id TEXT, conversations_forward_name TEXT, conversations_forward_group_type INTEGER, conversations_forward_message_id TEXT, conversations_is_seen_send INTEGER DEFAULT 0, conversations_direction_type INTEGER NOT NULL, conversations_event_state INTEGER NOT NULL, conversations_party TEXT NOT NULL, conversations_peer_user_id TEXT NOT NULL, conversations_group_type INTEGER NOT NULL, conversations_reply_message_id TEXT, conversations_link_preview TEXT, conversations_file_id INTEGER, conversations_sticker_id TEXT, conversations_edit_time INTEGER, conversations_extra TEXT , CONSTRAINT unique_message_id UNIQUE (conversations_message_id) );");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS files ( _id INTEGER PRIMARY KEY AUTOINCREMENT, files_file_uri TEXT, files_file_url TEXT, files_server_file_id TEXT, files_type INTEGER NOT NULL, files_name TEXT NOT NULL, files_size INTEGER NOT NULL, files_progress INTEGER NOT NULL, files_thumbnail_uri TEXT, files_thumbnail_url TEXT, files_duration INTEGER, files_download_state INTEGER NOT NULL, files_thumbnail_download_state INTEGER NOT NULL, files_audio_state INTEGER, files_audio_playing_time INTEGER NOT NULL, files_image_width INTEGER DEFAULT 0, files_image_height INTEGER DEFAULT 0, files_download_task_id INTEGER DEFAULT 0, files_extra TEXT  );");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS members ( _id INTEGER PRIMARY KEY AUTOINCREMENT, members_nick_name TEXT, members_avatar_url TEXT, members_avatar_thumbnail_url TEXT, members_user_id TEXT NOT NULL, members_soroush_id TEXT, members_standard_phone_number TEXT, members_local_phone_number TEXT, members_last_online INTEGER DEFAULT -1, members_is_local_user INTEGER NOT NULL, members_can_reply INTEGER NOT NULL, members_is_anouncer INTEGER NOT NULL, members_local_name TEXT, members_moto TEXT, members_last_position TEXT, members_local_image_uri TEXT, members_is_new_user INTEGER NOT NULL ,members_is_synced_contact INTEGER NOT NULL, members_is_soroush_member INTEGER DEFAULT 0, members_is_pined INTEGER DEFAULT 0, members_is_mute INTEGER DEFAULT 0, members_is_deactivated_user INTEGER NOT NULL, members_extra TEXT, members_weight INTEGER NOT NULL, CONSTRAINT unique_user_id UNIQUE (members_user_id) ON CONFLICT REPLACE );");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS members_group ( _id INTEGER PRIMARY KEY AUTOINCREMENT, members_group_group_id TEXT NOT NULL, members_group_user_id TEXT NOT NULL, members_group_user_role INTEGER NOT NULL, members_group_added_by_me INTEGER NOT NULL, members_group_extra TEXT , CONSTRAINT unique_user_group UNIQUE (members_group_group_id, members_group_user_id) ON CONFLICT REPLACE );");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS stickers ( _id INTEGER PRIMARY KEY AUTOINCREMENT, stickers_complete_sticker_id TEXT NOT NULL, stickers_sticker_id INTEGER NOT NULL, stickers_package_id INTEGER NOT NULL, stickers_sticker_version INTEGER NOT NULL, stickers_original_uri TEXT NOT NULL, stickers_thumbnail_uri TEXT NOT NULL, stickers_download_state INTEGER NOT NULL, stickers_x_axis INTEGER NOT NULL, stickers_y_axis INTEGER NOT NULL, stickers_ver_span INTEGER NOT NULL, stickers_hor_span INTEGER NOT NULL, stickers_view_multiplier INTEGER NOT NULL, stickers_extra TEXT , CONSTRAINT sticker_unique_id UNIQUE (stickers_package_id, stickers_sticker_id,stickers_sticker_version) ON CONFLICT REPLACE );");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS stickerspackage ( _id INTEGER PRIMARY KEY AUTOINCREMENT, stickerspackage_package_version INTEGER NOT NULL, stickerspackage_package_id INTEGER NOT NULL, stickerspackage_progress INTEGER NOT NULL, stickerspackage_download_state INTEGER NOT NULL, stickerspackage_download_id INTEGER NOT NULL, stickerspackage_count INTEGER NOT NULL, stickerspackage_price TEXT NOT NULL, stickerspackage_designer TEXT NOT NULL, stickerspackage_field TEXT NOT NULL, stickerspackage_name TEXT NOT NULL, stickerspackage_is_hidden INTEGER NOT NULL DEFAULT 0, stickerspackage_thumbnail_uri TEXT NOT NULL, stickerspackage_description TEXT, stickerspackage_extra TEXT , CONSTRAINT package_unique_id UNIQUE (stickerspackage_package_id, stickerspackage_package_version) ON CONFLICT REPLACE );");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS syncedcontacts ( _id INTEGER PRIMARY KEY AUTOINCREMENT, syncedcontacts_phone_number TEXT NOT NULL, syncedcontacts_extra_field TEXT , CONSTRAINT unique_syncedcontacts_phone_number UNIQUE (syncedcontacts_phone_number) ON CONFLICT ABORT );");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS userinchatstates ( _id INTEGER PRIMARY KEY AUTOINCREMENT, userinchatstates_sender TEXT NOT NULL, userinchatstates_party TEXT NOT NULL, userinchatstates_state INTEGER NOT NULL, userinchatstates_extra TEXT , CONSTRAINT unique_sender_party UNIQUE (userinchatstates_party, userinchatstates_sender) ON CONFLICT REPLACE );");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS recentemoji ( _id INTEGER PRIMARY KEY AUTOINCREMENT, recentemoji_value TEXT NOT NULL, recentemoji_usage_count INTEGER NOT NULL, recentemoji_emoji_source INTEGER NOT NULL, recentemoji_extra TEXT , CONSTRAINT unique_recentemoji_value UNIQUE (recentemoji_value) ON CONFLICT ABORT );");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS report_events_columns ( _id INTEGER PRIMARY KEY AUTOINCREMENT, report_events_columns_category TEXT, report_events_columns_action TEXT, report_events_columns_description TEXT, report_events_columns_extra TEXT  );");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS charge ( _id INTEGER PRIMARY KEY AUTOINCREMENT, ChargeId TEXT, CartNumber TEXT, PhoneNumber TEXT, TransactionStatus INTEGER, Operator INTEGER, ChargeType INTEGER, IsTarabord INTEGER, Amount TEXT, RefId TEXT, TransactionId TEXT, TransactionTime TEXT, Extra1 TEXT, Extra2 TEXT, PaymentType INTEGER, IsFavorite INTEGER , CONSTRAINT unique_name UNIQUE (TransactionId) ON CONFLICT REPLACE );");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS bill ( _id INTEGER PRIMARY KEY AUTOINCREMENT, UniqueId TEXT, BillId TEXT, PaymentId TEXT, TransactionStatus INTEGER, Amount TEXT, RefId TEXT, TransactionId TEXT, TransactionTime TEXT , CONSTRAINT unique_name UNIQUE (TransactionId) ON CONFLICT REPLACE );");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS dialogs ( _id INTEGER, dialog_party TEXT PRIMARY KEY NOT NULL, dialog_title TEXT, dialog_avatar_thumbnail_url TEXT, dialog_avatar_url TEXT, dialog_description TEXT, dialog_is_mute INTEGER DEFAULT 0, dialog_is_pinned INTEGER DEFAULT 0, dialog_my_role INTEGER NOT NULL, dialog_creation_date INTEGER NOT NULL DEFAULT 0, dialog_is_reply_allowed INTEGER NOT NULL DEFAULT 0, dialog_show_all_messages INTEGER NOT NULL DEFAULT 0, dialog_unread_messages_count INTEGER NOT NULL DEFAULT 0, dialog_last_message_id TEXT, dialog_updated_at INTEGER NOT NULL DEFAULT 0, dialog_link TEXT, dialog_state INTEGER, dialog_last_position TEXT DEFAULT '0', dialog_extra TEXT DEFAULT '0', channel_owner TEXT, dialog_draft_data TEXT, dialog_last_seen INTEGER NOT NULL DEFAULT 0, dialog_last_seen_sent INTEGER NOT NULL DEFAULT 1, dialog_type INTEGER NOT NULL, channel_type INTEGER, dialog_keyboard TEXT, dialog_members_count INTEGER , CONSTRAINT unique_dialog_party UNIQUE (dialog_party) );");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS suggestedchannels ( _id INTEGER , party TEXT PRIMARY KEY, title TEXT, parent_category_id INTEGER, description TEXT, channel_link TEXT, avatar_url TEXT, avatar_thumbnail_url TEXT, channel_creation_date INTEGER, channel_members_count INTEGER, item_type INTEGER, category_updated_at TEXT, item_index INTEGER, is_disabled INTEGER NOT NULL DEFAULT 0, avatar_res_id INTEGER DEFAULT -1, extra TEXT  );");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS landing_page_row_items ( _id INTEGER PRIMARY KEY AUTOINCREMENT, row_item_title TEXT, row_item_image TEXT, row_item_subtitle TEXT, row_item_button_text TEXT, row_item_display_order INTEGER, row_item_action_type INTEGER, row_item_action_data TEXT, row_item_landing_page_row_id INTEGER NOT NULL, row_item_button_action_type INTEGER, row_item_button_action_data TEXT  );");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS landing_page_rows ( _id INTEGER PRIMARY KEY AUTOINCREMENT, row_title TEXT, row_type INTEGER NOT NULL, row_parent_landing_page_id INTEGER NOT NULL, row_display_order INTEGER, row_category_has_more_items INTEGER, row_interval INTEGER, row_category_image TEXT, row_category_visible_items_counts INTEGER,row_updated_at INTEGER  );");
        C2480b.m6741e("onPostCreate");
        C3017a.m7530a(sQLiteDatabase);
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        super.onDowngrade(sQLiteDatabase, i, i2);
    }

    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        super.onOpen(sQLiteDatabase);
        C2480b.m6741e("onOpen");
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        StringBuilder stringBuilder = new StringBuilder("Upgrading database from version ");
        stringBuilder.append(i);
        stringBuilder.append(" to ");
        stringBuilder.append(i2);
        C2480b.m6741e(stringBuilder.toString());
        if (i < 25) {
            C2963e.m7391c(sQLiteDatabase);
            C2963e.m7392d(sQLiteDatabase);
            i = 25;
        }
        if (i == 25) {
            C2963e.m7392d(sQLiteDatabase);
            i = 26;
        }
        if (i == 26) {
            sQLiteDatabase.execSQL("ALTER TABLE conversations ADD COLUMN conversations_visits INTEGER DEFAULT 0");
            sQLiteDatabase.execSQL("ALTER TABLE conversations ADD COLUMN conversations_my_visit INTEGER DEFAULT 0");
            sQLiteDatabase.execSQL("ALTER TABLE PrivateGroups ADD COLUMN PrivateGroups_member_counts INTEGER DEFAULT 0");
            i = 27;
        }
        if (i == 27) {
            StringBuilder stringBuilder2 = new StringBuilder("ALTER TABLE CHANNELS ADD COLUMN CHANNELS_channel_state INTEGER DEFAULT ");
            stringBuilder2.append(ChannelState.accepted.ordinal());
            sQLiteDatabase.execSQL(stringBuilder2.toString());
            sQLiteDatabase.execSQL("ALTER TABLE CHANNELS ADD COLUMN CHANNELS_show_all_msg INTEGER DEFAULT 1");
            i = 28;
        }
        if (i == 28) {
            sQLiteDatabase.execSQL("ALTER TABLE files ADD COLUMN files_image_width INTEGER DEFAULT 0");
            sQLiteDatabase.execSQL("ALTER TABLE files ADD COLUMN files_image_height INTEGER DEFAULT 0");
            i = 29;
        }
        if (i == 29) {
            sQLiteDatabase.execSQL("ALTER TABLE recentemoji ADD COLUMN recentemoji_emoji_source INTEGER DEFAULT 0");
            i = 30;
        }
        if (i == 30) {
            sQLiteDatabase.execSQL("ALTER TABLE conversations ADD COLUMN conversations_is_need_notify INTEGER DEFAULT 0");
            sQLiteDatabase.execSQL("ALTER TABLE conversations ADD COLUMN conversations_forward_user_id TEXT");
            sQLiteDatabase.execSQL("ALTER TABLE conversations ADD COLUMN conversations_forward_name TEXT");
            i = 31;
        }
        if (i == 31) {
            i = 32;
        }
        if (i == 32) {
            sQLiteDatabase.execSQL("ALTER TABLE conversations ADD COLUMN conversations_forward_group_type INTEGER");
            sQLiteDatabase.execSQL("ALTER TABLE stickers ADD COLUMN stickers_view_multiplier INTEGER");
            i = 33;
        }
        if (i == 33) {
            sQLiteDatabase.execSQL("ALTER TABLE conversations ADD COLUMN conversations_is_seen_send INTEGER DEFAULT 0");
            i = 34;
        }
        if (i == 34) {
            sQLiteDatabase.execSQL("ALTER TABLE conversations ADD COLUMN conversations_edit_time INTEGER");
            i = 35;
        }
        if (i == 35) {
            Log.e("****", "Update forOldVersion35 ********************************************************");
            sQLiteDatabase.execSQL("ALTER TABLE members ADD COLUMN members_is_soroush_member INTEGER DEFAULT 0");
            C2535a.m6888a().m6915a(0);
            i = 36;
        }
        if (i == 36) {
            C2535a.m6888a().m6915a(0);
            i = 37;
        }
        if (i == 37) {
            Log.e("****", "Update forOldVersion37 ********************************************************");
            sQLiteDatabase.execSQL("ALTER TABLE conversations ADD COLUMN conversations_link_preview TEXT");
            i = 38;
        }
        if (i == 38) {
            Log.e("****", "Update forOldVersion38 ********************************************************");
            sQLiteDatabase.execSQL("ALTER TABLE members ADD COLUMN members_is_pined INTEGER DEFAULT 0");
            sQLiteDatabase.execSQL("ALTER TABLE CHANNELS ADD COLUMN CHANNELS_is_pined INTEGER DEFAULT 0");
            sQLiteDatabase.execSQL("ALTER TABLE PrivateGroups ADD COLUMN PrivateGroups_is_pined INTEGER DEFAULT 0");
            i = 39;
        }
        if (i == 39) {
            C2535a.m6888a().m6976v(true);
            i = 40;
        }
        if (i == 40) {
            i = 41;
        }
        if (i == 41) {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS report_events_columns ( _id INTEGER PRIMARY KEY AUTOINCREMENT, report_events_columns_category TEXT, report_events_columns_action TEXT, report_events_columns_description TEXT, report_events_columns_extra TEXT  );");
            i = 42;
        }
        if (i == 42) {
            Log.e("****", "Update forOldVersion42 ********************************************************");
            try {
                sQLiteDatabase.execSQL("ALTER TABLE members ADD COLUMN members_last_position");
                sQLiteDatabase.execSQL("ALTER TABLE CHANNELS ADD COLUMN CHANNELS_last_position");
                sQLiteDatabase.execSQL("ALTER TABLE PrivateGroups ADD COLUMN PrivateGroups_last_position");
            } catch (Exception e) {
                e.printStackTrace();
            }
            i = 43;
        }
        if (i == 43) {
            Log.e("****", "Update forOldVersion43 ********************************************************");
            try {
                sQLiteDatabase.execSQL("ALTER TABLE members ADD COLUMN members_standard_phone_number");
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            i = 44;
        }
        if (i == 44) {
            C2535a.m6888a().m6915a(0);
            i = 45;
        }
        if (i == 45) {
            Log.e("****", "Update forOldVersion45 ********************************************************");
            sQLiteDatabase.execSQL("ALTER TABLE members ADD COLUMN members_is_mute INTEGER DEFAULT 0");
            i = 46;
        }
        if (i == 46) {
            Log.e("****", "Update forOldVersion46 ********************************************************");
            sQLiteDatabase.execSQL("ALTER TABLE conversations ADD COLUMN conversations_forward_message_id TEXT");
            i = 47;
        }
        if (i == 47) {
            Log.e("****", "Update forOldVersion47 ********************************************************");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS charge ( _id INTEGER PRIMARY KEY AUTOINCREMENT, ChargeId TEXT, CartNumber TEXT, PhoneNumber TEXT, TransactionStatus INTEGER, Operator INTEGER, ChargeType INTEGER, IsTarabord INTEGER, Amount TEXT, RefId TEXT, TransactionId TEXT, TransactionTime TEXT, Extra1 TEXT, Extra2 TEXT, PaymentType INTEGER, IsFavorite INTEGER , CONSTRAINT unique_name UNIQUE (TransactionId) ON CONFLICT REPLACE );");
            i = 48;
        }
        if (i == 48) {
            Log.e("****", "Update forOldVersion48 ********************************************************");
            sQLiteDatabase.execSQL("ALTER TABLE members ADD COLUMN members_soroush_id TEXT");
            i = 49;
        }
        if (i == 49) {
            Log.e("****", "Update forOldVersion49 ********************************************************");
            sQLiteDatabase.execSQL("ALTER TABLE CHANNELS ADD COLUMN CHANNELS_channel_link TEXT");
            i = 50;
        }
        if (i == 50) {
            Log.e("****", "Update forOldVersion50 ********************************************************");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS dialogs ( _id INTEGER, dialog_party TEXT PRIMARY KEY NOT NULL, dialog_title TEXT, dialog_avatar_thumbnail_url TEXT, dialog_avatar_url TEXT, dialog_description TEXT, dialog_is_mute INTEGER DEFAULT 0, dialog_is_pinned INTEGER DEFAULT 0, dialog_my_role INTEGER NOT NULL, dialog_creation_date INTEGER NOT NULL DEFAULT 0, dialog_is_reply_allowed INTEGER NOT NULL DEFAULT 0, dialog_show_all_messages INTEGER NOT NULL DEFAULT 0, dialog_unread_messages_count INTEGER NOT NULL DEFAULT 0, dialog_last_message_id TEXT, dialog_updated_at INTEGER NOT NULL DEFAULT 0, dialog_link TEXT, dialog_state INTEGER, dialog_last_position TEXT DEFAULT '0', dialog_extra TEXT DEFAULT '0', channel_owner TEXT, dialog_draft_data TEXT, dialog_last_seen INTEGER NOT NULL DEFAULT 0, dialog_last_seen_sent INTEGER NOT NULL DEFAULT 1, dialog_type INTEGER NOT NULL, channel_type INTEGER, dialog_keyboard TEXT, dialog_members_count INTEGER , CONSTRAINT unique_dialog_party UNIQUE (dialog_party) );");
            Log.e("****", "Migration forOldVersion50 ******************************************************");
            C2939a.m7331a(sQLiteDatabase);
            i = 51;
        }
        if (i == 51) {
            Log.e("****", "Update forOldVersion51 ********************************************************");
            try {
                sQLiteDatabase.execSQL("ALTER TABLE dialogs ADD COLUMN dialog_draft_data TEXT");
            } catch (Throwable e3) {
                C2480b.m6737b("problem in alter dialog draft column", e3);
            }
            C2942a.m7334a(sQLiteDatabase);
            i = 52;
        }
        if (i == 52) {
            Log.e("****", "Update forOldVersion52 ********************************************************");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS suggestedchannels ( _id INTEGER , party TEXT PRIMARY KEY, title TEXT, parent_category_id INTEGER, description TEXT, channel_link TEXT, avatar_url TEXT, avatar_thumbnail_url TEXT, channel_creation_date INTEGER, channel_members_count INTEGER, item_type INTEGER, category_updated_at TEXT, item_index INTEGER, is_disabled INTEGER NOT NULL DEFAULT 0, avatar_res_id INTEGER DEFAULT -1, extra TEXT  );");
            C3017a.m7530a(sQLiteDatabase);
            i = 53;
        }
        if (i == 53) {
            Log.e("****", "Update forOldVersion53 ********************************************************");
            try {
                sQLiteDatabase.execSQL("ALTER TABLE charge ADD COLUMN PaymentType TEXT");
            } catch (Throwable e32) {
                C2480b.m6737b("problem in alter payment type column", e32);
            }
            i = 54;
        }
        if (i == 54) {
            Log.e("****", "Update forOldVersion54 ********************************************************");
            sQLiteDatabase.execSQL("DELETE FROM suggestedchannels");
            C3017a.m7530a(sQLiteDatabase);
            i = 55;
        }
        if (i == 55) {
            Log.e("****", "Update forOldVersion55 ********************************************************");
            try {
                sQLiteDatabase.execSQL("ALTER TABLE dialogs ADD COLUMN dialog_last_seen INTEGER NOT NULL DEFAULT 0");
                sQLiteDatabase.execSQL("ALTER TABLE dialogs ADD COLUMN dialog_last_seen_sent INTEGER NOT NULL DEFAULT 1");
            } catch (Throwable e322) {
                C2480b.m6737b("problem in alter last seen column", e322);
            }
            i = 56;
        }
        if (i == 56) {
            Log.e("****", "Update forOldVersion56 ********************************************************");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS bill ( _id INTEGER PRIMARY KEY AUTOINCREMENT, UniqueId TEXT, BillId TEXT, PaymentId TEXT, TransactionStatus INTEGER, Amount TEXT, RefId TEXT, TransactionId TEXT, TransactionTime TEXT , CONSTRAINT unique_name UNIQUE (TransactionId) ON CONFLICT REPLACE );");
            i = 57;
        }
        if (i == 57) {
            C2942a.m7335b(sQLiteDatabase);
            i = 58;
        }
        if (i == 58) {
            Log.e("****", "Update forOldVersion58 ********************************************************");
            try {
                sQLiteDatabase.execSQL("ALTER TABLE charge ADD COLUMN IsFavorite INTEGER DEFAULT 0");
            } catch (Throwable e3222) {
                C2480b.m6737b("problem in alter is favorite column", e3222);
            }
            i = 59;
        }
        if (i == 59) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS charge");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS bill");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS suggestedchannels");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS charge ( _id INTEGER PRIMARY KEY AUTOINCREMENT, ChargeId TEXT, CartNumber TEXT, PhoneNumber TEXT, TransactionStatus INTEGER, Operator INTEGER, ChargeType INTEGER, IsTarabord INTEGER, Amount TEXT, RefId TEXT, TransactionId TEXT, TransactionTime TEXT, Extra1 TEXT, Extra2 TEXT, PaymentType INTEGER, IsFavorite INTEGER , CONSTRAINT unique_name UNIQUE (TransactionId) ON CONFLICT REPLACE );");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS bill ( _id INTEGER PRIMARY KEY AUTOINCREMENT, UniqueId TEXT, BillId TEXT, PaymentId TEXT, TransactionStatus INTEGER, Amount TEXT, RefId TEXT, TransactionId TEXT, TransactionTime TEXT , CONSTRAINT unique_name UNIQUE (TransactionId) ON CONFLICT REPLACE );");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS suggestedchannels ( _id INTEGER , party TEXT PRIMARY KEY, title TEXT, parent_category_id INTEGER, description TEXT, channel_link TEXT, avatar_url TEXT, avatar_thumbnail_url TEXT, channel_creation_date INTEGER, channel_members_count INTEGER, item_type INTEGER, category_updated_at TEXT, item_index INTEGER, is_disabled INTEGER NOT NULL DEFAULT 0, avatar_res_id INTEGER DEFAULT -1, extra TEXT  );");
            C3017a.m7530a(sQLiteDatabase);
            i = 60;
        }
        if (i == 60) {
            i = 61;
        }
        if (i == 61) {
            Log.e("****", "Update forOldVersion61 ********************************************************");
            try {
                sQLiteDatabase.execSQL("ALTER TABLE bill ADD COLUMN UniqueId TEXT");
            } catch (Throwable e32222) {
                C2480b.m6737b("problem in alter is uid column", e32222);
            }
            i = 62;
        }
        if (i < 70) {
            Log.e("****", "Update forOldVersion62 ********************************************************");
            try {
                sQLiteDatabase.execSQL("ALTER TABLE members ADD COLUMN members_weight INTEGER NOT NULL DEFAULT 0");
            } catch (Throwable e322222) {
                C2480b.m6737b("problem in alter is weight column", e322222);
            }
            i = 70;
        }
        if (i == 70) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS suggestedchannels");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS suggestedchannels ( _id INTEGER , party TEXT PRIMARY KEY, title TEXT, parent_category_id INTEGER, description TEXT, channel_link TEXT, avatar_url TEXT, avatar_thumbnail_url TEXT, channel_creation_date INTEGER, channel_members_count INTEGER, item_type INTEGER, category_updated_at TEXT, item_index INTEGER, is_disabled INTEGER NOT NULL DEFAULT 0, avatar_res_id INTEGER DEFAULT -1, extra TEXT  );");
            i = 71;
        }
        if (i == 71) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS suggestedchannels");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS suggestedchannels ( _id INTEGER , party TEXT PRIMARY KEY, title TEXT, parent_category_id INTEGER, description TEXT, channel_link TEXT, avatar_url TEXT, avatar_thumbnail_url TEXT, channel_creation_date INTEGER, channel_members_count INTEGER, item_type INTEGER, category_updated_at TEXT, item_index INTEGER, is_disabled INTEGER NOT NULL DEFAULT 0, avatar_res_id INTEGER DEFAULT -1, extra TEXT  );");
            C3017a.m7530a(sQLiteDatabase);
            i = 72;
        }
        if (i == 72) {
            sQLiteDatabase.execSQL("ALTER TABLE files ADD COLUMN files_download_task_id INTEGER NOT NULL DEFAULT 0");
            Log.e("****", "Update forOldVersion72 ********************************************************");
            i = 73;
        }
        if (i == 73) {
            sQLiteDatabase.execSQL("ALTER TABLE dialogs ADD COLUMN dialog_keyboard TEXT");
            Log.e("****", "Update forOldVersion73 ********************************************************");
            i = 74;
        }
        if (i == 74) {
            Log.e("****", "Update forOldVersion74 ********************************************************");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS landing_page_rows ( _id INTEGER PRIMARY KEY AUTOINCREMENT, row_title TEXT, row_type INTEGER NOT NULL, row_parent_landing_page_id INTEGER NOT NULL, row_display_order INTEGER, row_category_has_more_items INTEGER, row_interval INTEGER, row_category_image TEXT, row_category_visible_items_counts INTEGER,row_updated_at INTEGER  );");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS landing_page_row_items ( _id INTEGER PRIMARY KEY AUTOINCREMENT, row_item_title TEXT, row_item_image TEXT, row_item_subtitle TEXT, row_item_button_text TEXT, row_item_display_order INTEGER, row_item_action_type INTEGER, row_item_action_data TEXT, row_item_landing_page_row_id INTEGER NOT NULL, row_item_button_action_type INTEGER, row_item_button_action_data TEXT  );");
            i = 75;
        }
        if (i == 75) {
            Log.e("****", "Update forOldVersion75 ********************************************************");
            try {
                sQLiteDatabase.execSQL("ALTER TABLE landing_page_row_items ADD COLUMN row_item_button_action_type INTEGER");
                sQLiteDatabase.execSQL("ALTER TABLE landing_page_row_items ADD COLUMN row_item_button_action_data TEXT");
            } catch (Throwable e4) {
                C2480b.m6737b("Problem in update db to version 75", e4);
            }
        }
    }
}
