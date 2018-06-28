package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.channel_member;

import com.google.p164b.p165a.C1902a;
import com.google.p164b.p165a.C1904c;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.base.ChannelRequest;

public class GetAllChannelMembersRequest extends ChannelRequest {
    @C1902a
    @C1904c(a = "ChannelMemberType")
    private int channelMemberType;
    @C1902a
    @C1904c(a = "Count")
    private int count;
    @C1902a
    @C1904c(a = "Offset")
    private int offset;

    public GetAllChannelMembersRequest(String str, String str2, int i, int i2, int i3) {
        super(str, str2);
        this.offset = i;
        this.count = i2;
        this.channelMemberType = i3;
    }

    public int getChannelMemberType() {
        return this.channelMemberType;
    }

    public int getCount() {
        return this.count;
    }

    public int getOffset() {
        return this.offset;
    }

    public void setChannelMemberType(int i) {
        this.channelMemberType = i;
    }

    public void setCount(int i) {
        this.count = i;
    }

    public void setOffset(int i) {
        this.offset = i;
    }
}
