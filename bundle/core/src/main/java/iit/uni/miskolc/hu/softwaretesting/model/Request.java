package iit.uni.miskolc.hu.softwaretesting.model;

import iit.uni.miskolc.hu.softwaretesting.exceptions.EmptyFieldException;
import iit.uni.miskolc.hu.softwaretesting.exceptions.InvalidIDValueException;

public class Request {
    private int id;
    private String priority;
    private String type;
    private String description;
    private String reference_to_the_Course;
    private int referenceToUser;
    private String status;

    public Request(int id, String priority, String type, String description, String reference_to_the_Course, int referenceToUser, String status) throws InvalidIDValueException, EmptyFieldException {
        testRequestID(id);
        testRequestPriority(priority);
        testRequestType(type);
        testRequestDescription(description);
        testRequestReferenceToTheCourse(reference_to_the_Course);
        testRequestStatus(status);

        this.id = id;
        this.priority = priority;
        this.type = type;
        this.description = description;
        this.reference_to_the_Course = reference_to_the_Course;
        this.referenceToUser = referenceToUser;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getReference_to_the_Course() {
        return reference_to_the_Course;
    }

    public void setReference_to_the_Course(String reference_to_the_Course) {
        this.reference_to_the_Course = reference_to_the_Course;
    }

    public int getReferenceToUser() { return referenceToUser; }

    public void setReferenceToUser(int referenceToUser) {
        this.referenceToUser = referenceToUser;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
    private void testRequestType(String type) throws EmptyFieldException {
        if(type.length() < 1)
            throw new EmptyFieldException("The type can't be empty!");
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

    /**
     * The status cant be empty
     */
    private void testRequestStatus(String status) throws EmptyFieldException {
        if(status.length() < 1)
            throw new EmptyFieldException("The status can't be empty!");
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Request{" +
                "id=" + id +
                ", priority='" + priority + '\'' +
                ", type='" + type + '\'' +
                ", description='" + description + '\'' +
                ", reference_to_the_Course='" + reference_to_the_Course + '\'' +
                ", referenceToUSer='" + referenceToUser + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
