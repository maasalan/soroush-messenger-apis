package mobi.mmdt.ott.provider.p388j;

import android.database.Cursor;

public final class C2996b {
    public long f9395a;
    public String f9396b;
    public int f9397c;
    public int f9398d;
    public Integer f9399e;
    public Boolean f9400f;
    public Integer f9401g;
    public String f9402h;
    public Integer f9403i;
    public Long f9404j = Long.valueOf(0);

    public static class C2995a {
        public C2996b f9394a = new C2996b();

        public final C2995a m7483a(int i) {
            if (i == 0) {
                throw new IllegalArgumentException("type must not be null");
            }
            this.f9394a.f9397c = i;
            return this;
        }

        public final C2995a m7484a(long j) {
            this.f9394a.f9395a = j;
            return this;
        }

        public final C2995a m7485a(Boolean bool) {
            this.f9394a.f9400f = bool;
            return this;
        }

        public final C2995a m7486a(Integer num) {
            this.f9394a.f9399e = num;
            return this;
        }

        public final C2995a m7487a(String str) {
            this.f9394a.f9396b = str;
            return this;
        }

        public final C2996b m7488a() {
            if (this.f9394a.f9397c != 0) {
                return this.f9394a;
            }
            throw new IllegalArgumentException("type must not be null");
        }

        public final C2995a m7489b(int i) {
            this.f9394a.f9398d = i;
            return this;
        }

        public final C2995a m7490b(Integer num) {
            this.f9394a.f9401g = num;
            return this;
        }

        public final C2995a m7491b(String str) {
            this.f9394a.f9402h = str;
            return this;
        }

        public final C2995a m7492c(Integer num) {
            this.f9394a.f9403i = num;
            return this;
        }
    }

    public static C2996b m7493a(Cursor cursor) {
        C2996b c2996b = new C2996b();
        c2996b.f9395a = (long) cursor.getInt(cursor.getColumnIndex("_id"));
        c2996b.f9396b = cursor.getString(cursor.getColumnIndex("row_title"));
        c2996b.f9397c = C2998f.m7495a()[cursor.getInt(cursor.getColumnIndex("row_type"))];
        c2996b.f9398d = cursor.getInt(cursor.getColumnIndex("row_parent_landing_page_id"));
        c2996b.f9399e = Integer.valueOf(cursor.getInt(cursor.getColumnIndex("row_display_order")));
        c2996b.f9400f = Boolean.valueOf(cursor.getInt(cursor.getColumnIndex("row_category_has_more_items")) != 0);
        c2996b.f9401g = Integer.valueOf(cursor.getInt(cursor.getColumnIndex("row_interval")));
        c2996b.f9402h = cursor.getString(cursor.getColumnIndex("row_category_image"));
        c2996b.f9403i = Integer.valueOf(cursor.getInt(cursor.getColumnIndex("row_category_visible_items_counts")));
        c2996b.f9404j = Long.valueOf(cursor.getLong(cursor.getColumnIndex("row_updated_at")));
        return c2996b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f9395a == ((C2996b) obj).f9395a;
    }

    public final int hashCode() {
        return (int) (this.f9395a ^ (this.f9395a >>> 32));
    }
}
