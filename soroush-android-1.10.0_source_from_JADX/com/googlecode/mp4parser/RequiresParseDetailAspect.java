package com.googlecode.mp4parser;

import org.p487a.p488a.C4596a;
import org.p487a.p488a.C4597b;

public class RequiresParseDetailAspect {
    private static Throwable ajc$initFailureCause;
    public static final RequiresParseDetailAspect ajc$perSingletonInstance = null;

    static {
        try {
            ajc$postClinit();
        } catch (Throwable th) {
            ajc$initFailureCause = th;
        }
    }

    private static void ajc$postClinit() {
        ajc$perSingletonInstance = new RequiresParseDetailAspect();
    }

    public static RequiresParseDetailAspect aspectOf() {
        if (ajc$perSingletonInstance != null) {
            return ajc$perSingletonInstance;
        }
        throw new C4597b("com.googlecode.mp4parser.RequiresParseDetailAspect", ajc$initFailureCause);
    }

    public static boolean hasAspect() {
        return ajc$perSingletonInstance != null;
    }

    public void before(C4596a c4596a) {
        if (!(c4596a.mo3263a() instanceof AbstractBox)) {
            StringBuilder stringBuilder = new StringBuilder("Only methods in subclasses of ");
            stringBuilder.append(AbstractBox.class.getName());
            stringBuilder.append(" can  be annotated with ParseDetail");
            throw new RuntimeException(stringBuilder.toString());
        } else if (!((AbstractBox) c4596a.mo3263a()).isParsed()) {
            ((AbstractBox) c4596a.mo3263a()).parseDetails();
        }
    }
}
