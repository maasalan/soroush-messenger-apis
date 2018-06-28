package mobi.mmdt.ott.view.conversation.p432e.p433a.p438e;

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
import mobi.mmdt.ott.view.conversation.e.a.e.i.AnonymousClass12;
import mobi.mmdt.ott.view.conversation.e.a.e.i.AnonymousClass16;
import mobi.mmdt.ott.view.conversation.p418a.C3280a;
import mobi.mmdt.ott.view.conversation.p418a.C3281b;
import mobi.mmdt.ott.view.conversation.p418a.C3284e;
import mobi.mmdt.ott.view.conversation.p418a.C3286g;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p438e.C7481i;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p438e.C7481i.12.C36921;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p438e.C7481i.16.C36931;
import mobi.mmdt.ott.view.conversation.p573f.C7197a;
import mobi.mmdt.ott.view.conversation.p573f.p597a.C7358a;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p604e.C7616i;
import mobi.mmdt.ott.view.main.C4144a;
import org.json.JSONObject;

public final class C7481i extends C7349b {
    private TextView f22243e;
    private LinearLayout f22244f;
    private Button f22245g;
    private Button f22246h;
    private boolean f22247i;
    private int f22248j;
    private View f22249k;
    private Button f22250l;

    class C36941 implements OnLongClickListener {
        final /* synthetic */ C7481i f10965a;

        C36941(C7481i c7481i) {
            this.f10965a = c7481i;
        }

        public final boolean onLongClick(View view) {
            this.f10965a.f22247i = true;
            return false;
        }
    }

