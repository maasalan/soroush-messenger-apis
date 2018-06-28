package mobi.mmdt.ott.view.conversation.p432e.p433a.p437d;

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
import android.widget.ImageView;
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
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.conversation.C3407b;
import mobi.mmdt.ott.view.conversation.e.a.d.i.AnonymousClass12;
import mobi.mmdt.ott.view.conversation.e.a.d.i.AnonymousClass16;
import mobi.mmdt.ott.view.conversation.p418a.C3280a;
import mobi.mmdt.ott.view.conversation.p418a.C3281b;
import mobi.mmdt.ott.view.conversation.p418a.C3284e;
import mobi.mmdt.ott.view.conversation.p418a.C3286g;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p437d.C7468i;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p437d.C7468i.12.C36361;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p437d.C7468i.16.C36371;
import mobi.mmdt.ott.view.conversation.p573f.C7197a;
import mobi.mmdt.ott.view.conversation.p573f.p597a.C7358a;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p603d.C7603i;
import mobi.mmdt.ott.view.main.C4144a;
import org.json.JSONObject;

public final class C7468i extends C7348b {
    private Button f22085e = ((Button) this.itemView.findViewById(R.id.payment_button));
    private TextView f22086f = ((TextView) this.itemView.findViewById(R.id.content_textView));
    private LinearLayout f22087g = ((LinearLayout) this.itemView.findViewById(R.id.box_linearLayout));
    private Button f22088h = ((Button) this.itemView.findViewById(R.id.submit_button));
    private Button f22089i = ((Button) this.itemView.findViewById(R.id.view_results_button));
    private boolean f22090j;
    private int f22091k;
    private LinearLayout f22092l;
    private ImageView f22093m;

    class C36381 implements OnLongClickListener {
        final /* synthetic */ C7468i f10865a;

        C36381(C7468i c7468i) {
            this.f10865a = c7468i;
        }

        public final boolean onLongClick(View view) {
            this.f10865a.f22090j = true;
            return false;
        }
    }

