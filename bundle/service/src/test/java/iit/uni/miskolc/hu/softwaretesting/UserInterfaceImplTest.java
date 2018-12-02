package iit.uni.miskolc.hu.softwaretesting;

import iit.uni.miskolc.hu.softwaretesting.model.User;
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
    public void testAddUser() throws Exception {
        User user = new User(11, "tesztuser", "tesztuser@gmail.com", "user1", "password1");
        userManager.addUser(user);
    }

    @Test
    public void testUpdateUser() throws Exception{
        User user = new User(11, "tesztuser", "tesztuser@gmail.com", "user1", "password1");
        User user2 = new User(11, "tesztuser", "tesztuser@gmail.com", "user1", "password222");

        userManager.addUser(user);
        userManager.updateUser(user2);

    }

    @Test
    public void testDeleteUser() throws Exception{
        User user = new User(13, "tesztuser", "tesztuser@gmail.com", "user1", "password1");

        userManager.addUser(user);
        userManager.deleteUser(user);

    }

    @Test
    public void testGetAllUser() throws Exception{
        ArrayList<User> allUsers = new ArrayList<>();
        allUsers.add(new User(11, "tesztuser", "tesztuser@gmail.com","user1","password1"));

        doReturn(allUsers).when(userDAOMock).searchAllUser();
        assertEquals(allUsers, userManager.getAllUser());
    }

    @Test
    public void testGetAllUserByCourse() throws Exception{
        ArrayList<User> allUsers = new ArrayList<>();
        allUsers.add(new User(11, "tesztuser", "tesztuser@gmail.com","user1","password1"));

        doReturn(allUsers).when(userDAOMock).searchAllUserByCourse("szoftverteszteles");
        assertEquals(allUsers,userManager.getAllUserByCourse("szoftverteszteles"));
    }

    @Test
    public void testGetAllUserWithOpenRequest() throws Exception {
        ArrayList<User> allUsers = new ArrayList<>();
        allUsers.add(new User(11, "tesztuser", "tesztuser@gmail.com","user1","password1"));

        doReturn(allUsers).when(userDAOMock).searchAllUser();
        assertEquals(allUsers, userManager.getAllUser());

    }
}
