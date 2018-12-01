package iit.uni.miskolc.hu.softwaretesting;

import iit.uni.miskolc.hu.softwaretesting.model.User;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class UserDAOImplTest {

    private UserDAOImpl userDAO;

    @Rule
    public ExpectedException excetionRule = ExpectedException.none();

    @Before
    public void start() throws Exception{
        userDAO = new UserDAOImpl();
    }

    @Test
    public void testCreateUser() throws Exception {
        User user1 = new User(5, "Kis János", "kissjanos@gmail.com", "janoskiss", "Jelszo23");
        userDAO.createUser(user1);

        User user2 = new User(6, "Nagy Ferenc", "nagyferenc@gmail.com", "ferencnagy", "Asd123");
        userDAO.createUser(user2);
    }

    @Test
    public void testModifyUser() throws  Exception {
        User user = new User(10, "Rónai Károly", "ronaikaroly@gmail.com", "karoly", "Probajelszo1");
        userDAO.createUser(user);

        User modifieduser = new User(10, "Rónai Károly", "ronaikaroly@gmail.com", "karolyronai", "Tejfoloslangos2");
        userDAO.modifyUser(modifieduser);
    }

    @Test
    public void testRemoveUser() throws  Exception{
        User user = new User(94, "Sajt Péter", "sajtpeter@gmail.com", "peter", "Sajtosvalami2");
        userDAO.createUser(user);
        userDAO.removeUser(user);
    }
}
