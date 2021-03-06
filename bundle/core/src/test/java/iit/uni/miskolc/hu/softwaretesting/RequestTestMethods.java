package iit.uni.miskolc.hu.softwaretesting;

import iit.uni.miskolc.hu.softwaretesting.exceptions.InvalidFormTypeException;
import iit.uni.miskolc.hu.softwaretesting.model.Request;
import iit.uni.miskolc.hu.softwaretesting.exceptions.EmptyFieldException;
import iit.uni.miskolc.hu.softwaretesting.exceptions.InvalidIDValueException;
import iit.uni.miskolc.hu.softwaretesting.model.Request.Forwarded;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;

public class RequestTestMethods {

    private Request request;
    private int id=11;
    private String priority="Low";
    private String type="Revise exam";
    private String description="Desc";
    private String reference_to_the_Course="Example";
    private int referenceToUser=1;

    @Before
    public void setUp() throws EmptyFieldException, InvalidIDValueException, InvalidFormTypeException {
            request = new Request(this.id, this.priority, this.type, this.description, this.reference_to_the_Course, this.referenceToUser);
    }

    @Test
    public void testGetId(){
        assertEquals(request.getId(), this.id);
    }

    @Test
    public void testSetId() throws InvalidIDValueException {
        request.setId(22);
        assertEquals(request.getId(), 22);
    }

    @Test
    public void testGetPriority() {
        assertEquals(request.getPriority(), this.priority);
    }

    @Test
    public void testSetPriority() throws EmptyFieldException {
        request.setPriority("High");
        assertEquals(request.getPriority(), "High");
    }

    @Test
    public void testGetType() {
        assertEquals(request.getType(), this.type);
    }

    @Test
    public void testSetType() throws EmptyFieldException, InvalidFormTypeException {
        request.setType("Take course");
        assertEquals(request.getType(), "Take course");
    }

    @Test
    public void testGetDescription() {
        assertEquals(request.getDescription(), this.description);
    }

    @Test
    public void testSetDescription() throws EmptyFieldException{
        request.setDescription("Leiras");
        assertEquals(request.getDescription(), "Leiras");
    }

    @Test
    public void testGetReference_to_the_Course() {
        assertEquals(request.getReference_to_the_Course(), this.reference_to_the_Course);
    }

    @Test
    public void testSetReference_to_the_Course() throws EmptyFieldException{
        request.setReference_to_the_Course("Reference");
        assertEquals(request.getReference_to_the_Course(), "Reference");
    }

    @Test
    public void testGetReferenceToUser() {
        assertEquals(request.getReferenceToUser(), this.referenceToUser);
    }

    @Test
    public void testSetReferenceToUser() throws EmptyFieldException{
        request.setReferenceToUser(33);
        assertEquals(request.getReferenceToUser(), 33);
    }

    @Test
    public void testGetStatus() {
        assertEquals(request.getStatus(), Request.Status.OPEN);
    }

    @Test
    public void testSetStatus() throws EmptyFieldException{
        request.setStatus(Request.Status.CLOSED);
        assertEquals(request.getStatus(), Request.Status.CLOSED);
    }

    @Test
    public void testGetForwarded() {
        assertEquals(request.getForwarded(), Forwarded.NOT_FORWARDED);
    }

    @Test
    public void testSetForwarded() {
        request.setForwarded(Forwarded.FORWARDED);
        assertEquals(request.getForwarded(), Forwarded.FORWARDED);
    }

}
