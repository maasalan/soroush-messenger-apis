package org.jivesoftware.smackx.muc;

import java.util.Date;
import org.jivesoftware.smackx.muc.packet.MUCInitialPresence.History;

@Deprecated
public class DiscussionHistory {
    private int maxChars = -1;
    private int maxStanzas = -1;
    private int seconds = -1;
    private Date since;

    private boolean isConfigured() {
        if (this.maxChars < 0 && this.maxStanzas < 0 && this.seconds < 0) {
            if (this.since == null) {
                return false;
            }
        }
        return true;
    }

    History getMUCHistory() {
        return !isConfigured() ? null : new History(this.maxChars, this.maxStanzas, this.seconds, this.since);
    }

    public int getMaxChars() {
        return this.maxChars;
    }

    public int getMaxStanzas() {
        return this.maxStanzas;
    }

    public int getSeconds() {
        return this.seconds;
    }

    public Date getSince() {
        return this.since;
    }

    public void setMaxChars(int i) {
        this.maxChars = i;
    }

    public void setMaxStanzas(int i) {
        this.maxStanzas = i;
    }

    public void setSeconds(int i) {
        this.seconds = i;
    }

    public void setSince(Date date) {
        this.since = date;
    }
}
