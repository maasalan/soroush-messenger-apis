package mobi.mmdt.ott.view.settings.mainsettings.changetheme;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.support.v7.app.C7406c;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.cocosw.bottomsheet.C1287c.C1286a;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mobi.mmdt.componentsutils.C2468a;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.componentsutils.p232b.p234b.C2475a;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.C2791c;
import mobi.mmdt.ott.logic.p261a.ae.p269a.C2596b;
import mobi.mmdt.ott.logic.p357j.p358a.C2832g;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.view.components.p398a.C7175a.C3101a;
import mobi.mmdt.ott.view.components.p401c.C3126i;
import mobi.mmdt.ott.view.components.p401c.C6073e;
import mobi.mmdt.ott.view.components.p401c.C6074f;
import mobi.mmdt.ott.view.components.p402d.C7576b;
import mobi.mmdt.ott.view.newdesign.mainpage.C4258b;
import mobi.mmdt.ott.view.settings.mainsettings.C4374a;
import mobi.mmdt.ott.view.settings.mainsettings.changetheme.p474a.C6972a;
import mobi.mmdt.ott.view.settings.mainsettings.changetheme.p586b.C7226a;
import mobi.mmdt.ott.view.tools.C4478a;
import mobi.mmdt.ott.view.tools.C4488b;
import mobi.mmdt.ott.view.tools.C4506e;
import mobi.mmdt.ott.view.tools.C4520n;
import mobi.mmdt.ott.view.tools.C4522p;
import mobi.mmdt.ott.view.tools.C4533r;
import mobi.mmdt.ott.view.tools.p479c.C4501c;
import mobi.mmdt.ott.view.tools.p482f.C4507a;

public class ThemeActivity extends C7576b implements C3101a, C3126i, C4374a {
    private ArrayList<File> f24451m;
    private C6971a f24452n;
    private TextView f24453o;
    private String f24454p = "";

    class C43933 implements Runnable {
        final /* synthetic */ ThemeActivity f12266a;

        C43933(ThemeActivity themeActivity) {
            this.f12266a = themeActivity;
        }

        public final void run() {
            C4258b.m8066a(ThemeActivity.m21400b(this.f12266a));
            C4478a.m8166d(ThemeActivity.m21402c(this.f12266a));
            this.f12266a.finish();
        }
    }

    private class C6971a extends C6074f {
        final /* synthetic */ ThemeActivity f19917a;

        public C6971a(ThemeActivity themeActivity, Context context) {
            this.f19917a = themeActivity;
            super(context);
        }

        public final void mo3181a(C6073e c6073e, int i) {
            super.mo3181a(c6073e, i);
        }

        public final /* synthetic */ void onBindViewHolder(ViewHolder viewHolder, int i) {
            super.mo3181a((C6073e) viewHolder, i);
        }

