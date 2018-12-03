package iit.uni.miskolc.hu.softwaretesting;

import iit.uni.miskolc.hu.softwaretesting.dao.ComplainDAO;
import iit.uni.miskolc.hu.softwaretesting.model.Complain;
import iit.uni.miskolc.hu.softwaretesting.service.ManageComplainsInterfaceImpl;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.Collection;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doReturn;

public class ManageComplainsInterfaceImplTest {

    @Mock
    private ComplainDAO complainDAOMock;

    @InjectMocks
    private ManageComplainsInterfaceImpl complainManager;

    public ManageComplainsInterfaceImplTest() {
        super();
    }

    @Before
    public void start() throws Exception {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testMakeComplain() throws Exception{
        Complain complain = new Complain(11, "leiras", 11);
        complainManager.makeComplain(complain);
    }

    @Test
    public void testUpdateComplain()throws Exception{
        Complain complain1 = new Complain(11, "leiras1", 1);
        Complain complain2 = new Complain(11, "leiras2", 1);

        complainManager.makeComplain(complain1);
        complainManager.updateComplain(complain2);
    }

    @Test
    public void testDeleteComplain() throws Exception{
        Complain complain= new Complain(11, "leiras", 1);

        complainManager.makeComplain(complain);
        complainManager.deleteComplain(complain);
    }

    @Test
    public void testAcceptComplain() throws Exception{
        Complain complain= new Complain(11, "leiras", 1);

        complainManager.makeComplain(complain);
        complainManager.acceptComplain(complain);
    }

    @Test
    public void testRejectComplain() throws Exception{
        Complain complain= new Complain(11, "leiras", 1);

        complainManager.makeComplain(complain);
        complainManager.rejectComplain(complain);
    }

    @Test
    public void testGetAllComplain() throws Exception{
        ArrayList<Complain> complains = new ArrayList<>();
        complains.add(new Complain(11, "leiras", 1));

        doReturn(complains).when(complainDAOMock).getAllComplain();
        assertEquals(complains, complainManager.getAllComplain());
    }

    @Test
    public void testGetAllComplainByRequest() throws Exception{
        ArrayList<Complain> complains = new ArrayList<>();
        complains.add(new Complain(11, "leiras", 1));

        doReturn(complains).when(complainDAOMock).getAllComplainByRequest(1);
        assertEquals(complains, complainManager.getAllComplainByRequest(1));
    }

    @Test
    public void testFindComplainById() throws Exception{
        ArrayList<Complain> complains = new ArrayList<>();
        complains.add(new Complain(11, "leiras", 1));

        doReturn(complains).when(complainDAOMock).findComplainById(1);
        assertEquals(complains, complainManager.findComplainById(1));
    }
}
