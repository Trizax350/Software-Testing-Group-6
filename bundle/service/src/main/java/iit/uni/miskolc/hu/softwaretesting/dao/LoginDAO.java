package iit.uni.miskolc.hu.softwaretesting.dao;

public interface LoginDAO {

    boolean checkCredentials(String username, String password);

}
