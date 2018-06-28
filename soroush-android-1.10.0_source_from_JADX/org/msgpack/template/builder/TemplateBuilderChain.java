package org.msgpack.template.builder;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.msgpack.template.TemplateRegistry;
import org.msgpack.util.android.DalvikVmChecker;

public class TemplateBuilderChain {
    private static final String JAVASSIST_TEMPLATE_BUILDER_CLASS_NAME = "org.msgpack.template.builder.JavassistTemplateBuilder";
    private static final Logger LOG = Logger.getLogger(TemplateBuilderChain.class.getName());
    private static final String REFLECTION_TEMPLATE_BUILDER_CLASS_NAME = "org.msgpack.template.builder.ReflectionTemplateBuilder";
    protected TemplateBuilder forceBuilder;
    protected List<TemplateBuilder> templateBuilders;

    public TemplateBuilderChain(TemplateRegistry templateRegistry) {
        this(templateRegistry, null);
    }

    public TemplateBuilderChain(TemplateRegistry templateRegistry, ClassLoader classLoader) {
        this.templateBuilders = new ArrayList();
        reset(templateRegistry, classLoader);
    }

    private static TemplateBuilder createForceTemplateBuilder(String str, TemplateRegistry templateRegistry, ClassLoader classLoader) {
        try {
            return (TemplateBuilder) Class.forName(str).getConstructor(new Class[]{TemplateRegistry.class, ClassLoader.class}).newInstance(new Object[]{templateRegistry, classLoader});
        } catch (Throwable e) {
            if (LOG.isLoggable(Level.WARNING)) {
                LOG.log(Level.WARNING, "Failed to create a TemplateBuilder reflectively", e);
            }
            return new ReflectionTemplateBuilder(templateRegistry, classLoader);
        }
    }

    private static boolean enableDynamicCodeGeneration() {
        return !DalvikVmChecker.isDalvikVm() && Boolean.parseBoolean(System.getProperties().getProperty("msgpack.dynamic-codegen.enabled", "true"));
    }

    public TemplateBuilder getForceBuilder() {
        return this.forceBuilder;
    }

    protected void reset(TemplateRegistry templateRegistry, ClassLoader classLoader) {
        if (templateRegistry == null) {
            throw new NullPointerException("registry is null");
        }
        this.forceBuilder = createForceTemplateBuilder(enableDynamicCodeGeneration() ? JAVASSIST_TEMPLATE_BUILDER_CLASS_NAME : REFLECTION_TEMPLATE_BUILDER_CLASS_NAME, templateRegistry, classLoader);
        TemplateBuilder templateBuilder = this.forceBuilder;
        this.templateBuilders.add(new ArrayTemplateBuilder(templateRegistry));
        this.templateBuilders.add(new OrdinalEnumTemplateBuilder(templateRegistry));
        this.templateBuilders.add(templateBuilder);
        this.templateBuilders.add(new ReflectionBeansTemplateBuilder(templateRegistry));
    }

    public TemplateBuilder select(Type type, boolean z) {
        for (TemplateBuilder templateBuilder : this.templateBuilders) {
            if (templateBuilder.matchType(type, z)) {
                return templateBuilder;
            }
        }
        return null;
    }
}
