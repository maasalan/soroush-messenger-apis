package mobi.mmdt.ott.p561a;

import android.databinding.C0130f;
import android.databinding.C0131g;
import android.databinding.C0133h;
import android.databinding.ViewDataBinding;
import android.databinding.ViewDataBinding.C0120b;
import android.databinding.p020a.p021a.C0124a;
import android.databinding.p020a.p021a.C0124a.C0123a;
import android.databinding.p020a.p021a.C0126b;
import android.databinding.p020a.p021a.C0126b.C0125a;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import mobi.mmdt.componentsutils.view.roundavatarimageview.RoundAvatarImageView;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.conversation.emojisticker.emoji.emojicon.EmojiconTextView;
import mobi.mmdt.ott.view.conversation.forward.C4054e;
import mobi.mmdt.ott.view.main.p454c.p455a.p457b.C7365a;
import mobi.mmdt.ott.view.main.p459d.p460a.C4185a;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

public final class C7160d extends ViewDataBinding implements C0123a, C0125a {
    private static final C0120b f20522t = null;
    private static final SparseIntArray f20523u;
    private long f20524A = -1;
    public final View f20525d;
    public final CheckBox f20526e;
    public final View f20527f;
    public final TextView f20528g;
    public final RoundAvatarImageView f20529h;
    public final ImageView f20530i;
    public final ImageView f20531j;
    public final FrameLayout f20532k;
    public final LinearLayout f20533l;
    public final ImageView f20534m;
    public final TextView f20535n;
    public final TextView f20536o;
    public final EmojiconTextView f20537p;
    public final TextView f20538q;
    public final LinearLayout f20539r;
    public final View f20540s;
    private C4185a f20541v;
    private C4054e f20542w;
    private C7365a f20543x;
    private final OnCheckedChangeListener f20544y;
    private final OnClickListener f20545z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20523u = sparseIntArray;
        sparseIntArray.put(R.id.divider_textView, 12);
        f20523u.put(R.id.center_anchor, 13);
        f20523u.put(R.id.leftDrawableImageView, 14);
        f20523u.put(R.id.view1, 15);
    }

    public C7160d(C0130f c0130f, View view) {
        super(c0130f, view, 1);
        Object[] a = ViewDataBinding.m14831a(c0130f, view, 16, f20522t, f20523u);
        this.f20525d = (View) a[13];
        this.f20526e = (CheckBox) a[10];
        this.f20526e.setTag(null);
        this.f20527f = (View) a[11];
        this.f20527f.setTag(null);
        this.f20528g = (TextView) a[12];
        this.f20529h = (RoundAvatarImageView) a[3];
        this.f20529h.setTag(null);
        this.f20530i = (ImageView) a[14];
        this.f20531j = (ImageView) a[8];
        this.f20531j.setTag(null);
        this.f20532k = (FrameLayout) a[2];
        this.f20532k.setTag(null);
        this.f20533l = (LinearLayout) a[0];
        this.f20533l.setTag(null);
        this.f20534m = (ImageView) a[6];
        this.f20534m.setTag(null);
        this.f20535n = (TextView) a[4];
        this.f20535n.setTag(null);
        this.f20536o = (TextView) a[5];
        this.f20536o.setTag(null);
        this.f20537p = (EmojiconTextView) a[7];
        this.f20537p.setTag(null);
        this.f20538q = (TextView) a[9];
        this.f20538q.setTag(null);
        this.f20539r = (LinearLayout) a[1];
        this.f20539r.setTag(null);
        this.f20540s = (View) a[15];
        m14840a(view);
        this.f20544y = new C0124a(this);
        this.f20545z = new C0126b(this, 1);
        synchronized (this) {
            this.f20524A = 1048576;
        }
        m14846e();
    }

    public static C7160d m18901a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return (C7160d) C0131g.m206a(layoutInflater, R.layout.list_item_conversations_db, viewGroup, C0131g.m208a());
    }

    private boolean m18902b(int i) {
        if (i == 0) {
            synchronized (this) {
                this.f20524A |= 1;
            }
            return true;
        } else if (i == 26) {
            synchronized (this) {
                this.f20524A |= 8;
            }
            return true;
        } else if (i == 2) {
            synchronized (this) {
                this.f20524A |= 16;
            }
            return true;
        } else if (i == 18) {
            synchronized (this) {
                this.f20524A |= 32;
            }
            return true;
        } else if (i == 7) {
            synchronized (this) {
                this.f20524A |= 64;
            }
            return true;
        } else if (i == 1) {
            synchronized (this) {
                this.f20524A |= 128;
            }
            return true;
        } else if (i == 3) {
            synchronized (this) {
                this.f20524A |= 256;
            }
            return true;
        } else if (i == 8) {
            synchronized (this) {
                this.f20524A |= 512;
            }
            return true;
        } else if (i == 34) {
            synchronized (this) {
                this.f20524A |= IjkMediaMeta.AV_CH_SIDE_RIGHT;
            }
            return true;
        } else if (i == 10) {
            synchronized (this) {
                this.f20524A |= IjkMediaMeta.AV_CH_TOP_CENTER;
            }
            return true;
        } else if (i == 9) {
            synchronized (this) {
                this.f20524A |= IjkMediaMeta.AV_CH_TOP_FRONT_LEFT;
            }
            return true;
        } else if (i == 11) {
            synchronized (this) {
                this.f20524A |= IjkMediaMeta.AV_CH_TOP_FRONT_CENTER;
            }
            return true;
        } else if (i == 16) {
            synchronized (this) {
                this.f20524A |= IjkMediaMeta.AV_CH_TOP_FRONT_RIGHT;
            }
            return true;
        } else if (i == 23) {
            synchronized (this) {
                this.f20524A |= IjkMediaMeta.AV_CH_TOP_BACK_LEFT;
            }
            return true;
        } else if (i == 20) {
            synchronized (this) {
                this.f20524A |= IjkMediaMeta.AV_CH_TOP_BACK_CENTER;
            }
            return true;
        } else if (i == 35) {
            synchronized (this) {
                this.f20524A |= IjkMediaMeta.AV_CH_TOP_BACK_RIGHT;
            }
            return true;
        } else if (i == 5) {
            synchronized (this) {
                this.f20524A |= 262144;
            }
            return true;
        } else if (i != 14) {
            return false;
        } else {
            synchronized (this) {
                this.f20524A |= 524288;
            }
            return true;
        }
    }

    public final void mo3444a(int i) {
        C4185a c4185a = this.f20541v;
        C6829g c6829g = this.f20543x;
        if ((c4185a != null ? 1 : null) != null) {
            c4185a.mo3242a(c6829g);
        }
    }

    public final void m18904a(C4054e c4054e) {
        this.f20542w = c4054e;
        synchronized (this) {
            this.f20524A |= 4;
        }
        b_(4);
        super.m14846e();
    }

    public final void m18905a(C7365a c7365a) {
        m14842a((C0133h) c7365a);
        this.f20543x = c7365a;
        synchronized (this) {
            this.f20524A |= 1;
        }
        b_(24);
        super.m14846e();
    }

    public final void m18906a(C4185a c4185a) {
        this.f20541v = c4185a;
        synchronized (this) {
            this.f20524A |= 2;
        }
        b_(6);
        super.m14846e();
    }

    public final void mo3445a(boolean z) {
        C4054e c4054e = this.f20542w;
        C6829g c6829g = this.f20543x;
        Object obj = null;
        if (z) {
            if ((c4054e != null ? 1 : null) != null) {
                if (c6829g != null) {
                    obj = 1;
                }
                if (obj != null) {
                    c4054e.mo2374a(c6829g.f19504k);
                    return;
                }
            }
        }
        if ((c4054e != null ? 1 : null) != null) {
            if (c6829g != null) {
                obj = 1;
            }
            if (obj != null) {
                c4054e.mo2376b(c6829g.f19504k);
            }
        }
    }

    protected final boolean mo3441a(int i, int i2) {
        return i != 0 ? false : m18902b(i2);
    }

    protected final void mo3442c() {
        /* JADX: method processing error */
/*
Error: java.lang.OutOfMemoryError: Java heap space
	at java.util.Arrays.copyOf(Arrays.java:3181)
	at java.util.ArrayList.grow(ArrayList.java:261)
	at java.util.ArrayList.ensureExplicitCapacity(ArrayList.java:235)
	at java.util.ArrayList.ensureCapacityInternal(ArrayList.java:227)
	at java.util.ArrayList.add(ArrayList.java:458)
	at jadx.core.utils.BlockUtils.collectWhileDominates(BlockUtils.java:463)
	at jadx.core.utils.BlockUtils.collectWhileDominates(BlockUtils.java:464)
	at jadx.core.utils.BlockUtils.collectWhileDominates(BlockUtils.java:464)
	at jadx.core.utils.BlockUtils.collectWhileDominates(BlockUtils.java:464)
	at jadx.core.utils.BlockUtils.collectWhileDominates(BlockUtils.java:464)
	at jadx.core.utils.BlockUtils.collectWhileDominates(BlockUtils.java:464)
	at jadx.core.utils.BlockUtils.collectWhileDominates(BlockUtils.java:464)
	at jadx.core.utils.BlockUtils.collectWhileDominates(BlockUtils.java:464)
	at jadx.core.utils.BlockUtils.collectWhileDominates(BlockUtils.java:464)
	at jadx.core.utils.BlockUtils.collectWhileDominates(BlockUtils.java:464)
	at jadx.core.utils.BlockUtils.collectWhileDominates(BlockUtils.java:464)
	at jadx.core.utils.BlockUtils.collectWhileDominates(BlockUtils.java:464)
	at jadx.core.utils.BlockUtils.collectWhileDominates(BlockUtils.java:464)
	at jadx.core.utils.BlockUtils.collectWhileDominates(BlockUtils.java:464)
	at jadx.core.utils.BlockUtils.collectWhileDominates(BlockUtils.java:464)
	at jadx.core.utils.BlockUtils.collectWhileDominates(BlockUtils.java:464)
	at jadx.core.utils.BlockUtils.collectWhileDominates(BlockUtils.java:464)
	at jadx.core.utils.BlockUtils.collectWhileDominates(BlockUtils.java:464)
	at jadx.core.utils.BlockUtils.collectWhileDominates(BlockUtils.java:464)
	at jadx.core.utils.BlockUtils.collectWhileDominates(BlockUtils.java:464)
	at jadx.core.utils.BlockUtils.collectWhileDominates(BlockUtils.java:464)
	at jadx.core.utils.BlockUtils.collectWhileDominates(BlockUtils.java:464)
	at jadx.core.utils.BlockUtils.collectWhileDominates(BlockUtils.java:464)
	at jadx.core.utils.BlockUtils.collectWhileDominates(BlockUtils.java:464)
	at jadx.core.utils.BlockUtils.collectWhileDominates(BlockUtils.java:464)
	at jadx.core.utils.BlockUtils.collectWhileDominates(BlockUtils.java:464)
	at jadx.core.utils.BlockUtils.collectWhileDominates(BlockUtils.java:464)
*/
        /*
        r58 = this;
        r1 = r58;
        monitor-enter(r58);
        r2 = r1.f20524A;	 Catch:{ all -> 0x05de }
        r4 = 0;	 Catch:{ all -> 0x05de }
        r1.f20524A = r4;	 Catch:{ all -> 0x05de }
        monitor-exit(r58);	 Catch:{ all -> 0x05de }
        r6 = r1.f20543x;
        r7 = 2097145; // 0x1ffff9 float:2.938726E-39 double:1.0361273E-317;
        r9 = r2 & r7;
        r7 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1));
        r10 = 1049089; // 0x100201 float:1.470087E-39 double:5.18319E-318;
        r12 = 274877906944; // 0x4000000000 float:0.0 double:1.358077306218E-312;
        r14 = 1310721; // 0x140001 float:1.836711E-39 double:6.47582E-318;
        r16 = 1058817; // 0x102801 float:1.483719E-39 double:5.23125E-318;
        r18 = 1048625; // 0x100031 float:1.469437E-39 double:5.180896E-318;
        r20 = 1179649; // 0x120001 float:1.65304E-39 double:5.82824E-318;
        r22 = 1048961; // 0x100181 float:1.469907E-39 double:5.182556E-318;
        r24 = 1;
        r25 = 0;
        if (r7 == 0) goto L_0x02da;
    L_0x0030:
        r28 = r2 & r16;
        r7 = (r28 > r4 ? 1 : (r28 == r4 ? 0 : -1));
        if (r7 == 0) goto L_0x003d;
    L_0x0036:
        if (r6 == 0) goto L_0x003d;
    L_0x0038:
        r7 = r6.f21387n;
        r9 = r6.f21386m;
        goto L_0x0040;
    L_0x003d:
        r7 = r25;
        r9 = r7;
    L_0x0040:
        r28 = r2 & r14;
        r30 = (r28 > r4 ? 1 : (r28 == r4 ? 0 : -1));
        if (r30 == 0) goto L_0x0067;
    L_0x0046:
        if (r6 == 0) goto L_0x004b;
    L_0x0048:
        r8 = r6.f21396w;
        goto L_0x004c;
    L_0x004b:
        r8 = 0;
    L_0x004c:
        r30 = (r28 > r4 ? 1 : (r28 == r4 ? 0 : -1));
        if (r30 == 0) goto L_0x0062;
    L_0x0050:
        if (r8 == 0) goto L_0x005c;
    L_0x0052:
        r28 = 4294967296; // 0x100000000 float:0.0 double:2.121995791E-314;
    L_0x0057:
        r31 = r2 | r28;
        r2 = r31;
        goto L_0x0062;
    L_0x005c:
        r28 = 2147483648; // 0x80000000 float:-0.0 double:1.0609978955E-314;
        goto L_0x0057;
    L_0x0062:
        if (r8 == 0) goto L_0x0067;
    L_0x0064:
        r8 = r24;
        goto L_0x0068;
    L_0x0067:
        r8 = 0;
    L_0x0068:
        r28 = r2 & r18;
        r30 = (r28 > r4 ? 1 : (r28 == r4 ? 0 : -1));
        if (r30 == 0) goto L_0x0094;
    L_0x006e:
        if (r6 == 0) goto L_0x0075;
    L_0x0070:
        r14 = r6.f19503j;
        r15 = r6.f21379d;
        goto L_0x0078;
    L_0x0075:
        r15 = r25;
        r14 = 0;
    L_0x0078:
        if (r15 != 0) goto L_0x007d;
    L_0x007a:
        r30 = r24;
        goto L_0x007f;
    L_0x007d:
        r30 = 0;
    L_0x007f:
        r31 = (r28 > r4 ? 1 : (r28 == r4 ? 0 : -1));
        if (r31 == 0) goto L_0x0099;
    L_0x0083:
        if (r30 == 0) goto L_0x008a;
    L_0x0085:
        r28 = r2 | r12;
        r2 = r28;
        goto L_0x0099;
    L_0x008a:
        r28 = 137438953472; // 0x2000000000 float:0.0 double:6.7903865311E-313;
        r31 = r2 | r28;
        r2 = r31;
        goto L_0x0099;
    L_0x0094:
        r15 = r25;
        r14 = 0;
        r30 = 0;
    L_0x0099:
        r28 = r2 & r10;
        r31 = (r28 > r4 ? 1 : (r28 == r4 ? 0 : -1));
        if (r31 == 0) goto L_0x00a4;
    L_0x009f:
        if (r6 == 0) goto L_0x00a4;
    L_0x00a1:
        r10 = r6.f21378c;
        goto L_0x00a6;
    L_0x00a4:
        r10 = r25;
    L_0x00a6:
        r26 = 1048577; // 0x100001 float:1.46937E-39 double:5.18066E-318;
        r28 = r2 & r26;
        r11 = (r28 > r4 ? 1 : (r28 == r4 ? 0 : -1));
        r31 = 8;
        if (r11 == 0) goto L_0x00d8;
    L_0x00b1:
        if (r6 == 0) goto L_0x00b6;
    L_0x00b3:
        r11 = r6.f19504k;
        goto L_0x00b7;
    L_0x00b6:
        r11 = 0;
    L_0x00b7:
        if (r11 != 0) goto L_0x00bc;
    L_0x00b9:
        r11 = r24;
        goto L_0x00bd;
    L_0x00bc:
        r11 = 0;
    L_0x00bd:
        r32 = (r28 > r4 ? 1 : (r28 == r4 ? 0 : -1));
        if (r32 == 0) goto L_0x00d3;
    L_0x00c1:
        if (r11 == 0) goto L_0x00cd;
    L_0x00c3:
        r28 = 17179869184; // 0x400000000 float:0.0 double:8.4879831639E-314;
    L_0x00c8:
        r35 = r2 | r28;
        r2 = r35;
        goto L_0x00d3;
    L_0x00cd:
        r28 = 8589934592; // 0x200000000 float:0.0 double:4.243991582E-314;
        goto L_0x00c8;
    L_0x00d3:
        if (r11 == 0) goto L_0x00d8;
    L_0x00d5:
        r11 = r31;
        goto L_0x00d9;
    L_0x00d8:
        r11 = 0;
    L_0x00d9:
        r28 = r2 & r22;
        r32 = (r28 > r4 ? 1 : (r28 == r4 ? 0 : -1));
        if (r32 == 0) goto L_0x00f7;
    L_0x00df:
        if (r6 == 0) goto L_0x00e4;
    L_0x00e1:
        r12 = r6.f21377b;
        goto L_0x00e5;
    L_0x00e4:
        r12 = 0;
    L_0x00e5:
        r13 = (r28 > r4 ? 1 : (r28 == r4 ? 0 : -1));
        if (r13 == 0) goto L_0x00f8;
    L_0x00e9:
        if (r12 == 0) goto L_0x00f3;
    L_0x00eb:
        r28 = 4194304; // 0x400000 float:5.877472E-39 double:2.0722615E-317;
    L_0x00ee:
        r35 = r2 | r28;
        r2 = r35;
        goto L_0x00f8;
    L_0x00f3:
        r28 = 2097152; // 0x200000 float:2.938736E-39 double:1.0361308E-317;
        goto L_0x00ee;
    L_0x00f7:
        r12 = 0;
    L_0x00f8:
        r28 = 1572865; // 0x180001 float:2.204053E-39 double:7.770986E-318;
        r35 = r2 & r28;
        r13 = (r35 > r4 ? 1 : (r35 == r4 ? 0 : -1));
        if (r13 == 0) goto L_0x0123;
    L_0x0101:
        if (r6 == 0) goto L_0x0106;
    L_0x0103:
        r13 = r6.f21397x;
        goto L_0x0107;
    L_0x0106:
        r13 = 0;
    L_0x0107:
        r28 = (r35 > r4 ? 1 : (r35 == r4 ? 0 : -1));
        if (r28 == 0) goto L_0x011d;
    L_0x010b:
        if (r13 == 0) goto L_0x0117;
    L_0x010d:
        r28 = 1099511627776; // 0x10000000000 float:0.0 double:5.43230922487E-312;
    L_0x0112:
        r35 = r2 | r28;
        r2 = r35;
        goto L_0x011d;
    L_0x0117:
        r28 = 549755813888; // 0x8000000000 float:0.0 double:2.716154612436E-312;
        goto L_0x0112;
    L_0x011d:
        if (r13 == 0) goto L_0x0120;
    L_0x011f:
        goto L_0x0123;
    L_0x0120:
        r13 = r31;
        goto L_0x0124;
    L_0x0123:
        r13 = 0;
    L_0x0124:
        r28 = 1049601; // 0x100401 float:1.470804E-39 double:5.18572E-318;
        r35 = r2 & r28;
        r28 = (r35 > r4 ? 1 : (r35 == r4 ? 0 : -1));
        if (r28 == 0) goto L_0x0132;
    L_0x012d:
        if (r6 == 0) goto L_0x0132;
    L_0x012f:
        r4 = r6.f21382g;
        goto L_0x0134;
    L_0x0132:
        r4 = r25;
    L_0x0134:
        r28 = 1048585; // 0x100009 float:1.46938E-39 double:5.1807E-318;
        r35 = r2 & r28;
        r28 = 0;
        r5 = (r35 > r28 ? 1 : (r35 == r28 ? 0 : -1));
        if (r5 == 0) goto L_0x015d;
    L_0x013f:
        if (r6 == 0) goto L_0x0144;
    L_0x0141:
        r5 = r6.f21389p;
        goto L_0x0145;
    L_0x0144:
        r5 = 0;
    L_0x0145:
        r32 = (r35 > r28 ? 1 : (r35 == r28 ? 0 : -1));
        if (r32 == 0) goto L_0x0157;
    L_0x0149:
        if (r5 == 0) goto L_0x0153;
    L_0x014b:
        r28 = 67108864; // 0x4000000 float:1.5046328E-36 double:3.31561842E-316;
    L_0x014e:
        r35 = r2 | r28;
        r2 = r35;
        goto L_0x0157;
    L_0x0153:
        r28 = 33554432; // 0x2000000 float:9.403955E-38 double:1.6578092E-316;
        goto L_0x014e;
    L_0x0157:
        if (r5 == 0) goto L_0x015a;
    L_0x0159:
        goto L_0x015d;
    L_0x015a:
        r5 = r31;
        goto L_0x015e;
    L_0x015d:
        r5 = 0;
    L_0x015e:
        r28 = 1114113; // 0x110001 float:1.561205E-39 double:5.50445E-318;
        r35 = r2 & r28;
        r28 = 0;
        r32 = (r35 > r28 ? 1 : (r35 == r28 ? 0 : -1));
        if (r32 == 0) goto L_0x019f;
    L_0x0169:
        if (r6 == 0) goto L_0x0170;
    L_0x016b:
        r39 = r4;
        r4 = r6.f21392s;
        goto L_0x0173;
    L_0x0170:
        r39 = r4;
        r4 = 0;
    L_0x0173:
        r32 = (r35 > r28 ? 1 : (r35 == r28 ? 0 : -1));
        if (r32 == 0) goto L_0x0185;
    L_0x0177:
        if (r4 == 0) goto L_0x0181;
    L_0x0179:
        r28 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
    L_0x017c:
        r35 = r2 | r28;
        r2 = r35;
        goto L_0x0185;
    L_0x0181:
        r28 = 536870912; // 0x20000000 float:1.0842022E-19 double:2.652494739E-315;
        goto L_0x017c;
    L_0x0185:
        if (r4 == 0) goto L_0x0193;
    L_0x0187:
        r4 = r1.f20538q;
        r40 = r2;
        r2 = 2131230916; // 0x7f0800c4 float:1.8077898E38 double:1.052967979E-314;
        r2 = android.databinding.ViewDataBinding.m14825a(r4, r2);
        goto L_0x01a5;
    L_0x0193:
        r40 = r2;
        r2 = r1.f20538q;
        r3 = 2131230915; // 0x7f0800c3 float:1.8077896E38 double:1.0529679785E-314;
        r2 = android.databinding.ViewDataBinding.m14825a(r2, r3);
        goto L_0x01a5;
    L_0x019f:
        r39 = r4;
        r40 = r2;
        r2 = r25;
    L_0x01a5:
        r3 = 1081345; // 0x108001 float:1.515287E-39 double:5.342554E-318;
        r28 = r40 & r3;
        r3 = 0;
        r32 = (r28 > r3 ? 1 : (r28 == r3 ? 0 : -1));
        if (r32 == 0) goto L_0x01d2;
    L_0x01b0:
        if (r6 == 0) goto L_0x01b7;
    L_0x01b2:
        r3 = r6.f21390q;
        r35 = 0;
        goto L_0x01ba;
    L_0x01b7:
        r35 = r3;
        r3 = 0;
    L_0x01ba:
        r4 = (r28 > r35 ? 1 : (r28 == r35 ? 0 : -1));
        if (r4 == 0) goto L_0x01cc;
    L_0x01be:
        if (r3 == 0) goto L_0x01c8;
    L_0x01c0:
        r28 = 268435456; // 0x10000000 float:2.5243549E-29 double:1.32624737E-315;
    L_0x01c3:
        r35 = r40 | r28;
        r40 = r35;
        goto L_0x01cc;
    L_0x01c8:
        r28 = 134217728; // 0x8000000 float:3.85186E-34 double:6.63123685E-316;
        goto L_0x01c3;
    L_0x01cc:
        if (r3 == 0) goto L_0x01cf;
    L_0x01ce:
        goto L_0x01d2;
    L_0x01cf:
        r3 = r31;
        goto L_0x01d3;
    L_0x01d2:
        r3 = 0;
    L_0x01d3:
        r28 = 1048641; // 0x100041 float:1.469459E-39 double:5.180975E-318;
        r35 = r40 & r28;
        r28 = 0;
        r4 = (r35 > r28 ? 1 : (r35 == r28 ? 0 : -1));
        if (r4 == 0) goto L_0x01e3;
    L_0x01de:
        if (r6 == 0) goto L_0x01e3;
    L_0x01e0:
        r4 = r6.f21381f;
        goto L_0x01e4;
    L_0x01e3:
        r4 = 0;
    L_0x01e4:
        r35 = 1052673; // 0x101001 float:1.475109E-39 double:5.200896E-318;
        r37 = r40 & r35;
        r32 = (r37 > r28 ? 1 : (r37 == r28 ? 0 : -1));
        if (r32 == 0) goto L_0x0225;
    L_0x01ed:
        if (r6 == 0) goto L_0x01f6;
    L_0x01ef:
        r42 = r2;
        r2 = r6.f21385l;
        r43 = r3;
        goto L_0x01fc;
    L_0x01f6:
        r42 = r2;
        r43 = r3;
        r2 = r25;
    L_0x01fc:
        r3 = mobi.mmdt.ott.provider.p384f.C2970j.IN;
        if (r2 != r3) goto L_0x0203;
    L_0x0200:
        r2 = r24;
        goto L_0x0204;
    L_0x0203:
        r2 = 0;
    L_0x0204:
        r3 = (r37 > r28 ? 1 : (r37 == r28 ? 0 : -1));
        if (r3 == 0) goto L_0x0218;
    L_0x0208:
        if (r2 == 0) goto L_0x0212;
    L_0x020a:
        r28 = 4398046511104; // 0x40000000000 float:0.0 double:2.1729236899484E-311;
    L_0x020f:
        r35 = r40 | r28;
        goto L_0x021a;
    L_0x0212:
        r28 = 2199023255552; // 0x20000000000 float:0.0 double:1.0864618449742E-311;
        goto L_0x020f;
    L_0x0218:
        r35 = r40;
    L_0x021a:
        if (r2 == 0) goto L_0x021f;
    L_0x021c:
        r2 = r31;
        goto L_0x0220;
    L_0x021f:
        r2 = 0;
    L_0x0220:
        r28 = r2;
        r2 = r35;
        goto L_0x022d;
    L_0x0225:
        r42 = r2;
        r43 = r3;
        r2 = r40;
        r28 = 0;
    L_0x022d:
        r35 = 1064961; // 0x104001 float:1.492328E-39 double:5.261606E-318;
        r40 = r2 & r35;
        r35 = 0;
        r29 = (r40 > r35 ? 1 : (r40 == r35 ? 0 : -1));
        if (r29 == 0) goto L_0x023f;
    L_0x0238:
        if (r6 == 0) goto L_0x023f;
    L_0x023a:
        r44 = r4;
        r4 = r6.f21383h;
        goto L_0x0243;
    L_0x023f:
        r44 = r4;
        r4 = r25;
    L_0x0243:
        r40 = r2 & r20;
        r29 = (r40 > r35 ? 1 : (r40 == r35 ? 0 : -1));
        if (r29 == 0) goto L_0x02b7;
    L_0x0249:
        if (r6 == 0) goto L_0x0250;
    L_0x024b:
        r45 = r4;
        r4 = r6.f21384i;
        goto L_0x0253;
    L_0x0250:
        r45 = r4;
        r4 = 0;
    L_0x0253:
        if (r4 <= 0) goto L_0x025a;
    L_0x0255:
        r46 = r5;
        r29 = r24;
        goto L_0x025e;
    L_0x025a:
        r46 = r5;
        r29 = 0;
    L_0x025e:
        r5 = 99;
        if (r4 <= r5) goto L_0x0267;
    L_0x0262:
        r5 = r24;
    L_0x0264:
        r35 = 0;
        goto L_0x0269;
    L_0x0267:
        r5 = 0;
        goto L_0x0264;
    L_0x0269:
        r32 = (r40 > r35 ? 1 : (r40 == r35 ? 0 : -1));
        if (r32 == 0) goto L_0x027d;
    L_0x026d:
        if (r29 == 0) goto L_0x0277;
    L_0x026f:
        r37 = 17592186044416; // 0x100000000000 float:0.0 double:8.6916947597938E-311;
    L_0x0274:
        r40 = r2 | r37;
        goto L_0x027f;
    L_0x0277:
        r37 = 8796093022208; // 0x80000000000 float:0.0 double:4.345847379897E-311;
        goto L_0x0274;
    L_0x027d:
        r40 = r2;
    L_0x027f:
        r2 = r40 & r20;
        r32 = (r2 > r35 ? 1 : (r2 == r35 ? 0 : -1));
        if (r32 == 0) goto L_0x0297;
    L_0x0285:
        if (r5 == 0) goto L_0x0291;
    L_0x0287:
        r2 = 70368744177664; // 0x400000000000 float:0.0 double:3.4766779039175E-310;
    L_0x028c:
        r35 = r40 | r2;
        r2 = r35;
        goto L_0x0299;
    L_0x0291:
        r2 = 35184372088832; // 0x200000000000 float:0.0 double:1.73833895195875E-310;
        goto L_0x028c;
    L_0x0297:
        r2 = r40;
    L_0x0299:
        if (r29 == 0) goto L_0x029d;
    L_0x029b:
        r31 = 0;
    L_0x029d:
        r48 = r7;
        r49 = r10;
        r47 = r15;
        r10 = r28;
        r53 = r31;
        r50 = r39;
        r52 = r42;
        r7 = r44;
        r51 = r45;
        r54 = r46;
        r28 = 274877906944; // 0x4000000000 float:0.0 double:1.358077306218E-312;
        goto L_0x02d6;
    L_0x02b7:
        r45 = r4;
        r46 = r5;
        r48 = r7;
        r49 = r10;
        r47 = r15;
        r10 = r28;
        r50 = r39;
        r52 = r42;
        r7 = r44;
        r51 = r45;
        r54 = r46;
        r4 = 0;
        r5 = 0;
        r28 = 274877906944; // 0x4000000000 float:0.0 double:1.358077306218E-312;
        r53 = 0;
    L_0x02d6:
        r15 = r9;
        r9 = r43;
        goto L_0x02fa;
    L_0x02da:
        r28 = r12;
        r15 = r25;
        r47 = r15;
        r48 = r47;
        r49 = r48;
        r50 = r49;
        r51 = r50;
        r52 = r51;
        r4 = 0;
        r5 = 0;
        r7 = 0;
        r8 = 0;
        r9 = 0;
        r10 = 0;
        r11 = 0;
        r12 = 0;
        r13 = 0;
        r14 = 0;
        r30 = 0;
        r53 = 0;
        r54 = 0;
    L_0x02fa:
        r31 = r2 & r28;
        r28 = 0;
        r35 = (r31 > r28 ? 1 : (r31 == r28 ? 0 : -1));
        if (r35 == 0) goto L_0x0309;
    L_0x0302:
        if (r6 == 0) goto L_0x0309;
    L_0x0304:
        r55 = r15;
        r15 = r6.f21380e;
        goto L_0x030d;
    L_0x0309:
        r55 = r15;
        r15 = r25;
    L_0x030d:
        r31 = 35184372088832; // 0x200000000000 float:0.0 double:1.73833895195875E-310;
        r35 = r2 & r31;
        r31 = (r35 > r28 ? 1 : (r35 == r28 ? 0 : -1));
        if (r31 == 0) goto L_0x031d;
    L_0x0318:
        r4 = java.lang.String.valueOf(r4);
        goto L_0x031f;
    L_0x031d:
        r4 = r25;
    L_0x031f:
        r31 = 2097152; // 0x200000 float:2.938736E-39 double:1.0361308E-317;
        r35 = r2 & r31;
        r31 = (r35 > r28 ? 1 : (r35 == r28 ? 0 : -1));
        if (r31 == 0) goto L_0x033e;
    L_0x0328:
        if (r6 == 0) goto L_0x0331;
    L_0x032a:
        r56 = r4;
        r4 = r6.f21394u;
        r57 = r15;
        goto L_0x0337;
    L_0x0331:
        r56 = r4;
        r57 = r15;
        r4 = r25;
    L_0x0337:
        r15 = mobi.mmdt.ott.provider.p385g.C2974a.OFFICIAL;
        if (r4 != r15) goto L_0x0344;
    L_0x033b:
        r15 = r24;
        goto L_0x0345;
    L_0x033e:
        r56 = r4;
        r57 = r15;
        r4 = r25;
    L_0x0344:
        r15 = 0;
    L_0x0345:
        r28 = r2 & r22;
        r31 = 0;
        r35 = (r28 > r31 ? 1 : (r28 == r31 ? 0 : -1));
        if (r35 == 0) goto L_0x0364;
    L_0x034d:
        if (r12 == 0) goto L_0x0351;
    L_0x034f:
        r15 = r24;
    L_0x0351:
        r12 = (r28 > r31 ? 1 : (r28 == r31 ? 0 : -1));
        if (r12 == 0) goto L_0x0361;
    L_0x0355:
        if (r15 == 0) goto L_0x035d;
    L_0x0357:
        r28 = 16777216; // 0x1000000 float:2.3509887E-38 double:8.289046E-317;
    L_0x035a:
        r31 = r2 | r28;
        goto L_0x0367;
    L_0x035d:
        r28 = 8388608; // 0x800000 float:1.17549435E-38 double:4.144523E-317;
        goto L_0x035a;
    L_0x0361:
        r31 = r2;
        goto L_0x0367;
    L_0x0364:
        r31 = r2;
        r15 = 0;
    L_0x0367:
        r2 = r31 & r18;
        r28 = 0;
        r12 = (r2 > r28 ? 1 : (r2 == r28 ? 0 : -1));
        if (r12 == 0) goto L_0x0377;
    L_0x036f:
        if (r30 == 0) goto L_0x0372;
    L_0x0371:
        goto L_0x0374;
    L_0x0372:
        r57 = r47;
    L_0x0374:
        r2 = r57;
        goto L_0x0379;
    L_0x0377:
        r2 = r25;
    L_0x0379:
        r35 = r31 & r20;
        r3 = (r35 > r28 ? 1 : (r35 == r28 ? 0 : -1));
        if (r3 == 0) goto L_0x0393;
    L_0x037f:
        if (r5 == 0) goto L_0x0390;
    L_0x0381:
        r3 = r1.f20538q;
        r3 = r3.getResources();
        r5 = 2131690520; // 0x7f0f0418 float:1.9010086E38 double:1.0531950535E-314;
        r3 = r3.getString(r5);
        r56 = r3;
    L_0x0390:
        r3 = r56;
        goto L_0x0395;
    L_0x0393:
        r3 = r25;
    L_0x0395:
        r28 = 8388608; // 0x800000 float:1.17549435E-38 double:4.144523E-317;
        r35 = r31 & r28;
        r28 = 0;
        r5 = (r35 > r28 ? 1 : (r35 == r28 ? 0 : -1));
        if (r5 == 0) goto L_0x03ab;
    L_0x03a0:
        if (r6 == 0) goto L_0x03a4;
    L_0x03a2:
        r4 = r6.f21394u;
    L_0x03a4:
        r5 = mobi.mmdt.ott.provider.p385g.C2974a.OFFICIAL_PAYMENT;
        if (r4 != r5) goto L_0x03ab;
    L_0x03a8:
        r4 = r24;
        goto L_0x03ac;
    L_0x03ab:
        r4 = 0;
    L_0x03ac:
        r5 = r31 & r22;
        r28 = 0;
        r12 = (r5 > r28 ? 1 : (r5 == r28 ? 0 : -1));
        if (r12 == 0) goto L_0x03db;
    L_0x03b4:
        if (r15 == 0) goto L_0x03b8;
    L_0x03b6:
        r4 = r24;
    L_0x03b8:
        r12 = (r5 > r28 ? 1 : (r5 == r28 ? 0 : -1));
        if (r12 == 0) goto L_0x03ce;
    L_0x03bc:
        if (r4 == 0) goto L_0x03c8;
    L_0x03be:
        r5 = 68719476736; // 0x1000000000 float:0.0 double:3.39519326554E-313;
    L_0x03c3:
        r28 = r31 | r5;
        r31 = r28;
        goto L_0x03ce;
    L_0x03c8:
        r5 = 34359738368; // 0x800000000 float:0.0 double:1.69759663277E-313;
        goto L_0x03c3;
    L_0x03ce:
        if (r4 == 0) goto L_0x03db;
    L_0x03d0:
        r4 = r1.f20535n;
        r5 = 2131232081; // 0x7f080551 float:1.8080261E38 double:1.0529685545E-314;
        r4 = android.databinding.ViewDataBinding.m14825a(r4, r5);
        r25 = r4;
    L_0x03db:
        r4 = r25;
        r5 = 1310721; // 0x140001 float:1.836711E-39 double:6.47582E-318;
        r28 = r31 & r5;
        r5 = 0;
        r12 = (r28 > r5 ? 1 : (r28 == r5 ? 0 : -1));
        if (r12 == 0) goto L_0x03f3;
    L_0x03e8:
        r12 = r1.f20526e;
        r15 = r12.isChecked();
        if (r15 == r8) goto L_0x03f3;
    L_0x03f0:
        r12.setChecked(r8);
    L_0x03f3:
        r28 = 1572865; // 0x180001 float:2.204053E-39 double:7.770986E-318;
        r33 = r31 & r28;
        r8 = (r33 > r5 ? 1 : (r33 == r5 ? 0 : -1));
        if (r8 == 0) goto L_0x0401;
    L_0x03fc:
        r8 = r1.f20526e;
        r8.setVisibility(r13);
    L_0x0401:
        r12 = 1048576; // 0x100000 float:1.469368E-39 double:5.180654E-318;
        r28 = r31 & r12;
        r8 = (r28 > r5 ? 1 : (r28 == r5 ? 0 : -1));
        if (r8 == 0) goto L_0x0418;
    L_0x040a:
        r8 = r1.f20526e;
        r12 = r1.f20544y;
        r8.setOnCheckedChangeListener(r12);
        r8 = r1.f20532k;
        r12 = r1.f20545z;
        r8.setOnClickListener(r12);
    L_0x0418:
        r12 = 1048577; // 0x100001 float:1.46937E-39 double:5.18066E-318;
        r25 = r31 & r12;
        r8 = (r25 > r5 ? 1 : (r25 == r5 ? 0 : -1));
        if (r8 == 0) goto L_0x0426;
    L_0x0421:
        r8 = r1.f20527f;
        r8.setVisibility(r11);
    L_0x0426:
        r11 = 1048641; // 0x100041 float:1.469459E-39 double:5.180975E-318;
        r25 = r31 & r11;
        r8 = (r25 > r5 ? 1 : (r25 == r5 ? 0 : -1));
        if (r8 == 0) goto L_0x0434;
    L_0x042f:
        r8 = r1.f20529h;
        r8.setBackgroundColor(r7);
    L_0x0434:
        r7 = r31 & r18;
        r11 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1));
        if (r11 == 0) goto L_0x043f;
    L_0x043a:
        r7 = r1.f20529h;
        mobi.mmdt.ott.view.tools.C4511h.m8225a(r7, r2, r14);
    L_0x043f:
        r7 = 1081345; // 0x108001 float:1.515287E-39 double:5.342554E-318;
        r11 = r31 & r7;
        r2 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1));
        if (r2 == 0) goto L_0x044d;
    L_0x0448:
        r2 = r1.f20531j;
        r2.setVisibility(r9);
    L_0x044d:
        r7 = 1052673; // 0x101001 float:1.475109E-39 double:5.200896E-318;
        r11 = r31 & r7;
        r2 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1));
        if (r2 == 0) goto L_0x045b;
    L_0x0456:
        r2 = r1.f20534m;
        r2.setVisibility(r10);
    L_0x045b:
        r7 = r31 & r16;
        r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1));
        if (r2 == 0) goto L_0x04cc;
    L_0x0461:
        r2 = r1.f20534m;
        r5 = mobi.mmdt.ott.view.tools.C4511h.C45101.f12462b;
        r9 = r55;
        r6 = r9.ordinal();
        r5 = r5[r6];
        switch(r5) {
            case 1: goto L_0x04b8;
            case 2: goto L_0x04b2;
            case 3: goto L_0x04ac;
            case 4: goto L_0x04ac;
            case 5: goto L_0x04ac;
            case 6: goto L_0x04ac;
            case 7: goto L_0x04ac;
            case 8: goto L_0x0492;
            case 9: goto L_0x0480;
            case 10: goto L_0x0471;
            default: goto L_0x0470;
        };
    L_0x0470:
        goto L_0x04cc;
    L_0x0471:
        r5 = 2131231982; // 0x7f0804ee float:1.808006E38 double:1.0529685056E-314;
        r2.setImageResource(r5);
        r5 = mobi.mmdt.ott.logic.stheme.UIThemeManager.getmInstance();
        r5 = r5.getStatus_image_color();
        goto L_0x048e;
    L_0x0480:
        r5 = 2131231989; // 0x7f0804f5 float:1.8080075E38 double:1.052968509E-314;
        r2.setImageResource(r5);
        r5 = mobi.mmdt.ott.logic.stheme.UIThemeManager.getmInstance();
        r5 = r5.getSeen_status_image_color();
    L_0x048e:
        mobi.mmdt.componentsutils.p232b.C2491i.m6801a(r2, r5);
        goto L_0x04cc;
    L_0x0492:
        r5 = mobi.mmdt.ott.provider.p384f.C2972l.CALL;
        r7 = r48;
        if (r7 != r5) goto L_0x049d;
    L_0x0498:
        r5 = 0;
        r2.setImageResource(r5);
        goto L_0x04ce;
    L_0x049d:
        r5 = 2131231989; // 0x7f0804f5 float:1.8080075E38 double:1.052968509E-314;
        r2.setImageResource(r5);
        r5 = mobi.mmdt.ott.logic.stheme.UIThemeManager.getmInstance();
        r5 = r5.getSeen_status_image_color();
        goto L_0x04c8;
    L_0x04ac:
        r7 = r48;
        r5 = 2131231988; // 0x7f0804f4 float:1.8080073E38 double:1.0529685086E-314;
        goto L_0x04bd;
    L_0x04b2:
        r7 = r48;
        r5 = 2131231986; // 0x7f0804f2 float:1.8080068E38 double:1.0529685076E-314;
        goto L_0x04bd;
    L_0x04b8:
        r7 = r48;
        r5 = 2131231983; // 0x7f0804ef float:1.8080062E38 double:1.052968506E-314;
    L_0x04bd:
        r2.setImageResource(r5);
        r5 = mobi.mmdt.ott.logic.stheme.UIThemeManager.getmInstance();
        r5 = r5.getStatus_image_color();
    L_0x04c8:
        mobi.mmdt.componentsutils.p232b.C2491i.m6801a(r2, r5);
        goto L_0x04ce;
    L_0x04cc:
        r7 = r48;
    L_0x04ce:
        r5 = r31 & r22;
        r8 = 0;
        r2 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1));
        if (r2 == 0) goto L_0x04f6;
    L_0x04d6:
        r2 = r1.f20535n;
        if (r4 == 0) goto L_0x04e7;
    L_0x04da:
        r5 = r4.getIntrinsicWidth();
        r6 = r4.getIntrinsicHeight();
        r8 = 0;
        r4.setBounds(r8, r8, r5, r6);
        goto L_0x04e8;
    L_0x04e7:
        r8 = 0;
    L_0x04e8:
        r5 = r2.getCompoundDrawables();
        r6 = r5[r8];
        r8 = r5[r24];
        r9 = 3;
        r5 = r5[r9];
        r2.setCompoundDrawables(r6, r8, r4, r5);
    L_0x04f6:
        r4 = 1049089; // 0x100201 float:1.470087E-39 double:5.18319E-318;
        r8 = r31 & r4;
        r4 = 0;
        r2 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1));
        if (r2 == 0) goto L_0x0508;
    L_0x0501:
        r2 = r1.f20535n;
        r10 = r49;
        mobi.mmdt.ott.view.tools.C4511h.m8224a(r2, r10);
    L_0x0508:
        r8 = 1049601; // 0x100401 float:1.470804E-39 double:5.18572E-318;
        r10 = r31 & r8;
        r2 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1));
        if (r2 == 0) goto L_0x0518;
    L_0x0511:
        r2 = r1.f20536o;
        r6 = r50;
        mobi.mmdt.ott.view.tools.C4511h.m8224a(r2, r6);
    L_0x0518:
        r8 = 1064961; // 0x104001 float:1.492328E-39 double:5.261606E-318;
        r10 = r31 & r8;
        r2 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1));
        if (r2 == 0) goto L_0x0528;
    L_0x0521:
        r2 = r1.f20537p;
        r6 = r51;
        mobi.mmdt.ott.view.tools.C4511h.m8224a(r2, r6);
    L_0x0528:
        r8 = 1056769; // 0x102001 float:1.480849E-39 double:5.221133E-318;
        r10 = r31 & r8;
        r2 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1));
        if (r2 == 0) goto L_0x059b;
    L_0x0531:
        r2 = r1.f20537p;
        r4 = r2.getContext();
        r5 = mobi.mmdt.ott.view.tools.C4511h.C45101.f12461a;
        r6 = r7.ordinal();
        r5 = r5[r6];
        r6 = 1086324736; // 0x40c00000 float:6.0 double:5.367157323E-315;
        r7 = 1082130432; // 0x40800000 float:4.0 double:5.34643471E-315;
        switch(r5) {
            case 1: goto L_0x0581;
            case 2: goto L_0x0573;
            case 3: goto L_0x056e;
            case 4: goto L_0x0562;
            case 5: goto L_0x055d;
            case 6: goto L_0x0558;
            case 7: goto L_0x0553;
            case 8: goto L_0x0546;
            case 9: goto L_0x054e;
            case 10: goto L_0x054e;
            case 11: goto L_0x0546;
            case 12: goto L_0x0546;
            case 13: goto L_0x0546;
            default: goto L_0x0546;
        };
    L_0x0546:
        r5 = 0;
        r2.setCompoundDrawablePadding(r5);
        r2.setCompoundDrawablesWithIntrinsicBounds(r5, r5, r5, r5);
        goto L_0x0590;
    L_0x054e:
        r5 = 0;
        r6 = 2131232025; // 0x7f080519 float:1.8080148E38 double:1.052968527E-314;
        goto L_0x0566;
    L_0x0553:
        r5 = 0;
        r7 = 2131232112; // 0x7f080570 float:1.8080324E38 double:1.05296857E-314;
        goto L_0x0585;
    L_0x0558:
        r5 = 0;
        r7 = 2131232085; // 0x7f080555 float:1.808027E38 double:1.0529685565E-314;
        goto L_0x0585;
    L_0x055d:
        r5 = 0;
        r6 = 2131232041; // 0x7f080529 float:1.808018E38 double:1.052968535E-314;
        goto L_0x0566;
    L_0x0562:
        r5 = 0;
        r6 = 2131231897; // 0x7f080499 float:1.8079888E38 double:1.0529684636E-314;
    L_0x0566:
        r2.setCompoundDrawablesWithIntrinsicBounds(r6, r5, r5, r5);
        r4 = mobi.mmdt.componentsutils.p232b.C2491i.m6804b(r4, r7);
        goto L_0x058c;
    L_0x056e:
        r5 = 0;
        r7 = 2131232101; // 0x7f080565 float:1.8080302E38 double:1.0529685644E-314;
        goto L_0x0585;
    L_0x0573:
        r5 = 0;
        r6 = 2131231921; // 0x7f0804b1 float:1.8079937E38 double:1.0529684755E-314;
        r2.setCompoundDrawablesWithIntrinsicBounds(r6, r5, r5, r5);
        r5 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r4 = mobi.mmdt.componentsutils.p232b.C2491i.m6804b(r4, r5);
        goto L_0x058c;
    L_0x0581:
        r5 = 0;
        r7 = 2131231933; // 0x7f0804bd float:1.807996E38 double:1.0529684814E-314;
    L_0x0585:
        r2.setCompoundDrawablesWithIntrinsicBounds(r7, r5, r5, r5);
        r4 = mobi.mmdt.componentsutils.p232b.C2491i.m6804b(r4, r6);
    L_0x058c:
        r4 = (int) r4;
        r2.setCompoundDrawablePadding(r4);
    L_0x0590:
        r4 = mobi.mmdt.ott.logic.stheme.UIThemeManager.getmInstance();
        r4 = r4.getText_secondary_color();
        mobi.mmdt.componentsutils.p232b.C2491i.m6828c(r2, r4);
    L_0x059b:
        r4 = 1114113; // 0x110001 float:1.561205E-39 double:5.50445E-318;
        r6 = r31 & r4;
        r4 = 0;
        r2 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1));
        if (r2 == 0) goto L_0x05b9;
    L_0x05a6:
        r2 = r1.f20538q;
        r4 = android.os.Build.VERSION.SDK_INT;
        r5 = 16;
        if (r4 < r5) goto L_0x05b4;
    L_0x05ae:
        r4 = r52;
        r2.setBackground(r4);
        goto L_0x05b9;
    L_0x05b4:
        r4 = r52;
        r2.setBackgroundDrawable(r4);
    L_0x05b9:
        r4 = r31 & r20;
        r6 = 0;
        r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r2 == 0) goto L_0x05cd;
    L_0x05c1:
        r2 = r1.f20538q;
        mobi.mmdt.ott.view.tools.C4511h.m8224a(r2, r3);
        r2 = r1.f20538q;
        r3 = r53;
        r2.setVisibility(r3);
    L_0x05cd:
        r2 = 1048585; // 0x100009 float:1.46938E-39 double:5.1807E-318;
        r4 = r31 & r2;
        r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r2 == 0) goto L_0x05dd;
    L_0x05d6:
        r2 = r1.f20539r;
        r3 = r54;
        r2.setVisibility(r3);
    L_0x05dd:
        return;
    L_0x05de:
        r0 = move-exception;
        r2 = r0;
        monitor-exit(r58);	 Catch:{ all -> 0x05de }
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.a.d.c():void");
    }

    public final boolean mo3443d() {
        synchronized (this) {
            if (this.f20524A != 0) {
                return true;
            }
            return false;
        }
    }
}
