package iit.uni.miskolc.hu.softwaretesting;

import iit.uni.miskolc.hu.softwaretesting.exceptions.RequestAlreadyExistsException;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import iit.uni.miskolc.hu.softwaretesting.model.Request;

public class RequestDAOImplTest {
    private RequestDAOImpl requestDAO;

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Before
    public void start() throws Exception{
        requestDAO = new RequestDAOImpl();
    }

    @Test
    public void testMakeRequest() throws Exception {
        Request request = new Request(10, "High", "Take course", "Leírás", "Számítógép hálózatok", 1);
        requestDAO.makeRequest(request);
    }

    @Test
    public void testModifyRequest() throws Exception {
        Request request = new Request(18, "Low", "Change group", "Leírás", "Fizika II.", 1);
        requestDAO.makeRequest(request);

        Request modifiedrequest = new Request(18, "High", "Revise exam", "Leírás2", "Fizika II.", 1);
        requestDAO.makeRequest(modifiedrequest);
    }

    @Test
    public void testRemoveRequest() throws Exception {
        Request request = new Request(38, "Low", "Take course", "Leírás3", "Diszkrétmatematika II.", 4);
        requestDAO.makeRequest(request);

        requestDAO.removeRequest(request);
    }
}
