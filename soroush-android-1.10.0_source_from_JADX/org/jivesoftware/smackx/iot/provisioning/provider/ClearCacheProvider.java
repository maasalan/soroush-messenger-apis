package org.jivesoftware.smackx.iot.provisioning.provider;

import org.jivesoftware.smack.provider.IQProvider;
import org.jivesoftware.smackx.iot.provisioning.element.ClearCache;
import org.xmlpull.v1.XmlPullParser;

public class ClearCacheProvider extends IQProvider<ClearCache> {
    public ClearCache parse(XmlPullParser xmlPullParser, int i) {
        return new ClearCache();
    }
}
