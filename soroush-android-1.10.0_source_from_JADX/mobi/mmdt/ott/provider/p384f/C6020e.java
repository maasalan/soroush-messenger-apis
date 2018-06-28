package mobi.mmdt.ott.provider.p384f;

import android.database.Cursor;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.like.base.MessageLike.LikeStatus;
import mobi.mmdt.ott.provider.p381c.C2954b;

public final class C6020e extends C2954b {
    public C6020e(Cursor cursor) {
        super(cursor);
    }

    public final long m13361a() {
        Long c = m7354c("_id");
        if (c != null) {
            return c.longValue();
        }
        throw new NullPointerException("The value of '_id' in the database was null, which is not allowed according to the model definition");
    }

    public final String m13362b() {
        String a = m7352a("conversations_message_id");
        if (a != null) {
            return a;
        }
        throw new NullPointerException("The value of 'message_id' in the database was null, which is not allowed according to the model definition");
    }

    public final C2972l m13363c() {
        Integer b = m7353b("conversations_event_type");
        if (b != null) {
            return C2972l.values()[b.intValue()];
        }
        throw new NullPointerException("The value of 'event_type' in the database was null, which is not allowed according to the model definition");
    }

    public final long m13364d() {
        Long c = m7354c("conversations_send_time");
        if (c != null) {
            return c.longValue();
        }
        throw new NullPointerException("The value of 'send_time' in the database was null, which is not allowed according to the model definition");
    }

    public final long m13365e() {
        Long c = m7354c("conversations_receive_time");
        if (c != null) {
            return c.longValue();
        }
        throw new NullPointerException("The value of 'receive_time' in the database was null, which is not allowed according to the model definition");
    }

    public final int m13366f() {
        Integer b = m7353b("conversations_likes");
        if (b != null) {
            return b.intValue();
        }
        throw new NullPointerException("The value of 'LIKES' in the database was null, which is not allowed according to the model definition");
    }

    public final LikeStatus m13367g() {
        Integer b = m7353b("conversations_my_like");
        return b == null ? LikeStatus.UNLIKE : LikeStatus.values()[b.intValue()];
    }

    public final int m13368h() {
        Integer b = m7353b("conversations_visits");
        return b == null ? 0 : b.intValue();
    }

    public final C2970j m13369i() {
        Integer b = m7353b("conversations_direction_type");
        if (b != null) {
            return C2970j.values()[b.intValue()];
        }
        throw new NullPointerException("The value of 'direction_type' in the database was null, which is not allowed according to the model definition");
    }

    public final C2971k m13370j() {
        Integer b = m7353b("conversations_event_state");
        if (b != null) {
            return C2971k.values()[b.intValue()];
        }
        throw new NullPointerException("The value of 'event_state' in the database was null, which is not allowed according to the model definition");
    }

    public final String m13371k() {
        String a = m7352a("conversations_party");
        if (a != null) {
            return a;
        }
        throw new NullPointerException("The value of 'party' in the database was null, which is not allowed according to the model definition");
    }

    public final String m13372l() {
        String a = m7352a("conversations_peer_user_id");
        if (a != null) {
            return a;
        }
        throw new NullPointerException("The value of 'sender' in the database was null, which is not allowed according to the model definition");
    }

    public final C2973m m13373m() {
        Integer b = m7353b("conversations_group_type");
        if (b != null) {
            return C2973m.values()[b.intValue()];
        }
        throw new NullPointerException("The value of 'group_type' in the database was null, which is not allowed according to the model definition");
    }

    public final C2973m m13374n() {
        Integer b = m7353b("conversations_forward_group_type");
        return b == null ? null : C2973m.values()[b.intValue()];
    }
}
