package org.jivesoftware.smackx.httpfileupload.provider;

import org.jivesoftware.smack.provider.ExtensionElementProvider;
import org.jivesoftware.smackx.httpfileupload.element.FileTooLargeError;
import org.jivesoftware.smackx.httpfileupload.element.FileTooLargeError_V0_2;
import org.xmlpull.v1.XmlPullParser;

public class FileTooLargeErrorProvider extends ExtensionElementProvider<FileTooLargeError> {
    public FileTooLargeError parse(XmlPullParser xmlPullParser, int i) {
        String namespace = xmlPullParser.getNamespace();
        Long l = null;
        while (true) {
            Object obj = null;
            switch (xmlPullParser.next()) {
                case 2:
                    String name = xmlPullParser.getName();
                    if (name.hashCode() == -486525815) {
                        if (name.equals("max-file-size")) {
                            if (obj != null) {
                                l = Long.valueOf(xmlPullParser.nextText());
                                break;
                            }
                            break;
                        }
                    }
                    obj = -1;
                    if (obj != null) {
                        l = Long.valueOf(xmlPullParser.nextText());
                    }
                case 3:
                    if (xmlPullParser.getDepth() != i) {
                        break;
                    }
                    int hashCode = namespace.hashCode();
                    if (hashCode != -1906675379) {
                        if (hashCode == -1320418345) {
                            if (namespace.equals("urn:xmpp:http:upload")) {
                                obj = 1;
                                switch (obj) {
                                    case null:
                                        return new FileTooLargeError(l.longValue());
                                    case 1:
                                        return new FileTooLargeError_V0_2(l.longValue());
                                    default:
                                        throw new AssertionError();
                                }
                            }
                        }
                    } else if (namespace.equals("urn:xmpp:http:upload:0")) {
                        switch (obj) {
                            case null:
                                return new FileTooLargeError(l.longValue());
                            case 1:
                                return new FileTooLargeError_V0_2(l.longValue());
                            default:
                                throw new AssertionError();
                        }
                    }
                    obj = -1;
                    switch (obj) {
                        case null:
                            return new FileTooLargeError(l.longValue());
                        case 1:
                            return new FileTooLargeError_V0_2(l.longValue());
                        default:
                            throw new AssertionError();
                    }
                default:
                    break;
            }
        }
    }
}
