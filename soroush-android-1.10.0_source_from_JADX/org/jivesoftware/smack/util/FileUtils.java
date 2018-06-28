package org.jivesoftware.smack.util;

import android.content.res.AssetManager;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.MalformedURLException;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import mobi.mmdt.componentsutils.b.c.b;

public final class FileUtils {
    private static final Logger LOGGER = Logger.getLogger(FileUtils.class.getName());
    private static AssetManager mAssetManager;

    public static boolean addLines(String str, Set<String> set) {
        InputStream streamForUrl = getStreamForUrl(str, null);
        if (streamForUrl == null) {
            return false;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(streamForUrl, StringUtils.UTF8));
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                return true;
            }
            set.add(readLine);
        }
    }

    public static AssetManager getAssetManager() {
        return mAssetManager;
    }

    public static List<ClassLoader> getClassLoaders() {
        r1 = new ClassLoader[2];
        int i = 0;
        r1[0] = FileUtils.class.getClassLoader();
        r1[1] = Thread.currentThread().getContextClassLoader();
        List<ClassLoader> arrayList = new ArrayList(2);
        while (i < 2) {
            Object obj = r1[i];
            if (obj != null) {
                arrayList.add(obj);
            }
            i++;
        }
        return arrayList;
    }

    public static InputStream getStreamForUrl(String str, ClassLoader classLoader) {
        URI create = URI.create(str);
        if (create.getScheme() == null) {
            StringBuilder stringBuilder = new StringBuilder("No protocol found in file URL: ");
            stringBuilder.append(str);
            throw new MalformedURLException(stringBuilder.toString());
        } else if (!create.getScheme().equals("classpath")) {
            return FirebasePerfUrlConnection.openStream(create.toURL());
        } else {
            List<ClassLoader> classLoaders = getClassLoaders();
            if (classLoader != null) {
                classLoaders.add(0, classLoader);
            }
            for (ClassLoader classLoader2 : classLoaders) {
                InputStream resourceAsStream = classLoader2.getResourceAsStream(create.getSchemeSpecificPart());
                if (resourceAsStream != null) {
                    return resourceAsStream;
                }
            }
            StringBuilder stringBuilder2;
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(getAssetManager().open(create.getSchemeSpecificPart().split("/")[1]), StringUtils.UTF8));
                stringBuilder2 = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        return new ByteArrayInputStream(stringBuilder2.toString().getBytes());
                    }
                    stringBuilder2.append(readLine);
                }
            } catch (Exception e) {
                stringBuilder2 = new StringBuilder("FileUtils: ");
                stringBuilder2.append(e.toString());
                b.f(stringBuilder2.toString());
                return null;
            }
        }
    }

    public static String readFile(File file) {
        Throwable e;
        Logger logger;
        Level level;
        try {
            return readFileOrThrow(file);
        } catch (FileNotFoundException e2) {
            e = e2;
            logger = LOGGER;
            level = Level.FINE;
            logger.log(level, "readFile", e);
            return null;
        } catch (IOException e3) {
            e = e3;
            logger = LOGGER;
            level = Level.WARNING;
            logger.log(level, "readFile", e);
            return null;
        }
    }

    public static String readFileOrThrow(File file) {
        Throwable th;
        Reader fileReader;
        try {
            fileReader = new FileReader(file);
            try {
                char[] cArr = new char[8192];
                StringBuilder stringBuilder = new StringBuilder();
                while (true) {
                    int read = fileReader.read(cArr);
                    if (read >= 0) {
                        stringBuilder.append(cArr, 0, read);
                    } else {
                        String stringBuilder2 = stringBuilder.toString();
                        fileReader.close();
                        return stringBuilder2;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (fileReader != null) {
                    fileReader.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            fileReader = null;
            if (fileReader != null) {
                fileReader.close();
            }
            throw th;
        }
    }

    public static void removeAssetManager() {
        mAssetManager = null;
    }

    public static void setAssetManager(AssetManager assetManager) {
        mAssetManager = assetManager;
    }

    public static boolean writeFile(File file, CharSequence charSequence) {
        try {
            writeFileOrThrow(file, charSequence);
            return true;
        } catch (Throwable e) {
            LOGGER.log(Level.WARNING, "writeFile", e);
            return false;
        }
    }

    public static void writeFileOrThrow(File file, CharSequence charSequence) {
        FileWriter fileWriter = new FileWriter(file, false);
        try {
            fileWriter.write(charSequence.toString());
        } finally {
            fileWriter.close();
        }
    }
}