        public final /* synthetic */ ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            switch (i) {
                case 10001:
                    return new C6972a(this.f19917a, this.f16246b, viewGroup, this.f19917a);
                case 10002:
                    return new C6972a(this.f19917a, this.f16246b, viewGroup, this.f19917a);
                default:
                    return null;
            }
        }
    }

    static /* synthetic */ void m21398a(ThemeActivity themeActivity, String str) {
        if (C2468a.m6715l(str)) {
            Bundle bundle = new Bundle();
            bundle.putInt("dialog_id", 10002);
            bundle.putString("THEME_PATH", str);
            themeActivity.b_(bundle);
            return;
        }
        Toast.makeText(themeActivity, R.string.file_not_exists, 0).show();
    }

    private boolean m21399a(String str) {
        String ab = C2535a.m6888a().ab();
        if (!(str.equals(this.f24454p) || (str.equals("default") && ab.equals(this.f24454p)))) {
            if (!ab.equals(str)) {
                return false;
            }
        }
        return true;
    }

    static /* synthetic */ C7406c m21400b(ThemeActivity themeActivity) {
        return themeActivity;
    }

    static /* synthetic */ void m21401b(ThemeActivity themeActivity, String str) {
        if (new File(str).exists()) {
            C4533r.m8260e(themeActivity, str);
        } else {
            Toast.makeText(themeActivity, C4522p.m8236a(R.string.file_not_exists), 0).show();
        }
    }

    static /* synthetic */ C7406c m21402c(ThemeActivity themeActivity) {
        return themeActivity;
    }

    static /* synthetic */ C7406c m21405f(ThemeActivity themeActivity) {
        return themeActivity;
    }

    static /* synthetic */ void m21406h() {
        UIThemeManager.getmInstance().setDefaultTheme();
        m21409k();
    }

    private void m21408j() {
        List arrayList = new ArrayList();
        arrayList.add(new C7226a(C4522p.m8236a(R.string.default_theme), m21399a("default"), C4522p.m8236a(R.string.default_theme), 10001, 0));
        if (this.f24451m != null) {
            int i = 0;
            Iterator it = r0.f24451m.iterator();
            while (it.hasNext()) {
                File file = (File) it.next();
                if (file.getParent().equalsIgnoreCase(C2791c.m7109a().f8820f)) {
                    i++;
                    C7226a c7226a = new C7226a(C2468a.m6712i(file.getAbsolutePath()), m21399a(file.getAbsolutePath()), file.getAbsolutePath(), 10002, i);
                } else {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(file.getAbsolutePath());
                    stringBuilder.append("2");
                    i++;
                    C7226a c7226a2 = new C7226a(C2468a.m6712i(stringBuilder.toString()), m21399a(file.getAbsolutePath()), file.getAbsolutePath(), 10002, i);
                }
                arrayList.add(r5);
            }
        }
        r0.f24452n.m13673a(arrayList);
    }

    private static void m21409k() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = 0;
        r1 = 1;
        mobi.mmdt.ott.view.tools.p482f.C4507a.m8215a(r1, r1, r0);	 Catch:{ Exception -> 0x0012 }
        r0 = p000a.p001a.p002a.C0005c.m0a();	 Catch:{ Exception -> 0x0012 }
        r1 = new mobi.mmdt.ott.logic.a.ae.a.b;	 Catch:{ Exception -> 0x0012 }
        r1.<init>();	 Catch:{ Exception -> 0x0012 }
        r0.m9d(r1);	 Catch:{ Exception -> 0x0012 }
        return;
    L_0x0012:
        r0 = p000a.p001a.p002a.C0005c.m0a();
        r1 = new mobi.mmdt.ott.logic.a.ae.a.a;
        r1.<init>();
        r0.m9d(r1);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.settings.mainsettings.changetheme.ThemeActivity.k():void");
    }

    public final Dialog mo2299a(final Bundle bundle) {
        switch (bundle.getInt("dialog_id")) {
            case 10001:
                int i = bundle.getInt("ITEM_VIEW_TYPE");
                final String string = bundle.getString("THEME_PATH");
                C1286a c1286a = new C1286a(this);
                if (i == 10001) {
                    c1286a.f4030b.removeItem(R.id.action_remove_theme);
                }
                c1286a.f4034f = new OnClickListener(this) {
                    final /* synthetic */ ThemeActivity f12265b;

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        if (i == R.id.action_remove_theme) {
                            ThemeActivity.m21398a(this.f12265b, string);
                        } else if (i == R.id.action_share_theme) {
                            ThemeActivity.m21401b(this.f12265b, string);
                        }
                    }
                };
                C4506e.m8204a(this, c1286a, R.menu.menu_bottom_sheet_setting_theme);
                return c1286a.m3053a();
            case 10002:
                OnClickListener c43911 = new OnClickListener(this) {
                    final /* synthetic */ ThemeActivity f12263b;

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        if (C2535a.m6888a().ab().equals(bundle.getString("THEME_PATH"))) {
                            ThemeActivity.m21406h();
                        }
                        if (bundle.containsKey("THEME_PATH") && bundle.getString("THEME_PATH") != null) {
                            new File(bundle.getString("THEME_PATH")).delete();
                            this.f12263b.mo3643g();
                            this.f12263b.m21408j();
                        }
                    }
                };
                return C4488b.m8182a(this, C4522p.m8236a(R.string.remove_theme), C4522p.m8236a(R.string.are_you_sure_to_delete_this_theme), C4522p.m8236a(R.string.ok_cap), c43911, C4522p.m8236a(R.string.cancel_cap), null);
            case 10003:
                final int i2 = bundle.getInt("KEY_POSITION");
                if (this == null) {
                    return null;
                }
                return C4488b.m8182a(this, C4522p.m8236a(R.string.action_change_theme), C4522p.m8236a(R.string.are_you_sure_to_apply_this_theme), C4522p.m8236a(R.string.ok_cap), new OnClickListener(this) {
                    final /* synthetic */ ThemeActivity f12268b;

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        if (i2 == 0) {
                            ThemeActivity.m21409k();
                        } else {
                            File file = (File) this.f12268b.f24451m.get(i2 - 1);
                            String absolutePath = file.getAbsolutePath();
                            if (file.getParent().equalsIgnoreCase(C2791c.m7109a().f8820f)) {
                                C4507a.m8212a(absolutePath, true);
                            } else {
                                C4507a.m8212a(file.getParent(), false);
                            }
                        }
                        this.f12268b.f24452n.notifyDataSetChanged();
                    }
                }, C4522p.m8236a(R.string.cancel), null);
            default:
                return null;
        }
    }

    public final void mo3685a(int i, String str) {
        Bundle bundle = new Bundle();
        bundle.putInt("dialog_id", 10001);
        bundle.putInt("ITEM_VIEW_TYPE", i);
        bundle.putString("THEME_PATH", str);
        b_(bundle);
    }

    public final void mo2234c(int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("dialog_id", 10003);
        bundle.putInt("KEY_POSITION", i);
        b_(bundle);
    }

    public final void mo2235d(int i) {
    }

    protected final void mo3643g() {
        File file = new File(C2791c.m7109a().f8820f);
        if (file.exists()) {
            this.f24451m = (ArrayList) C2468a.m6699a(file, UIThemeManager.KEY_THEME_EXTENSION, this.f24454p);
        }
    }

    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.anim_slide_in_right, R.anim.anim_slide_out_right);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_theme);
        this.f24454p = C2535a.m6888a().ac();
        mo3643g();
        this.x = (Toolbar) findViewById(R.id.toolbar);
        m20723a(true, UIThemeManager.getmInstance().getIcon_not_selected_color());
        this.y = findViewById(R.id.shadow_line_top);
        this.f24452n = new C6971a(this, this);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        this.f24453o = (TextView) findViewById(R.id.textChannel);
        C4520n.m8234a(this.f24453o);
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            recyclerView.setAdapter(this.f24452n);
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
        }
        m21408j();
        C2475a.m6719a((Activity) this, C4522p.m8236a(R.string.theme_settings));
        m20725t();
        m20721a(UIThemeManager.getmInstance().getPrimary_color(), UIThemeManager.getmInstance().getText_primary_new_design_color(), UIThemeManager.getmInstance().getText_primary_new_design_color());
        C2491i.m6802a(this.f24453o, UIThemeManager.getmInstance().getText_primary_color());
        C2491i.m6796a(this.f24453o, UIThemeManager.getmInstance().getSpacer_view_color());
        C2491i.m6821b(this.f24453o, UIThemeManager.getmInstance().getInput_link_message_text_color());
        m20726u();
    }

    public void onEvent(C2596b c2596b) {
        runOnUiThread(new C43933(this));
    }

    public void onEvent(C2832g c2832g) {
        final String str = c2832g.f8913a;
        runOnUiThread(new Runnable(this) {
            final /* synthetic */ ThemeActivity f12270b;

            public final void run() {
                C4501c.m8189a().m8193b();
                if (str != null && !str.isEmpty()) {
                    C4478a.m8146a(ThemeActivity.m21405f(this.f12270b), str, null, null, true);
                }
            }
        });
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
    }
}
