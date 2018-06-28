package org.jivesoftware.smackx.jiveproperties.provider;

import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jivesoftware.smack.provider.ExtensionElementProvider;
import org.jivesoftware.smack.util.stringencoder.Base64;
import org.jivesoftware.smackx.jiveproperties.JivePropertiesManager;
import org.jivesoftware.smackx.jiveproperties.packet.JivePropertiesExtension;
import org.xmlpull.v1.XmlPullParser;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

public class JivePropertiesExtensionProvider extends ExtensionElementProvider<JivePropertiesExtension> {
    private static final Logger LOGGER = Logger.getLogger(JivePropertiesExtensionProvider.class.getName());

    public JivePropertiesExtension parse(XmlPullParser xmlPullParser, int i) {
        Map hashMap = new HashMap();
        while (true) {
            int next = xmlPullParser.next();
            if (next == 2 && xmlPullParser.getName().equals("property")) {
                Object obj = null;
                Object obj2 = null;
                String str = null;
                Object obj3 = str;
                Object obj4 = obj3;
                while (obj == null) {
                    int next2 = xmlPullParser.next();
                    if (next2 == 2) {
                        String name = xmlPullParser.getName();
                        if (name.equals("name")) {
                            obj3 = xmlPullParser.nextText();
                        } else if (name.equals("value")) {
                            obj2 = xmlPullParser.getAttributeValue("", IjkMediaMeta.IJKM_KEY_TYPE);
                            str = xmlPullParser.nextText();
                        }
                    } else if (next2 == 3 && xmlPullParser.getName().equals("property")) {
                        Integer valueOf;
                        if ("integer".equals(obj2)) {
                            valueOf = Integer.valueOf(str);
                        } else if ("long".equals(obj2)) {
                            valueOf = Long.valueOf(str);
                        } else if ("float".equals(obj2)) {
                            valueOf = Float.valueOf(str);
                        } else if ("double".equals(obj2)) {
                            valueOf = Double.valueOf(str);
                        } else if ("boolean".equals(obj2)) {
                            valueOf = Boolean.valueOf(str);
                        } else {
                            if ("string".equals(obj2)) {
                                obj4 = str;
                            } else if ("java-object".equals(obj2)) {
                                if (JivePropertiesManager.isJavaObjectEnabled()) {
                                    try {
                                        valueOf = new ObjectInputStream(new ByteArrayInputStream(Base64.decode(str))).readObject();
                                    } catch (Throwable e) {
                                        LOGGER.log(Level.SEVERE, "Error parsing java object", e);
                                    }
                                } else {
                                    LOGGER.severe("JavaObject is not enabled. Enable with JivePropertiesManager.setJavaObjectEnabled(true)");
                                }
                            }
                            if (!(obj3 == null || obj4 == null)) {
                                hashMap.put(obj3, obj4);
                            }
                            obj = 1;
                        }
                        obj4 = valueOf;
                        hashMap.put(obj3, obj4);
                        obj = 1;
                    }
                }
            } else if (next != 3) {
                continue;
            } else if (xmlPullParser.getName().equals(JivePropertiesExtension.ELEMENT)) {
                return new JivePropertiesExtension(hashMap);
            }
        }
    }
}
