package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.base;

import com.google.p164b.p165a.C1902a;
import com.google.p164b.p165a.C1904c;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ChannelLocation {
    @C1902a
    @C1904c(a = "ID")
    private int id;
    @C1902a
    @C1904c(a = "Label")
    private String label;
    @C1902a
    @C1904c(a = "Lat")
    private double latitude;
    @C1902a
    @C1904c(a = "Lon")
    private double longitude;
    @C1902a
    @C1904c(a = "Category")
    private int parentCategory;

    public ChannelLocation() {
        this.parentCategory = -1;
    }

    public ChannelLocation(int i, double d, double d2, String str, int i2) {
        this.parentCategory = -1;
        setId(i);
        setLatitude(d);
        setLongitude(d2);
        setLabel(str);
        setParentCategory(i2);
    }

    public ChannelLocation(String str) {
        this(new JSONObject(str));
    }

    public ChannelLocation(JSONObject jSONObject) {
        this.parentCategory = -1;
        if (jSONObject.has("ID")) {
            setId(jSONObject.getInt("ID"));
        }
        if (jSONObject.has("Lat")) {
            setLatitude(jSONObject.getDouble("Lat"));
        }
        if (jSONObject.has("Lon")) {
            setLongitude(jSONObject.getDouble("Lon"));
        }
        if (jSONObject.has("Label")) {
            setLabel(jSONObject.getString("Label"));
        }
        if (jSONObject.has("Category")) {
            setParentCategory(jSONObject.getInt("Category"));
        }
    }

    public static ChannelLocation[] toChanneLocationsArray(JSONArray jSONArray) {
        int i = 0;
        ChannelLocation[] channelLocationArr = new ChannelLocation[0];
        if (jSONArray != null) {
            channelLocationArr = new ChannelLocation[jSONArray.length()];
            while (i < jSONArray.length()) {
                channelLocationArr[i] = new ChannelLocation(jSONArray.getJSONObject(i));
                i++;
            }
        }
        return channelLocationArr;
    }

    public static JSONArray toJSONArray(ChannelLocation[] channelLocationArr) {
        JSONArray jSONArray = new JSONArray();
        if (channelLocationArr != null) {
            try {
                if (channelLocationArr.length > 0) {
                    for (ChannelLocation jsonObject : channelLocationArr) {
                        jSONArray.put(jsonObject.jsonObject());
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return jSONArray;
    }

    public static String toJSONArrayString(ChannelLocation[] channelLocationArr) {
        return toJSONArray(channelLocationArr).toString();
    }

    public int getId() {
        return this.id;
    }

    public String getLabel() {
        return this.label;
    }

    public double getLatitude() {
        return this.latitude;
    }

    public double getLongitude() {
        return this.longitude;
    }

    public int getParentCategory() {
        return this.parentCategory;
    }

    public JSONObject jsonObject() {
        JSONObject jSONObject = new JSONObject();
        if (getLabel() != null) {
            jSONObject.put("Label", getLabel());
        }
        jSONObject.put("ID", getId());
        jSONObject.put("Lat", getLatitude());
        jSONObject.put("Lon", getLongitude());
        if (this.parentCategory != -1) {
            jSONObject.put("Category", getParentCategory());
        }
        return jSONObject;
    }

    public void setId(int i) {
        this.id = i;
    }

    public void setLabel(String str) {
        this.label = str;
    }

    public void setLatitude(double d) {
        this.latitude = d;
    }

    public void setLongitude(double d) {
        this.longitude = d;
    }

    public void setParentCategory(int i) {
        this.parentCategory = i;
    }

    public String toJSONString() {
        return jsonObject().toString();
    }
}
