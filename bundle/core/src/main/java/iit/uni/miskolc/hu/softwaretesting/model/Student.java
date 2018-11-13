package iit.uni.miskolc.hu.softwaretesting.model;

import iit.uni.miskolc.hu.softwaretesting.exceptions.*;

import java.util.Collection;

public class Student extends User {


    //students can be active or passive
    public enum Status {
        ACTIVE, PASSIVE
    }

    private Status status;

    public Student(int id, String name, String email, String username, String password, Status status) throws EmptyFieldException, InvalidIDValueException, InvalidPasswordException, InvalidEmailException {
        super(id, name, email, username, password);
        this.status = status;
    }

    public Status getStatus() {
        return status;
    }
}
