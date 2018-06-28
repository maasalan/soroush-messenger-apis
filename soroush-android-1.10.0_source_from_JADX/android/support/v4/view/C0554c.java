package android.support.v4.view;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Message;
import android.view.GestureDetector;
import android.view.GestureDetector.OnDoubleTapListener;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

public final class C0554c {
    private final C0552a f1847a;

    interface C0552a {
        boolean mo399a(MotionEvent motionEvent);
    }

    static class C4837b implements C0552a {
        private static final int f13417l = ViewConfiguration.getLongPressTimeout();
        private static final int f13418m = ViewConfiguration.getTapTimeout();
        private static final int f13419n = ViewConfiguration.getDoubleTapTimeout();
        final Handler f13420a = new C0553a(this);
        final OnGestureListener f13421b;
        OnDoubleTapListener f13422c;
        boolean f13423d;
        boolean f13424e;
        boolean f13425f;
        MotionEvent f13426g;
        private int f13427h;
        private int f13428i;
        private int f13429j;
        private int f13430k;
        private boolean f13431o;
        private boolean f13432p;
        private MotionEvent f13433q;
        private boolean f13434r;
        private float f13435s;
        private float f13436t;
        private float f13437u;
        private float f13438v;
        private boolean f13439w;
        private VelocityTracker f13440x;

        private class C0553a extends Handler {
            final /* synthetic */ C4837b f1846a;

            C0553a(C4837b c4837b) {
                this.f1846a = c4837b;
            }

            public final void handleMessage(Message message) {
                switch (message.what) {
                    case 1:
                        this.f1846a.f13421b.onShowPress(this.f1846a.f13426g);
                        return;
                    case 2:
                        C4837b c4837b = this.f1846a;
                        c4837b.f13420a.removeMessages(3);
                        c4837b.f13424e = false;
                        c4837b.f13425f = true;
                        c4837b.f13421b.onLongPress(c4837b.f13426g);
                        return;
                    case 3:
                        if (this.f1846a.f13422c != null) {
                            if (this.f1846a.f13423d) {
                                this.f1846a.f13424e = true;
                            } else {
                                this.f1846a.f13422c.onSingleTapConfirmed(this.f1846a.f13426g);
                                return;
                            }
                        }
                        return;
                    default:
                        StringBuilder stringBuilder = new StringBuilder("Unknown message ");
                        stringBuilder.append(message);
                        throw new RuntimeException(stringBuilder.toString());
                }
            }
        }

