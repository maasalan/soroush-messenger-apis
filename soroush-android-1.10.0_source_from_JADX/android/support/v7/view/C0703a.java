package android.support.v7.view;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.v7.p041a.C0645a.C0635a;
import android.support.v7.p041a.C0645a.C0636b;
import android.support.v7.p041a.C0645a.C0638d;
import android.support.v7.p041a.C0645a.C0644j;
import org.jivesoftware.smack.tcp.XMPPTCPConnection.PacketWriter;
import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;

public final class C0703a {
    public Context f2313a;

    private C0703a(Context context) {
        this.f2313a = context;
    }

    public static C0703a m1693a(Context context) {
        return new C0703a(context);
    }

    public final int m1694a() {
        Configuration configuration = this.f2313a.getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp <= IjkMediaCodecInfo.RANK_LAST_CHANCE && i <= IjkMediaCodecInfo.RANK_LAST_CHANCE && (i <= 960 || i2 <= 720)) {
            if (i <= 720 || i2 <= 960) {
                if (i < PacketWriter.QUEUE_SIZE && (i <= 640 || i2 <= 480)) {
                    if (i <= 480 || i2 <= 640) {
                        return i >= 360 ? 3 : 2;
                    }
                }
                return 4;
            }
        }
        return 5;
    }

    public final boolean m1695b() {
        return this.f2313a.getResources().getBoolean(C0636b.abc_action_bar_embed_tabs);
    }

    public final int m1696c() {
        TypedArray obtainStyledAttributes = this.f2313a.obtainStyledAttributes(null, C0644j.ActionBar, C0635a.actionBarStyle, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(C0644j.ActionBar_height, 0);
        Resources resources = this.f2313a.getResources();
        if (!m1695b()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(C0638d.abc_action_bar_stacked_max_height));
        }
        obtainStyledAttributes.recycle();
        return layoutDimension;
    }

    public final int m1697d() {
        return this.f2313a.getResources().getDimensionPixelSize(C0638d.abc_action_bar_stacked_tab_max_width);
    }
}
