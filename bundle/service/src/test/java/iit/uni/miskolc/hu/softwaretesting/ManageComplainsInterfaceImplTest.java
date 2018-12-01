package iit.uni.miskolc.hu.softwaretesting;

import iit.uni.miskolc.hu.softwaretesting.dao.ComplainDAO;
import iit.uni.miskolc.hu.softwaretesting.model.Complain;
import iit.uni.miskolc.hu.softwaretesting.service.ManageComplainsInterfaceImpl;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Collection;

import static org.junit.Assert.assertEquals;

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
    public void testMakeComplain(){

    }

    @Test
    public void testUpdateComplain(){

    }

    @Test
    public void testDeleteComplain(){

    }

    @Test
    public void testAcceptComplain(){

    }

    @Test
    public void testRejectComplain(){

    }

    @Test
    public void testGetAllComplain(){

    }

    @Test
    public void testGetAllComplainByRequest(){

    }

    @Test
    public void testFindComplainById(){

    }
}
