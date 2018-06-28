package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.lookup.base;

public class LookUpBotDataResponse extends BaseLookup {
    private String avatarThumbnailURL;
    private String avatarURL;
    private String description;
    private String id;
    private String link;
    private String name;
    private String startText;

    public LookUpBotDataResponse(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.id = str;
        this.name = str2;
        this.description = str3;
        this.avatarURL = str4;
        this.avatarThumbnailURL = str5;
        this.link = str6;
        this.startText = str7;
    }

    public String getAvatarThumbnailURL() {
        return this.avatarThumbnailURL;
    }

    public String getAvatarURL() {
        return this.avatarURL;
    }

    public String getDescription() {
        return this.description;
    }

    public String getId() {
        return this.id;
    }

    public String getLink() {
        return this.link;
    }

    public String getName() {
        return this.name;
    }

    public String getStartText() {
        return this.startText;
    }
}
