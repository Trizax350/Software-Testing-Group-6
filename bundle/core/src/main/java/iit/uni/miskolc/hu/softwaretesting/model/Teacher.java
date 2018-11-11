package bundle.core.src.main.java.iit.uni.miskolc.hu.softwaretesting.model;

import bundle.core.src.main.java.iit.uni.miskolc.hu.softwaretesting.exceptions.*;


public class Teacher extends User {
    private String department; //Institute
    public Teacher(int id, String name, String email, String username, String password, String department) throws EmptyFieldException, InvalidIDValueException, InvalidPasswordException, InvalidEmailException {
        super(id, name, email, username, password);
        this.department = department;
    }
}
