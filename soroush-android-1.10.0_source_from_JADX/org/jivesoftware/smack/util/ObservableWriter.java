package org.jivesoftware.smack.util;

import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class ObservableWriter extends Writer {
    private static final int MAX_STRING_BUILDER_SIZE = 4096;
    final List<WriterListener> listeners = new ArrayList();
    private final StringBuilder stringBuilder = new StringBuilder(4096);
    Writer wrappedWriter = null;

    public ObservableWriter(Writer writer) {
        this.wrappedWriter = writer;
    }

    private void maybeNotifyListeners(String str) {
        this.stringBuilder.append(str);
        if (this.stringBuilder.length() > 4096) {
            notifyListeners();
        }
    }

    private void notifyListeners() {
        synchronized (this.listeners) {
            WriterListener[] writerListenerArr = new WriterListener[this.listeners.size()];
            this.listeners.toArray(writerListenerArr);
        }
        String stringBuilder = this.stringBuilder.toString();
        int i = 0;
        this.stringBuilder.setLength(0);
        while (i < writerListenerArr.length) {
            writerListenerArr[i].write(stringBuilder);
            i++;
        }
    }

    public void addWriterListener(WriterListener writerListener) {
        if (writerListener != null) {
            synchronized (this.listeners) {
                if (!this.listeners.contains(writerListener)) {
                    this.listeners.add(writerListener);
                }
            }
        }
    }

    public void close() {
        this.wrappedWriter.close();
    }

    public void flush() {
        notifyListeners();
        this.wrappedWriter.flush();
    }

    public void removeWriterListener(WriterListener writerListener) {
        synchronized (this.listeners) {
            this.listeners.remove(writerListener);
        }
    }

    public void write(int i) {
        this.wrappedWriter.write(i);
    }

    public void write(String str) {
        this.wrappedWriter.write(str);
        maybeNotifyListeners(str);
    }

    public void write(String str, int i, int i2) {
        this.wrappedWriter.write(str, i, i2);
        maybeNotifyListeners(str.substring(i, i2 + i));
    }

    public void write(char[] cArr) {
        this.wrappedWriter.write(cArr);
        maybeNotifyListeners(new String(cArr));
    }

    public void write(char[] cArr, int i, int i2) {
        this.wrappedWriter.write(cArr, i, i2);
        maybeNotifyListeners(new String(cArr, i, i2));
    }
}
