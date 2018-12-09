package iit.uni.miskolc.hu.softwaretesting;

import iit.uni.miskolc.hu.softwaretesting.exceptions.LoginFailed;
import iit.uni.miskolc.hu.softwaretesting.service.LoginInterface;
import iit.uni.miskolc.hu.softwaretesting.service.LoginInterfaceImpl;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertTrue;

public class LoginInterfaceImplTest {

    private LoginInterface loginService = new LoginInterfaceImpl();

    @Rule
    public ExpectedException thrown =  ExpectedException.none();

    @Test
    public void testCheckCredintials() throws LoginFailed {
        String username = "tanar1";
        String password = "Tanar1";
        boolean loginValue = loginService.authenticate(username,password);
        assertTrue(loginValue);
    }

    @Test
    public void testCheckInvalidCredintialsException() throws LoginFailed {
        String userName = "qqqqqqq";
        String password = "sssssss";
        thrown.expect(LoginFailed.class);
        loginService.authenticate(userName,password);
    }

}
