package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.contacts.base;

import android.net.Uri;

public class LocalContactData {
    private Uri androidAvatarUri;
    private String androidName;
    private String androidPhoneNumber;
    private String userId;

    public LocalContactData(String str, String str2, Uri uri, String str3) {
        this.androidPhoneNumber = str;
        this.androidName = str2;
        this.userId = str3;
        this.androidAvatarUri = uri;
    }

    public Uri getAndroidAvatarUri() {
        return this.androidAvatarUri;
    }

    public String getAndroidName() {
        return this.androidName;
    }

    public String getAndroidPhoneNumber() {
        return this.androidPhoneNumber;
    }

    public String getUserId() {
        return this.userId;
    }
}
