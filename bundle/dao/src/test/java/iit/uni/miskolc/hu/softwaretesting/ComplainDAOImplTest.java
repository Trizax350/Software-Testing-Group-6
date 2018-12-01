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

    @Test
    public void testAcceptComplain() throws Exception{
        Complain complain = new Complain(33, "leiras10", 8);
        complainDAO.createComplain(complain);

        complainDAO.acceptComplain(complain);
    }

    @Test
    public void testRejectComplain() throws Exception{
        Complain complain = new Complain(30, "leiras14", 4);
        complainDAO.createComplain(complain);

        complainDAO.rejectComplain(complain);
    }

    @Test
    public void testGetAllComplain() throws Exception{
        Complain complain1 = new Complain(40, "leiras40", 1);
        Complain complain2 = new Complain(41, "leiras41", 2);
        Complain complain3 = new Complain(42, "leiras42", 3);
        Complain complain4 = new Complain(43, "leiras43", 4);
        Complain complain5 = new Complain(44, "leiras44", 5);
        Complain complain6 = new Complain(45, "leiras45", 6);
        Complain complain7 = new Complain(46, "leiras46", 7);
        complainDAO.createComplain(complain1);
        complainDAO.createComplain(complain2);
        complainDAO.createComplain(complain3);
        complainDAO.createComplain(complain4);
        complainDAO.createComplain(complain5);
        complainDAO.createComplain(complain6);
        complainDAO.createComplain(complain7);
        complainDAO.getAllComplain();
    }

    @Test
    public void testGetAllComplainByRequest() throws Exception{
        Complain complain1 = new Complain(44, "leiras44", 7);
        Complain complain2 = new Complain(45, "leiras45", 7);
        Complain complain3 = new Complain(46, "leiras46", 7);
        complainDAO.createComplain(complain1);
        complainDAO.createComplain(complain2);
        complainDAO.createComplain(complain3);
        complainDAO.getAllComplainByRequest(7);
    }

    @Test
    public void testFindComplainByID() throws Exception{
        Complain complain = new Complain(80, "leiras", 10);
        complainDAO.createComplain(complain);
        complainDAO.findComplainById(80);
    }
}
