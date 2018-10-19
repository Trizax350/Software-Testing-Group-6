//exception when a users tries to complain more than once
//it'll be used in the User class
package iit.uni.miskolc.hu.softwaretesting.service;

public class ComplainAlreadyExist extends Exception {
    public ComplainAlreadyExist (String errorMessage) {
        super(errorMessage);
    }

}
