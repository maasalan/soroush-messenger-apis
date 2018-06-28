package mobi.mmdt.ott.view.newdesign.mainpage;

import android.app.Activity;
import android.app.Dialog;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.Snackbar;
import android.support.v7.app.C6389b;
import android.support.v7.app.C6389b.C0663a;
import android.support.v7.app.C7406c;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.componentsutils.p232b.p234b.C2475a;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.MyApplication.C24966;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.core.StartUpService;
import mobi.mmdt.ott.logic.p261a.ae.p269a.C2596b;
import mobi.mmdt.ott.logic.p261a.ag.p272a.C2615a;
import mobi.mmdt.ott.logic.p261a.p284f.p285a.C5915b;
import mobi.mmdt.ott.logic.p357j.p358a.C2830e;
import mobi.mmdt.ott.logic.p357j.p358a.C2831f;
import mobi.mmdt.ott.logic.p357j.p358a.C2832g;
import mobi.mmdt.ott.logic.p357j.p358a.C2833i;
import mobi.mmdt.ott.logic.p357j.p358a.C2834j;
import mobi.mmdt.ott.logic.p357j.p358a.C5987d;
import mobi.mmdt.ott.logic.p357j.p358a.C5988h;
import mobi.mmdt.ott.logic.p359k.C2837a;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.p246d.p247a.C2533f;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p379a.C2941c;
import mobi.mmdt.ott.provider.p389k.C2999a;
import mobi.mmdt.ott.provider.p389k.C3001e;
import mobi.mmdt.ott.view.components.p398a.C7175a.C3101a;
import mobi.mmdt.ott.view.components.p402d.C7576b;
import mobi.mmdt.ott.view.conversation.forward.ForwardActivity;
import mobi.mmdt.ott.view.main.explorechannelslist.newdesign.C4220b;
import mobi.mmdt.ott.view.newdesign.mainpage.C4282f.C42811;
import mobi.mmdt.ott.view.registeration.introduction.IntroductionActivity;
import mobi.mmdt.ott.view.registeration.notauthorize.NotAuthorizeActivity;
import mobi.mmdt.ott.view.registeration.profileinfo.ProfileInfoActivity;
import mobi.mmdt.ott.view.tools.C4478a;
import mobi.mmdt.ott.view.tools.C4488b;
import mobi.mmdt.ott.view.tools.C4488b.C44813;
import mobi.mmdt.ott.view.tools.C4513i;
import mobi.mmdt.ott.view.tools.C4516l;
import mobi.mmdt.ott.view.tools.C4522p;
import mobi.mmdt.ott.view.tools.p479c.C4501c;

public class MainActivity extends C7576b implements C3101a {
    private boolean f24396m = false;
    private C4275d f24397n;
    private C6244c f24398o;
    private boolean f24399p;

    class C42451 implements OnClickListener {
        final /* synthetic */ MainActivity f12013a;

        C42451(MainActivity mainActivity) {
            this.f12013a = mainActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f12013a.f24396m = false;
        }
    }

    class C42462 implements OnClickListener {
        final /* synthetic */ MainActivity f12014a;

        C42462(MainActivity mainActivity) {
            this.f12014a = mainActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f12014a.f24396m = false;
            C4488b.m8184a(MainActivity.m21318b(this.f12014a));
        }
    }

    class C42506 implements Runnable {
        final /* synthetic */ MainActivity f12021a;

        C42506(MainActivity mainActivity) {
            this.f12021a = mainActivity;
        }

        public final void run() {
            C4258b.m8066a(MainActivity.m21322f(this.f12021a));
            C4478a.m8166d(MainActivity.m21324g(this.f12021a));
        }
    }

    class C42517 implements Runnable {
        final /* synthetic */ MainActivity f12022a;

        C42517(MainActivity mainActivity) {
            this.f12022a = mainActivity;
        }

