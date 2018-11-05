package iit.uni.miskolc.hu.softwaretesting.model;
import iit.uni.miskolc.hu.softwaretesting.exceptions.EmptyFieldException;
import iit.uni.miskolc.hu.softwaretesting.exceptions.InvalidIDValueException;
import iit.uni.miskolc.hu.softwaretesting.exceptions.InvalidPasswordLengthException;

import java.util.Collection;

public class Student extends User {


    //students can be active or passive
    private enum Status {
        ACTIVE, PASSIVE
    }

    private Collection<Status> status;

    public Student(int id, String name, String email, String username, String password, Collection<Status> status) throws EmptyFieldException, InvalidIDValueException, InvalidPasswordLengthException {
        super(id, name, email, username, password);
        this.status = status;
    }

    public Collection<Status> getStatus() {
        return status;
    }
}
