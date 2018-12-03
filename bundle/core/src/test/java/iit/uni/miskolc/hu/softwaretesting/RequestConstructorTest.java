package iit.uni.miskolc.hu.softwaretesting;

import iit.uni.miskolc.hu.softwaretesting.model.Request;
import iit.uni.miskolc.hu.softwaretesting.exceptions.*;
import org.junit.Test;

public class RequestConstructorTest {

    private Request request;

    @Test
    public void testConstructorWithCorrectValues() throws Exception {
        request = new Request(150,"Low","Take course","Only test with correct values","Course 1",20);
    }
    /**
     * This test runs the constructor with empty values
     */
    @Test(expected = EmptyFieldException.class)
    public void testConstructorWithEmptyValues() throws Exception {
        request = new Request(100,"","","","",10);
    }
}
