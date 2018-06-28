package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.get_category_and_channels;

import com.google.p164b.p165a.C1902a;
import com.google.p164b.p165a.C1904c;
import java.util.HashMap;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.base.SuggestedChannelCategory;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.base.SuggestedChannelsCategoryItemType;
import org.json.JSONObject;

public class GetCategoryAndChannelsResponse extends BaseResponse {
    @C1902a
    @C1904c(a = "CategoriesCount")
    private int mCategoriesCount;
    @C1902a
    @C1904c(a = "ChannelsCount")
    private int mChannelsCount;
    @C1904c(a = "Categories")
    private HashMap[] suggestedCategoriesJsonArray;
    @C1902a(a = false, b = false)
    private SuggestedChannelCategory[] suggestedChannelsCategories;
    @C1904c(a = "Channels")
    private HashMap[] suggestedChannelsJsonArray;

    public GetCategoryAndChannelsResponse(int i, String str, int i2, int i3, SuggestedChannelCategory[] suggestedChannelCategoryArr, HashMap[] hashMapArr, HashMap[] hashMapArr2) {
        super(i, str);
        this.mCategoriesCount = i2;
        this.mChannelsCount = i3;
        this.suggestedChannelsCategories = suggestedChannelCategoryArr;
        this.suggestedCategoriesJsonArray = hashMapArr;
        this.suggestedChannelsJsonArray = hashMapArr2;
    }

    public int getmCategoriesCount() {
        return this.mCategoriesCount;
    }

    public int getmChannelsCount() {
        return this.mChannelsCount;
    }

    public SuggestedChannelCategory[] getmSuggestedChannelsCategories() {
        if (this.suggestedChannelsCategories == null) {
            int i;
            this.suggestedChannelsCategories = new SuggestedChannelCategory[(this.suggestedChannelsJsonArray.length + this.suggestedCategoriesJsonArray.length)];
            for (i = 0; i < this.suggestedChannelsJsonArray.length; i++) {
                JSONObject jSONObject = new JSONObject(this.suggestedChannelsJsonArray[i]);
                String string = jSONObject.getString("Flags");
                String str = null;
                if (jSONObject.has("Link")) {
                    str = jSONObject.getString("Link");
                }
                this.suggestedChannelsCategories[i] = SuggestedChannelCategory.newBuilder().party(jSONObject.getString("ChannelID")).title(jSONObject.getString("Name")).avatarUrl(jSONObject.getString("AvatarURL")).avatarThumbnailUrl(jSONObject.getString("AvatarThumbnailURL")).description(jSONObject.getString("Description")).channelMembersCount(Long.valueOf(jSONObject.getLong("MembersCount"))).parentCategoryId(Integer.valueOf(jSONObject.getInt("CategoryId"))).channelLink(str).channelCreationDate(Long.valueOf(jSONObject.getLong("CreationDate"))).itemType(SuggestedChannelsCategoryItemType.CHANNEL).itemIndex(Integer.valueOf(i)).avatarResId(Integer.valueOf(-1)).isDisabled(false).extra(string).build();
            }
            i = this.suggestedChannelsJsonArray.length;
            int i2 = 0;
            int i3 = 1;
            while (i < this.suggestedChannelsCategories.length) {
                JSONObject jSONObject2 = new JSONObject(this.suggestedCategoriesJsonArray[i2]);
                this.suggestedChannelsCategories[i] = SuggestedChannelCategory.newBuilder().party(jSONObject2.getString("CategoryId")).title(jSONObject2.getString("CategoryName")).avatarUrl(jSONObject2.getString("BannerUrl")).avatarThumbnailUrl(jSONObject2.getString("BannerUrl")).description(jSONObject2.getString("Description")).parentCategoryId(Integer.valueOf(jSONObject2.getInt("ParentCategoryId"))).itemType(SuggestedChannelsCategoryItemType.CATEGORY).itemIndex(Integer.valueOf(i3)).avatarResId(Integer.valueOf(-1)).isDisabled(false).build();
                i2++;
                i++;
                i3 += 2;
            }
        }
        return this.suggestedChannelsCategories;
    }
}
