package org.msgpack.template.builder;

import java.lang.reflect.Type;
import org.msgpack.template.FieldList;
import org.msgpack.template.Template;

public interface TemplateBuilder {
    <T> Template<T> buildTemplate(Class<T> cls, FieldList fieldList);

    <T> Template<T> buildTemplate(Type type);

    <T> Template<T> loadTemplate(Type type);

    boolean matchType(Type type, boolean z);

    void writeTemplate(Type type, String str);
}
