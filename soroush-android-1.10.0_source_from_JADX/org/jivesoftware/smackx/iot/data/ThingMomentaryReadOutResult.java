package org.jivesoftware.smackx.iot.data;

import java.util.List;
import org.jivesoftware.smackx.iot.data.element.IoTDataField;

public interface ThingMomentaryReadOutResult {
    void momentaryReadOut(List<? extends IoTDataField> list);
}
