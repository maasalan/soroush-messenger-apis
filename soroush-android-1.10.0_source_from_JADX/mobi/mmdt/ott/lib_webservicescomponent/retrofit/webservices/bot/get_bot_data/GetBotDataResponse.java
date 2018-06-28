package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.bot.get_bot_data;

import com.google.p164b.p165a.C1902a;
import com.google.p164b.p165a.C1904c;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.bot.base.BotDataModel;

public class GetBotDataResponse extends BaseResponse {
    @C1902a
    @C1904c(a = "BotData")
    private BotDataModel botDataModel;

    public GetBotDataResponse(int i, String str, BotDataModel botDataModel) {
        super(i, str);
        this.botDataModel = botDataModel;
    }

    public BotDataModel getBotDataModel() {
        return this.botDataModel;
    }
}