        public final void run() {
            Context h = MainActivity.m21325h(this.f12022a);
            View view = this.f12022a.f24398o.f16901b;
            if (C2535a.m6888a().f8278a.getInt("mobi.mmdt.ott.model.pref.KEY_LAST_UPDATE_ALARM_MODE", 0) == 0) {
                CharSequence a = C4522p.m8236a(R.string.new_update_title);
                CharSequence a2 = C4522p.m8236a(R.string.new_update_description);
                CharSequence a3 = C4522p.m8236a(R.string.button_yes);
                CharSequence a4 = C4522p.m8236a(R.string.button_no);
                C0663a c0663a = new C0663a(h, R.style.AppCompatAlertDialogStyle);
                View inflate = h.getLayoutInflater().inflate(R.layout.dialog_update, null);
                c0663a.m1607a(inflate);
                TextView textView = (TextView) inflate.findViewById(R.id.update_title);
                TextView textView2 = (TextView) inflate.findViewById(R.id.update_description);
                Button button = (Button) inflate.findViewById(R.id.update_button_yes);
                Button button2 = (Button) inflate.findViewById(R.id.update_button_no);
                textView.setText(a);
                textView2.setText(a2);
                button2.setText(a4);
                button.setText(a3);
                C2491i.m6803a(textView);
                C2491i.m6796a(inflate, UIThemeManager.getmInstance().getRecycler_view_background_color());
                C2491i.m6802a(textView, UIThemeManager.getmInstance().getText_primary_color());
                C2491i.m6802a(textView2, UIThemeManager.getmInstance().getText_primary_color());
                C2491i.m6798a(button, UIThemeManager.getmInstance().getButton_text_color());
                C2491i.m6798a(button2, UIThemeManager.getmInstance().getButton_text_color());
                C2491i.m6819b(button, UIThemeManager.getmInstance().getAccent_color());
                C2491i.m6819b(button2, UIThemeManager.getmInstance().getAccent_color());
                button.setOnClickListener(new C4280e());
                C6389b a5 = c0663a.m1612a();
                button2.setOnClickListener(new C44813(a5));
                a5.show();
                C2535a.m6888a().m6939f(1);
                return;
            }
            if (view != null) {
                new Handler().postDelayed(new C42811(h, Snackbar.m8770a(view, "", -2)), 500);
            }
            C2535a.m6888a().m6939f(0);
        }
    }

    private void m21314a(Intent intent, Bundle bundle) {
        int i = (!C7576b.m20718v() || System.currentTimeMillis() - MyApplication.m12950a().f15901P <= ((long) C7576b.m20717a(C7576b.m20719w()))) ? 0 : 1;
        if (i == 0) {
            Uri data = intent.getData();
            String action = intent.getAction();
            String type = intent.getType();
            if (("android.intent.action.SEND".equals(action) || "android.intent.action.SEND_MULTIPLE".equals(action)) && type != null) {
                Intent intent2 = new Intent(getApplicationContext(), ForwardActivity.class);
                intent2.setType(intent.getType());
                intent2.addFlags(67108864);
                intent2.setAction(intent.getAction());
                intent2.putExtras(bundle);
                startActivity(intent2);
                overridePendingTransition(0, 0);
                intent.setAction("");
                return;
            }
            if ("android.intent.action.VIEW".equals(action) && data != null) {
                String scheme = data.getScheme();
                String host = data.getHost();
                List pathSegments = data.getPathSegments();
                int size = pathSegments.size();
                StringBuilder stringBuilder = new StringBuilder("link : params.size() : ");
                stringBuilder.append(size);
                stringBuilder.append(" , host : ");
                stringBuilder.append(host);
                stringBuilder.append(" , scheme: ");
                stringBuilder.append(scheme);
                stringBuilder.append(" data: ");
                stringBuilder.append(data.toString());
                stringBuilder.append("     kay:");
                stringBuilder.append(data.getQueryParameter("key"));
                C2480b.m6742f(stringBuilder.toString());
                int i2 = (host.equals("stream.sapp.ir") && size == 1) ? 1 : 0;
                boolean equalsIgnoreCase = host.equalsIgnoreCase("sapp.ir");
                boolean equalsIgnoreCase2 = scheme.equalsIgnoreCase("soroush");
                boolean equalsIgnoreCase3 = scheme.equalsIgnoreCase("https");
                boolean equalsIgnoreCase4 = scheme.equalsIgnoreCase("http");
                boolean equalsIgnoreCase5 = host.equalsIgnoreCase("soroush-app.me");
                if (i2 != 0) {
                    C4255a.m8062b(this, data.toString());
                    return;
                } else if ((equalsIgnoreCase4 || equalsIgnoreCase3) && equalsIgnoreCase) {
                    C4501c.m8189a().m8192a(this, C4255a.m8061a(this, data.toString()));
                    return;
                } else if (equalsIgnoreCase3 && equalsIgnoreCase5 && size == 2 && ((String) pathSegments.get(0)).equalsIgnoreCase("channel")) {
                    C4255a.m8061a(this, (String) pathSegments.get(1));
                    return;
                } else if (equalsIgnoreCase2 && host.equalsIgnoreCase("channel") && size == 1) {
                    C4255a.m8061a(this, (String) pathSegments.get(0));
                    return;
                } else if (equalsIgnoreCase2 && host.equalsIgnoreCase("lookup") && data.getQueryParameter("key") != null) {
                    C4255a.m8061a(this, data.getQueryParameter("key"));
                    return;
                } else if (equalsIgnoreCase2 && host.equalsIgnoreCase("stream") && size == 1) {
                    StringBuilder stringBuilder2 = new StringBuilder("http://stream.sapp.ir/");
                    stringBuilder2.append((String) pathSegments.get(0));
                    C4255a.m8062b(this, stringBuilder2.toString());
                    return;
                } else if (equalsIgnoreCase2 && host.equalsIgnoreCase("share")) {
                    scheme = data.getEncodedSchemeSpecificPart();
                    int indexOf = scheme.indexOf("share?");
                    if (indexOf != -1) {
                        scheme = scheme.substring(indexOf).replaceFirst("share\\?", "");
                        Intent intent3 = new Intent(this, ForwardActivity.class);
                        intent3.setType("text/plain");
                        intent3.addFlags(67108864);
                        intent3.setAction("android.intent.action.SEND");
                        intent3.putExtra("android.intent.extra.TEXT", scheme);
                        startActivity(intent3);
                        overridePendingTransition(0, 0);
                    }
                }
            }
            return;
        }
        C4478a.m8141a((Activity) this, intent);
        finish();
    }

