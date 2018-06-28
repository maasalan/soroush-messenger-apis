package mobi.mmdt.ott.provider.p389k;

import android.database.Cursor;
import mobi.mmdt.ott.logic.p261a.p276b.C2622a.C2621a;
import mobi.mmdt.ott.provider.p381c.C2954b;

public final class C6034d extends C2954b {
    public C6034d(Cursor cursor) {
        super(cursor);
    }

    public final long m13509a() {
        Long c = m7354c("_id");
        if (c != null) {
            return c.longValue();
        }
        throw new NullPointerException("The value of '_id' in the database was null, which is not allowed according to the model definition");
    }

    public final String m13510b() {
        String a = m7352a("members_user_id");
        if (a != null) {
            return a;
        }
        throw new NullPointerException("The value of 'user_id' in the database was null, which is not allowed according to the model definition");
    }

    public final boolean m13511c() {
        Boolean d = m7355d("members_is_local_user");
        if (d != null) {
            return d.booleanValue();
        }
        throw new NullPointerException("The value of 'is_local_user' in the database was null, which is not allowed according to the model definition");
    }

    public final boolean m13512d() {
        Boolean d = m7355d("members_can_reply");
        if (d != null) {
            return d.booleanValue();
        }
        throw new NullPointerException("The value of 'can_reply' in the database was null, which is not allowed according to the model definition");
    }

    public final boolean m13513e() {
        Boolean d = m7355d("members_is_anouncer");
        if (d != null) {
            return d.booleanValue();
        }
        throw new NullPointerException("The value of 'is_anouncer' in the database was null, which is not allowed according to the model definition");
    }

    public final boolean m13514f() {
        Boolean d = m7355d("members_is_new_user");
        if (d != null) {
            return d.booleanValue();
        }
        throw new NullPointerException("The value of 'is_new_user' in the database was null, which is not allowed according to the model definition");
    }

    public final boolean m13515g() {
        Boolean d = m7355d("members_is_synced_contact");
        if (d != null) {
            return d.booleanValue();
        }
        throw new NullPointerException("The value of 'IS_SYNCED_MEMBER' in the database was null, which is not allowed according to the model definition");
    }

    public final boolean m13516h() {
        return m7353b("members_extra") != null && C2621a.m7046a()[m7353b("members_extra").intValue()] == C2621a.f8519a;
    }

    public final boolean m13517i() {
        return m7355d("members_is_soroush_member").booleanValue();
    }

    public final boolean m13518j() {
        return m7355d("members_is_pined").booleanValue();
    }

    public final boolean m13519k() {
        return m7355d("members_is_mute").booleanValue();
    }
}
