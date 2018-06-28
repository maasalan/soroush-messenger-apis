package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.base;

import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.C2570c;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.C2571d;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.C2573f;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.poll.base.PollOption;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.poll.base.PollType;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class PollUtils {
    public static C2571d PollDataParser(JSONObject jSONObject) {
        boolean equalsIgnoreCase = jSONObject.getString("Enable").equalsIgnoreCase("1");
        String string = jSONObject.getString("Type");
        PollType pollType = string.equalsIgnoreCase(PollType.radio.toString()) ? PollType.radio : string.equalsIgnoreCase(PollType.checkbox.toString()) ? PollType.checkbox : string.equalsIgnoreCase(PollType.commentbox.toString()) ? PollType.commentbox : null;
        PollType pollType2 = pollType;
        String string2 = jSONObject.getString("PollID");
        boolean equalsIgnoreCase2 = jSONObject.getString("HaveCommentBox").equalsIgnoreCase("1");
        JSONArray jSONArray = jSONObject.getJSONArray("Options");
        C2570c[] c2570cArr = new C2570c[jSONArray.length()];
        for (int i = 0; i < c2570cArr.length; i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            c2570cArr[i] = new C2570c(jSONObject2.getString("OptionID"), jSONObject2.getString("Text"), jSONObject2.getString("DisplayCommentBox").equalsIgnoreCase("true"));
        }
        return new C2571d(string2, jSONObject.getString("Question"), equalsIgnoreCase, pollType2, equalsIgnoreCase2, jSONObject.getInt("CommentBoxCharsLimit"), jSONObject.has("HavePayment") ? jSONObject.getBoolean("HavePayment") : false, c2570cArr);
    }

    public static JSONObject PollToJson(String str, String str2, boolean z, PollType pollType, boolean z2, boolean z3, int i, PollOption[] pollOptionArr) {
        JSONObject jSONObject;
        JSONException e;
        try {
            JSONArray jSONArray = new JSONArray();
            jSONObject = new JSONObject();
            try {
                for (PollOption pollOption : pollOptionArr) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("OptionID", pollOption.getmOptionID());
                    jSONObject2.put("Text", pollOption.getmText());
                    jSONObject2.put("DisplayCommentBox", pollOption.getmDisplayCommentBox());
                    jSONArray.put(jSONObject2);
                }
                jSONObject.put("PollID", str);
                jSONObject.put("Question", str2);
                jSONObject.put("Enable", z);
                jSONObject.put("Type", pollType.toString());
                jSONObject.put("HaveCommentBox", z2);
                jSONObject.put("CommentBoxCharsLimit", i);
                jSONObject.put("Options", jSONArray);
                jSONObject.put("HavePayment", z3);
                return jSONObject;
            } catch (JSONException e2) {
                e = e2;
                e.printStackTrace();
                return jSONObject;
            }
        } catch (JSONException e3) {
            e = e3;
            jSONObject = null;
            e.printStackTrace();
            return jSONObject;
        }
    }

    public static C2573f VoteParser(JSONObject jSONObject) {
        return new C2573f(jSONObject.getString("QuestionAnswer").split(","), jSONObject.getString("QuestionComment"));
    }

    public static JSONObject VoteToJson(C2573f c2573f) {
        JSONObject jSONObject = new JSONObject();
        String str = "";
        for (int i = 0; i < c2573f.f8413a.length; i++) {
            StringBuilder stringBuilder;
            if (i == 0) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                str = c2573f.f8413a[i];
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(",");
                str = c2573f.f8413a[i];
            }
            stringBuilder.append(str);
            str = stringBuilder.toString();
        }
        jSONObject.put("QuestionAnswer", str);
        jSONObject.put("QuestionComment", c2573f.f8414b);
        return jSONObject;
    }
}
