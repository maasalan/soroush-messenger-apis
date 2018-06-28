package mobi.mmdt.ott.view.tools;

import android.app.Activity;
import android.widget.Toast;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.C2775a;

public final class C4513i {
    public static int m8227a(C2775a c2775a) {
        switch (c2775a) {
            case JSON_EXCEPTION:
            case UNEXPECTED_ERROR:
            case INVALID_REQUEST_DEFINER:
            case WEB_SERVICE_ERROR:
            case CONNECTION_ERROR:
                return -1;
            case OLD_VERSION_ERROR:
                return R.string.invalid_client_version;
            case UNKNOWN_SECURITY_ERROR:
                return R.string.unknown_security_error;
            case IP_BLOCKED:
                return R.string.ip_blocked;
            case NOT_AUTHORIZED:
                return R.string.not_authorized;
            case INVALID_PLATFORM:
                return R.string.invalid_platform;
            case INVALID_REQUEST_ID:
                return R.string.invalid_requestid;
            case REPEATED_REQUEST_ID:
                return R.string.repeated_requestid;
            case INVALID_CLIENT_VERSION:
                return R.string.invalid_client_version;
            case INVALID_DEVICE_ID:
                return R.string.invalid_deviceid;
            case WRONG_HASH_METHOD:
                return R.string.wrong_hash_method;
            case INVALID_AUTHENTICATION_DATA:
                return R.string.invalid_authentication_data;
            case WRONG_ENCRYPTION_METHOD:
                return R.string.wrong_encryption_method;
            case WRONG_PROTOCOL:
                return R.string.wrong_protocol;
            case WRONG_ALGORITHM:
                return R.string.wrong_algorithms;
            case INVALID_PHONE_NUMBER:
                return R.string.invalid_phone_number;
            case TOO_MANY_REQUEST:
                return R.string.too_many_request;
            case EXPIRE_REGISTRATION_REQUEST:
                return R.string.expired_registration_request;
            case INVALID_REGISTRATION_REQUEST:
                return R.string.invalid_registration_request;
            case TOO_MANY_SMS_REQUEST:
                return R.string.too_many_sms_request;
            case TOO_MANY_IVR_REQUEST:
                return R.string.too_many_ivr_request;
            case IVAR_CALL_FAILED:
                return R.string.ivr_call_failed;
            case POLL_NOT_FOUND:
                return R.string.poll_not_found;
            case POLL_DISABLED:
                return R.string.poll_disabled_1;
            case INVALID_POLL_DATA:
                return R.string.invalid_poll_data;
            case YOU_ALREADY_VOTED:
                return R.string.you_already_voted;
            case YOU_ARE_NOT_ALLOWED_TO_VOTE:
                return R.string.you_are_not_allowed_to_vote;
            case INVALID_VOTE_DATA:
                return R.string.invalid_vote_data;
            case POLL_RESULT_DISABLED:
                return R.string.poll_result_disabled;
            case USER_NOT_HAVE_PERMISSION:
                return R.string.user_does_not_have_permission;
            case USER_NOT_EXIST:
                return R.string.user_not_exists;
            case YOU_ARE_NOT_A_MEMBER_OF_THIS_GROUP:
                return R.string.you_are_not_a_member_of_this_group;
            case SPECIFIED_USER_IS_NOT_A_MEMBER_OF_THIS_GROUP:
                return R.string.specified_user_is_not_a_member_of_this_group;
            case INVALID_SESSION:
                return R.string.invalid_session;
            case SESSION_EXPIRED:
                return R.string.session_expired;
            case CANNOT_START_NEW_SESSION:
                return R.string.cannot_start_new_session;
            case INVALID_RESOLUTION:
                return R.string.invalid_resolution;
            case UNAVAILABLE_RESOLUTION:
                return R.string.unavailable_resolution;
            case INVALID_STICKER:
                return R.string.invalid_sticker;
            case INVALID_STARS:
                return R.string.invalid_stars;
            case UNKNOWN_SERVER_ERROR:
                return R.string.unknown_server_error;
            case UNKNOWN_APPLICATION_ERROR:
                return R.string.unknown_application_error;
            case ITEM_NOT_FOUND:
                return R.string.item_not_found;
            case INCORRECT_DATA:
                return R.string.incorrect_data;
            case COMMAND_ERROR:
                return R.string.command_error;
            case INVALID_CONTACT:
                return R.string.invalid_contact;
            case FILE_TOO_LARGE:
                return R.string.file_too_large;
            case INVALID_FILE_EXTENSION:
                return R.string.invalid_file_extension;
            case INVALID_CHANNEL_ID:
                return R.string.invalid_channelid;
            case DAILY_SEND_MESSAGE_COUNT_LIMIT:
                return R.string.daily_send_message_count_limit;
            case CHANNEL_ID_ALREADY_EXIST_EXCEPTION:
                return R.string.channelid_already_exists;
            case INVALID_SOROUSH_ID_EXCEPTION:
                return R.string.sorry_this_user_id_is_invalid;
            case SOROUSH_ID_ALREADY_EXIST_EXCEPTION:
                return R.string.this_user_id_already_exist_error_message;
            case ACTIVATION_CODE_IS_WRONG:
                return R.string.wrong_activation_code;
            default:
                return -1;
        }
    }

    public static void m8228a(Activity activity, C2775a c2775a) {
        if (c2775a != null) {
            int a = C4513i.m8227a(c2775a);
            if (a != -1) {
                Toast.makeText(activity, C4522p.m8236a(a), 0).show();
            }
        }
    }
}
