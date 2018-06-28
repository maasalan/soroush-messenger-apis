package mobi.mmdt.ott.view.stickermarket.stickersettings.p476a;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.p085c.p086a.C1212c;
import com.p085c.p086a.C1274i;
import com.p085c.p086a.p105g.C1247e;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.view.components.ProgressWheel;
import mobi.mmdt.ott.view.components.p401c.C3126i;
import mobi.mmdt.ott.view.components.p401c.C6073e;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.stickermarket.stickersettings.C4467a;
import mobi.mmdt.ott.view.stickermarket.stickersettings.p589b.C7394b;

public final class C6989a extends C6073e {
    private C4467a f19959b;
    private Activity f19960c;
    private ImageView f19961d;
    private CheckBox f19962e;
    private FrameLayout f19963f;
    private TextView f19964g;
    private ProgressWheel f19965h;
    private View f19966i;
    private boolean f19967j = false;
    private C1247e<Drawable> f19968k = new C62703(this);

    class C44651 implements OnTouchListener {
        final /* synthetic */ C6989a f12393a;

        C44651(C6989a c6989a) {
            this.f12393a = c6989a;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            return false;
        }
    }

    class C44662 implements OnCheckedChangeListener {
        final /* synthetic */ C6989a f12394a;

        C44662(C6989a c6989a) {
            this.f12394a = c6989a;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (!this.f12394a.f19967j) {
                if (z) {
                    this.f12394a.f19959b.mo2432a((C7394b) this.f12394a.f16244a);
                    return;
                }
                this.f12394a.f19959b.mo2433b((C7394b) this.f12394a.f16244a);
            }
        }
    }

    class C62703 implements C1247e<Drawable> {
        final /* synthetic */ C6989a f17113a;

        C62703(C6989a c6989a) {
            this.f17113a = c6989a;
        }

        public final boolean mo2229a() {
            return false;
        }

        public final /* synthetic */ boolean mo2230b() {
            this.f17113a.f19965h.setVisibility(8);
            return false;
        }
    }

    public C6989a(Activity activity, C3126i c3126i, LayoutInflater layoutInflater, ViewGroup viewGroup, C4467a c4467a) {
        super(layoutInflater, viewGroup, R.layout.sticker_market_settings_list_item, c3126i);
        this.f19960c = activity;
        this.f19959b = c4467a;
        this.f19966i = this.itemView.findViewById(R.id.divider_line);
        this.f19963f = (FrameLayout) this.itemView.findViewById(R.id.root_layout);
        this.f19961d = (ImageView) this.itemView.findViewById(R.id.imageView1);
        this.f19962e = (CheckBox) this.itemView.findViewById(R.id.checkBox);
        this.f19964g = (TextView) this.itemView.findViewById(R.id.textView1);
        this.f19965h = (ProgressWheel) this.itemView.findViewById(R.id.progress_wheel);
        this.f19963f.setOnTouchListener(new C44651(this));
        this.f19962e.setOnCheckedChangeListener(new C44662(this));
        C2491i.m6796a(this.f19966i, UIThemeManager.getmInstance().getLine_divider_color());
        C2491i.m6802a(this.f19964g, UIThemeManager.getmInstance().getText_primary_color());
    }

    protected final void mo3180a(C6829g c6829g) {
        C7394b c7394b = (C7394b) c6829g;
        this.f19964g.setText(c7394b.f21503b);
        C1274i a = C1212c.m2872a(this.f19960c).m10950a(c7394b.f21504c);
        a.f3986c = this.f19968k;
        a.m3033a().m3031a(this.f19961d);
        if (c7394b.f19504k == 0) {
            this.f19966i.setVisibility(4);
        } else {
            this.f19966i.setVisibility(0);
        }
        this.f19967j = true;
        this.f19962e.setChecked(c7394b.f21505d ^ true);
        this.f19967j = false;
        C2491i.m6799a(this.f19962e, UIThemeManager.getmInstance().getAccent_color());
    }
}
