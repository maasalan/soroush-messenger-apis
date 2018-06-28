package mobi.mmdt.ott.view.conversation.p432e.p433a.p436c;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.View.OnLongClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import java.util.ArrayList;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.C2570c;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.C2571d;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.C2573f;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.base.PollUtils;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.poll.base.PollType;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.conversation.C3407b;
import mobi.mmdt.ott.view.conversation.e.a.c.i.AnonymousClass12;
import mobi.mmdt.ott.view.conversation.e.a.c.i.AnonymousClass16;
import mobi.mmdt.ott.view.conversation.p418a.C3280a;
import mobi.mmdt.ott.view.conversation.p418a.C3281b;
import mobi.mmdt.ott.view.conversation.p418a.C3284e;
import mobi.mmdt.ott.view.conversation.p418a.C3286g;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p436c.C7455i;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p436c.C7455i.12.C35861;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p436c.C7455i.16.C35871;
import mobi.mmdt.ott.view.conversation.p573f.C7197a;
import mobi.mmdt.ott.view.conversation.p573f.p597a.C7358a;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p602c.C7590i;
import mobi.mmdt.ott.view.main.C4144a;
import org.json.JSONObject;

public final class C7455i extends C7347b {
    private TextView f21928e;
    private LinearLayout f21929f;
    private Button f21930g;
    private Button f21931h;
    private boolean f21932i;
    private int f21933j;
    private View f21934k;
    private Button f21935l;

    class C35881 implements OnLongClickListener {
        final /* synthetic */ C7455i f10774a;

        C35881(C7455i c7455i) {
            this.f10774a = c7455i;
        }

        public final boolean onLongClick(View view) {
            this.f10774a.f21932i = true;
            return false;
        }
    }

