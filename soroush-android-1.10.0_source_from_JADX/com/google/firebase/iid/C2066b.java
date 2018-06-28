package com.google.firebase.iid;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.support.v4.p029a.C0360h;
import android.support.v4.p038g.C0482m;
import android.util.Log;
import java.util.LinkedList;
import java.util.Queue;
import org.msgpack.util.TemplatePrecompiler;

public final class C2066b {
    private static C2066b f6955c;
    final Queue<Intent> f6956a = new LinkedList();
    public Queue<Intent> f6957b = new LinkedList();
    private final C0482m<String, String> f6958d = new C0482m();
    private Boolean f6959e = null;

    private C2066b() {
    }

    public static PendingIntent m5635a(Context context, int i, Intent intent) {
        Intent intent2 = new Intent(context, FirebaseInstanceIdReceiver.class);
        intent2.setAction("com.google.firebase.MESSAGING_EVENT");
        intent2.putExtra("wrapped_intent", intent);
        return PendingIntent.getBroadcast(context, i, intent2, 1073741824);
    }

    public static synchronized C2066b m5636a() {
        C2066b c2066b;
        synchronized (C2066b.class) {
            if (f6955c == null) {
                f6955c = new C2066b();
            }
            c2066b = f6955c;
        }
        return c2066b;
    }

    final int m5637a(Context context, Intent intent) {
        String str;
        ComponentName a_;
        synchronized (this.f6958d) {
            str = (String) this.f6958d.get(intent.getAction());
        }
        boolean z = false;
        if (str == null) {
            ResolveInfo resolveService = context.getPackageManager().resolveService(intent, 0);
            if (resolveService != null) {
                if (resolveService.serviceInfo != null) {
                    ServiceInfo serviceInfo = resolveService.serviceInfo;
                    if (context.getPackageName().equals(serviceInfo.packageName)) {
                        if (serviceInfo.name != null) {
                            str = serviceInfo.name;
                            if (str.startsWith(TemplatePrecompiler.DEFAULT_DEST)) {
                                String valueOf = String.valueOf(context.getPackageName());
                                str = String.valueOf(str);
                                str = str.length() != 0 ? valueOf.concat(str) : new String(valueOf);
                            }
                            synchronized (this.f6958d) {
                                this.f6958d.put(intent.getAction(), str);
                            }
                        }
                    }
                    String str2 = serviceInfo.packageName;
                    str = serviceInfo.name;
                    StringBuilder stringBuilder = new StringBuilder((94 + String.valueOf(str2).length()) + String.valueOf(str).length());
                    stringBuilder.append("Error resolving target intent service, skipping classname enforcement. Resolved service was: ");
                    stringBuilder.append(str2);
                    stringBuilder.append("/");
                    stringBuilder.append(str);
                    Log.e("FirebaseInstanceId", stringBuilder.toString());
                    if (this.f6959e == null) {
                        if (context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0) {
                            z = true;
                        }
                        this.f6959e = Boolean.valueOf(z);
                    }
                    if (this.f6959e.booleanValue()) {
                        a_ = C0360h.a_(context, intent);
                    } else {
                        a_ = context.startService(intent);
                        Log.d("FirebaseInstanceId", "Missing wake lock permission, service start may be delayed");
                    }
                    if (a_ == null) {
                        return -1;
                    }
                    Log.e("FirebaseInstanceId", "Error while delivering the message: ServiceIntent not found.");
                    return 404;
                }
            }
            Log.e("FirebaseInstanceId", "Failed to resolve target intent service, skipping classname enforcement");
            if (this.f6959e == null) {
                if (context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0) {
                    z = true;
                }
                this.f6959e = Boolean.valueOf(z);
            }
            if (this.f6959e.booleanValue()) {
                a_ = context.startService(intent);
                Log.d("FirebaseInstanceId", "Missing wake lock permission, service start may be delayed");
            } else {
                a_ = C0360h.a_(context, intent);
            }
            if (a_ == null) {
                return -1;
            }
            Log.e("FirebaseInstanceId", "Error while delivering the message: ServiceIntent not found.");
            return 404;
        }
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            valueOf = "FirebaseInstanceId";
            str2 = "Restricting intent to a specific service: ";
            String valueOf2 = String.valueOf(str);
            Log.d(valueOf, valueOf2.length() != 0 ? str2.concat(valueOf2) : new String(str2));
        }
        intent.setClassName(context.getPackageName(), str);
        try {
            if (this.f6959e == null) {
                if (context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0) {
                    z = true;
                }
                this.f6959e = Boolean.valueOf(z);
            }
            if (this.f6959e.booleanValue()) {
                a_ = C0360h.a_(context, intent);
            } else {
                a_ = context.startService(intent);
                Log.d("FirebaseInstanceId", "Missing wake lock permission, service start may be delayed");
            }
            if (a_ == null) {
                return -1;
            }
            Log.e("FirebaseInstanceId", "Error while delivering the message: ServiceIntent not found.");
            return 404;
        } catch (Throwable e) {
            Log.e("FirebaseInstanceId", "Error while delivering the message to the serviceIntent", e);
            return 401;
        } catch (IllegalStateException e2) {
            String valueOf3 = String.valueOf(e2);
            StringBuilder stringBuilder2 = new StringBuilder(45 + String.valueOf(valueOf3).length());
            stringBuilder2.append("Failed to start service while in background: ");
            stringBuilder2.append(valueOf3);
            Log.e("FirebaseInstanceId", stringBuilder2.toString());
            return 402;
        }
    }
}
