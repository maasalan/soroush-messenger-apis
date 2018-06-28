package com.google.android.gms.common;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.Notification;
import android.app.Notification.BigTextStyle;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.app.C0425x.C0421d;
import android.support.v4.app.C0425x.C4791c;
import android.support.v4.app.C7249g;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.ProgressBar;
import com.google.android.gms.C1650a.C1644a;
import com.google.android.gms.C1650a.C1645b;
import com.google.android.gms.common.api.internal.C1728r;
import com.google.android.gms.common.api.internal.C1729s;
import com.google.android.gms.common.api.internal.C1732v;
import com.google.android.gms.common.internal.ac;
import com.google.android.gms.common.internal.az;
import com.google.android.gms.common.internal.ba;
import com.google.android.gms.common.util.C1787g;
import com.google.android.gms.common.util.C1793m;

public final class C5458b extends C1771k {
    public static final int f15143a = C1771k.f5418b;
    private static final C5458b f15144c = new C5458b();

    @SuppressLint({"HandlerLeak"})
    class C1741a extends Handler {
        private final Context f5297a;
        private /* synthetic */ C5458b f5298b;

        public C1741a(C5458b c5458b, Context context) {
            this.f5298b = c5458b;
            super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
            this.f5297a = context.getApplicationContext();
        }

        public final void handleMessage(Message message) {
            if (message.what != 1) {
                int i = message.what;
                StringBuilder stringBuilder = new StringBuilder(50);
                stringBuilder.append("Don't know how to handle this message: ");
                stringBuilder.append(i);
                Log.w("GoogleApiAvailability", stringBuilder.toString());
                return;
            }
            i = this.f5298b.mo1557a(this.f5297a);
            if (this.f5298b.mo1559a(i)) {
                C5458b c5458b = this.f5298b;
                Context context = this.f5297a;
                c5458b.m11794a(context, i, C1771k.m4470a(context, i, 0, "n"));
            }
        }
    }

    C5458b() {
    }

    public static Dialog m11786a(Activity activity, OnCancelListener onCancelListener) {
        View progressBar = new ProgressBar(activity, null, 16842874);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        Builder builder = new Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(az.m4442c(activity, 18));
        builder.setPositiveButton("", null);
        Dialog create = builder.create();
        C5458b.m11790a(activity, create, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return create;
    }

    public static Dialog m11787a(Context context, int i, ba baVar, OnCancelListener onCancelListener) {
        Builder builder = null;
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843529, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new Builder(context, 5);
        }
        if (builder == null) {
            builder = new Builder(context);
        }
        builder.setMessage(az.m4442c(context, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        CharSequence e = az.m4444e(context, i);
        if (e != null) {
            builder.setPositiveButton(e, baVar);
        }
        CharSequence a = az.m4438a(context, i);
        if (a != null) {
            builder.setTitle(a);
        }
        return builder.create();
    }

    public static C1728r m11788a(Context context, C1729s c1729s) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        BroadcastReceiver c1728r = new C1728r(c1729s);
        context.registerReceiver(c1728r, intentFilter);
        c1728r.f5280a = context;
        if (C1780t.m4495a(context, "com.google.android.gms")) {
            return c1728r;
        }
        c1729s.mo1546a();
        c1728r.m4350a();
        return null;
    }

    public static C5458b m11789a() {
        return f15144c;
    }

    public static void m11790a(Activity activity, Dialog dialog, String str, OnCancelListener onCancelListener) {
        if (activity instanceof C7249g) {
            C7138f.m18787a(dialog, onCancelListener).mo3404a(((C7249g) activity).m19188c(), str);
            return;
        }
        C1703a.m4303a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    public static boolean m11791a(Activity activity, C1732v c1732v, int i, OnCancelListener onCancelListener) {
        Dialog a = C5458b.m11787a((Context) activity, i, ba.m4446a(c1732v, C1771k.m4471a((Context) activity, i, "d")), onCancelListener);
        if (a == null) {
            return false;
        }
        C5458b.m11790a(activity, a, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public final int mo1557a(Context context) {
        return super.mo1557a(context);
    }

    public final PendingIntent mo1558a(Context context, int i, int i2) {
        return super.mo1558a(context, i, i2);
    }

    @TargetApi(20)
    public final void m11794a(Context context, int i, PendingIntent pendingIntent) {
        if (i == 18) {
            new C1741a(this, context).sendEmptyMessageDelayed(1, 120000);
        } else if (pendingIntent == null) {
            if (i == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
            }
        } else {
            Notification build;
            CharSequence b = az.m4441b(context, i);
            CharSequence d = az.m4443d(context, i);
            Resources resources = context.getResources();
            if (C1787g.m4524a(context)) {
                ac.m4381a(C1793m.m4533b());
                build = new Notification.Builder(context).setSmallIcon(context.getApplicationInfo().icon).setPriority(2).setAutoCancel(true).setContentTitle(b).setStyle(new BigTextStyle().bigText(d)).addAction(C1644a.common_full_open_on_phone, resources.getString(C1645b.common_open_on_phone), pendingIntent).build();
            } else {
                C0421d c = new C0421d(context, (byte) 0).m849a(17301642).m857c(resources.getString(C1645b.common_google_play_services_notification_ticker));
                c.f1503M.when = System.currentTimeMillis();
                c.m856b(16);
                c.f1508d = pendingIntent;
                C0421d b2 = c.m853a(b).m855b(d);
                b2.f1527w = true;
                build = b2.m852a(new C4791c().m9140c(d)).m848a();
            }
            switch (i) {
                case 1:
                case 2:
                case 3:
                    i = 10436;
                    C1780t.f5444c.set(false);
                    break;
                default:
                    i = 39789;
                    break;
            }
            ((NotificationManager) context.getSystemService("notification")).notify(i, build);
        }
    }

    public final boolean mo1559a(int i) {
        return super.mo1559a(i);
    }

    public final String mo1560b(int i) {
        return super.mo1560b(i);
    }
}
