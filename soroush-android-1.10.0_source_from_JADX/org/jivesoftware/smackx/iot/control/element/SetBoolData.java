package org.jivesoftware.smackx.iot.control.element;

import org.jivesoftware.smackx.iot.control.element.SetData.Type;

public class SetBoolData extends SetData {
    private Boolean booleanCache;

    protected SetBoolData(String str, String str2) {
        super(str, Type.BOOL, str2);
    }

    public SetBoolData(String str, boolean z) {
        this(str, Boolean.toString(z));
        this.booleanCache = Boolean.valueOf(z);
    }

    public Boolean getBooleanValue() {
        if (this.booleanCache != null) {
            this.booleanCache = Boolean.valueOf(getValue());
        }
        return this.booleanCache;
    }
}
