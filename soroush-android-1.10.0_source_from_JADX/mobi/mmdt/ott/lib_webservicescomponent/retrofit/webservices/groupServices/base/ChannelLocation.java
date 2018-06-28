package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.base;

import com.google.p164b.p165a.C1904c;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.p259b.C2564b;

public class ChannelLocation {
    @C1904c(a = "ID")
    private int id;
    @C1904c(a = "Label")
    private String label;
    @C1904c(a = "Lat")
    private double latitude;
    @C1904c(a = "Lon")
    private double longitude;
    @C1904c(a = "Category")
    private int parentCategory = -1;

    public ChannelLocation(int i, double d, double d2, String str, int i2) {
        this.id = i;
        this.latitude = d;
        this.longitude = d2;
        this.label = str;
        this.parentCategory = i2;
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
        return C2564b.m7016a(this);
    }
}
