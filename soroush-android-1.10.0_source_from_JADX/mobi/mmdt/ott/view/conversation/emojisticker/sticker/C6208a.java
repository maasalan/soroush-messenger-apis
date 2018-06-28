package mobi.mmdt.ott.view.conversation.emojisticker.sticker;

import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.FrameLayout;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.view.conversation.emojisticker.C4010a;
import mobi.mmdt.ott.view.tools.C4478a;

public final class C6208a extends C4010a {
    Activity f16790b;
    private FrameLayout f16791c = new FrameLayout(this.f16790b);
    private View f16792d = this.f16790b.getLayoutInflater().inflate(R.layout.sticker_empty_layout, null, false);

    class C40371 implements OnClickListener {
        final /* synthetic */ C6208a f11592a;

        C40371(C6208a c6208a) {
            this.f11592a = c6208a;
        }

        public final void onClick(View view) {
            C4478a.m8162c(this.f11592a.f16790b);
        }
    }

    public C6208a(Activity activity) {
        this.f16790b = activity;
        Button button = (Button) this.f16792d.findViewById(R.id.goToStickerMarketButton);
        C2491i.m6819b(button, UIThemeManager.getmInstance().getAccent_color());
        button.setOnClickListener(new C40371(this));
        this.f16791c.addView(this.f16792d);
    }

    public final View mo2368a() {
        return this.f16791c;
    }

    public final int mo2370b() {
        return 0;
    }
}
