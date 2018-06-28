package org.jivesoftware.smackx.iot.provisioning.provider;

import org.jivesoftware.smack.provider.IQProvider;
import org.jivesoftware.smackx.iot.provisioning.element.ClearCacheResponse;
import org.xmlpull.v1.XmlPullParser;

public class ClearCacheResponseProvider extends IQProvider<ClearCacheResponse> {
    public ClearCacheResponse parse(XmlPullParser xmlPullParser, int i) {
        return new ClearCacheResponse();
    }
}
