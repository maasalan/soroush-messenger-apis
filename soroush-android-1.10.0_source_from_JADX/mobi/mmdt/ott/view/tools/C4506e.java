package mobi.mmdt.ott.view.tools;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v7.widget.PopupMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import com.cocosw.bottomsheet.C1287c.C1286a;
import com.cocosw.bottomsheet.C5287b;

public final class C4506e {
    public static void m8204a(Activity activity, C1286a c1286a, int i) {
        if (VERSION.SDK_INT >= 26) {
            Menu menu = new PopupMenu(activity, null).getMenu();
            activity.getMenuInflater().inflate(i, menu);
            for (int i2 = 0; i2 < menu.size(); i2++) {
                MenuItem item = menu.getItem(i2);
                if (item != null && item.isVisible()) {
                    int itemId = item.getItemId();
                    Drawable icon = item.getIcon();
                    C5287b c5287b = new C5287b(c1286a.f4029a, 0, itemId, 0, item.getTitle());
                    c5287b.setIcon(icon);
                    c1286a.f4030b.m10967a(c5287b);
                }
            }
            return;
        }
        new MenuInflater(c1286a.f4029a).inflate(i, c1286a.f4030b);
    }
}
