package mobi.mmdt.ott.view.conversation.p432e.p433a.p440g;

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
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.conversation.C3407b;
import mobi.mmdt.ott.view.conversation.e.a.g.i.AnonymousClass12;
import mobi.mmdt.ott.view.conversation.e.a.g.i.AnonymousClass16;
import mobi.mmdt.ott.view.conversation.p418a.C3281b;
import mobi.mmdt.ott.view.conversation.p418a.C3284e;
import mobi.mmdt.ott.view.conversation.p418a.C3286g;
import mobi.mmdt.ott.view.conversation.p418a.C3287h;
import mobi.mmdt.ott.view.conversation.p418a.C3288i;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p440g.C7507i;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p440g.C7507i.12.C37961;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p440g.C7507i.16.C37971;
import mobi.mmdt.ott.view.conversation.p573f.C7197a;
import mobi.mmdt.ott.view.conversation.p573f.p597a.C7358a;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p606g.C7642i;
import mobi.mmdt.ott.view.main.C4144a;
import org.json.JSONObject;

public final class C7507i extends C7351b {
    private final C3287h f22550d;
    private TextView f22551e = ((TextView) this.itemView.findViewById(R.id.content_textView));
    private LinearLayout f22552f = ((LinearLayout) this.itemView.findViewById(R.id.box_linearLayout));
    private Button f22553g = ((Button) this.itemView.findViewById(R.id.submit_button));
    private Button f22554h = ((Button) this.itemView.findViewById(R.id.view_results_button));
    private boolean f22555i;
    private int f22556j;
    private LinearLayout f22557k = ((LinearLayout) this.itemView.findViewById(R.id.layout_balloon_chat_background));
    private Button f22558l = ((Button) this.itemView.findViewById(R.id.payment_button));

    class C37981 implements OnLongClickListener {
        final /* synthetic */ C7507i f11153a;

        C37981(C7507i c7507i) {
            this.f11153a = c7507i;
        }

        public final boolean onLongClick(View view) {
            this.f11153a.f22555i = true;
            return false;
        }
    }

