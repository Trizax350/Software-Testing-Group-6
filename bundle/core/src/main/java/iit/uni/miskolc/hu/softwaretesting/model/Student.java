package iit.uni.miskolc.hu.softwaretesting.model;

import iit.uni.miskolc.hu.softwaretesting.exceptions.*;

import java.util.Collection;

public class Student extends User {


    //students can be active or passive
    private enum Status {
        ACTIVE, PASSIVE
    }

    private Collection<Status> status;

    public Student(int id, String name, String email, String username, String password, Collection<Status> status) throws EmptyFieldException, InvalidIDValueException, InvalidPasswordException, InvalidEmailException {
        super(id, name, email, username, password);
        this.status = status;
    }

    public Collection<Status> getStatus() {
        return status;
    }
}
