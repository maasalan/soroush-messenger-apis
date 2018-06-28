package org.msgpack.template.builder.beans;

import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class FeatureDescriptor {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    String displayName;
    boolean expert;
    boolean hidden;
    String name;
    boolean preferred;
    String shortDescription;
    private Map<String, Object> values = new HashMap();

    public Enumeration<String> attributeNames() {
        return Collections.enumeration(new LinkedList(this.values.keySet()));
    }

    public String getDisplayName() {
        return this.displayName == null ? getName() : this.displayName;
    }

    public String getName() {
        return this.name;
    }

    public String getShortDescription() {
        return this.shortDescription == null ? getDisplayName() : this.shortDescription;
    }

    public Object getValue(String str) {
        return str != null ? this.values.get(str) : null;
    }

    public boolean isExpert() {
        return this.expert;
    }

    public boolean isHidden() {
        return this.hidden;
    }

    public boolean isPreferred() {
        return this.preferred;
    }

    void merge(FeatureDescriptor featureDescriptor) {
        this.expert |= featureDescriptor.expert;
        this.hidden |= featureDescriptor.hidden;
        this.preferred |= featureDescriptor.preferred;
        if (this.shortDescription == null) {
            this.shortDescription = featureDescriptor.shortDescription;
        }
        if (this.name == null) {
            this.name = featureDescriptor.name;
        }
        if (this.displayName == null) {
            this.displayName = featureDescriptor.displayName;
        }
    }

    public void setDisplayName(String str) {
        this.displayName = str;
    }

    public void setExpert(boolean z) {
        this.expert = z;
    }

    public void setHidden(boolean z) {
        this.hidden = z;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPreferred(boolean z) {
        this.preferred = z;
    }

    public void setShortDescription(String str) {
        this.shortDescription = str;
    }

    public void setValue(String str, Object obj) {
        if (str != null) {
            if (obj != null) {
                this.values.put(str, obj);
                return;
            }
        }
        throw new NullPointerException();
    }
}
