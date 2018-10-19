//handle what happens when a user tries to create a request that already exists
//it'll be thrown in the User class

package iit.uni.miskolc.hu.softwaretesting.service;

public class RequestAlreadyCreated extends Exception {

    public RequestAlreadyCreated(String errorMessage) {
        super(errorMessage);
    }


}
