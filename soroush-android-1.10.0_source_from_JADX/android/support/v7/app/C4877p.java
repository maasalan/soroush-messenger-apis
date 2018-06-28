package android.support.v7.app;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.support.v4.view.C0571r;
import android.support.v7.view.C0713i;
import android.support.v7.view.menu.C0727o.C0726a;
import android.support.v7.view.menu.C4890h;
import android.support.v7.view.menu.C4890h.C0722a;
import android.support.v7.widget.DecorToolbar;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.Toolbar.OnMenuItemClickListener;
import android.support.v7.widget.ToolbarWidgetWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window.Callback;
import java.util.ArrayList;
import mobi.mmdt.ott.R;

final class C4877p extends C0662a {
    DecorToolbar f13534a;
    boolean f13535b;
    Callback f13536c;
    private boolean f13537d;
    private boolean f13538e;
    private ArrayList<Object> f13539f = new ArrayList();
    private final Runnable f13540g = new C06721(this);
    private final OnMenuItemClickListener f13541h = new C48732(this);

    class C06721 implements Runnable {
        final /* synthetic */ C4877p f2239a;

        C06721(C4877p c4877p) {
            this.f2239a = c4877p;
        }

        public final void run() {
            /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Can't find block by offset: 0x0031 in list [B:13:0x002e]
	at jadx.core.utils.BlockUtils.getBlockByOffset(BlockUtils.java:42)
	at jadx.core.dex.instructions.IfNode.initBlocks(IfNode.java:60)
	at jadx.core.dex.visitors.blocksmaker.BlockFinish.initBlocksInIfNodes(BlockFinish.java:48)
	at jadx.core.dex.visitors.blocksmaker.BlockFinish.visit(BlockFinish.java:33)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
            /*
            r6 = this;
            r0 = r6.f2239a;
            r1 = r0.m9394k();
            r2 = r1 instanceof android.support.v7.view.menu.C4890h;
            r3 = 0;
            if (r2 == 0) goto L_0x000f;
        L_0x000b:
            r2 = r1;
            r2 = (android.support.v7.view.menu.C4890h) r2;
            goto L_0x0010;
        L_0x000f:
            r2 = r3;
        L_0x0010:
            if (r2 == 0) goto L_0x0015;
        L_0x0012:
            r2.m9489d();
        L_0x0015:
            r1.clear();	 Catch:{ all -> 0x0032 }
            r4 = r0.f13536c;	 Catch:{ all -> 0x0032 }
            r5 = 0;	 Catch:{ all -> 0x0032 }
            r4 = r4.onCreatePanelMenu(r5, r1);	 Catch:{ all -> 0x0032 }
            if (r4 == 0) goto L_0x0029;	 Catch:{ all -> 0x0032 }
        L_0x0021:
            r0 = r0.f13536c;	 Catch:{ all -> 0x0032 }
            r0 = r0.onPreparePanel(r5, r3, r1);	 Catch:{ all -> 0x0032 }
            if (r0 != 0) goto L_0x002c;	 Catch:{ all -> 0x0032 }
        L_0x0029:
            r1.clear();	 Catch:{ all -> 0x0032 }
        L_0x002c:
            if (r2 == 0) goto L_0x0031;
        L_0x002e:
            r2.m9491e();
        L_0x0031:
            return;
        L_0x0032:
            r0 = move-exception;
            if (r2 == 0) goto L_0x0038;
        L_0x0035:
            r2.m9491e();
        L_0x0038:
            throw r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v7.app.p.1.run():void");
        }
    }

    class C48732 implements OnMenuItemClickListener {
        final /* synthetic */ C4877p f13529a;

        C48732(C4877p c4877p) {
            this.f13529a = c4877p;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            return this.f13529a.f13536c.onMenuItemSelected(0, menuItem);
        }
    }

    private final class C4874a implements C0726a {
        final /* synthetic */ C4877p f13530a;
        private boolean f13531b;

        C4874a(C4877p c4877p) {
            this.f13530a = c4877p;
        }

        public final void onCloseMenu(C4890h c4890h, boolean z) {
            if (!this.f13531b) {
                this.f13531b = true;
                this.f13530a.f13534a.dismissPopupMenus();
                if (this.f13530a.f13536c != null) {
                    this.f13530a.f13536c.onPanelClosed(108, c4890h);
                }
                this.f13531b = false;
            }
        }

        public final boolean onOpenSubMenu(C4890h c4890h) {
            if (this.f13530a.f13536c == null) {
                return false;
            }
            this.f13530a.f13536c.onMenuOpened(108, c4890h);
            return true;
        }
    }

    private final class C4875b implements C0722a {
        final /* synthetic */ C4877p f13532a;

