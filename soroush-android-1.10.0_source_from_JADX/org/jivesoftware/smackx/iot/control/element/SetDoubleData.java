package org.jivesoftware.smackx.iot.control.element;

import org.jivesoftware.smackx.iot.control.element.SetData.Type;

public class SetDoubleData extends SetData {
    private Double doubleCache;

    public SetDoubleData(String str, double d) {
        this(str, Double.toString(d));
        this.doubleCache = Double.valueOf(d);
    }

    protected SetDoubleData(String str, String str2) {
        super(str, Type.DOUBLE, str2);
    }

    public Double getDoubleValue() {
        if (this.doubleCache != null) {
            this.doubleCache = Double.valueOf(getValue());
        }
        return this.doubleCache;
    }
}
