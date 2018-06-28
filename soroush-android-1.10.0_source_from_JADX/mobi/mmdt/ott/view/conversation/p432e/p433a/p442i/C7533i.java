package mobi.mmdt.ott.view.conversation.p432e.p433a.p442i;

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
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.conversation.C3407b;
import mobi.mmdt.ott.view.conversation.e.a.i.i.AnonymousClass12;
import mobi.mmdt.ott.view.conversation.e.a.i.i.AnonymousClass16;
import mobi.mmdt.ott.view.conversation.p418a.C3281b;
import mobi.mmdt.ott.view.conversation.p418a.C3284e;
import mobi.mmdt.ott.view.conversation.p418a.C3286g;
import mobi.mmdt.ott.view.conversation.p418a.C3287h;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p442i.C7533i;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p442i.C7533i.12.C38991;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p442i.C7533i.16.C39001;
import mobi.mmdt.ott.view.conversation.p573f.C7197a;
import mobi.mmdt.ott.view.conversation.p573f.p597a.C7358a;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p608i.C7668i;
import mobi.mmdt.ott.view.main.C4144a;
import org.json.JSONObject;

public final class C7533i extends C7353b {
    private final C3287h f22852d;
    private TextView f22853e = ((TextView) this.itemView.findViewById(R.id.content_textView));
    private LinearLayout f22854f = ((LinearLayout) this.itemView.findViewById(R.id.box_linearLayout));
    private Button f22855g = ((Button) this.itemView.findViewById(R.id.submit_button));
    private Button f22856h = ((Button) this.itemView.findViewById(R.id.view_results_button));
    private boolean f22857i;
    private int f22858j;
    private LinearLayout f22859k = ((LinearLayout) this.itemView.findViewById(R.id.layout_balloon_chat_background));
    private Button f22860l;

    class C39011 implements OnLongClickListener {
        final /* synthetic */ C7533i f11338a;

        C39011(C7533i c7533i) {
            this.f11338a = c7533i;
        }

        public final boolean onLongClick(View view) {
            this.f11338a.f22857i = true;
            return false;
        }
    }

