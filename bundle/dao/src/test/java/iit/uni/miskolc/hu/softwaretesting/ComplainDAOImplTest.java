package iit.uni.miskolc.hu.softwaretesting;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import iit.uni.miskolc.hu.softwaretesting.model.Complain;

public class ComplainDAOImplTest {
    private ComplainDAOImpl complainDAO;

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Before
    public void start() throws Exception{
        complainDAO = new ComplainDAOImpl();
    }

    @Test
    public void testCreateComplain() throws Exception{
        Complain complain = new Complain(12, "leiras", 1);
        complainDAO.createComplain(complain);
    }

    @Test
    public void testModifyComplain() throws Exception{
        Complain complain = new Complain(15, "leiras", 1);
        complainDAO.createComplain(complain);

        Complain modifiedComplain = new Complain(45, "leiras2", 1);
        complainDAO.modifyComplain(modifiedComplain);
    }

    @Test
    public void testRemoveComplain() throws Exception{
        Complain complain = new Complain(19, "leiras", 1);
        complainDAO.createComplain(complain);

        complainDAO.removeComplain(complain);
    }

}
