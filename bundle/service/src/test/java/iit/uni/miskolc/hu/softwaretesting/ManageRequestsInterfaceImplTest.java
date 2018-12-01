package iit.uni.miskolc.hu.softwaretesting;

import iit.uni.miskolc.hu.softwaretesting.service.ManageRequestsInterfaceImpl;
import iit.uni.miskolc.hu.softwaretesting.model.Request;
import iit.uni.miskolc.hu.softwaretesting.dao.RequestDAO;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

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
    public void testGetAllRequest(){
        requestManager.getAllRequest();
    }

    @Test
    public void testGetAllRequestByType(){
        requestManager.getAllRequestByType("Take course");
    }

    @Test
    public void testGetAllRequestByStatus(){
        requestManager.getAllRequestByStatus(Request.Status.CLOSED);
    }

    @Test
    public void testGetAllRequestWithComplain() {
        requestManager.getAllRequestWithComplain();
    }

    @Test
    public void testGetAllRequestByCourse() throws Exception{
        requestManager.getAllRequestByCourse("Számítógép hálózatok");
    }

    @Test
    public void testGetAllRequestByUser() throws Exception{
        requestManager.getAllRequestByUser(1);
    }

    @Test
    public void testFindRequestById() throws Exception{
        requestManager.findRequestById(4);
    }
}