    public C7533i(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, int i, C3287h c3287h, C3286g c3286g, C3284e c3284e) {
        super(activity, layoutInflater, viewGroup, R.layout.chat_poll_single_input_list_item, c3286g, c3284e);
        this.f22852d = c3287h;
        this.f22858j = i;
        this.f22860l = (Button) this.itemView.findViewById(R.id.payment_button);
        this.f22853e.setOnLongClickListener(new C39011(this));
        this.f22853e.setOnTouchListener(new OnTouchListener(this) {
            final /* synthetic */ C7533i f11318a;

            {
                this.f11318a = r1;
            }

            @SuppressLint({"ClickableViewAccessibility"})
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 1 && this.f11318a.f22857i) {
                    this.f11318a.f22857i = false;
                    return true;
                }
                if (motionEvent.getAction() == 0) {
                    this.f11318a.f22857i = false;
                }
                return view.onTouchEvent(motionEvent);
            }
        });
    }

    private void m20497a(C7668i c7668i, Bundle bundle, C2571d c2571d, boolean z) {
        String str;
        String str2;
        C7533i c7533i = this;
        final C7197a c7197a = c7668i;
        final Bundle bundle2 = bundle;
        C2571d c2571d2 = c2571d;
        boolean z2 = false;
        if (z) {
            C2573f VoteParser = PollUtils.VoteParser(new JSONObject(c7197a.f23736Q));
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
            view = C3407b.m7864a(c7533i.c, c7197a.f20777c, c2571d2.f8403e, false);
            view.setMinWidth(c7533i.f22858j);
            view.setText(bundle2.getString(C3407b.m7865a(c7197a.f20777c, 1), ""));
            view.setEnabled(z ^ 1);
            view.setOnFocusChangeListener(new OnFocusChangeListener(c7533i) {
                final /* synthetic */ C7533i f11320b;

                public final void onFocusChange(View view, boolean z) {
                    if (z) {
                        this.f11320b.f22852d.mo2346v();
                    }
                }
            });
        }
        C3281b anonymousClass12 = new C3281b(c7533i) {
            final /* synthetic */ C7533i f16726c;

            class C38991 implements Runnable {
                final /* synthetic */ AnonymousClass12 f11321a;

                C38991(AnonymousClass12 anonymousClass12) {
                    this.f11321a = anonymousClass12;
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
                            new Handler().postDelayed(new C38991(this), 500);
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
            View a2 = C3407b.m7863a(c7533i.c, c7197a.f20777c, str4, z2, anonymousClass12, false);
            a2.setText(str);
            c7533i.f22854f.addView(a2);
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
            view.setVisibility(z3 ? z6 : 8);
            c7533i.f22854f.addView(view);
        }
        final C2570c[] c2570cArr2 = c2570cArr;
        final C7197a c7197a2 = c7197a;
        final String str5 = str2;
        c7533i.f22855g.setOnClickListener(new OnClickListener(c7533i) {
            final /* synthetic */ C7533i f11326e;

            public final void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                for (C2570c c2570c : c2570cArr2) {
                    String str = c2570c.f8396a;
                    if (bundle2.getBoolean(C3407b.m7866a(c7197a2.f20777c, str), false)) {
                        arrayList.add(str);
                    }
                }
                this.f11326e.f22852d.mo3219b(c7197a2.f20777c, str5, (String[]) arrayList.toArray(new String[arrayList.size()]), bundle2.getString(C3407b.m7865a(c7197a2.f20777c, 1), ""));
            }
        });
        final String str6 = str2;
        c7533i.f22856h.setOnClickListener(new OnClickListener(c7533i) {
            final /* synthetic */ C7533i f11329c;

            public final void onClick(View view) {
                this.f11329c.f22852d.mo3227k(str6);
            }
        });
    }

    private void m20501b(C7668i c7668i, Bundle bundle, C2571d c2571d, boolean z) {
        String str;
        String str2;
        C7533i c7533i = this;
        final C7197a c7197a = c7668i;
        final Bundle bundle2 = bundle;
        C2571d c2571d2 = c2571d;
        boolean z2 = false;
        if (z) {
            C2573f VoteParser = PollUtils.VoteParser(new JSONObject(c7197a.f23736Q));
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
            view = C3407b.m7864a(c7533i.c, c7197a.f20777c, c2571d2.f8403e, false);
            view.setMinWidth(c7533i.f22858j);
            view.setEnabled(z ^ 1);
            view.setText(bundle2.getString(C3407b.m7865a(c7197a.f20777c, 1), ""));
            view.setOnFocusChangeListener(new OnFocusChangeListener(c7533i) {
                final /* synthetic */ C7533i f11331b;

                public final void onFocusChange(View view, boolean z) {
                    if (z) {
                        this.f11331b.f22852d.mo2346v();
                    }
                }
            });
        }
        C3281b anonymousClass16 = new C3281b(c7533i) {
            final /* synthetic */ C7533i f16729c;

            class C39001 implements Runnable {
                final /* synthetic */ AnonymousClass16 f11332a;

                C39001(AnonymousClass16 anonymousClass16) {
                    this.f11332a = anonymousClass16;
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
                            new Handler().postDelayed(new C39001(this), 500);
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
        View radioGroup = new RadioGroup(c7533i.c);
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
            View b2 = C3407b.m7867b(c7533i.c, c7197a.f20777c, str4, z2, anonymousClass16, false);
            b2.setText(charSequence);
            view2.addView(b2);
            boolean z5 = bundle2.getBoolean(C3407b.m7868b(c7197a.f20777c, str4), false);
            z2 = z2 && z5;
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
        c7533i.f22854f.addView(radioGroup);
        if (c2571d2.f8402d) {
            if (!z3) {
                i3 = 8;
            }
            view.setVisibility(i3);
            c7533i.f22854f.addView(view);
        }
        final C2570c[] c2570cArr2 = c2570cArr;
        final C7197a c7197a2 = c7197a;
        final String str5 = str2;
        c7533i.f22855g.setOnClickListener(new OnClickListener(c7533i) {
            final /* synthetic */ C7533i f11337e;

            public final void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                for (C2570c c2570c : c2570cArr2) {
                    String str = c2570c.f8396a;
                    if (bundle2.getBoolean(C3407b.m7868b(c7197a2.f20777c, str), false)) {
                        arrayList.add(str);
                    }
                }
                this.f11337e.f22852d.mo3219b(c7197a2.f20777c, str5, (String[]) arrayList.toArray(new String[arrayList.size()]), bundle2.getString(C3407b.m7865a(c7197a2.f20777c, 1), ""));
            }
        });
        final String str6 = str2;
        c7533i.f22856h.setOnClickListener(new OnClickListener(c7533i) {
            final /* synthetic */ C7533i f11341c;

            public final void onClick(View view) {
                this.f11341c.f22852d.mo3227k(str6);
            }
        });
    }

    private void m20502c(C7668i c7668i, Bundle bundle, C2571d c2571d, boolean z) {
        String str;
        C7533i c7533i = this;
        final C7197a c7197a = c7668i;
        final Bundle bundle2 = bundle;
        C2571d c2571d2 = c2571d;
        boolean z2 = false;
        int i = 1;
        if (z) {
            C2573f VoteParser = PollUtils.VoteParser(new JSONObject(c7197a.f23736Q));
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
            view = C3407b.m7864a(c7533i.c, c7197a.f20777c, c2571d2.f8403e, false);
            view.setMinWidth(c7533i.f22858j);
            view.setEnabled(z ^ 1);
            view.setText(bundle2.getString(C3407b.m7865a(c7197a.f20777c, 1), ""));
            view.setOnFocusChangeListener(new OnFocusChangeListener(c7533i) {
                final /* synthetic */ C7533i f11343b;

                public final void onFocusChange(View view, boolean z) {
                    if (z) {
                        this.f11343b.f22852d.mo2346v();
                    }
                }
            });
        }
        C3281b c61914 = new C3281b(c7533i) {
            final /* synthetic */ C7533i f16732c;

            class C39041 implements Runnable {
                final /* synthetic */ C61914 f11344a;

                C39041(C61914 c61914) {
                    this.f11344a = c61914;
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
                            new Handler().postDelayed(new C39041(this), 500);
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
        View radioGroup = new RadioGroup(c7533i.c);
        boolean z3 = false;
        int i2 = z3;
        while (i2 < c2570cArr.length) {
            boolean z4 = c2570cArr[i2].f8398c;
            String str4 = c2570cArr[i2].f8396a;
            Activity activity = c7533i.c;
            String str5 = str4;
            Object[] objArr = new Object[i];
            objArr[0] = c2570cArr[i2].f8397b;
            CharSequence string = activity.getString(R.string.toman, objArr);
            String str6 = str5;
            boolean z5 = z4;
            i = i2;
            str = str3;
            View view2 = radioGroup;
            C3281b c3281b = c61914;
            View b2 = C3407b.m7867b(c7533i.c, c7197a.f20777c, str6, z5, c61914, false);
            b2.setText(string);
            view2.addView(b2);
            z2 = bundle2.getBoolean(C3407b.m7868b(c7197a.f20777c, str6), false);
            boolean z6 = z5 && z2;
            b2.setChecked(z2);
            b2.setEnabled(z ^ 1);
            radioButtonArr[i] = b2;
            radioGroup = view2;
            z3 = z6;
            c61914 = c3281b;
            str3 = str;
            i2 = i + 1;
            i = 1;
            z2 = false;
        }
        int i3 = z2;
        str = str3;
        c7533i.f22854f.addView(radioGroup);
        if (c2571d2.f8402d) {
            if (!z3) {
                i3 = 8;
            }
            view.setVisibility(i3);
            c7533i.f22854f.addView(view);
        }
        final C2570c[] c2570cArr2 = c2570cArr;
        final String str7 = str;
        c7533i.f22860l.setOnClickListener(new OnClickListener(c7533i) {
            final /* synthetic */ C7533i f11349e;

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
                this.f11349e.f22852d.mo2312a(c7197a.f20777c, str7, strArr, str);
            }
        });
    }

    protected final void mo3180a(C6829g c6829g) {
        super.mo3180a(c6829g);
        final C7668i c7668i = (C7668i) c6829g;
        String str = c7668i.f23736Q;
        boolean z = (str == null || str.isEmpty()) ? false : true;
        try {
            final Bundle a = MyApplication.m12950a().m12956a(c7668i.f20777c);
            this.f22854f.removeAllViews();
            C2571d PollDataParser = PollUtils.PollDataParser(new JSONObject(c7668i.f23735P));
            PollType pollType = PollDataParser.f8401c;
            boolean z2 = PollDataParser.f8405g;
            switch (pollType) {
                case checkbox:
                    this.f22860l.setVisibility(8);
                    this.f22855g.setVisibility(0);
                    this.f22856h.setVisibility(0);
                    m20497a(c7668i, a, PollDataParser, z);
                    break;
                case radio:
                    if (!z2) {
                        this.f22860l.setVisibility(8);
                        this.f22855g.setVisibility(0);
                        this.f22856h.setVisibility(0);
                        m20501b(c7668i, a, PollDataParser, z);
                        break;
                    }
                    this.f22860l.setVisibility(0);
                    this.f22855g.setVisibility(8);
                    this.f22856h.setVisibility(8);
                    m20502c(c7668i, a, PollDataParser, z);
                    break;
                case commentbox:
                    String str2;
                    this.f22860l.setVisibility(8);
                    this.f22855g.setVisibility(0);
                    this.f22856h.setVisibility(0);
                    if (z) {
                        str2 = PollUtils.VoteParser(new JSONObject(c7668i.f23736Q)).f8414b;
                        if (str2 == null) {
                            str2 = "";
                        }
                        a.putString(C3407b.m7865a(c7668i.f20777c, 1), str2);
                    }
                    str2 = PollDataParser.f8399a;
                    if (PollDataParser.f8402d) {
                        View a2 = C3407b.m7864a(this.c, c7668i.f20777c, PollDataParser.f8403e, false);
                        a2.setMinWidth(this.f22858j);
                        a2.setEnabled(z ^ true);
                        a2.setText(a.getString(C3407b.m7865a(c7668i.f20777c, 1), ""));
                        a2.setOnFocusChangeListener(new OnFocusChangeListener(this) {
                            final /* synthetic */ C7533i f11351b;

                            public final void onFocusChange(View view, boolean z) {
                                if (z) {
                                    this.f11351b.f22852d.mo2346v();
                                }
                            }
                        });
                        this.f22854f.addView(a2);
                    }
                    this.f22855g.setOnClickListener(new OnClickListener(this) {
                        final /* synthetic */ C7533i f11355d;

                        public final void onClick(View view) {
                            this.f11355d.f22852d.mo3219b(c7668i.f20777c, str2, new String[0], a.getString(C3407b.m7865a(c7668i.f20777c, 1), ""));
                        }
                    });
                    this.f22856h.setOnClickListener(new OnClickListener(this) {
                        final /* synthetic */ C7533i f11358c;

                        public final void onClick(View view) {
                            this.f11358c.f22852d.mo3227k(str2);
                        }
                    });
                    break;
                default:
                    break;
            }
            this.f22853e.setText(PollDataParser.f8400b);
        } catch (Throwable e) {
            C2480b.m6737b("Error in parsing poll data.", e);
        }
        m19051a((C7358a) c7668i, this.f22859k, false);
    }
}