    public C7455i(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, int i, C3280a c3280a, C3286g c3286g, C3284e c3284e) {
        C7347b c7347b = this;
        super(activity, layoutInflater, viewGroup, C2535a.m6888a().au() ? R.layout.chat_poll_channel_input_list_item : R.layout.chat_poll_channel_input_list_item_old, c3280a, c3286g, c3284e);
        c7347b.f21928e = (TextView) c7347b.itemView.findViewById(R.id.content_textView);
        c7347b.f21929f = (LinearLayout) c7347b.itemView.findViewById(R.id.box_linearLayout);
        c7347b.f21930g = (Button) c7347b.itemView.findViewById(R.id.submit_button);
        c7347b.f21931h = (Button) c7347b.itemView.findViewById(R.id.view_results_button);
        c7347b.f21934k = c7347b.itemView.findViewById(R.id.layout_balloon_chat_background);
        c7347b.f21935l = (Button) c7347b.itemView.findViewById(R.id.payment_button);
        c7347b.f21933j = i;
        c7347b.f21928e.setOnLongClickListener(new C35881(c7347b));
        c7347b.f21928e.setOnTouchListener(new OnTouchListener(c7347b) {
            final /* synthetic */ C7455i f10754a;

            {
                this.f10754a = r1;
            }

            @SuppressLint({"ClickableViewAccessibility"})
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 1 && this.f10754a.f21932i) {
                    this.f10754a.f21932i = false;
                    return true;
                }
                if (motionEvent.getAction() == 0) {
                    this.f10754a.f21932i = false;
                }
                return view.onTouchEvent(motionEvent);
            }
        });
    }

    private void m19948a(C7590i c7590i, Bundle bundle, C2571d c2571d, boolean z) {
        String str;
        String str2;
        C7455i c7455i = this;
        final C7197a c7197a = c7590i;
        final Bundle bundle2 = bundle;
        C2571d c2571d2 = c2571d;
        boolean z2 = false;
        if (z) {
            C2573f VoteParser = PollUtils.VoteParser(new JSONObject(c7197a.f23198Q));
            str = VoteParser.f8414b;
            if (str == null) {
                str = "";
            }
            bundle2.putString(C3407b.m7865a(c7197a.f20777c, 1), str);
            if (VoteParser.f8413a != null) {
                for (String a : VoteParser.f8413a) {
                    bundle2.putBoolean(C3407b.m7866a(c7197a.f20777c, a), true);
                }
            }
        }
        str = c2571d2.f8399a;
        C2570c[] c2570cArr = c2571d2.f8404f;
        CheckBox[] checkBoxArr = new CheckBox[c2570cArr.length];
        View view = null;
        if (c2571d2.f8402d) {
            view = C3407b.m7864a(c7455i.c, c7197a.f20777c, c2571d2.f8403e, false);
            view.setMinWidth(c7455i.f21933j);
            view.setText(bundle2.getString(C3407b.m7865a(c7197a.f20777c, 1), ""));
            view.setTextColor(UIThemeManager.getmInstance().getInput_content_and_caption_message_text_color());
            view.setEnabled(z ^ 1);
            view.setOnFocusChangeListener(new OnFocusChangeListener(c7455i) {
                final /* synthetic */ C7455i f10756b;

                public final void onFocusChange(View view, boolean z) {
                    if (z) {
                        this.f10756b.d.m7735v();
                    }
                }
            });
        }
        C3281b anonymousClass12 = new C3281b(c7455i) {
            final /* synthetic */ C7455i f16636c;

            class C35861 implements Runnable {
                final /* synthetic */ AnonymousClass12 f10757a;

                C35861(AnonymousClass12 anonymousClass12) {
                    this.f10757a = anonymousClass12;
                }

                public final void run() {
                    if (view != null) {
                        view.setVisibility(8);
                    }
                }
            }

            public final void mo2362a(String str, boolean z, boolean z2) {
                if (z) {
                    if (str.equals(c7197a.f20777c)) {
                        if (!z2 || view == null) {
                            C4144a.m8007c(view);
                            new Handler().postDelayed(new C35861(this), 500);
                            return;
                        }
                        view.setVisibility(0);
                        C4144a.m8006b(view);
                    }
                } else if (view != null) {
                    view.setText("");
                }
            }
        };
        boolean z3 = false;
        int i = z3;
        while (i < c2570cArr.length) {
            boolean z4 = c2570cArr[i].f8398c;
            String str3 = c2570cArr[i].f8396a;
            str2 = str;
            str = c2570cArr[i].f8397b;
            String str4 = str3;
            z2 = z4;
            int i2 = i;
            C3281b c3281b = anonymousClass12;
            View a2 = C3407b.m7863a(c7455i.c, c7197a.f20777c, str4, z2, anonymousClass12, false);
            a2.setText(str);
            a2.setTextColor(UIThemeManager.getmInstance().getInput_content_and_caption_message_text_color());
            c7455i.f21929f.addView(a2);
            boolean z5 = bundle2.getBoolean(C3407b.m7866a(c7197a.f20777c, str4), false);
            z2 = z2 && z5;
            a2.setChecked(z5);
            a2.setEnabled(z ^ 1);
            checkBoxArr[i2] = a2;
            i = i2 + 1;
            z3 = z2;
            z2 = false;
            str = str2;
            anonymousClass12 = c3281b;
        }
        str2 = str;
        boolean z6 = z2;
        if (c2571d2.f8402d) {
            if (view != null) {
                view.setVisibility(z3 ? z6 : 8);
            }
            c7455i.f21929f.addView(view);
        }
        final C2570c[] c2570cArr2 = c2570cArr;
        final C7197a c7197a2 = c7197a;
        final String str5 = str2;
        c7455i.f21930g.setOnClickListener(new OnClickListener(c7455i) {
            final /* synthetic */ C7455i f10762e;

            public final void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                for (C2570c c2570c : c2570cArr2) {
                    String str = c2570c.f8396a;
                    if (bundle2.getBoolean(C3407b.m7866a(c7197a2.f20777c, str), false)) {
                        arrayList.add(str);
                    }
                }
                this.f10762e.d.mo3219b(c7197a2.f20777c, str5, (String[]) arrayList.toArray(new String[arrayList.size()]), bundle2.getString(C3407b.m7865a(c7197a2.f20777c, 1), ""));
            }
        });
        final String str6 = str2;
        c7455i.f21931h.setOnClickListener(new OnClickListener(c7455i) {
            final /* synthetic */ C7455i f10765c;

            public final void onClick(View view) {
                this.f10765c.d.mo3227k(str6);
            }
        });
    }

    private void m19951b(C7590i c7590i, Bundle bundle, C2571d c2571d, boolean z) {
        String str;
        String str2;
        C7455i c7455i = this;
        final C7197a c7197a = c7590i;
        final Bundle bundle2 = bundle;
        C2571d c2571d2 = c2571d;
        boolean z2 = false;
        if (z) {
            C2573f VoteParser = PollUtils.VoteParser(new JSONObject(c7197a.f23198Q));
            str = VoteParser.f8414b;
            if (str == null) {
                str = "";
            }
            bundle2.putString(C3407b.m7865a(c7197a.f20777c, 1), str);
            if (VoteParser.f8413a != null) {
                for (String b : VoteParser.f8413a) {
                    bundle2.putBoolean(C3407b.m7868b(c7197a.f20777c, b), true);
                }
            }
        }
        str = c2571d2.f8399a;
        C2570c[] c2570cArr = c2571d2.f8404f;
        RadioButton[] radioButtonArr = new RadioButton[c2570cArr.length];
        View view = null;
        if (c2571d2.f8402d) {
            view = C3407b.m7864a(c7455i.c, c7197a.f20777c, c2571d2.f8403e, false);
            view.setMinWidth(c7455i.f21933j);
            view.setEnabled(z ^ 1);
            view.setTextColor(UIThemeManager.getmInstance().getInput_content_and_caption_message_text_color());
            view.setText(bundle2.getString(C3407b.m7865a(c7197a.f20777c, 1), ""));
            view.setOnFocusChangeListener(new OnFocusChangeListener(c7455i) {
                final /* synthetic */ C7455i f10767b;

                public final void onFocusChange(View view, boolean z) {
                    if (z) {
                        this.f10767b.d.m7735v();
                    }
                }
            });
        }
        C3281b anonymousClass16 = new C3281b(c7455i) {
            final /* synthetic */ C7455i f16639c;

            class C35871 implements Runnable {
                final /* synthetic */ AnonymousClass16 f10768a;

                C35871(AnonymousClass16 anonymousClass16) {
                    this.f10768a = anonymousClass16;
                }

                public final void run() {
                    if (view != null) {
                        view.setVisibility(8);
                    }
                }
            }

            public final void mo2362a(String str, boolean z, boolean z2) {
                if (z) {
                    if (str.equals(c7197a.f20777c)) {
                        if (!z2 || view == null) {
                            C4144a.m8007c(view);
                            new Handler().postDelayed(new C35871(this), 500);
                            return;
                        }
                        view.setVisibility(0);
                        C4144a.m8006b(view);
                    }
                } else if (view != null) {
                    view.setText("");
                }
            }
        };
        View radioGroup = new RadioGroup(c7455i.c);
        boolean z3 = false;
        int i = z3;
        while (i < c2570cArr.length) {
            boolean z4 = c2570cArr[i].f8398c;
            String str3 = c2570cArr[i].f8396a;
            CharSequence charSequence = c2570cArr[i].f8397b;
            String str4 = str3;
            z2 = z4;
            int i2 = i;
            str2 = str;
            View view2 = radioGroup;
            C3281b c3281b = anonymousClass16;
            View b2 = C3407b.m7867b(c7455i.c, c7197a.f20777c, str4, z2, anonymousClass16, false);
            b2.setText(charSequence);
            view2.addView(b2);
            boolean z5 = bundle2.getBoolean(C3407b.m7868b(c7197a.f20777c, str4), false);
            z2 = z2 && z5;
            b2.setTextColor(UIThemeManager.getmInstance().getInput_content_and_caption_message_text_color());
            b2.setChecked(z5);
            b2.setEnabled(z ^ 1);
            radioButtonArr[i2] = b2;
            i = i2 + 1;
            z3 = z2;
            radioGroup = view2;
            z2 = false;
            str = str2;
            anonymousClass16 = c3281b;
        }
        int i3 = z2;
        str2 = str;
        c7455i.f21929f.addView(radioGroup);
        if (c2571d2.f8402d) {
            if (!z3) {
                i3 = 8;
            }
            view.setVisibility(i3);
            c7455i.f21929f.addView(view);
        }
        final C2570c[] c2570cArr2 = c2570cArr;
        final C7197a c7197a2 = c7197a;
        final String str5 = str2;
        c7455i.f21930g.setOnClickListener(new OnClickListener(c7455i) {
            final /* synthetic */ C7455i f10773e;

            public final void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                for (C2570c c2570c : c2570cArr2) {
                    String str = c2570c.f8396a;
                    if (bundle2.getBoolean(C3407b.m7868b(c7197a2.f20777c, str), false)) {
                        arrayList.add(str);
                    }
                }
                this.f10773e.d.mo3219b(c7197a2.f20777c, str5, (String[]) arrayList.toArray(new String[arrayList.size()]), bundle2.getString(C3407b.m7865a(c7197a2.f20777c, 1), ""));
            }
        });
        final String str6 = str2;
        c7455i.f21931h.setOnClickListener(new OnClickListener(c7455i) {
            final /* synthetic */ C7455i f10777c;

            public final void onClick(View view) {
                this.f10777c.d.mo3227k(str6);
            }
        });
    }

    private void m19952c(C7590i c7590i, Bundle bundle, C2571d c2571d, boolean z) {
        String str;
        C7455i c7455i = this;
        final C7197a c7197a = c7590i;
        final Bundle bundle2 = bundle;
        C2571d c2571d2 = c2571d;
        boolean z2 = false;
        int i = 1;
        if (z) {
            C2573f VoteParser = PollUtils.VoteParser(new JSONObject(c7197a.f23198Q));
            String str2 = VoteParser.f8414b;
            if (str2 == null) {
                str2 = "";
            }
            bundle2.putString(C3407b.m7865a(c7197a.f20777c, 1), str2);
            if (VoteParser.f8413a != null) {
                for (String b : VoteParser.f8413a) {
                    bundle2.putBoolean(C3407b.m7868b(c7197a.f20777c, b), true);
                }
            }
        }
        String str3 = c2571d2.f8399a;
        C2570c[] c2570cArr = c2571d2.f8404f;
        RadioButton[] radioButtonArr = new RadioButton[c2570cArr.length];
        View view = null;
        if (c2571d2.f8402d) {
            view = C3407b.m7864a(c7455i.c, c7197a.f20777c, c2571d2.f8403e, false);
            view.setMinWidth(c7455i.f21933j);
            view.setEnabled(z ^ 1);
            view.setTextColor(UIThemeManager.getmInstance().getInput_content_and_caption_message_text_color());
            view.setText(bundle2.getString(C3407b.m7865a(c7197a.f20777c, 1), ""));
            view.setOnFocusChangeListener(new OnFocusChangeListener(c7455i) {
                final /* synthetic */ C7455i f10779b;

                public final void onFocusChange(View view, boolean z) {
                    if (z) {
                        this.f10779b.d.m7735v();
                    }
                }
            });
        }
        C3281b c61494 = new C3281b(c7455i) {
            final /* synthetic */ C7455i f16642c;

            class C35911 implements Runnable {
                final /* synthetic */ C61494 f10780a;

                C35911(C61494 c61494) {
                    this.f10780a = c61494;
                }

                public final void run() {
                    if (view != null) {
                        view.setVisibility(8);
                    }
                }
            }

            public final void mo2362a(String str, boolean z, boolean z2) {
                if (z) {
                    if (str.equals(c7197a.f20777c)) {
                        if (!z2 || view == null) {
                            C4144a.m8007c(view);
                            new Handler().postDelayed(new C35911(this), 500);
                            return;
                        }
                        view.setVisibility(0);
                        C4144a.m8006b(view);
                    }
                } else if (view != null) {
                    view.setText("");
                }
            }
        };
        View radioGroup = new RadioGroup(c7455i.c);
        boolean z3 = false;
        int i2 = z3;
        while (i2 < c2570cArr.length) {
            boolean z4 = c2570cArr[i2].f8398c;
            String str4 = c2570cArr[i2].f8396a;
            Activity activity = c7455i.c;
            String str5 = str4;
            Object[] objArr = new Object[i];
            objArr[0] = c2570cArr[i2].f8397b;
            CharSequence string = activity.getString(R.string.toman, objArr);
            String str6 = str5;
            boolean z5 = z4;
            i = i2;
            str = str3;
            View view2 = radioGroup;
            C3281b c3281b = c61494;
            View b2 = C3407b.m7867b(c7455i.c, c7197a.f20777c, str6, z5, c61494, false);
            b2.setText(string);
            view2.addView(b2);
            z2 = bundle2.getBoolean(C3407b.m7868b(c7197a.f20777c, str6), false);
            boolean z6 = z5 && z2;
            b2.setTextColor(UIThemeManager.getmInstance().getInput_content_and_caption_message_text_color());
            b2.setChecked(z2);
            b2.setEnabled(z ^ 1);
            radioButtonArr[i] = b2;
            radioGroup = view2;
            z3 = z6;
            c61494 = c3281b;
            str3 = str;
            i2 = i + 1;
            i = 1;
            z2 = false;
        }
        int i3 = z2;
        str = str3;
        c7455i.f21929f.addView(radioGroup);
        if (c2571d2.f8402d) {
            if (!z3) {
                i3 = 8;
            }
            view.setVisibility(i3);
            c7455i.f21929f.addView(view);
        }
        final C2570c[] c2570cArr2 = c2570cArr;
        final String str7 = str;
        c7455i.f21935l.setOnClickListener(new OnClickListener(c7455i) {
            final /* synthetic */ C7455i f10785e;

            public final void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                String str = "";
                for (C2570c c2570c : c2570cArr2) {
                    String str2 = c2570c.f8396a;
                    if (bundle2.getBoolean(C3407b.m7868b(c7197a.f20777c, str2), false)) {
                        arrayList.add(str2);
                        str = c2570c.f8397b;
                    }
                }
                String[] strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
                bundle2.getString(C3407b.m7865a(c7197a.f20777c, 1), "");
                this.f10785e.d.m7731a(c7197a.f20777c, str7, strArr, str);
            }
        });
    }

    protected final void mo3180a(C6829g c6829g) {
        super.mo3180a(c6829g);
        final C7590i c7590i = (C7590i) c6829g;
        String str = c7590i.f23198Q;
        boolean z = (str == null || str.isEmpty()) ? false : true;
        try {
            final Bundle a = MyApplication.m12950a().m12956a(c7590i.f20777c);
            this.f21929f.removeAllViews();
            C2571d PollDataParser = PollUtils.PollDataParser(new JSONObject(c7590i.f23197P));
            PollType pollType = PollDataParser.f8401c;
            boolean z2 = PollDataParser.f8405g;
            switch (pollType) {
                case checkbox:
                    this.f21935l.setVisibility(8);
                    this.f21930g.setVisibility(0);
                    this.f21931h.setVisibility(0);
                    m19948a(c7590i, a, PollDataParser, z);
                    break;
                case radio:
                    if (!z2) {
                        this.f21935l.setVisibility(8);
                        this.f21930g.setVisibility(0);
                        this.f21931h.setVisibility(0);
                        m19951b(c7590i, a, PollDataParser, z);
                        break;
                    }
                    this.f21935l.setVisibility(0);
                    this.f21930g.setVisibility(8);
                    this.f21931h.setVisibility(8);
                    m19952c(c7590i, a, PollDataParser, z);
                    break;
                case commentbox:
                    String str2;
                    this.f21935l.setVisibility(8);
                    this.f21930g.setVisibility(0);
                    this.f21931h.setVisibility(0);
                    if (z) {
                        str2 = PollUtils.VoteParser(new JSONObject(c7590i.f23198Q)).f8414b;
                        if (str2 == null) {
                            str2 = "";
                        }
                        a.putString(C3407b.m7865a(c7590i.f20777c, 1), str2);
                    }
                    str2 = PollDataParser.f8399a;
                    if (PollDataParser.f8402d) {
                        View a2 = C3407b.m7864a(this.c, c7590i.f20777c, PollDataParser.f8403e, false);
                        a2.setMinWidth(this.f21933j);
                        a2.setEnabled(z ^ true);
                        a2.setTextColor(UIThemeManager.getmInstance().getInput_content_and_caption_message_text_color());
                        a2.setText(a.getString(C3407b.m7865a(c7590i.f20777c, 1), ""));
                        a2.setOnFocusChangeListener(new OnFocusChangeListener(this) {
                            final /* synthetic */ C7455i f10787b;

                            public final void onFocusChange(View view, boolean z) {
                                if (z) {
                                    this.f10787b.d.m7735v();
                                }
                            }
                        });
                        this.f21929f.addView(a2);
                    }
                    this.f21930g.setOnClickListener(new OnClickListener(this) {
                        final /* synthetic */ C7455i f10791d;

                        public final void onClick(View view) {
                            this.f10791d.d.mo3219b(c7590i.f20777c, str2, new String[0], a.getString(C3407b.m7865a(c7590i.f20777c, 1), ""));
                        }
                    });
                    this.f21931h.setOnClickListener(new OnClickListener(this) {
                        final /* synthetic */ C7455i f10794c;

                        public final void onClick(View view) {
                            this.f10794c.d.mo3227k(str2);
                        }
                    });
                    break;
                default:
                    break;
            }
            this.f21928e.setText(PollDataParser.f8400b);
        } catch (Throwable e) {
            C2480b.m6737b("Error in parsing poll data.", e);
        }
        m19051a((C7358a) c7590i, this.f21934k, false);
    }
}
