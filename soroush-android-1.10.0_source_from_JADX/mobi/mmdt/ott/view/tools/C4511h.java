package mobi.mmdt.ott.view.tools;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.p085c.p086a.C1212c;
import com.p085c.p086a.C1274i;
import com.p085c.p086a.p089c.p092b.C1144h;
import com.p085c.p086a.p105g.C1248f;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.componentsutils.view.roundavatarimageview.RoundAvatarImageView;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.lib_webservicescomponent.p257d.C2556b;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p384f.C2971k;
import mobi.mmdt.ott.provider.p384f.C2972l;

public final class C4511h {

    static /* synthetic */ class C45101 {
        public static final /* synthetic */ int[] f12461a = new int[C2972l.values().length];
        public static final /* synthetic */ int[] f12462b = new int[C2971k.values().length];

        static {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r0 = mobi.mmdt.ott.provider.p384f.C2971k.values();
            r0 = r0.length;
            r0 = new int[r0];
            f12462b = r0;
            r0 = 1;
            r1 = f12462b;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = mobi.mmdt.ott.provider.p384f.C2971k.ERROR;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = r2.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r1 = 2;
            r2 = f12462b;	 Catch:{ NoSuchFieldError -> 0x001f }
            r3 = mobi.mmdt.ott.provider.p384f.C2971k.SENDING;	 Catch:{ NoSuchFieldError -> 0x001f }
            r3 = r3.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2[r3] = r1;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r2 = 3;
            r3 = f12462b;	 Catch:{ NoSuchFieldError -> 0x002a }
            r4 = mobi.mmdt.ott.provider.p384f.C2971k.NOT_READ;	 Catch:{ NoSuchFieldError -> 0x002a }
            r4 = r4.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r3[r4] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r3 = 4;
            r4 = f12462b;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r5 = mobi.mmdt.ott.provider.p384f.C2971k.NOT_SEEN;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r5 = r5.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r4[r5] = r3;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            r4 = 5;
            r5 = f12462b;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r6 = mobi.mmdt.ott.provider.p384f.C2971k.DELIVERED;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r6 = r6.ordinal();	 Catch:{ NoSuchFieldError -> 0x0040 }
            r5[r6] = r4;	 Catch:{ NoSuchFieldError -> 0x0040 }
        L_0x0040:
            r5 = 6;
            r6 = f12462b;	 Catch:{ NoSuchFieldError -> 0x004b }
            r7 = mobi.mmdt.ott.provider.p384f.C2971k.PENDING;	 Catch:{ NoSuchFieldError -> 0x004b }
            r7 = r7.ordinal();	 Catch:{ NoSuchFieldError -> 0x004b }
            r6[r7] = r5;	 Catch:{ NoSuchFieldError -> 0x004b }
        L_0x004b:
            r6 = 7;
            r7 = f12462b;	 Catch:{ NoSuchFieldError -> 0x0056 }
            r8 = mobi.mmdt.ott.provider.p384f.C2971k.PENDING_RETRANSMIT;	 Catch:{ NoSuchFieldError -> 0x0056 }
            r8 = r8.ordinal();	 Catch:{ NoSuchFieldError -> 0x0056 }
            r7[r8] = r6;	 Catch:{ NoSuchFieldError -> 0x0056 }
        L_0x0056:
            r7 = 8;
            r8 = f12462b;	 Catch:{ NoSuchFieldError -> 0x0062 }
            r9 = mobi.mmdt.ott.provider.p384f.C2971k.SEEN;	 Catch:{ NoSuchFieldError -> 0x0062 }
            r9 = r9.ordinal();	 Catch:{ NoSuchFieldError -> 0x0062 }
            r8[r9] = r7;	 Catch:{ NoSuchFieldError -> 0x0062 }
        L_0x0062:
            r8 = 9;
            r9 = f12462b;	 Catch:{ NoSuchFieldError -> 0x006e }
            r10 = mobi.mmdt.ott.provider.p384f.C2971k.READ;	 Catch:{ NoSuchFieldError -> 0x006e }
            r10 = r10.ordinal();	 Catch:{ NoSuchFieldError -> 0x006e }
            r9[r10] = r8;	 Catch:{ NoSuchFieldError -> 0x006e }
        L_0x006e:
            r9 = 10;
            r10 = f12462b;	 Catch:{ NoSuchFieldError -> 0x007a }
            r11 = mobi.mmdt.ott.provider.p384f.C2971k.DRAFT;	 Catch:{ NoSuchFieldError -> 0x007a }
            r11 = r11.ordinal();	 Catch:{ NoSuchFieldError -> 0x007a }
            r10[r11] = r9;	 Catch:{ NoSuchFieldError -> 0x007a }
        L_0x007a:
            r10 = mobi.mmdt.ott.provider.p384f.C2972l.values();
            r10 = r10.length;
            r10 = new int[r10];
            f12461a = r10;
            r10 = f12461a;	 Catch:{ NoSuchFieldError -> 0x008d }
            r11 = mobi.mmdt.ott.provider.p384f.C2972l.IMAGE;	 Catch:{ NoSuchFieldError -> 0x008d }
            r11 = r11.ordinal();	 Catch:{ NoSuchFieldError -> 0x008d }
            r10[r11] = r0;	 Catch:{ NoSuchFieldError -> 0x008d }
        L_0x008d:
            r0 = f12461a;	 Catch:{ NoSuchFieldError -> 0x0097 }
            r10 = mobi.mmdt.ott.provider.p384f.C2972l.GIF;	 Catch:{ NoSuchFieldError -> 0x0097 }
            r10 = r10.ordinal();	 Catch:{ NoSuchFieldError -> 0x0097 }
            r0[r10] = r1;	 Catch:{ NoSuchFieldError -> 0x0097 }
        L_0x0097:
            r0 = f12461a;	 Catch:{ NoSuchFieldError -> 0x00a1 }
            r1 = mobi.mmdt.ott.provider.p384f.C2972l.VIDEO;	 Catch:{ NoSuchFieldError -> 0x00a1 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x00a1 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x00a1 }
        L_0x00a1:
            r0 = f12461a;	 Catch:{ NoSuchFieldError -> 0x00ab }
            r1 = mobi.mmdt.ott.provider.p384f.C2972l.FILE;	 Catch:{ NoSuchFieldError -> 0x00ab }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x00ab }
            r0[r1] = r3;	 Catch:{ NoSuchFieldError -> 0x00ab }
        L_0x00ab:
            r0 = f12461a;	 Catch:{ NoSuchFieldError -> 0x00b5 }
            r1 = mobi.mmdt.ott.provider.p384f.C2972l.PUSH_TO_TALK;	 Catch:{ NoSuchFieldError -> 0x00b5 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x00b5 }
            r0[r1] = r4;	 Catch:{ NoSuchFieldError -> 0x00b5 }
        L_0x00b5:
            r0 = f12461a;	 Catch:{ NoSuchFieldError -> 0x00bf }
            r1 = mobi.mmdt.ott.provider.p384f.C2972l.STICKER;	 Catch:{ NoSuchFieldError -> 0x00bf }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x00bf }
            r0[r1] = r5;	 Catch:{ NoSuchFieldError -> 0x00bf }
        L_0x00bf:
            r0 = f12461a;	 Catch:{ NoSuchFieldError -> 0x00c9 }
            r1 = mobi.mmdt.ott.provider.p384f.C2972l.VOTE;	 Catch:{ NoSuchFieldError -> 0x00c9 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x00c9 }
            r0[r1] = r6;	 Catch:{ NoSuchFieldError -> 0x00c9 }
        L_0x00c9:
            r0 = f12461a;	 Catch:{ NoSuchFieldError -> 0x00d3 }
            r1 = mobi.mmdt.ott.provider.p384f.C2972l.AUDIO;	 Catch:{ NoSuchFieldError -> 0x00d3 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x00d3 }
            r0[r1] = r7;	 Catch:{ NoSuchFieldError -> 0x00d3 }
        L_0x00d3:
            r0 = f12461a;	 Catch:{ NoSuchFieldError -> 0x00dd }
            r1 = mobi.mmdt.ott.provider.p384f.C2972l.MISSED_CALL;	 Catch:{ NoSuchFieldError -> 0x00dd }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x00dd }
            r0[r1] = r8;	 Catch:{ NoSuchFieldError -> 0x00dd }
        L_0x00dd:
            r0 = f12461a;	 Catch:{ NoSuchFieldError -> 0x00e7 }
            r1 = mobi.mmdt.ott.provider.p384f.C2972l.CALL;	 Catch:{ NoSuchFieldError -> 0x00e7 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x00e7 }
            r0[r1] = r9;	 Catch:{ NoSuchFieldError -> 0x00e7 }
        L_0x00e7:
            r0 = f12461a;	 Catch:{ NoSuchFieldError -> 0x00f3 }
            r1 = mobi.mmdt.ott.provider.p384f.C2972l.DRAFT;	 Catch:{ NoSuchFieldError -> 0x00f3 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x00f3 }
            r2 = 11;	 Catch:{ NoSuchFieldError -> 0x00f3 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x00f3 }
        L_0x00f3:
            r0 = f12461a;	 Catch:{ NoSuchFieldError -> 0x00ff }
            r1 = mobi.mmdt.ott.provider.p384f.C2972l.REPORT;	 Catch:{ NoSuchFieldError -> 0x00ff }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x00ff }
            r2 = 12;	 Catch:{ NoSuchFieldError -> 0x00ff }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x00ff }
        L_0x00ff:
            r0 = f12461a;	 Catch:{ NoSuchFieldError -> 0x010b }
            r1 = mobi.mmdt.ott.provider.p384f.C2972l.TEXT;	 Catch:{ NoSuchFieldError -> 0x010b }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x010b }
            r2 = 13;	 Catch:{ NoSuchFieldError -> 0x010b }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x010b }
        L_0x010b:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.tools.h.1.<clinit>():void");
        }
    }

    public static void m8223a(View view, boolean z) {
        if (view.getContext() != null) {
            view.setVisibility(z ? 0 : 8);
        }
    }

    public static void m8224a(TextView textView, String str) {
        if (str == null) {
            str = "";
        }
        if (C2535a.m6888a().m6919b().equals("fa")) {
            textView.setText(C2491i.m6814b(str));
        } else {
            textView.setText(str);
        }
    }

    public static void m8225a(RoundAvatarImageView roundAvatarImageView, String str, int i) {
        if (roundAvatarImageView != null) {
            C1274i a;
            Context context = roundAvatarImageView.getContext();
            int i2 = R.drawable.ic_place_holder_contact;
            if (i != 5) {
                switch (i) {
                    case 2:
                        i2 = R.drawable.ic_place_holder_group;
                        break;
                    case 3:
                        break;
                    default:
                        break;
                }
            }
            i2 = R.drawable.ic_place_holder_channel;
            if (str != null) {
                if (!str.isEmpty()) {
                    a = C1212c.m2875b(context).m10950a(C4515k.m8231a(C2556b.m6998a(str))).m3034a(C1248f.m2945b().m2955b(C1144h.f3689a).m2953b(i2).m2949a(i2));
                    a.m3031a((ImageView) roundAvatarImageView);
                }
            }
            a = C1212c.m2875b(context).m10950a(Integer.valueOf(i2));
            a.m3031a((ImageView) roundAvatarImageView);
        }
    }

    public static void m8226b(TextView textView, String str) {
        if (textView.getContext() != null) {
            int i = (str == null || str.isEmpty()) ? 8 : 0;
            textView.setVisibility(i);
        }
    }
}
