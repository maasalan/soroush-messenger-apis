package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.landing_page.base;

import com.google.p164b.p165a.C1902a;
import com.google.p164b.p165a.C1904c;
import java.util.List;

public class LandingPageRow {
    @C1902a
    @C1904c(a = "o")
    private Integer displayOrder;
    @C1902a
    @C1904c(a = "hm")
    private int hasMore;
    @C1902a
    @C1904c(a = "id")
    private Integer id;
    @C1902a
    @C1904c(a = "im")
    private String image;
    @C1902a
    @C1904c(a = "in")
    private Integer interval;
    @C1902a
    @C1904c(a = "Items")
    private List<LandingPageItem> items;
    @C1902a
    @C1904c(a = "nu")
    private Integer number;
    @C1902a
    @C1904c(a = "ti")
    private String title;
    @C1902a
    @C1904c(a = "ty")
    private String type;

    public Integer getDisplayOrder() {
        return this.displayOrder;
    }

    public boolean getHasMore() {
        return this.hasMore == 1;
    }

    public Integer getId() {
        return this.id;
    }

    public String getImage() {
        return this.image;
    }

    public Integer getInterval() {
        return this.interval;
    }

    public List<LandingPageItem> getItems() {
        return this.items;
    }

    public Integer getNumber() {
        return this.number;
    }

    public String getTitle() {
        return this.title;
    }

    public String getType() {
        return this.type;
    }

    public void setDisplayOrder(Integer num) {
        this.displayOrder = num;
    }

    public void setHasMore(Integer num) {
        this.hasMore = num.intValue();
    }

    public void setId(Integer num) {
        this.id = num;
    }

    public void setImage(String str) {
        this.image = str;
    }

    public void setInterval(Integer num) {
        this.interval = num;
    }

    public void setItems(List<LandingPageItem> list) {
        this.items = list;
    }

    public void setNumber(Integer num) {
        this.number = num;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setType(String str) {
        this.type = str;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("LandingPageRow{type=");
        stringBuilder.append(this.type);
        stringBuilder.append(", title='");
        stringBuilder.append(this.title);
        stringBuilder.append('\'');
        stringBuilder.append(", displayOrder=");
        stringBuilder.append(this.displayOrder);
        stringBuilder.append(", interval=");
        stringBuilder.append(this.interval);
        stringBuilder.append(", id=");
        stringBuilder.append(this.id);
        stringBuilder.append(", items=");
        stringBuilder.append(this.items);
        stringBuilder.append(", number=");
        stringBuilder.append(this.number);
        stringBuilder.append(", hasMore=");
        stringBuilder.append(this.hasMore);
        stringBuilder.append(", image='");
        stringBuilder.append(this.image);
        stringBuilder.append('\'');
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