    private void m21315a(Class cls) {
        startActivity(new Intent(this, cls));
        overridePendingTransition(0, 0);
        finish();
    }

    private void m21316a(int[] iArr) {
        if ((VERSION.SDK_INT < 23 || shouldShowRequestPermissionRationale("android.permission.READ_CONTACTS")) && iArr.length > 0) {
            if (iArr[0] == -1) {
                Bundle bundle = new Bundle();
                bundle.putInt("dialog_id", 19);
                b_(bundle);
                return;
            }
            C4258b.m8065a();
        }
    }

    static /* synthetic */ C7406c m21318b(MainActivity mainActivity) {
        return mainActivity;
    }

    static /* synthetic */ C7406c m21319c(MainActivity mainActivity) {
        return mainActivity;
    }

    static /* synthetic */ C7406c m21320d(MainActivity mainActivity) {
        return mainActivity;
    }

    static /* synthetic */ C7406c m21321e(MainActivity mainActivity) {
        return mainActivity;
    }

    static /* synthetic */ C7406c m21322f(MainActivity mainActivity) {
        return mainActivity;
    }

    private Fragment m21323g() {
        int backStackEntryCount = getFragmentManager().getBackStackEntryCount() - 1;
        if (backStackEntryCount < 0) {
            return null;
        }
        return getFragmentManager().findFragmentByTag(getFragmentManager().getBackStackEntryAt(backStackEntryCount).getName());
    }

    static /* synthetic */ C7406c m21324g(MainActivity mainActivity) {
        return mainActivity;
    }

    static /* synthetic */ C7406c m21325h(MainActivity mainActivity) {
        return mainActivity;
    }

    public final Dialog mo2299a(Bundle bundle) {
        if (bundle.getInt("dialog_id") != 19) {
            return null;
        }
        this.f24396m = true;
        return C4488b.m8182a(this, C4522p.m8236a(R.string.contact_permission), C4522p.m8236a(R.string.soroush_needs_contact_permission), C4522p.m8236a(R.string.ok_cap), new C42451(this), C4522p.m8236a(R.string.settings), new C42462(this));
    }

