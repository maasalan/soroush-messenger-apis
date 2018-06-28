package org.msgpack.util;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Properties;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.tools.DiagnosticCollector;
import javax.tools.JavaFileObject;
import javax.tools.JavaFileObject.Kind;
import javax.tools.StandardLocation;
import javax.tools.ToolProvider;
import org.msgpack.template.TemplateRegistry;
import org.msgpack.template.builder.JavassistTemplateBuilder;

public class TemplatePrecompiler {
    public static final String DEFAULT_DEST = ".";
    public static final String DEST = "msgpack.template.destdir";
    private static final Logger LOG = Logger.getLogger(TemplatePrecompiler.class.getName());

    static class C78341 extends HashSet<Kind> {
        C78341() {
            add(Kind.CLASS);
        }
    }

    public static boolean deleteTemplateClass(Class<?> cls) {
        Logger logger = LOG;
        StringBuilder stringBuilder = new StringBuilder("Deleting template of ");
        stringBuilder.append(cls.getName());
        stringBuilder.append("...");
        logger.info(stringBuilder.toString());
        String dirName = getDirName(System.getProperties(), DEST, DEFAULT_DEST);
        String name = cls.getName();
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(name.replace('.', File.separatorChar));
        stringBuilder2.append("_$$_Template.class");
        name = stringBuilder2.toString();
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append(dirName);
        stringBuilder3.append(File.separatorChar);
        stringBuilder3.append(name);
        File file = new File(stringBuilder3.toString());
        boolean delete = (file.isDirectory() || !file.exists()) ? false : file.delete();
        Logger logger2 = LOG;
        stringBuilder2 = new StringBuilder("Deleted .class file of template class of ");
        stringBuilder2.append(cls.getName());
        logger2.info(stringBuilder2.toString());
        return delete;
    }

    private static String getDirName(Properties properties, String str, String str2) {
        String property = properties.getProperty(str, str2);
        File file = new File(property);
        if (file.isDirectory() || file.exists()) {
            return file.getAbsolutePath();
        }
        StringBuilder stringBuilder = new StringBuilder("Directory not exists: ");
        stringBuilder.append(property);
        throw new IOException(stringBuilder.toString());
    }

    public static void main(String[] strArr) {
        saveTemplates(strArr);
    }

    private static void matchClassNames(List<String> list, String str) {
        String substring = str.substring(0, str.lastIndexOf(46));
        Pattern compile = Pattern.compile(str.substring(str.lastIndexOf(46) + 1, str.length()).replace("*", "(\\w+)"));
        for (JavaFileObject name : ToolProvider.getSystemJavaCompiler().getStandardFileManager(new DiagnosticCollector(), null, null).list(StandardLocation.PLATFORM_CLASS_PATH, substring, new C78341(), false)) {
            String name2 = name.getName();
            Object substring2 = name2.substring(0, name2.length() - 6);
            if (compile.matcher(substring2).matches()) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(substring);
                stringBuilder.append('.');
                stringBuilder.append(substring2);
                name2 = stringBuilder.toString();
                if (!list.contains(name2)) {
                    list.add(name2);
                }
            }
        }
    }

    public static void saveTemplateClass(TemplateRegistry templateRegistry, Class<?> cls) {
        Logger logger = LOG;
        StringBuilder stringBuilder = new StringBuilder("Saving template of ");
        stringBuilder.append(cls.getName());
        stringBuilder.append("...");
        logger.info(stringBuilder.toString());
        String dirName = getDirName(System.getProperties(), DEST, DEFAULT_DEST);
        if (cls.isEnum()) {
            StringBuilder stringBuilder2 = new StringBuilder("Not supported enum type yet: ");
            stringBuilder2.append(cls.getName());
            throw new UnsupportedOperationException(stringBuilder2.toString());
        }
        new JavassistTemplateBuilder(templateRegistry).writeTemplate(cls, dirName);
        Logger logger2 = LOG;
        stringBuilder2 = new StringBuilder("Saved .class file of template class of ");
        stringBuilder2.append(cls.getName());
        logger2.info(stringBuilder2.toString());
    }

    public static void saveTemplateClasses(TemplateRegistry templateRegistry, Class<?>[] clsArr) {
        for (Class saveTemplateClass : clsArr) {
            saveTemplateClass(templateRegistry, saveTemplateClass);
        }
    }

    public static void saveTemplates(String[] strArr) {
        TemplateRegistry templateRegistry = new TemplateRegistry(null);
        List arrayList = new ArrayList();
        for (String matchClassNames : strArr) {
            matchClassNames(arrayList, matchClassNames);
        }
        for (Class saveTemplateClass : toClass(arrayList)) {
            saveTemplateClass(templateRegistry, saveTemplateClass);
        }
    }

    private static List<Class<?>> toClass(List<String> list) {
        List<Class<?>> arrayList = new ArrayList(list.size());
        ClassLoader classLoader = TemplatePrecompiler.class.getClassLoader();
        for (String loadClass : list) {
            arrayList.add(classLoader.loadClass(loadClass));
        }
        return arrayList;
    }
}
