package org.jivesoftware.smack;

public class UnparseableStanza {
    private final CharSequence content;
    private final Exception f24826e;

    UnparseableStanza(CharSequence charSequence, Exception exception) {
        this.content = charSequence;
        this.f24826e = exception;
    }

    public CharSequence getContent() {
        return this.content;
    }

    public Exception getParsingException() {
        return this.f24826e;
    }
}
