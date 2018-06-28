package mobi.mmdt.ott.view.conversation.editchannelinfo;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.TextInputLayout;
import android.support.v4.app.C0417s.C0416a;
import android.support.v4.p029a.C0350e;
import android.support.v7.app.C6389b;
import android.support.v7.app.C6389b.C0663a;
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
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.lib_webservicescomponent.p257d.C2556b;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.base.ChannelLocation;
import mobi.mmdt.ott.logic.C2808d;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p261a.p284f.p285a.C2651r;
import mobi.mmdt.ott.logic.p261a.p284f.p285a.C5923q;
import mobi.mmdt.ott.logic.p261a.p284f.p286b.C6700i;
import mobi.mmdt.ott.logic.p261a.p284f.p286b.C6707p;
import mobi.mmdt.ott.logic.p261a.p298k.C6742g;
import mobi.mmdt.ott.logic.p261a.p298k.C6743h;
import mobi.mmdt.ott.logic.p261a.p298k.C6746k;
import mobi.mmdt.ott.logic.p261a.p298k.p299a.C2701m;
import mobi.mmdt.ott.logic.p261a.p298k.p299a.C2702n;
import mobi.mmdt.ott.logic.p261a.p298k.p299a.C2707u;
import mobi.mmdt.ott.logic.p261a.p298k.p299a.C5943k;
import mobi.mmdt.ott.logic.p261a.p298k.p299a.C5944l;
import mobi.mmdt.ott.logic.p261a.p298k.p299a.C5946t;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p384f.C2966b;
import mobi.mmdt.ott.provider.p384f.C2973m;
import mobi.mmdt.ott.provider.p385g.C2974a;
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
import org.json.JSONArray;
import org.json.JSONException;

