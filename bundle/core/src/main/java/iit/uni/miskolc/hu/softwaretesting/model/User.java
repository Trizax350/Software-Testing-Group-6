package iit.uni.miskolc.hu.softwaretesting.model;

import iit.uni.miskolc.hu.softwaretesting.exceptions.InvalidEmailException;
import iit.uni.miskolc.hu.softwaretesting.exceptions.InvalidIDValueException;
import iit.uni.miskolc.hu.softwaretesting.exceptions.InvalidPasswordException;
import iit.uni.miskolc.hu.softwaretesting.exceptions.EmptyFieldException;

public class User {
    private int id;
    private String name;
    private String email;
    private String username;
    private String password;

    public User(int id, String name, String email, String username, String password) throws InvalidIDValueException, EmptyFieldException, InvalidPasswordException, InvalidEmailException {
        testUserID(id);
        testName(name);
        testEmail(email);
        testUsername(username);
        testPasswordLength(password);

        this.id = id;
        this.name = name;
        this.email = email;
        this.username = username;
        this.password = password;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    /**
     * The id cant be lower than 1
     */
    private void testUserID(int id) throws InvalidIDValueException {
        if(id < 1)
            throw new InvalidIDValueException("The id can't be lower than 1!");
    }

    /**
     * The name cant be empty
     */
    private void testName(String name) throws EmptyFieldException {
        if(name.length() < 1)
            throw new EmptyFieldException("The name can't be empty!");
    }

    /**
     * The email cant be empty
     */
    private void testEmail(String email) throws InvalidEmailException {
        if(email.length() < 1)
            throw new InvalidEmailException("The email can't be empty!");
        if(!email.contains("@")) {
            throw new InvalidEmailException("Invalid email address");
        }
        String[] parts = email.split("@");
        if(parts.length < 2 || parts[0].length() < 1) {
            throw new InvalidEmailException("Invalid email address");
        }
    }

    /**
     * The username cant be empty
     */
    private void testUsername(String username) throws EmptyFieldException {
        if(username.length() < 1)
            throw new EmptyFieldException("The username can't be empty!");
    }

    /**
     * The password length must be between 5 and 20
     */
    private void testPasswordLength(String password) throws InvalidPasswordException {
        if(password.length() < 5 || password.length() > 20)
            throw new InvalidPasswordException("The password length must be between 5 and 20!");
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}