package iit.uni.miskolc.hu.softwaretesting;

import iit.uni.miskolc.hu.softwaretesting.exceptions.*;
import iit.uni.miskolc.hu.softwaretesting.model.User;
import org.junit.Test;

public class UserConstructorTest {

    private User user;

    @Test
    public void testConstructorWithCorrectValues() throws EmptyFieldException, InvalidIDValueException, InvalidPasswordException, InvalidEmailException {
        user = new User(1, "Teszt Elek", "teszt@mail", "testelek2", "asdfg12");
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
        user = new User(-1, "Teszt Elek", "test@mail", "test2", "frfre43");
    }

    @Test(expected = EmptyFieldException.class)
    public void testConstructorWithEmptyName() throws EmptyFieldException, InvalidIDValueException, InvalidPasswordException, InvalidEmailException {
        user = new User(2, "", "test@mail", "test", "dfdfg43");
    }

    @Test(expected = InvalidEmailException.class)
    public void testConstructorWithInvalidEmail() throws EmptyFieldException, InvalidIDValueException, InvalidPasswordException, InvalidEmailException {
        user = new User(2, "Teszt Elek", "fre@", "test", "fdsfdsf33");
    }

    @Test(expected = EmptyFieldException.class)
    public void testConstructorWithEmptyUserName() throws EmptyFieldException, InvalidIDValueException, InvalidPasswordException, InvalidEmailException {
        user = new User(2, "Teszt Elek", "test@mail", "", "dfdfg43");
    }

    /**
     * This test runs the constructor with too less password length
     */
    @Test(expected = InvalidPasswordException.class)
    public void testConstructorWithTooLessPassword() throws InvalidPasswordException, InvalidIDValueException, EmptyFieldException, InvalidEmailException {
        user = new User(1,"Robert","trizax350@gmail.com","Trizax","asd");
    }

    /**
     * This test runs the constructor with too long password length
     */
    @Test(expected = InvalidPasswordException.class)
    public void testConstructorWithTooLongPassword() throws InvalidPasswordException, InvalidIDValueException, EmptyFieldException, InvalidEmailException {
        user = new User(1,"Robert","trizax350@gmail.com","Trizax","itsatrytocreateatoolongpasswordfortest1");
    }
}
