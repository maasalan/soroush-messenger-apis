package com.p111d.p112a.p114b.p117d;

import com.p111d.p112a.p114b.C1359d;
import com.p111d.p112a.p114b.C5297e;
import com.p111d.p112a.p114b.C5303j;
import com.p111d.p112a.p114b.C5304n;
import com.p111d.p112a.p114b.p115b.C1342a;
import com.p111d.p112a.p114b.p115b.C1343b;
import com.p111d.p112a.p114b.p116c.C1347c;
import com.p111d.p112a.p114b.p116c.C1350f;
import com.p111d.p112a.p114b.p116c.C1354k;
import com.p111d.p112a.p114b.p118e.C1362a;
import com.p111d.p112a.p114b.p118e.C1364b;
import java.io.ByteArrayInputStream;
import java.io.CharConversionException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public final class C1357a {
    protected final C1347c f4239a;
    protected final InputStream f4240b;
    protected final byte[] f4241c;
    protected int f4242d;
    protected boolean f4243e = true;
    protected int f4244f;
    private int f4245g;
    private int f4246h;
    private final boolean f4247i;

    public C1357a(C1347c c1347c, InputStream inputStream) {
        this.f4239a = c1347c;
        this.f4240b = inputStream;
        this.f4241c = c1347c.m3207e();
        this.f4245g = 0;
        this.f4246h = 0;
        this.f4242d = 0;
        this.f4247i = true;
    }

    public C1357a(C1347c c1347c, byte[] bArr, int i, int i2) {
        this.f4239a = c1347c;
        this.f4240b = null;
        this.f4241c = bArr;
        this.f4245g = i;
        this.f4246h = i2 + i;
        this.f4242d = -i;
        this.f4247i = false;
    }

    public static int m3257a(C1342a c1342a) {
        return !c1342a.m3175a() ? -1 : C1357a.m3258a(c1342a, c1342a.m3176b());
    }

    public static int m3258a(C1342a c1342a, byte b) {
        while (true) {
            int i &= 255;
            if (i != 32 && i != 13 && i != 10 && i != 9) {
                return i;
            }
            if (!c1342a.m3175a()) {
                return -1;
            }
            i = c1342a.m3176b();
        }
    }

    public static C1343b m3259a(C1342a c1342a, String str, C1343b c1343b) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!c1342a.m3175a()) {
                return C1343b.INCONCLUSIVE;
            }
            if (c1342a.m3176b() != str.charAt(i)) {
                return C1343b.NO_MATCH;
            }
        }
        return c1343b;
    }

    private static void m3260a(String str) {
        StringBuilder stringBuilder = new StringBuilder("Unsupported UCS-4 endianness (");
        stringBuilder.append(str);
        stringBuilder.append(") detected");
        throw new CharConversionException(stringBuilder.toString());
    }

    private boolean m3261a(int i) {
        if ((65280 & i) == 0) {
            this.f4243e = true;
        } else if ((i & 255) != 0) {
            return false;
        } else {
            this.f4243e = false;
        }
        this.f4244f = 2;
        return true;
    }

    private boolean m3262b(int i) {
        int i2 = this.f4246h - this.f4245g;
        while (i2 < i) {
            int read = this.f4240b == null ? -1 : this.f4240b.read(this.f4241c, this.f4246h, this.f4241c.length - this.f4246h);
            if (read <= 0) {
                return false;
            }
            this.f4246h += read;
            i2 += read;
        }
        return true;
    }

    public final C5303j m3263a(int i, C5304n c5304n, C1362a c1362a, C1364b c1364b, int i2) {
        int i3;
        C1359d c1359d;
        C1347c c1347c;
        C1359d b;
        int c;
        InputStream inputStream;
        Reader inputStreamReader;
        int i4 = i2;
        boolean z = false;
        boolean z2 = true;
        if (m3262b(4)) {
            boolean z3;
            String str;
            int i5;
            i3 = (((r0.f4241c[r0.f4245g] << 24) | ((r0.f4241c[r0.f4245g + 1] & 255) << 16)) | ((r0.f4241c[r0.f4245g + 2] & 255) << 8)) | (r0.f4241c[r0.f4245g + 3] & 255);
            if (i3 != -16842752) {
                if (i3 == -131072) {
                    r0.f4245g += 4;
                    r0.f4244f = 4;
                    r0.f4243e = false;
                    z3 = true;
                    if (!z3) {
                        if ((i3 >> 8) != 0) {
                            r0.f4243e = true;
                        } else if ((16777215 & i3) != 0) {
                            r0.f4243e = false;
                        } else {
                            if ((-16711681 & i3) != 0) {
                                str = "3412";
                            } else {
                                if ((-65281 & i3) == 0) {
                                    str = "2143";
                                }
                                if (!z) {
                                    z = m3261a(i3 >>> 16);
                                }
                            }
                            C1357a.m3260a(str);
                        }
                        r0.f4244f = 4;
                        z = true;
                        if (!z) {
                            z = m3261a(i3 >>> 16);
                        }
                    }
                    if (z2) {
                        i3 = r0.f4244f;
                        if (i3 != 4) {
                            switch (i3) {
                                case 1:
                                    break;
                                case 2:
                                    if (!r0.f4243e) {
                                        c1359d = C1359d.UTF16_BE;
                                        break;
                                    }
                                    c1359d = C1359d.UTF16_LE;
                                    break;
                                default:
                                    throw new RuntimeException("Internal error");
                            }
                        } else if (r0.f4243e) {
                        }
                        r0.f4239a.m3195a(c1359d);
                        if (c1359d == C1359d.UTF8) {
                        }
                        c1347c = r0.f4239a;
                        b = r0.f4239a.m3199b();
                        c = b.m3272c();
                        if (c != 8) {
                        }
                        inputStream = r0.f4240b;
                        if (inputStream != null) {
                            inputStream = new ByteArrayInputStream(r0.f4241c, r0.f4245g, r0.f4246h);
                        } else if (r0.f4245g < r0.f4246h) {
                            inputStream = new C1350f(r0.f4239a, inputStream, r0.f4241c, r0.f4245g, r0.f4246h);
                        }
                        inputStreamReader = new InputStreamReader(inputStream, b.m3270a());
                        return new C7260g(c1347c, i, inputStreamReader, c5304n, c1364b.m3303a(i2));
                    }
                    c1359d = C1359d.UTF8;
                    r0.f4239a.m3195a(c1359d);
                    if (c1359d == C1359d.UTF8) {
                    }
                    c1347c = r0.f4239a;
                    b = r0.f4239a.m3199b();
                    c = b.m3272c();
                    if (c != 8) {
                    }
                    inputStream = r0.f4240b;
                    if (inputStream != null) {
                        inputStream = new ByteArrayInputStream(r0.f4241c, r0.f4245g, r0.f4246h);
                    } else if (r0.f4245g < r0.f4246h) {
                        inputStream = new C1350f(r0.f4239a, inputStream, r0.f4241c, r0.f4245g, r0.f4246h);
                    }
                    inputStreamReader = new InputStreamReader(inputStream, b.m3270a());
                    return new C7260g(c1347c, i, inputStreamReader, c5304n, c1364b.m3303a(i2));
                } else if (i3 == 65279) {
                    r0.f4243e = true;
                    r0.f4245g += 4;
                    r0.f4244f = 4;
                    z3 = true;
                    if (!z3) {
                        if ((i3 >> 8) != 0) {
                            r0.f4243e = true;
                        } else if ((16777215 & i3) != 0) {
                            if ((-16711681 & i3) != 0) {
                                if ((-65281 & i3) == 0) {
                                    str = "2143";
                                }
                                if (!z) {
                                    z = m3261a(i3 >>> 16);
                                }
                            } else {
                                str = "3412";
                            }
                            C1357a.m3260a(str);
                        } else {
                            r0.f4243e = false;
                        }
                        r0.f4244f = 4;
                        z = true;
                        if (!z) {
                            z = m3261a(i3 >>> 16);
                        }
                    }
                    if (z2) {
                        i3 = r0.f4244f;
                        if (i3 != 4) {
                            switch (i3) {
                                case 1:
                                    break;
                                case 2:
                                    if (!r0.f4243e) {
                                        c1359d = C1359d.UTF16_LE;
                                        break;
                                    }
                                    c1359d = C1359d.UTF16_BE;
                                    break;
                                default:
                                    throw new RuntimeException("Internal error");
                            }
                        } else if (r0.f4243e) {
                        }
                        r0.f4239a.m3195a(c1359d);
                        if (c1359d == C1359d.UTF8) {
                        }
                        c1347c = r0.f4239a;
                        b = r0.f4239a.m3199b();
                        c = b.m3272c();
                        if (c != 8) {
                        }
                        inputStream = r0.f4240b;
                        if (inputStream != null) {
                            inputStream = new ByteArrayInputStream(r0.f4241c, r0.f4245g, r0.f4246h);
                        } else if (r0.f4245g < r0.f4246h) {
                            inputStream = new C1350f(r0.f4239a, inputStream, r0.f4241c, r0.f4245g, r0.f4246h);
                        }
                        inputStreamReader = new InputStreamReader(inputStream, b.m3270a());
                        return new C7260g(c1347c, i, inputStreamReader, c5304n, c1364b.m3303a(i2));
                    }
                    c1359d = C1359d.UTF8;
                    r0.f4239a.m3195a(c1359d);
                    if (c1359d == C1359d.UTF8) {
                    }
                    c1347c = r0.f4239a;
                    b = r0.f4239a.m3199b();
                    c = b.m3272c();
                    if (c != 8) {
                    }
                    inputStream = r0.f4240b;
                    if (inputStream != null) {
                        inputStream = new ByteArrayInputStream(r0.f4241c, r0.f4245g, r0.f4246h);
                    } else if (r0.f4245g < r0.f4246h) {
                        inputStream = new C1350f(r0.f4239a, inputStream, r0.f4241c, r0.f4245g, r0.f4246h);
                    }
                    inputStreamReader = new InputStreamReader(inputStream, b.m3270a());
                    return new C7260g(c1347c, i, inputStreamReader, c5304n, c1364b.m3303a(i2));
                } else if (i3 != 65534) {
                    i5 = i3 >>> 16;
                    if (i5 == 65279) {
                        r0.f4245g += 2;
                        r0.f4244f = 2;
                    } else if (i5 == 65534) {
                        r0.f4245g += 2;
                        r0.f4244f = 2;
                        r0.f4243e = false;
                        z3 = true;
                        if (!z3) {
                            if ((i3 >> 8) != 0) {
                                r0.f4243e = true;
                            } else if ((16777215 & i3) != 0) {
                                r0.f4243e = false;
                            } else {
                                if ((-16711681 & i3) != 0) {
                                    str = "3412";
                                } else {
                                    if ((-65281 & i3) == 0) {
                                        str = "2143";
                                    }
                                    if (!z) {
                                        z = m3261a(i3 >>> 16);
                                    }
                                }
                                C1357a.m3260a(str);
                            }
                            r0.f4244f = 4;
                            z = true;
                            if (!z) {
                                z = m3261a(i3 >>> 16);
                            }
                        }
                        if (z2) {
                            i3 = r0.f4244f;
                            if (i3 != 4) {
                                switch (i3) {
                                    case 1:
                                        break;
                                    case 2:
                                        if (!r0.f4243e) {
                                            c1359d = C1359d.UTF16_BE;
                                            break;
                                        }
                                        c1359d = C1359d.UTF16_LE;
                                        break;
                                    default:
                                        throw new RuntimeException("Internal error");
                                }
                            }
                            c1359d = r0.f4243e ? C1359d.UTF32_BE : C1359d.UTF32_LE;
                            r0.f4239a.m3195a(c1359d);
                            if (c1359d == C1359d.UTF8 || !C5297e.C1362a.CANONICALIZE_FIELD_NAMES.m3274a(i4)) {
                                c1347c = r0.f4239a;
                                b = r0.f4239a.m3199b();
                                c = b.m3272c();
                                if (c != 8 || c == 16) {
                                    inputStream = r0.f4240b;
                                    if (inputStream != null) {
                                        inputStream = new ByteArrayInputStream(r0.f4241c, r0.f4245g, r0.f4246h);
                                    } else if (r0.f4245g < r0.f4246h) {
                                        inputStream = new C1350f(r0.f4239a, inputStream, r0.f4241c, r0.f4245g, r0.f4246h);
                                    }
                                    inputStreamReader = new InputStreamReader(inputStream, b.m3270a());
                                } else if (c != 32) {
                                    throw new RuntimeException("Internal error");
                                } else {
                                    inputStreamReader = new C1354k(r0.f4239a, r0.f4240b, r0.f4241c, r0.f4245g, r0.f4246h, r0.f4239a.m3199b().m3271b());
                                }
                                return new C7260g(c1347c, i, inputStreamReader, c5304n, c1364b.m3303a(i2));
                            }
                            return new C7262i(r0.f4239a, i, r0.f4240b, c5304n, c1362a.m3288a(i4), r0.f4241c, r0.f4245g, r0.f4246h, r0.f4247i);
                        }
                        c1359d = C1359d.UTF8;
                        r0.f4239a.m3195a(c1359d);
                        if (c1359d == C1359d.UTF8) {
                        }
                        c1347c = r0.f4239a;
                        b = r0.f4239a.m3199b();
                        c = b.m3272c();
                        if (c != 8) {
                        }
                        inputStream = r0.f4240b;
                        if (inputStream != null) {
                            inputStream = new ByteArrayInputStream(r0.f4241c, r0.f4245g, r0.f4246h);
                        } else if (r0.f4245g < r0.f4246h) {
                            inputStream = new C1350f(r0.f4239a, inputStream, r0.f4241c, r0.f4245g, r0.f4246h);
                        }
                        inputStreamReader = new InputStreamReader(inputStream, b.m3270a());
                        return new C7260g(c1347c, i, inputStreamReader, c5304n, c1364b.m3303a(i2));
                    } else if ((i3 >>> 8) != 15711167) {
                        r0.f4245g += 3;
                        r0.f4244f = 1;
                    } else {
                        z3 = false;
                        if (!z3) {
                            if ((i3 >> 8) != 0) {
                                r0.f4243e = true;
                            } else if ((16777215 & i3) != 0) {
                                if ((-16711681 & i3) != 0) {
                                    if ((-65281 & i3) == 0) {
                                        str = "2143";
                                    }
                                    if (!z) {
                                        z = m3261a(i3 >>> 16);
                                    }
                                } else {
                                    str = "3412";
                                }
                                C1357a.m3260a(str);
                            } else {
                                r0.f4243e = false;
                            }
                            r0.f4244f = 4;
                            z = true;
                            if (!z) {
                                z = m3261a(i3 >>> 16);
                            }
                        }
                        if (z2) {
                            i3 = r0.f4244f;
                            if (i3 != 4) {
                                switch (i3) {
                                    case 1:
                                        break;
                                    case 2:
                                        if (!r0.f4243e) {
                                            c1359d = C1359d.UTF16_LE;
                                            break;
                                        }
                                        c1359d = C1359d.UTF16_BE;
                                        break;
                                    default:
                                        throw new RuntimeException("Internal error");
                                }
                            } else if (r0.f4243e) {
                            }
                            r0.f4239a.m3195a(c1359d);
                            if (c1359d == C1359d.UTF8) {
                            }
                            c1347c = r0.f4239a;
                            b = r0.f4239a.m3199b();
                            c = b.m3272c();
                            if (c != 8) {
                            }
                            inputStream = r0.f4240b;
                            if (inputStream != null) {
                                inputStream = new ByteArrayInputStream(r0.f4241c, r0.f4245g, r0.f4246h);
                            } else if (r0.f4245g < r0.f4246h) {
                                inputStream = new C1350f(r0.f4239a, inputStream, r0.f4241c, r0.f4245g, r0.f4246h);
                            }
                            inputStreamReader = new InputStreamReader(inputStream, b.m3270a());
                            return new C7260g(c1347c, i, inputStreamReader, c5304n, c1364b.m3303a(i2));
                        }
                        c1359d = C1359d.UTF8;
                        r0.f4239a.m3195a(c1359d);
                        if (c1359d == C1359d.UTF8) {
                        }
                        c1347c = r0.f4239a;
                        b = r0.f4239a.m3199b();
                        c = b.m3272c();
                        if (c != 8) {
                        }
                        inputStream = r0.f4240b;
                        if (inputStream != null) {
                            inputStream = new ByteArrayInputStream(r0.f4241c, r0.f4245g, r0.f4246h);
                        } else if (r0.f4245g < r0.f4246h) {
                            inputStream = new C1350f(r0.f4239a, inputStream, r0.f4241c, r0.f4245g, r0.f4246h);
                        }
                        inputStreamReader = new InputStreamReader(inputStream, b.m3270a());
                        return new C7260g(c1347c, i, inputStreamReader, c5304n, c1364b.m3303a(i2));
                    }
                    r0.f4243e = true;
                    z3 = true;
                    if (!z3) {
                        if ((i3 >> 8) != 0) {
                            r0.f4243e = true;
                        } else if ((16777215 & i3) != 0) {
                            r0.f4243e = false;
                        } else {
                            if ((-16711681 & i3) != 0) {
                                str = "3412";
                            } else {
                                if ((-65281 & i3) == 0) {
                                    str = "2143";
                                }
                                if (!z) {
                                    z = m3261a(i3 >>> 16);
                                }
                            }
                            C1357a.m3260a(str);
                        }
                        r0.f4244f = 4;
                        z = true;
                        if (!z) {
                            z = m3261a(i3 >>> 16);
                        }
                    }
                    if (z2) {
                        i3 = r0.f4244f;
                        if (i3 != 4) {
                            switch (i3) {
                                case 1:
                                    break;
                                case 2:
                                    if (!r0.f4243e) {
                                        c1359d = C1359d.UTF16_BE;
                                        break;
                                    }
                                    c1359d = C1359d.UTF16_LE;
                                    break;
                                default:
                                    throw new RuntimeException("Internal error");
                            }
                        } else if (r0.f4243e) {
                        }
                        r0.f4239a.m3195a(c1359d);
                        if (c1359d == C1359d.UTF8) {
                        }
                        c1347c = r0.f4239a;
                        b = r0.f4239a.m3199b();
                        c = b.m3272c();
                        if (c != 8) {
                        }
                        inputStream = r0.f4240b;
                        if (inputStream != null) {
                            inputStream = new ByteArrayInputStream(r0.f4241c, r0.f4245g, r0.f4246h);
                        } else if (r0.f4245g < r0.f4246h) {
                            inputStream = new C1350f(r0.f4239a, inputStream, r0.f4241c, r0.f4245g, r0.f4246h);
                        }
                        inputStreamReader = new InputStreamReader(inputStream, b.m3270a());
                        return new C7260g(c1347c, i, inputStreamReader, c5304n, c1364b.m3303a(i2));
                    }
                    c1359d = C1359d.UTF8;
                    r0.f4239a.m3195a(c1359d);
                    if (c1359d == C1359d.UTF8) {
                    }
                    c1347c = r0.f4239a;
                    b = r0.f4239a.m3199b();
                    c = b.m3272c();
                    if (c != 8) {
                    }
                    inputStream = r0.f4240b;
                    if (inputStream != null) {
                        inputStream = new ByteArrayInputStream(r0.f4241c, r0.f4245g, r0.f4246h);
                    } else if (r0.f4245g < r0.f4246h) {
                        inputStream = new C1350f(r0.f4239a, inputStream, r0.f4241c, r0.f4245g, r0.f4246h);
                    }
                    inputStreamReader = new InputStreamReader(inputStream, b.m3270a());
                    return new C7260g(c1347c, i, inputStreamReader, c5304n, c1364b.m3303a(i2));
                } else {
                    C1357a.m3260a("2143");
                }
            }
            C1357a.m3260a("3412");
            i5 = i3 >>> 16;
            if (i5 == 65279) {
                r0.f4245g += 2;
                r0.f4244f = 2;
            } else if (i5 == 65534) {
                r0.f4245g += 2;
                r0.f4244f = 2;
                r0.f4243e = false;
                z3 = true;
                if (!z3) {
                    if ((i3 >> 8) != 0) {
                        r0.f4243e = true;
                    } else if ((16777215 & i3) != 0) {
                        r0.f4243e = false;
                    } else {
                        if ((-16711681 & i3) != 0) {
                            str = "3412";
                        } else {
                            if ((-65281 & i3) == 0) {
                                str = "2143";
                            }
                            if (!z) {
                                z = m3261a(i3 >>> 16);
                            }
                        }
                        C1357a.m3260a(str);
                    }
                    r0.f4244f = 4;
                    z = true;
                    if (!z) {
                        z = m3261a(i3 >>> 16);
                    }
                }
                if (z2) {
                    i3 = r0.f4244f;
                    if (i3 != 4) {
                        switch (i3) {
                            case 1:
                                break;
                            case 2:
                                if (!r0.f4243e) {
                                    c1359d = C1359d.UTF16_BE;
                                    break;
                                }
                                c1359d = C1359d.UTF16_LE;
                                break;
                            default:
                                throw new RuntimeException("Internal error");
                        }
                    } else if (r0.f4243e) {
                    }
                    r0.f4239a.m3195a(c1359d);
                    if (c1359d == C1359d.UTF8) {
                    }
                    c1347c = r0.f4239a;
                    b = r0.f4239a.m3199b();
                    c = b.m3272c();
                    if (c != 8) {
                    }
                    inputStream = r0.f4240b;
                    if (inputStream != null) {
                        inputStream = new ByteArrayInputStream(r0.f4241c, r0.f4245g, r0.f4246h);
                    } else if (r0.f4245g < r0.f4246h) {
                        inputStream = new C1350f(r0.f4239a, inputStream, r0.f4241c, r0.f4245g, r0.f4246h);
                    }
                    inputStreamReader = new InputStreamReader(inputStream, b.m3270a());
                    return new C7260g(c1347c, i, inputStreamReader, c5304n, c1364b.m3303a(i2));
                }
                c1359d = C1359d.UTF8;
                r0.f4239a.m3195a(c1359d);
                if (c1359d == C1359d.UTF8) {
                }
                c1347c = r0.f4239a;
                b = r0.f4239a.m3199b();
                c = b.m3272c();
                if (c != 8) {
                }
                inputStream = r0.f4240b;
                if (inputStream != null) {
                    inputStream = new ByteArrayInputStream(r0.f4241c, r0.f4245g, r0.f4246h);
                } else if (r0.f4245g < r0.f4246h) {
                    inputStream = new C1350f(r0.f4239a, inputStream, r0.f4241c, r0.f4245g, r0.f4246h);
                }
                inputStreamReader = new InputStreamReader(inputStream, b.m3270a());
                return new C7260g(c1347c, i, inputStreamReader, c5304n, c1364b.m3303a(i2));
            } else if ((i3 >>> 8) != 15711167) {
                z3 = false;
                if (!z3) {
                    if ((i3 >> 8) != 0) {
                        r0.f4243e = true;
                    } else if ((16777215 & i3) != 0) {
                        if ((-16711681 & i3) != 0) {
                            if ((-65281 & i3) == 0) {
                                str = "2143";
                            }
                            if (!z) {
                                z = m3261a(i3 >>> 16);
                            }
                        } else {
                            str = "3412";
                        }
                        C1357a.m3260a(str);
                    } else {
                        r0.f4243e = false;
                    }
                    r0.f4244f = 4;
                    z = true;
                    if (!z) {
                        z = m3261a(i3 >>> 16);
                    }
                }
                if (z2) {
                    i3 = r0.f4244f;
                    if (i3 != 4) {
                        switch (i3) {
                            case 1:
                                break;
                            case 2:
                                if (!r0.f4243e) {
                                    c1359d = C1359d.UTF16_LE;
                                    break;
                                }
                                c1359d = C1359d.UTF16_BE;
                                break;
                            default:
                                throw new RuntimeException("Internal error");
                        }
                    } else if (r0.f4243e) {
                    }
                    r0.f4239a.m3195a(c1359d);
                    if (c1359d == C1359d.UTF8) {
                    }
                    c1347c = r0.f4239a;
                    b = r0.f4239a.m3199b();
                    c = b.m3272c();
                    if (c != 8) {
                    }
                    inputStream = r0.f4240b;
                    if (inputStream != null) {
                        inputStream = new ByteArrayInputStream(r0.f4241c, r0.f4245g, r0.f4246h);
                    } else if (r0.f4245g < r0.f4246h) {
                        inputStream = new C1350f(r0.f4239a, inputStream, r0.f4241c, r0.f4245g, r0.f4246h);
                    }
                    inputStreamReader = new InputStreamReader(inputStream, b.m3270a());
                    return new C7260g(c1347c, i, inputStreamReader, c5304n, c1364b.m3303a(i2));
                }
                c1359d = C1359d.UTF8;
                r0.f4239a.m3195a(c1359d);
                if (c1359d == C1359d.UTF8) {
                }
                c1347c = r0.f4239a;
                b = r0.f4239a.m3199b();
                c = b.m3272c();
                if (c != 8) {
                }
                inputStream = r0.f4240b;
                if (inputStream != null) {
                    inputStream = new ByteArrayInputStream(r0.f4241c, r0.f4245g, r0.f4246h);
                } else if (r0.f4245g < r0.f4246h) {
                    inputStream = new C1350f(r0.f4239a, inputStream, r0.f4241c, r0.f4245g, r0.f4246h);
                }
                inputStreamReader = new InputStreamReader(inputStream, b.m3270a());
                return new C7260g(c1347c, i, inputStreamReader, c5304n, c1364b.m3303a(i2));
            } else {
                r0.f4245g += 3;
                r0.f4244f = 1;
            }
            r0.f4243e = true;
            z3 = true;
            if (!z3) {
                if ((i3 >> 8) != 0) {
                    r0.f4243e = true;
                } else if ((16777215 & i3) != 0) {
                    if ((-16711681 & i3) != 0) {
                        if ((-65281 & i3) == 0) {
                            str = "2143";
                        }
                        if (!z) {
                            z = m3261a(i3 >>> 16);
                        }
                    } else {
                        str = "3412";
                    }
                    C1357a.m3260a(str);
                } else {
                    r0.f4243e = false;
                }
                r0.f4244f = 4;
                z = true;
                if (!z) {
                    z = m3261a(i3 >>> 16);
                }
            }
            if (z2) {
                i3 = r0.f4244f;
                if (i3 != 4) {
                    switch (i3) {
                        case 1:
                            break;
                        case 2:
                            if (!r0.f4243e) {
                                c1359d = C1359d.UTF16_LE;
                                break;
                            }
                            c1359d = C1359d.UTF16_BE;
                            break;
                        default:
                            throw new RuntimeException("Internal error");
                    }
                } else if (r0.f4243e) {
                }
                r0.f4239a.m3195a(c1359d);
                if (c1359d == C1359d.UTF8) {
                }
                c1347c = r0.f4239a;
                b = r0.f4239a.m3199b();
                c = b.m3272c();
                if (c != 8) {
                }
                inputStream = r0.f4240b;
                if (inputStream != null) {
                    inputStream = new ByteArrayInputStream(r0.f4241c, r0.f4245g, r0.f4246h);
                } else if (r0.f4245g < r0.f4246h) {
                    inputStream = new C1350f(r0.f4239a, inputStream, r0.f4241c, r0.f4245g, r0.f4246h);
                }
                inputStreamReader = new InputStreamReader(inputStream, b.m3270a());
                return new C7260g(c1347c, i, inputStreamReader, c5304n, c1364b.m3303a(i2));
            }
            c1359d = C1359d.UTF8;
            r0.f4239a.m3195a(c1359d);
            if (c1359d == C1359d.UTF8) {
            }
            c1347c = r0.f4239a;
            b = r0.f4239a.m3199b();
            c = b.m3272c();
            if (c != 8) {
            }
            inputStream = r0.f4240b;
            if (inputStream != null) {
                inputStream = new ByteArrayInputStream(r0.f4241c, r0.f4245g, r0.f4246h);
            } else if (r0.f4245g < r0.f4246h) {
                inputStream = new C1350f(r0.f4239a, inputStream, r0.f4241c, r0.f4245g, r0.f4246h);
            }
            inputStreamReader = new InputStreamReader(inputStream, b.m3270a());
            return new C7260g(c1347c, i, inputStreamReader, c5304n, c1364b.m3303a(i2));
        } else if (m3262b(2) && m3261a(((r0.f4241c[r0.f4245g] & 255) << 8) | (r0.f4241c[r0.f4245g + 1] & 255))) {
            if (z2) {
                i3 = r0.f4244f;
                if (i3 != 4) {
                    switch (i3) {
                        case 1:
                            break;
                        case 2:
                            if (!r0.f4243e) {
                                c1359d = C1359d.UTF16_BE;
                                break;
                            }
                            c1359d = C1359d.UTF16_LE;
                            break;
                        default:
                            throw new RuntimeException("Internal error");
                    }
                } else if (r0.f4243e) {
                }
                r0.f4239a.m3195a(c1359d);
                if (c1359d == C1359d.UTF8) {
                }
                c1347c = r0.f4239a;
                b = r0.f4239a.m3199b();
                c = b.m3272c();
                if (c != 8) {
                }
                inputStream = r0.f4240b;
                if (inputStream != null) {
                    inputStream = new ByteArrayInputStream(r0.f4241c, r0.f4245g, r0.f4246h);
                } else if (r0.f4245g < r0.f4246h) {
                    inputStream = new C1350f(r0.f4239a, inputStream, r0.f4241c, r0.f4245g, r0.f4246h);
                }
                inputStreamReader = new InputStreamReader(inputStream, b.m3270a());
                return new C7260g(c1347c, i, inputStreamReader, c5304n, c1364b.m3303a(i2));
            }
            c1359d = C1359d.UTF8;
            r0.f4239a.m3195a(c1359d);
            if (c1359d == C1359d.UTF8) {
            }
            c1347c = r0.f4239a;
            b = r0.f4239a.m3199b();
            c = b.m3272c();
            if (c != 8) {
            }
            inputStream = r0.f4240b;
            if (inputStream != null) {
                inputStream = new ByteArrayInputStream(r0.f4241c, r0.f4245g, r0.f4246h);
            } else if (r0.f4245g < r0.f4246h) {
                inputStream = new C1350f(r0.f4239a, inputStream, r0.f4241c, r0.f4245g, r0.f4246h);
            }
            inputStreamReader = new InputStreamReader(inputStream, b.m3270a());
            return new C7260g(c1347c, i, inputStreamReader, c5304n, c1364b.m3303a(i2));
        }
        z2 = z;
        if (z2) {
            i3 = r0.f4244f;
            if (i3 != 4) {
                switch (i3) {
                    case 1:
                        break;
                    case 2:
                        if (!r0.f4243e) {
                            c1359d = C1359d.UTF16_LE;
                            break;
                        }
                        c1359d = C1359d.UTF16_BE;
                        break;
                    default:
                        throw new RuntimeException("Internal error");
                }
            } else if (r0.f4243e) {
            }
            r0.f4239a.m3195a(c1359d);
            if (c1359d == C1359d.UTF8) {
            }
            c1347c = r0.f4239a;
            b = r0.f4239a.m3199b();
            c = b.m3272c();
            if (c != 8) {
            }
            inputStream = r0.f4240b;
            if (inputStream != null) {
                inputStream = new ByteArrayInputStream(r0.f4241c, r0.f4245g, r0.f4246h);
            } else if (r0.f4245g < r0.f4246h) {
                inputStream = new C1350f(r0.f4239a, inputStream, r0.f4241c, r0.f4245g, r0.f4246h);
            }
            inputStreamReader = new InputStreamReader(inputStream, b.m3270a());
            return new C7260g(c1347c, i, inputStreamReader, c5304n, c1364b.m3303a(i2));
        }
        c1359d = C1359d.UTF8;
        r0.f4239a.m3195a(c1359d);
        if (c1359d == C1359d.UTF8) {
        }
        c1347c = r0.f4239a;
        b = r0.f4239a.m3199b();
        c = b.m3272c();
        if (c != 8) {
        }
        inputStream = r0.f4240b;
        if (inputStream != null) {
            inputStream = new ByteArrayInputStream(r0.f4241c, r0.f4245g, r0.f4246h);
        } else if (r0.f4245g < r0.f4246h) {
            inputStream = new C1350f(r0.f4239a, inputStream, r0.f4241c, r0.f4245g, r0.f4246h);
        }
        inputStreamReader = new InputStreamReader(inputStream, b.m3270a());
        return new C7260g(c1347c, i, inputStreamReader, c5304n, c1364b.m3303a(i2));
    }
}
