package iit.uni.miskolc.hu.softwaretesting.model;

import iit.uni.miskolc.hu.softwaretesting.exceptions.EmptyFieldException;
import iit.uni.miskolc.hu.softwaretesting.exceptions.InvalidIDValueException;
import iit.uni.miskolc.hu.softwaretesting.exceptions.InvalidPasswordLengthException;

public class Teacher extends User {
    private String department; //Institute
    public Teacher(int id, String name, String email, String username, String password, String department) throws EmptyFieldException, InvalidIDValueException, InvalidPasswordLengthException {
        super(id, name, email, username, password);
        this.department = department;
    }
}
