package mobi.mmdt.ott.view.settings.mainsettings.changebackground;

import android.app.Activity;
import android.app.Dialog;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.app.C0401p;
import android.support.v4.app.Fragment;
import android.support.v4.p029a.C0346c;
import android.support.v7.app.C7406c;
import android.support.v7.widget.Toolbar;
import android.text.InputFilter;
import android.text.InputFilter.AllCaps;
import android.text.InputFilter.LengthFilter;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.p139e.p140a.C1575c;
import com.p139e.p140a.C1575c.C1573a;
import com.p139e.p140a.C1576d;
import com.p139e.p140a.C1581e.C1577a;
import com.p139e.p140a.C1581e.C1578b;
import com.p139e.p140a.C1581e.C1579c;
import com.p139e.p140a.p141a.C1559a;
import com.p139e.p140a.p141a.C1561b;
import com.p139e.p140a.p141a.C1561b.C15601;
import com.p139e.p140a.p141a.C1563c;
import com.p139e.p140a.p143c.C5391b;
import com.p139e.p140a.p143c.C5392c;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import mobi.mmdt.componentsutils.p232b.p234b.C2475a;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.p359k.C2837a;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.view.components.mediaselector.MainMediaSelectorActivity;
import mobi.mmdt.ott.view.components.p398a.C7175a.C3101a;
import mobi.mmdt.ott.view.components.p398a.C7177c;
import mobi.mmdt.ott.view.components.p398a.C7177c.C3103a;
import mobi.mmdt.ott.view.components.p402d.C7576b;
import mobi.mmdt.ott.view.settings.mainsettings.changebackground.C6263a.C6969a;
import mobi.mmdt.ott.view.settings.mainsettings.changebackground.p585b.C7225a;
import mobi.mmdt.ott.view.settings.mainsettings.changebackground.p585b.C7390b;
import mobi.mmdt.ott.view.tools.C4488b;
import mobi.mmdt.ott.view.tools.C4516l;
import mobi.mmdt.ott.view.tools.C4522p;
import mobi.mmdt.ott.view.tools.p482f.C4507a;

public class ChangeBackgroundConversationActivity extends C7576b implements C3101a, C3103a, C6969a {
    public C4386a f24439m;
    protected String f24440n;
    int f24441o = -1;
    String f24442p;
    private C6263a f24443q;
    private int f24444r = 0;
    private int f24445s = 0;
    private int f24446t;
    private int f24447u = 1;
    private int f24448v = 215;
    private LinkedHashMap<String, String> f24449w = new LinkedHashMap();
    private FrameLayout f24450z;

    class C43831 implements OnClickListener {
        final /* synthetic */ ChangeBackgroundConversationActivity f12252a;

        C43831(ChangeBackgroundConversationActivity changeBackgroundConversationActivity) {
            this.f12252a = changeBackgroundConversationActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f12252a.f24444r = 0;
        }
    }

    class C43844 implements OnClickListener {
        final /* synthetic */ ChangeBackgroundConversationActivity f12253a;

        C43844(ChangeBackgroundConversationActivity changeBackgroundConversationActivity) {
            this.f12253a = changeBackgroundConversationActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C4488b.m8184a(ChangeBackgroundConversationActivity.m21390c(this.f12253a));
        }
    }

    public enum C4386a {
        default_background,
        select_color,
        galley_image,
        web_service_image
    }

    class C62612 implements C1559a {
        final /* synthetic */ ChangeBackgroundConversationActivity f17068a;

        C62612(ChangeBackgroundConversationActivity changeBackgroundConversationActivity) {
            this.f17068a = changeBackgroundConversationActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i, Integer[] numArr) {
            this.f17068a.f24450z.setBackgroundColor(i);
            this.f17068a.f24439m = C4386a.select_color;
            this.f17068a.f24444r = i;
            this.f17068a.f24445s = i;
            this.f17068a.f24443q.m14610a();
        }
    }

    class C62623 implements C1576d {
        final /* synthetic */ ChangeBackgroundConversationActivity f17069a;

        C62623(ChangeBackgroundConversationActivity changeBackgroundConversationActivity) {
            this.f17069a = changeBackgroundConversationActivity;
        }

        public final void mo2428a(int i) {
            this.f17069a.f24444r = i;
        }
    }

