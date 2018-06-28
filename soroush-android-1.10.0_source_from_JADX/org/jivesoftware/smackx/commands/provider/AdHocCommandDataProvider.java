package org.jivesoftware.smackx.commands.provider;

import org.jivesoftware.smack.provider.ExtensionElementProvider;
import org.jivesoftware.smack.provider.IQProvider;
import org.jivesoftware.smack.util.PacketParserUtils;
import org.jivesoftware.smackx.amp.packet.AMPExtension;
import org.jivesoftware.smackx.commands.AdHocCommand.Action;
import org.jivesoftware.smackx.commands.AdHocCommand.SpecificErrorCondition;
import org.jivesoftware.smackx.commands.AdHocCommand.Status;
import org.jivesoftware.smackx.commands.AdHocCommandNote;
import org.jivesoftware.smackx.commands.AdHocCommandNote.Type;
import org.jivesoftware.smackx.commands.packet.AdHocCommandData;
import org.jivesoftware.smackx.commands.packet.AdHocCommandData.SpecificError;
import org.jivesoftware.smackx.iot.data.element.NodeElement;
import org.jivesoftware.smackx.muc.packet.MUCUser;
import org.jivesoftware.smackx.xdata.packet.DataForm;
import org.jivesoftware.smackx.xdata.provider.DataFormProvider;
import org.xmlpull.v1.XmlPullParser;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

public class AdHocCommandDataProvider extends IQProvider<AdHocCommandData> {

    public static class BadActionError extends ExtensionElementProvider<SpecificError> {
        public SpecificError parse(XmlPullParser xmlPullParser, int i) {
            return new SpecificError(SpecificErrorCondition.badAction);
        }
    }

    public static class BadLocaleError extends ExtensionElementProvider<SpecificError> {
        public SpecificError parse(XmlPullParser xmlPullParser, int i) {
            return new SpecificError(SpecificErrorCondition.badLocale);
        }
    }

    public static class BadPayloadError extends ExtensionElementProvider<SpecificError> {
        public SpecificError parse(XmlPullParser xmlPullParser, int i) {
            return new SpecificError(SpecificErrorCondition.badPayload);
        }
    }

    public static class BadSessionIDError extends ExtensionElementProvider<SpecificError> {
        public SpecificError parse(XmlPullParser xmlPullParser, int i) {
            return new SpecificError(SpecificErrorCondition.badSessionid);
        }
    }

    public static class MalformedActionError extends ExtensionElementProvider<SpecificError> {
        public SpecificError parse(XmlPullParser xmlPullParser, int i) {
            return new SpecificError(SpecificErrorCondition.malformedAction);
        }
    }

    public static class SessionExpiredError extends ExtensionElementProvider<SpecificError> {
        public SpecificError parse(XmlPullParser xmlPullParser, int i) {
            return new SpecificError(SpecificErrorCondition.sessionExpired);
        }
    }

