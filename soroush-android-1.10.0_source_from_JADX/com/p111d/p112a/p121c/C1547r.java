package com.p111d.p112a.p121c;

import com.p111d.p112a.p114b.C1379l;
import com.p111d.p112a.p114b.C1380m;
import com.p111d.p112a.p114b.C5303j;
import java.io.Closeable;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class C1547r<T> implements Closeable, Iterator<T> {
    protected static final C1547r<?> f4819a = new C1547r(null, null, null, null);
    protected final C5354j f4820b;
    protected final C5347g f4821c;
    protected final C1507k<T> f4822d;
    protected final C5303j f4823e;
    protected final C1379l f4824f;
    protected final T f4825g = null;
    protected final boolean f4826h = false;
    protected int f4827i;

    protected C1547r(C5354j c5354j, C5303j c5303j, C5347g c5347g, C1507k<?> c1507k) {
        this.f4820b = c5354j;
        this.f4823e = c5303j;
        this.f4821c = c5347g;
        this.f4822d = c1507k;
        int i = 0;
        if (c5303j == null) {
            this.f4824f = null;
        } else {
            C1379l parsingContext = c5303j.getParsingContext();
            C1380m currentToken = c5303j.getCurrentToken();
            if (currentToken == C1380m.START_OBJECT || currentToken == C1380m.START_ARRAY) {
                parsingContext = parsingContext.mo1278a();
            }
            this.f4824f = parsingContext;
            i = 2;
        }
        this.f4827i = i;
    }

    private boolean m4050a() {
        switch (this.f4827i) {
            case 0:
                return false;
            case 1:
                C5303j c5303j = this.f4823e;
                if (c5303j.getParsingContext() != this.f4824f) {
                    while (true) {
                        C1380m nextToken = c5303j.nextToken();
                        if (nextToken != C1380m.END_ARRAY) {
                            if (nextToken != C1380m.END_OBJECT) {
                                if (nextToken != C1380m.START_ARRAY) {
                                    if (nextToken != C1380m.START_OBJECT) {
                                        if (nextToken == null) {
                                            break;
                                        }
                                    }
                                }
                                c5303j.skipChildren();
                            }
                        }
                        if (c5303j.getParsingContext() == this.f4824f) {
                            c5303j.clearCurrentToken();
                            break;
                        }
                    }
                }
                break;
            case 2:
                break;
            default:
                return true;
        }
        if (this.f4823e.getCurrentToken() == null) {
            C1380m nextToken2 = this.f4823e.nextToken();
            if (nextToken2 == null || nextToken2 == C1380m.END_ARRAY) {
                this.f4827i = 0;
                if (this.f4826h && this.f4823e != null) {
                    this.f4823e.close();
                }
                return false;
            }
        }
        this.f4827i = 3;
        return true;
    }

    private T m4051b() {
        switch (this.f4827i) {
            case 0:
                throw new NoSuchElementException();
            case 1:
            case 2:
                if (!m4050a()) {
                    throw new NoSuchElementException();
                }
                break;
            default:
                break;
        }
        try {
            T a;
            if (this.f4825g == null) {
                a = this.f4822d.mo1304a(this.f4823e, this.f4821c);
            } else {
                this.f4822d.mo1309a(this.f4823e, this.f4821c, this.f4825g);
                a = this.f4825g;
            }
            this.f4827i = 2;
            this.f4823e.clearCurrentToken();
            return a;
        } catch (Throwable th) {
            this.f4827i = 1;
            this.f4823e.clearCurrentToken();
        }
    }

    public final void close() {
        if (this.f4827i != 0) {
            this.f4827i = 0;
            if (this.f4823e != null) {
                this.f4823e.close();
            }
        }
    }

    public final boolean hasNext() {
        try {
            return m4050a();
        } catch (C5364l e) {
            throw new C1551x(e.getMessage(), e);
        } catch (Throwable e2) {
            throw new RuntimeException(e2.getMessage(), e2);
        }
    }

    public final T next() {
        try {
            return m4051b();
        } catch (C5364l e) {
            throw new C1551x(e.getMessage(), e);
        } catch (Throwable e2) {
            throw new RuntimeException(e2.getMessage(), e2);
        }
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
