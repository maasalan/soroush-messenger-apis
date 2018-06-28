package com.google.firebase.messaging;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v4.p038g.C4813a;
import com.google.android.gms.internal.dm;
import com.google.android.gms.internal.zzbej;
import java.util.Map;
import org.jivesoftware.smackx.privacy.packet.PrivacyItem;

public final class RemoteMessage extends zzbej {
    public static final Creator<RemoteMessage> CREATOR = new C2095f();
    public Bundle f18847a;
    public C2089a f18848b;
    private Map<String, String> f18849c;

    public static class C2089a {
        private final String f7026a;
        private final String f7027b;
        private final String[] f7028c;
        private final String f7029d;
        private final String f7030e;
        private final String[] f7031f;
        private final String f7032g;
        private final String f7033h;
        private final String f7034i;
        private final String f7035j;
        private final String f7036k;
        private final Uri f7037l;

        private C2089a(Bundle bundle) {
            this.f7026a = C2091b.m5697a(bundle, "gcm.n.title");
            this.f7027b = C2091b.m5703b(bundle, "gcm.n.title");
            this.f7028c = C2089a.m5693a(bundle, "gcm.n.title");
            this.f7029d = C2091b.m5697a(bundle, "gcm.n.body");
            this.f7030e = C2091b.m5703b(bundle, "gcm.n.body");
            this.f7031f = C2089a.m5693a(bundle, "gcm.n.body");
            this.f7032g = C2091b.m5697a(bundle, "gcm.n.icon");
            this.f7033h = C2091b.m5706d(bundle);
            this.f7034i = C2091b.m5697a(bundle, "gcm.n.tag");
            this.f7035j = C2091b.m5697a(bundle, "gcm.n.color");
            this.f7036k = C2091b.m5697a(bundle, "gcm.n.click_action");
            this.f7037l = C2091b.m5701b(bundle);
        }

        private static String[] m5693a(Bundle bundle, String str) {
            Object[] c = C2091b.m5705c(bundle, str);
            if (c == null) {
                return null;
            }
            String[] strArr = new String[c.length];
            for (int i = 0; i < c.length; i++) {
                strArr[i] = String.valueOf(c[i]);
            }
            return strArr;
        }
    }

    RemoteMessage(Bundle bundle) {
        this.f18847a = bundle;
    }

    public final Map<String, String> m16935a() {
        if (this.f18849c == null) {
            this.f18849c = new C4813a();
            for (String str : this.f18847a.keySet()) {
                Object obj = this.f18847a.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!(str.startsWith("google.") || str.startsWith("gcm.") || str.equals(PrivacyItem.SUBSCRIPTION_FROM) || str.equals("message_type") || str.equals("collapse_key"))) {
                        this.f18849c.put(str, str2);
                    }
                }
            }
        }
        return this.f18849c;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = dm.m4723a(parcel, 20293);
        dm.m4729a(parcel, 2, this.f18847a);
        dm.m4742b(parcel, i);
    }
}
