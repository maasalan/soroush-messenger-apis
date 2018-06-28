package mobi.mmdt.ott.view.conversation.bot;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TextInputLayout;
import android.support.v4.app.C0417s.C0416a;
import android.support.v4.p029a.C0350e;
import android.support.v7.app.C7406c;
import android.text.Editable;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.TextWatcher;
import android.view.Display;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.gms.location.places.C1832a;
import com.google.android.gms.location.places.p161a.C5508a;
import com.p072b.p073a.p074a.C1063i;
import java.util.regex.Pattern;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.lib_webservicescomponent.p257d.C2556b;
import mobi.mmdt.ott.logic.C2775a;
import mobi.mmdt.ott.logic.C2808d;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p261a.p284f.p285a.C2651r;
import mobi.mmdt.ott.logic.p261a.p284f.p285a.C5923q;
import mobi.mmdt.ott.logic.p261a.p284f.p286b.C6700i;
import mobi.mmdt.ott.logic.p261a.p284f.p286b.C6707p;
import mobi.mmdt.ott.logic.p261a.p298k.C6742g;
import mobi.mmdt.ott.logic.p261a.p298k.C6746k;
import mobi.mmdt.ott.logic.p261a.p298k.p299a.C2702n;
import mobi.mmdt.ott.logic.p261a.p298k.p299a.C2707u;
import mobi.mmdt.ott.logic.p261a.p298k.p299a.C5943k;
import mobi.mmdt.ott.logic.p261a.p298k.p299a.C5946t;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p384f.C2966b;
import mobi.mmdt.ott.provider.p384f.C2973m;
import mobi.mmdt.ott.provider.p385g.C2980g;
import mobi.mmdt.ott.provider.p385g.C6023j;
import mobi.mmdt.ott.provider.p390l.C3004f;
import mobi.mmdt.ott.view.components.C7695a;
import mobi.mmdt.ott.view.conversation.activities.p419a.p423b.C3337b;
import mobi.mmdt.ott.view.main.C4144a;
import mobi.mmdt.ott.view.tools.C4478a;
import mobi.mmdt.ott.view.tools.C4488b;
import mobi.mmdt.ott.view.tools.C4513i;
import mobi.mmdt.ott.view.tools.C4515k;
import mobi.mmdt.ott.view.tools.C4522p;
import mobi.mmdt.ott.view.tools.C4533r;
import mobi.mmdt.ott.view.tools.p479c.C4501c;

public class EditBotInfoActivity extends C7695a {
    private EditText f24646A;
    private TextInputLayout f24647B;
    private EditText f24648C;
    private CheckBox f24649D;
    private EditText f24650E;
    private View f24651F;
    private LinearLayout f24652G;
    private TextView f24653H;
    private String f24654I;
    private boolean f24655J = false;
    private MenuItem f24656K;
    private MenuItem f24657L;
    private MenuItem f24658M;
    private Button f24659N;
    private MenuItem f24660O;
    private Button f24661P;
    private C1063i f24662Q;
    private String f24663R;
    private C3004f f24664S = C3004f.NONE;
    private String f24665T;
    private String f24666U;
    private String f24667V;
    private String f24668W;
    private String f24669X;
    private ViewGroup f24670Y;
    private LinearLayout f24671Z;
    private ImageView aa;
    private FrameLayout ab;
    private View ac;
    private boolean ad;
    private String ae = "";
    private String af = "";
    private String ag = "";
    private EditText ah;
    private TextInputLayout ai;
    private C0416a<Cursor> aj = new C61291(this);
    private OnClickListener ak = new OnClickListener(this) {
        final /* synthetic */ EditBotInfoActivity f10461a;

        {
            this.f10461a = r1;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            EditBotInfoActivity.m21684H(this.f10461a);
        }
    };
    private OnClickListener al = new OnClickListener(this) {
        final /* synthetic */ EditBotInfoActivity f10469a;

        {
            this.f10469a = r1;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            EditBotInfoActivity.m21685I(this.f10469a);
        }
    };
    private OnClickListener am = new OnClickListener(this) {
        final /* synthetic */ EditBotInfoActivity f10470a;

        {
            this.f10470a = r1;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f10470a.setResult(0);
            super.onBackPressed();
        }
    };
    private OnClickListener an = new OnClickListener(this) {
        final /* synthetic */ EditBotInfoActivity f10471a;

        {
            this.f10471a = r1;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C4501c.m8189a().m8192a(EditBotInfoActivity.m21688L(this.f10471a), EditBotInfoActivity.m21687K(this.f10471a));
        }
    };
    private View ao;
    private double ap;
    private double aq;
    private TextInputLayout f24672z;

    class C34252 implements View.OnClickListener {
        final /* synthetic */ EditBotInfoActivity f10476a;

        C34252(EditBotInfoActivity editBotInfoActivity) {
            this.f10476a = editBotInfoActivity;
        }

        public final void onClick(View view) {
            C4478a.m8143a((Activity) this.f10476a, this.f10476a.f24654I);
        }
    }

    class C34293 implements Runnable {
        final /* synthetic */ EditBotInfoActivity f10481a;

        C34293(EditBotInfoActivity editBotInfoActivity) {
            this.f10481a = editBotInfoActivity;
        }

