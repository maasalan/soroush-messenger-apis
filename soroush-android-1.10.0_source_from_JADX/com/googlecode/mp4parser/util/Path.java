package com.googlecode.mp4parser.util;

import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.Container;
import com.googlecode.mp4parser.AbstractContainerBox;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Path {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    static Pattern component = Pattern.compile("(....|\\.\\.)(\\[(.*)\\])?");

    private Path() {
    }

    public static String createPath(Box box) {
        return createPath(box, "");
    }

    private static String createPath(Box box, String str) {
        while (true) {
            Container parent = box.getParent();
            int i = 0;
            for (Box box2 : parent.getBoxes()) {
                if (box2.getType().equals(box.getType())) {
                    if (box2 == box) {
                        break;
                    }
                    i++;
                }
            }
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(String.format("/%s[%d]", new Object[]{box.getType(), Integer.valueOf(i)})));
            stringBuilder.append(str);
            str = stringBuilder.toString();
            if (!(parent instanceof Box)) {
                return str;
            }
            box = (Box) parent;
        }
    }

    public static <T extends Box> T getPath(Box box, String str) {
        List paths = getPaths(box, str, true);
        return paths.isEmpty() ? null : (Box) paths.get(0);
    }

    public static <T extends Box> T getPath(Container container, String str) {
        List paths = getPaths(container, str, true);
        return paths.isEmpty() ? null : (Box) paths.get(0);
    }

    public static <T extends Box> T getPath(AbstractContainerBox abstractContainerBox, String str) {
        List paths = getPaths(abstractContainerBox, str, true);
        return paths.isEmpty() ? null : (Box) paths.get(0);
    }

    public static <T extends Box> List<T> getPaths(Box box, String str) {
        return getPaths(box, str, false);
    }

    private static <T extends Box> List<T> getPaths(Box box, String str, boolean z) {
        return getPaths((Object) box, str, z);
    }

    public static <T extends Box> List<T> getPaths(Container container, String str) {
        return getPaths(container, str, false);
    }

    private static <T extends Box> List<T> getPaths(Container container, String str, boolean z) {
        return getPaths((Object) container, str, z);
    }

    private static <T extends Box> List<T> getPaths(AbstractContainerBox abstractContainerBox, String str, boolean z) {
        return getPaths((Object) abstractContainerBox, str, z);
    }

    private static <T extends Box> List<T> getPaths(Object obj, String str, boolean z) {
        if (str.startsWith("/")) {
            String substring = str.substring(1);
            while (obj instanceof Box) {
                obj = ((Box) obj).getParent();
            }
            CharSequence charSequence = substring;
        }
        if (charSequence.length() != 0) {
            String substring2;
            int i = 0;
            if (charSequence.contains("/")) {
                substring2 = charSequence.substring(charSequence.indexOf(47) + 1);
                charSequence = charSequence.substring(0, charSequence.indexOf(47));
            } else {
                substring2 = "";
            }
            Matcher matcher = component.matcher(charSequence);
            if (matcher.matches()) {
                str = matcher.group(1);
                if ("..".equals(str)) {
                    return obj instanceof Box ? getPaths(((Box) obj).getParent(), substring2, z) : Collections.emptyList();
                } else {
                    if (!(obj instanceof Container)) {
                        return Collections.emptyList();
                    }
                    int parseInt = matcher.group(2) != null ? Integer.parseInt(matcher.group(3)) : -1;
                    List<T> linkedList = new LinkedList();
                    for (Box box : ((Container) obj).getBoxes()) {
                        if (box.getType().matches(str)) {
                            if (parseInt == -1 || parseInt == i) {
                                linkedList.addAll(getPaths(box, substring2, z));
                            }
                            i++;
                        }
                        if ((z || parseInt >= 0) && !linkedList.isEmpty()) {
                            return linkedList;
                        }
                    }
                    return linkedList;
                }
            }
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(charSequence));
            stringBuilder.append(" is invalid path.");
            throw new RuntimeException(stringBuilder.toString());
        } else if (obj instanceof Box) {
            return Collections.singletonList((Box) obj);
        } else {
            throw new RuntimeException("Result of path expression seems to be the root container. This is not allowed!");
        }
    }

    public static boolean isContained(Box box, String str) {
        return getPaths(box, str).contains(box);
    }
}
