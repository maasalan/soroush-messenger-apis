package android.support.v7.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.p029a.C0346c;
import android.support.v4.p033c.p034a.C0441a;
import android.support.v7.p041a.C0645a.C0636b;
import android.util.SparseArray;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyCharacterMap.KeyData;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager;

public class C4890h implements C0441a {
    private static final int[] f13648l = new int[]{1, 4, 5, 3, 2, 0};
    protected final Context f13649a;
    public C0722a f13650b;
    ArrayList<C4893j> f13651c;
    public ArrayList<C4893j> f13652d;
    public int f13653e = 1;
    CharSequence f13654f;
    Drawable f13655g;
    View f13656h;
    boolean f13657i = false;
    C4893j f13658j;
    public boolean f13659k;
    private final Resources f13660m;
    private boolean f13661n;
    private boolean f13662o;
    private ArrayList<C4893j> f13663p;
    private boolean f13664q;
    private ArrayList<C4893j> f13665r;
    private boolean f13666s;
    private ContextMenuInfo f13667t;
    private boolean f13668u = false;
    private boolean f13669v = false;
    private boolean f13670w = false;
    private boolean f13671x = false;
    private ArrayList<C4893j> f13672y = new ArrayList();
    private CopyOnWriteArrayList<WeakReference<C0727o>> f13673z = new CopyOnWriteArrayList();

    public interface C0722a {
        boolean onMenuItemSelected(C4890h c4890h, MenuItem menuItem);

        void onMenuModeChange(C4890h c4890h);
    }

    public interface C0723b {
        boolean invokeItem(C4893j c4893j);
    }

    public C4890h(Context context) {
        this.f13649a = context;
        this.f13660m = context.getResources();
        this.f13651c = new ArrayList();
        this.f13663p = new ArrayList();
        boolean z = true;
        this.f13664q = true;
        this.f13652d = new ArrayList();
        this.f13665r = new ArrayList();
        this.f13666s = true;
        if (this.f13660m.getConfiguration().keyboard == 1 || !this.f13660m.getBoolean(C0636b.abc_config_showMenuShortcutsWhenKeyboardPresent)) {
            z = false;
        }
        this.f13662o = z;
    }

