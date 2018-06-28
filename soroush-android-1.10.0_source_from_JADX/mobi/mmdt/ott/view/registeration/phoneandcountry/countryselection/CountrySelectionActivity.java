package mobi.mmdt.ott.view.registeration.phoneandcountry.countryselection;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.graphics.Point;
import android.os.Bundle;
import android.support.v4.view.C0559f;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.SearchView.OnQueryTextListener;
import android.support.v7.widget.Toolbar;
import android.view.Display;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.componentsutils.p232b.p234b.C2475a;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.view.components.p402d.C7576b;
import mobi.mmdt.ott.view.registeration.phoneandcountry.countryselection.C6249a.C4326a;
import mobi.mmdt.ott.view.tools.C4522p;

public class CountrySelectionActivity extends C7576b implements OnQueryTextListener, C4326a {
    private C6249a f24427m;

    public final void mo3679a(String str, String str2) {
        Intent intent = new Intent();
        intent.putExtra("KEY_COUNTRY_NAME_SELECTED", str);
        intent.putExtra("KEY_COUNTRY_CODE_SELECTED", str2);
        setResult(-1, intent);
        super.onBackPressed();
        overridePendingTransition(R.anim.anim_slide_in_right, R.anim.anim_slide_out_right);
    }

    public void onBackPressed() {
        setResult(0, new Intent());
        super.onBackPressed();
        overridePendingTransition(R.anim.anim_slide_in_right, R.anim.anim_slide_out_right);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_country_selection);
        C2475a.m6720a(getWindow(), (int) UIThemeManager.color_primary_dark_default_theme);
        this.x = (Toolbar) findViewById(R.id.toolbar);
        this.y = findViewById(R.id.shadow_line_top);
        m20723a(true, -1);
        C2475a.m6719a((Activity) this, C4522p.m8236a(R.string.country_selection));
        this.f24427m = new C6249a();
        FragmentTransaction beginTransaction = getFragmentManager().beginTransaction();
        beginTransaction.replace(R.id.container_frame, this.f24427m);
        beginTransaction.setTransition(4099);
        beginTransaction.commit();
        m20724b(-1, UIThemeManager.color_toolbar_sub_title_default_theme);
        m20726u();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_country, menu);
        MenuItem findItem = menu.findItem(R.id.action_search);
        findItem.setTitle(C4522p.m8236a(R.string.action_search));
        SearchView searchView = (SearchView) C0559f.m1236a(findItem);
        if (searchView != null) {
            ImageView imageView = (ImageView) searchView.findViewById(R.id.search_button);
            imageView.setImageResource(R.drawable.ic_search);
            C2491i.m6801a(imageView, -1);
            imageView = (ImageView) searchView.findViewById(R.id.search_close_btn);
            imageView.setImageResource(R.drawable.ic_close_gray);
            C2491i.m6801a(imageView, -1);
            TextView textView = (TextView) searchView.findViewById(R.id.search_src_text);
            textView.setTextColor(UIThemeManager.getmInstance().getText_primary_new_design_color());
            textView.setHintTextColor(UIThemeManager.getmInstance().getText_primary_new_design_with_opacity_color());
            Display defaultDisplay = getWindowManager().getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            searchView.setMaxWidth(point.x);
            searchView.setOnQueryTextListener(this);
        }
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    public boolean onQueryTextChange(String str) {
        C6249a c6249a = this.f24427m;
        List a = C6249a.m14526a(c6249a.f16978c, str);
        c6249a.f16977b.m14559a(C6249a.m14525a(a));
        if (a.isEmpty()) {
            c6249a.f16976a.setVisibility(0);
            return false;
        }
        c6249a.f16976a.setVisibility(8);
        return false;
    }

    public boolean onQueryTextSubmit(String str) {
        return false;
    }
}
