package org.jivesoftware.smack.util;

import java.util.AbstractQueue;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ArrayBlockingQueueWithShutdown<E> extends AbstractQueue<E> implements BlockingQueue<E> {
    private int count;
    private volatile boolean isShutdown;
    private final E[] items;
    private final ReentrantLock lock;
    private final Condition notEmpty;
    private final Condition notFull;
    private int putIndex;
    private int takeIndex;

    private class Itr implements Iterator<E> {
        private int lastRet = -1;
        private int nextIndex;
        private E nextItem;

        Itr() {
            if (ArrayBlockingQueueWithShutdown.this.count == 0) {
                this.nextIndex = -1;
                return;
            }
            this.nextIndex = ArrayBlockingQueueWithShutdown.this.takeIndex;
            this.nextItem = ArrayBlockingQueueWithShutdown.this.items[ArrayBlockingQueueWithShutdown.this.takeIndex];
        }

        private void checkNext() {
            if (this.nextIndex == ArrayBlockingQueueWithShutdown.this.putIndex) {
                this.nextIndex = -1;
                this.nextItem = null;
                return;
            }
            this.nextItem = ArrayBlockingQueueWithShutdown.this.items[this.nextIndex];
            if (this.nextItem == null) {
                this.nextIndex = -1;
            }
        }

        public boolean hasNext() {
            return this.nextIndex >= 0;
        }

        public E next() {
            ArrayBlockingQueueWithShutdown.this.lock.lock();
            try {
                if (this.nextIndex < 0) {
                    throw new NoSuchElementException();
                }
                this.lastRet = this.nextIndex;
                E e = this.nextItem;
                this.nextIndex = ArrayBlockingQueueWithShutdown.this.inc(this.nextIndex);
                checkNext();
                return e;
            } finally {
                ArrayBlockingQueueWithShutdown.this.lock.unlock();
            }
        }

        public void remove() {
            ArrayBlockingQueueWithShutdown.this.lock.lock();
            try {
                int i = this.lastRet;
                if (i < 0) {
                    throw new IllegalStateException();
                }
                this.lastRet = -1;
                int access$100 = ArrayBlockingQueueWithShutdown.this.takeIndex;
                ArrayBlockingQueueWithShutdown.this.removeAt(i);
                if (i == access$100) {
                    i = ArrayBlockingQueueWithShutdown.this.takeIndex;
                }
                this.nextIndex = i;
                checkNext();
            } finally {
                ArrayBlockingQueueWithShutdown.this.lock.unlock();
            }
        }
    }

    public ArrayBlockingQueueWithShutdown(int i) {
        this(i, false);
    }

    public ArrayBlockingQueueWithShutdown(int i, boolean z) {
        this.isShutdown = false;
        if (i <= 0) {
            throw new IllegalArgumentException();
        }
        this.items = new Object[i];
        this.lock = new ReentrantLock(z);
        this.notEmpty = this.lock.newCondition();
        this.notFull = this.lock.newCondition();
    }

    private static final void checkNotNull(Object obj) {
        if (obj == null) {
            throw new NullPointerException();
        }
    }

    private final void checkNotShutdown() {
        if (this.isShutdown) {
            throw new InterruptedException();
        }
    }

    private final E extract() {
        E e = this.items[this.takeIndex];
        this.items[this.takeIndex] = null;
        this.takeIndex = inc(this.takeIndex);
        this.count--;
        this.notFull.signal();
        return e;
    }

    private final boolean hasElements() {
        return !hasNoElements();
    }

    private final boolean hasNoElements() {
        return this.count == 0;
    }

    private final int inc(int i) {
        i++;
        return i == this.items.length ? 0 : i;
    }

    private final void insert(E e) {
        this.items[this.putIndex] = e;
        this.putIndex = inc(this.putIndex);
        this.count++;
        this.notEmpty.signal();
    }

    private final boolean isFull() {
        return this.count == this.items.length;
    }

    private final boolean isNotFull() {
        return !isFull();
    }

    private final void removeAt(int i) {
        if (i == this.takeIndex) {
            this.items[this.takeIndex] = null;
            this.takeIndex = inc(this.takeIndex);
        } else {
            while (true) {
                int inc = inc(i);
                if (inc == this.putIndex) {
                    break;
                }
                this.items[i] = this.items[inc];
                i = inc;
            }
            this.items[i] = null;
            this.putIndex = i;
        }
        this.count--;
        this.notFull.signal();
    }

    public int drainTo(Collection<? super E> collection) {
        checkNotNull(collection);
        if (collection == this) {
            throw new IllegalArgumentException();
        }
        this.lock.lock();
        try {
            int i = this.takeIndex;
            int i2 = 0;
            while (i2 < this.count) {
                collection.add(this.items[i]);
                this.items[i] = null;
                i = inc(i);
                i2++;
            }
            if (i2 > 0) {
                this.count = 0;
                this.putIndex = 0;
                this.takeIndex = 0;
                this.notFull.signalAll();
            }
            this.lock.unlock();
            return i2;
        } catch (Throwable th) {
            this.lock.unlock();
        }
    }

    public int drainTo(Collection<? super E> collection, int i) {
        checkNotNull(collection);
        if (collection == this) {
            throw new IllegalArgumentException();
        }
        int i2 = 0;
        if (i <= 0) {
            return 0;
        }
        this.lock.lock();
        try {
            int i3 = this.takeIndex;
            if (i >= this.count) {
                i = this.count;
            }
            while (i2 < i) {
                collection.add(this.items[i3]);
                this.items[i3] = null;
                i3 = inc(i3);
                i2++;
            }
            if (i2 > 0) {
                this.count -= i2;
                this.takeIndex = i3;
                this.notFull.signalAll();
            }
            this.lock.unlock();
            return i2;
        } catch (Throwable th) {
            this.lock.unlock();
        }
    }

    public boolean isShutdown() {
        this.lock.lock();
        try {
            boolean z = this.isShutdown;
            return z;
        } finally {
            this.lock.unlock();
        }
    }

    public Iterator<E> iterator() {
        this.lock.lock();
        try {
            Iterator<E> itr = new Itr();
            return itr;
        } finally {
            this.lock.unlock();
        }
    }

    public boolean offer(E e) {
        checkNotNull(e);
        this.lock.lock();
        try {
            if (!isFull()) {
                if (!this.isShutdown) {
                    insert(e);
                    this.lock.unlock();
                    return true;
                }
            }
            this.lock.unlock();
            return false;
        } catch (Throwable th) {
            this.lock.unlock();
        }
    }

    public boolean offer(E e, long j, TimeUnit timeUnit) {
        checkNotNull(e);
        j = timeUnit.toNanos(j);
        this.lock.lockInterruptibly();
        while (!isNotFull()) {
            try {
                if (j <= 0) {
                    this.lock.unlock();
                    return false;
                }
                j = this.notFull.awaitNanos(j);
                checkNotShutdown();
            } catch (InterruptedException e2) {
                this.notFull.signal();
                throw e2;
            } catch (Throwable th) {
                this.lock.unlock();
            }
        }
        insert(e);
        this.lock.unlock();
        return true;
    }

    public E peek() {
        this.lock.lock();
        try {
            E e = hasNoElements() ? null : this.items[this.takeIndex];
            this.lock.unlock();
            return e;
        } catch (Throwable th) {
            this.lock.unlock();
        }
    }

    public E poll() {
        this.lock.lock();
        try {
            if (hasNoElements()) {
                return null;
            }
            E extract = extract();
            this.lock.unlock();
            return extract;
        } finally {
            this.lock.unlock();
        }
    }

    public E poll(long j, TimeUnit timeUnit) {
        j = timeUnit.toNanos(j);
        this.lock.lockInterruptibly();
        try {
            checkNotShutdown();
            while (!hasElements()) {
                if (j <= 0) {
                    this.lock.unlock();
                    return null;
                }
                j = this.notEmpty.awaitNanos(j);
                checkNotShutdown();
            }
            E extract = extract();
            this.lock.unlock();
            return extract;
        } catch (InterruptedException e) {
            this.notEmpty.signal();
            throw e;
        } catch (Throwable th) {
            this.lock.unlock();
        }
    }

    public void put(E e) {
        checkNotNull(e);
        this.lock.lockInterruptibly();
        while (isFull()) {
            try {
                this.notFull.await();
                checkNotShutdown();
            } catch (InterruptedException e2) {
                this.notFull.signal();
                throw e2;
            } catch (Throwable th) {
                this.lock.unlock();
            }
        }
        insert(e);
        this.lock.unlock();
    }

    public int remainingCapacity() {
        this.lock.lock();
        try {
            int length = this.items.length - this.count;
            return length;
        } finally {
            this.lock.unlock();
        }
    }

    public void shutdown() {
        this.lock.lock();
        try {
            this.isShutdown = true;
            this.notEmpty.signalAll();
            this.notFull.signalAll();
        } finally {
            this.lock.unlock();
        }
    }

    public int size() {
        this.lock.lock();
        try {
            int i = this.count;
            return i;
        } finally {
            this.lock.unlock();
        }
    }

    public void start() {
        this.lock.lock();
        try {
            this.isShutdown = false;
        } finally {
            this.lock.unlock();
        }
    }

    public E take() {
        this.lock.lockInterruptibly();
        try {
            checkNotShutdown();
            while (hasNoElements()) {
                this.notEmpty.await();
                checkNotShutdown();
            }
            E extract = extract();
            this.lock.unlock();
            return extract;
        } catch (InterruptedException e) {
            this.notEmpty.signal();
            throw e;
        } catch (Throwable th) {
            this.lock.unlock();
        }
    }
}
