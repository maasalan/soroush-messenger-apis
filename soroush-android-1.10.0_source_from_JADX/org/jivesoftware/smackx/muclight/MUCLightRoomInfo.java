package org.jivesoftware.smackx.muclight;

import java.util.HashMap;
import org.b.a.i;

public class MUCLightRoomInfo {
    private final MUCLightRoomConfiguration configuration;
    private final HashMap<i, MUCLightAffiliation> occupants;
    private final i room;
    private final String version;

    public MUCLightRoomInfo(String str, i iVar, MUCLightRoomConfiguration mUCLightRoomConfiguration, HashMap<i, MUCLightAffiliation> hashMap) {
        this.version = str;
        this.room = iVar;
        this.configuration = mUCLightRoomConfiguration;
        this.occupants = hashMap;
    }

    public MUCLightRoomConfiguration getConfiguration() {
        return this.configuration;
    }

    public HashMap<i, MUCLightAffiliation> getOccupants() {
        return this.occupants;
    }

    public i getRoom() {
        return this.room;
    }

    public String getVersion() {
        return this.version;
    }
}
