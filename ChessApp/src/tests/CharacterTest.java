package tests;

import junit.framework.TestCase;
import junit.framework.TestSuite;

public class CharacterTest extends TestCase {

    public void testWhitespace() {
        assertEquals(true, Character.isWhitespace('\n'));
        assertEquals(true, Character.isWhitespace('\t'));
        assertEquals(true, Character.isWhitespace(' '));
    }

    public void testIsValidIdentifier() {
        assertFalse(Character.isJavaIdentifierPart('^'));
        assertFalse(Character.isJavaIdentifierPart(' '));
        assertFalse(Character.isJavaIdentifierPart('\n'));
        assertFalse(Character.isJavaIdentifierPart('\t'));
    }

}
