package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.privatechat.getmemberjoingroups;

import com.google.p164b.p165a.C1904c;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.base.ChannelInfo;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.base.PrivateGroupInfo;

public class GetMemberJoinGroupListResponse extends BaseResponse {
    @C1904c(a = "Channels")
    private ChannelInfo[] channels;
    @C1904c(a = "PrivateGroups")
    private PrivateGroupInfo[] privateGroups;

    public GetMemberJoinGroupListResponse(int i, String str, PrivateGroupInfo[] privateGroupInfoArr, ChannelInfo[] channelInfoArr) {
        super(i, str);
        this.privateGroups = privateGroupInfoArr;
        this.channels = channelInfoArr;
    }

    public ChannelInfo[] getChannels() {
        return this.channels;
    }

    public PrivateGroupInfo[] getPrivateGroups() {
        return this.privateGroups;
    }

    public void setChannels(ChannelInfo[] channelInfoArr) {
        this.channels = channelInfoArr;
    }

    public void setPrivateGroups(PrivateGroupInfo[] privateGroupInfoArr) {
        this.privateGroups = privateGroupInfoArr;
    }
}