    public void onBackPressed() {
        if (this.f24397n != null) {
            this.f24397n.mo2406b(this);
            return;
        }
        if (!(m21323g() == null || m21323g().getTag().equals("tag_main_page_fragment"))) {
            super.onBackPressed();
        }
    }

    protected void onCreate(Bundle bundle) {
        Activity activity;
        boolean h;
        Bundle bundle2 = bundle;
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_main);
        activity.f24399p = bundle2 == null;
        if (bundle2 != null && bundle2.containsKey("KEY_IS_SHOW_DIALOG_CONTACT_PERMISSION")) {
            activity.f24396m = bundle2.getBoolean("KEY_IS_SHOW_DIALOG_CONTACT_PERMISSION");
        }
        try {
            h = C2535a.m6888a().m6948h();
        } catch (NameNotFoundException e) {
            C2480b.m6732a(e.getMessage());
            h = false;
        }
        if (h) {
            C4478a.m8137a();
            finish();
        } else {
            Class cls;
            MyApplication a;
            C2535a.m6888a().m6923b(false);
            if (C2535a.m6888a().m6952j()) {
                C3001e a2 = C2999a.m7500a(C2535a.m6888a().m6928d());
                if (a2 == null) {
                    a2 = C2941c.m7333a(C2535a.m6888a().m6928d());
                    if (a2 != null) {
                        C2535a.m6888a().m6935e(0);
                        String str = a2.f9416b;
                        String str2 = a2.f9426l;
                        String str3 = a2.f9417c;
                        String str4 = a2.f9429o;
                        String str5 = a2.f9418d;
                        String str6 = a2.f9419e;
                        boolean z = a2.f9422h;
                        boolean z2 = a2.f9423i;
                        C2533f c2533f = new C2533f(str, str2, str3, str4, str5, str6, z, z2, a2.f9424j, a2.f9425k, a2.f9427m, a2.f9428n, a2.f9421g, a2.f9430p, a2.f9431q, a2.f9432r, a2.f9419e, a2.f9433s, a2.f9435u, a2.f9434t);
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(c2533f);
                        C2999a.m7501a(arrayList);
                    }
                    C2535a.m6888a().m6892C();
                    activity = this;
                } else {
                    if (C2535a.m6888a().f8278a.getBoolean("mobi.mmdt.ott.model.pref.PrefKeys.USER_NAME_EXPIRY_STATE", false)) {
                        C4478a.m8156b();
                        activity = this;
                        finish();
                    } else {
                        activity = this;
                        if (!C2535a.m6888a().f8278a.getBoolean("mobi.mmdt.ott.model.pref.KEY_IS_PROFILE_SET", false) && (a2.f9416b == null || a2.f9416b.isEmpty())) {
                            cls = ProfileInfoActivity.class;
                            activity.m21315a(cls);
                        } else if (C2535a.m6888a().m6902N()) {
                            r2 = new Intent(MyApplication.m12952b(), NotAuthorizeActivity.class);
                            r2.setFlags(268435456);
                            MyApplication.m12952b().startActivity(r2);
                            overridePendingTransition(0, 0);
                            finish();
                        } else {
                            r2 = getIntent();
                            m21314a(r2, r2.getExtras());
                            StartUpService.m7128c();
                            h = activity.f24399p;
                            Bundle bundle3 = new Bundle();
                            Intent intent = getIntent();
                            if (intent != null) {
                                Bundle extras = intent.getExtras();
                                if (extras != null) {
                                    C4258b.m8067a(activity, intent, extras);
                                }
                            }
                            activity.f24398o = new C6244c();
                            activity.f24397n = activity.f24398o;
                            if (h) {
                                activity.f24398o.setArguments(bundle3);
                                Fragment fragment = activity.f24398o;
                                String str7 = "tag_main_page_fragment";
                                FragmentTransaction beginTransaction = getFragmentManager().beginTransaction();
                                beginTransaction.replace(R.id.left_container, fragment, str7);
                                beginTransaction.setTransition(4099);
                                beginTransaction.addToBackStack(str7);
                                beginTransaction.commit();
                                getFragmentManager().executePendingTransactions();
                            }
                        }
                    }
                    if (!MyApplication.m12950a().f15888C) {
                        a = MyApplication.m12950a();
                        a.f15888C = true;
                        new Thread(new C24966(a)).start();
                    }
                }
            }
            cls = IntroductionActivity.class;
            activity.m21315a(cls);
            if (MyApplication.m12950a().f15888C) {
                a = MyApplication.m12950a();
                a.f15888C = true;
                new Thread(new C24966(a)).start();
            }
        }
        h = C4516l.m8232a();
        boolean b = C2837a.m7171b();
        boolean a3 = C2837a.m7169a();
        if (!(!h || b || a3 || activity.f24396m)) {
            C2837a.m7168a(activity, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_CONTACTS"});
        }
        C2475a.m6720a(getWindow(), UIThemeManager.getmInstance().getPrimary_dark_color());
    }

