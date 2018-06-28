package mobi.mmdt.ott.view.components.discreteseekbar.p403a;

import android.annotation.TargetApi;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import mobi.mmdt.ott.view.components.discreteseekbar.p404b.C6087b;

@TargetApi(21)
final class C3143c {

    static class C31421 extends ViewOutlineProvider {
        final /* synthetic */ C6087b f9760a;

        public C31421(C6087b c6087b) {
            this.f9760a = c6087b;
        }

        public final void getOutline(View view, Outline outline) {
            outline.setConvexPath(this.f9760a.f16296h);
        }
    }
}
