package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.bot.get_bot_data;

import com.google.p164b.p165a.C1902a;
import com.google.p164b.p165a.C1904c;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.RegisteredRequest;

public class GetBotDataRequest extends RegisteredRequest {
    @C1902a
    @C1904c(a = "BotID")
    public String botID;

    public GetBotDataRequest(String str, String str2) {
        super(str);
        this.botID = str2;
    }
}
