package iit.uni.miskolc.hu.softwaretesting.service;

import iit.uni.miskolc.hu.softwaretesting.model.Request;

import java.util.Collection;

public interface ManageRequestsInterface {

    Collection<Request> getAllRequest();
    void sendRequest (Request request);


}
