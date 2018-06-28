package org.jivesoftware.smackx.iot.control;

import java.util.Collection;
import org.b.a.i;
import org.jivesoftware.smackx.iot.control.element.SetData;

public interface ThingControlRequest {
    void processRequest(i iVar, Collection<SetData> collection);
}
