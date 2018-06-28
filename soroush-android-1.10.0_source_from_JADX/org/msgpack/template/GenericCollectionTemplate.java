package org.msgpack.template;

import java.lang.reflect.Constructor;

public class GenericCollectionTemplate implements GenericTemplate {
    Constructor<? extends Template> constructor;

    public GenericCollectionTemplate(TemplateRegistry templateRegistry, Class<? extends Template> cls) {
        try {
            this.constructor = cls.getConstructor(new Class[]{Template.class});
            this.constructor.newInstance(new Object[]{new AnyTemplate(templateRegistry)});
        } catch (Throwable e) {
            throw new IllegalArgumentException(e);
        } catch (Throwable e2) {
            throw new IllegalArgumentException(e2);
        } catch (Throwable e22) {
            throw new IllegalArgumentException(e22);
        } catch (Throwable e222) {
            throw new IllegalArgumentException(e222);
        }
    }

    public Template build(Template[] templateArr) {
        try {
            return (Template) this.constructor.newInstance((Object[]) templateArr);
        } catch (Throwable e) {
            throw new IllegalArgumentException(e);
        } catch (Throwable e2) {
            throw new IllegalArgumentException(e2);
        } catch (Throwable e22) {
            throw new IllegalArgumentException(e22);
        }
    }
}