    static /* synthetic */ C7406c m21390c(ChangeBackgroundConversationActivity changeBackgroundConversationActivity) {
        return changeBackgroundConversationActivity;
    }

    private void m21391g() {
        String G = C2535a.m6888a().m6896G();
        if (G != null) {
            C4507a.m8207a((Activity) this, G, this.f24450z);
        }
    }

    private void m21392h() {
        Intent intent = new Intent(this, MainMediaSelectorActivity.class);
        intent.putExtra("EXTRA_SELECT_MODE", 2);
        intent.putExtra("EXTRA_SELECTOR_TITLE", C4522p.m8236a(R.string.photos));
        startActivityForResult(intent, 215);
        overridePendingTransition(R.anim.anim_slide_in_left, R.anim.anim_slide_out_left);
    }

    public final Dialog mo2299a(Bundle bundle) {
        if (bundle.getInt("dialog_id") != 98) {
            return null;
        }
        return C4488b.m8182a(this, C4522p.m8236a(R.string.storage_permission), C4522p.m8236a(R.string.soroush_needs_access_to_your_storage), C4522p.m8236a(R.string.ok_cap), null, C4522p.m8236a(R.string.settings), new C43844(this));
    }

    public final void mo3682a(C7225a c7225a) {
        String str = ((C7390b) c7225a).f21486a;
        this.f24439m = C4386a.web_service_image;
        this.f24442p = str;
        this.f24441o = -1;
        C4507a.m8207a((Activity) this, str, this.f24450z);
        this.f24443q.m14610a();
    }