    private static int m9467a(ArrayList<C4893j> arrayList, int i) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((C4893j) arrayList.get(size)).f13692a <= i) {
                return size + 1;
            }
        }
        return 0;
    }

    private C4893j m9468a(int i, KeyEvent keyEvent) {
        List list = this.f13672y;
        list.clear();
        m9470a(list, i, keyEvent);
        if (list.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyData keyData = new KeyData();
        keyEvent.getKeyData(keyData);
        int size = list.size();
        if (size == 1) {
            return (C4893j) list.get(0);
        }
        boolean b = mo2623b();
        for (int i2 = 0; i2 < size; i2++) {
            C4893j c4893j = (C4893j) list.get(i2);
            char alphabeticShortcut = b ? c4893j.getAlphabeticShortcut() : c4893j.getNumericShortcut();
            if ((alphabeticShortcut == keyData.meta[0] && (metaState & 2) == 0) || ((alphabeticShortcut == keyData.meta[2] && (metaState & 2) != 0) || (b && alphabeticShortcut == '\b' && i == 67))) {
                return c4893j;
            }
        }
        return null;
    }

    private void m9469a(int i, boolean z) {
        if (i >= 0 && i < this.f13651c.size()) {
            this.f13651c.remove(i);
            if (z) {
                mo3264a(true);
            }
        }
    }

    private void m9470a(List<C4893j> list, int i, KeyEvent keyEvent) {
        boolean b = mo2623b();
        int modifiers = keyEvent.getModifiers();
        KeyData keyData = new KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            int size = this.f13651c.size();
            for (int i2 = 0; i2 < size; i2++) {
                C4893j c4893j = (C4893j) this.f13651c.get(i2);
                if (c4893j.hasSubMenu()) {
                    ((C4890h) c4893j.getSubMenu()).m9470a((List) list, i, keyEvent);
                }
                char alphabeticShortcut = b ? c4893j.getAlphabeticShortcut() : c4893j.getNumericShortcut();
                if (!(((modifiers & 69647) == ((b ? c4893j.getAlphabeticModifiers() : c4893j.getNumericModifiers()) & 69647) ? 1 : 0) == 0 || alphabeticShortcut == '\u0000' || ((alphabeticShortcut != keyData.meta[0] && alphabeticShortcut != keyData.meta[2] && (!b || alphabeticShortcut != '\b' || i != 67)) || !c4893j.isEnabled()))) {
                    list.add(c4893j);
                }
            }
        }
    }

    protected final MenuItem m9471a(int i, int i2, int i3, CharSequence charSequence) {
        int i4 = (-65536 & i3) >> 16;
        if (i4 >= 0) {
            if (i4 < f13648l.length) {
                i4 = (f13648l[i4] << 16) | (InBandBytestreamManager.MAXIMUM_BLOCK_SIZE & i3);
                MenuItem c4893j = new C4893j(this, i, i2, i3, i4, charSequence, this.f13653e);
                if (this.f13667t != null) {
                    c4893j.f13696e = this.f13667t;
                }
                this.f13651c.add(C4890h.m9467a(this.f13651c, i4), c4893j);
                mo3264a(true);
                return c4893j;
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    protected String mo2619a() {
        return "android:menu:actionviewstates";
    }

    final void m9473a(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources resources = this.f13660m;
        if (view != null) {
            this.f13656h = view;
            this.f13654f = null;
            this.f13655g = null;
        } else {
            if (i > 0) {
                this.f13654f = resources.getText(i);
            } else if (charSequence != null) {
                this.f13654f = charSequence;
            }
            if (i2 > 0) {
                this.f13655g = C0346c.m682a(this.f13649a, i2);
            } else if (drawable != null) {
                this.f13655g = drawable;
            }
            this.f13656h = null;
        }
        mo3264a(false);
    }

    public final void m9474a(Bundle bundle) {
        if (!this.f13673z.isEmpty()) {
            SparseArray sparseArray = new SparseArray();
            Iterator it = this.f13673z.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                C0727o c0727o = (C0727o) weakReference.get();
                if (c0727o == null) {
                    this.f13673z.remove(weakReference);
                } else {
                    int id = c0727o.getId();
                    if (id > 0) {
                        Parcelable onSaveInstanceState = c0727o.onSaveInstanceState();
                        if (onSaveInstanceState != null) {
                            sparseArray.put(id, onSaveInstanceState);
                        }
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
        }
    }

    public void mo2620a(C0722a c0722a) {
        this.f13650b = c0722a;
    }

    public final void m9476a(C0727o c0727o) {
        m9477a(c0727o, this.f13649a);
    }

    public final void m9477a(C0727o c0727o, Context context) {
        this.f13673z.add(new WeakReference(c0727o));
        c0727o.initForMenu(context, this);
        this.f13666s = true;
    }

    public void mo3264a(boolean z) {
        if (this.f13668u) {
            this.f13669v = true;
            if (z) {
                this.f13670w = true;
            }
            return;
        }
        if (z) {
            this.f13664q = true;
            this.f13666s = true;
        }
        if (!this.f13673z.isEmpty()) {
            m9489d();
            Iterator it = this.f13673z.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                C0727o c0727o = (C0727o) weakReference.get();
                if (c0727o == null) {
                    this.f13673z.remove(weakReference);
                } else {
                    c0727o.updateMenuView(z);
                }
            }
            m9491e();
        }
    }

    boolean mo2621a(C4890h c4890h, MenuItem menuItem) {
        return this.f13650b != null && this.f13650b.onMenuItemSelected(c4890h, menuItem);
    }

    public boolean mo2622a(C4893j c4893j) {
        boolean z = false;
        if (this.f13673z.isEmpty()) {
            return false;
        }
        m9489d();
        Iterator it = this.f13673z.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            C0727o c0727o = (C0727o) weakReference.get();
            if (c0727o == null) {
                this.f13673z.remove(weakReference);
            } else {
                z = c0727o.expandItemActionView(this, c4893j);
                if (z) {
                    break;
                }
            }
        }
        m9491e();
        if (z) {
            this.f13658j = c4893j;
        }
        return z;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean m9481a(android.view.MenuItem r7, android.support.v7.view.menu.C0727o r8, int r9) {
        /*
        r6 = this;
        r7 = (android.support.v7.view.menu.C4893j) r7;
        r0 = 0;
        if (r7 == 0) goto L_0x009a;
    L_0x0005:
        r1 = r7.isEnabled();
        if (r1 != 0) goto L_0x000c;
    L_0x000b:
        return r0;
    L_0x000c:
        r1 = r7.m9509b();
        r2 = r7.f13695d;
        r3 = 1;
        if (r2 == 0) goto L_0x001d;
    L_0x0015:
        r4 = r2.hasSubMenu();
        if (r4 == 0) goto L_0x001d;
    L_0x001b:
        r4 = r3;
        goto L_0x001e;
    L_0x001d:
        r4 = r0;
    L_0x001e:
        r5 = r7.m9519i();
        if (r5 == 0) goto L_0x002f;
    L_0x0024:
        r7 = r7.expandActionView();
        r1 = r1 | r7;
        if (r1 == 0) goto L_0x0099;
    L_0x002b:
        r6.m9484b(r3);
        return r1;
    L_0x002f:
        r5 = r7.hasSubMenu();
        if (r5 != 0) goto L_0x003d;
    L_0x0035:
        if (r4 == 0) goto L_0x0038;
    L_0x0037:
        goto L_0x003d;
    L_0x0038:
        r7 = r9 & 1;
        if (r7 != 0) goto L_0x0099;
    L_0x003c:
        goto L_0x002b;
    L_0x003d:
        r9 = r9 & 4;
        if (r9 != 0) goto L_0x0044;
    L_0x0041:
        r6.m9484b(r0);
    L_0x0044:
        r9 = r7.hasSubMenu();
        if (r9 != 0) goto L_0x0054;
    L_0x004a:
        r9 = new android.support.v7.view.menu.u;
        r5 = r6.f13649a;
        r9.<init>(r5, r6, r7);
        r7.m9506a(r9);
    L_0x0054:
        r7 = r7.getSubMenu();
        r7 = (android.support.v7.view.menu.C6399u) r7;
        if (r4 == 0) goto L_0x005f;
    L_0x005c:
        r2.onPrepareSubMenu(r7);
    L_0x005f:
        r9 = r6.f13673z;
        r9 = r9.isEmpty();
        if (r9 == 0) goto L_0x0068;
    L_0x0067:
        goto L_0x0095;
    L_0x0068:
        if (r8 == 0) goto L_0x006e;
    L_0x006a:
        r0 = r8.onSubMenuSelected(r7);
    L_0x006e:
        r8 = r6.f13673z;
        r8 = r8.iterator();
    L_0x0074:
        r9 = r8.hasNext();
        if (r9 == 0) goto L_0x0095;
    L_0x007a:
        r9 = r8.next();
        r9 = (java.lang.ref.WeakReference) r9;
        r2 = r9.get();
        r2 = (android.support.v7.view.menu.C0727o) r2;
        if (r2 != 0) goto L_0x008e;
    L_0x0088:
        r2 = r6.f13673z;
        r2.remove(r9);
        goto L_0x0074;
    L_0x008e:
        if (r0 != 0) goto L_0x0074;
    L_0x0090:
        r0 = r2.onSubMenuSelected(r7);
        goto L_0x0074;
    L_0x0095:
        r1 = r1 | r0;
        if (r1 != 0) goto L_0x0099;
    L_0x0098:
        goto L_0x002b;
    L_0x0099:
        return r1;
    L_0x009a:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.view.menu.h.a(android.view.MenuItem, android.support.v7.view.menu.o, int):boolean");
    }

    public MenuItem add(int i) {
        return m9471a(0, 0, 0, this.f13660m.getString(i));
    }

    public MenuItem add(int i, int i2, int i3, int i4) {
        return m9471a(i, i2, i3, this.f13660m.getString(i4));
    }

    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return m9471a(i, i2, i3, charSequence);
    }

    public MenuItem add(CharSequence charSequence) {
        return m9471a(0, 0, 0, charSequence);
    }

    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        PackageManager packageManager = this.f13649a.getPackageManager();
        int i5 = 0;
        List queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        while (i5 < size) {
            ResolveInfo resolveInfo = (ResolveInfo) queryIntentActivityOptions.get(i5);
            Intent intent2 = new Intent(resolveInfo.specificIndex < 0 ? intent : intentArr[resolveInfo.specificIndex]);
            intent2.setComponent(new ComponentName(resolveInfo.activityInfo.applicationInfo.packageName, resolveInfo.activityInfo.name));
            MenuItem intent3 = add(i, i2, i3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && resolveInfo.specificIndex >= 0) {
                menuItemArr[resolveInfo.specificIndex] = intent3;
            }
            i5++;
        }
        return size;
    }

    public SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.f13660m.getString(i));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.f13660m.getString(i4));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C4893j c4893j = (C4893j) m9471a(i, i2, i3, charSequence);
        C6399u c6399u = new C6399u(this.f13649a, this, c4893j);
        c4893j.m9506a(c6399u);
        return c6399u;
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void m9482b(Bundle bundle) {
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray != null && !this.f13673z.isEmpty()) {
            Iterator it = this.f13673z.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                C0727o c0727o = (C0727o) weakReference.get();
                if (c0727o == null) {
                    this.f13673z.remove(weakReference);
                } else {
                    int id = c0727o.getId();
                    if (id > 0) {
                        Parcelable parcelable = (Parcelable) sparseParcelableArray.get(id);
                        if (parcelable != null) {
                            c0727o.onRestoreInstanceState(parcelable);
                        }
                    }
                }
            }
        }
    }

    public final void m9483b(C0727o c0727o) {
        Iterator it = this.f13673z.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            C0727o c0727o2 = (C0727o) weakReference.get();
            if (c0727o2 == null || c0727o2 == c0727o) {
                this.f13673z.remove(weakReference);
            }
        }
    }

    public final void m9484b(boolean z) {
        if (!this.f13671x) {
            this.f13671x = true;
            Iterator it = this.f13673z.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                C0727o c0727o = (C0727o) weakReference.get();
                if (c0727o == null) {
                    this.f13673z.remove(weakReference);
                } else {
                    c0727o.onCloseMenu(this, z);
                }
            }
            this.f13671x = false;
        }
    }

    boolean mo2623b() {
        return this.f13661n;
    }

    public boolean mo2624b(C4893j c4893j) {
        boolean z = false;
        if (!this.f13673z.isEmpty()) {
            if (this.f13658j != c4893j) {
                return false;
            }
            m9489d();
            Iterator it = this.f13673z.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                C0727o c0727o = (C0727o) weakReference.get();
                if (c0727o == null) {
                    this.f13673z.remove(weakReference);
                } else {
                    z = c0727o.collapseItemActionView(this, c4893j);
                    if (z) {
                        break;
                    }
                }
            }
            m9491e();
            if (z) {
                this.f13658j = null;
            }
        }
        return z;
    }

    public final void m9487c(Bundle bundle) {
        int size = size();
        SparseArray sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (!(actionView == null || actionView.getId() == -1)) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((C6399u) item.getSubMenu()).m9487c(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(mo2619a(), sparseArray);
        }
    }

    public boolean mo2625c() {
        return this.f13662o;
    }

    public void clear() {
        if (this.f13658j != null) {
            mo2624b(this.f13658j);
        }
        this.f13651c.clear();
        mo3264a(true);
    }

    public void clearHeader() {
        this.f13655g = null;
        this.f13654f = null;
        this.f13656h = null;
        mo3264a(false);
    }

    public void close() {
        m9484b(true);
    }

    public final void m9489d() {
        if (!this.f13668u) {
            this.f13668u = true;
            this.f13669v = false;
            this.f13670w = false;
        }
    }

    public final void m9490d(Bundle bundle) {
        if (bundle != null) {
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(mo2619a());
            int size = size();
            for (int i = 0; i < size; i++) {
                MenuItem item = getItem(i);
                View actionView = item.getActionView();
                if (!(actionView == null || actionView.getId() == -1)) {
                    actionView.restoreHierarchyState(sparseParcelableArray);
                }
                if (item.hasSubMenu()) {
                    ((C6399u) item.getSubMenu()).m9490d(bundle);
                }
            }
            int i2 = bundle.getInt("android:menu:expandedactionview");
            if (i2 > 0) {
                MenuItem findItem = findItem(i2);
                if (findItem != null) {
                    findItem.expandActionView();
                }
            }
        }
    }

    public final void m9491e() {
        this.f13668u = false;
        if (this.f13669v) {
            this.f13669v = false;
            mo3264a(this.f13670w);
        }
    }

    final void m9492f() {
        this.f13664q = true;
        mo3264a(true);
    }

    public MenuItem findItem(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            C4893j c4893j = (C4893j) this.f13651c.get(i2);
            if (c4893j.getItemId() == i) {
                return c4893j;
            }
            if (c4893j.hasSubMenu()) {
                MenuItem findItem = c4893j.getSubMenu().findItem(i);
                if (findItem != null) {
                    return findItem;
                }
            }
        }
        return null;
    }

    final void m9493g() {
        this.f13666s = true;
        mo3264a(true);
    }

    public MenuItem getItem(int i) {
        return (MenuItem) this.f13651c.get(i);
    }

    public final ArrayList<C4893j> m9494h() {
        if (!this.f13664q) {
            return this.f13663p;
        }
        this.f13663p.clear();
        int size = this.f13651c.size();
        for (int i = 0; i < size; i++) {
            C4893j c4893j = (C4893j) this.f13651c.get(i);
            if (c4893j.isVisible()) {
                this.f13663p.add(c4893j);
            }
        }
        this.f13664q = false;
        this.f13666s = true;
        return this.f13663p;
    }

    public boolean hasVisibleItems() {
        if (this.f13659k) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (((C4893j) this.f13651c.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void m9495i() {
        ArrayList h = m9494h();
        if (this.f13666s) {
            Iterator it = this.f13673z.iterator();
            int i = 0;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                C0727o c0727o = (C0727o) weakReference.get();
                if (c0727o == null) {
                    this.f13673z.remove(weakReference);
                } else {
                    i |= c0727o.flagActionItems();
                }
            }
            if (i != 0) {
                this.f13652d.clear();
                this.f13665r.clear();
                int size = h.size();
                for (i = 0; i < size; i++) {
                    C4893j c4893j = (C4893j) h.get(i);
                    (c4893j.m9516f() ? this.f13652d : this.f13665r).add(c4893j);
                }
            } else {
                this.f13652d.clear();
                this.f13665r.clear();
                this.f13665r.addAll(m9494h());
            }
            this.f13666s = false;
        }
    }

    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return m9468a(i, keyEvent) != null;
    }

    public final ArrayList<C4893j> m9496j() {
        m9495i();
        return this.f13665r;
    }

    public C4890h mo2626k() {
        return this;
    }

    public boolean performIdentifierAction(int i, int i2) {
        return m9481a(findItem(i), null, i2);
    }

    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        MenuItem a = m9468a(i, keyEvent);
        boolean a2 = a != null ? m9481a(a, null, i2) : false;
        if ((i2 & 2) != 0) {
            m9484b(true);
        }
        return a2;
    }

    public void removeGroup(int i) {
        int size = size();
        int i2 = 0;
        while (i2 < size) {
            if (((C4893j) this.f13651c.get(i2)).getGroupId() == i) {
                break;
            }
            i2++;
        }
        i2 = -1;
        if (i2 >= 0) {
            size = this.f13651c.size() - i2;
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                if (i3 >= size || ((C4893j) this.f13651c.get(i2)).getGroupId() != i) {
                    mo3264a(true);
                } else {
                    m9469a(i2, false);
                    i3 = i4;
                }
            }
            mo3264a(true);
        }
    }

    public void removeItem(int i) {
        int size = size();
        int i2 = 0;
        while (i2 < size) {
            if (((C4893j) this.f13651c.get(i2)).getItemId() == i) {
                break;
            }
            i2++;
        }
        i2 = -1;
        m9469a(i2, true);
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.f13651c.size();
        for (int i2 = 0; i2 < size; i2++) {
            C4893j c4893j = (C4893j) this.f13651c.get(i2);
            if (c4893j.getGroupId() == i) {
                c4893j.m9507a(z2);
                c4893j.setCheckable(z);
            }
        }
    }

    public void setGroupEnabled(int i, boolean z) {
        int size = this.f13651c.size();
        for (int i2 = 0; i2 < size; i2++) {
            C4893j c4893j = (C4893j) this.f13651c.get(i2);
            if (c4893j.getGroupId() == i) {
                c4893j.setEnabled(z);
            }
        }
    }

    public void setGroupVisible(int i, boolean z) {
        int size = this.f13651c.size();
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            C4893j c4893j = (C4893j) this.f13651c.get(i2);
            if (c4893j.getGroupId() == i && c4893j.m9510b(z)) {
                i3 = true;
            }
            i2++;
        }
        if (i3 != 0) {
            mo3264a(true);
        }
    }

    public void setQwertyMode(boolean z) {
        this.f13661n = z;
        mo3264a(false);
    }

    public int size() {
        return this.f13651c.size();
    }
}
