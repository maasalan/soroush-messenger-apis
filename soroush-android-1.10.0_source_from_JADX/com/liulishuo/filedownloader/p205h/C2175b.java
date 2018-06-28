package com.liulishuo.filedownloader.p205h;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public final class C2175b {

    static class C2174a implements ThreadFactory {
        private static final AtomicInteger f7244a = new AtomicInteger(1);
        private final String f7245b;
        private final ThreadGroup f7246c = Thread.currentThread().getThreadGroup();
        private final AtomicInteger f7247d = new AtomicInteger(1);

        public C2174a(String str) {
            this.f7245b = C2185f.m6016f(str);
        }

        public final Thread newThread(Runnable runnable) {
            ThreadGroup threadGroup = this.f7246c;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.f7245b);
            stringBuilder.append(this.f7247d.getAndIncrement());
            Thread thread = new Thread(threadGroup, runnable, stringBuilder.toString(), 0);
            if (thread.isDaemon()) {
                thread.setDaemon(false);
            }
            if (thread.getPriority() != 5) {
                thread.setPriority(5);
            }
            return thread;
        }
    }

    public static ThreadPoolExecutor m5967a(int i, String str) {
        return C2175b.m5968a(i, new LinkedBlockingQueue(), str);
    }

    public static ThreadPoolExecutor m5968a(int i, LinkedBlockingQueue<Runnable> linkedBlockingQueue, String str) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i, 15, TimeUnit.SECONDS, linkedBlockingQueue, new C2174a(str));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }
}
