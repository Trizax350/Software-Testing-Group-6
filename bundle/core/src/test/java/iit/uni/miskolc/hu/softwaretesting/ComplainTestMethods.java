package iit.uni.miskolc.hu.softwaretesting;

import iit.uni.miskolc.hu.softwaretesting.exceptions.EmptyFieldException;
import iit.uni.miskolc.hu.softwaretesting.exceptions.InvalidIDValueException;
import iit.uni.miskolc.hu.softwaretesting.model.Complain;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import static org.junit.Assert.assertEquals;

public class ComplainTestMethods {

    private Complain complain;
    private int id = 1;
    private String description = "Desc";
    private int reqID = 1;

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Before
    public void createComplain() throws InvalidIDValueException, EmptyFieldException {
        complain = new Complain(id, description, reqID);
    }

    @Test
    public void testGetId() {
        assertEquals(this.id, this.complain.getId());
    }

    @Test
    public void testSetId() throws InvalidIDValueException {
        int id = 2;
        this.complain.setId(id);
        assertEquals(id, this.complain.getId());
    }

    @Test
    public void testGetDescription() {
        assertEquals(this.description, this.complain.getDescription());
    }

    @Test
    public void testSetDescription() throws EmptyFieldException {
        String desc = "asdfg";
        this.complain.setDescription(desc);
        assertEquals(desc, this.complain.getDescription());
    }

}
