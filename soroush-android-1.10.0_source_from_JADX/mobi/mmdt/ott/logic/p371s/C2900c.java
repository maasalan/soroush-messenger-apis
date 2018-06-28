package mobi.mmdt.ott.logic.p371s;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build.VERSION;
import android.util.Base64;
import java.util.HashMap;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.lib_webservicescomponent.p257d.C2555a;
import mobi.mmdt.ott.lib_webservicescomponent.p257d.C2557c;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.C2560a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.activation.ActivationResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.activation.C5805a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.C2568a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.lookup.C5862a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.lookup.LookupLinkResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.lookup.base.BaseLookup;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.lookup.base.LookUpBotDataResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.lookup.base.LookUpChannelDataResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.lookup.base.LookUpChannelJoinLinkResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.lookup.base.LookUpGroupJoinLinkResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.lookup.base.LookUpStickerPackageDataResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.lookup.base.LookUpUserDataResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.report.C5871a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.report.SendReportResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.report.base.ReportData;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.report.base.ReportType;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import org.json.JSONException;
import org.json.JSONObject;

public final class C2900c {
    public static ActivationResponse m7277a(String str, String str2, String str3) {
        JSONObject jSONObject;
        JSONException e;
        C5805a c5805a;
        ActivationResponse a;
        String string;
        StringBuilder stringBuilder;
        byte[] decode;
        C2560a.m7006a(MyApplication.m12952b());
        String c = C2560a.m7009c();
        C2560a.m7006a(MyApplication.m12952b());
        String b = C2560a.m7008b();
        try {
            jSONObject = new JSONObject(str3);
            try {
                C5805a c5805a2 = new C5805a(b, c, str, str2, jSONObject);
            } catch (JSONException e2) {
                e = e2;
                e.printStackTrace();
                c5805a = null;
                a = c5805a.m13010a(MyApplication.m12952b());
                if (a != null) {
                    try {
                        str2 = a.getUserName();
                        str3 = jSONObject.getString("ClientTimestamp");
                        string = jSONObject.getString("ClientNonce");
                        b = a.geteToken();
                        c = a.getIv();
                        stringBuilder = new StringBuilder();
                        stringBuilder.append(str2);
                        stringBuilder.append(str3);
                        stringBuilder.append(string);
                        str2 = C2557c.m7002a(stringBuilder.toString());
                        decode = Base64.decode(c, 0);
                        C2555a.m6994a(str2);
                        C2555a.m6996b(b, decode);
                        str2 = C2555a.f8312a;
                    } catch (JSONException e3) {
                        e3.printStackTrace();
                        str2 = null;
                    }
                    C2560a.m7006a(MyApplication.m12952b());
                    C2560a.f8368a.edit().putString("Token", str2).apply();
                }
                return a;
            }
        } catch (JSONException e4) {
            e = e4;
            jSONObject = null;
            e.printStackTrace();
            c5805a = null;
            a = c5805a.m13010a(MyApplication.m12952b());
            if (a != null) {
                str2 = a.getUserName();
                str3 = jSONObject.getString("ClientTimestamp");
                string = jSONObject.getString("ClientNonce");
                b = a.geteToken();
                c = a.getIv();
                stringBuilder = new StringBuilder();
                stringBuilder.append(str2);
                stringBuilder.append(str3);
                stringBuilder.append(string);
                str2 = C2557c.m7002a(stringBuilder.toString());
                decode = Base64.decode(c, 0);
                C2555a.m6994a(str2);
                C2555a.m6996b(b, decode);
                str2 = C2555a.f8312a;
                C2560a.m7006a(MyApplication.m12952b());
                C2560a.f8368a.edit().putString("Token", str2).apply();
            }
            return a;
        }
        a = c5805a.m13010a(MyApplication.m12952b());
        if (a != null) {
            str2 = a.getUserName();
            str3 = jSONObject.getString("ClientTimestamp");
            string = jSONObject.getString("ClientNonce");
            b = a.geteToken();
            c = a.getIv();
            stringBuilder = new StringBuilder();
            stringBuilder.append(str2);
            stringBuilder.append(str3);
            stringBuilder.append(string);
            str2 = C2557c.m7002a(stringBuilder.toString());
            decode = Base64.decode(c, 0);
            C2555a.m6994a(str2);
            C2555a.m6996b(b, decode);
            str2 = C2555a.f8312a;
            C2560a.m7006a(MyApplication.m12952b());
            C2560a.f8368a.edit().putString("Token", str2).apply();
        }
        return a;
    }

