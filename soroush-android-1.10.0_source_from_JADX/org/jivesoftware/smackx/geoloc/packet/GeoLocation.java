package org.jivesoftware.smackx.geoloc.packet;

import java.io.Serializable;
import java.net.URI;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jivesoftware.smack.packet.ExtensionElement;
import org.jivesoftware.smack.packet.Message;
import org.jivesoftware.smack.packet.NamedElement;
import org.jivesoftware.smack.util.StringUtils;
import org.jivesoftware.smack.util.XmlStringBuilder;
import org.jivesoftware.smackx.iot.data.element.TimestampElement;

public final class GeoLocation implements Serializable, ExtensionElement {
    public static final String ELEMENT = "geoloc";
    private static final Logger LOGGER = Logger.getLogger(GeoLocation.class.getName());
    public static final String NAMESPACE = "http://jabber.org/protocol/geoloc";
    private static final long serialVersionUID = 1;
    private final Double accuracy;
    private final Double alt;
    private final String area;
    private final Double bearing;
    private final String building;
    private final String country;
    private final String countryCode;
    private final String datum;
    private final String description;
    private final Double error;
    private final String floor;
    private final Double lat;
    private final String locality;
    private final Double lon;
    private final String postalcode;
    private final String region;
    private final String room;
    private final Double speed;
    private final String street;
    private final String text;
    private final Date timestamp;
    private final String tzo;
    private final URI uri;

    public static class Builder {
        private Double accuracy;
        private Double alt;
        private String area;
        private Double bearing;
        private String building;
        private String country;
        private String countryCode;
        private String datum;
        private String description;
        private Double error;
        private String floor;
        private Double lat;
        private String locality;
        private Double lon;
        private String postalcode;
        private String region;
        private String room;
        private Double speed;
        private String street;
        private String text;
        private Date timestamp;
        private String tzo;
        private URI uri;

        public GeoLocation build() {
            Double d = this.accuracy;
            Double d2 = this.alt;
            String str = this.area;
            Double d3 = this.bearing;
            String str2 = this.building;
            String str3 = this.country;
            String str4 = this.countryCode;
            String str5 = this.datum;
            String str6 = this.description;
            Double d4 = this.error;
            String str7 = this.floor;
            Double d5 = this.lat;
            String str8 = this.locality;
            Double d6 = this.lon;
            Double d7 = d6;
            return new GeoLocation(d, d2, str, d3, str2, str3, str4, str5, str6, d4, str7, d5, str8, d7, this.postalcode, this.region, this.room, this.speed, this.street, this.text, this.timestamp, this.tzo, this.uri);
        }

        public Builder setAccuracy(Double d) {
            this.accuracy = d;
            return this;
        }

        public Builder setAlt(Double d) {
            this.alt = d;
            return this;
        }

        public Builder setArea(String str) {
            this.area = str;
            return this;
        }

        public Builder setBearing(Double d) {
            this.bearing = d;
            return this;
        }

        public Builder setBuilding(String str) {
            this.building = str;
            return this;
        }

        public Builder setCountry(String str) {
            this.country = str;
            return this;
        }

        public Builder setCountryCode(String str) {
            this.countryCode = str;
            return this;
        }

        public Builder setDatum(String str) {
            this.datum = str;
            return this;
        }

        public Builder setDescription(String str) {
            this.description = str;
            return this;
        }

        public Builder setError(Double d) {
            this.error = d;
            return this;
        }

        public Builder setFloor(String str) {
            this.floor = str;
            return this;
        }

        public Builder setLat(Double d) {
            this.lat = d;
            return this;
        }

        public Builder setLocality(String str) {
            this.locality = str;
            return this;
        }

        public Builder setLon(Double d) {
            this.lon = d;
            return this;
        }

        public Builder setPostalcode(String str) {
            this.postalcode = str;
            return this;
        }

        public Builder setRegion(String str) {
            this.region = str;
            return this;
        }

        public Builder setRoom(String str) {
            this.room = str;
            return this;
        }

        public Builder setSpeed(Double d) {
            this.speed = d;
            return this;
        }

        public Builder setStreet(String str) {
            this.street = str;
            return this;
        }

        public Builder setText(String str) {
            this.text = str;
            return this;
        }

        public Builder setTimestamp(Date date) {
            this.timestamp = date;
            return this;
        }

        public Builder setTzo(String str) {
            this.tzo = str;
            return this;
        }

