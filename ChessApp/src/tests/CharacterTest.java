package tests;

import junit.framework.TestCase;


public class CharacterTest extends TestCase {

    public void testWhitespace() {
        assertTrue(Character.isWhitespace('\n'));
        assertTrue(Character.isWhitespace('\t'));
        assertTrue(Character.isWhitespace(' '));
    }

    public void testIsValidIdentifier() {
        assertFalse(Character.isJavaIdentifierPart('^'));
        assertFalse(Character.isJavaIdentifierPart(' '));
        assertFalse(Character.isJavaIdentifierPart('\n'));
        assertFalse(Character.isJavaIdentifierPart('\t'));
    }

}
