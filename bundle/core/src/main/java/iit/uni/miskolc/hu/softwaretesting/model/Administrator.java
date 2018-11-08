package iit.uni.miskolc.hu.softwaretesting.model;

import iit.uni.miskolc.hu.softwaretesting.exceptions.EmptyFieldException;
import iit.uni.miskolc.hu.softwaretesting.exceptions.InvalidEmailException;
import iit.uni.miskolc.hu.softwaretesting.exceptions.InvalidIDValueException;
import iit.uni.miskolc.hu.softwaretesting.exceptions.InvalidPasswordException;

public class Administrator extends User {
    public Administrator(int id, String name, String email, String username, String password) throws EmptyFieldException, InvalidIDValueException, InvalidPasswordException, InvalidEmailException {
        super(id, name, email, username, password);
    }
}
