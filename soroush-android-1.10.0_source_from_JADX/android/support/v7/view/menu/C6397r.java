package android.support.v7.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.support.v4.p033c.p034a.C0441a;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.Iterator;

class C6397r extends C4887c<C0441a> implements Menu {
    C6397r(Context context, C0441a c0441a) {
        super(context, c0441a);
    }

    public MenuItem add(int i) {
        return m9464a(((C0441a) this.d).add(i));
    }

    public MenuItem add(int i, int i2, int i3, int i4) {
        return m9464a(((C0441a) this.d).add(i, i2, i3, i4));
    }

    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return m9464a(((C0441a) this.d).add(i, i2, i3, charSequence));
    }

    public MenuItem add(CharSequence charSequence) {
        return m9464a(((C0441a) this.d).add(charSequence));
    }

    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        C6397r c6397r = this;
        MenuItem[] menuItemArr2 = menuItemArr;
        MenuItem[] menuItemArr3 = menuItemArr2 != null ? new MenuItem[menuItemArr2.length] : null;
        int addIntentOptions = ((C0441a) c6397r.d).addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr3);
        if (menuItemArr3 != null) {
            int length = menuItemArr3.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr2[i5] = m9464a(menuItemArr3[i5]);
            }
        }
        return addIntentOptions;
    }

    public SubMenu addSubMenu(int i) {
        return m9465a(((C0441a) this.d).addSubMenu(i));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return m9465a(((C0441a) this.d).addSubMenu(i, i2, i3, i4));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return m9465a(((C0441a) this.d).addSubMenu(i, i2, i3, charSequence));
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return m9465a(((C0441a) this.d).addSubMenu(charSequence));
    }

    public void clear() {
        if (this.f13635b != null) {
            this.f13635b.clear();
        }
        if (this.f13636c != null) {
            this.f13636c.clear();
        }
        ((C0441a) this.d).clear();
    }

    public void close() {
        ((C0441a) this.d).close();
    }

    public MenuItem findItem(int i) {
        return m9464a(((C0441a) this.d).findItem(i));
    }

    public MenuItem getItem(int i) {
        return m9464a(((C0441a) this.d).getItem(i));
    }

    public boolean hasVisibleItems() {
        return ((C0441a) this.d).hasVisibleItems();
    }

    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return ((C0441a) this.d).isShortcutKey(i, keyEvent);
    }

    public boolean performIdentifierAction(int i, int i2) {
        return ((C0441a) this.d).performIdentifierAction(i, i2);
    }

    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return ((C0441a) this.d).performShortcut(i, keyEvent, i2);
    }

    public void removeGroup(int i) {
        if (this.f13635b != null) {
            Iterator it = this.f13635b.keySet().iterator();
            while (it.hasNext()) {
                if (i == ((MenuItem) it.next()).getGroupId()) {
                    it.remove();
                }
            }
        }
        ((C0441a) this.d).removeGroup(i);
    }

    public void removeItem(int i) {
        if (this.f13635b != null) {
            Iterator it = this.f13635b.keySet().iterator();
            while (it.hasNext()) {
                if (i == ((MenuItem) it.next()).getItemId()) {
                    it.remove();
                    break;
                }
            }
        }
        ((C0441a) this.d).removeItem(i);
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
        ((C0441a) this.d).setGroupCheckable(i, z, z2);
    }

    public void setGroupEnabled(int i, boolean z) {
        ((C0441a) this.d).setGroupEnabled(i, z);
    }

    public void setGroupVisible(int i, boolean z) {
        ((C0441a) this.d).setGroupVisible(i, z);
    }

    public void setQwertyMode(boolean z) {
        ((C0441a) this.d).setQwertyMode(z);
    }

    public int size() {
        return ((C0441a) this.d).size();
    }
}
