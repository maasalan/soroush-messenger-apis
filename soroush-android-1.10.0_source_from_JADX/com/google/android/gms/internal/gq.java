package com.google.android.gms.internal;

import android.os.Process;
import com.google.android.gms.common.internal.ac;
import java.util.concurrent.BlockingQueue;

final class gq extends Thread {
    private final Object f5848a = new Object();
    private final BlockingQueue<gp<?>> f5849b;
    private /* synthetic */ gm f5850c;

    public gq(gm gmVar, String str, BlockingQueue<gp<?>> blockingQueue) {
        this.f5850c = gmVar;
        ac.m4376a((Object) str);
        ac.m4376a((Object) blockingQueue);
        this.f5849b = blockingQueue;
        setName(str);
    }

    private final void m4863a(InterruptedException interruptedException) {
        this.f5850c.mo1623t().f18136c.m4847a(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }

    public final void m4864a() {
        synchronized (this.f5848a) {
            this.f5848a.notifyAll();
        }
    }

    public final void run() {
        Object obj = null;
        while (obj == null) {
            try {
                this.f5850c.f18185i.acquire();
                obj = 1;
            } catch (InterruptedException e) {
                m4863a(e);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                gp gpVar = (gp) this.f5849b.poll();
                if (gpVar != null) {
                    Process.setThreadPriority(gpVar.f5844a ? threadPriority : 10);
                    gpVar.run();
                } else {
                    synchronized (this.f5848a) {
                        if (this.f5849b.peek() == null && !this.f5850c.f18186j) {
                            try {
                                this.f5848a.wait(30000);
                            } catch (InterruptedException e2) {
                                m4863a(e2);
                            }
                        }
                    }
                    synchronized (this.f5850c.f18184h) {
                        if (this.f5849b.peek() == null) {
                            break;
                        }
                    }
                }
            }
            synchronized (this.f5850c.f18184h) {
                this.f5850c.f18185i.release();
                this.f5850c.f18184h.notifyAll();
                if (this == this.f5850c.f18178b) {
                    this.f5850c.f18178b = null;
                } else if (this == this.f5850c.f18179c) {
                    this.f5850c.f18179c = null;
                } else {
                    this.f5850c.mo1623t().f18134a.m4846a("Current scheduler thread is neither worker nor network");
                }
            }
        } catch (Throwable th) {
            synchronized (this.f5850c.f18184h) {
                this.f5850c.f18185i.release();
                this.f5850c.f18184h.notifyAll();
                if (this == this.f5850c.f18178b) {
                    this.f5850c.f18178b = null;
                } else if (this == this.f5850c.f18179c) {
                    this.f5850c.f18179c = null;
                } else {
                    this.f5850c.mo1623t().f18134a.m4846a("Current scheduler thread is neither worker nor network");
                }
            }
        }
    }
}
