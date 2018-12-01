package iit.uni.miskolc.hu.softwaretesting;

import iit.uni.miskolc.hu.softwaretesting.exceptions.*;
import iit.uni.miskolc.hu.softwaretesting.model.User;
import org.junit.Test;

public class UserConstructorTest {

    private User user;

    @Test
    public void testConstructorWithCorrectValues() throws EmptyFieldException, InvalidIDValueException, InvalidPasswordException, InvalidEmailException {
        user = new User(1, "Teszt Elek", "teszt@mail", "testelek2", "Adfg12");
    }

    /**
     * This test runs the constructor with empty values
     */
    @Test(expected = EmptyFieldException.class)
    public void testConstructorWithEmptyValues() throws EmptyFieldException, InvalidIDValueException, InvalidPasswordException, InvalidEmailException {
        user = new User(1,"","","","");
    }

    @Test(expected = InvalidIDValueException.class)
    public void testConstructorWithInvalidID() throws EmptyFieldException, InvalidIDValueException, InvalidPasswordException, InvalidEmailException {
        user = new User(-1, "Teszt Elek", "test@mail", "test2", "frFre43");
    }

    @Test(expected = EmptyFieldException.class)
    public void testConstructorWithEmptyName() throws EmptyFieldException, InvalidIDValueException, InvalidPasswordException, InvalidEmailException {
        user = new User(2, "", "test@mail", "test", "dfFfg43");
    }

    @Test(expected = InvalidEmailException.class)
    public void testConstructorWithInvalidEmail() throws EmptyFieldException, InvalidIDValueException, InvalidPasswordException, InvalidEmailException {
        user = new User(2, "Teszt Elek", "fre@", "test", "fdsDdsf33");
    }

    @Test(expected = EmptyFieldException.class)
    public void testConstructorWithEmptyUserName() throws EmptyFieldException, InvalidIDValueException, InvalidPasswordException, InvalidEmailException {
        user = new User(2, "Teszt Elek", "test@mail", "", "dfdDg43");
    }

    /**
     * This test runs the constructor with too less password length
     */
    @Test(expected = InvalidPasswordException.class)
    public void testConstructorWithTooLessPassword() throws InvalidPasswordException, InvalidIDValueException, EmptyFieldException, InvalidEmailException {
        user = new User(1,"Robert","trizax350@gmail.com","Trizax","AS45");
    }

    /**
     * This test runs the constructor with too long password length
     */
    @Test(expected = InvalidPasswordException.class)
    public void testConstructorWithTooLongPassword() throws InvalidPasswordException, InvalidIDValueException, EmptyFieldException, InvalidEmailException {
        user = new User(1,"Robert","trizax350@gmail.com","Trizax","itsatrytoDSeateatoolongpasswordfortest1");
    }
}
