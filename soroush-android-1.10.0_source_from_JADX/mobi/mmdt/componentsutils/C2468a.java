package mobi.mmdt.componentsutils;

import android.net.Uri;
import android.webkit.MimeTypeMap;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import org.jivesoftware.smack.roster.Roster;

public final class C2468a {
    private static List<String> f8152a = Collections.singletonList("mov");

    public static String m6698a(File file) {
        InputStream fileInputStream = new FileInputStream(file);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
        StringBuilder stringBuilder = new StringBuilder();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                stringBuilder.append(readLine);
                stringBuilder.append("\n");
            } else {
                bufferedReader.close();
                fileInputStream.close();
                return stringBuilder.toString();
            }
        }
    }

    public static List<File> m6699a(File file, String str, String str2) {
        ArrayList arrayList = new ArrayList();
        for (File file2 : file.listFiles()) {
            if (file2.isDirectory()) {
                arrayList.addAll(C2468a.m6699a(file2, str, str2));
            } else {
                if (str != null) {
                    if (!file2.getName().endsWith(".nomedia") && C2468a.m6714k(file2.getAbsolutePath()).toLowerCase().equals(str)) {
                    }
                } else if (file2.getName().endsWith(".nomedia")) {
                }
                C2468a.m6702a(str2, arrayList, file2);
            }
        }
        return arrayList;
    }

    public static void m6700a(File file, String str) {
        OutputStream fileOutputStream = new FileOutputStream(file);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
        outputStreamWriter.append(str);
        outputStreamWriter.close();
        fileOutputStream.flush();
        fileOutputStream.close();
    }

    public static void m6701a(String str, String str2) {
        File file = new File(str);
        File file2 = new File(str2);
        InputStream fileInputStream = new FileInputStream(file);
        OutputStream fileOutputStream = new FileOutputStream(file2);
        byte[] bArr = new byte[Roster.INITIAL_DEFAULT_NON_ROSTER_PRESENCE_MAP_SIZE];
        while (true) {
            int read = fileInputStream.read(bArr);
            if (read > 0) {
                fileOutputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    private static void m6702a(String str, ArrayList<File> arrayList, File file) {
        if (!file.getAbsolutePath().equals(str)) {
            arrayList.add(file);
        }
    }

    public static boolean m6703a(Uri uri) {
        return !f8152a.contains(C2468a.m6714k(uri.getPath()).toLowerCase().toLowerCase());
    }

    public static boolean m6704a(String str) {
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
        if ((fileExtensionFromUrl == null || fileExtensionFromUrl.equals("")) && str.split("\\.").length - 1 >= 0) {
            fileExtensionFromUrl = str.split("\\.")[str.split("\\.").length - 1];
        }
        if (fileExtensionFromUrl != null) {
            str = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl.toLowerCase());
            if (str != null && str.startsWith("image/")) {
                return true;
            }
        }
        return false;
    }

    public static boolean m6705b(String str) {
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
        if ((fileExtensionFromUrl == null || fileExtensionFromUrl.equals("")) && str.split("\\.").length - 1 >= 0) {
            fileExtensionFromUrl = str.split("\\.")[str.split("\\.").length - 1];
        }
        if (fileExtensionFromUrl != null) {
            str = fileExtensionFromUrl.toLowerCase();
            MimeTypeMap singleton = MimeTypeMap.getSingleton();
            if (!str.equals("mkv")) {
                if (!str.equals("flv")) {
                    str = singleton.getMimeTypeFromExtension(str);
                    if (str != null && str.startsWith("video/")) {
                        return true;
                    }
                }
            }
            str = "video/*";
            return true;
        }
        return false;
    }

    public static boolean m6706c(String str) {
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
        if ((fileExtensionFromUrl == null || fileExtensionFromUrl.equals("")) && str.split("\\.").length - 1 >= 0) {
            fileExtensionFromUrl = str.split("\\.")[str.split("\\.").length - 1];
        }
        if (fileExtensionFromUrl != null) {
            str = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl.toLowerCase());
            if (str != null && str.startsWith("audio/")) {
                return true;
            }
        }
        return false;
    }

    public static boolean m6707d(String str) {
        return C2468a.m6714k(str).toLowerCase().equalsIgnoreCase("pdf");
    }

    public static boolean m6708e(String str) {
        return C2468a.m6714k(str).toLowerCase().equalsIgnoreCase("gif");
    }

    public static boolean m6709f(String str) {
        return C2468a.m6714k(str).toLowerCase().equalsIgnoreCase(UIThemeManager.KEY_THEME_EXTENSION);
    }

    public static boolean m6710g(String str) {
        return C2468a.m6714k(str).toLowerCase().equalsIgnoreCase("apk");
    }

    public static String m6711h(String str) {
        return C2468a.m6714k(str).toLowerCase();
    }

    public static String m6712i(String str) {
        return new File(str).getName();
    }

    public static String m6713j(String str) {
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
        if ((fileExtensionFromUrl == null || fileExtensionFromUrl.equals("")) && str.split("\\.").length - 1 >= 0) {
            fileExtensionFromUrl = str.split("\\.")[str.split("\\.").length - 1];
        }
        if (fileExtensionFromUrl != null) {
            if (!fileExtensionFromUrl.equals("mkv")) {
                if (!fileExtensionFromUrl.equals("flv")) {
                    str = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
                    if (str == null) {
                    }
                    return str;
                }
            }
            str = "video/*";
            return str;
        }
        return "*/*";
    }

    public static String m6714k(String str) {
        String str2 = "";
        if (str.split("\\.").length - 1 >= 0) {
            str2 = str.split("\\.")[str.split("\\.").length - 1];
        }
        return str2.toLowerCase();
    }

    public static boolean m6715l(String str) {
        return new File(str).exists();
    }
}
