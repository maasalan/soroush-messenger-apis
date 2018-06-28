package mobi.mmdt.ott.view.call;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.C7406c;
import android.support.v7.widget.AppCompatButton;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.WindowManager.LayoutParams;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import mobi.mmdt.componentsutils.p232b.C2489g;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.C2808d;
import mobi.mmdt.ott.logic.bot.api.p343b.p344a.C2783b;
import mobi.mmdt.ott.logic.bot.api.p343b.p344a.C6802c;
import mobi.mmdt.ott.logic.p349f.C2814a;
import mobi.mmdt.ott.logic.p366o.p367a.C2878a;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.view.components.p402d.C7576b;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;
import mobi.mmdt.ott.view.tools.C4522p;

public class FeedbackActivityDialog extends C7576b {
    private int f23944m;
    private boolean f23945n;

    class C30531 implements OnClickListener {
        final /* synthetic */ FeedbackActivityDialog f9553a;

        C30531(FeedbackActivityDialog feedbackActivityDialog) {
            this.f9553a = feedbackActivityDialog;
        }

        public final void onClick(View view) {
            this.f9553a.finish();
            this.f9553a.overridePendingTransition(R.anim.anim_fade_in_activity_theme_dialog, R.anim.anim_fade_out_activity_theme_dialog);
        }
    }

    class C30553 implements Runnable {
        final /* synthetic */ FeedbackActivityDialog f9559a;

        C30553(FeedbackActivityDialog feedbackActivityDialog) {
            this.f9559a = feedbackActivityDialog;
        }

        public final void run() {
            StringBuilder stringBuilder = new StringBuilder(" mIsChangeOccur : ");
            stringBuilder.append(this.f9559a.f23945n);
            stringBuilder.append("   getActivity() != null: ");
            stringBuilder.append(FeedbackActivityDialog.m21007c(this.f9559a) != null);
            C2480b.m6742f(stringBuilder.toString());
            if (!this.f9559a.f23945n && FeedbackActivityDialog.m21008d(this.f9559a) != null) {
                this.f9559a.finish();
                this.f9559a.overridePendingTransition(R.anim.anim_fade_in_activity_theme_dialog, R.anim.anim_fade_out_activity_theme_dialog);
            }
        }
    }

    class C30575 implements Runnable {
        final /* synthetic */ FeedbackActivityDialog f9565a;

        C30575(FeedbackActivityDialog feedbackActivityDialog) {
            this.f9565a = feedbackActivityDialog;
        }

        public final void run() {
            C2878a.m7233a(FeedbackActivityDialog.m21009e(this.f9565a), C2814a.CALL);
        }
    }

    private static void m21002a(AppCompatButton appCompatButton, EditText editText) {
        appCompatButton.setEnabled(false);
        appCompatButton.setTextColor(UIThemeManager.disable_color);
        ((RelativeLayout) editText.getParent()).setVisibility(8);
    }

    private static void m21003a(ImageView imageView, int i) {
        imageView.setImageResource(i);
        imageView.setTag(Integer.valueOf(i));
    }