        public final void run() {
            Thread.currentThread().setPriority(1);
            final int h = C2966b.m7417h(this.f10481a.f24654I);
            this.f10481a.runOnUiThread(new Runnable(this) {
                final /* synthetic */ C34293 f10480b;

                class C34261 implements View.OnClickListener {
                    final /* synthetic */ C34281 f10477a;

                    C34261(C34281 c34281) {
                        this.f10477a = c34281;
                    }

                    public final void onClick(View view) {
                        C4478a.m8147a(EditBotInfoActivity.m21696T(this.f10477a.f10480b.f10481a), this.f10477a.f10480b.f10481a.f24654I, this.f10477a.f10480b.f10481a.f24667V, C2973m.BOT);
                    }
                }

                class C34272 implements View.OnClickListener {
                    final /* synthetic */ C34281 f10478a;

                    C34272(C34281 c34281) {
                        this.f10478a = c34281;
                    }

                    public final void onClick(View view) {
                        Snackbar.m8770a(this.f10478a.f10480b.f10481a.m, C4522p.m8236a(R.string.no_media_found), -1).m572a();
                    }
                }

                public final void run() {
                    TextView S;
                    CharSequence b;
                    View.OnClickListener c34261;
                    if (this.f10480b.f10481a.f24668W.equals("fa")) {
                        S = this.f10480b.f10481a.f24653H;
                        b = C2491i.m6814b(String.format(C4522p.m8236a(R.string.shared_media), new Object[]{Integer.valueOf(h)}));
                    } else {
                        S = this.f10480b.f10481a.f24653H;
                        b = String.format(C4522p.m8236a(R.string.shared_media), new Object[]{Integer.valueOf(h)});
                    }
                    S.setText(b);
                    if (h > 0) {
                        S = this.f10480b.f10481a.f24653H;
                        c34261 = new C34261(this);
                    } else {
                        S = this.f10480b.f10481a.f24653H;
                        c34261 = new C34272(this);
                    }
                    S.setOnClickListener(c34261);
                }
            });
        }
    }

    class C34304 implements TextWatcher {
        final /* synthetic */ EditBotInfoActivity f10482a;
        private String f10483b;

        C34304(EditBotInfoActivity editBotInfoActivity) {
            this.f10482a = editBotInfoActivity;
        }

        public final void afterTextChanged(Editable editable) {
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            this.f10483b = charSequence.toString();
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (!(this.f10483b == null || this.f10483b.equals(charSequence.toString()))) {
                this.f10482a.f24655J = true;
            }
            this.f10482a.ae = charSequence.toString();
            this.f10483b = charSequence.toString();
        }
    }

    class C34315 implements TextWatcher {
        final /* synthetic */ EditBotInfoActivity f10484a;
        private String f10485b;

        C34315(EditBotInfoActivity editBotInfoActivity) {
            this.f10484a = editBotInfoActivity;
        }

        public final void afterTextChanged(Editable editable) {
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            this.f10485b = charSequence.toString();
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            this.f10484a.af = charSequence.toString();
            if (!(this.f10485b == null || this.f10485b.equals(charSequence.toString()))) {
                this.f10484a.f24655J = true;
            }
            this.f10485b = charSequence.toString();
        }
    }

    class C34326 implements TextWatcher {
        final /* synthetic */ EditBotInfoActivity f10486a;
        private String f10487b;

        C34326(EditBotInfoActivity editBotInfoActivity) {
            this.f10486a = editBotInfoActivity;
        }

        public final void afterTextChanged(Editable editable) {
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            this.f10487b = charSequence.toString();
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            this.f10486a.ag = charSequence.toString();
            if (!(this.f10487b == null || this.f10487b.equals(charSequence.toString()))) {
                this.f10486a.f24655J = true;
            }
            this.f10487b = charSequence.toString();
        }
    }

    class C34369 implements Runnable {
        final /* synthetic */ EditBotInfoActivity f10493a;

        class C34351 implements Runnable {
            final /* synthetic */ C34369 f10492a;

            C34351(C34369 c34369) {
                this.f10492a = c34369;
            }

            public final void run() {
                this.f10492a.f10493a.finish();
                this.f10492a.f10493a.overridePendingTransition(R.anim.anim_slide_in_right, R.anim.anim_slide_out_right);
            }
        }

        C34369(EditBotInfoActivity editBotInfoActivity) {
            this.f10493a = editBotInfoActivity;
        }

        public final void run() {
            C4501c.m8189a().m8193b();
            new Handler().postDelayed(new C34351(this), 100);
        }
    }

    class C61291 implements C0416a<Cursor> {
        final /* synthetic */ EditBotInfoActivity f16540a;

        C61291(EditBotInfoActivity editBotInfoActivity) {
            this.f16540a = editBotInfoActivity;
        }

        public final C0350e<Cursor> mo2226a(int i, Bundle bundle) {
            return C2980g.m7443d(this.f16540a.f24654I);
        }

        public final void mo2227a() {
        }

