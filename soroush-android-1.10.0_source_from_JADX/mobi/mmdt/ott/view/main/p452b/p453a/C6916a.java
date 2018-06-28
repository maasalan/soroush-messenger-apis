package mobi.mmdt.ott.view.main.p452b.p453a;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p085c.p086a.C1212c;
import com.p085c.p086a.C1274i;
import com.p085c.p086a.C5284j;
import com.p085c.p086a.p089c.p092b.C1144h;
import com.p085c.p086a.p105g.C1248f;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.componentsutils.view.roundavatarimageview.RoundAvatarImageView;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.lib_webservicescomponent.p257d.C2556b;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.view.components.p401c.C3126i;
import mobi.mmdt.ott.view.components.p401c.C6073e;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.main.CreateChannelActivity;
import mobi.mmdt.ott.view.main.NewBulkMessageContactSelectionListActivity;
import mobi.mmdt.ott.view.main.NewGroupActivity;
import mobi.mmdt.ott.view.main.p452b.C4156c;
import mobi.mmdt.ott.view.main.p452b.p576b.C7364b;
import mobi.mmdt.ott.view.tools.C4515k;
import mobi.mmdt.ott.view.tools.C4522p;
import mobi.mmdt.ott.view.tools.C4533r;

public final class C6916a extends C6073e {
    private ImageView f19715b = ((ImageView) this.itemView.findViewById(R.id.invite_image_view));
    private LinearLayout f19716c = ((LinearLayout) this.itemView.findViewById(R.id.invite_linearLayout));
    private TextView f19717d = ((TextView) this.itemView.findViewById(R.id.divider_textView));
    private FrameLayout f19718e = ((FrameLayout) this.itemView.findViewById(R.id.invite_layout));
    private FrameLayout f19719f;
    private Button f19720g = ((Button) this.itemView.findViewById(R.id.btn_invite));
    private TextView f19721h = ((TextView) this.itemView.findViewById(R.id.invite_text_view));
    private String f19722i;
    private Activity f19723j;
    private RoundAvatarImageView f19724k = ((RoundAvatarImageView) this.itemView.findViewById(R.id.imageView1));
    private TextView f19725l = ((TextView) this.itemView.findViewById(R.id.textView1));
    private TextView f19726m = ((TextView) this.itemView.findViewById(R.id.textView2));
    private View f19727n = this.itemView.findViewById(R.id.divider_line);
    private C4156c f19728o;
    private ImageView f19729p = ((ImageView) this.itemView.findViewById(R.id.new_group_image_view));
    private ImageView f19730q = ((ImageView) this.itemView.findViewById(R.id.new_channel_image_view));
    private ImageView f19731r = ((ImageView) this.itemView.findViewById(R.id.new_bulk_message_image_view));
    private TextView f19732s = ((TextView) this.itemView.findViewById(R.id.new_group_text_view));
    private TextView f19733t = ((TextView) this.itemView.findViewById(R.id.new_channel_text_view));
    private TextView f19734u = ((TextView) this.itemView.findViewById(R.id.new_bulk_message_text_view));

    class C41461 implements OnClickListener {
        final /* synthetic */ C6916a f11836a;

        C41461(C6916a c6916a) {
            this.f11836a = c6916a;
        }

        public final void onClick(View view) {
            C6916a.m17858a(this.f11836a);
        }
    }

    class C41472 implements OnClickListener {
        final /* synthetic */ C6916a f11837a;

        C41472(C6916a c6916a) {
            this.f11837a = c6916a;
        }

        public final void onClick(View view) {
            C6916a.m17859b(this.f11837a);
        }
    }

    class C41483 implements OnClickListener {
        final /* synthetic */ C6916a f11838a;

        C41483(C6916a c6916a) {
            this.f11838a = c6916a;
        }

        public final void onClick(View view) {
            C6916a.m17860c(this.f11838a);
        }
    }

    class C41494 implements OnClickListener {
        final /* synthetic */ C6916a f11839a;

        C41494(C6916a c6916a) {
            this.f11839a = c6916a;
        }

        public final void onClick(View view) {
            Activity d = this.f11839a.f19723j;
            C4522p.m8236a(R.string.invite_msg);
            C4533r.m8255a(d);
        }
    }

    class C41505 implements OnClickListener {
        final /* synthetic */ C6916a f11840a;

