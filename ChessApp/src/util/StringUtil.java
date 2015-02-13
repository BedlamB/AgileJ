package util;

public class StringUtil {

    public static final String LINE_END = System.getProperty("line.separator");

    private StringUtil() {

    }

    public static String appendNewLine(String line){
        return line + LINE_END;
    }
}
