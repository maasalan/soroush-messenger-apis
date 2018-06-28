package mobi.mmdt.ott.logic.p355i.p356a;

import android.os.Bundle;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.logic.p349f.C2814a;
import mobi.mmdt.ott.p246d.p248b.C2535a;

public final class C2827a {
    public static void m7163a() {
        MyApplication.m12950a().m12960c("download_video_clicked");
    }

    public static void m7164a(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("selected_navigation_menu_item", str);
        MyApplication.m12950a().m12957a("navigation_item_selected", bundle);
    }

    public static void m7165a(C2814a c2814a) {
        Bundle bundle = new Bundle();
        String f = C2535a.m6888a().m6938f();
        int parseInt = Integer.parseInt(f.substring(f.length() - 1));
        bundle.putString("source", c2814a.name());
        bundle.putString("number", parseInt % 2 == 0 ? "even" : "odd");
        MyApplication.m12950a().m12957a("cafe_bazaar_rating_open", bundle);
    }

    public static void m7166b(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("name", str);
        MyApplication.m12950a().m12957a("change_theme", bundle);
    }
}
