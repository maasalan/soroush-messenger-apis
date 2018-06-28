package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.bot.base;

import com.google.p164b.p165a.C1902a;
import com.google.p164b.p165a.C1904c;

public class BotDataModel {
    @C1902a
    @C1904c(a = "AvatarThumbnailURL")
    private String avatarThumbnailUrl;
    @C1902a
    @C1904c(a = "AvatarURL")
    private String avatarUrl;
    @C1902a
    @C1904c(a = "ID")
    private String botId;
    @C1902a
    @C1904c(a = "Description")
    private String description;
    @C1902a
    @C1904c(a = "Link")
    private String link;
    @C1902a
    @C1904c(a = "Name")
    private String name;
    @C1902a
    @C1904c(a = "StartText")
    private String startText;

    public BotDataModel(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.botId = str;
        this.link = str2;
        this.name = str3;
        this.description = str4;
        this.startText = str5;
        this.avatarUrl = str6;
        this.avatarThumbnailUrl = str7;
    }

    public String getAvatarThumbnailUrl() {
        return this.avatarThumbnailUrl;
    }

    public String getAvatarUrl() {
        return this.avatarUrl;
    }

    public String getBotId() {
        return this.botId;
    }

    public String getDescription() {
        return this.description;
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
