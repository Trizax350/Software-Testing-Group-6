package iit.uni.miskolc.hu.softwaretesting.model;

import iit.uni.miskolc.hu.softwaretesting.exceptions.EmptyFieldException;
import iit.uni.miskolc.hu.softwaretesting.exceptions.InvalidIDValueException;
import iit.uni.miskolc.hu.softwaretesting.exceptions.InvalidPasswordLengthException;

public class Administrator extends User {
    public Administrator(int id, String name, String email, String username, String password) throws EmptyFieldException, InvalidIDValueException, InvalidPasswordLengthException {
        super(id, name, email, username, password);
    }
}
