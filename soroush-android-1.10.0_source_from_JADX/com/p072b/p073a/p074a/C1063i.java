package com.p072b.p073a.p074a;

import android.content.Context;
import com.p072b.p073a.p074a.p078e.C1028b;
import com.p072b.p073a.p074a.p084j.C1065b;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public abstract class C1063i implements Serializable {
    public static final int DEFAULT_RETRY_LIMIT = 20;
    static final String SINGLE_ID_TAG_PREFIX = "job-single-id:";
    private static final long serialVersionUID = 3;
    private transient Context applicationContext;
    private transient boolean cancelOnDeadline;
    volatile transient boolean cancelled;
    private transient int currentRunCount;
    private transient long deadlineInMs;
    private transient long delayInMs;
    private transient String groupId;
    private transient String id = UUID.randomUUID().toString();
    private volatile transient boolean isDeadlineReached;
    private transient boolean persistent;
    transient int priority;
    private transient Set<String> readonlyTags;
    transient int requiredNetworkType;
    private volatile transient boolean sealed;

    protected C1063i(C1071o c1071o) {
        this.requiredNetworkType = c1071o.f3494a;
        this.persistent = c1071o.f3497d;
        this.groupId = c1071o.f3495b;
        this.priority = c1071o.f3498e;
        this.delayInMs = Math.max(0, c1071o.f3499f);
        this.deadlineInMs = Math.max(0, c1071o.f3501h);
        this.cancelOnDeadline = Boolean.TRUE.equals(c1071o.f3502i);
        String str = c1071o.f3496c;
        if (!(c1071o.f3500g == null && str == null)) {
            Set hashSet = c1071o.f3500g != null ? c1071o.f3500g : new HashSet();
            if (str != null) {
                str = createTagForSingleId(str);
                hashSet.add(str);
                if (this.groupId == null) {
                    this.groupId = str;
                }
            }
            this.readonlyTags = Collections.unmodifiableSet(hashSet);
        }
        if (this.deadlineInMs > 0 && this.deadlineInMs < this.delayInMs) {
            StringBuilder stringBuilder = new StringBuilder("deadline cannot be less than the delay. It does not make sense. deadline:");
            stringBuilder.append(this.deadlineInMs);
            stringBuilder.append(",delay:");
            stringBuilder.append(this.delayInMs);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    private String createTagForSingleId(String str) {
        StringBuilder stringBuilder = new StringBuilder(SINGLE_ID_TAG_PREFIX);
        stringBuilder.append(str);
        return stringBuilder.toString();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        if (!this.sealed) {
            throw new IllegalStateException("A job cannot be serialized w/o first being added into a job manager.");
        }
    }

    public void assertNotCancelled() {
        if (this.cancelled) {
            throw new RuntimeException("job is cancelled");
        }
    }

    public Context getApplicationContext() {
        return this.applicationContext;
    }

    public final int getCurrentRunCount() {
        return this.currentRunCount;
    }

    long getDeadlineInMs() {
        return this.deadlineInMs;
    }

    public final long getDelayInMs() {
        return this.delayInMs;
    }

    public final String getId() {
        return this.id;
    }

    public final int getPriority() {
        return this.priority;
    }

    protected int getRetryLimit() {
        return 20;
    }

    public final String getRunGroupId() {
        return this.groupId;
    }

    public final String getSingleInstanceId() {
        if (this.readonlyTags != null) {
            for (String str : this.readonlyTags) {
                if (str.startsWith(SINGLE_ID_TAG_PREFIX)) {
                    return str;
                }
            }
        }
        return null;
    }

    public final Set<String> getTags() {
        return this.readonlyTags;
    }

    public final boolean isCancelled() {
        return this.cancelled;
    }

    public boolean isDeadlineReached() {
        return this.isDeadlineReached;
    }

    public final boolean isPersistent() {
        return this.persistent;
    }

    public abstract void onAdded();

    public abstract void onCancel(int i, Throwable th);

    public abstract void onRun();

    public final boolean requiresNetwork() {
        return this.requiredNetworkType > 0;
    }

    public final boolean requiresUnmeteredNetwork() {
        return this.requiredNetworkType >= 2;
    }

    final int safeRun(C1066j c1066j, int i, C1065b c1065b) {
        Throwable th;
        int i2;
        boolean z;
        this.currentRunCount = i;
        if (C1028b.m2506a()) {
            new Object[1][0] = getClass().getSimpleName();
            C1028b.m2507b();
        }
        try {
            onRun();
            if (C1028b.m2506a()) {
                new Object[1][0] = this;
                C1028b.m2507b();
            }
            th = null;
            i2 = 0;
            boolean z2 = i2;
            z = z2;
        } catch (Throwable th2) {
            C1028b.m2505a(th2, "shouldReRunOnThrowable did throw an exception", new Object[0]);
        }
        Object[] objArr = new Object[]{this, Boolean.valueOf(i2 ^ 1), Boolean.valueOf(z), Boolean.valueOf(this.cancelled)};
        C1028b.m2507b();
        if (i2 == 0) {
            return 1;
        }
        if (c1066j.f3479p) {
            return 6;
        }
        if (c1066j.f3478o) {
            return 3;
        }
        if (z) {
            return 4;
        }
        if (z2) {
            return 7;
        }
        if (i >= getRetryLimit()) {
            c1066j.f3481r = th2;
            return 5;
        }
        c1066j.f3481r = th2;
        return 2;
        th2 = th;
        z2 = r12;
        i2 = 1;
        Object[] objArr2 = new Object[]{this, Boolean.valueOf(i2 ^ 1), Boolean.valueOf(z), Boolean.valueOf(this.cancelled)};
        C1028b.m2507b();
        if (i2 == 0) {
            return 1;
        }
        if (c1066j.f3479p) {
            return 6;
        }
        if (c1066j.f3478o) {
            return 3;
        }
        if (z) {
            return 4;
        }
        if (z2) {
            return 7;
        }
        if (i >= getRetryLimit()) {
            c1066j.f3481r = th2;
            return 2;
        }
        c1066j.f3481r = th2;
        return 5;
    }

    void setApplicationContext(Context context) {
        this.applicationContext = context;
    }

    void setDeadlineReached(boolean z) {
        this.isDeadlineReached = z;
    }

    boolean shouldCancelOnDeadline() {
        return this.cancelOnDeadline;
    }

    public abstract C1073q shouldReRunOnThrowable(Throwable th, int i, int i2);

    final void updateFromJobHolder(C1066j c1066j) {
        if (this.sealed) {
            throw new IllegalStateException("Cannot set a Job from JobHolder after it is sealed.");
        }
        this.id = c1066j.f3465b;
        this.groupId = c1066j.f3468e;
        this.priority = c1066j.f3467d;
        this.persistent = c1066j.f3466c;
        this.readonlyTags = c1066j.f3477n;
        this.requiredNetworkType = c1066j.f3473j;
        this.sealed = true;
    }
}
