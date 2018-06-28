package com.cocosw.bottomsheet;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.support.v4.p033c.p034a.C0441a;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.ArrayList;
import java.util.List;
import org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager;

public final class C5286a implements C0441a {
    private static final int[] f14659d = new int[]{1, 4, 5, 3, 2, 0};
    Context f14660a;
    ArrayList<C5287b> f14661b = new ArrayList();
    private boolean f14662c;

    public C5286a(Context context) {
        this.f14660a = context;
    }

    private static int m10963a(int i) {
        int i2 = (-65536 & i) >> 16;
        if (i2 >= 0) {
            if (i2 < f14659d.length) {
                return (i & InBandBytestreamManager.MAXIMUM_BLOCK_SIZE) | (f14659d[i2] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    private static int m10964a(ArrayList<C5287b> arrayList, int i) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((C5287b) arrayList.get(size)).getOrder() <= i) {
                return size + 1;
            }
        }
        return 0;
    }

    private int m10965b(int i) {
        ArrayList arrayList = this.f14661b;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((C5287b) arrayList.get(i2)).getItemId() == i) {
                return i2;
            }
        }
        return -1;
    }

    private C5287b m10966c(int i) {
        boolean z = this.f14662c;
        ArrayList arrayList = this.f14661b;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C5287b c5287b = (C5287b) arrayList.get(i2);
            if (i == (z ? c5287b.getAlphabeticShortcut() : c5287b.getNumericShortcut())) {
                return c5287b;
            }
        }
        return null;
    }

    public final MenuItem m10967a(C5287b c5287b) {
        this.f14661b.add(C5286a.m10964a(this.f14661b, C5286a.m10963a(c5287b.getOrder())), c5287b);
        return c5287b;
    }

    public final MenuItem add(int i) {
        return add(0, 0, 0, i);
    }

    public final MenuItem add(int i, int i2, int i3, int i4) {
        return add(i, i2, i3, this.f14660a.getResources().getString(i4));
    }

    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        MenuItem c5287b = new C5287b(this.f14660a, i, i2, i3, charSequence);
        this.f14661b.add(C5286a.m10964a(this.f14661b, C5286a.m10963a(i3)), c5287b);
        return c5287b;
    }

    public final MenuItem add(CharSequence charSequence) {
        return add(0, 0, 0, charSequence);
    }

    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        PackageManager packageManager = this.f14660a.getPackageManager();
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

    public final SubMenu addSubMenu(int i) {
        return null;
    }

    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return null;
    }

    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return null;
    }

    public final SubMenu addSubMenu(CharSequence charSequence) {
        return null;
    }

    public final void clear() {
        this.f14661b.clear();
    }

    public final void close() {
    }

    public final MenuItem findItem(int i) {
        return (MenuItem) this.f14661b.get(m10965b(i));
    }

    public final MenuItem getItem(int i) {
        return (MenuItem) this.f14661b.get(i);
    }

    public final boolean hasVisibleItems() {
        ArrayList arrayList = this.f14661b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((C5287b) arrayList.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return m10966c(i) != null;
    }

    public final boolean performIdentifierAction(int i, int i2) {
        i = m10965b(i);
        return i < 0 ? false : ((C5287b) this.f14661b.get(i)).m10970b();
    }

    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        C5287b c = m10966c(i);
        return c == null ? false : c.m10970b();
    }

    public final void removeGroup(int i) {
        ArrayList arrayList = this.f14661b;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            if (((C5287b) arrayList.get(i2)).getGroupId() == i) {
                arrayList.remove(i2);
                size--;
            } else {
                i2++;
            }
        }
    }

    public final void removeItem(int i) {
        this.f14661b.remove(m10965b(i));
    }

    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        ArrayList arrayList = this.f14661b;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C5287b c5287b = (C5287b) arrayList.get(i2);
            if (c5287b.getGroupId() == i) {
                c5287b.setCheckable(z);
                c5287b.f14663a = (c5287b.f14663a & -5) | (z2 ? 4 : 0);
            }
        }
    }

    public final void setGroupEnabled(int i, boolean z) {
        ArrayList arrayList = this.f14661b;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C5287b c5287b = (C5287b) arrayList.get(i2);
            if (c5287b.getGroupId() == i) {
                c5287b.setEnabled(z);
            }
        }
    }

    public final void setGroupVisible(int i, boolean z) {
        ArrayList arrayList = this.f14661b;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C5287b c5287b = (C5287b) arrayList.get(i2);
            if (c5287b.getGroupId() == i) {
                c5287b.setVisible(z);
            }
        }
    }

    public final void setQwertyMode(boolean z) {
        this.f14662c = z;
    }

    public final int size() {
        return this.f14661b.size();
    }
}