    public C7481i(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, int i, C3280a c3280a, C3286g c3286g, C3284e c3284e) {
        C7349b c7349b = this;
        super(activity, layoutInflater, viewGroup, C2535a.m6888a().au() ? R.layout.chat_poll_channel_reply_input_list_item : R.layout.chat_poll_channel_reply_input_list_item_old, c3280a, c3286g, c3284e);
        c7349b.f22243e = (TextView) c7349b.itemView.findViewById(R.id.content_textView);
        c7349b.f22244f = (LinearLayout) c7349b.itemView.findViewById(R.id.box_linearLayout);
        c7349b.f22245g = (Button) c7349b.itemView.findViewById(R.id.submit_button);
        c7349b.f22246h = (Button) c7349b.itemView.findViewById(R.id.view_results_button);
        c7349b.f22249k = c7349b.itemView.findViewById(R.id.layout_balloon_chat_background);
        c7349b.f22250l = (Button) c7349b.itemView.findViewById(R.id.payment_button);
        c7349b.f22248j = i;
        c7349b.f22243e.setOnLongClickListener(new C36941(c7349b));
        c7349b.f22243e.setOnTouchListener(new OnTouchListener(c7349b) {
            final /* synthetic */ C7481i f10945a;

            {
                this.f10945a = r1;
            }

            @SuppressLint({"ClickableViewAccessibility"})
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 1 && this.f10945a.f22247i) {
                    this.f10945a.f22247i = false;
                    return true;
                }
                if (motionEvent.getAction() == 0) {
                    this.f10945a.f22247i = false;
                }
                return view.onTouchEvent(motionEvent);
            }
        });
    }

    private void m20125a(C7616i c7616i, Bundle bundle, C2571d c2571d, boolean z) {
        String str;
        String str2;
        C7481i c7481i = this;
        final C7197a c7197a = c7616i;
        final Bundle bundle2 = bundle;
        C2571d c2571d2 = c2571d;
        boolean z2 = false;
        if (z) {
            C2573f VoteParser = PollUtils.VoteParser(new JSONObject(c7197a.f23402Q));
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
            view = C3407b.m7864a(c7481i.c, c7197a.f20777c, c2571d2.f8403e, false);
            view.setMinWidth(c7481i.f22248j);
            view.setTextColor(UIThemeManager.getmInstance().getInput_content_and_caption_message_text_color());
            view.setText(bundle2.getString(C3407b.m7865a(c7197a.f20777c, 1), ""));
            view.setEnabled(z ^ 1);
            view.setOnFocusChangeListener(new OnFocusChangeListener(c7481i) {
                final /* synthetic */ C7481i f10947b;

                public final void onFocusChange(View view, boolean z) {
                    if (z) {
                        this.f10947b.d.m7735v();
                    }
                }
            });
        }
        C3281b anonymousClass12 = new C3281b(c7481i) {
            final /* synthetic */ C7481i f16666c;

            class C36921 implements Runnable {
                final /* synthetic */ AnonymousClass12 f10948a;

                C36921(AnonymousClass12 anonymousClass12) {
                    this.f10948a = anonymousClass12;
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
                            new Handler().postDelayed(new C36921(this), 500);
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
            View a2 = C3407b.m7863a(c7481i.c, c7197a.f20777c, str4, z2, anonymousClass12, false);
            a2.setText(str);
            a2.setTextColor(UIThemeManager.getmInstance().getInput_content_and_caption_message_text_color());
            c7481i.f22244f.addView(a2);
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
            c7481i.f22244f.addView(view);
        }
        final C2570c[] c2570cArr2 = c2570cArr;
        final C7197a c7197a2 = c7197a;
        final String str5 = str2;
        c7481i.f22245g.setOnClickListener(new OnClickListener(c7481i) {
            final /* synthetic */ C7481i f10953e;

            public final void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                for (C2570c c2570c : c2570cArr2) {
                    String str = c2570c.f8396a;
                    if (bundle2.getBoolean(C3407b.m7866a(c7197a2.f20777c, str), false)) {
                        arrayList.add(str);
                    }
                }
                this.f10953e.d.mo3219b(c7197a2.f20777c, str5, (String[]) arrayList.toArray(new String[arrayList.size()]), bundle2.getString(C3407b.m7865a(c7197a2.f20777c, 1), ""));
            }
        });
        final String str6 = str2;
        c7481i.f22246h.setOnClickListener(new OnClickListener(c7481i) {
            final /* synthetic */ C7481i f10956c;

            public final void onClick(View view) {
                this.f10956c.d.mo3227k(str6);
            }
        });
    }

    private void m20128b(C7616i c7616i, Bundle bundle, C2571d c2571d, boolean z) {
        String str;
        String str2;
        C7481i c7481i = this;
        final C7197a c7197a = c7616i;
        final Bundle bundle2 = bundle;
        C2571d c2571d2 = c2571d;
        boolean z2 = false;
        if (z) {
            C2573f VoteParser = PollUtils.VoteParser(new JSONObject(c7197a.f23402Q));
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
            view = C3407b.m7864a(c7481i.c, c7197a.f20777c, c2571d2.f8403e, false);
            view.setMinWidth(c7481i.f22248j);
            view.setEnabled(z ^ 1);
            view.setText(bundle2.getString(C3407b.m7865a(c7197a.f20777c, 1), ""));
            view.setTextColor(UIThemeManager.getmInstance().getInput_content_and_caption_message_text_color());
            view.setOnFocusChangeListener(new OnFocusChangeListener(c7481i) {
                final /* synthetic */ C7481i f10958b;

                public final void onFocusChange(View view, boolean z) {
                    if (z) {
                        this.f10958b.d.m7735v();
                    }
                }
            });
        }
        C3281b anonymousClass16 = new C3281b(c7481i) {
            final /* synthetic */ C7481i f16669c;

            class C36931 implements Runnable {
                final /* synthetic */ AnonymousClass16 f10959a;

                C36931(AnonymousClass16 anonymousClass16) {
                    this.f10959a = anonymousClass16;
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
                            new Handler().postDelayed(new C36931(this), 500);
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
        View radioGroup = new RadioGroup(c7481i.c);
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
            View b2 = C3407b.m7867b(c7481i.c, c7197a.f20777c, str4, z2, anonymousClass16, false);
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
        c7481i.f22244f.addView(radioGroup);
        if (c2571d2.f8402d) {
            if (!z3) {
                i3 = 8;
            }
            view.setVisibility(i3);
            c7481i.f22244f.addView(view);
        }
        final C2570c[] c2570cArr2 = c2570cArr;
        final C7197a c7197a2 = c7197a;
        final String str5 = str2;
        c7481i.f22245g.setOnClickListener(new OnClickListener(c7481i) {
            final /* synthetic */ C7481i f10964e;

            public final void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                for (C2570c c2570c : c2570cArr2) {
                    String str = c2570c.f8396a;
                    if (bundle2.getBoolean(C3407b.m7868b(c7197a2.f20777c, str), false)) {
                        arrayList.add(str);
                    }
                }
                this.f10964e.d.mo3219b(c7197a2.f20777c, str5, (String[]) arrayList.toArray(new String[arrayList.size()]), bundle2.getString(C3407b.m7865a(c7197a2.f20777c, 1), ""));
            }
        });
        final String str6 = str2;
        c7481i.f22246h.setOnClickListener(new OnClickListener(c7481i) {
            final /* synthetic */ C7481i f10968c;

            public final void onClick(View view) {
                this.f10968c.d.mo3227k(str6);
            }
        });
    }

    private void m20129c(C7616i c7616i, Bundle bundle, C2571d c2571d, boolean z) {
        String str;
        C7481i c7481i = this;
        final C7197a c7197a = c7616i;
        final Bundle bundle2 = bundle;
        C2571d c2571d2 = c2571d;
        boolean z2 = false;
        if (z) {
            C2573f VoteParser = PollUtils.VoteParser(new JSONObject(c7197a.f23402Q));
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
            view = C3407b.m7864a(c7481i.c, c7197a.f20777c, c2571d2.f8403e, false);
            view.setMinWidth(c7481i.f22248j);
            view.setEnabled(z ^ 1);
            view.setTextColor(UIThemeManager.getmInstance().getInput_content_and_caption_message_text_color());
            view.setText(bundle2.getString(C3407b.m7865a(c7197a.f20777c, 1), ""));
            view.setOnFocusChangeListener(new OnFocusChangeListener(c7481i) {
                final /* synthetic */ C7481i f10970b;

                public final void onFocusChange(View view, boolean z) {
                    if (z) {
                        this.f10970b.d.m7735v();
                    }
                }
            });
        }
        C3281b c61634 = new C3281b(c7481i) {
            final /* synthetic */ C7481i f16672c;

            class C36971 implements Runnable {
                final /* synthetic */ C61634 f10971a;

                C36971(C61634 c61634) {
                    this.f10971a = c61634;
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
                            new Handler().postDelayed(new C36971(this), 500);
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
        View radioGroup = new RadioGroup(c7481i.c);
        boolean z3 = false;
        int i = z3;
        while (i < c2570cArr.length) {
            boolean z4 = c2570cArr[i].f8398c;
            String str4 = c2570cArr[i].f8396a;
            CharSequence charSequence = c2570cArr[i].f8397b;
            String str5 = str4;
            z2 = z4;
            int i2 = i;
            str = str3;
            View view2 = radioGroup;
            C3281b c3281b = c61634;
            View b2 = C3407b.m7867b(c7481i.c, c7197a.f20777c, str5, z2, c61634, false);
            b2.setText(charSequence);
            view2.addView(b2);
            boolean z5 = bundle2.getBoolean(C3407b.m7868b(c7197a.f20777c, str5), false);
            z2 = z2 && z5;
            b2.setTextColor(UIThemeManager.getmInstance().getInput_content_and_caption_message_text_color());
            b2.setChecked(z5);
            b2.setEnabled(z ^ 1);
            radioButtonArr[i2] = b2;
            i = i2 + 1;
            z3 = z2;
            radioGroup = view2;
            z2 = false;
            str3 = str;
            c61634 = c3281b;
        }
        int i3 = z2;
        str = str3;
        c7481i.f22244f.addView(radioGroup);
        if (c2571d2.f8402d) {
            if (!z3) {
                i3 = 8;
            }
            view.setVisibility(i3);
            c7481i.f22244f.addView(view);
        }
        final C2570c[] c2570cArr2 = c2570cArr;
        final String str6 = str;
        c7481i.f22250l.setOnClickListener(new OnClickListener(c7481i) {
            final /* synthetic */ C7481i f10976e;

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
                this.f10976e.d.m7731a(c7197a.f20777c, str6, strArr, str);
            }
        });
    }

    protected final void mo3180a(C6829g c6829g) {
        super.mo3180a(c6829g);
        final C7616i c7616i = (C7616i) c6829g;
        String str = c7616i.f23402Q;
        boolean z = (str == null || str.isEmpty()) ? false : true;
        try {
            final Bundle a = MyApplication.m12950a().m12956a(c7616i.f20777c);
            this.f22244f.removeAllViews();
            C2571d PollDataParser = PollUtils.PollDataParser(new JSONObject(c7616i.f23401P));
            PollType pollType = PollDataParser.f8401c;
            boolean z2 = PollDataParser.f8405g;
            switch (pollType) {
                case checkbox:
                    this.f22250l.setVisibility(8);
                    this.f22245g.setVisibility(0);
                    this.f22246h.setVisibility(0);
                    m20125a(c7616i, a, PollDataParser, z);
                    break;
                case radio:
                    if (!z2) {
                        this.f22250l.setVisibility(8);
                        this.f22245g.setVisibility(0);
                        this.f22246h.setVisibility(0);
                        m20128b(c7616i, a, PollDataParser, z);
                        break;
                    }
                    this.f22250l.setVisibility(0);
                    this.f22245g.setVisibility(8);
                    this.f22246h.setVisibility(8);
                    m20129c(c7616i, a, PollDataParser, z);
                    break;
                case commentbox:
                    String str2;
                    this.f22250l.setVisibility(8);
                    this.f22245g.setVisibility(0);
                    this.f22246h.setVisibility(0);
                    if (z) {
                        str2 = PollUtils.VoteParser(new JSONObject(c7616i.f23402Q)).f8414b;
                        if (str2 == null) {
                            str2 = "";
                        }
                        a.putString(C3407b.m7865a(c7616i.f20777c, 1), str2);
                    }
                    str2 = PollDataParser.f8399a;
                    if (PollDataParser.f8402d) {
                        View a2 = C3407b.m7864a(this.c, c7616i.f20777c, PollDataParser.f8403e, false);
                        a2.setMinWidth(this.f22248j);
                        a2.setEnabled(z ^ true);
                        a2.setTextColor(UIThemeManager.getmInstance().getInput_content_and_caption_message_text_color());
                        a2.setText(a.getString(C3407b.m7865a(c7616i.f20777c, 1), ""));
                        a2.setOnFocusChangeListener(new OnFocusChangeListener(this) {
                            final /* synthetic */ C7481i f10978b;

                            public final void onFocusChange(View view, boolean z) {
                                if (z) {
                                    this.f10978b.d.m7735v();
                                }
                            }
                        });
                        this.f22244f.addView(a2);
                    }
                    this.f22245g.setOnClickListener(new OnClickListener(this) {
                        final /* synthetic */ C7481i f10982d;

                        public final void onClick(View view) {
                            this.f10982d.d.mo3219b(c7616i.f20777c, str2, new String[0], a.getString(C3407b.m7865a(c7616i.f20777c, 1), ""));
                        }
                    });
                    this.f22246h.setOnClickListener(new OnClickListener(this) {
                        final /* synthetic */ C7481i f10985c;

                        public final void onClick(View view) {
                            this.f10985c.d.mo3227k(str2);
                        }
                    });
                    break;
                default:
                    break;
            }
            this.f22243e.setText(PollDataParser.f8400b);
        } catch (Throwable e) {
            C2480b.m6737b("Error in parsing poll data.", e);
        }
        m19051a((C7358a) c7616i, this.f22249k, false);
    }
}
