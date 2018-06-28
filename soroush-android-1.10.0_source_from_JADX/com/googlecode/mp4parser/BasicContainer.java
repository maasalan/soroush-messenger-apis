package com.googlecode.mp4parser;

import com.coremedia.iso.BoxParser;
import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.Container;
import com.googlecode.mp4parser.util.CastUtils;
import com.googlecode.mp4parser.util.LazyList;
import com.googlecode.mp4parser.util.Logger;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class BasicContainer implements Container, Closeable, Iterator<Box> {
    private static final Box EOF = new C66061("eof ");
    private static Logger LOG = Logger.getLogger(BasicContainer.class);
    protected BoxParser boxParser;
    private List<Box> boxes = new ArrayList();
    protected DataSource dataSource;
    long endPosition = 0;
    Box lookahead = null;
    long parsePosition = 0;
    long startPosition = 0;

    class C66061 extends AbstractBox {
        C66061(String str) {
            super(str);
        }

        protected void _parseDetails(ByteBuffer byteBuffer) {
        }

        protected void getContent(ByteBuffer byteBuffer) {
        }

        protected long getContentSize() {
            return 0;
        }
    }

    public void addBox(Box box) {
        if (box != null) {
            this.boxes = new ArrayList(getBoxes());
            box.setParent(this);
            this.boxes.add(box);
        }
    }

    public void close() {
        this.dataSource.close();
    }

    public List<Box> getBoxes() {
        return (this.dataSource == null || this.lookahead == EOF) ? this.boxes : new LazyList(this.boxes, this);
    }

    public <T extends Box> List<T> getBoxes(Class<T> cls) {
        List boxes = getBoxes();
        List<T> list = null;
        Object obj = null;
        for (int i = 0; i < boxes.size(); i++) {
            Box box = (Box) boxes.get(i);
            if (cls.isInstance(box)) {
                if (obj == null) {
                    obj = box;
                } else {
                    if (list == null) {
                        list = new ArrayList(2);
                        list.add(obj);
                    }
                    list.add(box);
                }
            }
        }
        return list != null ? list : obj != null ? Collections.singletonList(obj) : Collections.emptyList();
    }

    public <T extends Box> List<T> getBoxes(Class<T> cls, boolean z) {
        List<T> arrayList = new ArrayList(2);
        List boxes = getBoxes();
        for (int i = 0; i < boxes.size(); i++) {
            Box box = (Box) boxes.get(i);
            if (cls.isInstance(box)) {
                arrayList.add(box);
            }
            if (z && (box instanceof Container)) {
                arrayList.addAll(((Container) box).getBoxes(cls, z));
            }
        }
        return arrayList;
    }

    public ByteBuffer getByteBuffer(long j, long j2) {
        long j3 = j2;
        if (this.dataSource != null) {
            ByteBuffer map;
            synchronized (r1.dataSource) {
                try {
                    map = r1.dataSource.map(r1.startPosition + j, j3);
                } catch (Throwable th) {
                    Throwable th2 = th;
                }
            }
            return map;
        }
        ByteBuffer allocate = ByteBuffer.allocate(CastUtils.l2i(j2));
        long j4 = j + j3;
        j3 = 0;
        Iterator it = r1.boxes.iterator();
        while (it.hasNext()) {
            long j5;
            Iterator it2;
            Box box = (Box) it.next();
            long size = j3 + box.getSize();
            if (size > j && j3 < j4) {
                OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                WritableByteChannel newChannel = Channels.newChannel(byteArrayOutputStream);
                box.getBox(newChannel);
                newChannel.close();
                if (j3 < j || size > j4) {
                    int l2i;
                    byte[] toByteArray;
                    int i;
                    long j6;
                    if (j3 >= j || size <= j4) {
                        j5 = j4;
                        it2 = it;
                        if (j3 >= j || size > j5) {
                            if (j3 >= j && size > j5) {
                                l2i = CastUtils.l2i(box.getSize() - (size - j5));
                                toByteArray = byteArrayOutputStream.toByteArray();
                                i = 0;
                                allocate.put(toByteArray, i, l2i);
                            }
                            j3 = size;
                            it = it2;
                            j4 = j5;
                        } else {
                            j6 = j - j3;
                            l2i = CastUtils.l2i(box.getSize() - j6);
                        }
                    } else {
                        it2 = it;
                        j6 = j - j3;
                        j5 = j4;
                        l2i = CastUtils.l2i((box.getSize() - j6) - (size - j4));
                    }
                    toByteArray = byteArrayOutputStream.toByteArray();
                    i = CastUtils.l2i(j6);
                    allocate.put(toByteArray, i, l2i);
                    j3 = size;
                    it = it2;
                    j4 = j5;
                } else {
                    allocate.put(byteArrayOutputStream.toByteArray());
                }
            }
            j5 = j4;
            it2 = it;
            j3 = size;
            it = it2;
            j4 = j5;
        }
        return (ByteBuffer) allocate.rewind();
    }

    protected long getContainerSize() {
        long j = 0;
        int i = 0;
        while (i < getBoxes().size()) {
            i++;
            j += ((Box) this.boxes.get(i)).getSize();
        }
        return j;
    }

    public boolean hasNext() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r0 = r3.lookahead;
        r1 = EOF;
        r2 = 0;
        if (r0 != r1) goto L_0x0008;
    L_0x0007:
        return r2;
    L_0x0008:
        r0 = r3.lookahead;
        r1 = 1;
        if (r0 == 0) goto L_0x000e;
    L_0x000d:
        return r1;
    L_0x000e:
        r0 = r3.next();	 Catch:{ NoSuchElementException -> 0x0015 }
        r3.lookahead = r0;	 Catch:{ NoSuchElementException -> 0x0015 }
        return r1;
    L_0x0015:
        r0 = EOF;
        r3.lookahead = r0;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.googlecode.mp4parser.BasicContainer.hasNext():boolean");
    }

    public void initContainer(DataSource dataSource, long j, BoxParser boxParser) {
        this.dataSource = dataSource;
        long position = dataSource.position();
        this.startPosition = position;
        this.parsePosition = position;
        dataSource.position(dataSource.position() + j);
        this.endPosition = dataSource.position();
        this.boxParser = boxParser;
    }

    public com.coremedia.iso.boxes.Box next() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r5 = this;
        r0 = r5.lookahead;
        if (r0 == 0) goto L_0x0010;
    L_0x0004:
        r0 = r5.lookahead;
        r1 = EOF;
        if (r0 == r1) goto L_0x0010;
    L_0x000a:
        r0 = r5.lookahead;
        r1 = 0;
        r5.lookahead = r1;
        return r0;
    L_0x0010:
        r0 = r5.dataSource;
        if (r0 == 0) goto L_0x0048;
    L_0x0014:
        r0 = r5.parsePosition;
        r2 = r5.endPosition;
        r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r4 < 0) goto L_0x001d;
    L_0x001c:
        goto L_0x0048;
    L_0x001d:
        r0 = r5.dataSource;	 Catch:{ EOFException -> 0x0042, IOException -> 0x003c }
        monitor-enter(r0);	 Catch:{ EOFException -> 0x0042, IOException -> 0x003c }
        r1 = r5.dataSource;	 Catch:{ all -> 0x0039 }
        r2 = r5.parsePosition;	 Catch:{ all -> 0x0039 }
        r1.position(r2);	 Catch:{ all -> 0x0039 }
        r1 = r5.boxParser;	 Catch:{ all -> 0x0039 }
        r2 = r5.dataSource;	 Catch:{ all -> 0x0039 }
        r1 = r1.parseBox(r2, r5);	 Catch:{ all -> 0x0039 }
        r2 = r5.dataSource;	 Catch:{ all -> 0x0039 }
        r2 = r2.position();	 Catch:{ all -> 0x0039 }
        r5.parsePosition = r2;	 Catch:{ all -> 0x0039 }
        monitor-exit(r0);	 Catch:{ all -> 0x0039 }
        return r1;	 Catch:{ all -> 0x0039 }
    L_0x0039:
        r1 = move-exception;	 Catch:{ all -> 0x0039 }
        monitor-exit(r0);	 Catch:{ all -> 0x0039 }
        throw r1;	 Catch:{ EOFException -> 0x0042, IOException -> 0x003c }
    L_0x003c:
        r0 = new java.util.NoSuchElementException;
        r0.<init>();
        throw r0;
    L_0x0042:
        r0 = new java.util.NoSuchElementException;
        r0.<init>();
        throw r0;
    L_0x0048:
        r0 = EOF;
        r5.lookahead = r0;
        r0 = new java.util.NoSuchElementException;
        r0.<init>();
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.googlecode.mp4parser.BasicContainer.next():com.coremedia.iso.boxes.Box");
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }

    public void setBoxes(List<Box> list) {
        this.boxes = new ArrayList(list);
        this.lookahead = EOF;
        this.dataSource = null;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getClass().getSimpleName());
        stringBuilder.append("[");
        for (int i = 0; i < this.boxes.size(); i++) {
            if (i > 0) {
                stringBuilder.append(";");
            }
            stringBuilder.append(((Box) this.boxes.get(i)).toString());
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public final void writeContainer(WritableByteChannel writableByteChannel) {
        for (Box box : getBoxes()) {
            box.getBox(writableByteChannel);
        }
    }
}
