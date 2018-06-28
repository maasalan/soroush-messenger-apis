package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.sessions.base;

import com.google.p164b.p165a.C1904c;

public class Sessions {
    @C1904c(a = "CreateTime")
    private long mCreateTime;
    @C1904c(a = "Id")
    private String mDeviceId;
    @C1904c(a = "LastIP")
    private String mLastIP;
    @C1904c(a = "LastOnlineTime")
    private long mLastOnlineTime;
    @C1904c(a = "Model")
    private String mModel;
    private OnlineStatus mOnlineStatus;
    @C1904c(a = "Platform")
    private String mPlatform;
    @C1904c(a = "OnlineStatus")
    private int onlineStatus;

    public enum OnlineStatus {
        ONLINE,
        OFFLINE
    }

    public Sessions(String str, String str2, String str3, String str4, long j, OnlineStatus onlineStatus, long j2) {
        this.mDeviceId = str;
        this.mModel = str2;
        this.mPlatform = str3;
        this.mLastIP = str4;
        this.mLastOnlineTime = j;
        this.mOnlineStatus = onlineStatus;
        this.mCreateTime = j2;
    }

    public long getCreateTime() {
        return this.mCreateTime;
    }

    public String getDeviceId() {
        return this.mDeviceId;
    }

    public String getLastIP() {
        return this.mLastIP;
    }

    public long getLastOnlineTime() {
        return this.mLastOnlineTime * 1000;
    }

    public String getModel() {
        return this.mModel;
    }

    public OnlineStatus getOnlineStatus() {
        OnlineStatus onlineStatus;
        switch (this.onlineStatus) {
            case 0:
                onlineStatus = OnlineStatus.OFFLINE;
                break;
            case 1:
                onlineStatus = OnlineStatus.ONLINE;
                break;
            default:
                break;
        }
        this.mOnlineStatus = onlineStatus;
        return this.mOnlineStatus;
    }

    public String getPlatform() {
        return this.mPlatform;
    }
}
