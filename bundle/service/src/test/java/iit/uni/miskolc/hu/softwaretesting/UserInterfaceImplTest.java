package iit.uni.miskolc.hu.softwaretesting;

import iit.uni.miskolc.hu.softwaretesting.model.User;
import iit.uni.miskolc.hu.softwaretesting.service.UserInterfaceImpl;
import iit.uni.miskolc.hu.softwaretesting.dao.UserDAO;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doReturn;

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

    @Test(expected = AlreadyExistsException.class)
    public void testAddUser() throws AlreadyExistsException,  EmptyFieldException {
        User user = new User(11, "tesztuser", "tesztuser@gmail.com", "user1", "password1");
        doThrow(new AlreadyExistsException("That user already exists"))
                .when(userDAOMock).createUser(user);
        userManager.addUser(user);
    }

    @Test(expected = UserNotFoundException.class)
    public void testUpdateUser() throws UserNotFoundException,EmptyFieldException {
        User user = new User(11, "tesztuser", "tesztuser@gmail.com", "user1", "password1");
        User user2 = new User(11, "tesztuser", "tesztuser@gmail.com", "user1", "password222");
        doThrow(new UserNotFoundException("Couldn't find that user"))
            .when(userDAOMock).modifyUser(user2);
        userManager.addUser(user);
        userManager.updateUser(user2);
    }

    @Test(expected = UserNotFoundException.class)
    public void testDeleteUser() throws UserNotFoundException, EmptyFieldException{
        User user = new User(13, "tesztuser", "tesztuser@gmail.com", "user1", "password1");
        doThrow(UserNotFoundException.class).when(userDAOMock).removeUser(user);
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

    @Test(expected = InvalidCourseNameException.class)
    public void testGetAllUserByCourse() throws InvalidCourseNameException, CourseNotFoundException {
        ArrayList<User> allUsers = new ArrayList<>();
        allUsers.add(new User(11, "tesztuser", "tesztuser@gmail.com","user1","password1"));
        doThrow(new InvalidCourseNameException("no course exists with this name"))
                .when(userDAOMock).searchAllUserByCourse("szoftverteszteles");
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
