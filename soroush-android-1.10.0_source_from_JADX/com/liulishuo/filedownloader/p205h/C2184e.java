package com.liulishuo.filedownloader.p205h;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class C2184e {
    public final int f7251a;
    public final long f7252b;
    public final boolean f7253c;
    public final boolean f7254d;
    public final int f7255e;
    public final boolean f7256f;
    public final boolean f7257g;
    public final boolean f7258h;

    public static class C2183a {
        private static final C2184e f7250a = new C2184e();
    }

    private C2184e() {
        InputStream open;
        String property;
        String property2;
        String property3;
        String property4;
        IOException iOException;
        String str;
        String str2;
        String str3;
        String str4;
        boolean z;
        int i;
        Throwable th;
        C2184e c2184e = this;
        if (C2181c.f7248a == null) {
            throw new IllegalStateException("Please invoke the 'FileDownloader#setup' before using FileDownloader. If you want to register some components on FileDownloader please invoke the 'FileDownloader#setupOnApplicationOnCreate' on the 'Application#onCreate' first.");
        }
        String str5;
        long currentTimeMillis = System.currentTimeMillis();
        Properties properties = new Properties();
        try {
            open = C2181c.f7248a.getAssets().open("filedownloader.properties");
            if (open != null) {
                try {
                    properties.load(open);
                    property = properties.getProperty("http.lenient");
                    try {
                        property2 = properties.getProperty("process.non-separate");
                        try {
                            property3 = properties.getProperty("download.min-progress-step");
                            try {
                                property4 = properties.getProperty("download.min-progress-time");
                            } catch (IOException e) {
                                iOException = e;
                                property4 = null;
                                str = null;
                                str2 = null;
                                str3 = null;
                                try {
                                    if (!(iOException instanceof FileNotFoundException)) {
                                        iOException.printStackTrace();
                                    } else if (C2182d.f7249a) {
                                        C2182d.m5983c(C2184e.class, "not found filedownloader.properties", new Object[0]);
                                    }
                                    if (open != null) {
                                        try {
                                            open.close();
                                        } catch (IOException e2) {
                                            e2.printStackTrace();
                                        }
                                    }
                                    str5 = property;
                                    str4 = null;
                                    if (str5 != null) {
                                        c2184e.f7253c = false;
                                    } else {
                                        if (!str5.equals("true")) {
                                        }
                                        c2184e.f7253c = str5.equals("true");
                                    }
                                    if (property2 != null) {
                                        c2184e.f7254d = false;
                                    } else {
                                        if (!property2.equals("true")) {
                                        }
                                        c2184e.f7254d = property2.equals("true");
                                    }
                                    c2184e.f7251a = property3 == null ? 65536 : Math.max(0, Integer.valueOf(property3).intValue());
                                    c2184e.f7252b = property4 == null ? 2000 : Math.max(0, Long.valueOf(property4).longValue());
                                    if (str == null) {
                                        c2184e.f7255e = 3;
                                    } else {
                                        c2184e.f7255e = C2184e.m5987a(Integer.valueOf(str).intValue());
                                    }
                                    if (str2 != null) {
                                        z = false;
                                    } else {
                                        if (!str2.equals("true")) {
                                        }
                                        z = str2.equals("true");
                                    }
                                    c2184e.f7256f = z;
                                    if (str3 != null) {
                                        z = false;
                                    } else {
                                        if (!str3.equals("true")) {
                                        }
                                        z = str3.equals("true");
                                    }
                                    c2184e.f7257g = z;
                                    if (str4 != null) {
                                        i = 0;
                                        c2184e.f7258h = false;
                                    } else {
                                        if (!str4.equals("true")) {
                                        }
                                        c2184e.f7258h = str4.equals("true");
                                        i = 0;
                                    }
                                    if (C2182d.f7249a) {
                                        C2182d.m5982b(C2184e.class, "init properties %d\n load properties: %s=%B; %s=%B; %s=%d; %s=%d; %s=%d; %s=%B; %s=%B; %s=%B", Long.valueOf(System.currentTimeMillis() - currentTimeMillis), "http.lenient", Boolean.valueOf(c2184e.f7253c), "process.non-separate", Boolean.valueOf(c2184e.f7254d), "download.min-progress-step", Integer.valueOf(c2184e.f7251a), "download.min-progress-time", Long.valueOf(c2184e.f7252b), "download.max-network-thread-count", Integer.valueOf(c2184e.f7255e), "file.non-pre-allocation", Boolean.valueOf(c2184e.f7256f), "broadcast.completed", Boolean.valueOf(c2184e.f7257g), "download.trial-connection-head-method", Boolean.valueOf(c2184e.f7258h));
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    if (open != null) {
                                        try {
                                            open.close();
                                        } catch (IOException e22) {
                                            e22.printStackTrace();
                                        }
                                    }
                                    throw th;
                                }
                            }
                        } catch (IOException e222) {
                            iOException = e222;
                            property3 = null;
                            property4 = null;
                            str = null;
                            str2 = null;
                            str3 = null;
                            if (!(iOException instanceof FileNotFoundException)) {
                                iOException.printStackTrace();
                            } else if (C2182d.f7249a) {
                                C2182d.m5983c(C2184e.class, "not found filedownloader.properties", new Object[0]);
                            }
                            if (open != null) {
                                open.close();
                            }
                            str5 = property;
                            str4 = null;
                            if (str5 != null) {
                                if (str5.equals("true")) {
                                }
                                c2184e.f7253c = str5.equals("true");
                            } else {
                                c2184e.f7253c = false;
                            }
                            if (property2 != null) {
                                if (property2.equals("true")) {
                                }
                                c2184e.f7254d = property2.equals("true");
                            } else {
                                c2184e.f7254d = false;
                            }
                            if (property3 == null) {
                            }
                            c2184e.f7251a = property3 == null ? 65536 : Math.max(0, Integer.valueOf(property3).intValue());
                            if (property4 == null) {
                            }
                            c2184e.f7252b = property4 == null ? 2000 : Math.max(0, Long.valueOf(property4).longValue());
                            if (str == null) {
                                c2184e.f7255e = C2184e.m5987a(Integer.valueOf(str).intValue());
                            } else {
                                c2184e.f7255e = 3;
                            }
                            if (str2 != null) {
                                if (str2.equals("true")) {
                                }
                                z = str2.equals("true");
                            } else {
                                z = false;
                            }
                            c2184e.f7256f = z;
                            if (str3 != null) {
                                if (str3.equals("true")) {
                                }
                                z = str3.equals("true");
                            } else {
                                z = false;
                            }
                            c2184e.f7257g = z;
                            if (str4 != null) {
                                if (str4.equals("true")) {
                                }
                                c2184e.f7258h = str4.equals("true");
                                i = 0;
                            } else {
                                i = 0;
                                c2184e.f7258h = false;
                            }
                            if (C2182d.f7249a) {
                                C2182d.m5982b(C2184e.class, "init properties %d\n load properties: %s=%B; %s=%B; %s=%d; %s=%d; %s=%d; %s=%B; %s=%B; %s=%B", Long.valueOf(System.currentTimeMillis() - currentTimeMillis), "http.lenient", Boolean.valueOf(c2184e.f7253c), "process.non-separate", Boolean.valueOf(c2184e.f7254d), "download.min-progress-step", Integer.valueOf(c2184e.f7251a), "download.min-progress-time", Long.valueOf(c2184e.f7252b), "download.max-network-thread-count", Integer.valueOf(c2184e.f7255e), "file.non-pre-allocation", Boolean.valueOf(c2184e.f7256f), "broadcast.completed", Boolean.valueOf(c2184e.f7257g), "download.trial-connection-head-method", Boolean.valueOf(c2184e.f7258h));
                            }
                        }
                    } catch (IOException e2222) {
                        iOException = e2222;
                        property2 = null;
                        property3 = null;
                        property4 = null;
                        str = null;
                        str2 = null;
                        str3 = null;
                        if (!(iOException instanceof FileNotFoundException)) {
                            iOException.printStackTrace();
                        } else if (C2182d.f7249a) {
                            C2182d.m5983c(C2184e.class, "not found filedownloader.properties", new Object[0]);
                        }
                        if (open != null) {
                            open.close();
                        }
                        str5 = property;
                        str4 = null;
                        if (str5 != null) {
                            if (str5.equals("true")) {
                            }
                            c2184e.f7253c = str5.equals("true");
                        } else {
                            c2184e.f7253c = false;
                        }
                        if (property2 != null) {
                            if (property2.equals("true")) {
                            }
                            c2184e.f7254d = property2.equals("true");
                        } else {
                            c2184e.f7254d = false;
                        }
                        if (property3 == null) {
                        }
                        c2184e.f7251a = property3 == null ? 65536 : Math.max(0, Integer.valueOf(property3).intValue());
                        if (property4 == null) {
                        }
                        c2184e.f7252b = property4 == null ? 2000 : Math.max(0, Long.valueOf(property4).longValue());
                        if (str == null) {
                            c2184e.f7255e = C2184e.m5987a(Integer.valueOf(str).intValue());
                        } else {
                            c2184e.f7255e = 3;
                        }
                        if (str2 != null) {
                            if (str2.equals("true")) {
                            }
                            z = str2.equals("true");
                        } else {
                            z = false;
                        }
                        c2184e.f7256f = z;
                        if (str3 != null) {
                            if (str3.equals("true")) {
                            }
                            z = str3.equals("true");
                        } else {
                            z = false;
                        }
                        c2184e.f7257g = z;
                        if (str4 != null) {
                            if (str4.equals("true")) {
                            }
                            c2184e.f7258h = str4.equals("true");
                            i = 0;
                        } else {
                            i = 0;
                            c2184e.f7258h = false;
                        }
                        if (C2182d.f7249a) {
                            C2182d.m5982b(C2184e.class, "init properties %d\n load properties: %s=%B; %s=%B; %s=%d; %s=%d; %s=%d; %s=%B; %s=%B; %s=%B", Long.valueOf(System.currentTimeMillis() - currentTimeMillis), "http.lenient", Boolean.valueOf(c2184e.f7253c), "process.non-separate", Boolean.valueOf(c2184e.f7254d), "download.min-progress-step", Integer.valueOf(c2184e.f7251a), "download.min-progress-time", Long.valueOf(c2184e.f7252b), "download.max-network-thread-count", Integer.valueOf(c2184e.f7255e), "file.non-pre-allocation", Boolean.valueOf(c2184e.f7256f), "broadcast.completed", Boolean.valueOf(c2184e.f7257g), "download.trial-connection-head-method", Boolean.valueOf(c2184e.f7258h));
                        }
                    }
                } catch (IOException e22222) {
                    iOException = e22222;
                    property = null;
                    property2 = null;
                    property3 = null;
                    property4 = null;
                    str = null;
                    str2 = null;
                    str3 = null;
                    if (!(iOException instanceof FileNotFoundException)) {
                        iOException.printStackTrace();
                    } else if (C2182d.f7249a) {
                        C2182d.m5983c(C2184e.class, "not found filedownloader.properties", new Object[0]);
                    }
                    if (open != null) {
                        open.close();
                    }
                    str5 = property;
                    str4 = null;
                    if (str5 != null) {
                        c2184e.f7253c = false;
                    } else {
                        if (str5.equals("true")) {
                        }
                        c2184e.f7253c = str5.equals("true");
                    }
                    if (property2 != null) {
                        c2184e.f7254d = false;
                    } else {
                        if (property2.equals("true")) {
                        }
                        c2184e.f7254d = property2.equals("true");
                    }
                    if (property3 == null) {
                    }
                    c2184e.f7251a = property3 == null ? 65536 : Math.max(0, Integer.valueOf(property3).intValue());
                    if (property4 == null) {
                    }
                    c2184e.f7252b = property4 == null ? 2000 : Math.max(0, Long.valueOf(property4).longValue());
                    if (str == null) {
                        c2184e.f7255e = 3;
                    } else {
                        c2184e.f7255e = C2184e.m5987a(Integer.valueOf(str).intValue());
                    }
                    if (str2 != null) {
                        z = false;
                    } else {
                        if (str2.equals("true")) {
                        }
                        z = str2.equals("true");
                    }
                    c2184e.f7256f = z;
                    if (str3 != null) {
                        z = false;
                    } else {
                        if (str3.equals("true")) {
                        }
                        z = str3.equals("true");
                    }
                    c2184e.f7257g = z;
                    if (str4 != null) {
                        i = 0;
                        c2184e.f7258h = false;
                    } else {
                        if (str4.equals("true")) {
                        }
                        c2184e.f7258h = str4.equals("true");
                        i = 0;
                    }
                    if (C2182d.f7249a) {
                        C2182d.m5982b(C2184e.class, "init properties %d\n load properties: %s=%B; %s=%B; %s=%d; %s=%d; %s=%d; %s=%B; %s=%B; %s=%B", Long.valueOf(System.currentTimeMillis() - currentTimeMillis), "http.lenient", Boolean.valueOf(c2184e.f7253c), "process.non-separate", Boolean.valueOf(c2184e.f7254d), "download.min-progress-step", Integer.valueOf(c2184e.f7251a), "download.min-progress-time", Long.valueOf(c2184e.f7252b), "download.max-network-thread-count", Integer.valueOf(c2184e.f7255e), "file.non-pre-allocation", Boolean.valueOf(c2184e.f7256f), "broadcast.completed", Boolean.valueOf(c2184e.f7257g), "download.trial-connection-head-method", Boolean.valueOf(c2184e.f7258h));
                    }
                }
                try {
                    str = properties.getProperty("download.max-network-thread-count");
                    try {
                        str2 = properties.getProperty("file.non-pre-allocation");
                        try {
                            str3 = properties.getProperty("broadcast.completed");
                            try {
                                str4 = properties.getProperty("download.trial-connection-head-method");
                                str5 = property;
                            } catch (IOException e222222) {
                                iOException = e222222;
                                if (!(iOException instanceof FileNotFoundException)) {
                                    iOException.printStackTrace();
                                } else if (C2182d.f7249a) {
                                    C2182d.m5983c(C2184e.class, "not found filedownloader.properties", new Object[0]);
                                }
                                if (open != null) {
                                    open.close();
                                }
                                str5 = property;
                                str4 = null;
                                if (str5 != null) {
                                    c2184e.f7253c = false;
                                } else {
                                    if (str5.equals("true")) {
                                    }
                                    c2184e.f7253c = str5.equals("true");
                                }
                                if (property2 != null) {
                                    c2184e.f7254d = false;
                                } else {
                                    if (property2.equals("true")) {
                                    }
                                    c2184e.f7254d = property2.equals("true");
                                }
                                if (property3 == null) {
                                }
                                c2184e.f7251a = property3 == null ? 65536 : Math.max(0, Integer.valueOf(property3).intValue());
                                if (property4 == null) {
                                }
                                c2184e.f7252b = property4 == null ? 2000 : Math.max(0, Long.valueOf(property4).longValue());
                                if (str == null) {
                                    c2184e.f7255e = 3;
                                } else {
                                    c2184e.f7255e = C2184e.m5987a(Integer.valueOf(str).intValue());
                                }
                                if (str2 != null) {
                                    z = false;
                                } else {
                                    if (str2.equals("true")) {
                                    }
                                    z = str2.equals("true");
                                }
                                c2184e.f7256f = z;
                                if (str3 != null) {
                                    z = false;
                                } else {
                                    if (str3.equals("true")) {
                                    }
                                    z = str3.equals("true");
                                }
                                c2184e.f7257g = z;
                                if (str4 != null) {
                                    i = 0;
                                    c2184e.f7258h = false;
                                } else {
                                    if (str4.equals("true")) {
                                    }
                                    c2184e.f7258h = str4.equals("true");
                                    i = 0;
                                }
                                if (C2182d.f7249a) {
                                    C2182d.m5982b(C2184e.class, "init properties %d\n load properties: %s=%B; %s=%B; %s=%d; %s=%d; %s=%d; %s=%B; %s=%B; %s=%B", Long.valueOf(System.currentTimeMillis() - currentTimeMillis), "http.lenient", Boolean.valueOf(c2184e.f7253c), "process.non-separate", Boolean.valueOf(c2184e.f7254d), "download.min-progress-step", Integer.valueOf(c2184e.f7251a), "download.min-progress-time", Long.valueOf(c2184e.f7252b), "download.max-network-thread-count", Integer.valueOf(c2184e.f7255e), "file.non-pre-allocation", Boolean.valueOf(c2184e.f7256f), "broadcast.completed", Boolean.valueOf(c2184e.f7257g), "download.trial-connection-head-method", Boolean.valueOf(c2184e.f7258h));
                                }
                            }
                        } catch (IOException e2222222) {
                            iOException = e2222222;
                            str3 = null;
                            if (!(iOException instanceof FileNotFoundException)) {
                                iOException.printStackTrace();
                            } else if (C2182d.f7249a) {
                                C2182d.m5983c(C2184e.class, "not found filedownloader.properties", new Object[0]);
                            }
                            if (open != null) {
                                open.close();
                            }
                            str5 = property;
                            str4 = null;
                            if (str5 != null) {
                                if (str5.equals("true")) {
                                }
                                c2184e.f7253c = str5.equals("true");
                            } else {
                                c2184e.f7253c = false;
                            }
                            if (property2 != null) {
                                if (property2.equals("true")) {
                                }
                                c2184e.f7254d = property2.equals("true");
                            } else {
                                c2184e.f7254d = false;
                            }
                            if (property3 == null) {
                            }
                            c2184e.f7251a = property3 == null ? 65536 : Math.max(0, Integer.valueOf(property3).intValue());
                            if (property4 == null) {
                            }
                            c2184e.f7252b = property4 == null ? 2000 : Math.max(0, Long.valueOf(property4).longValue());
                            if (str == null) {
                                c2184e.f7255e = C2184e.m5987a(Integer.valueOf(str).intValue());
                            } else {
                                c2184e.f7255e = 3;
                            }
                            if (str2 != null) {
                                if (str2.equals("true")) {
                                }
                                z = str2.equals("true");
                            } else {
                                z = false;
                            }
                            c2184e.f7256f = z;
                            if (str3 != null) {
                                if (str3.equals("true")) {
                                }
                                z = str3.equals("true");
                            } else {
                                z = false;
                            }
                            c2184e.f7257g = z;
                            if (str4 != null) {
                                if (str4.equals("true")) {
                                }
                                c2184e.f7258h = str4.equals("true");
                                i = 0;
                            } else {
                                i = 0;
                                c2184e.f7258h = false;
                            }
                            if (C2182d.f7249a) {
                                C2182d.m5982b(C2184e.class, "init properties %d\n load properties: %s=%B; %s=%B; %s=%d; %s=%d; %s=%d; %s=%B; %s=%B; %s=%B", Long.valueOf(System.currentTimeMillis() - currentTimeMillis), "http.lenient", Boolean.valueOf(c2184e.f7253c), "process.non-separate", Boolean.valueOf(c2184e.f7254d), "download.min-progress-step", Integer.valueOf(c2184e.f7251a), "download.min-progress-time", Long.valueOf(c2184e.f7252b), "download.max-network-thread-count", Integer.valueOf(c2184e.f7255e), "file.non-pre-allocation", Boolean.valueOf(c2184e.f7256f), "broadcast.completed", Boolean.valueOf(c2184e.f7257g), "download.trial-connection-head-method", Boolean.valueOf(c2184e.f7258h));
                            }
                        }
                    } catch (IOException e22222222) {
                        iOException = e22222222;
                        str2 = null;
                        str3 = null;
                        if (!(iOException instanceof FileNotFoundException)) {
                            iOException.printStackTrace();
                        } else if (C2182d.f7249a) {
                            C2182d.m5983c(C2184e.class, "not found filedownloader.properties", new Object[0]);
                        }
                        if (open != null) {
                            open.close();
                        }
                        str5 = property;
                        str4 = null;
                        if (str5 != null) {
                            c2184e.f7253c = false;
                        } else {
                            if (str5.equals("true")) {
                            }
                            c2184e.f7253c = str5.equals("true");
                        }
                        if (property2 != null) {
                            c2184e.f7254d = false;
                        } else {
                            if (property2.equals("true")) {
                            }
                            c2184e.f7254d = property2.equals("true");
                        }
                        if (property3 == null) {
                        }
                        c2184e.f7251a = property3 == null ? 65536 : Math.max(0, Integer.valueOf(property3).intValue());
                        if (property4 == null) {
                        }
                        c2184e.f7252b = property4 == null ? 2000 : Math.max(0, Long.valueOf(property4).longValue());
                        if (str == null) {
                            c2184e.f7255e = 3;
                        } else {
                            c2184e.f7255e = C2184e.m5987a(Integer.valueOf(str).intValue());
                        }
                        if (str2 != null) {
                            z = false;
                        } else {
                            if (str2.equals("true")) {
                            }
                            z = str2.equals("true");
                        }
                        c2184e.f7256f = z;
                        if (str3 != null) {
                            z = false;
                        } else {
                            if (str3.equals("true")) {
                            }
                            z = str3.equals("true");
                        }
                        c2184e.f7257g = z;
                        if (str4 != null) {
                            i = 0;
                            c2184e.f7258h = false;
                        } else {
                            if (str4.equals("true")) {
                            }
                            c2184e.f7258h = str4.equals("true");
                            i = 0;
                        }
                        if (C2182d.f7249a) {
                            C2182d.m5982b(C2184e.class, "init properties %d\n load properties: %s=%B; %s=%B; %s=%d; %s=%d; %s=%d; %s=%B; %s=%B; %s=%B", Long.valueOf(System.currentTimeMillis() - currentTimeMillis), "http.lenient", Boolean.valueOf(c2184e.f7253c), "process.non-separate", Boolean.valueOf(c2184e.f7254d), "download.min-progress-step", Integer.valueOf(c2184e.f7251a), "download.min-progress-time", Long.valueOf(c2184e.f7252b), "download.max-network-thread-count", Integer.valueOf(c2184e.f7255e), "file.non-pre-allocation", Boolean.valueOf(c2184e.f7256f), "broadcast.completed", Boolean.valueOf(c2184e.f7257g), "download.trial-connection-head-method", Boolean.valueOf(c2184e.f7258h));
                        }
                    }
                } catch (IOException e222222222) {
                    iOException = e222222222;
                    str = null;
                    str2 = null;
                    str3 = null;
                    if (!(iOException instanceof FileNotFoundException)) {
                        iOException.printStackTrace();
                    } else if (C2182d.f7249a) {
                        C2182d.m5983c(C2184e.class, "not found filedownloader.properties", new Object[0]);
                    }
                    if (open != null) {
                        open.close();
                    }
                    str5 = property;
                    str4 = null;
                    if (str5 != null) {
                        if (str5.equals("true")) {
                        }
                        c2184e.f7253c = str5.equals("true");
                    } else {
                        c2184e.f7253c = false;
                    }
                    if (property2 != null) {
                        if (property2.equals("true")) {
                        }
                        c2184e.f7254d = property2.equals("true");
                    } else {
                        c2184e.f7254d = false;
                    }
                    if (property3 == null) {
                    }
                    c2184e.f7251a = property3 == null ? 65536 : Math.max(0, Integer.valueOf(property3).intValue());
                    if (property4 == null) {
                    }
                    c2184e.f7252b = property4 == null ? 2000 : Math.max(0, Long.valueOf(property4).longValue());
                    if (str == null) {
                        c2184e.f7255e = C2184e.m5987a(Integer.valueOf(str).intValue());
                    } else {
                        c2184e.f7255e = 3;
                    }
                    if (str2 != null) {
                        if (str2.equals("true")) {
                        }
                        z = str2.equals("true");
                    } else {
                        z = false;
                    }
                    c2184e.f7256f = z;
                    if (str3 != null) {
                        if (str3.equals("true")) {
                        }
                        z = str3.equals("true");
                    } else {
                        z = false;
                    }
                    c2184e.f7257g = z;
                    if (str4 != null) {
                        if (str4.equals("true")) {
                        }
                        c2184e.f7258h = str4.equals("true");
                        i = 0;
                    } else {
                        i = 0;
                        c2184e.f7258h = false;
                    }
                    if (C2182d.f7249a) {
                        C2182d.m5982b(C2184e.class, "init properties %d\n load properties: %s=%B; %s=%B; %s=%d; %s=%d; %s=%d; %s=%B; %s=%B; %s=%B", Long.valueOf(System.currentTimeMillis() - currentTimeMillis), "http.lenient", Boolean.valueOf(c2184e.f7253c), "process.non-separate", Boolean.valueOf(c2184e.f7254d), "download.min-progress-step", Integer.valueOf(c2184e.f7251a), "download.min-progress-time", Long.valueOf(c2184e.f7252b), "download.max-network-thread-count", Integer.valueOf(c2184e.f7255e), "file.non-pre-allocation", Boolean.valueOf(c2184e.f7256f), "broadcast.completed", Boolean.valueOf(c2184e.f7257g), "download.trial-connection-head-method", Boolean.valueOf(c2184e.f7258h));
                    }
                }
            }
            str4 = null;
            str5 = null;
            property2 = null;
            property3 = null;
            property4 = null;
            str = null;
            str2 = null;
            str3 = null;
            if (open != null) {
                try {
                    open.close();
                } catch (IOException e2222222222) {
                    e2222222222.printStackTrace();
                }
            }
        } catch (IOException e22222222222) {
            iOException = e22222222222;
            open = null;
            property = null;
            property2 = null;
            property3 = null;
            property4 = null;
            str = null;
            str2 = null;
            str3 = null;
            if (!(iOException instanceof FileNotFoundException)) {
                iOException.printStackTrace();
            } else if (C2182d.f7249a) {
                C2182d.m5983c(C2184e.class, "not found filedownloader.properties", new Object[0]);
            }
            if (open != null) {
                open.close();
            }
            str5 = property;
            str4 = null;
            if (str5 != null) {
                c2184e.f7253c = false;
            } else {
                if (str5.equals("true")) {
                }
                c2184e.f7253c = str5.equals("true");
            }
            if (property2 != null) {
                c2184e.f7254d = false;
            } else {
                if (property2.equals("true")) {
                }
                c2184e.f7254d = property2.equals("true");
            }
            if (property3 == null) {
            }
            c2184e.f7251a = property3 == null ? 65536 : Math.max(0, Integer.valueOf(property3).intValue());
            if (property4 == null) {
            }
            c2184e.f7252b = property4 == null ? 2000 : Math.max(0, Long.valueOf(property4).longValue());
            if (str == null) {
                c2184e.f7255e = 3;
            } else {
                c2184e.f7255e = C2184e.m5987a(Integer.valueOf(str).intValue());
            }
            if (str2 != null) {
                z = false;
            } else {
                if (str2.equals("true")) {
                }
                z = str2.equals("true");
            }
            c2184e.f7256f = z;
            if (str3 != null) {
                z = false;
            } else {
                if (str3.equals("true")) {
                }
                z = str3.equals("true");
            }
            c2184e.f7257g = z;
            if (str4 != null) {
                i = 0;
                c2184e.f7258h = false;
            } else {
                if (str4.equals("true")) {
                }
                c2184e.f7258h = str4.equals("true");
                i = 0;
            }
            if (C2182d.f7249a) {
                C2182d.m5982b(C2184e.class, "init properties %d\n load properties: %s=%B; %s=%B; %s=%d; %s=%d; %s=%d; %s=%B; %s=%B; %s=%B", Long.valueOf(System.currentTimeMillis() - currentTimeMillis), "http.lenient", Boolean.valueOf(c2184e.f7253c), "process.non-separate", Boolean.valueOf(c2184e.f7254d), "download.min-progress-step", Integer.valueOf(c2184e.f7251a), "download.min-progress-time", Long.valueOf(c2184e.f7252b), "download.max-network-thread-count", Integer.valueOf(c2184e.f7255e), "file.non-pre-allocation", Boolean.valueOf(c2184e.f7256f), "broadcast.completed", Boolean.valueOf(c2184e.f7257g), "download.trial-connection-head-method", Boolean.valueOf(c2184e.f7258h));
            }
        } catch (Throwable th22) {
            th = th22;
            open = null;
            if (open != null) {
                open.close();
            }
            throw th;
        }
        if (str5 != null) {
            c2184e.f7253c = false;
        } else if (str5.equals("true") || str5.equals("false")) {
            c2184e.f7253c = str5.equals("true");
        } else {
            throw new IllegalStateException(C2185f.m5996a("the value of '%s' must be '%s' or '%s'", "http.lenient", "true", "false"));
        }
        if (property2 != null) {
            c2184e.f7254d = false;
        } else if (property2.equals("true") || property2.equals("false")) {
            c2184e.f7254d = property2.equals("true");
        } else {
            throw new IllegalStateException(C2185f.m5996a("the value of '%s' must be '%s' or '%s'", "process.non-separate", "true", "false"));
        }
        if (property3 == null) {
        }
        c2184e.f7251a = property3 == null ? 65536 : Math.max(0, Integer.valueOf(property3).intValue());
        if (property4 == null) {
        }
        c2184e.f7252b = property4 == null ? 2000 : Math.max(0, Long.valueOf(property4).longValue());
        if (str == null) {
            c2184e.f7255e = C2184e.m5987a(Integer.valueOf(str).intValue());
        } else {
            c2184e.f7255e = 3;
        }
        if (str2 != null) {
            z = false;
        } else if (str2.equals("true") || str2.equals("false")) {
            z = str2.equals("true");
        } else {
            throw new IllegalStateException(C2185f.m5996a("the value of '%s' must be '%s' or '%s'", "file.non-pre-allocation", "true", "false"));
        }
        c2184e.f7256f = z;
        if (str3 != null) {
            z = false;
        } else if (str3.equals("true") || str3.equals("false")) {
            z = str3.equals("true");
        } else {
            throw new IllegalStateException(C2185f.m5996a("the value of '%s' must be '%s' or '%s'", "broadcast.completed", "true", "false"));
        }
        c2184e.f7257g = z;
        if (str4 != null) {
            i = 0;
            c2184e.f7258h = false;
        } else if (str4.equals("true") || str4.equals("false")) {
            c2184e.f7258h = str4.equals("true");
            i = 0;
        } else {
            throw new IllegalStateException(C2185f.m5996a("the value of '%s' must be '%s' or '%s'", "download.trial-connection-head-method", "true", "false"));
        }
        if (C2182d.f7249a) {
            C2182d.m5982b(C2184e.class, "init properties %d\n load properties: %s=%B; %s=%B; %s=%d; %s=%d; %s=%d; %s=%B; %s=%B; %s=%B", Long.valueOf(System.currentTimeMillis() - currentTimeMillis), "http.lenient", Boolean.valueOf(c2184e.f7253c), "process.non-separate", Boolean.valueOf(c2184e.f7254d), "download.min-progress-step", Integer.valueOf(c2184e.f7251a), "download.min-progress-time", Long.valueOf(c2184e.f7252b), "download.max-network-thread-count", Integer.valueOf(c2184e.f7255e), "file.non-pre-allocation", Boolean.valueOf(c2184e.f7256f), "broadcast.completed", Boolean.valueOf(c2184e.f7257g), "download.trial-connection-head-method", Boolean.valueOf(c2184e.f7258h));
        }
    }

    public static int m5987a(int i) {
        if (i > 12) {
            C2182d.m5984d(C2184e.class, "require the count of network thread  is %d, what is more than the max valid count(%d), so adjust to %d auto", Integer.valueOf(i), Integer.valueOf(12), Integer.valueOf(12));
            return 12;
        } else if (i > 0) {
            return i;
        } else {
            C2182d.m5984d(C2184e.class, "require the count of network thread  is %d, what is less than the min valid count(%d), so adjust to %d auto", Integer.valueOf(i), Integer.valueOf(1), Integer.valueOf(1));
            return 1;
        }
    }

    public static C2184e m5988a() {
        return C2183a.f7250a;
    }
}