        C41505(C6916a c6916a) {
            this.f11840a = c6916a;
        }

        public final void onClick(View view) {
            this.f11840a.f19728o.mo3241c((C7364b) this.f11840a.f16244a);
        }
    }

    class C41516 implements OnClickListener {
        final /* synthetic */ C6916a f11841a;

        C41516(C6916a c6916a) {
            this.f11841a = c6916a;
        }

        public final void onClick(View view) {
            this.f11841a.f19728o.mo3238a((C7364b) this.f11841a.f16244a);
        }
    }

    class C41527 implements OnLongClickListener {
        final /* synthetic */ C6916a f11842a;

        C41527(C6916a c6916a) {
            this.f11842a = c6916a;
        }

        public final boolean onLongClick(View view) {
            this.f11842a.f19728o.mo3240b((C7364b) this.f11842a.f16244a);
            return false;
        }
    }

    public C6916a(Activity activity, C3126i c3126i, LayoutInflater layoutInflater, ViewGroup viewGroup, C4156c c4156c, boolean z, boolean z2) {
        super(layoutInflater, viewGroup, R.layout.list_item_contacts, c3126i);
        this.f19723j = activity;
        this.f19728o = c4156c;
        RelativeLayout relativeLayout = (RelativeLayout) this.itemView.findViewById(R.id.layout_items);
        int i = 8;
        this.f19718e.setVisibility(z ? 0 : 8);
        if (z2) {
            i = 0;
        }
        relativeLayout.setVisibility(i);
        FrameLayout frameLayout = (FrameLayout) this.itemView.findViewById(R.id.new_channel_layout);
        FrameLayout frameLayout2 = (FrameLayout) this.itemView.findViewById(R.id.new_bulk_message_layout);
        ((FrameLayout) this.itemView.findViewById(R.id.new_group_layout)).setOnClickListener(new C41461(this));
        frameLayout.setOnClickListener(new C41472(this));
        frameLayout2.setOnClickListener(new C41483(this));
        this.f19719f = (FrameLayout) this.itemView.findViewById(R.id.root_contact_item_layout);
        this.f19722i = C2535a.m6888a().m6919b();
        this.f19718e.setOnClickListener(new C41494(this));
        this.f19720g.setOnClickListener(new C41505(this));
        this.f19719f.setOnClickListener(new C41516(this));
        this.f19719f.setOnLongClickListener(new C41527(this));
        C2491i.m6802a(this.f19732s, UIThemeManager.getmInstance().getText_primary_color());
        C2491i.m6801a(this.f19729p, UIThemeManager.getmInstance().getText_primary_color());
        C2491i.m6802a(this.f19733t, UIThemeManager.getmInstance().getText_primary_color());
        C2491i.m6801a(this.f19730q, UIThemeManager.getmInstance().getText_primary_color());
        C2491i.m6802a(this.f19734u, UIThemeManager.getmInstance().getText_primary_color());
        C2491i.m6801a(this.f19731r, UIThemeManager.getmInstance().getText_primary_color());
        C2491i.m6796a(this.f19727n, UIThemeManager.getmInstance().getLine_divider_color());
        C2491i.m6796a(this.f19717d, UIThemeManager.getmInstance().getAccent_color());
        C2491i.m6802a(this.f19717d, UIThemeManager.getmInstance().getButton_text_color());
        C2491i.m6802a(this.f19725l, UIThemeManager.getmInstance().getText_primary_color());
        C2491i.m6802a(this.f19726m, UIThemeManager.getmInstance().getText_secondary_color());
        C2491i.m6802a(this.f19721h, UIThemeManager.getmInstance().getText_primary_color());
        C2491i.m6801a(this.f19715b, UIThemeManager.getmInstance().getText_primary_color());
        C2491i.m6819b(this.f19720g, UIThemeManager.getmInstance().getAccent_color());
        C2491i.m6798a(this.f19720g, UIThemeManager.getmInstance().getButton_text_color());
        View[] viewArr = new View[]{this.f19718e, this.f19719f};
    }

    static /* synthetic */ void m17858a(C6916a c6916a) {
        c6916a.f19723j.startActivity(new Intent(c6916a.f19723j, NewGroupActivity.class));
        c6916a.f19723j.overridePendingTransition(R.anim.anim_slide_in_left, R.anim.anim_slide_out_left);
    }

