package org.jivesoftware.smackx.delay.provider;

import java.util.Date;
import org.b.c.a;

public class DelayInformationProvider extends AbstractDelayInformationProvider {
    public static final DelayInformationProvider INSTANCE = new DelayInformationProvider();

    protected Date parseDate(String str) {
        return a.a(str);
    }
}
