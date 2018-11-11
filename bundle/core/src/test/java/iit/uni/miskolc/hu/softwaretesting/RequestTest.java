package iit.uni.miskolc.hu.softwaretesting;

import iit.uni.miskolc.hu.softwaretesting.exceptions.EmptyFieldException;
import iit.uni.miskolc.hu.softwaretesting.exceptions.InvalidIDValueException;
import iit.uni.miskolc.hu.softwaretesting.model.Request;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class RequestTest {
    private Request request;
    private int id = 155;
    private String priority = "High";
    private String type = "Type 1";
    private String description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
    private String reference_to_the_Course = "Course 1";
    private int referenceToUser = 12;
    private String status = "Open";

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Before
    public void createRequest() throws InvalidIDValueException, EmptyFieldException {
        request = new Request(this.id, this.priority, this.type, this.description, this.reference_to_the_Course, this.referenceToUser, this.status);
    }

    @Test
    public void testGetID(){
        assertEquals(this.id, this.request.getId());
    }

    @Test
    public void testSetID() throws InvalidIDValueException {
        int id = 231;
        this.request.setId(id);
        assertEquals(id, this.request.getId());
    }

    @Test
    public void testGetPriority(){
        assertEquals(this.priority, this.request.getPriority());
    }

    @Test
    public void testSetPriority() throws EmptyFieldException {
        String priority = "Low";
        this.request.setPriority(priority);
        assertEquals(priority, this.request.getPriority());
    }

    @Test
    public void testGetType(){
        assertEquals(this.type, this.request.getType());
    }

    @Test
    public void testSetType() throws EmptyFieldException {
        String type = "Type 8";
        this.request.setType(type);
        assertEquals(type, this.request.getType());
    }

    @Test
    public void testGetDescription(){
        assertEquals(this.description, this.request.getDescription());
    }

    @Test
    public void testSetDescription() throws EmptyFieldException {
        String description = "This is a description.";
        this.request.setDescription(description);
        assertEquals(description, this.request.getDescription());
    }

    @Test
    public void testGetReference_to_the_Course(){
        assertEquals(this.reference_to_the_Course, this.request.getReference_to_the_Course());
    }

    @Test
    public void testSetReference_to_the_Course() throws EmptyFieldException {
        String reference_to_the_Course = "Course 10";
        this.request.setReference_to_the_Course(reference_to_the_Course);
        assertEquals(reference_to_the_Course, this.request.getReference_to_the_Course());
    }

    @Test
    public void testGetReferenceToUser(){
        assertEquals(this.referenceToUser, this.request.getReferenceToUser());
    }

    @Test
    public void testSetReferenceToUser() throws EmptyFieldException {
        int referenceToUser = 8;
        this.request.setReferenceToUser(referenceToUser);
        assertEquals(referenceToUser, this.request.getReferenceToUser());
    }

    @Test
    public void testGetStatus(){
        assertEquals(this.status, this.request.getStatus());
    }

    @Test
    public void testSetStatus() throws EmptyFieldException {
        String status = "Open";
        this.request.setStatus(status);
        assertEquals(status, this.request.getStatus());
    }
}
