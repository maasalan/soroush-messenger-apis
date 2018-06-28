package org.jivesoftware.smack.util;

import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class ObservableReader extends Reader {
    final List<ReaderListener> listeners = new ArrayList();
    Reader wrappedReader = null;

    public ObservableReader(Reader reader) {
        this.wrappedReader = reader;
    }

    public void addReaderListener(ReaderListener readerListener) {
        if (readerListener != null) {
            synchronized (this.listeners) {
                if (!this.listeners.contains(readerListener)) {
                    this.listeners.add(readerListener);
                }
            }
        }
    }

    public void close() {
        this.wrappedReader.close();
    }

    public void mark(int i) {
        this.wrappedReader.mark(i);
    }

    public boolean markSupported() {
        return this.wrappedReader.markSupported();
    }

    public int read() {
        return this.wrappedReader.read();
    }

    public int read(char[] cArr) {
        return this.wrappedReader.read(cArr);
    }

    public int read(char[] cArr, int i, int i2) {
        i2 = this.wrappedReader.read(cArr, i, i2);
        if (i2 > 0) {
            ReaderListener[] readerListenerArr;
            String str = new String(cArr, i, i2);
            synchronized (this.listeners) {
                readerListenerArr = new ReaderListener[this.listeners.size()];
                this.listeners.toArray(readerListenerArr);
            }
            for (ReaderListener read : readerListenerArr) {
                read.read(str);
            }
        }
        return i2;
    }

    public boolean ready() {
        return this.wrappedReader.ready();
    }

    public void removeReaderListener(ReaderListener readerListener) {
        synchronized (this.listeners) {
            this.listeners.remove(readerListener);
        }
    }

    public void reset() {
        this.wrappedReader.reset();
    }

    public long skip(long j) {
        return this.wrappedReader.skip(j);
    }
}
