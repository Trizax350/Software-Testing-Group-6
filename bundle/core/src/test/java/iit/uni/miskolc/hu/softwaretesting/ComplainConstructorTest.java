package iit.uni.miskolc.hu.softwaretesting;

import iit.uni.miskolc.hu.softwaretesting.exceptions.EmptyFieldException;
import iit.uni.miskolc.hu.softwaretesting.exceptions.InvalidIDValueException;
import iit.uni.miskolc.hu.softwaretesting.model.Complain;
import org.junit.Test;

public class ComplainConstructorTest {

    private Complain complain;

    @Test
    public void testConstructorWithCorrectValues() throws Exception {
        complain = new Complain(1, "Desc", 1);
    }

    @Test(expected = InvalidIDValueException.class)
    public void testConstructorWithInvalidID() throws Exception {
        complain = new Complain(0, "Desc", 2);
    }

    @Test(expected = InvalidIDValueException.class)
    public void testConstructorWithInvalidRequestID() throws Exception {
        complain = new Complain(1, "Desc", -1);
    }

    @Test(expected = EmptyFieldException.class)
    public void testConstructorWithEmptyDescription() throws Exception {
        complain = new Complain(1, "", 1);
    }

}