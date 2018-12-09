package iit.uni.miskolc.hu.softwaretesting;

import iit.uni.miskolc.hu.softwaretesting.dao.LoginDAO;
import iit.uni.miskolc.hu.softwaretesting.exceptions.LoginFailed;

import static org.junit.Assert.assertTrue;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;


public class LoginDAOImplTest {

    private LoginDAO loginDAO = new LoginDAOImpl();

    @Rule
    public ExpectedException thrown =  ExpectedException.none();

    @Test
    public void testCheckCredintials() throws LoginFailed {
        String username = "tanar1";
        String password = "Tanar1";
       boolean loginValue = loginDAO.checkCredentials(username,password);
       assertTrue(loginValue);
    }

    @Test
    public void testCheckInvalidCredintialsException() throws LoginFailed {
        String userName = "qqqqqqq";
        String password = "sssssss";
        thrown.expect(LoginFailed.class);
        loginDAO.checkCredentials(userName,password);
    }
}
