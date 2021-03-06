package iit.uni.miskolc.hu.softwaretesting.model;

import iit.uni.miskolc.hu.softwaretesting.exceptions.*;
import org.omg.CORBA.DynAnyPackage.Invalid;

import java.util.ArrayList;
import java.util.Arrays;

public class Request {

    public static ArrayList<String> formTypes = new ArrayList<>(Arrays.asList("Take course", "Revise exam", "Change group"));

    public enum Forwarded {
        FORWARDED, NOT_FORWARDED
    }

    public enum Status {
        OPEN, CLOSED
    }

    private int id;
    private String priority;
    private String type;
    private String description;
    private String reference_to_the_Course;
    private int referenceToUser;
    private Status status;
    private Forwarded forwarded;

    public Request(int id, String priority, String type, String description, String reference_to_the_Course, int referenceToUser) throws InvalidIDValueException, InvalidFormTypeException, EmptyFieldException {
        testRequestID(id);
        testRequestPriority(priority);
        testRequestType(type);
        testRequestDescription(description);
        testRequestReferenceToTheCourse(reference_to_the_Course);
        testRequestReferenceToUser(referenceToUser);

        this.id = id;
        this.priority = priority;
        this.type = type;
        this.description = description;
        this.reference_to_the_Course = reference_to_the_Course;
        this.referenceToUser = referenceToUser;
        this.status = Status.OPEN;
        this.forwarded = Forwarded.NOT_FORWARDED;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) throws InvalidIDValueException {
        testRequestID(id);
        this.id = id;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) throws EmptyFieldException {
        testRequestPriority(priority);
        this.priority = priority;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) throws EmptyFieldException, InvalidFormTypeException {
        testRequestType(type);
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) throws EmptyFieldException {
        testRequestDescription(description);
        this.description = description;
    }

    public String getReference_to_the_Course() {
        return reference_to_the_Course;
    }

    public void setReference_to_the_Course(String reference_to_the_Course) throws EmptyFieldException{
        testRequestReferenceToTheCourse(reference_to_the_Course);
        this.reference_to_the_Course = reference_to_the_Course;
    }

    public int getReferenceToUser() { return referenceToUser; }

    public void setReferenceToUser(int referenceToUser) throws EmptyFieldException {
        testRequestReferenceToUser(referenceToUser);
        this.referenceToUser = referenceToUser;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Forwarded getForwarded() {
        return forwarded;
    }

    public void setForwarded(Forwarded forwarded) {
        this.forwarded = forwarded;
    }

    public static void addFormType(String type) throws AlreadyExistsException {
        if(formTypes.contains(type)) throw new AlreadyExistsException("Ez a kérvénytípus már létezik");
        formTypes.add(type);
    }

    public static void removeFormType(String type) throws InvalidFormTypeException {
        boolean found = false;
        for(int i = 0; i < formTypes.size(); i++) {
            if(type.equals(formTypes.get(i))) {
                formTypes.remove(i);
                found = true;
            }
        }
        if(!found) throw new InvalidFormTypeException("Ilyen kérvénytípus nem létezik");
    }

    /**
     * The id cant be lower than 1
     */
    private void testRequestID(int id) throws InvalidIDValueException {
        if(id < 1)
            throw new InvalidIDValueException("The id can't be lower than 1!");
    }

    /**
     * The priority cant be empty
     */
    private void testRequestPriority(String priority) throws EmptyFieldException {
        if(priority.length() < 1)
            throw new EmptyFieldException("The priority can't be empty!");
    }

    /**
     * The type cant be empty
     */
    private void testRequestType(String type) throws EmptyFieldException, InvalidFormTypeException {
        if(type.length() < 1)
            throw new EmptyFieldException("The type can't be empty!");

        boolean validType = false;
        for(int i = 0; i < formTypes.size(); i++) {
            if(type.equals(formTypes.get(i))) validType = true;
        }
        if(!validType)
            throw new InvalidFormTypeException("This type isn't exist");
    }

    /**
     * The description cant be empty
     */
    private void testRequestDescription(String description) throws EmptyFieldException {
        if(description.length() < 1)
            throw new EmptyFieldException("The description can't be empty!");
    }

    /**
     * The reference_to_the_Course cant be empty
     */
    private void testRequestReferenceToTheCourse(String reference_to_the_Course) throws EmptyFieldException {
        if(reference_to_the_Course.length() < 1)
            throw new EmptyFieldException("The reference to the course field can't be empty!");
    }

    private void testRequestReferenceToUser(int referenceToUser) throws EmptyFieldException {
        if(referenceToUser < 1)
            throw new EmptyFieldException("The reference to the course field can't be empty!");
    }

    @Override
    public String toString() {
        return "Request{" +
                "id=" + id +
                ", priority='" + priority + '\'' +
                ", type='" + type + '\'' +
                ", description='" + description + '\'' +
                ", reference_to_the_Course='" + reference_to_the_Course + '\'' +
                ", referenceToUser=" + referenceToUser +
                ", status='" + status + '\'' +
                ", forwarded=" + forwarded +
                '}';
    }
}
