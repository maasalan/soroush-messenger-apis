package com.googlecode.mp4parser.util;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class LazyList<E> extends AbstractList<E> {
    private static final Logger LOG = Logger.getLogger(LazyList.class);
    Iterator<E> elementSource;
    List<E> underlying;

    class C21171 implements Iterator<E> {
        int pos = 0;

        C21171() {
        }

        public boolean hasNext() {
            return this.pos < LazyList.this.underlying.size() || LazyList.this.elementSource.hasNext();
        }

        public E next() {
            if (this.pos < LazyList.this.underlying.size()) {
                List list = LazyList.this.underlying;
                int i = this.pos;
                this.pos = i + 1;
                return list.get(i);
            }
            LazyList.this.underlying.add(LazyList.this.elementSource.next());
            return next();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public LazyList(List<E> list, Iterator<E> it) {
        this.underlying = list;
        this.elementSource = it;
    }

    private void blowup() {
        LOG.logDebug("blowup running");
        while (this.elementSource.hasNext()) {
            this.underlying.add(this.elementSource.next());
        }
    }

    public E get(int i) {
        if (this.underlying.size() > i) {
            return this.underlying.get(i);
        }
        if (this.elementSource.hasNext()) {
            this.underlying.add(this.elementSource.next());
            return get(i);
        }
        throw new NoSuchElementException();
    }

    public List<E> getUnderlying() {
        return this.underlying;
    }

    public Iterator<E> iterator() {
        return new C21171();
    }

    public int size() {
        LOG.logDebug("potentially expensive size() call");
        blowup();
        return this.underlying.size();
    }
}
