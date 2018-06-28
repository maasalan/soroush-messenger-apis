package mobi.mmdt.ott.p246d.p247a;

import org.json.JSONObject;

public final class C2532d {
    public String f8244a;
    public Long f8245b;
    public String f8246c;

    public C2532d(String str) {
        this(new JSONObject(str));
    }

    public C2532d(String str, Long l, String str2) {
        this.f8244a = str;
        this.f8245b = l;
        this.f8246c = str2;
    }

    private C2532d(JSONObject jSONObject) {
        if (jSONObject.has("DraftMessage")) {
            this.f8244a = jSONObject.getString("DraftMessage");
        }
        if (jSONObject.has("DraftUpdateTime")) {
            this.f8245b = Long.valueOf(jSONObject.getLong("DraftUpdateTime"));
        }
        if (jSONObject.has("DraftReplyMessageId")) {
            this.f8246c = jSONObject.getString("DraftReplyMessageId");
        }
    }

    public final String m6880a() {
        JSONObject jSONObject = new JSONObject();
        if (this.f8244a != null) {
            jSONObject.put("DraftMessage", this.f8244a);
        }
        if (this.f8246c != null) {
            jSONObject.put("DraftReplyMessageId", this.f8246c);
        }
        if (this.f8245b != null) {
            jSONObject.put("DraftUpdateTime", this.f8245b);
        }
        return jSONObject.toString();
    }
}
