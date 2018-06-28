package org.jivesoftware.smackx.iot.data.filter;

import org.jivesoftware.smack.filter.FlexibleStanzaTypeFilter;
import org.jivesoftware.smack.packet.Message;
import org.jivesoftware.smackx.iot.data.element.IoTFieldsExtension;

public class IoTFieldsExtensionFilter extends FlexibleStanzaTypeFilter<Message> {
    private final boolean onlyDone;
    private final int seqNr;

    public IoTFieldsExtensionFilter(int i, boolean z) {
        this.seqNr = i;
        this.onlyDone = z;
    }

    protected boolean acceptSpecific(Message message) {
        IoTFieldsExtension from = IoTFieldsExtension.from(message);
        return (from != null && from.getSequenceNr() == this.seqNr) ? !this.onlyDone || from.isDone() : false;
    }
}