        C4875b(C4877p c4877p) {
            this.f13532a = c4877p;
        }

        public final boolean onMenuItemSelected(C4890h c4890h, MenuItem menuItem) {
            return false;
        }

        public final void onMenuModeChange(C4890h c4890h) {
            if (this.f13532a.f13536c != null) {
                if (this.f13532a.f13534a.isOverflowMenuShowing()) {
                    this.f13532a.f13536c.onPanelClosed(108, c4890h);
                } else if (this.f13532a.f13536c.onPreparePanel(0, null, c4890h)) {
                    this.f13532a.f13536c.onMenuOpened(108, c4890h);
                }
            }
        }
    }

    private class C4876c extends C0713i {
        final /* synthetic */ C4877p f13533a;

        public C4876c(C4877p c4877p, Callback callback) {
            this.f13533a = c4877p;
            super(callback);
        }

        public final View onCreatePanelView(int i) {
            return i == 0 ? new View(this.f13533a.f13534a.getContext()) : super.onCreatePanelView(i);
        }

        public final boolean onPreparePanel(int i, View view, Menu menu) {
            boolean onPreparePanel = super.onPreparePanel(i, view, menu);
            if (onPreparePanel && !this.f13533a.f13535b) {
                this.f13533a.f13534a.setMenuPrepared();
                this.f13533a.f13535b = true;
            }
            return onPreparePanel;
        }
    }

    C4877p(Toolbar toolbar, CharSequence charSequence, Callback callback) {
        this.f13534a = new ToolbarWidgetWrapper(toolbar, false);
        this.f13536c = new C4876c(this, callback);
        this.f13534a.setWindowCallback(this.f13536c);
        toolbar.setOnMenuItemClickListener(this.f13541h);
        this.f13534a.setWindowTitle(charSequence);
    }

    public final int mo467a() {
        return this.f13534a.getDisplayOptions();
    }

    public final void mo468a(Configuration configuration) {
        super.mo468a(configuration);
    }

    public final void mo469a(Drawable drawable) {
        this.f13534a.setNavigationIcon(drawable);
    }

    public final void mo470a(CharSequence charSequence) {
        this.f13534a.setTitle(charSequence);
    }

    public final void mo471a(boolean z) {
        this.f13534a.setDisplayOptions(((z ? 4 : 0) & 4) | (this.f13534a.getDisplayOptions() & -5));
    }

    public final boolean mo472a(int i, KeyEvent keyEvent) {
        Menu k = m9394k();
        if (k == null) {
            return false;
        }
        boolean z = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z = false;
        }
        k.setQwertyMode(z);
        return k.performShortcut(i, keyEvent, 0);
    }

    public final boolean mo473a(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            mo484f();
        }
        return true;
    }

    public final void mo474b() {
        this.f13534a.setVisibility(0);
    }

    public final void mo475b(CharSequence charSequence) {
        this.f13534a.setSubtitle(charSequence);
    }

    public final void mo476b(boolean z) {
    }

    public final void mo477c() {
        this.f13534a.setVisibility(8);
    }

    public final void mo478c(CharSequence charSequence) {
        this.f13534a.setWindowTitle(charSequence);
    }

    public final void mo479c(boolean z) {
    }

    public final Context mo480d() {
        return this.f13534a.getContext();
    }

    public final void mo481d(boolean z) {
    }

    public final void mo482e() {
        this.f13534a.setNavigationIcon((int) R.drawable.ic_close_white_24dp);
    }

    public final void mo483e(boolean z) {
        if (z != this.f13538e) {
            this.f13538e = z;
            int size = this.f13539f.size();
            for (int i = 0; i < size; i++) {
                this.f13539f.get(i);
            }
        }
    }

    public final boolean mo484f() {
        return this.f13534a.showOverflowMenu();
    }

    public final boolean mo485g() {
        return this.f13534a.hideOverflowMenu();
    }

    public final boolean mo486h() {
        this.f13534a.getViewGroup().removeCallbacks(this.f13540g);
        C0571r.m1343a(this.f13534a.getViewGroup(), this.f13540g);
        return true;
    }

    public final boolean mo487i() {
        if (!this.f13534a.hasExpandedActionView()) {
            return false;
        }
        this.f13534a.collapseActionView();
        return true;
    }

    final void mo488j() {
        this.f13534a.getViewGroup().removeCallbacks(this.f13540g);
    }

    final Menu m9394k() {
        if (!this.f13537d) {
            this.f13534a.setMenuCallbacks(new C4874a(this), new C4875b(this));
            this.f13537d = true;
        }
        return this.f13534a.getMenu();
    }
}
