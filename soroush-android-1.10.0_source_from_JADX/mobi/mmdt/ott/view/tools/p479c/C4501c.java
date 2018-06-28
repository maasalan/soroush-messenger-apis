package mobi.mmdt.ott.view.tools.p479c;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.view.components.ProgressWheel;

public final class C4501c {
    static C4501c f12449f;
    Dialog f12450a;
    TextView f12451b;
    ImageView f12452c;
    C5891a f12453d;
    ProgressWheel f12454e;

    class C44982 implements Runnable {
        final /* synthetic */ C4501c f12444a;

        C44982(C4501c c4501c) {
            this.f12444a = c4501c;
        }

        public final void run() {
            try {
                this.f12444a.f12454e.m7554a();
                this.f12444a.f12450a.show();
            } catch (Throwable e) {
                C2480b.m6738b(e);
            }
        }
    }

    class C45004 implements Runnable {
        final /* synthetic */ C4501c f12448a;

        C45004(C4501c c4501c) {
            this.f12448a = c4501c;
        }

        public final void run() {
            try {
                this.f12448a.f12450a.dismiss();
                C4501c.f12449f = null;
            } catch (Throwable e) {
                C2480b.m6738b(e);
            }
        }
    }

    private C4501c() {
    }

    public static C4501c m8189a() {
        if (f12449f == null) {
            f12449f = new C4501c();
        }
        return f12449f;
    }

    private void m8190a(final Activity activity) {
        new Handler(Looper.getMainLooper()).post(new Runnable(this) {
            final /* synthetic */ C4501c f12443b;

            class C44951 implements OnDismissListener {
                final /* synthetic */ C44971 f12440a;

                C44951(C44971 c44971) {
                    this.f12440a = c44971;
                }

                public final void onDismiss(DialogInterface dialogInterface) {
                    C2491i.m6785a(activity);
                }
            }

            class C44962 implements OnClickListener {
                final /* synthetic */ C44971 f12441a;

                C44962(C44971 c44971) {
                    this.f12441a = c44971;
                }

                public final void onClick(View view) {
                    this.f12441a.f12443b.m8193b();
                    if (this.f12441a.f12443b.f12453d != null) {
                        this.f12441a.f12443b.f12453d.cancelJob();
                    }
                }
            }

            public final void run() {
                this.f12443b.f12450a = new Dialog(activity);
                this.f12443b.f12450a.requestWindowFeature(1);
                this.f12443b.f12450a.setContentView(R.layout.dialog_wait);
                this.f12443b.f12451b = (TextView) this.f12443b.f12450a.findViewById(R.id.textView);
                this.f12443b.f12452c = (ImageView) this.f12443b.f12450a.findViewById(R.id.cancel_button);
                this.f12443b.f12454e = (ProgressWheel) this.f12443b.f12450a.findViewById(R.id.progress_wheel);
                this.f12443b.f12450a.getWindow().setBackgroundDrawableResource(R.color.transparent);
                this.f12443b.f12450a.setOnDismissListener(new C44951(this));
                this.f12443b.f12452c.setOnClickListener(new C44962(this));
                this.f12443b.f12454e.m7554a();
                new View[1][0] = this.f12443b.f12452c;
            }
        });
    }

    public final void m8191a(Activity activity, final int i, final boolean z) {
        if (activity != null && !activity.isFinishing()) {
            m8190a(activity);
            C2491i.m6816b(activity);
            new Handler(Looper.getMainLooper()).post(new Runnable(this) {
                final /* synthetic */ C4501c f12447c;

                public final void run() {
                    try {
                        this.f12447c.f12454e.m7554a();
                        this.f12447c.f12451b.setText(i);
                        this.f12447c.f12450a.setCancelable(z);
                        this.f12447c.f12450a.show();
                    } catch (Throwable e) {
                        C2480b.m6738b(e);
                    }
                }
            });
        }
    }

    public final void m8192a(Activity activity, C5891a c5891a) {
        if (activity != null && !activity.isFinishing()) {
            m8190a(activity);
            this.f12453d = c5891a;
            C2491i.m6816b(activity);
            new Handler(Looper.getMainLooper()).post(new C44982(this));
        }
    }

    public final void m8193b() {
        if (this.f12450a != null) {
            new Handler(Looper.getMainLooper()).post(new C45004(this));
        }
    }
}
