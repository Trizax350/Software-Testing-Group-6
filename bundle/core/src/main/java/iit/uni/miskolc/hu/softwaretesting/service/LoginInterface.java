package iit.uni.miskolc.hu.softwaretesting.service;

public interface LoginInterface {

    public boolean successfulLogin(User user);
    public String lostPassword(User user);
    public boolean goodPassword(User user);
    public boolean authenticate(User user);
    public boolean changePassword(User user);
}
