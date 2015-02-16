package tests;

import static junit.framework.Assert.assertEquals;

import junit.framework.TestCase;
import util.StringUtil;

public class StringUtilTest extends TestCase{

    public void testStringUtils(){
        String line = "aa" + System.getProperty("line.separator");
        assertEquals(line, StringUtil.appendNewLine("aa"));
    }

}