        public final /* synthetic */ void mo2228a(C0350e c0350e, Object obj) {
            Cursor cursor = (Cursor) obj;
            if (cursor.moveToFirst()) {
                EditText w;
                CharSequence v;
                C6023j c6023j = new C6023j(cursor);
                String a = c6023j.m7352a("dialog_link");
                boolean e = c6023j.m13427e();
                int d = c6023j.m13426d();
                this.f16540a.m21053a(c6023j.m7352a("dialog_title"), false);
                this.f16540a.f24648C.setText(c6023j.m7352a("dialog_description"));
                if (a != null) {
                    if (this.f16540a.f24655J) {
                        this.f16540a.ah.setText(a);
                        this.f16540a.ai.setErrorEnabled(false);
                        this.f16540a.ai.setError("");
                    } else {
                        EditText d2 = this.f16540a.ah;
                        StringBuilder stringBuilder = new StringBuilder("@");
                        stringBuilder.append(a);
                        d2.setText(stringBuilder.toString());
                    }
                    this.f16540a.ah.setClickable(true);
                } else {
                    this.f16540a.ah.setText("");
                    this.f16540a.ah.setClickable(false);
                }
                this.f16540a.m21056c(C2491i.m6766a(EditBotInfoActivity.m21717f(this.f16540a), (float) d, C4522p.m8236a(R.string.follower), C4522p.m8236a(R.string.followers)));
                this.f16540a.f24669X = C2491i.m6769a(EditBotInfoActivity.m21719g(this.f16540a), a);
                this.f16540a.f24664S = c6023j.m13424b();
                if (this.f16540a.f24664S == C3004f.OWNER) {
                    this.f16540a.f24661P.setVisibility(0);
                    this.f16540a.n.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_red_channel_conversation, 0, 0, 0);
                    C2491i.m6828c(this.f16540a.n, UIThemeManager.getmInstance().getAccent_color());
                    this.f16540a.n.setCompoundDrawablePadding((int) C2491i.m6804b(this.f16540a.getApplicationContext(), 4.0f));
                    this.f16540a.f24659N.setVisibility(8);
                    if (this.f16540a.f24660O != null) {
                        this.f16540a.f24660O.setVisible(false);
                        this.f16540a.f24658M.setVisible(true);
                    }
                } else if (this.f16540a.f24664S == C3004f.ADMIN) {
                    this.f16540a.f24661P.setVisibility(0);
                    this.f16540a.f24659N.setVisibility(0);
                    this.f16540a.n.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_red_channel_conversation, 0, 0, 0);
                    C2491i.m6828c(this.f16540a.n, UIThemeManager.getmInstance().getAccent_color());
                    this.f16540a.n.setCompoundDrawablePadding((int) C2491i.m6804b(this.f16540a.getApplicationContext(), 4.0f));
                    if (this.f16540a.f24660O != null) {
                        this.f16540a.f24660O.setVisible(true);
                        this.f16540a.f24658M.setVisible(false);
                    }
                } else {
                    this.f16540a.f24659N.setVisibility(8);
                    this.f16540a.f24661P.setVisibility(8);
                    this.f16540a.n.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                    this.f16540a.n.setCompoundDrawablePadding(0);
                }
                this.f16540a.ad = e;
                if (this.f16540a.f24655J) {
                    this.f16540a.f24649D.setChecked(e);
                } else {
                    this.f16540a.f24649D.setChecked(e);
                    this.f16540a.f24655J = false;
                }
                if (!this.f16540a.ae.isEmpty() || this.f16540a.f24655J) {
                    w = this.f16540a.f24646A;
                    v = this.f16540a.ae;
                } else {
                    w = this.f16540a.f24646A;
                    v = c6023j.m7352a("dialog_title");
                }
                w.setText(v);
                this.f16540a.f24667V = c6023j.m7352a("dialog_title");
                if (!this.f16540a.f24655J) {
                    if (c6023j.m7352a("dialog_description") == null || c6023j.m7352a("dialog_description").isEmpty()) {
                        this.f16540a.f24647B.setVisibility(8);
                        a = c6023j.m7352a("dialog_avatar_thumbnail_url");
                        this.f16540a.f24665T = c6023j.m7352a("dialog_avatar_url");
                        this.f16540a.f24666U = a;
                        if (this.f16540a.s == null || this.f16540a.s.isEmpty()) {
                            if (!this.f16540a.u) {
                                this.f16540a.f24665T = null;
                                this.f16540a.f24666U = null;
                                this.f16540a.m21069o();
                                this.f16540a.m21070p();
                            } else if (a != null || a.isEmpty()) {
                                this.f16540a.f24665T = null;
                                this.f16540a.f24666U = null;
                                this.f16540a.m21069o();
                                this.f16540a.m21070p();
                            } else {
                                this.f16540a.s = "";
                                this.f16540a.m21052a(C4515k.m8231a(C2556b.m6998a(a)));
                                this.f16540a.m21055b(C4515k.m8231a(C2556b.m6998a(a)));
                            }
                        }
                        EditBotInfoActivity.m21683G(this.f16540a);
                    }
                }
                this.f16540a.f24647B.setVisibility(0);
                if (!this.f16540a.af.isEmpty() || this.f16540a.f24655J) {
                    w = this.f16540a.f24648C;
                    v = this.f16540a.af;
                } else {
                    w = this.f16540a.f24648C;
                    v = c6023j.m7352a("dialog_description");
                }
                w.setText(v);
                a = c6023j.m7352a("dialog_avatar_thumbnail_url");
                this.f16540a.f24665T = c6023j.m7352a("dialog_avatar_url");
                this.f16540a.f24666U = a;
                if (!this.f16540a.u) {
                    this.f16540a.f24665T = null;
                    this.f16540a.f24666U = null;
                    this.f16540a.m21069o();
                    this.f16540a.m21070p();
                } else {
                    if (a != null) {
                    }
                    this.f16540a.f24665T = null;
                    this.f16540a.f24666U = null;
                    this.f16540a.m21069o();
                    this.f16540a.m21070p();
                }
                EditBotInfoActivity.m21683G(this.f16540a);
            }
        }
    }

    static /* synthetic */ void m21683G(EditBotInfoActivity editBotInfoActivity) {
        editBotInfoActivity.f24646A.addTextChangedListener(new C34304(editBotInfoActivity));
        editBotInfoActivity.f24648C.addTextChangedListener(new C34315(editBotInfoActivity));
        editBotInfoActivity.ah.addTextChangedListener(new C34326(editBotInfoActivity));
    }

    static /* synthetic */ void m21684H(EditBotInfoActivity editBotInfoActivity) {
        String obj = editBotInfoActivity.f24648C.getText().toString();
        String obj2 = editBotInfoActivity.f24646A.getText().toString();
        if (obj2.trim().isEmpty()) {
            editBotInfoActivity.f24672z.setErrorEnabled(true);
            editBotInfoActivity.f24672z.setError(C4522p.m8236a(R.string.channel_name_can_t_be_empty_));
            C4144a.m8004a(editBotInfoActivity.f24672z);
            return;
        }
        editBotInfoActivity.f24672z.setErrorEnabled(false);
        editBotInfoActivity.f24672z.setError("");
        Object obj3 = editBotInfoActivity.ah.getText().toString();
        if (obj3.trim().isEmpty()) {
            editBotInfoActivity.m21714d(C4522p.m8236a(R.string.channel_id_can_t_be_empty_));
        } else if (obj3.trim().length() < 6) {
            editBotInfoActivity.m21714d(C4522p.m8236a(R.string.at_least_count_channel_id_error_message));
        } else if (obj3.trim().length() > 64) {
            editBotInfoActivity.m21714d(C4522p.m8236a(R.string.max_count_channel_id_error_message));
        } else {
            if (!obj3.trim().isEmpty()) {
                if (Pattern.compile("^[a-z0-9_.]+$").matcher(obj3).find()) {
                    editBotInfoActivity.f24672z.setErrorEnabled(false);
                    editBotInfoActivity.ai.setError("");
                    final C1063i c6742g = new C6742g(editBotInfoActivity.f24654I, obj2, obj, editBotInfoActivity.t, editBotInfoActivity.s, editBotInfoActivity.ad, obj3);
                    editBotInfoActivity.f24662Q = c6742g;
                    C2808d.m7148b(c6742g);
                    editBotInfoActivity.runOnUiThread(new Runnable(editBotInfoActivity) {
                        final /* synthetic */ EditBotInfoActivity f10491b;

                        public final void run() {
                            C4501c.m8189a().m8192a(EditBotInfoActivity.m21700X(this.f10491b), c6742g);
                        }
                    });
                } else {
                    editBotInfoActivity.m21714d(C4522p.m8236a(R.string.sorry_this_channel_id_is_invalid));
                }
            }
        }
    }

    static /* synthetic */ void m21685I(EditBotInfoActivity editBotInfoActivity) {
        final C1063i c6746k = new C6746k(editBotInfoActivity.f24654I);
        C2808d.m7148b(c6746k);
        editBotInfoActivity.runOnUiThread(new Runnable(editBotInfoActivity) {
            final /* synthetic */ EditBotInfoActivity f10489b;

            public final void run() {
                C4501c.m8189a().m8192a(EditBotInfoActivity.m21699W(this.f10489b), c6746k);
            }
        });
    }

    static /* synthetic */ C5891a m21687K(EditBotInfoActivity editBotInfoActivity) {
        C1063i c6707p = new C6707p(editBotInfoActivity.f24654I);
        C2808d.m7147a(c6707p);
        return c6707p;
    }

    static /* synthetic */ C7406c m21688L(EditBotInfoActivity editBotInfoActivity) {
        return editBotInfoActivity;
    }

    static /* synthetic */ void m21689M(EditBotInfoActivity editBotInfoActivity) {
        if (editBotInfoActivity.f24657L == null || !editBotInfoActivity.f24657L.isVisible()) {
            C4478a.m8140a((Activity) editBotInfoActivity, editBotInfoActivity.ap, editBotInfoActivity.aq, true);
            return;
        }
        C3337b.m7811b((Activity) editBotInfoActivity);
    }

    static /* synthetic */ C7406c m21690N(EditBotInfoActivity editBotInfoActivity) {
        return editBotInfoActivity;
    }

    static /* synthetic */ C7406c m21692P(EditBotInfoActivity editBotInfoActivity) {
        return editBotInfoActivity;
    }

    static /* synthetic */ C7406c m21696T(EditBotInfoActivity editBotInfoActivity) {
        return editBotInfoActivity;
    }

    static /* synthetic */ C7406c m21699W(EditBotInfoActivity editBotInfoActivity) {
        return editBotInfoActivity;
    }

    static /* synthetic */ C7406c m21700X(EditBotInfoActivity editBotInfoActivity) {
        return editBotInfoActivity;
    }

    static /* synthetic */ C7406c m21701Y(EditBotInfoActivity editBotInfoActivity) {
        return editBotInfoActivity;
    }

    static /* synthetic */ C7406c m21702Z(EditBotInfoActivity editBotInfoActivity) {
        return editBotInfoActivity;
    }

    static /* synthetic */ C7406c aa(EditBotInfoActivity editBotInfoActivity) {
        return editBotInfoActivity;
    }

    private void m21714d(String str) {
        this.ai.setErrorEnabled(true);
        this.ai.setError(str);
        C4144a.m8005a(this.ai);
    }

    static /* synthetic */ C7406c m21717f(EditBotInfoActivity editBotInfoActivity) {
        return editBotInfoActivity;
    }

    static /* synthetic */ C7406c m21719g(EditBotInfoActivity editBotInfoActivity) {
        return editBotInfoActivity;
    }

    private void onLeaveAndDeleteChannelPressed() {
        Bundle bundle = new Bundle();
        bundle.putInt("dialog_id", 10);
        b_(bundle);
    }

    private void m21745y() {
        C2491i.m6780a(UIThemeManager.getmInstance().getText_primary_color(), UIThemeManager.getmInstance().getAccent_color(), this.f24646A, this.ah, this.f24648C);
    }

    public final Dialog mo2299a(Bundle bundle) {
        int i = bundle.getInt("dialog_id");
        if (i == 10) {
            return C4488b.m8181a(this, C4522p.m8236a(R.string.are_you_sure_to_leave_and_delete_this_channel), C4522p.m8236a(R.string.action_leave_and_delete_channel), this.an, C4522p.m8236a(R.string.cancel), null);
        }
        if (i == 56) {
            return C4488b.m8181a(this, C4522p.m8236a(R.string.are_you_sure_to_delete_the_channel), C4522p.m8236a(R.string.delete), this.al, C4522p.m8236a(R.string.cancel), null);
        }
        switch (i) {
            case 50:
            case 51:
                return C4488b.m8182a(this, C4522p.m8236a(R.string.save_changes), C4522p.m8236a(R.string.are_you_sure_to_save), C4522p.m8236a(R.string.save), this.ak, C4522p.m8236a(R.string.cancel), this.am);
            default:
                return super.mo2299a(bundle);
        }
    }

    protected final int mo3643g() {
        return R.drawable.ic_place_holder_channel;
    }

    protected final String mo3695h() {
        return this.f24654I;
    }

    protected final C2973m mo3696i() {
        return C2973m.CHANNEL;
    }

    protected final void mo3697j() {
        if (this.f24657L != null) {
            this.f24657L.setVisible(true);
        }
    }

    protected final void mo3698k() {
        this.v = 0.75d;
        this.w = 0.5d;
    }

    protected final void mo3699l() {
        if (this.f24665T != null && this.f24666U != null) {
            C4478a.m8164c(this, this.f24665T, this.f24666U, this.f24667V);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 100) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            C1832a a = C5508a.m12042a(intent, MyApplication.m12952b());
            this.ap = a.mo3044a().f18734a;
            this.aq = a.mo3044a().f18735b;
            if (!(this.aq == 0.0d || this.ap == 0.0d)) {
                Toast.makeText(this, "****** SUCCESSFUL", 0).show();
            }
        }
    }

    public void onBackPressed() {
        if (!this.f24655J) {
            if (!this.t) {
                setResult(0);
                super.onBackPressed();
                return;
            }
        }
        Bundle bundle = new Bundle();
        bundle.putInt("dialog_id", 51);
        b_(bundle);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m21057e((int) R.layout.fragment_edit_bot_info);
        this.f24654I = getIntent().getExtras().getString("KEY_CHANNEL_ID");
        this.f24663R = C2535a.m6888a().m6928d();
        this.f24668W = C2535a.m6888a().m6919b();
        C2808d.m7148b(new C6700i(this.f24654I));
        this.f24670Y = (ViewGroup) findViewById(R.id.root_layout);
        this.ao = findViewById(R.id.touch_view_channel_id);
        this.f24671Z = (LinearLayout) findViewById(R.id.details_layout);
        this.f24653H = (TextView) findViewById(R.id.sharedMedia_textView);
        this.aa = (ImageView) findViewById(R.id.share_image_view);
        this.ab = (FrameLayout) findViewById(R.id.top_frameLayout);
        this.ac = findViewById(R.id.spacer_view);
        this.f24661P = (Button) findViewById(R.id.add_participants_button);
        this.f24659N = (Button) findViewById(R.id.leave_and_delete_button);
        this.f24659N.setText(C4522p.m8236a(R.string.action_leave_and_delete_channel));
        this.f24661P.setText(C4522p.m8236a(R.string.title_manage_followers_activity));
        this.f24672z = (TextInputLayout) findViewById(R.id.channelName_textInputLayout);
        this.f24646A = (EditText) findViewById(R.id.channelName_editText);
        this.f24647B = (TextInputLayout) findViewById(R.id.channelDescriptions_textInputLayout);
        this.f24648C = (EditText) findViewById(R.id.channelDescriptions_editText);
        this.ai = (TextInputLayout) findViewById(R.id.channelID_textInputLayout);
        this.ah = (EditText) findViewById(R.id.channelID_editText);
        this.ah.setEnabled(false);
        this.ao.setOnClickListener(new View.OnClickListener(this) {
            final /* synthetic */ EditBotInfoActivity f10473a;

            {
                this.f10473a = r1;
            }

            public final void onClick(View view) {
                C4533r.m8256a(EditBotInfoActivity.m21690N(this.f10473a), this.f10473a.f24669X);
            }
        });
        this.ao.setOnLongClickListener(new OnLongClickListener(this) {
            final /* synthetic */ EditBotInfoActivity f10474a;

            {
                this.f10474a = r1;
            }

            public final boolean onLongClick(View view) {
                C4533r.m8256a(EditBotInfoActivity.m21692P(this.f10474a), this.f10474a.f24669X);
                return false;
            }
        });
        this.f24650E = (EditText) findViewById(R.id.junk_editText);
        this.f24651F = findViewById(R.id.spacer_view);
        this.f24652G = (LinearLayout) findViewById(R.id.details_layout);
        this.f24649D = (CheckBox) findViewById(R.id.allowReply_checkBox);
        this.f24649D.setText(C4522p.m8236a(R.string.allow_reply_channel));
        boolean z = true;
        this.f24646A.setFilters(new InputFilter[]{new LengthFilter(128)});
        this.f24646A.setMaxLines(1);
        this.f24646A.setSingleLine(true);
        this.f24648C.setFilters(new InputFilter[]{new LengthFilter(256)});
        this.f24649D.setOnCheckedChangeListener(new OnCheckedChangeListener(this) {
            final /* synthetic */ EditBotInfoActivity f10475a;

            {
                this.f10475a = r1;
            }

            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.f10475a.ad = z;
                this.f10475a.f24655J = true;
            }
        });
        Display defaultDisplay = getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        LayoutParams layoutParams = this.f24670Y.getLayoutParams();
        if (!getResources().getBoolean(R.bool.xlarge)) {
            layoutParams.height = (int) (((float) (point.y - (C2491i.m6759a(getApplicationContext()) + C2491i.m6805b(getApplicationContext())))) + C2491i.m6804b(getApplicationContext(), 8.0f));
            if (getResources().getConfiguration().orientation == 2) {
                layoutParams.width = (int) (((double) point.x) * 0.75d);
            }
        }
        this.f24646A.setText("");
        this.f24648C.setText("");
        this.f24650E.requestFocus();
        this.f24672z.setVisibility(8);
        this.f24647B.setVisibility(8);
        this.f24661P.setOnClickListener(new C34252(this));
        new Thread(new C34293(this)).start();
        C2491i.m6796a(this.f24670Y, UIThemeManager.getmInstance().getRecycler_view_background_color());
        C2491i.m6796a(this.f24671Z, UIThemeManager.getmInstance().getRecycler_view_background_color());
        C2491i.m6796a(this.ab, UIThemeManager.getmInstance().getRecycler_view_background_color());
        C2491i.m6819b(this.f24659N, UIThemeManager.getmInstance().getAccent_color());
        C2491i.m6798a(this.f24659N, UIThemeManager.getmInstance().getButton_text_color());
        C2491i.m6819b(this.f24661P, UIThemeManager.getmInstance().getAccent_color());
        C2491i.m6798a(this.f24661P, UIThemeManager.getmInstance().getButton_text_color());
        C2491i.m6796a(this.ac, UIThemeManager.getmInstance().getSpacer_view_color());
        C2491i.m6802a(this.f24653H, UIThemeManager.getmInstance().getText_secondary_color());
        new View[1][0] = this.f24653H;
        C2491i.m6801a(this.aa, UIThemeManager.getmInstance().getText_secondary_color());
        this.f24649D.setTextColor(UIThemeManager.getmInstance().getText_primary_color());
        C2491i.m6799a(this.f24649D, UIThemeManager.getmInstance().getAccent_color());
        C2491i.m6781a(UIThemeManager.getmInstance().getAccent_color(), this.f24647B, this.ai, this.f24672z);
        m21745y();
        if (getIntent() != null) {
            Bundle extras = getIntent().getExtras();
            if (extras != null) {
                if (extras.containsKey("KEY_CHANNEL_LATITUDE_LOCATION")) {
                    this.ap = extras.getDouble("KEY_CHANNEL_LATITUDE_LOCATION");
                }
                if (extras.containsKey("KEY_CHANNEL_LONGITUDE_LOCATION")) {
                    this.aq = extras.getDouble("KEY_CHANNEL_LONGITUDE_LOCATION");
                }
                if (!(this.ap == 0.0d || this.aq == 0.0d)) {
                    m21060g(0);
                    m21068n();
                }
            }
            m21060g(8);
        }
        m21054b(new View.OnClickListener(this) {
            final /* synthetic */ EditBotInfoActivity f10472a;

            {
                this.f10472a = r1;
            }

            public final void onClick(View view) {
                EditBotInfoActivity.m21689M(this.f10472a);
            }
        });
        m21062h(C2491i.m6806b(getApplicationContext(), this.f24654I));
        m21069o();
        m21070p();
        if (bundle != null) {
            if (bundle.containsKey("KEY_CHANNEL_NAME")) {
                String string = bundle.getString("KEY_CHANNEL_NAME");
                this.f24646A.setText(string);
                m21053a(string, false);
                this.ae = string;
            }
            if (bundle.containsKey("KEY_CHANNEL_DESCRIPTIONS")) {
                Object string2 = bundle.getString("KEY_CHANNEL_DESCRIPTIONS");
                this.f24648C.setText(string2);
                this.af = string2;
            }
            if (bundle.containsKey("KEY_IS_REPLY_ALLOWED")) {
                boolean z2 = bundle.getBoolean("KEY_IS_REPLY_ALLOWED");
                this.f24649D.setChecked(z2);
                this.ad = z2;
            }
            if (bundle.containsKey("KEY_CHANNEL_LINK")) {
                this.f24669X = bundle.getString("KEY_CHANNEL_LINK");
            }
            if (bundle.containsKey("KEY_CHANNEL_LATITUDE_LOCATION")) {
                this.ap = bundle.getDouble("KEY_CHANNEL_LATITUDE_LOCATION");
            }
            if (bundle.containsKey("KEY_CHANNEL_LONGITUDE_LOCATION")) {
                this.aq = bundle.getDouble("KEY_CHANNEL_LONGITUDE_LOCATION");
            }
            if (!bundle.containsKey("KEY_IS_CHANGE_OCCURRED") || !bundle.getBoolean("KEY_IS_CHANGE_OCCURRED")) {
                z = false;
            }
            this.f24655J = z;
        }
        if (this.s != null) {
            m21052a(this.s);
            m21055b(this.s);
        }
        m19190e().mo268a(36, null, this.aj);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_edit_channel_info, menu);
        this.f24656K = menu.findItem(R.id.action_edit);
        this.f24657L = menu.findItem(R.id.action_done);
        this.f24658M = menu.findItem(R.id.action_delete);
        this.f24660O = menu.findItem(R.id.action_leave_and_delete);
        this.f24656K.setTitle(C4522p.m8236a(R.string.action_edit));
        this.f24657L.setTitle(C4522p.m8236a(R.string.action_done));
        this.f24658M.setTitle(C4522p.m8236a(R.string.action_delete));
        this.f24660O.setTitle(C4522p.m8236a(R.string.action_leave_and_delete_channel));
        if (this.f24664S == null || this.f24664S != C3004f.OWNER) {
            this.f24658M.setVisible(false);
            this.f24660O.setVisible(true);
        } else {
            this.f24658M.setVisible(true);
            this.f24660O.setVisible(false);
        }
        if (!this.f24655J) {
            if (!this.t) {
                this.f24657L.setVisible(false);
                if (this.f24655J) {
                    this.f24656K.setVisible(false);
                }
                if (this.f24655J) {
                    this.f24672z.setVisibility(8);
                } else {
                    this.f24672z.setVisibility(0);
                }
                this.f24646A.setEnabled(this.f24655J);
                this.f24648C.setEnabled(this.f24655J);
                this.ah.setEnabled(this.f24655J);
                if (this.f24655J) {
                    this.ao.setVisibility(8);
                    m21060g(0);
                }
                m21745y();
                return true;
            }
        }
        this.f24657L.setVisible(true);
        if (this.f24655J) {
            this.f24656K.setVisible(false);
        }
        if (this.f24655J) {
            this.f24672z.setVisibility(8);
        } else {
            this.f24672z.setVisibility(0);
        }
        this.f24646A.setEnabled(this.f24655J);
        this.f24648C.setEnabled(this.f24655J);
        this.ah.setEnabled(this.f24655J);
        if (this.f24655J) {
            this.ao.setVisibility(8);
            m21060g(0);
        }
        m21745y();
        return true;
    }

    protected void onDestroy() {
        super.onDestroy();
        m19190e().mo269a(16);
    }

    public void onEvent(final C5923q c5923q) {
        runOnUiThread(new Runnable(this) {
            final /* synthetic */ EditBotInfoActivity f10468b;

            class C34241 implements Runnable {
                final /* synthetic */ AnonymousClass15 f10466a;

                C34241(AnonymousClass15 anonymousClass15) {
                    this.f10466a = anonymousClass15;
                }

                public final void run() {
                    C4513i.m8228a(EditBotInfoActivity.aa(this.f10466a.f10468b), c5923q.f8890a);
                }
            }

            public final void run() {
                C4501c.m8189a().m8193b();
                new Handler().postDelayed(new C34241(this), 100);
            }
        });
    }

    public void onEvent(C2651r c2651r) {
        runOnUiThread(new Runnable(this) {
            final /* synthetic */ EditBotInfoActivity f10465a;

            class C34231 implements Runnable {
                final /* synthetic */ AnonymousClass14 f10464a;

                C34231(AnonymousClass14 anonymousClass14) {
                    this.f10464a = anonymousClass14;
                }

                public final void run() {
                    this.f10464a.f10465a.setResult(1479);
                    this.f10464a.f10465a.finish();
                    this.f10464a.f10465a.overridePendingTransition(R.anim.anim_slide_in_right, R.anim.anim_slide_out_right);
                }
            }

            {
                this.f10465a = r1;
            }

            public final void run() {
                C4501c.m8189a().m8193b();
                new Handler().postDelayed(new C34231(this), 100);
            }
        });
    }

    public void onEvent(final C5943k c5943k) {
        runOnUiThread(new Runnable(this) {
            final /* synthetic */ EditBotInfoActivity f10458b;

            public final void run() {
                C4501c.m8189a().m8193b();
                if (c5943k.f8890a.equals(C2775a.CHANNEL_ID_ALREADY_EXIST_EXCEPTION)) {
                    this.f10458b.m21714d(C4522p.m8236a(R.string.already_exist_error_message));
                } else if (c5943k.f8890a.equals(C2775a.INVALID_CHANNEL_ID)) {
                    this.f10458b.m21714d(C4522p.m8236a(R.string.sorry_this_channel_id_is_invalid));
                } else {
                    C4513i.m8228a(EditBotInfoActivity.m21701Y(this.f10458b), c5943k.f8890a);
                }
            }
        });
    }

    public void onEvent(C2702n c2702n) {
        runOnUiThread(new C34369(this));
    }

    public void onEvent(final C5946t c5946t) {
        runOnUiThread(new Runnable(this) {
            final /* synthetic */ EditBotInfoActivity f10463b;

            public final void run() {
                C4501c.m8189a().m8193b();
                C4513i.m8228a(EditBotInfoActivity.m21702Z(this.f10463b), c5946t.f8890a);
            }
        });
    }

    public void onEvent(C2707u c2707u) {
        runOnUiThread(new Runnable(this) {
            final /* synthetic */ EditBotInfoActivity f10460a;

            class C34221 implements Runnable {
                final /* synthetic */ AnonymousClass11 f10459a;

                C34221(AnonymousClass11 anonymousClass11) {
                    this.f10459a = anonymousClass11;
                }

                public final void run() {
                    this.f10459a.f10460a.finish();
                    this.f10459a.f10460a.overridePendingTransition(R.anim.anim_slide_in_right, R.anim.anim_slide_out_right);
                }
            }

            {
                this.f10460a = r1;
            }

            public final void run() {
                C4501c.m8189a().m8193b();
                new Handler().postDelayed(new C34221(this), 100);
            }
        });
    }

    public void onLeaveAndDeleteChannelPressed(View view) {
        onLeaveAndDeleteChannelPressed();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Bundle bundle;
        String str;
        int i;
        int itemId = menuItem.getItemId();
        if (itemId == R.id.action_done) {
            if (!this.f24655J) {
                if (!this.t) {
                    super.onBackPressed();
                    return super.onOptionsItemSelected(menuItem);
                }
            }
            bundle = new Bundle();
            str = "dialog_id";
            i = 50;
        } else {
            if (itemId == R.id.action_edit) {
                if (this.f24649D != null) {
                    this.f24649D.setEnabled(true);
                    C2491i.m6799a(this.f24649D, UIThemeManager.getmInstance().getAccent_color());
                }
                this.f24656K.setVisible(false);
                this.f24657L.setVisible(true);
                this.f24646A.setEnabled(true);
                this.f24648C.setEnabled(true);
                this.ah.setEnabled(true);
                this.ao.setVisibility(8);
                this.f24647B.setVisibility(0);
                this.f24672z.setVisibility(0);
                m21060g(0);
                Editable text = this.ah.getText();
                if (!(text == null || text.toString().isEmpty())) {
                    this.ah.setText(text.toString().replace("@", ""));
                }
                this.f24646A.requestFocus();
                m21745y();
            } else if (itemId == R.id.action_delete) {
                bundle = new Bundle();
                str = "dialog_id";
                i = 56;
            } else if (itemId == R.id.action_leave_and_delete) {
                onLeaveAndDeleteChannelPressed();
            }
            return super.onOptionsItemSelected(menuItem);
        }
        bundle.putInt(str, i);
        b_(bundle);
        return super.onOptionsItemSelected(menuItem);
    }

    protected void onResume() {
        super.onResume();
        C2808d.m7148b(new C6700i(this.f24654I));
    }

    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        String obj = this.f24646A.getText().toString();
        if (!obj.isEmpty()) {
            bundle.putString("KEY_CHANNEL_NAME", obj);
        }
        obj = this.f24648C.getText().toString();
        if (!obj.isEmpty()) {
            bundle.putString("KEY_CHANNEL_DESCRIPTIONS", obj);
        }
        obj = this.f24669X;
        if (!obj.isEmpty()) {
            bundle.putString("KEY_CHANNEL_LINK", obj);
        }
        if (this.ap != 0.0d) {
            bundle.putDouble("KEY_CHANNEL_LATITUDE_LOCATION", this.ap);
        }
        if (this.aq != 0.0d) {
            bundle.putDouble("KEY_CHANNEL_LONGITUDE_LOCATION", this.aq);
        }
        bundle.putBoolean("KEY_IS_CHANGE_OCCURRED", this.f24655J);
        bundle.putBoolean("KEY_IS_REPLY_ALLOWED", this.ad);
    }
}
