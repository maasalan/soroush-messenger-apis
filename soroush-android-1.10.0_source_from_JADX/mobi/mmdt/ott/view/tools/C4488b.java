package mobi.mmdt.ott.view.tools;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.C6389b;
import android.support.v7.app.C6389b.C0663a;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.p349f.C2814a;
import mobi.mmdt.ott.logic.p355i.p356a.C2827a;
import mobi.mmdt.ott.logic.p366o.p367a.C2878a;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p384f.C2973m;
import org.jivesoftware.smack.roster.packet.RosterPacket.Item;

public final class C4488b {

    static class C44791 implements OnClickListener {
        final /* synthetic */ C2814a f12412a;
        final /* synthetic */ C6389b f12413b;
        final /* synthetic */ Activity f12414c;

        public C44791(C2814a c2814a, C6389b c6389b, Activity activity) {
            this.f12412a = c2814a;
            this.f12413b = c6389b;
            this.f12414c = activity;
        }

        public final void onClick(View view) {
            C2827a.m7165a(this.f12412a);
            C2878a.m7232a();
            C2535a.m6888a().m6943g(0);
            this.f12413b.dismiss();
            if (C44824.f12419a[this.f12412a.ordinal()] == 1) {
                this.f12414c.finish();
            }
        }
    }

    static class C44802 implements OnClickListener {
        final /* synthetic */ C2814a f12415a;
        final /* synthetic */ C6389b f12416b;
        final /* synthetic */ Activity f12417c;

        public C44802(C2814a c2814a, C6389b c6389b, Activity activity) {
            this.f12415a = c2814a;
            this.f12416b = c6389b;
            this.f12417c = activity;
        }

        public final void onClick(View view) {
            C2814a c2814a = this.f12415a;
            Bundle bundle = new Bundle();
            String f = C2535a.m6888a().m6938f();
            int parseInt = Integer.parseInt(f.substring(f.length() - 1));
            bundle.putString("source", c2814a.name());
            bundle.putString("number", parseInt % 2 == 0 ? "even" : "odd");
            MyApplication.m12950a().m12957a("cafe_bazaar_rating_cancel", bundle);
            this.f12416b.dismiss();
            if (C44824.f12419a[this.f12415a.ordinal()] == 1) {
                this.f12417c.finish();
            }
        }
    }

    static class C44813 implements OnClickListener {
        final /* synthetic */ C6389b f12418a;

        public C44813(C6389b c6389b) {
            this.f12418a = c6389b;
        }

        public final void onClick(View view) {
            this.f12418a.dismiss();
        }
    }

