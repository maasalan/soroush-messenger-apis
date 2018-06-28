package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.user_window_archive;

import com.google.p164b.p165a.C1902a;
import com.google.p164b.p165a.C1904c;
import java.util.ArrayList;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.C2572e;

public class UserWindowArchiveResponse extends BaseResponse {
    @C1902a
    @C1904c(a = "AfterMoreMessagesExists")
    private int haveAfterMoreMessagesExists;
    @C1902a
    @C1904c(a = "BeforeMoreMessagesExists")
    private int haveBeforeMoreMessagesExists;
    @C1902a
    @C1904c(a = "MessagesCount")
    private int mMessageCount;
    @C1902a
    @C1904c(a = "Messages")
    private ArrayList<C2572e> mUserChatMessages;

    public UserWindowArchiveResponse(int i, String str, int i2, int i3, int i4, ArrayList<C2572e> arrayList) {
        super(i, str);
        this.haveBeforeMoreMessagesExists = i2;
        this.haveAfterMoreMessagesExists = i3;
        this.mMessageCount = i4;
        this.mUserChatMessages = arrayList;
    }

    public boolean getHaveAfterMoreMessagesExists() {
        return this.haveAfterMoreMessagesExists == 1;
    }

    public boolean getHaveBeforeMoreMessagesExists() {
        return this.haveBeforeMoreMessagesExists == 1;
    }

    public int getmMessageCount() {
        return this.mMessageCount;
    }

    public ArrayList<C2572e> getmUserChatMessages() {
        return this.mUserChatMessages;
    }
}
