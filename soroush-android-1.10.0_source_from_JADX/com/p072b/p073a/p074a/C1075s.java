package com.p072b.p073a.p074a;

import java.util.Set;

public enum C1075s {
    ALL,
    ANY;

    public final boolean m2599a(String[] strArr, Set<String> set) {
        if (this == ANY) {
            for (Object contains : strArr) {
                if (set.contains(contains)) {
                    return true;
                }
            }
            return false;
        }
        for (Object contains2 : strArr) {
            if (!set.contains(contains2)) {
                return false;
            }
        }
        return true;
    }
}
