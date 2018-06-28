package mobi.mmdt.ott.provider.p389k;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import mobi.mmdt.ott.provider.p381c.C2953a;

public final class C6033c extends C2953a {
    public final int m13490a(Context context, C6035f c6035f) {
        ContentResolver contentResolver = context.getContentResolver();
        Uri uri = C3000b.f9413a;
        ContentValues b = m7350b();
        String[] strArr = null;
        String stringBuilder = c6035f == null ? null : c6035f.f9181a.toString();
        if (c6035f != null) {
            strArr = c6035f.m7370e();
        }
        return contentResolver.update(uri, b, stringBuilder, strArr);
    }

    public final Uri mo2224a() {
        return C3000b.f9413a;
    }

    public final C6033c m13492a(String str) {
        this.a.put("members_nick_name", str);
        return this;
    }

    public final C6033c m13493a(boolean z) {
        this.a.put("members_is_local_user", Boolean.valueOf(z));
        return this;
    }

    public final C6033c m13494b(String str) {
        this.a.put("members_avatar_url", str);
        return this;
    }

    public final C6033c m13495b(boolean z) {
        this.a.put("members_can_reply", Boolean.valueOf(z));
        return this;
    }

    public final C6033c m13496c() {
        this.a.putNull("members_local_image_uri");
        return this;
    }

    public final C6033c m13497c(String str) {
        this.a.put("members_avatar_thumbnail_url", str);
        return this;
    }

    public final C6033c m13498c(boolean z) {
        this.a.put("members_is_anouncer", Boolean.valueOf(z));
        return this;
    }

    public final C6033c m13499d(String str) {
        if (str == null) {
            throw new IllegalArgumentException("userId must not be null");
        }
        this.a.put("members_user_id", str);
        return this;
    }

    public final C6033c m13500d(boolean z) {
        this.a.put("members_is_deactivated_user", Boolean.valueOf(z));
        return this;
    }

    public final C6033c m13501e(String str) {
        this.a.put("members_local_phone_number", str);
        return this;
    }

    public final C6033c m13502e(boolean z) {
        this.a.put("members_is_soroush_member", Boolean.valueOf(z));
        return this;
    }

    public final C6033c m13503f(String str) {
        this.a.put("members_local_name", str);
        return this;
    }

    public final C6033c m13504g(String str) {
        this.a.put("members_moto", str);
        return this;
    }

    public final C6033c m13505h(String str) {
        this.a.put("members_standard_phone_number", str);
        return this;
    }

    public final C6033c m13506i(String str) {
        this.a.put("members_local_image_uri", str);
        return this;
    }

    public final C6033c m13507j(String str) {
        this.a.put("members_extra", str);
        return this;
    }

    public final C6033c m13508k(String str) {
        this.a.put("members_soroush_id", str);
        return this;
    }
}
