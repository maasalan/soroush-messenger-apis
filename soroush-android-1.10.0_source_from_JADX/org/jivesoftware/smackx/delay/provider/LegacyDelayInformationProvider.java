package org.jivesoftware.smackx.delay.provider;

import java.util.Date;
import org.b.c.a;

public class LegacyDelayInformationProvider extends AbstractDelayInformationProvider {
    protected Date parseDate(String str) {
        return a.b(str);
    }
}