    public C7507i(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, int i, C3288i c3288i, C3287h c3287h, C3286g c3286g, C3284e c3284e) {
        super(activity, layoutInflater, viewGroup, R.layout.chat_poll_group_input_list_item, c3288i, c3286g, c3284e);
        this.f22550d = c3287h;
        this.f22556j = i;
        this.f22551e.setOnLongClickListener(new C37981(this));
        this.f22551e.setOnTouchListener(new OnTouchListener(this) {
            final /* synthetic */ C7507i f11133a;

            {
                this.f11133a = r1;
            }

            @SuppressLint({"ClickableViewAccessibility"})
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 1 && this.f11133a.f22555i) {
                    this.f11133a.f22555i = false;
                    return true;
                }
                if (motionEvent.getAction() == 0) {
                    this.f11133a.f22555i = false;
                }
                return view.onTouchEvent(motionEvent);
            }
        });
    }

    private void m20303a(C7642i c7642i, Bundle bundle, C2571d c2571d, boolean z) {
        String str;
        String str2;
        C7507i c7507i = this;
        final C7197a c7197a = c7642i;
        final Bundle bundle2 = bundle;
        C2571d c2571d2 = c2571d;
        boolean z2 = false;
        if (z) {
            C2573f VoteParser = PollUtils.VoteParser(new JSONObject(c7197a.f23553Q));
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
            view = C3407b.m7864a(c7507i.c, c7197a.f20777c, c2571d2.f8403e, false);
            view.setMinWidth(c7507i.f22556j);
            view.setText(bundle2.getString(C3407b.m7865a(c7197a.f20777c, 1), ""));
            view.setTextColor(UIThemeManager.getmInstance().getInput_content_and_caption_message_text_color());
            view.setEnabled(z ^ 1);
            view.setOnFocusChangeListener(new OnFocusChangeListener(c7507i) {
                final /* synthetic */ C7507i f11135b;

                public final void onFocusChange(View view, boolean z) {
                    if (z) {
                        this.f11135b.f22550d.mo2346v();
                    }
                }
            });
        }
        C3281b anonymousClass12 = new C3281b(c7507i) {
            final /* synthetic */ C7507i f16696c;

            class C37961 implements Runnable {
                final /* synthetic */ AnonymousClass12 f11136a;

                C37961(AnonymousClass12 anonymousClass12) {
                    this.f11136a = anonymousClass12;
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
                            new Handler().postDelayed(new C37961(this), 500);
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
            View a2 = C3407b.m7863a(c7507i.c, c7197a.f20777c, str4, z2, anonymousClass12, false);
            a2.setText(str);
            a2.setTextColor(UIThemeManager.getmInstance().getInput_content_and_caption_message_text_color());
            c7507i.f22552f.addView(a2);
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
            c7507i.f22552f.addView(view);
        }
        final C2570c[] c2570cArr2 = c2570cArr;
        final C7197a c7197a2 = c7197a;
        final String str5 = str2;
        c7507i.f22553g.setOnClickListener(new OnClickListener(c7507i) {
            final /* synthetic */ C7507i f11141e;

            public final void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                for (C2570c c2570c : c2570cArr2) {
                    String str = c2570c.f8396a;
                    if (bundle2.getBoolean(C3407b.m7866a(c7197a2.f20777c, str), false)) {
                        arrayList.add(str);
                    }
                }
                this.f11141e.f22550d.mo3219b(c7197a2.f20777c, str5, (String[]) arrayList.toArray(new String[arrayList.size()]), bundle2.getString(C3407b.m7865a(c7197a2.f20777c, 1), ""));
            }
        });
        final String str6 = str2;
        c7507i.f22554h.setOnClickListener(new OnClickListener(c7507i) {
            final /* synthetic */ C7507i f11144c;

            public final void onClick(View view) {
                this.f11144c.f22550d.mo3227k(str6);
            }
        });
    }

    private void m20307b(C7642i c7642i, Bundle bundle, C2571d c2571d, boolean z) {
        String str;
        String str2;
        C7507i c7507i = this;
        final C7197a c7197a = c7642i;
        final Bundle bundle2 = bundle;
        C2571d c2571d2 = c2571d;
        boolean z2 = false;
        if (z) {
            C2573f VoteParser = PollUtils.VoteParser(new JSONObject(c7197a.f23553Q));
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
            view = C3407b.m7864a(c7507i.c, c7197a.f20777c, c2571d2.f8403e, false);
            view.setMinWidth(c7507i.f22556j);
            view.setEnabled(z ^ 1);
            view.setText(bundle2.getString(C3407b.m7865a(c7197a.f20777c, 1), ""));
            view.setTextColor(UIThemeManager.getmInstance().getInput_content_and_caption_message_text_color());
            view.setOnFocusChangeListener(new OnFocusChangeListener(c7507i) {
                final /* synthetic */ C7507i f11146b;

                public final void onFocusChange(View view, boolean z) {
                    if (z) {
                        this.f11146b.f22550d.mo2346v();
                    }
                }
            });
        }
        C3281b anonymousClass16 = new C3281b(c7507i) {
            final /* synthetic */ C7507i f16699c;

            class C37971 implements Runnable {
                final /* synthetic */ AnonymousClass16 f11147a;

                C37971(AnonymousClass16 anonymousClass16) {
                    this.f11147a = anonymousClass16;
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
                            new Handler().postDelayed(new C37971(this), 500);
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
        View radioGroup = new RadioGroup(c7507i.c);
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
            View b2 = C3407b.m7867b(c7507i.c, c7197a.f20777c, str4, z2, anonymousClass16, false);
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
        c7507i.f22552f.addView(radioGroup);
        if (c2571d2.f8402d) {
            if (!z3) {
                i3 = 8;
            }
            view.setVisibility(i3);
            c7507i.f22552f.addView(view);
        }
        final C2570c[] c2570cArr2 = c2570cArr;
        final C7197a c7197a2 = c7197a;
        final String str5 = str2;
        c7507i.f22553g.setOnClickListener(new OnClickListener(c7507i) {
            final /* synthetic */ C7507i f11152e;

            public final void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                for (C2570c c2570c : c2570cArr2) {
                    String str = c2570c.f8396a;
                    if (bundle2.getBoolean(C3407b.m7868b(c7197a2.f20777c, str), false)) {
                        arrayList.add(str);
                    }
                }
                this.f11152e.f22550d.mo3219b(c7197a2.f20777c, str5, (String[]) arrayList.toArray(new String[arrayList.size()]), bundle2.getString(C3407b.m7865a(c7197a2.f20777c, 1), ""));
            }
        });
        final String str6 = str2;
        c7507i.f22554h.setOnClickListener(new OnClickListener(c7507i) {
            final /* synthetic */ C7507i f11156c;

            public final void onClick(View view) {
                this.f11156c.f22550d.mo3227k(str6);
            }
        });
    }

    private void m20308c(C7642i c7642i, Bundle bundle, C2571d c2571d, boolean z) {
        String str;
        C7507i c7507i = this;
        final C7197a c7197a = c7642i;
        final Bundle bundle2 = bundle;
        C2571d c2571d2 = c2571d;
        boolean z2 = false;
        int i = 1;
        if (z) {
            C2573f VoteParser = PollUtils.VoteParser(new JSONObject(c7197a.f23553Q));
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
            view = C3407b.m7864a(c7507i.c, c7197a.f20777c, c2571d2.f8403e, false);
            view.setMinWidth(c7507i.f22556j);
            view.setEnabled(z ^ 1);
            view.setTextColor(UIThemeManager.getmInstance().getInput_content_and_caption_message_text_color());
            view.setText(bundle2.getString(C3407b.m7865a(c7197a.f20777c, 1), ""));
            view.setOnFocusChangeListener(new OnFocusChangeListener(c7507i) {
                final /* synthetic */ C7507i f11158b;

                public final void onFocusChange(View view, boolean z) {
                    if (z) {
                        this.f11158b.f22550d.mo2346v();
                    }
                }
            });
        }
        C3281b c61774 = new C3281b(c7507i) {
            final /* synthetic */ C7507i f16702c;

            class C38011 implements Runnable {
                final /* synthetic */ C61774 f11159a;

                C38011(C61774 c61774) {
                    this.f11159a = c61774;
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
                            new Handler().postDelayed(new C38011(this), 500);
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
        View radioGroup = new RadioGroup(c7507i.c);
        boolean z3 = false;
        int i2 = z3;
        while (i2 < c2570cArr.length) {
            boolean z4 = c2570cArr[i2].f8398c;
            String str4 = c2570cArr[i2].f8396a;
            Activity activity = c7507i.c;
            String str5 = str4;
            Object[] objArr = new Object[i];
            objArr[0] = c2570cArr[i2].f8397b;
            CharSequence string = activity.getString(R.string.toman, objArr);
            String str6 = str5;
            boolean z5 = z4;
            i = i2;
            str = str3;
            View view2 = radioGroup;
            C3281b c3281b = c61774;
            View b2 = C3407b.m7867b(c7507i.c, c7197a.f20777c, str6, z5, c61774, false);
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
            c61774 = c3281b;
            str3 = str;
            i2 = i + 1;
            i = 1;
            z2 = false;
        }
        int i3 = z2;
        str = str3;
        c7507i.f22552f.addView(radioGroup);
        if (c2571d2.f8402d) {
            if (!z3) {
                i3 = 8;
            }
            view.setVisibility(i3);
            c7507i.f22552f.addView(view);
        }
        final C2570c[] c2570cArr2 = c2570cArr;
        final String str7 = str;
        c7507i.f22558l.setOnClickListener(new OnClickListener(c7507i) {
            final /* synthetic */ C7507i f11164e;

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
                this.f11164e.f22550d.mo2312a(c7197a.f20777c, str7, strArr, str);
            }
        });
    }

    protected final void mo3180a(C6829g c6829g) {
        super.mo3180a(c6829g);
        final C7642i c7642i = (C7642i) c6829g;
        String str = c7642i.f23553Q;
        boolean z = (str == null || str.isEmpty()) ? false : true;
        try {
            final Bundle a = MyApplication.m12950a().m12956a(c7642i.f20777c);
            this.f22552f.removeAllViews();
            C2571d PollDataParser = PollUtils.PollDataParser(new JSONObject(c7642i.f23552P));
            PollType pollType = PollDataParser.f8401c;
            boolean z2 = PollDataParser.f8405g;
            switch (pollType) {
                case checkbox:
                    this.f22558l.setVisibility(8);
                    this.f22553g.setVisibility(0);
                    this.f22554h.setVisibility(0);
                    m20303a(c7642i, a, PollDataParser, z);
                    break;
                case radio:
                    if (!z2) {
                        this.f22558l.setVisibility(8);
                        this.f22553g.setVisibility(0);
                        this.f22554h.setVisibility(0);
                        m20307b(c7642i, a, PollDataParser, z);
                        break;
                    }
                    this.f22558l.setVisibility(0);
                    this.f22553g.setVisibility(8);
                    this.f22554h.setVisibility(8);
                    m20308c(c7642i, a, PollDataParser, z);
                    break;
                case commentbox:
                    String str2;
                    this.f22558l.setVisibility(8);
                    this.f22553g.setVisibility(0);
                    this.f22554h.setVisibility(0);
                    if (z) {
                        str2 = PollUtils.VoteParser(new JSONObject(c7642i.f23553Q)).f8414b;
                        if (str2 == null) {
                            str2 = "";
                        }
                        a.putString(C3407b.m7865a(c7642i.f20777c, 1), str2);
                    }
                    str2 = PollDataParser.f8399a;
                    if (PollDataParser.f8402d) {
                        View a2 = C3407b.m7864a(this.c, c7642i.f20777c, PollDataParser.f8403e, false);
                        a2.setMinWidth(this.f22556j);
                        a2.setEnabled(z ^ true);
                        a2.setText(a.getString(C3407b.m7865a(c7642i.f20777c, 1), ""));
                        a2.setTextColor(UIThemeManager.getmInstance().getInput_content_and_caption_message_text_color());
                        a2.setOnFocusChangeListener(new OnFocusChangeListener(this) {
                            final /* synthetic */ C7507i f11166b;

                            public final void onFocusChange(View view, boolean z) {
                                if (z) {
                                    this.f11166b.f22550d.mo2346v();
                                }
                            }
                        });
                        this.f22552f.addView(a2);
                    }
                    this.f22553g.setOnClickListener(new OnClickListener(this) {
                        final /* synthetic */ C7507i f11170d;

                        public final void onClick(View view) {
                            this.f11170d.f22550d.mo3219b(c7642i.f20777c, str2, new String[0], a.getString(C3407b.m7865a(c7642i.f20777c, 1), ""));
                        }
                    });
                    this.f22554h.setOnClickListener(new OnClickListener(this) {
                        final /* synthetic */ C7507i f11173c;

                        public final void onClick(View view) {
                            this.f11173c.f22550d.mo3227k(str2);
                        }
                    });
                    break;
                default:
                    break;
            }
            this.f22551e.setText(PollDataParser.f8400b);
        } catch (Throwable e) {
            C2480b.m6737b("Error in parsing poll data.", e);
        }
        m19051a((C7358a) c7642i, this.f22557k, false);
    }
}
