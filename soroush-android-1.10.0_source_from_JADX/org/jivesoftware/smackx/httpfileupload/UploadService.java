package org.jivesoftware.smackx.httpfileupload;

import org.b.a.b;
import org.jivesoftware.smack.util.Objects;

public class UploadService {
    private final b address;
    private final Long maxFileSize;
    private final Version version;

    enum Version {
        v0_2,
        v0_3
    }

    UploadService(b bVar, Version version) {
        this(bVar, version, null);
    }

    UploadService(b bVar, Version version, Long l) {
        this.address = (b) Objects.requireNonNull(bVar);
        this.version = version;
        this.maxFileSize = l;
    }

    public boolean acceptsFileOfSize(long j) {
        return !hasMaxFileSizeLimit() || j <= this.maxFileSize.longValue();
    }

    public b getAddress() {
        return this.address;
    }

    public Long getMaxFileSize() {
        return this.maxFileSize;
    }

    public Version getVersion() {
        return this.version;
    }

    public boolean hasMaxFileSizeLimit() {
        return this.maxFileSize != null;
    }
}
