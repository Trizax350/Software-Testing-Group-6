package iit.uni.miskolc.hu.softwaretesting;

import iit.uni.miskolc.hu.softwaretesting.service.ManageRequestsInterfaceImpl;
import iit.uni.miskolc.hu.softwaretesting.model.Request;
import iit.uni.miskolc.hu.softwaretesting.dao.RequestDAO;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doReturn;

public class ManageRequestsInterfaceImplTest {

    @Mock
    private RequestDAO requestDAOMock;

    @InjectMocks
    private ManageRequestsInterfaceImpl requestManager;

    public ManageRequestsInterfaceImplTest() {
        super();
    }

    @Before
    public void start() throws Exception {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testSendRequest() throws Exception {
        Request request = new Request(1,"High","Take course", "Desc1", "Számítógép hálózatok", 1);
        requestManager.sendRequest(request);
    }

    @Test
    public void testUpdateRequest() throws Exception {
        Request request1 = new Request(1,"High","Take course", "Desc1", "Számítógép hálózatok", 1);
        Request request2 = new Request(1,"Low","Take course", "Desc1", "Számítógép hálózatok", 1);
        requestManager.sendRequest(request1);
        requestManager.updateRequest(request2);
    }

    @Test
    public void testDeleteRequest() throws Exception {
        Request request = new Request(1,"High","Take course", "Desc1", "Számítógép hálózatok", 1);
        requestManager.sendRequest(request);
        requestManager.deleteRequest(request);
    }

    @Test
    public void testForwardRequest() throws Exception {
        Request request = new Request(1,"High","Take course", "Desc1", "Számítógép hálózatok", 1);
        requestManager.sendRequest(request);
        requestManager.forwardRequest(request);
    }

    @Test
    public void testAddFormType() throws Exception{
        requestManager.addFormType("Example");
    }

    @Test
    public void testRemoveFormType() throws Exception{
        requestManager.removeFormType("Example");
    }

    @Test
    public void testGetAllRequest() throws Exception{
        ArrayList<Request> requests = new ArrayList<>();
        requests.add(new Request(1,"High","Take course", "Desc1", "Számítógép hálózatok", 1));

        doReturn(requests).when(requestDAOMock).searchAllRequest();
        assertEquals(requests, requestManager.getAllRequest());
    }

    @Test
    public void testGetAllRequestByType() throws Exception{
        ArrayList<Request> requests = new ArrayList<>();
        requests.add(new Request(1,"High","Take course", "Desc1", "Számítógép hálózatok", 1));

        doReturn(requests).when(requestDAOMock).searchAllRequestByType("Take course");
        assertEquals(requests, requestManager.getAllRequestByType("Take course"));
    }

    @Test
    public void testGetAllRequestByStatus() throws Exception{
        ArrayList<Request> requests = new ArrayList<>();
        requests.add(new Request(1,"High","Take course", "Desc1", "Számítógép hálózatok", 1));

        doReturn(requests).when(requestDAOMock).searchAllRequestByStatus(Request.Status.CLOSED);
        assertEquals(requests, requestManager.getAllRequestByStatus(Request.Status.CLOSED));
    }

    @Test
    public void testGetAllRequestWithComplain() throws Exception{
        ArrayList<Request> requests = new ArrayList<>();
        requests.add(new Request(1,"High","Take course", "Desc1", "Számítógép hálózatok", 1));

        doReturn(requests).when(requestDAOMock).searchAllRequestWithComplain();
        assertEquals(requests, requestManager.getAllRequestWithComplain());
    }

    @Test
    public void testGetAllRequestByCourse() throws Exception{
        ArrayList<Request> requests = new ArrayList<>();
        requests.add(new Request(1,"High","Take course", "Desc1", "Számítógép hálózatok", 1));

        doReturn(requests).when(requestDAOMock).searchAllRequestByCourse("Számítógép hálózatok");
        assertEquals(requests, requestManager.getAllRequestByCourse("Számítógép hálózatok"));
    }

    @Test
    public void testGetAllRequestByUser() throws Exception{
        ArrayList<Request> requests = new ArrayList<>();
        requests.add(new Request(1,"High","Take course", "Desc1", "Számítógép hálózatok", 1));

        doReturn(requests).when(requestDAOMock).searchAllRequestByUser(1);
        assertEquals(requests, requestManager.getAllRequestByUser(1));
    }

    @Test
    public void testFindRequestById() throws Exception{
        ArrayList<Request> requests = new ArrayList<>();
        requests.add(new Request(1,"High","Take course", "Desc1", "Számítógép hálózatok", 1));

        doReturn(requests).when(requestDAOMock).searchRequestById(1);
        assertEquals(requests, requestManager.findRequestById(1));
    }
}
