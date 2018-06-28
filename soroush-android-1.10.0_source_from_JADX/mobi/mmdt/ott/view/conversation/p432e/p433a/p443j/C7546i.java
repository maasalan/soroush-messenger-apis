package mobi.mmdt.ott.view.conversation.p432e.p433a.p443j;

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
import mobi.mmdt.ott.view.conversation.e.a.j.i.AnonymousClass12;
import mobi.mmdt.ott.view.conversation.e.a.j.i.AnonymousClass16;
import mobi.mmdt.ott.view.conversation.p418a.C3281b;
import mobi.mmdt.ott.view.conversation.p418a.C3284e;
import mobi.mmdt.ott.view.conversation.p418a.C3286g;
import mobi.mmdt.ott.view.conversation.p418a.C3287h;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p443j.C7546i;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p443j.C7546i.12.C39491;
import mobi.mmdt.ott.view.conversation.p432e.p433a.p443j.C7546i.16.C39501;
import mobi.mmdt.ott.view.conversation.p573f.C7197a;
import mobi.mmdt.ott.view.conversation.p573f.p597a.C7358a;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p609j.C7681i;
import mobi.mmdt.ott.view.main.C4144a;
import org.json.JSONObject;

public final class C7546i extends C7354b {
    private final ImageView f23002d;
    private TextView f23003e = ((TextView) this.itemView.findViewById(R.id.content_textView));
    private LinearLayout f23004f = ((LinearLayout) this.itemView.findViewById(R.id.box_linearLayout));
    private Button f23005g = ((Button) this.itemView.findViewById(R.id.submit_button));
    private Button f23006h = ((Button) this.itemView.findViewById(R.id.view_results_button));
    private boolean f23007i;
    private int f23008j;
    private LinearLayout f23009k;
    private C3287h f23010l;
    private Button f23011m = ((Button) this.itemView.findViewById(R.id.payment_button));

    class C39511 implements OnLongClickListener {
        final /* synthetic */ C7546i f11429a;

        C39511(C7546i c7546i) {
            this.f11429a = c7546i;
        }

        public final boolean onLongClick(View view) {
            this.f11429a.f23007i = true;
            return false;
        }
    }

    class C39533 implements OnFocusChangeListener {
        final /* synthetic */ C7546i f11433a;

        C39533(C7546i c7546i) {
            this.f11433a = c7546i;
        }

        public final void onFocusChange(View view, boolean z) {
        }
    }

