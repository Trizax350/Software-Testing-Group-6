package iit.uni.miskolc.hu.softwaretesting;

import iit.uni.miskolc.hu.softwaretesting.model.User;
import iit.uni.miskolc.hu.softwaretesting.exceptions.EmptyFieldException;
import iit.uni.miskolc.hu.softwaretesting.exceptions.InvalidIDValueException;
import iit.uni.miskolc.hu.softwaretesting.exceptions.InvalidPasswordLengthException;
import org.junit.Test;

public class UserConstructorTest {

    private User user;

    /**
     * This test runs the constructor with empty values
     */
    @Test(expected = EmptyFieldException.class)
    public void testConstructorWithEmptyValues() throws EmptyFieldException, InvalidIDValueException, InvalidPasswordLengthException {
        user = new User(0,"","","","");
    }

    /**
     * This test runs the constructor with too less password length
     */
    @Test(expected = InvalidPasswordLengthException.class)
    public void testConstructorWithTooLessPassword() throws InvalidPasswordLengthException, InvalidIDValueException, EmptyFieldException {
        user = new User(1,"Robert","trizax350@gmail.com","Trizax","asd");
    }

    /**
     * This test runs the constructor with too long password length
     */
    @Test(expected = InvalidPasswordLengthException.class)
    public void testConstructorWithTooLongPassword() throws InvalidPasswordLengthException, InvalidIDValueException, EmptyFieldException {
        user = new User(1,"Robert","trizax350@gmail.com","Trizax","itsatrytocreateatoolongpasswordfortest1");
    }
}
