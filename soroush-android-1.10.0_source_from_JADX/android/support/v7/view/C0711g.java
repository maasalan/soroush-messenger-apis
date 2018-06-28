package android.support.v7.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff.Mode;
import android.support.v4.p033c.p034a.C0441a;
import android.support.v4.p033c.p034a.C0442b;
import android.support.v4.view.C0551b;
import android.support.v4.view.C0559f;
import android.support.v7.p041a.C0645a.C0644j;
import android.support.v7.view.menu.C4893j;
import android.support.v7.view.menu.C6395k;
import android.support.v7.widget.DrawableUtils;
import android.support.v7.widget.RecyclerView.ItemAnimator;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.jivesoftware.smack.roster.packet.RosterPacket.Item;
import org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class C0711g extends MenuInflater {
    static final Class<?>[] f2358a;
    static final Class<?>[] f2359b;
    final Object[] f2360c;
    final Object[] f2361d = this.f2360c;
    Context f2362e;
    Object f2363f;

    private static class C0709a implements OnMenuItemClickListener {
        private static final Class<?>[] f2323a = new Class[]{MenuItem.class};
        private Object f2324b;
        private Method f2325c;

        public C0709a(Object obj, String str) {
            this.f2324b = obj;
            Class cls = obj.getClass();
            try {
                this.f2325c = cls.getMethod(str, f2323a);
            } catch (Throwable e) {
                StringBuilder stringBuilder = new StringBuilder("Couldn't resolve menu item onClick handler ");
                stringBuilder.append(str);
                stringBuilder.append(" in class ");
                stringBuilder.append(cls.getName());
                InflateException inflateException = new InflateException(stringBuilder.toString());
                inflateException.initCause(e);
                throw inflateException;
            }
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f2325c.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f2325c.invoke(this.f2324b, new Object[]{menuItem})).booleanValue();
                }
                this.f2325c.invoke(this.f2324b, new Object[]{menuItem});
                return true;
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }
    }

    private class C0710b {
        C0551b f2326A;
        CharSequence f2327B;
        CharSequence f2328C;
        ColorStateList f2329D = null;
        Mode f2330E = null;
        final /* synthetic */ C0711g f2331F;
        Menu f2332a;
        int f2333b;
        int f2334c;
        int f2335d;
        int f2336e;
        boolean f2337f;
        boolean f2338g;
        boolean f2339h;
        int f2340i;
        int f2341j;
        CharSequence f2342k;
        CharSequence f2343l;
        int f2344m;
        char f2345n;
        int f2346o;
        char f2347p;
        int f2348q;
        int f2349r;
        boolean f2350s;
        boolean f2351t;
        boolean f2352u;
        int f2353v;
        int f2354w;
        String f2355x;
        String f2356y;
        String f2357z;

        public C0710b(C0711g c0711g, Menu menu) {
            this.f2331F = c0711g;
            this.f2332a = menu;
            m1719a();
        }

        static char m1717a(String str) {
            return str == null ? '\u0000' : str.charAt(0);
        }

        final <T> T m1718a(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor constructor = this.f2331F.f2362e.getClassLoader().loadClass(str).getConstructor(clsArr);
                constructor.setAccessible(true);
                return constructor.newInstance(objArr);
            } catch (Throwable e) {
                StringBuilder stringBuilder = new StringBuilder("Cannot instantiate class: ");
                stringBuilder.append(str);
                Log.w("SupportMenuInflater", stringBuilder.toString(), e);
                return null;
            }
        }

        public final void m1719a() {
            this.f2333b = 0;
            this.f2334c = 0;
            this.f2335d = 0;
            this.f2336e = 0;
            this.f2337f = true;
            this.f2338g = true;
        }

        final void m1720a(MenuItem menuItem) {
            int i = 0;
            menuItem.setChecked(this.f2350s).setVisible(this.f2351t).setEnabled(this.f2352u).setCheckable(this.f2349r > 0).setTitleCondensed(this.f2343l).setIcon(this.f2344m);
            if (this.f2353v >= 0) {
                menuItem.setShowAsAction(this.f2353v);
            }
            if (this.f2357z != null) {
                if (this.f2331F.f2362e.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                C0711g c0711g = this.f2331F;
                if (c0711g.f2363f == null) {
                    c0711g.f2363f = C0711g.m1722a(c0711g.f2362e);
                }
                menuItem.setOnMenuItemClickListener(new C0709a(c0711g.f2363f, this.f2357z));
            }
            if (this.f2349r >= 2) {
                if (menuItem instanceof C4893j) {
                    ((C4893j) menuItem).m9507a(true);
                } else if (menuItem instanceof C6395k) {
                    C6395k c6395k = (C6395k) menuItem;
                    try {
                        if (c6395k.f17523e == null) {
                            c6395k.f17523e = ((C0442b) c6395k.d).getClass().getDeclaredMethod("setExclusiveCheckable", new Class[]{Boolean.TYPE});
                        }
                        c6395k.f17523e.invoke(c6395k.d, new Object[]{Boolean.valueOf(true)});
                    } catch (Throwable e) {
                        Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e);
                    }
                }
            }
            if (this.f2355x != null) {
                menuItem.setActionView((View) m1718a(this.f2355x, C0711g.f2358a, this.f2331F.f2360c));
                i = 1;
            }
            if (this.f2354w > 0) {
                if (i == 0) {
                    menuItem.setActionView(this.f2354w);
                } else {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                }
            }
            if (this.f2326A != null) {
                C0559f.m1235a(menuItem, this.f2326A);
            }
            C0559f.m1240a(menuItem, this.f2327B);
            C0559f.m1242b(menuItem, this.f2328C);
            C0559f.m1241b(menuItem, this.f2345n, this.f2346o);
            C0559f.m1237a(menuItem, this.f2347p, this.f2348q);
            if (this.f2330E != null) {
                C0559f.m1239a(menuItem, this.f2330E);
            }
            if (this.f2329D != null) {
                C0559f.m1238a(menuItem, this.f2329D);
            }
        }

        public final SubMenu m1721b() {
            this.f2339h = true;
            SubMenu addSubMenu = this.f2332a.addSubMenu(this.f2333b, this.f2340i, this.f2341j, this.f2342k);
            m1720a(addSubMenu.getItem());
            return addSubMenu;
        }
    }

    static {
        Class[] clsArr = new Class[]{Context.class};
        f2358a = clsArr;
        f2359b = clsArr;
    }

    public C0711g(Context context) {
        super(context);
        this.f2362e = context;
        this.f2360c = new Object[]{context};
    }

    static Object m1722a(Object obj) {
        while (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) {
            obj = ((ContextWrapper) obj).getBaseContext();
        }
        return obj;
    }

    private void m1723a(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) {
        C0710b c0710b = new C0710b(this, menu);
        int eventType = xmlPullParser.getEventType();
        while (eventType != 2) {
            eventType = xmlPullParser.next();
            if (eventType == 1) {
                break;
            }
        }
        String name = xmlPullParser.getName();
        if (name.equals("menu")) {
            eventType = xmlPullParser.next();
            int i = eventType;
            Object obj = null;
            boolean z = false;
            boolean z2 = z;
            while (!z) {
                String name2;
                switch (i) {
                    case 1:
                        throw new RuntimeException("Unexpected end of document");
                    case 2:
                        if (!z2) {
                            name2 = xmlPullParser.getName();
                            TypedArray obtainStyledAttributes;
                            if (!name2.equals(Item.GROUP)) {
                                if (!name2.equals("item")) {
                                    if (!name2.equals("menu")) {
                                        z2 = true;
                                        obj = name2;
                                        break;
                                    }
                                    m1723a(xmlPullParser, attributeSet, c0710b.m1721b());
                                    break;
                                }
                                obtainStyledAttributes = c0710b.f2331F.f2362e.obtainStyledAttributes(attributeSet, C0644j.MenuItem);
                                c0710b.f2340i = obtainStyledAttributes.getResourceId(C0644j.MenuItem_android_id, 0);
                                c0710b.f2341j = (obtainStyledAttributes.getInt(C0644j.MenuItem_android_menuCategory, c0710b.f2334c) & -65536) | (obtainStyledAttributes.getInt(C0644j.MenuItem_android_orderInCategory, c0710b.f2335d) & InBandBytestreamManager.MAXIMUM_BLOCK_SIZE);
                                c0710b.f2342k = obtainStyledAttributes.getText(C0644j.MenuItem_android_title);
                                c0710b.f2343l = obtainStyledAttributes.getText(C0644j.MenuItem_android_titleCondensed);
                                c0710b.f2344m = obtainStyledAttributes.getResourceId(C0644j.MenuItem_android_icon, 0);
                                c0710b.f2345n = C0710b.m1717a(obtainStyledAttributes.getString(C0644j.MenuItem_android_alphabeticShortcut));
                                c0710b.f2346o = obtainStyledAttributes.getInt(C0644j.MenuItem_alphabeticModifiers, ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT);
                                c0710b.f2347p = C0710b.m1717a(obtainStyledAttributes.getString(C0644j.MenuItem_android_numericShortcut));
                                c0710b.f2348q = obtainStyledAttributes.getInt(C0644j.MenuItem_numericModifiers, ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT);
                                c0710b.f2349r = obtainStyledAttributes.hasValue(C0644j.MenuItem_android_checkable) ? obtainStyledAttributes.getBoolean(C0644j.MenuItem_android_checkable, false) : c0710b.f2336e;
                                c0710b.f2350s = obtainStyledAttributes.getBoolean(C0644j.MenuItem_android_checked, false);
                                c0710b.f2351t = obtainStyledAttributes.getBoolean(C0644j.MenuItem_android_visible, c0710b.f2337f);
                                c0710b.f2352u = obtainStyledAttributes.getBoolean(C0644j.MenuItem_android_enabled, c0710b.f2338g);
                                c0710b.f2353v = obtainStyledAttributes.getInt(C0644j.MenuItem_showAsAction, -1);
                                c0710b.f2357z = obtainStyledAttributes.getString(C0644j.MenuItem_android_onClick);
                                c0710b.f2354w = obtainStyledAttributes.getResourceId(C0644j.MenuItem_actionLayout, 0);
                                c0710b.f2355x = obtainStyledAttributes.getString(C0644j.MenuItem_actionViewClass);
                                c0710b.f2356y = obtainStyledAttributes.getString(C0644j.MenuItem_actionProviderClass);
                                boolean z3 = c0710b.f2356y != null;
                                if (z3 && c0710b.f2354w == 0 && c0710b.f2355x == null) {
                                    c0710b.f2326A = (C0551b) c0710b.m1718a(c0710b.f2356y, f2359b, c0710b.f2331F.f2361d);
                                } else {
                                    if (z3) {
                                        Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                                    }
                                    c0710b.f2326A = null;
                                }
                                c0710b.f2327B = obtainStyledAttributes.getText(C0644j.MenuItem_contentDescription);
                                c0710b.f2328C = obtainStyledAttributes.getText(C0644j.MenuItem_tooltipText);
                                if (obtainStyledAttributes.hasValue(C0644j.MenuItem_iconTintMode)) {
                                    c0710b.f2330E = DrawableUtils.parseTintMode(obtainStyledAttributes.getInt(C0644j.MenuItem_iconTintMode, -1), c0710b.f2330E);
                                } else {
                                    c0710b.f2330E = null;
                                }
                                if (obtainStyledAttributes.hasValue(C0644j.MenuItem_iconTint)) {
                                    c0710b.f2329D = obtainStyledAttributes.getColorStateList(C0644j.MenuItem_iconTint);
                                } else {
                                    c0710b.f2329D = null;
                                }
                                obtainStyledAttributes.recycle();
                                c0710b.f2339h = false;
                                break;
                            }
                            obtainStyledAttributes = c0710b.f2331F.f2362e.obtainStyledAttributes(attributeSet, C0644j.MenuGroup);
                            c0710b.f2333b = obtainStyledAttributes.getResourceId(C0644j.MenuGroup_android_id, 0);
                            c0710b.f2334c = obtainStyledAttributes.getInt(C0644j.MenuGroup_android_menuCategory, 0);
                            c0710b.f2335d = obtainStyledAttributes.getInt(C0644j.MenuGroup_android_orderInCategory, 0);
                            c0710b.f2336e = obtainStyledAttributes.getInt(C0644j.MenuGroup_android_checkableBehavior, 0);
                            c0710b.f2337f = obtainStyledAttributes.getBoolean(C0644j.MenuGroup_android_visible, true);
                            c0710b.f2338g = obtainStyledAttributes.getBoolean(C0644j.MenuGroup_android_enabled, true);
                            obtainStyledAttributes.recycle();
                            break;
                        }
                        break;
                        break;
                    case 3:
                        name2 = xmlPullParser.getName();
                        if (!z2 || !name2.equals(r6)) {
                            if (!name2.equals(Item.GROUP)) {
                                if (!name2.equals("item")) {
                                    if (!name2.equals("menu")) {
                                        break;
                                    }
                                    z = true;
                                    break;
                                } else if (!c0710b.f2339h) {
                                    if (c0710b.f2326A != null && c0710b.f2326A.hasSubMenu()) {
                                        c0710b.m1721b();
                                        break;
                                    }
                                    c0710b.f2339h = true;
                                    c0710b.m1720a(c0710b.f2332a.add(c0710b.f2333b, c0710b.f2340i, c0710b.f2341j, c0710b.f2342k));
                                    break;
                                } else {
                                    break;
                                }
                            }
                            c0710b.m1719a();
                            break;
                        }
                        obj = null;
                        z2 = false;
                        break;
                    default:
                        break;
                }
                i = xmlPullParser.next();
            }
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("Expecting menu, got ");
        stringBuilder.append(name);
        throw new RuntimeException(stringBuilder.toString());
    }

    public final void inflate(int i, Menu menu) {
        Throwable e;
        if (menu instanceof C0441a) {
            XmlResourceParser xmlResourceParser = null;
            try {
                XmlResourceParser layout = this.f2362e.getResources().getLayout(i);
                try {
                    m1723a(layout, Xml.asAttributeSet(layout), menu);
                    if (layout != null) {
                        layout.close();
                    }
                    return;
                } catch (XmlPullParserException e2) {
                    e = e2;
                    xmlResourceParser = layout;
                    throw new InflateException("Error inflating menu XML", e);
                } catch (IOException e3) {
                    e = e3;
                    xmlResourceParser = layout;
                    throw new InflateException("Error inflating menu XML", e);
                } catch (Throwable th) {
                    e = th;
                    xmlResourceParser = layout;
                    if (xmlResourceParser != null) {
                        xmlResourceParser.close();
                    }
                    throw e;
                }
            } catch (XmlPullParserException e4) {
                e = e4;
                throw new InflateException("Error inflating menu XML", e);
            } catch (IOException e5) {
                e = e5;
                throw new InflateException("Error inflating menu XML", e);
            } catch (Throwable th2) {
                e = th2;
                if (xmlResourceParser != null) {
                    xmlResourceParser.close();
                }
                throw e;
            }
        }
        super.inflate(i, menu);
    }
}
