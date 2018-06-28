package org.msgpack.template.builder;

import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.msgpack.template.OrdinalEnumTemplate;
import org.msgpack.template.Template;
import org.msgpack.template.TemplateRegistry;

public class OrdinalEnumTemplateBuilder extends AbstractTemplateBuilder {
    private static final Logger LOG = Logger.getLogger(OrdinalEnumTemplateBuilder.class.getName());

    public OrdinalEnumTemplateBuilder(TemplateRegistry templateRegistry) {
        super(templateRegistry);
    }

    public <T> Template<T> buildTemplate(Class<T> cls, FieldEntry[] fieldEntryArr) {
        StringBuilder stringBuilder = new StringBuilder("fatal error: ");
        stringBuilder.append(cls.getName());
        throw new UnsupportedOperationException(stringBuilder.toString());
    }

    public <T> Template<T> buildTemplate(Type type) {
        Class cls = (Class) type;
        checkOrdinalEnumValidation(cls);
        return new OrdinalEnumTemplate(cls);
    }

    protected void checkOrdinalEnumValidation(Class<?> cls) {
        if (!cls.isEnum()) {
            StringBuilder stringBuilder = new StringBuilder("tried to build ordinal enum template of non-enum class: ");
            stringBuilder.append(cls.getName());
            throw new TemplateBuildException(stringBuilder.toString());
        }
    }

    public boolean matchType(Type type, boolean z) {
        Class cls = (Class) type;
        z = AbstractTemplateBuilder.matchAtOrdinalEnumTemplateBuilder(cls, z);
        if (z && LOG.isLoggable(Level.FINE)) {
            Logger logger = LOG;
            StringBuilder stringBuilder = new StringBuilder("matched type: ");
            stringBuilder.append(cls.getName());
            logger.fine(stringBuilder.toString());
        }
        return z;
    }
}