public class EditChannelInfoActivity extends C7695a {
    private EditText f24676A;
    private TextInputLayout f24677B;
    private EditText f24678C;
    private CheckBox f24679D;
    private TextView f24680E;
    private String f24681F;
    private boolean f24682G = false;
    private MenuItem f24683H;
    private MenuItem f24684I;
    private MenuItem f24685J;
    private Button f24686K;
    private MenuItem f24687L;
    private Button f24688M;
    private C3004f f24689N = C3004f.NONE;
    private String f24690O;
    private String f24691P;
    private String f24692Q;
    private String f24693R;
    private String f24694S;
    private ViewGroup f24695T;
    private LinearLayout f24696U;
    private ImageView f24697V;
    private FrameLayout f24698W;
    private View f24699X;
    private boolean f24700Y;
    private String f24701Z = "";
    private String aa = "";
    private String ab = "";
    private EditText ac;
    private TextInputLayout ad;
    private double ae = 0.0d;
    private double af = 0.0d;
    private ChannelLocation[] ag;
    private String ah;
    private C0416a<Cursor> ai = new C62021(this);
    private OnClickListener aj = new OnClickListener(this) {
        final /* synthetic */ EditChannelInfoActivity f11499a;

        {
            this.f11499a = r1;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            EditChannelInfoActivity.m21769H(this.f11499a);
        }
    };
    private OnClickListener ak = new OnClickListener(this) {
        final /* synthetic */ EditChannelInfoActivity f11516a;

        {
            this.f11516a = r1;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            EditChannelInfoActivity.m21770I(this.f11516a);
        }
    };
    private OnClickListener al = new OnClickListener(this) {
        final /* synthetic */ EditChannelInfoActivity f11517a;

        {
            this.f11517a = r1;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f11517a.setResult(0);
            super.onBackPressed();
        }
    };
    private OnClickListener am = new OnClickListener(this) {
        final /* synthetic */ EditChannelInfoActivity f11518a;

        {
            this.f11518a = r1;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C4501c.m8189a().m8192a(EditChannelInfoActivity.m21773L(this.f11518a), EditChannelInfoActivity.m21772K(this.f11518a));
        }
    };
    private View an;
    private OnClickListener ao = new OnClickListener(this) {
        final /* synthetic */ EditChannelInfoActivity f11514a;

        {
            this.f11514a = r1;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    };
    private TextInputLayout f24702z;

    class C39982 implements View.OnClickListener {
        final /* synthetic */ EditChannelInfoActivity f11523a;

        C39982(EditChannelInfoActivity editChannelInfoActivity) {
            this.f11523a = editChannelInfoActivity;
        }

        public final void onClick(View view) {
            C4478a.m8143a((Activity) this.f11523a, this.f11523a.f24681F);
        }
    }

    class C40023 implements Runnable {
        final /* synthetic */ EditChannelInfoActivity f11528a;

        C40023(EditChannelInfoActivity editChannelInfoActivity) {
            this.f11528a = editChannelInfoActivity;
        }

        public final void run() {
            Thread.currentThread().setPriority(1);
            final int h = C2966b.m7417h(this.f11528a.f24681F);
            this.f11528a.runOnUiThread(new Runnable(this) {
                final /* synthetic */ C40023 f11527b;

                class C39991 implements View.OnClickListener {
                    final /* synthetic */ C40011 f11524a;

                    C39991(C40011 c40011) {
                        this.f11524a = c40011;
                    }

                    public final void onClick(View view) {
                        C4478a.m8147a(EditChannelInfoActivity.m21781T(this.f11524a.f11527b.f11528a), this.f11524a.f11527b.f11528a.f24681F, this.f11524a.f11527b.f11528a.f24692Q, C2973m.CHANNEL);
                    }
                }

                class C40002 implements View.OnClickListener {
                    final /* synthetic */ C40011 f11525a;

                    C40002(C40011 c40011) {
                        this.f11525a = c40011;
                    }

                    public final void onClick(View view) {
                        Toast.makeText(this.f11525a.f11527b.f11528a, C4522p.m8236a(R.string.no_media_found), 0).show();
                    }
                }

                public final void run() {
                    TextView S;
                    CharSequence b;
                    View.OnClickListener c39991;
                    if (this.f11527b.f11528a.f24693R.equals("fa")) {
                        S = this.f11527b.f11528a.f24680E;
                        b = C2491i.m6814b(String.format(C4522p.m8236a(R.string.shared_media), new Object[]{Integer.valueOf(h)}));
                    } else {
                        S = this.f11527b.f11528a.f24680E;
                        b = String.format(C4522p.m8236a(R.string.shared_media), new Object[]{Integer.valueOf(h)});
                    }
                    S.setText(b);
                    if (h > 0) {
                        S = this.f11527b.f11528a.f24680E;
                        c39991 = new C39991(this);
                    } else {
                        S = this.f11527b.f11528a.f24680E;
                        c39991 = new C40002(this);
                    }
                    S.setOnClickListener(c39991);
                }
            });
        }
    }

    class C40034 implements TextWatcher {
        final /* synthetic */ EditChannelInfoActivity f11529a;
        private String f11530b;

        C40034(EditChannelInfoActivity editChannelInfoActivity) {
            this.f11529a = editChannelInfoActivity;
        }

        public final void afterTextChanged(Editable editable) {
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            this.f11530b = charSequence.toString();
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (!(this.f11530b == null || this.f11530b.equals(charSequence.toString()))) {
                this.f11529a.f24682G = true;
            }
            this.f11529a.f24701Z = charSequence.toString();
            this.f11530b = charSequence.toString();
        }
    }

    class C40045 implements TextWatcher {
        final /* synthetic */ EditChannelInfoActivity f11531a;
        private String f11532b;

        C40045(EditChannelInfoActivity editChannelInfoActivity) {
            this.f11531a = editChannelInfoActivity;
        }

        public final void afterTextChanged(Editable editable) {
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            this.f11532b = charSequence.toString();
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            this.f11531a.aa = charSequence.toString();
            if (!(this.f11532b == null || this.f11532b.equals(charSequence.toString()))) {
                this.f11531a.f24682G = true;
            }
            this.f11532b = charSequence.toString();
        }
    }

    class C40056 implements TextWatcher {
        final /* synthetic */ EditChannelInfoActivity f11533a;
        private String f11534b;

        C40056(EditChannelInfoActivity editChannelInfoActivity) {
            this.f11533a = editChannelInfoActivity;
        }

        public final void afterTextChanged(Editable editable) {
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            this.f11534b = charSequence.toString();
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            this.f11533a.ab = charSequence.toString();
            if (!(this.f11534b == null || this.f11534b.equals(charSequence.toString()))) {
                this.f11533a.f24682G = true;
            }
            this.f11534b = charSequence.toString();
        }
    }

    class C40089 implements Runnable {
        final /* synthetic */ EditChannelInfoActivity f11539a;

        C40089(EditChannelInfoActivity editChannelInfoActivity) {
            this.f11539a = editChannelInfoActivity;
        }

        public final void run() {
            C4501c.m8189a().m8193b();
            if (this.f11539a.ae == -1.0d) {
                Toast.makeText(this.f11539a, C4522p.m8236a(R.string.the_location_deleted), 0).show();
                return;
            }
            if (this.f11539a.ae != 0.0d) {
                Toast.makeText(this.f11539a, C4522p.m8236a(R.string.the_location_submitted), 0).show();
            }
        }
    }

    class C62021 implements C0416a<Cursor> {
        final /* synthetic */ EditChannelInfoActivity f16751a;

        C62021(EditChannelInfoActivity editChannelInfoActivity) {
            this.f16751a = editChannelInfoActivity;
        }

        public final C0350e<Cursor> mo2226a(int i, Bundle bundle) {
            return C2980g.m7443d(this.f16751a.f24681F);
        }

        public final void mo2227a() {
        }

        public final /* synthetic */ void mo2228a(C0350e c0350e, Object obj) {
            Cursor cursor = (Cursor) obj;
            if (cursor.moveToFirst()) {
                boolean z;
                EditText d;
                StringBuilder stringBuilder;
                EditText w;
                CharSequence v;
                C6023j c6023j = new C6023j(cursor);
                String a = c6023j.m7352a("dialog_link");
                boolean e = c6023j.m13427e();
                int d2 = c6023j.m13426d();
                C2974a m = c6023j.m13435m();
                if (m != C2974a.OFFICIAL) {
                    if (m != C2974a.OFFICIAL_PAYMENT) {
                        z = false;
                        this.f16751a.m21053a(c6023j.m7352a("dialog_title"), z);
                        this.f16751a.f24678C.setText(c6023j.m7352a("dialog_description"));
                        if (a == null) {
                            if (this.f16751a.f24682G) {
                                d = this.f16751a.ac;
                                stringBuilder = new StringBuilder("@");
                                stringBuilder.append(a);
                                d.setText(stringBuilder.toString());
                            } else {
                                this.f16751a.ac.setText(a);
                                this.f16751a.ad.setErrorEnabled(false);
                                this.f16751a.ad.setError("");
                            }
                            this.f16751a.ac.setClickable(true);
                        } else {
                            this.f16751a.ac.setText("");
                            this.f16751a.ac.setClickable(false);
                        }
                        EditChannelInfoActivity.m21792a(this.f16751a, c6023j);
                        this.f16751a.m21056c(C2491i.m6766a(EditChannelInfoActivity.m21805f(this.f16751a), (float) d2, C4522p.m8236a(R.string.follower), C4522p.m8236a(R.string.followers)));
                        this.f16751a.f24694S = C2491i.m6769a(EditChannelInfoActivity.m21807g(this.f16751a), a);
                        this.f16751a.f24689N = c6023j.m13424b();
                        if (this.f16751a.f24689N == C3004f.OWNER) {
                            this.f16751a.f24688M.setVisibility(0);
                            this.f16751a.n.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_red_channel_conversation, 0, 0, 0);
                            C2491i.m6828c(this.f16751a.n, UIThemeManager.getmInstance().getAccent_color());
                            this.f16751a.n.setCompoundDrawablePadding((int) C2491i.m6804b(this.f16751a.getApplicationContext(), 4.0f));
                            this.f16751a.f24686K.setVisibility(8);
                            if (this.f16751a.f24687L != null) {
                                this.f16751a.f24687L.setVisible(false);
                                this.f16751a.f24685J.setVisible(true);
                            }
                        } else if (this.f16751a.f24689N != C3004f.ADMIN) {
                            this.f16751a.f24688M.setVisibility(0);
                            this.f16751a.f24686K.setVisibility(0);
                            this.f16751a.n.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_red_channel_conversation, 0, 0, 0);
                            C2491i.m6828c(this.f16751a.n, UIThemeManager.getmInstance().getAccent_color());
                            this.f16751a.n.setCompoundDrawablePadding((int) C2491i.m6804b(this.f16751a.getApplicationContext(), 4.0f));
                            if (this.f16751a.f24687L != null) {
                                this.f16751a.f24687L.setVisible(true);
                                this.f16751a.f24685J.setVisible(false);
                            }
                        } else {
                            this.f16751a.f24686K.setVisibility(8);
                            this.f16751a.f24688M.setVisibility(8);
                            this.f16751a.n.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                            this.f16751a.n.setCompoundDrawablePadding(0);
                        }
                        this.f16751a.f24700Y = e;
                        if (this.f16751a.f24682G) {
                            this.f16751a.f24679D.setChecked(e);
                            this.f16751a.f24682G = false;
                        } else {
                            this.f16751a.f24679D.setChecked(e);
                        }
                        if (this.f16751a.f24701Z.isEmpty() || this.f16751a.f24682G) {
                            w = this.f16751a.f24676A;
                            v = this.f16751a.f24701Z;
                        } else {
                            w = this.f16751a.f24676A;
                            v = c6023j.m7352a("dialog_title");
                        }
                        w.setText(v);
                        this.f16751a.f24692Q = c6023j.m7352a("dialog_title");
                        if (!this.f16751a.f24682G) {
                            if (c6023j.m7352a("dialog_description") != null || c6023j.m7352a("dialog_description").isEmpty()) {
                                this.f16751a.f24677B.setVisibility(8);
                                a = c6023j.m7352a("dialog_avatar_thumbnail_url");
                                this.f16751a.f24690O = c6023j.m7352a("dialog_avatar_url");
                                this.f16751a.f24691P = a;
                                if (this.f16751a.s == null || this.f16751a.s.isEmpty()) {
                                    if (!this.f16751a.u) {
                                        this.f16751a.f24690O = null;
                                        this.f16751a.f24691P = null;
                                        this.f16751a.m21069o();
                                        this.f16751a.m21070p();
                                    } else if (a != null || a.isEmpty()) {
                                        this.f16751a.f24690O = null;
                                        this.f16751a.f24691P = null;
                                        this.f16751a.m21069o();
                                        this.f16751a.m21070p();
                                    } else {
                                        this.f16751a.s = "";
                                        this.f16751a.m21052a(C4515k.m8231a(C2556b.m6998a(a)));
                                        this.f16751a.m21055b(C4515k.m8231a(C2556b.m6998a(a)));
                                    }
                                }
                                EditChannelInfoActivity.m21768G(this.f16751a);
                            }
                        }
                        this.f16751a.f24677B.setVisibility(0);
                        if (this.f16751a.aa.isEmpty() || this.f16751a.f24682G) {
                            w = this.f16751a.f24678C;
                            v = this.f16751a.aa;
                        } else {
                            w = this.f16751a.f24678C;
                            v = c6023j.m7352a("dialog_description");
                        }
                        w.setText(v);
                        a = c6023j.m7352a("dialog_avatar_thumbnail_url");
                        this.f16751a.f24690O = c6023j.m7352a("dialog_avatar_url");
                        this.f16751a.f24691P = a;
                        if (!this.f16751a.u) {
                            this.f16751a.f24690O = null;
                            this.f16751a.f24691P = null;
                            this.f16751a.m21069o();
                            this.f16751a.m21070p();
                        } else {
                            if (a != null) {
                            }
                            this.f16751a.f24690O = null;
                            this.f16751a.f24691P = null;
                            this.f16751a.m21069o();
                            this.f16751a.m21070p();
                        }
                        EditChannelInfoActivity.m21768G(this.f16751a);
                    }
                }
                z = true;
                this.f16751a.m21053a(c6023j.m7352a("dialog_title"), z);
                this.f16751a.f24678C.setText(c6023j.m7352a("dialog_description"));
                if (a == null) {
                    this.f16751a.ac.setText("");
                    this.f16751a.ac.setClickable(false);
                } else {
                    if (this.f16751a.f24682G) {
                        d = this.f16751a.ac;
                        stringBuilder = new StringBuilder("@");
                        stringBuilder.append(a);
                        d.setText(stringBuilder.toString());
                    } else {
                        this.f16751a.ac.setText(a);
                        this.f16751a.ad.setErrorEnabled(false);
                        this.f16751a.ad.setError("");
                    }
                    this.f16751a.ac.setClickable(true);
                }
                EditChannelInfoActivity.m21792a(this.f16751a, c6023j);
                this.f16751a.m21056c(C2491i.m6766a(EditChannelInfoActivity.m21805f(this.f16751a), (float) d2, C4522p.m8236a(R.string.follower), C4522p.m8236a(R.string.followers)));
                this.f16751a.f24694S = C2491i.m6769a(EditChannelInfoActivity.m21807g(this.f16751a), a);
                this.f16751a.f24689N = c6023j.m13424b();
                if (this.f16751a.f24689N == C3004f.OWNER) {
                    this.f16751a.f24688M.setVisibility(0);
                    this.f16751a.n.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_red_channel_conversation, 0, 0, 0);
                    C2491i.m6828c(this.f16751a.n, UIThemeManager.getmInstance().getAccent_color());
                    this.f16751a.n.setCompoundDrawablePadding((int) C2491i.m6804b(this.f16751a.getApplicationContext(), 4.0f));
                    this.f16751a.f24686K.setVisibility(8);
                    if (this.f16751a.f24687L != null) {
                        this.f16751a.f24687L.setVisible(false);
                        this.f16751a.f24685J.setVisible(true);
                    }
                } else if (this.f16751a.f24689N != C3004f.ADMIN) {
                    this.f16751a.f24686K.setVisibility(8);
                    this.f16751a.f24688M.setVisibility(8);
                    this.f16751a.n.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                    this.f16751a.n.setCompoundDrawablePadding(0);
                } else {
                    this.f16751a.f24688M.setVisibility(0);
                    this.f16751a.f24686K.setVisibility(0);
                    this.f16751a.n.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_red_channel_conversation, 0, 0, 0);
                    C2491i.m6828c(this.f16751a.n, UIThemeManager.getmInstance().getAccent_color());
                    this.f16751a.n.setCompoundDrawablePadding((int) C2491i.m6804b(this.f16751a.getApplicationContext(), 4.0f));
                    if (this.f16751a.f24687L != null) {
                        this.f16751a.f24687L.setVisible(true);
                        this.f16751a.f24685J.setVisible(false);
                    }
                }
                this.f16751a.f24700Y = e;
                if (this.f16751a.f24682G) {
                    this.f16751a.f24679D.setChecked(e);
                    this.f16751a.f24682G = false;
                } else {
                    this.f16751a.f24679D.setChecked(e);
                }
                if (this.f16751a.f24701Z.isEmpty()) {
                }
                w = this.f16751a.f24676A;
                v = this.f16751a.f24701Z;
                w.setText(v);
                this.f16751a.f24692Q = c6023j.m7352a("dialog_title");
                if (this.f16751a.f24682G) {
                    if (c6023j.m7352a("dialog_description") != null) {
                    }
                    this.f16751a.f24677B.setVisibility(8);
                    a = c6023j.m7352a("dialog_avatar_thumbnail_url");
                    this.f16751a.f24690O = c6023j.m7352a("dialog_avatar_url");
                    this.f16751a.f24691P = a;
                    if (!this.f16751a.u) {
                        if (a != null) {
                        }
                        this.f16751a.f24690O = null;
                        this.f16751a.f24691P = null;
                        this.f16751a.m21069o();
                        this.f16751a.m21070p();
                    } else {
                        this.f16751a.f24690O = null;
                        this.f16751a.f24691P = null;
                        this.f16751a.m21069o();
                        this.f16751a.m21070p();
                    }
                    EditChannelInfoActivity.m21768G(this.f16751a);
                }
                this.f16751a.f24677B.setVisibility(0);
                if (this.f16751a.aa.isEmpty()) {
                }
                w = this.f16751a.f24678C;
                v = this.f16751a.aa;
                w.setText(v);
                a = c6023j.m7352a("dialog_avatar_thumbnail_url");
                this.f16751a.f24690O = c6023j.m7352a("dialog_avatar_url");
                this.f16751a.f24691P = a;
                if (!this.f16751a.u) {
                    this.f16751a.f24690O = null;
                    this.f16751a.f24691P = null;
                    this.f16751a.m21069o();
                    this.f16751a.m21070p();
                } else {
                    if (a != null) {
                    }
                    this.f16751a.f24690O = null;
                    this.f16751a.f24691P = null;
                    this.f16751a.m21069o();
                    this.f16751a.m21070p();
                }
                EditChannelInfoActivity.m21768G(this.f16751a);
            }
        }
    }

    private void m21762A() {
        C2491i.m6780a(UIThemeManager.getmInstance().getText_primary_color(), UIThemeManager.getmInstance().getAccent_color(), this.f24676A, this.ac, this.f24678C);
    }

    static /* synthetic */ void m21768G(EditChannelInfoActivity editChannelInfoActivity) {
        editChannelInfoActivity.f24676A.addTextChangedListener(new C40034(editChannelInfoActivity));
        editChannelInfoActivity.f24678C.addTextChangedListener(new C40045(editChannelInfoActivity));
        editChannelInfoActivity.ac.addTextChangedListener(new C40056(editChannelInfoActivity));
    }

    static /* synthetic */ void m21769H(EditChannelInfoActivity editChannelInfoActivity) {
        String obj = editChannelInfoActivity.f24678C.getText().toString();
        String obj2 = editChannelInfoActivity.f24676A.getText().toString();
        boolean z = true;
        if (obj2.trim().isEmpty()) {
            editChannelInfoActivity.f24702z.setErrorEnabled(true);
            editChannelInfoActivity.f24702z.setError(C4522p.m8236a(R.string.channel_name_can_t_be_empty_));
            C4144a.m8004a(editChannelInfoActivity.f24702z);
            return;
        }
        editChannelInfoActivity.f24702z.setErrorEnabled(false);
        editChannelInfoActivity.f24702z.setError("");
        String obj3 = editChannelInfoActivity.ac.getText().toString();
        if (obj3.trim().isEmpty()) {
            editChannelInfoActivity.m21802d(C4522p.m8236a(R.string.channel_id_can_t_be_empty_));
        } else if (obj3.trim().length() < 6) {
            editChannelInfoActivity.m21802d(C4522p.m8236a(R.string.at_least_count_channel_id_error_message));
        } else if (obj3.trim().length() > 64) {
            editChannelInfoActivity.m21802d(C4522p.m8236a(R.string.max_count_channel_id_error_message));
        } else {
            if (!obj3.trim().isEmpty()) {
                Matcher matcher = Pattern.compile("^[a-z0-9_.]+$").matcher(obj3);
                if (editChannelInfoActivity.f24683H == null || editChannelInfoActivity.f24683H.isVisible()) {
                    z = false;
                }
                if (matcher.find() || !r1) {
                    editChannelInfoActivity.f24702z.setErrorEnabled(false);
                    editChannelInfoActivity.ad.setError("");
                    if (editChannelInfoActivity.f24683H != null && editChannelInfoActivity.f24683H.isVisible()) {
                        obj3 = obj3.replace("@", "");
                    }
                    final C1063i c6742g = new C6742g(editChannelInfoActivity.f24681F, obj2, obj, editChannelInfoActivity.t, editChannelInfoActivity.s, editChannelInfoActivity.f24700Y, obj3);
                    C2808d.m7148b(c6742g);
                    editChannelInfoActivity.runOnUiThread(new Runnable(editChannelInfoActivity) {
                        final /* synthetic */ EditChannelInfoActivity f11538b;

                        public final void run() {
                            C4501c.m8189a().m8192a(EditChannelInfoActivity.m21784W(this.f11538b), c6742g);
                        }
                    });
                } else {
                    editChannelInfoActivity.m21802d(C4522p.m8236a(R.string.sorry_this_channel_id_is_invalid));
                }
            }
        }
    }

    static /* synthetic */ void m21770I(EditChannelInfoActivity editChannelInfoActivity) {
        final C1063i c6746k = new C6746k(editChannelInfoActivity.f24681F);
        C2808d.m7148b(c6746k);
        editChannelInfoActivity.runOnUiThread(new Runnable(editChannelInfoActivity) {
            final /* synthetic */ EditChannelInfoActivity f11536b;

            public final void run() {
                C4501c.m8189a().m8192a(EditChannelInfoActivity.m21783V(this.f11536b), c6746k);
            }
        });
    }

    static /* synthetic */ C5891a m21772K(EditChannelInfoActivity editChannelInfoActivity) {
        C1063i c6707p = new C6707p(editChannelInfoActivity.f24681F);
        C2808d.m7147a(c6707p);
        return c6707p;
    }

    static /* synthetic */ C7406c m21773L(EditChannelInfoActivity editChannelInfoActivity) {
        return editChannelInfoActivity;
    }

    static /* synthetic */ void m21774M(EditChannelInfoActivity editChannelInfoActivity) {
        double d;
        double d2;
        if (editChannelInfoActivity.ag == null || editChannelInfoActivity.ag.length <= 0) {
            d = 0.0d;
            d2 = d;
        } else {
            d = editChannelInfoActivity.ag[0].getLatitude();
            d2 = editChannelInfoActivity.ag[0].getLongitude();
            editChannelInfoActivity.ag[0].getLabel();
        }
        if (d == 0.0d || r6 == 0.0d) {
            if (editChannelInfoActivity.ae == -1.0d && editChannelInfoActivity.af == -1.0d) {
                C3337b.m7811b((Activity) editChannelInfoActivity);
            } else if (editChannelInfoActivity.ae == 0.0d || editChannelInfoActivity.af == 0.0d) {
                if (editChannelInfoActivity.m21834z()) {
                    C3337b.m7811b((Activity) editChannelInfoActivity);
                }
            } else {
                C4478a.m8139a((Activity) editChannelInfoActivity, editChannelInfoActivity.ae, editChannelInfoActivity.af);
            }
        } else if (editChannelInfoActivity.ae == -1.0d && editChannelInfoActivity.af == -1.0d) {
            C3337b.m7811b((Activity) editChannelInfoActivity);
        } else {
            if (!(editChannelInfoActivity.ae == 0.0d || editChannelInfoActivity.af == 0.0d)) {
                d = editChannelInfoActivity.ae;
                d2 = editChannelInfoActivity.af;
            }
            C4478a.m8139a((Activity) editChannelInfoActivity, d, d2);
        }
    }

    static /* synthetic */ C7406c m21775N(EditChannelInfoActivity editChannelInfoActivity) {
        return editChannelInfoActivity;
    }

    static /* synthetic */ C7406c m21777P(EditChannelInfoActivity editChannelInfoActivity) {
        return editChannelInfoActivity;
    }

    static /* synthetic */ C7406c m21781T(EditChannelInfoActivity editChannelInfoActivity) {
        return editChannelInfoActivity;
    }

    static /* synthetic */ C7406c m21783V(EditChannelInfoActivity editChannelInfoActivity) {
        return editChannelInfoActivity;
    }

    static /* synthetic */ C7406c m21784W(EditChannelInfoActivity editChannelInfoActivity) {
        return editChannelInfoActivity;
    }

    static /* synthetic */ C7406c m21786Y(EditChannelInfoActivity editChannelInfoActivity) {
        return editChannelInfoActivity;
    }

    static /* synthetic */ C7406c m21787Z(EditChannelInfoActivity editChannelInfoActivity) {
        return editChannelInfoActivity;
    }

    static /* synthetic */ void m21792a(EditChannelInfoActivity editChannelInfoActivity, C6023j c6023j) {
        String string = c6023j.getString(c6023j.getColumnIndex("dialog_extra"));
        if (string != null) {
            try {
                editChannelInfoActivity.ag = ChannelLocation.toChanneLocationsArray(new JSONArray(string));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        if (editChannelInfoActivity.ag != null && editChannelInfoActivity.ag.length > 0) {
            ChannelLocation channelLocation = editChannelInfoActivity.ag[0];
            double latitude = channelLocation.getLatitude();
            double longitude = channelLocation.getLongitude();
            channelLocation.getLabel();
            if ((latitude == 0.0d || longitude == 0.0d) && !editChannelInfoActivity.m21834z()) {
                editChannelInfoActivity.m21060g(8);
            } else {
                editChannelInfoActivity.m21832y();
            }
        } else if ((editChannelInfoActivity.ae == 0.0d || editChannelInfoActivity.af == 0.0d) && !editChannelInfoActivity.m21834z()) {
            editChannelInfoActivity.m21060g(8);
        } else {
            editChannelInfoActivity.m21832y();
        }
    }

    static /* synthetic */ C7406c aa(EditChannelInfoActivity editChannelInfoActivity) {
        return editChannelInfoActivity;
    }

    static /* synthetic */ C7406c ae(EditChannelInfoActivity editChannelInfoActivity) {
        return editChannelInfoActivity;
    }

    private void m21796b(boolean z) {
        C1063i c6743h = new C6743h(this.f24681F, !z ? new ChannelLocation[]{new ChannelLocation(0, this.ae, this.af, this.ah, -1)} : null);
        C2808d.m7147a(c6743h);
        C4501c.m8189a().m8192a(this, c6743h);
    }

    private void m21802d(String str) {
        this.ad.setErrorEnabled(true);
        this.ad.setError(str);
        C4144a.m8005a(this.ad);
    }

    static /* synthetic */ C7406c m21805f(EditChannelInfoActivity editChannelInfoActivity) {
        return editChannelInfoActivity;
    }

    static /* synthetic */ C7406c m21807g(EditChannelInfoActivity editChannelInfoActivity) {
        return editChannelInfoActivity;
    }

    private void onLeaveAndDeleteChannelPressed() {
        Bundle bundle = new Bundle();
        bundle.putInt("dialog_id", 10);
        b_(bundle);
    }

    private void m21832y() {
        m21060g(0);
        m21068n();
    }

    private boolean m21834z() {
        return this.f24684I != null && this.f24684I.isVisible();
    }

    public final Dialog mo2299a(Bundle bundle) {
        int i = bundle.getInt("dialog_id");
        if (i == 10) {
            return C4488b.m8181a(this, C4522p.m8236a(R.string.are_you_sure_to_leave_and_delete_this_channel), C4522p.m8236a(R.string.action_leave_and_delete_channel), this.am, C4522p.m8236a(R.string.cancel), null);
        }
        if (i == 56) {
            return C4488b.m8181a(this, C4522p.m8236a(R.string.are_you_sure_to_delete_the_channel), C4522p.m8236a(R.string.delete), this.ak, C4522p.m8236a(R.string.cancel), null);
        }
        switch (i) {
            case 50:
            case 51:
                return C4488b.m8182a(this, C4522p.m8236a(R.string.save_changes), C4522p.m8236a(R.string.are_you_sure_to_save), C4522p.m8236a(R.string.save), this.aj, C4522p.m8236a(R.string.cancel), this.al);
            case 52:
                return C4488b.m8181a(this, C4522p.m8236a(R.string.are_you_sure_to_change_channel_location), C4522p.m8236a(R.string.ok_cap), this.ao, C4522p.m8236a(R.string.cancel), new OnClickListener(this) {
                    final /* synthetic */ EditChannelInfoActivity f11515a;

                    {
                        this.f11515a = r1;
                    }

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        this.f11515a.ae = 0.0d;
                        this.f11515a.af = 0.0d;
                        this.f11515a.ah = "";
                    }
                });
            default:
                return super.mo2299a(bundle);
        }
    }

    protected final int mo3643g() {
        return R.drawable.ic_place_holder_channel;
    }

    protected final String mo3695h() {
        return this.f24681F;
    }

    protected final C2973m mo3696i() {
        return C2973m.CHANNEL;
    }

    protected final void mo3697j() {
        if (this.f24684I != null) {
            this.f24684I.setVisible(true);
        }
    }

    protected final void mo3698k() {
        this.v = 0.75d;
        this.w = 0.5d;
    }

    protected final void mo3699l() {
        if (this.f24690O != null && this.f24691P != null) {
            C4478a.m8164c(this, this.f24690O, this.f24691P, this.f24692Q);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 100) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            switch (intent.getIntExtra("KEY_RESULT_TYPE", -1)) {
                case 111:
                    C3337b.m7811b((Activity) this);
                    return;
                case 112:
                    this.ae = -1.0d;
                    this.af = -1.0d;
                    m21796b(true);
                    return;
                default:
                    C1832a a = C5508a.m12042a(intent, MyApplication.m12952b());
                    this.ae = a.mo3044a().f18734a;
                    this.af = a.mo3044a().f18735b;
                    this.ah = "";
                    C0663a c0663a = new C0663a(this, R.style.AppCompatAlertDialogStyle);
                    c0663a.m1613b(C4522p.m8236a(R.string.are_you_sure_to_change_channel_location));
                    c0663a.m1609a(C4522p.m8236a(R.string.ok_cap), new OnClickListener(this) {
                        final /* synthetic */ EditChannelInfoActivity f11507a;

                        {
                            this.f11507a = r1;
                        }

                        public final void onClick(DialogInterface dialogInterface, int i) {
                            this.f11507a.m21796b(false);
                        }
                    });
                    c0663a.m1614b(C4522p.m8236a(R.string.cancel), new OnClickListener(this) {
                        final /* synthetic */ EditChannelInfoActivity f11508a;

                        {
                            this.f11508a = r1;
                        }

                        public final void onClick(DialogInterface dialogInterface, int i) {
                            this.f11508a.ae = 0.0d;
                            this.f11508a.af = 0.0d;
                            this.f11508a.ah = "";
                        }
                    });
                    c0663a.m1610a(false);
                    C6389b a2 = c0663a.m1612a();
                    a2.show();
                    a2.m15114a(-2).setTextColor(UIThemeManager.getmInstance().getAccent_color());
                    a2.m15114a(-1).setTextColor(UIThemeManager.getmInstance().getAccent_color());
                    return;
            }
        }
    }

    public void onBackPressed() {
        if (!this.f24682G) {
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
        m21057e((int) R.layout.fragment_edit_channel_info);
        Bundle extras = getIntent().getExtras();
        this.f24681F = extras != null ? extras.getString("KEY_CHANNEL_ID") : "";
        this.f24693R = C2535a.m6888a().m6919b();
        C2808d.m7148b(new C6700i(this.f24681F));
        this.f24695T = (ViewGroup) findViewById(R.id.root_layout);
        this.an = findViewById(R.id.touch_view_channel_id);
        this.f24696U = (LinearLayout) findViewById(R.id.details_layout);
        this.f24680E = (TextView) findViewById(R.id.sharedMedia_textView);
        this.f24697V = (ImageView) findViewById(R.id.share_image_view);
        this.f24698W = (FrameLayout) findViewById(R.id.top_frameLayout);
        this.f24699X = findViewById(R.id.spacer_view);
        this.f24688M = (Button) findViewById(R.id.add_participants_button);
        this.f24686K = (Button) findViewById(R.id.leave_and_delete_button);
        this.f24686K.setText(C4522p.m8236a(R.string.action_leave_and_delete_channel));
        this.f24688M.setText(C4522p.m8236a(R.string.title_manage_followers_activity));
        this.f24702z = (TextInputLayout) findViewById(R.id.channelName_textInputLayout);
        this.f24676A = (EditText) findViewById(R.id.channelName_editText);
        this.f24677B = (TextInputLayout) findViewById(R.id.channelDescriptions_textInputLayout);
        this.f24678C = (EditText) findViewById(R.id.channelDescriptions_editText);
        this.ad = (TextInputLayout) findViewById(R.id.channelID_textInputLayout);
        this.ac = (EditText) findViewById(R.id.channelID_editText);
        boolean z = false;
        this.ac.setEnabled(false);
        this.an.setOnClickListener(new View.OnClickListener(this) {
            final /* synthetic */ EditChannelInfoActivity f11520a;

            {
                this.f11520a = r1;
            }

            public final void onClick(View view) {
                C4533r.m8256a(EditChannelInfoActivity.m21775N(this.f11520a), this.f11520a.f24694S);
            }
        });
        this.an.setOnLongClickListener(new OnLongClickListener(this) {
            final /* synthetic */ EditChannelInfoActivity f11521a;

            {
                this.f11521a = r1;
            }

            public final boolean onLongClick(View view) {
                C4533r.m8256a(EditChannelInfoActivity.m21777P(this.f11521a), this.f11521a.f24694S);
                return false;
            }
        });
        EditText editText = (EditText) findViewById(R.id.junk_editText);
        this.f24679D = (CheckBox) findViewById(R.id.allowReply_checkBox);
        this.f24679D.setText(C4522p.m8236a(R.string.allow_reply_channel));
        this.f24676A.setFilters(new InputFilter[]{new LengthFilter(128)});
        this.f24676A.setMaxLines(1);
        this.f24676A.setSingleLine(true);
        this.f24678C.setFilters(new InputFilter[]{new LengthFilter(256)});
        this.f24679D.setOnCheckedChangeListener(new OnCheckedChangeListener(this) {
            final /* synthetic */ EditChannelInfoActivity f11522a;

            {
                this.f11522a = r1;
            }

            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.f11522a.f24700Y = z;
                this.f11522a.f24682G = true;
            }
        });
        Display defaultDisplay = getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        LayoutParams layoutParams = this.f24695T.getLayoutParams();
        if (!getResources().getBoolean(R.bool.xlarge)) {
            layoutParams.height = (int) (((float) (point.y - (C2491i.m6759a(getApplicationContext()) + C2491i.m6805b(getApplicationContext())))) + C2491i.m6804b(getApplicationContext(), 8.0f));
            if (getResources().getConfiguration().orientation == 2) {
                layoutParams.width = (int) (((double) point.x) * 0.75d);
            }
        }
        this.f24676A.setText("");
        this.f24678C.setText("");
        editText.requestFocus();
        this.f24702z.setVisibility(8);
        this.f24677B.setVisibility(8);
        this.f24688M.setOnClickListener(new C39982(this));
        new Thread(new C40023(this)).start();
        C2491i.m6796a(this.f24695T, UIThemeManager.getmInstance().getRecycler_view_background_color());
        C2491i.m6796a(this.f24696U, UIThemeManager.getmInstance().getRecycler_view_background_color());
        C2491i.m6796a(this.f24698W, UIThemeManager.getmInstance().getRecycler_view_background_color());
        C2491i.m6819b(this.f24686K, UIThemeManager.getmInstance().getAccent_color());
        C2491i.m6798a(this.f24686K, UIThemeManager.getmInstance().getButton_text_color());
        C2491i.m6819b(this.f24688M, UIThemeManager.getmInstance().getAccent_color());
        C2491i.m6798a(this.f24688M, UIThemeManager.getmInstance().getButton_text_color());
        C2491i.m6796a(this.f24699X, UIThemeManager.getmInstance().getSpacer_view_color());
        C2491i.m6802a(this.f24680E, UIThemeManager.getmInstance().getText_secondary_color());
        new View[1][0] = this.f24680E;
        C2491i.m6801a(this.f24697V, UIThemeManager.getmInstance().getText_secondary_color());
        this.f24679D.setTextColor(UIThemeManager.getmInstance().getText_primary_color());
        C2491i.m6799a(this.f24679D, UIThemeManager.getmInstance().getAccent_color());
        C2491i.m6781a(UIThemeManager.getmInstance().getAccent_color(), this.f24677B, this.ad, this.f24702z);
        m21762A();
        m21054b(new View.OnClickListener(this) {
            final /* synthetic */ EditChannelInfoActivity f11519a;

            {
                this.f11519a = r1;
            }

            public final void onClick(View view) {
                EditChannelInfoActivity.m21774M(this.f11519a);
            }
        });
        m21062h(C2491i.m6806b(getApplicationContext(), this.f24681F));
        m21069o();
        m21070p();
        if (bundle != null) {
            if (bundle.containsKey("KEY_CHANNEL_NAME")) {
                String string = bundle.getString("KEY_CHANNEL_NAME");
                this.f24676A.setText(string);
                m21053a(string, false);
                this.f24701Z = string;
            }
            if (bundle.containsKey("KEY_CHANNEL_DESCRIPTIONS")) {
                Object string2 = bundle.getString("KEY_CHANNEL_DESCRIPTIONS");
                this.f24678C.setText(string2);
                this.aa = string2;
            }
            if (bundle.containsKey("KEY_IS_REPLY_ALLOWED")) {
                boolean z2 = bundle.getBoolean("KEY_IS_REPLY_ALLOWED");
                this.f24679D.setChecked(z2);
                this.f24700Y = z2;
            }
            if (bundle.containsKey("KEY_CHANNEL_LINK")) {
                this.f24694S = bundle.getString("KEY_CHANNEL_LINK");
            }
            if (bundle.containsKey("KEY_CHANNEL_LATITUDE_LOCATION")) {
                this.ae = bundle.getDouble("KEY_CHANNEL_LATITUDE_LOCATION");
            }
            if (bundle.containsKey("KEY_CHANNEL_LONGITUDE_LOCATION")) {
                this.af = bundle.getDouble("KEY_CHANNEL_LONGITUDE_LOCATION");
            }
            if (bundle.containsKey("KEY_IS_CHANGE_OCCURRED") && bundle.getBoolean("KEY_IS_CHANGE_OCCURRED")) {
                z = true;
            }
            this.f24682G = z;
        }
        if (this.s != null) {
            m21052a(this.s);
            m21055b(this.s);
        }
        m19190e().mo268a(36, null, this.ai);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_edit_channel_info, menu);
        this.f24683H = menu.findItem(R.id.action_edit);
        this.f24684I = menu.findItem(R.id.action_done);
        this.f24685J = menu.findItem(R.id.action_delete);
        this.f24687L = menu.findItem(R.id.action_leave_and_delete);
        this.f24683H.setTitle(C4522p.m8236a(R.string.action_edit));
        this.f24684I.setTitle(C4522p.m8236a(R.string.action_done));
        this.f24685J.setTitle(C4522p.m8236a(R.string.action_delete));
        this.f24687L.setTitle(C4522p.m8236a(R.string.action_leave_and_delete_channel));
        if (this.f24689N == null || this.f24689N != C3004f.OWNER) {
            this.f24685J.setVisible(false);
            this.f24687L.setVisible(true);
        } else {
            this.f24685J.setVisible(true);
            this.f24687L.setVisible(false);
        }
        if (!this.f24682G) {
            if (!this.t) {
                this.f24684I.setVisible(false);
                if (this.f24682G) {
                    this.f24683H.setVisible(false);
                }
                if (this.f24682G) {
                    this.f24702z.setVisibility(8);
                } else {
                    this.f24702z.setVisibility(0);
                }
                this.f24676A.setEnabled(this.f24682G);
                this.f24678C.setEnabled(this.f24682G);
                this.ac.setEnabled(this.f24682G);
                if (this.f24682G) {
                    this.an.setVisibility(8);
                    m21060g(0);
                }
                m21762A();
                return true;
            }
        }
        this.f24684I.setVisible(true);
        if (this.f24682G) {
            this.f24683H.setVisible(false);
        }
        if (this.f24682G) {
            this.f24702z.setVisibility(8);
        } else {
            this.f24702z.setVisibility(0);
        }
        this.f24676A.setEnabled(this.f24682G);
        this.f24678C.setEnabled(this.f24682G);
        this.ac.setEnabled(this.f24682G);
        if (this.f24682G) {
            this.an.setVisibility(8);
            m21060g(0);
        }
        m21762A();
        return true;
    }

    protected void onDestroy() {
        super.onDestroy();
        m19190e().mo269a(16);
    }

    public void onEvent(final C5923q c5923q) {
        runOnUiThread(new Runnable(this) {
            final /* synthetic */ EditChannelInfoActivity f11506b;

            class C39951 implements Runnable {
                final /* synthetic */ AnonymousClass15 f11504a;

                C39951(AnonymousClass15 anonymousClass15) {
                    this.f11504a = anonymousClass15;
                }

                public final void run() {
                    C4513i.m8228a(EditChannelInfoActivity.aa(this.f11504a.f11506b), c5923q.f8890a);
                }
            }

            public final void run() {
                C4501c.m8189a().m8193b();
                new Handler().postDelayed(new C39951(this), 100);
            }
        });
    }

    public void onEvent(C2651r c2651r) {
        runOnUiThread(new Runnable(this) {
            final /* synthetic */ EditChannelInfoActivity f11503a;

            class C39941 implements Runnable {
                final /* synthetic */ AnonymousClass14 f11502a;

                C39941(AnonymousClass14 anonymousClass14) {
                    this.f11502a = anonymousClass14;
                }

                public final void run() {
                    this.f11502a.f11503a.setResult(1479);
                    this.f11502a.f11503a.finish();
                    this.f11502a.f11503a.overridePendingTransition(R.anim.anim_slide_in_right, R.anim.anim_slide_out_right);
                }
            }

            {
                this.f11503a = r1;
            }

            public final void run() {
                C4501c.m8189a().m8193b();
                new Handler().postDelayed(new C39941(this), 100);
            }
        });
    }

    public void onEvent(final C5943k c5943k) {
        runOnUiThread(new Runnable(this) {
            final /* synthetic */ EditChannelInfoActivity f11513b;

            class C39971 implements Runnable {
                final /* synthetic */ AnonymousClass19 f11511a;

                C39971(AnonymousClass19 anonymousClass19) {
                    this.f11511a = anonymousClass19;
                }

                public final void run() {
                    C4513i.m8228a(EditChannelInfoActivity.ae(this.f11511a.f11513b), c5943k.f8890a);
                }
            }

            public final void run() {
                C4501c.m8189a().m8193b();
                new Handler().postDelayed(new C39971(this), 100);
            }
        });
    }

    public void onEvent(final C5944l c5944l) {
        runOnUiThread(new Runnable(this) {
            final /* synthetic */ EditChannelInfoActivity f11496b;

            public final void run() {
                C4501c.m8189a().m8193b();
                C4513i.m8228a(EditChannelInfoActivity.m21786Y(this.f11496b), c5944l.f8890a);
                C2480b.m6742f("----------------+++++++++++++++++++++++++++++++++++++++++++++++++++++");
            }
        });
    }

    public void onEvent(C2701m c2701m) {
        runOnUiThread(new C40089(this));
    }

    public void onEvent(C2702n c2702n) {
        runOnUiThread(new Runnable(this) {
            final /* synthetic */ EditChannelInfoActivity f11510a;

            class C39961 implements Runnable {
                final /* synthetic */ AnonymousClass18 f11509a;

                C39961(AnonymousClass18 anonymousClass18) {
                    this.f11509a = anonymousClass18;
                }

                public final void run() {
                    this.f11509a.f11510a.setResult(1479);
                    this.f11509a.f11510a.finish();
                    this.f11509a.f11510a.overridePendingTransition(R.anim.anim_slide_in_right, R.anim.anim_slide_out_right);
                }
            }

            {
                this.f11510a = r1;
            }

            public final void run() {
                C4501c.m8189a().m8193b();
                new Handler().postDelayed(new C39961(this), 100);
            }
        });
    }

    public void onEvent(final C5946t c5946t) {
        runOnUiThread(new Runnable(this) {
            final /* synthetic */ EditChannelInfoActivity f11501b;

            public final void run() {
                C4501c.m8189a().m8193b();
                C4513i.m8228a(EditChannelInfoActivity.m21787Z(this.f11501b), c5946t.f8890a);
            }
        });
    }

    public void onEvent(C2707u c2707u) {
        runOnUiThread(new Runnable(this) {
            final /* synthetic */ EditChannelInfoActivity f11498a;

            class C39931 implements Runnable {
                final /* synthetic */ AnonymousClass11 f11497a;

                C39931(AnonymousClass11 anonymousClass11) {
                    this.f11497a = anonymousClass11;
                }

                public final void run() {
                    this.f11497a.f11498a.finish();
                    this.f11497a.f11498a.overridePendingTransition(R.anim.anim_slide_in_right, R.anim.anim_slide_out_right);
                }
            }

            {
                this.f11498a = r1;
            }

            public final void run() {
                C4501c.m8189a().m8193b();
                new Handler().postDelayed(new C39931(this), 100);
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
            if (!this.f24682G) {
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
                if (this.f24679D != null) {
                    this.f24679D.setEnabled(true);
                    C2491i.m6799a(this.f24679D, UIThemeManager.getmInstance().getAccent_color());
                }
                this.f24683H.setVisible(false);
                this.f24684I.setVisible(true);
                this.f24676A.setEnabled(true);
                this.f24678C.setEnabled(true);
                this.ac.setEnabled(true);
                this.an.setVisibility(8);
                this.f24677B.setVisibility(0);
                this.f24702z.setVisibility(0);
                m21060g(0);
                Editable text = this.ac.getText();
                if (!(text == null || text.toString().isEmpty())) {
                    this.ac.setText(text.toString().replace("@", ""));
                }
                this.f24676A.requestFocus();
                m21762A();
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
        C2808d.m7148b(new C6700i(this.f24681F));
    }

    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        String obj = this.f24676A.getText().toString();
        if (!obj.isEmpty()) {
            bundle.putString("KEY_CHANNEL_NAME", obj);
        }
        obj = this.f24678C.getText().toString();
        if (!obj.isEmpty()) {
            bundle.putString("KEY_CHANNEL_DESCRIPTIONS", obj);
        }
        obj = this.f24694S;
        if (!(obj == null || obj.isEmpty())) {
            bundle.putString("KEY_CHANNEL_LINK", obj);
        }
        if (this.ae != 0.0d) {
            bundle.putDouble("KEY_CHANNEL_LATITUDE_LOCATION", this.ae);
        }
        if (this.af != 0.0d) {
            bundle.putDouble("KEY_CHANNEL_LONGITUDE_LOCATION", this.af);
        }
        bundle.putBoolean("KEY_IS_CHANGE_OCCURRED", this.f24682G);
        bundle.putBoolean("KEY_IS_REPLY_ALLOWED", this.f24700Y);
    }
}
