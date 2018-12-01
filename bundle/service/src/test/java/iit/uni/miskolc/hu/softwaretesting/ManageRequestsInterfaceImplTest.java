package iit.uni.miskolc.hu.softwaretesting;

import iit.uni.miskolc.hu.softwaretesting.service.ManageRequestsInterfaceImpl;
import iit.uni.miskolc.hu.softwaretesting.model.Request;
import iit.uni.miskolc.hu.softwaretesting.dao.RequestDAO;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;

public class ManageRequestsInterfaceImplTest {

    //@Mock
    private RequestDAO requestDAOMock;

    //@InjectMocks
    private ManageRequestsInterfaceImpl requestManager;

    public ManageRequestsInterfaceImplTest() {
        super();
    }

    @Before
    public void start() throws Exception {
        //MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testDendRequest(){

    }

    @Test
    public void testUpdateRequest(){

    }

    @Test
    public void testDeleteRequest(){

    }

    @Test
    public void testForwardRequest(){

    }

    @Test
    public void testAddFormType(){

    }

    @Test
    public void testRemoveFormType(){

    }

    @Test
    public void testGetAllRequest(){

    }

    @Test
    public void testGetAllRequestByType(){

    }

    @Test
    public void testGetAllRequestByStatus(){

    }

    @Test
    public void testGetAllRequestWithComplain() {

    }

    @Test
    public void testGetAllRequestByCourse(){

    }

    @Test
    public void testGetAllRequestByUser(){

    }

    @Test
    public void testFindRequestById(){

    }
}
