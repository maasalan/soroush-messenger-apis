package org.jivesoftware.smack.util;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class BoundedThreadPoolExecutor extends ThreadPoolExecutor {
    private final Semaphore semaphore;

    public BoundedThreadPoolExecutor(int i, int i2, long j, TimeUnit timeUnit, int i3, ThreadFactory threadFactory) {
        super(i, i2, j, timeUnit, new ArrayBlockingQueue(i3), threadFactory);
        this.semaphore = new Semaphore(i3);
    }

    public void executeBlocking(final Runnable runnable) {
        this.semaphore.acquire();
        try {
            execute(new Runnable() {
                public void run() {
                    try {
                        runnable.run();
                    } finally {
                        BoundedThreadPoolExecutor.this.semaphore.release();
                    }
                }
            });
        } catch (Throwable e) {
            this.semaphore.release();
            if (e instanceof RejectedExecutionException) {
                throw ((RejectedExecutionException) e);
            }
            throw new RuntimeException(e);
        }
    }
}
