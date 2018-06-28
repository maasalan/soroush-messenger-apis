package mobi.mmdt.ott.view.conversation.p432e.p433a.p443j;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.provider.p384f.C2971k;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.conversation.p418a.C3284e;
import mobi.mmdt.ott.view.conversation.p418a.C3286g;
import mobi.mmdt.ott.view.conversation.p573f.p597a.C7358a;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p609j.C7684l;
import mobi.mmdt.ott.view.tools.C4520n;

public final class C7549l extends C7354b {
    private TextView f23026d = ((TextView) this.itemView.findViewById(R.id.content_textView));
    private ImageView f23027e = ((ImageView) this.itemView.findViewById(R.id.status_imageView));
    private boolean f23028f;
    private LinearLayout f23029g = ((LinearLayout) this.itemView.findViewById(R.id.layout_balloon_chat_background));

    class C39641 implements OnLongClickListener {
        final /* synthetic */ C7549l f11456a;

        C39641(C7549l c7549l) {
            this.f11456a = c7549l;
        }

        public final boolean onLongClick(View view) {
            this.f11456a.f23028f = true;
            return false;
        }
    }

    class C39652 implements OnTouchListener {
        final /* synthetic */ C7549l f11457a;

        C39652(C7549l c7549l) {
            this.f11457a = c7549l;
        }

        @SuppressLint({"ClickableViewAccessibility"})
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1 && this.f11457a.f23028f) {
                this.f11457a.f23028f = false;
                return true;
            }
            if (motionEvent.getAction() == 0) {
                this.f11457a.f23028f = false;
            }
            return view.onTouchEvent(motionEvent);
        }
    }

    static /* synthetic */ class C39663 {
        static final /* synthetic */ int[] f11458a = new int[C2971k.values().length];

        static {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r0 = mobi.mmdt.ott.provider.p384f.C2971k.values();
            r0 = r0.length;
            r0 = new int[r0];
            f11458a = r0;
            r0 = f11458a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = mobi.mmdt.ott.provider.p384f.C2971k.ERROR;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = f11458a;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = mobi.mmdt.ott.provider.p384f.C2971k.SENDING;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;	 Catch:{ NoSuchFieldError -> 0x001f }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = f11458a;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = mobi.mmdt.ott.provider.p384f.C2971k.PENDING;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;	 Catch:{ NoSuchFieldError -> 0x002a }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r0 = f11458a;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = mobi.mmdt.ott.provider.p384f.C2971k.PENDING_RETRANSMIT;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r2 = 4;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            r0 = f11458a;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r1 = mobi.mmdt.ott.provider.p384f.C2971k.NOT_SEEN;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0040 }
            r2 = 5;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0040 }
        L_0x0040:
            r0 = f11458a;	 Catch:{ NoSuchFieldError -> 0x004b }
            r1 = mobi.mmdt.ott.provider.p384f.C2971k.DELIVERED;	 Catch:{ NoSuchFieldError -> 0x004b }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x004b }
            r2 = 6;	 Catch:{ NoSuchFieldError -> 0x004b }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x004b }
        L_0x004b:
            r0 = f11458a;	 Catch:{ NoSuchFieldError -> 0x0056 }
            r1 = mobi.mmdt.ott.provider.p384f.C2971k.SEEN;	 Catch:{ NoSuchFieldError -> 0x0056 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0056 }
            r2 = 7;	 Catch:{ NoSuchFieldError -> 0x0056 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0056 }
        L_0x0056:
            r0 = f11458a;	 Catch:{ NoSuchFieldError -> 0x0062 }
            r1 = mobi.mmdt.ott.provider.p384f.C2971k.NOT_READ;	 Catch:{ NoSuchFieldError -> 0x0062 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0062 }
            r2 = 8;	 Catch:{ NoSuchFieldError -> 0x0062 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0062 }
        L_0x0062:
            r0 = f11458a;	 Catch:{ NoSuchFieldError -> 0x006e }
            r1 = mobi.mmdt.ott.provider.p384f.C2971k.READ;	 Catch:{ NoSuchFieldError -> 0x006e }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x006e }
            r2 = 9;	 Catch:{ NoSuchFieldError -> 0x006e }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x006e }
        L_0x006e:
            r0 = f11458a;	 Catch:{ NoSuchFieldError -> 0x007a }
            r1 = mobi.mmdt.ott.provider.p384f.C2971k.DRAFT;	 Catch:{ NoSuchFieldError -> 0x007a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x007a }
            r2 = 10;	 Catch:{ NoSuchFieldError -> 0x007a }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x007a }
        L_0x007a:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.conversation.e.a.j.l.3.<clinit>():void");
        }
    }

    public C7549l(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, C3286g c3286g, C3284e c3284e) {
        super(activity, layoutInflater, viewGroup, R.layout.chat_text_output_list_item, c3286g, c3284e);
        this.f23026d.setOnLongClickListener(new C39641(this));
        this.f23026d.setOnTouchListener(new C39652(this));
    }

    protected final void mo3180a(C6829g c6829g) {
        ImageView imageView;
        super.mo3180a(c6829g);
        C7684l c7684l = (C7684l) c6829g;
        this.f23026d.setTextSize((float) c7684l.f23853Q);
        this.f23026d.setText(c7684l.f23852P);
        C4520n.m8234a(this.f23026d);
        int i = C39663.f11458a[c7684l.f21337w.ordinal()];
        int i2 = R.drawable.ic_message_tick_white;
        switch (i) {
            case 1:
                imageView = this.f23027e;
                i2 = R.drawable.ic_message_error;
                break;
            case 2:
                imageView = this.f23027e;
                i2 = R.drawable.ic_message_schedule_white;
                break;
            case 7:
                imageView = this.f23027e;
                i2 = R.drawable.ic_message_tick_double_seen;
                break;
            case 8:
            case 9:
            case 10:
                m19051a((C7358a) c7684l, this.f23029g, true);
            default:
                imageView = this.f23027e;
                break;
        }
        imageView.setImageResource(i2);
        m19051a((C7358a) c7684l, this.f23029g, true);
    }
}
