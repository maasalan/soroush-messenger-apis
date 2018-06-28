package mobi.mmdt.ott.view.block;

import android.app.Activity;
import android.app.Dialog;
import android.app.LoaderManager.LoaderCallbacks;
import android.content.Context;
import android.content.CursorLoader;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.Loader;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.C0401p;
import android.support.v4.app.Fragment;
import android.support.v7.app.C7406c;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.cocosw.bottomsheet.C1287c.C1286a;
import com.p072b.p073a.p074a.C1063i;
import com.p196h.p197a.C2119a;
import java.io.Serializable;
import java.util.ArrayList;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.componentsutils.p232b.p234b.C2475a;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.C2808d;
import mobi.mmdt.ott.logic.p261a.p276b.C2622a;
import mobi.mmdt.ott.logic.p261a.p276b.C2622a.C2621a;
import mobi.mmdt.ott.logic.p261a.p276b.C2624e;
import mobi.mmdt.ott.logic.p261a.p276b.C5908d;
import mobi.mmdt.ott.logic.p261a.p276b.C6679b;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.provider.p389k.C3000b;
import mobi.mmdt.ott.provider.p389k.C6034d;
import mobi.mmdt.ott.provider.p389k.C6035f;
import mobi.mmdt.ott.view.block.p553a.C6819a;
import mobi.mmdt.ott.view.block.p595b.C7320a;
import mobi.mmdt.ott.view.components.p398a.C7175a;
import mobi.mmdt.ott.view.components.p398a.C7175a.C3101a;
import mobi.mmdt.ott.view.components.p401c.C3126i;
import mobi.mmdt.ott.view.components.p401c.C6073e;
import mobi.mmdt.ott.view.components.p401c.C6827b;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.components.p402d.C7576b;
import mobi.mmdt.ott.view.main.p452b.C4153a;
import mobi.mmdt.ott.view.tools.C4478a;
import mobi.mmdt.ott.view.tools.C4506e;
import mobi.mmdt.ott.view.tools.C4508f;
import mobi.mmdt.ott.view.tools.C4513i;
import mobi.mmdt.ott.view.tools.C4522p;
import mobi.mmdt.ott.view.tools.p479c.C4501c;

public class BlockActivity extends C7576b implements LoaderCallbacks<Cursor>, C3101a, C3126i {
    public static String f23920m = "";
    private RecyclerView f23921n;
    private C7172a f23922o;
    private RelativeLayout f23923p;
    private LinearLayout f23924q;
    private FrameLayout f23925r;
    private TextView f23926s;

    class C30352 implements OnClickListener {
        final /* synthetic */ BlockActivity f9515a;

        C30352(BlockActivity blockActivity) {
            this.f9515a = blockActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            if (i == R.id.action_unblock_user) {
                BlockActivity.m20951b(this.f9515a);
            }
        }
    }

    class C30374 implements Runnable {
        final /* synthetic */ BlockActivity f9518a;

        C30374(BlockActivity blockActivity) {
            this.f9518a = blockActivity;
        }

        public final void run() {
            C4501c.m8189a().m8193b();
        }
    }

    public class C7172a extends C6827b implements C2119a {
        final /* synthetic */ BlockActivity f20623a;

        public C7172a(BlockActivity blockActivity, Context context) {
            this.f20623a = blockActivity;
            super(context);
        }

        public final Character mo3448a(int i) {
            char c;
            if (mo2237a().getCount() == 0) {
                c = C4153a.values()[C4153a.values().length - 1].name().toCharArray()[0];
            } else {
                if (i >= mo2237a().getCount()) {
                    i = mo2237a().getCount() - 1;
                }
                c = ((C7320a) m17257b(i)).f21066a.charAt(0);
                int i2 = 65;
                if (c < 'A' || c > 'Z') {
                    i2 = 97;
                    if (c < 'a' || c > 'z') {
                        i = (c < '0' || c > '9') ? C4153a.values().length - 1 : 0;
                        c = C4153a.values()[i].name().toCharArray()[0];
                    }
                }
                i = (c - i2) + 1;
                c = C4153a.values()[i].name().toCharArray()[0];
            }
            return Character.valueOf(c);
        }

        public final C6073e mo3449a(ViewGroup viewGroup, int i) {
            return new C6819a(BlockActivity.m20954e(this.f20623a), (C3126i) BlockActivity.m20956f(this.f20623a), this.f19501b, viewGroup);
        }

