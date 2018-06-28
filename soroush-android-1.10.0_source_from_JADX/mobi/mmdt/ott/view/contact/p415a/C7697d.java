package mobi.mmdt.ott.view.contact.p415a;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.RelativeLayout;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.componentsutils.p232b.p234b.C2475a;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.view.components.p402d.C7576b;
import mobi.mmdt.ott.view.contact.p415a.C6121a.C3260c;
import mobi.mmdt.ott.view.tools.C4522p;

public abstract class C7697d extends C7576b implements C3260c {
    protected RelativeLayout f24107m;
    private C6121a f24108n;
    private EditText f24109o;

    class C32671 implements TextWatcher {
        final /* synthetic */ C7697d f10035a;

        C32671(C7697d c7697d) {
            this.f10035a = c7697d;
        }

        public final void afterTextChanged(Editable editable) {
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            this.f10035a.f24108n.m13884a(charSequence.toString());
        }
    }

    public final void mo3663a(String str) {
        mo3701b(str);
    }

    public abstract void mo3701b(String str);

    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.anim_slide_in_right, R.anim.anim_slide_out_right);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_contact_selection_list);
        this.x = (Toolbar) findViewById(R.id.toolbar);
        m20723a(true, UIThemeManager.getmInstance().getIcon_not_selected_color());
        C2475a.m6719a((Activity) this, C4522p.m8236a(R.string.start_conversation_with));
        this.f24107m = (RelativeLayout) findViewById(R.id.root_relativeLayout);
        this.f24109o = (EditText) findViewById(R.id.search_editText);
        if (this.f24109o != null) {
            this.f24109o.setMaxLines(1);
            this.f24109o.setSingleLine(true);
        }
        this.y = findViewById(R.id.shadow_line_top);
        if (this.f24108n == null) {
            this.f24108n = new C6121a();
        }
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            if (bundle.containsKey("KEY_FIRST_COMPLETELY_VISIBLE_ITEM_POSITION")) {
                bundle2.putInt("KEY_FIRST_COMPLETELY_VISIBLE_ITEM_POSITION", bundle.getInt("KEY_FIRST_COMPLETELY_VISIBLE_ITEM_POSITION"));
            }
            if (bundle.containsKey("KEY_SEARCH_FILTER")) {
                CharSequence string = bundle.getString("KEY_SEARCH_FILTER");
                bundle2.putString("KEY_SEARCH_FILTER", string);
                this.f24109o.setText(string);
            }
        }
        bundle2.putBoolean("KEY_MULTIPLE_CONTACT_SELECTION", false);
        this.f24108n.setArguments(bundle2);
        if (!this.f24108n.isDetached()) {
            FragmentTransaction beginTransaction = getFragmentManager().beginTransaction();
            beginTransaction.replace(R.id.container_frame, this.f24108n);
            beginTransaction.setTransition(4099);
            beginTransaction.commit();
        }
        this.f24109o.addTextChangedListener(new C32671(this));
        m20721a(UIThemeManager.getmInstance().getPrimary_color(), UIThemeManager.getmInstance().getText_primary_new_design_color(), UIThemeManager.getmInstance().getText_primary_new_design_color());
        m20726u();
        m20725t();
        C2491i.m6779a(UIThemeManager.getmInstance().getText_primary_color(), UIThemeManager.getmInstance().getText_primary_new_design_with_opacity_color(), UIThemeManager.getmInstance().getAccent_color(), this.f24109o);
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
        bundle.putInt("KEY_FIRST_COMPLETELY_VISIBLE_ITEM_POSITION", this.f24108n.f16439a.findFirstVisibleItemPosition());
        bundle.putString("KEY_SEARCH_FILTER", this.f24109o.getText().toString());
    }
}