        public Builder setUri(URI uri) {
            this.uri = uri;
            return this;
        }
    }

    private GeoLocation(Double d, Double d2, String str, Double d3, String str2, String str3, String str4, String str5, String str6, Double d4, String str7, Double d5, String str8, Double d6, String str9, String str10, String str11, Double d7, String str12, String str13, Date date, String str14, URI uri) {
        Double d8 = d;
        this.accuracy = d8;
        this.alt = d2;
        this.area = str;
        this.bearing = d3;
        this.building = str2;
        this.country = str3;
        this.countryCode = str4;
        r0.datum = StringUtils.isNullOrEmpty((CharSequence) str5) ? "WGS84" : str5;
        r0.description = str6;
        if (d8 != null) {
            d8 = null;
            LOGGER.log(Level.WARNING, "Error and accurracy set. Ignoring error as it is deprecated in favor of accuracy");
        } else {
            d8 = d4;
        }
        r0.error = d8;
        r0.floor = str7;
        r0.lat = d5;
        r0.locality = str8;
        r0.lon = d6;
        r0.postalcode = str9;
        r0.region = str10;
        r0.room = str11;
        r0.speed = d7;
        r0.street = str12;
        r0.text = str13;
        r0.timestamp = date;
        r0.tzo = str14;
        r0.uri = uri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GeoLocation from(Message message) {
        return (GeoLocation) message.getExtension(ELEMENT, NAMESPACE);
    }

    public final Double getAccuracy() {
        return this.accuracy;
    }

    public final Double getAlt() {
        return this.alt;
    }

    public final String getArea() {
        return this.area;
    }

    public final Double getBearing() {
        return this.bearing;
    }

    public final String getBuilding() {
        return this.building;
    }

    public final String getCountry() {
        return this.country;
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final String getDatum() {
        return this.datum;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getElementName() {
        return ELEMENT;
    }

    public final Double getError() {
        return this.error;
    }

    public final String getFloor() {
        return this.floor;
    }

    public final Double getLat() {
        return this.lat;
    }

    public final String getLocality() {
        return this.locality;
    }

    public final Double getLon() {
        return this.lon;
    }

    public final String getNamespace() {
        return NAMESPACE;
    }

    public final String getPostalcode() {
        return this.postalcode;
    }

    public final String getRegion() {
        return this.region;
    }

    public final String getRoom() {
        return this.room;
    }

    public final Double getSpeed() {
        return this.speed;
    }

    public final String getStreet() {
        return this.street;
    }

    public final String getText() {
        return this.text;
    }

    public final Date getTimestamp() {
        return this.timestamp;
    }

    public final String getTzo() {
        return this.tzo;
    }

    public final URI getUri() {
        return this.uri;
    }

    public final CharSequence toXML() {
        CharSequence xmlStringBuilder = new XmlStringBuilder((ExtensionElement) this);
        xmlStringBuilder.rightAngleBracket();
        xmlStringBuilder.optElement("accuracy", this.accuracy);
        xmlStringBuilder.optElement("alt", this.alt);
        xmlStringBuilder.optElement("area", this.area);
        xmlStringBuilder.optElement("bearing", this.bearing);
        xmlStringBuilder.optElement("building", this.building);
        xmlStringBuilder.optElement("country", this.country);
        xmlStringBuilder.optElement("countrycode", this.countryCode);
        xmlStringBuilder.optElement("datum", this.datum);
        xmlStringBuilder.optElement("description", this.description);
        xmlStringBuilder.optElement("error", this.error);
        xmlStringBuilder.optElement("floor", this.floor);
        xmlStringBuilder.optElement("lat", this.lat);
        xmlStringBuilder.optElement("locality", this.locality);
        xmlStringBuilder.optElement("lon", this.lon);
        xmlStringBuilder.optElement("postalcode", this.postalcode);
        xmlStringBuilder.optElement("region", this.region);
        xmlStringBuilder.optElement("room", this.room);
        xmlStringBuilder.optElement("speed", this.speed);
        xmlStringBuilder.optElement("street", this.street);
        xmlStringBuilder.optElement("text", this.text);
        xmlStringBuilder.optElement(TimestampElement.ELEMENT, this.timestamp);
        xmlStringBuilder.optElement("tzo", this.tzo);
        xmlStringBuilder.optElement("uri", this.uri);
        xmlStringBuilder.closeElement((NamedElement) this);
        return xmlStringBuilder;
    }
}
