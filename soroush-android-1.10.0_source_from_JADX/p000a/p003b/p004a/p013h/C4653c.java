package p000a.p003b.p004a.p013h;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import p000a.p003b.p004a.C0021a;
import p000a.p003b.p004a.C0025b;
import p000a.p003b.p004a.C0041d;
import p000a.p003b.p004a.C0041d.C4642a;
import p000a.p003b.p004a.C0065j;
import p000a.p003b.p004a.C4641c;
import p000a.p003b.p004a.p016k.C0074f;

public class C4653c extends C0021a {
    private final C4652b f12779h;
    private final C4641c f12780i;
    private int f12781j;

    public enum C0058a {
        ;
        
        public static final int f252a = 1;
        public static final int f253b = 2;
        public static final int f254c = 3;

        static {
            f255d = new int[]{f252a, f253b, f254c};
        }
    }

    public C4653c() {
        this(a);
    }

    public C4653c(C0025b c0025b) {
        super(c0025b);
        this.f12781j = C0058a.f252a;
        this.f12779h = new C4652b(this, c0025b) {
            final /* synthetic */ C4653c f17272k;

            protected final boolean mo17a(C0065j c0065j, C0041d c0041d) {
                return this.f17272k.mo17a(c0065j, c0041d) && super.mo17a(c0065j, c0041d);
            }

            protected final C4642a mo7b(C4642a c4642a) {
                return this.f17272k.mo7b(super.mo7b(c4642a));
            }
        };
        this.f12780i = new C4641c(this, c0025b) {
            final /* synthetic */ C4653c f17273k;

            protected final boolean mo17a(C0065j c0065j, C0041d c0041d) {
                return this.f17273k.mo17a(c0065j, c0041d) && super.mo17a(c0065j, c0041d);
            }

            protected final C4642a mo7b(C4642a c4642a) {
                return this.f17273k.mo7b(super.mo7b(c4642a));
            }
        };
    }

    protected final C0041d mo6a(C4642a c4642a) {
        Object e;
        Level level;
        String str;
        StringBuilder stringBuilder;
        StringBuilder stringBuilder2;
        C0041d a;
        List linkedList = new LinkedList();
        String str2 = null;
        C0041d a2;
        if (this.f12781j != C0058a.f254c) {
            try {
                a2 = this.f12780i.mo6a(c4642a);
                if (a2 != null) {
                    try {
                        String a3 = mo2470a(a2);
                        if (a3 == null) {
                            return a2;
                        }
                        str2 = a3;
                    } catch (IOException e2) {
                        e = e2;
                        linkedList.add(e);
                        if (this.f12781j != C0058a.f253b) {
                            return a2;
                        }
                        level = Level.FINE;
                        str = "Resolution fall back to iterative mode because: ";
                        if (linkedList.isEmpty()) {
                            stringBuilder = new StringBuilder();
                            stringBuilder.append(str);
                            stringBuilder.append(linkedList.get(0));
                        } else if (a2 != null) {
                            stringBuilder = new StringBuilder();
                            stringBuilder.append(str);
                            stringBuilder.append(" DNSClient did not return a response");
                        } else if (str2 != null) {
                            throw new AssertionError("This should never been reached");
                        } else {
                            stringBuilder2 = new StringBuilder();
                            stringBuilder2.append(str);
                            stringBuilder2.append(str2);
                            stringBuilder2.append(". Response:\n");
                            stringBuilder2.append(a2);
                            str2 = stringBuilder2.toString();
                            b.log(level, str2);
                            a = this.f12779h.mo6a(c4642a);
                            if (a == null) {
                                C0074f.m123a(linkedList);
                            }
                            return a;
                        }
                        str2 = stringBuilder.toString();
                        b.log(level, str2);
                        try {
                            a = this.f12779h.mo6a(c4642a);
                        } catch (IOException e3) {
                            linkedList.add(e3);
                            a = a2;
                        }
                        if (a == null) {
                            C0074f.m123a(linkedList);
                        }
                        return a;
                    }
                }
            } catch (IOException e4) {
                e = e4;
                a2 = null;
                linkedList.add(e);
                if (this.f12781j != C0058a.f253b) {
                    return a2;
                }
                level = Level.FINE;
                str = "Resolution fall back to iterative mode because: ";
                if (linkedList.isEmpty()) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(str);
                    stringBuilder.append(linkedList.get(0));
                } else if (a2 != null) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(str);
                    stringBuilder.append(" DNSClient did not return a response");
                } else if (str2 != null) {
                    stringBuilder2 = new StringBuilder();
                    stringBuilder2.append(str);
                    stringBuilder2.append(str2);
                    stringBuilder2.append(". Response:\n");
                    stringBuilder2.append(a2);
                    str2 = stringBuilder2.toString();
                    b.log(level, str2);
                    a = this.f12779h.mo6a(c4642a);
                    if (a == null) {
                        C0074f.m123a(linkedList);
                    }
                    return a;
                } else {
                    throw new AssertionError("This should never been reached");
                }
                str2 = stringBuilder.toString();
                b.log(level, str2);
                a = this.f12779h.mo6a(c4642a);
                if (a == null) {
                    C0074f.m123a(linkedList);
                }
                return a;
            }
        }
        a2 = null;
        if (this.f12781j != C0058a.f253b) {
            return a2;
        }
        level = Level.FINE;
        if (b.isLoggable(level) && this.f12781j != C0058a.f254c) {
            str = "Resolution fall back to iterative mode because: ";
            if (linkedList.isEmpty()) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(linkedList.get(0));
            } else if (a2 != null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" DNSClient did not return a response");
            } else if (str2 != null) {
                stringBuilder2 = new StringBuilder();
                stringBuilder2.append(str);
                stringBuilder2.append(str2);
                stringBuilder2.append(". Response:\n");
                stringBuilder2.append(a2);
                str2 = stringBuilder2.toString();
                b.log(level, str2);
            } else {
                throw new AssertionError("This should never been reached");
            }
            str2 = stringBuilder.toString();
            b.log(level, str2);
        }
        a = this.f12779h.mo6a(c4642a);
        if (a == null) {
            C0074f.m123a(linkedList);
        }
        return a;
    }

    public String mo2470a(C0041d c0041d) {
        return null;
    }

    public final void m8475a(int i) {
        if (i == 0) {
            throw new IllegalArgumentException("Mode must not be null.");
        }
        this.f12781j = i;
    }

    public boolean mo17a(C0065j c0065j, C0041d c0041d) {
        return mo2470a(c0041d) == null;
    }

    public C4642a mo7b(C4642a c4642a) {
        return c4642a;
    }
}