    public C7546i(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, int i, C3287h c3287h, C3286g c3286g, C3284e c3284e) {
        super(activity, layoutInflater, viewGroup, R.layout.chat_poll_output_list_item, c3286g, c3284e);
        this.f23010l = c3287h;
        this.f23008j = i;
        this.f23009k = (LinearLayout) this.itemView.findViewById(R.id.layout_balloon_chat_background);
        this.f23002d = (ImageView) this.itemView.findViewById(R.id.status_imageView);
        this.f23003e.setOnLongClickListener(new C39511(this));
        this.f23003e.setOnTouchListener(new OnTouchListener(this) {
            final /* synthetic */ C7546i f11409a;

            {
                this.f11409a = r1;
            }

            @SuppressLint({"ClickableViewAccessibility"})
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 1 && this.f11409a.f23007i) {
                    this.f11409a.f23007i = false;
                    return true;
                }
                if (motionEvent.getAction() == 0) {
                    this.f11409a.f23007i = false;
                }
                return view.onTouchEvent(motionEvent);
            }
        });
    }

    private void m20594a(C7681i c7681i, Bundle bundle, C2571d c2571d, boolean z) {
        String str;
        String str2;
        C7546i c7546i = this;
        final C7197a c7197a = c7681i;
        final Bundle bundle2 = bundle;
        C2571d c2571d2 = c2571d;
        if (z) {
            C2573f VoteParser = PollUtils.VoteParser(new JSONObject(c7197a.f23833Q));
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
            view = C3407b.m7864a(c7546i.c, c7197a.f20777c, c2571d2.f8403e, true);
            view.setMinWidth(c7546i.f23008j);
            view.setTextColor(UIThemeManager.getmInstance().getOutput_content_and_caption_message_text_color());
            view.setText(bundle2.getString(C3407b.m7865a(c7197a.f20777c, 1), ""));
            view.setEnabled(z ^ 1);
            view.setOnFocusChangeListener(new OnFocusChangeListener(c7546i) {
                final /* synthetic */ C7546i f11411b;

                public final void onFocusChange(View view, boolean z) {
                    if (z) {
                        this.f11411b.f23010l.mo2346v();
                    }
                }
            });
        }
        C3281b anonymousClass12 = new C3281b(c7546i) {
            final /* synthetic */ C7546i f16741c;

            class C39491 implements Runnable {
                final /* synthetic */ AnonymousClass12 f11412a;

                C39491(AnonymousClass12 anonymousClass12) {
                    this.f11412a = anonymousClass12;
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
                            new Handler().postDelayed(new C39491(this), 500);
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
            View a2 = C3407b.m7863a(c7546i.c, c7197a.f20777c, str4, z4, anonymousClass12, true);
            a2.setText(str);
            a2.setTextColor(UIThemeManager.getmInstance().getOutput_content_and_caption_message_text_color());
            c7546i.f23004f.addView(a2);
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
            view.setVisibility(z2 ? 0 : 8);
            c7546i.f23004f.addView(view);
        }
        final C2570c[] c2570cArr2 = c2570cArr;
        final C7197a c7197a2 = c7197a;
        final String str5 = str2;
        c7546i.f23005g.setOnClickListener(new OnClickListener(c7546i) {
            final /* synthetic */ C7546i f11417e;

            public final void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                for (C2570c c2570c : c2570cArr2) {
                    String str = c2570c.f8396a;
                    if (bundle2.getBoolean(C3407b.m7866a(c7197a2.f20777c, str), false)) {
                        arrayList.add(str);
                    }
                }
                this.f11417e.f23010l.mo3219b(c7197a2.f20777c, str5, (String[]) arrayList.toArray(new String[arrayList.size()]), bundle2.getString(C3407b.m7865a(c7197a2.f20777c, 1), ""));
            }
        });
        final String str6 = str2;
        c7546i.f23006h.setOnClickListener(new OnClickListener(c7546i) {
            final /* synthetic */ C7546i f11420c;

            public final void onClick(View view) {
                this.f11420c.f23010l.mo3227k(str6);
            }
        });
    }

    private void m20598b(C7681i c7681i, Bundle bundle, C2571d c2571d, boolean z) {
        String str;
        String str2;
        C7546i c7546i = this;
        final C7197a c7197a = c7681i;
        final Bundle bundle2 = bundle;
        C2571d c2571d2 = c2571d;
        if (z) {
            C2573f VoteParser = PollUtils.VoteParser(new JSONObject(c7197a.f23833Q));
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
            view = C3407b.m7864a(c7546i.c, c7197a.f20777c, c2571d2.f8403e, true);
            view.setMinWidth(c7546i.f23008j);
            view.setEnabled(z ^ 1);
            view.setTextColor(UIThemeManager.getmInstance().getOutput_content_and_caption_message_text_color());
            view.setText(bundle2.getString(C3407b.m7865a(c7197a.f20777c, 1), ""));
            view.setOnFocusChangeListener(new OnFocusChangeListener(c7546i) {
                final /* synthetic */ C7546i f11422b;

                public final void onFocusChange(View view, boolean z) {
                    if (z) {
                        this.f11422b.f23010l.mo2346v();
                    }
                }
            });
        }
        C3281b anonymousClass16 = new C3281b(c7546i) {
            final /* synthetic */ C7546i f16744c;

            class C39501 implements Runnable {
                final /* synthetic */ AnonymousClass16 f11423a;

                C39501(AnonymousClass16 anonymousClass16) {
                    this.f11423a = anonymousClass16;
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
                            new Handler().postDelayed(new C39501(this), 500);
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
        View radioGroup = new RadioGroup(c7546i.c);
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
            View b2 = C3407b.m7867b(c7546i.c, c7197a.f20777c, str4, z4, anonymousClass16, true);
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
        c7546i.f23004f.addView(radioGroup);
        if (c2571d2.f8402d) {
            if (!z2) {
                i3 = 8;
            }
            view.setVisibility(i3);
            c7546i.f23004f.addView(view);
        }
        final C2570c[] c2570cArr2 = c2570cArr;
        final C7197a c7197a2 = c7197a;
        final String str5 = str2;
        c7546i.f23005g.setOnClickListener(new OnClickListener(c7546i) {
            final /* synthetic */ C7546i f11428e;

            public final void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                for (C2570c c2570c : c2570cArr2) {
                    String str = c2570c.f8396a;
                    if (bundle2.getBoolean(C3407b.m7868b(c7197a2.f20777c, str), false)) {
                        arrayList.add(str);
                    }
                }
                this.f11428e.f23010l.mo3219b(c7197a2.f20777c, str5, (String[]) arrayList.toArray(new String[arrayList.size()]), bundle2.getString(C3407b.m7865a(c7197a2.f20777c, 1), ""));
            }
        });
        final String str6 = str2;
        c7546i.f23006h.setOnClickListener(new OnClickListener(c7546i) {
            final /* synthetic */ C7546i f11432c;

            public final void onClick(View view) {
                this.f11432c.f23010l.mo3227k(str6);
            }
        });
    }

    private void m20599c(C7681i c7681i, Bundle bundle, C2571d c2571d, boolean z) {
        String str;
        C7546i c7546i = this;
        final C7197a c7197a = c7681i;
        final Bundle bundle2 = bundle;
        C2571d c2571d2 = c2571d;
        int i = 1;
        if (z) {
            C2573f VoteParser = PollUtils.VoteParser(new JSONObject(c7197a.f23833Q));
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
            view = C3407b.m7864a(c7546i.c, c7197a.f20777c, c2571d2.f8403e, true);
            view.setMinWidth(c7546i.f23008j);
            view.setEnabled(z ^ 1);
            view.setTextColor(UIThemeManager.getmInstance().getOutput_content_and_caption_message_text_color());
            view.setText(bundle2.getString(C3407b.m7865a(c7197a.f20777c, 1), ""));
            view.setOnFocusChangeListener(new C39533(c7546i));
        }
        C3281b c61984 = new C3281b(c7546i) {
            final /* synthetic */ C7546i f16747c;

            class C39541 implements Runnable {
                final /* synthetic */ C61984 f11434a;

                C39541(C61984 c61984) {
                    this.f11434a = c61984;
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
                            new Handler().postDelayed(new C39541(this), 500);
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
        View radioGroup = new RadioGroup(c7546i.c);
        boolean z2 = false;
        int i2 = 0;
        while (i2 < c2570cArr.length) {
            boolean z3 = c2570cArr[i2].f8398c;
            String str4 = c2570cArr[i2].f8396a;
            Activity activity = c7546i.c;
            String str5 = str4;
            Object[] objArr = new Object[i];
            objArr[0] = c2570cArr[i2].f8397b;
            CharSequence string = activity.getString(R.string.toman, objArr);
            String str6 = str5;
            boolean z4 = z3;
            i = i2;
            str = str3;
            View view2 = radioGroup;
            C3281b c3281b = c61984;
            View b2 = C3407b.m7867b(c7546i.c, c7197a.f20777c, str6, z4, c61984, true);
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
            c61984 = c3281b;
            str3 = str;
            i2 = i + 1;
            i = 1;
        }
        str = str3;
        int i3 = 0;
        c7546i.f23004f.addView(radioGroup);
        if (c2571d2.f8402d) {
            if (!z2) {
                i3 = 8;
            }
            view.setVisibility(i3);
            c7546i.f23004f.addView(view);
        }
        final C2570c[] c2570cArr2 = c2570cArr;
        final String str7 = str;
        c7546i.f23011m.setOnClickListener(new OnClickListener(c7546i) {
            final /* synthetic */ C7546i f11439e;

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
                this.f11439e.f23010l.mo2312a(c7197a.f20777c, str7, strArr, str);
            }
        });
    }

    protected final void mo3180a(C6829g c6829g) {
        ImageView imageView;
        int i;
        super.mo3180a(c6829g);
        final C7681i c7681i = (C7681i) c6829g;
        String str = c7681i.f23833Q;
        boolean z = (str == null || str.isEmpty()) ? false : true;
        try {
            final Bundle a = MyApplication.m12950a().m12956a(c7681i.f20777c);
            this.f23004f.removeAllViews();
            StringBuilder stringBuilder = new StringBuilder("viewModel.getMessageContentText() : ");
            stringBuilder.append(c7681i.f23832P);
            C2480b.m6742f(stringBuilder.toString());
            C2571d PollDataParser = PollUtils.PollDataParser(new JSONObject(c7681i.f23832P));
            PollType pollType = PollDataParser.f8401c;
            boolean z2 = PollDataParser.f8405g;
            switch (pollType) {
                case checkbox:
                    this.f23011m.setVisibility(8);
                    this.f23005g.setVisibility(0);
                    this.f23006h.setVisibility(0);
                    m20594a(c7681i, a, PollDataParser, z);
                    break;
                case radio:
                    if (!z2) {
                        this.f23011m.setVisibility(8);
                        this.f23005g.setVisibility(0);
                        this.f23006h.setVisibility(0);
                        m20598b(c7681i, a, PollDataParser, z);
                        break;
                    }
                    this.f23011m.setVisibility(0);
                    this.f23005g.setVisibility(8);
                    this.f23006h.setVisibility(8);
                    m20599c(c7681i, a, PollDataParser, z);
                    break;
                case commentbox:
                    String str2;
                    this.f23011m.setVisibility(8);
                    this.f23005g.setVisibility(0);
                    this.f23006h.setVisibility(0);
                    if (z) {
                        str2 = PollUtils.VoteParser(new JSONObject(c7681i.f23833Q)).f8414b;
                        if (str2 == null) {
                            str2 = "";
                        }
                        a.putString(C3407b.m7865a(c7681i.f20777c, 1), str2);
                    }
                    str2 = PollDataParser.f8399a;
                    if (PollDataParser.f8402d) {
                        View a2 = C3407b.m7864a(this.c, c7681i.f20777c, PollDataParser.f8403e, true);
                        a2.setMinWidth(this.f23008j);
                        a2.setEnabled(z ^ true);
                        a2.setTextColor(UIThemeManager.getmInstance().getOutput_content_and_caption_message_text_color());
                        a2.setText(a.getString(C3407b.m7865a(c7681i.f20777c, 1), ""));
                        a2.setOnFocusChangeListener(new OnFocusChangeListener(this) {
                            final /* synthetic */ C7546i f11441b;

                            public final void onFocusChange(View view, boolean z) {
                                if (z) {
                                    this.f11441b.f23010l.mo2346v();
                                }
                            }
                        });
                        this.f23004f.addView(a2);
                    }
                    this.f23005g.setOnClickListener(new OnClickListener(this) {
                        final /* synthetic */ C7546i f11445d;

                        public final void onClick(View view) {
                            this.f11445d.f23010l.mo3219b(c7681i.f20777c, str2, new String[0], a.getString(C3407b.m7865a(c7681i.f20777c, 1), ""));
                        }
                    });
                    this.f23006h.setOnClickListener(new OnClickListener(this) {
                        final /* synthetic */ C7546i f11448c;

                        public final void onClick(View view) {
                            this.f11448c.f23010l.mo3227k(str2);
                        }
                    });
                    break;
                default:
                    break;
            }
            this.f23003e.setText(PollDataParser.f8400b);
        } catch (Throwable e) {
            C2480b.m6737b("Error in parsing poll data.", e);
        }
        switch (c7681i.f21337w) {
            case ERROR:
                imageView = this.f23002d;
                i = R.drawable.ic_message_error;
                break;
            case SENDING:
                imageView = this.f23002d;
                i = R.drawable.ic_message_schedule_white;
                break;
            case PENDING:
            case PENDING_RETRANSMIT:
            case NOT_SEEN:
            case DELIVERED:
                imageView = this.f23002d;
                i = R.drawable.ic_message_tick_white;
                break;
            case SEEN:
                imageView = this.f23002d;
                i = R.drawable.ic_message_tick_double_seen;
                break;
            default:
                break;
        }
        imageView.setImageResource(i);
        m19051a((C7358a) c7681i, this.f23009k, true);
    }
}
