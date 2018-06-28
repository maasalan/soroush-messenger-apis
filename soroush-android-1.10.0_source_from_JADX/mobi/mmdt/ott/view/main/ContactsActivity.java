package mobi.mmdt.ott.view.main;

import android.app.Activity;
import android.app.Dialog;
import android.app.FragmentTransaction;
import android.app.SearchManager;
import android.graphics.Point;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout.C0258a;
import android.support.v4.app.C0401p;
import android.support.v4.app.Fragment;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.SearchView.OnCloseListener;
import android.support.v7.widget.SearchView.OnQueryTextListener;
import android.support.v7.widget.Toolbar;
import android.view.Display;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.AccelerateInterpolator;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.cocosw.bottomsheet.C1287c.C1286a;
import java.util.Timer;
import java.util.TimerTask;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.componentsutils.p232b.p234b.C2475a;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.view.components.p398a.C7176b;
import mobi.mmdt.ott.view.components.p398a.C7176b.C3102a;
import mobi.mmdt.ott.view.components.p402d.C7576b;
import mobi.mmdt.ott.view.contact.p415a.C6121a.C3260c;
import mobi.mmdt.ott.view.main.C4157b.C41451;
import mobi.mmdt.ott.view.main.p452b.C6918b;
import mobi.mmdt.ott.view.newdesign.mainpage.p465a.C4254a;
import mobi.mmdt.ott.view.tools.C4506e;
import mobi.mmdt.ott.view.tools.C4509g;
import mobi.mmdt.ott.view.tools.C4522p;

public class ContactsActivity extends C7576b implements OnClickListener, C3102a, C3260c {
    private C6918b f24351m;
    private SearchView f24352n;
    private String f24353o = "";
    private boolean f24354p = false;
    private Timer f24355q = null;
    private boolean f24356r = false;
    private C4254a f24357s;
    private C4509g f24358t = C4509g.WITH_INVITE;

    class C41261 implements OnClickListener {
        final /* synthetic */ ContactsActivity f11807a;

        C41261(ContactsActivity contactsActivity) {
            this.f11807a = contactsActivity;
        }

        public final void onClick(View view) {
            ((C0258a) this.f11807a.x.getLayoutParams()).f934a = 16;
            this.f11807a.f24356r = true;
            this.f11807a.f24357s.m8057a();
        }
    }

    static /* synthetic */ class C41294 {
        static final /* synthetic */ int[] f11811a = new int[C4509g.values().length];

        static {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r0 = mobi.mmdt.ott.view.tools.C4509g.values();
            r0 = r0.length;
            r0 = new int[r0];
            f11811a = r0;
            r0 = f11811a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = mobi.mmdt.ott.view.tools.C4509g.WITH_INVITE;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = f11811a;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = mobi.mmdt.ott.view.tools.C4509g.WITH_NEW_SYNC_INVITE;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;	 Catch:{ NoSuchFieldError -> 0x001f }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.main.ContactsActivity.4.<clinit>():void");
        }
    }

    class C62302 implements OnCloseListener {
        final /* synthetic */ ContactsActivity f16861a;

        C62302(ContactsActivity contactsActivity) {
            this.f16861a = contactsActivity;
        }

        public final boolean onClose() {
            ((C0258a) this.f16861a.x.getLayoutParams()).f934a = 5;
            this.f16861a.f24356r = false;
            this.f16861a.f24357s.f12026a.animate().translationY(0.0f).setInterpolator(new AccelerateInterpolator()).start();
            return false;
        }
    }

    class C62313 implements OnQueryTextListener {
        final /* synthetic */ ContactsActivity f16862a;

        C62313(ContactsActivity contactsActivity) {
            this.f16862a = contactsActivity;
        }

        public final boolean onQueryTextChange(final String str) {
            this.f16862a.f24353o = str;
            if (!this.f16862a.f24354p) {
                this.f16862a.f24354p = true;
            }
            if (this.f16862a.f24355q != null) {
                this.f16862a.f24355q.cancel();
                this.f16862a.f24355q.purge();
            }
            this.f16862a.f24355q = new Timer();
            this.f16862a.f24355q.schedule(new TimerTask(this) {
                final /* synthetic */ C62313 f11810b;

                class C41271 implements Runnable {
                    final /* synthetic */ C41281 f11808a;

                    C41271(C41281 c41281) {
                        this.f11808a = c41281;
                    }

                    public final void run() {
                        if (this.f11808a.f11810b.f16862a.f24351m != null) {
                            this.f11808a.f11810b.f16862a.f24351m.m17878a(str);
                        }
                    }
                }

                public final void run() {
                    this.f11810b.f16862a.f24354p = false;
                    this.f11810b.f16862a.runOnUiThread(new C41271(this));
                }
            }, 300);
            return false;
        }

        public final boolean onQueryTextSubmit(String str) {
            return false;
        }
    }

