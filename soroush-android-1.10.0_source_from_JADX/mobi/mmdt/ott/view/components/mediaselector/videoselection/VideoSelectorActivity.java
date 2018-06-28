package mobi.mmdt.ott.view.components.mediaselector.videoselection;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import mobi.mmdt.componentsutils.p232b.p234b.C2475a;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.p359k.C2837a;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.view.components.mediaselector.videoselection.C6111a.C3222b;
import mobi.mmdt.ott.view.components.p402d.C7576b;
import mobi.mmdt.ott.view.tools.C4516l;

public class VideoSelectorActivity extends C7576b implements C3222b {
    public static String f24035m = "mov";
    private C6111a f24036n;

    public final void mo3661a(String str) {
        Intent intent = new Intent();
        intent.putExtra("KEY_VIDEO_PATH_RESULT", str);
        setResult(-1, intent);
        finish();
        overridePendingTransition(R.anim.anim_slide_in_right, R.anim.anim_slide_out_right);
    }

    public void onBackPressed() {
        super.onBackPressed();
        setResult(0);
        overridePendingTransition(R.anim.anim_slide_in_right, R.anim.anim_slide_out_right);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_media_video_selector);
        this.x = (Toolbar) findViewById(R.id.toolbar);
        m20723a(true, UIThemeManager.getmInstance().getIcon_not_selected_color());
        this.y = findViewById(R.id.shadow_line_top);
        if (C4516l.m8232a() && !C2837a.m7169a()) {
            onBackPressed();
        }
        String stringExtra = getIntent().getStringExtra("KEY_FOLDER_NAME");
        String stringExtra2 = getIntent().getStringExtra("KEY_FOLDER_PATH");
        Bundle bundle2 = new Bundle();
        bundle2.putString("KEY_FOLDER_NAME", stringExtra);
        bundle2.putString("KEY_FOLDER_PATH", stringExtra2);
        this.f24036n = new C6111a();
        this.f24036n.setArguments(bundle2);
        C2475a.m6719a((Activity) this, stringExtra);
        FragmentTransaction beginTransaction = getFragmentManager().beginTransaction();
        beginTransaction.replace(R.id.container_frame, this.f24036n);
        beginTransaction.setTransition(4099);
        beginTransaction.commit();
        m20721a(UIThemeManager.getmInstance().getPrimary_color(), UIThemeManager.getmInstance().getText_primary_new_design_color(), UIThemeManager.getmInstance().getText_primary_new_design_color());
        m20726u();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    public void onRestoreInstanceState(Bundle bundle) {
    }

    public void onSaveInstanceState(Bundle bundle) {
    }
}
