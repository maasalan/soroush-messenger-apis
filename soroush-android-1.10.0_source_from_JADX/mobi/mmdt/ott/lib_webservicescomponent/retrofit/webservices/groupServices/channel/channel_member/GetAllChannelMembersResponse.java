package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.channel_member;

import com.google.p164b.p165a.C1902a;
import com.google.p164b.p165a.C1904c;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.base.ChannelMember;

public class GetAllChannelMembersResponse extends BaseResponse {
    @C1902a
    @C1904c(a = "Members")
    private ChannelMember[] mMembers;

    public GetAllChannelMembersResponse(int i, String str, ChannelMember[] channelMemberArr) {
        super(i, str);
        this.mMembers = channelMemberArr;
    }

    public ChannelMember[] getMembers() {
        return this.mMembers;
    }

    public void setMembers(ChannelMember[] channelMemberArr) {
        this.mMembers = channelMemberArr;
    }
}
