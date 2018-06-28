package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.landing_page.base;

import com.google.p164b.p165a.C1902a;
import com.google.p164b.p165a.C1904c;

public class LandingPageItem {
    @C1902a
    @C1904c(a = "a")
    private String action;
    @C1902a
    @C1904c(a = "ad")
    private String actionData;
    @C1902a
    @C1904c(a = "bad")
    private String buttonActionData;
    @C1902a
    @C1904c(a = "ba")
    private String buttonActionType;
    @C1902a
    @C1904c(a = "bt")
    private String buttonText;
    @C1902a
    @C1904c(a = "o")
    private Integer displayOrder;
    @C1902a
    @C1904c(a = "id")
    private long id;
    @C1902a
    @C1904c(a = "im")
    private String image;
    @C1902a
    @C1904c(a = "st")
    private String subTitle;
    @C1902a
    @C1904c(a = "ti")
    private String title;

    public String getAction() {
        return this.action;
    }

    public String getActionData() {
        return this.actionData;
    }

    public String getButtonActionData() {
        return this.buttonActionData;
    }

    public String getButtonActionType() {
        return this.buttonActionType;
    }

    public String getButtonText() {
        return this.buttonText;
    }

    public Integer getDisplayOrder() {
        return this.displayOrder;
    }

    public long getId() {
        return this.id;
    }

    public String getImage() {
        return this.image;
    }

    public String getSubTitle() {
        return this.subTitle;
    }

    public String getTitle() {
        return this.title;
    }

    public void setAction(String str) {
        this.action = str;
    }

    public void setActionData(String str) {
        this.actionData = str;
    }

    public void setButtonActionData(String str) {
        this.buttonActionData = str;
    }

    public void setButtonActionType(String str) {
        this.buttonActionType = str;
    }

    public void setButtonText(String str) {
        this.buttonText = str;
    }

    public void setDisplayOrder(Integer num) {
        this.displayOrder = num;
    }

    public void setImage(String str) {
        this.image = str;
    }

    public void setSubTitle(String str) {
        this.subTitle = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("LandingPageItem{title='");
        stringBuilder.append(this.title);
        stringBuilder.append('\'');
        stringBuilder.append(", image='");
        stringBuilder.append(this.image);
        stringBuilder.append('\'');
        stringBuilder.append(", displayOrder=");
        stringBuilder.append(this.displayOrder);
        stringBuilder.append(", action=");
        stringBuilder.append(this.action);
        stringBuilder.append(", actionData='");
        stringBuilder.append(this.actionData);
        stringBuilder.append('\'');
        stringBuilder.append(", subTitle='");
        stringBuilder.append(this.subTitle);
        stringBuilder.append('\'');
        stringBuilder.append(", buttonText='");
        stringBuilder.append(this.buttonText);
        stringBuilder.append('\'');
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