    static /* synthetic */ class C44824 {
        static final /* synthetic */ int[] f12419a = new int[C2814a.values().length];

        static {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r0 = mobi.mmdt.ott.provider.p384f.C2973m.values();
            r0 = r0.length;
            r0 = new int[r0];
            f12420b = r0;
            r0 = 1;
            r1 = f12420b;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = mobi.mmdt.ott.provider.p384f.C2973m.SINGLE;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = r2.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r1 = f12420b;	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = mobi.mmdt.ott.provider.p384f.C2973m.GROUP;	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = r2.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r3 = 2;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1[r2] = r3;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r1 = f12420b;	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = mobi.mmdt.ott.provider.p384f.C2973m.BOT;	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = r2.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r3 = 3;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1[r2] = r3;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r1 = f12420b;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r2 = mobi.mmdt.ott.provider.p384f.C2973m.CHANNEL;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r2 = r2.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r3 = 4;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1[r2] = r3;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            r1 = mobi.mmdt.ott.logic.p349f.C2814a.values();
            r1 = r1.length;
            r1 = new int[r1];
            f12419a = r1;
            r1 = f12419a;	 Catch:{ NoSuchFieldError -> 0x0048 }
            r2 = mobi.mmdt.ott.logic.p349f.C2814a.CALL;	 Catch:{ NoSuchFieldError -> 0x0048 }
            r2 = r2.ordinal();	 Catch:{ NoSuchFieldError -> 0x0048 }
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x0048 }
        L_0x0048:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.tools.b.4.<clinit>():void");
        }
    }

    public static C6389b m8181a(Activity activity, String str, String str2, DialogInterface.OnClickListener onClickListener, String str3, DialogInterface.OnClickListener onClickListener2) {
        C0663a c0663a = new C0663a(activity, R.style.AppCompatAlertDialogStyle);
        c0663a.m1613b(str);
        c0663a.m1609a((CharSequence) str2, onClickListener);
        c0663a.m1614b(str3, onClickListener2);
        C6389b a = c0663a.m1612a();
        a.show();
        a.m15114a(-2).setTextColor(UIThemeManager.getmInstance().getAccent_color());
        a.m15114a(-1).setTextColor(UIThemeManager.getmInstance().getAccent_color());
        return a;
    }

    public static C6389b m8182a(Activity activity, String str, String str2, String str3, DialogInterface.OnClickListener onClickListener, String str4, DialogInterface.OnClickListener onClickListener2) {
        C0663a c0663a = new C0663a(activity, R.style.AppCompatAlertDialogStyle);
        c0663a.m1608a((CharSequence) str);
        c0663a.m1613b(str2);
        c0663a.m1609a((CharSequence) str3, onClickListener);
        c0663a.m1614b(str4, onClickListener2);
        C6389b a = c0663a.m1612a();
        a.show();
        a.m15114a(-2).setTextColor(UIThemeManager.getmInstance().getAccent_color());
        a.m15114a(-1).setTextColor(UIThemeManager.getmInstance().getAccent_color());
        return a;
    }

    public static C6389b m8183a(Activity activity, C2973m c2973m) {
        C0663a c0663a = new C0663a(activity);
        View inflate = activity.getLayoutInflater().inflate(R.layout.dialog_thanks_for_reporting, null);
        TextView textView = (TextView) inflate.findViewById(R.id.textView1);
        String str = "";
        switch (c2973m) {
            case SINGLE:
                str = "user";
                break;
            case GROUP:
                str = Item.GROUP;
                break;
            case BOT:
                str = "bot";
                break;
            case CHANNEL:
                str = "channel";
                break;
            default:
                break;
        }
        textView.setText(activity.getString(R.string.title_report_dialog, new Object[]{str}));
        c0663a.m1609a(C4522p.m8236a(R.string.ok_cap), null);
        c0663a.m1607a(inflate);
        C6389b a = c0663a.m1612a();
        a.show();
        a.m15114a(-2).setTextColor(UIThemeManager.getmInstance().getAccent_color());
        a.m15114a(-1).setTextColor(UIThemeManager.getmInstance().getAccent_color());
        return a;
    }

    public static void m8184a(android.app.Activity r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = new android.content.Intent;	 Catch:{ ActivityNotFoundException -> 0x0024 }
        r1 = "android.settings.APPLICATION_DETAILS_SETTINGS";	 Catch:{ ActivityNotFoundException -> 0x0024 }
        r0.<init>(r1);	 Catch:{ ActivityNotFoundException -> 0x0024 }
        r1 = new java.lang.StringBuilder;	 Catch:{ ActivityNotFoundException -> 0x0024 }
        r2 = "package:";	 Catch:{ ActivityNotFoundException -> 0x0024 }
        r1.<init>(r2);	 Catch:{ ActivityNotFoundException -> 0x0024 }
        r2 = r3.getPackageName();	 Catch:{ ActivityNotFoundException -> 0x0024 }
        r1.append(r2);	 Catch:{ ActivityNotFoundException -> 0x0024 }
        r1 = r1.toString();	 Catch:{ ActivityNotFoundException -> 0x0024 }
        r1 = android.net.Uri.parse(r1);	 Catch:{ ActivityNotFoundException -> 0x0024 }
        r0.setData(r1);	 Catch:{ ActivityNotFoundException -> 0x0024 }
        r3.startActivity(r0);	 Catch:{ ActivityNotFoundException -> 0x0024 }
        return;
    L_0x0024:
        r0 = new android.content.Intent;
        r1 = "android.settings.MANAGE_APPLICATIONS_SETTINGS";
        r0.<init>(r1);
        r3.startActivity(r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.tools.b.a(android.app.Activity):void");
    }

    public static C6389b m8185b(Activity activity, String str, String str2, String str3, DialogInterface.OnClickListener onClickListener, String str4, DialogInterface.OnClickListener onClickListener2) {
        C0663a c0663a = new C0663a(activity, R.style.AppCompatAlertDialogStyle);
        c0663a.m1608a((CharSequence) str);
        c0663a.m1613b(str2);
        c0663a.m1610a(false);
        c0663a.m1609a((CharSequence) str3, onClickListener);
        c0663a.m1614b(str4, onClickListener2);
        C6389b a = c0663a.m1612a();
        a.show();
        a.m15114a(-2).setTextColor(UIThemeManager.getmInstance().getAccent_color());
        a.m15114a(-1).setTextColor(UIThemeManager.getmInstance().getAccent_color());
        return a;
    }
}