        public C4837b(Context context, OnGestureListener onGestureListener) {
            this.f13421b = onGestureListener;
            if (onGestureListener instanceof OnDoubleTapListener) {
                this.f13422c = (OnDoubleTapListener) onGestureListener;
            }
            if (context == null) {
                throw new IllegalArgumentException("Context must not be null");
            } else if (this.f13421b == null) {
                throw new IllegalArgumentException("OnGestureListener must not be null");
            } else {
                this.f13439w = true;
                ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
                int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
                int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
                this.f13429j = viewConfiguration.getScaledMinimumFlingVelocity();
                this.f13430k = viewConfiguration.getScaledMaximumFlingVelocity();
                this.f13427h = scaledTouchSlop * scaledTouchSlop;
                this.f13428i = scaledDoubleTapSlop * scaledDoubleTapSlop;
            }
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo399a(android.view.MotionEvent r18) {
            /*
            r17 = this;
            r0 = r17;
            r1 = r18;
            r2 = r18.getAction();
            r3 = r0.f13440x;
            if (r3 != 0) goto L_0x0012;
        L_0x000c:
            r3 = android.view.VelocityTracker.obtain();
            r0.f13440x = r3;
        L_0x0012:
            r3 = r0.f13440x;
            r3.addMovement(r1);
            r2 = r2 & 255;
            r3 = 6;
            r4 = 1;
            r5 = 0;
            if (r2 != r3) goto L_0x0020;
        L_0x001e:
            r3 = r4;
            goto L_0x0021;
        L_0x0020:
            r3 = r5;
        L_0x0021:
            if (r3 == 0) goto L_0x0028;
        L_0x0023:
            r6 = r18.getActionIndex();
            goto L_0x0029;
        L_0x0028:
            r6 = -1;
        L_0x0029:
            r7 = r18.getPointerCount();
            r8 = 0;
            r9 = r5;
            r10 = r8;
            r11 = r10;
        L_0x0031:
            if (r9 >= r7) goto L_0x0042;
        L_0x0033:
            if (r6 == r9) goto L_0x003f;
        L_0x0035:
            r12 = r1.getX(r9);
            r10 = r10 + r12;
            r12 = r1.getY(r9);
            r11 = r11 + r12;
        L_0x003f:
            r9 = r9 + 1;
            goto L_0x0031;
        L_0x0042:
            if (r3 == 0) goto L_0x0047;
        L_0x0044:
            r3 = r7 + -1;
            goto L_0x0048;
        L_0x0047:
            r3 = r7;
        L_0x0048:
            r3 = (float) r3;
            r10 = r10 / r3;
            r11 = r11 / r3;
            r3 = 0;
            r6 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
            r9 = 2;
            r12 = 3;
            switch(r2) {
                case 0: goto L_0x01eb;
                case 1: goto L_0x0159;
                case 2: goto L_0x00e8;
                case 3: goto L_0x00c3;
                case 4: goto L_0x0053;
                case 5: goto L_0x009d;
                case 6: goto L_0x0054;
                default: goto L_0x0053;
            };
        L_0x0053:
            return r5;
        L_0x0054:
            r0.f13435s = r10;
            r0.f13437u = r10;
            r0.f13436t = r11;
            r0.f13438v = r11;
            r2 = r0.f13440x;
            r3 = r0.f13430k;
            r3 = (float) r3;
            r2.computeCurrentVelocity(r6, r3);
            r2 = r18.getActionIndex();
            r3 = r1.getPointerId(r2);
            r4 = r0.f13440x;
            r4 = r4.getXVelocity(r3);
            r6 = r0.f13440x;
            r3 = r6.getYVelocity(r3);
            r6 = r5;
        L_0x0079:
            if (r6 >= r7) goto L_0x02b4;
        L_0x007b:
            if (r6 == r2) goto L_0x009a;
        L_0x007d:
            r9 = r1.getPointerId(r6);
            r10 = r0.f13440x;
            r10 = r10.getXVelocity(r9);
            r10 = r10 * r4;
            r11 = r0.f13440x;
            r9 = r11.getYVelocity(r9);
            r9 = r9 * r3;
            r10 = r10 + r9;
            r9 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1));
            if (r9 >= 0) goto L_0x009a;
        L_0x0094:
            r1 = r0.f13440x;
            r1.clear();
            return r5;
        L_0x009a:
            r6 = r6 + 1;
            goto L_0x0079;
        L_0x009d:
            r0.f13435s = r10;
            r0.f13437u = r10;
            r0.f13436t = r11;
            r0.f13438v = r11;
            r1 = r0.f13420a;
            r1.removeMessages(r4);
            r1 = r0.f13420a;
            r1.removeMessages(r9);
            r1 = r0.f13420a;
            r1.removeMessages(r12);
            r0.f13434r = r5;
            r0.f13431o = r5;
            r0.f13432p = r5;
            r0.f13424e = r5;
            r1 = r0.f13425f;
            if (r1 == 0) goto L_0x02b4;
        L_0x00c0:
            r0.f13425f = r5;
            return r5;
        L_0x00c3:
            r1 = r0.f13420a;
            r1.removeMessages(r4);
            r1 = r0.f13420a;
            r1.removeMessages(r9);
            r1 = r0.f13420a;
            r1.removeMessages(r12);
            r1 = r0.f13440x;
            r1.recycle();
            r0.f13440x = r3;
            r0.f13434r = r5;
            r0.f13423d = r5;
            r0.f13431o = r5;
            r0.f13432p = r5;
            r0.f13424e = r5;
            r1 = r0.f13425f;
            if (r1 == 0) goto L_0x02b4;
        L_0x00e7:
            goto L_0x00c0;
        L_0x00e8:
            r2 = r0.f13425f;
            if (r2 != 0) goto L_0x02b4;
        L_0x00ec:
            r2 = r0.f13435s;
            r2 = r2 - r10;
            r3 = r0.f13436t;
            r3 = r3 - r11;
            r6 = r0.f13434r;
            if (r6 == 0) goto L_0x00fe;
        L_0x00f6:
            r2 = r0.f13422c;
            r1 = r2.onDoubleTapEvent(r1);
            r5 = r5 | r1;
            return r5;
        L_0x00fe:
            r6 = r0.f13431o;
            if (r6 == 0) goto L_0x013a;
        L_0x0102:
            r6 = r0.f13437u;
            r6 = r10 - r6;
            r6 = (int) r6;
            r7 = r0.f13438v;
            r7 = r11 - r7;
            r7 = (int) r7;
            r6 = r6 * r6;
            r7 = r7 * r7;
            r6 = r6 + r7;
            r7 = r0.f13427h;
            if (r6 <= r7) goto L_0x0131;
        L_0x0113:
            r7 = r0.f13421b;
            r8 = r0.f13426g;
            r1 = r7.onScroll(r8, r1, r2, r3);
            r0.f13435s = r10;
            r0.f13436t = r11;
            r0.f13431o = r5;
            r2 = r0.f13420a;
            r2.removeMessages(r12);
            r2 = r0.f13420a;
            r2.removeMessages(r4);
            r2 = r0.f13420a;
            r2.removeMessages(r9);
            goto L_0x0132;
        L_0x0131:
            r1 = r5;
        L_0x0132:
            r2 = r0.f13427h;
            if (r6 <= r2) goto L_0x01e9;
        L_0x0136:
            r0.f13432p = r5;
            goto L_0x01e9;
        L_0x013a:
            r4 = java.lang.Math.abs(r2);
            r6 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
            r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
            if (r4 >= 0) goto L_0x014c;
        L_0x0144:
            r4 = java.lang.Math.abs(r3);
            r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
            if (r4 < 0) goto L_0x02b4;
        L_0x014c:
            r4 = r0.f13421b;
            r5 = r0.f13426g;
            r5 = r4.onScroll(r5, r1, r2, r3);
            r0.f13435s = r10;
            r0.f13436t = r11;
            return r5;
        L_0x0159:
            r0.f13423d = r5;
            r2 = android.view.MotionEvent.obtain(r18);
            r7 = r0.f13434r;
            if (r7 == 0) goto L_0x016b;
        L_0x0163:
            r6 = r0.f13422c;
            r1 = r6.onDoubleTapEvent(r1);
            r1 = r1 | r5;
            goto L_0x01c5;
        L_0x016b:
            r7 = r0.f13425f;
            if (r7 == 0) goto L_0x0177;
        L_0x016f:
            r1 = r0.f13420a;
            r1.removeMessages(r12);
            r0.f13425f = r5;
            goto L_0x01bb;
        L_0x0177:
            r7 = r0.f13431o;
            if (r7 == 0) goto L_0x0190;
        L_0x017b:
            r6 = r0.f13421b;
            r6 = r6.onSingleTapUp(r1);
            r7 = r0.f13424e;
            if (r7 == 0) goto L_0x018e;
        L_0x0185:
            r7 = r0.f13422c;
            if (r7 == 0) goto L_0x018e;
        L_0x0189:
            r7 = r0.f13422c;
            r7.onSingleTapConfirmed(r1);
        L_0x018e:
            r1 = r6;
            goto L_0x01c5;
        L_0x0190:
            r7 = r0.f13440x;
            r8 = r1.getPointerId(r5);
            r10 = r0.f13430k;
            r10 = (float) r10;
            r7.computeCurrentVelocity(r6, r10);
            r6 = r7.getYVelocity(r8);
            r7 = r7.getXVelocity(r8);
            r8 = java.lang.Math.abs(r6);
            r10 = r0.f13429j;
            r10 = (float) r10;
            r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1));
            if (r8 > 0) goto L_0x01bd;
        L_0x01af:
            r8 = java.lang.Math.abs(r7);
            r10 = r0.f13429j;
            r10 = (float) r10;
            r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1));
            if (r8 <= 0) goto L_0x01bb;
        L_0x01ba:
            goto L_0x01bd;
        L_0x01bb:
            r1 = r5;
            goto L_0x01c5;
        L_0x01bd:
            r8 = r0.f13421b;
            r10 = r0.f13426g;
            r1 = r8.onFling(r10, r1, r7, r6);
        L_0x01c5:
            r6 = r0.f13433q;
            if (r6 == 0) goto L_0x01ce;
        L_0x01c9:
            r6 = r0.f13433q;
            r6.recycle();
        L_0x01ce:
            r0.f13433q = r2;
            r2 = r0.f13440x;
            if (r2 == 0) goto L_0x01db;
        L_0x01d4:
            r2 = r0.f13440x;
            r2.recycle();
            r0.f13440x = r3;
        L_0x01db:
            r0.f13434r = r5;
            r0.f13424e = r5;
            r2 = r0.f13420a;
            r2.removeMessages(r4);
            r2 = r0.f13420a;
            r2.removeMessages(r9);
        L_0x01e9:
            r5 = r1;
            return r5;
        L_0x01eb:
            r2 = r0.f13422c;
            if (r2 == 0) goto L_0x025c;
        L_0x01ef:
            r2 = r0.f13420a;
            r2 = r2.hasMessages(r12);
            if (r2 == 0) goto L_0x01fc;
        L_0x01f7:
            r3 = r0.f13420a;
            r3.removeMessages(r12);
        L_0x01fc:
            r3 = r0.f13426g;
            if (r3 == 0) goto L_0x0254;
        L_0x0200:
            r3 = r0.f13433q;
            if (r3 == 0) goto L_0x0254;
        L_0x0204:
            if (r2 == 0) goto L_0x0254;
        L_0x0206:
            r2 = r0.f13426g;
            r3 = r0.f13433q;
            r6 = r0.f13432p;
            if (r6 == 0) goto L_0x023e;
        L_0x020e:
            r6 = r18.getEventTime();
            r13 = r3.getEventTime();
            r15 = r6 - r13;
            r3 = f13419n;
            r6 = (long) r3;
            r3 = (r15 > r6 ? 1 : (r15 == r6 ? 0 : -1));
            if (r3 > 0) goto L_0x023e;
        L_0x021f:
            r3 = r2.getX();
            r3 = (int) r3;
            r6 = r18.getX();
            r6 = (int) r6;
            r3 = r3 - r6;
            r2 = r2.getY();
            r2 = (int) r2;
            r6 = r18.getY();
            r6 = (int) r6;
            r2 = r2 - r6;
            r3 = r3 * r3;
            r2 = r2 * r2;
            r3 = r3 + r2;
            r2 = r0.f13428i;
            if (r3 >= r2) goto L_0x023e;
        L_0x023c:
            r2 = r4;
            goto L_0x023f;
        L_0x023e:
            r2 = r5;
        L_0x023f:
            if (r2 == 0) goto L_0x0254;
        L_0x0241:
            r0.f13434r = r4;
            r2 = r0.f13422c;
            r3 = r0.f13426g;
            r2 = r2.onDoubleTap(r3);
            r2 = r2 | r5;
            r3 = r0.f13422c;
            r3 = r3.onDoubleTapEvent(r1);
            r2 = r2 | r3;
            goto L_0x025d;
        L_0x0254:
            r2 = r0.f13420a;
            r3 = f13419n;
            r6 = (long) r3;
            r2.sendEmptyMessageDelayed(r12, r6);
        L_0x025c:
            r2 = r5;
        L_0x025d:
            r0.f13435s = r10;
            r0.f13437u = r10;
            r0.f13436t = r11;
            r0.f13438v = r11;
            r3 = r0.f13426g;
            if (r3 == 0) goto L_0x026e;
        L_0x0269:
            r3 = r0.f13426g;
            r3.recycle();
        L_0x026e:
            r3 = android.view.MotionEvent.obtain(r18);
            r0.f13426g = r3;
            r0.f13431o = r4;
            r0.f13432p = r4;
            r0.f13423d = r4;
            r0.f13425f = r5;
            r0.f13424e = r5;
            r3 = r0.f13439w;
            if (r3 == 0) goto L_0x029c;
        L_0x0282:
            r3 = r0.f13420a;
            r3.removeMessages(r9);
            r3 = r0.f13420a;
            r5 = r0.f13426g;
            r5 = r5.getDownTime();
            r7 = f13418m;
            r7 = (long) r7;
            r10 = r5 + r7;
            r5 = f13417l;
            r5 = (long) r5;
            r7 = r10 + r5;
            r3.sendEmptyMessageAtTime(r9, r7);
        L_0x029c:
            r3 = r0.f13420a;
            r5 = r0.f13426g;
            r5 = r5.getDownTime();
            r7 = f13418m;
            r7 = (long) r7;
            r9 = r5 + r7;
            r3.sendEmptyMessageAtTime(r4, r9);
            r3 = r0.f13421b;
            r1 = r3.onDown(r1);
            r5 = r2 | r1;
        L_0x02b4:
            return r5;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.c.b.a(android.view.MotionEvent):boolean");
        }
    }

    static class C4838c implements C0552a {
        private final GestureDetector f13441a;

        public C4838c(Context context, OnGestureListener onGestureListener) {
            this.f13441a = new GestureDetector(context, onGestureListener, null);
        }

        public final boolean mo399a(MotionEvent motionEvent) {
            return this.f13441a.onTouchEvent(motionEvent);
        }
    }

    public C0554c(Context context, OnGestureListener onGestureListener) {
        this(context, onGestureListener, (byte) 0);
    }

    private C0554c(Context context, OnGestureListener onGestureListener, byte b) {
        this.f1847a = VERSION.SDK_INT > 17 ? new C4838c(context, onGestureListener) : new C4837b(context, onGestureListener);
    }

    public final boolean m1223a(MotionEvent motionEvent) {
        return this.f1847a.mo399a(motionEvent);
    }
}
