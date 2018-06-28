package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.ac;
import com.google.android.gms.common.util.C1785d;
import com.google.android.gms.common.util.C5476f;
import com.google.android.gms.internal.dm;
import com.google.android.gms.internal.zzbej;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.jivesoftware.smackx.message_correct.element.MessageCorrectExtension;
import org.json.JSONArray;
import org.json.JSONObject;

public class GoogleSignInAccount extends zzbej implements ReflectedParcelable {
    public static final Creator<GoogleSignInAccount> CREATOR = new C1683a();
    private static C1785d f17951b = C5476f.m11826d();
    public String f17952a;
    private int f17953c;
    private String f17954d;
    private String f17955e;
    private String f17956f;
    private Uri f17957g;
    private String f17958h;
    private long f17959i;
    private String f17960j;
    private List<Scope> f17961k;
    private String f17962l;
    private String f17963m;

    GoogleSignInAccount(int i, String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, List<Scope> list, String str7, String str8) {
        this.f17953c = i;
        this.f17954d = str;
        this.f17955e = str2;
        this.f17952a = str3;
        this.f17956f = str4;
        this.f17957g = uri;
        this.f17958h = str5;
        this.f17959i = j;
        this.f17960j = str6;
        this.f17961k = list;
        this.f17962l = str7;
        this.f17963m = str8;
    }

    public static GoogleSignInAccount m15864a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        Object optString = jSONObject.optString("photoUrl", null);
        Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        Object hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        String optString2 = jSONObject.optString(MessageCorrectExtension.ID_TAG);
        String optString3 = jSONObject.optString("tokenId", null);
        String optString4 = jSONObject.optString("email", null);
        String optString5 = jSONObject.optString("displayName", null);
        String optString6 = jSONObject.optString("givenName", null);
        String optString7 = jSONObject.optString("familyName", null);
        Long valueOf = Long.valueOf(parseLong);
        String string = jSONObject.getString("obfuscatedIdentifier");
        if (valueOf == null) {
            valueOf = Long.valueOf(f17951b.mo1575a() / 1000);
        }
        GoogleSignInAccount googleSignInAccount = r3;
        GoogleSignInAccount googleSignInAccount2 = new GoogleSignInAccount(3, optString2, optString3, optString4, optString5, parse, null, valueOf.longValue(), ac.m4378a(string), new ArrayList((Collection) ac.m4376a(hashSet)), optString6, optString7);
        googleSignInAccount.f17958h = jSONObject.optString("serverAuthCode", null);
        return googleSignInAccount;
    }

    public final Set<Scope> m15865a() {
        return new HashSet(this.f17961k);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.f17960j.equals(this.f17960j) && googleSignInAccount.m15865a().equals(m15865a());
    }

    public int hashCode() {
        return ((527 + this.f17960j.hashCode()) * 31) + this.f17961k.hashCode();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = dm.m4723a(parcel, 20293);
        dm.m4743b(parcel, 1, this.f17953c);
        dm.m4733a(parcel, 2, this.f17954d);
        dm.m4733a(parcel, 3, this.f17955e);
        dm.m4733a(parcel, 4, this.f17952a);
        dm.m4733a(parcel, 5, this.f17956f);
        dm.m4731a(parcel, 6, this.f17957g, i);
        dm.m4733a(parcel, 7, this.f17958h);
        dm.m4728a(parcel, 8, this.f17959i);
        dm.m4733a(parcel, 9, this.f17960j);
        dm.m4745c(parcel, 10, this.f17961k);
        dm.m4733a(parcel, 11, this.f17962l);
        dm.m4733a(parcel, 12, this.f17963m);
        dm.m4742b(parcel, a);
    }
}
