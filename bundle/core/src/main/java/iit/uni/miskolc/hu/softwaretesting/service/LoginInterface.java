package bundle.core.src.main.java.iit.uni.miskolc.hu.softwaretesting.service;

import bundle.core.src.main.java.iit.uni.miskolc.hu.softwaretesting.model.User;

public interface LoginInterface {

    boolean successfulLogin(User user);
    String lostPassword(User user);
    boolean goodPassword(User user);
    boolean authenticate(User user);
    boolean changePassword(User user);
}
