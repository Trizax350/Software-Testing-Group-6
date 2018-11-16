package iit.uni.miskolc.hu.softwaretesting;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import iit.uni.miskolc.hu.softwaretesting.model.Request;

public class UserDAOImplTest {
    private UserDAOImpl userDAO;

    @Rule
    public ExpectedException excetionRule = ExpectedException.none();

    @Before
    public void start() throws Exception{
        userDAO = new UserDAOImpl();
    }

    @Test
    public void testCreateUser(){
        User user1 = new User(1, 'Kiss János', 'kissjanos@gmail.com', 'janoskiss', 'jelszo');
        userDAO.createUser(user1);

        User user2 = new User(2, 'Nagy Ferenc', 'nagyferenc@gmail.com', 'ferencnagy', 'asd123');
        userDAO.createUser(user2);
    }

    @Test
    public void testModifyUser(){
        User user = new User(10, 'Rónai Károly', 'ronaikaroly@gmail.com', 'karoly', 'probajelszo');
        userDAO.createUser(user);

        User modifieduser = new User(10, 'Rónai Károly', 'ronaikaroly@gmail.com', 'karolyronai', 'tejfoloslangos');
        userDAO.modifyUser(modifieduser);
    }

    @Test
    public void testRemoveUser(){
        User user = new User(94, 'Sajt Péter', 'sajtpeter@gmail.com', 'peter', 'sajtosvalami');
        userDAO.createUser(user);
        userDAO.removeUser(user);
    }
}
