package iit.uni.miskolc.hu.softwaretesting;

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
    public void testMakeRequest(){
        Request request = new Request(10, "High", 'Típus', 'Leírás', "Számítógép hálózatok", 1, 'Open');
        requestDAO.makeRequest(request);
    }

    @Test
    public void testModifyRequest(){
        Request request = new Request(18, "Low", 'Típus', 'Leírás', "Fizika II.", 1, 'Open');
        requestDAO.makeRequest(request);

        Request modifiedrequest = new Request(18, "High", 'Típus', 'Leírás2', "Fizika II.", 1, 'Open');
        requestDAO.makeRequest(modifiedrequest);
    }

    @Test
    public void testRemoveRequest(){
        Request request = new Request(38, "Low", 'Típus3', 'Leírás3', "Diszkrétmatematika II.", 4, 'Open');
        requestDAO.makeRequest(request);

        requestDAO.removeRequest(request);
    }
}
