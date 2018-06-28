package com.google.p171c.p172a;

import com.google.p154a.p155a.C1621f;
import com.google.p154a.p156b.C1629c;
import com.google.p154a.p156b.C1632f.C1631b;
import com.google.p154a.p156b.C1634h;
import com.google.p154a.p156b.C1634h.C1633a;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

final class C1952c {
    private static final C1621f f6504a = C1621f.m4175a("");

    private static int m5368a(List<CharSequence> list, CharSequence charSequence, C1633a<String, C1951b> c1633a) {
        int length = charSequence.length();
        int i = 0;
        char c = i;
        while (i < length) {
            c = charSequence.charAt(i);
            if (c == '&' || c == '?' || c == '!' || c == ':' || c == ',') {
                break;
            }
            i++;
        }
        list.add(0, new StringBuilder(charSequence.subSequence(0, i)).reverse());
        if (c == '!' || c == '?' || c == ':' || c == ',') {
            Object a = f6504a.m4177a((Iterable) list);
            if (a.length() > 0) {
                Object a2 = C1951b.m5367a(c);
                int i2 = (c1633a.f5089c + 1) * 2;
                if (i2 > c1633a.f5088b.length) {
                    c1633a.f5088b = Arrays.copyOf(c1633a.f5088b, C1631b.m4192a(c1633a.f5088b.length, i2));
                    c1633a.f5090d = false;
                }
                C1629c.m4190a(a, a2);
                c1633a.f5088b[c1633a.f5089c * 2] = a;
                c1633a.f5088b[(2 * c1633a.f5089c) + 1] = a2;
                c1633a.f5089c++;
            }
        }
        i++;
        if (c != '?' && c != ',') {
            while (i < length) {
                i += C1952c.m5368a(list, charSequence.subSequence(i, length), c1633a);
                if (charSequence.charAt(i) != '?') {
                    if (charSequence.charAt(i) == ',') {
                    }
                }
                i++;
                break;
            }
        }
        list.remove(0);
        return i;
    }

    static C1634h<String, C1951b> m5369a(CharSequence charSequence) {
        C1633a a = C1634h.m4200a();
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            i += C1952c.m5368a(new LinkedList(), charSequence.subSequence(i, length), a);
        }
        return a.m4199a();
    }
}
