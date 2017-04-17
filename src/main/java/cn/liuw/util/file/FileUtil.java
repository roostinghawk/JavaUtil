package cn.liuw.util.file;

import java.io.*;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by liuw on 2017/3/22.
 */
public class FileUtil {

    protected static Reader newClassPathReader(String classpath) {
        InputStream is = FileUtil.class.getResourceAsStream(classpath);

        try {
            return new InputStreamReader(is, "UTF-8");
        } catch (UnsupportedEncodingException var3) {
            return null;
        }
    }
    protected static Map<String, String> getResource(Reader reader) {
        ConcurrentHashMap map = new ConcurrentHashMap();

        try {
            BufferedReader e = new BufferedReader(reader);
            String line = null;

            while((line = e.readLine()) != null) {
                String[] tokens = line.trim().split("=");
                map.put(tokens[0], tokens[1]);
            }

            e.close();
            return map;
        } catch (IOException var5) {
            throw new RuntimeException(var5);
        }
    }

    protected static Map<String, String> getPinyinResource() {
        return getResource(newClassPathReader("/data/pinyin.dict"));
    }
}
