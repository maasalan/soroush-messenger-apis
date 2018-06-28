package mobi.mmdt.ott.provider.p395q;

import android.database.Cursor;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.base.SuggestedChannelCategory;

public final class C3019b {
    public String f9474a;
    public String f9475b;
    Integer f9476c;
    public String f9477d;
    String f9478e;
    public String f9479f;
    public String f9480g;
    Long f9481h;
    public Long f9482i;
    public C3021f f9483j;
    Integer f9484k;
    boolean f9485l;
    Integer f9486m;
    String f9487n;
    private long f9488o;
    private Long f9489p = Long.valueOf(0);

    public static class C3018a {
        private C3019b f9473a = new C3019b();

        public final C3018a m7533a() {
            this.f9473a.f9485l = false;
            return this;
        }

        public final C3018a m7534a(Integer num) {
            this.f9473a.f9476c = num;
            return this;
        }

        public final C3018a m7535a(String str) {
            this.f9473a.f9474a = str;
            return this;
        }

        public final C3018a m7536a(C3021f c3021f) {
            this.f9473a.f9483j = c3021f;
            return this;
        }

        public final C3018a m7537b(Integer num) {
            this.f9473a.f9484k = num;
            return this;
        }

        public final C3018a m7538b(String str) {
            this.f9473a.f9475b = str;
            return this;
        }

        public final C3019b m7539b() {
            if (this.f9473a.f9474a != null) {
                return this.f9473a;
            }
            throw new IllegalArgumentException("party must not be null");
        }

        public final C3018a m7540c(Integer num) {
            this.f9473a.f9486m = num;
            return this;
        }

        public final C3018a m7541c(String str) {
            this.f9473a.f9477d = str;
            return this;
        }
    }

    public static C3019b m7542a(Cursor cursor) {
        C3019b c3019b = new C3019b();
        c3019b.f9488o = 0;
        c3019b.f9474a = cursor.getString(cursor.getColumnIndex("party"));
        c3019b.f9475b = cursor.getString(cursor.getColumnIndex("title"));
        c3019b.f9476c = Integer.valueOf(cursor.getInt(cursor.getColumnIndex("parent_category_id")));
        c3019b.f9477d = cursor.getString(cursor.getColumnIndex("description"));
        c3019b.f9478e = cursor.getString(cursor.getColumnIndex("channel_link"));
        c3019b.f9479f = cursor.getString(cursor.getColumnIndex("avatar_url"));
        c3019b.f9480g = cursor.getString(cursor.getColumnIndex("avatar_thumbnail_url"));
        c3019b.f9481h = Long.valueOf(cursor.getLong(cursor.getColumnIndex("channel_creation_date")));
        c3019b.f9482i = Long.valueOf(cursor.getLong(cursor.getColumnIndex("channel_members_count")));
        c3019b.f9483j = C3021f.values()[cursor.getInt(cursor.getColumnIndex("item_type"))];
        c3019b.f9489p = Long.valueOf(cursor.getLong(cursor.getColumnIndex("category_updated_at")));
        c3019b.f9484k = Integer.valueOf(cursor.getInt(cursor.getColumnIndex("item_index")));
        c3019b.f9485l = cursor.getInt(cursor.getColumnIndex("is_disabled")) != 0;
        c3019b.f9486m = Integer.valueOf(cursor.getInt(cursor.getColumnIndex("avatar_res_id")));
        c3019b.f9487n = cursor.getString(cursor.getColumnIndex("extra"));
        return c3019b;
    }

    public static C3019b m7543a(SuggestedChannelCategory suggestedChannelCategory) {
        C3019b c3019b = new C3019b();
        c3019b.f9488o = suggestedChannelCategory.getId();
        c3019b.f9474a = suggestedChannelCategory.getParty();
        c3019b.f9475b = suggestedChannelCategory.getTitle();
        c3019b.f9476c = suggestedChannelCategory.getParentCategoryId();
        c3019b.f9477d = suggestedChannelCategory.getDescription();
        c3019b.f9478e = suggestedChannelCategory.getChannelLink();
        c3019b.f9479f = suggestedChannelCategory.getAvatarUrl();
        c3019b.f9480g = suggestedChannelCategory.getAvatarThumbnailUrl();
        c3019b.f9481h = suggestedChannelCategory.getChannelCreationDate();
        c3019b.f9482i = suggestedChannelCategory.getChannelMembersCount();
        c3019b.f9483j = C3021f.values()[suggestedChannelCategory.getItemType().ordinal()];
        c3019b.f9489p = suggestedChannelCategory.getCategoryUpdatedAt();
        c3019b.f9484k = suggestedChannelCategory.getItemIndex();
        c3019b.f9485l = suggestedChannelCategory.getIsDisabled();
        c3019b.f9486m = suggestedChannelCategory.getAvatarResId();
        c3019b.f9487n = suggestedChannelCategory.getExtra();
        return c3019b;
    }

    public final Long m7544a() {
        return this.f9489p == null ? Long.valueOf(0) : this.f9489p;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f9488o == ((C3019b) obj).f9488o;
    }

    public final int hashCode() {
        return (int) (this.f9488o ^ (this.f9488o >>> 32));
    }
}
