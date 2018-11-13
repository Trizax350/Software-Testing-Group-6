package iit.uni.miskolc.hu.softwaretesting.service;


public interface LoginInterface {

    boolean authenticate(String username, String password);
    boolean changePassword(String password);
}
