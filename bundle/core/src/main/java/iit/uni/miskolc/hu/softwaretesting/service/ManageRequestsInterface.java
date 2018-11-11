package bundle.core.src.main.java.iit.uni.miskolc.hu.softwaretesting.service;

import bundle.core.src.main.java.iit.uni.miskolc.hu.softwaretesting.exceptions.*;
import bundle.core.src.main.java.iit.uni.miskolc.hu.softwaretesting.model.Request;

import java.util.Collection;


public interface ManageRequestsInterface {

    void sendRequest(Request request) throws ComplainAlreadyOpenException;
    void updateRequest(Request request) throws RequestAlreadyClosedException;
    void deleteRequest(Request request) throws NotFoundException;
    Collection<Request> getAllRequest();
    Collection<Request> getAllRequestByType(String type);
    Collection<Request> getAllRequestByStatus(String status);   //return open or closed requests
    Collection<Request> getAllRequestWithComplain();
    Collection<Request> getAllRequestByCourse(String reference_to_the_Course) throws CourseNotFoundException;
    Collection<Request> getAllRequestByUser(int referenceToUser) throws UserNotFoundException;
    Collection<Request> findRequestById(int id) throws InvalidIDValueException;

}
