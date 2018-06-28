package mobi.mmdt.ott.provider.p384f;

import android.net.Uri;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.like.base.MessageLike.LikeStatus;
import mobi.mmdt.ott.provider.p381c.C2953a;

public final class C6019d extends C2953a {
    public final int m13332a(C6021g c6021g) {
        return MyApplication.m12952b().getContentResolver().update(C2967c.f9203a, m7350b(), c6021g.f9181a.toString(), c6021g.m7370e());
    }

    public final Uri mo2224a() {
        return C2967c.f9203a;
    }

    public final C6019d m13334a(int i) {
        this.a.put("conversations_likes", Integer.valueOf(i));
        return this;
    }

    public final C6019d m13335a(long j) {
        this.a.put("conversations_send_time", Long.valueOf(j));
        return this;
    }

    public final C6019d m13336a(Long l) {
        this.a.put("conversations_file_id", l);
        return this;
    }

    public final C6019d m13337a(String str) {
        if (str == null) {
            throw new IllegalArgumentException("messageId must not be null");
        }
        this.a.put("conversations_message_id", str);
        return this;
    }

    public final C6019d m13338a(LikeStatus likeStatus) {
        this.a.put("conversations_my_like", Integer.valueOf(likeStatus.ordinal()));
        return this;
    }

    public final C6019d m13339a(C2970j c2970j) {
        if (c2970j == null) {
            throw new IllegalArgumentException("directionType must not be null");
        }
        this.a.put("conversations_direction_type", Integer.valueOf(c2970j.ordinal()));
        return this;
    }

    public final C6019d m13340a(C2971k c2971k) {
        if (c2971k == null) {
            throw new IllegalArgumentException("eventState must not be null");
        }
        this.a.put("conversations_event_state", Integer.valueOf(c2971k.ordinal()));
        return this;
    }

    public final C6019d m13341a(C2972l c2972l) {
        if (c2972l == null) {
            throw new IllegalArgumentException("eventType must not be null");
        }
        this.a.put("conversations_event_type", Integer.valueOf(c2972l.ordinal()));
        return this;
    }

    public final C6019d m13342a(C2973m c2973m) {
        if (c2973m == null) {
            throw new IllegalArgumentException("forwardGroupType must not be null");
        }
        this.a.put("conversations_forward_group_type", Integer.valueOf(c2973m.ordinal()));
        return this;
    }

    public final C6019d m13343a(boolean z) {
        this.a.put("conversations_is_need_notify", Integer.valueOf(z));
        return this;
    }

    public final C6019d m13344b(int i) {
        this.a.put("conversations_visits", Integer.valueOf(i));
        return this;
    }

    public final C6019d m13345b(long j) {
        this.a.put("conversations_receive_time", Long.valueOf(j));
        return this;
    }

    public final C6019d m13346b(String str) {
        this.a.put("conversations_event", str);
        return this;
    }

    public final C6019d m13347b(C2973m c2973m) {
        if (c2973m == null) {
            throw new IllegalArgumentException("groupType must not be null");
        }
        this.a.put("conversations_group_type", Integer.valueOf(c2973m.ordinal()));
        return this;
    }

    public final C6019d m13348c() {
        this.a.put("conversations_my_visit", Integer.valueOf(1));
        return this;
    }

    public final C6019d m13349c(long j) {
        this.a.put("conversations_edit_time", Long.valueOf(j));
        return this;
    }

    public final C6019d m13350c(String str) {
        this.a.put("conversations_my_vote", str);
        return this;
    }

    public final C6019d m13351d() {
        this.a.put("conversations_is_seen_send", Integer.valueOf(1));
        return this;
    }

    public final C6019d m13352d(String str) {
        this.a.put("conversations_reply_message_id", str);
        return this;
    }

    public final C6019d m13353e(String str) {
        if (str == null) {
            throw new IllegalArgumentException("forwardUserId must not be null");
        }
        this.a.put("conversations_forward_user_id", str);
        return this;
    }

    public final C6019d m13354f(String str) {
        if (str == null) {
            return this;
        }
        this.a.put("conversations_forward_name", str);
        return this;
    }

    public final C6019d m13355g(String str) {
        if (str == null) {
            return this;
        }
        this.a.put("conversations_forward_message_id", str);
        return this;
    }

    public final C6019d m13356h(String str) {
        if (str == null) {
            throw new IllegalArgumentException("party must not be null");
        }
        this.a.put("conversations_party", str);
        return this;
    }

    public final C6019d m13357i(String str) {
        if (str == null) {
            throw new IllegalArgumentException("sender must not be null");
        }
        this.a.put("conversations_peer_user_id", str);
        return this;
    }

    public final C6019d m13358j(String str) {
        this.a.put("conversations_sticker_id", str);
        return this;
    }

    public final C6019d m13359k(String str) {
        this.a.put("conversations_extra", str);
        return this;
    }

    public final C6019d m13360l(String str) {
        this.a.put("conversations_link_preview", str);
        return this;
    }
}
