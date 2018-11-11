package iit.uni.miskolc.hu.softwaretesting;

import iit.uni.miskolc.hu.softwaretesting.exceptions.EmptyFieldException;
import iit.uni.miskolc.hu.softwaretesting.exceptions.InvalidEmailException;
import iit.uni.miskolc.hu.softwaretesting.exceptions.InvalidIDValueException;
import iit.uni.miskolc.hu.softwaretesting.exceptions.InvalidPasswordException;
import iit.uni.miskolc.hu.softwaretesting.model.User;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class UserTest {
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
    public void testGetName(){
        assertEquals(this.name, this.user.getName());
    }

    @Test
    public void testGetEmail(){
        assertEquals(this.email, this.user.getEmail());
    }

    @Test
    public void testGetUsername(){
        assertEquals(this.username, this.user.getUsername());
    }

    @Test
    public void testGetPassword(){
        assertEquals(this.password, this.user.getPassword());
    }
}