    static /* synthetic */ void m17859b(C6916a c6916a) {
        c6916a.f19723j.startActivity(new Intent(c6916a.f19723j, CreateChannelActivity.class));
        c6916a.f19723j.overridePendingTransition(R.anim.anim_slide_in_left, R.anim.anim_slide_out_left);
    }

    static /* synthetic */ void m17860c(C6916a c6916a) {
        c6916a.f19723j.startActivity(new Intent(c6916a.f19723j, NewBulkMessageContactSelectionListActivity.class));
        c6916a.f19723j.overridePendingTransition(R.anim.anim_slide_in_left, R.anim.anim_slide_out_left);
    }

    protected final void mo3180a(C6829g c6829g) {
        TextView textView;
        CharSequence b;
        C5284j a;
        Object obj;
        C1274i a2;
        String a3;
        Object[] objArr;
        C7364b c7364b = (C7364b) c6829g;
        String a4;
        Object[] objArr2;
        CharSequence format;
        if (this.f19722i.equals("fa")) {
            this.f19725l.setText(C2491i.m6814b(c7364b.f21368d));
            if (c7364b.f21365a) {
                textView = this.f19726m;
                String a5 = (c7364b.f21370f == null || c7364b.f21370f.isEmpty()) ? C4522p.m8236a(R.string.im_using_soroush) : c7364b.f21370f;
                b = C2491i.m6814b(a5);
                textView.setText(b);
                this.f19724k.setImageBitmap(null);
                if (c7364b.f21371g != null || c7364b.f21371g.isEmpty()) {
                    if (c7364b.f21372h != null) {
                        a = C1212c.m2872a(this.f19723j);
                        obj = c7364b.f21372h;
                    } else {
                        a = C1212c.m2872a(this.f19723j);
                        obj = Integer.valueOf(R.drawable.ic_place_holder_contact);
                    }
                    a2 = a.m10950a(obj).m3034a(C1248f.m2945b()).m3033a();
                } else {
                    a2 = C1212c.m2872a(this.f19723j).m10950a(C4515k.m8231a(C2556b.m6998a(c7364b.f21371g))).m3034a(C1248f.m2945b().m2955b(C1144h.f3689a));
                }
                a2.m3031a(this.f19724k);
                this.f19724k.setBackgroundColor(c7364b.f21373i);
                if (c7364b.f19504k == 0) {
                    this.f19727n.setVisibility(4);
                    this.f19716c.setVisibility(0);
                    if (c7364b.f21374l > 1) {
                        if (this.f19722i.equals("fa")) {
                            if (c7364b.f21367c > 0) {
                                textView = this.f19717d;
                                a3 = C4522p.m8236a(R.string.count_contacts);
                                objArr = new Object[]{C2491i.m6809b(c7364b.f21367c), C2491i.m6809b(c7364b.f21374l)};
                            } else {
                                textView = this.f19717d;
                                a4 = C4522p.m8236a(R.string.count_contacts_without_soroush_contact);
                                objArr2 = new Object[]{C2491i.m6809b(c7364b.f21374l)};
                                format = String.format(a4, objArr2);
                                textView.setText(format);
                            }
                        } else if (c7364b.f21367c > 0) {
                            textView = this.f19717d;
                            a3 = C4522p.m8236a(R.string.count_contacts);
                            objArr = new Object[]{Integer.valueOf(c7364b.f21367c), Integer.valueOf(c7364b.f21374l)};
                        } else {
                            textView = this.f19717d;
                            a4 = C4522p.m8236a(R.string.count_contacts_without_soroush_contact);
                            objArr2 = new Object[]{Integer.valueOf(c7364b.f21374l)};
                            format = String.format(a4, objArr2);
                            textView.setText(format);
                        }
                    } else if (this.f19722i.equals("fa")) {
                        if (c7364b.f21367c > 0) {
                            textView = this.f19717d;
                            a3 = C4522p.m8236a(R.string.count_contact);
                            objArr = new Object[]{C2491i.m6809b(c7364b.f21367c), C2491i.m6809b(c7364b.f21374l)};
                        } else {
                            textView = this.f19717d;
                            a4 = C4522p.m8236a(R.string.count_contact_without_soroush_contact);
                            objArr2 = new Object[]{C2491i.m6809b(c7364b.f21374l)};
                            format = String.format(a4, objArr2);
                            textView.setText(format);
                        }
                    } else if (c7364b.f21367c > 0) {
                        textView = this.f19717d;
                        a3 = C4522p.m8236a(R.string.count_contact);
                        objArr = new Object[]{Integer.valueOf(c7364b.f21367c), Integer.valueOf(c7364b.f21374l)};
                    } else {
                        textView = this.f19717d;
                        a4 = C4522p.m8236a(R.string.count_contact_without_soroush_contact);
                        objArr2 = new Object[]{Integer.valueOf(c7364b.f21374l)};
                        format = String.format(a4, objArr2);
                        textView.setText(format);
                    }
                    format = String.format(a3, objArr);
                    textView.setText(format);
                } else {
                    this.f19727n.setVisibility(0);
                    this.f19716c.setVisibility(8);
                }
                if (c7364b.f21365a) {
                    this.f19720g.setVisibility(8);
                } else {
                    this.f19720g.setVisibility(0);
                }
            }
        }
        this.f19725l.setText(c7364b.f21368d);
        if (c7364b.f21365a) {
            textView = this.f19726m;
            b = (c7364b.f21370f == null || c7364b.f21370f.isEmpty()) ? C4522p.m8236a(R.string.im_using_soroush) : c7364b.f21370f;
            textView.setText(b);
            this.f19724k.setImageBitmap(null);
            if (c7364b.f21371g != null) {
            }
            if (c7364b.f21372h != null) {
                a = C1212c.m2872a(this.f19723j);
                obj = Integer.valueOf(R.drawable.ic_place_holder_contact);
            } else {
                a = C1212c.m2872a(this.f19723j);
                obj = c7364b.f21372h;
            }
            a2 = a.m10950a(obj).m3034a(C1248f.m2945b()).m3033a();
            a2.m3031a(this.f19724k);
            this.f19724k.setBackgroundColor(c7364b.f21373i);
            if (c7364b.f19504k == 0) {
                this.f19727n.setVisibility(0);
                this.f19716c.setVisibility(8);
            } else {
                this.f19727n.setVisibility(4);
                this.f19716c.setVisibility(0);
                if (c7364b.f21374l > 1) {
                    if (this.f19722i.equals("fa")) {
                        if (c7364b.f21367c > 0) {
                            textView = this.f19717d;
                            a4 = C4522p.m8236a(R.string.count_contact_without_soroush_contact);
                            objArr2 = new Object[]{Integer.valueOf(c7364b.f21374l)};
                            format = String.format(a4, objArr2);
                            textView.setText(format);
                        } else {
                            textView = this.f19717d;
                            a3 = C4522p.m8236a(R.string.count_contact);
                            objArr = new Object[]{Integer.valueOf(c7364b.f21367c), Integer.valueOf(c7364b.f21374l)};
                        }
                    } else if (c7364b.f21367c > 0) {
                        textView = this.f19717d;
                        a4 = C4522p.m8236a(R.string.count_contact_without_soroush_contact);
                        objArr2 = new Object[]{C2491i.m6809b(c7364b.f21374l)};
                        format = String.format(a4, objArr2);
                        textView.setText(format);
                    } else {
                        textView = this.f19717d;
                        a3 = C4522p.m8236a(R.string.count_contact);
                        objArr = new Object[]{C2491i.m6809b(c7364b.f21367c), C2491i.m6809b(c7364b.f21374l)};
                    }
                } else if (this.f19722i.equals("fa")) {
                    if (c7364b.f21367c > 0) {
                        textView = this.f19717d;
                        a4 = C4522p.m8236a(R.string.count_contacts_without_soroush_contact);
                        objArr2 = new Object[]{Integer.valueOf(c7364b.f21374l)};
                        format = String.format(a4, objArr2);
                        textView.setText(format);
                    } else {
                        textView = this.f19717d;
                        a3 = C4522p.m8236a(R.string.count_contacts);
                        objArr = new Object[]{Integer.valueOf(c7364b.f21367c), Integer.valueOf(c7364b.f21374l)};
                    }
                } else if (c7364b.f21367c > 0) {
                    textView = this.f19717d;
                    a4 = C4522p.m8236a(R.string.count_contacts_without_soroush_contact);
                    objArr2 = new Object[]{C2491i.m6809b(c7364b.f21374l)};
                    format = String.format(a4, objArr2);
                    textView.setText(format);
                } else {
                    textView = this.f19717d;
                    a3 = C4522p.m8236a(R.string.count_contacts);
                    objArr = new Object[]{C2491i.m6809b(c7364b.f21367c), C2491i.m6809b(c7364b.f21374l)};
                }
                format = String.format(a3, objArr);
                textView.setText(format);
            }
            if (c7364b.f21365a) {
                this.f19720g.setVisibility(8);
            } else {
                this.f19720g.setVisibility(0);
            }
        }
        textView = this.f19726m;
        b = c7364b.f21366b;
        textView.setText(b);
        this.f19724k.setImageBitmap(null);
        if (c7364b.f21371g != null) {
        }
        if (c7364b.f21372h != null) {
            a = C1212c.m2872a(this.f19723j);
            obj = c7364b.f21372h;
        } else {
            a = C1212c.m2872a(this.f19723j);
            obj = Integer.valueOf(R.drawable.ic_place_holder_contact);
        }
        a2 = a.m10950a(obj).m3034a(C1248f.m2945b()).m3033a();
        a2.m3031a(this.f19724k);
        this.f19724k.setBackgroundColor(c7364b.f21373i);
        if (c7364b.f19504k == 0) {
            this.f19727n.setVisibility(4);
            this.f19716c.setVisibility(0);
            if (c7364b.f21374l > 1) {
                if (this.f19722i.equals("fa")) {
                    if (c7364b.f21367c > 0) {
                        textView = this.f19717d;
                        a3 = C4522p.m8236a(R.string.count_contacts);
                        objArr = new Object[]{C2491i.m6809b(c7364b.f21367c), C2491i.m6809b(c7364b.f21374l)};
                    } else {
                        textView = this.f19717d;
                        a4 = C4522p.m8236a(R.string.count_contacts_without_soroush_contact);
                        objArr2 = new Object[]{C2491i.m6809b(c7364b.f21374l)};
                        format = String.format(a4, objArr2);
                        textView.setText(format);
                    }
                } else if (c7364b.f21367c > 0) {
                    textView = this.f19717d;
                    a3 = C4522p.m8236a(R.string.count_contacts);
                    objArr = new Object[]{Integer.valueOf(c7364b.f21367c), Integer.valueOf(c7364b.f21374l)};
                } else {
                    textView = this.f19717d;
                    a4 = C4522p.m8236a(R.string.count_contacts_without_soroush_contact);
                    objArr2 = new Object[]{Integer.valueOf(c7364b.f21374l)};
                    format = String.format(a4, objArr2);
                    textView.setText(format);
                }
            } else if (this.f19722i.equals("fa")) {
                if (c7364b.f21367c > 0) {
                    textView = this.f19717d;
                    a3 = C4522p.m8236a(R.string.count_contact);
                    objArr = new Object[]{C2491i.m6809b(c7364b.f21367c), C2491i.m6809b(c7364b.f21374l)};
                } else {
                    textView = this.f19717d;
                    a4 = C4522p.m8236a(R.string.count_contact_without_soroush_contact);
                    objArr2 = new Object[]{C2491i.m6809b(c7364b.f21374l)};
                    format = String.format(a4, objArr2);
                    textView.setText(format);
                }
            } else if (c7364b.f21367c > 0) {
                textView = this.f19717d;
                a3 = C4522p.m8236a(R.string.count_contact);
                objArr = new Object[]{Integer.valueOf(c7364b.f21367c), Integer.valueOf(c7364b.f21374l)};
            } else {
                textView = this.f19717d;
                a4 = C4522p.m8236a(R.string.count_contact_without_soroush_contact);
                objArr2 = new Object[]{Integer.valueOf(c7364b.f21374l)};
                format = String.format(a4, objArr2);
                textView.setText(format);
            }
            format = String.format(a3, objArr);
            textView.setText(format);
        } else {
            this.f19727n.setVisibility(0);
            this.f19716c.setVisibility(8);
        }
        if (c7364b.f21365a) {
            this.f19720g.setVisibility(0);
        } else {
            this.f19720g.setVisibility(8);
        }
    }
}
