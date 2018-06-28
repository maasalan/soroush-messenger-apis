package mobi.mmdt.ott.view.conversation.bot;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build.VERSION;
import android.support.v4.p029a.C0346c;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import java.util.ArrayList;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.p261a.p277c.p278a.C2627b;
import mobi.mmdt.ott.logic.p261a.p277c.p278a.C2628c;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.view.conversation.emojisticker.emoji.emojicon.EmojiconTextView;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

public final class C3442a extends PopupWindow {
    public C3441a f10501a;
    private int f10502b = m7870a(25);
    private int f10503c;
    private Activity f10504d;
    private View f10505e;
    private LinearLayout f10506f;
    private int f10507g;
    private int f10508h = m7870a(4);

    class C34391 implements Runnable {
        final /* synthetic */ ArrayList f10496a;
        final /* synthetic */ C3442a f10497b;

        class C34381 implements Runnable {
            final /* synthetic */ C34391 f10495a;

            class C34371 implements Runnable {
                final /* synthetic */ C34381 f10494a;

                C34371(C34381 c34381) {
                    this.f10494a = c34381;
                }

                public final void run() {
                    int height = this.f10494a.f10495a.f10497b.f10506f.getHeight();
                    if (height < this.f10494a.f10495a.f10497b.f10503c) {
                        int c = (this.f10494a.f10495a.f10497b.f10503c - height) / 2;
                        LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                        layoutParams.setMargins(0, c + 8, 0, 0);
                        this.f10494a.f10495a.f10497b.f10506f.setLayoutParams(layoutParams);
                    }
                }
            }

            C34381(C34391 c34391) {
                this.f10495a = c34391;
            }

            public final void run() {
                int size = this.f10495a.f10496a.size();
                this.f10495a.f10497b.f10506f.removeAllViews();
                for (int i = 0; i < size; i++) {
                    ArrayList arrayList = ((C2628c) this.f10495a.f10496a.get(i)).f8530a;
                    int size2 = arrayList.size();
                    int a = ((this.f10495a.f10497b.f10507g - ((this.f10495a.f10497b.f10508h * size2) * 2)) / size2);
                    View a2 = C3442a.m7873a(this.f10495a.f10497b, i, size2);
                    a2.setWeightSum((float) size2);
                    for (int i2 = 0; i2 < size2; i2++) {
                        a2.addView(C3442a.m7874a(this.f10495a.f10497b, arrayList, size2, a, i2));
                    }
                    this.f10495a.f10497b.f10506f.addView(a2);
                }
                if (this.f10495a.f10497b.f10506f != null) {
                    this.f10495a.f10497b.f10506f.post(new C34371(this));
                }
            }
        }

        public C34391(C3442a c3442a, ArrayList arrayList) {
            this.f10497b = c3442a;
            this.f10496a = arrayList;
        }

        public final void run() {
            if (this.f10497b.f10504d != null) {
                this.f10497b.f10504d.runOnUiThread(new C34381(this));
            }
        }
    }

    public interface C3441a {
        void mo2334f(String str, String str2);
    }

    public C3442a(Activity activity, int i, int i2) {
        this.f10504d = activity;
        this.f10507g = i2 - (m7870a(4) * 2);
        this.f10503c = i;
        this.f10505e = activity.getLayoutInflater().inflate(R.layout.fragment_bot_pane_layout, null);
        setContentView(this.f10505e);
        setAnimationStyle(R.style.PopupAnimation);
        setWidth(-1);
        setHeight(i);
        setFocusable(false);
        this.f10506f = (LinearLayout) this.f10505e.findViewById(R.id.frame_layout);
        ((LinearLayout) this.f10505e.findViewById(R.id.linear_layout)).setBackgroundColor(UIThemeManager.getmInstance().getRecycler_view_background_color());
    }

    private int m7870a(int i) {
        return (int) C2491i.m6804b(this.f10504d, (float) i);
    }

    static /* synthetic */ LinearLayout m7873a(C3442a c3442a, int i, int i2) {
        LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2, (float) i2);
        LinearLayout linearLayout = new LinearLayout(c3442a.f10504d);
        linearLayout.removeAllViews();
        linearLayout.setId(i);
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(layoutParams);
        return linearLayout;
    }

    static /* synthetic */ LinearLayout m7874a(C3442a c3442a, ArrayList arrayList, int i, int i2, int i3) {
        LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2, BallPulseIndicator.SCALE);
        LinearLayout linearLayout = new LinearLayout(c3442a.f10504d);
        linearLayout.setPadding(c3442a.f10508h, 8, c3442a.f10508h, 8);
        linearLayout.setLayoutParams(layoutParams);
        Drawable b = C2491i.m6808b(C0346c.m682a(c3442a.f10504d, (int) R.drawable.shape_bot_keyboard_button), UIThemeManager.getmInstance().getBot_button_color());
        Drawable b2 = C2491i.m6808b(C0346c.m682a(c3442a.f10504d, (int) R.drawable.shape_bot_keyboard_button), -3355444);
        View emojiconTextView = new EmojiconTextView(c3442a.f10504d);
        emojiconTextView.setId(i3);
        emojiconTextView.setTextSize(20.0f);
        emojiconTextView.setEmojiconSize(c3442a.f10502b);
        emojiconTextView.setGravity(17);
        emojiconTextView.setText(((C2627b) arrayList.get(i3)).f8528a);
        emojiconTextView.setTextColor(UIThemeManager.getmInstance().getBot_button_text_color());
        if (i == 1) {
            i2 = -1;
        }
        emojiconTextView.setLayoutParams(new LinearLayout.LayoutParams(i2, c3442a.m7870a(60)));
        Drawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{-16842919}, b);
        stateListDrawable.addState(new int[]{16842919}, b2);
        if (VERSION.SDK_INT >= 16) {
            emojiconTextView.setBackground(stateListDrawable);
        } else {
            emojiconTextView.setBackgroundDrawable(stateListDrawable);
        }
        final String str = ((C2627b) arrayList.get(i3)).f8529b;
        final String str2 = ((C2627b) arrayList.get(i3)).f8528a;
        emojiconTextView.setOnClickListener(new OnClickListener(c3442a) {
            final /* synthetic */ C3442a f10500c;

            public final void onClick(View view) {
                this.f10500c.f10501a.mo2334f(str2, str);
            }
        });
        linearLayout.addView(emojiconTextView);
        return linearLayout;
    }
}
