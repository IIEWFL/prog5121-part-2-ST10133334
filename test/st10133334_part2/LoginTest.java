package st10133334_part2;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

//This method was adapted from YouTube
//https://www.youtube.com/watch?v=2JzEhwpg_0U&list=PL480DYS-b_kfHSYf2yzLgto_mwDr_U-Q6
//VCSOIT
//https://www.youtube.com/@VCSOIT/about

//Farrell, J. 2019. Java Programming. 9th ed. Australia • Brazil • Mexico • Singapore • United Kingdom • United States: Cengage

public class LoginTest {
    static Login obj = null;

    public LoginTest() {
    }

    @Test
    public void testCheckUserName() {
        obj = new Login();
        assertEquals(true, obj.checkUserName("kyl_1"));
        assertEquals(false, obj.checkUserName("kyle!!!!!!!"));
        assertTrue(obj.checkUserName("kyl_1"));
        assertFalse(obj.checkUserName("kyle!!!!!!!"));
    }

    @Test
    public void testRegisterUser() {
    }

    @Test
    public void testCheckPasswordComplexity() {
        obj = new Login();
        assertEquals(true, obj.checkPasswordComplexity("Ch&&sec@ke99!"));
        assertEquals(false, obj.checkPasswordComplexity("password"));
        assertTrue(obj.checkPasswordComplexity("Ch&&sec@ke99!"));
        assertFalse(obj.checkPasswordComplexity("password"));
    }

    @Test
    public void testRegisterPass() {
    }

    @Test
    public void testLoginUser() {
    }

    @Test
    public void testReturnLoginStatus() {
    }

}
