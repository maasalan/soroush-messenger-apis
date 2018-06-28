package com.p111d.p112a.p114b;

public enum C1380m {
    NOT_AVAILABLE(null, -1),
    START_OBJECT("{", 1),
    END_OBJECT("}", 2),
    START_ARRAY("[", 3),
    END_ARRAY("]", 4),
    FIELD_NAME(null, 5),
    VALUE_EMBEDDED_OBJECT(null, 12),
    VALUE_STRING(null, 6),
    VALUE_NUMBER_INT(null, 7),
    VALUE_NUMBER_FLOAT(null, 8),
    VALUE_TRUE("true", 9),
    VALUE_FALSE("false", 10),
    VALUE_NULL("null", 11);
    
    public final String f4389n;
    public final char[] f4390o;
    final byte[] f4391p;
    public final int f4392q;
    public final boolean f4393r;
    public final boolean f4394s;
    public final boolean f4395t;
    final boolean f4396u;
    public final boolean f4397v;

    private C1380m(String str, int i) {
        boolean z;
        boolean z2 = false;
        if (str == null) {
            this.f4389n = null;
            this.f4390o = null;
            this.f4391p = null;
        } else {
            this.f4389n = str;
            this.f4390o = str.toCharArray();
            r4 = this.f4390o.length;
            this.f4391p = new byte[r4];
            for (int i2 = 0; i2 < r4; i2++) {
                this.f4391p[i2] = (byte) this.f4390o[i2];
            }
        }
        this.f4392q = i;
        if (i != 10) {
            if (i != 9) {
                z = false;
                this.f4396u = z;
                if (i != 7) {
                    if (i == 8) {
                        z = false;
                        this.f4395t = z;
                        if (i != 1) {
                            if (i != 3) {
                                z = false;
                                this.f4393r = z;
                                if (i != 2) {
                                    if (i != 4) {
                                        z = false;
                                        this.f4394s = z;
                                        if (!(this.f4393r || this.f4394s || i == 5 || i == -1)) {
                                            z2 = true;
                                        }
                                        this.f4397v = z2;
                                    }
                                }
                                z = true;
                                this.f4394s = z;
                                z2 = true;
                                this.f4397v = z2;
                            }
                        }
                        z = true;
                        this.f4393r = z;
                        if (i != 2) {
                            if (i != 4) {
                                z = false;
                                this.f4394s = z;
                                z2 = true;
                                this.f4397v = z2;
                            }
                        }
                        z = true;
                        this.f4394s = z;
                        z2 = true;
                        this.f4397v = z2;
                    }
                }
                z = true;
                this.f4395t = z;
                if (i != 1) {
                    if (i != 3) {
                        z = false;
                        this.f4393r = z;
                        if (i != 2) {
                            if (i != 4) {
                                z = false;
                                this.f4394s = z;
                                z2 = true;
                                this.f4397v = z2;
                            }
                        }
                        z = true;
                        this.f4394s = z;
                        z2 = true;
                        this.f4397v = z2;
                    }
                }
                z = true;
                this.f4393r = z;
                if (i != 2) {
                    if (i != 4) {
                        z = false;
                        this.f4394s = z;
                        z2 = true;
                        this.f4397v = z2;
                    }
                }
                z = true;
                this.f4394s = z;
                z2 = true;
                this.f4397v = z2;
            }
        }
        z = true;
        this.f4396u = z;
        if (i != 7) {
            if (i == 8) {
                z = false;
                this.f4395t = z;
                if (i != 1) {
                    if (i != 3) {
                        z = false;
                        this.f4393r = z;
                        if (i != 2) {
                            if (i != 4) {
                                z = false;
                                this.f4394s = z;
                                z2 = true;
                                this.f4397v = z2;
                            }
                        }
                        z = true;
                        this.f4394s = z;
                        z2 = true;
                        this.f4397v = z2;
                    }
                }
                z = true;
                this.f4393r = z;
                if (i != 2) {
                    if (i != 4) {
                        z = false;
                        this.f4394s = z;
                        z2 = true;
                        this.f4397v = z2;
                    }
                }
                z = true;
                this.f4394s = z;
                z2 = true;
                this.f4397v = z2;
            }
        }
        z = true;
        this.f4395t = z;
        if (i != 1) {
            if (i != 3) {
                z = false;
                this.f4393r = z;
                if (i != 2) {
                    if (i != 4) {
                        z = false;
                        this.f4394s = z;
                        z2 = true;
                        this.f4397v = z2;
                    }
                }
                z = true;
                this.f4394s = z;
                z2 = true;
                this.f4397v = z2;
            }
        }
        z = true;
        this.f4393r = z;
        if (i != 2) {
            if (i != 4) {
                z = false;
                this.f4394s = z;
                z2 = true;
                this.f4397v = z2;
            }
        }
        z = true;
        this.f4394s = z;
        z2 = true;
        this.f4397v = z2;
    }
}
