package mobi.mmdt.ott.view.newdesign.mainpage.p467c;

import android.app.Activity;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v4.widget.DrawerLayout.C0585c;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import mobi.mmdt.componentsutils.view.roundavatarimageview.RoundAvatarImageView;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.view.components.p401c.C3126i;
import mobi.mmdt.ott.view.conversation.p424b.C3406c;
import mobi.mmdt.ott.view.newdesign.mainpage.p467c.p581b.C7373b;
import mobi.mmdt.ott.view.tools.C4478a;
import mobi.mmdt.ott.view.tools.C4522p;

public final class C4271a {
    public DrawerLayout f12058a;
    public NavigationView f12059b;
    public C6939b f12060c;
    public ImageView f12061d;
    public TextView f12062e;
    public TextView f12063f;
    public ImageView f12064g;
    public ImageView f12065h;
    public RoundAvatarImageView f12066i;
    public C4272c f12067j = null;

    public C4271a(final Activity activity, C3126i c3126i) {
        this.f12058a = (DrawerLayout) activity.findViewById(R.id.drawer_layout);
        this.f12059b = (NavigationView) activity.findViewById(R.id.nav_view);
        RecyclerView recyclerView = (RecyclerView) activity.findViewById(R.id.nav_recycler_view);
        this.f12060c = new C6939b(activity, c3126i);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(this.f12060c);
        recyclerView.setLayoutManager(new LinearLayoutManager(activity));
        if (this.f12059b != null) {
            View a = this.f12059b.m8768a((int) R.layout.navigation_drawer_header_layout);
            if (a != null) {
                this.f12061d = (ImageView) a.findViewById(R.id.nav_drawer_account_background);
                this.f12063f = (TextView) a.findViewById(R.id.accountNumber_textView);
                this.f12064g = (ImageView) a.findViewById(R.id.ic_cloud_image);
                this.f12062e = (TextView) a.findViewById(R.id.accountName_textView);
                this.f12062e.setTypeface(this.f12062e.getTypeface(), 1);
                this.f12062e.setAlpha(0.8f);
                this.f12065h = (ImageView) a.findViewById(R.id.ic_night_mode);
                final boolean z = C2535a.m6888a().f8278a.getBoolean("mobi.mmdt.ott.model.pref.KEY_IS_NIGHT_MODE_ENABLE", false);
                this.f12065h.setImageResource(z ? R.drawable.ic_moon_fill : R.drawable.ic_moon_empty);
                this.f12065h.setOnClickListener(new OnClickListener(this) {
                    final /* synthetic */ C4271a f12051b;

                    public final void onClick(android.view.View r8) {
                        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
                        /*
                        r7 = this;
                        r8 = r14;
                        r0 = 1;
                        r8 = r8 ^ r0;
                        r1 = 0;
                        if (r8 == 0) goto L_0x00d4;
                    L_0x0007:
                        r0 = mobi.mmdt.ott.p246d.p248b.C2535a.m6888a();
                        r2 = mobi.mmdt.ott.p246d.p248b.C2535a.m6888a();
                        r2 = r2.ab();
                        r0 = r0.f8278a;
                        r0 = r0.edit();
                        r3 = "mobi.mmdt.ott.model.pref.KEY_PREVIOUS_CURRENT_THEME_PATH";
                        r0 = r0.putString(r3, r2);
                        r0.apply();
                        r0 = mobi.mmdt.ott.logic.C2791c.m7109a();
                        r0 = r0.f8820f;
                        r2 = new java.lang.StringBuilder;
                        r2.<init>();
                        r2.append(r0);
                        r3 = java.io.File.separator;
                        r2.append(r3);
                        r3 = "default_dark_theme";
                        r2.append(r3);
                        r2 = r2.toString();
                        r3 = new java.io.File;
                        r4 = new java.lang.StringBuilder;
                        r4.<init>();
                        r4.append(r2);
                        r5 = java.io.File.separator;
                        r4.append(r5);
                        r5 = "default_dark_theme.stheme";
                        r4.append(r5);
                        r4 = r4.toString();
                        r3.<init>(r4);
                        r3 = r3.exists();
                        if (r3 == 0) goto L_0x0074;
                    L_0x005f:
                        r4 = mobi.mmdt.ott.p246d.p248b.C2535a.m6888a();
                        r4 = r4.as();
                        r5 = 11;
                        if (r4 == r5) goto L_0x0074;
                    L_0x006b:
                        r3 = new java.io.File;
                        r3.<init>(r0);
                        mobi.mmdt.ott.view.tools.p482f.C4507a.m8208a(r3);
                        goto L_0x0075;
                    L_0x0074:
                        r1 = r3;
                    L_0x0075:
                        if (r1 == 0) goto L_0x007c;
                    L_0x0077:
                        mobi.mmdt.ott.view.tools.p482f.C4507a.m8210a(r2);
                        goto L_0x0123;
                    L_0x007c:
                        r0 = mobi.mmdt.ott.logic.C2791c.m7109a();
                        r0 = r0.f8820f;
                        r1 = new java.lang.StringBuilder;
                        r1.<init>();
                        r1.append(r0);
                        r3 = java.io.File.separator;
                        r1.append(r3);
                        r3 = "default_dark_theme";
                        r1.append(r3);
                        r3 = java.io.File.separator;
                        r1.append(r3);
                        r1 = r1.toString();
                        r3 = mobi.mmdt.ott.MyApplication.m12952b();
                        r4 = "default_dark_theme.stheme2";
                        r5 = new java.lang.StringBuilder;
                        r5.<init>();
                        r5.append(r0);
                        r6 = java.io.File.separator;
                        r5.append(r6);
                        r6 = "default_dark_theme.stheme2";
                        r5.append(r6);
                        r5 = r5.toString();
                        r3 = mobi.mmdt.ott.view.tools.p482f.C4507a.m8216a(r3, r4, r5);
                        if (r3 == 0) goto L_0x0123;
                    L_0x00bf:
                        r3 = "default_dark_theme.stheme2";
                        r4 = "default_dark_theme.zip";
                        r0 = mobi.mmdt.ott.view.tools.p482f.C4507a.m8218a(r0, r1, r3, r4);
                        if (r0 != 0) goto L_0x0123;
                    L_0x00c9:
                        mobi.mmdt.ott.view.tools.p482f.C4507a.m8210a(r2);
                        r0 = mobi.mmdt.ott.p246d.p248b.C2535a.m6888a();
                        r0.ar();
                        goto L_0x0123;
                    L_0x00d4:
                        r2 = mobi.mmdt.ott.p246d.p248b.C2535a.m6888a();
                        r2 = r2.f8278a;
                        r3 = "mobi.mmdt.ott.model.pref.KEY_PREVIOUS_CURRENT_THEME_PATH";
                        r4 = "";
                        r2 = r2.getString(r3, r4);
                        r3 = r2.isEmpty();
                        if (r3 != 0) goto L_0x0137;
                    L_0x00e8:
                        r3 = mobi.mmdt.ott.p246d.p248b.C2535a.m6888a();
                        r3 = r3.ac();
                        r3 = r2.equalsIgnoreCase(r3);
                        if (r3 != 0) goto L_0x0137;
                    L_0x00f6:
                        r3 = new java.io.File;
                        r3.<init>(r2);
                        r3 = r3.exists();
                        if (r3 != 0) goto L_0x0102;
                    L_0x0101:
                        goto L_0x0137;
                    L_0x0102:
                        r0 = new java.io.File;
                        r0.<init>(r2);
                        r0 = r0.getParent();
                        r1 = mobi.mmdt.ott.logic.C2791c.m7109a();
                        r1 = r1.f8820f;
                        r1 = r0.equalsIgnoreCase(r1);
                        if (r1 == 0) goto L_0x0120;
                    L_0x0117:
                        r0 = new mobi.mmdt.ott.logic.a.ae.b.d;
                        r0.<init>(r2);
                        mobi.mmdt.ott.logic.C2808d.m7147a(r0);
                        goto L_0x0123;
                    L_0x0120:
                        mobi.mmdt.ott.view.tools.p482f.C4507a.m8210a(r0);
                    L_0x0123:
                        r0 = new android.os.Bundle;
                        r0.<init>();
                        r1 = "is_night_mode_selected";
                        r0.putBoolean(r1, r8);
                        r8 = mobi.mmdt.ott.MyApplication.m12950a();
                        r1 = "night_mode_on_click";
                        r8.m12957a(r1, r0);
                        return;
                    L_0x0137:
                        mobi.mmdt.ott.view.tools.p482f.C4507a.m8215a(r0, r0, r1);	 Catch:{ Exception -> 0x013b }
                        return;
                    L_0x013b:
                        r8 = p000a.p001a.p002a.C0005c.m0a();
                        r0 = new mobi.mmdt.ott.logic.a.ae.a.a;
                        r0.<init>();
                        r8.m9d(r0);
                        return;
                        */
                        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.newdesign.mainpage.c.a.1.onClick(android.view.View):void");
                    }
                });
                this.f12066i = (RoundAvatarImageView) a.findViewById(R.id.accountImage_imageView);
                this.f12066i.setOnClickListener(new OnClickListener(this) {
                    final /* synthetic */ C4271a f12053b;

                    public final void onClick(View view) {
                        C4271a c4271a = this.f12053b;
                        Activity activity = activity;
                        c4271a.f12058a.m1452f(c4271a.f12059b);
                        C4478a.m8138a(activity);
                    }
                });
                this.f12061d.setOnClickListener(new OnClickListener(this) {
                    final /* synthetic */ C4271a f12055b;

                    public final void onClick(View view) {
                        C4271a c4271a = this.f12055b;
                        Activity activity = activity;
                        String d = C2535a.m6888a().m6928d();
                        c4271a.f12058a.m1452f(c4271a.f12059b);
                        C4478a.m8150a(activity, d, false, null, "");
                    }
                });
                this.f12058a.m1446a(new C0585c(this) {
                    final /* synthetic */ C4271a f16899b;

                    public final void mo2405a(View view) {
                        C3406c.m7858a(activity, view);
                    }
                });
            }
            List arrayList = new ArrayList();
            arrayList.add(new C7373b(102, C4522p.m8236a(R.string.new_group_chat), R.drawable.ic_new_group_conversation, false, 0));
            arrayList.add(new C7373b(103, C4522p.m8236a(R.string.new_channel), R.drawable.ic_new_channel, false, 1));
            arrayList.add(new C7373b(110, C4522p.m8236a(R.string.contacts_setting_item), R.drawable.ic_contact_list, false, 2));
            arrayList.add(new C7373b(106, C4522p.m8236a(R.string.sticker_market), R.drawable.ic_shopping, true, 3));
            arrayList.add(new C7373b(107, C4522p.m8236a(R.string.calls), R.drawable.ic_action_communication_call, false, 4));
            arrayList.add(new C7373b(108, C4522p.m8236a(R.string.settings), R.drawable.ic_settings, true, 5));
            arrayList.add(new C7373b(111, C4522p.m8236a(R.string.support), R.drawable.ic_support, false, 6));
            this.f12060c.m13673a(arrayList);
        }
    }

    public final void m8068a() {
        this.f12058a.m1452f(this.f12059b);
    }
}
