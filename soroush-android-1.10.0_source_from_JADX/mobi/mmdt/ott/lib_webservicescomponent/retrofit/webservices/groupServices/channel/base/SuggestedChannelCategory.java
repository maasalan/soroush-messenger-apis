package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.base;

public class SuggestedChannelCategory {
    private Integer mAvatarResId;
    private String mAvatarThumbnailUrl;
    private String mAvatarUrl;
    private Long mCategoryUpdatedAt;
    private Long mChannelCreationDate;
    private String mChannelLink;
    private Long mChannelMembersCount;
    private String mDescription;
    private String mExtra;
    private long mId;
    private boolean mIsDisabled;
    private Integer mItemIndex;
    private SuggestedChannelsCategoryItemType mItemType;
    private Integer mParentCategoryId;
    private String mParty;
    private String mTitle;

    public static class Builder {
        private SuggestedChannelCategory mRes = new SuggestedChannelCategory();

        public Builder avatarResId(Integer num) {
            this.mRes.mAvatarResId = num;
            return this;
        }

        public Builder avatarThumbnailUrl(String str) {
            this.mRes.mAvatarThumbnailUrl = str;
            return this;
        }

        public Builder avatarUrl(String str) {
            this.mRes.mAvatarUrl = str;
            return this;
        }

        public SuggestedChannelCategory build() {
            if (this.mRes.mParty != null) {
                return this.mRes;
            }
            throw new IllegalArgumentException("party must not be null");
        }

        public Builder categoryUpdatedAt(Long l) {
            this.mRes.mCategoryUpdatedAt = l;
            return this;
        }

        public Builder channelCreationDate(Long l) {
            this.mRes.mChannelCreationDate = l;
            return this;
        }

        public Builder channelLink(String str) {
            this.mRes.mChannelLink = str;
            return this;
        }

        public Builder channelMembersCount(Long l) {
            this.mRes.mChannelMembersCount = l;
            return this;
        }

        public Builder description(String str) {
            this.mRes.mDescription = str;
            return this;
        }

        public Builder extra(String str) {
            this.mRes.mExtra = str;
            return this;
        }

        public Builder id(long j) {
            this.mRes.mId = j;
            return this;
        }

        public Builder isDisabled(boolean z) {
            this.mRes.mIsDisabled = z;
            return this;
        }

        public Builder itemIndex(Integer num) {
            this.mRes.mItemIndex = num;
            return this;
        }

        public Builder itemType(SuggestedChannelsCategoryItemType suggestedChannelsCategoryItemType) {
            this.mRes.mItemType = suggestedChannelsCategoryItemType;
            return this;
        }

        public Builder parentCategoryId(Integer num) {
            this.mRes.mParentCategoryId = num;
            return this;
        }

        public Builder party(String str) {
            if (str == null) {
                throw new IllegalArgumentException("party must not be null");
            }
            this.mRes.mParty = str;
            return this;
        }

        public Builder title(String str) {
            this.mRes.mTitle = str;
            return this;
        }
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static SuggestedChannelCategory newInstance(long j, String str, String str2, Integer num, String str3, String str4, String str5, String str6, Long l, Long l2, SuggestedChannelsCategoryItemType suggestedChannelsCategoryItemType, Long l3, Integer num2, boolean z, Integer num3, String str7) {
        String str8 = str;
        if (str8 == null) {
            throw new IllegalArgumentException("party must not be null");
        }
        SuggestedChannelCategory suggestedChannelCategory = new SuggestedChannelCategory();
        suggestedChannelCategory.mId = j;
        suggestedChannelCategory.mParty = str8;
        suggestedChannelCategory.mTitle = str2;
        suggestedChannelCategory.mParentCategoryId = num;
        suggestedChannelCategory.mDescription = str3;
        suggestedChannelCategory.mChannelLink = str4;
        suggestedChannelCategory.mAvatarUrl = str5;
        suggestedChannelCategory.mAvatarThumbnailUrl = str6;
        suggestedChannelCategory.mChannelCreationDate = l;
        suggestedChannelCategory.mChannelMembersCount = l2;
        suggestedChannelCategory.mItemType = suggestedChannelsCategoryItemType;
        suggestedChannelCategory.mCategoryUpdatedAt = l3;
        suggestedChannelCategory.mItemIndex = num2;
        suggestedChannelCategory.mIsDisabled = z;
        suggestedChannelCategory.mAvatarResId = num3;
        suggestedChannelCategory.mExtra = str7;
        return suggestedChannelCategory;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.mId == ((SuggestedChannelCategory) obj).mId;
    }

    public Integer getAvatarResId() {
        return this.mAvatarResId;
    }

    public String getAvatarThumbnailUrl() {
        return this.mAvatarThumbnailUrl;
    }

    public String getAvatarUrl() {
        return this.mAvatarUrl;
    }

    public Long getCategoryUpdatedAt() {
        return this.mCategoryUpdatedAt;
    }

    public Long getChannelCreationDate() {
        return this.mChannelCreationDate;
    }

    public String getChannelLink() {
        return this.mChannelLink;
    }

    public Long getChannelMembersCount() {
        return this.mChannelMembersCount;
    }

    public String getDescription() {
        return this.mDescription;
    }

    public String getExtra() {
        return this.mExtra;
    }

    public long getId() {
        return this.mId;
    }

    public boolean getIsDisabled() {
        return this.mIsDisabled;
    }

    public Integer getItemIndex() {
        return this.mItemIndex;
    }

    public SuggestedChannelsCategoryItemType getItemType() {
        return this.mItemType;
    }

    public Integer getParentCategoryId() {
        return this.mParentCategoryId;
    }

    public String getParty() {
        return this.mParty;
    }

    public String getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return (int) (this.mId ^ (this.mId >>> 32));
    }

    public void setAvatarResId(Integer num) {
        this.mAvatarResId = num;
    }

    public void setAvatarThumbnailUrl(String str) {
        this.mAvatarThumbnailUrl = str;
    }

    public void setAvatarUrl(String str) {
        this.mAvatarUrl = str;
    }

    public void setCategoryUpdatedAt(Long l) {
        this.mCategoryUpdatedAt = l;
    }

    public void setChannelCreationDate(Long l) {
        this.mChannelCreationDate = l;
    }

    public void setChannelLink(String str) {
        this.mChannelLink = str;
    }

    public void setChannelMembersCount(Long l) {
        this.mChannelMembersCount = l;
    }

    public void setDescription(String str) {
        this.mDescription = str;
    }

    public void setExtra(String str) {
        this.mExtra = str;
    }

    public void setId(long j) {
        this.mId = j;
    }

    public void setIsDisabled(boolean z) {
        this.mIsDisabled = z;
    }

    public void setItemIndex(Integer num) {
        this.mItemIndex = num;
    }

    public void setItemType(SuggestedChannelsCategoryItemType suggestedChannelsCategoryItemType) {
        this.mItemType = suggestedChannelsCategoryItemType;
    }

    public void setParentCategoryId(Integer num) {
        this.mParentCategoryId = num;
    }

    public void setParty(String str) {
        if (str == null) {
            throw new IllegalArgumentException("party must not be null");
        }
        this.mParty = str;
    }

    public void setTitle(String str) {
        this.mTitle = str;
    }
}
