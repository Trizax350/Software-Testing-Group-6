package iit.uni.miskolc.hu.softwaretesting.model;

import iit.uni.miskolc.hu.softwaretesting.exceptions.*;

public class Complain {

    public enum ComplainStatus {
        ACCEPTED, REJECTED
    }

    private int id;
    private String description;
    private ComplainStatus complainStatus;
    private int req_id;

    public Complain(int id, String description, int req_id) throws InvalidIDValueException, EmptyFieldException {
        testId(id);
        testId(req_id);
        testDescription(description);

        this.id = id;
        this.description = description;
        this.req_id = req_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) throws InvalidIDValueException{
        testId(id);
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) throws EmptyFieldException {
        testDescription(description);
        this.description = description;
    }

    public int getReq_id() {
        return req_id;
    }

    public void setReq_id(int req_id) throws InvalidIDValueException {
        testId(req_id);
        this.req_id = req_id;
    }

    public ComplainStatus getComplainStatus() {
        return complainStatus;
    }

    public void setComplainStatus(ComplainStatus complainStatus) {
        this.complainStatus = complainStatus;
    }

    private void testId(int id) throws InvalidIDValueException {
        if(id <= 0)
            throw new InvalidIDValueException("ID must be at least 1");
    }

    private void testDescription(String description) throws EmptyFieldException {
        if(description.length() < 1)
            throw new EmptyFieldException("Description can't be empty");
    }

    @Override
    public String toString() {
        return "Complain{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", complainStatus=" + complainStatus +
                ", req_id=" + req_id +
                '}';
    }
}