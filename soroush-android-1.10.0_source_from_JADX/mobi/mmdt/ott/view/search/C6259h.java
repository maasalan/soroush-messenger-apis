package mobi.mmdt.ott.view.search;

import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.p085c.p086a.C1212c;
import com.p085c.p086a.p089c.p092b.C1144h;
import com.p085c.p086a.p105g.C1248f;
import java.util.HashSet;
import java.util.Set;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.componentsutils.view.roundavatarimageview.RoundAvatarImageView;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p385g.C2978e;
import mobi.mmdt.ott.view.conversation.emojisticker.emoji.emojicon.EmojiconTextView;
import mobi.mmdt.ott.view.tools.C4478a;
import mobi.mmdt.ott.view.tools.C4522p;
import mobi.mmdt.ott.view.tools.p477a.C4477a;
import mobi.mmdt.ott.view.tools.p479c.C4493a;
import mobi.mmdt.ott.view.tools.p479c.C4494b;
import mobi.mmdt.ott.view.tools.p480d.C4503a;
import mobi.mmdt.ott.view.tools.p481e.C4505a;

class C6259h extends ViewHolder {
    final View f17047a;
    private final FrameLayout f17048b;
    private final RoundAvatarImageView f17049c;
    private final TextView f17050d;
    private final EmojiconTextView f17051e;
    private final FrameLayout f17052f;
    private final ImageView f17053g;

    C6259h(View view) {
        super(view);
        this.f17047a = view;
        this.f17048b = (FrameLayout) view.findViewById(R.id.titleFrameSearch);
        this.f17049c = (RoundAvatarImageView) view.findViewById(R.id.search_avatar_image);
        this.f17050d = (TextView) view.findViewById(R.id.search_title_text);
        this.f17051e = (EmojiconTextView) view.findViewById(R.id.search_description_text);
        this.f17052f = (FrameLayout) view.findViewById(R.id.root_frameLayout);
        this.f17053g = (ImageView) view.findViewById(R.id.leftDrawableImageView);
    }

    void mo3258a() {
        C2491i.m6796a(this.f17047a.findViewById(R.id.divider_line), UIThemeManager.getmInstance().getLine_divider_in_main_activity_color());
        C2491i.m6802a(this.f17050d, UIThemeManager.getmInstance().getText_primary_color());
        C2491i.m6802a(this.f17051e, UIThemeManager.getmInstance().getText_secondary_color());
        C4503a.m8196a(false, this.f17050d, this.f17051e);
    }

    public void mo3259a(Context context, Cursor cursor, String str) {
        String a = C4494b.m8188a(cursor);
        String a2 = C4493a.m8186a((Activity) context, cursor);
        if (C2535a.m6888a().m6919b().equals("fa")) {
            a2 = C2491i.m6814b(a2);
        }
        String str2 = a2;
        String a3 = C4477a.m8135a(cursor);
        C2978e c2978e = C2978e.values()[cursor.getInt(cursor.getColumnIndex("dialog_type"))];
        m14599a(context, C4360g.m8114a(cursor), a3, a, str2, c2978e, C4505a.m8203a(cursor, "dialog_last_position"), null, str);
    }

    final void m14599a(Context context, String str, String str2, String str3, String str4, C2978e c2978e, String str5, String str6, String str7) {
        Context context2;
        ImageView imageView;
        String str8 = str7;
        this.f17050d.setText(str3);
        if (str8 != null) {
            context2 = context;
            TextView textView = new TextView(context2);
            C4503a.m8196a(false, textView);
            textView.setLayoutParams(new LayoutParams(-2, -2));
            textView.setText(str8);
            textView.setTextSize(16.0f);
            r7.f17048b.setVisibility(0);
            C2491i.m6796a(r7.f17048b, UIThemeManager.getmInstance().getAccent_color());
            C2491i.m6802a(textView, UIThemeManager.getmInstance().getButton_text_color());
            r7.f17048b.addView(textView);
        } else {
            context2 = context;
            r7.f17048b.removeAllViews();
        }
        int i = R.drawable.ic_place_holder_contact;
        switch (c2978e) {
            case GROUP:
                i = R.drawable.ic_place_holder_group;
                break;
            case CHANNEL:
                i = R.drawable.ic_place_holder_channel;
                break;
            default:
                break;
        }
        C1248f a = C1248f.m2945b().m2955b(C1144h.f3689a).m2953b(i).m2949a(i);
        r7.f17049c.setBackgroundColor(C2491i.m6806b(context2, str));
        C1212c.m2875b(context2).m10950a((Object) str2).m3034a(a).m3031a(r7.f17049c);
        r7.f17051e.setText(C2535a.m6888a().m6919b().equals("fa") ? C2491i.m6814b(str4) : str4);
        final String str9 = str;
        final C2978e c2978e2 = c2978e;
        final String str10 = str6;
        final String str11 = str5;
        r7.f17052f.setOnClickListener(new OnClickListener(r7) {
            final /* synthetic */ C6259h f12230f;

            public final void onClick(View view) {
                Set av = C2535a.m6888a().av();
                if (av == null) {
                    av = new HashSet();
                }
                if (av.size() >= 5) {
                    av.remove(((String[]) av.toArray(new String[5]))[4]);
                }
                av.add(str9);
                C2535a.m6888a().m6917a(av);
                switch (c2978e2) {
                    case SINGLE:
                        C4478a.m8150a((Activity) context2, str9, false, str10, str11);
                        return;
                    case GROUP:
                        C4478a.m8160b((Activity) context2, str9, false, str10, str11);
                        return;
                    case CHANNEL:
                        C4478a.m8144a((Activity) context2, str9, str10, str11);
                        return;
                    case BOT:
                        C4478a.m8159b((Activity) context2, str9, str10, str11);
                        return;
                    default:
                        return;
                }
            }
        });
        mo3258a();
        i = C43622.f12231a[c2978e.ordinal()];
        int i2 = R.drawable.ic_channel_conversation_black;
        switch (i) {
            case 1:
                r7.f17053g.setVisibility(8);
                break;
            case 2:
                r7.f17053g.setVisibility(0);
                imageView = r7.f17053g;
                i2 = R.drawable.ic_group_conversation;
                break;
            case 3:
            case 4:
                r7.f17053g.setVisibility(0);
                imageView = r7.f17053g;
                break;
            default:
                break;
        }
        imageView.setImageResource(i2);
        C2491i.m6801a(r7.f17053g, UIThemeManager.getmInstance().getText_primary_color());
    }

    public void mo3260b(Context context, Cursor cursor, String str) {
        String a = C4505a.m8203a(cursor, "title");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(C4505a.m8203a(cursor, "channel_members_count"));
        stringBuilder.append(" ");
        stringBuilder.append(C4522p.m8236a(R.string.members));
        String stringBuilder2 = stringBuilder.toString();
        Context context2 = context;
        m14599a(context2, C4360g.m8114a(cursor), C4505a.m8203a(cursor, "avatar_thumbnail_url"), a, stringBuilder2, C2978e.CHANNEL, null, null, str);
    }
}
