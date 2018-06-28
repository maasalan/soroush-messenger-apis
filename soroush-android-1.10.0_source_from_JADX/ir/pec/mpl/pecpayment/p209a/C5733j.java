package ir.pec.mpl.pecpayment.p209a;

import com.p067a.p070b.C0994p.C0992a;
import com.p067a.p070b.C0997u;
import com.p067a.p070b.C5060i;
import com.p067a.p070b.C5064s;
import com.p067a.p070b.C5065t;
import com.p067a.p070b.C6440k;
import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;

class C5733j implements C0992a {
    final /* synthetic */ C2354h f15704a;

    C5733j(C2354h c2354h) {
        this.f15704a = c2354h;
    }

    public void onErrorResponse(C0997u c0997u) {
        int i = c0997u instanceof C5065t ? 2 : c0997u instanceof C6440k ? IjkMediaCodecInfo.RANK_MAX : c0997u instanceof C5064s ? 1001 : c0997u instanceof C5060i ? 1002 : 0;
        this.f15704a.m6397a(null, null, -1, true, i);
        this.f15704a.m6399a(null, -1, true, i);
    }
}
