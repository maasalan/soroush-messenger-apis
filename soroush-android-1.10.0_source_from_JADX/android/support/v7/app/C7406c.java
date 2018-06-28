package android.support.v7.app;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.app.C0418u;
import android.support.v4.app.C7249g;
import android.support.v4.app.an.C0379a;
import android.support.v7.widget.VectorEnabledTintResources;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;

public class C7406c extends C7249g implements C0379a, C0664d {
    private C0665e f21530m;
    private int f21531n = 0;
    private Resources f21532o;

    private boolean mo3643g() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r6 = this;
        r0 = android.support.v4.app.C0418u.m840a(r6);
        r1 = 0;
        if (r0 == 0) goto L_0x00ab;
    L_0x0007:
        r2 = android.os.Build.VERSION.SDK_INT;
        r3 = 1;
        r4 = 16;
        if (r2 < r4) goto L_0x0013;
    L_0x000e:
        r2 = r6.shouldUpRecreateTask(r0);
        goto L_0x0028;
    L_0x0013:
        r2 = r6.getIntent();
        r2 = r2.getAction();
        if (r2 == 0) goto L_0x0027;
    L_0x001d:
        r5 = "android.intent.action.MAIN";
        r2 = r2.equals(r5);
        if (r2 != 0) goto L_0x0027;
    L_0x0025:
        r2 = r3;
        goto L_0x0028;
    L_0x0027:
        r2 = r1;
    L_0x0028:
        if (r2 == 0) goto L_0x0097;
    L_0x002a:
        r0 = android.support.v4.app.an.m748a(r6);
        r2 = 0;
        r4 = r6 instanceof android.support.v4.app.an.C0379a;
        if (r4 == 0) goto L_0x003a;
    L_0x0033:
        r2 = r6;
        r2 = (android.support.v4.app.an.C0379a) r2;
        r2 = r2.a_();
    L_0x003a:
        if (r2 != 0) goto L_0x0040;
    L_0x003c:
        r2 = android.support.v4.app.C0418u.m840a(r6);
    L_0x0040:
        if (r2 == 0) goto L_0x005a;
    L_0x0042:
        r4 = r2.getComponent();
        if (r4 != 0) goto L_0x0052;
    L_0x0048:
        r4 = r0.f1407b;
        r4 = r4.getPackageManager();
        r4 = r2.resolveActivity(r4);
    L_0x0052:
        r0.m749a(r4);
        r4 = r0.f1406a;
        r4.add(r2);
    L_0x005a:
        r2 = r0.f1406a;
        r2 = r2.isEmpty();
        if (r2 == 0) goto L_0x006a;
    L_0x0062:
        r0 = new java.lang.IllegalStateException;
        r1 = "No intents added to TaskStackBuilder; cannot startActivities";
        r0.<init>(r1);
        throw r0;
    L_0x006a:
        r2 = r0.f1406a;
        r4 = r0.f1406a;
        r4 = r4.size();
        r4 = new android.content.Intent[r4];
        r2 = r2.toArray(r4);
        r2 = (android.content.Intent[]) r2;
        r4 = new android.content.Intent;
        r5 = r2[r1];
        r4.<init>(r5);
        r5 = 268484608; // 0x1000c000 float:2.539146E-29 double:1.326490212E-315;
        r4 = r4.addFlags(r5);
        r2[r1] = r4;
        r0 = r0.f1407b;
        android.support.v4.p029a.C0346c.m685a(r0, r2);
        android.support.v4.app.C4767a.m8920a(r6);	 Catch:{ IllegalStateException -> 0x0093 }
        return r3;
    L_0x0093:
        r6.finish();
        return r3;
    L_0x0097:
        r1 = android.os.Build.VERSION.SDK_INT;
        if (r1 < r4) goto L_0x009f;
    L_0x009b:
        r6.navigateUpTo(r0);
        return r3;
    L_0x009f:
        r1 = 67108864; // 0x4000000 float:1.5046328E-36 double:3.31561842E-316;
        r0.addFlags(r1);
        r6.startActivity(r0);
        r6.finish();
        return r3;
    L_0x00ab:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.app.c.g():boolean");
    }

    public final Intent a_() {
        return C0418u.m840a(this);
    }

    public void addContentView(View view, LayoutParams layoutParams) {
        m19694f().mo2591b(view, layoutParams);
    }

    public void closeOptionsMenu() {
        C0662a a = m19694f().mo457a();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (a == null || !a.mo485g()) {
            super.closeOptionsMenu();
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        C0662a a = m19694f().mo457a();
        return (keyCode == 82 && a != null && a.mo473a(keyEvent)) ? true : super.dispatchKeyEvent(keyEvent);
    }

    public final C0665e m19694f() {
        if (this.f21530m == null) {
            this.f21530m = C0665e.m1616a((Activity) this, (C0664d) this);
        }
        return this.f21530m;
    }

    public <T extends View> T findViewById(int i) {
        return m19694f().mo2582a(i);
    }

    public MenuInflater getMenuInflater() {
        return m19694f().mo459b();
    }

    public Resources getResources() {
        if (this.f21532o == null && VectorEnabledTintResources.shouldBeUsed()) {
            this.f21532o = new VectorEnabledTintResources(this, super.getResources());
        }
        return this.f21532o == null ? super.getResources() : this.f21532o;
    }

    public void invalidateOptionsMenu() {
        m19694f().mo2598g();
    }

    public final void n_() {
        m19694f().mo2598g();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m19694f().mo2583a(configuration);
        if (this.f21532o != null) {
            this.f21532o.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
    }

    public void onContentChanged() {
    }

    public void onCreate(Bundle bundle) {
        C0665e f = m19694f();
        f.mo2599i();
        f.mo2584a(bundle);
        if (f.mo464j() && this.f21531n != 0) {
            if (VERSION.SDK_INT >= 23) {
                onApplyThemeResource(getTheme(), this.f21531n, false);
            } else {
                setTheme(this.f21531n);
            }
        }
        super.onCreate(bundle);
    }

    public void onDestroy() {
        super.onDestroy();
        m19694f().mo463h();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        boolean z;
        if (!(VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()))) {
            Window window = getWindow();
            if (!(window == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent))) {
                z = true;
                return z ? true : super.onKeyDown(i, keyEvent);
            }
        }
        z = false;
        if (z) {
        }
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        C0662a a = m19694f().mo457a();
        return (menuItem.getItemId() != 16908332 || a == null || (a.mo467a() & 4) == 0) ? false : mo3643g();
    }

    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        m19694f().mo2593c();
    }

    protected void onPostResume() {
        super.onPostResume();
        m19694f().mo2597f();
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        m19694f().mo460b(bundle);
    }

    public void onStart() {
        super.onStart();
        m19694f().mo461d();
    }

    public void onStop() {
        super.onStop();
        m19694f().mo462e();
    }

    protected void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        m19694f().mo458a(charSequence);
    }

    public void openOptionsMenu() {
        C0662a a = m19694f().mo457a();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (a == null || !a.mo484f()) {
            super.openOptionsMenu();
        }
    }

    public void setContentView(int i) {
        m19694f().mo2590b(i);
    }

    public void setContentView(View view) {
        m19694f().mo2586a(view);
    }

    public void setContentView(View view, LayoutParams layoutParams) {
        m19694f().mo2587a(view, layoutParams);
    }

    public void setTheme(int i) {
        super.setTheme(i);
        this.f21531n = i;
    }
}
