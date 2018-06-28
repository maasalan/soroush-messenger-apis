package com.google.firebase.iid;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.iid.MessengerCompat;
import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;

final class ab extends Handler {
    private /* synthetic */ aa f6954a;

    ab(aa aaVar, Looper looper) {
        this.f6954a = aaVar;
        super(looper);
    }

    public final void handleMessage(Message message) {
        aa aaVar = this.f6954a;
        if (message != null) {
            if (message.obj instanceof Intent) {
                Intent intent = (Intent) message.obj;
                intent.setExtrasClassLoader(MessengerCompat.class.getClassLoader());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof MessengerCompat) {
                        aaVar.f6952f = (MessengerCompat) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        aaVar.f6951e = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                if (intent2 == null) {
                    if (Log.isLoggable("FirebaseInstanceId", 3)) {
                        Log.d("FirebaseInstanceId", "Unexpected response: null");
                    }
                    return;
                }
                String valueOf;
                String str;
                String str2;
                if ("com.google.android.c2dm.intent.REGISTRATION".equals(intent2.getAction())) {
                    String stringExtra = intent2.getStringExtra("registration_id");
                    if (stringExtra == null) {
                        stringExtra = intent2.getStringExtra("unregistered");
                    }
                    String str3 = null;
                    if (stringExtra == null) {
                        stringExtra = intent2.getStringExtra("error");
                        StringBuilder stringBuilder;
                        if (stringExtra == null) {
                            valueOf = String.valueOf(intent2.getExtras());
                            stringBuilder = new StringBuilder(49 + String.valueOf(valueOf).length());
                            stringBuilder.append("Unexpected response, no error or registration id ");
                            stringBuilder.append(valueOf);
                            Log.w("FirebaseInstanceId", stringBuilder.toString());
                            return;
                        }
                        String str4;
                        String valueOf2;
                        if (Log.isLoggable("FirebaseInstanceId", 3)) {
                            String str5 = "FirebaseInstanceId";
                            str4 = "Received InstanceID error ";
                            valueOf2 = String.valueOf(stringExtra);
                            Log.d(str5, valueOf2.length() != 0 ? str4.concat(valueOf2) : new String(str4));
                        }
                        if (stringExtra.startsWith("|")) {
                            String[] split = stringExtra.split("\\|");
                            if (!"ID".equals(split[1])) {
                                str4 = "FirebaseInstanceId";
                                valueOf2 = "Unexpected structured response ";
                                stringExtra = String.valueOf(stringExtra);
                                Log.w(str4, stringExtra.length() != 0 ? valueOf2.concat(stringExtra) : new String(valueOf2));
                            }
                            if (split.length > 2) {
                                stringExtra = split[2];
                                str = split[3];
                                if (str.startsWith(":")) {
                                    str = str.substring(1);
                                }
                                str3 = stringExtra;
                            } else {
                                str = "UNKNOWN";
                            }
                            stringExtra = str;
                            intent2.putExtra("error", stringExtra);
                        }
                        aaVar.m5632a(str3, stringExtra);
                        long longExtra = intent2.getLongExtra("Retry-After", 0);
                        if (longExtra > 0) {
                            aa.f6944a = ((int) longExtra) * IjkMediaCodecInfo.RANK_MAX;
                            aa.f6945b = SystemClock.elapsedRealtime() + ((long) aa.f6944a);
                            int i = aa.f6944a;
                            stringBuilder = new StringBuilder(52);
                            stringBuilder.append("Explicit request from server to backoff: ");
                            stringBuilder.append(i);
                            Log.w("FirebaseInstanceId", stringBuilder.toString());
                        }
                        return;
                    }
                    Object obj;
                    Bundle extras;
                    ad adVar;
                    aa.f6945b = 0;
                    aa.f6944a = 0;
                    if (stringExtra.startsWith("|")) {
                        String[] split2 = stringExtra.split("\\|");
                        if (!"ID".equals(split2[1])) {
                            String str6 = "FirebaseInstanceId";
                            String str7 = "Unexpected structured response ";
                            stringExtra = String.valueOf(stringExtra);
                            Log.w(str6, stringExtra.length() != 0 ? str7.concat(stringExtra) : new String(str7));
                        }
                        obj = split2[2];
                        if (split2.length > 4) {
                            if ("SYNC".equals(split2[3])) {
                                C2078n.m5667a(aaVar.f6950d).m5675e();
                            } else if ("RST".equals(split2[3])) {
                                C2078n.m5667a(aaVar.f6950d).m5673c();
                                intent2.removeExtra("registration_id");
                                extras = intent2.getExtras();
                                synchronized (aaVar.f6949c) {
                                    adVar = (ad) aaVar.f6949c.remove(obj);
                                    if (adVar != null) {
                                        valueOf = "FirebaseInstanceId";
                                        str2 = "Missing callback for ";
                                        stringExtra = String.valueOf(obj);
                                        Log.w(valueOf, stringExtra.length() == 0 ? str2.concat(stringExtra) : new String(str2));
                                        return;
                                    }
                                    adVar.mo1777a(extras);
                                    return;
                                }
                            }
                        }
                        str3 = split2[split2.length - 1];
                        if (str3.startsWith(":")) {
                            str3 = str3.substring(1);
                        }
                        intent2.putExtra("registration_id", str3);
                    } else {
                        obj = null;
                    }
                    if (obj == null) {
                        if (Log.isLoggable("FirebaseInstanceId", 3)) {
                            Log.d("FirebaseInstanceId", "Ignoring response without a request ID");
                        }
                        return;
                    }
                    extras = intent2.getExtras();
                    synchronized (aaVar.f6949c) {
                        adVar = (ad) aaVar.f6949c.remove(obj);
                        if (adVar != null) {
                            adVar.mo1777a(extras);
                            return;
                        }
                        valueOf = "FirebaseInstanceId";
                        str2 = "Missing callback for ";
                        stringExtra = String.valueOf(obj);
                        if (stringExtra.length() == 0) {
                        }
                        Log.w(valueOf, stringExtra.length() == 0 ? str2.concat(stringExtra) : new String(str2));
                        return;
                    }
                }
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    str2 = "FirebaseInstanceId";
                    str = "Unexpected response ";
                    valueOf = String.valueOf(intent2.getAction());
                    Log.d(str2, valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                }
                return;
            }
            Log.w("FirebaseInstanceId", "Dropping invalid message");
        }
    }
}
