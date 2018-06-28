package org.jivesoftware.smackx.iot.control.element;

import org.jivesoftware.smackx.iot.control.element.SetData.Type;

public class SetIntData extends SetData {
    private Integer integerCache;

    public SetIntData(String str, int i) {
        this(str, Integer.toString(i));
        this.integerCache = Integer.valueOf(i);
    }

    protected SetIntData(String str, String str2) {
        super(str, Type.INT, str2);
    }

    public Integer getIntegerValue() {
        if (this.integerCache != null) {
            this.integerCache = Integer.valueOf(getValue());
        }
        return this.integerCache;
    }
}
