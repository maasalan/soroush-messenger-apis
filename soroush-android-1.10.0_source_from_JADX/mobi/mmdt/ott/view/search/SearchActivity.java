package mobi.mmdt.ott.view.search;

import android.app.FragmentManager;
import android.os.Bundle;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.view.components.p402d.C7576b;

public class SearchActivity extends C7576b {
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(0, 0);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_search);
        FragmentManager fragmentManager = getFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.search_activity_frameLayout, C6257d.m14586b()).commit();
    }
}
