package iit.uni.miskolc.hu.softwaretesting.service;

import iit.uni.miskolc.hu.softwaretesting.model.Request;

import java.util.Collection;

public interface ManageRequestsInterface {

    void sendRequest(Request request);
    void updateRequest(Request request);
    void deleteRequest(Request request);
    Collection<Request> getAllRequest();
    Collection<Request> getAllRequestByType(String type);
    Collection<Request> getAllRequestByStatus(String status);   //return open or closed requests
    Collection<Request> getAllRequestWithComplain();
    Collection<Request> getAllRequestByCourse(String reference_to_the_Course);
    Collection<Request> getAllRequestByUser(int referenceToUser);
    Collection<Request> findRequestById(int id);

}
