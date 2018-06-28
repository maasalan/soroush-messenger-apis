package mobi.mmdt.ott.view.conversation.p424b;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Timer;
import java.util.TimerTask;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.p240c.C2524c.C2522a;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.view.components.p400b.C3110a;
import mobi.mmdt.ott.view.components.p400b.C3110a.C6060a;
import mobi.mmdt.ott.view.components.p400b.p529d.C6063a;
import mobi.mmdt.ott.view.components.p400b.p529d.C6066d;
import mobi.mmdt.ott.view.conversation.emojisticker.emoji.emojicon.EmojiconEditText;
import mobi.mmdt.ott.view.conversation.emojisticker.emoji.emojicon.EmojiconEditText.C4026a;
import mobi.mmdt.ott.view.conversation.p424b.C6127a;
import mobi.mmdt.ott.view.conversation.p424b.p425a.C3399a;
import mobi.mmdt.ott.view.conversation.p424b.p426b.C3400a;
import mobi.mmdt.ott.view.conversation.p424b.p426b.C3403b;
import mobi.mmdt.ott.view.conversation.p424b.p426b.C3403b.C3402a;
import mobi.mmdt.ott.view.tools.C4522p;
import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;

public final class C6127a implements C4026a {
    final C3404b f16514a;
    public EmojiconEditText f16515b;
    ImageView f16516c;
    public ImageView f16517d;
    public ImageView f16518e;
    boolean f16519f = false;
    public boolean f16520g = false;
    public boolean f16521h = false;
    Timer f16522i = null;
    public C3399a f16523j;
    TextView f16524k;
    LayoutParams f16525l;
    boolean f16526m = false;
    public ImageView f16527n;
    public ImageView f16528o;
    public TextView f16529p;
    public final View f16530q;
    public int f16531r = -1;
    final C3403b f16532s;
    boolean f16533t = false;
    private FrameLayout f16534u;
    private LinearLayout f16535v;
    private final Bundle f16536w;
    private boolean f16537x;
    private final TextWatcher f16538y = new C33945(this);

    class AnonymousClass17 implements Runnable {
        final /* synthetic */ int f10405a;
        final /* synthetic */ C6127a f10406b;

        AnonymousClass17(C6127a c6127a, int i) {
            this.f10406b = c6127a;
            this.f10405a = i;
        }

        public final void run() {
            this.f10406b.f16525l.rightMargin = this.f10405a;
            this.f10406b.f16524k.setLayoutParams(this.f10406b.f16525l);
        }
    }

    class C33891 implements OnClickListener {
        final /* synthetic */ C6127a f10407a;

        C33891(C6127a c6127a) {
            this.f10407a = c6127a;
        }

        public final void onClick(View view) {
            if (!this.f10407a.f16533t) {
                this.f10407a.m14056a();
                this.f10407a.f16514a.mo2345t();
            }
        }
    }

    class C33902 implements Runnable {
        final /* synthetic */ C6127a f10408a;

        C33902(C6127a c6127a) {
            this.f10408a = c6127a;
        }

        public final void run() {
            C3403b c3403b = this.f10408a.f16532s;
            c3403b.f10430b.setText(C4522p.m8236a(R.string.timer));
            View view = c3403b.f10429a;
            C6060a a = C3110a.m7562a(new C6063a());
            a.f9674c = 250;
            a.f9676e = new AccelerateDecelerateInterpolator();
            a.m7561a(view);
        }
    }

    class C33913 implements Runnable {
        final /* synthetic */ C6127a f10409a;

        C33913(C6127a c6127a) {
            this.f10409a = c6127a;
        }

        public final void run() {
            View view = this.f10409a.f16532s.f10429a;
            C6060a a = C3110a.m7562a(new C6066d());
            a.f9674c = 250;
            a.f9676e = new AccelerateDecelerateInterpolator();
            a.m7561a(view);
        }
    }

    class C33924 implements Runnable {
        final /* synthetic */ C6127a f10410a;

        C33924(C6127a c6127a) {
            this.f10410a = c6127a;
        }

