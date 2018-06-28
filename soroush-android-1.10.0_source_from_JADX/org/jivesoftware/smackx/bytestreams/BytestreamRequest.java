package org.jivesoftware.smackx.bytestreams;

import org.b.a.i;

public interface BytestreamRequest {
    BytestreamSession accept();

    i getFrom();

    String getSessionID();

    void reject();
}