    public final Dialog mo2398a(Bundle bundle) {
        C1286a c1286a = new C1286a(this);
        c1286a.f4034f = new C41451(this);
        C4506e.m8204a(this, c1286a, R.menu.context_menu_contacts_list_fab_click);
        return c1286a.m3053a();
    }

    public final void mo3663a(String str) {
    }

    public void onBackPressed() {
        if (this.f24352n.isIconified()) {
            super.onBackPressed();
        } else {
            this.f24352n.setQuery("", false);
            this.f24352n.setIconified(true);
            this.f24356r = false;
        }
        overridePendingTransition(R.anim.anim_slide_in_right, R.anim.anim_slide_out_right);
    }

    public void onClick(View view) {
        Fragment a = C7176b.m18968a(this);
        C0401p a2 = m19188c().mo254a();
        a2.mo237a(a, "tag");
        a2.mo244d();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_contact_under_fab);
        this.x = (Toolbar) findViewById(R.id.toolbar);
        this.y = findViewById(R.id.shadow_line_top);
        View findViewById = findViewById(R.id.root_layout);
        if (!(getIntent() == null || getIntent().getExtras() == null)) {
            C4509g c4509g = (C4509g) getIntent().getExtras().get("KEY_CONTACTS_ACTIVITY_TYPE");
            if (c4509g != null) {
                this.f24358t = c4509g;
            }
        }
        this.f24351m = C41294.f11811a[this.f24358t.ordinal()] != 1 ? C6918b.m17866a(false, true) : C6918b.m17866a(true, false);
        this.f24357s = new C4254a(findViewById);
        this.f24357s.m8059a((OnClickListener) this);
        FragmentTransaction beginTransaction = getFragmentManager().beginTransaction();
        beginTransaction.replace(R.id.container_frame, this.f24351m);
        beginTransaction.setTransition(4099);
        beginTransaction.commit();
        C2475a.m6719a((Activity) this, C4522p.m8236a(R.string.contacts_setting_item));
        m20721a(UIThemeManager.getmInstance().getPrimary_color(), UIThemeManager.getmInstance().getText_primary_new_design_color(), UIThemeManager.getmInstance().getText_primary_new_design_color());
        m20726u();
        m20725t();
        C2491i.m6779a(UIThemeManager.getmInstance().getText_primary_color(), UIThemeManager.getmInstance().getText_primary_new_design_with_opacity_color(), UIThemeManager.getmInstance().getAccent_color(), new EditText[0]);
        m20723a(true, UIThemeManager.getmInstance().getIcon_not_selected_color());
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.contacts_under_fab_activity_menu, menu);
        MenuItem findItem = menu.findItem(R.id.action_search);
        SearchManager searchManager = (SearchManager) getSystemService("search");
        if (findItem != null) {
            this.f24352n = (SearchView) findItem.getActionView();
            if (this.f24352n != null) {
                if (searchManager != null) {
                    this.f24352n.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));
                }
                this.f24352n = (SearchView) findItem.getActionView();
                ImageView imageView = (ImageView) this.f24352n.findViewById(R.id.search_button);
                imageView.setImageResource(R.drawable.ic_search);
                C2491i.m6801a(imageView, UIThemeManager.getmInstance().getIcon_not_selected_color());
                imageView = (ImageView) this.f24352n.findViewById(R.id.search_close_btn);
                imageView.setImageResource(R.drawable.ic_close_gray);
                C2491i.m6801a(imageView, UIThemeManager.getmInstance().getIcon_not_selected_color());
                View view = (TextView) this.f24352n.findViewById(R.id.search_src_text);
                view.setTextColor(UIThemeManager.getmInstance().getText_primary_new_design_color());
                view.setHintTextColor(UIThemeManager.getmInstance().getText_primary_new_design_with_opacity_color());
                C2491i.m6818b(view, UIThemeManager.getmInstance().getAccent_color());
                Display defaultDisplay = getWindowManager().getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                this.f24352n.setMaxWidth(point.x);
            }
        }
        this.f24352n.setOnSearchClickListener(new C41261(this));
        this.f24352n.setOnCloseListener(new C62302(this));
        if (this.f24356r) {
            this.f24352n.setIconified(false);
            this.f24352n.setQuery(this.f24353o, true);
            if (!this.f24353o.isEmpty()) {
                if (this.f24351m != null) {
                    this.f24351m.m17878a(this.f24353o);
                }
                this.f24354p = false;
            }
        }
        this.f24352n.setImeOptions(this.f24352n.getImeOptions() | 268435456);
        this.f24352n.setOnQueryTextListener(new C62313(this));
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    protected void onResume() {
        super.onResume();
        m20723a(true, UIThemeManager.getmInstance().getIcon_not_selected_color());
        C2475a.m6719a((Activity) this, C4522p.m8236a(R.string.contacts_setting_item));
    }
}
