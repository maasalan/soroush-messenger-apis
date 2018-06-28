package com.google.android.gms.internal;

import android.util.Log;
import java.net.URI;

final class na extends nc {
    private final nq f15299a;

    na(nq nqVar) {
        this.f15299a = nqVar;
    }

    private static URI m12017a(String str) {
        if (str == null) {
            return null;
        }
        try {
            return URI.create(str);
        } catch (Throwable e) {
            Log.w("FirebasePerformance", "getResultUrl throws exception", e);
            return null;
        }
    }

    private static boolean m12018a(long j) {
        return j >= 0;
    }

    private static boolean m12019b(long j) {
        return j >= 0;
    }

    private static boolean m12020b(String str) {
        return str == null ? true : str.trim().isEmpty();
    }

    private static boolean m12021c(String str) {
        if (str.length() > 128) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt <= '\u001f' || charAt > '') {
                return false;
            }
        }
        return true;
    }

    public final boolean mo1664a() {
        if (m12020b(this.f15299a.f18364a)) {
            String str = "FirebasePerformance";
            String str2 = "URL is missing:";
            String valueOf = String.valueOf(this.f15299a.f18364a);
            Log.i(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            return false;
        }
        URI a = m12017a(this.f15299a.f18364a);
        if (a == null) {
            str = "FirebasePerformance";
            str2 = "URL cannot be parsed";
        } else {
            str2 = a.getHost();
            boolean z = (str2 == null || m12020b(str2) || str2.length() > 255) ? false : true;
            if (z) {
                str2 = a.getScheme();
                z = str2 != null && ("http".equalsIgnoreCase(str2) || "https".equalsIgnoreCase(str2));
                if (z) {
                    if (a.getUserInfo() == null) {
                        boolean z2;
                        Integer num;
                        StringBuilder stringBuilder;
                        String str3;
                        int port = a.getPort();
                        if (port != -1) {
                            if (port <= 0) {
                                z2 = false;
                                if (z2) {
                                    str = "FirebasePerformance";
                                    str2 = "URL port is less than or equal to 0";
                                } else {
                                    num = this.f15299a.f18365b;
                                    z2 = num == null && num.intValue() != 0;
                                    if (z2) {
                                        str = "FirebasePerformance";
                                        str2 = String.valueOf(this.f15299a.f18365b);
                                        stringBuilder = new StringBuilder(32 + String.valueOf(str2).length());
                                        valueOf = "HTTP Method is null or unknown: ";
                                    } else {
                                        if (this.f15299a.f18369f != null) {
                                            if (!(this.f15299a.f18369f.intValue() <= 0)) {
                                                str = "FirebasePerformance";
                                                str2 = String.valueOf(this.f15299a.f18369f);
                                                stringBuilder = new StringBuilder(46 + String.valueOf(str2).length());
                                                valueOf = "HTTP ResponseCode is null or a negative value:";
                                            }
                                        }
                                        if (this.f15299a.f18366c == null && !m12019b(this.f15299a.f18366c.longValue())) {
                                            str = "FirebasePerformance";
                                            str2 = String.valueOf(this.f15299a.f18366c);
                                            stringBuilder = new StringBuilder(44 + String.valueOf(str2).length());
                                            valueOf = "Request Payload is null or a negative value:";
                                        } else if (this.f15299a.f18367d != null || m12019b(this.f15299a.f18367d.longValue())) {
                                            if (this.f15299a.f18371h != null) {
                                                if (this.f15299a.f18371h.longValue() <= 0) {
                                                    if (this.f15299a.f18372i == null && !m12018a(this.f15299a.f18372i.longValue())) {
                                                        str = "FirebasePerformance";
                                                        str2 = String.valueOf(this.f15299a.f18372i);
                                                        stringBuilder = new StringBuilder(57 + String.valueOf(str2).length());
                                                        valueOf = "Time to complete the request is null or a negative value:";
                                                    } else if (this.f15299a.f18373j != null || m12018a(this.f15299a.f18373j.longValue())) {
                                                        if (this.f15299a.f18374k != null) {
                                                            if (!(this.f15299a.f18374k.longValue() <= 0)) {
                                                                str = "FirebasePerformance";
                                                                str2 = String.valueOf(this.f15299a.f18374k);
                                                                stringBuilder = new StringBuilder(90 + String.valueOf(str2).length());
                                                                valueOf = "Time from the start of the request to the end of the response is null or a negative value:";
                                                            }
                                                        }
                                                        if (this.f15299a.f18369f != null) {
                                                            str = "FirebasePerformance";
                                                            str2 = "Did not receive a HTTP Response Code";
                                                        } else {
                                                            if (!(this.f15299a.f18370g == null || m12021c(this.f15299a.f18370g))) {
                                                                str = "FirebasePerformance";
                                                                str3 = "The content type of the response is not a valid content-type:";
                                                                str2 = String.valueOf(this.f15299a.f18370g);
                                                                Log.i(str, str2.length() == 0 ? str3.concat(str2) : new String(str3));
                                                                this.f15299a.f18370g = null;
                                                            }
                                                            return true;
                                                        }
                                                    } else {
                                                        str = "FirebasePerformance";
                                                        str2 = String.valueOf(this.f15299a.f18373j);
                                                        stringBuilder = new StringBuilder(92 + String.valueOf(str2).length());
                                                        valueOf = "Time from the start of the request to the start of the response is null or a negative value:";
                                                    }
                                                }
                                            }
                                            str = "FirebasePerformance";
                                            str2 = String.valueOf(this.f15299a.f18371h);
                                            stringBuilder = new StringBuilder(64 + String.valueOf(str2).length());
                                            valueOf = "Start time of the request is null, or zero, or a negative value:";
                                        } else {
                                            str = "FirebasePerformance";
                                            str2 = String.valueOf(this.f15299a.f18367d);
                                            stringBuilder = new StringBuilder(45 + String.valueOf(str2).length());
                                            valueOf = "Response Payload is null or a negative value:";
                                        }
                                    }
                                    stringBuilder.append(valueOf);
                                    stringBuilder.append(str2);
                                    str2 = stringBuilder.toString();
                                }
                            }
                        }
                        z2 = true;
                        if (z2) {
                            num = this.f15299a.f18365b;
                            if (num == null) {
                            }
                            if (z2) {
                                if (this.f15299a.f18369f != null) {
                                    if (this.f15299a.f18369f.intValue() <= 0) {
                                    }
                                    if (this.f15299a.f18369f.intValue() <= 0) {
                                        str = "FirebasePerformance";
                                        str2 = String.valueOf(this.f15299a.f18369f);
                                        stringBuilder = new StringBuilder(46 + String.valueOf(str2).length());
                                        valueOf = "HTTP ResponseCode is null or a negative value:";
                                    }
                                }
                                if (this.f15299a.f18366c == null) {
                                }
                                if (this.f15299a.f18367d != null) {
                                }
                                if (this.f15299a.f18371h != null) {
                                    if (this.f15299a.f18371h.longValue() <= 0) {
                                        if (this.f15299a.f18372i == null) {
                                        }
                                        if (this.f15299a.f18373j != null) {
                                        }
                                        if (this.f15299a.f18374k != null) {
                                            if (this.f15299a.f18374k.longValue() <= 0) {
                                            }
                                            if (this.f15299a.f18374k.longValue() <= 0) {
                                                str = "FirebasePerformance";
                                                str2 = String.valueOf(this.f15299a.f18374k);
                                                stringBuilder = new StringBuilder(90 + String.valueOf(str2).length());
                                                valueOf = "Time from the start of the request to the end of the response is null or a negative value:";
                                            }
                                        }
                                        if (this.f15299a.f18369f != null) {
                                            str = "FirebasePerformance";
                                            str3 = "The content type of the response is not a valid content-type:";
                                            str2 = String.valueOf(this.f15299a.f18370g);
                                            if (str2.length() == 0) {
                                            }
                                            Log.i(str, str2.length() == 0 ? str3.concat(str2) : new String(str3));
                                            this.f15299a.f18370g = null;
                                            return true;
                                        }
                                        str = "FirebasePerformance";
                                        str2 = "Did not receive a HTTP Response Code";
                                    }
                                }
                                str = "FirebasePerformance";
                                str2 = String.valueOf(this.f15299a.f18371h);
                                stringBuilder = new StringBuilder(64 + String.valueOf(str2).length());
                                valueOf = "Start time of the request is null, or zero, or a negative value:";
                            } else {
                                str = "FirebasePerformance";
                                str2 = String.valueOf(this.f15299a.f18365b);
                                stringBuilder = new StringBuilder(32 + String.valueOf(str2).length());
                                valueOf = "HTTP Method is null or unknown: ";
                            }
                            stringBuilder.append(valueOf);
                            stringBuilder.append(str2);
                            str2 = stringBuilder.toString();
                        } else {
                            str = "FirebasePerformance";
                            str2 = "URL port is less than or equal to 0";
                        }
                    } else {
                        str = "FirebasePerformance";
                        str2 = "URL user info is null";
                    }
                } else {
                    str = "FirebasePerformance";
                    str2 = "URL scheme is null or invalid";
                }
            } else {
                str = "FirebasePerformance";
                str2 = "URL host is null or invalid";
            }
        }
        Log.i(str, str2);
        return false;
    }
}