    static /* synthetic */ void m21004a(FeedbackActivityDialog feedbackActivityDialog, ImageView[] imageViewArr, int i, AppCompatButton appCompatButton, EditText editText) {
        FeedbackActivityDialog feedbackActivityDialog2 = feedbackActivityDialog;
        ImageView[] imageViewArr2 = imageViewArr;
        int i2 = i;
        AppCompatButton appCompatButton2 = appCompatButton;
        feedbackActivityDialog2.f23945n = true;
        feedbackActivityDialog2.f23944m = i2;
        int i3 = i2 - 1;
        int i4 = 0;
        if (((Integer) imageViewArr2[i3].getTag()).intValue() == R.drawable.ic_star_empty) {
            for (i2 = 0; i2 <= i3; i2++) {
                ImageView imageView = imageViewArr2[i2];
                m21003a(imageView, (int) R.drawable.ic_star_fill);
                Animation scaleAnimation = new ScaleAnimation(BallPulseIndicator.SCALE, 1.4f, BallPulseIndicator.SCALE, 1.4f, 1, 0.5f, 1, 0.5f);
                scaleAnimation.setFillAfter(true);
                scaleAnimation.setDuration(250);
                scaleAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
                imageView.startAnimation(scaleAnimation);
                Animation scaleAnimation2 = new ScaleAnimation(1.4f, BallPulseIndicator.SCALE, 1.4f, BallPulseIndicator.SCALE, 1, 0.5f, 1, 0.5f);
                scaleAnimation2.setFillAfter(true);
                scaleAnimation2.setDuration(250);
                scaleAnimation2.setInterpolator(new AccelerateDecelerateInterpolator());
                imageView.startAnimation(scaleAnimation2);
                appCompatButton2.setEnabled(true);
                appCompatButton2.setTextColor(-1);
                ((RelativeLayout) editText.getParent()).setVisibility(0);
            }
            return;
        }
        if (m21005a(imageViewArr2[i3])) {
            if (i2 < 5) {
                i3++;
                if (m21005a(imageViewArr2[i3])) {
                    while (i3 < imageViewArr2.length) {
                        m21003a(imageViewArr2[i3], (int) R.drawable.ic_star_empty);
                        i3++;
                    }
                    return;
                }
            }
            i3 = imageViewArr2.length;
            while (i4 < i3) {
                m21003a(imageViewArr2[i4], (int) R.drawable.ic_star_empty);
                i4++;
            }
            m21002a(appCompatButton, editText);
        }
    }

    private static boolean m21005a(ImageView imageView) {
        return ((Integer) imageView.getTag()).intValue() == R.drawable.ic_star_fill;
    }

    static /* synthetic */ C7406c m21007c(FeedbackActivityDialog feedbackActivityDialog) {
        return feedbackActivityDialog;
    }

    static /* synthetic */ C7406c m21008d(FeedbackActivityDialog feedbackActivityDialog) {
        return feedbackActivityDialog;
    }

