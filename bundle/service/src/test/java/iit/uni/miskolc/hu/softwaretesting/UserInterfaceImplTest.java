package iit.uni.miskolc.hu.softwaretesting;

import iit.uni.miskolc.hu.softwaretesting.service.UserInterfaceImpl;
import iit.uni.miskolc.hu.softwaretesting.dao.UserDAO;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;

public class UserInterfaceImplTest {

    @Mock
    private UserDAO userDAOMock;

    @InjectMocks
    private UserInterfaceImpl userManager;

    public UserInterfaceImplTest() {
        super();
    }

    @Before
    public void start() throws Exception {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testAddUser(){

    }

    @Test
    public void testUpdateUser(){

    }

    @Test
    public void testDeleteUser(){

    }

    @Test
    public void testGetAllUser(){

    }

    @Test
    public void testGetAllUserByCourse(){
    }

    @Test
    public void testGetAllUserWithOpenRequest(){

    }
}