    public final Dialog mo3683b(Bundle bundle) {
        if (bundle.getInt("dialog_id") != 99) {
            return null;
        }
        int F = C2535a.m6888a().m6895F();
        if (this.f24444r != 0) {
            F = this.f24444r;
        }
        C1561b c1561b = new C1561b(this);
        c1561b.f4849a.m1608a(C4522p.m8236a(R.string.choose_color));
        c1561b.f4862n[0] = Integer.valueOf(F);
        c1561b.f4851c.setRenderer(C1563c.m4072a(C1573a.f4883a));
        c1561b.f4851c.setDensity(12);
        c1561b.f4857i = false;
        c1561b.f4858j = false;
        c1561b.f4851c.f4897c.add(new C62623(this));
        c1561b.f4849a.m1609a(C4522p.m8236a(R.string.set_cap), new C15601(c1561b, new C62612(this)));
        c1561b.f4849a.m1614b(C4522p.m8236a(R.string.cancel_cap), new C43831(this));
        Context context = c1561b.f4849a.f2211a.f2119a;
        C1575c c1575c = c1561b.f4851c;
        Integer[] numArr = c1561b.f4862n;
        int intValue = C1561b.m4070a(c1561b.f4862n).intValue();
        c1575c.f4895a = numArr;
        c1575c.f4896b = intValue;
        Integer num = c1575c.f4895a[c1575c.f4896b];
        if (num == null) {
            num = Integer.valueOf(-1);
        }
        c1575c.m4097a(num.intValue(), true);
        if (c1561b.f4856h) {
            LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, C1561b.m4069a(context, C1577a.default_slider_height));
            layoutParams.setMargins(c1561b.f4861m, 0, c1561b.f4861m, 0);
            c1561b.f4852d = new C5392c(context);
            c1561b.f4852d.setLayoutParams(layoutParams);
            c1561b.f4850b.addView(c1561b.f4852d);
            c1561b.f4851c.setLightnessSlider(c1561b.f4852d);
            c1561b.f4852d.setColor(C1561b.m4071b(c1561b.f4862n));
        }
        if (c1561b.f4857i) {
            layoutParams = new LinearLayout.LayoutParams(-1, C1561b.m4069a(context, C1577a.default_slider_height));
            layoutParams.setMargins(c1561b.f4861m, 0, c1561b.f4861m, 0);
            c1561b.f4853e = new C5391b(context);
            c1561b.f4853e.setLayoutParams(layoutParams);
            c1561b.f4850b.addView(c1561b.f4853e);
            c1561b.f4851c.setAlphaSlider(c1561b.f4853e);
            c1561b.f4853e.setColor(C1561b.m4071b(c1561b.f4862n));
        }
        if (c1561b.f4858j) {
            layoutParams = new LinearLayout.LayoutParams(-2, -2);
            int a = C1561b.m4069a(context, C1577a.default_padding_side);
            layoutParams.leftMargin = a;
            layoutParams.rightMargin = a;
            c1561b.f4854f = (EditText) View.inflate(context, C1579c.picker_edit, null);
            c1561b.f4854f.setFilters(new InputFilter[]{new AllCaps()});
            c1561b.f4854f.setSingleLine();
            c1561b.f4854f.setVisibility(8);
            c1561b.f4854f.setFilters(new InputFilter[]{new LengthFilter(9)});
            c1561b.f4850b.addView(c1561b.f4854f, layoutParams);
            EditText editText = c1561b.f4854f;
            StringBuilder stringBuilder = new StringBuilder("#");
            stringBuilder.append(Integer.toHexString(C1561b.m4071b(c1561b.f4862n)).toUpperCase());
            editText.setText(stringBuilder.toString());
            c1561b.f4851c.setColorEdit(c1561b.f4854f);
        }
        if (c1561b.f4859k) {
            c1561b.f4855g = (LinearLayout) View.inflate(context, C1579c.color_preview, null);
            c1561b.f4855g.setVisibility(8);
            c1561b.f4850b.addView(c1561b.f4855g);
            if (c1561b.f4862n.length == 0) {
                ((ImageView) View.inflate(context, C1579c.color_selector, null)).setImageDrawable(new ColorDrawable(-1));
            } else {
                int i = 0;
                while (i < c1561b.f4862n.length && i < c1561b.f4860l && c1561b.f4862n[i] != null) {
                    LinearLayout linearLayout = (LinearLayout) View.inflate(context, C1579c.color_selector, null);
                    ((ImageView) linearLayout.findViewById(C1578b.image_preview)).setImageDrawable(new ColorDrawable(c1561b.f4862n[i].intValue()));
                    c1561b.f4855g.addView(linearLayout);
                    i++;
                }
            }
            c1561b.f4855g.setVisibility(0);
            c1561b.f4851c.m4098a(c1561b.f4855g, C1561b.m4070a(c1561b.f4862n));
        }
        Dialog a2 = c1561b.f4849a.m1612a();
        a2.show();
        a2.m15114a(-2).setTextColor(UIThemeManager.getmInstance().getAccent_color());
        a2.m15114a(-1).setTextColor(UIThemeManager.getmInstance().getAccent_color());
        a2.m15114a(-3).setTextColor(UIThemeManager.getmInstance().getAccent_color());
        return a2;
    }

    public final void mo3684b(C7225a c7225a) {
        this.f24441o = c7225a.f19504k;
        if (this.f24441o == 0) {
            this.f24439m = C4386a.default_background;
            C2535a.m6888a().m6920b(C4386a.default_background.ordinal());
            C4507a.m8206a((Activity) this, this.f24450z, false);
            this.f24444r = 0;
            this.f24443q.m14610a();
        } else if (this.f24441o == 1) {
            Bundle bundle = new Bundle();
            bundle.putInt("dialog_id", 99);
            Fragment k = C7177c.m18970k(bundle);
            C0401p a = m19188c().mo254a();
            a.mo237a(k, "tag");
            a.mo244d();
        } else if (this.f24441o == 2) {
            if (!C4516l.m8232a() || C2837a.m7169a()) {
                m21392h();
            } else {
                C2837a.m7167a(this, "android.permission.WRITE_EXTERNAL_STORAGE", 174);
            }
        }
        this.f24442p = "";
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 != 0 && i == 215 && i2 == -1 && intent.hasExtra("KEY_RESULT_ARRAYLIST_OF_PATH")) {
            this.f24447u = intent.getIntExtra("KEY_RESULT_TYPE", 1);
            ArrayList stringArrayListExtra = intent.getStringArrayListExtra("KEY_RESULT_ARRAYLIST_OF_PATH");
            this.f24439m = C4386a.galley_image;
            this.f24442p = (String) stringArrayListExtra.get(0);
            C4507a.m8207a((Activity) this, this.f24442p, this.f24450z);
            this.f24443q.m14610a();
        }
    }

    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.anim_slide_in_right, R.anim.anim_slide_out_right);
    }

    protected void onCreate(Bundle bundle) {
        Bundle bundle2;
        FragmentTransaction beginTransaction;
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_change_backgroung_conversation);
        this.x = (Toolbar) findViewById(R.id.toolbar);
        C2475a.m6720a(getWindow(), C0346c.m687c(this, R.color.colorTransparentToolbarBackground));
        this.f24450z = (FrameLayout) findViewById(R.id.image_bg);
        if (!(getIntent() == null || getIntent().getExtras() == null)) {
            getIntent().getExtras();
        }
        if (bundle != null) {
            if (bundle.containsKey("KEY_ENUM_STATE")) {
                this.f24439m = (C4386a) bundle.get("KEY_ENUM_STATE");
                if (this.f24439m != null) {
                    if (this.f24439m != C4386a.galley_image) {
                        if (this.f24439m != C4386a.web_service_image) {
                            if (this.f24439m == C4386a.select_color) {
                                this.f24445s = bundle.getInt("KEY_SET_COLORE");
                            } else if (this.f24439m == C4386a.default_background) {
                                this.f24446t = bundle.getInt("KEY_DEFAULT_COLOR");
                            }
                        }
                    }
                    this.f24442p = bundle.getString("KEY_PATH_SELECTED_IMAGE");
                }
            }
            this.f24444r = bundle.getInt("KEY_SELECTED_COLOR_DIALOG_COLOR_PICKER", 0);
            if (bundle.containsKey("KEY_RESULT_TYPE")) {
                this.f24447u = bundle.getInt("KEY_RESULT_TYPE");
            }
            if (bundle.containsKey("KEY_SELECTED_POSITION")) {
                this.f24441o = bundle.getInt("KEY_SELECTED_POSITION");
            }
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(R.drawable.ic_delete_round));
        arrayList.add(Integer.valueOf(R.drawable.ic_color_round));
        arrayList.add(Integer.valueOf(R.drawable.ic_gallery_round));
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(C4522p.m8236a(R.string.action_default));
        arrayList2.add(C4522p.m8236a(R.string.action_select_color));
        arrayList2.add(C4522p.m8236a(R.string.action_gallery));
        ArrayList arrayList3 = new ArrayList();
        if (this.f24439m != null) {
            switch (this.f24439m) {
                case web_service_image:
                case galley_image:
                    C4507a.m8207a((Activity) this, this.f24442p, this.f24450z);
                    break;
                case default_background:
                    break;
                case select_color:
                    int i = this.f24445s;
                    break;
                default:
                    break;
            }
        }
        int I = C2535a.m6888a().m6897I();
        if (I == C4386a.default_background.ordinal()) {
            this.f24441o = 0;
            C2535a.m6888a().m6920b(C4386a.default_background.ordinal());
        } else if (I == C4386a.select_color.ordinal()) {
            this.f24441o = 1;
            i = C2535a.m6888a().m6895F();
            this.f24450z.setBackgroundColor(i);
            bundle2 = new Bundle();
            bundle2.putIntegerArrayList("KEY_RESULT_ARRAYLIST_OF_PATH", arrayList);
            bundle2.putStringArrayList("KEY_RESULT_ARRAYLIST_OF_TEXT_RESOURCE", arrayList2);
            bundle2.putStringArrayList("KEY_RESULT_ARRAYLIST_OF_IMAGE_PATH", arrayList3);
            this.f24443q = new C6263a();
            this.f24443q.setArguments(bundle2);
            beginTransaction = getFragmentManager().beginTransaction();
            beginTransaction.replace(R.id.container_frame_grid_items, this.f24443q);
            beginTransaction.setTransition(4099);
            beginTransaction.commit();
        } else {
            if (I == C4386a.galley_image.ordinal()) {
                this.f24441o = 2;
                m21391g();
            } else if (I == C4386a.web_service_image.ordinal()) {
                m21391g();
                this.f24442p = C2535a.m6888a().m6898J();
            }
            bundle2 = new Bundle();
            bundle2.putIntegerArrayList("KEY_RESULT_ARRAYLIST_OF_PATH", arrayList);
            bundle2.putStringArrayList("KEY_RESULT_ARRAYLIST_OF_TEXT_RESOURCE", arrayList2);
            bundle2.putStringArrayList("KEY_RESULT_ARRAYLIST_OF_IMAGE_PATH", arrayList3);
            this.f24443q = new C6263a();
            this.f24443q.setArguments(bundle2);
            beginTransaction = getFragmentManager().beginTransaction();
            beginTransaction.replace(R.id.container_frame_grid_items, this.f24443q);
            beginTransaction.setTransition(4099);
            beginTransaction.commit();
        }
        C4507a.m8206a((Activity) this, this.f24450z, false);
        bundle2 = new Bundle();
        bundle2.putIntegerArrayList("KEY_RESULT_ARRAYLIST_OF_PATH", arrayList);
        bundle2.putStringArrayList("KEY_RESULT_ARRAYLIST_OF_TEXT_RESOURCE", arrayList2);
        bundle2.putStringArrayList("KEY_RESULT_ARRAYLIST_OF_IMAGE_PATH", arrayList3);
        this.f24443q = new C6263a();
        this.f24443q.setArguments(bundle2);
        beginTransaction = getFragmentManager().beginTransaction();
        beginTransaction.replace(R.id.container_frame_grid_items, this.f24443q);
        beginTransaction.setTransition(4099);
        beginTransaction.commit();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_done_bar_white, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            onBackPressed();
            return true;
        } else if (itemId != R.id.action_done) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            if (this.f24439m != null) {
                C2535a a;
                C4386a c4386a;
                switch (this.f24439m) {
                    case web_service_image:
                        C2535a.m6888a().m6940f(this.f24442p);
                        C2535a.m6888a().m6920b(C4386a.web_service_image.ordinal());
                        a = C2535a.m6888a();
                        a.f8278a.edit().putString("mobi.mmdt.ott.model.pref.KEY_URL_IMAGE_CHANGE_BACKGROUND", this.f24442p).apply();
                        break;
                    case galley_image:
                        C2535a.m6888a().m6940f(this.f24442p);
                        a = C2535a.m6888a();
                        c4386a = C4386a.galley_image;
                        break;
                    case default_background:
                        C2535a.m6888a();
                        C2535a.m6888a().m6914a(C2535a.m6886H());
                        C2535a.m6888a().m6920b(C4386a.default_background.ordinal());
                        C4507a.m8206a((Activity) this, this.f24450z, false);
                        this.f24444r = 0;
                        break;
                    case select_color:
                        C2535a.m6888a().m6914a(this.f24445s);
                        a = C2535a.m6888a();
                        c4386a = C4386a.select_color;
                        break;
                    default:
                        break;
                }
                a.m6920b(c4386a.ordinal());
            }
            onBackPressed();
            return true;
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 174 && iArr.length > 0) {
            if (iArr[0] == -1) {
                Bundle bundle = new Bundle();
                bundle.putInt("dialog_id", 98);
                b_(bundle);
                return;
            }
            m21392h();
        }
    }

    protected void onResume() {
        super.onResume();
        m20723a(true, UIThemeManager.getmInstance().getIcon_toolbar_white_color());
        C2475a.m6719a((Activity) this, C4522p.m8236a(R.string.chat_change_background));
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.f24439m != null) {
            bundle.putSerializable("KEY_ENUM_STATE", this.f24439m);
            if (this.f24439m != C4386a.galley_image) {
                if (this.f24439m != C4386a.web_service_image) {
                    String str;
                    int i;
                    if (this.f24439m == C4386a.select_color) {
                        str = "KEY_SET_COLORE";
                        i = this.f24445s;
                    } else if (this.f24439m == C4386a.default_background) {
                        str = "KEY_DEFAULT_COLOR";
                        i = this.f24446t;
                    }
                    bundle.putInt(str, i);
                }
            }
            bundle.putString("KEY_PATH_SELECTED_IMAGE", this.f24442p);
        }
        bundle.putInt("KEY_SELECTED_POSITION", this.f24441o);
        bundle.putInt("KEY_SELECTED_COLOR_DIALOG_COLOR_PICKER", this.f24444r);
        ArrayList arrayList = new ArrayList();
        for (Entry key : this.f24449w.entrySet()) {
            arrayList.add(key.getKey());
        }
        bundle.putStringArrayList("KEY_CAPTIONED_MEDIA_DATA_HOLDERS_LIST_PATH", arrayList);
        if (this.f24440n != null) {
            bundle.putString("KEY_LAST_CAMERA_TAKEN_ADDRESS", this.f24440n);
        }
    }
}
