package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.firebase.iid.C2066b;
import com.google.firebase.iid.C2071g;
import com.google.firebase.iid.C2080p;
import com.google.firebase.iid.C5634w;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import org.jivesoftware.smackx.gcm.packet.GcmPacketExtension;

public class FirebaseMessagingService extends C2071g {
    private static final Queue<String> f15498b = new ArrayDeque(10);

    static void m12387a(Bundle bundle) {
        Iterator it = bundle.keySet().iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str != null && str.startsWith("google.c.")) {
                it.remove();
            }
        }
    }

    static boolean m12388b(Bundle bundle) {
        return bundle == null ? false : "1".equals(bundle.getString("google.c.a.e"));
    }

    protected final Intent mo1775a(Intent intent) {
        return (Intent) C2066b.m5636a().f6957b.poll();
    }

    public void mo3176a(RemoteMessage remoteMessage) {
    }

    public final void mo1776b(Intent intent) {
        int i;
        Object stringExtra;
        String str;
        String str2;
        String valueOf;
        int hashCode;
        Bundle extras;
        C2090a c2090a;
        String str3;
        String str4;
        Bundle bundle;
        C2080p a;
        String action = intent.getAction();
        if (action == null) {
            action = "";
        }
        int hashCode2 = action.hashCode();
        int i2 = -1;
        if (hashCode2 != 75300319) {
            if (hashCode2 == 366519424) {
                if (action.equals("com.google.android.c2dm.intent.RECEIVE")) {
                    i = 0;
                    switch (i) {
                        case 0:
                            stringExtra = intent.getStringExtra("google.message_id");
                            if (!TextUtils.isEmpty(stringExtra)) {
                                if (f15498b.contains(stringExtra)) {
                                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                                        str = "FirebaseMessaging";
                                        str2 = "Received duplicate message: ";
                                        valueOf = String.valueOf(stringExtra);
                                        Log.d(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                                    }
                                    hashCode2 = 1;
                                    if (hashCode2 == 0) {
                                        str = intent.getStringExtra("message_type");
                                        if (str == null) {
                                            str = GcmPacketExtension.ELEMENT;
                                        }
                                        hashCode = str.hashCode();
                                        if (hashCode == -2062414158) {
                                            if (hashCode == 102161) {
                                                if (hashCode == 814694033) {
                                                    if (hashCode != 814800675) {
                                                        if (str.equals("send_event")) {
                                                            i2 = 2;
                                                        }
                                                    }
                                                } else if (str.equals("send_error")) {
                                                    i2 = 3;
                                                }
                                            } else if (str.equals(GcmPacketExtension.ELEMENT)) {
                                                i2 = 0;
                                            }
                                        } else if (str.equals("deleted_messages")) {
                                            i2 = 1;
                                        }
                                        switch (i2) {
                                            case 0:
                                                if (m12388b(intent.getExtras())) {
                                                    str = intent.getStringExtra("google.c.a.abt");
                                                    if (str != null) {
                                                        C2093d.m5719a(this, AppMeasurement.FCM_ORIGIN, Base64.decode(str, 0), new C2092c());
                                                    }
                                                    C2094e.m5725a(this, "_nr", intent);
                                                }
                                                extras = intent.getExtras();
                                                if (extras == null) {
                                                    extras = new Bundle();
                                                }
                                                extras.remove("android.support.content.wakelockid");
                                                if (C2091b.m5700a(extras)) {
                                                    if (!C2091b.m5696a((Context) this).m5709c(extras)) {
                                                        if (m12388b(extras)) {
                                                            C2094e.m5725a(this, "_nf", intent);
                                                        }
                                                    }
                                                }
                                                mo3176a(new RemoteMessage(extras));
                                                break;
                                            case 1:
                                                break;
                                            case 2:
                                                intent.getStringExtra("google.message_id");
                                                break;
                                            case 3:
                                                if (intent.getStringExtra("google.message_id") == null) {
                                                    intent.getStringExtra("message_id");
                                                }
                                                c2090a = new C2090a(intent.getStringExtra("error"));
                                                break;
                                            default:
                                                str3 = "FirebaseMessaging";
                                                str4 = "Received message with unknown type: ";
                                                str = String.valueOf(str);
                                                Log.w(str3, str.length() == 0 ? str4.concat(str) : new String(str4));
                                                break;
                                        }
                                    }
                                    if (!TextUtils.isEmpty(stringExtra)) {
                                        bundle = new Bundle();
                                        bundle.putString("google.message_id", stringExtra);
                                        a = C2080p.m5678a((Context) this);
                                        a.m5680a(new C5634w(a.m5679a(), bundle));
                                    }
                                    return;
                                }
                                if (f15498b.size() >= 10) {
                                    f15498b.remove();
                                }
                                f15498b.add(stringExtra);
                            }
                            hashCode2 = 0;
                            if (hashCode2 == 0) {
                                str = intent.getStringExtra("message_type");
                                if (str == null) {
                                    str = GcmPacketExtension.ELEMENT;
                                }
                                hashCode = str.hashCode();
                                if (hashCode == -2062414158) {
                                    if (str.equals("deleted_messages")) {
                                        i2 = 1;
                                    }
                                } else if (hashCode == 102161) {
                                    if (str.equals(GcmPacketExtension.ELEMENT)) {
                                        i2 = 0;
                                    }
                                } else if (hashCode == 814694033) {
                                    if (str.equals("send_error")) {
                                        i2 = 3;
                                    }
                                } else if (hashCode != 814800675) {
                                    if (str.equals("send_event")) {
                                        i2 = 2;
                                    }
                                }
                                switch (i2) {
                                    case 0:
                                        if (m12388b(intent.getExtras())) {
                                            str = intent.getStringExtra("google.c.a.abt");
                                            if (str != null) {
                                                C2093d.m5719a(this, AppMeasurement.FCM_ORIGIN, Base64.decode(str, 0), new C2092c());
                                            }
                                            C2094e.m5725a(this, "_nr", intent);
                                        }
                                        extras = intent.getExtras();
                                        if (extras == null) {
                                            extras = new Bundle();
                                        }
                                        extras.remove("android.support.content.wakelockid");
                                        if (C2091b.m5700a(extras)) {
                                            if (C2091b.m5696a((Context) this).m5709c(extras)) {
                                                if (m12388b(extras)) {
                                                    C2094e.m5725a(this, "_nf", intent);
                                                }
                                            }
                                        }
                                        mo3176a(new RemoteMessage(extras));
                                        break;
                                    case 1:
                                        break;
                                    case 2:
                                        intent.getStringExtra("google.message_id");
                                        break;
                                    case 3:
                                        if (intent.getStringExtra("google.message_id") == null) {
                                            intent.getStringExtra("message_id");
                                        }
                                        c2090a = new C2090a(intent.getStringExtra("error"));
                                        break;
                                    default:
                                        str3 = "FirebaseMessaging";
                                        str4 = "Received message with unknown type: ";
                                        str = String.valueOf(str);
                                        if (str.length() == 0) {
                                        }
                                        Log.w(str3, str.length() == 0 ? str4.concat(str) : new String(str4));
                                        break;
                                }
                            }
                            if (TextUtils.isEmpty(stringExtra)) {
                                bundle = new Bundle();
                                bundle.putString("google.message_id", stringExtra);
                                a = C2080p.m5678a((Context) this);
                                a.m5680a(new C5634w(a.m5679a(), bundle));
                            }
                            return;
                        case 1:
                            if (m12388b(intent.getExtras())) {
                                C2094e.m5725a(this, "_nd", intent);
                                return;
                            }
                            break;
                        default:
                            action = "FirebaseMessaging";
                            str = "Unknown intent action: ";
                            str3 = String.valueOf(intent.getAction());
                            Log.d(action, str3.length() != 0 ? str.concat(str3) : new String(str));
                            break;
                    }
                }
            }
        } else if (action.equals("com.google.firebase.messaging.NOTIFICATION_DISMISS")) {
            i = 1;
            switch (i) {
                case 0:
                    stringExtra = intent.getStringExtra("google.message_id");
                    if (TextUtils.isEmpty(stringExtra)) {
                        if (f15498b.contains(stringExtra)) {
                            if (f15498b.size() >= 10) {
                                f15498b.remove();
                            }
                            f15498b.add(stringExtra);
                        } else {
                            if (Log.isLoggable("FirebaseMessaging", 3)) {
                                str = "FirebaseMessaging";
                                str2 = "Received duplicate message: ";
                                valueOf = String.valueOf(stringExtra);
                                if (valueOf.length() != 0) {
                                }
                                Log.d(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                            }
                            hashCode2 = 1;
                            if (hashCode2 == 0) {
                                str = intent.getStringExtra("message_type");
                                if (str == null) {
                                    str = GcmPacketExtension.ELEMENT;
                                }
                                hashCode = str.hashCode();
                                if (hashCode == -2062414158) {
                                    if (hashCode == 102161) {
                                        if (hashCode == 814694033) {
                                            if (hashCode != 814800675) {
                                                if (str.equals("send_event")) {
                                                    i2 = 2;
                                                }
                                            }
                                        } else if (str.equals("send_error")) {
                                            i2 = 3;
                                        }
                                    } else if (str.equals(GcmPacketExtension.ELEMENT)) {
                                        i2 = 0;
                                    }
                                } else if (str.equals("deleted_messages")) {
                                    i2 = 1;
                                }
                                switch (i2) {
                                    case 0:
                                        if (m12388b(intent.getExtras())) {
                                            str = intent.getStringExtra("google.c.a.abt");
                                            if (str != null) {
                                                C2093d.m5719a(this, AppMeasurement.FCM_ORIGIN, Base64.decode(str, 0), new C2092c());
                                            }
                                            C2094e.m5725a(this, "_nr", intent);
                                        }
                                        extras = intent.getExtras();
                                        if (extras == null) {
                                            extras = new Bundle();
                                        }
                                        extras.remove("android.support.content.wakelockid");
                                        if (C2091b.m5700a(extras)) {
                                            if (C2091b.m5696a((Context) this).m5709c(extras)) {
                                                if (m12388b(extras)) {
                                                    C2094e.m5725a(this, "_nf", intent);
                                                }
                                            }
                                        }
                                        mo3176a(new RemoteMessage(extras));
                                        break;
                                    case 1:
                                        break;
                                    case 2:
                                        intent.getStringExtra("google.message_id");
                                        break;
                                    case 3:
                                        if (intent.getStringExtra("google.message_id") == null) {
                                            intent.getStringExtra("message_id");
                                        }
                                        c2090a = new C2090a(intent.getStringExtra("error"));
                                        break;
                                    default:
                                        str3 = "FirebaseMessaging";
                                        str4 = "Received message with unknown type: ";
                                        str = String.valueOf(str);
                                        if (str.length() == 0) {
                                        }
                                        Log.w(str3, str.length() == 0 ? str4.concat(str) : new String(str4));
                                        break;
                                }
                            }
                            if (TextUtils.isEmpty(stringExtra)) {
                                bundle = new Bundle();
                                bundle.putString("google.message_id", stringExtra);
                                a = C2080p.m5678a((Context) this);
                                a.m5680a(new C5634w(a.m5679a(), bundle));
                            }
                            return;
                        }
                    }
                    hashCode2 = 0;
                    if (hashCode2 == 0) {
                        str = intent.getStringExtra("message_type");
                        if (str == null) {
                            str = GcmPacketExtension.ELEMENT;
                        }
                        hashCode = str.hashCode();
                        if (hashCode == -2062414158) {
                            if (str.equals("deleted_messages")) {
                                i2 = 1;
                            }
                        } else if (hashCode == 102161) {
                            if (str.equals(GcmPacketExtension.ELEMENT)) {
                                i2 = 0;
                            }
                        } else if (hashCode == 814694033) {
                            if (str.equals("send_error")) {
                                i2 = 3;
                            }
                        } else if (hashCode != 814800675) {
                            if (str.equals("send_event")) {
                                i2 = 2;
                            }
                        }
                        switch (i2) {
                            case 0:
                                if (m12388b(intent.getExtras())) {
                                    str = intent.getStringExtra("google.c.a.abt");
                                    if (str != null) {
                                        C2093d.m5719a(this, AppMeasurement.FCM_ORIGIN, Base64.decode(str, 0), new C2092c());
                                    }
                                    C2094e.m5725a(this, "_nr", intent);
                                }
                                extras = intent.getExtras();
                                if (extras == null) {
                                    extras = new Bundle();
                                }
                                extras.remove("android.support.content.wakelockid");
                                if (C2091b.m5700a(extras)) {
                                    if (C2091b.m5696a((Context) this).m5709c(extras)) {
                                        if (m12388b(extras)) {
                                            C2094e.m5725a(this, "_nf", intent);
                                        }
                                    }
                                }
                                mo3176a(new RemoteMessage(extras));
                                break;
                            case 1:
                                break;
                            case 2:
                                intent.getStringExtra("google.message_id");
                                break;
                            case 3:
                                if (intent.getStringExtra("google.message_id") == null) {
                                    intent.getStringExtra("message_id");
                                }
                                c2090a = new C2090a(intent.getStringExtra("error"));
                                break;
                            default:
                                str3 = "FirebaseMessaging";
                                str4 = "Received message with unknown type: ";
                                str = String.valueOf(str);
                                if (str.length() == 0) {
                                }
                                Log.w(str3, str.length() == 0 ? str4.concat(str) : new String(str4));
                                break;
                        }
                    }
                    if (TextUtils.isEmpty(stringExtra)) {
                        bundle = new Bundle();
                        bundle.putString("google.message_id", stringExtra);
                        a = C2080p.m5678a((Context) this);
                        a.m5680a(new C5634w(a.m5679a(), bundle));
                    }
                    return;
                case 1:
                    if (m12388b(intent.getExtras())) {
                        C2094e.m5725a(this, "_nd", intent);
                        return;
                    }
                    break;
                default:
                    action = "FirebaseMessaging";
                    str = "Unknown intent action: ";
                    str3 = String.valueOf(intent.getAction());
                    if (str3.length() != 0) {
                    }
                    Log.d(action, str3.length() != 0 ? str.concat(str3) : new String(str));
                    break;
            }
        }
        i = -1;
        switch (i) {
            case 0:
                stringExtra = intent.getStringExtra("google.message_id");
                if (TextUtils.isEmpty(stringExtra)) {
                    if (f15498b.contains(stringExtra)) {
                        if (Log.isLoggable("FirebaseMessaging", 3)) {
                            str = "FirebaseMessaging";
                            str2 = "Received duplicate message: ";
                            valueOf = String.valueOf(stringExtra);
                            if (valueOf.length() != 0) {
                            }
                            Log.d(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                        }
                        hashCode2 = 1;
                        if (hashCode2 == 0) {
                            str = intent.getStringExtra("message_type");
                            if (str == null) {
                                str = GcmPacketExtension.ELEMENT;
                            }
                            hashCode = str.hashCode();
                            if (hashCode == -2062414158) {
                                if (hashCode == 102161) {
                                    if (hashCode == 814694033) {
                                        if (hashCode != 814800675) {
                                            if (str.equals("send_event")) {
                                                i2 = 2;
                                            }
                                        }
                                    } else if (str.equals("send_error")) {
                                        i2 = 3;
                                    }
                                } else if (str.equals(GcmPacketExtension.ELEMENT)) {
                                    i2 = 0;
                                }
                            } else if (str.equals("deleted_messages")) {
                                i2 = 1;
                            }
                            switch (i2) {
                                case 0:
                                    if (m12388b(intent.getExtras())) {
                                        str = intent.getStringExtra("google.c.a.abt");
                                        if (str != null) {
                                            C2093d.m5719a(this, AppMeasurement.FCM_ORIGIN, Base64.decode(str, 0), new C2092c());
                                        }
                                        C2094e.m5725a(this, "_nr", intent);
                                    }
                                    extras = intent.getExtras();
                                    if (extras == null) {
                                        extras = new Bundle();
                                    }
                                    extras.remove("android.support.content.wakelockid");
                                    if (C2091b.m5700a(extras)) {
                                        if (C2091b.m5696a((Context) this).m5709c(extras)) {
                                            if (m12388b(extras)) {
                                                C2094e.m5725a(this, "_nf", intent);
                                            }
                                        }
                                    }
                                    mo3176a(new RemoteMessage(extras));
                                    break;
                                case 1:
                                    break;
                                case 2:
                                    intent.getStringExtra("google.message_id");
                                    break;
                                case 3:
                                    if (intent.getStringExtra("google.message_id") == null) {
                                        intent.getStringExtra("message_id");
                                    }
                                    c2090a = new C2090a(intent.getStringExtra("error"));
                                    break;
                                default:
                                    str3 = "FirebaseMessaging";
                                    str4 = "Received message with unknown type: ";
                                    str = String.valueOf(str);
                                    if (str.length() == 0) {
                                    }
                                    Log.w(str3, str.length() == 0 ? str4.concat(str) : new String(str4));
                                    break;
                            }
                        }
                        if (TextUtils.isEmpty(stringExtra)) {
                            bundle = new Bundle();
                            bundle.putString("google.message_id", stringExtra);
                            a = C2080p.m5678a((Context) this);
                            a.m5680a(new C5634w(a.m5679a(), bundle));
                        }
                        return;
                    }
                    if (f15498b.size() >= 10) {
                        f15498b.remove();
                    }
                    f15498b.add(stringExtra);
                }
                hashCode2 = 0;
                if (hashCode2 == 0) {
                    str = intent.getStringExtra("message_type");
                    if (str == null) {
                        str = GcmPacketExtension.ELEMENT;
                    }
                    hashCode = str.hashCode();
                    if (hashCode == -2062414158) {
                        if (str.equals("deleted_messages")) {
                            i2 = 1;
                        }
                    } else if (hashCode == 102161) {
                        if (str.equals(GcmPacketExtension.ELEMENT)) {
                            i2 = 0;
                        }
                    } else if (hashCode == 814694033) {
                        if (str.equals("send_error")) {
                            i2 = 3;
                        }
                    } else if (hashCode != 814800675) {
                        if (str.equals("send_event")) {
                            i2 = 2;
                        }
                    }
                    switch (i2) {
                        case 0:
                            if (m12388b(intent.getExtras())) {
                                str = intent.getStringExtra("google.c.a.abt");
                                if (str != null) {
                                    C2093d.m5719a(this, AppMeasurement.FCM_ORIGIN, Base64.decode(str, 0), new C2092c());
                                }
                                C2094e.m5725a(this, "_nr", intent);
                            }
                            extras = intent.getExtras();
                            if (extras == null) {
                                extras = new Bundle();
                            }
                            extras.remove("android.support.content.wakelockid");
                            if (C2091b.m5700a(extras)) {
                                if (C2091b.m5696a((Context) this).m5709c(extras)) {
                                    if (m12388b(extras)) {
                                        C2094e.m5725a(this, "_nf", intent);
                                    }
                                }
                            }
                            mo3176a(new RemoteMessage(extras));
                            break;
                        case 1:
                            break;
                        case 2:
                            intent.getStringExtra("google.message_id");
                            break;
                        case 3:
                            if (intent.getStringExtra("google.message_id") == null) {
                                intent.getStringExtra("message_id");
                            }
                            c2090a = new C2090a(intent.getStringExtra("error"));
                            break;
                        default:
                            str3 = "FirebaseMessaging";
                            str4 = "Received message with unknown type: ";
                            str = String.valueOf(str);
                            if (str.length() == 0) {
                            }
                            Log.w(str3, str.length() == 0 ? str4.concat(str) : new String(str4));
                            break;
                    }
                }
                if (TextUtils.isEmpty(stringExtra)) {
                    bundle = new Bundle();
                    bundle.putString("google.message_id", stringExtra);
                    a = C2080p.m5678a((Context) this);
                    a.m5680a(new C5634w(a.m5679a(), bundle));
                }
                return;
            case 1:
                if (m12388b(intent.getExtras())) {
                    C2094e.m5725a(this, "_nd", intent);
                    return;
                }
                break;
            default:
                action = "FirebaseMessaging";
                str = "Unknown intent action: ";
                str3 = String.valueOf(intent.getAction());
                if (str3.length() != 0) {
                }
                Log.d(action, str3.length() != 0 ? str.concat(str3) : new String(str));
                break;
        }
    }

    public final boolean mo1781c(android.content.Intent r6) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r5 = this;
        r0 = "com.google.firebase.messaging.NOTIFICATION_OPEN";
        r1 = r6.getAction();
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x009c;
    L_0x000c:
        r0 = "pending_intent";
        r0 = r6.getParcelableExtra(r0);
        r0 = (android.app.PendingIntent) r0;
        if (r0 == 0) goto L_0x0021;
    L_0x0016:
        r0.send();	 Catch:{ CanceledException -> 0x001a }
        goto L_0x0021;
    L_0x001a:
        r0 = "FirebaseMessaging";
        r1 = "Notification pending intent canceled";
        android.util.Log.e(r0, r1);
    L_0x0021:
        r0 = r6.getExtras();
        r0 = m12388b(r0);
        if (r0 == 0) goto L_0x009a;
    L_0x002b:
        if (r6 == 0) goto L_0x0095;
    L_0x002d:
        r0 = "google.c.a.tc";
        r0 = r6.getStringExtra(r0);
        r1 = "1";
        r0 = r1.equals(r0);
        r1 = 3;
        if (r0 == 0) goto L_0x0086;
    L_0x003c:
        r0 = com.google.firebase.messaging.C2094e.m5724a(r5);
        r2 = "FirebaseMessaging";
        r1 = android.util.Log.isLoggable(r2, r1);
        if (r1 == 0) goto L_0x004f;
    L_0x0048:
        r1 = "FirebaseMessaging";
        r2 = "Received event with track-conversion=true. Setting user property and reengagement event";
        android.util.Log.d(r1, r2);
    L_0x004f:
        if (r0 == 0) goto L_0x007e;
    L_0x0051:
        r1 = "google.c.a.c_id";
        r1 = r6.getStringExtra(r1);
        r2 = "fcm";
        r3 = "_ln";
        r0.setUserPropertyInternal(r2, r3, r1);
        r2 = new android.os.Bundle;
        r2.<init>();
        r3 = "source";
        r4 = "Firebase";
        r2.putString(r3, r4);
        r3 = "medium";
        r4 = "notification";
        r2.putString(r3, r4);
        r3 = "campaign";
        r2.putString(r3, r1);
        r1 = "fcm";
        r3 = "_cmp";
        r0.logEventInternal(r1, r3, r2);
        goto L_0x0095;
    L_0x007e:
        r0 = "FirebaseMessaging";
        r1 = "Unable to set user property for conversion tracking:  analytics library is missing";
        android.util.Log.w(r0, r1);
        goto L_0x0095;
    L_0x0086:
        r0 = "FirebaseMessaging";
        r0 = android.util.Log.isLoggable(r0, r1);
        if (r0 == 0) goto L_0x0095;
    L_0x008e:
        r0 = "FirebaseMessaging";
        r1 = "Received event with track-conversion=false. Do not set user property";
        android.util.Log.d(r0, r1);
    L_0x0095:
        r0 = "_no";
        com.google.firebase.messaging.C2094e.m5725a(r5, r0, r6);
    L_0x009a:
        r6 = 1;
        return r6;
    L_0x009c:
        r6 = 0;
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.FirebaseMessagingService.c(android.content.Intent):boolean");
    }
}
