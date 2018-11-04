package iit.uni.miskolc.hu.softwaretesting.model;

import iit.uni.miskolc.hu.softwaretesting.service.exceptions.EmptyFieldException;
import iit.uni.miskolc.hu.softwaretesting.service.exceptions.InvalidIDValueException;
import iit.uni.miskolc.hu.softwaretesting.service.exceptions.InvalidPasswordLengthException;

public class Administrator extends User {
    public Administrator(int id, String name, String email, String username, String password) throws EmptyFieldException, InvalidIDValueException, InvalidPasswordLengthException {
        super(id, name, email, username, password);
    }
}
