package iit.uni.miskolc.hu.softwaretesting.service;

public interface LoginInterface {

    public boolean successfulLogin();
    public String lostPassword();
    public boolean goodPassword();
    public boolean authenticate(String username, String password);

}