        protected final C6829g mo3450a(Cursor cursor, int i) {
            int i2 = cursor.getInt(cursor.getColumnIndex("_id"));
            String string = cursor.getString(cursor.getColumnIndex("members_moto"));
            String string2 = cursor.getString(cursor.getColumnIndex("members_avatar_thumbnail_url"));
            String string3 = cursor.getString(cursor.getColumnIndex("members_local_image_uri"));
            String string4 = cursor.getString(cursor.getColumnIndex("members_user_id"));
            return new C7320a(i2, string4, C4508f.m8222a(cursor.getInt(cursor.getColumnIndex("members_is_local_user")) != 0, cursor.getString(cursor.getColumnIndex("members_local_name")), cursor.getString(cursor.getColumnIndex("members_nick_name")), cursor.getString(cursor.getColumnIndex("members_local_phone_number"))), string, string2, string3, C2491i.m6806b(this.f, string4), cursor.getPosition());
        }

        public final /* synthetic */ ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return mo3449a(viewGroup, i);
        }
    }

    static /* synthetic */ C7406c m20950a(BlockActivity blockActivity) {
        return blockActivity;
    }

    static /* synthetic */ void m20951b(BlockActivity blockActivity) {
        final C1063i c6679b = new C6679b(new C2622a(f23920m, C2621a.f8520b));
        C2808d.m7148b(c6679b);
        blockActivity.runOnUiThread(new Runnable(blockActivity) {
            final /* synthetic */ BlockActivity f9517b;

            public final void run() {
                C4501c.m8189a().m8192a(BlockActivity.m20952c(this.f9517b), c6679b);
            }
        });
    }

    static /* synthetic */ C7406c m20952c(BlockActivity blockActivity) {
        return blockActivity;
    }

    static /* synthetic */ C7406c m20953d(BlockActivity blockActivity) {
        return blockActivity;
    }

    static /* synthetic */ C7406c m20954e(BlockActivity blockActivity) {
        return blockActivity;
    }

    private void m20955e(int i) {
        Cursor a = this.f23922o.mo2237a();
        a.moveToFirst();
        a.move(i);
        String string = a.getString(a.getColumnIndex("members_user_id"));
        String a2 = C4508f.m8222a(a.getInt(a.getColumnIndex("members_is_local_user")) != 0, a.getString(a.getColumnIndex("members_local_name")), a.getString(a.getColumnIndex("members_nick_name")), a.getString(a.getColumnIndex("members_local_phone_number")));
        Bundle bundle = new Bundle();
        bundle.putInt("dialog_id", 332);
        bundle.putInt("KEY_DIALOG_MENU_RES_ID", R.menu.context_menu_block_list_long_click);
        bundle.putString("KEY_DIALOG_USER_NAME", a2);
        bundle.putString("KEY_DIALOG_USER_ID", string);
        b_(bundle);
    }

    static /* synthetic */ C7406c m20956f(BlockActivity blockActivity) {
        return blockActivity;
    }

    public final Dialog mo2299a(Bundle bundle) {
        if (bundle.getInt("dialog_id") != 332) {
            return null;
        }
        int i = bundle.getInt("KEY_DIALOG_MENU_RES_ID");
        bundle.getString("KEY_DIALOG_USER_NAME", "");
        f23920m = bundle.getString("KEY_DIALOG_USER_ID", "");
        C1286a c1286a = new C1286a(this);
        c1286a.f4034f = new C30352(this);
        C4506e.m8204a(this, c1286a, i);
        return c1286a.m3053a();
    }

    public final void b_(Bundle bundle) {
        Fragment k = C7175a.m18964k(bundle);
        C0401p a = m19188c().mo254a();
        a.mo237a(k, "tag");
        a.mo244d();
    }

    public final void mo2234c(int i) {
        m20955e(i);
    }

    public final void mo2235d(int i) {
        m20955e(i);
    }

    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.anim_slide_in_right, R.anim.anim_slide_out_right);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_block);
        this.x = (Toolbar) findViewById(R.id.toolbar);
        m20723a(true, UIThemeManager.getmInstance().getIcon_not_selected_color());
        this.f23922o = new C7172a(this, this);
        this.f23923p = (RelativeLayout) findViewById(R.id.root_relativeLayout);
        this.f23921n = (RecyclerView) findViewById(R.id.recycler_view);
        this.y = findViewById(R.id.shadow_line_top);
        this.f23925r = (FrameLayout) findViewById(R.id.empty_state_frameLayout_image);
        this.f23924q = (LinearLayout) findViewById(R.id.empty_state_linearLayout);
        this.f23926s = (TextView) findViewById(R.id.empty_state_textView);
        if (this.f23921n != null) {
            this.f23921n.setHasFixedSize(true);
            this.f23921n.setAdapter(this.f23922o);
        }
        RecyclerView recyclerView = this.f23921n;
        int i = 0;
        if (recyclerView.getLayoutManager() != null) {
            i = ((LinearLayoutManager) recyclerView.getLayoutManager()).findFirstCompletelyVisibleItemPosition();
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.scrollToPosition(i);
        getLoaderManager().initLoader(33, null, this);
        C2475a.m6719a((Activity) this, C4522p.m8236a(R.string.blocked_contacts));
        C2491i.m6786a((Activity) this, this.f23925r);
        m20721a(UIThemeManager.getmInstance().getPrimary_color(), UIThemeManager.getmInstance().getText_primary_new_design_color(), UIThemeManager.getmInstance().getText_primary_new_design_color());
        m20725t();
        C2491i.m6802a(this.f23926s, UIThemeManager.getmInstance().getText_primary_color());
        m20726u();
    }

    public Loader<Cursor> onCreateLoader(int i, Bundle bundle) {
        String[] strArr = new String[]{"_id", "members_avatar_url", "members_avatar_thumbnail_url", "members_local_name", "members_nick_name", "members_is_local_user", "members_moto", "members_local_image_uri", "members_user_id", "members_local_phone_number", "members_extra"};
        String[] strArr2 = new String[1];
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(C2621a.f8519a - 1);
        strArr2[0] = stringBuilder.toString();
        return new CursorLoader(MyApplication.m12952b(), C3000b.f9413a, strArr, "members_extra = ?", strArr2, "members_nick_name COLLATE UNICODE ASC ");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_contact_block_bar, menu);
        MenuItem findItem = menu.findItem(R.id.action_add_contact);
        findItem.setTitle(C4522p.m8236a(R.string.action_block_contact));
        C2491i.m6790a(findItem.getIcon(), UIThemeManager.getmInstance().getIcon_not_selected_color());
        return super.onCreateOptionsMenu(menu);
    }

    protected void onDestroy() {
        super.onDestroy();
        getLoaderManager().destroyLoader(33);
    }

    public void onEvent(final C5908d c5908d) {
        runOnUiThread(new Runnable(this) {
            final /* synthetic */ BlockActivity f9520b;

            public final void run() {
                C4501c.m8189a().m8193b();
                C4513i.m8228a(BlockActivity.m20953d(this.f9520b), c5908d.f8890a);
            }
        });
    }

    public void onEvent(C2624e c2624e) {
        runOnUiThread(new C30374(this));
    }

    public /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        LinearLayout linearLayout;
        int i;
        Cursor cursor = (Cursor) obj;
        if (this.f23922o != null) {
            this.f23922o.m13684c(cursor);
            if (cursor.getCount() > 0) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(cursor.getCount());
                stringBuilder.append(" ");
                stringBuilder.append(C4522p.m8236a(R.string.block_contacts));
                C2475a.m6721b(this, stringBuilder.toString());
                linearLayout = this.f23924q;
                i = 8;
                linearLayout.setVisibility(i);
            }
            C2475a.m6721b(this, C4522p.m8236a(R.string.empty));
        }
        linearLayout = this.f23924q;
        i = 0;
        linearLayout.setVisibility(i);
    }

    public void onLoaderReset(Loader<Cursor> loader) {
        if (this.f23922o != null) {
            this.f23922o.m13684c(null);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            onBackPressed();
            return true;
        } else if (itemId != R.id.action_add_contact) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            C6035f c6035f = new C6035f();
            String[] strArr = new String[1];
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(C2621a.f8519a - 1);
            strArr[0] = stringBuilder.toString();
            ((C6035f) c6035f.m13524c(strArr).m7368c()).m13526i();
            C6034d b = c6035f.m13522b(MyApplication.m12952b());
            final ArrayList arrayList = new ArrayList(b.getCount());
            if (b.moveToFirst()) {
                do {
                    arrayList.add(b.m13510b());
                } while (b.moveToNext());
            }
            b.close();
            new Thread(new Runnable(this) {
                final /* synthetic */ BlockActivity f9514b;

                class C30331 implements Runnable {
                    final /* synthetic */ C30341 f9512a;

                    C30331(C30341 c30341) {
                        this.f9512a = c30341;
                    }

                    public final void run() {
                        Activity a = BlockActivity.m20950a(this.f9512a.f9514b);
                        Serializable serializable = arrayList;
                        Intent intent = new Intent(a, AddParticipantsBlockContactSelectionListActivity.class);
                        intent.putExtra("KEY_CHECKED_USERNAME_ARRAYLIST", serializable);
                        if (a != null) {
                            a.startActivity(intent);
                            C4478a.m8165c(a, true);
                        }
                    }
                }

                public final void run() {
                    this.f9514b.runOnUiThread(new C30331(this));
                }
            }).start();
            return true;
        }
    }
}
