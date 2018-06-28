package org.jivesoftware.smackx.iot.control.element;

import org.jivesoftware.smackx.iot.control.element.SetData.Type;

public class SetLongData extends SetData {
    private Long longCache;

    public SetLongData(String str, long j) {
        this(str, Long.toString(j));
        this.longCache = Long.valueOf(j);
    }

    protected SetLongData(String str, String str2) {
        super(str, Type.LONG, str2);
    }

    public Long getLongValue() {
        if (this.longCache != null) {
            this.longCache = Long.valueOf(getValue());
        }
        return this.longCache;
    }
}
