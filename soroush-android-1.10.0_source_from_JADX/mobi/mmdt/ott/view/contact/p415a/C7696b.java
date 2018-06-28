package mobi.mmdt.ott.view.contact.p415a;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.RelativeLayout;
import java.util.ArrayList;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.view.components.p402d.C7576b;
import mobi.mmdt.ott.view.contact.p415a.C6121a.C3260c;
import org.jivesoftware.smack.tcp.XMPPTCPConnection.PacketWriter;

public abstract class C7696b extends C7576b implements C3260c {
    protected RelativeLayout f24103m;
    protected boolean f24104n;
    private C6121a f24105o;
    private EditText f24106p;

    class C32621 implements TextWatcher {
        final /* synthetic */ C7696b f10030a;

        C32621(C7696b c7696b) {
            this.f10030a = c7696b;
        }

        public final void afterTextChanged(Editable editable) {
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            this.f10030a.f24105o.m13884a(charSequence.toString());
        }
    }

    protected static ArrayList<String> m21195h() {
        ArrayList<String> arrayList = new ArrayList();
        arrayList.addAll(C6121a.m13869a().keySet());
        return arrayList;
    }

    public final void mo3663a(String str) {
    }

    protected final void mo3643g() {
        ((MyApplication) getApplication()).f15912r.clear();
    }

    public final void m21198i() {
        if (this.f24106p != null && !this.f24106p.getText().toString().isEmpty()) {
            this.f24106p.setText("");
        }
    }

    public void onBackPressed() {
        setResult(0);
        mo3643g();
        super.onBackPressed();
        overridePendingTransition(R.anim.anim_slide_in_right, R.anim.anim_slide_out_right);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_contact_selection_list);
        this.x = (Toolbar) findViewById(R.id.toolbar);
        m20723a(true, UIThemeManager.getmInstance().getIcon_not_selected_color());
        this.f24103m = (RelativeLayout) findViewById(R.id.root_relativeLayout);
        this.f24106p = (EditText) findViewById(R.id.search_editText);
        this.y = findViewById(R.id.shadow_line_top);
        if (this.f24105o == null) {
            this.f24105o = new C6121a();
        }
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            if (bundle.containsKey("KEY_FIRST_COMPLETELY_VISIBLE_ITEM_POSITION")) {
                bundle2.putInt("KEY_FIRST_COMPLETELY_VISIBLE_ITEM_POSITION", bundle.getInt("KEY_FIRST_COMPLETELY_VISIBLE_ITEM_POSITION"));
            }
            if (bundle.containsKey("KEY_SEARCH_FILTER")) {
                CharSequence string = bundle.getString("KEY_SEARCH_FILTER");
                bundle2.putString("KEY_SEARCH_FILTER", string);
                this.f24106p.setText(string);
            }
        }
        boolean z = (getIntent() == null || getIntent().getExtras() == null || !getIntent().getExtras().containsKey("KEY_IS_CONTACT_SELECTION_LIMIT")) ? true : getIntent().getExtras().getBoolean("KEY_IS_CONTACT_SELECTION_LIMIT");
        bundle2.putInt("KEY_MAXIMUM_CONTACT_SELECTION", PacketWriter.QUEUE_SIZE);
        bundle2.putBoolean("KEY_MULTIPLE_CONTACT_SELECTION", true);
        bundle2.putBoolean("KEY_IS_CONTACT_SELECTION_LIMIT", z);
        this.f24105o.setArguments(bundle2);
        if (!this.f24105o.isDetached()) {
            FragmentTransaction beginTransaction = getFragmentManager().beginTransaction();
            beginTransaction.replace(R.id.container_frame, this.f24105o);
            beginTransaction.setTransition(4099);
            beginTransaction.commit();
        }
        this.f24106p.addTextChangedListener(new C32621(this));
        m20721a(UIThemeManager.getmInstance().getPrimary_color(), UIThemeManager.getmInstance().getText_primary_new_design_color(), UIThemeManager.getmInstance().getText_primary_new_design_color());
        m20726u();
        m20725t();
        C2491i.m6779a(UIThemeManager.getmInstance().getText_primary_color(), UIThemeManager.getmInstance().getText_primary_new_design_with_opacity_color(), UIThemeManager.getmInstance().getAccent_color(), this.f24106p);
    }

    protected void onDestroy() {
        super.onDestroy();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("KEY_FIRST_COMPLETELY_VISIBLE_ITEM_POSITION", this.f24105o.f16439a.findFirstVisibleItemPosition());
        bundle.putString("KEY_SEARCH_FILTER", this.f24106p.getText().toString());
    }
}
