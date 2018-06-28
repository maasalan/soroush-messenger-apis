package org.linphone.mediastream;

public class MediastreamException extends Exception {
    public MediastreamException(String str) {
        super(str);
    }

    public MediastreamException(String str, Throwable th) {
        super(str, th);
    }

    public MediastreamException(Throwable th) {
        super(th);
    }
}
