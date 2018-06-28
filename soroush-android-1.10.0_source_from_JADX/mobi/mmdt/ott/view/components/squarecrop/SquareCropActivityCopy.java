package mobi.mmdt.ott.view.components.squarecrop;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import com.theartofdev.edmodo.cropper.CropImageView;
import java.io.File;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.C2791c;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.view.components.ProgressWheel;
import mobi.mmdt.ott.view.components.p402d.C7576b;
import mobi.mmdt.ott.view.tools.C4522p;

public class SquareCropActivityCopy extends C7576b {
    public static int f24067n = 1001;
    boolean f24068m = true;
    C6119d f24069o;
    private String f24070p;
    private boolean f24071q;
    private ProgressWheel f24072r;
    private ViewGroup f24073s;
    private C3239b f24074t = new C3239b();

    private void m21172a(C3238a c3238a, String str) {
        getFragmentManager().beginTransaction().replace(R.id.container, C6119d.m13861a(c3238a, str)).commit();
    }

    private void m21173g() {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        this.f24070p = C2791c.m7109a().m7117c();
        intent.putExtra("output", Uri.fromFile(new File(this.f24070p)));
        intent.putExtra("android.intent.extra.sizeLimit", 10485760);
        startActivityForResult(intent, 2002);
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1) {
            switch (i) {
                case 2001:
                    if (intent.hasExtra("KEY_RESULT_ARRAYLIST_OF_PATH")) {
                        this.f24070p = (String) intent.getStringArrayListExtra("KEY_RESULT_ARRAYLIST_OF_PATH").get(0);
                        this.f24071q = true;
                        m21172a(C3238a.RECT, this.f24070p);
                        break;
                    }
                    break;
                case 2002:
                    if (this.f24070p != null) {
                        this.f24071q = true;
                        m21172a(C3238a.RECT, this.f24070p);
                        return;
                    }
                    break;
                default:
                    return;
            }
            return;
        }
        finish();
        overridePendingTransition(R.anim.anim_slide_in_right, R.anim.anim_slide_out_right);
    }

    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.anim_slide_in_right, R.anim.anim_slide_out_right);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r3) {
        /*
        r2 = this;
        super.onCreate(r3);
        r0 = 2131427420; // 0x7f0b005c float:1.8476456E38 double:1.053065065E-314;
        r2.setContentView(r0);
        if (r3 == 0) goto L_0x003b;
    L_0x000b:
        r0 = "KEY_IS_LAST_TAKE_PICTURE_ADDRESS_VALID";
        r0 = r3.containsKey(r0);
        if (r0 == 0) goto L_0x001b;
    L_0x0013:
        r0 = "KEY_IS_LAST_TAKE_PICTURE_ADDRESS_VALID";
        r0 = r3.getBoolean(r0);
        r2.f24071q = r0;
    L_0x001b:
        r0 = "KEY_LAST_CAMERA_TAKEN_ADDRESS";
        r0 = r3.containsKey(r0);
        if (r0 == 0) goto L_0x002b;
    L_0x0023:
        r0 = "KEY_LAST_CAMERA_TAKEN_ADDRESS";
        r0 = r3.getString(r0);
        r2.f24070p = r0;
    L_0x002b:
        r0 = "KEY_IMAGE_SELECTOR";
        r0 = r3.containsKey(r0);
        if (r0 == 0) goto L_0x003b;
    L_0x0033:
        r0 = "KEY_IMAGE_SELECTOR";
        r3 = r3.getInt(r0);
        f24067n = r3;
    L_0x003b:
        r3 = r2.getIntent();
        if (r3 == 0) goto L_0x006b;
    L_0x0041:
        r3 = r2.getIntent();
        r3 = r3.getExtras();
        if (r3 == 0) goto L_0x006b;
    L_0x004b:
        r3 = r2.getIntent();
        r3 = r3.getExtras();
        r0 = "KEY_IMAGE_SELECTOR";
        r3 = r3.containsKey(r0);
        if (r3 == 0) goto L_0x006b;
    L_0x005b:
        r3 = r2.getIntent();
        r3 = r3.getExtras();
        r0 = "KEY_IMAGE_SELECTOR";
        r3 = r3.getInt(r0);
        f24067n = r3;
    L_0x006b:
        r3 = r2.getIntent();
        if (r3 == 0) goto L_0x009b;
    L_0x0071:
        r3 = r2.getIntent();
        r3 = r3.getExtras();
        if (r3 == 0) goto L_0x009b;
    L_0x007b:
        r3 = r2.getIntent();
        r3 = r3.getExtras();
        r0 = "KEY_IS_FIX_ASPECT_RATIO";
        r3 = r3.containsKey(r0);
        if (r3 == 0) goto L_0x009b;
    L_0x008b:
        r3 = r2.getIntent();
        r3 = r3.getExtras();
        r0 = "KEY_IS_FIX_ASPECT_RATIO";
        r3 = r3.getBoolean(r0);
        r2.f24068m = r3;
    L_0x009b:
        r3 = mobi.mmdt.ott.view.tools.C4516l.m8232a();
        if (r3 == 0) goto L_0x00b0;
    L_0x00a1:
        r3 = mobi.mmdt.ott.logic.p359k.C2837a.m7169a();
        if (r3 != 0) goto L_0x00b0;
    L_0x00a7:
        r3 = f24067n;
        r0 = 1002; // 0x3ea float:1.404E-42 double:4.95E-321;
        if (r3 == r0) goto L_0x00b0;
    L_0x00ad:
        r2.onBackPressed();
    L_0x00b0:
        r3 = 2131297351; // 0x7f090447 float:1.8212644E38 double:1.053000802E-314;
        r3 = r2.findViewById(r3);
        r3 = (android.support.v7.widget.Toolbar) r3;
        r2.x = r3;
        r3 = mobi.mmdt.ott.logic.stheme.UIThemeManager.getmInstance();
        r3 = r3.getIcon_not_selected_color();
        r0 = 1;
        r2.m20723a(r0, r3);
        r3 = 2131297151; // 0x7f09037f float:1.8212239E38 double:1.0530007034E-314;
        r3 = r2.findViewById(r3);
        r3 = (android.view.ViewGroup) r3;
        r2.f24073s = r3;
        r3 = 2131297074; // 0x7f090332 float:1.8212083E38 double:1.0530006653E-314;
        r3 = r2.findViewById(r3);
        r3 = (mobi.mmdt.ott.view.components.ProgressWheel) r3;
        r2.f24072r = r3;
        r3 = 2131297212; // 0x7f0903bc float:1.8212363E38 double:1.0530007335E-314;
        r3 = r2.findViewById(r3);
        r2.y = r3;
        r3 = 2131689848; // 0x7f0f0178 float:1.9008723E38 double:1.0531947215E-314;
        r3 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r3);
        mobi.mmdt.componentsutils.p232b.p234b.C2475a.m6719a(r2, r3);
        r3 = r2.f24070p;
        if (r3 != 0) goto L_0x018b;
    L_0x00f4:
        r3 = r2.getIntent();
        if (r3 == 0) goto L_0x018b;
    L_0x00fa:
        r3 = r2.getIntent();
        r3 = r3.getExtras();
        if (r3 == 0) goto L_0x018b;
    L_0x0104:
        r3 = r2.getIntent();
        r3 = r3.getExtras();
        r1 = "KEY_IMAGE_SELECTOR";
        r3 = r3.containsKey(r1);
        if (r3 == 0) goto L_0x018b;
    L_0x0114:
        r3 = r2.getIntent();
        r3 = r3.getExtras();
        r1 = "KEY_IMAGE_SELECTOR";
        r3 = r3.getInt(r1);
        f24067n = r3;
        switch(r3) {
            case 1001: goto L_0x016b;
            case 1002: goto L_0x014b;
            case 1003: goto L_0x0128;
            default: goto L_0x0127;
        };
    L_0x0127:
        goto L_0x018b;
    L_0x0128:
        r3 = r2.getIntent();
        r3 = r3.getExtras();
        r1 = "KEY_IMAGE_PATH_EDITOR";
        r3 = r3.getString(r1);
        r2.f24070p = r3;
        r2.f24071q = r0;
        r3 = mobi.mmdt.ott.view.components.squarecrop.C3238a.RECT;
        r0 = r2.f24070p;
        r2.m21172a(r3, r0);
    L_0x0141:
        r3 = r2.getIntent();
        r0 = "KEY_IMAGE_SELECTOR";
        r3.removeExtra(r0);
        goto L_0x018b;
    L_0x014b:
        r3 = mobi.mmdt.ott.view.tools.C4516l.m8232a();
        if (r3 == 0) goto L_0x0161;
    L_0x0151:
        r3 = "android.permission.CAMERA";
        r3 = mobi.mmdt.ott.logic.p359k.C2837a.m7170a(r3);
        if (r3 != 0) goto L_0x0161;
    L_0x0159:
        r3 = "android.permission.CAMERA";
        r0 = 174; // 0xae float:2.44E-43 double:8.6E-322;
        mobi.mmdt.ott.logic.p359k.C2837a.m7167a(r2, r3, r0);
        goto L_0x0164;
    L_0x0161:
        r2.m21173g();
    L_0x0164:
        r3 = r2.getIntent();
        if (r3 == 0) goto L_0x018b;
    L_0x016a:
        goto L_0x018a;
    L_0x016b:
        r3 = new android.content.Intent;
        r0 = mobi.mmdt.ott.view.components.mediaselector.MainMediaSelectorActivity.class;
        r3.<init>(r2, r0);
        r0 = "EXTRA_SELECT_MODE";
        r1 = 2;
        r3.putExtra(r0, r1);
        r0 = "EXTRA_SELECTOR_TITLE";
        r1 = "Photos";
        r3.putExtra(r0, r1);
        r0 = 2001; // 0x7d1 float:2.804E-42 double:9.886E-321;
        r2.startActivityForResult(r3, r0);
        r3 = r2.getIntent();
        if (r3 == 0) goto L_0x018b;
    L_0x018a:
        goto L_0x0141;
    L_0x018b:
        r2.m20725t();
        r3 = mobi.mmdt.ott.logic.stheme.UIThemeManager.getmInstance();
        r3 = r3.getPrimary_color();
        r0 = mobi.mmdt.ott.logic.stheme.UIThemeManager.getmInstance();
        r0 = r0.getText_primary_new_design_color();
        r1 = mobi.mmdt.ott.logic.stheme.UIThemeManager.getmInstance();
        r1 = r1.getText_primary_new_design_color();
        r2.m20721a(r3, r0, r1);
        r2.m20726u();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.components.squarecrop.SquareCropActivityCopy.onCreate(android.os.Bundle):void");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_crop_done_bar, menu);
        MenuItem findItem = menu.findItem(R.id.action_done);
        C2491i.m6790a(findItem.getIcon(), UIThemeManager.getmInstance().getIcon_not_selected_color());
        MenuItem findItem2 = menu.findItem(R.id.action_left_rotate);
        C2491i.m6790a(findItem2.getIcon(), UIThemeManager.getmInstance().getIcon_not_selected_color());
        MenuItem findItem3 = menu.findItem(R.id.action_right_rotate);
        C2491i.m6790a(findItem3.getIcon(), UIThemeManager.getmInstance().getIcon_not_selected_color());
        findItem.setTitle(C4522p.m8236a(R.string.action_done));
        findItem2.setTitle(C4522p.m8236a(R.string.action_lef_rotate));
        findItem3.setTitle(C4522p.m8236a(R.string.action_right_rotate));
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            onBackPressed();
            return true;
        }
        if (itemId != R.id.action_done) {
            CropImageView cropImageView;
            C3240c c3240c;
            if (itemId == R.id.action_left_rotate) {
                if (this.f24069o != null) {
                    cropImageView = this.f24069o.f16433a;
                    c3240c = C3240c.ROTATE_M90D;
                }
            } else if (itemId == R.id.action_right_rotate && this.f24069o != null) {
                cropImageView = this.f24069o.f16433a;
                c3240c = C3240c.ROTATE_90D;
            }
            cropImageView.m6140a(c3240c.f9986g);
        } else if (this.f24070p != null) {
            C6119d c6119d = this.f24069o;
            c6119d.f16434b = this.f24070p;
            c6119d.f16433a.getCroppedImageAsync();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        if (this.f24069o != null) {
            this.f24069o.m13863a();
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 174 && iArr.length > 0) {
            if (iArr[0] == -1) {
                onBackPressed();
                return;
            }
            m21173g();
        }
    }

    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("KEY_IS_LAST_TAKE_PICTURE_ADDRESS_VALID", this.f24071q);
        bundle.putInt("KEY_IMAGE_SELECTOR", f24067n);
        if (this.f24071q) {
            bundle.putString("KEY_LAST_CAMERA_TAKEN_ADDRESS", this.f24070p);
        }
    }
}
