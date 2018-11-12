package bundle.core.src.test.java.iit.uni.miskolc.hu.softwaretesting;

import bundle.core.src.main.java.iit.uni.miskolc.hu.softwaretesting.exceptions.*;
import bundle.core.src.main.java.iit.uni.miskolc.hu.softwaretesting.model.User;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class UserTestMethods {
    private User user;
    private int id = 888;
    private String name = "Hajnal Róbert";
    private String email = "probaemail@proba.hu";
    private String username = "Nincsfantáziám";
    private String password = "Valami";

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Before
    public void RegUser() throws InvalidIDValueException, InvalidEmailException, EmptyFieldException, InvalidPasswordException {
        this.user = new User(this.id, this.name, this.email, this.username, this.password);
    }

    @Test
    public void testGetID(){
        assertEquals(this.id, this.user.getId());
    }

    @Test
    public void testSetID() throws InvalidIDValueException{
        int id = 2;
        this.user.setId(id);
        assertEquals(id, this.user.getId());
    }

    @Test
    public void testGetName(){
        assertEquals(this.name, this.user.getName());
    }

    @Test
    public void testSetName() throws EmptyFieldException{
        String name = "Béla";
        this.user.setName(name);
        assertEquals(name, this.user.getName());
    }

    @Test
    public void testGetEmail(){
        assertEquals(this.email, this.user.getEmail());
    }

    @Test
    public void testSetEmail() throws InvalidEmailException{
        String email = "e@e";
        this.user.setEmail(email);
        assertEquals(email, this.user.getEmail());
    }

    @Test
    public void testGetUsername(){
        assertEquals(this.username, this.user.getUsername());
    }

    @Test
    public void testSetUsername() throws EmptyFieldException{
        String username = "Nekemse";
        this.user.setUsername(username);
        assertEquals(username, this.user.getUsername());
    }

    @Test
    public void testGetPassword(){
        assertEquals(this.password, this.user.getPassword());
    }

    @Test
    public void testSetPassword() throws InvalidPasswordException{
        String password = "asdf123";
        this.user.setPassword(password);
        assertEquals(password, this.user.getPassword());
    }

}
