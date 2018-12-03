package iit.uni.miskolc.hu.softwaretesting.service;


import iit.uni.miskolc.hu.softwaretesting.exceptions.LoginFailed;

public interface LoginInterface {

    boolean authenticate(String username, String password) throws LoginFailed;

}