    public AdHocCommandData parse(XmlPullParser xmlPullParser, int i) {
        Status status;
        Action valueOf;
        Object obj;
        int next;
        String name;
        Action action;
        String attributeValue;
        AdHocCommandData adHocCommandData = new AdHocCommandData();
        DataFormProvider dataFormProvider = new DataFormProvider();
        adHocCommandData.setSessionID(xmlPullParser.getAttributeValue("", "sessionid"));
        adHocCommandData.setNode(xmlPullParser.getAttributeValue("", NodeElement.ELEMENT));
        String attributeValue2 = xmlPullParser.getAttributeValue("", MUCUser.Status.ELEMENT);
        if (Status.executing.toString().equalsIgnoreCase(attributeValue2)) {
            status = Status.executing;
        } else if (Status.completed.toString().equalsIgnoreCase(attributeValue2)) {
            status = Status.completed;
        } else {
            if (Status.canceled.toString().equalsIgnoreCase(attributeValue2)) {
                status = Status.canceled;
            }
            attributeValue2 = xmlPullParser.getAttributeValue("", AMPExtension.Action.ATTRIBUTE_NAME);
            if (attributeValue2 != null) {
                valueOf = Action.valueOf(attributeValue2);
                if (valueOf == null || valueOf.equals(Action.unknown)) {
                    valueOf = Action.unknown;
                }
                adHocCommandData.setAction(valueOf);
            }
            obj = null;
            while (obj == null) {
                next = xmlPullParser.next();
                name = xmlPullParser.getName();
                String namespace = xmlPullParser.getNamespace();
                if (next != 2) {
                    if (xmlPullParser.getName().equals("actions")) {
                        if (xmlPullParser.getName().equals("next")) {
                            action = Action.next;
                        } else if (xmlPullParser.getName().equals("complete")) {
                            action = Action.complete;
                        } else if (xmlPullParser.getName().equals("prev")) {
                            action = Action.prev;
                        } else if (!name.equals("x") && namespace.equals("jabber:x:data")) {
                            adHocCommandData.setForm((DataForm) dataFormProvider.parse(xmlPullParser));
                        } else if (xmlPullParser.getName().equals("note")) {
                            attributeValue = xmlPullParser.getAttributeValue("", IjkMediaMeta.IJKM_KEY_TYPE);
                            adHocCommandData.addNote(new AdHocCommandNote(attributeValue == null ? Type.valueOf(attributeValue) : Type.info, xmlPullParser.nextText()));
                        } else if (xmlPullParser.getName().equals("error")) {
                            adHocCommandData.setError(PacketParserUtils.parseError(xmlPullParser));
                        }
                        adHocCommandData.addAction(action);
                    } else {
                        attributeValue = xmlPullParser.getAttributeValue("", "execute");
                        if (attributeValue != null) {
                            adHocCommandData.setExecuteAction(Action.valueOf(attributeValue));
                        }
                    }
                } else if (next == 3 && xmlPullParser.getName().equals(AdHocCommandData.ELEMENT)) {
                    obj = 1;
                }
            }
            return adHocCommandData;
        }
        adHocCommandData.setStatus(status);
        attributeValue2 = xmlPullParser.getAttributeValue("", AMPExtension.Action.ATTRIBUTE_NAME);
        if (attributeValue2 != null) {
            valueOf = Action.valueOf(attributeValue2);
            valueOf = Action.unknown;
            adHocCommandData.setAction(valueOf);
        }
        obj = null;
        while (obj == null) {
            next = xmlPullParser.next();
            name = xmlPullParser.getName();
            String namespace2 = xmlPullParser.getNamespace();
            if (next != 2) {
                obj = 1;
            } else if (xmlPullParser.getName().equals("actions")) {
                if (xmlPullParser.getName().equals("next")) {
                    action = Action.next;
                } else if (xmlPullParser.getName().equals("complete")) {
                    action = Action.complete;
                } else if (xmlPullParser.getName().equals("prev")) {
                    action = Action.prev;
                } else {
                    if (!name.equals("x")) {
                    }
                    if (xmlPullParser.getName().equals("note")) {
                        attributeValue = xmlPullParser.getAttributeValue("", IjkMediaMeta.IJKM_KEY_TYPE);
                        if (attributeValue == null) {
                        }
                        adHocCommandData.addNote(new AdHocCommandNote(attributeValue == null ? Type.valueOf(attributeValue) : Type.info, xmlPullParser.nextText()));
                    } else if (xmlPullParser.getName().equals("error")) {
                        adHocCommandData.setError(PacketParserUtils.parseError(xmlPullParser));
                    }
                }
                adHocCommandData.addAction(action);
            } else {
                attributeValue = xmlPullParser.getAttributeValue("", "execute");
                if (attributeValue != null) {
                    adHocCommandData.setExecuteAction(Action.valueOf(attributeValue));
                }
            }
        }
        return adHocCommandData;
    }
}
