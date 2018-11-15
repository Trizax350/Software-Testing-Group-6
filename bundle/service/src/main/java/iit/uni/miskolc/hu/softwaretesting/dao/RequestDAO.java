package iit.uni.miskolc.hu.softwaretesting.dao;

import iit.uni.miskolc.hu.softwaretesting.exceptions.*;
import iit.uni.miskolc.hu.softwaretesting.model.Request;

import java.util.Collection;

public interface RequestDAO {

    void makeRequest(Request request) throws RequestAlreadyExistsException;
    void modifyRequest(Request request) throws NotFoundException;
    void removeRequest(Request request) throws NotFoundException;
    Collection<Request> searchAllRequest();
    Collection<Request> searchAllRequestByType(String type);
    Collection<Request> searchAllRequestByStatus(String status);
    Collection<Request> searchAllRequestWithComplain();
    Collection<Request> searchAllRequestByCourse(String reference_to_the_Course) throws CourseNotFoundException;
    Collection<Request> searchAllRequestByUser(int referenceToUser) throws UserNotFoundException;
    Collection<Request> searchRequestById(int id) throws InvalidIDValueException;

}
