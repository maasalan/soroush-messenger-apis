package org.jivesoftware.smackx.time.packet;

import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.b.c.a;
import org.jivesoftware.smack.packet.IQ;
import org.jivesoftware.smack.packet.IQ.IQChildElementXmlStringBuilder;
import org.jivesoftware.smack.packet.IQ.Type;

public class Time extends IQ {
    public static final String ELEMENT = "time";
    private static final Logger LOGGER = Logger.getLogger(Time.class.getName());
    public static final String NAMESPACE = "urn:xmpp:time";
    private String tzo;
    private String utc;

    public Time() {
        super(ELEMENT, NAMESPACE);
        setType(Type.get);
    }

    public Time(Calendar calendar) {
        super(ELEMENT, NAMESPACE);
        this.tzo = a.a(calendar.getTimeZone());
        this.utc = a.a(calendar.getTime());
    }

    public static Time createResponse(IQ iq) {
        Time time = new Time(Calendar.getInstance());
        time.setType(Type.result);
        time.setTo(iq.getFrom());
        return time;
    }

    protected IQChildElementXmlStringBuilder getIQChildElementBuilder(IQChildElementXmlStringBuilder iQChildElementXmlStringBuilder) {
        if (this.utc != null) {
            iQChildElementXmlStringBuilder.rightAngleBracket();
            iQChildElementXmlStringBuilder.append((CharSequence) "<utc>").append(this.utc).append((CharSequence) "</utc>");
            iQChildElementXmlStringBuilder.append((CharSequence) "<tzo>").append(this.tzo).append((CharSequence) "</tzo>");
            return iQChildElementXmlStringBuilder;
        }
        iQChildElementXmlStringBuilder.setEmptyElement();
        return iQChildElementXmlStringBuilder;
    }

    public Date getTime() {
        if (this.utc == null) {
            return null;
        }
        try {
            return a.b(this.utc);
        } catch (Throwable e) {
            LOGGER.log(Level.SEVERE, "Error getting local time", e);
            return null;
        }
    }

    public String getTzo() {
        return this.tzo;
    }

    public String getUtc() {
        return this.utc;
    }

    public void setTime(Date date) {
    }

    public void setTzo(String str) {
        this.tzo = str;
    }

    public void setUtc(String str) {
        this.utc = str;
    }
}
