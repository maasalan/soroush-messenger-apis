package org.msgpack.template.builder;

public class TemplateBuildException extends RuntimeException {
    public TemplateBuildException(String str) {
        super(str);
    }

    public TemplateBuildException(String str, Throwable th) {
        super(str, th);
    }

    public TemplateBuildException(Throwable th) {
        super(th);
    }
}
