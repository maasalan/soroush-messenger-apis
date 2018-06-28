package mobi.mmdt.ott.view.conversation.videoplayerinrecyclerview.giraffeplayer2;

import android.app.Activity;
import android.view.WindowManager.LayoutParams;
import org.jivesoftware.smack.roster.Roster;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

public final class C4120m {
    private Activity f11798a;

    private C4120m(Activity activity) {
        this.f11798a = activity;
    }

    public static C4120m m7995a(Activity activity) {
        return new C4120m(activity);
    }

    public final C4120m m7996a(int i) {
        if (this.f11798a == null) {
            return this;
        }
        this.f11798a.setRequestedOrientation(i);
        return this;
    }

    public final mobi.mmdt.ott.view.conversation.videoplayerinrecyclerview.giraffeplayer2.C4120m m7997a(boolean r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        r0 = r2.f11798a;
        if (r0 != 0) goto L_0x0005;
    L_0x0004:
        return r2;
    L_0x0005:
        r0 = r2.f11798a;
        r0 = r0 instanceof android.support.v7.app.C7406c;
        if (r0 == 0) goto L_0x0026;
    L_0x000b:
        r0 = r2.f11798a;
        r0 = (android.support.v7.app.C7406c) r0;
        r0 = r0.m19694f();
        r0 = r0.mo457a();
        if (r0 == 0) goto L_0x0026;
    L_0x0019:
        r1 = 0;
        r0.mo481d(r1);	 Catch:{ Exception -> 0x001d }
    L_0x001d:
        if (r3 == 0) goto L_0x0023;
    L_0x001f:
        r0.mo474b();
        return r2;
    L_0x0023:
        r0.mo477c();
    L_0x0026:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.conversation.videoplayerinrecyclerview.giraffeplayer2.m.a(boolean):mobi.mmdt.ott.view.conversation.videoplayerinrecyclerview.giraffeplayer2.m");
    }

    public final C4120m m7998b(boolean z) {
        if (this.f11798a == null) {
            return this;
        }
        LayoutParams attributes = this.f11798a.getWindow().getAttributes();
        if (z) {
            attributes.flags |= Roster.INITIAL_DEFAULT_NON_ROSTER_PRESENCE_MAP_SIZE;
            this.f11798a.getWindow().setAttributes(attributes);
            this.f11798a.getWindow().addFlags(IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED);
            return this;
        }
        attributes.flags &= -1025;
        this.f11798a.getWindow().setAttributes(attributes);
        this.f11798a.getWindow().clearFlags(IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED);
        return this;
    }
}