    public static LookupLinkResponse m7278a(String str) {
        BaseLookup baseLookup;
        LookupLinkResponse a = new C5862a(C2535a.m6888a().m6928d(), str).m13067a(MyApplication.m12952b());
        String type = a.getType();
        HashMap metaData = a.getMetaData();
        BaseLookup lookUpGroupJoinLinkResponse;
        if (type.equalsIgnoreCase(C2568a.GROUP_JOIN_LINK.toString())) {
            lookUpGroupJoinLinkResponse = new LookUpGroupJoinLinkResponse((String) metaData.get("JID"), (String) metaData.get("Name"), (String) metaData.get("Description"), (String) metaData.get("AvatarURL"), (String) metaData.get("AvatarThumbnailURL"), Integer.parseInt((String) metaData.get("MembersCount")), (String) metaData.get("JoinToken"), Long.parseLong((String) metaData.get("CreationDate")));
        } else if (type.equalsIgnoreCase(C2568a.CHANNEL_DATA.toString())) {
            lookUpGroupJoinLinkResponse = new LookUpChannelDataResponse((String) metaData.get("ID"), (String) metaData.get("Name"), (String) metaData.get("Link"), (String) metaData.get("Description"), (String) metaData.get("AvatarURL"), (String) metaData.get("AvatarThumbnailURL"), Integer.parseInt((String) metaData.get("MembersCount")), Long.parseLong((String) metaData.get("CreationDate")), ((String) metaData.get("ReplyAllowed")).equals("1"), (String) metaData.get("OwnerUsername"), (String) metaData.get("CategoryId"), metaData.get("Flags").toString());
        } else if (type.equalsIgnoreCase(C2568a.CHANNEL_JOIN_LINK.toString())) {
            lookUpGroupJoinLinkResponse = new LookUpChannelJoinLinkResponse((String) metaData.get("ID"), (String) metaData.get("Name"), (String) metaData.get("Link"), (String) metaData.get("Description"), (String) metaData.get("AvatarURL"), (String) metaData.get("AvatarThumbnailURL"), Integer.parseInt((String) metaData.get("MembersCount")), Long.parseLong((String) metaData.get("CreationDate")), ((String) metaData.get("ReplyAllowed")).equals("1"), (String) metaData.get("OwnerUsername"), (String) metaData.get("CategoryId"), metaData.get("Flags").toString(), (String) metaData.get("JoinToken"));
        } else if (type.equalsIgnoreCase(C2568a.USER_DATA.toString())) {
            lookUpGroupJoinLinkResponse = new LookUpUserDataResponse((String) metaData.get("UserID"), (String) metaData.get("Username"), (String) metaData.get("Nickname"), (String) metaData.get("AvatarURL"), (String) metaData.get("AvatarThumbnailURL"), ((String) metaData.get("OfficialUser")).equals("1"), (String) metaData.get("Motto"));
        } else if (type.equalsIgnoreCase(C2568a.STICKER_PACKAGE_DATA.toString())) {
            lookUpGroupJoinLinkResponse = new LookUpStickerPackageDataResponse((String) metaData.get("ID"), (String) metaData.get("Title"), (String) metaData.get("Description"), ((String) metaData.get("OfficialPackage")).equals("1"), (String) metaData.get("Author"), (String) metaData.get("Price"), (String) metaData.get("Thumbnail"), (String) metaData.get("StickersThumbnail"), (String) metaData.get("Version"), (String) metaData.get("Downloads"), (String) metaData.get("DateAdded"));
        } else if (type.equalsIgnoreCase(C2568a.BOT_DATA.toString())) {
            lookUpGroupJoinLinkResponse = new LookUpBotDataResponse((String) metaData.get("ID"), (String) metaData.get("Name"), (String) metaData.get("Description"), (String) metaData.get("AvatarURL"), (String) metaData.get("AvatarThumbnailURL"), (String) metaData.get("Link"), (String) metaData.get("StartText"));
        } else {
            baseLookup = null;
            a.setLookupObject(baseLookup);
            return a;
        }
        baseLookup.setError(false);
        a.setLookupObject(baseLookup);
        return a;
    }

    public static SendReportResponse m7279a(String str, ReportType reportType, String str2, boolean z) {
        ReportData reportData = new ReportData();
        reportData.setDebugMode(z);
        String d = C2535a.m6888a().m6928d();
        String str3 = VERSION.RELEASE;
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) MyApplication.m12952b().getSystemService("connectivity")).getActiveNetworkInfo();
        return new C5871a(d, str3, activeNetworkInfo != null ? activeNetworkInfo.getTypeName() : null, str, reportType, str2, reportData).m13076a(MyApplication.m12952b());
    }
}
