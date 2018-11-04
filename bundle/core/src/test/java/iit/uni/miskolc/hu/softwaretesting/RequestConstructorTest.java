package iit.uni.miskolc.hu.softwaretesting;

import iit.uni.miskolc.hu.softwaretesting.model.Request;
import iit.uni.miskolc.hu.softwaretesting.service.exceptions.EmptyFieldException;
import iit.uni.miskolc.hu.softwaretesting.service.exceptions.RequestAlreadyClosedException;
import org.junit.Test;

public class RequestConstructorTest {

    private Request request;

    /**
     * This test runs the constructor with empty values
     */
    @Test
    public void testConstructorWithEmptyValues() throws EmptyFieldException {
        request = new Request(0,"","","","",0,"");
    }

    /**
     * This test runs the constructor with closed status
     */
    @Test
    public void testConstructorWithClosedStatus() throws RequestAlreadyClosedException {
        request = new Request(1,"Low","Example","Desc","Example",1,"Closed");
    }
}
