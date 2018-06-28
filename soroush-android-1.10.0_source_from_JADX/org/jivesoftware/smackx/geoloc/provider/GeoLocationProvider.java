package org.jivesoftware.smackx.geoloc.provider;

import org.jivesoftware.smack.provider.ExtensionElementProvider;
import org.jivesoftware.smack.util.ParserUtils;
import org.jivesoftware.smackx.geoloc.packet.GeoLocation;
import org.jivesoftware.smackx.geoloc.packet.GeoLocation.Builder;
import org.jivesoftware.smackx.iot.data.element.TimestampElement;
import org.xmlpull.v1.XmlPullParser;

public class GeoLocationProvider extends ExtensionElementProvider<GeoLocation> {
    public GeoLocation parse(XmlPullParser xmlPullParser, int i) {
        Builder builder = GeoLocation.builder();
        while (true) {
            switch (xmlPullParser.next()) {
                case 2:
                    String name = xmlPullParser.getName();
                    Object obj = -1;
                    switch (name.hashCode()) {
                        case -2131707655:
                            if (name.equals("accuracy")) {
                                obj = null;
                                break;
                            }
                            break;
                        case -1724546052:
                            if (name.equals("description")) {
                                obj = 8;
                                break;
                            }
                            break;
                        case -1476113789:
                            if (name.equals("countrycode")) {
                                obj = 6;
                                break;
                            }
                            break;
                        case -1430646092:
                            if (name.equals("building")) {
                                obj = 4;
                                break;
                            }
                            break;
                        case -934795532:
                            if (name.equals("region")) {
                                obj = 15;
                                break;
                            }
                            break;
                        case -891990013:
                            if (name.equals("street")) {
                                obj = 18;
                                break;
                            }
                            break;
                        case -234326098:
                            if (name.equals("bearing")) {
                                obj = 3;
                                break;
                            }
                            break;
                        case 96681:
                            if (name.equals("alt")) {
                                obj = 1;
                                break;
                            }
                            break;
                        case 106911:
                            if (name.equals("lat")) {
                                obj = 11;
                                break;
                            }
                            break;
                        case 107339:
                            if (name.equals("lon")) {
                                obj = 13;
                                break;
                            }
                            break;
                        case 115369:
                            if (name.equals("tzo")) {
                                obj = 21;
                                break;
                            }
                            break;
                        case 116076:
                            if (name.equals("uri")) {
                                obj = 22;
                                break;
                            }
                            break;
                        case 3002509:
                            if (name.equals("area")) {
                                obj = 2;
                                break;
                            }
                            break;
                        case 3506395:
                            if (name.equals("room")) {
                                obj = 16;
                                break;
                            }
                            break;
                        case 3556653:
                            if (name.equals("text")) {
                                obj = 19;
                                break;
                            }
                            break;
                        case 55126294:
                            if (name.equals(TimestampElement.ELEMENT)) {
                                obj = 20;
                                break;
                            }
                            break;
                        case 95357039:
                            if (name.equals("datum")) {
                                obj = 7;
                                break;
                            }
                            break;
                        case 96784904:
                            if (name.equals("error")) {
                                obj = 9;
                                break;
                            }
                            break;
                        case 97526796:
                            if (name.equals("floor")) {
                                obj = 10;
                                break;
                            }
                            break;
                        case 109641799:
                            if (name.equals("speed")) {
                                obj = 17;
                                break;
                            }
                            break;
                        case 957831062:
                            if (name.equals("country")) {
                                obj = 5;
                                break;
                            }
                            break;
                        case 1900805475:
                            if (name.equals("locality")) {
                                obj = 12;
                                break;
                            }
                            break;
                        case 2012106040:
                            if (name.equals("postalcode")) {
                                obj = 14;
                                break;
                            }
                            break;
                        default:
                            break;
                    }
                    switch (obj) {
                        case null:
                            builder.setAccuracy(Double.valueOf(ParserUtils.getDoubleFromNextText(xmlPullParser)));
                            break;
                        case 1:
                            builder.setAlt(Double.valueOf(ParserUtils.getDoubleFromNextText(xmlPullParser)));
                            break;
                        case 2:
                            builder.setArea(xmlPullParser.nextText());
                            break;
                        case 3:
                            builder.setBearing(Double.valueOf(ParserUtils.getDoubleFromNextText(xmlPullParser)));
                            break;
                        case 4:
                            builder.setBuilding(xmlPullParser.nextText());
                            break;
                        case 5:
                            builder.setCountry(xmlPullParser.nextText());
                            break;
                        case 6:
                            builder.setCountryCode(xmlPullParser.nextText());
                            break;
                        case 7:
                            builder.setDatum(xmlPullParser.nextText());
                            break;
                        case 8:
                            builder.setDescription(xmlPullParser.nextText());
                            break;
                        case 9:
                            builder.setError(Double.valueOf(ParserUtils.getDoubleFromNextText(xmlPullParser)));
                            break;
                        case 10:
                            builder.setFloor(xmlPullParser.nextText());
                            break;
                        case 11:
                            builder.setLat(Double.valueOf(ParserUtils.getDoubleFromNextText(xmlPullParser)));
                            break;
                        case 12:
                            builder.setLocality(xmlPullParser.nextText());
                            break;
                        case 13:
                            builder.setLon(Double.valueOf(ParserUtils.getDoubleFromNextText(xmlPullParser)));
                            break;
                        case 14:
                            builder.setPostalcode(xmlPullParser.nextText());
                            break;
                        case 15:
                            builder.setRegion(xmlPullParser.nextText());
                            break;
                        case 16:
                            builder.setRoom(xmlPullParser.nextText());
                            break;
                        case 17:
                            builder.setSpeed(Double.valueOf(ParserUtils.getDoubleFromNextText(xmlPullParser)));
                            break;
                        case 18:
                            builder.setStreet(xmlPullParser.nextText());
                            break;
                        case 19:
                            builder.setText(xmlPullParser.nextText());
                            break;
                        case 20:
                            builder.setTimestamp(ParserUtils.getDateFromNextText(xmlPullParser));
                            break;
                        case 21:
                            builder.setTzo(xmlPullParser.nextText());
                            break;
                        case 22:
                            builder.setUri(ParserUtils.getUriFromNextText(xmlPullParser));
                            break;
                        default:
                            break;
                    }
                case 3:
                    if (xmlPullParser.getDepth() != i) {
                        break;
                    }
                    return builder.build();
                default:
                    break;
            }
        }
    }
}
