package org.msgpack.template.builder.beans;

public interface PropertyEditor {
    void addPropertyChangeListener(PropertyChangeListener propertyChangeListener);

    String getAsText();

    String getJavaInitializationString();

    String[] getTags();

    Object getValue();

    boolean isPaintable();

    void removePropertyChangeListener(PropertyChangeListener propertyChangeListener);

    void setAsText(String str);

    void setValue(Object obj);

    boolean supportsCustomEditor();
}
