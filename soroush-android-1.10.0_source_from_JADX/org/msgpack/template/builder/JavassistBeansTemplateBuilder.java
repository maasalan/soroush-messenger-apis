package org.msgpack.template.builder;

import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.msgpack.template.TemplateRegistry;

public class JavassistBeansTemplateBuilder extends JavassistTemplateBuilder {
    private static final Logger LOG = Logger.getLogger(JavassistBeansTemplateBuilder.class.getName());

    public JavassistBeansTemplateBuilder(TemplateRegistry templateRegistry) {
        super(templateRegistry);
    }

    protected BuildContext createBuildContext() {
        return new BeansBuildContext(this);
    }

    public boolean matchType(Type type, boolean z) {
        Class cls = (Class) type;
        z = AbstractTemplateBuilder.matchAtClassTemplateBuilder(cls, z);
        if (z && LOG.isLoggable(Level.FINE)) {
            Logger logger = LOG;
            StringBuilder stringBuilder = new StringBuilder("matched type: ");
            stringBuilder.append(cls.getName());
            logger.fine(stringBuilder.toString());
        }
        return z;
    }
}
