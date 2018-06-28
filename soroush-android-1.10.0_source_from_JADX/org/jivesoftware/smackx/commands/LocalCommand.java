package org.jivesoftware.smackx.commands;

import org.b.a.i;
import org.jivesoftware.smackx.commands.packet.AdHocCommandData;

public abstract class LocalCommand extends AdHocCommand {
    private long creationDate = System.currentTimeMillis();
    private int currenStage = -1;
    private i ownerJID;
    private String sessionID;

    void decrementStage() {
        this.currenStage--;
    }

    public long getCreationDate() {
        return this.creationDate;
    }

    public int getCurrentStage() {
        return this.currenStage;
    }

    public i getOwnerJID() {
        return this.ownerJID;
    }

    public String getSessionID() {
        return this.sessionID;
    }

    public abstract boolean hasPermission(i iVar);

    void incrementStage() {
        this.currenStage++;
    }

    public abstract boolean isLastStage();

    void setData(AdHocCommandData adHocCommandData) {
        adHocCommandData.setSessionID(this.sessionID);
        super.setData(adHocCommandData);
    }

    public void setOwnerJID(i iVar) {
        this.ownerJID = iVar;
    }

    public void setSessionID(String str) {
        this.sessionID = str;
        getData().setSessionID(str);
    }
}
