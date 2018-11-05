package iit.uni.miskolc.hu.softwaretesting;

import iit.uni.miskolc.hu.softwaretesting.model.Request;
import iit.uni.miskolc.hu.softwaretesting.exceptions.EmptyFieldException;
import iit.uni.miskolc.hu.softwaretesting.exceptions.InvalidIDValueException;
import iit.uni.miskolc.hu.softwaretesting.exceptions.RequestAlreadyClosedException;
import org.junit.Test;

public class RequestConstructorTest {

    private Request request;

    /**
     * This test runs the constructor with empty values
     */
    @Test(expected = EmptyFieldException.class)
    public void testConstructorWithEmptyValues() throws EmptyFieldException, InvalidIDValueException {
        request = new Request(0,"","","","",0,"");
    }

    /**
     * This test runs the constructor with closed status
     */
    @Test(expected = RequestAlreadyClosedException.class)
    public void testConstructorWithClosedStatus() throws RequestAlreadyClosedException, InvalidIDValueException, EmptyFieldException {
        request = new Request(1,"Low","Example","Desc","Example",1,"Closed");
    }
}