    protected void onDestroy() {
        this.f24397n = null;
        super.onDestroy();
    }

    public void onEvent(C2596b c2596b) {
        if (this != null) {
            runOnUiThread(new C42506(this));
        }
    }

    public void onEvent(C2615a c2615a) {
        runOnUiThread(new C42517(this));
    }

    public void onEvent(final C5915b c5915b) {
        runOnUiThread(new Runnable(this) {
            final /* synthetic */ MainActivity f12016b;

            public final void run() {
                C4501c.m8189a().m8193b();
                C4513i.m8228a(MainActivity.m21319c(this.f12016b), c5915b.f8890a);
            }
        });
    }

    public void onEvent(final C5987d c5987d) {
        runOnUiThread(new Runnable(this) {
            final /* synthetic */ MainActivity f12020b;

            public final void run() {
                C4501c.m8189a().m8193b();
                C4513i.m8228a(MainActivity.m21321e(this.f12020b), c5987d.f8890a);
            }
        });
    }

    public void onEvent(final C2830e c2830e) {
        runOnUiThread(new Runnable(this) {
            final /* synthetic */ MainActivity f12018b;

            public final void run() {
                C4501c.m8189a().m8193b();
                C4478a.m8160b(MainActivity.m21320d(this.f12018b), c2830e.f8911a, false, null, "");
                Toast.makeText(this.f12018b, C4522p.m8236a(R.string.you_joined_to_group), 0).show();
            }
        });
    }

    public void onEvent(C2831f c2831f) {
        C4220b.m8046a((Activity) this, c2831f);
    }

    public void onEvent(C2832g c2832g) {
        C4220b.m8047a((Activity) this, c2832g);
    }

    public void onEvent(C5988h c5988h) {
        C4220b.m8048a((Activity) this, c5988h);
    }

    public void onEvent(C2833i c2833i) {
        C4220b.m8049a((Activity) this, c2833i);
    }

    public void onEvent(C2834j c2834j) {
        C4220b.m8050a((Activity) this, c2834j);
    }

    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (MyApplication.m12950a().f15902Q) {
            C4478a.m8141a((Activity) this, intent);
            finish();
            return;
        }
        if (intent != null) {
            Bundle extras = intent.getExtras();
            if (!(extras == null || this.f24398o == null)) {
                Object obj;
                boolean containsKey = extras.containsKey("KEY_START_SINGLE_PARTY");
                boolean containsKey2 = extras.containsKey("KEY_START_GROUP_PARTY");
                boolean containsKey3 = extras.containsKey("KEY_START_CHANNEL_PARTY");
                boolean containsKey4 = extras.containsKey("KEY_SHOW_TOAST_FOR_CHANNEL_NOT_EXIST");
                if (!(containsKey || containsKey2 || containsKey3)) {
                    if (!containsKey4) {
                        obj = null;
                        if (obj != null) {
                            m21314a(intent, extras);
                        }
                        C4258b.m8067a(this, intent, extras);
                    }
                }
                obj = 1;
                if (obj != null) {
                    C4258b.m8067a(this, intent, extras);
                } else {
                    m21314a(intent, extras);
                }
            }
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 132) {
            if (!(C2837a.m7170a("android.permission.READ_CONTACTS") || this.f24396m)) {
                C2837a.m7167a(this, "android.permission.READ_CONTACTS", 187);
            }
        } else if (i == 187) {
            m21316a(iArr);
        } else if (i == 516) {
            m21316a(iArr);
        }
    }

    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("KEY_IS_SHOW_DIALOG_CONTACT_PERMISSION", this.f24396m);
    }
}
