package com.google.firebase.iid;

import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.TimeUnit;
import org.jivesoftware.smackx.iot.data.element.TimestampElement;
import org.json.JSONException;
import org.json.JSONObject;

final class C2068d {
    private static final long f6962b = TimeUnit.DAYS.toMillis(7);
    final String f6963a;
    private String f6964c;
    private long f6965d;

    private C2068d(String str, String str2, long j) {
        this.f6963a = str;
        this.f6964c = str2;
        this.f6965d = j;
    }

    static C2068d m5650a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("{")) {
            return new C2068d(str, null, 0);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new C2068d(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong(TimestampElement.ELEMENT));
        } catch (JSONException e) {
            str = String.valueOf(e);
            StringBuilder stringBuilder = new StringBuilder(23 + String.valueOf(str).length());
            stringBuilder.append("Failed to parse token: ");
            stringBuilder.append(str);
            Log.w("InstanceID/Store", stringBuilder.toString());
            return null;
        }
    }

    static String m5651a(String str, String str2, long j) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", str);
            jSONObject.put("appVersion", str2);
            jSONObject.put(TimestampElement.ELEMENT, j);
            return jSONObject.toString();
        } catch (JSONException e) {
            str = String.valueOf(e);
            StringBuilder stringBuilder = new StringBuilder(24 + String.valueOf(str).length());
            stringBuilder.append("Failed to encode token: ");
            stringBuilder.append(str);
            Log.w("InstanceID/Store", stringBuilder.toString());
            return null;
        }
    }

    final boolean m5652b(String str) {
        if (System.currentTimeMillis() <= this.f6965d + f6962b) {
            if (str.equals(this.f6964c)) {
                return false;
            }
        }
        return true;
    }
}
