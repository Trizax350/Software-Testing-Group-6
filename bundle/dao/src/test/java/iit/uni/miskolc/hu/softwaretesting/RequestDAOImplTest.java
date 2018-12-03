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
    public void testMakeRequest() throws Exception {
        Request request = new Request(10, "High", "Take course", "Leírás", "Számítógép hálózatok", 1);
        requestDAO.makeRequest(request);
    }

    @Test
    public void testModifyRequest() throws Exception {
        Request request = new Request(18, "Low", "Change group", "Leírás", "Fizika II.", 1);
        requestDAO.makeRequest(request);

        Request modifiedrequest = new Request(18, "High", "Revise exam", "Leírás2", "Fizika II.", 1);
        requestDAO.modifyRequest(modifiedrequest);
    }

    @Test
    public void testRemoveRequest() throws Exception {
        Request request = new Request(38, "Low", "Take course", "Leírás3", "Diszkrétmatematika II.", 4);
        requestDAO.makeRequest(request);

        requestDAO.removeRequest(request);
    }

    @Test
    public void testForwardRequest() throws Exception {
        Request request = new Request(20, "Low", "Take course", "Leírás3", "Diszkrétmatematika II.", 4);
        requestDAO.makeRequest(request);

        requestDAO.forwardRequest(request);
    }

    @Test
    public void testCreateFormType() throws Exception {
        requestDAO.createFormType("Example1");
    }

    @Test
    public void testDeleteFormType() throws Exception {
        requestDAO.createFormType("Example10");
        requestDAO.deleteFormType("Example10");
    }

    @Test
    public void testSearchAllRequest() throws Exception {
        Request request1 = new Request(40, "Low", "Take course", "Leírás1", "Diszkrétmatematika II.", 1);
        Request request2 = new Request(41, "High", "Take course", "Leírás2", "Diszkrétmatematika I.", 2);
        Request request3 = new Request(42, "High", "Take course", "Leírás3", "Diszkrétmatematika II.", 3);
        Request request4 = new Request(43, "Low", "Take course", "Leírás4", "Diszkrétmatematika II.", 4);
        Request request5 = new Request(44, "Low", "Take course", "Leírás5", "Diszkrétmatematika I.", 5);
        requestDAO.makeRequest(request1);
        requestDAO.makeRequest(request2);
        requestDAO.makeRequest(request3);
        requestDAO.makeRequest(request4);
        requestDAO.makeRequest(request5);
        requestDAO.searchAllRequest();
    }

    @Test
    public void testSearchAllReauestByType() throws Exception {
        Request request1 = new Request(40, "Low", "Take course", "Leírás1", "Diszkrétmatematika II.", 1);
        Request request2 = new Request(41, "High", "Change group", "Leírás2", "Diszkrétmatematika I.", 2);
        Request request3 = new Request(42, "High", "Take course", "Leírás3", "Diszkrétmatematika II.", 3);
        Request request4 = new Request(43, "Low", "Take course", "Leírás4", "Diszkrétmatematika II.", 4);
        Request request5 = new Request(44, "Low", "Change group", "Leírás5", "Diszkrétmatematika I.", 5);
        requestDAO.makeRequest(request1);
        requestDAO.makeRequest(request2);
        requestDAO.makeRequest(request3);
        requestDAO.makeRequest(request4);
        requestDAO.makeRequest(request5);
        requestDAO.searchAllRequestByType("Take Course");
    }

    @Test
    public void testSearchAllRequestByCourse() throws Exception {
        Request request1 = new Request(40, "Low", "Take course", "Leírás1", "Diszkrétmatematika II.", 1);
        Request request2 = new Request(41, "High", "Change group", "Leírás2", "Diszkrétmatematika I.", 2);
        Request request3 = new Request(42, "High", "Take course", "Leírás3", "Diszkrétmatematika II.", 3);
        Request request4 = new Request(43, "Low", "Take course", "Leírás4", "Diszkrétmatematika II.", 4);
        Request request5 = new Request(44, "Low", "Change group", "Leírás5", "Diszkrétmatematika I.", 5);
        requestDAO.makeRequest(request1);
        requestDAO.makeRequest(request2);
        requestDAO.makeRequest(request3);
        requestDAO.makeRequest(request4);
        requestDAO.makeRequest(request5);
        requestDAO.searchAllRequestByCourse("Diszkrétmatematika I.");
    }

    @Test
    public void testSearchAllRequestByUser() throws Exception {
        Request request1 = new Request(40, "Low", "Take course", "Leírás1", "Diszkrétmatematika II.", 1);
        Request request2 = new Request(41, "High", "Change group", "Leírás2", "Diszkrétmatematika I.", 2);
        Request request3 = new Request(42, "High", "Take course", "Leírás3", "Diszkrétmatematika II.", 2);
        Request request4 = new Request(43, "Low", "Take course", "Leírás4", "Diszkrétmatematika II.", 4);
        Request request5 = new Request(44, "Low", "Change group", "Leírás5", "Diszkrétmatematika I.", 2);
        requestDAO.makeRequest(request1);
        requestDAO.makeRequest(request2);
        requestDAO.makeRequest(request3);
        requestDAO.makeRequest(request4);
        requestDAO.makeRequest(request5);
        requestDAO.searchAllRequestByUser(2);
    }

    @Test
    public void testSearchRequestByID() throws Exception {
        Request request1 = new Request(40, "Low", "Take course", "Leírás1", "Diszkrétmatematika II.", 1);
        Request request2 = new Request(41, "High", "Change group", "Leírás2", "Diszkrétmatematika I.", 2);
        requestDAO.makeRequest(request1);
        requestDAO.makeRequest(request2);
        requestDAO.searchRequestById(40);
    }
}
