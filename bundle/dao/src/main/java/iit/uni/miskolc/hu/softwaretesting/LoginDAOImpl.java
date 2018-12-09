package iit.uni.miskolc.hu.softwaretesting;

import iit.uni.miskolc.hu.softwaretesting.dao.LoginDAO;
import iit.uni.miskolc.hu.softwaretesting.exceptions.LoginFailed;
import iit.uni.miskolc.hu.softwaretesting.model.User;

import java.util.ArrayList;

public class LoginDAOImpl implements LoginDAO {

    private UserDAOImpl userDAOImpl;

    @Override
    public boolean checkCredentials(String username, String password) throws LoginFailed {

        boolean login = false;
        try {
            userDAOImpl = new UserDAOImpl();
        } catch (Exception e) {
            e.getMessage();
        }

        ArrayList<User> users = userDAOImpl.getUsers();
        for(int i = 0; i < users.size(); i++) {
            if(username.equals(users.get(i).getUsername()) && password.equals(users.get(i).getPassword())){
                login = true;

            }
        }

        if(!login) throw new LoginFailed("Érvénytelen felhsználónév vagy jelszó");
        return login;
    }

}