    public C7468i(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, int i, C3280a c3280a, C3286g c3286g, C3284e c3284e) {
        super(activity, layoutInflater, viewGroup, R.layout.chat_poll_channel_output_list_item, c3280a, c3286g, c3284e);
        this.f22091k = i;
        this.f22092l = (LinearLayout) this.itemView.findViewById(R.id.layout_balloon_chat_background);
        this.f22093m = (ImageView) this.itemView.findViewById(R.id.status_imageView);
        this.f22086f.setOnLongClickListener(new C36381(this));
        this.f22086f.setOnTouchListener(new OnTouchListener(this) {
            final /* synthetic */ C7468i f10845a;

            {
                this.f10845a = r1;
            }

            @SuppressLint({"ClickableViewAccessibility"})
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 1 && this.f10845a.f22090j) {
                    this.f10845a.f22090j = false;
                    return true;
                }
                if (motionEvent.getAction() == 0) {
                    this.f10845a.f22090j = false;
                }
                return view.onTouchEvent(motionEvent);
            }
        });
    }

    private void m20037a(C7603i c7603i, Bundle bundle, C2571d c2571d, boolean z) {
        String str;
        String str2;
        C7468i c7468i = this;
        final C7197a c7197a = c7603i;
        final Bundle bundle2 = bundle;
        C2571d c2571d2 = c2571d;
        if (z) {
            C2573f VoteParser = PollUtils.VoteParser(new JSONObject(c7197a.f23314Q));
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
            view = C3407b.m7864a(c7468i.c, c7197a.f20777c, c2571d2.f8403e, true);
            view.setMinWidth(c7468i.f22091k);
            view.setTextColor(UIThemeManager.getmInstance().getOutput_content_and_caption_message_text_color());
            view.setText(bundle2.getString(C3407b.m7865a(c7197a.f20777c, 1), ""));
            view.setEnabled(z ^ 1);
            view.setOnFocusChangeListener(new OnFocusChangeListener(c7468i) {
                final /* synthetic */ C7468i f10847b;

                public final void onFocusChange(View view, boolean z) {
                    if (z) {
                        this.f10847b.d.m7735v();
                    }
                }
            });
        }
        C3281b anonymousClass12 = new C3281b(c7468i) {
            final /* synthetic */ C7468i f16651c;

            class C36361 implements Runnable {
                final /* synthetic */ AnonymousClass12 f10848a;

                C36361(AnonymousClass12 anonymousClass12) {
                    this.f10848a = anonymousClass12;
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
                            new Handler().postDelayed(new C36361(this), 500);
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
        boolean z2 = false;
        int i = 0;
        while (i < c2570cArr.length) {
            boolean z3 = c2570cArr[i].f8398c;
            String str3 = c2570cArr[i].f8396a;
            str2 = str;
            str = c2570cArr[i].f8397b;
            String str4 = str3;
            boolean z4 = z3;
            int i2 = i;
            C3281b c3281b = anonymousClass12;
            View a2 = C3407b.m7863a(c7468i.c, c7197a.f20777c, str4, z4, anonymousClass12, true);
            a2.setText(str);
            a2.setTextColor(UIThemeManager.getmInstance().getOutput_content_and_caption_message_text_color());
            c7468i.f22087g.addView(a2);
            boolean z5 = bundle2.getBoolean(C3407b.m7866a(c7197a.f20777c, str4), false);
            z4 = z4 && z5;
            a2.setChecked(z5);
            a2.setEnabled(z ^ 1);
            checkBoxArr[i2] = a2;
            i = i2 + 1;
            z2 = z4;
            str = str2;
            anonymousClass12 = c3281b;
        }
        str2 = str;
        if (c2571d2.f8402d) {
            if (view != null) {
                view.setVisibility(z2 ? 0 : 8);
            }
            c7468i.f22087g.addView(view);
        }
        final C2570c[] c2570cArr2 = c2570cArr;
        final C7197a c7197a2 = c7197a;
        final String str5 = str2;
        c7468i.f22088h.setOnClickListener(new OnClickListener(c7468i) {
            final /* synthetic */ C7468i f10853e;

            public final void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                for (C2570c c2570c : c2570cArr2) {
                    String str = c2570c.f8396a;
                    if (bundle2.getBoolean(C3407b.m7866a(c7197a2.f20777c, str), false)) {
                        arrayList.add(str);
                    }
                }
                this.f10853e.d.mo3219b(c7197a2.f20777c, str5, (String[]) arrayList.toArray(new String[arrayList.size()]), bundle2.getString(C3407b.m7865a(c7197a2.f20777c, 1), ""));
            }
        });
        final String str6 = str2;
        c7468i.f22089i.setOnClickListener(new OnClickListener(c7468i) {
            final /* synthetic */ C7468i f10856c;

            public final void onClick(View view) {
                this.f10856c.d.mo3227k(str6);
            }
        });
    }

    private void m20040b(C7603i c7603i, Bundle bundle, C2571d c2571d, boolean z) {
        String str;
        String str2;
        C7468i c7468i = this;
        final C7197a c7197a = c7603i;
        final Bundle bundle2 = bundle;
        C2571d c2571d2 = c2571d;
        if (z) {
            C2573f VoteParser = PollUtils.VoteParser(new JSONObject(c7197a.f23314Q));
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
            view = C3407b.m7864a(c7468i.c, c7197a.f20777c, c2571d2.f8403e, true);
            view.setMinWidth(c7468i.f22091k);
            view.setEnabled(z ^ 1);
            view.setTextColor(UIThemeManager.getmInstance().getOutput_content_and_caption_message_text_color());
            view.setText(bundle2.getString(C3407b.m7865a(c7197a.f20777c, 1), ""));
            view.setOnFocusChangeListener(new OnFocusChangeListener(c7468i) {
                final /* synthetic */ C7468i f10858b;

                public final void onFocusChange(View view, boolean z) {
                    if (z) {
                        this.f10858b.d.m7735v();
                    }
                }
            });
        }
        C3281b anonymousClass16 = new C3281b(c7468i) {
            final /* synthetic */ C7468i f16654c;

            class C36371 implements Runnable {
                final /* synthetic */ AnonymousClass16 f10859a;

                C36371(AnonymousClass16 anonymousClass16) {
                    this.f10859a = anonymousClass16;
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
                            new Handler().postDelayed(new C36371(this), 500);
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
        View radioGroup = new RadioGroup(c7468i.c);
        boolean z2 = false;
        int i = 0;
        while (i < c2570cArr.length) {
            boolean z3 = c2570cArr[i].f8398c;
            String str3 = c2570cArr[i].f8396a;
            CharSequence charSequence = c2570cArr[i].f8397b;
            String str4 = str3;
            boolean z4 = z3;
            int i2 = i;
            str2 = str;
            View view2 = radioGroup;
            C3281b c3281b = anonymousClass16;
            View b2 = C3407b.m7867b(c7468i.c, c7197a.f20777c, str4, z4, anonymousClass16, true);
            b2.setText(charSequence);
            view2.addView(b2);
            boolean z5 = bundle2.getBoolean(C3407b.m7868b(c7197a.f20777c, str4), false);
            z4 = z4 && z5;
            b2.setTextColor(UIThemeManager.getmInstance().getOutput_content_and_caption_message_text_color());
            b2.setChecked(z5);
            b2.setEnabled(z ^ 1);
            radioButtonArr[i2] = b2;
            i = i2 + 1;
            z2 = z4;
            radioGroup = view2;
            str = str2;
            anonymousClass16 = c3281b;
        }
        str2 = str;
        int i3 = 0;
        c7468i.f22087g.addView(radioGroup);
        if (c2571d2.f8402d) {
            if (!z2) {
                i3 = 8;
            }
            view.setVisibility(i3);
            c7468i.f22087g.addView(view);
        }
        final C2570c[] c2570cArr2 = c2570cArr;
        final C7197a c7197a2 = c7197a;
        final String str5 = str2;
        c7468i.f22088h.setOnClickListener(new OnClickListener(c7468i) {
            final /* synthetic */ C7468i f10864e;

            public final void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                for (C2570c c2570c : c2570cArr2) {
                    String str = c2570c.f8396a;
                    if (bundle2.getBoolean(C3407b.m7868b(c7197a2.f20777c, str), false)) {
                        arrayList.add(str);
                    }
                }
                this.f10864e.d.mo3219b(c7197a2.f20777c, str5, (String[]) arrayList.toArray(new String[arrayList.size()]), bundle2.getString(C3407b.m7865a(c7197a2.f20777c, 1), ""));
            }
        });
        final String str6 = str2;
        c7468i.f22089i.setOnClickListener(new OnClickListener(c7468i) {
            final /* synthetic */ C7468i f10868c;

            public final void onClick(View view) {
                this.f10868c.d.mo3227k(str6);
            }
        });
    }

    private void m20041c(C7603i c7603i, Bundle bundle, C2571d c2571d, boolean z) {
        String str;
        C7468i c7468i = this;
        final C7197a c7197a = c7603i;
        final Bundle bundle2 = bundle;
        C2571d c2571d2 = c2571d;
        int i = 1;
        if (z) {
            C2573f VoteParser = PollUtils.VoteParser(new JSONObject(c7197a.f23314Q));
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
            view = C3407b.m7864a(c7468i.c, c7197a.f20777c, c2571d2.f8403e, true);
            view.setMinWidth(c7468i.f22091k);
            view.setEnabled(z ^ 1);
            view.setTextColor(UIThemeManager.getmInstance().getOutput_content_and_caption_message_text_color());
            view.setText(bundle2.getString(C3407b.m7865a(c7197a.f20777c, 1), ""));
            view.setOnFocusChangeListener(new OnFocusChangeListener(c7468i) {
                final /* synthetic */ C7468i f10870b;

                public final void onFocusChange(View view, boolean z) {
                    if (z) {
                        this.f10870b.d.m7735v();
                    }
                }
            });
        }
        C3281b c61564 = new C3281b(c7468i) {
            final /* synthetic */ C7468i f16657c;

            class C36411 implements Runnable {
                final /* synthetic */ C61564 f10871a;

                C36411(C61564 c61564) {
                    this.f10871a = c61564;
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
                            new Handler().postDelayed(new C36411(this), 500);
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
        View radioGroup = new RadioGroup(c7468i.c);
        boolean z2 = false;
        int i2 = 0;
        while (i2 < c2570cArr.length) {
            boolean z3 = c2570cArr[i2].f8398c;
            String str4 = c2570cArr[i2].f8396a;
            Activity activity = c7468i.c;
            String str5 = str4;
            Object[] objArr = new Object[i];
            objArr[0] = c2570cArr[i2].f8397b;
            CharSequence string = activity.getString(R.string.toman, objArr);
            String str6 = str5;
            boolean z4 = z3;
            i = i2;
            str = str3;
            View view2 = radioGroup;
            C3281b c3281b = c61564;
            View b2 = C3407b.m7867b(c7468i.c, c7197a.f20777c, str6, z4, c61564, true);
            b2.setText(string);
            view2.addView(b2);
            boolean z5 = bundle2.getBoolean(C3407b.m7868b(c7197a.f20777c, str6), false);
            boolean z6 = z4 && z5;
            b2.setTextColor(UIThemeManager.getmInstance().getOutput_content_and_caption_message_text_color());
            b2.setChecked(z5);
            b2.setEnabled(z ^ 1);
            radioButtonArr[i] = b2;
            radioGroup = view2;
            z2 = z6;
            c61564 = c3281b;
            str3 = str;
            i2 = i + 1;
            i = 1;
        }
        str = str3;
        int i3 = 0;
        c7468i.f22087g.addView(radioGroup);
        if (c2571d2.f8402d) {
            if (!z2) {
                i3 = 8;
            }
            view.setVisibility(i3);
            c7468i.f22087g.addView(view);
        }
        final C2570c[] c2570cArr2 = c2570cArr;
        final String str7 = str;
        c7468i.f22085e.setOnClickListener(new OnClickListener(c7468i) {
            final /* synthetic */ C7468i f10876e;

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
                this.f10876e.d.m7731a(c7197a.f20777c, str7, strArr, str);
            }
        });
    }

    protected final void mo3180a(C6829g c6829g) {
        ImageView imageView;
        int i;
        super.mo3180a(c6829g);
        final C7603i c7603i = (C7603i) c6829g;
        switch (c7603i.f21337w) {
            case ERROR:
                imageView = this.f22093m;
                i = R.drawable.ic_message_error;
                break;
            case SENDING:
                imageView = this.f22093m;
                i = R.drawable.ic_message_schedule_white;
                break;
            case PENDING:
            case PENDING_RETRANSMIT:
            case NOT_SEEN:
            case DELIVERED:
                imageView = this.f22093m;
                i = R.drawable.ic_message_tick_white;
                break;
            case SEEN:
                imageView = this.f22093m;
                i = R.drawable.ic_message_tick_double_seen;
                break;
            default:
                break;
        }
        imageView.setImageResource(i);
        String str = c7603i.f23314Q;
        boolean z = (str == null || str.isEmpty()) ? false : true;
        try {
            final Bundle a = MyApplication.m12950a().m12956a(c7603i.f20777c);
            this.f22087g.removeAllViews();
            C2571d PollDataParser = PollUtils.PollDataParser(new JSONObject(c7603i.f23313P));
            PollType pollType = PollDataParser.f8401c;
            boolean z2 = PollDataParser.f8405g;
            switch (pollType) {
                case checkbox:
                    this.f22085e.setVisibility(8);
                    this.f22088h.setVisibility(0);
                    this.f22089i.setVisibility(0);
                    m20037a(c7603i, a, PollDataParser, z);
                    break;
                case radio:
                    if (!z2) {
                        this.f22085e.setVisibility(8);
                        this.f22088h.setVisibility(0);
                        this.f22089i.setVisibility(0);
                        m20040b(c7603i, a, PollDataParser, z);
                        break;
                    }
                    this.f22085e.setVisibility(0);
                    this.f22088h.setVisibility(8);
                    this.f22089i.setVisibility(8);
                    m20041c(c7603i, a, PollDataParser, z);
                    break;
                case commentbox:
                    String str2;
                    this.f22085e.setVisibility(8);
                    this.f22088h.setVisibility(0);
                    this.f22089i.setVisibility(0);
                    if (z) {
                        str2 = PollUtils.VoteParser(new JSONObject(c7603i.f23314Q)).f8414b;
                        if (str2 == null) {
                            str2 = "";
                        }
                        a.putString(C3407b.m7865a(c7603i.f20777c, 1), str2);
                    }
                    str2 = PollDataParser.f8399a;
                    if (PollDataParser.f8402d) {
                        View a2 = C3407b.m7864a(this.c, c7603i.f20777c, PollDataParser.f8403e, true);
                        a2.setMinWidth(this.f22091k);
                        a2.setEnabled(z ^ true);
                        a2.setTextColor(UIThemeManager.getmInstance().getOutput_content_and_caption_message_text_color());
                        a2.setText(a.getString(C3407b.m7865a(c7603i.f20777c, 1), ""));
                        a2.setOnFocusChangeListener(new OnFocusChangeListener(this) {
                            final /* synthetic */ C7468i f10878b;

                            public final void onFocusChange(View view, boolean z) {
                                if (z) {
                                    this.f10878b.d.m7735v();
                                }
                            }
                        });
                        this.f22087g.addView(a2);
                    }
                    this.f22088h.setOnClickListener(new OnClickListener(this) {
                        final /* synthetic */ C7468i f10882d;

                        public final void onClick(View view) {
                            this.f10882d.d.mo3219b(c7603i.f20777c, str2, new String[0], a.getString(C3407b.m7865a(c7603i.f20777c, 1), ""));
                        }
                    });
                    this.f22089i.setOnClickListener(new OnClickListener(this) {
                        final /* synthetic */ C7468i f10885c;

                        public final void onClick(View view) {
                            this.f10885c.d.mo3227k(str2);
                        }
                    });
                    break;
                default:
                    break;
            }
            this.f22086f.setText(PollDataParser.f8400b);
        } catch (Throwable e) {
            C2480b.m6737b("Error in parsing poll data.", e);
        }
        m19051a((C7358a) c7603i, this.f22092l, true);
    }
}