        public final void run() {
            this.f10410a.f16525l.rightMargin = 0;
            this.f10410a.f16524k.setLayoutParams(this.f10410a.f16525l);
        }
    }

    class C33945 implements TextWatcher {
        final /* synthetic */ C6127a f10412a;

        class C33931 extends TimerTask {
            final /* synthetic */ C33945 f10411a;

            C33931(C33945 c33945) {
                this.f10411a = c33945;
            }

            public final void run() {
                this.f10411a.f10412a.f16526m = false;
                this.f10411a.f10412a.f16514a.mo3209a(C2522a.PAUSED);
            }
        }

        C33945(C6127a c6127a) {
            this.f10412a = c6127a;
        }

        public final void afterTextChanged(Editable editable) {
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            int length = charSequence != null ? charSequence.length() : 0;
            if (!this.f10412a.f16526m) {
                this.f10412a.f16526m = true;
                this.f10412a.f16514a.mo3209a(C2522a.COMPOSING);
            }
            if (this.f10412a.f16522i != null) {
                this.f10412a.f16522i.cancel();
                this.f10412a.f16522i.purge();
            }
            this.f10412a.f16522i = new Timer();
            this.f10412a.f16522i.schedule(new C33931(this), 2000);
            if (this.f10412a.f16521h) {
                C6127a c6127a = this.f10412a;
                c6127a.f16521h = true;
                c6127a.f16517d.setImageResource(R.drawable.ic_edit_tick);
                C2491i.m6801a(c6127a.f16517d, UIThemeManager.getmInstance().getAccent_color());
                if (this.f10412a.f16531r > 0 && length >= this.f10412a.f16531r) {
                    Context context = this.f10412a.f16515b.getContext();
                    Object[] objArr = new Object[1];
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(this.f10412a.f16531r);
                    objArr[0] = stringBuilder.toString();
                    Toast.makeText(context, context.getString(R.string.the_maximum_count_character, objArr), 0).show();
                }
            } else if (i2 == 0) {
                this.f10412a.f16520g = true;
                this.f10412a.f16517d.setImageResource(R.drawable.ic_content_send);
                C2491i.m6801a(this.f10412a.f16517d, UIThemeManager.getmInstance().getText_primary_color());
                this.f10412a.f16518e.setVisibility(8);
                if (this.f10412a.f16523j != null) {
                    this.f10412a.f16523j.m7842c();
                }
                C6127a.m14055a(this.f10412a.f16515b, 0, 4, 0);
            } else if (length == 0) {
                this.f10412a.m14062b();
                this.f10412a.m14071g();
            }
        }
    }

    class C33956 implements Runnable {
        final /* synthetic */ String f10413a;
        final /* synthetic */ boolean f10414b;
        final /* synthetic */ C6127a f10415c;

        public C33956(C6127a c6127a, String str, boolean z) {
            this.f10415c = c6127a;
            this.f10413a = str;
            this.f10414b = z;
        }

        public final void run() {
            this.f10415c.f16515b.setText(this.f10413a);
            this.f10415c.f16515b.setSelection(this.f10415c.f16515b.getText().length());
            InputFilter[] inputFilterArr = new InputFilter[1];
            this.f10415c.f16531r = this.f10414b ? IjkMediaCodecInfo.RANK_MAX : 4000;
            inputFilterArr[0] = new LengthFilter(this.f10415c.f16531r);
            this.f10415c.f16515b.setFilters(inputFilterArr);
        }
    }

    class C33967 implements Runnable {
        final /* synthetic */ String f10416a;
        final /* synthetic */ C6127a f10417b;

        public C33967(C6127a c6127a, String str) {
            this.f10417b = c6127a;
            this.f10416a = str;
        }

        public final void run() {
            this.f10417b.f16515b.setText(this.f10416a);
        }
    }

    class C33978 implements Runnable {
        final /* synthetic */ C6127a f10418a;

        C33978(C6127a c6127a) {
            this.f10418a = c6127a;
        }

        public final void run() {
            this.f10418a.f16515b.setText("");
        }
    }

