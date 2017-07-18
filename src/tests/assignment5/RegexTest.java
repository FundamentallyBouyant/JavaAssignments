package assignment5;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Jay Dadhania on 17/7/17.
 */
public class RegexTest {
    Regex rgx = new Regex();
    @Test
    public void isASentence() throws Exception {
        assertTrue(rgx.isASentence("Abcd1234!@#$."));
        assertTrue(rgx.isASentence("A."));
        assertFalse(rgx.isASentence("afdfdf."));
        assertFalse(rgx.isASentence("Afsdfd,"));
    }

}