    static /* synthetic */ C7406c m21009e(FeedbackActivityDialog feedbackActivityDialog) {
        return feedbackActivityDialog;
    }

    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.anim_fade_in_activity_theme_dialog, R.anim.anim_fade_out_activity_theme_dialog);
    }

    public void onCreate(Bundle bundle) {
        long j;
        String str;
        String str2;
        super.onCreate(bundle);
        getWindow().setFlags(32, 32);
        getWindow().setFlags(262144, 262144);
        getWindow().setSoftInputMode(3);
        int a = C2489g.m6754a().m6755a(BallPulseIndicator.SCALE);
        LayoutParams attributes = getWindow().getAttributes();
        attributes.width = a;
        attributes.height = C2489g.m6754a().m6756b(BallPulseIndicator.SCALE);
        getWindow().setAttributes(attributes);
        setContentView((int) R.layout.activity_call_feedback);
        a = a <= 720 ? C2489g.m6754a().m6755a(0.95f) : C2489g.m6754a().m6756b(0.8f);
        if (getIntent() == null || getIntent().getExtras() == null) {
            j = 0;
            str = null;
            str2 = str;
        } else {
            String stringExtra = getIntent().getStringExtra("KEY_CALLER");
            str = getIntent().getStringExtra("KEY_CALLEE");
            j = getIntent().getLongExtra("KEY_DURATION", 0);
            str2 = str;
            str = stringExtra;
        }
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.root_frameLayout);
        frameLayout.setBackgroundColor(0);
        frameLayout.setOnClickListener(new C30531(r7));
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.root_linearLayout);
        C2491i.m6790a(linearLayout.getBackground(), UIThemeManager.getmInstance().getFeedback_dialog_background_color());
        linearLayout.setOnClickListener(null);
        int b = (int) C2491i.m6804b(MyApplication.m12952b(), 4.0f);
        linearLayout.setPadding(b, b, b, b);
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(a, -2);
        layoutParams.gravity = 17;
        linearLayout.setLayoutParams(layoutParams);
        C2491i.m6801a((ImageView) findViewById(R.id.logo), -1);
        TextView textView = (TextView) findViewById(R.id.text_view);
        b = 1;
        textView.setTypeface(textView.getTypeface(), 1);
        EditText editText = (EditText) findViewById(R.id.feed_back_edit_text);
        editText.setMaxLines(3);
        AppCompatButton appCompatButton = (AppCompatButton) findViewById(R.id.send_button);
        appCompatButton.setTypeface(appCompatButton.getTypeface(), 1);
        m21002a(appCompatButton, editText);
        ImageView imageView = (ImageView) findViewById(R.id.star_1);
        ImageView imageView2 = (ImageView) findViewById(R.id.star_2);
        ImageView imageView3 = (ImageView) findViewById(R.id.star_3);
        ImageView imageView4 = (ImageView) findViewById(R.id.star_4);
        ImageView imageView5 = (ImageView) findViewById(R.id.star_5);
        int i = 5;
        ImageView[] imageViewArr = new ImageView[]{imageView, imageView2, imageView3, imageView4, imageView5};
        for (a = 0; a < 5; a++) {
            imageViewArr[a].setTag(Integer.valueOf(R.drawable.ic_star_empty));
        }
        int i2 = 0;
        while (i2 < i) {
            int i3 = b + 1;
            ImageView[] imageViewArr2 = imageViewArr;
            final ImageView[] imageViewArr3 = imageViewArr2;
            C30564 c30564 = r0;
            final AppCompatButton appCompatButton2 = appCompatButton;
            ImageView imageView6 = imageViewArr[i2];
            final EditText editText2 = editText;
            C30564 c305642 = new OnClickListener(r7) {
                final /* synthetic */ FeedbackActivityDialog f9564e;

                public final void onClick(View view) {
                    FeedbackActivityDialog.m21004a(this.f9564e, imageViewArr3, b, appCompatButton2, editText2);
                }
            };
            imageView6.setOnClickListener(c30564);
            i2++;
            b = i3;
            imageViewArr = imageViewArr2;
            i = 5;
        }
        final EditText editText3 = editText;
        final String str3 = str;
        final String str4 = str2;
        final long j2 = j;
        appCompatButton.setOnClickListener(new OnClickListener(r7) {
            final /* synthetic */ FeedbackActivityDialog f9558e;

            public final void onClick(View view) {
                String obj = editText3.getText().toString();
                StringBuilder stringBuilder = new StringBuilder("::>> ");
                stringBuilder.append(obj);
                stringBuilder.append("  score : ");
                stringBuilder.append(this.f9558e.f23944m);
                C2480b.m6742f(stringBuilder.toString());
                String str = str3;
                String str2 = str4;
                int a = this.f9558e.f23944m;
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append(j2);
                C2808d.m7147a(new C6802c(str, str2, a, obj, stringBuilder2.toString()));
                Toast.makeText(this.f9558e, C4522p.m8236a(R.string.send_feedback_toast), 0).show();
            }
        });
        if (!(getWindow() == null || getWindow().getDecorView() == null)) {
            getWindow().getDecorView().setBackgroundColor(0);
        }
        new Handler().postDelayed(new C30553(r7), 10000);
    }

    public void onEvent(C2783b c2783b) {
        if (c2783b.f8794a) {
            runOnUiThread(new C30575(this));
        } else {
            finish();
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (4 != motionEvent.getAction()) {
            return super.onTouchEvent(motionEvent);
        }
        finish();
        overridePendingTransition(R.anim.anim_fade_in_activity_theme_dialog, R.anim.anim_fade_out_activity_theme_dialog);
        return false;
    }
}