    public C6127a(final Activity activity, Bundle bundle, C3404b c3404b, C3400a c3400a, boolean z) {
        this.f16536w = bundle;
        this.f16514a = c3404b;
        this.f16530q = LayoutInflater.from(activity).inflate(R.layout.fragment_conversation_text_box, null, false);
        if (this.f16536w != null) {
            if (this.f16536w.containsKey("KEY_TEXT_BOX_IS_EDIT_MODE")) {
                this.f16521h = this.f16536w.getBoolean("KEY_TEXT_BOX_IS_EDIT_MODE");
            }
            if (this.f16536w.containsKey("KEY_TEXT_BOX_IS_EDIT_MODE")) {
                this.f16537x = this.f16536w.getBoolean("KEY_SET_CAPTION_LIMIT", false);
            }
        }
        this.f16534u = (FrameLayout) this.f16530q.findViewById(R.id.frame_layout_root);
        this.f16515b = (EmojiconEditText) this.f16530q.findViewById(R.id.editText);
        this.f16516c = (ImageView) this.f16530q.findViewById(R.id.left_imageView);
        this.f16517d = (ImageView) this.f16530q.findViewById(R.id.right_imageView);
        this.f16518e = (ImageView) this.f16530q.findViewById(R.id.attach_imageView);
        this.f16524k = (TextView) this.f16530q.findViewById(R.id.slide_textView);
        this.f16535v = (LinearLayout) this.f16530q.findViewById(R.id.find_linear_layout);
        this.f16529p = (TextView) this.f16530q.findViewById(R.id.text_find);
        this.f16527n = (ImageView) this.f16530q.findViewById(R.id.up_find);
        this.f16528o = (ImageView) this.f16530q.findViewById(R.id.down_find);
        this.f16525l = (LayoutParams) this.f16524k.getLayoutParams();
        this.f16515b.addTextChangedListener(this.f16538y);
        if (this.f16537x) {
            this.f16531r = IjkMediaCodecInfo.RANK_MAX;
            this.f16515b.setFilters(new InputFilter[]{new LengthFilter(this.f16531r)});
        } else {
            this.f16531r = -1;
            this.f16515b.setFilters(new InputFilter[0]);
        }
        this.f16515b.setOnImeBackListener(this);
        this.f16515b.setTextSize((float) C2535a.m6888a().m6891B());
        m14071g();
        this.f16515b.setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ C6127a f10396a;

            {
                this.f10396a = r1;
            }

            public final void onClick(View view) {
                if (this.f10396a.f16519f) {
                    this.f10396a.f16519f = false;
                    this.f10396a.f16516c.setImageResource(R.drawable.ic_hardware_keyboard_alt);
                    this.f10396a.f16514a.mo2344s();
                }
            }
        });
        this.f16517d.setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ C6127a f10398b;

            public final void onClick(View view) {
                if (this.f10398b.f16533t) {
                    this.f10398b.f16533t = false;
                } else if (this.f10398b.f16521h) {
                    this.f10398b.f16514a.mo2328d(this.f10398b.f16515b.getText().toString().trim());
                } else {
                    if (this.f10398b.f16520g) {
                        this.f10398b.f16514a.mo2324c(this.f10398b.m14064c());
                        this.f10398b.m14063b(activity);
                    }
                }
            }
        });
        this.f16518e.setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ C6127a f10399a;

            {
                this.f10399a = r1;
            }

            public final void onClick(View view) {
                this.f10399a.f16514a.mo2349y();
            }
        });
        this.f16516c.setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ C6127a f10400a;

            {
                this.f10400a = r1;
            }

            public final void onClick(View view) {
                if (!this.f10400a.f16533t) {
                    if (this.f10400a.f16519f) {
                        this.f10400a.f16519f = false;
                        this.f10400a.f16516c.setImageResource(R.drawable.ic_hardware_keyboard_alt);
                    } else {
                        this.f10400a.f16519f = true;
                        this.f10400a.f16516c.setImageResource(R.drawable.ic_hardware_keyboard);
                        if (this.f10400a.f16523j != null) {
                            this.f10400a.f16523j.m7841b();
                        }
                    }
                    this.f10400a.f16514a.mo2344s();
                }
            }
        });
        this.f16527n.setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ C6127a f10401a;

            {
                this.f10401a = r1;
            }

            public final void onClick(View view) {
                this.f10401a.f16514a.mo2297G();
            }
        });
        this.f16528o.setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ C6127a f10402a;

            {
                this.f10402a = r1;
            }

            public final void onClick(View view) {
                this.f10402a.f16514a.mo2298H();
            }
        });
        this.f16517d.setOnTouchListener(new OnTouchListener(this) {
            final /* synthetic */ C6127a f10404b;

            /* JADX WARNING: inconsistent code. */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final boolean onTouch(android.view.View r7, android.view.MotionEvent r8) {
                /*
                r6 = this;
                r7 = r6.f10404b;
                r7 = r7.f16520g;
                r0 = 0;
                if (r7 != 0) goto L_0x00d3;
            L_0x0007:
                r7 = r6.f10404b;
                r7 = r7.f16521h;
                if (r7 != 0) goto L_0x00d3;
            L_0x000d:
                if (r8 == 0) goto L_0x00d3;
            L_0x000f:
                r7 = r8.getAction();
                r1 = 1;
                switch(r7) {
                    case 0: goto L_0x008c;
                    case 1: goto L_0x0061;
                    case 2: goto L_0x002d;
                    case 3: goto L_0x0018;
                    default: goto L_0x0017;
                };
            L_0x0017:
                return r0;
            L_0x0018:
                r7 = r6.f10404b;
                r8 = r5;
                r7.m14058a(r8);
                r8 = r7.f16515b;
                r8.setEnabled(r1);
            L_0x0024:
                r8 = r7.f16532s;
                r8.m7847a();
            L_0x0029:
                r7.m14061a(r1);
                return r0;
            L_0x002d:
                r7 = r6.f10404b;
                r2 = r5;
                r3 = 1118306304; // 0x42a80000 float:84.0 double:5.525167263E-315;
                r3 = mobi.mmdt.componentsutils.p232b.C2491i.m6804b(r2, r3);
                r3 = (int) r3;
                r4 = new android.os.Handler;
                r4.<init>();
                r8 = r8.getX();
                r8 = -r8;
                r8 = (int) r8;
                if (r8 <= 0) goto L_0x00d3;
            L_0x0045:
                if (r8 >= r3) goto L_0x0050;
            L_0x0047:
                r1 = new mobi.mmdt.ott.view.conversation.b.a$17;
                r1.<init>(r7, r8);
                r4.post(r1);
                return r0;
            L_0x0050:
                r7.m14058a(r2);
                r8 = r7.f16515b;
                r8.setEnabled(r1);
                r8 = r7.f16532s;
                r8.m7847a();
                r7.m14061a(r0);
                return r0;
            L_0x0061:
                r7 = r6.f10404b;
                r8 = r5;
                r7.f16533t = r0;
                r2 = r7.f16532s;
                r2 = r2.f10434f;
                r3 = mobi.mmdt.ott.view.conversation.p424b.p426b.C3403b.C3402a.RECORDING;
                r2 = r2.equals(r3);
                if (r2 == 0) goto L_0x0029;
            L_0x0073:
                r7.m14058a(r8);
                r8 = r7.f16515b;
                r8.setEnabled(r1);
                r8 = r7.f16532s;
                r2 = r8.f10431c;
                r4 = 1;
                r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
                if (r8 >= 0) goto L_0x0086;
            L_0x0085:
                goto L_0x0024;
            L_0x0086:
                r8 = r7.f16532s;
                r8.m7848b();
                goto L_0x0029;
            L_0x008c:
                r7 = r6.f10404b;
                r8 = r5;
                mobi.mmdt.componentsutils.p232b.C2491i.m6816b(r8);
                r2 = 40;
                mobi.mmdt.componentsutils.p232b.C2491i.m6787a(r8, r2);
                r2 = r7.f16532s;
                r3 = r2.f10433e;
                if (r3 == 0) goto L_0x00a3;
            L_0x009e:
                r3 = r2.f10433e;
                r3.cancel();
            L_0x00a3:
                r3 = 0;
                r2.f10431c = r3;
                r3 = new mobi.mmdt.ott.view.conversation.b.b.b$1;
                r3.<init>(r2, r8);
                r8 = r3.start();
                r2.f10433e = r8;
                r8 = new android.os.Handler;
                r8.<init>();
                r2 = new mobi.mmdt.ott.view.conversation.b.a$2;
                r2.<init>(r7);
                r3 = 25;
                r8.postDelayed(r2, r3);
                r8 = r7.f16519f;
                if (r8 == 0) goto L_0x00ca;
            L_0x00c5:
                r8 = r7.f16515b;
                r8.setEnabled(r0);
            L_0x00ca:
                r7.f16533t = r1;
                r7 = r7.f16532s;
                r7 = r7.f10432d;
                r7.mo2350z();
            L_0x00d3:
                return r0;
                */
                throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.conversation.b.a.16.onTouch(android.view.View, android.view.MotionEvent):boolean");
            }
        });
        C2491i.m6779a(UIThemeManager.getmInstance().getText_primary_color(), UIThemeManager.getmInstance().getText_primary_new_design_with_opacity_color(), UIThemeManager.getmInstance().getAccent_color(), this.f16515b);
        this.f16515b.setHighlightColor(UIThemeManager.color_text_selection_theme);
        C2491i.m6796a(this.f16534u, UIThemeManager.getmInstance().getRecycler_view_background_color());
        C2491i.m6784a(UIThemeManager.getmInstance().getText_secondary_color(), this.f16529p, this.f16524k);
        C2491i.m6783a(UIThemeManager.getmInstance().getText_primary_color(), this.f16516c, this.f16517d, this.f16518e);
        this.f16532s = new C3403b(this.f16530q, c3400a);
        if (z) {
            this.f16523j = new C3399a(this.f16530q, new C33891(this));
        }
    }

    static void m14055a(View view, int i, int i2, int i3) {
        Context context = view.getContext();
        view.setPadding((int) C2491i.m6804b(context, 52.0f), (int) C2491i.m6804b(context, (float) i), (int) C2491i.m6804b(context, (float) i2), (int) C2491i.m6804b(context, (float) i3));
    }

    public final void m14056a() {
        if (this.f16523j != null) {
            if (this.f16523j.m7840a()) {
                this.f16519f = false;
                this.f16516c.setImageResource(R.drawable.ic_hardware_keyboard_alt);
            }
            C3399a c3399a = this.f16523j;
            if (c3399a.f10422b) {
                c3399a.m7841b();
            } else {
                c3399a.f10422b = true;
                c3399a.f10421a.setImageResource(R.drawable.ic_hardware_keyboard);
            }
        }
    }

    public final void m14057a(int i, int i2) {
        this.f16529p.setText(String.format(C4522p.m8236a(R.string.current_of_count), new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}));
        this.f16527n.setImageResource(R.drawable.ic_keyboard_arrow_up_black_disable);
        this.f16528o.setImageResource(R.drawable.ic_keyboard_arrow_down_black_disable);
        if (i2 == 1) {
            C2491i.m6801a(this.f16527n, (int) UIThemeManager.disable_color);
            C2491i.m6801a(this.f16528o, (int) UIThemeManager.disable_color);
            return;
        }
        if (i2 > 1) {
            if (i == 1) {
                C2491i.m6801a(this.f16527n, UIThemeManager.getmInstance().getAccent_color());
                C2491i.m6801a(this.f16528o, (int) UIThemeManager.disable_color);
            } else if (i < i2) {
                C2491i.m6801a(this.f16527n, UIThemeManager.getmInstance().getAccent_color());
                C2491i.m6801a(this.f16528o, UIThemeManager.getmInstance().getAccent_color());
            } else if (i == i2) {
                C2491i.m6801a(this.f16527n, (int) UIThemeManager.disable_color);
                C2491i.m6801a(this.f16528o, UIThemeManager.getmInstance().getAccent_color());
            }
        }
    }

    final void m14058a(Activity activity) {
        C2491i.m6787a((Context) activity, 40);
        new Handler().postDelayed(new C33913(this), 25);
        new Handler().postDelayed(new C33924(this), 500);
        C2491i.m6785a(activity);
    }

    public final void m14059a(Activity activity, final Integer num) {
        activity.runOnUiThread(new Runnable(this) {
            final /* synthetic */ C6127a f10420b;

            public final void run() {
                if (num == null) {
                    this.f10420b.f16531r = -1;
                    this.f10420b.f16515b.setFilters(new InputFilter[0]);
                    return;
                }
                this.f10420b.f16531r = num.intValue();
                this.f10420b.f16515b.setFilters(new InputFilter[]{new LengthFilter(this.f10420b.f16531r)});
            }
        });
    }

    public final void m14060a(C3402a c3402a) {
        if (this.f16532s != null) {
            this.f16532s.f10434f = c3402a;
        }
    }

    final void m14061a(boolean z) {
        if (this.f16515b != null && this.f16515b.getText().length() > 0) {
            this.f16533t = z;
            this.f16520g = true;
            this.f16517d.setImageResource(R.drawable.ic_content_send);
            C2491i.m6801a(this.f16517d, UIThemeManager.getmInstance().getText_primary_color());
        }
    }

    public final void m14062b() {
        this.f16520g = false;
        this.f16521h = false;
        this.f16517d.setImageResource(R.drawable.ic_av_mic);
        C2491i.m6801a(this.f16517d, UIThemeManager.getmInstance().getText_primary_color());
        this.f16518e.setVisibility(0);
        if (this.f16523j != null) {
            this.f16523j.m7843d();
        }
        C6127a.m14055a(this.f16515b, 0, 52, 0);
    }

    public final void m14063b(Activity activity) {
        activity.runOnUiThread(new C33978(this));
    }

    public final String m14064c() {
        return this.f16515b.getText().toString();
    }

    public final void m14065c(Activity activity) {
        C3406c.m7858a(activity, this.f16515b);
    }

    public final void m14066d() {
        this.f16519f = false;
        this.f16516c.setImageResource(R.drawable.ic_hardware_keyboard_alt);
        if (this.f16523j != null) {
            this.f16523j.m7841b();
        }
    }

    public final void m14067d(Activity activity) {
        C3406c.m7860b(activity, this.f16515b);
    }

    public final void mo2353e() {
        this.f16514a.mo2343r();
    }

    public final void m14069e(Activity activity) {
        this.f16535v.setVisibility(0);
        if (this.f16519f) {
            this.f16514a.mo2344s();
            m14067d(activity);
            this.f16519f = false;
        }
        this.f16527n.setImageResource(R.drawable.ic_keyboard_arrow_up_black_disable);
        this.f16528o.setImageResource(R.drawable.ic_keyboard_arrow_down_black_disable);
        this.f16515b.setVisibility(8);
        this.f16516c.setVisibility(8);
        this.f16517d.setVisibility(8);
        this.f16518e.setVisibility(8);
        if (this.f16523j != null) {
            this.f16523j.m7842c();
        }
    }

    public final void m14070f() {
        this.f16535v.setVisibility(8);
        this.f16515b.setVisibility(0);
        if (this.f16515b.getText().toString().isEmpty()) {
            this.f16518e.setVisibility(0);
            if (this.f16523j != null) {
                this.f16523j.m7843d();
            }
        } else {
            this.f16520g = true;
            this.f16517d.setImageResource(R.drawable.ic_content_send);
            C2491i.m6801a(this.f16517d, UIThemeManager.getmInstance().getText_primary_color());
            this.f16518e.setVisibility(8);
            if (this.f16523j != null) {
                this.f16523j.m7842c();
            }
        }
        this.f16516c.setVisibility(0);
        this.f16517d.setVisibility(0);
    }

    final void m14071g() {
        if (this.f16515b != null && this.f16523j != null) {
            C6127a.m14055a(this.f16515b, 8, this.f16515b.getText().length() > 0 ? 4 : 100, 8);
        }
    }
}
