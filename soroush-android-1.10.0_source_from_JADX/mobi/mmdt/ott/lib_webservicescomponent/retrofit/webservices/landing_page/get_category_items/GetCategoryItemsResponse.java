package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.landing_page.get_category_items;

import com.google.p164b.p165a.C1902a;
import com.google.p164b.p165a.C1904c;
import java.util.List;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.landing_page.base.LandingPageItem;

public class GetCategoryItemsResponse extends BaseResponse {
    @C1902a
    @C1904c(a = "CategoryId")
    private Integer categoryID;
    @C1902a
    @C1904c(a = "Image")
    private String image;
    @C1902a
    @C1904c(a = "Items")
    private List<LandingPageItem> items;
    @C1902a
    @C1904c(a = "Title")
    private String title;

    public GetCategoryItemsResponse(int i, String str) {
        super(i, str);
    }

    public Integer getCategoryID() {
        return this.categoryID;
    }

    public String getImage() {
        return this.image;
    }

    public List<LandingPageItem> getItems() {
        return this.items;
    }

    public String getTitle() {
        return this.title;
    }

    public void setCategoryID(Integer num) {
        this.categoryID = num;
    }

    public void setImage(String str) {
        this.image = str;
    }

    public void setItems(List<LandingPageItem> list) {
        this.items = list;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("GetCategoryItemsResponse{title='");
        stringBuilder.append(this.title);
        stringBuilder.append('\'');
        stringBuilder.append(", categoryID='");
        stringBuilder.append(this.categoryID);
        stringBuilder.append('\'');
        stringBuilder.append(", image='");
        stringBuilder.append(this.image);
        stringBuilder.append('\'');
        stringBuilder.append(", items=");
        stringBuilder.append(this.items);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
