package mobi.mmdt.ott.view.main;

import android.content.Intent;
import android.graphics.Point;
import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.view.Display;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup.LayoutParams;
import android.widget.EditText;
import android.widget.RelativeLayout;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.provider.p384f.C2973m;
import mobi.mmdt.ott.view.components.C7695a;
import mobi.mmdt.ott.view.tools.C4522p;

public class NewGroupActivity extends C7695a {
    private EditText f24750A;
    private EditText f24751B;
    private RelativeLayout f24752C;
    private TextInputLayout f24753z;

    protected final int mo3643g() {
        return R.drawable.ic_place_holder_group;
    }

    protected final String mo3695h() {
        return null;
    }

    protected final C2973m mo3696i() {
        return C2973m.GROUP;
    }

    protected final void mo3697j() {
    }

    protected final void mo3698k() {
        this.v = 0.75d;
        this.w = 0.5d;
    }

    protected final void mo3699l() {
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m21057e((int) R.layout.fragment_new_group);
        this.f24753z = (TextInputLayout) findViewById(R.id.groupName_textInputLayout);
        this.f24750A = (EditText) findViewById(R.id.groupName_editText);
        TextInputLayout textInputLayout = (TextInputLayout) findViewById(R.id.groupMotto_textInputLayout);
        this.f24751B = (EditText) findViewById(R.id.groupMotto_editText);
        this.f24750A.setFilters(new InputFilter[]{new LengthFilter(128)});
        this.f24750A.setMaxLines(1);
        this.f24750A.setSingleLine(true);
        this.f24750A.requestFocus();
        this.f24751B.setFilters(new InputFilter[]{new LengthFilter(140)});
        this.f24751B.setMaxLines(5);
        this.f24752C = (RelativeLayout) findViewById(R.id.root_layout);
        Display defaultDisplay = getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        LayoutParams layoutParams = this.f24752C.getLayoutParams();
        layoutParams.height = (int) (((float) (point.y - (C2491i.m6759a(getApplicationContext()) + C2491i.m6805b(getApplicationContext())))) + C2491i.m6804b(getApplicationContext(), 8.0f));
        if (getResources().getConfiguration().orientation == 2) {
            layoutParams.width = (int) (((double) point.x) * 0.75d);
            layoutParams.height = (int) (((double) point.y) * 1.1d);
        }
        C2491i.m6796a(this.f24752C, UIThemeManager.getmInstance().getRecycler_view_background_color());
        C2491i.m6780a(UIThemeManager.getmInstance().getText_primary_color(), UIThemeManager.getmInstance().getAccent_color(), this.f24751B, this.f24750A);
        C2491i.m6781a(UIThemeManager.getmInstance().getAccent_color(), this.f24753z, textInputLayout);
        m21053a(C4522p.m8236a(R.string.new_group_chat), false);
        m21062h(C2491i.m6806b(getApplicationContext(), null));
        m21069o();
        m21070p();
        if (bundle != null) {
            if (bundle.containsKey("KEY_GROUP_NAME")) {
                this.f24750A.setText(bundle.getString("KEY_GROUP_NAME"));
            }
            if (bundle.containsKey("KEY_GROUP_MOTTO")) {
                this.f24751B.setText(bundle.getString("KEY_GROUP_MOTTO"));
            }
        }
        if (this.s != null) {
            m21052a(this.s);
            m21055b(this.s);
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_done_bar_white, menu);
        C2491i.m6790a(menu.findItem(R.id.action_done).getIcon(), UIThemeManager.getmInstance().getMenu_item_white_color());
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.action_done) {
            String trim = this.f24750A.getText().toString().trim();
            String trim2 = this.f24751B.getText().toString().trim();
            if (trim.isEmpty()) {
                this.f24753z.setErrorEnabled(true);
                this.f24753z.setError(C4522p.m8236a(R.string.group_name_can_t_be_empty_));
                C4144a.m8005a(this.f24753z);
            } else {
                this.f24753z.setErrorEnabled(false);
                Intent intent = new Intent(getApplicationContext(), NewGroupContactSelectionListActivity.class);
                intent.putExtra("KEY_GROUP_NAME", trim);
                intent.putExtra("KEY_GROUP_MOTTO", trim2);
                intent.putExtra("KEY_GROUP_IMAGE", this.s);
                startActivity(intent);
                overridePendingTransition(R.anim.anim_slide_in_left, R.anim.anim_slide_out_left);
                finish();
            }
        }
        return super.onOptionsItemSelected(menuItem);
    }

    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        String obj = this.f24750A.getText().toString();
        if (!obj.isEmpty()) {
            bundle.putString("KEY_GROUP_NAME", obj);
        }
        obj = this.f24751B.getText().toString();
        if (!obj.isEmpty()) {
            bundle.putString("KEY_GROUP_MOTTO", obj);
        }
    }
}
